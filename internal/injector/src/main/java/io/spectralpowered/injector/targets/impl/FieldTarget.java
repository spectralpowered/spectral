package io.spectralpowered.injector.targets.impl;

import io.spectralpowered.injector.annotations.CSlice;
import io.spectralpowered.injector.annotations.CTarget;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.MemberDeclaration;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FieldTarget implements IInjectionTarget {

    private final int nonStaticAccess;
    private final int staticAccess;

    public FieldTarget() {
        this(-1, -1);
    }

    public FieldTarget(int nonStaticAccess, int staticAccess) {
        this.nonStaticAccess = nonStaticAccess;
        this.staticAccess = staticAccess;
    }

    @Override
    public List<AbstractInsnNode> getTargets(Map<String, IInjectionTarget> injectionTargets, MethodNode method, CTarget target, CSlice slice) {
        List<AbstractInsnNode> targets = new ArrayList<>();
        MemberDeclaration memberDeclaration = ASMUtils.splitMemberDeclaration(target.target());
        if (memberDeclaration == null) return null;

        boolean allAccess = nonStaticAccess == -1 && staticAccess == -1;
        int i = 0;
        for (AbstractInsnNode instruction : getSlice(injectionTargets, method, slice)) {
            if (!(instruction instanceof FieldInsnNode)) continue;
            if (!allAccess && (nonStaticAccess != instruction.getOpcode() && staticAccess != instruction.getOpcode())) continue;
            FieldInsnNode fieldInsnNode = (FieldInsnNode) instruction;
            if (fieldInsnNode.owner.equals(memberDeclaration.getOwner()) && fieldInsnNode.name.equals(memberDeclaration.getName()) && fieldInsnNode.desc.equals(memberDeclaration.getDesc())) {
                if (target.ordinal() == -1 || target.ordinal() == i) targets.add(instruction);
                i++;
            }
        }
        return targets;
    }

}
