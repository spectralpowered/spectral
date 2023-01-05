@ObfInfo(
   name = "bw"
)
public class class428 {
   @ObfInfo(
      owner = "bw",
      name = "r",
      desc = "F"
   )
   static float field3541;
   @ObfInfo(
      owner = "bw",
      name = "q",
      desc = "[[F"
   )
   static float[][] field3539 = new float[2][8];
   @ObfInfo(
      owner = "bw",
      name = "u",
      desc = "I"
   )
   static int field3535;
   @ObfInfo(
      owner = "bw",
      name = "f",
      desc = "[[I"
   )
   static int[][] field3536 = new int[2][8];
   @ObfInfo(
      owner = "bw",
      name = "m",
      desc = "[I"
   )
   int[] field3538 = new int[2];
   @ObfInfo(
      owner = "bw",
      name = "h",
      desc = "[I"
   )
   int[] field3540 = new int[2];
   @ObfInfo(
      owner = "bw",
      name = "x",
      desc = "[[[I"
   )
   int[][][] field3537 = new int[2][2][4];
   @ObfInfo(
      owner = "bw",
      name = "v",
      desc = "[[[I"
   )
   int[][][] field3542 = new int[2][2][4];

   @ObfInfo(
      owner = "bw",
      name = "h",
      desc = "(IIF)F"
   )
   float method2094(int var1, int var2, float var3) {
      float var4 = (float)this.field3537[var1][0][var2] + var3 * (float)(this.field3537[var1][1][var2] - this.field3537[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

   @ObfInfo(
      owner = "bw",
      name = "v",
      desc = "(IIF)F"
   )
   float method2098(int var1, int var2, float var3) {
      float var4 = (float)this.field3542[var1][0][var2] + var3 * (float)(this.field3542[var1][1][var2] - this.field3542[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method2096(var4);
   }

   @ObfInfo(
      owner = "bw",
      name = "x",
      desc = "(IF)I"
   )
   int method2095(int var1, float var2) {
      float var3;
      if (var1 == 0) {
         var3 = (float)this.field3538[0] + (float)(this.field3538[1] - this.field3538[0]) * var2;
         var3 *= 0.0030517578F;
         field3541 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field3535 = (int)(field3541 * 65536.0F);
      }

      if (this.field3540[var1] == 0) {
         return 0;
      } else {
         var3 = this.method2094(var1, 0, var2);
         field3539[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method2098(var1, 0, var2));
         field3539[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.field3540[var1]; ++var4) {
            var3 = this.method2094(var1, var4, var2);
            float var5 = var3 * -2.0F * (float)Math.cos((double)this.method2098(var1, var4, var2));
            float var6 = var3 * var3;
            field3539[var1][var4 * 2 + 1] = field3539[var1][var4 * 2 - 1] * var6;
            field3539[var1][var4 * 2] = field3539[var1][var4 * 2 - 1] * var5 + field3539[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               field3539[var1][var7] += field3539[var1][var7 - 1] * var5 + field3539[var1][var7 - 2] * var6;
            }

            field3539[var1][1] += field3539[var1][0] * var5 + var6;
            field3539[var1][0] += var5;
         }

         if (var1 == 0) {
            for(var4 = 0; var4 < this.field3540[0] * 2; ++var4) {
               field3539[0][var4] *= field3541;
            }
         }

         for(var4 = 0; var4 < this.field3540[var1] * 2; ++var4) {
            field3536[var1][var4] = (int)(field3539[var1][var4] * 65536.0F);
         }

         return this.field3540[var1] * 2;
      }
   }

   @ObfInfo(
      owner = "bw",
      name = "m",
      desc = "(Lqy;Lah;)V"
   )
   final void method2097(class127 var1, class487 var2) {
      int var3 = var1.method547();
      this.field3540[0] = var3 >> 4;
      this.field3540[1] = var3 & 15;
      if (var3 != 0) {
         this.field3538[0] = var1.method549();
         this.field3538[1] = var1.method549();
         int var4 = var1.method547();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field3540[var5]; ++var6) {
               this.field3542[var5][0][var6] = var1.method549();
               this.field3537[var5][0][var6] = var1.method549();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field3540[var5]; ++var6) {
               if ((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field3542[var5][1][var6] = var1.method549();
                  this.field3537[var5][1][var6] = var1.method549();
               } else {
                  this.field3542[var5][1][var6] = this.field3542[var5][0][var6];
                  this.field3537[var5][1][var6] = this.field3537[var5][0][var6];
               }
            }
         }

         if (var4 != 0 || this.field3538[1] != this.field3538[0]) {
            var2.method2391(var1);
         }
      } else {
         int[] var7 = this.field3538;
         this.field3538[1] = 0;
         var7[0] = 0;
      }

   }

   @ObfInfo(
      owner = "bw",
      name = "e",
      desc = "(F)F"
   )
   static float method2096(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }
}
