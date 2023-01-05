import java.net.URL;

public class class377 {
   static int field3308;
   static int field3309;
   static int[] field3310 = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

   static boolean method1799() {
      try {
         if (class123.field1450 == null) {
            class123.field1450 = class20.field151.method861(new URL(class328.field3062));
         } else if (class123.field1450.method2081()) {
            byte[] var1 = class123.field1450.method2079();
            class134 var2 = new class134(var1);
            var2.method717();
            class296.field2833 = var2.method671();
            class296.field2834 = new class296[class296.field2833];

            class296 var4;
            for(int var3 = 0; var3 < class296.field2833; var4.field2842 = var3++) {
               var4 = class296.field2834[var3] = new class296();
               var4.field2832 = var2.method671();
               var4.field2838 = var2.method717();
               var4.field2840 = var2.method677();
               var4.field2835 = var2.method677();
               var4.field2841 = var2.method669();
               var4.field2839 = var2.method672();
            }

            class450.method2129(class296.field2834, 0, class296.field2834.length - 1, class296.field2836, class296.field2837);
            class123.field1450 = null;
            return true;
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         class123.field1450 = null;
      }

      return false;
   }

   public static void method1796(class164 var0, int var1, int var2, int var3, boolean var4) {
      class126.field1458 = 1;
      class371.field3293 = var0;
      class329.field3069 = var1;
      class126.field1461 = var2;
      class219.field2420 = var3;
      class342.field3145 = var4;
      class126.field1460 = 10000;
   }

   static class472 method1800(int var0, int var1, int var2) {
      int var4 = var0 + (var1 << 8);
      class472 var7 = (class472)class472.field3918.method161((long)(var4 << 16));
      class472 var6;
      if (var7 != null) {
         var6 = var7;
      } else {
         String var8 = String.valueOf(var4);
         int var9 = class71.field849.method883(var8);
         if (var9 == -1) {
            var6 = null;
         } else {
            label47: {
               byte[] var10 = class71.field849.method874(var9);
               if (null != var10) {
                  if (var10.length <= 1) {
                     var6 = null;
                     break label47;
                  }

                  var7 = class88.method490(var10);
                  if (null != var7) {
                     class472.field3918.method163(var7, (long)(var4 << 16));
                     var6 = var7;
                     break label47;
                  }
               }

               var6 = null;
            }
         }
      }

      if (null != var6) {
         return var6;
      } else {
         int var14 = (-3 - var2 << 8) + var0;
         class472 var16 = (class472)class472.field3918.method161((long)(var14 << 16));
         class472 var15;
         if (null != var16) {
            var15 = var16;
         } else {
            String var11 = String.valueOf(var14);
            int var12 = class71.field849.method883(var11);
            if (var12 == -1) {
               var15 = null;
            } else {
               byte[] var13 = class71.field849.method874(var12);
               if (null != var13) {
                  if (var13.length <= 1) {
                     var15 = null;
                     return null != var15 ? var15 : null;
                  }

                  var16 = class88.method490(var13);
                  if (null != var16) {
                     class472.field3918.method163(var16, (long)(var14 << 16));
                     var15 = var16;
                     return null != var15 ? var15 : null;
                  }
               }

               var15 = null;
            }
         }

         return null != var15 ? var15 : null;
      }
   }

   protected static final void method1798() {
      class432.field3608.method910();

      int var1;
      for(var1 = 0; var1 < 32; ++var1) {
         class141.field1525[var1] = 0L;
      }

      for(var1 = 0; var1 < 32; ++var1) {
         class141.field1523[var1] = 0L;
      }

      class300.field2884 = 0;
   }

   static final void method1797() {
      if (class312.field2974) {
         for(int var1 = 0; var1 < class25.field180; ++var1) {
            class47 var2 = client.field551[class25.field179[var1]];
            var2.method243();
         }

         class312.field2974 = false;
      }

   }
}
