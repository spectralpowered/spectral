package io.spectralpowered.injector.exceptions;

import io.spectralpowered.injector.utils.Codifier;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class TransformerException extends RuntimeException {

    private final String memberType;
    private final String memberNameAndDesc;
    private final String transformerName;
    private final String state;

    private String help;

    public TransformerException(MethodNode method, ClassNode transformer, String state) {
        memberType = "Method";
        memberNameAndDesc = method.name + method.desc;
        transformerName = transformer.name;
        this.state = state;
    }

    public TransformerException help(Codifier codifier) {
        return help(codifier.build());
    }

    public TransformerException help(String help) {
        this.help = help;
        return this;
    }

    @Override
    public String getMessage() {
        String message = memberType + " '" + memberNameAndDesc + "' in transformer '" + transformerName + "' " + state;
        if (help != null) message += ": " + help;
        return message;
    }

}
