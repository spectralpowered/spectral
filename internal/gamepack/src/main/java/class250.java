public class class250 extends class189 {
   static int field2621;
   boolean field2622;
   byte field2617;
   byte field2618;
   byte field2619;
   byte field2620;
   // $FF: synthetic field
   final class105 this$0;

   class250(class105 var1) {
      this.this$0 = var1;
   }

   void method979(class134 var1) {
      this.field2622 = var1.method669() == 1;
      this.field2620 = var1.method670();
      this.field2619 = var1.method670();
      this.field2618 = var1.method670();
      this.field2617 = var1.method670();
   }

   void method980(class27 var1) {
      var1.field206 = this.field2622;
      var1.field207 = this.field2620;
      var1.field208 = this.field2619;
      var1.field211 = this.field2618;
      var1.field209 = this.field2617;
   }

   public static void method1229() {
      class295.field2824.method162();
   }

   static int method1232(class296 var0, class296 var1, int var2, boolean var3, int var4, boolean var5) {
      int var7 = class329.method1597(var0, var1, var2, var3);
      if (var7 != 0) {
         return var3 ? -var7 : var7;
      } else if (var4 == -1) {
         return 0;
      } else {
         int var8 = class329.method1597(var0, var1, var4, var5);
         return var5 ? -var8 : var8;
      }
   }

   static class161 method1231(boolean var0, boolean var1) {
      return var0 ? (var1 ? class52.field763 : class137.field1495) : (var1 ? class52.field785 : class133.field1485);
   }

   static final int method1230(int var0, int var1) {
      int var3 = class153.method800(var0 - 1, var1 - 1) + class153.method800(var0 + 1, var1 - 1) + class153.method800(var0 - 1, var1 + 1) + class153.method800(var0 + 1, var1 + 1);
      int var4 = class153.method800(var0 - 1, var1) + class153.method800(var0 + 1, var1) + class153.method800(var0, var1 - 1) + class153.method800(var0, var1 + 1);
      int var5 = class153.method800(var0, var1);
      return var3 / 16 + var4 / 8 + var5 / 4;
   }

   static final void method1233(int var0, int var1, int var2, int var3, boolean var4) {
      if (var2 < 1) {
         var2 = 1;
      }

      if (var3 < 1) {
         var3 = 1;
      }

      int var6 = var3 - 334;
      int var7;
      if (var6 < 0) {
         var7 = client.field695;
      } else if (var6 >= 100) {
         var7 = client.field467;
      } else {
         var7 = var6 * (client.field467 - client.field695) / 100 + client.field695;
      }

      int var8 = var7 * var3 * 512 / (var2 * 334);
      int var9;
      int var10;
      short var18;
      if (var8 < client.field701) {
         var18 = client.field701;
         var7 = 334 * var2 * var18 / (var3 * 512);
         if (var7 > client.field700) {
            var7 = client.field700;
            var9 = 512 * var7 * var3 / (var18 * 334);
            var10 = (var2 - var9) / 2;
            if (var4) {
               class362.method1748();
               class362.method1739(var0, var1, var10, var3, -16777216);
               class362.method1739(var2 + var0 - var10, var1, var10, var3, -16777216);
            }

            var0 += var10;
            var2 -= var10 * 2;
         }
      } else if (var8 > client.field427) {
         var18 = client.field427;
         var7 = var18 * var2 * 334 / (var3 * 512);
         if (var7 < client.field607) {
            var7 = client.field607;
            var9 = 334 * var2 * var18 / (var7 * 512);
            var10 = (var3 - var9) / 2;
            if (var4) {
               class362.method1748();
               class362.method1739(var0, var1, var2, var10, -16777216);
               class362.method1739(var0, var3 + var1 - var10, var2, var10, -16777216);
            }

            var1 += var10;
            var3 -= var10 * 2;
         }
      }

      client.field707 = var7 * var3 / 334;
      if (client.field705 != var2 || var3 != client.field604) {
         int[] var19 = new int[9];

         for(var10 = 0; var10 < var19.length; ++var10) {
            int var11 = 128 + var10 * 32 + 15;
            int var12 = var11 * 3 + 600;
            int var14 = class234.field2526[var11];
            int var16 = var3 - 334;
            if (var16 < 0) {
               var16 = 0;
            } else if (var16 > 100) {
               var16 = 100;
            }

            int var17 = client.field697 + var16 * (client.field589 - client.field697) / 100;
            int var15 = var12 * var17 / 256;
            var19[var10] = var14 * var15 >> 16;
         }

         class12.method55(var19, 500, 800, var2 * 334 / var3, 334);
      }

      client.field576 = var0;
      client.field704 = var1;
      client.field705 = var2;
      client.field604 = var3;
   }
}
