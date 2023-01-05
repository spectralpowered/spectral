import java.util.Comparator;

public class class302 implements Comparator {
   static class319[] field2891;
   boolean field2892;

   int method1430(class87 var1, class87 var2) {
      if (var1.field971 == var2.field971) {
         return 0;
      } else {
         if (this.field2892) {
            if (var1.field971 == client.field599) {
               return -1;
            }

            if (var2.field971 == client.field599) {
               return 1;
            }
         }

         return var1.field971 < var2.field971 ? -1 : 1;
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1430((class87)var1, (class87)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static class451[] method1429() {
      return new class451[]{class451.field3698, class451.field3702, class451.field3699, class451.field3703, class451.field3701, class451.field3706};
   }

   public static final boolean method1426(char var0) {
      return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
   }

   static int method1428(int var0, class472 var1, boolean var2) {
      class210 var4;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class274.method1301(class150.field1580[--class188.field1989]);
      } else {
         var4 = var2 ? class142.field1544 : class425.field3580;
      }

      class214.method1117(var4);
      if (var0 != 1200 && var0 != 1205 && var0 != 1212) {
         if (var0 == 1201) {
            var4.field2258 = 2;
            var4.field2277 = class150.field1580[--class188.field1989];
            return 1;
         } else if (var0 == 1202) {
            var4.field2258 = 3;
            var4.field2277 = class89.field982.field388.method1905();
            return 1;
         } else {
            return 2;
         }
      } else {
         class188.field1989 -= 2;
         int var5 = class150.field1580[class188.field1989];
         int var6 = class150.field1580[1 + class188.field1989];
         var4.field2220 = var5;
         var4.field2350 = var6;
         class458 var7 = class272.method1294(var5);
         var4.field2282 = var7.field3769;
         var4.field2269 = var7.field3770;
         var4.field2268 = var7.field3777;
         var4.field2264 = var7.field3772;
         var4.field2356 = var7.field3758;
         var4.field2204 = var7.field3768;
         if (var0 == 1205) {
            var4.field2274 = 0;
         } else if (var0 == 1212 | var7.field3774 == 1) {
            var4.field2274 = 1;
         } else {
            var4.field2274 = 2;
         }

         if (var4.field2330 > 0) {
            var4.field2204 = var4.field2204 * 32 / var4.field2330;
         } else if (var4.field2226 > 0) {
            var4.field2204 = var4.field2204 * 32 / var4.field2226;
         }

         return 1;
      }
   }

   static final void method1427() {
      int var1 = class359.field3208;
      int var2 = class53.field800;
      int var3 = class34.field334;
      int var4 = class182.field1966;
      int var5 = 6116423;
      class362.method1739(var1, var2, var3, var4, var5);
      class362.method1739(var1 + 1, var2 + 1, var3 - 2, 16, 0);
      class362.method1731(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
      class299.field2880.method518(class96.field1234, var1 + 3, var2 + 14, var5, -1);
      int var6 = class182.field1957;
      int var7 = class182.field1952;

      int var8;
      int var9;
      int var10;
      for(var8 = 0; var8 < client.field573; ++var8) {
         var9 = 15 * (client.field573 - 1 - var8) + var2 + 31;
         var10 = 16777215;
         if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
            var10 = 16776960;
         }

         class299.field2880.method518(class352.method1689(var8), var1 + 3, var9, var10, 0);
      }

      var8 = class359.field3208;
      var9 = class53.field800;
      var10 = class34.field334;
      int var11 = class182.field1966;

      for(int var12 = 0; var12 < client.field646; ++var12) {
         if (client.field639[var12] + client.field651[var12] > var8 && client.field651[var12] < var10 + var8 && client.field451[var12] + client.field652[var12] > var9 && client.field652[var12] < var9 + var11) {
            client.field649[var12] = true;
         }
      }

   }
}
