package io.spectralpowered.injector.annotations.injection;

import io.spectralpowered.injector.annotations.CTarget;
import io.spectralpowered.injector.annotations.CSlice;
import io.spectralpowered.injector.mappings.annotation.AnnotationRemap;
import io.spectralpowered.injector.mappings.annotation.RemapType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Redirect a specific method/field call
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
public @interface CRedirect {

    /**
     * The method name and descriptors to inject into<br>
     * e.g. print(Ljava/lang/String;)V
     */
    @AnnotationRemap(RemapType.SHORT_MEMBER)
    String[] method();

    /**
     * The redirect target to use
     */
    @AnnotationRemap(RemapType.ANNOTATION)
    CTarget target();

    /**
     * The slice to use
     */
    @AnnotationRemap(RemapType.ANNOTATION)
    CSlice slice() default @CSlice;

}
