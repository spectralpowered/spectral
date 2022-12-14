package io.spectralpowered.injector.utils.mappings;

import io.spectralpowered.injector.annotations.CTransformer;
import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.tree.ClassTree;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;

public class SuperMappingFiller {

    /**
     * Fill all super mappings for the given transformer targets
     *
     * @param transformer   The {@link ClassNode} of the transformer
     * @param remapper      The {@link MapRemapper} to use
     * @param classProvider The {@link IClassProvider} to use
     */
    public static void fillTransformerSuperMembers(ClassNode transformer, MapRemapper remapper, IClassProvider classProvider) {
        List<Object> annotation;
        if (transformer.invisibleAnnotations == null || (annotation = transformer.invisibleAnnotations.stream().filter(a -> a.desc.equals(Type.getDescriptor(CTransformer.class))).map(a -> a.values).findFirst().orElse(null)) == null) {
            throw new IllegalStateException("Transformer does not have CTransformer annotation");
        }
        for (int i = 0; i < annotation.size(); i += 2) {
            String key = (String) annotation.get(i);
            Object value = annotation.get(i + 1);

            if (key.equals("value")) {
                List<Type> classesList = (List<Type>) value;
                for (Type type : classesList) {
                    ClassTree treePart = ClassTree.getTreePart(classProvider, remapper.mapSafe(type.getInternalName()));
                    Set<ClassNode> superClasses = treePart.walkSuperClasses(new HashSet<>(), classProvider, false).stream().map(ClassTree::getNode).collect(Collectors.toSet());
                    SuperMappingFiller.fillSuperMembers(treePart.getNode(), superClasses, remapper);
                }
            } else if (key.equals("name")) {
                List<String> classesList = (List<String>) value;
                for (String className : classesList) {
                    ClassTree treePart = ClassTree.getTreePart(classProvider, remapper.mapSafe(ASMUtils.slash(className)));
                    Set<ClassNode> superClasses = treePart.walkSuperClasses(new HashSet<>(), classProvider, false).stream().map(ClassTree::getNode).collect(Collectors.toSet());
                    SuperMappingFiller.fillSuperMembers(treePart.getNode(), superClasses, remapper);
                }
            }
        }
    }

    /**
     * Fill all super mappings for the given class<br>
     * All input classes <b>must</b> be in the target format of the remapper
     *
     * @param node         The {@link ClassNode} of the target class
     * @param superClasses The {@link Set} of super classes to use
     * @param remapper     The {@link MapRemapper} to use
     */
    public static void fillSuperMembers(ClassNode node, Set<ClassNode> superClasses, MapRemapper remapper) {
        MapRemapper reverseRemapper = remapper.reverse();
        for (ClassNode superClass : superClasses) {
            for (FieldNode field : superClass.fields) {
                if (Modifier.isStatic(field.access)) continue;
                if (Modifier.isPrivate(field.access)) continue;
                String mappedName = reverseRemapper.mapFieldName(superClass.name, field.name, field.desc);
                if (field.name.equals(mappedName)) continue;
                remapper.addFieldMapping(reverseRemapper.mapSafe(node.name), mappedName, reverseRemapper.mapDesc(field.desc), field.name, true);
            }
            for (MethodNode method : superClass.methods) {
                if (Modifier.isStatic(method.access)) continue;
                if (Modifier.isPrivate(method.access)) continue;
                String mappedName = reverseRemapper.mapMethodName(superClass.name, method.name, method.desc);
                if (method.name.equals(mappedName)) continue;
                remapper.addMethodMapping(reverseRemapper.mapSafe(node.name), mappedName, reverseRemapper.mapMethodDesc(method.desc), method.name, true);
            }
        }
    }

    /**
     * Fill all super mappings for all classes found in the given remapper<br>
     * If a class could not be found the mappings for it will be skipped
     *
     * @param remapper      The {@link MapRemapper} to use
     * @param classProvider The {@link IClassProvider} to use
     */
    public static void fillAllSuperMembers(MapRemapper remapper, IClassProvider classProvider) {
        for (Map.Entry<String, String> entry : new HashMap<>(remapper.getMappings()).entrySet()) {
            if (entry.getKey().contains(".")) continue;
            String obfClass = entry.getValue();
            try {
                ClassTree treeNode = ClassTree.getTreePart(classProvider, obfClass);
                Set<ClassNode> superClasses = treeNode.walkSuperClasses(new HashSet<>(), classProvider, false).stream().map(ClassTree::getNode).collect(Collectors.toSet());
                fillSuperMembers(treeNode.getNode(), superClasses, remapper);
            } catch (Throwable ignored) {
            }
        }
    }

}
