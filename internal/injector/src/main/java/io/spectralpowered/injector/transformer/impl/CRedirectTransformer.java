package io.spectralpowered.injector.transformer.impl;

import io.spectralpowered.injector.InjectionManager;
import io.spectralpowered.injector.annotations.injection.CRedirect;
import io.spectralpowered.injector.exceptions.InvalidTargetException;
import io.spectralpowered.injector.exceptions.MethodNotFoundException;
import io.spectralpowered.injector.exceptions.TransformerException;
import io.spectralpowered.injector.targets.IInjectionTarget;
import io.spectralpowered.injector.transformer.impl.credirect.CRedirectField;
import io.spectralpowered.injector.transformer.impl.credirect.CRedirectInvoke;
import io.spectralpowered.injector.transformer.impl.credirect.CRedirectNew;
import io.spectralpowered.injector.transformer.impl.credirect.IRedirectTarget;
import io.spectralpowered.injector.transformer.types.ARemovingTransformer;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.Codifier;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class CRedirectTransformer extends ARemovingTransformer<CRedirect> {

    private final Map<String, IRedirectTarget> redirectTargets = new HashMap<>();

    public CRedirectTransformer() {
        super(CRedirect.class);

        redirectTargets.put("INVOKE", new CRedirectInvoke());
        redirectTargets.put("FIELD", new CRedirectField());
        redirectTargets.put("GETFIELD", new CRedirectField());
        redirectTargets.put("PUTFIELD", new CRedirectField());
        redirectTargets.put("NEW", new CRedirectNew());
    }

    @Override
    public void transform(CRedirect annotation, InjectionManager injectionManager, IClassProvider classProvider, Map<String, IInjectionTarget> injectionTargets, ClassNode transformedClass, ClassNode transformer, MethodNode transformerMethod) {
        IInjectionTarget iInjectionTarget = injectionTargets.get(annotation.target().value().toUpperCase(Locale.ROOT));
        IRedirectTarget iRedirectTarget = redirectTargets.get(annotation.target().value().toUpperCase(Locale.ROOT));
        if (iInjectionTarget == null || iRedirectTarget == null) {
            throw new InvalidTargetException(transformerMethod, transformer, annotation.target().value(), redirectTargets.keySet());
        }

        for (String targetCombi : annotation.method()) {
            List<MethodNode> targets = ASMUtils.getMethodsFromCombi(transformedClass, targetCombi);
            if (targets.isEmpty()) throw new MethodNotFoundException(transformedClass, transformer, targetCombi);
            for (MethodNode target : targets) {
                if (Modifier.isStatic(target.access) != Modifier.isStatic(transformerMethod.access)) {
                    boolean isStatic = Modifier.isStatic(target.access);
                    throw new TransformerException(transformerMethod, transformer, "must " + (isStatic ? "" : "not ") + "be static")
                            .help(Codifier.of(transformerMethod).access(isStatic ? transformerMethod.access | Modifier.STATIC : transformerMethod.access & ~Modifier.STATIC));
                }

                List<AbstractInsnNode> injectionInstructions = iInjectionTarget.getTargets(injectionTargets, target, annotation.target(), annotation.slice());
                if (injectionInstructions == null) {
                    throw new TransformerException(transformerMethod, transformer, "has invalid member declaration '" + annotation.target().target() + "'")
                            .help("e.g. Ljava/lang/String;toString()V, Ljava/lang/Integer;MAX_VALUE:I");
                }
                if (injectionInstructions.isEmpty() && !annotation.target().optional()) {
                    throw new TransformerException(transformerMethod, transformer, "target '" + annotation.target().target() + "' could not be found")
                            .help("e.g. Ljava/lang/String;toString()V, Ljava/lang/Integer;MAX_VALUE:I");
                }

                renameAndCopy(transformerMethod, target, transformer, transformedClass, "CRedirect");
                iRedirectTarget.inject(transformedClass, target, transformer, transformerMethod, injectionInstructions);
            }
        }
    }

}
