import netscape.js.JSObject;

import java.applet.Applet;
import java.net.URL;

public class class121 extends class139 {
   static int field1046;
   int field1045;
   int field1047;
   int field1048;
   int field1049;

   class121(int var1, int var2, int var3, int var4) {
      this.field1048 = var1;
      this.field1047 = var2;
      this.field1045 = var3;
      this.field1049 = var4;
   }

   void method514(int var1, int var2, int var3, int var4) {
      this.field1048 = var1;
      this.field1047 = var2;
      this.field1045 = var3;
      this.field1049 = var4;
   }

   public static class11 method515(int var0) {
      class11 var2 = (class11)class11.field60.method394((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class11.field59.method1365(38, var0);
         var2 = new class11();
         if (var3 != null) {
            var2.method63(new class127(var3));
         }

         var2.method64();
         class11.field60.method396(var2, (long)var0);
         return var2;
      }
   }

   static boolean method513(String var0, int var1, String var2) {
      if (var1 == 0) {
         try {
            if (!class128.field1074.startsWith("win")) {
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
            Applet var5 = class128.field1073;
            Object[] var6 = new Object[]{(new URL(class128.field1073.getCodeBase(), var0)).toString()};
            Object var4 = JSObject.getWindow(var5).call(var2, var6);
            return var4 != null;
         } catch (Throwable var9) {
            return false;
         }
      } else if (var1 == 2) {
         try {
            class128.field1073.getAppletContext().showDocument(new URL(class128.field1073.getCodeBase(), var0), "_blank");
            return true;
         } catch (Exception var10) {
            return false;
         }
      } else if (var1 == 3) {
         try {
            class273.method1339(class128.field1073, "loggedout");
         } catch (Throwable var12) {
            ;
         }

         try {
            class128.field1073.getAppletContext().showDocument(new URL(class128.field1073.getCodeBase(), var0), "_top");
            return true;
         } catch (Exception var11) {
            return false;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   static int method516(int var0, class461 var1, boolean var2) {
      return 2;
   }
}
