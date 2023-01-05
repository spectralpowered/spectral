public final class class174 {
   int field1292;
   int field1293;
   int field1294;
   int field1295;
   int field1296;
   int field1297;
   int field1298;
   int field1299;
   int field1300;
   int field1301;
   int field1302;
   int field1303;
   int field1304;
   int field1305;
   int field1306;
   int field1307;
   int field1308;
   int field1309;

   public static int method803(long var0) {
      return (int)(var0 >>> 17 & 4294967295L);
   }

   public static void method804() {
      try {
         if (1 == class40.field201) {
            int var1 = class230.field1943.method2428();
            if (var1 > 0 && class230.field1943.method2406()) {
               var1 -= class40.field203;
               if (var1 < 0) {
                  var1 = 0;
               }

               class230.field1943.method2427(var1);
               return;
            }

            class230.field1943.method2405();
            class230.field1943.method2404();
            if (null != class253.field2089) {
               class40.field201 = 2;
            } else {
               class40.field201 = 0;
            }

            class40.field205 = null;
            class201.field1752 = null;
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class230.field1943.method2405();
         class40.field201 = 0;
         class40.field205 = null;
         class201.field1752 = null;
         class253.field2089 = null;
      }

   }
}
