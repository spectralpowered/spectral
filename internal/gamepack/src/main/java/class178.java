import java.applet.Applet;
import netscape.javascript.JSObject;

public class class178 {
   public static void method936(Applet var0, String var1) throws Throwable {
      JSObject.getWindow(var0).eval(var1);
   }

   public static Object method937(Applet var0, String var1) throws Throwable {
      return JSObject.getWindow(var0).call(var1, (Object[])null);
   }
}
