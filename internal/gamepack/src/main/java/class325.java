public class class325 {
   static class210 field3043;
   static final class325 field3044 = new class325(1);
   static final class325 field3045 = new class325(0);
   final int field3046;

   class325(int var1) {
      this.field3046 = var1;
   }

   static void method1573(String[] var0, int[] var1, int var2, int var3) {
      if (var2 < var3) {
         int var5 = (var2 + var3) / 2;
         int var6 = var2;
         String var7 = var0[var5];
         var0[var5] = var0[var3];
         var0[var3] = var7;
         int var8 = var1[var5];
         var1[var5] = var1[var3];
         var1[var3] = var8;

         for(int var9 = var2; var9 < var3; ++var9) {
            if (null == var7 || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
               String var10 = var0[var9];
               var0[var9] = var0[var6];
               var0[var6] = var10;
               int var11 = var1[var9];
               var1[var9] = var1[var6];
               var1[var6++] = var11;
            }
         }

         var0[var3] = var0[var6];
         var0[var6] = var7;
         var1[var3] = var1[var6];
         var1[var6] = var8;
         method1573(var0, var1, var2, var6 - 1);
         method1573(var0, var1, var6 + 1, var3);
      }

   }

   static void method1572() {
      if (class141.field1542 != null) {
         client.field718 = client.field435;
         class141.field1542.method507();

         for(int var1 = 0; var1 < client.field551.length; ++var1) {
            if (client.field551[var1] != null) {
               class141.field1542.method504((client.field551[var1].field297 >> 7) + class381.field3325, class345.field3166 + (client.field551[var1].field233 >> 7));
            }
         }
      }

   }
}
