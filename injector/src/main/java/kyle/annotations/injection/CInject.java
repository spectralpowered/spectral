package kyle.annotations.injection;

import kyle.annotations.CSlice;
import kyle.annotations.CTarget;
import kyle.mappings.annotation.AnnotationRemap;
import kyle.mappings.annotation.RemapType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Inject into a method at various targets<br>
 * You can cancel the original code flow and return own values if needed
 */
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface CInject {

    /**
     * The method name and descriptors to inject into<br>
     * e.g. print(Ljava/lang/String;)V
     */
    @AnnotationRemap(RemapType.SHORT_MEMBER)
    String[] method();

    /**
     * The inject targets to use
     */
    @AnnotationRemap(RemapType.ANNOTATION)
    CTarget[] target();

    /**
     * The slice to use
     */
    @AnnotationRemap(RemapType.ANNOTATION)
    CSlice slice() default @CSlice;

    /**
     * Allow the method to be cancelled<br>
     * Needs to be true to modify return values
     */
    boolean cancellable() default false;

}
