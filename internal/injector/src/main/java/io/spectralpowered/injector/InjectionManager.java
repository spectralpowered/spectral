package io.spectralpowered.injector;

import io.spectralpowered.injector.annotations.CTarget;
import io.spectralpowered.injector.targets.impl.*;
import io.spectralpowered.injector.transformer.*;
import io.spectralpowered.injector.transformer.impl.*;
import io.spectralpowered.injector.annotations.CTransformer;
import io.spectralpowered.injector.mappings.AMapper;
import io.spectralpowered.injector.mappings.impl.VoidMapper;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.HotswapClassLoader;
import io.spectralpowered.injector.utils.log.DefaultLogger;
import io.spectralpowered.injector.utils.log.ILogger;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;

import java.lang.instrument.*;
import java.security.ProtectionDomain;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import static io.spectralpowered.injector.utils.ASMUtils.dot;

public class InjectionManager implements ClassFileTransformer {

    private final IClassProvider classProvider;
    private final AMapper mapper;
    private final List<ATransformer> internalTransformer = new ArrayList<>();
    private final Map<String, IInjectionTarget> injectionTargets = new HashMap<>();
    private ILogger logger = new DefaultLogger();
    private Instrumentation instrumentation;
    private HotswapClassLoader hotswapClassLoader;

    private final List<ITransformerPreprocessor> transformerPreprocessor = new ArrayList<>();
    private final List<IBytecodeTransformer> bytecodeTransformer = new ArrayList<>();
    private final Map<String, List<IRawTransformer>> rawTransformer = new HashMap<>();
    private final Map<String, List<ClassNode>> transformer = new HashMap<>();
    private final List<IPostTransformer> postTransformer = new ArrayList<>();

    private final Set<String> registeredTransformer = new HashSet<>();
    private final Set<String> transformedClasses = new HashSet<>();

    /**
     * @param classProvider The {@link ClassLoader} to use for transformer loading
     */
    public InjectionManager(IClassProvider classProvider) {
        this(classProvider, new VoidMapper());
    }

    /**
     * @param classProvider The {@link ClassLoader} to use for transformer loading
     * @param mapper        The {@link AMapper} instance
     */
    public InjectionManager(IClassProvider classProvider, AMapper mapper) {
        this.classProvider = classProvider;
        this.mapper = mapper;
        this.mapper.load();

        //Annotation transformer
        internalTransformer.add(new CUpgradeTransformer());
        internalTransformer.add(new CASMTransformer());
        internalTransformer.add(new CShadowTransformer());
        internalTransformer.add(new COverrideTransformer());
        internalTransformer.add(new CWrapCatchTransformer());
        internalTransformer.add(new CInjectTransformer());
        internalTransformer.add(new CRedirectTransformer());
        internalTransformer.add(new CModifyConstantTransformer());
        //General transformer
        internalTransformer.add(new InnerClassTransformer());
        internalTransformer.add(new MemberCopyTransformer());

        //Injection targets
        injectionTargets.put("HEAD", new HeadTarget());
        injectionTargets.put("RETURN", new ReturnTarget());
        injectionTargets.put("THROW", new ThrowTarget());
        injectionTargets.put("TAIL", new TailTarget());
        injectionTargets.put("INVOKE", new InvokeTarget());
        injectionTargets.put("FIELD", new FieldTarget());
        injectionTargets.put("GETFIELD", new FieldTarget(Opcodes.GETFIELD, Opcodes.GETSTATIC));
        injectionTargets.put("PUTFIELD", new FieldTarget(Opcodes.PUTFIELD, Opcodes.PUTSTATIC));
        injectionTargets.put("NEW", new NewTarget());
        injectionTargets.put("OPCODE", new OpcodeTarget());
        injectionTargets.put("CONSTANT", new ConstantTarget());
    }

    /**
     * Set the logger used by ClassTransform for errors and warnings
     *
     * @param logger The logger to use
     */
    public void setLogger(ILogger logger) {
        this.logger = logger;
    }

