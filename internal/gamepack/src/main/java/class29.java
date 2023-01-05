public class class29 extends class139 {
   static int[] field173;
   boolean field170;
   boolean field172 = false;
   int field164;
   int field165;
   int field171;
   int[] field163;
   int[] field166;
   int[] field167;
   int[] field168;
   int[] field169;

   class29(class127 var1) {
      this.field165 = var1.method549();
      this.field170 = var1.method547() == 1;
      int var2 = var1.method547();
      if (var2 >= 1 && var2 <= 4) {
         this.field166 = new int[var2];

         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            this.field166[var3] = var1.method549();
         }

         if (var2 > 1) {
            this.field167 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field167[var3] = var1.method547();
            }
         }

         if (var2 > 1) {
            this.field168 = new int[var2 - 1];

            for(var3 = 0; var3 < var2 - 1; ++var3) {
               this.field168[var3] = var1.method547();
            }
         }

         this.field169 = new int[var2];

         for(var3 = 0; var3 < var2; ++var3) {
            this.field169[var3] = var1.method595();
         }

         this.field164 = var1.method547();
         this.field171 = var1.method547();
         this.field163 = null;
      } else {
         throw new RuntimeException();
      }
   }

   boolean method133(double var1, int var3, class274 var4) {
      int var5;
      for(var5 = 0; var5 < this.field166.length; ++var5) {
         if (var4.method1349(this.field166[var5]) == null) {
            return false;
         }
      }

      var5 = var3 * var3;
      this.field163 = new int[var5];

      for(int var6 = 0; var6 < this.field166.length; ++var6) {
         int var8 = this.field166[var6];
         byte[] var10 = var4.method1347(var8);
         boolean var9;
         if (null == var10) {
            var9 = false;
         } else {
            class85.method354(var10);
            var9 = true;
         }

         class344 var7;
         if (!var9) {
            var7 = null;
         } else {
            class344 var11 = new class344();
            var11.field2756 = class183.field1682;
            var11.field2759 = class18.field90;
            var11.field2754 = class18.field92[0];
            var11.field2757 = class110.field826[0];
            var11.field2758 = class418.field3431[0];
            var11.field2755 = class50.field576[0];
            var11.field2753 = class413.field3422;
            var11.field2752 = class340.field2723[0];
            class18.field92 = null;
            class110.field826 = null;
            class418.field3431 = null;
            class50.field576 = null;
            class413.field3422 = null;
            class340.field2723 = (byte[][])null;
            var7 = var11;
         }

         var7.method1749();
         var10 = var7.field2752;
         int[] var17 = var7.field2753;
         int var12 = this.field169[var6];
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
            var17[var13] = class341.method1714(var17[var13], var1);
         }

         if (var6 == 0) {
            var13 = 0;
         } else {
            var13 = this.field167[var6 - 1];
         }

         if (var13 == 0) {
            if (var7.field2758 == var3) {
               for(var14 = 0; var14 < var5; ++var14) {
                  this.field163[var14] = var17[var10[var14] & 255];
               }
            } else if (var7.field2758 == 64 && var3 == 128) {
               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field163[var14++] = var17[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
                  }
               }
            } else {
               if (var7.field2758 != 128 || var3 != 64) {
                  throw new RuntimeException();
               }

               var14 = 0;

               for(var15 = 0; var15 < var3; ++var15) {
                  for(var16 = 0; var16 < var3; ++var16) {
                     this.field163[var14++] = var17[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
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

   void method134() {
      this.field163 = null;
   }

   void method132(int var1) {
      if (this.field163 != null) {
         short var2;
         int var3;
         int var4;
         int var5;
         int var6;
         int var7;
         int[] var10;
         if (this.field164 == 1 || this.field164 == 3) {
            if (field173 == null || field173.length < this.field163.length) {
               field173 = new int[this.field163.length];
            }

            if (this.field163.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field163.length;
            var4 = var2 * var1 * this.field171;
            var5 = var3 - 1;
            if (this.field164 == 1) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; ++var6) {
               var7 = var6 + var4 & var5;
               field173[var6] = this.field163[var7];
            }

            var10 = this.field163;
            this.field163 = field173;
            field173 = var10;
         }

         if (this.field164 == 2 || this.field164 == 4) {
            if (field173 == null || field173.length < this.field163.length) {
               field173 = new int[this.field163.length];
            }

            if (this.field163.length == 4096) {
               var2 = 64;
            } else {
               var2 = 128;
            }

            var3 = this.field163.length;
            var4 = var1 * this.field171;
            var5 = var2 - 1;
            if (this.field164 == 2) {
               var4 = -var4;
            }

            for(var6 = 0; var6 < var3; var6 += var2) {
               for(var7 = 0; var7 < var2; ++var7) {
                  int var8 = var6 + var7;
                  int var9 = var6 + (var7 + var4 & var5);
                  field173[var8] = this.field163[var9];
               }
            }

            var10 = this.field163;
            this.field163 = field173;
            field173 = var10;
         }

      }
   }
}
