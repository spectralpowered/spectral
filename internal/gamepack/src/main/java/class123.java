import java.util.concurrent.Callable;

public class class123 implements Callable {
   static class432 field1450;
   static int field1452;
   final class134 field1453;
   // $FF: synthetic field
   final class285 this$0;
   final class347 field1451;

   class123(class285 var1, class134 var2, class347 var3) {
      this.this$0 = var1;
      this.field1453 = var2;
      this.field1451 = var3;
   }

   public Object call() {
      return this.field1451.method1667(this.field1453);
   }

   static final void method630(String var0) {
      StringBuilder var10000 = (new StringBuilder()).append(var0);
      class96 var10001 = (class96)null;
      String var2 = var10000.append(class96.field1198).toString();
      class237.method1197(30, "", var2);
   }

   static void method631(int var0, int var1, int var2) {
      if (class111.field1385.method1326() != 0 && var1 != 0 && client.field682 < 50) {
         client.field683[client.field682] = var0;
         client.field684[client.field682] = var1;
         client.field712[client.field682] = var2;
         client.field492[client.field682] = null;
         client.field538[client.field682] = 0;
         ++client.field682;
      }

   }

   static final void method629(class421 var0) {
      for(int var2 = 0; var2 < client.field481; ++var2) {
         int var3 = client.field482[var2];
         class53 var4 = client.field669[var3];
         int var5 = var0.method669();
         int var6;
         if ((var5 & 1) != 0) {
            var6 = var0.method669();
            var5 += var6 << 8;
         }

         if (0 != (var5 & 2048)) {
            var6 = var0.method669();
            var5 += var6 << 16;
         }

         if (0 != (var5 & 131072)) {
            var6 = var0.method725();
            var4.field243 = 0 != (var6 & 1) ? var0.method697() : 274326889 * var4.field798.field2717 * 2133129945;
            var4.field305 = (var6 & 2) != 0 ? var0.method671() : -634834111 * var4.field798.field2718 * -398107455;
            var4.field241 = (var6 & 4) != 0 ? var0.method671() : var4.field798.field2719;
            var4.field302 = 0 != (var6 & 8) ? var0.method671() : 1430199505 * var4.field798.field2742 * -501040079;
            var4.field259 = (var6 & 16) != 0 ? var0.method671() : var4.field798.field2739;
            var4.field244 = (var6 & 32) != 0 ? var0.method653() : 1871825673 * var4.field798.field2722 * 253702969;
            var4.field235 = 0 != (var6 & 64) ? var0.method696() : -2080788827 * var4.field798.field2721 * 154044717;
            var4.field246 = 0 != (var6 & 128) ? var0.method653() : 752796561 * var4.field798.field2724 * 1788894577;
            var4.field256 = 0 != (var6 & 256) ? var0.method653() : 1054411661 * var4.field798.field2725 * 1998925637;
            var4.field248 = 0 != (var6 & 512) ? var0.method697() : 875795671 * var4.field798.field2726 * -500654361;
            var4.field249 = 0 != (var6 & 1024) ? var0.method696() : var4.field798.field2727;
            var4.field250 = 0 != (var6 & 2048) ? var0.method653() : 1152150225 * var4.field798.field2728 * -630313423;
            var4.field281 = (var6 & 4096) != 0 ? var0.method653() : var4.field798.field2729;
            var4.field252 = 0 != (var6 & 8192) ? var0.method696() : var4.field798.field2730;
            var4.field238 = 0 != (var6 & 16384) ? var0.method653() : -499537861 * var4.field798.field2713 * -171249421;
         }

         if (0 != (var5 & 4)) {
            var4.field798 = class190.method984(var0.method653(), (byte)69);
            class323.method1567(var4);
            var4.method304();
         }

         if ((var5 & 1024) != 0) {
            var4.field293 = client.field435 + var0.method697();
            var4.field255 = client.field435 + var0.method697();
            var4.field295 = var0.method721();
            var4.field275 = var0.method670();
            var4.field287 = var0.method721();
            var4.field298 = (byte)var0.method691();
         }

         int[] var7;
         int var8;
         int var9;
         int var10;
         int var11;
         short[] var15;
         short[] var16;
         long var17;
         if (0 != (var5 & 512)) {
            var6 = var0.method691();
            if (1 == (var6 & 1)) {
               var4.method310();
            } else {
               var7 = null;
               if ((var6 & 2) == 2) {
                  var8 = var0.method714();
                  var7 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var0.method653();
                     var10 = var10 == 65535 ? -1 : var10;
                     var7[var9] = var10;
                  }
               }

               var15 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (null != var4.field798.field2732) {
                     var9 = var4.field798.field2732.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.method697();
                  }
               }

               var16 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (var4.field798.field2734 != null) {
                     var10 = var4.field798.field2734.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var0.method653();
                  }
               }

               var17 = (long)(++class53.field795 - 1);
               var4.method307(new class490(var17, var7, var15, var16));
            }
         }

         if ((var5 & 8192) != 0) {
            var4.field308 = var0.method693();
         }

         int var14;
         if (0 != (var5 & 32)) {
            var6 = var0.method696();
            if (var6 == 65535) {
               var6 = -1;
            }

            var14 = var0.method669();
            if (var6 == var4.field274 && var6 != -1) {
               var8 = class242.method1218(var6).field897;
               if (var8 == 1) {
                  var4.field265 = 0;
                  var4.field276 = 0;
                  var4.field277 = var14;
                  var4.field278 = 0;
               }

               if (var8 == 2) {
                  var4.field278 = 0;
               }
            } else if (var6 == -1 || -1 == var4.field274 || class242.method1218(var6).field920 >= class242.method1218(var4.field274).field920) {
               var4.field274 = var6;
               var4.field265 = 0;
               var4.field276 = 0;
               var4.field277 = var14;
               var4.field278 = 0;
               var4.field307 = var4.field232;
            }
         }

         if ((var5 & 16) != 0) {
            var6 = var0.method716();
            int var12;
            if (var6 > 0) {
               for(var14 = 0; var14 < var6; ++var14) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var0.method681();
                  if (var8 == 32767) {
                     var8 = var0.method681();
                     var10 = var0.method681();
                     var9 = var0.method681();
                     var11 = var0.method681();
                  } else if (var8 != 32766) {
                     var10 = var0.method681();
                  } else {
                     var8 = -1;
                  }

                  var12 = var0.method681();
                  var4.method154(var8, var10, var9, var11, client.field435, var12);
               }
            }

            var14 = var0.method669();
            if (var14 > 0) {
               for(var8 = 0; var8 < var14; ++var8) {
                  var9 = var0.method681();
                  var10 = var0.method681();
                  if (var10 != 32767) {
                     var11 = var0.method681();
                     var12 = var0.method716();
                     int var13 = var10 > 0 ? var0.method691() : var12;
                     var4.method157(var9, client.field435, var10, var11, var12, var13);
                  } else {
                     var4.method158(var9);
                  }
               }
            }
         }

         if ((var5 & 128) != 0) {
            var4.field253 = var0.method677();
            var4.field303 = 100;
         }

         if ((var5 & 4096) != 0) {
            var4.method297(var0.method669());
         }

         if ((var5 & 256) != 0) {
            var4.method312(var0.method677());
         }

         if (0 != (var5 & 8)) {
            var6 = var0.method671();
            var14 = var0.method671();
            var4.field283 = var0.method669() == 1;
            var8 = var4.field297 - 64 * (var6 - class381.field3325 - class381.field3325);
            var9 = var4.field233 - 64 * (var14 - class345.field3166 - class345.field3166);
            if (var8 != 0 || var9 != 0) {
               var4.field245 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
            }
         }

         if ((var5 & '耀') != 0) {
            var4.field251 = var0.method721();
            var4.field240 = var0.method670();
            var4.field285 = var0.method721();
            var4.field268 = var0.method715();
            var4.field288 = var0.method671() + client.field435;
            var4.field289 = var0.method653() + client.field435;
            var4.field290 = var0.method671();
            var4.field232 = 1;
            var4.field307 = 0;
            var4.field251 += var4.field258[0];
            var4.field240 += var4.field306[0];
            var4.field285 += var4.field258[0];
            var4.field268 += var4.field306[0];
         }

         if (0 != (var5 & 16384)) {
            var6 = var0.method714();
            if (1 == (var6 & 1)) {
               var4.method309();
            } else {
               var7 = null;
               if (2 == (var6 & 2)) {
                  var8 = var0.method669();
                  var7 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var0.method696();
                     var10 = var10 == 65535 ? -1 : var10;
                     var7[var9] = var10;
                  }
               }

               var15 = null;
               if (4 == (var6 & 4)) {
                  var9 = 0;
                  if (var4.field798.field2732 != null) {
                     var9 = var4.field798.field2732.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.method653();
                  }
               }

               var16 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (null != var4.field798.field2734) {
                     var10 = var4.field798.field2734.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var0.method696();
                  }
               }

               var17 = (long)(++class53.field797 - 1);
               var4.method305(new class490(var17, var7, var15, var16));
            }
         }

         if (0 != (var5 & 64)) {
            var4.field266 = var0.method671();
            if (class295.field2829) {
               var4.field266 += var0.method714() << 16;
               var6 = 16777215;
            } else {
               var6 = 65535;
            }

            if (var6 == var4.field266) {
               var4.field266 = -1;
            }
         }

         if (0 != (var5 & 2)) {
            var4.field279 = var0.method671();
            var6 = var0.method693();
            var4.field301 = var6 >> 16;
            var4.field282 = (var6 & '\uffff') + client.field435;
            var4.field280 = 0;
            var4.field269 = 0;
            if (var4.field282 > client.field435) {
               var4.field280 = -1;
            }

            if (65535 == var4.field279) {
               var4.field279 = -1;
            }
         }

         if ((var5 & 65536) != 0) {
            var6 = var0.method714();
            var7 = new int[8];
            var15 = new short[8];

            for(var9 = 0; var9 < 8; ++var9) {
               if ((var6 & 1 << var9) != 0) {
                  var7[var9] = var0.method682();
                  var15[var9] = (short)var0.method727();
               } else {
                  var7[var9] = -1;
                  var15[var9] = -1;
               }
            }

            var4.method303(var7, var15);
         }
      }

   }
}
