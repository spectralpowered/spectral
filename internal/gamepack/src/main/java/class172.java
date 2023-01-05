public abstract class class172 {
   static boolean field1862;

   public abstract int method911(int var1, int var2);

   public abstract void method910();

   public static int method912(int var0, int var1, int var2, class204 var3, class391 var4, boolean var5, int[] var6, int[] var7) {
      int var10;
      for(int var9 = 0; var9 < 128; ++var9) {
         for(var10 = 0; var10 < 128; ++var10) {
            class63.field828[var9][var10] = 0;
            class63.field830[var9][var10] = 99999999;
         }
      }

      int var11;
      int var12;
      byte var14;
      int var15;
      int var16;
      int var18;
      int var20;
      int var21;
      int var22;
      boolean var28;
      int var30;
      int var31;
      int var33;
      if (var2 == 1) {
         var28 = class180.method946(var0, var1, var3, var4);
      } else if (var2 == 2) {
         var11 = var0;
         var12 = var1;
         byte var13 = 64;
         var14 = 64;
         var15 = var0 - var13;
         var16 = var1 - var14;
         class63.field828[var13][var14] = 99;
         class63.field830[var13][var14] = 0;
         byte var17 = 0;
         var18 = 0;
         class63.field829[var17] = var0;
         var33 = var17 + 1;
         class63.field832[var17] = var1;
         int[][] var19 = var4.field3445;

         boolean var29;
         while(true) {
            if (var33 == var18) {
               class63.field827 = var11;
               class63.field831 = var12;
               var29 = false;
               break;
            }

            var11 = class63.field829[var18];
            var12 = class63.field832[var18];
            var18 = var18 + 1 & 4095;
            var30 = var11 - var15;
            var31 = var12 - var16;
            var20 = var11 - var4.field3442;
            var21 = var12 - var4.field3443;
            if (var3.method1050(2, var11, var12, var4)) {
               class63.field827 = var11;
               class63.field831 = var12;
               var29 = true;
               break;
            }

            var22 = 1 + class63.field830[var30][var31];
            if (var30 > 0 && 0 == class63.field828[var30 - 1][var31] && (var19[var20 - 1][var21] & 19136782) == 0 && 0 == (var19[var20 - 1][var21 + 1] & 19136824)) {
               class63.field829[var33] = var11 - 1;
               class63.field832[var33] = var12;
               var33 = var33 + 1 & 4095;
               class63.field828[var30 - 1][var31] = 2;
               class63.field830[var30 - 1][var31] = var22;
            }

            if (var30 < 126 && class63.field828[var30 + 1][var31] == 0 && (var19[var20 + 2][var21] & 19136899) == 0 && (var19[var20 + 2][var21 + 1] & 19136992) == 0) {
               class63.field829[var33] = var11 + 1;
               class63.field832[var33] = var12;
               var33 = var33 + 1 & 4095;
               class63.field828[var30 + 1][var31] = 8;
               class63.field830[var30 + 1][var31] = var22;
            }

            if (var31 > 0 && 0 == class63.field828[var30][var31 - 1] && 0 == (var19[var20][var21 - 1] & 19136782) && 0 == (var19[var20 + 1][var21 - 1] & 19136899)) {
               class63.field829[var33] = var11;
               class63.field832[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               class63.field828[var30][var31 - 1] = 1;
               class63.field830[var30][var31 - 1] = var22;
            }

            if (var31 < 126 && 0 == class63.field828[var30][var31 + 1] && 0 == (var19[var20][var21 + 2] & 19136824) && (var19[var20 + 1][var21 + 2] & 19136992) == 0) {
               class63.field829[var33] = var11;
               class63.field832[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               class63.field828[var30][var31 + 1] = 4;
               class63.field830[var30][var31 + 1] = var22;
            }

            if (var30 > 0 && var31 > 0 && 0 == class63.field828[var30 - 1][var31 - 1] && (var19[var20 - 1][var21] & 19136830) == 0 && 0 == (var19[var20 - 1][var21 - 1] & 19136782) && 0 == (var19[var20][var21 - 1] & 19136911)) {
               class63.field829[var33] = var11 - 1;
               class63.field832[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               class63.field828[var30 - 1][var31 - 1] = 3;
               class63.field830[var30 - 1][var31 - 1] = var22;
            }

            if (var30 < 126 && var31 > 0 && 0 == class63.field828[var30 + 1][var31 - 1] && (var19[var20 + 1][var21 - 1] & 19136911) == 0 && (var19[var20 + 2][var21 - 1] & 19136899) == 0 && 0 == (var19[var20 + 2][var21] & 19136995)) {
               class63.field829[var33] = var11 + 1;
               class63.field832[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               class63.field828[var30 + 1][var31 - 1] = 9;
               class63.field830[var30 + 1][var31 - 1] = var22;
            }

            if (var30 > 0 && var31 < 126 && class63.field828[var30 - 1][var31 + 1] == 0 && 0 == (var19[var20 - 1][var21 + 1] & 19136830) && (var19[var20 - 1][var21 + 2] & 19136824) == 0 && (var19[var20][var21 + 2] & 19137016) == 0) {
               class63.field829[var33] = var11 - 1;
               class63.field832[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               class63.field828[var30 - 1][var31 + 1] = 6;
               class63.field830[var30 - 1][var31 + 1] = var22;
            }

            if (var30 < 126 && var31 < 126 && 0 == class63.field828[var30 + 1][var31 + 1] && (var19[var20 + 1][var21 + 2] & 19137016) == 0 && 0 == (var19[var20 + 2][var21 + 2] & 19136992) && (var19[var20 + 2][var21 + 1] & 19136995) == 0) {
               class63.field829[var33] = var11 + 1;
               class63.field832[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               class63.field828[var30 + 1][var31 + 1] = 12;
               class63.field830[var30 + 1][var31 + 1] = var22;
            }
         }

         var28 = var29;
      } else {
         var28 = class436.method2088(var0, var1, var2, var3, var4);
      }

      var10 = var0 - 64;
      var11 = var1 - 64;
      var12 = class63.field827;
      var30 = class63.field831;
      if (!var28) {
         if (!var5) {
            return -1;
         }

         var31 = Integer.MAX_VALUE;
         var15 = Integer.MAX_VALUE;
         byte var32 = 10;
         var33 = var3.field2180;
         var18 = var3.field2183;
         int var34 = var3.field2181;
         var20 = var3.field2182;

         for(var21 = var33 - var32; var21 <= var33 + var32; ++var21) {
            for(var22 = var18 - var32; var22 <= var18 + var32; ++var22) {
               int var23 = var21 - var10;
               int var24 = var22 - var11;
               if (var23 >= 0 && var24 >= 0 && var23 < 128 && var24 < 128 && class63.field830[var23][var24] < 100) {
                  int var25 = 0;
                  if (var21 < var33) {
                     var25 = var33 - var21;
                  } else if (var21 > var34 + var33 - 1) {
                     var25 = var21 - (var33 + var34 - 1);
                  }

                  int var26 = 0;
                  if (var22 < var18) {
                     var26 = var18 - var22;
                  } else if (var22 > var20 + var18 - 1) {
                     var26 = var22 - (var18 + var20 - 1);
                  }

                  int var27 = var25 * var25 + var26 * var26;
                  if (var27 < var31 || var27 == var31 && class63.field830[var23][var24] < var15) {
                     var31 = var27;
                     var15 = class63.field830[var23][var24];
                     var12 = var21;
                     var30 = var22;
                  }
               }
            }
         }

         if (var31 == Integer.MAX_VALUE) {
            return -1;
         }
      }

      if (var12 == var0 && var30 == var1) {
         var6[0] = var12;
         var7[0] = var30;
         return 0;
      } else {
         var14 = 0;
         class63.field829[var14] = var12;
         var31 = var14 + 1;
         class63.field832[var14] = var30;

         for(var15 = var16 = class63.field828[var12 - var10][var30 - var11]; var0 != var12 || var1 != var30; var15 = class63.field828[var12 - var10][var30 - var11]) {
            if (var16 != var15) {
               var16 = var15;
               class63.field829[var31] = var12;
               class63.field832[var31++] = var30;
            }

            if (0 != (var15 & 2)) {
               ++var12;
            } else if ((var15 & 8) != 0) {
               --var12;
            }

            if ((var15 & 1) != 0) {
               ++var30;
            } else if ((var15 & 4) != 0) {
               --var30;
            }
         }

         var33 = 0;

         while(var31-- > 0) {
            var6[var33] = class63.field829[var31];
            var7[var33++] = class63.field832[var31];
            if (var33 >= var6.length) {
               break;
            }
         }

         return var33;
      }
   }

   static int method913(class210 var0) {
      class258 var2 = (class258)client.field475.method545((long)var0.field2217 + ((long)var0.field2307 << 32));
      return null != var2 ? var2.field2645 : var0.field2293;
   }
}
