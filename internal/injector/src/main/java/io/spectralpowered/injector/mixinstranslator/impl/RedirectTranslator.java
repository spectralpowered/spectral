package io.spectralpowered.injector.mixinstranslator.impl;

import io.spectralpowered.injector.annotations.injection.CRedirect;
import io.spectralpowered.injector.utils.annotations.AnnotationParser;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

import java.util.Map;

class RedirectTranslator implements IAnnotationTranslator {

    @Override
    public void translate(AnnotationNode annotation) {
        annotation.desc = Type.getDescriptor(CRedirect.class);
        Map<String, Object> values = AnnotationParser.listToMap(annotation.values);
        Boolean optional = null;
        if (values.containsKey("require")) optional = ((int) values.get("require")) <= 0;
        if (values.containsKey("at")) values.put("target", values.remove("at"));
        if (values.containsKey("target")) {
            AnnotationNode target = (AnnotationNode) values.get("target");
            dynamicTranslate(target);
            if (optional != null) {
                target.values.add("optional");
                target.values.add(optional);
            }
        }
        if (values.containsKey("slice")) dynamicTranslate((AnnotationNode) values.get("slice"));
        annotation.values = AnnotationParser.mapToList(values);
    }

}
