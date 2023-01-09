package io.spectralpowered.injector.transformer;

import io.spectralpowered.injector.InjectionManager;
import org.objectweb.asm.tree.ClassNode;

public interface IRawTransformer {

    /**
     * Transform the target class directly
     *
     * @param injectionManager The transformer manager
     * @param transformedClass   The target {@link ClassNode}
     * @return The transformed {@link ClassNode} or the same if nothing was changed
     */
    ClassNode transformer(InjectionManager injectionManager, ClassNode transformedClass);

}
