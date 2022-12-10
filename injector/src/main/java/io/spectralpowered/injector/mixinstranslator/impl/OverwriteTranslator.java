package io.spectralpowered.injector.mixinstranslator.impl;

import io.spectralpowered.injector.annotations.injection.COverride;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

class OverwriteTranslator implements IAnnotationTranslator {

    @Override
    public void translate(AnnotationNode annotation) {
        annotation.desc = Type.getDescriptor(COverride.class);
    }

}
