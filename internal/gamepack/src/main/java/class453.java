public class class453 extends class106 {
   static boolean field3735 = false;
   static boolean[] field3733;
   static byte[] field3724;
   static class339[] field3730;
   static class370[] field3732;
   static class437[] field3731;
   static class80[] field3729;
   static float[] field3722;
   static float[] field3740;
   static float[] field3741;
   static float[] field3742;
   static float[] field3743;
   static float[] field3744;
   static float[] field3746;
   static int field3721;
   static int field3726;
   static int field3727;
   static int field3728;
   static int[] field3719;
   static int[] field3737;
   static int[] field3748;
   boolean field3723;
   boolean field3739;
   byte[] field3745;
   byte[][] field3747;
   float[] field3736;
   int field3718;
   int field3720;
   int field3725;
   int field3734;
   int field3738;
   int field3749;
   int field3750;
   int field3751;

   class453(byte[] var1) {
      this.method2153(var1);
   }

   void method2153(byte[] var1) {
      class134 var2 = new class134(var1);
      this.field3725 = var2.method717();
      this.field3720 = var2.method717();
      this.field3750 = var2.method717();
      this.field3718 = var2.method717();
      if (this.field3718 < 0) {
         this.field3718 = ~this.field3718;
         this.field3723 = true;
      }

      int var3 = var2.method717();
      this.field3747 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method669();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method679(var7, 0, var5);
         this.field3747[var4] = var7;
      }

   }

   float[] method2159(int var1) {
      method2150(this.field3747[var1], 0);
      method2158();
      int var2 = method2152(class47.method251(field3719.length - 1));
      boolean var3 = field3733[var2];
      int var4 = var3 ? field3728 : field3727;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method2158() != 0;
         var6 = method2158() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field3727 >> 2);
         var9 = (var4 >> 2) + (field3727 >> 2);
         var10 = field3727 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field3727 >> 2);
         var12 = var4 - (var4 >> 2) + (field3727 >> 2);
         var13 = field3727 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class370 var14 = field3732[field3719[var2]];
      int var16 = var14.field3287;
      int var17 = var14.field3289[var16];
      boolean var15 = !field3730[var17].method1631();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.field3288; ++var17) {
         class437 var18 = field3731[var14.field3286[var17]];
         float[] var19 = field3740;
         var18.method2089(var19, var4 >> 1, var40);
      }

      int var41;
      if (!var15) {
         var17 = var14.field3287;
         var41 = var14.field3289[var17];
         field3730[var41].method1629(field3740, var4 >> 1);
      }

      int var42;
      if (var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field3740[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var41 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var20 = field3740;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3 ? field3744 : field3741;
         float[] var22 = var3 ? field3746 : field3742;
         float[] var23 = var3 ? field3722 : field3743;
         int[] var24 = var3 ? field3748 : field3737;

         int var25;
         float var26;
         float var27;
         float var28;
         float var29;
         for(var25 = 0; var25 < var41; ++var25) {
            var26 = var20[var25 * 4] - var20[var4 - var25 * 4 - 1];
            var27 = var20[var25 * 4 + 2] - var20[var4 - var25 * 4 - 3];
            var28 = var46[var25 * 2];
            var29 = var46[var25 * 2 + 1];
            var20[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
            var20[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
         }

         float var30;
         float var31;
         for(var25 = 0; var25 < var42; ++var25) {
            var26 = var20[var17 + 3 + var25 * 4];
            var27 = var20[var17 + 1 + var25 * 4];
            var28 = var20[var25 * 4 + 3];
            var29 = var20[var25 * 4 + 1];
            var20[var17 + 3 + var25 * 4] = var26 + var28;
            var20[var17 + 1 + var25 * 4] = var27 + var29;
            var30 = var46[var17 - 4 - var25 * 4];
            var31 = var46[var17 - 3 - var25 * 4];
            var20[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
            var20[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
         }

         var25 = class47.method251(var4 - 1);

         int var47;
         int var48;
         int var49;
         int var50;
         for(var47 = 0; var47 < var25 - 3; ++var47) {
            var48 = var4 >> var47 + 2;
            var49 = 8 << var47;

            for(var50 = 0; var50 < 2 << var47; ++var50) {
               int var51 = var4 - var48 * 2 * var50;
               int var52 = var4 - var48 * (var50 * 2 + 1);

               for(int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
                  int var33 = var32 * 4;
                  float var34 = var20[var51 - 1 - var33];
                  float var35 = var20[var51 - 3 - var33];
                  float var36 = var20[var52 - 1 - var33];
                  float var37 = var20[var52 - 3 - var33];
                  var20[var51 - 1 - var33] = var34 + var36;
                  var20[var51 - 3 - var33] = var35 + var37;
                  float var38 = var46[var32 * var49];
                  float var39 = var46[var32 * var49 + 1];
                  var20[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
               }
            }
         }

         for(var47 = 1; var47 < var42 - 1; ++var47) {
            var48 = var24[var47];
            if (var47 < var48) {
               var49 = var47 * 8;
               var50 = var48 * 8;
               var30 = var20[var49 + 1];
               var20[var49 + 1] = var20[var50 + 1];
               var20[var50 + 1] = var30;
               var30 = var20[var49 + 3];
               var20[var49 + 3] = var20[var50 + 3];
               var20[var50 + 3] = var30;
               var30 = var20[var49 + 5];
               var20[var49 + 5] = var20[var50 + 5];
               var20[var50 + 5] = var30;
               var30 = var20[var49 + 7];
               var20[var49 + 7] = var20[var50 + 7];
               var20[var50 + 7] = var30;
            }
         }

         for(var47 = 0; var47 < var17; ++var47) {
            var20[var47] = var20[var47 * 2 + 1];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var20[var4 - 1 - var47 * 2] = var20[var47 * 4];
            var20[var4 - 2 - var47 * 2] = var20[var47 * 4 + 1];
            var20[var4 - var41 - 1 - var47 * 2] = var20[var47 * 4 + 2];
            var20[var4 - var41 - 2 - var47 * 2] = var20[var47 * 4 + 3];
         }

         for(var47 = 0; var47 < var42; ++var47) {
            var27 = var23[var47 * 2];
            var28 = var23[var47 * 2 + 1];
            var29 = var20[var17 + var47 * 2];
            var30 = var20[var17 + var47 * 2 + 1];
            var31 = var20[var4 - 2 - var47 * 2];
            float var53 = var20[var4 - 1 - var47 * 2];
            float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
            var20[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
            var20[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
            var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
            var20[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
            var20[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[var47 * 2 + var17] * var22[var47 * 2] + var20[var47 * 2 + 1 + var17] * var22[var47 * 2 + 1];
            var20[var17 - 1 - var47] = var20[var47 * 2 + var17] * var22[var47 * 2 + 1] - var20[var47 * 2 + 1 + var17] * var22[var47 * 2];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var4 - var41 + var47] = -var20[var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var47] = var20[var41 + var47];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var41 + var47] = -var20[var41 - var47 - 1];
         }

         for(var47 = 0; var47 < var41; ++var47) {
            var20[var17 + var47] = var20[var4 - var47 - 1];
         }

         for(var47 = var8; var47 < var9; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
            field3740[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field3740[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var43 = null;
      if (this.field3751 > 0) {
         var41 = this.field3751 + var4 >> 2;
         var43 = new float[var41];
         int var45;
         if (!this.field3739) {
            for(var42 = 0; var42 < this.field3738; ++var42) {
               var45 = (this.field3751 >> 1) + var42;
               var43[var42] += this.field3736[var45];
            }
         }

         if (!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var45 = var43.length - (var4 >> 1) + var42;
               var43[var45] += field3740[var42];
            }
         }
      }

      float[] var44 = this.field3736;
      this.field3736 = field3740;
      field3740 = var44;
      this.field3751 = var4;
      this.field3738 = var12 - (var4 >> 1);
      this.field3739 = var15;
      return var43;
   }

   class388 method2157(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field3745 == null) {
            this.field3751 = 0;
            this.field3736 = new float[field3728];
            this.field3745 = new byte[this.field3720];
            this.field3734 = 0;
            this.field3749 = 0;
         }

         for(; this.field3749 < this.field3747.length; ++this.field3749) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method2159(this.field3749);
            if (var2 != null) {
               int var3 = this.field3734;
               int var4 = var2.length;
               if (var4 > this.field3720 - var3) {
                  var4 = this.field3720 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field3745[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field3734;
               }

               this.field3734 = var3;
            }
         }

         this.field3736 = null;
         byte[] var7 = this.field3745;
         this.field3745 = null;
         return new class388(this.field3725, var7, this.field3750, this.field3718, this.field3723);
      }
   }

   static float method2151(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   static void method2150(byte[] var0, int var1) {
      field3724 = var0;
      field3721 = var1;
      field3726 = 0;
   }

   static int method2158() {
      int var0 = field3724[field3721] >> field3726 & 1;
      ++field3726;
      field3721 += field3726 >> 3;
      field3726 &= 7;
      return var0;
   }

   static int method2152(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field3726; var0 -= var3) {
         var3 = 8 - field3726;
         int var4 = (1 << var3) - 1;
         var1 += (field3724[field3721] >> field3726 & var4) << var2;
         field3726 = 0;
         ++field3721;
         var2 += var3;
      }

      if (var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field3724[field3721] >> field3726 & var3) << var2;
         field3726 += var0;
      }

      return var1;
   }

   static void method2154(byte[] var0) {
      method2150(var0, 0);
      field3727 = 1 << method2152(4);
      field3728 = 1 << method2152(4);
      field3740 = new float[field3728];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0 ? field3728 : field3727;
         var3 = var2 >> 1;
         var4 = var2 >> 2;
         var5 = var2 >> 3;
         float[] var6 = new float[var3];

         for(int var7 = 0; var7 < var4; ++var7) {
            var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
            var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
         }

         float[] var13 = new float[var3];

         for(int var8 = 0; var8 < var4; ++var8) {
            var13[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
            var13[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
         }

         float[] var14 = new float[var4];

         for(int var9 = 0; var9 < var5; ++var9) {
            var14[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
            var14[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
         }

         int[] var15 = new int[var5];
         int var10 = class47.method251(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            var15[var11] = class393.method1916(var11, var10);
         }

         if (var1 != 0) {
            field3744 = var6;
            field3746 = var13;
            field3722 = var14;
            field3748 = var15;
         } else {
            field3741 = var6;
            field3742 = var13;
            field3743 = var14;
            field3737 = var15;
         }
      }

      var1 = method2152(8) + 1;
      field3729 = new class80[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field3729[var2] = new class80();
      }

      var2 = method2152(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method2152(16);
      }

      var2 = method2152(6) + 1;
      field3730 = new class339[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field3730[var3] = new class339();
      }

      var3 = method2152(6) + 1;
      field3731 = new class437[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field3731[var4] = new class437();
      }

      var4 = method2152(6) + 1;
      field3732 = new class370[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field3732[var5] = new class370();
      }

      var5 = method2152(6) + 1;
      field3733 = new boolean[var5];
      field3719 = new int[var5];

      for(int var12 = 0; var12 < var5; ++var12) {
         field3733[var12] = method2158() != 0;
         method2152(16);
         method2152(16);
         field3719[var12] = method2152(8);
      }

   }

   static boolean method2155(class164 var0) {
      if (!field3735) {
         byte[] var1 = var0.method892(0, 0);
         if (var1 == null) {
            return false;
         }

         method2154(var1);
         field3735 = true;
      }

      return true;
   }

   static class453 method2156(class164 var0, int var1, int var2) {
      if (!method2155(var0)) {
         var0.method890(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method892(var1, var2);
         return var3 == null ? null : new class453(var3);
      }
   }
}
