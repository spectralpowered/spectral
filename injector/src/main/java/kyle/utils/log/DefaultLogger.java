package kyle.utils.log;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DefaultLogger implements ILogger {

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy mm:HH:ss");

    @Override
    public void info(String message, Object... args) {
        this.log(System.out, "INFO", message, args);
    }

    @Override
    public void warn(String message, Object... args) {
        this.log(System.err, "WARN", message, args);
    }

    @Override
    public void error(String message, Object... args) {
        this.log(System.err, "ERROR", message, args);
    }

    private void log(final PrintStream out, final String level, final String message, final Object... args) {
        out.print("[");
        out.print(this.dateFormat.format(System.currentTimeMillis()));
        out.print("] ");
        out.print(level.toUpperCase(Locale.ROOT));
        out.print(" - ");
        out.println(this.format(message, args));
        if (args.length > 0 && args[args.length - 1] instanceof Throwable) {
            Throwable t = (Throwable) args[args.length - 1];
            t.printStackTrace(out);
        }
    }

}