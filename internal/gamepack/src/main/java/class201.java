public class class201 extends class139 {
   static class170 field1755 = new class170(32);
   static class348 field1756;
   static class73 field1752;
   int[] field1753 = new int[]{-1};
   int[] field1754 = new int[]{0};

   public static void method885(String[] var0, int[] var1) {
      class167.method783(var0, var1, 0, var0.length - 1);
   }

   public static synchronized byte[] method884(int var0) {
      return class355.method1775(var0, false);
   }

   static void method886(class120[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         class120 var7 = var0[var6];
         if (var7 != null && var7.field912 == var1) {
            class380.method1885(var7, var2, var3, var4);
            class306.method1491(var7, var2, var3);
            if (var7.field920 > var7.field915 - var7.field908) {
               var7.field920 = var7.field915 - var7.field908;
            }

            if (var7.field920 < 0) {
               var7.field920 = 0;
            }

            if (var7.field914 > var7.field916 - var7.field967) {
               var7.field914 = var7.field916 - var7.field967;
            }

            if (var7.field914 < 0) {
               var7.field914 = 0;
            }

            if (var7.field1026 == 0) {
               class378.method1862(var0, var7, var4);
            }
         }
      }

   }
}
