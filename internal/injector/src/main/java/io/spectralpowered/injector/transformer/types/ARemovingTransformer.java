package io.spectralpowered.injector.transformer.types;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.transformer.ATransformer;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.Map;

public abstract class ARemovingTransformer<T extends Annotation> extends ATransformer {

    private final Class<? extends Annotation> annotationClass;

    public ARemovingTransformer(final Class<T> annotationClass) {
        this.annotationClass = annotationClass;
    }

    @Override
    public final void transform(InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer) {
        Iterator<MethodNode> it = transformer.methods.iterator();
        while (it.hasNext()) {
            MethodNode transformerMethod = it.next();
            T annotation = (T) this.getAnnotation(this.annotationClass, transformerMethod, classProvider);
            if (annotation == null) continue;
            it.remove();

            this.transform(annotation, injectionManager, classProvider, injectionTargets, transformedClass, transformer, ASMUtils.cloneMethod(transformerMethod));
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
     */
    public abstract void transform(final T annotation, final InjectionManager injectionManager, final IClassProvider classProvider, final Map<String, IInjectionTarget> injectionTargets, final ClassNode transformedClass, final ClassNode transformer, final MethodNode transformerMethod);

}
