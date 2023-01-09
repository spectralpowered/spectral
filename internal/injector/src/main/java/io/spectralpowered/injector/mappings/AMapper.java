package io.spectralpowered.injector.mappings;

import io.spectralpowered.injector.annotations.CTransformer;
import io.spectralpowered.injector.mappings.annotation.AnnotationRemap;
import io.spectralpowered.injector.mappings.annotation.RemapType;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.MemberDeclaration;
import io.spectralpowered.injector.utils.annotations.AnnotationParser;
import io.spectralpowered.injector.utils.log.ILogger;
import io.spectralpowered.injector.utils.mappings.MapRemapper;
import io.spectralpowered.injector.utils.mappings.Remapper;
import io.spectralpowered.injector.utils.mappings.SuperMappingFiller;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static io.spectralpowered.injector.utils.ASMUtils.dot;
import static io.spectralpowered.injector.utils.ASMUtils.slash;

public abstract class AMapper {

    private static final String ANNOTATION_PACKAGE = slash(CTransformer.class.getPackage().getName());

    private final MapperConfig config;
    protected final MapRemapper remapper;

    public AMapper(MapperConfig config) {
        this.config = config;
        remapper = new MapRemapper();
    }

    public final void load() {
        try {
            init();
        } catch (Throwable t) {
            throw new RuntimeException("Unable to initialize mappings", t);
        }
    }

    public final String mapClassName(String className) {
        return dot(remapper.mapType(slash(className)));
    }

    public final ClassNode mapClass(IClassProvider classProvider, ILogger logger, ClassNode target, ClassNode transformer) {
        if (config.fillSuperMappings) {
            try {
                SuperMappingFiller.fillTransformerSuperMembers(transformer, remapper, classProvider);
            } catch (Throwable t) {
                logger.warn("Unable to fill super mappings for class '%s'. Trying without", transformer.name, t);
            }
        }
        List<AnnotationHolder> annotationsToRemap = new ArrayList<>();
        checkAnnotations(transformer, transformer.visibleAnnotations, annotationsToRemap);
        checkAnnotations(transformer, transformer.invisibleAnnotations, annotationsToRemap);
        for (FieldNode field : transformer.fields) {
            checkAnnotations(field, field.visibleAnnotations, annotationsToRemap);
            checkAnnotations(field, field.invisibleAnnotations, annotationsToRemap);
        }
        for (MethodNode method : transformer.methods) {
            checkAnnotations(method, method.visibleAnnotations, annotationsToRemap);
            checkAnnotations(method, method.invisibleAnnotations, annotationsToRemap);
        }
        for (AnnotationHolder annotation : annotationsToRemap) {
            try {
                Class<?> annotationClass = Class.forName(Type.getType(annotation.annotation.desc).getClassName());
                Map<String, Object> annotationMap = AnnotationParser.listToMap(annotation.annotation.values);
                mapAnnotation(annotation.holder, annotationClass, annotationMap, target, transformer);
                annotation.annotation.values = AnnotationParser.mapToList(annotationMap);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Unable to remap annotation '" + annotation.annotation.desc + "' from transformer '" + transformer.name + "'", e);
            }
        }
        if (config.remapTransformer) return Remapper.remap(transformer, remapper);
        else return transformer;
    }

    public MapRemapper getRemapper() {
        return remapper;
    }


    protected abstract void init() throws Throwable;


    protected List<String> readLines(File f) throws FileNotFoundException {
        List<String> out = new ArrayList<>();
        try (Scanner s = new Scanner(f)) {
            while (s.hasNextLine()) out.add(s.nextLine());
        }
        return out;
    }


    private void mapAnnotation(Object holder, Class<?> annotation, Map<String, Object> values, ClassNode target, ClassNode transformer) throws ClassNotFoundException {
        for (Method method : annotation.getDeclaredMethods()) {
            AnnotationRemap remap = method.getDeclaredAnnotation(AnnotationRemap.class);
            if (remap == null) continue;
            InfoFiller.fillInfo(remapper, holder, remap, method, values, target, transformer);
            if (remapper.isEmpty()) continue;

            Object value = values.get(method.getName());

            if (remap.value().equals(RemapType.ANNOTATION)) {
                if (value instanceof AnnotationNode) {
                    AnnotationNode node = (AnnotationNode) value;
                    Type type = Type.getType(node.desc);
                    Map<String, Object> nodeMap = AnnotationParser.listToMap(node.values);
                    mapAnnotation(holder, Class.forName(type.getClassName()), nodeMap, target, transformer);
                    node.values = AnnotationParser.mapToList(nodeMap);
                } else if (value instanceof AnnotationNode[]) {
                    AnnotationNode[] nodes = (AnnotationNode[]) value;
                    for (AnnotationNode node : nodes) {
                        Type type = Type.getType(node.desc);
                        Map<String, Object> nodeMap = AnnotationParser.listToMap(node.values);
                        mapAnnotation(holder, Class.forName(type.getClassName()), nodeMap, target, transformer);
                        node.values = AnnotationParser.mapToList(nodeMap);
                    }
                } else if (value instanceof List) {
                    List<AnnotationNode> nodes = (List<AnnotationNode>) value;
                    for (AnnotationNode node : nodes) {
                        Type type = Type.getType(node.desc);
                        Map<String, Object> nodeMap = AnnotationParser.listToMap(node.values);
                        mapAnnotation(holder, Class.forName(type.getClassName()), nodeMap, target, transformer);
                        node.values = AnnotationParser.mapToList(nodeMap);
                    }
                }
            } else {
                if (value instanceof String) {
                    String s = (String) value;
                    values.put(method.getName(), remap(remap.value(), s));
                } else if (value instanceof String[]) {
                    String[] strings = (String[]) value;
                    for (int i = 0; i < strings.length; i++) strings[i] = remap(remap.value(), strings[i]);
                } else if (value instanceof List) {
                    List<String> list = (List<String>) value;
                    list.replaceAll(s -> remap(remap.value(), s));
                }
            }
        }
    }

    private String remap(RemapType type, String s) {
        switch (type) {
            case SHORT_MEMBER:
                //See InfoFiller for remapping of short members
                return s;

            case MEMBER:
                MemberDeclaration member = ASMUtils.splitMemberDeclaration(s);
                String owner = remapper.mapType(member.getOwner());
                String name;
                String desc;
                if (member.isFieldMapping()) {
                    name = remapper.mapFieldName(member.getOwner(), member.getName(), member.getDesc());
                    desc = remapper.mapDesc(member.getDesc());
                } else {
                    name = remapper.mapMethodName(member.getOwner(), member.getName(), member.getDesc());
                    desc = remapper.mapMethodDesc(member.getDesc());
                }
                return Type.getObjectType(owner).getDescriptor() + name + (member.isFieldMapping() ? ":" : "") + desc;

            case CLASS:
                return dot(remapper.mapType(slash(s)));

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    private void checkAnnotations(Object holder, List<AnnotationNode> annotations, List<AnnotationHolder> out) {
        if (annotations == null) return;
        for (AnnotationNode annotation : annotations) {
            if (annotation.desc.startsWith("L" + AMapper.ANNOTATION_PACKAGE)) out.add(new AnnotationHolder(holder, annotation));
        }
    }


    private static class AnnotationHolder {
        private final Object holder;
        private final AnnotationNode annotation;

        private AnnotationHolder(Object holder, AnnotationNode annotation) {
            this.holder = holder;
            this.annotation = annotation;
        }
    }

}
