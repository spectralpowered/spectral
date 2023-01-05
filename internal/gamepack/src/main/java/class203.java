@ObfInfo(
   name = "fz"
)
public abstract class class203 {
   @ObfInfo(
      owner = "fz",
      name = "r",
      desc = "Z"
   )
   static boolean field1759;

   @ObfInfo(
      owner = "fz",
      name = "e",
      desc = "(III)I"
   )
   public abstract int method890(int var1, int var2);

   @ObfInfo(
      owner = "fz",
      name = "h",
      desc = "(I)V"
   )
   public abstract void method889();

   @ObfInfo(
      owner = "fz",
      name = "h",
      desc = "(IIILgg;Lgw;Z[I[II)I"
   )
   public static int method891(int var0, int var1, int var2, class39 var3, class427 var4, boolean var5, int[] var6, int[] var7) {
      int var10;
      for(int var9 = 0; var9 < 128; ++var9) {
         for(var10 = 0; var10 < 128; ++var10) {
            class474.field3991[var9][var10] = 0;
            class474.field3993[var9][var10] = 99999999;
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
         var28 = class185.method844(var0, var1, var3, var4);
      } else if (var2 == 2) {
         var11 = var0;
         var12 = var1;
         byte var13 = 64;
         var14 = 64;
         var15 = var0 - var13;
         var16 = var1 - var14;
         class474.field3991[var13][var14] = 99;
         class474.field3993[var13][var14] = 0;
         byte var17 = 0;
         var18 = 0;
         class474.field3992[var17] = var0;
         var33 = var17 + 1;
         class474.field3995[var17] = var1;
         int[][] var19 = var4.field3534;

         boolean var29;
         while(true) {
            if (var33 == var18) {
               class474.field3990 = var11;
               class474.field3994 = var12;
               var29 = false;
               break;
            }

            var11 = class474.field3992[var18];
            var12 = class474.field3995[var18];
            var18 = var18 + 1 & 4095;
            var30 = var11 - var15;
            var31 = var12 - var16;
            var20 = var11 - var4.field3531;
            var21 = var12 - var4.field3532;
            if (var3.method165(2, var11, var12, var4)) {
               class474.field3990 = var11;
               class474.field3994 = var12;
               var29 = true;
               break;
            }

            var22 = 1 + class474.field3993[var30][var31];
            if (var30 > 0 && 0 == class474.field3991[var30 - 1][var31] && (var19[var20 - 1][var21] & 19136782) == 0 && 0 == (var19[var20 - 1][var21 + 1] & 19136824)) {
               class474.field3992[var33] = var11 - 1;
               class474.field3995[var33] = var12;
               var33 = var33 + 1 & 4095;
               class474.field3991[var30 - 1][var31] = 2;
               class474.field3993[var30 - 1][var31] = var22;
            }

            if (var30 < 126 && class474.field3991[var30 + 1][var31] == 0 && (var19[var20 + 2][var21] & 19136899) == 0 && (var19[var20 + 2][var21 + 1] & 19136992) == 0) {
               class474.field3992[var33] = var11 + 1;
               class474.field3995[var33] = var12;
               var33 = var33 + 1 & 4095;
               class474.field3991[var30 + 1][var31] = 8;
               class474.field3993[var30 + 1][var31] = var22;
            }

            if (var31 > 0 && 0 == class474.field3991[var30][var31 - 1] && 0 == (var19[var20][var21 - 1] & 19136782) && 0 == (var19[var20 + 1][var21 - 1] & 19136899)) {
               class474.field3992[var33] = var11;
               class474.field3995[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               class474.field3991[var30][var31 - 1] = 1;
               class474.field3993[var30][var31 - 1] = var22;
            }

            if (var31 < 126 && 0 == class474.field3991[var30][var31 + 1] && 0 == (var19[var20][var21 + 2] & 19136824) && (var19[var20 + 1][var21 + 2] & 19136992) == 0) {
               class474.field3992[var33] = var11;
               class474.field3995[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               class474.field3991[var30][var31 + 1] = 4;
               class474.field3993[var30][var31 + 1] = var22;
            }

            if (var30 > 0 && var31 > 0 && 0 == class474.field3991[var30 - 1][var31 - 1] && (var19[var20 - 1][var21] & 19136830) == 0 && 0 == (var19[var20 - 1][var21 - 1] & 19136782) && 0 == (var19[var20][var21 - 1] & 19136911)) {
               class474.field3992[var33] = var11 - 1;
               class474.field3995[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               class474.field3991[var30 - 1][var31 - 1] = 3;
               class474.field3993[var30 - 1][var31 - 1] = var22;
            }

            if (var30 < 126 && var31 > 0 && 0 == class474.field3991[var30 + 1][var31 - 1] && (var19[var20 + 1][var21 - 1] & 19136911) == 0 && (var19[var20 + 2][var21 - 1] & 19136899) == 0 && 0 == (var19[var20 + 2][var21] & 19136995)) {
               class474.field3992[var33] = var11 + 1;
               class474.field3995[var33] = var12 - 1;
               var33 = var33 + 1 & 4095;
               class474.field3991[var30 + 1][var31 - 1] = 9;
               class474.field3993[var30 + 1][var31 - 1] = var22;
            }

            if (var30 > 0 && var31 < 126 && class474.field3991[var30 - 1][var31 + 1] == 0 && 0 == (var19[var20 - 1][var21 + 1] & 19136830) && (var19[var20 - 1][var21 + 2] & 19136824) == 0 && (var19[var20][var21 + 2] & 19137016) == 0) {
               class474.field3992[var33] = var11 - 1;
               class474.field3995[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               class474.field3991[var30 - 1][var31 + 1] = 6;
               class474.field3993[var30 - 1][var31 + 1] = var22;
            }

            if (var30 < 126 && var31 < 126 && 0 == class474.field3991[var30 + 1][var31 + 1] && (var19[var20 + 1][var21 + 2] & 19137016) == 0 && 0 == (var19[var20 + 2][var21 + 2] & 19136992) && (var19[var20 + 2][var21 + 1] & 19136995) == 0) {
               class474.field3992[var33] = var11 + 1;
               class474.field3995[var33] = var12 + 1;
               var33 = var33 + 1 & 4095;
               class474.field3991[var30 + 1][var31 + 1] = 12;
               class474.field3993[var30 + 1][var31 + 1] = var22;
            }
         }

         var28 = var29;
      } else {
         var28 = class481.method2373(var0, var1, var2, var3, var4);
      }

      var10 = var0 - 64;
      var11 = var1 - 64;
      var12 = class474.field3990;
      var30 = class474.field3994;
      if (!var28) {
         if (!var5) {
            return -1;
         }

         var31 = Integer.MAX_VALUE;
         var15 = Integer.MAX_VALUE;
         byte var32 = 10;
         var33 = var3.field195;
         var18 = var3.field198;
         int var34 = var3.field196;
         var20 = var3.field197;

         for(var21 = var33 - var32; var21 <= var33 + var32; ++var21) {
            for(var22 = var18 - var32; var22 <= var18 + var32; ++var22) {
               int var23 = var21 - var10;
               int var24 = var22 - var11;
               if (var23 >= 0 && var24 >= 0 && var23 < 128 && var24 < 128 && class474.field3993[var23][var24] < 100) {
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
                  if (var27 < var31 || var27 == var31 && class474.field3993[var23][var24] < var15) {
                     var31 = var27;
                     var15 = class474.field3993[var23][var24];
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
         class474.field3992[var14] = var12;
         var31 = var14 + 1;
         class474.field3995[var14] = var30;

         for(var15 = var16 = class474.field3991[var12 - var10][var30 - var11]; var0 != var12 || var1 != var30; var15 = class474.field3991[var12 - var10][var30 - var11]) {
            if (var16 != var15) {
               var16 = var15;
               class474.field3992[var31] = var12;
               class474.field3995[var31++] = var30;
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
            var6[var33] = class474.field3992[var31];
            var7[var33++] = class474.field3995[var31];
            if (var33 >= var6.length) {
               break;
            }
         }

         return var33;
      }
   }

   @ObfInfo(
      owner = "fz",
      name = "ma",
      desc = "(Lkd;B)I"
   )
   static int method892(class120 var0) {
      class245 var2 = (class245)client.field271.method791((long)var0.field895 + ((long)var0.field985 << 32));
      return null != var2 ? var2.field2057 : var0.field971;
   }
}
