package io.spectralpowered.injector.mixinstranslator.impl;

import io.spectralpowered.injector.annotations.CSlice;
import io.spectralpowered.injector.utils.annotations.AnnotationParser;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

import java.util.Map;

class SliceTranslator implements IAnnotationTranslator {

    @Override
    public void translate(AnnotationNode annotation) {
        annotation.desc = Type.getDescriptor(CSlice.class);
        Map<String, Object> values = AnnotationParser.listToMap(annotation.values);
        if (values.containsKey("from")) dynamicTranslate((AnnotationNode) values.get("from"));
        if (values.containsKey("to")) dynamicTranslate((AnnotationNode) values.get("to"));
        annotation.values = AnnotationParser.mapToList(values);
    }

}
