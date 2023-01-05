public class class458 extends class139 {
   class132 field3798;
   class316 field3802;
   class401 field3787;
   class82 field3796;
   int field3784;
   int field3785;
   int field3786;
   int field3788;
   int field3789;
   int field3790;
   int field3791;
   int field3792;
   int field3793;
   int field3794;
   int field3795;
   int field3797;
   int field3799;
   int field3800;
   int field3801;
   int field3803;
   int field3804;

   void method2260() {
      this.field3787 = null;
      this.field3796 = null;
      this.field3798 = null;
      this.field3802 = null;
   }

   static int method2261(int var0, class461 var1, boolean var2) {
      class120 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class67.method299(class386.field3248[--class161.field1227]);
      } else {
         var4 = var2 ? class108.field822 : class37.field183;
      }

      String var5 = class386.field3249[--class386.field3250];
      int[] var6 = null;
      if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
         int var7 = class386.field3248[--class161.field1227];
         if (var7 > 0) {
            for(var6 = new int[var7]; var7-- > 0; var6[var7] = class386.field3248[--class161.field1227]) {
               ;
            }
         }

         var5 = var5.substring(0, var5.length() - 1);
      }

      Object[] var10 = new Object[var5.length() + 1];

      int var8;
      for(var8 = var10.length - 1; var8 >= 1; --var8) {
         if (var5.charAt(var8 - 1) == 's') {
            var10[var8] = class386.field3249[--class386.field3250];
         } else {
            var10[var8] = new Integer(class386.field3248[--class161.field1227]);
         }
      }

      var8 = class386.field3248[--class161.field1227];
      if (var8 != -1) {
         var10[0] = new Integer(var8);
      } else {
         var10 = null;
      }

      if (var0 == 1400) {
         var4.field919 = var10;
      } else if (var0 == 1401) {
         var4.field989 = var10;
      } else if (var0 == 1402) {
         var4.field928 = var10;
      } else if (var0 == 1403) {
         var4.field986 = var10;
      } else if (var0 == 1404) {
         var4.field992 = var10;
      } else if (var0 == 1405) {
         var4.field1037 = var10;
      } else if (var0 == 1406) {
         var4.field909 = var10;
      } else if (var0 == 1407) {
         var4.field935 = var10;
         var4.field998 = var6;
      } else if (var0 == 1408) {
         var4.field1001 = var10;
      } else if (var0 == 1409) {
         var4.field930 = var10;
      } else if (var0 == 1410) {
         var4.field994 = var10;
      } else if (var0 == 1411) {
         var4.field987 = var10;
      } else if (var0 == 1412) {
         var4.field1033 = var10;
      } else if (var0 == 1414) {
         var4.field886 = var10;
         var4.field937 = var6;
      } else if (var0 == 1415) {
         var4.field999 = var10;
         var4.field896 = var6;
      } else if (var0 == 1416) {
         var4.field984 = var10;
      } else if (var0 == 1417) {
         var4.field1004 = var10;
      } else if (var0 == 1418) {
         var4.field1005 = var10;
      } else if (var0 == 1419) {
         var4.field1006 = var10;
      } else if (var0 == 1420) {
         var4.field1009 = var10;
      } else if (var0 == 1421) {
         var4.field963 = var10;
      } else if (var0 == 1422) {
         var4.field1013 = var10;
      } else if (var0 == 1423) {
         var4.field1014 = var10;
      } else if (var0 == 1424) {
         var4.field1015 = var10;
      } else if (var0 == 1425) {
         var4.field880 = var10;
      } else if (var0 == 1426) {
         var4.field918 = var10;
      } else if (var0 == 1427) {
         var4.field1016 = var10;
      } else if (var0 == 1428) {
         var4.field905 = var10;
      } else if (var0 == 1429) {
         var4.field1012 = var10;
      } else if (var0 == 1430) {
         var4.field1007 = var10;
      } else if (var0 == 1431) {
         var4.field1002 = var10;
      } else if (var0 == 1434) {
         var4.field1019 = var10;
      } else if (var0 == 1435) {
         var4.field1003 = var10;
      } else {
         if (var0 < 1436 || var0 > 1439) {
            return 2;
         }

         class16 var9 = var4.method496();
         if (null != var9) {
            if (var0 == 1436) {
               var9.field79 = var10;
            } else if (var0 == 1437) {
               var9.field80 = var10;
            } else if (var0 == 1438) {
               var9.field77 = var10;
            } else if (var0 == 1439) {
               var9.field81 = var10;
            }
         }
      }

      var4.field977 = true;
      return 1;
   }

   static class38 method2262(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      class20 var6 = null;
      if (class25.field112 != null) {
         var6 = new class20(var0, class25.field112, class25.field116[var0], 1000000);
      }

      return new class38(var6, class46.field561, var0, var1, var2, var3, var4);
   }
}
