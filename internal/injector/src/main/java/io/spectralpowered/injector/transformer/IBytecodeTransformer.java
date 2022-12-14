package io.spectralpowered.injector.transformer;

public interface IBytecodeTransformer {

    /**
     * Transform the raw bytecode all {@link Class}es
     *
     * @param className The name of the {@link Class}
     * @param bytecode  The raw bytecode of the {@link Class}
     * @return The transformed bytecode or null if not transformed
     */
    byte[] transform(String className, byte[] bytecode);

}
