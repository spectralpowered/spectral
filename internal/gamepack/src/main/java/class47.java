public final class class47 extends class30 {
   boolean field399;
   boolean field405;
   boolean field407;
   class174 field401;
   class253 field404;
   class253 field406;
   class253 field410;
   class392 field388;
   class491 field400;
   int field387;
   int field389 = -1;
   int field390 = -1;
   int field391;
   int field392;
   int field393;
   int field394;
   int field395;
   int field396;
   int field397;
   int field398;
   int field402;
   int field403;
   int field408;
   int field409;
   int field412;
   int field413;
   int field414;
   int field415;
   String[] field411 = new String[3];

   class47() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field411[var1] = "";
      }

      this.field392 = 0;
      this.field393 = 0;
      this.field412 = 0;
      this.field396 = 0;
      this.field405 = false;
      this.field391 = 0;
      this.field407 = false;
      this.field410 = class253.field2635;
      this.field404 = class253.field2635;
      this.field406 = class253.field2635;
      this.field399 = false;
   }

   final void method250(class134 var1) {
      var1.field1487 = 0;
      int var3 = var1.method669();
      int var4 = -1;
      this.field389 = var1.method670();
      this.field390 = var1.method670();
      int var5 = -1;
      this.field391 = 0;
      int[] var6 = new int[12];

      int var8;
      int var9;
      int var10;
      for(int var7 = 0; var7 < 12; ++var7) {
         var8 = var1.method669();
         if (var8 == 0) {
            var6[var7] = 0;
         } else {
            var9 = var1.method669();
            var6[var7] = (var8 << 8) + var9;
            if (var7 == 0 && 65535 == var6[0]) {
               var5 = var1.method671();
               break;
            }

            if (var6[var7] >= 512) {
               var10 = class272.method1294(var6[var7] - 512).field3804;
               if (var10 != 0) {
                  this.field391 = var10;
               }
            }
         }
      }

      int[] var26 = new int[5];

      for(var8 = 0; var8 < 5; ++var8) {
         var9 = var1.method669();
         if (var9 < 0 || var9 >= class253.field2638[var8].length) {
            var9 = 0;
         }

         var26[var8] = var9;
      }

      super.field238 = var1.method671();
      if (super.field238 == 65535) {
         super.field238 = -1;
      }

      super.field243 = var1.method671();
      if (65535 == super.field243) {
         super.field243 = -1;
      }

      super.field305 = super.field243;
      super.field241 = var1.method671();
      if (super.field241 == 65535) {
         super.field241 = -1;
      }

      super.field302 = var1.method671();
      if (65535 == super.field302) {
         super.field302 = -1;
      }

      super.field259 = var1.method671();
      if (65535 == super.field259) {
         super.field259 = -1;
      }

      super.field244 = var1.method671();
      if (65535 == super.field244) {
         super.field244 = -1;
      }

      super.field235 = var1.method671();
      if (65535 == super.field235) {
         super.field235 = -1;
      }

      this.field401 = new class174(var1.method677(), class170.field1860);
      this.method238();
      this.method245();
      this.method243();
      if (class89.field982 == this) {
         class139.field1505 = this.field401.method928();
      }

      this.field392 = var1.method669();
      this.field393 = var1.method671();
      this.field407 = var1.method669() == 1;
      if (0 == client.field425 && client.field685 >= 2) {
         this.field407 = false;
      }

      class274[] var27 = null;
      boolean var28 = false;
      var10 = var1.method671();
      var28 = (var10 >> 15 & 1) == 1;
      int var11;
      if (var10 > 0 && var10 != 32768) {
         var27 = new class274[12];

         for(var11 = 0; var11 < 12; ++var11) {
            int var12 = var10 >> 12 - var11 & 1;
            if (var12 == 1) {
               int var16 = var6[var11] - 512;
               int var17 = var1.method669();
               boolean var18 = (var17 & 1) != 0;
               boolean var19 = 0 != (var17 & 2);
               class274 var20 = new class274(var16);
               int var21;
               int[] var22;
               boolean var23;
               int var24;
               short var25;
               if (var18) {
                  var21 = var1.method669();
                  var22 = new int[]{var21 & 15, var21 >> 4 & 15};
                  var23 = null != var20.field2753 && var20.field2753.length == var22.length;

                  for(var24 = 0; var24 < 2; ++var24) {
                     if (var22[var24] != 15) {
                        var25 = (short)var1.method671();
                        if (var23) {
                           var20.field2753[var22[var24]] = var25;
                        }
                     }
                  }
               }

               if (var19) {
                  var21 = var1.method669();
                  var22 = new int[]{var21 & 15, var21 >> 4 & 15};
                  var23 = null != var20.field2754 && var20.field2754.length == var22.length;

                  for(var24 = 0; var24 < 2; ++var24) {
                     if (15 != var22[var24]) {
                        var25 = (short)var1.method671();
                        if (var23) {
                           var20.field2754[var22[var24]] = var25;
                        }
                     }
                  }
               }

               var27[var11] = var20;
            }
         }
      }

      for(var11 = 0; var11 < 3; ++var11) {
         this.field411[var11] = var1.method677();
      }

      if (client.field432 > 208) {
         var4 = var1.method669();
      }

      if (this.field388 == null) {
         this.field388 = new class392();
      }

      this.field388.method1906(var6, var27, var28, var26, var3, var5, var4);
   }

   boolean method237() {
      if (class253.field2635 == this.field410) {
         this.method239();
      }

      return class253.field2636 == this.field410;
   }

   void method238() {
      this.field410 = class253.field2635;
   }

   void method239() {
      this.field410 = class321.field3026.method488(this.field401) ? class253.field2636 : class253.field2637;
   }

   boolean method252() {
      if (this.field404 == class253.field2635) {
         this.method241();
      }

      return this.field404 == class253.field2636;
   }

   void method245() {
      this.field404 = class253.field2635;
   }

   void method241() {
      this.field404 = null != class103.field1350 && class103.field1350.method190(this.field401) ? class253.field2636 : class253.field2637;
   }

   void method242() {
      for(int var2 = 0; var2 < 4; ++var2) {
         if (client.field670[var2] != null && client.field670[var2].method128(this.field401.method928()) != -1 && var2 != 2) {
            this.field406 = class253.field2636;
            return;
         }
      }

      this.field406 = class253.field2637;
   }

   void method243() {
      this.field406 = class253.field2635;
   }

   boolean method244() {
      if (class253.field2635 == this.field406) {
         this.method242();
      }

      return class253.field2636 == this.field406;
   }

   int method249() {
      return this.field388 != null && this.field388.field3446 != -1 ? class190.method984(this.field388.field3446, (byte)35).field2720 : 1;
   }

   protected final class491 method1194() {
      if (null == this.field388) {
         return null;
      } else {
         class79 var2 = -1 != super.field274 && 0 == super.field277 ? class242.method1218(super.field274) : null;
         class79 var3 = -1 == super.field270 || this.field405 || super.field238 == super.field270 && null != var2 ? null : class242.method1218(super.field270);
         class491 var4 = this.field388.method1898(var2, super.field265, var3, super.field271);
         if (var4 == null) {
            return null;
         } else {
            var4.method2374();
            super.field292 = var4.field2554;
            int var5 = var4.field4091;
            class491 var6;
            class491[] var7;
            if (!this.field405 && -1 != super.field279 && -1 != super.field280) {
               var6 = class27.method148(super.field279).method988(super.field280);
               if (var6 != null) {
                  var6.method2372(0, -super.field301, 0);
                  var7 = new class491[]{var4, var6};
                  var4 = new class491(var7, 2);
               }
            }

            if (!this.field405 && null != this.field400) {
               if (client.field435 >= this.field396) {
                  this.field400 = null;
               }

               if (client.field435 >= this.field412 && client.field435 < this.field396) {
                  var6 = this.field400;
                  var6.method2372(this.field397 - super.field297, this.field387 - this.field395, this.field403 - super.field233);
                  if (512 == super.field299) {
                     var6.method2366();
                     var6.method2366();
                     var6.method2366();
                  } else if (super.field299 == 1024) {
                     var6.method2366();
                     var6.method2366();
                  } else if (super.field299 == 1536) {
                     var6.method2366();
                  }

                  var7 = new class491[]{var4, var6};
                  var4 = new class491(var7, 2);
                  if (super.field299 == 512) {
                     var6.method2366();
                  } else if (super.field299 == 1024) {
                     var6.method2366();
                     var6.method2366();
                  } else if (super.field299 == 1536) {
                     var6.method2366();
                     var6.method2366();
                     var6.method2366();
                  }

                  var6.method2372(super.field297 - this.field397, this.field395 - this.field387, super.field233 - this.field403);
               }
            }

            var4.field4074 = true;
            if (super.field298 != 0 && client.field435 >= super.field293 && client.field435 < super.field255) {
               var4.field4107 = super.field295;
               var4.field4108 = super.field275;
               var4.field4109 = super.field287;
               var4.field4055 = super.field298;
               var4.field4111 = (short)var5;
            } else {
               var4.field4055 = 0;
            }

            return var4;
         }
      }
   }

   final void method246(int var1, int var2, class156 var3) {
      if (-1 != super.field274 && class242.method1218(super.field274).field905 == 1) {
         super.field274 = -1;
      }

      super.field245 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field258[0] >= 0 && super.field258[0] < 104 && super.field306[0] >= 0 && super.field306[0] < 104) {
            if (class156.field1622 == var3) {
               class47 var5 = this;
               class156 var6 = class156.field1622;
               int var7 = super.field258[0];
               int var8 = super.field306[0];
               int var9 = this.method249();
               if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
                  int var10 = class172.method912(var7, var8, this.method249(), class344.method1657(var1, var2), client.field493[this.field408], true, client.field723, client.field702);
                  if (var10 >= 1) {
                     for(int var11 = 0; var11 < var10 - 1; ++var11) {
                        var5.method248(client.field723[var11], client.field702[var11], var6);
                     }
                  }
               }
            }

            this.method248(var1, var2, var3);
         } else {
            this.method247(var1, var2);
         }
      } else {
         this.method247(var1, var2);
      }

   }

   void method247(int var1, int var2) {
      super.field232 = 0;
      super.field307 = 0;
      super.field294 = 0;
      super.field258[0] = var1;
      super.field306[0] = var2;
      int var4 = this.method249();
      super.field297 = 128 * super.field258[0] + var4 * 64;
      super.field233 = var4 * 64 + super.field306[0] * 128;
   }

   final void method248(int var1, int var2, class156 var3) {
      if (super.field232 < 9) {
         ++super.field232;
      }

      for(int var5 = super.field232; var5 > 0; --var5) {
         super.field258[var5] = super.field258[var5 - 1];
         super.field306[var5] = super.field306[var5 - 1];
         super.field286[var5] = super.field286[var5 - 1];
      }

      super.field258[0] = var1;
      super.field306[0] = var2;
      super.field286[0] = var3;
   }

   final boolean method156() {
      return this.field388 != null;
   }

   public static void method256(int var0) {
      class182.field1965 = var0;
   }

   public static int method251(int var0) {
      int var2 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var2 + var0;
   }

   static void method254(String var0, String var1, String var2) {
      class324.method1569(7);
      class20.method113(var0, var1, var2);
   }

   static final void method255() {
      client.field483.method1913();
      class213.method1113();
      class13.field126.method31();

      for(int var1 = 0; var1 < 4; ++var1) {
         client.field493[var1].method1886();
      }

      client.field489.method1942();
      System.gc();
      class473.method2289(2);
      client.field680 = -1;
      client.field681 = false;
      class163.method864();
      class72.method402(10);
   }

   static int method257(int var0, class472 var1, boolean var2) {
      if (var0 == 7108) {
         class150.field1580[++class188.field1989 - 1] = class361.method1729() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   static void method253(class210 var0, int var1, int var2, boolean var3) {
      int var5 = var0.field2230;
      int var6 = var0.field2289;
      if (0 == var0.field2221) {
         var0.field2230 = var0.field2226;
      } else if (1 == var0.field2221) {
         var0.field2230 = var1 - var0.field2226;
      } else if (2 == var0.field2221) {
         var0.field2230 = var0.field2226 * var1 >> 14;
      }

      if (var0.field2223 == 0) {
         var0.field2289 = var0.field2244;
      } else if (1 == var0.field2223) {
         var0.field2289 = var2 - var0.field2244;
      } else if (2 == var0.field2223) {
         var0.field2289 = var0.field2244 * var2 >> 14;
      }

      if (4 == var0.field2221) {
         var0.field2230 = var0.field2289 * var0.field2332 / var0.field2233;
      }

      if (var0.field2223 == 4) {
         var0.field2289 = var0.field2233 * var0.field2230 / var0.field2332;
      }

      if (1337 == var0.field2315) {
         client.field686 = var0;
      }

      if (12 == var0.field2348) {
         var0.method1076().method2190(var0.field2230, var0.field2289);
      }

      if (var3 && null != var0.field2338 && (var5 != var0.field2230 || var6 != var0.field2289)) {
         class169 var7 = new class169();
         var7.field1848 = var0;
         var7.field1850 = var0.field2338;
         client.field499.method1930(var7);
      }

   }

   static final void method240(class210 var0, int var1, int var2, int var3) {
      client.method281();
      class400 var5 = var0.method1074(false);
      if (var5 != null) {
         class362.method1732(var1, var2, var1 + var5.field3511, var2 + var5.field3512);
         if (client.field500 != 2 && client.field500 != 5) {
            int var6 = client.field505 & 2047;
            int var7 = 48 + class89.field982.field297 / 32;
            int var8 = 464 - class89.field982.field233 / 32;
            class323.field3040.method1544(var1, var2, var5.field3511, var5.field3512, var7, var8, var6, 256, var5.field3513, var5.field3510);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < client.field673; ++var9) {
               var10 = client.field674[var9] * 4 + 2 - class89.field982.field297 / 32;
               var11 = 4 * client.field675[var9] + 2 - class89.field982.field233 / 32;
               class247.method1227(var1, var2, var10, var11, client.field676[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  class397 var17 = client.field564[class195.field2036][var9][var10];
                  if (var17 != null) {
                     var12 = var9 * 4 + 2 - class89.field982.field297 / 32;
                     var13 = var10 * 4 + 2 - class89.field982.field233 / 32;
                     class247.method1227(var1, var2, var12, var13, class103.field1352[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < client.field479; ++var9) {
               class53 var15 = client.field669[client.field635[var9]];
               if (var15 != null && var15.method156()) {
                  class272 var18 = var15.field798;
                  if (null != var18 && var18.field2743 != null) {
                     var18 = var18.method1286();
                  }

                  if (null != var18 && var18.field2736 && var18.field2746) {
                     var12 = var15.field297 / 32 - class89.field982.field297 / 32;
                     var13 = var15.field233 / 32 - class89.field982.field233 / 32;
                     class247.method1227(var1, var2, var12, var13, class103.field1352[1], var5);
                  }
               }
            }

            var9 = class25.field180;
            int[] var16 = class25.field179;

            for(var11 = 0; var11 < var9; ++var11) {
               class47 var19 = client.field551[var16[var11]];
               if (var19 != null && var19.method156() && !var19.field407 && var19 != class89.field982) {
                  var13 = var19.field297 / 32 - class89.field982.field297 / 32;
                  int var14 = var19.field233 / 32 - class89.field982.field233 / 32;
                  if (var19.method237()) {
                     class247.method1227(var1, var2, var13, var14, class103.field1352[3], var5);
                  } else if (class89.field982.field391 != 0 && 0 != var19.field391 && class89.field982.field391 == var19.field391) {
                     class247.method1227(var1, var2, var13, var14, class103.field1352[4], var5);
                  } else if (var19.method252()) {
                     class247.method1227(var1, var2, var13, var14, class103.field1352[5], var5);
                  } else if (var19.method244()) {
                     class247.method1227(var1, var2, var13, var14, class103.field1352[6], var5);
                  } else {
                     class247.method1227(var1, var2, var13, var14, class103.field1352[2], var5);
                  }
               }
            }

            if (0 != client.field442 && client.field435 % 20 < 10) {
               if (client.field442 == 1 && client.field443 >= 0 && client.field443 < client.field669.length) {
                  class53 var20 = client.field669[client.field443];
                  if (null != var20) {
                     var12 = var20.field297 / 32 - class89.field982.field297 / 32;
                     var13 = var20.field233 / 32 - class89.field982.field233 / 32;
                     class141.method755(var1, var2, var12, var13, class493.field4117[1], var5);
                  }
               }

               if (2 == client.field442) {
                  var11 = 2 + (client.field445 * 4 - class381.field3325 * 4) - class89.field982.field297 / 32;
                  var12 = 2 + (client.field486 * 4 - class345.field3166 * 4) - class89.field982.field233 / 32;
                  class141.method755(var1, var2, var11, var12, class493.field4117[1], var5);
               }

               if (10 == client.field442 && client.field511 >= 0 && client.field511 < client.field551.length) {
                  class47 var21 = client.field551[client.field511];
                  if (var21 != null) {
                     var12 = var21.field297 / 32 - class89.field982.field297 / 32;
                     var13 = var21.field233 / 32 - class89.field982.field233 / 32;
                     class141.method755(var1, var2, var12, var13, class493.field4117[1], var5);
                  }
               }
            }

            if (0 != client.field677) {
               var11 = 2 + client.field677 * 4 - class89.field982.field297 / 32;
               var12 = 2 + client.field423 * 4 - class89.field982.field233 / 32;
               class247.method1227(var1, var2, var11, var12, class493.field4117[0], var5);
            }

            if (!class89.field982.field407) {
               class362.method1739(var5.field3511 / 2 + var1 - 1, var2 + var5.field3512 / 2 - 1, 3, 3, 16777215);
            }
         } else {
            class362.method1745(var1, var2, 0, var5.field3513, var5.field3510);
         }

         client.field649[var3] = true;
      }
   }
}
