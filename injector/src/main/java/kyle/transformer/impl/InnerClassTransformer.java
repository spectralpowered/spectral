package kyle.transformer.impl;

import kyle.TransformerManager;
import kyle.targets.IInjectionTarget;
import kyle.transformer.ATransformer;
import kyle.utils.ASMUtils;
import kyle.utils.mappings.Remapper;
import kyle.utils.tree.IClassProvider;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Map;

import static kyle.utils.ASMUtils.dot;

public class InnerClassTransformer extends ATransformer {

    @Override
    public void transform(TransformerManager transformerManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode injectedClass, ClassNode transformer) {
        boolean hasInnerClasses = false;
        for (InnerClassNode innerClass : transformer.innerClasses) {
            if (innerClass.outerName != null) continue;
            hasInnerClasses = true;

            transformerManager.addRawTransformer(dot(innerClass.name), (tm, transformedClass) -> {
                for (MethodNode method : transformedClass.methods) method.access = ASMUtils.setAccess(method.access, Opcodes.ACC_PUBLIC);
                for (FieldNode field : transformedClass.fields) field.access = ASMUtils.setAccess(field.access, Opcodes.ACC_PUBLIC);
                transformedClass.access = ASMUtils.setAccess(transformedClass.access, Opcodes.ACC_PUBLIC);
                transformedClass.outerClass = null;

                return Remapper.remap(transformer.name, injectedClass.name, transformedClass);
            });
        }
        if (hasInnerClasses) {
            for (MethodNode method : transformer.methods) {
                if ((method.access & Opcodes.ACC_SYNTHETIC) != 0) {
                    method.access = ASMUtils.setAccess(method.access, Opcodes.ACC_PUBLIC);
                    method.access &= ~Opcodes.ACC_BRIDGE;
                }
            }
        }
    }

}
