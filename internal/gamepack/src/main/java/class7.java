public final class class7 {
   int field31;
   int field32;
   int field33;
   int field34;
   int field35;
   int field36;
   int field37;
   int field38;
   int field39;
   int field40;
   int field41;
   int field42;
   int field43;
   int field44;
   int field45;
   int field46;
   int field47;
   int field48;

   public static int method24(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static void method25() {
      try {
         if (1 == class126.field1458) {
            int var1 = class158.field1647.method2349();
            if (var1 > 0 && class158.field1647.method2327()) {
               var1 -= class126.field1460;
               if (var1 < 0) {
                  var1 = 0;
               }

               class158.field1647.method2348(var1);
               return;
            }

            class158.field1647.method2326();
            class158.field1647.method2325();
            if (null != class371.field3293) {
               class126.field1458 = 2;
            } else {
               class126.field1458 = 0;
            }

            class126.field1462 = null;
            class233.field2519 = null;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class158.field1647.method2326();
         class126.field1458 = 0;
         class126.field1462 = null;
         class233.field2519 = null;
         class371.field3293 = null;
      }

   }
}
