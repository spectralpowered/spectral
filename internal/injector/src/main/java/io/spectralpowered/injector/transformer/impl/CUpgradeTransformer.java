package io.spectralpowered.injector.transformer.impl;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.annotations.CUpgrade;
import io.spectralpowered.injector.transformer.ATransformer;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.utils.annotations.IParsedAnnotation;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.tree.ClassNode;

import java.util.Map;

public class CUpgradeTransformer extends ATransformer {

    @Override
    public void transform(InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer) {
        CUpgrade annotation = getAnnotation(CUpgrade.class, transformer, classProvider);
        if (annotation == null) return;

        int version;
        if (((IParsedAnnotation) annotation).wasSet("value")) version = annotation.value();
        else version = transformer.version;
        transformedClass.version = Math.max(transformedClass.version, version);
    }

}
