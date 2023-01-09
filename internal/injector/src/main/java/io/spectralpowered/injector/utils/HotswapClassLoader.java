package io.spectralpowered.injector.utils;

import io.spectralpowered.injector.utils.log.ILogger;
import io.spectralpowered.injector.utils.tree.IClassProvider;

import java.util.HashMap;
import java.util.Map;

public class HotswapClassLoader extends ClassLoader {

    private final IClassProvider classProvider;
    private final ILogger logger;
    private final Map<String, byte[]> hotswapClasses;

    public HotswapClassLoader(IClassProvider classProvider, ILogger logger) {
        ClassLoader.registerAsParallelCapable();

        this.classProvider = classProvider;
        this.logger = logger;
        hotswapClasses = new HashMap<>();
    }

    public byte[] getHotswapClass(String name) {
        return hotswapClasses.computeIfAbsent(name, n -> ASMUtils.toBytes(ASMUtils.createEmptyClass(n), classProvider));
    }

    public void defineHotswapClass(String name) {
        if (hotswapClasses.containsKey(name)) return;
        try {
            byte[] classBytes = getHotswapClass(name);
            Class<?> clazz = defineClass(name, classBytes, 0, classBytes.length);
            clazz.getDeclaredConstructor().newInstance(); //Initialize the class
        } catch (Throwable t) {
            logger.warn("Failed to define hotswap class '%s'. Hotswapping will not work for this transformer", name, t);
        }
    }

}
