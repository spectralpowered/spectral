package io.spectralpowered.injector.transformer.impl;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.annotations.injection.COverride;
import io.spectralpowered.injector.exceptions.TransformerException;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.transformer.types.ARemovingTargetTransformer;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.Codifier;
import io.spectralpowered.injector.utils.mappings.Remapper;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.Map;

import static io.spectralpowered.injector.utils.Types.argumentTypes;

public class COverrideTransformer extends ARemovingTargetTransformer<COverride> {

    public COverrideTransformer() {
        super(COverride.class, COverride::value);
    }

    @Override
    public void transform(COverride annotation, InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer, MethodNode transformerMethod, MethodNode target) {
        if (Modifier.isStatic(target.access) != Modifier.isStatic(transformerMethod.access)) {
            boolean isStatic = Modifier.isStatic(target.access);
            throw new TransformerException(transformerMethod, transformer, "must " + (isStatic ? "" : "not ") + "be static")
                    .help(Codifier.of(transformerMethod).access(isStatic ? transformerMethod.access | Modifier.STATIC : transformerMethod.access & ~Modifier.STATIC));
        }
        if (!ASMUtils.compareTypes(argumentTypes(target.desc), argumentTypes(transformerMethod.desc))) {
            throw new TransformerException(transformerMethod, transformer, "must have the same arguments as the target method")
                    .help(Codifier.of(target));
        }
        if (ASMUtils.isAccessLower(transformerMethod.access, target.access)) {
            throw new TransformerException(transformerMethod, transformer, "must be higher/equal to original method");
        }
        transformerMethod.name = target.name;
        transformerMethod.desc = target.desc;
        transformedClass.methods.remove(target);
        prepareForCopy(transformer, transformerMethod);
        Remapper.remapAndAdd(transformer, transformedClass, transformerMethod);
    }

}
