public class class222 {
   boolean field1908 = false;
   class274 field1909;
   int field1911 = 0;
   String field1910;

   class222(class274 var1) {
      this.field1909 = var1;
   }

   void method983(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         if (var1 != this.field1910) {
            this.field1910 = var1;
            this.field1911 = 0;
            this.field1908 = false;
            this.method985();
         }
      }
   }

   int method985() {
      if (this.field1911 < 33) {
         if (!this.field1909.method1358(class430.field3569.field3571, this.field1910)) {
            return this.field1911;
         }

         this.field1911 = 33;
      }

      if (33 == this.field1911) {
         if (this.field1909.method1362(class430.field3572.field3571, this.field1910) && !this.field1909.method1358(class430.field3572.field3571, this.field1910)) {
            return this.field1911;
         }

         this.field1911 = 66;
      }

      if (66 == this.field1911) {
         if (!this.field1909.method1358(this.field1910, class430.field3568.field3571)) {
            return this.field1911;
         }

         this.field1911 = 100;
         this.field1908 = true;
      }

      return this.field1911;
   }

   boolean method984() {
      return this.field1908;
   }

   int method982() {
      return this.field1911;
   }

   public static int method986(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var8 = 0.0F;

      for(int var9 = 0; var9 < var1 + 1; ++var9) {
         var8 += Math.abs(var0[var9]);
      }

      float var22 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class186.field1694;
      if (var8 <= var22) {
         return -1;
      } else {
         float[] var10 = new float[var1 + 1];

         int var11;
         for(var11 = 0; var11 < var1 + 1; ++var11) {
            var10[var11] = 1.0F / var8 * var0[var11];
         }

         while(Math.abs(var10[var1]) < var22) {
            --var1;
         }

         var11 = 0;
         if (var1 == 0) {
            return var11;
         } else if (var1 == 1) {
            var6[0] = -var10[0] / var10[1];
            boolean var23 = var3 ? var2 < var22 + var6[0] : var2 < var6[0] - var22;
            boolean var24 = var5 ? var4 > var6[0] - var22 : var4 > var22 + var6[0];
            var11 = var23 && var24 ? 1 : 0;
            if (var11 > 0) {
               if (var3 && var6[0] < var2) {
                  var6[0] = var2;
               } else if (var5 && var6[0] > var4) {
                  var6[0] = var4;
               }
            }

            return var11;
         } else {
            class322 var12 = new class322(var10, var1);
            float[] var13 = new float[var1 + 1];

            for(int var14 = 1; var14 <= var1; ++var14) {
               var13[var14 - 1] = (float)var14 * var10[var14];
            }

            float[] var25 = new float[var1 + 1];
            int var15 = method986(var13, var1 - 1, var2, false, var4, false, var25);
            if (var15 == -1) {
               return 0;
            } else {
               boolean var16 = false;
               float var18 = 0.0F;
               float var19 = 0.0F;
               float var20 = 0.0F;

               for(int var21 = 0; var21 <= var15; ++var21) {
                  if (var11 > var1) {
                     return var11;
                  }

                  float var17;
                  if (var21 == 0) {
                     var17 = var2;
                     var19 = class63.method295(var10, var1, var2);
                     if (Math.abs(var19) <= var22 && var3) {
                        var6[var11++] = var2;
                     }
                  } else {
                     var17 = var20;
                     var19 = var18;
                  }

                  if (var21 == var15) {
                     var20 = var4;
                     var16 = false;
                  } else {
                     var20 = var25[var21];
                  }

                  var18 = class63.method295(var10, var1, var20);
                  if (var16) {
                     var16 = false;
                  } else if (Math.abs(var18) < var22) {
                     if (var21 != var15 || var5) {
                        var6[var11++] = var20;
                        var16 = true;
                     }
                  } else if (var19 < 0.0F && var18 > 0.0F || var19 > 0.0F && var18 < 0.0F) {
                     var6[var11++] = class240.method1042(var12, var17, var20, 0.0F);
                     if (var11 > 1 && var6[var11 - 2] >= var6[var11 - 1] - var22) {
                        var6[var11 - 2] = (var6[var11 - 1] + var6[var11 - 2]) * 0.5F;
                        --var11;
                     }
                  }
               }

               return var11;
            }
         }
      }
   }
}
