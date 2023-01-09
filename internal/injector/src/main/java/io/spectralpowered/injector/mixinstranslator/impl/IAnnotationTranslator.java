package io.spectralpowered.injector.mixinstranslator.impl;

import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

public interface IAnnotationTranslator {

    void translate(AnnotationNode annotation);

    default void dynamicTranslate(AnnotationNode annotation) {
        IAnnotationTranslator translator = AnnotationTranslatorManager.getTranslator(Type.getType(annotation.desc));
        if (translator != null) translator.translate(annotation);
    }

}
