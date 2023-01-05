package io.spectralpowered.injector.transformer.impl.credirect;

import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.Codifier;
import io.spectralpowered.injector.utils.Types;
import io.spectralpowered.injector.exceptions.TransformerException;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.*;

import java.lang.reflect.Modifier;
import java.util.List;

public class CRedirectNew implements IRedirectTarget {

    @Override
    public void inject(ClassNode targetClass, MethodNode targetMethod, ClassNode transformer, MethodNode transformerMethod, List<AbstractInsnNode> targetNodes) {
        for (AbstractInsnNode instruction : targetNodes) {
            MethodInsnNode methodInsnNode = (MethodInsnNode) instruction;

            boolean cast;
            {
                Type returnType = Types.returnType(transformerMethod.desc);
                Type[] argumentTypes = Types.argumentTypes(transformerMethod.desc);
                Type originalReturnType = Types.type(methodInsnNode.owner);
                Type[] originalArgumentTypes = Types.argumentTypes(methodInsnNode.desc);
                if (!ASMUtils.compareType(originalReturnType, returnType)) {
                    throw new TransformerException(transformerMethod, transformer, "does not have same return type as original object")
                            .help(Codifier.of(transformerMethod).returnType(originalReturnType).param(null).params(originalArgumentTypes));
                }
                cast = !originalReturnType.equals(returnType);
                if (!ASMUtils.compareTypes(originalArgumentTypes, argumentTypes)) {
                    throw new TransformerException(transformerMethod, transformer, "does not have same argument types as original constructor")
                            .help(Codifier.of(transformerMethod).param(null).params(originalArgumentTypes));
                }
            }

            int freeVarIndex = ASMUtils.getFreeVarIndex(targetMethod);
            InsnList[] loadStoreOpcodes = getLoadStoreOpcodes(null, methodInsnNode.desc, freeVarIndex);
            InsnList storeOpcodes = loadStoreOpcodes[0];
            InsnList loadOpcodes = loadStoreOpcodes[1];

            targetMethod.instructions.insertBefore(methodInsnNode, storeOpcodes);
            targetMethod.instructions.insertBefore(methodInsnNode, new InsnNode(Opcodes.POP2));
            if (cast) targetMethod.instructions.insert(methodInsnNode, new TypeInsnNode(Opcodes.CHECKCAST, Types.returnType(methodInsnNode.desc).getInternalName()));
            if (!Modifier.isStatic(transformerMethod.access)) {
                targetMethod.instructions.insertBefore(methodInsnNode, new VarInsnNode(Opcodes.ALOAD, 0));
                targetMethod.instructions.insertBefore(methodInsnNode, loadOpcodes);
                targetMethod.instructions.set(methodInsnNode, new MethodInsnNode(Modifier.isInterface(targetClass.access) ? Opcodes.INVOKEINTERFACE : Opcodes.INVOKEVIRTUAL, targetClass.name, transformerMethod.name, transformerMethod.desc));
            } else {
                targetMethod.instructions.insertBefore(methodInsnNode, loadOpcodes);
                targetMethod.instructions.set(methodInsnNode, new MethodInsnNode(Opcodes.INVOKESTATIC, targetClass.name, transformerMethod.name, transformerMethod.desc, Modifier.isInterface(targetClass.access)));
            }
        }
    }

}
