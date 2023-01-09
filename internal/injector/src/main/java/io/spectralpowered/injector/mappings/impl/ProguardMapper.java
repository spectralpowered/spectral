package io.spectralpowered.injector.mappings.impl;

import io.spectralpowered.injector.mappings.MapperConfig;
import io.spectralpowered.injector.mappings.AMapper;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static io.spectralpowered.injector.utils.ASMUtils.slash;

public class ProguardMapper extends AMapper {

    private static final String CLASS_LINE = "^([^ ]+) ?-> ?([^ ]+):$";
    private static final String METHOD_LINE = "^ {4}(\\d+:|)+([^ ]+) ([^ ()]+)(\\([^ ()]*\\))(:\\d+|)+ ?-> ?(.+)$";
    private static final String FIELD_LINE = "^ {4}([^ ]+) ([^ (]+) ?-> ?(.+)$";

    private final File mappingFile;

    public ProguardMapper(MapperConfig config, File mappingFile) {
        super(config);
        this.mappingFile = mappingFile;
    }

    @Override
    protected void init() throws Throwable {
        String currentClass = null;
        for (String line : readLines(mappingFile)) {
            if (line.trim().isEmpty() || line.startsWith("#")) continue;

            String error = null;
            if (line.matches(ProguardMapper.CLASS_LINE)) {
                Matcher m = Pattern.compile(ProguardMapper.CLASS_LINE).matcher(line);
                if (m.find()) {
                    currentClass = slash(m.group(1));
                    String newName = slash(m.group(2));

                    if (currentClass.equals(newName)) continue;
                    remapper.addClassMapping(currentClass, newName);
                } else {
                    error = "Could not parse class line: " + line;
                }
            } else if (line.matches(ProguardMapper.METHOD_LINE)) {
                if (currentClass == null) {
                    error = "Method line without class: " + line;
                } else {
                    Matcher m = Pattern.compile(ProguardMapper.METHOD_LINE).matcher(line);
                    if (m.find()) {
                        String returnType = typeToInternal(m.group(2));
                        String name = m.group(3);
                        String descriptor = descriptorToInternal(m.group(4));
                        String newName = m.group(6);

                        if (name.equals(newName)) continue;
                        remapper.addMethodMapping(currentClass, name, descriptor + returnType, newName);
                    } else {
                        error = "Could not parse method line: " + line;
                    }
                }
            } else if (line.matches(ProguardMapper.FIELD_LINE)) {
                if (currentClass == null) {
                    error = "Field line without class: " + line;
                } else {
                    Matcher m = Pattern.compile(ProguardMapper.FIELD_LINE).matcher(line);
                    if (m.find()) {
                        String descriptor = typeToInternal(m.group(1));
                        String name = m.group(2);
                        String newName = m.group(3);

                        if (name.equals(newName)) continue;
                        remapper.addFieldMapping(currentClass, name, descriptor, newName);
                    } else {
                        error = "Could not parse field line: " + line;
                    }
                }
            } else {
                error = "Unknown line: " + line;
            }

            if (error != null) throw new IllegalStateException(error);
        }
    }

    private String typeToInternal(String type) {
        String arrayCount = "";
        while (type.endsWith("[]")) {
            arrayCount += "[";
            type = type.substring(0, type.length() - 2);
        }

        switch (type) {
            case "int":
                return arrayCount + "I";

            case "float":
                return arrayCount + "F";

            case "double":
                return arrayCount + "D";

            case "long":
                return arrayCount + "J";

            case "boolean":
                return arrayCount + "Z";

            case "short":
                return arrayCount + "S";

            case "byte":
                return arrayCount + "B";

            case "void":
                return arrayCount + "V";

            default:
                return arrayCount + "L" + slash(type) + ";";
        }
    }

    private String descriptorToInternal(String descriptor) {
        descriptor = descriptor.substring(1, descriptor.length() - 1);
        if (descriptor.isEmpty()) return "()";

        String[] parts = descriptor.split(",");
        String out = "";
        for (String part : parts) out += typeToInternal(part);
        return "(" + out + ")";
    }

}
