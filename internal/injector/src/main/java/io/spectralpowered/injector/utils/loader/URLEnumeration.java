package io.spectralpowered.injector.utils.loader;

import java.net.URL;
import java.util.Enumeration;
import java.util.NoSuchElementException;

class URLEnumeration implements Enumeration<URL> {

    private final URL[] values;

    private int index;

    URLEnumeration(URL... values) {
        this.values = values;
    }

    @Override
    public boolean hasMoreElements() {
        return index < values.length;
    }

    @Override
    public URL nextElement() {
        if (!hasMoreElements()) throw new NoSuchElementException();
        return values[index++];
    }

}
