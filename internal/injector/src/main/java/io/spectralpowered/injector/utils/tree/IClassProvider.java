package io.spectralpowered.injector.utils.tree;

import java.util.Map;
import java.util.function.Supplier;

public interface IClassProvider {

    /**
     * Get the bytecode of a class<br>
     * Class name is with '.' instead of '/'
     *
     * @param name The name of the class
     * @return The bytecode of the class
     */
    byte[] getClass(String name);

    /**
     * Only needed when registering transformer with wildcard<br>
     * Class names need to be with '.' instead of '/'<br>
     * e.g. package.name
     *
     * @return A map of all class names to their bytecode
     */
    Map<String, Supplier<byte[]>> getAllClasses();

}
