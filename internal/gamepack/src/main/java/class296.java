public class class296 {
   static class296[] field2834;
   static class319[] field2830;
   static int field2831 = 0;
   static int field2833 = 0;
   static int[] field2836 = new int[]{0, 1, 2, 3};
   static int[] field2837 = new int[]{1, 1, 1, 1};
   int field2832;
   int field2838;
   int field2839;
   int field2841;
   int field2842;
   String field2835;
   String field2840;

   boolean method1392() {
      return 0 != (1 & this.field2838);
   }

   boolean method1397() {
      return 0 != (2 & this.field2838);
   }

   boolean method1393() {
      return 0 != (4 & this.field2838);
   }

   boolean method1394() {
      return 0 != (8 & this.field2838);
   }

   boolean method1398() {
      return 0 != (536870912 & this.field2838);
   }

   boolean method1395() {
      return 0 != (33554432 & this.field2838);
   }

   boolean method1402() {
      return 0 != (1073741824 & this.field2838);
   }

   boolean method1401() {
      return 0 != (256 & this.field2838);
   }

   boolean method1396() {
      return (134217728 & this.field2838) != 0;
   }

   public static class445 method1399(class445[] var0, int var1) {
      class445[] var3 = var0;

      for(int var4 = 0; var4 < var3.length; ++var4) {
         class445 var5 = var3[var4];
         if (var1 == var5.method2118()) {
            return var5;
         }
      }

      return null;
   }

   static final int method1400(int var0, int var1, int var2) {
      int var4 = var0 / var2;
      int var5 = var0 & var2 - 1;
      int var6 = var1 / var2;
      int var7 = var1 & var2 - 1;
      int var8 = class250.method1230(var4, var6);
      int var9 = class250.method1230(var4 + 1, var6);
      int var10 = class250.method1230(var4, var6 + 1);
      int var11 = class250.method1230(var4 + 1, var6 + 1);
      int var12 = class182.method953(var8, var9, var5, var2);
      int var13 = class182.method953(var10, var11, var5, var2);
      return class182.method953(var12, var13, var7, var2);
   }
}
