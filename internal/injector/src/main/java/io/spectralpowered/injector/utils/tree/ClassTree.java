package io.spectralpowered.injector.utils.tree;

import io.spectralpowered.injector.utils.ASMUtils;
import org.objectweb.asm.tree.ClassNode;

import java.util.*;

public class ClassTree {

    private static final Map<String, ClassTree> TREE = new HashMap<>();

    public static ClassTree getTreePart(IClassProvider classProvider, String className) {
        className = ASMUtils.dot(className);
        if (ClassTree.TREE.containsKey(className)) return ClassTree.TREE.get(className);

        byte[] bytecode = classProvider.getClass(className);
        ClassNode node = ASMUtils.fromBytes(bytecode);
        ClassTree tree = new ClassTree(node);
        ClassTree.TREE.put(className, tree);

        int oldSize;
        do {
            oldSize = tree.superClasses.size();
            for (String superClass : tree.superClasses.toArray(new String[0])) {
                ClassTree superTree = ClassTree.getTreePart(classProvider, superClass);
                if (superTree != null) tree.superClasses.addAll(superTree.superClasses);
            }
        } while (oldSize != tree.superClasses.size());

        return tree;
    }


    private final ClassNode node;
    private final String name;
    private final String superClass;
    private final Set<String> superClasses;
    private final int modifiers;

    public ClassTree(ClassNode node) {
        this.node = node;
        name = ASMUtils.dot(node.name);
        superClass = node.superName;
        superClasses = new HashSet<>();
        if (superClass != null) superClasses.add(ASMUtils.dot(superClass));
        if (node.interfaces != null) {
            for (String inter : node.interfaces) superClasses.add(ASMUtils.dot(inter));
        }
        modifiers = node.access;
    }

    public ClassNode getNode() {
        return node;
    }

    public String getName() {
        return name;
    }

    public ClassTree parseSuperClass(IClassProvider classProvider) {
        if (superClass == null) return null;
        return getTreePart(classProvider, superClass);
    }

    public Set<String> getSuperClasses() {
        return Collections.unmodifiableSet(superClasses);
    }

    public Set<ClassTree> getParsedSuperClasses(IClassProvider classProvider) {
        Set<ClassTree> out = new HashSet<>();
        for (String superClass : superClasses) out.add(getTreePart(classProvider, superClass));
        return out;
    }

    public Set<ClassTree> walkSuperClasses(Set<ClassTree> walkedSuperClasses, IClassProvider classProvider, boolean includeSelf) {
        if (walkedSuperClasses.contains(this)) return walkedSuperClasses;
        if (includeSelf) walkedSuperClasses.add(this);
        for (ClassTree superClass : getParsedSuperClasses(classProvider)) superClass.walkSuperClasses(walkedSuperClasses, classProvider, true);
        return walkedSuperClasses;
    }

    public int getModifiers() {
        return modifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassTree classTree = (ClassTree) o;
        return Objects.equals(name, classTree.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