    /**
     * Add a transformer preprocessor to the transformer list<br>
     * You can modify class transform annotations before they get parsed
     *
     * @param transformerPreprocessor The {@link ITransformerPreprocessor} instance
     */
    public void addTransformerPreprocessor(ITransformerPreprocessor transformerPreprocessor) {
        this.transformerPreprocessor.add(transformerPreprocessor);
    }

    /**
     * Add a bytecode transformer to the transformer list<br>
     * Useful when needing to modify bytecode directly without ASM parsing or all {@link Class}es at once
     *
     * @param bytecodeTransformer The {@link IBytecodeTransformer} instance
     */
    public void addBytecodeTransformer(IBytecodeTransformer bytecodeTransformer) {
        this.bytecodeTransformer.add(bytecodeTransformer);
    }

    /**
     * Add a raw class transformer to the transformer list<br>
     * Useful when needing direct access to a {@link ClassNode}
     *
     * @param className      The name of the transformer target
     * @param rawTransformer The {@link IRawTransformer} instance
     */
    public void addRawTransformer(String className, IRawTransformer rawTransformer) {
        this.rawTransformer.computeIfAbsent(className, n -> new ArrayList<>()).add(rawTransformer);
        transformedClasses.add(className);
        retransformClasses(Collections.singleton(className));
    }

    /**
     * Add a transformer class to the transformer list<br>
     * Use the direct class name for a single transformer <i>(e.g. <b>package.Transformer</b>)</i><br>
     * Use the package ending with '*' for all transformer in the packet (not sub packages) <i>(e.g. <b>package.*</b>)</i><br>
     * Use the package ending with '**' for all transformer in the package and sub packages <i>(e.g. <b>package.**</b>)</i><br>
     *
     * @param transformer The name of transformer class to add
     */
    public void addTransformer(String transformer) {
        List<byte[]> classes = new ArrayList<>();
        boolean wildcard = false;
        if (transformer.endsWith(".**")) {
            wildcard = true;
            String packageName = transformer.substring(0, transformer.length() - 2);
            for (Map.Entry<String, Supplier<byte[]>> entry : classProvider.getAllClasses().entrySet()) {
                if (entry.getKey().startsWith(packageName)) classes.add(entry.getValue().get());
            }
        } else if (transformer.endsWith(".*")) {
            wildcard = true;
            String packageName = transformer.substring(0, transformer.length() - 1);
            for (Map.Entry<String, Supplier<byte[]>> entry : classProvider.getAllClasses().entrySet()) {
                if (entry.getKey().startsWith(packageName)) {
                    String classPackage = entry.getKey().substring(0, entry.getKey().lastIndexOf('.') + 1);
                    if (classPackage.equals(packageName)) classes.add(entry.getValue().get());
                }
            }
        } else {
            classes.add(classProvider.getClass(transformer));
        }
        for (byte[] bytecode : classes) {
            String name = null;
            try {
                ClassNode classNode = ASMUtils.fromBytes(bytecode);
                name = classNode.name;
                Set<String> transformedClasses = addTransformer(classNode, !wildcard);
                if (!transformedClasses.isEmpty()) retransformClasses(transformedClasses);
                else if (!wildcard) logger.warn("Transformer '%s' does not transform any classes", name);
            } catch (Throwable e) {
                if (name == null) throw new RuntimeException("Unable to parse transformer bytecode", e);
                else throw new RuntimeException("Unable to load transformer '" + name + "'", e);
            }
        }
    }

    /**
     * Add a {@link ClassNode} directly to the transformer list<br>
     * The class must still be annotated with {@link CTransformer}
     *
     * @param classNode The {@link ClassNode} to add
     */
    public Set<String> addTransformer(ClassNode classNode) {
        return addTransformer(classNode, true);
    }

