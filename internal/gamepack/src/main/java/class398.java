public class class398 extends class480 {
   static int field3358;
   boolean field3359;
   byte field3354;
   byte field3355;
   byte field3356;
   byte field3357;
   // $FF: synthetic field
   final class182 this$0;

   class398(class182 var1) {
      this.this$0 = var1;
   }

   void method2367(class127 var1) {
      this.field3359 = var1.method547() == 1;
      this.field3357 = var1.method548();
      this.field3356 = var1.method548();
      this.field3355 = var1.method548();
      this.field3354 = var1.method548();
   }

   void method2368(class429 var1) {
      var1.field3550 = this.field3359;
      var1.field3551 = this.field3357;
      var1.field3552 = this.field3356;
      var1.field3555 = this.field3355;
      var1.field3553 = this.field3354;
   }

   public static void method1966() {
      class123.field1056.method395();
   }

   static int method1969(class2 var0, class2 var1, int var2, boolean var3, int var4, boolean var5) {
      int var7 = class342.method1741(var0, var1, var2, var3);
      if (var7 != 0) {
         return var3 ? -var7 : var7;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var8 = class342.method1741(var0, var1, var4, var5);
         return var5 ? -var8 : var8;
      }
   }

   static class344 method1968(boolean var0, boolean var1) {
      return var0 ? (var1 ? class359.field3058 : class306.field2455) : (var1 ? class359.field3080 : class23.field110);
   }

   static final int method1967(int var0, int var1) {
      int var3 = class450.method2238(var0 - 1, var1 - 1) + class450.method2238(var0 + 1, var1 - 1) + class450.method2238(var0 - 1, var1 + 1) + class450.method2238(var0 + 1, var1 + 1);
      int var4 = class450.method2238(var0 - 1, var1) + class450.method2238(var0 + 1, var1) + class450.method2238(var0, var1 - 1) + class450.method2238(var0, var1 + 1);
      int var5 = class450.method2238(var0, var1);
      return var3 / 16 + var4 / 8 + var5 / 4;
   }

   static final void method1970(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if (var6 < 0) {
         var7 = client.field491;
      } else if (var6 >= 100) {
         var7 = client.field263;
      } else {
         var7 = var6 * (client.field263 - client.field491) / 100 + client.field491;
      }

      int var8 = var7 * var3 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var18;
      if (var8 < client.field497) {
         var18 = client.field497;
         var7 = 334 * var2 * var18 / (var3 * 512);
         if (var7 > client.field496) {
            var7 = client.field496;
            var9 = 512 * var7 * var3 / (var18 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               class162.method758();
               class162.method749(var0, var1, var10, var3, -16777216);
               class162.method749(var2 + var0 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > client.field223) {
         var18 = client.field223;
         var7 = var18 * var2 * 334 / (var3 * 512);
         if (var7 < client.field403) {
            var7 = client.field403;
            var9 = 334 * var2 * var18 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if (var4) {
               class162.method758();
               class162.method749(var0, var1, var2, var10, -16777216);
               class162.method749(var0, var3 + var1 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      client.field503 = var7 * var3 / 334;
      if (client.field501 != var2 || var3 != client.field400) {
         int[] var19 = new int[9];

         for(var10 = 0; var10 < var19.length; ++var10) {
            int var11 = 128 + var10 * 32 + 15;
            int var12 = var11 * 3 + 600;
            int var14 = class341.field2726[var11];
            int var16 = var3 - 334;
            if (var16 < 0) {
               var16 = 0;
            } else if (var16 > 100) {
               var16 = 100;
            }

            int var17 = client.field493 + var16 * (client.field385 - client.field493) / 100;
            int var15 = var12 * var17 / 256;
            var19[var10] = var14 * var15 >> 16;
         }

         class318.method1585(var19, 500, 800, var2 * 334 / var3, 334);
      }

      client.field372 = var0;
      client.field500 = var1;
      client.field501 = var2;
      client.field400 = var3;
   }
}
