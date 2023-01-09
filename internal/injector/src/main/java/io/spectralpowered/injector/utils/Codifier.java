package io.spectralpowered.injector.utils;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;

import java.util.ArrayList;
import java.util.List;

public class Codifier {

    public static Codifier get() {
        return new Codifier();
    }

    public static Codifier of(MethodNode method) {
        return get()
                .access(method.access)
                .returnType(Type.getReturnType(method.desc))
                .name(method.name)
                .params(Type.getArgumentTypes(method.desc))
                .exceptions(method.exceptions == null ? new Type[0] : method.exceptions.stream().map(Type::getObjectType).toArray(Type[]::new))
                ;
    }


    private String access = "";
    private String returnType = "";
    private String name = "";
    private final List<String> parameters = new ArrayList<>();
    private final List<String> exceptions = new ArrayList<>();
    private String body = "";

    private Codifier() {
    }

    public Codifier access(int access) {
        boolean isPublic = (access & Opcodes.ACC_PUBLIC) != 0;
        boolean isPrivate = (access & Opcodes.ACC_PRIVATE) != 0;
        boolean isProtected = (access & Opcodes.ACC_PROTECTED) != 0;
        boolean isStatic = (access & Opcodes.ACC_STATIC) != 0;

        this.access = "";
        if (isPublic) this.access += "public";
        else if (isPrivate) this.access += "private";
        else if (isProtected) this.access += "protected";
        if (isStatic) this.access += (this.access.isEmpty() ? "" : " ") + "static";
        return this;
    }

    public Codifier returnType(Type returnType) {
        this.returnType = returnType.getClassName();
        if (this.returnType.contains(".")) this.returnType = stripPackage(this.returnType);
        return this;
    }

    public Codifier name(String name) {
        this.name = name;
        return this;
    }

    public Codifier param(Type parameter) {
        if (parameter == null) {
            parameters.clear();
            return this;
        }

        String className = stripPackage(parameter.getClassName());
        if (isJavaKeyword(className)) className += " " + className.charAt(0);
        else className += " " + className.substring(0, 1).toLowerCase() + className.substring(1);
        parameters.add(className);
        return this;
    }

    public Codifier params(Type... parameters) {
        for (Type type : parameters) param(type);
        return this;
    }

    public Codifier exception(Type exception) {
        if (exception == null) {
            exceptions.clear();
            return this;
        }

        exceptions.add(stripPackage(exception.getClassName()));
        return this;
    }

    public Codifier exceptions(Type... exceptions) {
        for (Type type : exceptions) exception(type);
        return this;
    }

    public Codifier body(String body) {
        this.body = body;
        return this;
    }

    public String build() {
        StringBuilder out = new StringBuilder();
        if (!access.isEmpty()) out.append(access).append(" ");
        if (!returnType.isEmpty()) out.append(returnType).append(" ");
        if (!name.isEmpty()) out.append(name).append("(").append(String.join(", ", parameters)).append(")");
        if (!exceptions.isEmpty()) out.append(" throws ").append(String.join(", ", exceptions));
        if (!body.isEmpty()) out.append(" ").append(body);
        return out.toString().trim();
    }


    private String stripPackage(String className) {
        if (className.contains(".")) return className.substring(className.lastIndexOf(".") + 1);
        return className;
    }

    private boolean isJavaKeyword(String s) {
        return s.equals("abstract") || s.equals("assert") || s.equals("boolean") || s.equals("break") || s.equals("byte") || s.equals("case") || s.equals("catch") || s.equals("char") || s.equals("class") || s.equals("const") || s.equals("continue") || s.equals("default") || s.equals("do") || s.equals("double") || s.equals("else") || s.equals("enum") || s.equals("extends") || s.equals("final") || s.equals("finally") || s.equals("float") || s.equals("for") || s.equals("goto") || s.equals("if") || s.equals("implements") || s.equals("import") || s.equals("instanceof") || s.equals("int") || s.equals("interface") || s.equals("long") || s.equals("native") || s.equals("new") || s.equals("package") || s.equals("private") || s.equals("protected") || s.equals("public") || s.equals("return") || s.equals("short") || s.equals("static") || s.equals("strictfp") || s.equals("super") || s.equals("switch") || s.equals("synchronized") || s.equals("this") || s.equals("throw") || s.equals("throws") || s.equals("transient") || s.equals("try") || s.equals("void") || s.equals("volatile") || s.equals("while");
    }

}
