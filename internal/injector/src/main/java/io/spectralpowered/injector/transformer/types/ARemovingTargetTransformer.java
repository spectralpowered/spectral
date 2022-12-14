package io.spectralpowered.injector.transformer.types;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.exceptions.MethodNotFoundException;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public abstract class ARemovingTargetTransformer<T extends Annotation> extends ARemovingTransformer<T> {

    private final Function<T, String[]> targetCombis;

    public ARemovingTargetTransformer(Class<T> annotationClass, Function<T, String[]> targetCombis) {
        super(annotationClass);
        this.targetCombis = targetCombis;
    }

    @Override
    public final void transform(T annotation, InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer, MethodNode transformerMethod) {
        for (String targetCombi : targetCombis.apply(annotation)) {
            List<MethodNode> targets = ASMUtils.getMethodsFromCombi(transformedClass, targetCombi);
            if (targets.isEmpty()) throw new MethodNotFoundException(transformedClass, transformer, targetCombi);
            for (MethodNode target : targets) {
                transform(annotation, injectionManager, classProvider, injectionTargets, transformedClass, transformer, ASMUtils.cloneMethod(transformerMethod), target);
            }
        }
    }

    /**
     * Transform the target class using the given transformer class
     *
     * @param annotation         The annotation of the transformer
     * @param injectionManager The transformer manager
     * @param classProvider      The class provider
     * @param injectionTargets   The available injection targets
     * @param transformedClass   The target {@link ClassNode}
     * @param transformer        The transformer {@link ClassNode}
     * @param transformerMethod  The current {@link MethodNode} of the transformer
     * @param target             The currently transformed target {@link MethodNode}
     */
    public abstract void transform(T annotation, InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer, MethodNode transformerMethod, MethodNode target);

}
