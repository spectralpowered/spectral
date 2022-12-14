package io.spectralpowered.injector.mixinstranslator;

import io.spectralpowered.injector.mixinstranslator.impl.AnnotationTranslatorManager;
import io.spectralpowered.injector.mixinstranslator.impl.IAnnotationTranslator;
import io.spectralpowered.injector.transformer.ITransformerPreprocessor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.List;

/**
 * Translate annotation from Mixins to ClassTransform<br>
 * Since ClassTransform has some differences to Mixins this is not a 100% perfect translation<br>
 * Some features may not be supported.<br>
 * Some fields which are not supported but still got copied over to simplify the copy-paste action<br>
 * You can recognize them by the @Deprecated annotation
 */
public class MixinsTranslator implements ITransformerPreprocessor {

    @Override
    public void process(ClassNode node) {
        transform(node.visibleAnnotations);
        transform(node.invisibleAnnotations);
        for (FieldNode field : node.fields) {
            transform(field.visibleAnnotations);
            transform(field.invisibleAnnotations);
        }
        for (MethodNode method : node.methods) {
            transform(method.visibleAnnotations);
            transform(method.invisibleAnnotations);

            CallbackRewriter.rewrite(method);
        }
    }

    private void transform(List<AnnotationNode> annotations) {
        if (annotations == null) return;
        for (AnnotationNode annotation : annotations) {
            IAnnotationTranslator translator = AnnotationTranslatorManager.getTranslator(Type.getType(annotation.desc));
            if (translator != null) translator.translate(annotation);
        }
    }

}
