import java.io.IOException;

public class class39 {
   public static final class39 field364 = new class39("verdana_15pt_regular");
   public static final class39 field365 = new class39("p12_full");
   public static final class39 field367 = new class39("verdana_11pt_regular");
   public static final class39 field368 = new class39("verdana_13pt_regular");
   public static final class39 field369 = new class39("p11_full");
   public static final class39 field371 = new class39("b12_full");
   static class230 field366;
   String field370;

   class39(String var1) {
      this.field370 = var1;
   }

   public static class39[] method217() {
      return new class39[]{field365, field367, field371, field364, field368, field369};
   }

   static void method215() {
      if (class52.field771) {
         class83.field951 = null;
         class405.field3530 = null;
         class52.field758 = null;
         class335.field3107 = null;
         class328.field3060 = null;
         class52.field759 = null;
         class329.field3068 = null;
         class133.field1485 = null;
         class137.field1495 = null;
         class302.field2891 = null;
         class188.field1991 = null;
         class344.field3160 = null;
         class155.field1618 = null;
         class356.field3196 = null;
         class381.field3327.method1411();
         class473.method2289(2);
         if (class475.field3962 != null) {
            try {
               class134 var1 = new class134(4);
               var1.method666(2);
               var1.method724(0);
               class475.field3962.method2051(var1.field1489, 0, 4);
            } catch (IOException var4) {
               try {
                  class475.field3962.method2054();
               } catch (Exception var3) {
                  ;
               }

               ++class475.field3951;
               class475.field3962 = null;
            }
         }

         class52.field771 = false;
      }
   }

   static final void method216(boolean var0) {
      client.method281();
      ++client.field483.field3462;
      if (client.field483.field3462 >= 50 || var0) {
         client.field483.field3462 = 0;
         if (!client.field485 && client.field483.method1915() != null) {
            class81 var2 = class189.method982(class165.field1798, client.field483.field3459);
            client.field483.method1920(var2);

            try {
               client.field483.method1917();
            } catch (IOException var4) {
               client.field485 = true;
            }
         }

      }
   }

   static final String method218(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + class389.field3431 + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + class334.method1616(65408) + var2.substring(0, var2.length() - 8) + class96.field1192 + " " + class389.field3430 + var2 + class389.field3434 + class389.field3437;
      } else {
         return var2.length() > 6 ? " " + class334.method1616(16777215) + var2.substring(0, var2.length() - 4) + class96.field1194 + " " + class389.field3430 + var2 + class389.field3434 + class389.field3437 : " " + class334.method1616(16776960) + var2 + class389.field3437;
      }
   }
}
