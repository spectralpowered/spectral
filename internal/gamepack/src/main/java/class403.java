public class class403 {
   static float field3524;
   static float[][] field3522 = new float[2][8];
   static int field3518;
   static int[][] field3519 = new int[2][8];
   int[] field3521 = new int[2];
   int[] field3523 = new int[2];
   int[][][] field3520 = new int[2][2][4];
   int[][][] field3525 = new int[2][2][4];

   float method1974(int var1, int var2, float var3) {
      float var4 = (float)this.field3520[var1][0][var2] + var3 * (float)(this.field3520[var1][1][var2] - this.field3520[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   float method1978(int var1, int var2, float var3) {
      float var4 = (float)this.field3525[var1][0][var2] + var3 * (float)(this.field3525[var1][1][var2] - this.field3525[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method1976(var4);
   }

   int method1975(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.field3521[0] + (float)(this.field3521[1] - this.field3521[0]) * var2;
         var3 *= 0.0030517578F;
         field3524 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field3518 = (int)(field3524 * 65536.0F);
      }

      if (this.field3523[var1] == 0) {
         return 0;
      } else {
         var3 = this.method1974(var1, 0, var2);
         field3522[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method1978(var1, 0, var2));
         field3522[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.field3523[var1]; ++var4) {
            var3 = this.method1974(var1, var4, var2);
            float var5 = var3 * -2.0F * (float)Math.cos((double)this.method1978(var1, var4, var2));
            float var6 = var3 * var3;
            field3522[var1][var4 * 2 + 1] = field3522[var1][var4 * 2 - 1] * var6;
            field3522[var1][var4 * 2] = field3522[var1][var4 * 2 - 1] * var5 + field3522[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               field3522[var1][var7] += field3522[var1][var7 - 1] * var5 + field3522[var1][var7 - 2] * var6;
            }

            field3522[var1][1] += field3522[var1][0] * var5 + var6;
            field3522[var1][0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.field3523[0] * 2; ++var4) {
               field3522[0][var4] *= field3524;
            }
         }

         for(var4 = 0; var4 < this.field3523[var1] * 2; ++var4) {
            field3519[var1][var4] = (int)(field3522[var1][var4] * 65536.0F);
         }

         return this.field3523[var1] * 2;
      }
   }

   final void method1977(class134 var1, class113 var2) {
      int var3 = var1.method669();
      this.field3523[0] = var3 >> 4;
      this.field3523[1] = var3 & 15;
      if (var3 != 0) {
         this.field3521[0] = var1.method671();
         this.field3521[1] = var1.method671();
         int var4 = var1.method669();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field3523[var5]; ++var6) {
               this.field3525[var5][0][var6] = var1.method671();
               this.field3520[var5][0][var6] = var1.method671();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field3523[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field3525[var5][1][var6] = var1.method671();
                  this.field3520[var5][1][var6] = var1.method671();
               } else {
                  this.field3525[var5][1][var6] = this.field3525[var5][0][var6];
                  this.field3520[var5][1][var6] = this.field3520[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.field3521[1] != this.field3521[0]) {
            var2.method592(var1);
         }
      } else {
         int[] var7 = this.field3521;
         this.field3521[1] = 0;
         var7[0] = 0;
      }

   }

   static float method1976(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
