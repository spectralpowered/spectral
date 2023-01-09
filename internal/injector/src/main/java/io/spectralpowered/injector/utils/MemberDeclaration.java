package io.spectralpowered.injector.utils;

import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;

public class MemberDeclaration {

    private final String owner;
    private final String name;
    private final String desc;

    public MemberDeclaration(String owner, String name, String desc) {
        this.owner = owner;
        this.name = name;
        this.desc = desc;
    }

    public String getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }


    public boolean is(FieldInsnNode fieldInsnNode) {
        return owner.equals(fieldInsnNode.owner) && name.equals(fieldInsnNode.name) && desc.equals(fieldInsnNode.desc);
    }

    public boolean is(MethodInsnNode methodInsnNode) {
        return owner.equals(methodInsnNode.owner) && name.equals(methodInsnNode.name) && desc.equals(methodInsnNode.desc);
    }

    public boolean isFieldMapping() {
        return !desc.startsWith("(");
    }

}
