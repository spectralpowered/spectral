public class class76 extends class106 {
   class11 field889;
   class220 field878;
   class310 field893;
   class388 field887;
   int field875;
   int field876;
   int field877;
   int field879;
   int field880;
   int field881;
   int field882;
   int field883;
   int field884;
   int field885;
   int field886;
   int field888;
   int field890;
   int field891;
   int field892;
   int field894;
   int field895;

   void method413() {
      this.field878 = null;
      this.field887 = null;
      this.field889 = null;
      this.field893 = null;
   }

   static int method414(int var0, class472 var1, boolean var2) {
      class210 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class274.method1301(class150.field1580[--class188.field1989]);
      } else {
         var4 = var2 ? class142.field1544 : class425.field3580;
      }

      String var5 = class150.field1581[--class150.field1582];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = class150.field1580[--class188.field1989];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = class150.field1580[--class188.field1989]) {
               ;
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var10 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var10.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var10[var8] = class150.field1581[--class150.field1582];
         } else {
            var10[var8] = new Integer(class150.field1580[--class188.field1989]);
         }
      }

      var8 = class150.field1580[--class188.field1989];
      if (var8 != -1) {
         var10[0] = new Integer(var8);
      } else {
         var10 = null;
      }

      if (var0 == 1400) {
         var4.field2241 = var10;
      } else if (var0 == 1401) {
         var4.field2311 = var10;
      } else if (var0 == 1402) {
         var4.field2250 = var10;
      } else if (var0 == 1403) {
         var4.field2308 = var10;
      } else if (var0 == 1404) {
         var4.field2314 = var10;
      } else if (var0 == 1405) {
         var4.field2359 = var10;
      } else if (var0 == 1406) {
         var4.field2231 = var10;
      } else if (var0 == 1407) {
         var4.field2257 = var10;
         var4.field2320 = var6;
      } else if (var0 == 1408) {
         var4.field2323 = var10;
      } else if (var0 == 1409) {
         var4.field2252 = var10;
      } else if (var0 == 1410) {
         var4.field2316 = var10;
      } else if (var0 == 1411) {
         var4.field2309 = var10;
      } else if (var0 == 1412) {
         var4.field2355 = var10;
      } else if (var0 == 1414) {
         var4.field2208 = var10;
         var4.field2259 = var6;
      } else if (var0 == 1415) {
         var4.field2321 = var10;
         var4.field2218 = var6;
      } else if (var0 == 1416) {
         var4.field2306 = var10;
      } else if (var0 == 1417) {
         var4.field2326 = var10;
      } else if (var0 == 1418) {
         var4.field2327 = var10;
      } else if (var0 == 1419) {
         var4.field2328 = var10;
      } else if (var0 == 1420) {
         var4.field2331 = var10;
      } else if (var0 == 1421) {
         var4.field2285 = var10;
      } else if (var0 == 1422) {
         var4.field2335 = var10;
      } else if (var0 == 1423) {
         var4.field2336 = var10;
      } else if (var0 == 1424) {
         var4.field2337 = var10;
      } else if (var0 == 1425) {
         var4.field2202 = var10;
      } else if (var0 == 1426) {
         var4.field2240 = var10;
      } else if (var0 == 1427) {
         var4.field2338 = var10;
      } else if (var0 == 1428) {
         var4.field2227 = var10;
      } else if (var0 == 1429) {
         var4.field2334 = var10;
      } else if (var0 == 1430) {
         var4.field2329 = var10;
      } else if (var0 == 1431) {
         var4.field2324 = var10;
      } else if (var0 == 1434) {
         var4.field2341 = var10;
      } else if (var0 == 1435) {
         var4.field2325 = var10;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class252 var9 = var4.method1087();
         if (null != var9) {
            if (var0 == 1436) {
               var9.field2631 = var10;
            } else if (var0 == 1437) {
               var9.field2632 = var10;
            } else if (var0 == 1438) {
               var9.field2629 = var10;
            } else if (var0 == 1439) {
               var9.field2633 = var10;
            }
         }
      }

      var4.field2299 = true;
      return 1;
   }

   static class230 method415(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      class416 var6 = null;
      if (class143.field1545 != null) {
         var6 = new class416(var0, class143.field1545, class143.field1549[var0], 1000000);
      }

      return new class230(var6, class430.field3601, var0, var1, var2, var3, var4);
   }
}
