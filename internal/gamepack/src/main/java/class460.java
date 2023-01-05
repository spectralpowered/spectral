import java.io.IOException;

public class class460 {
   public static final class460 field3807 = new class460("verdana_15pt_regular");
   public static final class460 field3808 = new class460("p12_full");
   public static final class460 field3810 = new class460("verdana_11pt_regular");
   public static final class460 field3811 = new class460("verdana_13pt_regular");
   public static final class460 field3812 = new class460("p11_full");
   public static final class460 field3814 = new class460("b12_full");
   static class38 field3809;
   String field3813;

   class460(String var1) {
      this.field3813 = var1;
   }

   public static class460[] method2268() {
      return new class460[]{field3808, field3810, field3814, field3807, field3811, field3812};
   }

   static void method2266() {
      if (class359.field3066) {
         class119.field878 = null;
         class298.field2395 = null;
         class359.field3053 = null;
         class287.field2366 = null;
         class374.field3173 = null;
         class359.field3054 = null;
         class342.field2746 = null;
         class23.field110 = null;
         class306.field2455 = null;
         class290.field2370 = null;
         class161.field1229 = null;
         class340.field2721 = null;
         class247.field2058 = null;
         class122.field1054 = null;
         class312.field2467.method1959();
         class255.method1093(2);
         if (class462.field3844 != null) {
            try {
               class127 var1 = new class127(4);
               var1.method544(2);
               var1.method602(0);
               class462.field3844.method731(var1.field1072, 0, 4);
            } catch (IOException var4) {
               try {
                  class462.field3844.method734();
               } catch (Exception var3) {
                  ;
               }

               ++class462.field3833;
               class462.field3844 = null;
            }
         }

         class359.field3066 = false;
      }
   }

   static final void method2267(boolean var0) {
      client.method189();
      ++client.field279.field4045;
      if (client.field279.field4045 >= 50 || var0) {
         client.field279.field4045 = 0;
         if (!client.field281 && client.field279.method2384() != null) {
            class299 var2 = class480.method2370(class356.field3012, client.field279.field4042);
            client.field279.method2389(var2);

            try {
               client.field279.method2386();
            } catch (IOException var4) {
               client.field281 = true;
            }
         }

      }
   }

   static final String method2269(int var0) {
      String var2 = Integer.toString(var0);

      for(int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
         var2 = var2.substring(0, var3) + class442.field3659 + var2.substring(var3);
      }

      if (var2.length() > 9) {
         return " " + class238.method1032(65408) + var2.substring(0, var2.length() - 8) + class177.field1497 + " " + class442.field3658 + var2 + class442.field3662 + class442.field3665;
      } else {
         return var2.length() > 6 ? " " + class238.method1032(16777215) + var2.substring(0, var2.length() - 4) + class177.field1499 + " " + class442.field3658 + var2 + class442.field3662 + class442.field3665 : " " + class238.method1032(16776960) + var2 + class442.field3665;
      }
   }
}
