package io.spectralpowered.injector.mixinstranslator.impl;

import io.spectralpowered.injector.annotations.injection.CInject;
import io.spectralpowered.injector.utils.annotations.AnnotationParser;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;

import java.util.List;
import java.util.Map;

class InjectTranslator implements IAnnotationTranslator {

    @Override
    public void translate(AnnotationNode annotation) {
        annotation.desc = Type.getDescriptor(CInject.class);
        Map<String, Object> values = AnnotationParser.listToMap(annotation.values);
        Boolean optional = null;
        if (values.containsKey("require")) optional = ((int) values.get("require")) <= 0;
        if (values.containsKey("at")) values.put("target", values.remove("at"));
        if (values.containsKey("target")) {
            List<AnnotationNode> targets = (List<AnnotationNode>) values.get("target");
            for (AnnotationNode target : targets) {
                dynamicTranslate(target);
                if (optional != null) {
                    target.values.add("optional");
                    target.values.add(optional);
                }
            }
        }
        if (values.containsKey("slice")) dynamicTranslate((AnnotationNode) values.get("slice"));
        annotation.values = AnnotationParser.mapToList(values);
    }

}
