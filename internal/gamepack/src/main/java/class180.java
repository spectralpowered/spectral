public class class180 implements class445 {
   public static final class180 field1931 = new class180(2, 1, Long.class, new class24());
   public static final class180 field1932 = new class180(1, 2, String.class, new class191());
   public static final class180 field1934 = new class180(0, 0, Integer.class, new class350());
   final class73 field1930;
   public final int field1933;
   public final int field1936;
   public final Class field1935;

   class180(int var1, int var2, Class var3, class73 var4) {
      this.field1933 = var1;
      this.field1936 = var2;
      this.field1935 = var3;
      this.field1930 = var4;
   }

   public int method2118() {
      return this.field1936;
   }

   public Object method941(class134 var1) {
      return this.field1930.method406(var1);
   }

   static String method945(int var0) {
      return "<img=" + var0 + ">";
   }

   public static class180[] method943() {
      return new class180[]{field1934, field1931, field1932};
   }

   public static class180 method939(Class var0) {
      class180[] var2 = method943();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class180 var4 = var2[var3];
         if (var0 == var4.field1935) {
            return var4;
         }
      }

      return null;
   }

   public static void method940(Object var0, class134 var1) {
      class73 var3 = method944(var0.getClass());
      var3.method405(var0, var1);
   }

   static class73 method944(Class var0) {
      class180 var2 = method939(var0);
      if (var2 == null) {
         throw new IllegalArgumentException();
      } else {
         return var2.field1930;
      }
   }

   static final boolean method946(int var0, int var1, class204 var2, class391 var3) {
      int var5 = var0;
      int var6 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class63.field828[var7][var8] = 99;
      class63.field830[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      class63.field829[var11] = var0;
      byte var10001 = var11;
      int var19 = var11 + 1;
      class63.field832[var10001] = var1;
      int[][] var13 = var3.field3445;

      while(var19 != var12) {
         var5 = class63.field829[var12];
         var6 = class63.field832[var12];
         var12 = var12 + 1 & 4095;
         int var17 = var5 - var9;
         int var18 = var6 - var10;
         int var14 = var5 - var3.field3442;
         int var15 = var6 - var3.field3443;
         if (var2.method1050(1, var5, var6, var3)) {
            class63.field827 = var5;
            class63.field831 = var6;
            return true;
         }

         int var16 = 1 + class63.field830[var17][var18];
         if (var17 > 0 && 0 == class63.field828[var17 - 1][var18] && 0 == (var13[var14 - 1][var15] & 19136776)) {
            class63.field829[var19] = var5 - 1;
            class63.field832[var19] = var6;
            var19 = var19 + 1 & 4095;
            class63.field828[var17 - 1][var18] = 2;
            class63.field830[var17 - 1][var18] = var16;
         }

         if (var17 < 127 && class63.field828[var17 + 1][var18] == 0 && (var13[var14 + 1][var15] & 19136896) == 0) {
            class63.field829[var19] = var5 + 1;
            class63.field832[var19] = var6;
            var19 = var19 + 1 & 4095;
            class63.field828[var17 + 1][var18] = 8;
            class63.field830[var17 + 1][var18] = var16;
         }

         if (var18 > 0 && class63.field828[var17][var18 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136770)) {
            class63.field829[var19] = var5;
            class63.field832[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class63.field828[var17][var18 - 1] = 1;
            class63.field830[var17][var18 - 1] = var16;
         }

         if (var18 < 127 && 0 == class63.field828[var17][var18 + 1] && (var13[var14][var15 + 1] & 19136800) == 0) {
            class63.field829[var19] = var5;
            class63.field832[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class63.field828[var17][var18 + 1] = 4;
            class63.field830[var17][var18 + 1] = var16;
         }

         if (var17 > 0 && var18 > 0 && 0 == class63.field828[var17 - 1][var18 - 1] && 0 == (var13[var14 - 1][var15 - 1] & 19136782) && 0 == (var13[var14 - 1][var15] & 19136776) && (var13[var14][var15 - 1] & 19136770) == 0) {
            class63.field829[var19] = var5 - 1;
            class63.field832[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class63.field828[var17 - 1][var18 - 1] = 3;
            class63.field830[var17 - 1][var18 - 1] = var16;
         }

         if (var17 < 127 && var18 > 0 && class63.field828[var17 + 1][var18 - 1] == 0 && 0 == (var13[var14 + 1][var15 - 1] & 19136899) && (var13[var14 + 1][var15] & 19136896) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
            class63.field829[var19] = var5 + 1;
            class63.field832[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class63.field828[var17 + 1][var18 - 1] = 9;
            class63.field830[var17 + 1][var18 - 1] = var16;
         }

         if (var17 > 0 && var18 < 127 && class63.field828[var17 - 1][var18 + 1] == 0 && 0 == (var13[var14 - 1][var15 + 1] & 19136824) && 0 == (var13[var14 - 1][var15] & 19136776) && (var13[var14][var15 + 1] & 19136800) == 0) {
            class63.field829[var19] = var5 - 1;
            class63.field832[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class63.field828[var17 - 1][var18 + 1] = 6;
            class63.field830[var17 - 1][var18 + 1] = var16;
         }

         if (var17 < 127 && var18 < 127 && 0 == class63.field828[var17 + 1][var18 + 1] && 0 == (var13[var14 + 1][var15 + 1] & 19136992) && 0 == (var13[var14 + 1][var15] & 19136896) && (var13[var14][var15 + 1] & 19136800) == 0) {
            class63.field829[var19] = var5 + 1;
            class63.field832[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class63.field828[var17 + 1][var18 + 1] = 12;
            class63.field830[var17 + 1][var18 + 1] = var16;
         }
      }

      class63.field827 = var5;
      class63.field831 = var6;
      return false;
   }
}
