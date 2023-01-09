package io.spectralpowered.injector.utils.tree;

import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.Types;
import org.objectweb.asm.ClassWriter;

import java.lang.reflect.Modifier;

public class TreeClassWriter extends ClassWriter {

    private final IClassProvider classProvider;

    public TreeClassWriter(IClassProvider classProvider) {
        super(ClassWriter.COMPUTE_FRAMES);

        this.classProvider = classProvider;
    }

    @Override
    protected String getCommonSuperClass(String type1, String type2) {
        if (type1.equals(Types.IN_Object) || type2.equals(Types.IN_Object)) return Types.IN_Object;

        ClassTree class1 = ClassTree.getTreePart(classProvider, type1);
        if (class1 == null) throw new TypeNotPresentException(type1, new NullPointerException());
        ClassTree class2 = ClassTree.getTreePart(classProvider, type2);
        if (class2 == null) throw new TypeNotPresentException(type2, new NullPointerException());

        if (class2.getSuperClasses().contains(class1.getName())) {
            return type1;
        } else if (class1.getSuperClasses().contains(class2.getName())) {
            return type2;
        } else if (!Modifier.isInterface(class1.getModifiers()) && !Modifier.isInterface(class2.getModifiers())) {
            do {
                class1 = class1.parseSuperClass(classProvider);
                if (class1 == null) return Types.IN_Object;
            } while (!class2.getSuperClasses().contains(class1.getName()));

            return ASMUtils.slash(class1.getName());
        } else {
            return Types.IN_Object;
        }
    }

}
