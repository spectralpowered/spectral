public class class384 {
   public static class55 field3334 = new class55();

   public static boolean method1820() {
      try {
         if (2 == class126.field1458) {
            if (class126.field1462 == null) {
               class126.field1462 = class375.method1789(class371.field3293, class329.field3069, class126.field1461);
               if (class126.field1462 == null) {
                  return false;
               }
            }

            if (null == class233.field2519) {
               class233.field2519 = new class346(class126.field1463, class126.field1457);
            }

            if (class158.field1647.method2323(class126.field1462, class126.field1459, class233.field2519, 22050)) {
               class158.field1647.method2324();
               class158.field1647.method2348(class219.field2420);
               class158.field1647.method2350(class126.field1462, class342.field3145);
               class126.field1458 = 0;
               class126.field1462 = null;
               class233.field2519 = null;
               class371.field3293 = null;
               return true;
            }
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class158.field1647.method2326();
         class126.field1458 = 0;
         class126.field1462 = null;
         class233.field2519 = null;
         class371.field3293 = null;
      }

      return false;
   }

   static final void method1821(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!client.field572) {
         if (client.field573 < 500) {
            client.field579[client.field573] = var0;
            client.field460[client.field573] = var1;
            client.field667[client.field573] = var2;
            client.field537[client.field573] = var3;
            client.field574[client.field573] = var4;
            client.field567[client.field573] = var5;
            client.field578[client.field573] = var6;
            client.field581[client.field573] = var7;
            ++client.field573;
         }

      }
   }

   static void method1822(int var0) {
      if (var0 != client.field424) {
         client.field424 = var0;
      }
   }
}
