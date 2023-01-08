package io.spectralpowered.injector.targets.impl;

import io.spectralpowered.injector.annotations.CSlice;
import io.spectralpowered.injector.annotations.CTarget;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.MemberDeclaration;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InvokeTarget implements IInjectionTarget {

    @Override
    public List<AbstractInsnNode> getTargets(Map<String, IInjectionTarget> injectionTargets, MethodNode method, CTarget target, CSlice slice) {
        List<AbstractInsnNode> targets = new ArrayList<>();
        MemberDeclaration memberDeclaration = ASMUtils.splitMemberDeclaration(target.target());
        if (memberDeclaration == null) return null;

        int i = 0;
        for (AbstractInsnNode instruction : this.getSlice(injectionTargets, method, slice)) {
            if (!(instruction instanceof MethodInsnNode)) continue;
            MethodInsnNode methodInsnNode = (MethodInsnNode) instruction;
            if (methodInsnNode.owner.equals(memberDeclaration.getOwner()) && methodInsnNode.name.equals(memberDeclaration.getName()) && methodInsnNode.desc.equals(memberDeclaration.getDesc())) {
                if (target.ordinal() == -1 || target.ordinal() == i) targets.add(instruction);
                i++;
            }
        }
        return targets;
    }

}
