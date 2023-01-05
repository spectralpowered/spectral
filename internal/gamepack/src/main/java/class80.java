public class class80 {
   float[][] field927;
   int field924;
   int field925;
   int[] field923;
   int[] field926;
   int[] field928;

   class80() {
      class453.method2152(24);
      this.field924 = class453.method2152(16);
      this.field925 = class453.method2152(24);
      this.field923 = new int[this.field925];
      boolean var1 = class453.method2158() != 0;
      int var2;
      int var3;
      int var5;
      if (var1) {
         var2 = 0;

         for(var3 = class453.method2152(5) + 1; var2 < this.field925; ++var3) {
            int var4 = class453.method2152(class47.method251(this.field925 - var2));

            for(var5 = 0; var5 < var4; ++var5) {
               this.field923[var2++] = var3;
            }
         }
      } else {
         boolean var14 = class453.method2158() != 0;

         for(var3 = 0; var3 < this.field925; ++var3) {
            if (var14 && class453.method2158() == 0) {
               this.field923[var3] = 0;
            } else {
               this.field923[var3] = class453.method2152(5) + 1;
            }
         }
      }

      this.method435();
      var2 = class453.method2152(4);
      if (var2 > 0) {
         float var15 = class453.method2151(class453.method2152(32));
         float var16 = class453.method2151(class453.method2152(32));
         var5 = class453.method2152(4) + 1;
         boolean var6 = class453.method2158() != 0;
         int var7;
         if (var2 == 1) {
            var7 = method438(this.field925, this.field924);
         } else {
            var7 = this.field925 * this.field924;
         }

         this.field926 = new int[var7];

         int var8;
         for(var8 = 0; var8 < var7; ++var8) {
            this.field926[var8] = class453.method2152(var5);
         }

         this.field927 = new float[this.field925][this.field924];
         float var9;
         int var10;
         int var11;
         if (var2 == 1) {
            for(var8 = 0; var8 < this.field925; ++var8) {
               var9 = 0.0F;
               var10 = 1;

               for(var11 = 0; var11 < this.field924; ++var11) {
                  int var12 = var8 / var10 % var7;
                  float var13 = (float)this.field926[var12] * var16 + var15 + var9;
                  this.field927[var8][var11] = var13;
                  if (var6) {
                     var9 = var13;
                  }

                  var10 *= var7;
               }
            }
         } else {
            for(var8 = 0; var8 < this.field925; ++var8) {
               var9 = 0.0F;
               var10 = var8 * this.field924;

               for(var11 = 0; var11 < this.field924; ++var11) {
                  float var17 = (float)this.field926[var10] * var16 + var15 + var9;
                  this.field927[var8][var11] = var17;
                  if (var6) {
                     var9 = var17;
                  }

                  ++var10;
               }
            }
         }
      }

   }

   void method435() {
      int[] var1 = new int[this.field925];
      int[] var2 = new int[33];

      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      int var10;
      for(var3 = 0; var3 < this.field925; ++var3) {
         var4 = this.field923[var3];
         if (var4 != 0) {
            var5 = 1 << 32 - var4;
            var6 = var2[var4];
            var1[var3] = var6;
            int var9;
            if ((var6 & var5) != 0) {
               var7 = var2[var4 - 1];
            } else {
               var7 = var6 | var5;

               for(var8 = var4 - 1; var8 >= 1; --var8) {
                  var9 = var2[var8];
                  if (var9 != var6) {
                     break;
                  }

                  var10 = 1 << 32 - var8;
                  if ((var9 & var10) != 0) {
                     var2[var8] = var2[var8 - 1];
                     break;
                  }

                  var2[var8] = var9 | var10;
               }
            }

            var2[var4] = var7;

            for(var8 = var4 + 1; var8 <= 32; ++var8) {
               var9 = var2[var8];
               if (var9 == var6) {
                  var2[var8] = var7;
               }
            }
         }
      }

      this.field928 = new int[8];
      int var11 = 0;

      for(var3 = 0; var3 < this.field925; ++var3) {
         var4 = this.field923[var3];
         if (var4 != 0) {
            var5 = var1[var3];
            var6 = 0;

            for(var7 = 0; var7 < var4; ++var7) {
               var8 = Integer.MIN_VALUE >>> var7;
               if ((var5 & var8) != 0) {
                  if (this.field928[var6] == 0) {
                     this.field928[var6] = var11;
                  }

                  var6 = this.field928[var6];
               } else {
                  ++var6;
               }

               if (var6 >= this.field928.length) {
                  int[] var12 = new int[this.field928.length * 2];

                  for(var10 = 0; var10 < this.field928.length; ++var10) {
                     var12[var10] = this.field928[var10];
                  }

                  this.field928 = var12;
               }

               var8 >>>= 1;
            }

            this.field928[var6] = ~var3;
            if (var6 >= var11) {
               var11 = var6 + 1;
            }
         }
      }

   }

   int method436() {
      int var1;
      for(var1 = 0; this.field928[var1] >= 0; var1 = class453.method2158() != 0 ? this.field928[var1] : var1 + 1) {
         ;
      }

      return ~this.field928[var1];
   }

   float[] method437() {
      return this.field927[this.method436()];
   }

   static int method438(int var0, int var1) {
      int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

      while(true) {
         int var4 = var2;
         int var5 = var1;

         int var6;
         for(var6 = 1; var5 > 1; var5 >>= 1) {
            if ((var5 & 1) != 0) {
               var6 *= var4;
            }

            var4 *= var4;
         }

         int var3;
         if (var5 == 1) {
            var3 = var4 * var6;
         } else {
            var3 = var6;
         }

         if (var3 <= var0) {
            return var2;
         }

         --var2;
      }
   }
}
