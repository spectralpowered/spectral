package io.spectralpowered.injector.transformer.impl;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.transformer.ATransformer;
import io.spectralpowered.injector.annotations.CShadow;
import io.spectralpowered.injector.exceptions.FieldNotFoundException;
import io.spectralpowered.injector.exceptions.MethodNotFoundException;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.mappings.MapRemapper;
import io.spectralpowered.injector.utils.mappings.Remapper;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.objectweb.asm.Opcodes.ACC_STATIC;

public class CShadowTransformer extends ATransformer {

    @Override
    public void transform(InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer) {
        MapRemapper remapper = new MapRemapper();
        checkFields(transformedClass, transformer, classProvider, remapper);
        checkMethods(transformedClass, transformer, classProvider, remapper);

        if (remapper.isEmpty()) return;
        ClassNode mappedNode = Remapper.remap(transformer, remapper);
        Remapper.merge(transformer, mappedNode);
    }

    private void checkFields(ClassNode target, ClassNode transformer, IClassProvider classProvider, MapRemapper remapper) {
        Iterator<FieldNode> it = transformer.fields.iterator();
        while (it.hasNext()) {
            FieldNode field = it.next();
            CShadow annotation = getAnnotation(CShadow.class, field, classProvider);
            if (annotation == null) continue;
            it.remove();

            List<FieldNode> targets = ASMUtils.getFieldsFromCombi(target, annotation.value());
            if (targets.isEmpty()) throw new FieldNotFoundException(target, transformer, annotation.value());
            for (FieldNode targetField : targets) {
                if (field.name.equals(targetField.name) && field.desc.equals(targetField.desc)) continue;
                if(Modifier.isStatic(targetField.access)) {
                    field.access = field.access | ACC_STATIC;
                }
                remapper.addFieldMapping(transformer.name, field.name, field.desc, targetField.name);
            }
        }
    }

    private void checkMethods(ClassNode target, ClassNode transformer, IClassProvider classProvider, MapRemapper remapper) {
        Iterator<MethodNode> it = transformer.methods.iterator();
        while (it.hasNext()) {
            MethodNode method = it.next();
            CShadow annotation = getAnnotation(CShadow.class, method, classProvider);
            if (annotation == null) continue;
            it.remove();

            List<MethodNode> targets = ASMUtils.getMethodsFromCombi(target, annotation.value());
            if (targets.isEmpty()) throw new MethodNotFoundException(target, transformer, annotation.value());
            for (MethodNode targetMethod : targets) {
                if (method.name.equals(targetMethod.name) && method.desc.equals(targetMethod.desc)) continue;
                if(Modifier.isStatic(targetMethod.access)) {
                    method.access = method.access | ACC_STATIC;
                }
                remapper.addMethodMapping(transformer.name, method.name, method.desc, targetMethod.name);
            }
        }
    }

}
