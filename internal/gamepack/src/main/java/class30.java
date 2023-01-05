public abstract class class30 extends class236 {
   boolean field234 = false;
   boolean field242 = false;
   boolean field254;
   boolean field267 = false;
   boolean field283;
   byte field239 = 0;
   byte field275;
   byte field287;
   byte field295;
   byte field298;
   class156[] field286 = new class156[10];
   class55 field296 = new class55();
   int field232 = 0;
   int field233;
   int field235 = -1;
   int field236 = 452450767;
   int field237;
   int field238 = -1;
   int field240;
   int field241 = -1;
   int field243 = -1;
   int field244 = -1;
   int field245 = -1;
   int field246 = -1;
   int field247;
   int field248 = -1;
   int field249 = -1;
   int field250 = -1;
   int field251;
   int field252 = -1;
   int field255 = -1790566807;
   int field256 = -1;
   int field257 = 0;
   int field259 = -1;
   int field265 = 0;
   int field266 = -1;
   int field268;
   int field269 = 0;
   int field270 = -1;
   int field271 = 0;
   int field272 = 0;
   int field273 = 0;
   int field274 = -1;
   int field276 = 0;
   int field277 = 0;
   int field278 = 0;
   int field279 = -1;
   int field280 = 0;
   int field281 = -1;
   int field282;
   int field284 = 0;
   int field285;
   int field288;
   int field289;
   int field290;
   int field291 = 0;
   int field292 = 200;
   int field293 = -560800595;
   int field294 = 0;
   int field297;
   int field299;
   int field300 = 0;
   int field301;
   int field302 = -1;
   int field303 = 100;
   int field304 = 32;
   int field305 = -1;
   int field307 = 0;
   int field308 = 1702343865;
   int[] field258 = new int[10];
   int[] field260 = new int[4];
   int[] field261 = new int[4];
   int[] field262 = new int[4];
   int[] field263 = new int[4];
   int[] field264 = new int[4];
   int[] field306 = new int[10];
   String field253 = null;

   final void method155() {
      this.field232 = 0;
      this.field307 = 0;
   }

   boolean method156() {
      return false;
   }

   final void method154(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if (this.field262[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if (var1 >= 0) {
         class399 var13 = class246.method1223(var1);
         var11 = var13.field3504;
         var12 = var13.field3492;
      }

      int var15;
      if (var9) {
         if (var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if (var11 == 0) {
            var15 = this.field262[0];
         } else if (var11 == 1) {
            var15 = this.field261[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if (var11 == 0) {
               if (this.field262[var14] < var15) {
                  var10 = var14;
                  var15 = this.field262[var14];
               }
            } else if (var11 == 1 && this.field261[var14] < var15) {
               var10 = var14;
               var15 = this.field261[var14];
            }
         }

         if (var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if (var8) {
            this.field239 = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.field239;
            this.field239 = (byte)((this.field239 + 1) % 4);
            if (this.field262[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if (var10 >= 0) {
         this.field260[var10] = var1;
         this.field261[var10] = var2;
         this.field263[var10] = var3;
         this.field264[var10] = var4;
         this.field262[var10] = var6 + var12 + var5;
      }
   }

   final void method157(int var1, int var2, int var3, int var4, int var5, int var6) {
      class5 var9 = (class5)class5.field19.method161((long)var1);
      class5 var8;
      if (null != var9) {
         var8 = var9;
      } else {
         byte[] var10 = class5.field24.method892(33, var1);
         var9 = new class5();
         if (null != var10) {
            var9.method17(new class134(var10));
         }

         class5.field19.method163(var9, (long)var1);
         var8 = var9;
      }

      var9 = var8;
      class44 var15 = null;
      class44 var11 = null;
      int var12 = var8.field21;
      int var13 = 0;

      class44 var14;
      for(var14 = (class44)this.field296.method327(); var14 != null; var14 = (class44)this.field296.method321()) {
         ++var13;
         if (var14.field376.field23 == var9.field23) {
            var14.method223(var2 + var4, var5, var6, var3);
            return;
         }

         if (var14.field376.field20 <= var9.field20) {
            var15 = var14;
         }

         if (var14.field376.field21 > var12) {
            var11 = var14;
            var12 = var14.field376.field21;
         }
      }

      if (var11 != null || var13 < 4) {
         var14 = new class44(var9);
         if (null == var15) {
            this.field296.method319(var14);
         } else {
            class55.method328(var14, var15);
         }

         var14.method223(var4 + var2, var5, var6, var3);
         if (var13 >= 4) {
            var11.method567();
         }

      }
   }

   final void method158(int var1) {
      class5 var4 = (class5)class5.field19.method161((long)var1);
      class5 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class5.field24.method892(33, var1);
         var4 = new class5();
         if (null != var5) {
            var4.method17(new class134(var5));
         }

         class5.field19.method163(var4, (long)var1);
         var3 = var4;
      }

      var4 = var3;

      for(class44 var6 = (class44)this.field296.method327(); var6 != null; var6 = (class44)this.field296.method321()) {
         if (var6.field376 == var4) {
            var6.method567();
            return;
         }
      }

   }

   public static int method159(int var0) {
      return class454.field3752[var0];
   }
}
