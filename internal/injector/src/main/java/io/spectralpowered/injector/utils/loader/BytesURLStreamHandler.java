package io.spectralpowered.injector.utils.loader;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

class BytesURLStreamHandler extends URLStreamHandler {

    private final byte[] bytes;

    BytesURLStreamHandler(byte[] bytes) {
        this.bytes = bytes;
    }

    @Override
    protected URLConnection openConnection(URL url) throws IOException {
        return new BytesURLConnection(url, bytes);
    }

}
