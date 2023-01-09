package io.spectralpowered.injector.utils.annotations;

import io.spectralpowered.injector.utils.ASMUtils;
import io.spectralpowered.injector.utils.tree.IClassProvider;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.spectralpowered.injector.utils.Types.*;

public class AnnotationParser<T extends Annotation> {

    public static <T extends Annotation> T parse(Class<T> type, IClassProvider classProvider, Map<String, Object> values) {
        return new AnnotationParser<>(type, classProvider).parse(values);
    }

    public static Map<String, Object> listToMap(List<Object> list) {
        Map<String, Object> map = new HashMap<>();
        if (list != null) for (int i = 0; i < list.size(); i += 2) map.put((String) list.get(i), list.get(i + 1));
        return map;
    }

    public static List<Object> mapToList(Map<String, Object> map) {
        List<Object> list = new ArrayList<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            list.add(entry.getKey());
            list.add(entry.getValue());
        }
        return list;
    }


    private final Class<T> type;
    private final IClassProvider classProvider;

    private Map<String, Object> values;
    private List<String> initializedDefaultValues;
    private ClassNode node;

    public AnnotationParser(Class<T> type, IClassProvider classProvider) {
        this.type = type;
        this.classProvider = classProvider;
    }

    public T parse(Map<String, Object> values) {
        initDefaults(values);
        defineBase();
        declareMethods();

        try {
            return ClassDefiner.
                    <T>defineAnonymousClass(ASMUtils.toBytes(node, classProvider))
                    .newInstance(new Class[]{IClassProvider.class, Map.class}, new Object[]{classProvider, this.values});
        } catch (Throwable t) {
            throw new IllegalStateException("Failed to create instance of '" + type.getName() + "'", t);
        }
    }


    private void initDefaults(Map<String, Object> values) {
        initializedDefaultValues = new ArrayList<>();
        for (Method method : type.getDeclaredMethods()) {
            if (values.containsKey(method.getName())) continue;
            Object defaultValue = method.getDefaultValue();
            if (defaultValue == null) continue;
            values.put(method.getName(), defaultValue);
            initializedDefaultValues.add(method.getName());
        }

        this.values = values;
    }

    private void defineBase() {
        node = new ClassNode();
        node.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC, ClassDefiner.generateClassName("AnnotationWrapper"), null, IN_Object, new String[]{internalName(type), internalName(IParsedAnnotation.class)});

        { //fields
            node.visitField(Opcodes.ACC_PRIVATE, "classProvider", typeDescriptor(IClassProvider.class), null, null).visitEnd();
            node.visitField(Opcodes.ACC_PRIVATE, "values", typeDescriptor(Map.class), null, null).visitEnd();
        }

        { //<init>
            MethodVisitor constructor = node.visitMethod(Opcodes.ACC_PUBLIC, MN_Init, methodDescriptor(void.class, IClassProvider.class, Map.class), null, null);
            constructor.visitVarInsn(Opcodes.ALOAD, 0);
            constructor.visitMethodInsn(Opcodes.INVOKESPECIAL, IN_Object, MN_Init, MD_Void, false);

            constructor.visitVarInsn(Opcodes.ALOAD, 0);
            constructor.visitVarInsn(Opcodes.ALOAD, 1);
            constructor.visitFieldInsn(Opcodes.PUTFIELD, node.name, "classProvider", typeDescriptor(IClassProvider.class));

            constructor.visitVarInsn(Opcodes.ALOAD, 0);
            constructor.visitVarInsn(Opcodes.ALOAD, 2);
            constructor.visitFieldInsn(Opcodes.PUTFIELD, node.name, "values", typeDescriptor(Map.class));

            constructor.visitInsn(Opcodes.RETURN);
            constructor.visitEnd();
        }
        { //equals
            MethodVisitor equals = node.visitMethod(Opcodes.ACC_PUBLIC, "equals", methodDescriptor(boolean.class, Object.class), null, null);
            equals.visitInsn(Opcodes.ICONST_0);
            equals.visitInsn(Opcodes.IRETURN);
            equals.visitEnd();
        }
        { //hashCode
            MethodVisitor hashCode = node.visitMethod(Opcodes.ACC_PUBLIC, "hashCode", methodDescriptor(int.class), null, null);
            hashCode.visitInsn(Opcodes.ICONST_0);
            hashCode.visitInsn(Opcodes.IRETURN);
            hashCode.visitEnd();
        }
        { //toString
            MethodVisitor toString = node.visitMethod(Opcodes.ACC_PUBLIC, "toString", methodDescriptor(String.class), null, null);
            toString.visitLdcInsn("AnnotationWrapper");
            toString.visitInsn(Opcodes.ARETURN);
            toString.visitEnd();
        }
        { //annotationType
            MethodVisitor annotationType = node.visitMethod(Opcodes.ACC_PUBLIC, "annotationType", methodDescriptor(Class.class), null, null);
            annotationType.visitLdcInsn(type(type));
            annotationType.visitInsn(Opcodes.ARETURN);
            annotationType.visitEnd();
        }
        { //getValues
            MethodVisitor getValues = node.visitMethod(Opcodes.ACC_PUBLIC, "getValues", methodDescriptor(Map.class), null, null);
            getValues.visitVarInsn(Opcodes.ALOAD, 0);
            getValues.visitFieldInsn(Opcodes.GETFIELD, node.name, "values", typeDescriptor(Map.class));
            getValues.visitInsn(Opcodes.ARETURN);
            getValues.visitEnd();
        }
        { //wasSet
            MethodVisitor wasSet = node.visitMethod(Opcodes.ACC_PUBLIC, "wasSet", methodDescriptor(boolean.class, String.class), null, null);
            for (String value : values.keySet()) {
                if (initializedDefaultValues.contains(value)) continue;

                Label jumpAfter = new Label();
                wasSet.visitVarInsn(Opcodes.ALOAD, 1);
                wasSet.visitLdcInsn(value);
                wasSet.visitMethodInsn(Opcodes.INVOKEVIRTUAL, IN_String, "equals", methodDescriptor(boolean.class, Object.class), false);
                wasSet.visitJumpInsn(Opcodes.IFEQ, jumpAfter);
                wasSet.visitInsn(Opcodes.ICONST_1);
                wasSet.visitInsn(Opcodes.IRETURN);
                wasSet.visitLabel(jumpAfter);
            }
            wasSet.visitInsn(Opcodes.ICONST_0);
            wasSet.visitInsn(Opcodes.IRETURN);
            wasSet.visitEnd();
        }
    }

    private void declareMethods() {
        for (Method method : type.getDeclaredMethods()) {
            MethodVisitor methodVisitor = node.visitMethod(Opcodes.ACC_PUBLIC, method.getName(), methodDescriptor(method), null, null);
            Object value = values.get(method.getName());
            visit(methodVisitor, method.getReturnType(), value);
            methodVisitor.visitInsn(ASMUtils.getReturnOpcode(returnType(method)));
            methodVisitor.visitEnd();
        }
    }

    private void visit(MethodVisitor methodVisitor, Class<?> type, Object value) {
        if (type.equals(boolean.class) || type.equals(Boolean.class)) visitBoolean(methodVisitor, value);
        else if (type.equals(byte.class) || type.equals(Byte.class)) visitByte(methodVisitor, value);
        else if (type.equals(short.class) || type.equals(Short.class)) visitShort(methodVisitor, value);
        else if (type.equals(char.class) || type.equals(Character.class)) visitChar(methodVisitor, value);
        else if (type.equals(int.class) || type.equals(Integer.class)) visitInt(methodVisitor, value);
        else if (type.equals(long.class) || type.equals(Long.class)) visitLong(methodVisitor, value);
        else if (type.equals(float.class) || type.equals(Float.class)) visitFloat(methodVisitor, value);
        else if (type.equals(double.class) || type.equals(Double.class)) visitDouble(methodVisitor, value);
        else if (type.equals(String.class)) visitString(methodVisitor, value);
        else if (type.equals(Class.class)) visitClass(methodVisitor, value);
        else if (type.isEnum()) visitEnum(methodVisitor, value);
        else if (type.isAnnotation() || type.equals(AnnotationNode.class)) visitAnnotation(methodVisitor, value);
        else if (type.isArray()) visitArray(methodVisitor, type.getComponentType(), value);
        else throw new IllegalArgumentException("Unsupported type: " + type);
    }

    private void visitBoolean(MethodVisitor methodVisitor, Object value) {
        boolean b = (boolean) value;
        methodVisitor.visitInsn(b ? Opcodes.ICONST_1 : Opcodes.ICONST_0);
    }

    private void visitByte(MethodVisitor methodVisitor, Object value) {
        byte b = (byte) value;
        methodVisitor.visitIntInsn(Opcodes.BIPUSH, b);
    }

    private void visitShort(MethodVisitor methodVisitor, Object value) {
        short s = (short) value;
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, s);
    }

    private void visitChar(MethodVisitor methodVisitor, Object value) {
        char c = (char) value;
        methodVisitor.visitIntInsn(Opcodes.SIPUSH, c);
    }

    private void visitInt(MethodVisitor methodVisitor, Object value) {
        int i = (int) value;
        methodVisitor.visitLdcInsn(i);
    }

    private void visitLong(MethodVisitor methodVisitor, Object value) {
        long l = (long) value;
        methodVisitor.visitLdcInsn(l);
    }

    private void visitFloat(MethodVisitor methodVisitor, Object value) {
        float f = (float) value;
        methodVisitor.visitLdcInsn(f);
    }

    private void visitDouble(MethodVisitor methodVisitor, Object value) {
        double d = (double) value;
        methodVisitor.visitLdcInsn(d);
    }

    private void visitString(MethodVisitor methodVisitor, Object value) {
        String s = (String) value;
        methodVisitor.visitLdcInsn(s);
    }

    private void visitClass(MethodVisitor methodVisitor, Object value) {
        if (value instanceof Class<?>) {
            Class<?> c = (Class<?>) value;
            methodVisitor.visitLdcInsn(type(c));
        } else if (value instanceof Type) {
            Type type = (Type) value;
            methodVisitor.visitLdcInsn(type);
        } else {
            throw new IllegalArgumentException("Unexpected value class for type 'Class': " + value.getClass());
        }
    }

    private void visitEnum(MethodVisitor methodVisitor, Object value) {
        if (value instanceof Enum<?>) {
            Enum<?> e = (Enum<?>) value;
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, internalName(e.getDeclaringClass()), e.name(), typeDescriptor(e.getDeclaringClass()));
        } else if (value instanceof String[]) {
            String[] enumValue = (String[]) value;
            methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, internalName(enumValue[0]), enumValue[1], enumValue[0]);
        } else {
            throw new IllegalArgumentException("Unexpected value class for type 'Enum': " + value.getClass());
        }
    }

    private void visitAnnotation(MethodVisitor methodVisitor, Object value) {
        Type annotationType;
        if (value instanceof Annotation) annotationType = type(((Annotation) value).annotationType());
        else if (value instanceof AnnotationNode) annotationType = type(((AnnotationNode) value).desc);
        else throw new IllegalArgumentException("Unexpected value class for type 'Annotation': " + value.getClass());

        methodVisitor.visitLdcInsn(annotationType);
        methodVisitor.visitVarInsn(Opcodes.ALOAD, 0);
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, node.name, "classProvider", typeDescriptor(IClassProvider.class));
        methodVisitor.visitTypeInsn(Opcodes.NEW, internalName(HashMap.class));
        methodVisitor.visitInsn(Opcodes.DUP);
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, internalName(HashMap.class), MN_Init, MD_Void, false);
        if (value instanceof Annotation) {
            Annotation a = (Annotation) value;
            for (Method method : a.annotationType().getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers())) continue;

                Object returnValue;
                try {
                    returnValue = method.invoke(value);
                    if (returnValue == null) throw new IllegalArgumentException("Null return value for annotation member: " + method.getName());
                } catch (Throwable t) {
                    throw new IllegalStateException("Failed to invoke method '" + method.getName() + "' on annotation '" + a.annotationType().getName() + "'", t);
                }
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitLdcInsn(method.getName());
                visit(methodVisitor, method.getReturnType(), returnValue);
                visitPrimitiveWrap(methodVisitor, method.getReturnType());
                methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, internalName(Map.class), "put", methodDescriptor(Object.class, Object.class, Object.class), true);
                methodVisitor.visitInsn(Opcodes.POP);
            }
        } else {
            AnnotationNode a = (AnnotationNode) value;
            Map<String, Object> map = AnnotationParser.listToMap(a.values);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitLdcInsn(entry.getKey());
                visit(methodVisitor, entry.getValue().getClass(), entry.getValue());
                visitPrimitiveWrap(methodVisitor, entry.getValue().getClass());
                methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, internalName(Map.class), "put", methodDescriptor(Object.class, Object.class, Object.class), true);
                methodVisitor.visitInsn(Opcodes.POP);
            }
        }
        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, internalName(AnnotationParser.class), "parse", methodDescriptor(Annotation.class, Class.class, IClassProvider.class, Map.class), false);
        methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, internalName(annotationType));
    }

    private void visitArray(MethodVisitor methodVisitor, Class<?> arrayType, Object value) {
        if (value instanceof Object[]) {
            Object[] array = (Object[]) value;
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, array.length);
            methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, internalName(arrayType));
            for (int i = 0; i < array.length; i++) {
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitLdcInsn(i);
                visit(methodVisitor, arrayType, array[i]);
                methodVisitor.visitInsn(Opcodes.AASTORE);
            }
        } else if (value instanceof List) {
            List<?> array = (List<?>) value;
            methodVisitor.visitIntInsn(Opcodes.BIPUSH, array.size());
            methodVisitor.visitTypeInsn(Opcodes.ANEWARRAY, internalName(arrayType));
            for (int i = 0; i < array.size(); i++) {
                methodVisitor.visitInsn(Opcodes.DUP);
                methodVisitor.visitLdcInsn(i);
                visit(methodVisitor, arrayType, array.get(i));
                methodVisitor.visitInsn(Opcodes.AASTORE);
            }
        } else {
            throw new IllegalArgumentException("Unexpected value class for type 'Array': " + value.getClass());
        }
    }

    private void visitPrimitiveWrap(MethodVisitor methodVisitor, Class<?> type) {
        if (type.equals(boolean.class) || type.equals(Boolean.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_Boolean, "valueOf", methodDescriptor(Boolean.class, boolean.class), false);
        } else if (type.equals(byte.class) || type.equals(Byte.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_Byte, "valueOf", methodDescriptor(Byte.class, byte.class), false);
        } else if (type.equals(short.class) || type.equals(Short.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_Short, "valueOf", methodDescriptor(Short.class, short.class), false);
        } else if (type.equals(char.class) || type.equals(Character.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_Character, "valueOf", methodDescriptor(Character.class, char.class), false);
        } else if (type.equals(int.class) || type.equals(Integer.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_Integer, "valueOf", methodDescriptor(Integer.class, int.class), false);
        } else if (type.equals(long.class) || type.equals(Long.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_Long, "valueOf", methodDescriptor(Long.class, long.class), false);
        } else if (type.equals(float.class) || type.equals(Float.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_Float, "valueOf", methodDescriptor(Float.class, float.class), false);
        } else if (type.equals(double.class) || type.equals(Double.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_Double, "valueOf", methodDescriptor(Double.class, double.class), false);
        } else if (type.equals(String.class)) {
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, IN_String, "valueOf", methodDescriptor(String.class, Object.class), false);
        }
    }

}
