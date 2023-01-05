public final class class161 extends class362 {
   public byte[] field1662;
   public int field1664;
   public int field1665;
   public int field1666;
   public int field1667;
   public int field1668;
   public int field1669;
   public int[] field1663;

   public void method853() {
      if (this.field1668 != this.field1666 || this.field1665 != this.field1669) {
         byte[] var1 = new byte[this.field1666 * this.field1669];
         int var2 = 0;

         for(int var3 = 0; var3 < this.field1665; ++var3) {
            for(int var4 = 0; var4 < this.field1668; ++var4) {
               var1[var4 + this.field1664 + (var3 + this.field1667) * this.field1666] = this.field1662[var2++];
            }
         }

         this.field1662 = var1;
         this.field1668 = this.field1666;
         this.field1665 = this.field1669;
         this.field1664 = 0;
         this.field1667 = 0;
      }
   }

   public void method851(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field1663.length; ++var4) {
         int var5 = this.field1663[var4] >> 16 & 255;
         var5 += var1;
         if (var5 < 0) {
            var5 = 0;
         } else if (var5 > 255) {
            var5 = 255;
         }

         int var6 = this.field1663[var4] >> 8 & 255;
         var6 += var2;
         if (var6 < 0) {
            var6 = 0;
         } else if (var6 > 255) {
            var6 = 255;
         }

         int var7 = this.field1663[var4] & 255;
         var7 += var3;
         if (var7 < 0) {
            var7 = 0;
         } else if (var7 > 255) {
            var7 = 255;
         }

         this.field1663[var4] = (var5 << 16) + (var6 << 8) + var7;
      }

   }

   public void method849(int var1, int var2) {
      var1 += this.field1664;
      var2 += this.field1667;
      int var3 = var1 + var2 * class362.field3242;
      int var4 = 0;
      int var5 = this.field1665;
      int var6 = this.field1668;
      int var7 = class362.field3242 - var6;
      int var8 = 0;
      int var9;
      if (var2 < class362.field3244) {
         var9 = class362.field3244 - var2;
         var5 -= var9;
         var2 = class362.field3244;
         var4 += var9 * var6;
         var3 += var9 * class362.field3242;
      }

      if (var2 + var5 > class362.field3245) {
         var5 -= var2 + var5 - class362.field3245;
      }

      if (var1 < class362.field3246) {
         var9 = class362.field3246 - var1;
         var6 -= var9;
         var1 = class362.field3246;
         var4 += var9;
         var3 += var9;
         var8 += var9;
         var7 += var9;
      }

      if (var1 + var6 > class362.field3247) {
         var9 = var1 + var6 - class362.field3247;
         var6 -= var9;
         var8 += var9;
         var7 += var9;
      }

      if (var6 > 0 && var5 > 0) {
         method850(class362.field3243, this.field1662, this.field1663, var4, var3, var6, var5, var7, var8);
      }
   }

   public void method854(int var1, int var2, int var3, int var4) {
      int var5 = this.field1668;
      int var6 = this.field1665;
      int var7 = 0;
      int var8 = 0;
      int var9 = this.field1666;
      int var10 = this.field1669;
      int var11 = (var9 << 16) / var3;
      int var12 = (var10 << 16) / var4;
      int var13;
      if (this.field1664 > 0) {
         var13 = ((this.field1664 << 16) + var11 - 1) / var11;
         var1 += var13;
         var7 += var13 * var11 - (this.field1664 << 16);
      }

      if (this.field1667 > 0) {
         var13 = ((this.field1667 << 16) + var12 - 1) / var12;
         var2 += var13;
         var8 += var13 * var12 - (this.field1667 << 16);
      }

      if (var5 < var9) {
         var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
      }

      if (var6 < var10) {
         var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
      }

      var13 = var1 + var2 * class362.field3242;
      int var14 = class362.field3242 - var3;
      if (var2 + var4 > class362.field3245) {
         var4 -= var2 + var4 - class362.field3245;
      }

      int var15;
      if (var2 < class362.field3244) {
         var15 = class362.field3244 - var2;
         var4 -= var15;
         var13 += var15 * class362.field3242;
         var8 += var12 * var15;
      }

      if (var1 + var3 > class362.field3247) {
         var15 = var1 + var3 - class362.field3247;
         var3 -= var15;
         var14 += var15;
      }

      if (var1 < class362.field3246) {
         var15 = class362.field3246 - var1;
         var3 -= var15;
         var13 += var15;
         var7 += var11 * var15;
         var14 += var15;
      }

      method852(class362.field3243, this.field1662, this.field1663, var7, var8, var13, var14, var3, var4, var11, var12, var5);
   }

   static void method850(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

   static void method852(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
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
