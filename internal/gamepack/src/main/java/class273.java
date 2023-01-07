import io.spectralpowered.ObfInfo;
import java.applet.Applet;
import netscape.js.JSObject;

@ObfInfo(
	name = "ad"
)
public class class273 {
	@ObfInfo(
		owner = "ad",
		name = "h",
		desc = "(Ljava/applet/Applet;Ljava/lang/String;I)V"
	)
	public static void method1338(Applet var0, String var1) throws Throwable {
		JSObject.getWindow(var0).eval(var1);
	}

	@ObfInfo(
		owner = "ad",
		name = "e",
		desc = "(Ljava/applet/Applet;Ljava/lang/String;B)Ljava/lang/Object;"
	)
	public static Object method1339(Applet var0, String var1) throws Throwable {
		return JSObject.getWindow(var0).call(var1, (Object[])null);
	}
}
