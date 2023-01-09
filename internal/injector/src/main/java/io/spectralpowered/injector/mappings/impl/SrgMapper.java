package io.spectralpowered.injector.mappings.impl;

import io.spectralpowered.injector.mappings.MapperConfig;
import io.spectralpowered.injector.mappings.AMapper;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SrgMapper extends AMapper {

    private static final String CLASS_LINE = "^CL: (\\S+) (\\S+)$";
    private static final String FIELD_LINE = "^FD: (\\S+)/(\\S+) (\\S+)/(\\S+)$";
    private static final String METHOD_LINE = "^MD: (\\S+)/(\\S+) (\\(\\S*\\)\\S+) (\\S+)/(\\S+) (\\(\\S*\\)\\S+)$";

    private final File mappingFile;

    public SrgMapper(MapperConfig config, File mappingFile) {
        super(config);

        this.mappingFile = mappingFile;
    }

    @Override
    protected void init() throws Throwable {
        for (String line : readLines(mappingFile)) {
            if (line.trim().isEmpty()) continue;

            String error = null;
            if (line.matches(SrgMapper.CLASS_LINE)) {
                Matcher m = Pattern.compile(SrgMapper.CLASS_LINE).matcher(line);
                if (m.find()) {
                    String obfName = m.group(1);
                    String deobfName = m.group(2);

                    remapper.addClassMapping(obfName, deobfName);
                } else {
                    error = "Could not parse class line: " + line;
                }
            } else if (line.matches(SrgMapper.FIELD_LINE)) {
                Matcher m = Pattern.compile(SrgMapper.FIELD_LINE).matcher(line);
                if (m.find()) {
                    String obfOwner = m.group(1);
                    String obfName = m.group(2);
                    String deobfName = m.group(4);

                    remapper.addFieldMapping(obfOwner, obfName, deobfName);
                } else {
                    error = "Could not parse field line: " + line;
                }
            } else if (line.matches(SrgMapper.METHOD_LINE)) {
                Matcher m = Pattern.compile(SrgMapper.METHOD_LINE).matcher(line);
                if (m.find()) {
                    String obfOwner = m.group(1);
                    String obfName = m.group(2);
                    String obfDesc = m.group(3);
                    String deobfName = m.group(5);

                    remapper.addMethodMapping(obfOwner, obfName, obfDesc, deobfName);
                } else {
                    error = "Could not parse method line: " + line;
                }
            } else {
                error = "Unknown line: " + line;
            }

            if (error != null) throw new IllegalStateException(error);
        }
    }

}
