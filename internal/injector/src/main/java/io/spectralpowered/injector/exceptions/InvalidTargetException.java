package io.spectralpowered.injector.exceptions;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Collection;

public class InvalidTargetException extends RuntimeException {

    private final String memberType;
    private final String memberNameAndDesc;
    private final String transformerName;
    private final String target;
    private final Collection<String> targets;

    public InvalidTargetException(MethodNode method, ClassNode transformer, String target, Collection<String> targets) {
        memberType = "Method";
        memberNameAndDesc = method.name + method.desc;
        transformerName = transformer.name;
        this.target = target;
        this.targets = targets;
    }

    @Override
    public String getMessage() {
        String message = memberType + " '" + memberNameAndDesc + "' in transformer '" + transformerName + "' has invalid target '" + target + "'";
        if (!targets.isEmpty()) {
            message += " (valid targets: ";
            for (String validTarget : targets) message += validTarget + ", ";
            message = message.substring(0, message.length() - 2);
            message += ")";
        }
        return message;
    }

}
