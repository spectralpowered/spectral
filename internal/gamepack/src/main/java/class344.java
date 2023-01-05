@ObfInfo(
   name = "ra"
)
public final class class344 extends class162 {
   @ObfInfo(
      owner = "ra",
      name = "h",
      desc = "[B"
   )
   public byte[] field2752;
   @ObfInfo(
      owner = "ra",
      name = "m",
      desc = "I"
   )
   public int field2754;
   @ObfInfo(
      owner = "ra",
      name = "x",
      desc = "I"
   )
   public int field2755;
   @ObfInfo(
      owner = "ra",
      name = "f",
      desc = "I"
   )
   public int field2756;
   @ObfInfo(
      owner = "ra",
      name = "q",
      desc = "I"
   )
   public int field2757;
   @ObfInfo(
      owner = "ra",
      name = "v",
      desc = "I"
   )
   public int field2758;
   @ObfInfo(
      owner = "ra",
      name = "r",
      desc = "I"
   )
   public int field2759;
   @ObfInfo(
      owner = "ra",
      name = "e",
      desc = "[I"
   )
   public int[] field2753;

   @ObfInfo(
      owner = "ra",
      name = "h",
      desc = "()V"
   )
   public void method1749() {
      if (this.field2758 != this.field2756 || this.field2755 != this.field2759) {
         byte[] var1 = new byte[this.field2756 * this.field2759];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field2755; ++var3) {
            for(int var4 = 0; var4 < this.field2758; ++var4) {
               var1[var4 + this.field2754 + (var3 + this.field2757) * this.field2756] = this.field2752[var2++];
            }
         }

         this.field2752 = var1;
         this.field2758 = this.field2756;
         this.field2755 = this.field2759;
         this.field2754 = 0;
         this.field2757 = 0;
      }
   }

   @ObfInfo(
      owner = "ra",
      name = "e",
      desc = "(III)V"
   )
   public void method1747(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2753.length; ++var4) {
         int var5 = this.field2753[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field2753[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field2753[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.field2753[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   @ObfInfo(
      owner = "ra",
      name = "v",
      desc = "(II)V"
   )
   public void method1745(int var1, int var2) {
      var1 += this.field2754;
      var2 += this.field2757;
      int var3 = var1 + var2 * class162.field1232;
      int var4 = 0;
      int var5 = this.field2755;
      int var6 = this.field2758;
      int var7 = class162.field1232 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class162.field1234) {
         var9 = class162.field1234 - var2;
         var5 -= var9;
         var2 = class162.field1234;
         var4 += var9 * var6;
         var3 += var9 * class162.field1232;
      }

      if (var2 + var5 > class162.field1235) {
         var5 -= var2 + var5 - class162.field1235;
      }

      if (var1 < class162.field1236) {
         var9 = class162.field1236 - var1;
         var6 -= var9;
         var1 = class162.field1236;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > class162.field1237) {
         var9 = var1 + var6 - class162.field1237;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method1746(class162.field1233, this.field2752, this.field2753, var4, var3, var6, var5, var7, var8);
      }
   }

   @ObfInfo(
      owner = "ra",
      name = "m",
      desc = "(IIII)V"
   )
   public void method1750(int var1, int var2, int var3, int var4) {
      int var5 = this.field2758;
      int var6 = this.field2755;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field2756;
      int var10 = this.field2759;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.field2754 > 0) {
         var13 = ((this.field2754 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field2754 << 16);
      }

      if (this.field2757 > 0) {
         var13 = ((this.field2757 << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field2757 << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * class162.field1232;
      int var14 = class162.field1232 - var3;
      if (var2 + var4 > class162.field1235) {
         var4 -= var2 + var4 - class162.field1235;
      }

      int var15;
      if (var2 < class162.field1234) {
         var15 = class162.field1234 - var2;
         var4 -= var15;
         var13 += var15 * class162.field1232;
         var8 += var12 * var15;
      }

      if (var1 + var3 > class162.field1237) {
         var15 = var1 + var3 - class162.field1237;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < class162.field1236) {
         var15 = class162.field1236 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method1748(class162.field1233, this.field2752, this.field2753, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   @ObfInfo(
      owner = "ra",
      name = "x",
      desc = "([I[B[IIIIIII)V"
   )
   static void method1746(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         byte var12;
         for(var11 = var9; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }

            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            var12 = var1[var3++];
            if (var12 != 0) {
               var0[var4++] = var2[var12 & 255];
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   @ObfInfo(
      owner = "ra",
      name = "q",
      desc = "([I[B[IIIIIIIIII)V"
   )
   static void method1748(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = var3;

      for(int var13 = -var8; var13 < 0; ++var13) {
         int var14 = (var4 >> 16) * var11;

         for(int var15 = -var7; var15 < 0; ++var15) {
            byte var16 = var1[(var3 >> 16) + var14];
            if (var16 != 0) {
               var0[var5++] = var2[var16 & 255];
            } else {
               ++var5;
            }

            var3 += var9;
         }

         var4 += var10;
         var3 = var12;
         var5 += var6;
      }

   }
}
