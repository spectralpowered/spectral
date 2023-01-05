public class class383 implements class445 {
   static final class383 field3329 = new class383(1, 1);
   static final class383 field3330 = new class383(2, 0);
   static final class383 field3332 = new class383(0, 2);
   final int field3333;
   public final int field3331;

   class383(int var1, int var2) {
      this.field3331 = var1;
      this.field3333 = var2;
   }

   public int method2118() {
      return this.field3333;
   }

   public static int method1818(int var0, int var1) {
      int var3 = var0 >>> 31;
      return (var0 + var3) / var1 - var3;
   }

   public static void method1817() {
      class399.field3501.method162();
      class399.field3491.method162();
      class399.field3506.method162();
   }

   static final void method1819(class421 var0, int var1, class47 var2, int var3) {
      byte var5 = class156.field1619.field1623;
      if (0 != (var3 & 8192)) {
         var2.field251 = var0.method715();
         var2.field240 = var0.method670();
         var2.field285 = var0.method715();
         var2.field268 = var0.method692();
         var2.field288 = var0.method653() + client.field435;
         var2.field289 = var0.method696() + client.field435;
         var2.field290 = var0.method671();
         if (var2.field399) {
            var2.field251 += var2.field413;
            var2.field240 += var2.field415;
            var2.field285 += var2.field413;
            var2.field268 += var2.field415;
            var2.field232 = 0;
         } else {
            var2.field251 += var2.field258[0];
            var2.field240 += var2.field306[0];
            var2.field285 += var2.field258[0];
            var2.field268 += var2.field306[0];
            var2.field232 = 1;
         }

         var2.field307 = 0;
      }

      if (0 != (var3 & 32)) {
         var2.field253 = var0.method677();
         if (var2.field253.charAt(0) == '~') {
            var2.field253 = var2.field253.substring(1);
            class237.method1197(2, var2.field401.method928(), var2.field253);
         } else if (var2 == class89.field982) {
            class237.method1197(2, var2.field401.method928(), var2.field253);
         }

         var2.field254 = false;
         var2.field257 = 0;
         var2.field284 = 0;
         var2.field303 = 150;
      }

      int var6;
      if ((var3 & 4096) != 0) {
         var2.field279 = var0.method671();
         var6 = var0.method704();
         var2.field301 = var6 >> 16;
         var2.field282 = (var6 & '\uffff') + client.field435;
         var2.field280 = 0;
         var2.field269 = 0;
         if (var2.field282 > client.field435) {
            var2.field280 = -1;
         }

         if (65535 == var2.field279) {
            var2.field279 = -1;
         }
      }

      int var7;
      if ((var3 & 8) != 0) {
         var6 = var0.method696();
         if (var6 == 65535) {
            var6 = -1;
         }

         var7 = var0.method669();
         class115.method598(var2, var6, var7);
      }

      if ((var3 & 256) != 0) {
         for(var6 = 0; var6 < 3; ++var6) {
            var2.field411[var6] = var0.method677();
         }
      }

      if (0 != (var3 & 16)) {
         var2.field266 = var0.method697();
         if (class38.field363) {
            var2.field266 += var0.method669() << 16;
            var6 = 16777215;
         } else {
            var6 = 65535;
         }

         if (var6 == var2.field266) {
            var2.field266 = -1;
         }
      }

      if (0 != (var3 & 16384)) {
         var2.field293 = client.field435 + var0.method696();
         var2.field255 = client.field435 + var0.method653();
         var2.field295 = var0.method721();
         var2.field275 = var0.method721();
         var2.field287 = var0.method670();
         var2.field298 = (byte)var0.method691();
      }

      if (0 != (var3 & 128)) {
         var2.field245 = var0.method697();
         if (0 == var2.field232) {
            var2.field299 = var2.field245;
            var2.field245 = -1;
         }
      }

      if (0 != (var3 & 4)) {
         var6 = var0.method714();
         byte[] var14 = new byte[var6];
         class134 var8 = new class134(var14);
         var0.method705(var14, 0, var6);
         class25.field177[var1] = var8;
         var2.method250(var8);
      }

      if ((var3 & 1024) != 0) {
         var5 = var0.method670();
      }

      int var9;
      int var10;
      int var13;
      if (0 != (var3 & 2)) {
         var6 = var0.method697();
         class224 var15 = (class224)class296.method1399(class251.method1234(), var0.method714());
         boolean var16 = var0.method714() == 1;
         var9 = var0.method691();
         var10 = var0.field1487;
         if (var2.field401 != null && null != var2.field388) {
            boolean var11 = false;
            if (var15.field2456 && class321.field3026.method475(var2.field401)) {
               var11 = true;
            }

            if (!var11 && client.field608 == 0 && !var2.field407) {
               class25.field187.field1487 = 0;
               var0.method705(class25.field187.field1489, 0, var9);
               class25.field187.field1487 = 0;
               String var12 = class93.method535(class465.method2281(class124.method633(class25.field187)));
               var2.field253 = var12.trim();
               var2.field257 = var6 >> 8;
               var2.field284 = var6 & 255;
               var2.field303 = 150;
               var2.field254 = var16;
               var2.field242 = class89.field982 != var2 && var15.field2456 && client.field661 != "" && var12.toLowerCase().indexOf(client.field661) == -1;
               if (var15.field2442) {
                  var13 = var16 ? 91 : 1;
               } else {
                  var13 = var16 ? 90 : 2;
               }

               if (-1 != var15.field2454) {
                  class237.method1197(var13, class180.method945(var15.field2454) + var2.field401.method928(), var12);
               } else {
                  class237.method1197(var13, var2.field401.method928(), var12);
               }
            }
         }

         var0.field1487 = var10 + var9;
      }

      if ((var3 & 1) != 0) {
         var6 = var0.method669();
         int var17;
         int var22;
         int var23;
         if (var6 > 0) {
            for(var7 = 0; var7 < var6; ++var7) {
               var9 = -1;
               var10 = -1;
               var22 = -1;
               var17 = var0.method681();
               if (var17 == 32767) {
                  var17 = var0.method681();
                  var10 = var0.method681();
                  var9 = var0.method681();
                  var22 = var0.method681();
               } else if (var17 != 32766) {
                  var10 = var0.method681();
               } else {
                  var17 = -1;
               }

               var23 = var0.method681();
               var2.method154(var17, var10, var9, var22, client.field435, var23);
            }
         }

         var7 = var0.method714();
         if (var7 > 0) {
            for(var17 = 0; var17 < var7; ++var17) {
               var9 = var0.method681();
               var10 = var0.method681();
               if (var10 != 32767) {
                  var22 = var0.method681();
                  var23 = var0.method691();
                  var13 = var10 > 0 ? var0.method669() : var23;
                  var2.method157(var9, client.field435, var10, var22, var23, var13);
               } else {
                  var2.method158(var9);
               }
            }
         }
      }

      if (0 != (var3 & 2048)) {
         class156[] var19 = class25.field184;
         class156[] var21 = new class156[]{class156.field1621, class156.field1619, class156.field1622, class156.field1620};
         var19[var1] = (class156)class296.method1399(var21, var0.method670());
      }

      if (var2.field399) {
         if (var5 == 127) {
            var2.method247(var2.field413, var2.field415);
         } else {
            class156 var20;
            if (var5 != class156.field1619.field1623) {
               class156[] var18 = new class156[]{class156.field1621, class156.field1619, class156.field1622, class156.field1620};
               var20 = (class156)class296.method1399(var18, var5);
            } else {
               var20 = class25.field184[var1];
            }

            var2.method246(var2.field413, var2.field415, var20);
         }
      }

   }

   public static void method1815() {
      class210.field2265.method162();
      class210.field2342.method162();
      class210.field2210.method162();
      class210.field2211.method162();
   }
}
