package kyle.targets.impl;

import kyle.annotations.CSlice;
import kyle.annotations.CTarget;
import kyle.targets.IInjectionTarget;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TailTarget implements IInjectionTarget {

    @Override
    public List<AbstractInsnNode> getTargets(Map<String, IInjectionTarget> injectionTargets, MethodNode method, CTarget target, CSlice slice) {
        for (int i = method.instructions.size() - 1; i >= 0; i--) {
            AbstractInsnNode instruction = method.instructions.get(i);
            if (instruction.getOpcode() >= Opcodes.IRETURN && instruction.getOpcode() <= Opcodes.RETURN) return Collections.singletonList(instruction);
        }
        return Collections.emptyList();
    }

    @Override
    public CTarget.Shift getShift(CTarget target) {
        return CTarget.Shift.BEFORE;
    }

}
