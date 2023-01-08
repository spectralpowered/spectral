package io.spectralpowered.injector.annotations.injection;

import io.spectralpowered.injector.mappings.annotation.AnnotationRemap;
import io.spectralpowered.injector.mappings.annotation.FillType;
import io.spectralpowered.injector.mappings.annotation.RemapType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Inject into a method using direct ASM<br>
 * You get direct access to the {@link org.objectweb.asm.tree.MethodNode} of the target method
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface CASM {

    /**
     * The method name and descriptors to inject into<br>
     * e.g. print(Ljava/lang/String;)V<br>
     * If you want the whole {@link org.objectweb.asm.tree.ClassNode} do not add any targets
     */
    @AnnotationRemap(value = RemapType.SHORT_MEMBER, fill = FillType.KEEP_EMPTY)
    String[] value() default {};

}
