package io.spectralpowered.injector.mixinstranslator.impl;

import io.spectralpowered.injector.annotations.CTransformer;
import io.spectralpowered.injector.utils.annotations.AnnotationParser;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

import java.util.Map;

class MixinTranslator implements IAnnotationTranslator {

    @Override
    public void translate(AnnotationNode annotation) {
        annotation.desc = Type.getDescriptor(CTransformer.class);
        Map<String, Object> values = AnnotationParser.listToMap(annotation.values);
        if (values.containsKey("targets")) values.put("name", values.remove("targets"));
        annotation.values = AnnotationParser.mapToList(values);
    }

}
