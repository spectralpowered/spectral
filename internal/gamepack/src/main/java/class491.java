public class class491 extends class437 {
   boolean field4082;
   class101 field4103 = new class101(this);
   class170 field4087 = new class170(128);
   class441 field4102 = new class441();
   class458[][] field4084 = new class458[16][128];
   class458[][] field4101 = new class458[16][128];
   int field4089 = 256;
   int field4097 = 1000000;
   int field4104;
   int field4105;
   int[] field4083 = new int[16];
   int[] field4085 = new int[16];
   int[] field4086 = new int[16];
   int[] field4088 = new int[16];
   int[] field4090 = new int[16];
   int[] field4091 = new int[16];
   int[] field4092 = new int[16];
   int[] field4093 = new int[16];
   int[] field4094 = new int[16];
   int[] field4095 = new int[16];
   int[] field4096 = new int[16];
   int[] field4098 = new int[16];
   int[] field4099 = new int[16];
   int[] field4100 = new int[16];
   int[] field4108 = new int[16];
   long field4106;
   long field4107;

   public class491() {
      this.method2431();
   }

   synchronized void method2427(int var1) {
      this.field4089 = var1;
   }

   int method2428() {
      return this.field4089;
   }

   synchronized boolean method2402(class86 var1, class274 var2, class73 var3, int var4) {
      var1.method358();
      boolean var6 = true;
      int[] var7 = null;
      if (var4 > 0) {
         var7 = new int[]{var4};
      }

      for(class98 var8 = (class98)var1.field703.method789(); var8 != null; var8 = (class98)var1.field703.method790()) {
         int var9 = (int)var8.field1134;
         class401 var10 = (class401)this.field4087.method791((long)var9);
         if (null == var10) {
            var10 = class215.method960(var2, var9);
            if (var10 == null) {
               var6 = false;
               continue;
            }

            this.field4087.method788(var10, (long)var9);
         }

         if (!var10.method1983(var3, var8.field786, var7)) {
            var6 = false;
         }
      }

      if (var6) {
         var1.method360();
      }

      return var6;
   }

   synchronized void method2403() {
      for(class401 var2 = (class401)this.field4087.method789(); null != var2; var2 = (class401)this.field4087.method790()) {
         var2.method1984();
      }

   }

   synchronized void method2404() {
      for(class401 var2 = (class401)this.field4087.method789(); var2 != null; var2 = (class401)this.field4087.method790()) {
         var2.method637();
      }

   }

   synchronized void method2429(class86 var1, boolean var2) {
      this.method2405();
      this.field4102.method2181(var1.field704);
      this.field4082 = var2;
      this.field4106 = 0L;
      int var4 = this.field4102.method2184();

      for(int var5 = 0; var5 < var4; ++var5) {
         this.field4102.method2185(var5);
         this.field4102.method2192(var5);
         this.field4102.method2186(var5);
      }

      this.field4104 = this.field4102.method2190();
      this.field4105 = this.field4102.field3655[this.field4104];
      this.field4107 = this.field4102.method2193(this.field4105);
   }

   synchronized void method2405() {
      this.field4102.method2182();
      this.method2431();
   }

   synchronized boolean method2406() {
      return this.field4102.method2183();
   }

   public synchronized void method2407(int var1, int var2) {
      this.method2408(var1, var2);
   }

   void method2408(int var1, int var2) {
      this.field4088[var1] = var2;
      this.field4100[var1] = var2 & -128;
      this.method2409(var1, var2);
   }

   void method2409(int var1, int var2) {
      if (var2 != this.field4108[var1]) {
         this.field4108[var1] = var2;

         for(int var4 = 0; var4 < 128; ++var4) {
            this.field4101[var1][var4] = null;
         }
      }

   }

   void method2410(int var1, int var2, int var3) {
      this.method2423(var1, var2, 64);
      if (0 != (this.field4083[var1] & 2)) {
         for(class458 var5 = (class458)this.field4103.field797.method647(); var5 != null; var5 = (class458)this.field4103.field797.method650()) {
            if (var1 == var5.field3797 && var5.field3785 < 0) {
               this.field4084[var1][var5.field3789] = null;
               this.field4084[var1][var2] = var5;
               int var6 = var5.field3792 + (var5.field3794 * var5.field3784 >> 12);
               var5.field3792 += var2 - var5.field3789 << 8;
               var5.field3784 = var6 - var5.field3792;
               var5.field3794 = 4096;
               var5.field3789 = var2;
               return;
            }
         }
      }

      class401 var9 = (class401)this.field4087.method791((long)this.field4108[var1]);
      if (null != var9) {
         class82 var10 = var9.field3377[var2];
         if (null != var10) {
            class458 var7 = new class458();
            var7.field3797 = var1;
            var7.field3787 = var9;
            var7.field3796 = var10;
            var7.field3798 = var9.field3379[var2];
            var7.field3788 = var9.field3382[var2];
            var7.field3789 = var2;
            var7.field3793 = 1024 + var9.field3381[var2] * var3 * var3 * var9.field3380 >> 11;
            var7.field3791 = var9.field3384[var2] & 255;
            var7.field3792 = (var2 << 8) - (var9.field3378[var2] & 32767);
            var7.field3795 = 0;
            var7.field3790 = 0;
            var7.field3786 = 0;
            var7.field3785 = -1;
            var7.field3799 = 0;
            if (this.field4085[var1] == 0) {
               var7.field3802 = class316.method1560(var10, this.method2416(var7), this.method2417(var7), this.method2418(var7));
            } else {
               var7.field3802 = class316.method1560(var10, this.method2416(var7), 0, this.method2418(var7));
               this.method2425(var7, var9.field3378[var2] < 0);
            }

            if (var9.field3378[var2] < 0) {
               var7.field3802.method1518(-1);
            }

            if (var7.field3788 >= 0) {
               class458 var8 = this.field4101[var1][var7.field3788];
               if (var8 != null && var8.field3785 < 0) {
                  this.field4084[var1][var8.field3789] = null;
                  var8.field3785 = 0;
               }

               this.field4101[var1][var7.field3788] = var7;
            }

            this.field4103.field797.method642(var7);
            this.field4084[var1][var2] = var7;
         }
      }
   }

   void method2425(class458 var1, boolean var2) {
      int var4 = var1.field3796.field668.length;
      int var5;
      if (var2 && var1.field3796.field671) {
         int var6 = var4 + var4 - var1.field3796.field669;
         var5 = (int)((long)this.field4085[var1.field3797] * (long)var6 >> 6);
         var4 <<= 8;
         if (var5 >= var4) {
            var5 = var4 + var4 - 1 - var5;
            var1.field3802.method1524(true);
         }
      } else {
         var5 = (int)((long)var4 * (long)this.field4085[var1.field3797] >> 6);
      }

      var1.field3802.method1523(var5);
   }

   void method2423(int var1, int var2, int var3) {
      class458 var5 = this.field4084[var1][var2];
      if (null != var5) {
         this.field4084[var1][var2] = null;
         if ((this.field4083[var1] & 2) != 0) {
            for(class458 var6 = (class458)this.field4103.field797.method646(); var6 != null; var6 = (class458)this.field4103.field797.method648()) {
               if (var6.field3797 == var5.field3797 && var6.field3785 < 0 && var5 != var6) {
                  var5.field3785 = 0;
                  break;
               }
            }
         } else {
            var5.field3785 = 0;
         }

      }
   }

   void method2424(int var1, int var2, int var3) {
   }

   void method2430(int var1, int var2) {
   }

   void method2411(int var1, int var2) {
      this.field4091[var1] = var2;
   }

   void method2415(int var1) {
      for(class458 var3 = (class458)this.field4103.field797.method646(); null != var3; var3 = (class458)this.field4103.field797.method648()) {
         if (var1 < 0 || var3.field3797 == var1) {
            if (var3.field3802 != null) {
               var3.field3802.method1527(class233.field1985 / 100);
               if (var3.field3802.method1554()) {
                  this.field4103.field799.method1065(var3.field3802);
               }

               var3.method2260();
            }

            if (var3.field3785 < 0) {
               this.field4084[var3.field3797][var3.field3789] = null;
            }

            var3.method637();
         }
      }

   }

   void method2412(int var1) {
      if (var1 >= 0) {
         this.field4086[var1] = 12800;
         this.field4090[var1] = 8192;
         this.field4094[var1] = 16383;
         this.field4091[var1] = 8192;
         this.field4092[var1] = 0;
         this.field4093[var1] = 8192;
         this.method2433(var1);
         this.method2414(var1);
         this.field4083[var1] = 0;
         this.field4095[var1] = 32767;
         this.field4096[var1] = 256;
         this.field4085[var1] = 0;
         this.method2432(var1, 8192);
      } else {
         for(var1 = 0; var1 < 16; ++var1) {
            this.method2412(var1);
         }

      }
   }

   void method2413(int var1) {
      for(class458 var3 = (class458)this.field4103.field797.method646(); var3 != null; var3 = (class458)this.field4103.field797.method648()) {
         if ((var1 < 0 || var3.field3797 == var1) && var3.field3785 < 0) {
            this.field4084[var3.field3797][var3.field3789] = null;
            var3.field3785 = 0;
         }
      }

   }

   void method2431() {
      this.method2415(-1);
      this.method2412(-1);

      int var2;
      for(var2 = 0; var2 < 16; ++var2) {
         this.field4108[var2] = this.field4088[var2];
      }

      for(var2 = 0; var2 < 16; ++var2) {
         this.field4100[var2] = this.field4088[var2] & -128;
      }

   }

   void method2433(int var1) {
      if ((this.field4083[var1] & 2) != 0) {
         for(class458 var3 = (class458)this.field4103.field797.method646(); var3 != null; var3 = (class458)this.field4103.field797.method648()) {
            if (var1 == var3.field3797 && null == this.field4084[var1][var3.field3789] && var3.field3785 < 0) {
               var3.field3785 = 0;
            }
         }
      }

   }

   void method2414(int var1) {
      if (0 != (this.field4083[var1] & 4)) {
         for(class458 var3 = (class458)this.field4103.field797.method646(); var3 != null; var3 = (class458)this.field4103.field797.method648()) {
            if (var3.field3797 == var1) {
               var3.field3804 = 0;
            }
         }
      }

   }

   void method2419(int var1) {
      int var3 = var1 & 240;
      int var4;
      int var5;
      int var6;
      if (var3 == 128) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method2423(var4, var5, var6);
      } else if (var3 == 144) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var6 > 0) {
            this.method2410(var4, var5, var6);
         } else {
            this.method2423(var4, var5, 64);
         }

      } else if (var3 == 160) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         this.method2424(var4, var5, var6);
      } else if (var3 == 176) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         var6 = var1 >> 16 & 127;
         if (var5 == 0) {
            this.field4100[var4] = (this.field4100[var4] & -2080769) + (var6 << 14);
         }

         if (var5 == 32) {
            this.field4100[var4] = (this.field4100[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 1) {
            this.field4092[var4] = (this.field4092[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 33) {
            this.field4092[var4] = (this.field4092[var4] & -128) + var6;
         }

         if (var5 == 5) {
            this.field4093[var4] = (var6 << 7) + (this.field4093[var4] & -16257);
         }

         if (var5 == 37) {
            this.field4093[var4] = var6 + (this.field4093[var4] & -128);
         }

         if (var5 == 7) {
            this.field4086[var4] = (var6 << 7) + (this.field4086[var4] & -16257);
         }

         if (var5 == 39) {
            this.field4086[var4] = var6 + (this.field4086[var4] & -128);
         }

         if (var5 == 10) {
            this.field4090[var4] = (var6 << 7) + (this.field4090[var4] & -16257);
         }

         if (var5 == 42) {
            this.field4090[var4] = var6 + (this.field4090[var4] & -128);
         }

         if (var5 == 11) {
            this.field4094[var4] = (this.field4094[var4] & -16257) + (var6 << 7);
         }

         if (var5 == 43) {
            this.field4094[var4] = var6 + (this.field4094[var4] & -128);
         }

         if (var5 == 64) {
            if (var6 >= 64) {
               this.field4083[var4] |= 1;
            } else {
               this.field4083[var4] &= -2;
            }
         }

         if (var5 == 65) {
            if (var6 >= 64) {
               this.field4083[var4] |= 2;
            } else {
               this.method2433(var4);
               this.field4083[var4] &= -3;
            }
         }

         if (var5 == 99) {
            this.field4095[var4] = (this.field4095[var4] & 127) + (var6 << 7);
         }

         if (var5 == 98) {
            this.field4095[var4] = var6 + (this.field4095[var4] & 16256);
         }

         if (var5 == 101) {
            this.field4095[var4] = (var6 << 7) + 16384 + (this.field4095[var4] & 127);
         }

         if (var5 == 100) {
            this.field4095[var4] = (this.field4095[var4] & 16256) + 16384 + var6;
         }

         if (var5 == 120) {
            this.method2415(var4);
         }

         if (var5 == 121) {
            this.method2412(var4);
         }

         if (var5 == 123) {
            this.method2413(var4);
         }

         int var7;
         if (var5 == 6) {
            var7 = this.field4095[var4];
            if (var7 == 16384) {
               this.field4096[var4] = (this.field4096[var4] & -16257) + (var6 << 7);
            }
         }

         if (var5 == 38) {
            var7 = this.field4095[var4];
            if (var7 == 16384) {
               this.field4096[var4] = var6 + (this.field4096[var4] & -128);
            }
         }

         if (var5 == 16) {
            this.field4085[var4] = (var6 << 7) + (this.field4085[var4] & -16257);
         }

         if (var5 == 48) {
            this.field4085[var4] = var6 + (this.field4085[var4] & -128);
         }

         if (var5 == 81) {
            if (var6 >= 64) {
               this.field4083[var4] |= 4;
            } else {
               this.method2414(var4);
               this.field4083[var4] &= -5;
            }
         }

         if (var5 == 17) {
            this.method2432(var4, (this.field4098[var4] & -16257) + (var6 << 7));
         }

         if (var5 == 49) {
            this.method2432(var4, var6 + (this.field4098[var4] & -128));
         }

      } else if (var3 == 192) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method2409(var4, this.field4100[var4] + var5);
      } else if (var3 == 208) {
         var4 = var1 & 15;
         var5 = var1 >> 8 & 127;
         this.method2430(var4, var5);
      } else if (var3 == 224) {
         var4 = var1 & 15;
         var5 = (var1 >> 8 & 127) + (var1 >> 9 & 16256);
         this.method2411(var4, var5);
      } else {
         var3 = var1 & 255;
         if (var3 == 255) {
            this.method2431();
         }
      }
   }

   void method2432(int var1, int var2) {
      this.field4098[var1] = var2;
      this.field4099[var1] = (int)(2097152.0D * Math.pow(2.0D, (double)var2 * 5.4931640625E-4D) + 0.5D);
   }

   int method2416(class458 var1) {
      int var3 = var1.field3792 + (var1.field3784 * var1.field3794 >> 12);
      var3 += (this.field4091[var1.field3797] - 8192) * this.field4096[var1.field3797] >> 12;
      class132 var4 = var1.field3798;
      int var5;
      if (var4.field1102 > 0 && (var4.field1101 > 0 || this.field4092[var1.field3797] > 0)) {
         var5 = var4.field1101 << 2;
         int var6 = var4.field1097 << 1;
         if (var1.field3800 < var6) {
            var5 = var5 * var1.field3800 / var6;
         }

         var5 += this.field4092[var1.field3797] >> 7;
         double var7 = Math.sin(0.01227184630308513D * (double)(var1.field3801 & 511));
         var3 += (int)((double)var5 * var7);
      }

      var5 = (int)((double)(var1.field3796.field670 * 256) * Math.pow(2.0D, 3.255208333333333E-4D * (double)var3) / (double)class233.field1985 + 0.5D);
      return var5 < 1 ? 1 : var5;
   }

   int method2417(class458 var1) {
      class132 var3 = var1.field3798;
      int var4 = this.field4086[var1.field3797] * this.field4094[var1.field3797] + 4096 >> 13;
      var4 = 16384 + var4 * var4 >> 15;
      var4 = 16384 + var4 * var1.field3793 >> 15;
      var4 = var4 * this.field4089 + 128 >> 8;
      if (var3.field1098 > 0) {
         var4 = (int)((double)var4 * Math.pow(0.5D, (double)var1.field3795 * 1.953125E-5D * (double)var3.field1098) + 0.5D);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      if (null != var3.field1100) {
         var5 = var1.field3790;
         var6 = var3.field1100[var1.field3786 + 1];
         if (var1.field3786 < var3.field1100.length - 2) {
            var7 = (var3.field1100[var1.field3786] & 255) << 8;
            var8 = (var3.field1100[var1.field3786 + 2] & 255) << 8;
            var6 += (var3.field1100[3 + var1.field3786] - var6) * (var5 - var7) / (var8 - var7);
         }

         var4 = var6 * var4 + 32 >> 6;
      }

      if (var1.field3785 > 0 && null != var3.field1096) {
         var5 = var1.field3785;
         var6 = var3.field1096[1 + var1.field3799];
         if (var1.field3799 < var3.field1096.length - 2) {
            var7 = (var3.field1096[var1.field3799] & 255) << 8;
            var8 = (var3.field1096[2 + var1.field3799] & 255) << 8;
            var6 += (var5 - var7) * (var3.field1096[var1.field3799 + 3] - var6) / (var8 - var7);
         }

         var4 = 32 + var4 * var6 >> 6;
      }

      return var4;
   }

   int method2418(class458 var1) {
      int var3 = this.field4090[var1.field3797];
      return var3 < 8192 ? var1.field3791 * var3 + 32 >> 6 : 16384 - ((16384 - var3) * (128 - var1.field3791) + 32 >> 6);
   }

   protected synchronized class437 method2168() {
      return this.field4103;
   }

   protected synchronized class437 method2171() {
      return null;
   }

   protected synchronized int method2173() {
      return 0;
   }

   protected synchronized void method2169(int[] var1, int var2, int var3) {
      if (this.field4102.method2183()) {
         int var4 = this.field4102.field3650 * this.field4097 / class233.field1985;

         do {
            long var5 = (long)var4 * (long)var3 + this.field4106;
            if (this.field4107 - var5 >= 0L) {
               this.field4106 = var5;
               break;
            }

            int var7 = (int)(((long)var4 + (this.field4107 - this.field4106) - 1L) / (long)var4);
            this.field4106 += (long)var7 * (long)var4;
            this.field4103.method2169(var1, var2, var7);
            var2 += var7;
            var3 -= var7;
            this.method2420();
         } while(this.field4102.method2183());
      }

      this.field4103.method2169(var1, var2, var3);
   }

   protected synchronized void method2172(int var1) {
      if (this.field4102.method2183()) {
         int var2 = this.field4102.field3650 * this.field4097 / class233.field1985;

         do {
            long var3 = (long)var1 * (long)var2 + this.field4106;
            if (this.field4107 - var3 >= 0L) {
               this.field4106 = var3;
               break;
            }

            int var5 = (int)(((long)var2 + (this.field4107 - this.field4106) - 1L) / (long)var2);
            this.field4106 += (long)var5 * (long)var2;
            this.field4103.method2172(var5);
            var1 -= var5;
            this.method2420();
         } while(this.field4102.method2183());
      }

      this.field4103.method2172(var1);
   }

   void method2420() {
      int var2 = this.field4104;
      int var3 = this.field4105;

      long var4;
      for(var4 = this.field4107; this.field4105 == var3; var4 = this.field4102.method2193(var3)) {
         while(var3 == this.field4102.field3655[var2]) {
            this.field4102.method2185(var2);
            int var6 = this.field4102.method2188(var2);
            if (var6 == 1) {
               this.field4102.method2187();
               this.field4102.method2186(var2);
               if (this.field4102.method2195()) {
                  if (!this.field4082 || var3 == 0) {
                     this.method2431();
                     this.field4102.method2182();
                     return;
                  }

                  this.field4102.method2191(var4);
               }
               break;
            }

            if (0 != (var6 & 128)) {
               this.method2419(var6);
            }

            this.field4102.method2192(var2);
            this.field4102.method2186(var2);
         }

         var2 = this.field4102.method2190();
         var3 = this.field4102.field3655[var2];
      }

      this.field4104 = var2;
      this.field4105 = var3;
      this.field4107 = var4;
   }

   boolean method2421(class458 var1) {
      if (null == var1.field3802) {
         if (var1.field3785 >= 0) {
            var1.method637();
            if (var1.field3788 > 0 && this.field4101[var1.field3797][var1.field3788] == var1) {
               this.field4101[var1.field3797][var1.field3788] = null;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   boolean method2422(class458 var1, int[] var2, int var3, int var4) {
      var1.field3803 = class233.field1985 / 100;
      if (var1.field3785 < 0 || var1.field3802 != null && !var1.field3802.method1530()) {
         int var6 = var1.field3794;
         if (var6 > 0) {
            var6 -= (int)(16.0D * Math.pow(2.0D, 4.921259842519685E-4D * (double)this.field4093[var1.field3797]) + 0.5D);
            if (var6 < 0) {
               var6 = 0;
            }

            var1.field3794 = var6;
         }

         var1.field3802.method1528(this.method2416(var1));
         class132 var7 = var1.field3798;
         boolean var8 = false;
         ++var1.field3800;
         var1.field3801 += var7.field1102;
         double var9 = (double)((var1.field3789 - 60 << 8) + (var1.field3784 * var1.field3794 >> 12)) * 5.086263020833333E-6D;
         if (var7.field1098 > 0) {
            if (var7.field1095 > 0) {
               var1.field3795 += (int)(128.0D * Math.pow(2.0D, (double)var7.field1095 * var9) + 0.5D);
            } else {
               var1.field3795 += 128;
            }
         }

         if (var7.field1100 != null) {
            if (var7.field1103 > 0) {
               var1.field3790 += (int)(128.0D * Math.pow(2.0D, (double)var7.field1103 * var9) + 0.5D);
            } else {
               var1.field3790 += 128;
            }

            while(var1.field3786 < var7.field1100.length - 2 && var1.field3790 > (var7.field1100[2 + var1.field3786] & 255) << 8) {
               var1.field3786 += 2;
            }

            if (var1.field3786 == var7.field1100.length - 2 && 0 == var7.field1100[var1.field3786 + 1]) {
               var8 = true;
            }
         }

         if (var1.field3785 >= 0 && null != var7.field1096 && (this.field4083[var1.field3797] & 1) == 0 && (var1.field3788 < 0 || this.field4101[var1.field3797][var1.field3788] != var1)) {
            if (var7.field1099 > 0) {
               var1.field3785 += (int)(128.0D * Math.pow(2.0D, (double)var7.field1099 * var9) + 0.5D);
            } else {
               var1.field3785 += 128;
            }

            while(var1.field3799 < var7.field1096.length - 2 && var1.field3785 > (var7.field1096[var1.field3799 + 2] & 255) << 8) {
               var1.field3799 += 2;
            }

            if (var1.field3799 == var7.field1096.length - 2) {
               var8 = true;
            }
         }

         if (var8) {
            var1.field3802.method1527(var1.field3803);
            if (null != var2) {
               var1.field3802.method2169(var2, var3, var4);
            } else {
               var1.field3802.method2172(var4);
            }

            if (var1.field3802.method1554()) {
               this.field4103.field799.method1065(var1.field3802);
            }

            var1.method2260();
            if (var1.field3785 >= 0) {
               var1.method637();
               if (var1.field3788 > 0 && this.field4101[var1.field3797][var1.field3788] == var1) {
                  this.field4101[var1.field3797][var1.field3788] = null;
               }
            }

            return true;
         } else {
            var1.field3802.method1526(var1.field3803, this.method2417(var1), this.method2418(var1));
            return false;
         }
      } else {
         var1.method2260();
         var1.method637();
         if (var1.field3788 > 0 && this.field4101[var1.field3797][var1.field3788] == var1) {
            this.field4101[var1.field3797][var1.field3788] = null;
         }

         return true;
      }
   }

   static class301[] method2426() {
      return new class301[]{class301.field2418, class301.field2413, class301.field2414, class301.field2419, class301.field2416};
   }
}
