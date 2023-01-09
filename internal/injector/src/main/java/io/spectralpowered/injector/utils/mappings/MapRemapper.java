package io.spectralpowered.injector.utils.mappings;

import org.objectweb.asm.commons.Remapper;

import java.util.*;

public class MapRemapper extends Remapper {

    private final Map<String, String> mappings;
    private MapRemapper reverse;

    public MapRemapper() {
        this(new HashMap<>());
    }

    public MapRemapper(String oldName, String newName) {
        this();
        mappings.put(oldName, newName);
    }

    public MapRemapper(Map<String, String> mappings) {
        this.mappings = mappings;
    }

    public Map<String, String> getMappings() {
        return Collections.unmodifiableMap(mappings);
    }

    public void addClassMapping(String from, String to) {
        addClassMapping(from, to, false);
    }

    public void addClassMapping(String from, String to, boolean skipIfExists) {
        if (skipIfExists && mappings.containsKey(from)) return;
        mappings.put(from, to);

        if (reverse != null) {
            reverse.reverse = null;
            reverse = null;
        }
    }

    public void addMethodMapping(String owner, String name, String desc, String target) {
        addMethodMapping(owner, name, desc, target, false);
    }

    public void addMethodMapping(String owner, String name, String desc, String target, boolean skipIfExists) {
        String key = owner + "." + name + desc;
        if (skipIfExists && mappings.containsKey(key)) return;
        mappings.put(key, target);

        if (reverse != null) {
            reverse.reverse = null;
            reverse = null;
        }
    }

    public void addFieldMapping(String owner, String name, String target) {
        addFieldMapping(owner, name, "", target, false);
    }

    public void addFieldMapping(String owner, String name, String target, boolean skipIfExists) {
        addFieldMapping(owner, name, "", target, skipIfExists);
    }

    public void addFieldMapping(String owner, String name, String desc, String target) {
        addFieldMapping(owner, name, desc, target, false);
    }

    public void addFieldMapping(String owner, String name, String desc, String target, boolean skipIfExists) {
        String key = owner + "." + name + ":" + desc;
        if (skipIfExists && mappings.containsKey(key)) return;
        mappings.put(key, target);

        if (reverse != null) {
            reverse.reverse = null;
            reverse = null;
        }
    }

    public List<String> getStartingMappings(String... starts) {
        List<String> mappings = new ArrayList<>();
        for (String mapping : this.mappings.keySet()) {
            for (String start : starts) {
                if (mapping.startsWith(start)) mappings.add(mapping);
            }
        }
        return mappings;
    }

    public boolean isEmpty() {
        return mappings.isEmpty();
    }

    public void copy(MapRemapper remapper) {
        mappings.putAll(remapper.mappings);
    }


    @Override
    public String mapMethodName(String owner, String name, String descriptor) {
        String remappedName = map(owner + '.' + name + descriptor);
        return remappedName == null ? name : remappedName;
    }

    @Override
    public String mapInvokeDynamicMethodName(String name, String descriptor) {
        String remappedName = map('.' + name + descriptor);
        return remappedName == null ? name : remappedName;
    }

    @Override
    public String mapAnnotationAttributeName(String descriptor, String name) {
        String remappedName = map(descriptor + '.' + name);
        return remappedName == null ? name : remappedName;
    }

    @Override
    public String mapFieldName(String owner, String name, String descriptor) {
        String remappedName = map(owner + '.' + name + ':' + descriptor);
        if (remappedName == null) remappedName = map(owner + '.' + name + ":");
        return remappedName == null ? name : remappedName;
    }

    @Override
    public String map(String key) {
        return mappings.get(key);
    }

    public String mapSafe(String key) {
        return mappings.getOrDefault(key, key);
    }


    public MapRemapper reverse() {
        if (reverse != null) return reverse;
        MapRemapper reverseRemapper = new MapRemapper();
        for (Map.Entry<String, String> entry : mappings.entrySet()) {
            if (entry.getKey().contains(".")) continue;
            reverseRemapper.addClassMapping(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, String> entry : mappings.entrySet()) {
            if (!entry.getKey().contains(".")) continue;
            if (entry.getKey().contains(":")) {
                String fieldMapping = entry.getKey();
                String owner = fieldMapping.substring(0, fieldMapping.indexOf("."));
                String name = fieldMapping.substring(fieldMapping.indexOf(".") + 1, fieldMapping.indexOf(":"));
                String desc = fieldMapping.substring(fieldMapping.indexOf(":") + 1);
                String mappedName = entry.getValue();

                if (desc.isEmpty()) reverseRemapper.addFieldMapping(mapSafe(owner), mappedName, name);
                else reverseRemapper.addFieldMapping(mapSafe(owner), mappedName, mapDesc(desc), name);
            } else {
                String methodMapping = entry.getKey();
                String owner = methodMapping.substring(0, methodMapping.indexOf("."));
                String name = methodMapping.substring(methodMapping.indexOf(".") + 1, methodMapping.indexOf("("));
                String desc = methodMapping.substring(methodMapping.indexOf("("));
                String mappedName = entry.getValue();

                reverseRemapper.addMethodMapping(mapSafe(owner), mappedName, mapMethodDesc(desc), name);
            }
        }
        reverseRemapper.reverse = this;
        return reverse = reverseRemapper;
    }

}
