package io.spectralpowered.injector.mixinstranslator.impl;

import io.spectralpowered.injector.annotation.injection.*;
import org.objectweb.asm.Type;
import io.spectralpowered.injector.annotation.Mixin;
import io.spectralpowered.injector.annotation.Overwrite;
import io.spectralpowered.injector.annotation.Shadow;

import java.util.HashMap;
import java.util.Map;

public class AnnotationTranslatorManager {

    private static final Map<String, IAnnotationTranslator> ANNOTATION_TRANSLATOR = new HashMap<>();

    static {
        ANNOTATION_TRANSLATOR.put(Mixin.class.getName(), new MixinTranslator());
        ANNOTATION_TRANSLATOR.put(Inject.class.getName(), new InjectTranslator());
        ANNOTATION_TRANSLATOR.put(Redirect.class.getName(), new RedirectTranslator());
        ANNOTATION_TRANSLATOR.put(ModifyConstant.class.getName(), new ModifyConstantTranslator());
        ANNOTATION_TRANSLATOR.put(Overwrite.class.getName(), new OverwriteTranslator());
        ANNOTATION_TRANSLATOR.put(At.class.getName(), new AtTranslator());
        ANNOTATION_TRANSLATOR.put(Shadow.class.getName(), new ShadowTranslator());
        ANNOTATION_TRANSLATOR.put(Slice.class.getName(), new SliceTranslator());
    }

    public static IAnnotationTranslator getTranslator(final Type type) {
        return ANNOTATION_TRANSLATOR.get(type.getClassName());
    }

}
