public class class318 {
   public static boolean field2525 = true;
   public static int field2526 = -1;
   public static int field2529 = -1;
   static boolean field2510 = false;
   static boolean field2522 = false;
   static boolean[][] field2546;
   static boolean[][][][] field2545;
   static class141 field2534;
   static class174[] field2533;
   static class174[][] field2527;
   static class211[] field2495 = new class211[100];
   static int field2497;
   static int field2499;
   static int field2501;
   static int field2505 = 0;
   static int field2506 = 4;
   static int field2507 = 0;
   static int field2508 = 0;
   static int field2509;
   static int field2511;
   static int field2512;
   static int field2513;
   static int field2514;
   static int field2515;
   static int field2516;
   static int field2517;
   static int field2519;
   static int field2520;
   static int field2521;
   static int field2523 = 0;
   static int field2524 = 0;
   static int field2528;
   static int field2531;
   static int field2532;
   static int field2547;
   static int field2548;
   static int field2549;
   static int field2551;
   static int[] field2542;
   static final int[] field2518;
   static final int[] field2535;
   static final int[] field2536;
   static final int[] field2537;
   static final int[] field2538;
   static final int[] field2539;
   static final int[] field2540;
   class211[] field2550 = new class211[5000];
   class438[][][] field2500;
   int field2496;
   int field2498;
   int field2502 = 0;
   int field2504 = 0;
   int field2530;
   int[][] field2543 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] field2544 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int[][][] field2503;
   int[][][] field2541;

   static {
      field2542 = new int[field2506];
      field2527 = new class174[field2506][500];
      field2532 = 0;
      field2533 = new class174[500];
      field2534 = new class141();
      field2535 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field2536 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field2537 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field2538 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field2518 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field2539 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field2540 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field2545 = new boolean[8][32][51][51];
   }

   public class318(int var1, int var2, int var3, int[][][] var4) {
      this.field2496 = var1;
      this.field2530 = var2;
      this.field2498 = var3;
      this.field2500 = new class438[var1][var2][var3];
      this.field2503 = new int[var1][var2 + 1][var3 + 1];
      this.field2541 = var4;
      this.method1561();
   }

   public void method1561() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field2496; ++var1) {
         for(var2 = 0; var2 < this.field2530; ++var2) {
            for(int var3 = 0; var3 < this.field2498; ++var3) {
               this.field2500[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field2506; ++var1) {
         for(var2 = 0; var2 < field2542[var1]; ++var2) {
            field2527[var1][var2] = null;
         }

         field2542[var1] = 0;
      }

      for(var1 = 0; var1 < this.field2502; ++var1) {
         this.field2550[var1] = null;
      }

      this.field2502 = 0;

      for(var1 = 0; var1 < field2495.length; ++var1) {
         field2495[var1] = null;
      }

   }

   public void method1603(int var1) {
      this.field2504 = var1;

      for(int var2 = 0; var2 < this.field2530; ++var2) {
         for(int var3 = 0; var3 < this.field2498; ++var3) {
            if (this.field2500[var1][var2][var3] == null) {
               this.field2500[var1][var2][var3] = new class438(var1, var2, var3);
            }
         }
      }

   }

   public void method1562(int var1, int var2) {
      class438 var3 = this.field2500[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class438 var5 = this.field2500[var4][var1][var2] = this.field2500[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field3642;

            for(int var6 = 0; var6 < var5.field3632; ++var6) {
               class211 var7 = var5.field3633[var6];
               long var9 = var7.field1831;
               boolean var8 = class291.method1432(var9) == 2;
               if (var8 && var7.field1829 == var1 && var7.field1827 == var2) {
                  --var7.field1825;
               }
            }
         }
      }

      if (this.field2500[0][var1][var2] == null) {
         this.field2500[0][var1][var2] = new class438(0, var1, var2);
      }

      this.field2500[0][var1][var2].field3637 = var3;
      this.field2500[3][var1][var2] = null;
   }

   public void method1563(int var1, int var2, int var3, int var4) {
      class438 var5 = this.field2500[var1][var2][var3];
      if (var5 != null) {
         this.field2500[var1][var2][var3].field3636 = var4;
      }
   }

   public void method1564(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class151 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class151(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2500[var22][var2][var3] == null) {
               this.field2500[var22][var2][var3] = new class438(var22, var2, var3);
            }
         }

         this.field2500[var1][var2][var3].field3622 = var21;
      } else if (var4 != 1) {
         class115 var23 = new class115(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2500[var22][var2][var3] == null) {
               this.field2500[var22][var2][var3] = new class438(var22, var2, var3);
            }
         }

         this.field2500[var1][var2][var3].field3627 = var23;
      } else {
         var21 = new class151(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field2500[var22][var2][var3] == null) {
               this.field2500[var22][var2][var3] = new class438(var22, var2, var3);
            }
         }

         this.field2500[var1][var2][var3].field3622 = var21;
      }
   }

   public void method1565(int var1, int var2, int var3, int var4, class295 var5, long var6, int var8) {
      if (var5 != null) {
         class340 var9 = new class340();
         var9.field2718 = var5;
         var9.field2717 = var2 * 128 + 64;
         var9.field2716 = var3 * 128 + 64;
         var9.field2722 = var4;
         var9.field2719 = var6;
         var9.field2720 = var8;
         if (this.field2500[var1][var2][var3] == null) {
            this.field2500[var1][var2][var3] = new class438(var1, var2, var3);
         }

         this.field2500[var1][var2][var3].field3630 = var9;
      }
   }

   public void method1566(int var1, int var2, int var3, int var4, class295 var5, long var6, class295 var8, class295 var9) {
      class447 var10 = new class447();
      var10.field3694 = var5;
      var10.field3691 = var2 * 128 + 64;
      var10.field3693 = var3 * 128 + 64;
      var10.field3692 = var4;
      var10.field3698 = var6;
      var10.field3695 = var8;
      var10.field3696 = var9;
      int var11 = 0;
      class438 var12 = this.field2500[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.field3632; ++var13) {
            if ((var12.field3633[var13].field1832 & 256) == 256 && var12.field3633[var13].field1822 instanceof class470) {
               class470 var14 = (class470)var12.field3633[var13].field1822;
               var14.method2315();
               if (var14.field2390 > var11) {
                  var11 = var14.field2390;
               }
            }
         }
      }

      var10.field3697 = var11;
      if (this.field2500[var1][var2][var3] == null) {
         this.field2500[var1][var2][var3] = new class438(var1, var2, var3);
      }

      this.field2500[var1][var2][var3].field3631 = var10;
   }

   public void method1567(int var1, int var2, int var3, int var4, class295 var5, class295 var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         class384 var12 = new class384();
         var12.field3237 = var9;
         var12.field3235 = var11;
         var12.field3231 = var2 * 128 + 64;
         var12.field3233 = var3 * 128 + 64;
         var12.field3234 = var4;
         var12.field3230 = var5;
         var12.field3236 = var6;
         var12.field3238 = var7;
         var12.field3232 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.field2500[var13][var2][var3] == null) {
               this.field2500[var13][var2][var3] = new class438(var13, var2, var3);
            }
         }

         this.field2500[var1][var2][var3].field3628 = var12;
      }
   }

   public void method1568(int var1, int var2, int var3, int var4, class295 var5, class295 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         class173 var14 = new class173();
         var14.field1280 = var11;
         var14.field1283 = var13;
         var14.field1281 = var2 * 128 + 64;
         var14.field1282 = var3 * 128 + 64;
         var14.field1291 = var4;
         var14.field1286 = var5;
         var14.field1287 = var6;
         var14.field1288 = var7;
         var14.field1284 = var8;
         var14.field1289 = var9;
         var14.field1285 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.field2500[var15][var2][var3] == null) {
               this.field2500[var15][var2][var3] = new class438(var15, var2, var3);
            }
         }

         this.field2500[var1][var2][var3].field3629 = var14;
      }
   }

   public boolean method1569(int var1, int var2, int var3, int var4, int var5, int var6, class295 var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + var5 * 64;
         int var13 = var3 * 128 + var6 * 64;
         return this.method1571(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean method1604(int var1, int var2, int var3, int var4, int var5, class295 var6, int var7, long var8, boolean var10) {
      if (var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if (var10) {
            if (var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if (var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if (var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if (var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method1571(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method1570(int var1, int var2, int var3, int var4, int var5, class295 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method1571(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean method1571(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class295 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field2530 || var16 >= this.field2498) {
               return false;
            }

            class438 var17 = this.field2500[var1][var15][var16];
            if (var17 != null && var17.field3632 >= 5) {
               return false;
            }
         }
      }

      class211 var21 = new class211();
      var21.field1831 = var12;
      var21.field1832 = var14;
      var21.field1825 = var1;
      var21.field1834 = var6;
      var21.field1823 = var7;
      var21.field1821 = var8;
      var21.field1822 = var9;
      var21.field1830 = var10;
      var21.field1829 = var2;
      var21.field1827 = var3;
      var21.field1826 = var2 + var4 - 1;
      var21.field1828 = var3 + var5 - 1;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var22 = var3; var22 < var3 + var5; ++var22) {
            int var18 = 0;
            if (var16 > var2) {
               ++var18;
            }

            if (var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if (var22 > var3) {
               var18 += 8;
            }

            if (var22 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if (this.field2500[var19][var16][var22] == null) {
                  this.field2500[var19][var16][var22] = new class438(var19, var16, var22);
               }
            }

            class438 var23 = this.field2500[var1][var16][var22];
            var23.field3633[var23.field3632] = var21;
            var23.field3626[var23.field3632] = var18;
            var23.field3635 |= var18;
            ++var23.field3632;
         }
      }

      if (var11) {
         this.field2550[this.field2502++] = var21;
      }

      return true;
   }

   public void method1572() {
      for(int var1 = 0; var1 < this.field2502; ++var1) {
         class211 var2 = this.field2550[var1];
         this.method1573(var2);
         this.field2550[var1] = null;
      }

      this.field2502 = 0;
   }

   void method1573(class211 var1) {
      for(int var2 = var1.field1829; var2 <= var1.field1826; ++var2) {
         for(int var3 = var1.field1827; var3 <= var1.field1828; ++var3) {
            class438 var4 = this.field2500[var1.field1825][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field3632; ++var5) {
                  if (var4.field3633[var5] == var1) {
                     --var4.field3632;

                     for(int var6 = var5; var6 < var4.field3632; ++var6) {
                        var4.field3633[var6] = var4.field3633[var6 + 1];
                        var4.field3626[var6] = var4.field3626[var6 + 1];
                     }

                     var4.field3633[var4.field3632] = null;
                     break;
                  }
               }

               var4.field3635 = 0;

               for(var5 = 0; var5 < var4.field3632; ++var5) {
                  var4.field3635 |= var4.field3626[var5];
               }
            }
         }
      }

   }

   public void method1574(int var1, int var2, int var3, int var4) {
      class438 var5 = this.field2500[var1][var2][var3];
      if (var5 != null) {
         class173 var6 = var5.field3629;
         if (var6 != null) {
            var6.field1289 = var6.field1289 * var4 / 16;
            var6.field1285 = var6.field1285 * var4 / 16;
         }
      }
   }

   public void method1605(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      if (var4 != null) {
         var4.field3628 = null;
      }
   }

   public void method1610(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      if (var4 != null) {
         var4.field3629 = null;
      }
   }

   public void method1601(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field3632; ++var5) {
            class211 var6 = var4.field3633[var5];
            long var8 = var6.field1831;
            boolean var7 = class291.method1432(var8) == 2;
            if (var7 && var6.field1829 == var2 && var6.field1827 == var3) {
               this.method1573(var6);
               return;
            }
         }

      }
   }

   public void method1576(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      if (var4 != null) {
         var4.field3630 = null;
      }
   }

   public void method1577(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      if (var4 != null) {
         var4.field3631 = null;
      }
   }

   public class384 method1578(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      return var4 == null ? null : var4.field3628;
   }

   public class173 method1612(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      return var4 == null ? null : var4.field3629;
   }

   public class211 method1580(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field3632; ++var5) {
            class211 var6 = var4.field3633[var5];
            long var8 = var6.field1831;
            boolean var7 = class291.method1432(var8) == 2;
            if (var7 && var6.field1829 == var2 && var6.field1827 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public class340 method1602(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      return var4 != null && var4.field3630 != null ? var4.field3630 : null;
   }

   public long method1613(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      return var4 != null && var4.field3628 != null ? var4.field3628.field3237 : 0L;
   }

   public long method1608(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      return var4 != null && var4.field3629 != null ? var4.field3629.field1280 : 0L;
   }

   public long method1611(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field3632; ++var5) {
            class211 var6 = var4.field3633[var5];
            long var8 = var6.field1831;
            boolean var7 = class291.method1432(var8) == 2;
            if (var7 && var6.field1829 == var2 && var6.field1827 == var3) {
               return var6.field1831;
            }
         }

         return 0L;
      }
   }

   public long method1581(int var1, int var2, int var3) {
      class438 var4 = this.field2500[var1][var2][var3];
      return var4 != null && var4.field3630 != null ? var4.field3630.field2719 : 0L;
   }

   public int method1607(int var1, int var2, int var3, long var4) {
      class438 var6 = this.field2500[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field3628 != null && var6.field3628.field3237 == var4) {
         return var6.field3628.field3235 & 255;
      } else if (var6.field3629 != null && var6.field3629.field1280 == var4) {
         return var6.field3629.field1283 & 255;
      } else if (var6.field3630 != null && var6.field3630.field2719 == var4) {
         return var6.field3630.field2720 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field3632; ++var7) {
            if (var6.field3633[var7].field1831 == var4) {
               return var6.field3633[var7].field1832 & 255;
            }
         }

         return -1;
      }
   }

   public void method1582(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2496; ++var4) {
         for(int var5 = 0; var5 < this.field2530; ++var5) {
            for(int var6 = 0; var6 < this.field2498; ++var6) {
               class438 var7 = this.field2500[var4][var5][var6];
               if (var7 != null) {
                  class384 var8 = var7.field3628;
                  class26 var10;
                  if (var8 != null && var8.field3230 instanceof class26) {
                     class26 var9 = (class26)var8.field3230;
                     this.method1600(var9, var4, var5, var6, 1, 1);
                     if (var8.field3236 instanceof class26) {
                        var10 = (class26)var8.field3236;
                        this.method1600(var10, var4, var5, var6, 1, 1);
                        class26.method120(var9, var10, 0, 0, 0, false);
                        var8.field3236 = var10.method121(var10.field146, var10.field154, var1, var2, var3);
                     }

                     var8.field3230 = var9.method121(var9.field146, var9.field154, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field3632; ++var12) {
                     class211 var14 = var7.field3633[var12];
                     if (var14 != null && var14.field1822 instanceof class26) {
                        class26 var11 = (class26)var14.field1822;
                        this.method1600(var11, var4, var5, var6, var14.field1826 - var14.field1829 + 1, var14.field1828 - var14.field1827 + 1);
                        var14.field1822 = var11.method121(var11.field146, var11.field154, var1, var2, var3);
                     }
                  }

                  class340 var13 = var7.field3630;
                  if (var13 != null && var13.field2718 instanceof class26) {
                     var10 = (class26)var13.field2718;
                     this.method1583(var10, var4, var5, var6);
                     var13.field2718 = var10.method121(var10.field146, var10.field154, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void method1583(class26 var1, int var2, int var3, int var4) {
      class438 var5;
      class26 var6;
      if (var3 < this.field2530) {
         var5 = this.field2500[var2][var3 + 1][var4];
         if (var5 != null && var5.field3630 != null && var5.field3630.field2718 instanceof class26) {
            var6 = (class26)var5.field3630.field2718;
            class26.method120(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.field2530) {
         var5 = this.field2500[var2][var3][var4 + 1];
         if (var5 != null && var5.field3630 != null && var5.field3630.field2718 instanceof class26) {
            var6 = (class26)var5.field3630.field2718;
            class26.method120(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.field2530 && var4 < this.field2498) {
         var5 = this.field2500[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.field3630 != null && var5.field3630.field2718 instanceof class26) {
            var6 = (class26)var5.field3630.field2718;
            class26.method120(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.field2530 && var4 > 0) {
         var5 = this.field2500[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.field3630 != null && var5.field3630.field2718 instanceof class26) {
            var6 = (class26)var5.field3630.field2718;
            class26.method120(var1, var6, 128, 0, -128, true);
         }
      }

   }

   void method1600(class26 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field2496) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field2530) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field2498 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class438 var15 = this.field2500[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.field2541[var12][var13][var14] + this.field2541[var12][var13 + 1][var14] + this.field2541[var12][var13][var14 + 1] + this.field2541[var12][var13 + 1][var14 + 1]) / 4 - (this.field2541[var2][var3][var4] + this.field2541[var2][var3 + 1][var4] + this.field2541[var2][var3][var4 + 1] + this.field2541[var2][var3 + 1][var4 + 1]) / 4;
                           class384 var17 = var15.field3628;
                           if (var17 != null) {
                              class26 var18;
                              if (var17.field3230 instanceof class26) {
                                 var18 = (class26)var17.field3230;
                                 class26.method120(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field3236 instanceof class26) {
                                 var18 = (class26)var17.field3236;
                                 class26.method120(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field3632; ++var23) {
                              class211 var19 = var15.field3633[var23];
                              if (var19 != null && var19.field1822 instanceof class26) {
                                 class26 var20 = (class26)var19.field1822;
                                 int var21 = var19.field1826 - var19.field1829 + 1;
                                 int var22 = var19.field1828 - var19.field1827 + 1;
                                 class26.method120(var1, var20, (var19.field1829 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field1827 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   public void method1584(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class438 var7 = this.field2500[var4][var5][var6];
      if (var7 != null) {
         class151 var8 = var7.field3622;
         int var10;
         if (var8 != null) {
            int var18 = var8.field1172;
            if (var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            class115 var9 = var7.field3627;
            if (var9 != null) {
               var10 = var9.field852;
               int var11 = var9.field873;
               int var12 = var9.field859;
               int var13 = var9.field869;
               int[] var14 = this.field2543[var10];
               int[] var15 = this.field2544[var11];
               int var16 = 0;
               int var17;
               if (var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if (var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if (var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   public void method1599(int var1, int var2, int var3, boolean var4) {
      if (!method1587() || var4) {
         field2522 = true;
         field2510 = var4;
         field2523 = var1;
         field2524 = var2;
         field2505 = var3;
         field2526 = -1;
         field2529 = -1;
      }
   }

   public void method1606() {
      field2510 = true;
   }

   public void method1589(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field2530 * 128) {
         var1 = this.field2530 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field2498 * 128) {
         var3 = this.field2498 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++field2509;
      field2499 = class341.field2726[var4];
      field2521 = class341.field2744[var4];
      field2519 = class341.field2726[var5];
      field2520 = class341.field2744[var5];
      field2546 = field2545[(var4 - 128) / 32][var5 / 64];
      field2515 = var1;
      field2516 = var2;
      field2517 = var3;
      field2514 = var1 / 128;
      field2513 = var3 / 128;
      field2508 = var6;
      field2528 = field2514 - 25;
      if (field2528 < 0) {
         field2528 = 0;
      }

      field2512 = field2513 - 25;
      if (field2512 < 0) {
         field2512 = 0;
      }

      field2511 = field2514 + 25;
      if (field2511 > this.field2530) {
         field2511 = this.field2530;
      }

      field2501 = field2513 + 25;
      if (field2501 > this.field2498) {
         field2501 = this.field2498;
      }

      this.method1594();
      field2507 = 0;

      int var7;
      class438[][] var8;
      int var9;
      int var10;
      for(var7 = this.field2504; var7 < this.field2496; ++var7) {
         var8 = this.field2500[var7];

         for(var9 = field2528; var9 < field2511; ++var9) {
            for(var10 = field2512; var10 < field2501; ++var10) {
               class438 var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.field3636 > var6 || !field2546[var9 - field2514 + 25][var10 - field2513 + 25] && this.field2541[var7][var9][var10] - var2 < 2000) {
                     var11.field3644 = false;
                     var11.field3638 = false;
                     var11.field3640 = 0;
                  } else {
                     var11.field3644 = true;
                     var11.field3638 = true;
                     if (var11.field3632 > 0) {
                        var11.field3639 = true;
                     } else {
                        var11.field3639 = false;
                     }

                     ++field2507;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class438 var15;
      int var16;
      for(var7 = this.field2504; var7 < this.field2496; ++var7) {
         var8 = this.field2500[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field2514 + var9;
            var16 = field2514 - var9;
            if (var10 >= field2528 || var16 < field2511) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field2513 + var12;
                  var14 = field2513 - var12;
                  if (var10 >= field2528) {
                     if (var13 >= field2512) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field3644) {
                           this.method1590(var15, true);
                        }
                     }

                     if (var14 < field2501) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field3644) {
                           this.method1590(var15, true);
                        }
                     }
                  }

                  if (var16 < field2511) {
                     if (var13 >= field2512) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field3644) {
                           this.method1590(var15, true);
                        }
                     }

                     if (var14 < field2501) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field3644) {
                           this.method1590(var15, true);
                        }
                     }
                  }

                  if (field2507 == 0) {
                     field2522 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field2504; var7 < this.field2496; ++var7) {
         var8 = this.field2500[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field2514 + var9;
            var16 = field2514 - var9;
            if (var10 >= field2528 || var16 < field2511) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field2513 + var12;
                  var14 = field2513 - var12;
                  if (var10 >= field2528) {
                     if (var13 >= field2512) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field3644) {
                           this.method1590(var15, false);
                        }
                     }

                     if (var14 < field2501) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field3644) {
                           this.method1590(var15, false);
                        }
                     }
                  }

                  if (var16 < field2511) {
                     if (var13 >= field2512) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field3644) {
                           this.method1590(var15, false);
                        }
                     }

                     if (var14 < field2501) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field3644) {
                           this.method1590(var15, false);
                        }
                     }
                  }

                  if (field2507 == 0) {
                     field2522 = false;
                     return;
                  }
               }
            }
         }
      }

      field2522 = false;
   }

   void method1590(class438 var1, boolean var2) {
      field2534.method642(var1);

      while(true) {
         class438 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class438[][] var8;
         class438 var9;
         int var11;
         int var14;
         int var15;
         int var16;
         int var24;
         int var26;
         do {
            do {
               do {
                  do {
                     do {
                        do {
                           while(true) {
                              class384 var10;
                              class211 var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              class438 var33;
                              while(true) {
                                 do {
                                    var3 = (class438)field2534.method645();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field3638);

                                 var4 = var3.field3623;
                                 var5 = var3.field3624;
                                 var6 = var3.field3642;
                                 var7 = var3.field3625;
                                 var8 = this.field2500[var6];
                                 if (!var3.field3644) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.field2500[var6 - 1][var4][var5];
                                       if (var9 != null && var9.field3638) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= field2514 && var4 > field2528) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.field3638 && (var9.field3644 || (var3.field3635 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= field2514 && var4 < field2511 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.field3638 && (var9.field3644 || (var3.field3635 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= field2513 && var5 > field2512) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.field3638 && (var9.field3644 || (var3.field3635 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= field2513 && var5 < field2501 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.field3638 && (var9.field3644 || (var3.field3635 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field3644 = false;
                                 if (var3.field3637 != null) {
                                    var9 = var3.field3637;
                                    if (var9.field3622 != null) {
                                       if (!this.method1595(0, var4, var5)) {
                                          this.method1591(var9.field3622, 0, field2499, field2521, field2519, field2520, var4, var5);
                                       }
                                    } else if (var9.field3627 != null && !this.method1595(0, var4, var5)) {
                                       this.method1592(var9.field3627, field2499, field2521, field2519, field2520, var4, var5);
                                    }

                                    var10 = var9.field3628;
                                    if (var10 != null) {
                                       var10.field3230.method1439(0, field2499, field2521, field2519, field2520, var10.field3231 - field2515, var10.field3234 - field2516, var10.field3233 - field2517, var10.field3237);
                                    }

                                    for(var11 = 0; var11 < var9.field3632; ++var11) {
                                       var12 = var9.field3633[var11];
                                       if (var12 != null) {
                                          var12.field1822.method1439(var12.field1830, field2499, field2521, field2519, field2520, var12.field1834 - field2515, var12.field1821 - field2516, var12.field1823 - field2517, var12.field1831);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.field3622 != null) {
                                    if (!this.method1595(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.field3622.field1174 != 12345678 || field2522 && var6 <= field2523) {
                                          this.method1591(var3.field3622, var7, field2499, field2521, field2519, field2520, var4, var5);
                                       }
                                    }
                                 } else if (var3.field3627 != null && !this.method1595(var7, var4, var5)) {
                                    var22 = true;
                                    this.method1592(var3.field3627, field2499, field2521, field2519, field2520, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class384 var23 = var3.field3628;
                                 class173 var13 = var3.field3629;
                                 if (var23 != null || var13 != null) {
                                    if (field2514 == var4) {
                                       ++var21;
                                    } else if (field2514 < var4) {
                                       var21 += 2;
                                    }

                                    if (field2513 == var5) {
                                       var21 += 3;
                                    } else if (field2513 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field2535[var21];
                                    var3.field3643 = field2537[var21];
                                 }

                                 if (var23 != null) {
                                    if ((var23.field3238 & field2536[var21]) != 0) {
                                       if (var23.field3238 == 16) {
                                          var3.field3640 = 3;
                                          var3.field3641 = field2538[var21];
                                          var3.field3634 = 3 - var3.field3641;
                                       } else if (var23.field3238 == 32) {
                                          var3.field3640 = 6;
                                          var3.field3641 = field2518[var21];
                                          var3.field3634 = 6 - var3.field3641;
                                       } else if (var23.field3238 == 64) {
                                          var3.field3640 = 12;
                                          var3.field3641 = field2539[var21];
                                          var3.field3634 = 12 - var3.field3641;
                                       } else {
                                          var3.field3640 = 9;
                                          var3.field3641 = field2540[var21];
                                          var3.field3634 = 9 - var3.field3641;
                                       }
                                    } else {
                                       var3.field3640 = 0;
                                    }

                                    if ((var23.field3238 & var11) != 0 && !this.method1596(var7, var4, var5, var23.field3238)) {
                                       var23.field3230.method1439(0, field2499, field2521, field2519, field2520, var23.field3231 - field2515, var23.field3234 - field2516, var23.field3233 - field2517, var23.field3237);
                                    }

                                    if ((var23.field3232 & var11) != 0 && !this.method1596(var7, var4, var5, var23.field3232)) {
                                       var23.field3236.method1439(0, field2499, field2521, field2519, field2520, var23.field3231 - field2515, var23.field3234 - field2516, var23.field3233 - field2517, var23.field3237);
                                    }
                                 }

                                 if (var13 != null && !this.method1597(var7, var4, var5, var13.field1286.field2390)) {
                                    if ((var13.field1288 & var11) != 0) {
                                       var13.field1286.method1439(0, field2499, field2521, field2519, field2520, var13.field1281 - field2515 + var13.field1289, var13.field1291 - field2516, var13.field1282 - field2517 + var13.field1285, var13.field1280);
                                    } else if (var13.field1288 == 256) {
                                       var14 = var13.field1281 - field2515;
                                       var15 = var13.field1291 - field2516;
                                       var16 = var13.field1282 - field2517;
                                       var17 = var13.field1284;
                                       if (var17 != 1 && var17 != 2) {
                                          var18 = var14;
                                       } else {
                                          var18 = -var14;
                                       }

                                       int var19;
                                       if (var17 != 2 && var17 != 3) {
                                          var19 = var16;
                                       } else {
                                          var19 = -var16;
                                       }

                                       if (var19 < var18) {
                                          var13.field1286.method1439(0, field2499, field2521, field2519, field2520, var14 + var13.field1289, var15, var16 + var13.field1285, var13.field1280);
                                       } else if (var13.field1287 != null) {
                                          var13.field1287.method1439(0, field2499, field2521, field2519, field2520, var14, var15, var16, var13.field1280);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    class340 var27 = var3.field3630;
                                    if (var27 != null) {
                                       var27.field2718.method1439(0, field2499, field2521, field2519, field2520, var27.field2717 - field2515, var27.field2722 - field2516, var27.field2716 - field2517, var27.field2719);
                                    }

                                    class447 var31 = var3.field3631;
                                    if (var31 != null && var31.field3697 == 0) {
                                       if (var31.field3695 != null) {
                                          var31.field3695.method1439(0, field2499, field2521, field2519, field2520, var31.field3691 - field2515, var31.field3692 - field2516, var31.field3693 - field2517, var31.field3698);
                                       }

                                       if (var31.field3696 != null) {
                                          var31.field3696.method1439(0, field2499, field2521, field2519, field2520, var31.field3691 - field2515, var31.field3692 - field2516, var31.field3693 - field2517, var31.field3698);
                                       }

                                       if (var31.field3694 != null) {
                                          var31.field3694.method1439(0, field2499, field2521, field2519, field2520, var31.field3691 - field2515, var31.field3692 - field2516, var31.field3693 - field2517, var31.field3698);
                                       }
                                    }
                                 }

                                 var14 = var3.field3635;
                                 if (var14 != 0) {
                                    if (var4 < field2514 && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.field3638) {
                                          field2534.method642(var33);
                                       }
                                    }

                                    if (var5 < field2513 && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.field3638) {
                                          field2534.method642(var33);
                                       }
                                    }

                                    if (var4 > field2514 && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.field3638) {
                                          field2534.method642(var33);
                                       }
                                    }

                                    if (var5 > field2513 && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.field3638) {
                                          field2534.method642(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.field3640 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.field3632; ++var21) {
                                    if (var3.field3633[var21].field1820 != field2509 && (var3.field3626[var21] & var3.field3640) == var3.field3641) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.field3628;
                                    if (!this.method1596(var7, var4, var5, var10.field3238)) {
                                       var10.field3230.method1439(0, field2499, field2521, field2519, field2520, var10.field3231 - field2515, var10.field3234 - field2516, var10.field3233 - field2517, var10.field3237);
                                    }

                                    var3.field3640 = 0;
                                 }
                              }

                              if (!var3.field3639) {
                                 break;
                              }

                              try {
                                 int var25 = var3.field3632;
                                 var3.field3639 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.field3633[var11];
                                    if (var12.field1820 != field2509) {
                                       for(var26 = var12.field1829; var26 <= var12.field1826; ++var26) {
                                          for(var14 = var12.field1827; var14 <= var12.field1828; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.field3644) {
                                                var3.field3639 = true;
                                                continue label563;
                                             }

                                             if (var33.field3640 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.field1829) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.field1826) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.field1827) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.field1828) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.field3640) == var3.field3634) {
                                                   var3.field3639 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field2495[var21++] = var12;
                                       var26 = field2514 - var12.field1829;
                                       var14 = var12.field1826 - field2514;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = field2513 - var12.field1827;
                                       var16 = var12.field1828 - field2513;
                                       if (var16 > var15) {
                                          var12.field1824 = var26 + var16;
                                       } else {
                                          var12.field1824 = var26 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       class211 var34 = field2495[var26];
                                       if (var34.field1820 != field2509) {
                                          if (var34.field1824 > var11) {
                                             var11 = var34.field1824;
                                             var24 = var26;
                                          } else if (var34.field1824 == var11) {
                                             var15 = var34.field1834 - field2515;
                                             var16 = var34.field1823 - field2517;
                                             var17 = field2495[var24].field1834 - field2515;
                                             var18 = field2495[var24].field1823 - field2517;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    class211 var35 = field2495[var24];
                                    var35.field1820 = field2509;
                                    if (!this.method1598(var7, var35.field1829, var35.field1826, var35.field1827, var35.field1828, var35.field1822.field2390)) {
                                       var35.field1822.method1439(var35.field1830, field2499, field2521, field2519, field2520, var35.field1834 - field2515, var35.field1821 - field2516, var35.field1823 - field2517, var35.field1831);
                                    }

                                    for(var14 = var35.field1829; var14 <= var35.field1826; ++var14) {
                                       for(var15 = var35.field1827; var15 <= var35.field1828; ++var15) {
                                          class438 var36 = var8[var14][var15];
                                          if (var36.field3640 != 0) {
                                             field2534.method642(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.field3638) {
                                             field2534.method642(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.field3639) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.field3639 = false;
                                 break;
                              }
                           }
                        } while(!var3.field3638);
                     } while(var3.field3640 != 0);

                     if (var4 > field2514 || var4 <= field2528) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field3638);

                  if (var4 < field2514 || var4 >= field2511 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field3638);

               if (var5 > field2513 || var5 <= field2512) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field3638);

            if (var5 < field2513 || var5 >= field2501 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field3638);

         var3.field3638 = false;
         --field2507;
         class447 var29 = var3.field3631;
         if (var29 != null && var29.field3697 != 0) {
            if (var29.field3695 != null) {
               var29.field3695.method1439(0, field2499, field2521, field2519, field2520, var29.field3691 - field2515, var29.field3692 - field2516 - var29.field3697, var29.field3693 - field2517, var29.field3698);
            }

            if (var29.field3696 != null) {
               var29.field3696.method1439(0, field2499, field2521, field2519, field2520, var29.field3691 - field2515, var29.field3692 - field2516 - var29.field3697, var29.field3693 - field2517, var29.field3698);
            }

            if (var29.field3694 != null) {
               var29.field3694.method1439(0, field2499, field2521, field2519, field2520, var29.field3691 - field2515, var29.field3692 - field2516 - var29.field3697, var29.field3693 - field2517, var29.field3698);
            }
         }

         if (var3.field3643 != 0) {
            class173 var30 = var3.field3629;
            if (var30 != null && !this.method1597(var7, var4, var5, var30.field1286.field2390)) {
               if ((var30.field1288 & var3.field3643) != 0) {
                  var30.field1286.method1439(0, field2499, field2521, field2519, field2520, var30.field1281 - field2515 + var30.field1289, var30.field1291 - field2516, var30.field1282 - field2517 + var30.field1285, var30.field1280);
               } else if (var30.field1288 == 256) {
                  var11 = var30.field1281 - field2515;
                  var24 = var30.field1291 - field2516;
                  var26 = var30.field1282 - field2517;
                  var14 = var30.field1284;
                  if (var14 != 1 && var14 != 2) {
                     var15 = var11;
                  } else {
                     var15 = -var11;
                  }

                  if (var14 != 2 && var14 != 3) {
                     var16 = var26;
                  } else {
                     var16 = -var26;
                  }

                  if (var16 >= var15) {
                     var30.field1286.method1439(0, field2499, field2521, field2519, field2520, var11 + var30.field1289, var24, var26 + var30.field1285, var30.field1280);
                  } else if (var30.field1287 != null) {
                     var30.field1287.method1439(0, field2499, field2521, field2519, field2520, var11, var24, var26, var30.field1280);
                  }
               }
            }

            class384 var28 = var3.field3628;
            if (var28 != null) {
               if ((var28.field3232 & var3.field3643) != 0 && !this.method1596(var7, var4, var5, var28.field3232)) {
                  var28.field3236.method1439(0, field2499, field2521, field2519, field2520, var28.field3231 - field2515, var28.field3234 - field2516, var28.field3233 - field2517, var28.field3237);
               }

               if ((var28.field3238 & var3.field3643) != 0 && !this.method1596(var7, var4, var5, var28.field3238)) {
                  var28.field3230.method1439(0, field2499, field2521, field2519, field2520, var28.field3231 - field2515, var28.field3234 - field2516, var28.field3233 - field2517, var28.field3237);
               }
            }
         }

         class438 var32;
         if (var6 < this.field2496 - 1) {
            var32 = this.field2500[var6 + 1][var4][var5];
            if (var32 != null && var32.field3638) {
               field2534.method642(var32);
            }
         }

         if (var4 < field2514) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.field3638) {
               field2534.method642(var32);
            }
         }

         if (var5 < field2513) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.field3638) {
               field2534.method642(var32);
            }
         }

         if (var4 > field2514) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.field3638) {
               field2534.method642(var32);
            }
         }

         if (var5 > field2513) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.field3638) {
               field2534.method642(var32);
            }
         }
      }
   }

   void method1591(class151 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field2515;
      int var11;
      int var12 = var11 = (var8 << 7) - field2517;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field2541[var2][var7][var8] - field2516;
      int var18 = this.field2541[var2][var7 + 1][var8] - field2516;
      int var19 = this.field2541[var2][var7 + 1][var8 + 1] - field2516;
      int var20 = this.field2541[var2][var7][var8 + 1] - field2516;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if (var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if (var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if (var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if (var15 >= 50) {
                  int var22 = class341.field2731 + var10 * class341.field2730 / var12;
                  int var23 = class341.field2743 + var17 * class341.field2730 / var12;
                  int var24 = class341.field2731 + var14 * class341.field2730 / var11;
                  int var25 = class341.field2743 + var18 * class341.field2730 / var11;
                  int var26 = class341.field2731 + var13 * class341.field2730 / var16;
                  int var27 = class341.field2743 + var19 * class341.field2730 / var16;
                  int var28 = class341.field2731 + var9 * class341.field2730 / var15;
                  int var29 = class341.field2743 + var21 * class341.field2730 / var15;
                  class341.field2727 = 0;
                  int var30;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class341.field2739 = false;
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > class341.field2733 || var28 > class341.field2733 || var24 > class341.field2733) {
                        class341.field2739 = true;
                     }

                     if (field2522 && method1593(field2524, field2505, var27, var29, var25, var26, var28, var24)) {
                        field2526 = var7;
                        field2529 = var8;
                     }

                     if (var1.field1176 == -1) {
                        if (var1.field1174 != 12345678) {
                           class341.method1730(var27, var29, var25, var26, var28, var24, var1.field1174, var1.field1175, var1.field1178);
                        }
                     } else if (!field2525) {
                        if (var1.field1177) {
                           class341.method1733(var27, var29, var25, var26, var28, var24, var1.field1174, var1.field1175, var1.field1178, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1176);
                        } else {
                           class341.method1733(var27, var29, var25, var26, var28, var24, var1.field1174, var1.field1175, var1.field1178, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field1176);
                        }
                     } else {
                        var30 = class341.field2728.method1496(var1.field1176);
                        class341.method1730(var27, var29, var25, var26, var28, var24, method1575(var30, var1.field1174), method1575(var30, var1.field1175), method1575(var30, var1.field1178));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class341.field2739 = false;
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > class341.field2733 || var24 > class341.field2733 || var28 > class341.field2733) {
                        class341.field2739 = true;
                     }

                     if (field2522 && method1593(field2524, field2505, var23, var25, var29, var22, var24, var28)) {
                        field2526 = var7;
                        field2529 = var8;
                     }

                     if (var1.field1176 == -1) {
                        if (var1.field1179 != 12345678) {
                           class341.method1730(var23, var25, var29, var22, var24, var28, var1.field1179, var1.field1178, var1.field1175);
                        }
                     } else if (!field2525) {
                        class341.method1733(var23, var25, var29, var22, var24, var28, var1.field1179, var1.field1178, var1.field1175, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field1176);
                     } else {
                        var30 = class341.field2728.method1496(var1.field1176);
                        class341.method1730(var23, var25, var29, var22, var24, var28, method1575(var30, var1.field1179), method1575(var30, var1.field1178), method1575(var30, var1.field1175));
                     }
                  }

               }
            }
         }
      }
   }

   void method1592(class115 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field866.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field866[var9] - field2515;
         var11 = var1.field853[var9] - field2516;
         var12 = var1.field854[var9] - field2517;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.field861 != null) {
            class115.field860[var9] = var10;
            class115.field864[var9] = var13;
            class115.field871[var9] = var12;
         }

         class115.field865[var9] = class341.field2731 + var10 * class341.field2730 / var12;
         class115.field868[var9] = class341.field2743 + var13 * class341.field2730 / var12;
      }

      class341.field2727 = 0;
      var8 = var1.field858.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field858[var9];
         var11 = var1.field870[var9];
         var12 = var1.field862[var9];
         var13 = class115.field865[var10];
         int var14 = class115.field865[var11];
         int var15 = class115.field865[var12];
         int var16 = class115.field868[var10];
         int var17 = class115.field868[var11];
         int var18 = class115.field868[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class341.field2739 = false;
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > class341.field2733 || var14 > class341.field2733 || var15 > class341.field2733) {
               class341.field2739 = true;
            }

            if (field2522 && method1593(field2524, field2505, var16, var17, var18, var13, var14, var15)) {
               field2526 = var6;
               field2529 = var7;
            }

            if (var1.field861 != null && var1.field861[var9] != -1) {
               if (!field2525) {
                  if (var1.field863) {
                     class341.method1733(var16, var17, var18, var13, var14, var15, var1.field855[var9], var1.field856[var9], var1.field857[var9], class115.field860[0], class115.field860[1], class115.field860[3], class115.field864[0], class115.field864[1], class115.field864[3], class115.field871[0], class115.field871[1], class115.field871[3], var1.field861[var9]);
                  } else {
                     class341.method1733(var16, var17, var18, var13, var14, var15, var1.field855[var9], var1.field856[var9], var1.field857[var9], class115.field860[var10], class115.field860[var11], class115.field860[var12], class115.field864[var10], class115.field864[var11], class115.field864[var12], class115.field871[var10], class115.field871[var11], class115.field871[var12], var1.field861[var9]);
                  }
               } else {
                  int var19 = class341.field2728.method1496(var1.field861[var9]);
                  class341.method1730(var16, var17, var18, var13, var14, var15, method1575(var19, var1.field855[var9]), method1575(var19, var1.field856[var9]), method1575(var19, var1.field857[var9]));
               }
            } else if (var1.field855[var9] != 12345678) {
               class341.method1730(var16, var17, var18, var13, var14, var15, var1.field855[var9], var1.field856[var9], var1.field857[var9]);
            }
         }
      }

   }

   void method1594() {
      int var1 = field2542[field2508];
      class174[] var2 = field2527[field2508];
      field2532 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class174 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.field1296 == 1) {
            var5 = var4.field1292 - field2514 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field1298 - field2513 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1303 - field2513 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2546[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2515 - var4.field1297;
                  if (var9 > 32) {
                     var4.field1295 = 1;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field1295 = 2;
                     var9 = -var9;
                  }

                  var4.field1306 = (var4.field1299 - field2517 << 8) / var9;
                  var4.field1307 = (var4.field1294 - field2517 << 8) / var9;
                  var4.field1308 = (var4.field1301 - field2516 << 8) / var9;
                  var4.field1309 = (var4.field1302 - field2516 << 8) / var9;
                  field2533[field2532++] = var4;
               }
            }
         } else if (var4.field1296 == 2) {
            var5 = var4.field1298 - field2513 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field1292 - field2514 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1293 - field2514 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field2546[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field2517 - var4.field1299;
                  if (var9 > 32) {
                     var4.field1295 = 3;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field1295 = 4;
                     var9 = -var9;
                  }

                  var4.field1304 = (var4.field1297 - field2515 << 8) / var9;
                  var4.field1305 = (var4.field1300 - field2515 << 8) / var9;
                  var4.field1308 = (var4.field1301 - field2516 << 8) / var9;
                  var4.field1309 = (var4.field1302 - field2516 << 8) / var9;
                  field2533[field2532++] = var4;
               }
            }
         } else if (var4.field1296 == 4) {
            var5 = var4.field1301 - field2516;
            if (var5 > 128) {
               var6 = var4.field1298 - field2513 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field1303 - field2513 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.field1292 - field2514 + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field1293 - field2514 + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label144:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (field2546[var11][var12]) {
                           var10 = true;
                           break label144;
                        }
                     }
                  }

                  if (var10) {
                     var4.field1295 = 5;
                     var4.field1304 = (var4.field1297 - field2515 << 8) / var5;
                     var4.field1305 = (var4.field1300 - field2515 << 8) / var5;
                     var4.field1306 = (var4.field1299 - field2517 << 8) / var5;
                     var4.field1307 = (var4.field1294 - field2517 << 8) / var5;
                     field2533[field2532++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean method1595(int var1, int var2, int var3) {
      int var4 = this.field2503[var1][var2][var3];
      if (var4 == -field2509) {
         return false;
      } else if (var4 == field2509) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method1579(var5 + 1, this.field2541[var1][var2][var3], var6 + 1) && this.method1579(var5 + 128 - 1, this.field2541[var1][var2 + 1][var3], var6 + 1) && this.method1579(var5 + 128 - 1, this.field2541[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method1579(var5 + 1, this.field2541[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field2503[var1][var2][var3] = field2509;
            return true;
         } else {
            this.field2503[var1][var2][var3] = -field2509;
            return false;
         }
      }
   }

   boolean method1596(int var1, int var2, int var3, int var4) {
      if (!this.method1595(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field2541[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > field2515) {
                  if (!this.method1579(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method1579(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1579(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method1579(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1579(var5, var9, var6)) {
                  return false;
               }

               if (!this.method1579(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < field2517) {
                  if (!this.method1579(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method1579(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1579(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method1579(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1579(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method1579(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < field2515) {
                  if (!this.method1579(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method1579(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1579(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method1579(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method1579(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method1579(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > field2517) {
                  if (!this.method1579(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method1579(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method1579(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method1579(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method1579(var5, var9, var6)) {
                  return false;
               }

               if (!this.method1579(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method1579(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method1579(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method1579(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method1579(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.method1579(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean method1597(int var1, int var2, int var3, int var4) {
      if (!this.method1595(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method1579(var5 + 1, this.field2541[var1][var2][var3] - var4, var6 + 1) && this.method1579(var5 + 128 - 1, this.field2541[var1][var2 + 1][var3] - var4, var6 + 1) && this.method1579(var5 + 128 - 1, this.field2541[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method1579(var5 + 1, this.field2541[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method1598(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.method1595(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method1579(var7 + 1, this.field2541[var1][var2][var4] - var6, var8 + 1) && this.method1579(var7 + 128 - 1, this.field2541[var1][var2 + 1][var4] - var6, var8 + 1) && this.method1579(var7 + 128 - 1, this.field2541[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method1579(var7 + 1, this.field2541[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field2503[var1][var7][var8] == -field2509) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field2541[var1][var2][var4] - var6;
         if (!this.method1579(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method1579(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method1579(var7, var9, var11)) {
                  return false;
               } else if (!this.method1579(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean method1579(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field2532; ++var4) {
         class174 var5 = field2533[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field1295 == 1) {
            var6 = var5.field1297 - var1;
            if (var6 > 0) {
               var7 = var5.field1299 + (var5.field1306 * var6 >> 8);
               var8 = var5.field1294 + (var5.field1307 * var6 >> 8);
               var9 = var5.field1301 + (var5.field1308 * var6 >> 8);
               var10 = var5.field1302 + (var5.field1309 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1295 == 2) {
            var6 = var1 - var5.field1297;
            if (var6 > 0) {
               var7 = var5.field1299 + (var5.field1306 * var6 >> 8);
               var8 = var5.field1294 + (var5.field1307 * var6 >> 8);
               var9 = var5.field1301 + (var5.field1308 * var6 >> 8);
               var10 = var5.field1302 + (var5.field1309 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1295 == 3) {
            var6 = var5.field1299 - var3;
            if (var6 > 0) {
               var7 = var5.field1297 + (var5.field1304 * var6 >> 8);
               var8 = var5.field1300 + (var5.field1305 * var6 >> 8);
               var9 = var5.field1301 + (var5.field1308 * var6 >> 8);
               var10 = var5.field1302 + (var5.field1309 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1295 == 4) {
            var6 = var3 - var5.field1299;
            if (var6 > 0) {
               var7 = var5.field1297 + (var5.field1304 * var6 >> 8);
               var8 = var5.field1300 + (var5.field1305 * var6 >> 8);
               var9 = var5.field1301 + (var5.field1308 * var6 >> 8);
               var10 = var5.field1302 + (var5.field1309 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field1295 == 5) {
            var6 = var2 - var5.field1301;
            if (var6 > 0) {
               var7 = var5.field1297 + (var5.field1304 * var6 >> 8);
               var8 = var5.field1300 + (var5.field1305 * var6 >> 8);
               var9 = var5.field1299 + (var5.field1306 * var6 >> 8);
               var10 = var5.field1294 + (var5.field1307 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void method1609(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class174 var8 = new class174();
      var8.field1292 = var2 / 128;
      var8.field1293 = var3 / 128;
      var8.field1298 = var4 / 128;
      var8.field1303 = var5 / 128;
      var8.field1296 = var1;
      var8.field1297 = var2;
      var8.field1300 = var3;
      var8.field1299 = var4;
      var8.field1294 = var5;
      var8.field1301 = var6;
      var8.field1302 = var7;
      field2527[var0][field2542[var0]++] = var8;
   }

   public static void method1585(int[] var0, int var1, int var2, int var3, int var4) {
      field2549 = 0;
      field2497 = 0;
      field2551 = var3;
      field2531 = var4;
      field2547 = var3 / 2;
      field2548 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field2499 = class341.field2726[var6];
            field2521 = class341.field2744[var6];
            field2519 = class341.field2726[var7];
            field2520 = class341.field2744[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method1586(var12, var0[var8] + var15, var13)) {
                        var14 = true;
                        break;
                     }
                  }

                  var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               for(var9 = -25; var9 < 25; ++var9) {
                  boolean var16 = false;

                  label76:
                  for(var11 = -1; var11 <= 1; ++var11) {
                     for(var12 = -1; var12 <= 1; ++var12) {
                        if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }

                        if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                           var16 = true;
                           break label76;
                        }
                     }
                  }

                  field2545[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   static boolean method1586(int var0, int var1, int var2) {
      int var3 = var2 * field2519 + var0 * field2520 >> 16;
      int var4 = var2 * field2520 - var0 * field2519 >> 16;
      int var5 = var1 * field2499 + var4 * field2521 >> 16;
      int var6 = var1 * field2521 - var4 * field2499 >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = field2547 + var3 * 128 / var5;
         int var8 = field2548 + var6 * 128 / var5;
         return var7 >= field2549 && var7 <= field2551 && var8 >= field2497 && var8 <= field2531;
      } else {
         return false;
      }
   }

   public static boolean method1587() {
      return field2510 && field2526 != -1;
   }

   public static void method1588() {
      field2526 = -1;
      field2510 = false;
   }

   static final int method1575(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static boolean method1593(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if (var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if (var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if (var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         if (var8 == 0) {
            if (var9 != 0) {
               return var9 < 0 ? var10 <= 0 : var10 >= 0;
            } else {
               return true;
            }
         } else {
            return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
         }
      }
   }
}
