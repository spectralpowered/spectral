package io.spectralpowered.injector.targets.impl;

import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.annotations.CSlice;
import io.spectralpowered.injector.annotations.CTarget;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ThrowTarget implements IInjectionTarget {

    @Override
    public List<AbstractInsnNode> getTargets(Map<String, IInjectionTarget> injectionTargets, MethodNode method, CTarget target, CSlice slice) {
        List<AbstractInsnNode> targets = new ArrayList<>();
        int i = 0;
        for (AbstractInsnNode instruction : this.getSlice(injectionTargets, method, slice)) {
            if (instruction.getOpcode() == Opcodes.ATHROW) {
                if (target.ordinal() == -1 || target.ordinal() == i) targets.add(instruction);
                i++;
            }
        }
        return targets;
    }

    @Override
    public CTarget.Shift getShift(CTarget target) {
        return CTarget.Shift.BEFORE;
    }

}
