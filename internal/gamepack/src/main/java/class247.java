public final class class247 {
   static long field2611;

   static class161[] method1226() {
      class161[] var1 = new class161[class207.field2197];

      for(int var2 = 0; var2 < class207.field2197; ++var2) {
         class161 var3 = var1[var2] = new class161();
         var3.field1666 = class104.field1353;
         var3.field1669 = class207.field2196;
         var3.field1664 = class207.field2198[var2];
         var3.field1667 = class318.field3011[var2];
         var3.field1668 = class110.field1380[var2];
         var3.field1665 = class111.field1387[var2];
         var3.field1663 = class482.field3990;
         var3.field1662 = class344.field3162[var2];
      }

      class207.field2198 = null;
      class318.field3011 = null;
      class110.field1380 = null;
      class111.field1387 = null;
      class482.field3990 = null;
      class344.field3162 = (byte[][])null;
      return var1;
   }

   static int method1225(int var0, class472 var1, boolean var2) {
      if (var0 == 5306) {
         class150.field1580[++class188.field1989 - 1] = class154.method816();
         return 1;
      } else {
         int var4;
         if (var0 == 5307) {
            var4 = class150.field1580[--class188.field1989];
            if (var4 == 1 || var4 == 2) {
               class281.method1349(var4);
            }

            return 1;
         } else if (var0 == 5308) {
            class150.field1580[++class188.field1989 - 1] = class111.field1385.method1333();
            return 1;
         } else if (var0 != 5309) {
            if (var0 == 5310) {
               --class188.field1989;
               return 1;
            } else {
               return 2;
            }
         } else {
            var4 = class150.field1580[--class188.field1989];
            if (var4 == 1 || var4 == 2) {
               class111.field1385.method1339(var4);
            }

            return 1;
         }
      }
   }

   static final void method1227(int var0, int var1, int var2, int var3, class319 var4, class400 var5) {
      if (var4 != null) {
         int var7 = client.field505 & 2047;
         int var8 = var2 * var2 + var3 * var3;
         if (var8 <= 6400) {
            int var9 = class234.field2526[var7];
            int var10 = class234.field2544[var7];
            int var11 = var3 * var9 + var10 * var2 >> 16;
            int var12 = var10 * var3 - var2 * var9 >> 16;
            if (var8 > 2500) {
               var4.method1547(var5.field3511 / 2 + var11 - var4.field3017 / 2, var5.field3512 / 2 - var12 - var4.field3018 / 2, var0, var1, var5.field3511, var5.field3512, var5.field3513, var5.field3510);
            } else {
               var4.method1548(var0 + var5.field3511 / 2 + var11 - var4.field3017 / 2, var5.field3512 / 2 + var1 - var12 - var4.field3018 / 2);
            }

         }
      }
   }

   static String method1224(String var0) {
      class224[] var2 = class251.method1234();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class224 var4 = var2[var3];
         if (var4.field2454 != -1 && var0.startsWith(class180.method945(var4.field2454))) {
            var0 = var0.substring(6 + Integer.toString(var4.field2454).length());
            break;
         }
      }

      return var0;
   }
}
