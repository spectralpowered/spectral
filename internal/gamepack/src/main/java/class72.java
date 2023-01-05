public class class72 extends class189 {
   static class161 field856;
   byte field855;
   int field854;
   // $FF: synthetic field
   final class105 this$0;

   class72(class105 var1) {
      this.this$0 = var1;
      this.field854 = -1;
   }

   void method979(class134 var1) {
      this.field854 = var1.method671();
      this.field855 = var1.method670();
   }

   void method980(class27 var1) {
      var1.method136(this.field854, this.field855);
   }

   public static void method401(class164 var0) {
      class218.field2419 = var0;
   }

   static int method403(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   static final boolean method398(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = class245.field2607 + var6;
      if (var8 < var0 && var8 < var1 && var8 < var2) {
         return false;
      } else {
         var8 = class245.field2607 - var6;
         if (var8 > var0 && var8 > var1 && var8 > var2) {
            return false;
         } else {
            var8 = var6 + class245.field2600;
            if (var8 < var3 && var8 < var4 && var8 < var5) {
               return false;
            } else {
               var8 = class245.field2600 - var6;
               return var8 <= var3 || var8 <= var4 || var8 <= var5;
            }
         }
      }
   }

   static int method404(int var0) {
      return class377.field3310[var0];
   }

   static void method402(int var0) {
      if (var0 != client.field433) {
         if (30 == client.field433) {
            client.field489.method1942();
         }

         if (0 == client.field433) {
            class140.field1508.method759();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            class384.method1822(0);
            client.field565 = 0;
            client.field458 = 0;
            client.field429.method1205(var0);
            if (var0 != 20) {
               class240.method1215(false);
            }
         }

         if (var0 != 20 && var0 != 40 && class18.field139 != null) {
            class18.field139.method2054();
            class18.field139 = null;
         }

         if (25 == client.field433) {
            client.field575 = 0;
            client.field518 = 0;
            client.field672 = 1;
            client.field703 = 0;
            client.field491 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var4 = 11 == client.field433 ? 4 : 0;
               class254.method1237(class278.field2760, class280.field2767, false, var4);
            } else if (var0 == 11) {
               class254.method1237(class278.field2760, class280.field2767, false, 4);
            } else if (var0 == 50) {
               class20.method113("", "Updating date of birth...", "");
               class254.method1237(class278.field2760, class280.field2767, false, 7);
            } else {
               class39.method215();
            }
         } else {
            boolean var2 = class111.field1385.method1324() >= client.field428;
            int var3 = var2 ? 0 : 12;
            class254.method1237(class278.field2760, class280.field2767, true, var3);
         }

         client.field433 = var0;
      }
   }
}
