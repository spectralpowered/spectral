public class class184 {
   boolean field1974 = false;
   class164 field1975;
   int field1977 = 0;
   String field1976;

   class184(class164 var1) {
      this.field1975 = var1;
   }

   void method962(String var1) {
      if (null != var1 && !var1.isEmpty()) {
         if (var1 != this.field1976) {
            this.field1976 = var1;
            this.field1977 = 0;
            this.field1974 = false;
            this.method964();
         }
      }
   }

   int method964() {
      if (this.field1977 < 33) {
         if (!this.field1975.method885(class48.field417.field419, this.field1976)) {
            return this.field1977;
         }

         this.field1977 = 33;
      }

      if (33 == this.field1977) {
         if (this.field1975.method889(class48.field420.field419, this.field1976) && !this.field1975.method885(class48.field420.field419, this.field1976)) {
            return this.field1977;
         }

         this.field1977 = 66;
      }

      if (66 == this.field1977) {
         if (!this.field1975.method885(this.field1976, class48.field416.field419)) {
            return this.field1977;
         }

         this.field1977 = 100;
         this.field1974 = true;
      }

      return this.field1977;
   }

   boolean method963() {
      return this.field1974;
   }

   int method961() {
      return this.field1977;
   }

   public static int method965(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
      float var8 = 0.0F;

      for(int var9 = 0; var9 < var1 + 1; ++var9) {
         var8 += Math.abs(var0[var9]);
      }

      float var22 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class257.field2642;
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
            class244 var12 = new class244(var10, var1);
            float[] var13 = new float[var1 + 1];

            for(int var14 = 1; var14 <= var1; ++var14) {
               var13[var14 - 1] = (float)var14 * var10[var14];
            }

            float[] var25 = new float[var1 + 1];
            int var15 = method965(var13, var1 - 1, var2, false, var4, false, var25);
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
                     var19 = class170.method908(var10, var1, var2);
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

                  var18 = class170.method908(var10, var1, var20);
                  if (var16) {
                     var16 = false;
                  } else if (Math.abs(var18) < var22) {
                     if (var21 != var15 || var5) {
                        var6[var11++] = var20;
                        var16 = true;
                     }
                  } else if (var19 < 0.0F && var18 > 0.0F || var19 > 0.0F && var18 < 0.0F) {
                     var6[var11++] = class321.method1565(var12, var17, var20, 0.0F);
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
