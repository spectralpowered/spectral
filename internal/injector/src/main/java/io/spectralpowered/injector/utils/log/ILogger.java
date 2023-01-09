package io.spectralpowered.injector.utils.log;

import java.util.Arrays;

public interface ILogger {

    void info(String message, Object... args);

    void warn(String message, Object... args);

    void error(String message, Object... args);


    default String format(String message, Object... args) {
        if (args.length == 0) return message;
        if (args[args.length - 1] instanceof Throwable) args = Arrays.copyOfRange(args, 0, args.length - 1);
        if (args.length == 0) return message;
        return String.format(message, args);
    }

}
