package io.spectralpowered.injector.transformer;

import org.objectweb.asm.tree.ClassNode;

public interface ITransformerPreprocessor {

    /**
     * Process a transformer before it is read<br>
     * You can modify the class transform annotations before parsing
     *
     * @param node The {@link ClassNode} of the transformer
     */
    void process(ClassNode node);

}
