public class class311 extends class236 {
   static int field2963 = 0;
   static int[] field2937;
   static int[] field2946 = new int[10000];
   static int[] field2962 = new int[10000];
   static int[] field2964;
   boolean field2955 = false;
   byte field2939 = 0;
   byte[] field2933;
   byte[] field2935;
   byte[] field2936;
   byte[] field2954;
   byte[] field2959;
   class337[] field2951;
   class337[] field2952;
   class380[] field2950;
   int field2925;
   int field2929 = 0;
   int field2941 = 0;
   int field2949;
   int field2957;
   int field2958;
   int field2960;
   int field2965;
   int[] field2924;
   int[] field2927;
   int[] field2928;
   int[] field2930;
   int[] field2931;
   int[] field2932;
   int[] field2945;
   int[] field2956;
   int[][] field2934;
   int[][] field2940;
   int[][] field2947;
   int[][] field2948;
   short[] field2926;
   short[] field2938;
   short[] field2942;
   short[] field2943;
   short[] field2944;
   public short field2953;
   public short field2961;

   static {
      field2964 = class234.field2526;
      field2937 = class234.field2544;
   }

   class311() {
   }

   class311(byte[] var1) {
      class134 var2 = new class134(10);
      var2.method655(-2);
      if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
         this.method1490(var1);
      } else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
         this.method1511(var1);
      } else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method1513(var1);
      } else {
         this.method1512(var1);
      }

   }

   public class311(class311[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      this.field2941 = 0;
      this.field2929 = 0;
      this.field2925 = 0;
      this.field2939 = -1;

      int var10;
      class311 var11;
      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            this.field2941 += var11.field2941;
            this.field2929 += var11.field2929;
            this.field2925 += var11.field2925;
            if (var11.field2959 != null) {
               var4 = true;
            } else {
               if (this.field2939 == -1) {
                  this.field2939 = var11.field2939;
               }

               if (this.field2939 != var11.field2939) {
                  var4 = true;
               }
            }

            var3 |= var11.field2933 != null;
            var5 |= var11.field2935 != null;
            var6 |= var11.field2945 != null;
            var7 |= var11.field2938 != null;
            var8 |= var11.field2936 != null;
            var9 |= var11.field2948 != null;
         }
      }

      this.field2930 = new int[this.field2941];
      this.field2927 = new int[this.field2941];
      this.field2956 = new int[this.field2941];
      this.field2928 = new int[this.field2941];
      this.field2924 = new int[this.field2929];
      this.field2931 = new int[this.field2929];
      this.field2932 = new int[this.field2929];
      if (var3) {
         this.field2933 = new byte[this.field2929];
      }

      if (var4) {
         this.field2959 = new byte[this.field2929];
      }

      if (var5) {
         this.field2935 = new byte[this.field2929];
      }

      if (var6) {
         this.field2945 = new int[this.field2929];
      }

      if (var7) {
         this.field2938 = new short[this.field2929];
      }

      if (var8) {
         this.field2936 = new byte[this.field2929];
      }

      if (var9) {
         this.field2948 = new int[this.field2941][];
         this.field2940 = new int[this.field2941][];
      }

      this.field2926 = new short[this.field2929];
      if (this.field2925 > 0) {
         this.field2954 = new byte[this.field2925];
         this.field2942 = new short[this.field2925];
         this.field2943 = new short[this.field2925];
         this.field2944 = new short[this.field2925];
      }

      this.field2941 = 0;
      this.field2929 = 0;
      this.field2925 = 0;

      for(var10 = 0; var10 < var2; ++var10) {
         var11 = var1[var10];
         if (var11 != null) {
            int var12;
            for(var12 = 0; var12 < var11.field2929; ++var12) {
               if (var3 && var11.field2933 != null) {
                  this.field2933[this.field2929] = var11.field2933[var12];
               }

               if (var4) {
                  if (var11.field2959 != null) {
                     this.field2959[this.field2929] = var11.field2959[var12];
                  } else {
                     this.field2959[this.field2929] = var11.field2939;
                  }
               }

               if (var5 && var11.field2935 != null) {
                  this.field2935[this.field2929] = var11.field2935[var12];
               }

               if (var6 && var11.field2945 != null) {
                  this.field2945[this.field2929] = var11.field2945[var12];
               }

               if (var7) {
                  if (var11.field2938 != null) {
                     this.field2938[this.field2929] = var11.field2938[var12];
                  } else {
                     this.field2938[this.field2929] = -1;
                  }
               }

               if (var8) {
                  if (var11.field2936 != null && var11.field2936[var12] != -1) {
                     this.field2936[this.field2929] = (byte)(var11.field2936[var12] + this.field2925);
                  } else {
                     this.field2936[this.field2929] = -1;
                  }
               }

               this.field2926[this.field2929] = var11.field2926[var12];
               this.field2924[this.field2929] = this.method1492(var11, var11.field2924[var12]);
               this.field2931[this.field2929] = this.method1492(var11, var11.field2931[var12]);
               this.field2932[this.field2929] = this.method1492(var11, var11.field2932[var12]);
               ++this.field2929;
            }

            for(var12 = 0; var12 < var11.field2925; ++var12) {
               byte var13 = this.field2954[this.field2925] = var11.field2954[var12];
               if (var13 == 0) {
                  this.field2942[this.field2925] = (short)this.method1492(var11, var11.field2942[var12]);
                  this.field2943[this.field2925] = (short)this.method1492(var11, var11.field2943[var12]);
                  this.field2944[this.field2925] = (short)this.method1492(var11, var11.field2944[var12]);
               }

               ++this.field2925;
            }
         }
      }

   }

   public class311(class311 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      this.field2941 = var1.field2941;
      this.field2929 = var1.field2929;
      this.field2925 = var1.field2925;
      int var6;
      if (var2) {
         this.field2930 = var1.field2930;
         this.field2927 = var1.field2927;
         this.field2956 = var1.field2956;
      } else {
         this.field2930 = new int[this.field2941];
         this.field2927 = new int[this.field2941];
         this.field2956 = new int[this.field2941];

         for(var6 = 0; var6 < this.field2941; ++var6) {
            this.field2930[var6] = var1.field2930[var6];
            this.field2927[var6] = var1.field2927[var6];
            this.field2956[var6] = var1.field2956[var6];
         }
      }

      if (var3) {
         this.field2926 = var1.field2926;
      } else {
         this.field2926 = new short[this.field2929];

         for(var6 = 0; var6 < this.field2929; ++var6) {
            this.field2926[var6] = var1.field2926[var6];
         }
      }

      if (!var4 && var1.field2938 != null) {
         this.field2938 = new short[this.field2929];

         for(var6 = 0; var6 < this.field2929; ++var6) {
            this.field2938[var6] = var1.field2938[var6];
         }
      } else {
         this.field2938 = var1.field2938;
      }

      if (var5) {
         this.field2935 = var1.field2935;
      } else {
         this.field2935 = new byte[this.field2929];
         if (var1.field2935 == null) {
            for(var6 = 0; var6 < this.field2929; ++var6) {
               this.field2935[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.field2929; ++var6) {
               this.field2935[var6] = var1.field2935[var6];
            }
         }
      }

      this.field2924 = var1.field2924;
      this.field2931 = var1.field2931;
      this.field2932 = var1.field2932;
      this.field2933 = var1.field2933;
      this.field2959 = var1.field2959;
      this.field2936 = var1.field2936;
      this.field2939 = var1.field2939;
      this.field2954 = var1.field2954;
      this.field2942 = var1.field2942;
      this.field2943 = var1.field2943;
      this.field2944 = var1.field2944;
      this.field2928 = var1.field2928;
      this.field2945 = var1.field2945;
      this.field2934 = var1.field2934;
      this.field2947 = var1.field2947;
      this.field2951 = var1.field2951;
      this.field2950 = var1.field2950;
      this.field2952 = var1.field2952;
      this.field2948 = var1.field2948;
      this.field2940 = var1.field2940;
      this.field2953 = var1.field2953;
      this.field2961 = var1.field2961;
   }

   void method1490(byte[] var1) {
      class134 var2 = new class134(var1);
      class134 var3 = new class134(var1);
      class134 var4 = new class134(var1);
      class134 var5 = new class134(var1);
      class134 var6 = new class134(var1);
      class134 var7 = new class134(var1);
      class134 var8 = new class134(var1);
      var2.field1487 = var1.length - 26;
      int var9 = var2.method671();
      int var10 = var2.method671();
      int var11 = var2.method669();
      int var12 = var2.method669();
      int var13 = var2.method669();
      int var14 = var2.method669();
      int var15 = var2.method669();
      int var16 = var2.method669();
      int var17 = var2.method669();
      int var18 = var2.method669();
      int var19 = var2.method671();
      int var20 = var2.method671();
      int var21 = var2.method671();
      int var22 = var2.method671();
      int var23 = var2.method671();
      int var24 = var2.method671();
      int var25 = 0;
      int var26 = 0;
      int var27 = 0;
      int var28;
      if (var11 > 0) {
         this.field2954 = new byte[var11];
         var2.field1487 = 0;

         for(var28 = 0; var28 < var11; ++var28) {
            byte var29 = this.field2954[var28] = var2.method670();
            if (var29 == 0) {
               ++var25;
            }

            if (var29 >= 1 && var29 <= 3) {
               ++var26;
            }

            if (var29 == 2) {
               ++var27;
            }
         }
      }

      var28 = var11 + var9;
      int var30 = var28;
      if (var12 == 1) {
         var28 += var10;
      }

      int var31 = var28;
      var28 += var10;
      int var32 = var28;
      if (var13 == 255) {
         var28 += var10;
      }

      int var33 = var28;
      if (var15 == 1) {
         var28 += var10;
      }

      int var34 = var28;
      var28 += var24;
      int var35 = var28;
      if (var14 == 1) {
         var28 += var10;
      }

      int var36 = var28;
      var28 += var22;
      int var37 = var28;
      if (var16 == 1) {
         var28 += var10 * 2;
      }

      int var38 = var28;
      var28 += var23;
      int var39 = var28;
      var28 += var10 * 2;
      int var40 = var28;
      var28 += var19;
      int var41 = var28;
      var28 += var20;
      int var42 = var28;
      var28 += var21;
      int var43 = var28;
      var28 += var25 * 6;
      int var44 = var28;
      var28 += var26 * 6;
      int var45 = var28;
      var28 += var26 * 6;
      int var46 = var28;
      var28 += var26 * 2;
      int var47 = var28;
      var28 += var26;
      int var48 = var28;
      var28 += var26 * 2 + var27 * 2;
      this.field2941 = var9;
      this.field2929 = var10;
      this.field2925 = var11;
      this.field2930 = new int[var9];
      this.field2927 = new int[var9];
      this.field2956 = new int[var9];
      this.field2924 = new int[var10];
      this.field2931 = new int[var10];
      this.field2932 = new int[var10];
      if (var17 == 1) {
         this.field2928 = new int[var9];
      }

      if (var12 == 1) {
         this.field2933 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2959 = new byte[var10];
      } else {
         this.field2939 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2935 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2945 = new int[var10];
      }

      if (var16 == 1) {
         this.field2938 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2936 = new byte[var10];
      }

      if (var18 == 1) {
         this.field2948 = new int[var9][];
         this.field2940 = new int[var9][];
      }

      this.field2926 = new short[var10];
      if (var11 > 0) {
         this.field2942 = new short[var11];
         this.field2943 = new short[var11];
         this.field2944 = new short[var11];
      }

      var2.field1487 = var11;
      var3.field1487 = var40;
      var4.field1487 = var41;
      var5.field1487 = var42;
      var6.field1487 = var34;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var54;
      int var55;
      int var56;
      int var57;
      for(var53 = 0; var53 < var9; ++var53) {
         var54 = var2.method669();
         var55 = 0;
         if ((var54 & 1) != 0) {
            var55 = var3.method680();
         }

         var56 = 0;
         if ((var54 & 2) != 0) {
            var56 = var4.method680();
         }

         var57 = 0;
         if ((var54 & 4) != 0) {
            var57 = var5.method680();
         }

         this.field2930[var53] = var50 + var55;
         this.field2927[var53] = var51 + var56;
         this.field2956[var53] = var52 + var57;
         var50 = this.field2930[var53];
         var51 = this.field2927[var53];
         var52 = this.field2956[var53];
         if (var17 == 1) {
            this.field2928[var53] = var6.method669();
         }
      }

      if (var18 == 1) {
         for(var53 = 0; var53 < var9; ++var53) {
            var54 = var6.method669();
            this.field2948[var53] = new int[var54];
            this.field2940[var53] = new int[var54];

            for(var55 = 0; var55 < var54; ++var55) {
               this.field2948[var53][var55] = var6.method669();
               this.field2940[var53][var55] = var6.method669();
            }
         }
      }

      var2.field1487 = var39;
      var3.field1487 = var30;
      var4.field1487 = var32;
      var5.field1487 = var35;
      var6.field1487 = var33;
      var7.field1487 = var37;
      var8.field1487 = var38;

      for(var53 = 0; var53 < var10; ++var53) {
         this.field2926[var53] = (short)var2.method671();
         if (var12 == 1) {
            this.field2933[var53] = var3.method670();
         }

         if (var13 == 255) {
            this.field2959[var53] = var4.method670();
         }

         if (var14 == 1) {
            this.field2935[var53] = var5.method670();
         }

         if (var15 == 1) {
            this.field2945[var53] = var6.method669();
         }

         if (var16 == 1) {
            this.field2938[var53] = (short)(var7.method671() - 1);
         }

         if (this.field2936 != null && this.field2938[var53] != -1) {
            this.field2936[var53] = (byte)(var8.method669() - 1);
         }
      }

      var2.field1487 = var36;
      var3.field1487 = var31;
      var53 = 0;
      var54 = 0;
      var55 = 0;
      var56 = 0;

      int var58;
      for(var57 = 0; var57 < var10; ++var57) {
         var58 = var3.method669();
         if (var58 == 1) {
            var53 = var2.method680() + var56;
            var54 = var2.method680() + var53;
            var55 = var2.method680() + var54;
            var56 = var55;
            this.field2924[var57] = var53;
            this.field2931[var57] = var54;
            this.field2932[var57] = var55;
         }

         if (var58 == 2) {
            var54 = var55;
            var55 = var2.method680() + var56;
            var56 = var55;
            this.field2924[var57] = var53;
            this.field2931[var57] = var54;
            this.field2932[var57] = var55;
         }

         if (var58 == 3) {
            var53 = var55;
            var55 = var2.method680() + var56;
            var56 = var55;
            this.field2924[var57] = var53;
            this.field2931[var57] = var54;
            this.field2932[var57] = var55;
         }

         if (var58 == 4) {
            int var59 = var53;
            var53 = var54;
            var54 = var59;
            var55 = var2.method680() + var56;
            var56 = var55;
            this.field2924[var57] = var53;
            this.field2931[var57] = var59;
            this.field2932[var57] = var55;
         }
      }

      var2.field1487 = var43;
      var3.field1487 = var44;
      var4.field1487 = var45;
      var5.field1487 = var46;
      var6.field1487 = var47;
      var7.field1487 = var48;

      for(var57 = 0; var57 < var11; ++var57) {
         var58 = this.field2954[var57] & 255;
         if (var58 == 0) {
            this.field2942[var57] = (short)var2.method671();
            this.field2943[var57] = (short)var2.method671();
            this.field2944[var57] = (short)var2.method671();
         }
      }

      var2.field1487 = var28;
      var57 = var2.method669();
      if (var57 != 0) {
         new class83();
         var2.method671();
         var2.method671();
         var2.method671();
         var2.method717();
      }

   }

   void method1511(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class134 var4 = new class134(var1);
      class134 var5 = new class134(var1);
      class134 var6 = new class134(var1);
      class134 var7 = new class134(var1);
      class134 var8 = new class134(var1);
      var4.field1487 = var1.length - 23;
      int var9 = var4.method671();
      int var10 = var4.method671();
      int var11 = var4.method669();
      int var12 = var4.method669();
      int var13 = var4.method669();
      int var14 = var4.method669();
      int var15 = var4.method669();
      int var16 = var4.method669();
      int var17 = var4.method669();
      int var18 = var4.method671();
      int var19 = var4.method671();
      int var20 = var4.method671();
      int var21 = var4.method671();
      int var22 = var4.method671();
      byte var23 = 0;
      int var47 = var23 + var9;
      int var25 = var47;
      var47 += var10;
      int var26 = var47;
      if (var13 == 255) {
         var47 += var10;
      }

      int var27 = var47;
      if (var15 == 1) {
         var47 += var10;
      }

      int var28 = var47;
      if (var12 == 1) {
         var47 += var10;
      }

      int var29 = var47;
      var47 += var22;
      int var30 = var47;
      if (var14 == 1) {
         var47 += var10;
      }

      int var31 = var47;
      var47 += var21;
      int var32 = var47;
      var47 += var10 * 2;
      int var33 = var47;
      var47 += var11 * 6;
      int var34 = var47;
      var47 += var18;
      int var35 = var47;
      var47 += var19;
      int var10000 = var47 + var20;
      this.field2941 = var9;
      this.field2929 = var10;
      this.field2925 = var11;
      this.field2930 = new int[var9];
      this.field2927 = new int[var9];
      this.field2956 = new int[var9];
      this.field2924 = new int[var10];
      this.field2931 = new int[var10];
      this.field2932 = new int[var10];
      if (var11 > 0) {
         this.field2954 = new byte[var11];
         this.field2942 = new short[var11];
         this.field2943 = new short[var11];
         this.field2944 = new short[var11];
      }

      if (var16 == 1) {
         this.field2928 = new int[var9];
      }

      if (var12 == 1) {
         this.field2933 = new byte[var10];
         this.field2936 = new byte[var10];
         this.field2938 = new short[var10];
      }

      if (var13 == 255) {
         this.field2959 = new byte[var10];
      } else {
         this.field2939 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2935 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2945 = new int[var10];
      }

      if (var17 == 1) {
         this.field2948 = new int[var9][];
         this.field2940 = new int[var9][];
      }

      this.field2926 = new short[var10];
      var4.field1487 = var23;
      var5.field1487 = var34;
      var6.field1487 = var35;
      var7.field1487 = var47;
      var8.field1487 = var29;
      int var37 = 0;
      int var38 = 0;
      int var39 = 0;

      int var40;
      int var41;
      int var42;
      int var43;
      int var44;
      for(var40 = 0; var40 < var9; ++var40) {
         var41 = var4.method669();
         var42 = 0;
         if ((var41 & 1) != 0) {
            var42 = var5.method680();
         }

         var43 = 0;
         if ((var41 & 2) != 0) {
            var43 = var6.method680();
         }

         var44 = 0;
         if ((var41 & 4) != 0) {
            var44 = var7.method680();
         }

         this.field2930[var40] = var37 + var42;
         this.field2927[var40] = var38 + var43;
         this.field2956[var40] = var39 + var44;
         var37 = this.field2930[var40];
         var38 = this.field2927[var40];
         var39 = this.field2956[var40];
         if (var16 == 1) {
            this.field2928[var40] = var8.method669();
         }
      }

      if (var17 == 1) {
         for(var40 = 0; var40 < var9; ++var40) {
            var41 = var8.method669();
            this.field2948[var40] = new int[var41];
            this.field2940[var40] = new int[var41];

            for(var42 = 0; var42 < var41; ++var42) {
               this.field2948[var40][var42] = var8.method669();
               this.field2940[var40][var42] = var8.method669();
            }
         }
      }

      var4.field1487 = var32;
      var5.field1487 = var28;
      var6.field1487 = var26;
      var7.field1487 = var30;
      var8.field1487 = var27;

      for(var40 = 0; var40 < var10; ++var40) {
         this.field2926[var40] = (short)var4.method671();
         if (var12 == 1) {
            var41 = var5.method669();
            if ((var41 & 1) == 1) {
               this.field2933[var40] = 1;
               var2 = true;
            } else {
               this.field2933[var40] = 0;
            }

            if ((var41 & 2) == 2) {
               this.field2936[var40] = (byte)(var41 >> 2);
               this.field2938[var40] = this.field2926[var40];
               this.field2926[var40] = 127;
               if (this.field2938[var40] != -1) {
                  var3 = true;
               }
            } else {
               this.field2936[var40] = -1;
               this.field2938[var40] = -1;
            }
         }

         if (var13 == 255) {
            this.field2959[var40] = var6.method670();
         }

         if (var14 == 1) {
            this.field2935[var40] = var7.method670();
         }

         if (var15 == 1) {
            this.field2945[var40] = var8.method669();
         }
      }

      var4.field1487 = var31;
      var5.field1487 = var25;
      var40 = 0;
      var41 = 0;
      var42 = 0;
      var43 = 0;

      int var45;
      int var46;
      for(var44 = 0; var44 < var10; ++var44) {
         var45 = var5.method669();
         if (var45 == 1) {
            var40 = var4.method680() + var43;
            var41 = var4.method680() + var40;
            var42 = var4.method680() + var41;
            var43 = var42;
            this.field2924[var44] = var40;
            this.field2931[var44] = var41;
            this.field2932[var44] = var42;
         }

         if (var45 == 2) {
            var41 = var42;
            var42 = var4.method680() + var43;
            var43 = var42;
            this.field2924[var44] = var40;
            this.field2931[var44] = var41;
            this.field2932[var44] = var42;
         }

         if (var45 == 3) {
            var40 = var42;
            var42 = var4.method680() + var43;
            var43 = var42;
            this.field2924[var44] = var40;
            this.field2931[var44] = var41;
            this.field2932[var44] = var42;
         }

         if (var45 == 4) {
            var46 = var40;
            var40 = var41;
            var41 = var46;
            var42 = var4.method680() + var43;
            var43 = var42;
            this.field2924[var44] = var40;
            this.field2931[var44] = var46;
            this.field2932[var44] = var42;
         }
      }

      var4.field1487 = var33;

      for(var44 = 0; var44 < var11; ++var44) {
         this.field2954[var44] = 0;
         this.field2942[var44] = (short)var4.method671();
         this.field2943[var44] = (short)var4.method671();
         this.field2944[var44] = (short)var4.method671();
      }

      if (this.field2936 != null) {
         boolean var48 = false;

         for(var45 = 0; var45 < var10; ++var45) {
            var46 = this.field2936[var45] & 255;
            if (var46 != 255) {
               if ((this.field2942[var46] & '\uffff') == this.field2924[var45] && (this.field2943[var46] & '\uffff') == this.field2931[var45] && (this.field2944[var46] & '\uffff') == this.field2932[var45]) {
                  this.field2936[var45] = -1;
               } else {
                  var48 = true;
               }
            }
         }

         if (!var48) {
            this.field2936 = null;
         }
      }

      if (!var3) {
         this.field2938 = null;
      }

      if (!var2) {
         this.field2933 = null;
      }

   }

   void method1513(byte[] var1) {
      class134 var2 = new class134(var1);
      class134 var3 = new class134(var1);
      class134 var4 = new class134(var1);
      class134 var5 = new class134(var1);
      class134 var6 = new class134(var1);
      class134 var7 = new class134(var1);
      class134 var8 = new class134(var1);
      var2.field1487 = var1.length - 23;
      int var9 = var2.method671();
      int var10 = var2.method671();
      int var11 = var2.method669();
      int var12 = var2.method669();
      int var13 = var2.method669();
      int var14 = var2.method669();
      int var15 = var2.method669();
      int var16 = var2.method669();
      int var17 = var2.method669();
      int var18 = var2.method671();
      int var19 = var2.method671();
      int var20 = var2.method671();
      int var21 = var2.method671();
      int var22 = var2.method671();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if (var11 > 0) {
         this.field2954 = new byte[var11];
         var2.field1487 = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field2954[var26] = var2.method670();
            if (var27 == 0) {
               ++var23;
            }

            if (var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if (var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if (var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if (var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if (var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if (var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if (var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if (var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field2941 = var9;
      this.field2929 = var10;
      this.field2925 = var11;
      this.field2930 = new int[var9];
      this.field2927 = new int[var9];
      this.field2956 = new int[var9];
      this.field2924 = new int[var10];
      this.field2931 = new int[var10];
      this.field2932 = new int[var10];
      if (var17 == 1) {
         this.field2928 = new int[var9];
      }

      if (var12 == 1) {
         this.field2933 = new byte[var10];
      }

      if (var13 == 255) {
         this.field2959 = new byte[var10];
      } else {
         this.field2939 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2935 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2945 = new int[var10];
      }

      if (var16 == 1) {
         this.field2938 = new short[var10];
      }

      if (var16 == 1 && var11 > 0) {
         this.field2936 = new byte[var10];
      }

      this.field2926 = new short[var10];
      if (var11 > 0) {
         this.field2942 = new short[var11];
         this.field2943 = new short[var11];
         this.field2944 = new short[var11];
      }

      var2.field1487 = var11;
      var3.field1487 = var38;
      var4.field1487 = var39;
      var5.field1487 = var40;
      var6.field1487 = var32;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.method669();
         var53 = 0;
         if ((var52 & 1) != 0) {
            var53 = var3.method680();
         }

         var54 = 0;
         if ((var52 & 2) != 0) {
            var54 = var4.method680();
         }

         var55 = 0;
         if ((var52 & 4) != 0) {
            var55 = var5.method680();
         }

         this.field2930[var51] = var48 + var53;
         this.field2927[var51] = var49 + var54;
         this.field2956[var51] = var50 + var55;
         var48 = this.field2930[var51];
         var49 = this.field2927[var51];
         var50 = this.field2956[var51];
         if (var17 == 1) {
            this.field2928[var51] = var6.method669();
         }
      }

      var2.field1487 = var37;
      var3.field1487 = var28;
      var4.field1487 = var30;
      var5.field1487 = var33;
      var6.field1487 = var31;
      var7.field1487 = var35;
      var8.field1487 = var36;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field2926[var51] = (short)var2.method671();
         if (var12 == 1) {
            this.field2933[var51] = var3.method670();
         }

         if (var13 == 255) {
            this.field2959[var51] = var4.method670();
         }

         if (var14 == 1) {
            this.field2935[var51] = var5.method670();
         }

         if (var15 == 1) {
            this.field2945[var51] = var6.method669();
         }

         if (var16 == 1) {
            this.field2938[var51] = (short)(var7.method671() - 1);
         }

         if (this.field2936 != null && this.field2938[var51] != -1) {
            this.field2936[var51] = (byte)(var8.method669() - 1);
         }
      }

      var2.field1487 = var34;
      var3.field1487 = var29;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.method669();
         if (var56 == 1) {
            var51 = var2.method680() + var54;
            var52 = var2.method680() + var51;
            var53 = var2.method680() + var52;
            var54 = var53;
            this.field2924[var55] = var51;
            this.field2931[var55] = var52;
            this.field2932[var55] = var53;
         }

         if (var56 == 2) {
            var52 = var53;
            var53 = var2.method680() + var54;
            var54 = var53;
            this.field2924[var55] = var51;
            this.field2931[var55] = var52;
            this.field2932[var55] = var53;
         }

         if (var56 == 3) {
            var51 = var53;
            var53 = var2.method680() + var54;
            var54 = var53;
            this.field2924[var55] = var51;
            this.field2931[var55] = var52;
            this.field2932[var55] = var53;
         }

         if (var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method680() + var54;
            var54 = var53;
            this.field2924[var55] = var51;
            this.field2931[var55] = var57;
            this.field2932[var55] = var53;
         }
      }

      var2.field1487 = var41;
      var3.field1487 = var42;
      var4.field1487 = var43;
      var5.field1487 = var44;
      var6.field1487 = var45;
      var7.field1487 = var46;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field2954[var55] & 255;
         if (var56 == 0) {
            this.field2942[var55] = (short)var2.method671();
            this.field2943[var55] = (short)var2.method671();
            this.field2944[var55] = (short)var2.method671();
         }
      }

      var2.field1487 = var26;
      var55 = var2.method669();
      if (var55 != 0) {
         new class83();
         var2.method671();
         var2.method671();
         var2.method671();
         var2.method717();
      }

   }

   void method1512(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      class134 var4 = new class134(var1);
      class134 var5 = new class134(var1);
      class134 var6 = new class134(var1);
      class134 var7 = new class134(var1);
      class134 var8 = new class134(var1);
      var4.field1487 = var1.length - 18;
      int var9 = var4.method671();
      int var10 = var4.method671();
      int var11 = var4.method669();
      int var12 = var4.method669();
      int var13 = var4.method669();
      int var14 = var4.method669();
      int var15 = var4.method669();
      int var16 = var4.method669();
      int var17 = var4.method671();
      int var18 = var4.method671();
      int var19 = var4.method671();
      int var20 = var4.method671();
      byte var21 = 0;
      int var45 = var21 + var9;
      int var23 = var45;
      var45 += var10;
      int var24 = var45;
      if (var13 == 255) {
         var45 += var10;
      }

      int var25 = var45;
      if (var15 == 1) {
         var45 += var10;
      }

      int var26 = var45;
      if (var12 == 1) {
         var45 += var10;
      }

      int var27 = var45;
      if (var16 == 1) {
         var45 += var9;
      }

      int var28 = var45;
      if (var14 == 1) {
         var45 += var10;
      }

      int var29 = var45;
      var45 += var20;
      int var30 = var45;
      var45 += var10 * 2;
      int var31 = var45;
      var45 += var11 * 6;
      int var32 = var45;
      var45 += var17;
      int var33 = var45;
      var45 += var18;
      int var10000 = var45 + var19;
      this.field2941 = var9;
      this.field2929 = var10;
      this.field2925 = var11;
      this.field2930 = new int[var9];
      this.field2927 = new int[var9];
      this.field2956 = new int[var9];
      this.field2924 = new int[var10];
      this.field2931 = new int[var10];
      this.field2932 = new int[var10];
      if (var11 > 0) {
         this.field2954 = new byte[var11];
         this.field2942 = new short[var11];
         this.field2943 = new short[var11];
         this.field2944 = new short[var11];
      }

      if (var16 == 1) {
         this.field2928 = new int[var9];
      }

      if (var12 == 1) {
         this.field2933 = new byte[var10];
         this.field2936 = new byte[var10];
         this.field2938 = new short[var10];
      }

      if (var13 == 255) {
         this.field2959 = new byte[var10];
      } else {
         this.field2939 = (byte)var13;
      }

      if (var14 == 1) {
         this.field2935 = new byte[var10];
      }

      if (var15 == 1) {
         this.field2945 = new int[var10];
      }

      this.field2926 = new short[var10];
      var4.field1487 = var21;
      var5.field1487 = var32;
      var6.field1487 = var33;
      var7.field1487 = var45;
      var8.field1487 = var27;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.method669();
         var40 = 0;
         if ((var39 & 1) != 0) {
            var40 = var5.method680();
         }

         var41 = 0;
         if ((var39 & 2) != 0) {
            var41 = var6.method680();
         }

         var42 = 0;
         if ((var39 & 4) != 0) {
            var42 = var7.method680();
         }

         this.field2930[var38] = var35 + var40;
         this.field2927[var38] = var36 + var41;
         this.field2956[var38] = var37 + var42;
         var35 = this.field2930[var38];
         var36 = this.field2927[var38];
         var37 = this.field2956[var38];
         if (var16 == 1) {
            this.field2928[var38] = var8.method669();
         }
      }

      var4.field1487 = var30;
      var5.field1487 = var26;
      var6.field1487 = var24;
      var7.field1487 = var28;
      var8.field1487 = var25;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field2926[var38] = (short)var4.method671();
         if (var12 == 1) {
            var39 = var5.method669();
            if ((var39 & 1) == 1) {
               this.field2933[var38] = 1;
               var2 = true;
            } else {
               this.field2933[var38] = 0;
            }

            if ((var39 & 2) == 2) {
               this.field2936[var38] = (byte)(var39 >> 2);
               this.field2938[var38] = this.field2926[var38];
               this.field2926[var38] = 127;
               if (this.field2938[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field2936[var38] = -1;
               this.field2938[var38] = -1;
            }
         }

         if (var13 == 255) {
            this.field2959[var38] = var6.method670();
         }

         if (var14 == 1) {
            this.field2935[var38] = var7.method670();
         }

         if (var15 == 1) {
            this.field2945[var38] = var8.method669();
         }
      }

      var4.field1487 = var29;
      var5.field1487 = var23;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.method669();
         if (var43 == 1) {
            var38 = var4.method680() + var41;
            var39 = var4.method680() + var38;
            var40 = var4.method680() + var39;
            var41 = var40;
            this.field2924[var42] = var38;
            this.field2931[var42] = var39;
            this.field2932[var42] = var40;
         }

         if (var43 == 2) {
            var39 = var40;
            var40 = var4.method680() + var41;
            var41 = var40;
            this.field2924[var42] = var38;
            this.field2931[var42] = var39;
            this.field2932[var42] = var40;
         }

         if (var43 == 3) {
            var38 = var40;
            var40 = var4.method680() + var41;
            var41 = var40;
            this.field2924[var42] = var38;
            this.field2931[var42] = var39;
            this.field2932[var42] = var40;
         }

         if (var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method680() + var41;
            var41 = var40;
            this.field2924[var42] = var38;
            this.field2931[var42] = var44;
            this.field2932[var42] = var40;
         }
      }

      var4.field1487 = var31;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field2954[var42] = 0;
         this.field2942[var42] = (short)var4.method671();
         this.field2943[var42] = (short)var4.method671();
         this.field2944[var42] = (short)var4.method671();
      }

      if (this.field2936 != null) {
         boolean var46 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field2936[var43] & 255;
            if (var44 != 255) {
               if ((this.field2942[var44] & '\uffff') == this.field2924[var43] && (this.field2943[var44] & '\uffff') == this.field2931[var43] && (this.field2944[var44] & '\uffff') == this.field2932[var43]) {
                  this.field2936[var43] = -1;
               } else {
                  var46 = true;
               }
            }
         }

         if (!var46) {
            this.field2936 = null;
         }
      }

      if (!var3) {
         this.field2938 = null;
      }

      if (!var2) {
         this.field2933 = null;
      }

   }

   final int method1492(class311 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field2930[var2];
      int var5 = var1.field2927[var2];
      int var6 = var1.field2956[var2];

      for(int var7 = 0; var7 < this.field2941; ++var7) {
         if (var4 == this.field2930[var7] && var5 == this.field2927[var7] && var6 == this.field2956[var7]) {
            var3 = var7;
            break;
         }
      }

      if (var3 == -1) {
         this.field2930[this.field2941] = var4;
         this.field2927[this.field2941] = var5;
         this.field2956[this.field2941] = var6;
         if (var1.field2928 != null) {
            this.field2928[this.field2941] = var1.field2928[var2];
         }

         if (var1.field2948 != null) {
            this.field2948[this.field2941] = var1.field2948[var2];
            this.field2940[this.field2941] = var1.field2940[var2];
         }

         var3 = this.field2941++;
      }

      return var3;
   }

   public class311 method1491() {
      class311 var1 = new class311();
      if (this.field2933 != null) {
         var1.field2933 = new byte[this.field2929];

         for(int var2 = 0; var2 < this.field2929; ++var2) {
            var1.field2933[var2] = this.field2933[var2];
         }
      }

      var1.field2941 = this.field2941;
      var1.field2929 = this.field2929;
      var1.field2925 = this.field2925;
      var1.field2930 = this.field2930;
      var1.field2927 = this.field2927;
      var1.field2956 = this.field2956;
      var1.field2924 = this.field2924;
      var1.field2931 = this.field2931;
      var1.field2932 = this.field2932;
      var1.field2959 = this.field2959;
      var1.field2935 = this.field2935;
      var1.field2936 = this.field2936;
      var1.field2926 = this.field2926;
      var1.field2938 = this.field2938;
      var1.field2939 = this.field2939;
      var1.field2954 = this.field2954;
      var1.field2942 = this.field2942;
      var1.field2943 = this.field2943;
      var1.field2944 = this.field2944;
      var1.field2928 = this.field2928;
      var1.field2945 = this.field2945;
      var1.field2934 = this.field2934;
      var1.field2947 = this.field2947;
      var1.field2951 = this.field2951;
      var1.field2950 = this.field2950;
      var1.field2953 = this.field2953;
      var1.field2961 = this.field2961;
      return var1;
   }

   public class311 method1493(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method1505();
      int var7 = var2 + this.field2965;
      int var8 = var2 + this.field2958;
      int var9 = var4 + this.field2960;
      int var10 = var4 + this.field2957;
      if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class311 var11;
            if (var5) {
               var11 = new class311();
               var11.field2941 = this.field2941;
               var11.field2929 = this.field2929;
               var11.field2925 = this.field2925;
               var11.field2930 = this.field2930;
               var11.field2956 = this.field2956;
               var11.field2924 = this.field2924;
               var11.field2931 = this.field2931;
               var11.field2932 = this.field2932;
               var11.field2933 = this.field2933;
               var11.field2959 = this.field2959;
               var11.field2935 = this.field2935;
               var11.field2936 = this.field2936;
               var11.field2926 = this.field2926;
               var11.field2938 = this.field2938;
               var11.field2939 = this.field2939;
               var11.field2954 = this.field2954;
               var11.field2942 = this.field2942;
               var11.field2943 = this.field2943;
               var11.field2944 = this.field2944;
               var11.field2928 = this.field2928;
               var11.field2945 = this.field2945;
               var11.field2934 = this.field2934;
               var11.field2947 = this.field2947;
               var11.field2953 = this.field2953;
               var11.field2961 = this.field2961;
               var11.field2927 = new int[var11.field2941];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var6 == 0) {
               for(var12 = 0; var12 < var11.field2941; ++var12) {
                  var13 = this.field2930[var12] + var2;
                  var14 = this.field2956[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field2927[var12] = this.field2927[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field2941; ++var12) {
                  var13 = (-this.field2927[var12] << 16) / super.field2554;
                  if (var13 < var6) {
                     var14 = this.field2930[var12] + var2;
                     var15 = this.field2956[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field2927[var12] = this.field2927[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method1504();
            return var11;
         }
      } else {
         return this;
      }
   }

   void method1494() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if (this.field2928 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2941; ++var3) {
            var4 = this.field2928[var3];
            ++var1[var4];
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2934 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2934[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2941; this.field2934[var4][var1[var4]++] = var3++) {
            var4 = this.field2928[var3];
         }

         this.field2928 = null;
      }

      if (this.field2945 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field2929; ++var3) {
            var4 = this.field2945[var3];
            ++var1[var4];
            if (var4 > var2) {
               var2 = var4;
            }
         }

         this.field2947 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field2947[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field2929; this.field2947[var4][var1[var4]++] = var3++) {
            var4 = this.field2945[var3];
         }

         this.field2945 = null;
      }

   }

   public void method1495() {
      for(int var1 = 0; var1 < this.field2941; ++var1) {
         int var2 = this.field2930[var1];
         this.field2930[var1] = this.field2956[var1];
         this.field2956[var1] = -var2;
      }

      this.method1504();
   }

   public void method1510() {
      for(int var1 = 0; var1 < this.field2941; ++var1) {
         this.field2930[var1] = -this.field2930[var1];
         this.field2956[var1] = -this.field2956[var1];
      }

      this.method1504();
   }

   public void method1496() {
      for(int var1 = 0; var1 < this.field2941; ++var1) {
         int var2 = this.field2956[var1];
         this.field2956[var1] = this.field2930[var1];
         this.field2930[var1] = -var2;
      }

      this.method1504();
   }

   public void method1497(int var1) {
      int var2 = field2964[var1];
      int var3 = field2937[var1];

      for(int var4 = 0; var4 < this.field2941; ++var4) {
         int var5 = this.field2956[var4] * var2 + this.field2930[var4] * var3 >> 16;
         this.field2956[var4] = this.field2956[var4] * var3 - this.field2930[var4] * var2 >> 16;
         this.field2930[var4] = var5;
      }

      this.method1504();
   }

   public void method1498(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2941; ++var4) {
         this.field2930[var4] += var1;
         this.field2927[var4] += var2;
         this.field2956[var4] += var3;
      }

      this.method1504();
   }

   public void method1499(short var1, short var2) {
      for(int var3 = 0; var3 < this.field2929; ++var3) {
         if (this.field2926[var3] == var1) {
            this.field2926[var3] = var2;
         }
      }

   }

   public void method1500(short var1, short var2) {
      if (this.field2938 != null) {
         for(int var3 = 0; var3 < this.field2929; ++var3) {
            if (this.field2938[var3] == var1) {
               this.field2938[var3] = var2;
            }
         }

      }
   }

   public void method1501() {
      int var1;
      for(var1 = 0; var1 < this.field2941; ++var1) {
         this.field2956[var1] = -this.field2956[var1];
      }

      for(var1 = 0; var1 < this.field2929; ++var1) {
         int var2 = this.field2924[var1];
         this.field2924[var1] = this.field2932[var1];
         this.field2932[var1] = var2;
      }

      this.method1504();
   }

   public void method1502(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field2941; ++var4) {
         this.field2930[var4] = this.field2930[var4] * var1 / 128;
         this.field2927[var4] = this.field2927[var4] * var2 / 128;
         this.field2956[var4] = this.field2956[var4] * var3 / 128;
      }

      this.method1504();
   }

   public void method1503() {
      if (this.field2951 == null) {
         this.field2951 = new class337[this.field2941];

         int var1;
         for(var1 = 0; var1 < this.field2941; ++var1) {
            this.field2951[var1] = new class337();
         }

         for(var1 = 0; var1 < this.field2929; ++var1) {
            int var2 = this.field2924[var1];
            int var3 = this.field2931[var1];
            int var4 = this.field2932[var1];
            int var5 = this.field2930[var3] - this.field2930[var2];
            int var6 = this.field2927[var3] - this.field2927[var2];
            int var7 = this.field2956[var3] - this.field2956[var2];
            int var8 = this.field2930[var4] - this.field2930[var2];
            int var9 = this.field2927[var4] - this.field2927[var2];
            int var10 = this.field2956[var4] - this.field2956[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if (var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if (this.field2933 == null) {
               var15 = 0;
            } else {
               var15 = this.field2933[var1];
            }

            if (var15 == 0) {
               class337 var16 = this.field2951[var2];
               var16.field3115 += var11;
               var16.field3118 += var12;
               var16.field3116 += var13;
               ++var16.field3117;
               var16 = this.field2951[var3];
               var16.field3115 += var11;
               var16.field3118 += var12;
               var16.field3116 += var13;
               ++var16.field3117;
               var16 = this.field2951[var4];
               var16.field3115 += var11;
               var16.field3118 += var12;
               var16.field3116 += var13;
               ++var16.field3117;
            } else if (var15 == 1) {
               if (this.field2950 == null) {
                  this.field2950 = new class380[this.field2929];
               }

               class380 var17 = this.field2950[var1] = new class380();
               var17.field3322 = var11;
               var17.field3321 = var12;
               var17.field3323 = var13;
            }
         }

      }
   }

   void method1504() {
      this.field2951 = null;
      this.field2952 = null;
      this.field2950 = null;
      this.field2955 = false;
   }

   void method1505() {
      if (!this.field2955) {
         super.field2554 = 0;
         this.field2949 = 0;
         this.field2965 = 999999;
         this.field2958 = -999999;
         this.field2957 = -99999;
         this.field2960 = 99999;

         for(int var1 = 0; var1 < this.field2941; ++var1) {
            int var2 = this.field2930[var1];
            int var3 = this.field2927[var1];
            int var4 = this.field2956[var1];
            if (var2 < this.field2965) {
               this.field2965 = var2;
            }

            if (var2 > this.field2958) {
               this.field2958 = var2;
            }

            if (var4 < this.field2960) {
               this.field2960 = var4;
            }

            if (var4 > this.field2957) {
               this.field2957 = var4;
            }

            if (-var3 > super.field2554) {
               super.field2554 = -var3;
            }

            if (var3 > this.field2949) {
               this.field2949 = var3;
            }
         }

         this.field2955 = true;
      }
   }

   public final class491 method1507(int var1, int var2, int var3, int var4, int var5) {
      this.method1503();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class491 var8 = new class491();
      var8.field4058 = new int[this.field2929];
      var8.field4092 = new int[this.field2929];
      var8.field4060 = new int[this.field2929];
      if (this.field2925 > 0 && this.field2936 != null) {
         int[] var9 = new int[this.field2925];

         int var10;
         for(var10 = 0; var10 < this.field2929; ++var10) {
            if (this.field2936[var10] != -1) {
               ++var9[this.field2936[var10] & 255];
            }
         }

         var8.field4098 = 0;

         for(var10 = 0; var10 < this.field2925; ++var10) {
            if (var9[var10] > 0 && this.field2954[var10] == 0) {
               ++var8.field4098;
            }
         }

         var8.field4054 = new int[var8.field4098];
         var8.field4068 = new int[var8.field4098];
         var8.field4069 = new int[var8.field4098];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field2925; ++var11) {
            if (var9[var11] > 0 && this.field2954[var11] == 0) {
               var8.field4054[var10] = this.field2942[var11] & '\uffff';
               var8.field4068[var10] = this.field2943[var11] & '\uffff';
               var8.field4069[var10] = this.field2944[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field4078 = new byte[this.field2929];

         for(var11 = 0; var11 < this.field2929; ++var11) {
            if (this.field2936[var11] != -1) {
               var8.field4078[var11] = (byte)var9[this.field2936[var11] & 255];
            } else {
               var8.field4078[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field2929; ++var16) {
         byte var17;
         if (this.field2933 == null) {
            var17 = 0;
         } else {
            var17 = this.field2933[var16];
         }

         byte var18;
         if (this.field2935 == null) {
            var18 = 0;
         } else {
            var18 = this.field2935[var16];
         }

         short var12;
         if (this.field2938 == null) {
            var12 = -1;
         } else {
            var12 = this.field2938[var16];
         }

         if (var18 == -2) {
            var17 = 3;
         }

         if (var18 == -1) {
            var17 = 2;
         }

         class337 var13;
         int var14;
         class380 var19;
         if (var12 == -1) {
            if (var17 != 0) {
               if (var17 == 1) {
                  var19 = this.field2950[var16];
                  var14 = var1 + (var3 * var19.field3322 + var4 * var19.field3321 + var5 * var19.field3323) / (var7 + var7 / 2);
                  var8.field4058[var16] = method1508(this.field2926[var16] & '\uffff', var14);
                  var8.field4060[var16] = -1;
               } else if (var17 == 3) {
                  var8.field4058[var16] = 128;
                  var8.field4060[var16] = -1;
               } else {
                  var8.field4060[var16] = -2;
               }
            } else {
               int var15 = this.field2926[var16] & '\uffff';
               if (this.field2952 != null && this.field2952[this.field2924[var16]] != null) {
                  var13 = this.field2952[this.field2924[var16]];
               } else {
                  var13 = this.field2951[this.field2924[var16]];
               }

               var14 = var1 + (var3 * var13.field3115 + var4 * var13.field3118 + var5 * var13.field3116) / (var7 * var13.field3117);
               var8.field4058[var16] = method1508(var15, var14);
               if (this.field2952 != null && this.field2952[this.field2931[var16]] != null) {
                  var13 = this.field2952[this.field2931[var16]];
               } else {
                  var13 = this.field2951[this.field2931[var16]];
               }

               var14 = var1 + (var3 * var13.field3115 + var4 * var13.field3118 + var5 * var13.field3116) / (var7 * var13.field3117);
               var8.field4092[var16] = method1508(var15, var14);
               if (this.field2952 != null && this.field2952[this.field2932[var16]] != null) {
                  var13 = this.field2952[this.field2932[var16]];
               } else {
                  var13 = this.field2951[this.field2932[var16]];
               }

               var14 = var1 + (var3 * var13.field3115 + var4 * var13.field3118 + var5 * var13.field3116) / (var7 * var13.field3117);
               var8.field4060[var16] = method1508(var15, var14);
            }
         } else if (var17 != 0) {
            if (var17 == 1) {
               var19 = this.field2950[var16];
               var14 = var1 + (var3 * var19.field3322 + var4 * var19.field3321 + var5 * var19.field3323) / (var7 + var7 / 2);
               var8.field4058[var16] = method1509(var14);
               var8.field4060[var16] = -1;
            } else {
               var8.field4060[var16] = -2;
            }
         } else {
            if (this.field2952 != null && this.field2952[this.field2924[var16]] != null) {
               var13 = this.field2952[this.field2924[var16]];
            } else {
               var13 = this.field2951[this.field2924[var16]];
            }

            var14 = var1 + (var3 * var13.field3115 + var4 * var13.field3118 + var5 * var13.field3116) / (var7 * var13.field3117);
            var8.field4058[var16] = method1509(var14);
            if (this.field2952 != null && this.field2952[this.field2931[var16]] != null) {
               var13 = this.field2952[this.field2931[var16]];
            } else {
               var13 = this.field2951[this.field2931[var16]];
            }

            var14 = var1 + (var3 * var13.field3115 + var4 * var13.field3118 + var5 * var13.field3116) / (var7 * var13.field3117);
            var8.field4092[var16] = method1509(var14);
            if (this.field2952 != null && this.field2952[this.field2932[var16]] != null) {
               var13 = this.field2952[this.field2932[var16]];
            } else {
               var13 = this.field2951[this.field2932[var16]];
            }

            var14 = var1 + (var3 * var13.field3115 + var4 * var13.field3118 + var5 * var13.field3116) / (var7 * var13.field3117);
            var8.field4060[var16] = method1509(var14);
         }
      }

      this.method1494();
      var8.field4050 = this.field2941;
      var8.field4077 = this.field2930;
      var8.field4083 = this.field2927;
      var8.field4099 = this.field2956;
      var8.field4091 = this.field2929;
      var8.field4067 = this.field2924;
      var8.field4063 = this.field2931;
      var8.field4057 = this.field2932;
      var8.field4102 = this.field2959;
      var8.field4090 = this.field2935;
      var8.field4065 = this.field2939;
      var8.field4070 = this.field2934;
      var8.field4071 = this.field2947;
      var8.field4089 = this.field2938;
      var8.field4072 = this.field2948;
      var8.field4073 = this.field2940;
      return var8;
   }

   public static class311 method1489(class164 var0, int var1, int var2) {
      byte[] var3 = var0.method892(var1, var2);
      return var3 == null ? null : new class311(var3);
   }

   static void method1506(class311 var0, class311 var1, int var2, int var3, int var4, boolean var5) {
      var0.method1505();
      var0.method1503();
      var1.method1505();
      var1.method1503();
      ++field2963;
      int var6 = 0;
      int[] var7 = var1.field2930;
      int var8 = var1.field2941;

      int var9;
      for(var9 = 0; var9 < var0.field2941; ++var9) {
         class337 var10 = var0.field2951[var9];
         if (var10.field3117 != 0) {
            int var11 = var0.field2927[var9] - var3;
            if (var11 <= var1.field2949) {
               int var12 = var0.field2930[var9] - var2;
               if (var12 >= var1.field2965 && var12 <= var1.field2958) {
                  int var13 = var0.field2956[var9] - var4;
                  if (var13 >= var1.field2960 && var13 <= var1.field2957) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class337 var15 = var1.field2951[var14];
                        if (var12 == var7[var14] && var13 == var1.field2956[var14] && var11 == var1.field2927[var14] && var15.field3117 != 0) {
                           if (var0.field2952 == null) {
                              var0.field2952 = new class337[var0.field2941];
                           }

                           if (var1.field2952 == null) {
                              var1.field2952 = new class337[var8];
                           }

                           class337 var16 = var0.field2952[var9];
                           if (var16 == null) {
                              var16 = var0.field2952[var9] = new class337(var10);
                           }

                           class337 var17 = var1.field2952[var14];
                           if (var17 == null) {
                              var17 = var1.field2952[var14] = new class337(var15);
                           }

                           var16.field3115 += var15.field3115;
                           var16.field3118 += var15.field3118;
                           var16.field3116 += var15.field3116;
                           var16.field3117 += var15.field3117;
                           var17.field3115 += var10.field3115;
                           var17.field3118 += var10.field3118;
                           var17.field3116 += var10.field3116;
                           var17.field3117 += var10.field3117;
                           ++var6;
                           field2946[var9] = field2963;
                           field2962[var14] = field2963;
                        }
                     }
                  }
               }
            }
         }
      }

      if (var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field2929; ++var9) {
            if (field2946[var0.field2924[var9]] == field2963 && field2946[var0.field2931[var9]] == field2963 && field2946[var0.field2932[var9]] == field2963) {
               if (var0.field2933 == null) {
                  var0.field2933 = new byte[var0.field2929];
               }

               var0.field2933[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field2929; ++var9) {
            if (field2962[var1.field2924[var9]] == field2963 && field2962[var1.field2931[var9]] == field2963 && field2962[var1.field2932[var9]] == field2963) {
               if (var1.field2933 == null) {
                  var1.field2933 = new byte[var1.field2929];
               }

               var1.field2933[var9] = 2;
            }
         }

      }
   }

   static final int method1508(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if (var1 < 2) {
         var1 = 2;
      } else if (var1 > 126) {
         var1 = 126;
      }

      return (var0 & 'ﾀ') + var1;
   }

   static final int method1509(int var0) {
      if (var0 < 2) {
         var0 = 2;
      } else if (var0 > 126) {
         var0 = 126;
      }

      return var0;
   }
}
