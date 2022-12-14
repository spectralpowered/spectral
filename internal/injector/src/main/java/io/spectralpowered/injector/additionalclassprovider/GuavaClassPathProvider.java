package io.spectralpowered.injector.additionalclassprovider;

import com.google.common.reflect.ClassPath;
import io.spectralpowered.injector.utils.tree.BasicClassProvider;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class GuavaClassPathProvider extends BasicClassProvider {

    private final ClassPath classPath;

    public GuavaClassPathProvider() {
        this(GuavaClassPathProvider.class.getClassLoader());
    }

    public GuavaClassPathProvider(ClassLoader classLoader) {
        super(classLoader);

        try {
            classPath = ClassPath.from(classLoader);
        } catch (Throwable t) {
            throw new RuntimeException("Failed to initialize ClassPath", t);
        }
    }

    @Override
    public Map<String, Supplier<byte[]>> getAllClasses() {
        Map<String, Supplier<byte[]>> map = new HashMap<>();
        for (ClassPath.ClassInfo classInfo : classPath.getAllClasses()) map.put(classInfo.getName(), () -> getClass(classInfo.getName()));
        return map;
    }

}
