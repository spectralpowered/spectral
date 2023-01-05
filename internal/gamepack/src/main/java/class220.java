public class class220 extends class106 {
   byte[] field2427 = new byte[128];
   byte[] field2428 = new byte[128];
   byte[] field2430 = new byte[128];
   class11[] field2425 = new class11[128];
   class388[] field2423 = new class388[128];
   int field2426;
   int[] field2429 = new int[128];
   short[] field2424 = new short[128];

   class220(byte[] var1) {
      class134 var2 = new class134(var1);

      int var3;
      for(var3 = 0; var2.field1489[var2.field1487 + var3] != 0; ++var3) {
         ;
      }

      byte[] var4 = new byte[var3];

      int var5;
      for(var5 = 0; var5 < var3; ++var5) {
         var4[var5] = var2.method670();
      }

      ++var2.field1487;
      ++var3;
      var5 = var2.field1487;
      var2.field1487 += var3;

      int var6;
      for(var6 = 0; 0 != var2.field1489[var6 + var2.field1487]; ++var6) {
         ;
      }

      byte[] var7 = new byte[var6];

      int var8;
      for(var8 = 0; var8 < var6; ++var8) {
         var7[var8] = var2.method670();
      }

      ++var2.field1487;
      ++var6;
      var8 = var2.field1487;
      var2.field1487 += var6;

      int var9;
      for(var9 = 0; var2.field1489[var9 + var2.field1487] != 0; ++var9) {
         ;
      }

      byte[] var10 = new byte[var9];

      for(int var11 = 0; var11 < var9; ++var11) {
         var10[var11] = var2.method670();
      }

      ++var2.field1487;
      ++var9;
      byte[] var36 = new byte[var9];
      int var12;
      int var14;
      if (var9 > 1) {
         var36[1] = 1;
         int var13 = 1;
         var12 = 2;

         for(var14 = 2; var14 < var9; ++var14) {
            int var15 = var2.method669();
            if (var15 == 0) {
               var13 = var12++;
            } else {
               if (var15 <= var13) {
                  --var15;
               }

               var13 = var15;
            }

            var36[var14] = (byte)var13;
         }
      } else {
         var12 = var9;
      }

      class11[] var37 = new class11[var12];

      class11 var38;
      for(var14 = 0; var14 < var37.length; ++var14) {
         var38 = var37[var14] = new class11();
         int var16 = var2.method669();
         if (var16 > 0) {
            var38.field55 = new byte[var16 * 2];
         }

         var16 = var2.method669();
         if (var16 > 0) {
            var38.field51 = new byte[var16 * 2 + 2];
            var38.field51[1] = 64;
         }
      }

      var14 = var2.method669();
      byte[] var39 = var14 > 0 ? new byte[var14 * 2] : null;
      var14 = var2.method669();
      byte[] var40 = var14 > 0 ? new byte[var14 * 2] : null;

      int var17;
      for(var17 = 0; var2.field1489[var2.field1487 + var17] != 0; ++var17) {
         ;
      }

      byte[] var18 = new byte[var17];

      int var19;
      for(var19 = 0; var19 < var17; ++var19) {
         var18[var19] = var2.method670();
      }

      ++var2.field1487;
      ++var17;
      var19 = 0;

      int var20;
      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.method669();
         this.field2424[var20] = (short)var19;
      }

      var19 = 0;

      for(var20 = 0; var20 < 128; ++var20) {
         var19 += var2.method669();
         this.field2424[var20] = (short)(this.field2424[var20] + (var19 << 8));
      }

      var20 = 0;
      int var21 = 0;
      int var22 = 0;

      int var23;
      for(var23 = 0; var23 < 128; ++var23) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            var22 = var2.method710();
         }

         this.field2424[var23] = (short)(this.field2424[var23] + ((var22 - 1 & 2) << 14));
         this.field2429[var23] = var22;
         --var20;
      }

      var20 = 0;
      var21 = 0;
      var23 = 0;

      int var24;
      for(var24 = 0; var24 < 128; ++var24) {
         if (this.field2429[var24] != 0) {
            if (var20 == 0) {
               if (var21 < var4.length) {
                  var20 = var4[var21++];
               } else {
                  var20 = -1;
               }

               var23 = var2.field1489[var5++] - 1;
            }

            this.field2428[var24] = (byte)var23;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var24 = 0;

      for(int var25 = 0; var25 < 128; ++var25) {
         if (this.field2429[var25] != 0) {
            if (var20 == 0) {
               if (var21 < var7.length) {
                  var20 = var7[var21++];
               } else {
                  var20 = -1;
               }

               var24 = var2.field1489[var8++] + 16 << 2;
            }

            this.field2430[var25] = (byte)var24;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      class11 var42 = null;

      int var26;
      for(var26 = 0; var26 < 128; ++var26) {
         if (this.field2429[var26] != 0) {
            if (var20 == 0) {
               var42 = var37[var36[var21]];
               if (var21 < var10.length) {
                  var20 = var10[var21++];
               } else {
                  var20 = -1;
               }
            }

            this.field2425[var26] = var42;
            --var20;
         }
      }

      var20 = 0;
      var21 = 0;
      var26 = 0;

      int var27;
      for(var27 = 0; var27 < 128; ++var27) {
         if (var20 == 0) {
            if (var21 < var18.length) {
               var20 = var18[var21++];
            } else {
               var20 = -1;
            }

            if (this.field2429[var27] > 0) {
               var26 = var2.method669() + 1;
            }
         }

         this.field2427[var27] = (byte)var26;
         --var20;
      }

      this.field2426 = var2.method669() + 1;

      class11 var28;
      int var29;
      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28.field55) {
            for(var29 = 1; var29 < var28.field55.length; var29 += 2) {
               var28.field55[var29] = var2.method670();
            }
         }

         if (var28.field51 != null) {
            for(var29 = 3; var29 < var28.field51.length - 2; var29 += 2) {
               var28.field51[var29] = var2.method670();
            }
         }
      }

      if (var39 != null) {
         for(var27 = 1; var27 < var39.length; var27 += 2) {
            var39[var27] = var2.method670();
         }
      }

      if (var40 != null) {
         for(var27 = 1; var27 < var40.length; var27 += 2) {
            var40[var27] = var2.method670();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28.field51) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field51.length; var29 += 2) {
               var19 = var19 + 1 + var2.method669();
               var28.field51[var29] = (byte)var19;
            }
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28.field55) {
            var19 = 0;

            for(var29 = 2; var29 < var28.field55.length; var29 += 2) {
               var19 = var19 + 1 + var2.method669();
               var28.field55[var29] = (byte)var19;
            }
         }
      }

      byte var30;
      int var32;
      int var33;
      int var34;
      int var45;
      byte var47;
      if (var39 != null) {
         var19 = var2.method669();
         var39[0] = (byte)var19;

         for(var27 = 2; var27 < var39.length; var27 += 2) {
            var19 = var19 + 1 + var2.method669();
            var39[var27] = (byte)var19;
         }

         var47 = var39[0];
         byte var43 = var39[1];

         for(var29 = 0; var29 < var47; ++var29) {
            this.field2427[var29] = (byte)(this.field2427[var29] * var43 + 32 >> 6);
         }

         for(var29 = 2; var29 < var39.length; var29 += 2) {
            var30 = var39[var29];
            byte var31 = var39[var29 + 1];
            var32 = (var30 - var47) / 2 + (var30 - var47) * var43;

            for(var33 = var47; var33 < var30; ++var33) {
               var34 = class383.method1818(var32, var30 - var47);
               this.field2427[var33] = (byte)(var34 * this.field2427[var33] + 32 >> 6);
               var32 += var31 - var43;
            }

            var47 = var30;
            var43 = var31;
         }

         for(var45 = var47; var45 < 128; ++var45) {
            this.field2427[var45] = (byte)(var43 * this.field2427[var45] + 32 >> 6);
         }

         var38 = null;
      }

      if (var40 != null) {
         var19 = var2.method669();
         var40[0] = (byte)var19;

         for(var27 = 2; var27 < var40.length; var27 += 2) {
            var19 = var19 + 1 + var2.method669();
            var40[var27] = (byte)var19;
         }

         var47 = var40[0];
         int var44 = var40[1] << 1;

         for(var29 = 0; var29 < var47; ++var29) {
            var45 = var44 + (this.field2430[var29] & 255);
            if (var45 < 0) {
               var45 = 0;
            }

            if (var45 > 128) {
               var45 = 128;
            }

            this.field2430[var29] = (byte)var45;
         }

         int var46;
         for(var29 = 2; var29 < var40.length; var29 += 2) {
            var30 = var40[var29];
            var46 = var40[var29 + 1] << 1;
            var32 = var44 * (var30 - var47) + (var30 - var47) / 2;

            for(var33 = var47; var33 < var30; ++var33) {
               var34 = class383.method1818(var32, var30 - var47);
               int var35 = var34 + (this.field2430[var33] & 255);
               if (var35 < 0) {
                  var35 = 0;
               }

               if (var35 > 128) {
                  var35 = 128;
               }

               this.field2430[var33] = (byte)var35;
               var32 += var46 - var44;
            }

            var47 = var30;
            var44 = var46;
         }

         for(var45 = var47; var45 < 128; ++var45) {
            var46 = var44 + (this.field2430[var45] & 255);
            if (var46 < 0) {
               var46 = 0;
            }

            if (var46 > 128) {
               var46 = 128;
            }

            this.field2430[var45] = (byte)var46;
         }

         Object var41 = null;
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field53 = var2.method669();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (null != var28.field55) {
            var28.field58 = var2.method669();
         }

         if (var28.field51 != null) {
            var28.field54 = var2.method669();
         }

         if (var28.field53 > 0) {
            var28.field50 = var2.method669();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var37[var27].field57 = var2.method669();
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field57 > 0) {
            var28.field56 = var2.method669();
         }
      }

      for(var27 = 0; var27 < var12; ++var27) {
         var28 = var37[var27];
         if (var28.field56 > 0) {
            var28.field52 = var2.method669();
         }
      }

   }

   boolean method1131(class346 var1, byte[] var2, int[] var3) {
      boolean var5 = true;
      int var6 = 0;
      class388 var7 = null;

      for(int var8 = 0; var8 < 128; ++var8) {
         if (var2 == null || 0 != var2[var8]) {
            int var9 = this.field2429[var8];
            if (var9 != 0) {
               if (var9 != var6) {
                  var6 = var9--;
                  if (0 == (var9 & 1)) {
                     var7 = var1.method1661(var9 >> 2, var3);
                  } else {
                     var7 = var1.method1663(var9 >> 2, var3);
                  }

                  if (null == var7) {
                     var5 = false;
                  }
               }

               if (var7 != null) {
                  this.field2423[var8] = var7;
                  this.field2429[var8] = 0;
               }
            }
         }
      }

      return var5;
   }

   void method1132() {
      this.field2429 = null;
   }
}
