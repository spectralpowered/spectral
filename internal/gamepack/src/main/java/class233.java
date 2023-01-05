public class class233 extends class106 {
   static class231 field2523;
   static class346 field2519;
   static class95 field2522 = new class95(32);
   int[] field2520 = new int[]{-1};
   int[] field2521 = new int[]{0};

   public static void method1164(String[] var0, int[] var1) {
      class325.method1573(var0, var1, 0, var0.length - 1);
   }

   public static synchronized byte[] method1163(int var0) {
      return class461.method2265(var0, false);
   }

   static void method1165(class210[] var0, int var1, int var2, int var3, boolean var4) {
      for(int var6 = 0; var6 < var0.length; ++var6) {
         class210 var7 = var0[var6];
         if (var7 != null && var7.field2234 == var1) {
            class47.method253(var7, var2, var3, var4);
            class137.method732(var7, var2, var3);
            if (var7.field2242 > var7.field2237 - var7.field2230) {
               var7.field2242 = var7.field2237 - var7.field2230;
            }

            if (var7.field2242 < 0) {
               var7.field2242 = 0;
            }

            if (var7.field2236 > var7.field2238 - var7.field2289) {
               var7.field2236 = var7.field2238 - var7.field2289;
            }

            if (var7.field2236 < 0) {
               var7.field2236 = 0;
            }

            if (var7.field2348 == 0) {
               class357.method1708(var0, var7, var4);
            }
         }
      }

   }
}
