package io.spectralpowered.injector.utils;

import org.objectweb.asm.Type;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Types {

    //internal names
    public static final String IN_Object = Types.internalName(Object.class);
    public static final String IN_String = Types.internalName(String.class);
    public static final String IN_Boolean = Types.internalName(Boolean.class);
    public static final String IN_Byte = Types.internalName(Byte.class);
    public static final String IN_Short = Types.internalName(Short.class);
    public static final String IN_Character = Types.internalName(Character.class);
    public static final String IN_Integer = Types.internalName(Integer.class);
    public static final String IN_Long = Types.internalName(Long.class);
    public static final String IN_Float = Types.internalName(Float.class);
    public static final String IN_Double = Types.internalName(Double.class);
    //method descriptor
    public static final String MD_Void = Types.methodDescriptor(void.class);
    //method name
    public static final String MN_Init = "<init>";
    public static final String MN_Clinit = "<clinit>";

    public static boolean isPrimitive(Type type) {
        if (type.equals(Type.BOOLEAN_TYPE)) return true;
        else if (type.equals(Type.BYTE_TYPE)) return true;
        else if (type.equals(Type.SHORT_TYPE)) return true;
        else if (type.equals(Type.CHAR_TYPE)) return true;
        else if (type.equals(Type.INT_TYPE)) return true;
        else if (type.equals(Type.LONG_TYPE)) return true;
        else if (type.equals(Type.FLOAT_TYPE)) return true;
        else return type.equals(Type.DOUBLE_TYPE);
    }

    public static Type type(Object ob) {
        if (ob instanceof String) {
            String s = (String) ob;
            try {
                return Type.getType(s);
            } catch (Throwable t) {
                return Type.getObjectType(s);
            }
        } else if (ob instanceof Class) {
            return Type.getType((Class<?>) ob);
        } else if (ob instanceof Method) {
            return Type.getType((Method) ob);
        } else if (ob instanceof Constructor) {
            return Type.getType((Constructor<?>) ob);
        } else if (ob instanceof Type) {
            return (Type) ob;
        }
        throw new IllegalArgumentException("Unable to convert " + Types.asString(ob) + " into a type");
    }

    public static Type returnType(Object ob) {
        if (ob instanceof String) return Type.getReturnType((String) ob);
        else if (ob instanceof Method) return Type.getReturnType((Method) ob);
        else if (ob instanceof Type) return ((Type) ob).getReturnType();
        throw new IllegalArgumentException("Unable to get return type of " + Types.asString(ob));
    }

    public static Type[] argumentTypes(Object ob) {
        if (ob instanceof String) return Type.getArgumentTypes((String) ob);
        else if (ob instanceof Method) return Type.getArgumentTypes((Method) ob);
        throw new IllegalArgumentException("Unable to get argument types of " + ob);
    }

    public static String internalName(Object ob) {
        try {
            return Types.type(ob).getInternalName();
        } catch (Throwable t) {
            throw new IllegalArgumentException("Unable to get internal name of " + Types.asString(ob), t);
        }
    }

    public static String typeDescriptor(Object ob) {
        try {
            return Types.type(ob).getDescriptor();
        } catch (Throwable t) {
            throw new IllegalArgumentException("Unable to convert " + Types.asString(ob) + " into a descriptor", t);
        }
    }

    public static String methodDescriptor(Object returnType, Object... arguments) {
        if (returnType instanceof Method) {
            if (arguments.length != 0) throw new IllegalArgumentException("Expected arguments to be empty");
            return Type.getMethodDescriptor((Method) returnType);
        } else if (returnType instanceof Constructor) {
            if (arguments.length != 0) throw new IllegalArgumentException("Expected arguments to be empty");
            return Type.getConstructorDescriptor((Constructor<?>) returnType);
        }

        StringBuilder out = new StringBuilder("(");
        for (Object argument : arguments) out.append(Types.typeDescriptor(argument));
        out.append(")").append(Types.typeDescriptor(returnType));
        return out.toString();
    }

    private static String asString(Object ob) {
        if (ob == null) return "null";
        return ob.toString();
    }

}