    /**
     * Add a {@link ClassNode} directly to the transformer list<br>
     * The class must still be annotated with {@link CTransformer}
     *
     * @param classNode The {@link ClassNode} to add
     */
    public Set<String> addTransformer(ClassNode classNode, boolean requireAnnotation) {
        for (ITransformerPreprocessor preprocessor : transformerPreprocessor) preprocessor.process(classNode);
        List<Object> annotation;
        if (classNode.invisibleAnnotations == null || (annotation = classNode.invisibleAnnotations.stream().filter(a -> a.desc.equals(Type.getDescriptor(CTransformer.class))).map(a -> a.values).findFirst().orElse(null)) == null) {
            if (requireAnnotation) throw new IllegalStateException("Transformer does not have CTransformer annotation");
            else return Collections.emptySet();
        }
        Set<String> transformedClasses = new HashSet<>();
        for (int i = 0; i < annotation.size(); i += 2) {
            String key = (String) annotation.get(i);
            Object value = annotation.get(i + 1);

            if (key.equals("value")) {
                List<Type> classesList = (List<Type>) value;
                for (Type type : classesList) addTransformer(transformedClasses, mapper.mapClassName(type.getClassName()), classNode);
            } else if (key.equals("name")) {
                List<String> classesList = (List<String>) value;
                for (String className : classesList) addTransformer(transformedClasses, mapper.mapClassName(className), classNode);
            }
        }
        this.transformedClasses.addAll(transformedClasses);

        String name = dot(classNode.name);
        registeredTransformer.add(name);
        if (hotswapClassLoader != null) hotswapClassLoader.defineHotswapClass(name);
        return transformedClasses;
    }

    private void addTransformer(Set<String> transformedClasses, String className, ClassNode transformer) {
        List<ClassNode> transformerList = this.transformer.computeIfAbsent(className, n -> new ArrayList<>());
        transformerList.removeIf(cn -> cn.name.equals(transformer.name));
        transformerList.add(transformer);

        transformedClasses.add(className);
    }

    /**
     * Add a post transformer to handle the raw byte array after all other transformer have been applied<br>
     * Useful for dumping transformed classes to disk
     *
     * @param postTransformer The {@link BiConsumer} instance
     */
    public void addPostTransformConsumer(IPostTransformer postTransformer) {
        this.postTransformer.add(postTransformer);
    }

    /**
     * Add a new injection target for use with the {@link CTarget} annotation
     *
     * @param name   The name of the injection target
     * @param target The injection target
     */
    public void addInjectionTarget(String name, IInjectionTarget target) {
        injectionTargets.put(name, target);
    }

    /**
     * Transform the bytecode of a given class
     *
     * @param name     The name of the class
     * @param bytecode The bytecode of the class
     * @return The modified bytecode of the class or null if not changed
     */
    public byte[] transform(String name, byte[] bytecode) {
        boolean transformed = false;
        ClassNode clazz = null;

        for (IBytecodeTransformer transformer : bytecodeTransformer) {
            byte[] transformedBytecode = transformer.transform(name, bytecode);
            if (transformedBytecode != null) {
                transformed = true;
                bytecode = transformedBytecode;
            }
        }

        List<IRawTransformer> rawTransformer = this.rawTransformer.get(name);
        if (rawTransformer != null) {
            clazz = ASMUtils.fromBytes(bytecode);
            for (IRawTransformer transformer : rawTransformer) clazz = transformer.transformer(this, clazz);
        }

        List<ClassNode> transformer = this.transformer.get(name);
        if (transformer != null) {
            if (clazz == null) clazz = ASMUtils.fromBytes(bytecode);
            for (ClassNode classNode : transformer) {
                try {
                    classNode = ASMUtils.cloneClass(classNode);
                    classNode = mapper.mapClass(classProvider, logger, clazz, classNode);
                } catch (Throwable t) {
                    logger.error("Failed to remap and fill annotation details of transformer '%s'", classNode.name, t);
                }

                for (ATransformer aTransformer : internalTransformer) {
                    try {
                        aTransformer.transform(this, classProvider, injectionTargets, clazz, classNode);
                    } catch (Throwable t) {
                        logger.error("Transformer '%s' failed to transform class '%s'", aTransformer.getClass().getSimpleName(), clazz.name, t);
                    }
                }
            }
        }

        if (clazz == null) {
            if (transformed) return bytecode;
            return null;
        }
        byte[] transformedBytecode = ASMUtils.toBytes(clazz, classProvider);
        for (IPostTransformer postTransformer : postTransformer) postTransformer.transform(name, transformedBytecode);
        return transformedBytecode;
    }

