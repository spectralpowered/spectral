public class class12 {
   public static boolean field91 = true;
   public static int field92 = -1;
   public static int field95 = -1;
   static boolean field76 = false;
   static boolean field88 = false;
   static boolean[][] field112;
   static boolean[][][][] field111;
   static class323[] field61 = new class323[100];
   static class397 field100;
   static class7[] field99;
   static class7[][] field93;
   static int field113;
   static int field114;
   static int field115;
   static int field117;
   static int field63;
   static int field65;
   static int field67;
   static int field71 = 0;
   static int field72 = 4;
   static int field73 = 0;
   static int field74 = 0;
   static int field75;
   static int field77;
   static int field78;
   static int field79;
   static int field80;
   static int field81;
   static int field82;
   static int field83;
   static int field85;
   static int field86;
   static int field87;
   static int field89 = 0;
   static int field90 = 0;
   static int field94;
   static int field97;
   static int field98;
   static int[] field108;
   static final int[] field101;
   static final int[] field102;
   static final int[] field103;
   static final int[] field104;
   static final int[] field105;
   static final int[] field106;
   static final int[] field84;
   class323[] field116 = new class323[5000];
   class448[][][] field66;
   int field62;
   int field64;
   int field68 = 0;
   int field70 = 0;
   int field96;
   int[][] field109 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
   int[][] field110 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
   int[][][] field107;
   int[][][] field69;

   static {
      field108 = new int[field72];
      field93 = new class7[field72][500];
      field98 = 0;
      field99 = new class7[500];
      field100 = new class397();
      field101 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field102 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field103 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field104 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field84 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field105 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field106 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field111 = new boolean[8][32][51][51];
   }

   public class12(int var1, int var2, int var3, int[][][] var4) {
      this.field62 = var1;
      this.field96 = var2;
      this.field64 = var3;
      this.field66 = new class448[var1][var2][var3];
      this.field69 = new int[var1][var2 + 1][var3 + 1];
      this.field107 = var4;
      this.method31();
   }

   public void method31() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field62; ++var1) {
         for(var2 = 0; var2 < this.field96; ++var2) {
            for(int var3 = 0; var3 < this.field64; ++var3) {
               this.field66[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field72; ++var1) {
         for(var2 = 0; var2 < field108[var1]; ++var2) {
            field93[var1][var2] = null;
         }

         field108[var1] = 0;
      }

      for(var1 = 0; var1 < this.field68; ++var1) {
         this.field116[var1] = null;
      }

      this.field68 = 0;

      for(var1 = 0; var1 < field61.length; ++var1) {
         field61[var1] = null;
      }

   }

   public void method73(int var1) {
      this.field70 = var1;

      for(int var2 = 0; var2 < this.field96; ++var2) {
         for(int var3 = 0; var3 < this.field64; ++var3) {
            if (this.field66[var1][var2][var3] == null) {
               this.field66[var1][var2][var3] = new class448(var1, var2, var3);
            }
         }
      }

   }

   public void method32(int var1, int var2) {
      class448 var3 = this.field66[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class448 var5 = this.field66[var4][var1][var2] = this.field66[var4 + 1][var1][var2];
         if (var5 != null) {
            --var5.field3686;

            for(int var6 = 0; var6 < var5.field3676; ++var6) {
               class323 var7 = var5.field3677[var6];
               long var9 = var7.field3038;
               boolean var8 = class484.method2318(var9) == 2;
               if (var8 && var7.field3036 == var1 && var7.field3034 == var2) {
                  --var7.field3032;
               }
            }
         }
      }

      if (this.field66[0][var1][var2] == null) {
         this.field66[0][var1][var2] = new class448(0, var1, var2);
      }

      this.field66[0][var1][var2].field3681 = var3;
      this.field66[3][var1][var2] = null;
   }

   public void method33(int var1, int var2, int var3, int var4) {
      class448 var5 = this.field66[var1][var2][var3];
      if (var5 != null) {
         this.field66[var1][var2][var3].field3680 = var4;
      }
   }

   public void method34(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class211 var21;
      int var22;
      if (var4 == 0) {
         var21 = new class211(var11, var12, var13, var14, -1, var19, false);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field66[var22][var2][var3] == null) {
               this.field66[var22][var2][var3] = new class448(var22, var2, var3);
            }
         }

         this.field66[var1][var2][var3].field3666 = var21;
      } else if (var4 != 1) {
         class49 var23 = new class49(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field66[var22][var2][var3] == null) {
               this.field66[var22][var2][var3] = new class448(var22, var2, var3);
            }
         }

         this.field66[var1][var2][var3].field3671 = var23;
      } else {
         var21 = new class211(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

         for(var22 = var1; var22 >= 0; --var22) {
            if (this.field66[var22][var2][var3] == null) {
               this.field66[var22][var2][var3] = new class448(var22, var2, var3);
            }
         }

         this.field66[var1][var2][var3].field3666 = var21;
      }
   }

   public void method35(int var1, int var2, int var3, int var4, class236 var5, long var6, int var8) {
      if (var5 != null) {
         class344 var9 = new class344();
         var9.field3157 = var5;
         var9.field3156 = var2 * 128 + 64;
         var9.field3155 = var3 * 128 + 64;
         var9.field3161 = var4;
         var9.field3158 = var6;
         var9.field3159 = var8;
         if (this.field66[var1][var2][var3] == null) {
            this.field66[var1][var2][var3] = new class448(var1, var2, var3);
         }

         this.field66[var1][var2][var3].field3674 = var9;
      }
   }

   public void method36(int var1, int var2, int var3, int var4, class236 var5, long var6, class236 var8, class236 var9) {
      class395 var10 = new class395();
      var10.field3474 = var5;
      var10.field3471 = var2 * 128 + 64;
      var10.field3473 = var3 * 128 + 64;
      var10.field3472 = var4;
      var10.field3478 = var6;
      var10.field3475 = var8;
      var10.field3476 = var9;
      int var11 = 0;
      class448 var12 = this.field66[var1][var2][var3];
      if (var12 != null) {
         for(int var13 = 0; var13 < var12.field3676; ++var13) {
            if ((var12.field3677[var13].field3039 & 256) == 256 && var12.field3677[var13].field3029 instanceof class491) {
               class491 var14 = (class491)var12.field3677[var13].field3029;
               var14.method2374();
               if (var14.field2554 > var11) {
                  var11 = var14.field2554;
               }
            }
         }
      }

      var10.field3477 = var11;
      if (this.field66[var1][var2][var3] == null) {
         this.field66[var1][var2][var3] = new class448(var1, var2, var3);
      }

      this.field66[var1][var2][var3].field3675 = var10;
   }

   public void method37(int var1, int var2, int var3, int var4, class236 var5, class236 var6, int var7, int var8, long var9, int var11) {
      if (var5 != null || var6 != null) {
         class176 var12 = new class176();
         var12.field1926 = var9;
         var12.field1924 = var11;
         var12.field1920 = var2 * 128 + 64;
         var12.field1922 = var3 * 128 + 64;
         var12.field1923 = var4;
         var12.field1919 = var5;
         var12.field1925 = var6;
         var12.field1927 = var7;
         var12.field1921 = var8;

         for(int var13 = var1; var13 >= 0; --var13) {
            if (this.field66[var13][var2][var3] == null) {
               this.field66[var13][var2][var3] = new class448(var13, var2, var3);
            }
         }

         this.field66[var1][var2][var3].field3672 = var12;
      }
   }

   public void method38(int var1, int var2, int var3, int var4, class236 var5, class236 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if (var5 != null) {
         class316 var14 = new class316();
         var14.field2996 = var11;
         var14.field2999 = var13;
         var14.field2997 = var2 * 128 + 64;
         var14.field2998 = var3 * 128 + 64;
         var14.field3007 = var4;
         var14.field3002 = var5;
         var14.field3003 = var6;
         var14.field3004 = var7;
         var14.field3000 = var8;
         var14.field3005 = var9;
         var14.field3001 = var10;

         for(int var15 = var1; var15 >= 0; --var15) {
            if (this.field66[var15][var2][var3] == null) {
               this.field66[var15][var2][var3] = new class448(var15, var2, var3);
            }
         }

         this.field66[var1][var2][var3].field3673 = var14;
      }
   }

   public boolean method39(int var1, int var2, int var3, int var4, int var5, int var6, class236 var7, int var8, long var9, int var11) {
      if (var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + var5 * 64;
         int var13 = var3 * 128 + var6 * 64;
         return this.method41(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   public boolean method74(int var1, int var2, int var3, int var4, int var5, class236 var6, int var7, long var8, boolean var10) {
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
         return this.method41(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   public boolean method40(int var1, int var2, int var3, int var4, int var5, class236 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null ? true : this.method41(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   boolean method41(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class236 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if (var15 < 0 || var16 < 0 || var15 >= this.field96 || var16 >= this.field64) {
               return false;
            }

            class448 var17 = this.field66[var1][var15][var16];
            if (var17 != null && var17.field3676 >= 5) {
               return false;
            }
         }
      }

      class323 var21 = new class323();
      var21.field3038 = var12;
      var21.field3039 = var14;
      var21.field3032 = var1;
      var21.field3041 = var6;
      var21.field3030 = var7;
      var21.field3028 = var8;
      var21.field3029 = var9;
      var21.field3037 = var10;
      var21.field3036 = var2;
      var21.field3034 = var3;
      var21.field3033 = var2 + var4 - 1;
      var21.field3035 = var3 + var5 - 1;

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
               if (this.field66[var19][var16][var22] == null) {
                  this.field66[var19][var16][var22] = new class448(var19, var16, var22);
               }
            }

            class448 var23 = this.field66[var1][var16][var22];
            var23.field3677[var23.field3676] = var21;
            var23.field3670[var23.field3676] = var18;
            var23.field3679 |= var18;
            ++var23.field3676;
         }
      }

      if (var11) {
         this.field116[this.field68++] = var21;
      }

      return true;
   }

   public void method42() {
      for(int var1 = 0; var1 < this.field68; ++var1) {
         class323 var2 = this.field116[var1];
         this.method43(var2);
         this.field116[var1] = null;
      }

      this.field68 = 0;
   }

   void method43(class323 var1) {
      for(int var2 = var1.field3036; var2 <= var1.field3033; ++var2) {
         for(int var3 = var1.field3034; var3 <= var1.field3035; ++var3) {
            class448 var4 = this.field66[var1.field3032][var2][var3];
            if (var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field3676; ++var5) {
                  if (var4.field3677[var5] == var1) {
                     --var4.field3676;

                     for(int var6 = var5; var6 < var4.field3676; ++var6) {
                        var4.field3677[var6] = var4.field3677[var6 + 1];
                        var4.field3670[var6] = var4.field3670[var6 + 1];
                     }

                     var4.field3677[var4.field3676] = null;
                     break;
                  }
               }

               var4.field3679 = 0;

               for(var5 = 0; var5 < var4.field3676; ++var5) {
                  var4.field3679 |= var4.field3670[var5];
               }
            }
         }
      }

   }

   public void method44(int var1, int var2, int var3, int var4) {
      class448 var5 = this.field66[var1][var2][var3];
      if (var5 != null) {
         class316 var6 = var5.field3673;
         if (var6 != null) {
            var6.field3005 = var6.field3005 * var4 / 16;
            var6.field3001 = var6.field3001 * var4 / 16;
         }
      }
   }

   public void method75(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      if (var4 != null) {
         var4.field3672 = null;
      }
   }

   public void method80(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      if (var4 != null) {
         var4.field3673 = null;
      }
   }

   public void method71(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      if (var4 != null) {
         for(int var5 = 0; var5 < var4.field3676; ++var5) {
            class323 var6 = var4.field3677[var5];
            long var8 = var6.field3038;
            boolean var7 = class484.method2318(var8) == 2;
            if (var7 && var6.field3036 == var2 && var6.field3034 == var3) {
               this.method43(var6);
               return;
            }
         }

      }
   }

   public void method46(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      if (var4 != null) {
         var4.field3674 = null;
      }
   }

   public void method47(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      if (var4 != null) {
         var4.field3675 = null;
      }
   }

   public class176 method48(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      return var4 == null ? null : var4.field3672;
   }

   public class316 method82(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      return var4 == null ? null : var4.field3673;
   }

   public class323 method50(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      if (var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field3676; ++var5) {
            class323 var6 = var4.field3677[var5];
            long var8 = var6.field3038;
            boolean var7 = class484.method2318(var8) == 2;
            if (var7 && var6.field3036 == var2 && var6.field3034 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   public class344 method72(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      return var4 != null && var4.field3674 != null ? var4.field3674 : null;
   }

   public long method83(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      return var4 != null && var4.field3672 != null ? var4.field3672.field1926 : 0L;
   }

   public long method78(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      return var4 != null && var4.field3673 != null ? var4.field3673.field2996 : 0L;
   }

   public long method81(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      if (var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field3676; ++var5) {
            class323 var6 = var4.field3677[var5];
            long var8 = var6.field3038;
            boolean var7 = class484.method2318(var8) == 2;
            if (var7 && var6.field3036 == var2 && var6.field3034 == var3) {
               return var6.field3038;
            }
         }

         return 0L;
      }
   }

   public long method51(int var1, int var2, int var3) {
      class448 var4 = this.field66[var1][var2][var3];
      return var4 != null && var4.field3674 != null ? var4.field3674.field3158 : 0L;
   }

   public int method77(int var1, int var2, int var3, long var4) {
      class448 var6 = this.field66[var1][var2][var3];
      if (var6 == null) {
         return -1;
      } else if (var6.field3672 != null && var6.field3672.field1926 == var4) {
         return var6.field3672.field1924 & 255;
      } else if (var6.field3673 != null && var6.field3673.field2996 == var4) {
         return var6.field3673.field2999 & 255;
      } else if (var6.field3674 != null && var6.field3674.field3158 == var4) {
         return var6.field3674.field3159 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field3676; ++var7) {
            if (var6.field3677[var7].field3038 == var4) {
               return var6.field3677[var7].field3039 & 255;
            }
         }

         return -1;
      }
   }

   public void method52(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field62; ++var4) {
         for(int var5 = 0; var5 < this.field96; ++var5) {
            for(int var6 = 0; var6 < this.field64; ++var6) {
               class448 var7 = this.field66[var4][var5][var6];
               if (var7 != null) {
                  class176 var8 = var7.field3672;
                  class311 var10;
                  if (var8 != null && var8.field1919 instanceof class311) {
                     class311 var9 = (class311)var8.field1919;
                     this.method70(var9, var4, var5, var6, 1, 1);
                     if (var8.field1925 instanceof class311) {
                        var10 = (class311)var8.field1925;
                        this.method70(var10, var4, var5, var6, 1, 1);
                        class311.method1506(var9, var10, 0, 0, 0, false);
                        var8.field1925 = var10.method1507(var10.field2953, var10.field2961, var1, var2, var3);
                     }

                     var8.field1919 = var9.method1507(var9.field2953, var9.field2961, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field3676; ++var12) {
                     class323 var14 = var7.field3677[var12];
                     if (var14 != null && var14.field3029 instanceof class311) {
                        class311 var11 = (class311)var14.field3029;
                        this.method70(var11, var4, var5, var6, var14.field3033 - var14.field3036 + 1, var14.field3035 - var14.field3034 + 1);
                        var14.field3029 = var11.method1507(var11.field2953, var11.field2961, var1, var2, var3);
                     }
                  }

                  class344 var13 = var7.field3674;
                  if (var13 != null && var13.field3157 instanceof class311) {
                     var10 = (class311)var13.field3157;
                     this.method53(var10, var4, var5, var6);
                     var13.field3157 = var10.method1507(var10.field2953, var10.field2961, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   void method53(class311 var1, int var2, int var3, int var4) {
      class448 var5;
      class311 var6;
      if (var3 < this.field96) {
         var5 = this.field66[var2][var3 + 1][var4];
         if (var5 != null && var5.field3674 != null && var5.field3674.field3157 instanceof class311) {
            var6 = (class311)var5.field3674.field3157;
            class311.method1506(var1, var6, 128, 0, 0, true);
         }
      }

      if (var4 < this.field96) {
         var5 = this.field66[var2][var3][var4 + 1];
         if (var5 != null && var5.field3674 != null && var5.field3674.field3157 instanceof class311) {
            var6 = (class311)var5.field3674.field3157;
            class311.method1506(var1, var6, 0, 0, 128, true);
         }
      }

      if (var3 < this.field96 && var4 < this.field64) {
         var5 = this.field66[var2][var3 + 1][var4 + 1];
         if (var5 != null && var5.field3674 != null && var5.field3674.field3157 instanceof class311) {
            var6 = (class311)var5.field3674.field3157;
            class311.method1506(var1, var6, 128, 0, 128, true);
         }
      }

      if (var3 < this.field96 && var4 > 0) {
         var5 = this.field66[var2][var3 + 1][var4 - 1];
         if (var5 != null && var5.field3674 != null && var5.field3674.field3157 instanceof class311) {
            var6 = (class311)var5.field3674.field3157;
            class311.method1506(var1, var6, 128, 0, -128, true);
         }
      }

   }

   void method70(class311 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if (var12 != this.field62) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if (var13 >= 0 && var13 < this.field96) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if (var14 >= 0 && var14 < this.field64 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class448 var15 = this.field66[var12][var13][var14];
                        if (var15 != null) {
                           int var16 = (this.field107[var12][var13][var14] + this.field107[var12][var13 + 1][var14] + this.field107[var12][var13][var14 + 1] + this.field107[var12][var13 + 1][var14 + 1]) / 4 - (this.field107[var2][var3][var4] + this.field107[var2][var3 + 1][var4] + this.field107[var2][var3][var4 + 1] + this.field107[var2][var3 + 1][var4 + 1]) / 4;
                           class176 var17 = var15.field3672;
                           if (var17 != null) {
                              class311 var18;
                              if (var17.field1919 instanceof class311) {
                                 var18 = (class311)var17.field1919;
                                 class311.method1506(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if (var17.field1925 instanceof class311) {
                                 var18 = (class311)var17.field1925;
                                 class311.method1506(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field3676; ++var23) {
                              class323 var19 = var15.field3677[var23];
                              if (var19 != null && var19.field3029 instanceof class311) {
                                 class311 var20 = (class311)var19.field3029;
                                 int var21 = var19.field3033 - var19.field3036 + 1;
                                 int var22 = var19.field3035 - var19.field3034 + 1;
                                 class311.method1506(var1, var20, (var19.field3036 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field3034 - var4) * 128 + (var22 - var6) * 64, var7);
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

   public void method54(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class448 var7 = this.field66[var4][var5][var6];
      if (var7 != null) {
         class211 var8 = var7.field3666;
         int var10;
         if (var8 != null) {
            int var18 = var8.field2367;
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
            class49 var9 = var7.field3671;
            if (var9 != null) {
               var10 = var9.field726;
               int var11 = var9.field747;
               int var12 = var9.field733;
               int var13 = var9.field743;
               int[] var14 = this.field109[var10];
               int[] var15 = this.field110[var11];
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

   public void method69(int var1, int var2, int var3, boolean var4) {
      if (!method57() || var4) {
         field88 = true;
         field76 = var4;
         field89 = var1;
         field90 = var2;
         field71 = var3;
         field92 = -1;
         field95 = -1;
      }
   }

   public void method76() {
      field76 = true;
   }

   public void method59(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 >= this.field96 * 128) {
         var1 = this.field96 * 128 - 1;
      }

      if (var3 < 0) {
         var3 = 0;
      } else if (var3 >= this.field64 * 128) {
         var3 = this.field64 * 128 - 1;
      }

      if (var4 < 128) {
         var4 = 128;
      } else if (var4 > 383) {
         var4 = 383;
      }

      ++field75;
      field65 = class234.field2526[var4];
      field87 = class234.field2544[var4];
      field85 = class234.field2526[var5];
      field86 = class234.field2544[var5];
      field112 = field111[(var4 - 128) / 32][var5 / 64];
      field81 = var1;
      field82 = var2;
      field83 = var3;
      field80 = var1 / 128;
      field79 = var3 / 128;
      field74 = var6;
      field94 = field80 - 25;
      if (field94 < 0) {
         field94 = 0;
      }

      field78 = field79 - 25;
      if (field78 < 0) {
         field78 = 0;
      }

      field77 = field80 + 25;
      if (field77 > this.field96) {
         field77 = this.field96;
      }

      field67 = field79 + 25;
      if (field67 > this.field64) {
         field67 = this.field64;
      }

      this.method64();
      field73 = 0;

      int var7;
      class448[][] var8;
      int var9;
      int var10;
      for(var7 = this.field70; var7 < this.field62; ++var7) {
         var8 = this.field66[var7];

         for(var9 = field94; var9 < field77; ++var9) {
            for(var10 = field78; var10 < field67; ++var10) {
               class448 var11 = var8[var9][var10];
               if (var11 != null) {
                  if (var11.field3680 > var6 || !field112[var9 - field80 + 25][var10 - field79 + 25] && this.field107[var7][var9][var10] - var2 < 2000) {
                     var11.field3688 = false;
                     var11.field3682 = false;
                     var11.field3684 = 0;
                  } else {
                     var11.field3688 = true;
                     var11.field3682 = true;
                     if (var11.field3676 > 0) {
                        var11.field3683 = true;
                     } else {
                        var11.field3683 = false;
                     }

                     ++field73;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class448 var15;
      int var16;
      for(var7 = this.field70; var7 < this.field62; ++var7) {
         var8 = this.field66[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field80 + var9;
            var16 = field80 - var9;
            if (var10 >= field94 || var16 < field77) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field79 + var12;
                  var14 = field79 - var12;
                  if (var10 >= field94) {
                     if (var13 >= field78) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field3688) {
                           this.method60(var15, true);
                        }
                     }

                     if (var14 < field67) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field3688) {
                           this.method60(var15, true);
                        }
                     }
                  }

                  if (var16 < field77) {
                     if (var13 >= field78) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field3688) {
                           this.method60(var15, true);
                        }
                     }

                     if (var14 < field67) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field3688) {
                           this.method60(var15, true);
                        }
                     }
                  }

                  if (field73 == 0) {
                     field88 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field70; var7 < this.field62; ++var7) {
         var8 = this.field66[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field80 + var9;
            var16 = field80 - var9;
            if (var10 >= field94 || var16 < field77) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field79 + var12;
                  var14 = field79 - var12;
                  if (var10 >= field94) {
                     if (var13 >= field78) {
                        var15 = var8[var10][var13];
                        if (var15 != null && var15.field3688) {
                           this.method60(var15, false);
                        }
                     }

                     if (var14 < field67) {
                        var15 = var8[var10][var14];
                        if (var15 != null && var15.field3688) {
                           this.method60(var15, false);
                        }
                     }
                  }

                  if (var16 < field77) {
                     if (var13 >= field78) {
                        var15 = var8[var16][var13];
                        if (var15 != null && var15.field3688) {
                           this.method60(var15, false);
                        }
                     }

                     if (var14 < field67) {
                        var15 = var8[var16][var14];
                        if (var15 != null && var15.field3688) {
                           this.method60(var15, false);
                        }
                     }
                  }

                  if (field73 == 0) {
                     field88 = false;
                     return;
                  }
               }
            }
         }
      }

      field88 = false;
   }

   void method60(class448 var1, boolean var2) {
      field100.method1930(var1);

      while(true) {
         class448 var3;
         int var4;
         int var5;
         int var6;
         int var7;
         class448[][] var8;
         class448 var9;
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
                              class176 var10;
                              class323 var12;
                              int var17;
                              int var18;
                              int var21;
                              boolean var22;
                              class448 var33;
                              while(true) {
                                 do {
                                    var3 = (class448)field100.method1933();
                                    if (var3 == null) {
                                       return;
                                    }
                                 } while(!var3.field3682);

                                 var4 = var3.field3667;
                                 var5 = var3.field3668;
                                 var6 = var3.field3686;
                                 var7 = var3.field3669;
                                 var8 = this.field66[var6];
                                 if (!var3.field3688) {
                                    break;
                                 }

                                 if (var2) {
                                    if (var6 > 0) {
                                       var9 = this.field66[var6 - 1][var4][var5];
                                       if (var9 != null && var9.field3682) {
                                          continue;
                                       }
                                    }

                                    if (var4 <= field80 && var4 > field94) {
                                       var9 = var8[var4 - 1][var5];
                                       if (var9 != null && var9.field3682 && (var9.field3688 || (var3.field3679 & 1) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var4 >= field80 && var4 < field77 - 1) {
                                       var9 = var8[var4 + 1][var5];
                                       if (var9 != null && var9.field3682 && (var9.field3688 || (var3.field3679 & 4) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 <= field79 && var5 > field78) {
                                       var9 = var8[var4][var5 - 1];
                                       if (var9 != null && var9.field3682 && (var9.field3688 || (var3.field3679 & 8) == 0)) {
                                          continue;
                                       }
                                    }

                                    if (var5 >= field79 && var5 < field67 - 1) {
                                       var9 = var8[var4][var5 + 1];
                                       if (var9 != null && var9.field3682 && (var9.field3688 || (var3.field3679 & 2) == 0)) {
                                          continue;
                                       }
                                    }
                                 } else {
                                    var2 = true;
                                 }

                                 var3.field3688 = false;
                                 if (var3.field3681 != null) {
                                    var9 = var3.field3681;
                                    if (var9.field3666 != null) {
                                       if (!this.method65(0, var4, var5)) {
                                          this.method61(var9.field3666, 0, field65, field87, field85, field86, var4, var5);
                                       }
                                    } else if (var9.field3671 != null && !this.method65(0, var4, var5)) {
                                       this.method62(var9.field3671, field65, field87, field85, field86, var4, var5);
                                    }

                                    var10 = var9.field3672;
                                    if (var10 != null) {
                                       var10.field1919.method1195(0, field65, field87, field85, field86, var10.field1920 - field81, var10.field1923 - field82, var10.field1922 - field83, var10.field1926);
                                    }

                                    for(var11 = 0; var11 < var9.field3676; ++var11) {
                                       var12 = var9.field3677[var11];
                                       if (var12 != null) {
                                          var12.field3029.method1195(var12.field3037, field65, field87, field85, field86, var12.field3041 - field81, var12.field3028 - field82, var12.field3030 - field83, var12.field3038);
                                       }
                                    }
                                 }

                                 var22 = false;
                                 if (var3.field3666 != null) {
                                    if (!this.method65(var7, var4, var5)) {
                                       var22 = true;
                                       if (var3.field3666.field2369 != 12345678 || field88 && var6 <= field89) {
                                          this.method61(var3.field3666, var7, field65, field87, field85, field86, var4, var5);
                                       }
                                    }
                                 } else if (var3.field3671 != null && !this.method65(var7, var4, var5)) {
                                    var22 = true;
                                    this.method62(var3.field3671, field65, field87, field85, field86, var4, var5);
                                 }

                                 var21 = 0;
                                 var11 = 0;
                                 class176 var23 = var3.field3672;
                                 class316 var13 = var3.field3673;
                                 if (var23 != null || var13 != null) {
                                    if (field80 == var4) {
                                       ++var21;
                                    } else if (field80 < var4) {
                                       var21 += 2;
                                    }

                                    if (field79 == var5) {
                                       var21 += 3;
                                    } else if (field79 > var5) {
                                       var21 += 6;
                                    }

                                    var11 = field101[var21];
                                    var3.field3687 = field103[var21];
                                 }

                                 if (var23 != null) {
                                    if ((var23.field1927 & field102[var21]) != 0) {
                                       if (var23.field1927 == 16) {
                                          var3.field3684 = 3;
                                          var3.field3685 = field104[var21];
                                          var3.field3678 = 3 - var3.field3685;
                                       } else if (var23.field1927 == 32) {
                                          var3.field3684 = 6;
                                          var3.field3685 = field84[var21];
                                          var3.field3678 = 6 - var3.field3685;
                                       } else if (var23.field1927 == 64) {
                                          var3.field3684 = 12;
                                          var3.field3685 = field105[var21];
                                          var3.field3678 = 12 - var3.field3685;
                                       } else {
                                          var3.field3684 = 9;
                                          var3.field3685 = field106[var21];
                                          var3.field3678 = 9 - var3.field3685;
                                       }
                                    } else {
                                       var3.field3684 = 0;
                                    }

                                    if ((var23.field1927 & var11) != 0 && !this.method66(var7, var4, var5, var23.field1927)) {
                                       var23.field1919.method1195(0, field65, field87, field85, field86, var23.field1920 - field81, var23.field1923 - field82, var23.field1922 - field83, var23.field1926);
                                    }

                                    if ((var23.field1921 & var11) != 0 && !this.method66(var7, var4, var5, var23.field1921)) {
                                       var23.field1925.method1195(0, field65, field87, field85, field86, var23.field1920 - field81, var23.field1923 - field82, var23.field1922 - field83, var23.field1926);
                                    }
                                 }

                                 if (var13 != null && !this.method67(var7, var4, var5, var13.field3002.field2554)) {
                                    if ((var13.field3004 & var11) != 0) {
                                       var13.field3002.method1195(0, field65, field87, field85, field86, var13.field2997 - field81 + var13.field3005, var13.field3007 - field82, var13.field2998 - field83 + var13.field3001, var13.field2996);
                                    } else if (var13.field3004 == 256) {
                                       var14 = var13.field2997 - field81;
                                       var15 = var13.field3007 - field82;
                                       var16 = var13.field2998 - field83;
                                       var17 = var13.field3000;
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
                                          var13.field3002.method1195(0, field65, field87, field85, field86, var14 + var13.field3005, var15, var16 + var13.field3001, var13.field2996);
                                       } else if (var13.field3003 != null) {
                                          var13.field3003.method1195(0, field65, field87, field85, field86, var14, var15, var16, var13.field2996);
                                       }
                                    }
                                 }

                                 if (var22) {
                                    class344 var27 = var3.field3674;
                                    if (var27 != null) {
                                       var27.field3157.method1195(0, field65, field87, field85, field86, var27.field3156 - field81, var27.field3161 - field82, var27.field3155 - field83, var27.field3158);
                                    }

                                    class395 var31 = var3.field3675;
                                    if (var31 != null && var31.field3477 == 0) {
                                       if (var31.field3475 != null) {
                                          var31.field3475.method1195(0, field65, field87, field85, field86, var31.field3471 - field81, var31.field3472 - field82, var31.field3473 - field83, var31.field3478);
                                       }

                                       if (var31.field3476 != null) {
                                          var31.field3476.method1195(0, field65, field87, field85, field86, var31.field3471 - field81, var31.field3472 - field82, var31.field3473 - field83, var31.field3478);
                                       }

                                       if (var31.field3474 != null) {
                                          var31.field3474.method1195(0, field65, field87, field85, field86, var31.field3471 - field81, var31.field3472 - field82, var31.field3473 - field83, var31.field3478);
                                       }
                                    }
                                 }

                                 var14 = var3.field3679;
                                 if (var14 != 0) {
                                    if (var4 < field80 && (var14 & 4) != 0) {
                                       var33 = var8[var4 + 1][var5];
                                       if (var33 != null && var33.field3682) {
                                          field100.method1930(var33);
                                       }
                                    }

                                    if (var5 < field79 && (var14 & 2) != 0) {
                                       var33 = var8[var4][var5 + 1];
                                       if (var33 != null && var33.field3682) {
                                          field100.method1930(var33);
                                       }
                                    }

                                    if (var4 > field80 && (var14 & 1) != 0) {
                                       var33 = var8[var4 - 1][var5];
                                       if (var33 != null && var33.field3682) {
                                          field100.method1930(var33);
                                       }
                                    }

                                    if (var5 > field79 && (var14 & 8) != 0) {
                                       var33 = var8[var4][var5 - 1];
                                       if (var33 != null && var33.field3682) {
                                          field100.method1930(var33);
                                       }
                                    }
                                 }
                                 break;
                              }

                              if (var3.field3684 != 0) {
                                 var22 = true;

                                 for(var21 = 0; var21 < var3.field3676; ++var21) {
                                    if (var3.field3677[var21].field3027 != field75 && (var3.field3670[var21] & var3.field3684) == var3.field3685) {
                                       var22 = false;
                                       break;
                                    }
                                 }

                                 if (var22) {
                                    var10 = var3.field3672;
                                    if (!this.method66(var7, var4, var5, var10.field1927)) {
                                       var10.field1919.method1195(0, field65, field87, field85, field86, var10.field1920 - field81, var10.field1923 - field82, var10.field1922 - field83, var10.field1926);
                                    }

                                    var3.field3684 = 0;
                                 }
                              }

                              if (!var3.field3683) {
                                 break;
                              }

                              try {
                                 int var25 = var3.field3676;
                                 var3.field3683 = false;
                                 var21 = 0;

                                 label563:
                                 for(var11 = 0; var11 < var25; ++var11) {
                                    var12 = var3.field3677[var11];
                                    if (var12.field3027 != field75) {
                                       for(var26 = var12.field3036; var26 <= var12.field3033; ++var26) {
                                          for(var14 = var12.field3034; var14 <= var12.field3035; ++var14) {
                                             var33 = var8[var26][var14];
                                             if (var33.field3688) {
                                                var3.field3683 = true;
                                                continue label563;
                                             }

                                             if (var33.field3684 != 0) {
                                                var16 = 0;
                                                if (var26 > var12.field3036) {
                                                   ++var16;
                                                }

                                                if (var26 < var12.field3033) {
                                                   var16 += 4;
                                                }

                                                if (var14 > var12.field3034) {
                                                   var16 += 8;
                                                }

                                                if (var14 < var12.field3035) {
                                                   var16 += 2;
                                                }

                                                if ((var16 & var33.field3684) == var3.field3678) {
                                                   var3.field3683 = true;
                                                   continue label563;
                                                }
                                             }
                                          }
                                       }

                                       field61[var21++] = var12;
                                       var26 = field80 - var12.field3036;
                                       var14 = var12.field3033 - field80;
                                       if (var14 > var26) {
                                          var26 = var14;
                                       }

                                       var15 = field79 - var12.field3034;
                                       var16 = var12.field3035 - field79;
                                       if (var16 > var15) {
                                          var12.field3031 = var26 + var16;
                                       } else {
                                          var12.field3031 = var26 + var15;
                                       }
                                    }
                                 }

                                 while(var21 > 0) {
                                    var11 = -50;
                                    var24 = -1;

                                    for(var26 = 0; var26 < var21; ++var26) {
                                       class323 var34 = field61[var26];
                                       if (var34.field3027 != field75) {
                                          if (var34.field3031 > var11) {
                                             var11 = var34.field3031;
                                             var24 = var26;
                                          } else if (var34.field3031 == var11) {
                                             var15 = var34.field3041 - field81;
                                             var16 = var34.field3030 - field83;
                                             var17 = field61[var24].field3041 - field81;
                                             var18 = field61[var24].field3030 - field83;
                                             if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                                var24 = var26;
                                             }
                                          }
                                       }
                                    }

                                    if (var24 == -1) {
                                       break;
                                    }

                                    class323 var35 = field61[var24];
                                    var35.field3027 = field75;
                                    if (!this.method68(var7, var35.field3036, var35.field3033, var35.field3034, var35.field3035, var35.field3029.field2554)) {
                                       var35.field3029.method1195(var35.field3037, field65, field87, field85, field86, var35.field3041 - field81, var35.field3028 - field82, var35.field3030 - field83, var35.field3038);
                                    }

                                    for(var14 = var35.field3036; var14 <= var35.field3033; ++var14) {
                                       for(var15 = var35.field3034; var15 <= var35.field3035; ++var15) {
                                          class448 var36 = var8[var14][var15];
                                          if (var36.field3684 != 0) {
                                             field100.method1930(var36);
                                          } else if ((var14 != var4 || var15 != var5) && var36.field3682) {
                                             field100.method1930(var36);
                                          }
                                       }
                                    }
                                 }

                                 if (!var3.field3683) {
                                    break;
                                 }
                              } catch (Exception var20) {
                                 var3.field3683 = false;
                                 break;
                              }
                           }
                        } while(!var3.field3682);
                     } while(var3.field3684 != 0);

                     if (var4 > field80 || var4 <= field94) {
                        break;
                     }

                     var9 = var8[var4 - 1][var5];
                  } while(var9 != null && var9.field3682);

                  if (var4 < field80 || var4 >= field77 - 1) {
                     break;
                  }

                  var9 = var8[var4 + 1][var5];
               } while(var9 != null && var9.field3682);

               if (var5 > field79 || var5 <= field78) {
                  break;
               }

               var9 = var8[var4][var5 - 1];
            } while(var9 != null && var9.field3682);

            if (var5 < field79 || var5 >= field67 - 1) {
               break;
            }

            var9 = var8[var4][var5 + 1];
         } while(var9 != null && var9.field3682);

         var3.field3682 = false;
         --field73;
         class395 var29 = var3.field3675;
         if (var29 != null && var29.field3477 != 0) {
            if (var29.field3475 != null) {
               var29.field3475.method1195(0, field65, field87, field85, field86, var29.field3471 - field81, var29.field3472 - field82 - var29.field3477, var29.field3473 - field83, var29.field3478);
            }

            if (var29.field3476 != null) {
               var29.field3476.method1195(0, field65, field87, field85, field86, var29.field3471 - field81, var29.field3472 - field82 - var29.field3477, var29.field3473 - field83, var29.field3478);
            }

            if (var29.field3474 != null) {
               var29.field3474.method1195(0, field65, field87, field85, field86, var29.field3471 - field81, var29.field3472 - field82 - var29.field3477, var29.field3473 - field83, var29.field3478);
            }
         }

         if (var3.field3687 != 0) {
            class316 var30 = var3.field3673;
            if (var30 != null && !this.method67(var7, var4, var5, var30.field3002.field2554)) {
               if ((var30.field3004 & var3.field3687) != 0) {
                  var30.field3002.method1195(0, field65, field87, field85, field86, var30.field2997 - field81 + var30.field3005, var30.field3007 - field82, var30.field2998 - field83 + var30.field3001, var30.field2996);
               } else if (var30.field3004 == 256) {
                  var11 = var30.field2997 - field81;
                  var24 = var30.field3007 - field82;
                  var26 = var30.field2998 - field83;
                  var14 = var30.field3000;
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
                     var30.field3002.method1195(0, field65, field87, field85, field86, var11 + var30.field3005, var24, var26 + var30.field3001, var30.field2996);
                  } else if (var30.field3003 != null) {
                     var30.field3003.method1195(0, field65, field87, field85, field86, var11, var24, var26, var30.field2996);
                  }
               }
            }

            class176 var28 = var3.field3672;
            if (var28 != null) {
               if ((var28.field1921 & var3.field3687) != 0 && !this.method66(var7, var4, var5, var28.field1921)) {
                  var28.field1925.method1195(0, field65, field87, field85, field86, var28.field1920 - field81, var28.field1923 - field82, var28.field1922 - field83, var28.field1926);
               }

               if ((var28.field1927 & var3.field3687) != 0 && !this.method66(var7, var4, var5, var28.field1927)) {
                  var28.field1919.method1195(0, field65, field87, field85, field86, var28.field1920 - field81, var28.field1923 - field82, var28.field1922 - field83, var28.field1926);
               }
            }
         }

         class448 var32;
         if (var6 < this.field62 - 1) {
            var32 = this.field66[var6 + 1][var4][var5];
            if (var32 != null && var32.field3682) {
               field100.method1930(var32);
            }
         }

         if (var4 < field80) {
            var32 = var8[var4 + 1][var5];
            if (var32 != null && var32.field3682) {
               field100.method1930(var32);
            }
         }

         if (var5 < field79) {
            var32 = var8[var4][var5 + 1];
            if (var32 != null && var32.field3682) {
               field100.method1930(var32);
            }
         }

         if (var4 > field80) {
            var32 = var8[var4 - 1][var5];
            if (var32 != null && var32.field3682) {
               field100.method1930(var32);
            }
         }

         if (var5 > field79) {
            var32 = var8[var4][var5 - 1];
            if (var32 != null && var32.field3682) {
               field100.method1930(var32);
            }
         }
      }
   }

   void method61(class211 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field81;
      int var11;
      int var12 = var11 = (var8 << 7) - field83;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field107[var2][var7][var8] - field82;
      int var18 = this.field107[var2][var7 + 1][var8] - field82;
      int var19 = this.field107[var2][var7 + 1][var8 + 1] - field82;
      int var20 = this.field107[var2][var7][var8 + 1] - field82;
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
                  int var22 = class234.field2531 + var10 * class234.field2530 / var12;
                  int var23 = class234.field2543 + var17 * class234.field2530 / var12;
                  int var24 = class234.field2531 + var14 * class234.field2530 / var11;
                  int var25 = class234.field2543 + var18 * class234.field2530 / var11;
                  int var26 = class234.field2531 + var13 * class234.field2530 / var16;
                  int var27 = class234.field2543 + var19 * class234.field2530 / var16;
                  int var28 = class234.field2531 + var9 * class234.field2530 / var15;
                  int var29 = class234.field2543 + var21 * class234.field2530 / var15;
                  class234.field2527 = 0;
                  int var30;
                  if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class234.field2539 = false;
                     if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > class234.field2533 || var28 > class234.field2533 || var24 > class234.field2533) {
                        class234.field2539 = true;
                     }

                     if (field88 && method63(field90, field71, var27, var29, var25, var26, var28, var24)) {
                        field92 = var7;
                        field95 = var8;
                     }

                     if (var1.field2371 == -1) {
                        if (var1.field2369 != 12345678) {
                           class234.method1188(var27, var29, var25, var26, var28, var24, var1.field2369, var1.field2370, var1.field2373);
                        }
                     } else if (!field91) {
                        if (var1.field2372) {
                           class234.method1191(var27, var29, var25, var26, var28, var24, var1.field2369, var1.field2370, var1.field2373, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2371);
                        } else {
                           class234.method1191(var27, var29, var25, var26, var28, var24, var1.field2369, var1.field2370, var1.field2373, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field2371);
                        }
                     } else {
                        var30 = class234.field2528.method1353(var1.field2371);
                        class234.method1188(var27, var29, var25, var26, var28, var24, method45(var30, var1.field2369), method45(var30, var1.field2370), method45(var30, var1.field2373));
                     }
                  }

                  if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class234.field2539 = false;
                     if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > class234.field2533 || var24 > class234.field2533 || var28 > class234.field2533) {
                        class234.field2539 = true;
                     }

                     if (field88 && method63(field90, field71, var23, var25, var29, var22, var24, var28)) {
                        field92 = var7;
                        field95 = var8;
                     }

                     if (var1.field2371 == -1) {
                        if (var1.field2374 != 12345678) {
                           class234.method1188(var23, var25, var29, var22, var24, var28, var1.field2374, var1.field2373, var1.field2370);
                        }
                     } else if (!field91) {
                        class234.method1191(var23, var25, var29, var22, var24, var28, var1.field2374, var1.field2373, var1.field2370, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2371);
                     } else {
                        var30 = class234.field2528.method1353(var1.field2371);
                        class234.method1188(var23, var25, var29, var22, var24, var28, method45(var30, var1.field2374), method45(var30, var1.field2373), method45(var30, var1.field2370));
                     }
                  }

               }
            }
         }
      }
   }

   void method62(class49 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field740.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field740[var9] - field81;
         var11 = var1.field727[var9] - field82;
         var12 = var1.field728[var9] - field83;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if (var12 < 50) {
            return;
         }

         if (var1.field735 != null) {
            class49.field734[var9] = var10;
            class49.field738[var9] = var13;
            class49.field745[var9] = var12;
         }

         class49.field739[var9] = class234.field2531 + var10 * class234.field2530 / var12;
         class49.field742[var9] = class234.field2543 + var13 * class234.field2530 / var12;
      }

      class234.field2527 = 0;
      var8 = var1.field732.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field732[var9];
         var11 = var1.field744[var9];
         var12 = var1.field736[var9];
         var13 = class49.field739[var10];
         int var14 = class49.field739[var11];
         int var15 = class49.field739[var12];
         int var16 = class49.field742[var10];
         int var17 = class49.field742[var11];
         int var18 = class49.field742[var12];
         if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class234.field2539 = false;
            if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > class234.field2533 || var14 > class234.field2533 || var15 > class234.field2533) {
               class234.field2539 = true;
            }

            if (field88 && method63(field90, field71, var16, var17, var18, var13, var14, var15)) {
               field92 = var6;
               field95 = var7;
            }

            if (var1.field735 != null && var1.field735[var9] != -1) {
               if (!field91) {
                  if (var1.field737) {
                     class234.method1191(var16, var17, var18, var13, var14, var15, var1.field729[var9], var1.field730[var9], var1.field731[var9], class49.field734[0], class49.field734[1], class49.field734[3], class49.field738[0], class49.field738[1], class49.field738[3], class49.field745[0], class49.field745[1], class49.field745[3], var1.field735[var9]);
                  } else {
                     class234.method1191(var16, var17, var18, var13, var14, var15, var1.field729[var9], var1.field730[var9], var1.field731[var9], class49.field734[var10], class49.field734[var11], class49.field734[var12], class49.field738[var10], class49.field738[var11], class49.field738[var12], class49.field745[var10], class49.field745[var11], class49.field745[var12], var1.field735[var9]);
                  }
               } else {
                  int var19 = class234.field2528.method1353(var1.field735[var9]);
                  class234.method1188(var16, var17, var18, var13, var14, var15, method45(var19, var1.field729[var9]), method45(var19, var1.field730[var9]), method45(var19, var1.field731[var9]));
               }
            } else if (var1.field729[var9] != 12345678) {
               class234.method1188(var16, var17, var18, var13, var14, var15, var1.field729[var9], var1.field730[var9], var1.field731[var9]);
            }
         }
      }

   }

   void method64() {
      int var1 = field108[field74];
      class7[] var2 = field93[field74];
      field98 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class7 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         int var9;
         boolean var13;
         if (var4.field35 == 1) {
            var5 = var4.field31 - field80 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field37 - field79 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field42 - field79 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field112[var5][var6++]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field81 - var4.field36;
                  if (var9 > 32) {
                     var4.field34 = 1;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field34 = 2;
                     var9 = -var9;
                  }

                  var4.field45 = (var4.field38 - field83 << 8) / var9;
                  var4.field46 = (var4.field33 - field83 << 8) / var9;
                  var4.field47 = (var4.field40 - field82 << 8) / var9;
                  var4.field48 = (var4.field41 - field82 << 8) / var9;
                  field99[field98++] = var4;
               }
            }
         } else if (var4.field35 == 2) {
            var5 = var4.field37 - field79 + 25;
            if (var5 >= 0 && var5 <= 50) {
               var6 = var4.field31 - field80 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field32 - field80 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               var13 = false;

               while(var6 <= var7) {
                  if (field112[var6++][var5]) {
                     var13 = true;
                     break;
                  }
               }

               if (var13) {
                  var9 = field83 - var4.field38;
                  if (var9 > 32) {
                     var4.field34 = 3;
                  } else {
                     if (var9 >= -32) {
                        continue;
                     }

                     var4.field34 = 4;
                     var9 = -var9;
                  }

                  var4.field43 = (var4.field36 - field81 << 8) / var9;
                  var4.field44 = (var4.field39 - field81 << 8) / var9;
                  var4.field47 = (var4.field40 - field82 << 8) / var9;
                  var4.field48 = (var4.field41 - field82 << 8) / var9;
                  field99[field98++] = var4;
               }
            }
         } else if (var4.field35 == 4) {
            var5 = var4.field40 - field82;
            if (var5 > 128) {
               var6 = var4.field37 - field79 + 25;
               if (var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field42 - field79 + 25;
               if (var7 > 50) {
                  var7 = 50;
               }

               if (var6 <= var7) {
                  int var8 = var4.field31 - field80 + 25;
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  var9 = var4.field32 - field80 + 25;
                  if (var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label144:
                  for(int var11 = var8; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if (field112[var11][var12]) {
                           var10 = true;
                           break label144;
                        }
                     }
                  }

                  if (var10) {
                     var4.field34 = 5;
                     var4.field43 = (var4.field36 - field81 << 8) / var5;
                     var4.field44 = (var4.field39 - field81 << 8) / var5;
                     var4.field45 = (var4.field38 - field83 << 8) / var5;
                     var4.field46 = (var4.field33 - field83 << 8) / var5;
                     field99[field98++] = var4;
                  }
               }
            }
         }
      }

   }

   boolean method65(int var1, int var2, int var3) {
      int var4 = this.field69[var1][var2][var3];
      if (var4 == -field75) {
         return false;
      } else if (var4 == field75) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if (this.method49(var5 + 1, this.field107[var1][var2][var3], var6 + 1) && this.method49(var5 + 128 - 1, this.field107[var1][var2 + 1][var3], var6 + 1) && this.method49(var5 + 128 - 1, this.field107[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method49(var5 + 1, this.field107[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field69[var1][var2][var3] = field75;
            return true;
         } else {
            this.field69[var1][var2][var3] = -field75;
            return false;
         }
      }
   }

   boolean method66(int var1, int var2, int var3, int var4) {
      if (!this.method65(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field107[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if (var4 < 16) {
            if (var4 == 1) {
               if (var5 > field81) {
                  if (!this.method49(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method49(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method49(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method49(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method49(var5, var9, var6)) {
                  return false;
               }

               if (!this.method49(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 2) {
               if (var6 < field83) {
                  if (!this.method49(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if (!this.method49(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method49(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if (!this.method49(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method49(var5, var9, var6 + 128)) {
                  return false;
               }

               if (!this.method49(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 4) {
               if (var5 < field81) {
                  if (!this.method49(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if (!this.method49(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method49(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if (!this.method49(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if (!this.method49(var5 + 128, var9, var6)) {
                  return false;
               }

               if (!this.method49(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if (var4 == 8) {
               if (var6 > field83) {
                  if (!this.method49(var5, var7, var6)) {
                     return false;
                  }

                  if (!this.method49(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if (var1 > 0) {
                  if (!this.method49(var5, var8, var6)) {
                     return false;
                  }

                  if (!this.method49(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if (!this.method49(var5, var9, var6)) {
                  return false;
               }

               if (!this.method49(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         if (!this.method49(var5 + 64, var10, var6 + 64)) {
            return false;
         } else if (var4 == 16) {
            return this.method49(var5, var9, var6 + 128);
         } else if (var4 == 32) {
            return this.method49(var5 + 128, var9, var6 + 128);
         } else if (var4 == 64) {
            return this.method49(var5 + 128, var9, var6);
         } else if (var4 == 128) {
            return this.method49(var5, var9, var6);
         } else {
            return true;
         }
      }
   }

   boolean method67(int var1, int var2, int var3, int var4) {
      if (!this.method65(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method49(var5 + 1, this.field107[var1][var2][var3] - var4, var6 + 1) && this.method49(var5 + 128 - 1, this.field107[var1][var2 + 1][var3] - var4, var6 + 1) && this.method49(var5 + 128 - 1, this.field107[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method49(var5 + 1, this.field107[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   boolean method68(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if (var2 == var3 && var4 == var5) {
         if (!this.method65(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method49(var7 + 1, this.field107[var1][var2][var4] - var6, var8 + 1) && this.method49(var7 + 128 - 1, this.field107[var1][var2 + 1][var4] - var6, var8 + 1) && this.method49(var7 + 128 - 1, this.field107[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method49(var7 + 1, this.field107[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if (this.field69[var1][var7][var8] == -field75) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field107[var1][var2][var4] - var6;
         if (!this.method49(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if (!this.method49(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if (!this.method49(var7, var9, var11)) {
                  return false;
               } else if (!this.method49(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   boolean method49(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field98; ++var4) {
         class7 var5 = field99[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5.field34 == 1) {
            var6 = var5.field36 - var1;
            if (var6 > 0) {
               var7 = var5.field38 + (var5.field45 * var6 >> 8);
               var8 = var5.field33 + (var5.field46 * var6 >> 8);
               var9 = var5.field40 + (var5.field47 * var6 >> 8);
               var10 = var5.field41 + (var5.field48 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field34 == 2) {
            var6 = var1 - var5.field36;
            if (var6 > 0) {
               var7 = var5.field38 + (var5.field45 * var6 >> 8);
               var8 = var5.field33 + (var5.field46 * var6 >> 8);
               var9 = var5.field40 + (var5.field47 * var6 >> 8);
               var10 = var5.field41 + (var5.field48 * var6 >> 8);
               if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field34 == 3) {
            var6 = var5.field38 - var3;
            if (var6 > 0) {
               var7 = var5.field36 + (var5.field43 * var6 >> 8);
               var8 = var5.field39 + (var5.field44 * var6 >> 8);
               var9 = var5.field40 + (var5.field47 * var6 >> 8);
               var10 = var5.field41 + (var5.field48 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field34 == 4) {
            var6 = var3 - var5.field38;
            if (var6 > 0) {
               var7 = var5.field36 + (var5.field43 * var6 >> 8);
               var8 = var5.field39 + (var5.field44 * var6 >> 8);
               var9 = var5.field40 + (var5.field47 * var6 >> 8);
               var10 = var5.field41 + (var5.field48 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if (var5.field34 == 5) {
            var6 = var2 - var5.field40;
            if (var6 > 0) {
               var7 = var5.field36 + (var5.field43 * var6 >> 8);
               var8 = var5.field39 + (var5.field44 * var6 >> 8);
               var9 = var5.field38 + (var5.field45 * var6 >> 8);
               var10 = var5.field33 + (var5.field46 * var6 >> 8);
               if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void method79(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class7 var8 = new class7();
      var8.field31 = var2 / 128;
      var8.field32 = var3 / 128;
      var8.field37 = var4 / 128;
      var8.field42 = var5 / 128;
      var8.field35 = var1;
      var8.field36 = var2;
      var8.field39 = var3;
      var8.field38 = var4;
      var8.field33 = var5;
      var8.field40 = var6;
      var8.field41 = var7;
      field93[var0][field108[var0]++] = var8;
   }

   public static void method55(int[] var0, int var1, int var2, int var3, int var4) {
      field115 = 0;
      field63 = 0;
      field117 = var3;
      field97 = var4;
      field113 = var3 / 2;
      field114 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field65 = class234.field2526[var6];
            field87 = class234.field2544[var6];
            field85 = class234.field2526[var7];
            field86 = class234.field2544[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               for(var11 = -26; var11 < 26; ++var11) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;

                  for(int var15 = -var1; var15 <= var2; var15 += 128) {
                     if (method56(var12, var0[var8] + var15, var13)) {
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

                  field111[var6][var7][var8 + 25][var9 + 25] = var16;
               }
            }
         }
      }

   }

   static boolean method56(int var0, int var1, int var2) {
      int var3 = var2 * field85 + var0 * field86 >> 16;
      int var4 = var2 * field86 - var0 * field85 >> 16;
      int var5 = var1 * field65 + var4 * field87 >> 16;
      int var6 = var1 * field87 - var4 * field65 >> 16;
      if (var5 >= 50 && var5 <= 3500) {
         int var7 = field113 + var3 * 128 / var5;
         int var8 = field114 + var6 * 128 / var5;
         return var7 >= field115 && var7 <= field117 && var8 >= field63 && var8 <= field97;
      } else {
         return false;
      }
   }

   public static boolean method57() {
      return field76 && field92 != -1;
   }

   public static void method58() {
      field92 = -1;
      field76 = false;
   }

   static final int method45(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static boolean method63(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
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
