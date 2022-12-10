package kyle.transformer.impl;

import kyle.TransformerManager;
import kyle.annotations.CUpgrade;
import kyle.targets.IInjectionTarget;
import kyle.transformer.ATransformer;
import kyle.utils.annotations.IParsedAnnotation;
import kyle.utils.tree.IClassProvider;
import org.objectweb.asm.tree.ClassNode;

import java.util.Map;

public class CUpgradeTransformer extends ATransformer {

    @Override
    public void transform(TransformerManager transformerManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer) {
        CUpgrade annotation = this.getAnnotation(CUpgrade.class, transformer, classProvider);
        if (annotation == null) return;

        int version;
        if (((IParsedAnnotation) annotation).wasSet("value")) version = annotation.value();
        else version = transformer.version;
        transformedClass.version = Math.max(transformedClass.version, version);
    }

}
