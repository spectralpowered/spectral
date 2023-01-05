@ObfInfo(
   name = "be"
)
public class class370 extends class139 {
   @ObfInfo(
      owner = "be",
      name = "s",
      desc = "Z"
   )
   static boolean field3147 = false;
   @ObfInfo(
      owner = "be",
      name = "k",
      desc = "[Z"
   )
   static boolean[] field3145;
   @ObfInfo(
      owner = "be",
      name = "f",
      desc = "[B"
   )
   static byte[] field3136;
   @ObfInfo(
      owner = "be",
      name = "n",
      desc = "[Lae;"
   )
   static class124[] field3144;
   @ObfInfo(
      owner = "be",
      name = "g",
      desc = "[Lbh;"
   )
   static class136[] field3141;
   @ObfInfo(
      owner = "be",
      name = "o",
      desc = "[Laq;"
   )
   static class275[] field3143;
   @ObfInfo(
      owner = "be",
      name = "i",
      desc = "[Lai;"
   )
   static class62[] field3142;
   @ObfInfo(
      owner = "be",
      name = "ao",
      desc = "[F"
   )
   static float[] field3134;
   @ObfInfo(
      owner = "be",
      name = "d",
      desc = "[F"
   )
   static float[] field3152;
   @ObfInfo(
      owner = "be",
      name = "y",
      desc = "[F"
   )
   static float[] field3153;
   @ObfInfo(
      owner = "be",
      name = "z",
      desc = "[F"
   )
   static float[] field3154;
   @ObfInfo(
      owner = "be",
      name = "w",
      desc = "[F"
   )
   static float[] field3155;
   @ObfInfo(
      owner = "be",
      name = "as",
      desc = "[F"
   )
   static float[] field3156;
   @ObfInfo(
      owner = "be",
      name = "ad",
      desc = "[F"
   )
   static float[] field3158;
   @ObfInfo(
      owner = "be",
      name = "r",
      desc = "I"
   )
   static int field3133;
   @ObfInfo(
      owner = "be",
      name = "u",
      desc = "I"
   )
   static int field3138;
   @ObfInfo(
      owner = "be",
      name = "b",
      desc = "I"
   )
   static int field3139;
   @ObfInfo(
      owner = "be",
      name = "j",
      desc = "I"
   )
   static int field3140;
   @ObfInfo(
      owner = "be",
      name = "a",
      desc = "[I"
   )
   static int[] field3131;
   @ObfInfo(
      owner = "be",
      name = "am",
      desc = "[I"
   )
   static int[] field3149;
   @ObfInfo(
      owner = "be",
      name = "av",
      desc = "[I"
   )
   static int[] field3160;
   @ObfInfo(
      owner = "be",
      name = "q",
      desc = "Z"
   )
   boolean field3135;
   @ObfInfo(
      owner = "be",
      name = "p",
      desc = "Z"
   )
   boolean field3151;
   @ObfInfo(
      owner = "be",
      name = "au",
      desc = "[B"
   )
   byte[] field3157;
   @ObfInfo(
      owner = "be",
      name = "h",
      desc = "[[B"
   )
   byte[][] field3159;
   @ObfInfo(
      owner = "be",
      name = "l",
      desc = "[F"
   )
   float[] field3148;
   @ObfInfo(
      owner = "be",
      name = "m",
      desc = "I"
   )
   int field3130;
   @ObfInfo(
      owner = "be",
      name = "v",
      desc = "I"
   )
   int field3132;
   @ObfInfo(
      owner = "be",
      name = "e",
      desc = "I"
   )
   int field3137;
   @ObfInfo(
      owner = "be",
      name = "ar",
      desc = "I"
   )
   int field3146;
   @ObfInfo(
      owner = "be",
      name = "c",
      desc = "I"
   )
   int field3150;
   @ObfInfo(
      owner = "be",
      name = "at",
      desc = "I"
   )
   int field3161;
   @ObfInfo(
      owner = "be",
      name = "x",
      desc = "I"
   )
   int field3162;
   @ObfInfo(
      owner = "be",
      name = "t",
      desc = "I"
   )
   int field3163;

   @ObfInfo(
      owner = "be",
      name = "<init>",
      desc = "([B)V"
   )
   class370(byte[] var1) {
      this.method1827(var1);
   }

