public class class487 extends class106 {
   static int[] field4007;
   boolean field4004;
   boolean field4006 = false;
   int field3998;
   int field3999;
   int field4005;
   int[] field3997;
   int[] field4000;
   int[] field4001;
   int[] field4002;
   int[] field4003;

   class487(class134 var1) {
      this.field3999 = var1.method671();
      this.field4004 = var1.method669() == 1;
      int var2 = var1.method669();
      if (var2 >= 1 && var2 <= 4) {
         this.field4000 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field4000[var3] = var1.method671();
         }

         if (var2 > 1) {
            this.field4001 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field4001[var3] = var1.method669();
            }
         }

         if (var2 > 1) {
            this.field4002 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field4002[var3] = var1.method669();
            }
         }

         this.field4003 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field4003[var3] = var1.method717();
         }

         this.field3998 = var1.method669();
         this.field4005 = var1.method669();
         this.field3997 = null;
      } else {
         throw new RuntimeException();
      }
   }

   boolean method2320(double var1, int var3, class164 var4) {
      int var5;
      for(var5 = 0; var5 < this.field4000.length; ++var5) {
         if (var4.method876(this.field4000[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field3997 = new int[var5];

      for(int var6 = 0; var6 < this.field4000.length; ++var6) {
         int var8 = this.field4000[var6];
         byte[] var10 = var4.method874(var8);
         boolean var9;
         if (null == var10) {
            var9 = false;
         } else {
            class212.method1108(var10);
            var9 = true;
         }

         class161 var7;
         if (!var9) {
            var7 = null;
         } else {
            class161 var11 = new class161();
            var11.field1666 = class104.field1353;
            var11.field1669 = class207.field2196;
            var11.field1664 = class207.field2198[0];
            var11.field1667 = class318.field3011[0];
            var11.field1668 = class110.field1380[0];
            var11.field1665 = class111.field1387[0];
            var11.field1663 = class482.field3990;
            var11.field1662 = class344.field3162[0];
            class207.field2198 = null;
            class318.field3011 = null;
            class110.field1380 = null;
            class111.field1387 = null;
            class482.field3990 = null;
            class344.field3162 = (byte[][])null;
            var7 = var11;
         }

         var7.method853();
         var10 = var7.field1662;
         int[] var17 = var7.field1663;
         int var12 = this.field4003[var6];
         if ((var12 & -16777216) == 16777216) {
            ;
         }

         if ((var12 & -16777216) == 33554432) {
            ;
         }

         int var13;
         int var14;
         int var15;
         int var16;
         if ((var12 & -16777216) == 50331648) {
            var13 = var12 & 16711935;
            var14 = var12 >> 8 & 255;

            for(var15 = 0; var15 < var17.length; ++var15) {
               var16 = var17[var15];
               if ((var16 & '\uffff') == var16 >> 8) {
                  var16 &= 255;
                  var17[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & '\uff00';
               }
            }
         }

         for(var13 = 0; var13 < var17.length; ++var13) {
            var17[var13] = class234.method1172(var17[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.field4001[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.field1668 == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.field3997[var14] = var17[var10[var14] & 255];
               }
            } else if (var7.field1668 == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field3997[var14++] = var17[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.field1668 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field3997[var14++] = var17[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
                  }
               }
            }
         }

         if (var13 == 1) {
            ;
         }

         if (var13 == 2) {
            ;
         }

         if (var13 == 3) {
            ;
         }
      }

      return true;
   }

   void method2321() {
      this.field3997 = null;
   }

   void method2319(int var1) {
      if (this.field3997 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.field3998 == 1 || this.field3998 == 3) {
            if (field4007 == null || field4007.length < this.field3997.length) {
               field4007 = new int[this.field3997.length];
            }

            if (this.field3997.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field3997.length;
            var4 = var2 * var1 * this.field4005;
            var5 = var3 - 1;
            if (this.field3998 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field4007[var6] = this.field3997[var7];
            }

            var10 = this.field3997;
            this.field3997 = field4007;
            field4007 = var10;
         }

         if (this.field3998 == 2 || this.field3998 == 4) {
            if (field4007 == null || field4007.length < this.field3997.length) {
               field4007 = new int[this.field3997.length];
            }

            if (this.field3997.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field3997.length;
            var4 = var1 * this.field4005;
            var5 = var2 - 1;
            if (this.field3998 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field4007[var8] = this.field3997[var9];
               }
            }

            var10 = this.field3997;
            this.field3997 = field4007;
            field4007 = var10;
         }

      }
   }
}
