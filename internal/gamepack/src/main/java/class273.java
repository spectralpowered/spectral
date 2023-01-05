import java.applet.Applet;
import netscape.js.JSObject;

public class class273 {
   public static void method1338(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object method1339(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }
}
