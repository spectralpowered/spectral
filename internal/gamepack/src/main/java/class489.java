public class class489 extends class183 {
   boolean field4010;
   class215 field4031 = new class215(this);
   class76[][] field4012 = new class76[16][128];
   class76[][] field4029 = new class76[16][128];
   class84 field4030 = new class84();
   class95 field4015 = new class95(128);
   int field4017 = 256;
   int field4025 = 1000000;
   int field4032;
   int field4033;
   int[] field4011 = new int[16];
   int[] field4013 = new int[16];
   int[] field4014 = new int[16];
   int[] field4016 = new int[16];
   int[] field4018 = new int[16];
   int[] field4019 = new int[16];
   int[] field4020 = new int[16];
   int[] field4021 = new int[16];
   int[] field4022 = new int[16];
   int[] field4023 = new int[16];
   int[] field4024 = new int[16];
   int[] field4026 = new int[16];
   int[] field4027 = new int[16];
   int[] field4028 = new int[16];
   int[] field4036 = new int[16];
   long field4034;
   long field4035;

   public class489() {
      this.method2352();
   }

   synchronized void method2348(int var1) {
      this.field4017 = var1;
   }

   int method2349() {
      return this.field4017;
   }

   synchronized boolean method2323(class375 var1, class164 var2, class346 var3, int var4) {
      var1.method1788();
      boolean var6 = true;
      int[] var7 = null;
      if (var4 > 0) {
         var7 = new int[]{var4};
      }

      for(class415 var8 = (class415)var1.field3301.method543(); var8 != null; var8 = (class415)var1.field3301.method544()) {
         int var9 = (int)var8.field1361;
         class220 var10 = (class220)this.field4015.method545((long)var9);
         if (null == var10) {
            var10 = class418.method2009(var2, var9);
            if (var10 == null) {
               var6 = false;
               continue;
            }

            this.field4015.method542(var10, (long)var9);
         }

         if (!var10.method1131(var3, var8.field3557, var7)) {
            var6 = false;
         }
      }

      if (var6) {
         var1.method1790();
      }

      return var6;
   }

   synchronized void method2324() {
      for(class220 var2 = (class220)this.field4015.method543(); null != var2; var2 = (class220)this.field4015.method544()) {
         var2.method1132();
      }

   }

   synchronized void method2325() {
      for(class220 var2 = (class220)this.field4015.method543(); var2 != null; var2 = (class220)this.field4015.method544()) {
         var2.method567();
      }

   }

   synchronized void method2350(class375 var1, boolean var2) {
      this.method2326();
      this.field4030.method445(var1.field3302);
      this.field4010 = var2;
      this.field4034 = 0L;
      int var4 = this.field4030.method448();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field4030.method449(var5);
         this.field4030.method456(var5);
         this.field4030.method450(var5);
      }

      this.field4032 = this.field4030.method454();
      this.field4033 = this.field4030.field959[this.field4032];
      this.field4035 = this.field4030.method457(this.field4033);
   }

   synchronized void method2326() {
      this.field4030.method446();
      this.method2352();
   }

   synchronized boolean method2327() {
      return this.field4030.method447();
   }

   public synchronized void method2328(int var1, int var2) {
      this.method2329(var1, var2);
   }

   void method2329(int var1, int var2) {
      this.field4016[var1] = var2;
      this.field4028[var1] = var2 & -128;
      this.method2330(var1, var2);
   }

   void method2330(int var1, int var2) {
      if (var2 != this.field4036[var1]) {
         this.field4036[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field4029[var1][var4] = null;
         }
      }

   }

   void method2331(int var1, int var2, int var3) {
      this.method2344(var1, var2, 64);
      if (0 != (this.field4011[var1] & 2)) {
         for(class76 var5 = (class76)this.field4031.field2402.method1935(); var5 != null; var5 = (class76)this.field4031.field2402.method1938()) {
            if (var1 == var5.field888 && var5.field876 < 0) {
               this.field4012[var1][var5.field880] = null;
               this.field4012[var1][var2] = var5;
               int var6 = var5.field883 + (var5.field885 * var5.field875 >> 12);
               var5.field883 += var2 - var5.field880 << 8;
               var5.field875 = var6 - var5.field883;
               var5.field885 = 4096;
               var5.field880 = var2;
               return;
            }
         }
      }

      class220 var9 = (class220)this.field4015.method545((long)this.field4036[var1]);
      if (null != var9) {
         class388 var10 = var9.field2423[var2];
         if (null != var10) {
            class76 var7 = new class76();
            var7.field888 = var1;
            var7.field878 = var9;
            var7.field887 = var10;
            var7.field889 = var9.field2425[var2];
            var7.field879 = var9.field2428[var2];
            var7.field880 = var2;
            var7.field884 = 1024 + var9.field2427[var2] * var3 * var3 * var9.field2426 >> 11;
            var7.field882 = var9.field2430[var2] & 255;
            var7.field883 = (var2 << 8) - (var9.field2424[var2] & 32767);
            var7.field886 = 0;
            var7.field881 = 0;
            var7.field877 = 0;
            var7.field876 = -1;
            var7.field890 = 0;
            if (this.field4013[var1] == 0) {
               var7.field893 = class310.method1488(var10, this.method2337(var7), this.method2338(var7), this.method2339(var7));
            } else {
               var7.field893 = class310.method1488(var10, this.method2337(var7), 0, this.method2339(var7));
               this.method2346(var7, var9.field2424[var2] < 0);
            }

            if (var9.field2424[var2] < 0) {
               var7.field893.method1451(-1);
            }

            if (var7.field879 >= 0) {
               class76 var8 = this.field4029[var1][var7.field879];
               if (var8 != null && var8.field876 < 0) {
                  this.field4012[var1][var8.field880] = null;
                  var8.field876 = 0;
               }

               this.field4029[var1][var7.field879] = var7;
            }

            this.field4031.field2402.method1930(var7);
            this.field4012[var1][var2] = var7;
         }
      }
   }

   void method2346(class76 var1, boolean var2) {
      int var4 = var1.field887.field3426.length;
      int var5;
      if (var2 && var1.field887.field3429) {
         int var6 = var4 + var4 - var1.field887.field3427;
         var5 = (int)((long)this.field4013[var1.field888] * (long)var6 >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field893.method1456(true);
         }
      } else {
         var5 = (int)((long)var4 * (long)this.field4013[var1.field888] >> 6);
      }

      var1.field893.method1455(var5);
   }

   void method2344(int var1, int var2, int var3) {
      class76 var5 = this.field4012[var1][var2];
      if (null != var5) {
         this.field4012[var1][var2] = null;
         if ((this.field4011[var1] & 2) != 0) {
            for(class76 var6 = (class76)this.field4031.field2402.method1934(); var6 != null; var6 = (class76)this.field4031.field2402.method1936()) {
               if (var6.field888 == var5.field888 && var6.field876 < 0 && var5 != var6) {
                  var5.field876 = 0;
                  break;
               }
            }
         } else {
            var5.field876 = 0;
         }

      }
   }

   void method2345(int var1, int var2, int var3) {
   }

   void method2351(int var1, int var2) {
   }

   void method2332(int var1, int var2) {
      this.field4019[var1] = var2;
   }

   void method2336(int var1) {
      for(class76 var3 = (class76)this.field4031.field2402.method1934(); null != var3; var3 = (class76)this.field4031.field2402.method1936()) {
         if (var1 < 0 || var3.field888 == var1) {
            if (var3.field893 != null) {
               var3.field893.method1459(class157.field1636 / 100);
               if (var3.field893.method1482()) {
                  this.field4031.field2404.method1923(var3.field893);
               }

               var3.method413();
            }

            if (var3.field876 < 0) {
               this.field4012[var3.field888][var3.field880] = null;
            }

            var3.method567();
         }
      }

   }

   void method2333(int var1) {
      if (var1 >= 0) {
         this.field4014[var1] = 12800;
         this.field4018[var1] = 8192;
         this.field4022[var1] = 16383;
         this.field4019[var1] = 8192;
         this.field4020[var1] = 0;
         this.field4021[var1] = 8192;
         this.method2354(var1);
         this.method2335(var1);
         this.field4011[var1] = 0;
         this.field4023[var1] = 32767;
         this.field4024[var1] = 256;
         this.field4013[var1] = 0;
         this.method2353(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method2333(var1);
         }

      }
   }

   void method2334(int var1) {
      for(class76 var3 = (class76)this.field4031.field2402.method1934(); var3 != null; var3 = (class76)this.field4031.field2402.method1936()) {
         if ((var1 < 0 || var3.field888 == var1) && var3.field876 < 0) {
            this.field4012[var3.field888][var3.field880] = null;
            var3.field876 = 0;
         }
      }

   }

   void method2352() {
      this.method2336(-1);
      this.method2333(-1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field4036[var2] = this.field4016[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field4028[var2] = this.field4016[var2] & -128;
      }

   }

   void method2354(int var1) {
      if ((this.field4011[var1] & 2) != 0) {
         for(class76 var3 = (class76)this.field4031.field2402.method1934(); var3 != null; var3 = (class76)this.field4031.field2402.method1936()) {
            if (var1 == var3.field888 && null == this.field4012[var1][var3.field880] && var3.field876 < 0) {
               var3.field876 = 0;
            }
         }
      }

   }

   void method2335(int var1) {
      if (0 != (this.field4011[var1] & 4)) {
         for(class76 var3 = (class76)this.field4031.field2402.method1934(); var3 != null; var3 = (class76)this.field4031.field2402.method1936()) {
            if (var3.field888 == var1) {
               var3.field895 = 0;
            }
         }
      }

   }

   void method2340(int var1) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method2344(var4, var5, var6);
      } else if (var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.method2331(var4, var5, var6);
         } else {
            this.method2344(var4, var5, 64);
         }

      } else if (var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method2345(var4, var5, var6);
      } else if (var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var5 == 0) {
            this.field4028[var4] = (this.field4028[var4] & -2080769) + (var6 << 14);
         }

         if (var5 == 32) {
            this.field4028[var4] = (this.field4028[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 1) {
            this.field4020[var4] = (this.field4020[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 33) {
            this.field4020[var4] = (this.field4020[var4] & -128) + var6;
         }

         if (var5 == 5) {
            this.field4021[var4] = (var6 << 7) + (this.field4021[var4] & -16257);
         }

         if (var5 == 37) {
            this.field4021[var4] = var6 + (this.field4021[var4] & -128);
         }

         if (var5 == 7) {
            this.field4014[var4] = (var6 << 7) + (this.field4014[var4] & -16257);
         }

         if (var5 == 39) {
            this.field4014[var4] = var6 + (this.field4014[var4] & -128);
         }

         if (var5 == 10) {
            this.field4018[var4] = (var6 << 7) + (this.field4018[var4] & -16257);
         }

         if (var5 == 42) {
            this.field4018[var4] = var6 + (this.field4018[var4] & -128);
         }

         if (var5 == 11) {
            this.field4022[var4] = (this.field4022[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 43) {
            this.field4022[var4] = var6 + (this.field4022[var4] & -128);
         }

         if (var5 == 64) {
            if (var6 >= 64) {
               this.field4011[var4] |= 1;
            } else {
               this.field4011[var4] &= -2;
            }
         }

         if (var5 == 65) {
            if (var6 >= 64) {
               this.field4011[var4] |= 2;
            } else {
               this.method2354(var4);
               this.field4011[var4] &= -3;
            }
         }

         if (var5 == 99) {
            this.field4023[var4] = (this.field4023[var4] & 127) + (var6 << 7);
         }

         if (var5 == 98) {
            this.field4023[var4] = var6 + (this.field4023[var4] & 16256);
         }

         if (var5 == 101) {
            this.field4023[var4] = (var6 << 7) + 16384 + (this.field4023[var4] & 127);
         }

         if (var5 == 100) {
            this.field4023[var4] = (this.field4023[var4] & 16256) + 16384 + var6;
         }

         if (var5 == 120) {
            this.method2336(var4);
         }

         if (var5 == 121) {
            this.method2333(var4);
         }

         if (var5 == 123) {
            this.method2334(var4);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.field4023[var4];
            if (var7 == 16384) {
               this.field4024[var4] = (this.field4024[var4] & -16257) + (var6 << 7);
            }
         }

         if (var5 == 38) {
            var7 = this.field4023[var4];
            if (var7 == 16384) {
               this.field4024[var4] = var6 + (this.field4024[var4] & -128);
            }
         }

         if (var5 == 16) {
            this.field4013[var4] = (var6 << 7) + (this.field4013[var4] & -16257);
         }

         if (var5 == 48) {
            this.field4013[var4] = var6 + (this.field4013[var4] & -128);
         }

         if (var5 == 81) {
            if (var6 >= 64) {
               this.field4011[var4] |= 4;
            } else {
               this.method2335(var4);
               this.field4011[var4] &= -5;
            }
         }

         if (var5 == 17) {
            this.method2353(var4, (this.field4026[var4] & -16257) + (var6 << 7));
         }

         if (var5 == 49) {
            this.method2353(var4, var6 + (this.field4026[var4] & -128));
         }

      } else if (var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method2330(var4, this.field4028[var4] + var5);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method2351(var4, var5);
      } else if (var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method2332(var4, var5);
      } else {
         var3 = var1 & 255;
         if (var3 == 255) {
            this.method2352();
         }
      }
   }

   void method2353(int var1, int var2) {
      this.field4026[var1] = var2;
      this.field4027[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   int method2337(class76 var1) {
      int var3 = var1.field883 + (var1.field875 * var1.field885 >> 12);
      var3 += (this.field4019[var1.field888] - 8192) * this.field4024[var1.field888] >> 12;
      class11 var4 = var1.field889;
      int var5;
      if (var4.field57 > 0 && (var4.field56 > 0 || this.field4020[var1.field888] > 0)) {
         var5 = var4.field56 << 2;
         int var6 = var4.field52 << 1;
         if (var1.field891 < var6) {
            var5 = var5 * var1.field891 / var6;
         }

         var5 += this.field4020[var1.field888] >> 7;
         double var7 = Math.sin(0.01227184630308513D * (double)(var1.field892 & 511));
         var3 += (int)((double)var5 * var7);
      }

      var5 = (int)((double)(var1.field887.field3428 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)class157.field1636 + 0.5D);
      return var5 < 1 ? 1 : var5;
   }

   int method2338(class76 var1) {
      class11 var3 = var1.field889;
      int var4 = this.field4014[var1.field888] * this.field4022[var1.field888] + 4096 >> 13;
      var4 = 16384 + var4 * var4 >> 15;
      var4 = 16384 + var4 * var1.field884 >> 15;
      var4 = var4 * this.field4017 + 128 >> 8;
      if (var3.field53 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5D, (double)var1.field886 * 1.953125E-5D * (double)var3.field53) + 0.5D);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (null != var3.field55) {
         var5 = var1.field881;
         var6 = var3.field55[var1.field877 + 1];
         if (var1.field877 < var3.field55.length - 2) {
            var7 = (var3.field55[var1.field877] & 255) << 8;
            var8 = (var3.field55[var1.field877 + 2] & 255) << 8;
            var6 += (var3.field55[3 + var1.field877] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var6 * var4 + 32 >> 6;
      }

      if (var1.field876 > 0 && null != var3.field51) {
         var5 = var1.field876;
         var6 = var3.field51[1 + var1.field890];
         if (var1.field890 < var3.field51.length - 2) {
            var7 = (var3.field51[var1.field890] & 255) << 8;
            var8 = (var3.field51[2 + var1.field890] & 255) << 8;
            var6 += (var5 - var7) * (var3.field51[var1.field890 + 3] - var6) / (var8 - var7);
         }

         var4 = 32 + var4 * var6 >> 6;
      }

      return var4;
   }

   int method2339(class76 var1) {
      int var3 = this.field4018[var1.field888];
      return var3 < 8192 ? var1.field882 * var3 + 32 >> 6 : 16384 - ((16384 - var3) * (128 - var1.field882) + 32 >> 6);
   }

   protected synchronized class183 method955() {
      return this.field4031;
   }

   protected synchronized class183 method958() {
      return null;
   }

   protected synchronized int method960() {
      return 0;
   }

   protected synchronized void method956(int[] var1, int var2, int var3) {
      if (this.field4030.method447()) {
         int var4 = this.field4030.field954 * this.field4025 / class157.field1636;

         do {
            long var5 = (long)var4 * (long)var3 + this.field4034;
            if (this.field4035 - var5 >= 0L) {
               this.field4034 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field4035 - this.field4034) - 1L) / (long)var4);
            this.field4034 += (long)var7 * (long)var4;
            this.field4031.method956(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method2341();
         } while(this.field4030.method447());
      }

      this.field4031.method956(var1, var2, var3);
   }

   protected synchronized void method959(int var1) {
      if (this.field4030.method447()) {
         int var2 = this.field4030.field954 * this.field4025 / class157.field1636;

         do {
            long var3 = (long)var1 * (long)var2 + this.field4034;
            if (this.field4035 - var3 >= 0L) {
               this.field4034 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field4035 - this.field4034) - 1L) / (long)var2);
            this.field4034 += (long)var5 * (long)var2;
            this.field4031.method959(var5);
            var1 -= var5;
            this.method2341();
         } while(this.field4030.method447());
      }

      this.field4031.method959(var1);
   }

   void method2341() {
      int var2 = this.field4032;
      int var3 = this.field4033;

      long var4;
      for(var4 = this.field4035; this.field4033 == var3; var4 = this.field4030.method457(var3)) {
         while(var3 == this.field4030.field959[var2]) {
            this.field4030.method449(var2);
            int var6 = this.field4030.method452(var2);
            if (var6 == 1) {
               this.field4030.method451();
               this.field4030.method450(var2);
               if (this.field4030.method459()) {
                  if (!this.field4010 || var3 == 0) {
                     this.method2352();
                     this.field4030.method446();
                     return;
                  }

                  this.field4030.method455(var4);
               }
               break;
            }

            if (0 != (var6 & 128)) {
               this.method2340(var6);
            }

            this.field4030.method456(var2);
            this.field4030.method450(var2);
         }

         var2 = this.field4030.method454();
         var3 = this.field4030.field959[var2];
      }

      this.field4032 = var2;
      this.field4033 = var3;
      this.field4035 = var4;
   }

   boolean method2342(class76 var1) {
      if (null == var1.field893) {
         if (var1.field876 >= 0) {
            var1.method567();
            if (var1.field879 > 0 && this.field4029[var1.field888][var1.field879] == var1) {
               this.field4029[var1.field888][var1.field879] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean method2343(class76 var1, int[] var2, int var3, int var4) {
      var1.field894 = class157.field1636 / 100;
      if (var1.field876 < 0 || var1.field893 != null && !var1.field893.method1462()) {
         int var6 = var1.field885;
         if (var6 > 0) {
            var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field4021[var1.field888]) + 0.5D);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.field885 = var6;
         }

         var1.field893.method1460(this.method2337(var1));
         class11 var7 = var1.field889;
         boolean var8 = false;
         ++var1.field891;
         var1.field892 += var7.field57;
         double var9 = (double)((var1.field880 - 60 << 8) + (var1.field875 * var1.field885 >> 12)) * 5.086263020833333E-6D;
         if (var7.field53 > 0) {
            if (var7.field50 > 0) {
               var1.field886 += (int)(128.0D * Math.pow(2.0D, (double)var7.field50 * var9) + 0.5D);
            } else {
               var1.field886 += 128;
            }
         }

         if (var7.field55 != null) {
            if (var7.field58 > 0) {
               var1.field881 += (int)(128.0D * Math.pow(2.0D, (double)var7.field58 * var9) + 0.5D);
            } else {
               var1.field881 += 128;
            }

            while(var1.field877 < var7.field55.length - 2 && var1.field881 > (var7.field55[2 + var1.field877] & 255) << 8) {
               var1.field877 += 2;
            }

            if (var1.field877 == var7.field55.length - 2 && 0 == var7.field55[var1.field877 + 1]) {
               var8 = true;
            }
         }

         if (var1.field876 >= 0 && null != var7.field51 && (this.field4011[var1.field888] & 1) == 0 && (var1.field879 < 0 || this.field4029[var1.field888][var1.field879] != var1)) {
            if (var7.field54 > 0) {
               var1.field876 += (int)(128.0D * Math.pow(2.0D, (double)var7.field54 * var9) + 0.5D);
            } else {
               var1.field876 += 128;
            }

            while(var1.field890 < var7.field51.length - 2 && var1.field876 > (var7.field51[var1.field890 + 2] & 255) << 8) {
               var1.field890 += 2;
            }

            if (var1.field890 == var7.field51.length - 2) {
               var8 = true;
            }
         }

         if (var8) {
            var1.field893.method1459(var1.field894);
            if (null != var2) {
               var1.field893.method956(var2, var3, var4);
            } else {
               var1.field893.method959(var4);
            }

            if (var1.field893.method1482()) {
               this.field4031.field2404.method1923(var1.field893);
            }

            var1.method413();
            if (var1.field876 >= 0) {
               var1.method567();
               if (var1.field879 > 0 && this.field4029[var1.field888][var1.field879] == var1) {
                  this.field4029[var1.field888][var1.field879] = null;
               }
            }

            return true;
         } else {
            var1.field893.method1458(var1.field894, this.method2338(var1), this.method2339(var1));
            return false;
         }
      } else {
         var1.method413();
         var1.method567();
         if (var1.field879 > 0 && this.field4029[var1.field888][var1.field879] == var1) {
            this.field4029[var1.field888][var1.field879] = null;
         }

         return true;
      }
   }

   static class313[] method2347() {
      return new class313[]{class313.field2980, class313.field2975, class313.field2976, class313.field2981, class313.field2978};
   }
}
