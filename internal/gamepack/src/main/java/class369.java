public class class369 {
   byte[] field3283;
   int[] field3284;
   int[] field3285;

   public class369(byte[] var1) {
      int var2 = var1.length;
      this.field3284 = new int[var2];
      this.field3283 = var1;
      int[] var3 = new int[33];
      this.field3285 = new int[8];
      int var4 = 0;

      for(int var5 = 0; var5 < var2; ++var5) {
         byte var6 = var1[var5];
         if (var6 != 0) {
            int var7 = 1 << 32 - var6;
            int var8 = var3[var6];
            this.field3284[var5] = var8;
            int var9;
            int var10;
            int var11;
            int var12;
            if (0 != (var8 & var7)) {
               var9 = var3[var6 - 1];
            } else {
               var9 = var8 | var7;

               for(var10 = var6 - 1; var10 >= 1; --var10) {
                  var11 = var3[var10];
                  if (var11 != var8) {
                     break;
                  }

                  var12 = 1 << 32 - var10;
                  if (0 != (var11 & var12)) {
                     var3[var10] = var3[var10 - 1];
                     break;
                  }

                  var3[var10] = var11 | var12;
               }
            }

            var3[var6] = var9;

            for(var10 = var6 + 1; var10 <= 32; ++var10) {
               if (var8 == var3[var10]) {
                  var3[var10] = var9;
               }
            }

            var10 = 0;

            for(var11 = 0; var11 < var6; ++var11) {
               var12 = Integer.MIN_VALUE >>> var11;
               if ((var8 & var12) != 0) {
                  if (this.field3285[var10] == 0) {
                     this.field3285[var10] = var4;
                  }

                  var10 = this.field3285[var10];
               } else {
                  ++var10;
               }

               if (var10 >= this.field3285.length) {
                  int[] var13 = new int[this.field3285.length * 2];

                  for(int var14 = 0; var14 < this.field3285.length; ++var14) {
                     var13[var14] = this.field3285[var14];
                  }

                  this.field3285 = var13;
               }

               var12 >>>= 1;
            }

            this.field3285[var10] = ~var5;
            if (var10 >= var4) {
               var4 = var10 + 1;
            }
         }
      }

   }

   int method1780(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      int var7 = 0;
      int var8 = var5 << 3;

      for(var3 += var2; var2 < var3; ++var2) {
         int var9 = var1[var2] & 255;
         int var10 = this.field3284[var9];
         byte var11 = this.field3283[var9];
         if (var11 == 0) {
            throw new RuntimeException("" + var9);
         }

         int var12 = var8 >> 3;
         int var13 = var8 & 7;
         var7 &= -var13 >> 31;
         int var14 = var12 + (var13 + var11 - 1 >> 3);
         var13 += 24;
         var4[var12] = (byte)(var7 |= var10 >>> var13);
         if (var12 < var14) {
            ++var12;
            var13 -= 8;
            var4[var12] = (byte)(var7 = var10 >>> var13);
            if (var12 < var14) {
               ++var12;
               var13 -= 8;
               var4[var12] = (byte)(var7 = var10 >>> var13);
               if (var12 < var14) {
                  ++var12;
                  var13 -= 8;
                  var4[var12] = (byte)(var7 = var10 >>> var13);
                  if (var12 < var14) {
                     ++var12;
                     var13 -= 8;
                     var4[var12] = (byte)(var7 = var10 << -var13);
                  }
               }
            }
         }

         var8 += var11;
      }

      return (var8 + 7 >> 3) - var5;
   }

   int method1781(byte[] var1, int var2, byte[] var3, int var4, int var5) {
      if (var5 == 0) {
         return 0;
      } else {
         int var7 = 0;
         var5 += var4;
         int var8 = var2;

         while(true) {
            byte var9 = var1[var8];
            if (var9 < 0) {
               var7 = this.field3285[var7];
            } else {
               ++var7;
            }

            int var10;
            if ((var10 = this.field3285[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 64)) {
               var7 = this.field3285[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3285[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 32)) {
               var7 = this.field3285[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3285[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 16) != 0) {
               var7 = this.field3285[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3285[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 8)) {
               var7 = this.field3285[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3285[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if ((var9 & 4) != 0) {
               var7 = this.field3285[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3285[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 2)) {
               var7 = this.field3285[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3285[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            if (0 != (var9 & 1)) {
               var7 = this.field3285[var7];
            } else {
               ++var7;
            }

            if ((var10 = this.field3285[var7]) < 0) {
               var3[var4++] = (byte)(~var10);
               if (var4 >= var5) {
                  break;
               }

               var7 = 0;
            }

            ++var8;
         }

         return var8 + 1 - var2;
      }
   }

   public static String method1782(int var0, boolean var1) {
      return var1 && var0 >= 0 ? class210.method1102(var0, 10, var1) : Integer.toString(var0);
   }
}
