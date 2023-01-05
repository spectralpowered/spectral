public class class2 {
   static class266[] field8;
   static class2[] field12;
   static int field11 = 0;
   static int field9 = 0;
   static int[] field14 = new int[]{0, 1, 2, 3};
   static int[] field15 = new int[]{1, 1, 1, 1};
   int field10;
   int field16;
   int field17;
   int field19;
   int field20;
   String field13;
   String field18;

   boolean method3() {
      return 0 != (1 & this.field16);
   }

   boolean method8() {
      return 0 != (2 & this.field16);
   }

   boolean method4() {
      return 0 != (4 & this.field16);
   }

   boolean method5() {
      return 0 != (8 & this.field16);
   }

   boolean method9() {
      return 0 != (536870912 & this.field16);
   }

   boolean method6() {
      return 0 != (33554432 & this.field16);
   }

   boolean method13() {
      return 0 != (1073741824 & this.field16);
   }

   boolean method12() {
      return 0 != (256 & this.field16);
   }

   boolean method7() {
      return (134217728 & this.field16) != 0;
   }

   public static class78 method10(class78[] var0, int var1) {
      class78[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class78 var5 = var3[var4];
         if (var1 == var5.method330()) {
            return var5;
         }
      }

      return null;
   }

   static final int method11(int var0, int var1, int var2) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = class398.method1967(var4, var6);
      int var9 = class398.method1967(var4 + 1, var6);
      int var10 = class398.method1967(var4, var6 + 1);
      int var11 = class398.method1967(var4 + 1, var6 + 1);
      int var12 = class466.method2281(var8, var9, var5, var2);
      int var13 = class466.method2281(var10, var11, var5, var2);
      return class466.method2281(var12, var13, var7, var2);
   }
}