    /**
     * Hook an {@link Instrumentation} instance to allow for transformation using it<br>
     * This can be used to transform classes already loaded by the JVM<br>
     * You have to be careful with re-transforming classes since you can't modify the structure (e.g. adding a new method or modifying the signature of an existing one)<br>
     * Hotswapping transformer is disabled by default as it causes a bit more overhead and memory usage
     *
     * @param instrumentation The instance of the {@link Instrumentation}
     */
    public void hookInstrumentation(Instrumentation instrumentation) {
        hookInstrumentation(instrumentation, false);
    }

    /**
     * Hook an {@link Instrumentation} instance to allow for transformation using it<br>
     * This can be used to transform classes already loaded by the JVM<br>
     * You have to be careful with re-transforming classes since you can't modify the structure (e.g. adding a new method or modifying the signature of an existing one)
     *
     * @param instrumentation The instance of the {@link Instrumentation}
     * @param hotswappable    Allow transformer to be hotswapped
     */
    public void hookInstrumentation(Instrumentation instrumentation, boolean hotswappable) {
        this.instrumentation = instrumentation;
        if (hotswappable) {
            hotswapClassLoader = new HotswapClassLoader(classProvider, logger);
            for (String transformerClass : registeredTransformer) hotswapClassLoader.defineHotswapClass(transformerClass);
        }
        instrumentation.addTransformer(this, instrumentation.isRetransformClassesSupported());

        retransformClasses(null);
    }

    private void retransformClasses(Set<String> classesToRetransform) {
        if (instrumentation != null && instrumentation.isRetransformClassesSupported()) {
            List<Class<?>> classes = new ArrayList<>();
            Set<String> classSet;
            if (classesToRetransform != null) classSet = classesToRetransform;
            else classSet = transformedClasses;
            for (Class<?> loadedClass : instrumentation.getAllLoadedClasses()) {
                if (loadedClass != null && classSet.contains(loadedClass.getName())) classes.add(loadedClass);
            }
            if (!classes.isEmpty()) {
                try {
                    instrumentation.retransformClasses(classes.toArray(new Class[0]));
                } catch (Throwable t) {
                    logger.error("Failed to retransform classes '%s'", classes.stream().map(Class::getName).collect(Collectors.joining(", ")), t);
                }
            }
        }
    }

    private void redefineClasses(Set<String> classesToRedefine) throws UnmodifiableClassException, ClassNotFoundException {
        List<ClassDefinition> classDefinitions = new ArrayList<>();
        for (Class<?> loadedClass : instrumentation.getAllLoadedClasses()) {
            if (loadedClass != null && classesToRedefine.contains(loadedClass.getName())) {
                byte[] transformedBytecode = transform(loadedClass.getName(), classProvider.getClass(loadedClass.getName()));
                if (transformedBytecode != null) classDefinitions.add(new ClassDefinition(loadedClass, transformedBytecode));
            }
        }
        if (!classDefinitions.isEmpty()) instrumentation.redefineClasses(classDefinitions.toArray(new ClassDefinition[0]));
    }

    /**
     * Support method for {@link java.lang.instrument.Instrumentation}<br>
     * You can simply add the {@link InjectionManager} as a {@link ClassFileTransformer} using {@link java.lang.instrument.Instrumentation#addTransformer(ClassFileTransformer)} or call {@link InjectionManager#hookInstrumentation(Instrumentation)}
     */
    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        if (className == null) return null;
        try {
            className = dot(className);
            if (hotswapClassLoader != null && registeredTransformer.contains(className)) {
                try {
                    ClassNode transformer = ASMUtils.fromBytes(classfileBuffer);
                    Set<String> transformedClasses = addTransformer(transformer);
                    redefineClasses(transformedClasses);

                    return hotswapClassLoader.getHotswapClass(transformer.name);
                } catch (Throwable t) {
                    logger.error("Failed to hotswap transformer '%s'", className, t);
                    return new byte[]{1}; //Tells the IDE something went wrong
                }
            }

            byte[] newBytes = transform(className, classfileBuffer);
            if (newBytes != null) return newBytes;
        } catch (Throwable t) {
            logger.error("Failed to transform class '%s'", className, t);
        }
        return null;
    }

}
