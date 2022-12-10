package kyle.annotations;

import kyle.mappings.annotation.AnnotationRemap;
import kyle.mappings.annotation.RemapType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specify a slice of bytecode to make choosing the target easier
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.ANNOTATION_TYPE)
public @interface CSlice {

    /**
     * The start of the slice<br>
     * The target <b>must</b> match only a single instruction
     */
    @AnnotationRemap(RemapType.ANNOTATION)
    CTarget from() default @CTarget("");

    /**
     * The end of the slice<br>
     * The target <b>must</b> match only a single instruction
     */
    @AnnotationRemap(RemapType.ANNOTATION)
    CTarget to() default @CTarget("");

}
