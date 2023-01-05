import java.util.Iterator;

public class class397 {
   static class110 field3352;
   static class352 field3353;
   static int field3350;
   class344[] field3338;
   int field3335 = 0;
   int field3337 = 0;
   int field3341 = 0;
   int field3342 = 0;
   int field3348 = 0;
   int field3351 = 0;
   int[] field3336;
   int[] field3339;
   int[] field3340 = new int[256];
   int[] field3343;
   int[] field3344;
   int[] field3345;
   int[] field3346;
   int[] field3347;
   int[] field3349;

   class397(class344[] var1) {
      this.field3338 = var1;
      this.method1952();
   }

   void method1952() {
      this.field3344 = new int[256];

      int var2;
      for(var2 = 0; var2 < 64; ++var2) {
         this.field3344[var2] = var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3344[var2 + 64] = var2 * 1024 + 16711680;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3344[var2 + 128] = 16776960 + var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3344[var2 + 192] = 16777215;
      }

      this.field3339 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3339[var2] = var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3339[var2 + 64] = var2 * 4 + '\uff00';
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3339[var2 + 128] = '\uffff' + var2 * 262144;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3339[var2 + 192] = 16777215;
      }

      this.field3336 = new int[256];

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3336[var2] = var2 * 4;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3336[var2 + 64] = var2 * 262144 + 255;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3336[var2 + 128] = 16711935 + var2 * 1024;
      }

      for(var2 = 0; var2 < 64; ++var2) {
         this.field3336[var2 + 192] = 16777215;
      }

      this.field3349 = new int[256];
      this.field3335 = 0;
      this.field3345 = new int['耀'];
      this.field3346 = new int['耀'];
      this.method1957((class344)null);
      this.field3343 = new int['耀'];
      this.field3347 = new int['耀'];
   }

   void method1959() {
      this.field3344 = null;
      this.field3339 = null;
      this.field3336 = null;
      this.field3349 = null;
      this.field3345 = null;
      this.field3346 = null;
      this.field3343 = null;
      this.field3347 = null;
      this.field3335 = 0;
      this.field3348 = 0;
   }

   void method1954(int var1, int var2) {
      if (this.field3343 == null) {
         this.method1952();
      }

      if (this.field3341 == 0) {
         this.field3341 = var2;
      }

      int var4 = var2 - this.field3341;
      if (var4 >= 256) {
         var4 = 0;
      }

      this.field3341 = var2;
      if (var4 > 0) {
         this.method1955(var4);
      }

      this.method1953(var1);
   }

   final void method1955(int var1) {
      this.field3335 += var1 * 128;
      int var3;
      if (this.field3335 > this.field3345.length) {
         this.field3335 -= this.field3345.length;
         var3 = (int)(Math.random() * 12.0D);
         this.method1957(this.field3338[var3]);
      }

      var3 = 0;
      int var4 = var1 * 128;
      int var5 = (256 - var1) * 128;

      int var7;
      for(int var6 = 0; var6 < var5; ++var6) {
         var7 = this.field3343[var4 + var3] - var1 * this.field3345[var3 + this.field3335 & this.field3345.length - 1] / 6;
         if (var7 < 0) {
            var7 = 0;
         }

         this.field3343[var3++] = var7;
      }

      byte var16 = 10;
      var7 = 128 - var16;

      int var8;
      int var11;
      for(var8 = 256 - var1; var8 < 256; ++var8) {
         int var9 = var8 * 128;

         for(int var10 = 0; var10 < 128; ++var10) {
            var11 = (int)(Math.random() * 100.0D);
            if (var11 < 50 && var10 > var16 && var10 < var7) {
               this.field3343[var10 + var9] = 255;
            } else {
               this.field3343[var9 + var10] = 0;
            }
         }
      }

      if (this.field3351 > 0) {
         this.field3351 -= var1 * 4;
      }

      if (this.field3342 > 0) {
         this.field3342 -= var1 * 4;
      }

      if (this.field3351 == 0 && 0 == this.field3342) {
         var8 = (int)(Math.random() * (double)(2000 / var1));
         if (var8 == 0) {
            this.field3351 = 1024;
         }

         if (var8 == 1) {
            this.field3342 = 1024;
         }
      }

      for(var8 = 0; var8 < 256 - var1; ++var8) {
         this.field3340[var8] = this.field3340[var1 + var8];
      }

      for(var8 = 256 - var1; var8 < 256; ++var8) {
         this.field3340[var8] = (int)(Math.sin((double)this.field3337 / 14.0D) * 16.0D + Math.sin((double)this.field3337 / 15.0D) * 14.0D + Math.sin((double)this.field3337 / 16.0D) * 12.0D);
         ++this.field3337;
      }

      this.field3348 += var1;
      var8 = ((client.field231 & 1) + var1) / 2;
      if (var8 > 0) {
         short var17 = 128;
         byte var18 = 2;
         var11 = 128 - var18 - var18;

         int var12;
         int var13;
         int var14;
         for(var12 = 0; var12 < this.field3348 * 100; ++var12) {
            var13 = (int)(Math.random() * (double)var11) + var18;
            var14 = (int)(Math.random() * (double)var17) + var17;
            this.field3343[var13 + (var14 << 7)] = 192;
         }

         this.field3348 = 0;

         int var15;
         for(var12 = 0; var12 < 256; ++var12) {
            var13 = 0;
            var14 = var12 * 128;

            for(var15 = -var8; var15 < 128; ++var15) {
               if (var15 + var8 < 128) {
                  var13 += this.field3343[var8 + var14 + var15];
               }

               if (var15 - (var8 + 1) >= 0) {
                  var13 -= this.field3343[var14 + var15 - (var8 + 1)];
               }

               if (var15 >= 0) {
                  this.field3347[var15 + var14] = var13 / (var8 * 2 + 1);
               }
            }
         }

         for(var12 = 0; var12 < 128; ++var12) {
            var13 = 0;

            for(var14 = -var8; var14 < 256; ++var14) {
               var15 = var14 * 128;
               if (var8 + var14 < 256) {
                  var13 += this.field3347[var12 + var15 + var8 * 128];
               }

               if (var14 - (var8 + 1) >= 0) {
                  var13 -= this.field3347[var12 + var15 - (var8 + 1) * 128];
               }

               if (var14 >= 0) {
                  this.field3343[var15 + var12] = var13 / (var8 * 2 + 1);
               }
            }
         }
      }

   }

   final int method1962(int var1, int var2, int var3) {
      int var5 = 256 - var3;
      return (var5 * (var1 & 16711935) + (var2 & 16711935) * var3 & -16711936) + (var3 * (var2 & '\uff00') + (var1 & '\uff00') * var5 & 16711680) >> 8;
   }

   final void method1953(int var1) {
      int var3 = this.field3349.length;
      if (this.field3351 > 0) {
         this.method1956(this.field3351, this.field3339);
      } else if (this.field3342 > 0) {
         this.method1956(this.field3342, this.field3336);
      } else {
         for(int var4 = 0; var4 < var3; ++var4) {
            this.field3349[var4] = this.field3344[var4];
         }
      }

      this.method1961(var1);
   }

   final void method1956(int var1, int[] var2) {
      int var4 = this.field3349.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         if (var1 > 768) {
            this.field3349[var5] = this.method1962(this.field3344[var5], var2[var5], 1024 - var1);
         } else if (var1 > 256) {
            this.field3349[var5] = var2[var5];
         } else {
            this.field3349[var5] = this.method1962(var2[var5], this.field3344[var5], 256 - var1);
         }
      }

   }

   final void method1961(int var1) {
      int var3 = 0;

      for(int var4 = 1; var4 < 255; ++var4) {
         int var5 = (256 - var4) * this.field3340[var4] / 256;
         int var6 = var1 + var5;
         int var7 = 0;
         int var8 = 128;
         if (var6 < 0) {
            var7 = -var6;
            var6 = 0;
         }

         if (var6 + 128 >= class39.field199.field579) {
            var8 = class39.field199.field579 - var6;
         }

         int var9 = var6 + (var4 + 8) * class39.field199.field579;
         var3 += var7;

         for(int var10 = var7; var10 < var8; ++var10) {
            int var11 = this.field3343[var3++];
            int var12 = var9 % class162.field1232;
            if (var11 != 0 && var12 >= class162.field1236 && var12 < class162.field1237) {
               int var13 = var11;
               int var14 = 256 - var11;
               var11 = this.field3349[var11];
               int var15 = class39.field199.field578[var9];
               class39.field199.field578[var9++] = -16777216 | ((var11 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var15 & '\uff00') * var14 + var13 * (var11 & '\uff00') & 16711680) >> 8;
            } else {
               ++var9;
            }
         }

         var3 += 128 - var8;
      }

   }

   final void method1957(class344 var1) {
      int var3;
      for(var3 = 0; var3 < this.field3345.length; ++var3) {
         this.field3345[var3] = 0;
      }

      int var4;
      for(var3 = 0; var3 < 5000; ++var3) {
         var4 = (int)(Math.random() * 128.0D * 256.0D);
         this.field3345[var4] = (int)(Math.random() * 256.0D);
      }

      int var5;
      int var6;
      for(var3 = 0; var3 < 20; ++var3) {
         for(var4 = 1; var4 < 255; ++var4) {
            for(var5 = 1; var5 < 127; ++var5) {
               var6 = (var4 << 7) + var5;
               this.field3346[var6] = (this.field3345[var6 + 128] + this.field3345[var6 - 128] + this.field3345[var6 + 1] + this.field3345[var6 - 1]) / 4;
            }
         }

         int[] var9 = this.field3345;
         this.field3345 = this.field3346;
         this.field3346 = var9;
      }

      if (var1 != null) {
         var3 = 0;

         for(var4 = 0; var4 < var1.field2755; ++var4) {
            for(var5 = 0; var5 < var1.field2758; ++var5) {
               if (var1.field2752[var3++] != 0) {
                  var6 = var1.field2754 + var5 + 16;
                  int var7 = var1.field2757 + var4 + 16;
                  int var8 = var6 + (var7 << 7);
                  this.field3345[var8] = 0;
               }
            }
         }
      }

   }

   static String method1960() {
      StringBuilder var1 = new StringBuilder();

      class152 var3;
      for(Iterator var2 = class100.field795.iterator(); var2.hasNext(); var1.append(var3.field1188).append('\n')) {
         var3 = (class152)var2.next();
         if (null != var3.field1186 && !var3.field1186.isEmpty()) {
            var1.append(var3.field1186).append(':');
         }
      }

      return var1.toString();
   }

   static int method1958(class120 var0) {
      if (var0.field1026 != 11) {
         class386.field3249[class386.field3250 - 1] = "";
         return 1;
      } else {
         String var2 = class386.field3249[--class386.field3250];
         class386.field3249[++class386.field3250 - 1] = var0.method487(var2);
         return 1;
      }
   }

   static class213 method1963(int var0) {
      class213 var2 = (class213)client.field437.method394((long)var0);
      if (null == var2) {
         var2 = new class213(class187.field1697, class102.method413(var0), class106.method423(var0));
         client.field437.method396(var2, (long)var0);
      }

      return var2;
   }
}