   @ObfInfo(
      owner = "be",
      name = "m",
      desc = "([B)V"
   )
   void method1827(byte[] var1) {
      class127 var2 = new class127(var1);
      this.field3137 = var2.method595();
      this.field3132 = var2.method595();
      this.field3162 = var2.method595();
      this.field3130 = var2.method595();
      if (this.field3130 < 0) {
         this.field3130 = ~this.field3130;
         this.field3135 = true;
      }

      int var3 = var2.method595();
      this.field3159 = new byte[var3][];

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = 0;

         int var6;
         do {
            var6 = var2.method547();
            var5 += var6;
         } while(var6 >= 255);

         byte[] var7 = new byte[var5];
         var2.method557(var7, 0, var5);
         this.field3159[var4] = var7;
      }

   }

   @ObfInfo(
      owner = "be",
      name = "f",
      desc = "(I)[F"
   )
   float[] method1833(int var1) {
      method1824(this.field3159[var1], 0);
      method1832();
      int var2 = method1826(class380.method1883(field3131.length - 1));
      boolean var3 = field3145[var2];
      int var4 = var3 ? field3140 : field3139;
      boolean var5 = false;
      boolean var6 = false;
      if (var3) {
         var5 = method1832() != 0;
         var6 = method1832() != 0;
      }

      int var7 = var4 >> 1;
      int var8;
      int var9;
      int var10;
      if (var3 && !var5) {
         var8 = (var4 >> 2) - (field3139 >> 2);
         var9 = (var4 >> 2) + (field3139 >> 2);
         var10 = field3139 >> 1;
      } else {
         var8 = 0;
         var9 = var7;
         var10 = var4 >> 1;
      }

      int var11;
      int var12;
      int var13;
      if (var3 && !var6) {
         var11 = var4 - (var4 >> 2) - (field3139 >> 2);
         var12 = var4 - (var4 >> 2) + (field3139 >> 2);
         var13 = field3139 >> 1;
      } else {
         var11 = var7;
         var12 = var4;
         var13 = var4 >> 1;
      }

      class124 var14 = field3144[field3131[var2]];
      int var16 = var14.field1063;
      int var17 = var14.field1065[var16];
      boolean var15 = !field3142[var17].method289();
      boolean var40 = var15;

      for(var17 = 0; var17 < var14.field1064; ++var17) {
         class275 var18 = field3143[var14.field1062[var17]];
         float[] var19 = field3152;
         var18.method1368(var19, var4 >> 1, var40);
      }

      int var41;
      if (!var15) {
         var17 = var14.field1063;
         var41 = var14.field1065[var17];
         field3142[var41].method287(field3152, var4 >> 1);
      }

      int var42;
      if (var15) {
         for(var17 = var4 >> 1; var17 < var4; ++var17) {
            field3152[var17] = 0.0F;
         }
      } else {
         var17 = var4 >> 1;
         var41 = var4 >> 2;
         var42 = var4 >> 3;
         float[] var20 = field3152;

         int var21;
         for(var21 = 0; var21 < var17; ++var21) {
            var20[var21] *= 0.5F;
         }

         for(var21 = var17; var21 < var4; ++var21) {
            var20[var21] = -var20[var4 - var21 - 1];
         }

         float[] var46 = var3 ? field3156 : field3153;
         float[] var22 = var3 ? field3158 : field3154;
         float[] var23 = var3 ? field3134 : field3155;
         int[] var24 = var3 ? field3160 : field3149;

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

         var25 = class380.method1883(var4 - 1);

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
            field3152[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }

         for(var47 = var11; var47 < var12; ++var47) {
            var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
            field3152[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
         }
      }

      float[] var43 = null;
      if (this.field3163 > 0) {
         var41 = this.field3163 + var4 >> 2;
         var43 = new float[var41];
         int var45;
         if (!this.field3151) {
            for(var42 = 0; var42 < this.field3150; ++var42) {
               var45 = (this.field3163 >> 1) + var42;
               var43[var42] += this.field3148[var45];
            }
         }

         if (!var15) {
            for(var42 = var8; var42 < var4 >> 1; ++var42) {
               var45 = var43.length - (var4 >> 1) + var42;
               var43[var45] += field3152[var42];
            }
         }
      }

      float[] var44 = this.field3148;
      this.field3148 = field3152;
      field3152 = var44;
      this.field3163 = var4;
      this.field3150 = var12 - (var4 >> 1);
      this.field3151 = var15;
      return var43;
   }

   @ObfInfo(
      owner = "be",
      name = "b",
      desc = "([I)Laf;"
   )
   class82 method1831(int[] var1) {
      if (var1 != null && var1[0] <= 0) {
         return null;
      } else {
         if (this.field3157 == null) {
            this.field3163 = 0;
            this.field3148 = new float[field3140];
            this.field3157 = new byte[this.field3132];
            this.field3146 = 0;
            this.field3161 = 0;
         }

         for(; this.field3161 < this.field3159.length; ++this.field3161) {
            if (var1 != null && var1[0] <= 0) {
               return null;
            }

            float[] var2 = this.method1833(this.field3161);
            if (var2 != null) {
               int var3 = this.field3146;
               int var4 = var2.length;
               if (var4 > this.field3132 - var3) {
                  var4 = this.field3132 - var3;
               }

               for(int var5 = 0; var5 < var4; ++var5) {
                  int var6 = (int)(128.0F + var2[var5] * 128.0F);
                  if ((var6 & -256) != 0) {
                     var6 = ~var6 >> 31;
                  }

                  this.field3157[var3++] = (byte)(var6 - 128);
               }

               if (var1 != null) {
                  var1[0] -= var3 - this.field3146;
               }

               this.field3146 = var3;
            }
         }

         this.field3148 = null;
         byte[] var7 = this.field3157;
         this.field3157 = null;
         return new class82(this.field3137, var7, this.field3162, this.field3130, this.field3135);
      }
   }

   @ObfInfo(
      owner = "be",
      name = "h",
      desc = "(I)F"
   )
   static float method1825(int var0) {
      int var1 = var0 & 2097151;
      int var2 = var0 & Integer.MIN_VALUE;
      int var3 = (var0 & 2145386496) >> 21;
      if (var2 != 0) {
         var1 = -var1;
      }

      return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
   }

   @ObfInfo(
      owner = "be",
      name = "e",
      desc = "([BI)V"
   )
   static void method1824(byte[] var0, int var1) {
      field3136 = var0;
      field3133 = var1;
      field3138 = 0;
   }

   @ObfInfo(
      owner = "be",
      name = "v",
      desc = "()I"
   )
   static int method1832() {
      int var0 = field3136[field3133] >> field3138 & 1;
      ++field3138;
      field3133 += field3138 >> 3;
      field3138 &= 7;
      return var0;
   }

   @ObfInfo(
      owner = "be",
      name = "x",
      desc = "(I)I"
   )
   static int method1826(int var0) {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var0 >= 8 - field3138; var0 -= var3) {
         var3 = 8 - field3138;
         int var4 = (1 << var3) - 1;
         var1 += (field3136[field3133] >> field3138 & var4) << var2;
         field3138 = 0;
         ++field3133;
         var2 += var3;
      }

      if (var0 > 0) {
         var3 = (1 << var0) - 1;
         var1 += (field3136[field3133] >> field3138 & var3) << var2;
         field3138 += var0;
      }

      return var1;
   }

   @ObfInfo(
      owner = "be",
      name = "q",
      desc = "([B)V"
   )
   static void method1828(byte[] var0) {
      method1824(var0, 0);
      field3139 = 1 << method1826(4);
      field3140 = 1 << method1826(4);
      field3152 = new float[field3140];

      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      for(var1 = 0; var1 < 2; ++var1) {
         var2 = var1 != 0 ? field3140 : field3139;
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
         int var10 = class380.method1883(var5 - 1);

         for(int var11 = 0; var11 < var5; ++var11) {
            var15[var11] = class486.method2385(var11, var10);
         }

         if (var1 != 0) {
            field3156 = var6;
            field3158 = var13;
            field3134 = var14;
            field3160 = var15;
         } else {
            field3153 = var6;
            field3154 = var13;
            field3155 = var14;
            field3149 = var15;
         }
      }

      var1 = method1826(8) + 1;
      field3141 = new class136[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         field3141[var2] = new class136();
      }

      var2 = method1826(6) + 1;

      for(var3 = 0; var3 < var2; ++var3) {
         method1826(16);
      }

      var2 = method1826(6) + 1;
      field3142 = new class62[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         field3142[var3] = new class62();
      }

      var3 = method1826(6) + 1;
      field3143 = new class275[var3];

      for(var4 = 0; var4 < var3; ++var4) {
         field3143[var4] = new class275();
      }

      var4 = method1826(6) + 1;
      field3144 = new class124[var4];

      for(var5 = 0; var5 < var4; ++var5) {
         field3144[var5] = new class124();
      }

      var5 = method1826(6) + 1;
      field3145 = new boolean[var5];
      field3131 = new int[var5];

      for(int var12 = 0; var12 < var5; ++var12) {
         field3145[var12] = method1832() != 0;
         method1826(16);
         method1826(16);
         field3131[var12] = method1826(8);
      }

   }

   @ObfInfo(
      owner = "be",
      name = "r",
      desc = "(Lly;)Z"
   )
   static boolean method1829(class274 var0) {
      if (!field3147) {
         byte[] var1 = var0.method1365(0, 0);
         if (var1 == null) {
            return false;
         }

         method1828(var1);
         field3147 = true;
      }

      return true;
   }

   @ObfInfo(
      owner = "be",
      name = "u",
      desc = "(Lly;II)Lbe;"
   )
   static class370 method1830(class274 var0, int var1, int var2) {
      if (!method1829(var0)) {
         var0.method1363(var1, var2);
         return null;
      } else {
         byte[] var3 = var0.method1365(var1, var2);
         return var3 == null ? null : new class370(var3);
      }
   }
}
