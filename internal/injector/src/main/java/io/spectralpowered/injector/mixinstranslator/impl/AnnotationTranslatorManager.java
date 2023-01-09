package io.spectralpowered.injector.mixinstranslator.impl;

import io.spectralpowered.injector.annotations.injection.*;
import org.objectweb.asm.Type;
import io.spectralpowered.injector.annotations.Mixin;
import io.spectralpowered.injector.annotations.Overwrite;
import io.spectralpowered.injector.annotations.Shadow;

import java.util.HashMap;
import java.util.Map;

public class AnnotationTranslatorManager {

    private static final Map<String, IAnnotationTranslator> ANNOTATION_TRANSLATOR = new HashMap<>();

    static {
        AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.put(Mixin.class.getName(), new MixinTranslator());
        AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.put(Inject.class.getName(), new InjectTranslator());
        AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.put(Redirect.class.getName(), new RedirectTranslator());
        AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.put(ModifyConstant.class.getName(), new ModifyConstantTranslator());
        AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.put(Overwrite.class.getName(), new OverwriteTranslator());
        AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.put(At.class.getName(), new AtTranslator());
        AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.put(Shadow.class.getName(), new ShadowTranslator());
        AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.put(Slice.class.getName(), new SliceTranslator());
    }

    public static IAnnotationTranslator getTranslator(Type type) {
        return AnnotationTranslatorManager.ANNOTATION_TRANSLATOR.get(type.getClassName());
    }

}
