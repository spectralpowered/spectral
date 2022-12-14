package io.spectralpowered.injector.transformer.impl;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.annotations.CTarget;
import io.spectralpowered.injector.annotations.injection.CWrapCatch;
import io.spectralpowered.injector.exceptions.TransformerException;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.transformer.types.ARemovingTargetTransformer;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.Codifier;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;

import static io.spectralpowered.injector.utils.Types.*;

public class CWrapCatchTransformer extends ARemovingTargetTransformer<CWrapCatch> {

    public CWrapCatchTransformer() {
        super(CWrapCatch.class, CWrapCatch::value);
    }

    @Override
    public void transform(CWrapCatch annotation, InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer, MethodNode transformerMethod, MethodNode target) {
        if (Modifier.isStatic(target.access) != Modifier.isStatic(transformerMethod.access)) {
            boolean isStatic = Modifier.isStatic(target.access);
            throw new TransformerException(transformerMethod, transformer, "must " + (isStatic ? "" : "not ") + "be static")
                    .help(Codifier.of(transformerMethod).access(isStatic ? transformerMethod.access | Modifier.STATIC : transformerMethod.access & ~Modifier.STATIC));
        }
        Type[] args = argumentTypes(transformerMethod.desc);
        Type returnType = returnType(transformerMethod.desc);
        if (args.length != 1) {
            throw new TransformerException(transformerMethod, transformer, "must have one argument (Exception to catch)")
                    .help(Codifier.of(transformerMethod).param(null).param(type(Exception.class)));
        }
        if (annotation.target().isEmpty()) {
            Type targetReturnType = returnType(target.desc);
            if (!ASMUtils.compareType(targetReturnType, returnType)) {
                throw new TransformerException(transformerMethod, transformer, "must have the same return type as the target method")
                        .help(Codifier.of(transformerMethod).returnType(targetReturnType));
            }
            boolean cast = !targetReturnType.equals(returnType);
            Type exceptionType = args[0];
            renameAndCopy(transformerMethod, target, transformer, transformedClass, "CWrapCatch");

            LabelNode start = new LabelNode();
            LabelNode end_handler = new LabelNode();
            target.instructions.insertBefore(target.instructions.getFirst(), start);
            target.instructions.add(end_handler);
            if (Modifier.isStatic(target.access)) {
                target.instructions.add(new MethodInsnNode(Opcodes.INVOKESTATIC, transformedClass.name, transformerMethod.name, transformerMethod.desc, Modifier.isInterface(transformedClass.access)));
            } else {
                target.instructions.add(new VarInsnNode(Opcodes.ALOAD, 0));
                target.instructions.add(new InsnNode(Opcodes.SWAP));
                target.instructions.add(new MethodInsnNode(Modifier.isInterface(transformedClass.access) ? Opcodes.INVOKEINTERFACE : Opcodes.INVOKEVIRTUAL, transformedClass.name, transformerMethod.name, transformerMethod.desc));
            }
            if (cast) target.instructions.add(new TypeInsnNode(Opcodes.CHECKCAST, returnType(target.desc).getInternalName()));
            target.instructions.add(new InsnNode(ASMUtils.getReturnOpcode(returnType)));

            target.tryCatchBlocks.add(new TryCatchBlockNode(start, end_handler, end_handler, exceptionType.getInternalName()));
        } else {
            List<AbstractInsnNode> targetInstructions = injectionTargets.get("INVOKE").getTargets(injectionTargets, target, new MethodCTarget(annotation.target(), annotation.ordinal()), annotation.slice());
            boolean copied = false;
            for (AbstractInsnNode instruction : targetInstructions) {
                Type instructionReturnType = returnType(((MethodInsnNode) instruction).desc);
                if (!ASMUtils.compareType(instructionReturnType, returnType)) {
                    throw new TransformerException(transformerMethod, transformer, "must have the same return type as the target instruction")
                            .help(Codifier.of(transformerMethod).returnType(instructionReturnType));
                }
                boolean cast = !instructionReturnType.equals(returnType);
                Type exceptionType = args[0];
                if (!copied) {
                    renameAndCopy(transformerMethod, target, transformer, transformedClass, "CWrapCatch");
                    copied = true;
                }

                InsnList insertAfter = new InsnList();
                LabelNode start = new LabelNode();
                LabelNode end_handler = new LabelNode();
                LabelNode jumpAfter = new LabelNode();
                target.instructions.insertBefore(instruction, start);
                insertAfter.add(new JumpInsnNode(Opcodes.GOTO, jumpAfter));
                insertAfter.add(end_handler);
                if (Modifier.isStatic(target.access)) {
                    insertAfter.add(new MethodInsnNode(Opcodes.INVOKESTATIC, transformedClass.name, transformerMethod.name, transformerMethod.desc, Modifier.isInterface(transformedClass.access)));
                } else {
                    insertAfter.add(new VarInsnNode(Opcodes.ALOAD, 0));
                    insertAfter.add(new InsnNode(Opcodes.SWAP));
                    insertAfter.add(new MethodInsnNode(Modifier.isInterface(transformedClass.access) ? Opcodes.INVOKEINTERFACE : Opcodes.INVOKEVIRTUAL, transformedClass.name, transformerMethod.name, transformerMethod.desc));
                }
                if (cast) insertAfter.add(new TypeInsnNode(Opcodes.CHECKCAST, returnType(target.desc).getInternalName()));
                insertAfter.add(new InsnNode(ASMUtils.getReturnOpcode(returnType)));
                insertAfter.add(jumpAfter);
                target.instructions.insert(instruction, insertAfter);

                target.tryCatchBlocks.add(new TryCatchBlockNode(start, end_handler, end_handler, exceptionType.getInternalName()));
            }
        }
    }


    private static class MethodCTarget implements CTarget {

        private final String methodDeclaration;
        private final int ordinal;

        private MethodCTarget(String methodDeclaration, int ordinal) {
            this.methodDeclaration = methodDeclaration;
            this.ordinal = ordinal;
        }

        @Override
        public String value() {
            return "INVOKE";
        }

        @Override
        public String target() {
            return methodDeclaration;
        }

        @Override
        public Shift shift() {
            return Shift.AFTER;
        }

        @Override
        public int ordinal() {
            return ordinal;
        }

        @Override
        public boolean optional() {
            return false;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return MethodCTarget.class;
        }

    }

}
