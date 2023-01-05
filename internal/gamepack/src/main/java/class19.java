public class class19 extends class106 {
   int field146;
   public byte[] field144;
   public class230 field143;
   public class416 field145;

   static boolean method107(class421 var0, int var1) {
      int var3 = var0.method2024(2);
      int var4;
      int var5;
      int var8;
      int var9;
      int var10;
      int var11;
      if (var3 == 0) {
         if (var0.method2024(1) != 0) {
            method107(var0, var1);
         }

         var4 = var0.method2024(13);
         var5 = var0.method2024(13);
         boolean var12 = var0.method2024(1) == 1;
         if (var12) {
            class25.field186[++class25.field182 - 1] = var1;
         }

         if (null != client.field551[var1]) {
            throw new RuntimeException();
         } else {
            class47 var13 = client.field551[var1] = new class47();
            var13.field409 = var1;
            if (null != class25.field177[var1]) {
               var13.method250(class25.field177[var1]);
            }

            var13.field299 = class25.field183[var1];
            var13.field266 = class25.field185[var1];
            var8 = class25.field178[var1];
            var9 = var8 >> 28;
            var10 = var8 >> 14 & 255;
            var11 = var8 & 255;
            var13.field286[0] = class25.field184[var1];
            var13.field408 = (byte)var9;
            var13.method247(var4 + (var10 << 13) - class381.field3325, var5 + (var11 << 13) - class345.field3166);
            var13.field399 = false;
            return true;
         }
      } else if (var3 == 1) {
         var4 = var0.method2024(2);
         var5 = class25.field178[var1];
         class25.field178[var1] = (var5 & 268435455) + ((var4 + (var5 >> 28) & 3) << 28);
         return false;
      } else {
         int var6;
         int var7;
         if (var3 == 2) {
            var4 = var0.method2024(5);
            var5 = var4 >> 3;
            var6 = var4 & 7;
            var7 = class25.field178[var1];
            var8 = (var7 >> 28) + var5 & 3;
            var9 = var7 >> 14 & 255;
            var10 = var7 & 255;
            if (var6 == 0) {
               --var9;
               --var10;
            }

            if (var6 == 1) {
               --var10;
            }

            if (var6 == 2) {
               ++var9;
               --var10;
            }

            if (var6 == 3) {
               --var9;
            }

            if (var6 == 4) {
               ++var9;
            }

            if (var6 == 5) {
               --var9;
               ++var10;
            }

            if (var6 == 6) {
               ++var10;
            }

            if (var6 == 7) {
               ++var9;
               ++var10;
            }

            class25.field178[var1] = var10 + (var9 << 14) + (var8 << 28);
            return false;
         } else {
            var4 = var0.method2024(18);
            var5 = var4 >> 16;
            var6 = var4 >> 8 & 255;
            var7 = var4 & 255;
            var8 = class25.field178[var1];
            var9 = (var8 >> 28) + var5 & 3;
            var10 = (var8 >> 14) + var6 & 255;
            var11 = var7 + var8 & 255;
            class25.field178[var1] = (var9 << 28) + (var10 << 14) + var11;
            return false;
         }
      }
   }
}
