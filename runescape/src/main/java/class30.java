import java.applet.Applet;
import netscape.javascript.JSObject;

public class class30 {
	class30() throws Throwable {
		throw new Error();
	}

	public static void method419(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	public static Object method420(Applet var0, String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, (Object[])null);
	}
}
