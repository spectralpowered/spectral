package io.spectralpowered.injector.transformer.impl;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.transformer.ATransformer;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.mappings.Remapper;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.*;

import java.util.*;

import static io.spectralpowered.injector.utils.Types.*;

public class MemberCopyTransformer extends ATransformer {

    @Override
    public void transform(InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer) {
        mergeInitializers(transformedClass, transformer);
        for (MethodNode method : transformer.methods) {
            if (method.name.startsWith("<")) continue;
            if (ASMUtils.getMethod(transformedClass, method.name, method.desc) != null) {
                throw new IllegalStateException("Method '" + method.name + method.desc + "' from transformer '" + transformer.name + "' already exists in class '" + transformedClass.name + "' and does not override it");
            }
            Remapper.remapAndAdd(transformer, transformedClass, method);
        }
        for (FieldNode field : transformer.fields) {
            if (ASMUtils.getField(transformedClass, field.name, field.desc) != null) {
                throw new IllegalStateException("Field '" + field.name + field.desc + "' from transformer '" + transformer.name + "' already exists in class '" + transformedClass.name + "'");
            }
            Remapper.remapAndAdd(transformer, transformedClass, field);
        }
        if (transformer.interfaces != null) {
            List<String> interfaces = transformedClass.interfaces;
            if (interfaces == null) interfaces = transformedClass.interfaces = new ArrayList<>();
            for (String anInterface : transformer.interfaces) {
                if (!interfaces.contains(anInterface)) interfaces.add(anInterface);
            }
        }
    }

    private void mergeInitializers(ClassNode transformedClass, ClassNode transformer) {
        Map<MethodNode, MethodNode> initializers = new HashMap<>();
        List<MethodNode> unresolvedInitializers = new ArrayList<>();
        for (MethodNode method : transformedClass.methods) {
            if (!method.name.equals(MN_Init)) continue;

            MethodNode targetMethod = ASMUtils.getMethod(transformer, method.name, method.desc);
            if (targetMethod != null) initializers.put(targetMethod, method);
            else unresolvedInitializers.add(method);
        }
        if (!unresolvedInitializers.isEmpty()) {
            MethodNode emptyConstructor = ASMUtils.getMethod(transformer, MN_Init, MD_Void);
            if (emptyConstructor == null) throw new IllegalStateException("Unable to merge all constructors in target class '" + transformedClass.name + "'");
            for (MethodNode unresolvedInitializer : unresolvedInitializers) initializers.put(emptyConstructor, unresolvedInitializer);
        }
        MethodNode staticBlock = ASMUtils.getMethod(transformer, MN_Clinit, MD_Void);
        if (staticBlock != null) initializers.put(staticBlock, createStaticBlock(transformedClass));
        for (Map.Entry<MethodNode, MethodNode> entry : initializers.entrySet()) copyInitializers(transformer, entry.getKey(), transformedClass, entry.getValue());
    }

    private void copyInitializers(ClassNode fromClass, MethodNode from, ClassNode toClass, MethodNode to) {
        Map<String, InsnList> fieldInitializers = new LinkedHashMap<>();
        InsnList lastInstructions = new InsnList();
        Map<LabelNode, LabelNode> copiedLabels = new HashMap<>();
        for (AbstractInsnNode instruction : from.instructions) {
            if (instruction instanceof LabelNode) copiedLabels.put((LabelNode) instruction, new LabelNode());
        }

        {
            AbstractInsnNode first;
            if (from.name.equals(MN_Init)) first = ASMUtils.getFirstConstructorInstruction(fromClass.superName, from);
            else first = from.instructions.getFirst();
            if (first == null) return;

            for (int i = from.instructions.indexOf(first); i < from.instructions.size(); i++) {
                AbstractInsnNode instruction = from.instructions.get(i);
                if (instruction instanceof LineNumberNode || instruction instanceof FrameNode) continue;
                lastInstructions.add(instruction.clone(copiedLabels));

                if (instruction instanceof FieldInsnNode && (instruction.getOpcode() == Opcodes.PUTFIELD || instruction.getOpcode() == Opcodes.PUTSTATIC)) {
                    FieldInsnNode fieldInsn = (FieldInsnNode) instruction;
                    fieldInitializers.put(fieldInsn.owner + ":" + fieldInsn.name + fieldInsn.desc, lastInstructions);
                    lastInstructions = new InsnList();
                }
            }
            if (lastInstructions.size() != 0) fieldInitializers.put(null, lastInstructions);
        }
        {
            for (AbstractInsnNode instruction : to.instructions.toArray()) {
                if (instruction instanceof FieldInsnNode && (instruction.getOpcode() == Opcodes.PUTFIELD || instruction.getOpcode() == Opcodes.PUTSTATIC)) {
                    FieldInsnNode fieldInsn = (FieldInsnNode) instruction;
                    InsnList insns = fieldInitializers.remove(fieldInsn.owner + ":" + fieldInsn.name + fieldInsn.desc);
                    if (insns == null) continue;

                    to.instructions.insert(instruction, remapInstructions(insns, fromClass.name, toClass.name));
                }
            }
            for (AbstractInsnNode instruction : to.instructions.toArray()) {
                if (instruction.getOpcode() == Opcodes.RETURN) {
                    for (InsnList instructions : fieldInitializers.values()) {
                        to.instructions.insertBefore(instruction, remapInstructions(instructions, fromClass.name, toClass.name));
                    }
                }
            }
        }
    }

    private InsnList remapInstructions(InsnList instructions, String fromName, String toName) {
        ClassNode tempClassHolder = new ClassNode();
        tempClassHolder.visit(0, 0, "temp", null, IN_Object, null);
        MethodNode tempMethodHolder = new MethodNode(0, "temp", MD_Void, null, null);
        tempMethodHolder.instructions = instructions;
        Remapper.remapAndAdd(fromName, toName, tempClassHolder, tempMethodHolder);
        return tempClassHolder.methods.get(0).instructions;
    }

    private MethodNode createStaticBlock(ClassNode transformedClass) {
        for (MethodNode method : transformedClass.methods) {
            if (method.name.equals("<clinit>")) return method;
        }

        MethodVisitor staticBlock = transformedClass.visitMethod(Opcodes.ACC_STATIC, MN_Clinit, MD_Void, null, null);
        staticBlock.visitCode();
        staticBlock.visitInsn(Opcodes.RETURN);
        staticBlock.visitEnd();

        return (MethodNode) staticBlock;
    }

}
