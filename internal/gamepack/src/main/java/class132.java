import java.applet.Applet;
import java.net.URL;
import netscape.javascript.JSObject;

public class class132 extends class106 {
   static int field1477;
   int field1476;
   int field1478;
   int field1479;
   int field1480;

   class132(int var1, int var2, int var3, int var4) {
      this.field1479 = var1;
      this.field1478 = var2;
      this.field1476 = var3;
      this.field1480 = var4;
   }

   void method648(int var1, int var2, int var3, int var4) {
      this.field1479 = var1;
      this.field1478 = var2;
      this.field1476 = var3;
      this.field1480 = var4;
   }

   public static class120 method649(int var0) {
      class120 var2 = (class120)class120.field1434.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class120.field1433.method892(38, var0);
         var2 = new class120();
         if (var3 != null) {
            var2.method624(new class134(var3));
         }

         var2.method625();
         class120.field1434.method163(var2, (long)var0);
         return var2;
      }
   }

   static boolean method647(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class363.field3249.startsWith("win")) {
               throw new Exception();
            } else if (!var0.startsWith("http://") && !var0.startsWith("https://")) {
               throw new Exception();
            } else {
               String var13 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";

               for(int var14 = 0; var14 < var0.length(); ++var14) {
                  if (var13.indexOf(var0.charAt(var14)) == -1) {
                     throw new Exception();
                  }
               }

               Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var0 + "\"");
               return true;
            }
         } catch (Throwable var8) {
            return false;
         }
      } else if (var1 == 1) {
         try {
            Applet var5 = class363.field3248;
            Object[] var6 = new Object[]{(new URL(class363.field3248.getCodeBase(), var0)).toString()};
            Object var4 = JSObject.getWindow(var5).call(var2, var6);
            return var4 != null;
         } catch (Throwable var9) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class363.field3248.getAppletContext().showDocument(new URL(class363.field3248.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var10) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            class178.method937(class363.field3248, "loggedout");
         } catch (Throwable var12) {
            ;
         }

         try {
            class363.field3248.getAppletContext().showDocument(new URL(class363.field3248.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var11) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static int method650(int var0, class472 var1, boolean var2) {
      return 2;
   }
}
