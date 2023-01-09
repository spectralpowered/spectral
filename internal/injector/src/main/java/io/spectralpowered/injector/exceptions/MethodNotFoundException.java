package io.spectralpowered.injector.exceptions;

import org.objectweb.asm.tree.ClassNode;

public class MethodNotFoundException extends RuntimeException {

    private final String targetClassName;
    private final String transformerName;
    private final String methodNameAndDesc;

    public MethodNotFoundException(ClassNode targetClass, ClassNode transformer, String methodNameAndDesc) {
        targetClassName = targetClass.name;
        transformerName = transformer.name;
        this.methodNameAndDesc = methodNameAndDesc;
    }

    @Override
    public String getMessage() {
        return "Target class '" + targetClassName + "' does not have method '" + methodNameAndDesc + "' from transformer '" + transformerName + "'";
    }

}
