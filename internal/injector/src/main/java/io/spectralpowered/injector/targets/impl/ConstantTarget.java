package io.spectralpowered.injector.targets.impl;

import io.spectralpowered.injector.annotations.CSlice;
import io.spectralpowered.injector.annotations.CTarget;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.utils.ASMUtils;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.*;
import java.util.function.Function;

/**
 * Valid constants:<br>
 * - null<br>
 * - int<br>
 * - long<br>
 * - float<br>
 * - double<br>
 * - string<br>
 * - type
 */
public class ConstantTarget implements IInjectionTarget {

    @Override
    public List<AbstractInsnNode> getTargets(Map<String, IInjectionTarget> injectionTargets, MethodNode method, CTarget target, CSlice slice) {
        List<AbstractInsnNode> targets = new ArrayList<>();
        List<AbstractInsnNode> instructions = getSlice(injectionTargets, method, slice);

        if (target.target().equalsIgnoreCase("null")) findNull(targets, instructions);
        else if (target.target().toLowerCase(Locale.ROOT).startsWith("int")) findInt(targets, instructions, target.target());
        else if (target.target().toLowerCase(Locale.ROOT).startsWith("long")) findLong(targets, instructions, target.target());
        else if (target.target().toLowerCase(Locale.ROOT).startsWith("float")) findFloat(targets, instructions, target.target());
        else if (target.target().toLowerCase(Locale.ROOT).startsWith("double")) findDouble(targets, instructions, target.target());
        else if (target.target().toLowerCase(Locale.ROOT).startsWith("string")) findString(targets, instructions, target.target());
        else if (target.target().toLowerCase(Locale.ROOT).startsWith("type")) findType(targets, instructions, target.target());
        else throw new IllegalArgumentException("Unknown constant type '" + target.target() + "'");

        if (target.ordinal() != -1) {
            if (target.ordinal() < 0 || target.ordinal() >= targets.size()) return Collections.emptyList();
            return Collections.singletonList(targets.get(target.ordinal()));
        }
        return targets;
    }

    private void findNull(List<AbstractInsnNode> targets, List<AbstractInsnNode> instructions) {
        for (AbstractInsnNode instruction : instructions) {
            if (instruction.getOpcode() == Opcodes.ACONST_NULL) targets.add(instruction);
        }
    }

    private void findInt(List<AbstractInsnNode> targets, List<AbstractInsnNode> instructions, String value) {
        int val = parse(value, "int", len -> len == 2, Integer::parseInt);

        for (AbstractInsnNode instruction : instructions) {
            Number number = ASMUtils.getNumber(instruction);
            if ((number instanceof Byte || number instanceof Short || number instanceof Integer) && number.intValue() == val) targets.add(instruction);
        }
    }

    private void findLong(List<AbstractInsnNode> targets, List<AbstractInsnNode> instructions, String value) {
        long val = parse(value, "long", len -> len == 2, Long::parseLong);

        for (AbstractInsnNode instruction : instructions) {
            Number number = ASMUtils.getNumber(instruction);
            if (number instanceof Long && number.longValue() == val) targets.add(instruction);
        }
    }

    private void findFloat(List<AbstractInsnNode> targets, List<AbstractInsnNode> instructions, String value) {
        float val = parse(value, "float", len -> len == 2, Float::parseFloat);

        for (AbstractInsnNode instruction : instructions) {
            Number number = ASMUtils.getNumber(instruction);
            if (number instanceof Float && number.floatValue() == val) targets.add(instruction);
        }
    }

    private void findDouble(List<AbstractInsnNode> targets, List<AbstractInsnNode> instructions, String value) {
        double val = parse(value, "double", len -> len == 2, Double::parseDouble);

        for (AbstractInsnNode instruction : instructions) {
            Number number = ASMUtils.getNumber(instruction);
            if (number instanceof Double && number.doubleValue() == val) targets.add(instruction);
        }
    }

    private void findString(List<AbstractInsnNode> targets, List<AbstractInsnNode> instructions, String value) {
        String val = parse(value, "String", len -> len >= 2, s -> s);

        for (AbstractInsnNode instruction : instructions) {
            if (instruction instanceof LdcInsnNode && val.equals(((LdcInsnNode) instruction).cst)) targets.add(instruction);
        }
    }

    private void findType(List<AbstractInsnNode> targets, List<AbstractInsnNode> instructions, String value) {
        Type val = parse(value, "type", len -> len == 2, Type::getType);

        for (AbstractInsnNode instruction : instructions) {
            if (instruction instanceof LdcInsnNode && val.equals(((LdcInsnNode) instruction).cst)) targets.add(instruction);
        }
    }

    private <T> T parse(String value, String constantName, Function<Integer, Boolean> sizeChecker, Function<String, T> parser) {
        String[] parts = value.split(" ");
        if (!sizeChecker.apply(parts.length)) {
            throw new IllegalArgumentException(constantName + " constant does not have " + getAorAN(constantName) + " " + constantName + " as argument");
        }
        String unparsedVal = value.substring(parts[0].length() + 1);
        T val;
        try {
            val = parser.apply(unparsedVal);
        } catch (Throwable t) {
            throw new IllegalArgumentException(constantName + " constant value can not be parsed as " + getAorAN(constantName) + " " + constantName);
        }
        return val;
    }

    private String getAorAN(String s) {
        char c = s.toUpperCase().charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') return "an";
        return "a";
    }

}
