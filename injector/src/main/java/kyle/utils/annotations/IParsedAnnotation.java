package kyle.utils.annotations;

import java.util.Map;

public interface IParsedAnnotation {

    Map<String, Object> getValues();

    boolean wasSet(final String name);

}
