package io.spectralpowered.injector.mixinstranslator.impl;

import io.spectralpowered.injector.annotations.CShadow;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

class ShadowTranslator implements IAnnotationTranslator {

    @Override
    public void translate(AnnotationNode annotation) {
        annotation.desc = Type.getDescriptor(CShadow.class);
    }

}
