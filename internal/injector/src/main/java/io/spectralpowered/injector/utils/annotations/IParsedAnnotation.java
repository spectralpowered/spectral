package io.spectralpowered.injector.utils.annotations;

import java.util.Map;

public interface IParsedAnnotation {

    Map<String, Object> getValues();

    boolean wasSet(String name);

}
