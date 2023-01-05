public class class185 implements class78 {
   public static final class185 field1687 = new class185(2, 1, Long.class, new class80());
   public static final class185 field1688 = new class185(1, 2, String.class, new class5());
   public static final class185 field1690 = new class185(0, 0, Integer.class, new class31());
   final class250 field1686;
   public final int field1689;
   public final int field1692;
   public final Class field1691;

   class185(int var1, int var2, Class var3, class250 var4) {
      this.field1689 = var1;
      this.field1692 = var2;
      this.field1691 = var3;
      this.field1686 = var4;
   }

   public int method330() {
      return this.field1692;
   }

   public Object method840(class127 var1) {
      return this.field1686.method1082(var1);
   }

   static String method843(int var0) {
      return "<img=" + var0 + ">";
   }

   public static class185[] method841() {
      return new class185[]{field1690, field1687, field1688};
   }

   public static class185 method838(Class var0) {
      class185[] var2 = method841();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class185 var4 = var2[var3];
         if (var0 == var4.field1691) {
            return var4;
         }
      }

      return null;
   }

   public static void method839(Object var0, class127 var1) {
      class250 var3 = method842(var0.getClass());
      var3.method1081(var0, var1);
   }

   static class250 method842(Class var0) {
      class185 var2 = method838(var0);
      if (var2 == null) {
         throw new IllegalArgumentException();
      } else {
         return var2.field1686;
      }
   }

   static final boolean method844(int var0, int var1, class39 var2, class427 var3) {
      int var5 = var0;
      int var6 = var1;
      byte var7 = 64;
      byte var8 = 64;
      int var9 = var0 - var7;
      int var10 = var1 - var8;
      class474.field3991[var7][var8] = 99;
      class474.field3993[var7][var8] = 0;
      byte var11 = 0;
      int var12 = 0;
      class474.field3992[var11] = var0;
      byte var10001 = var11;
      int var19 = var11 + 1;
      class474.field3995[var10001] = var1;
      int[][] var13 = var3.field3534;

      while(var19 != var12) {
         var5 = class474.field3992[var12];
         var6 = class474.field3995[var12];
         var12 = var12 + 1 & 4095;
         int var17 = var5 - var9;
         int var18 = var6 - var10;
         int var14 = var5 - var3.field3531;
         int var15 = var6 - var3.field3532;
         if (var2.method165(1, var5, var6, var3)) {
            class474.field3990 = var5;
            class474.field3994 = var6;
            return true;
         }

         int var16 = 1 + class474.field3993[var17][var18];
         if (var17 > 0 && 0 == class474.field3991[var17 - 1][var18] && 0 == (var13[var14 - 1][var15] & 19136776)) {
            class474.field3992[var19] = var5 - 1;
            class474.field3995[var19] = var6;
            var19 = var19 + 1 & 4095;
            class474.field3991[var17 - 1][var18] = 2;
            class474.field3993[var17 - 1][var18] = var16;
         }

         if (var17 < 127 && class474.field3991[var17 + 1][var18] == 0 && (var13[var14 + 1][var15] & 19136896) == 0) {
            class474.field3992[var19] = var5 + 1;
            class474.field3995[var19] = var6;
            var19 = var19 + 1 & 4095;
            class474.field3991[var17 + 1][var18] = 8;
            class474.field3993[var17 + 1][var18] = var16;
         }

         if (var18 > 0 && class474.field3991[var17][var18 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136770)) {
            class474.field3992[var19] = var5;
            class474.field3995[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class474.field3991[var17][var18 - 1] = 1;
            class474.field3993[var17][var18 - 1] = var16;
         }

         if (var18 < 127 && 0 == class474.field3991[var17][var18 + 1] && (var13[var14][var15 + 1] & 19136800) == 0) {
            class474.field3992[var19] = var5;
            class474.field3995[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class474.field3991[var17][var18 + 1] = 4;
            class474.field3993[var17][var18 + 1] = var16;
         }

         if (var17 > 0 && var18 > 0 && 0 == class474.field3991[var17 - 1][var18 - 1] && 0 == (var13[var14 - 1][var15 - 1] & 19136782) && 0 == (var13[var14 - 1][var15] & 19136776) && (var13[var14][var15 - 1] & 19136770) == 0) {
            class474.field3992[var19] = var5 - 1;
            class474.field3995[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class474.field3991[var17 - 1][var18 - 1] = 3;
            class474.field3993[var17 - 1][var18 - 1] = var16;
         }

         if (var17 < 127 && var18 > 0 && class474.field3991[var17 + 1][var18 - 1] == 0 && 0 == (var13[var14 + 1][var15 - 1] & 19136899) && (var13[var14 + 1][var15] & 19136896) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
            class474.field3992[var19] = var5 + 1;
            class474.field3995[var19] = var6 - 1;
            var19 = var19 + 1 & 4095;
            class474.field3991[var17 + 1][var18 - 1] = 9;
            class474.field3993[var17 + 1][var18 - 1] = var16;
         }

         if (var17 > 0 && var18 < 127 && class474.field3991[var17 - 1][var18 + 1] == 0 && 0 == (var13[var14 - 1][var15 + 1] & 19136824) && 0 == (var13[var14 - 1][var15] & 19136776) && (var13[var14][var15 + 1] & 19136800) == 0) {
            class474.field3992[var19] = var5 - 1;
            class474.field3995[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class474.field3991[var17 - 1][var18 + 1] = 6;
            class474.field3993[var17 - 1][var18 + 1] = var16;
         }

         if (var17 < 127 && var18 < 127 && 0 == class474.field3991[var17 + 1][var18 + 1] && 0 == (var13[var14 + 1][var15 + 1] & 19136992) && 0 == (var13[var14 + 1][var15] & 19136896) && (var13[var14][var15 + 1] & 19136800) == 0) {
            class474.field3992[var19] = var5 + 1;
            class474.field3995[var19] = var6 + 1;
            var19 = var19 + 1 & 4095;
            class474.field3991[var17 + 1][var18 + 1] = 12;
            class474.field3993[var17 + 1][var18 + 1] = var16;
         }
      }

      class474.field3990 = var5;
      class474.field3994 = var6;
      return false;
   }
}
