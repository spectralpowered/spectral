public abstract class class115 implements class217 {
   static class394 field1411;
   protected int field1410;

   protected class115(class340 var1, class22 var2, int var3) {
      this.field1410 = var3;
   }

   static int method597(int var0, int var1, int var2) {
      if (0 != (class74.field866[var0][var1][var2] & 8)) {
         return 0;
      } else {
         return var0 > 0 && 0 != (class74.field866[1][var1][var2] & 2) ? var0 - 1 : var0;
      }
   }

   static void method598(class47 var0, int var1, int var2) {
      if (var1 == var0.field274 && var1 != -1) {
         int var4 = class242.method1218(var1).field897;
         if (var4 == 1) {
            var0.field265 = 0;
            var0.field276 = 0;
            var0.field277 = var2;
            var0.field278 = 0;
         }

         if (var4 == 2) {
            var0.field278 = 0;
         }
      } else if (var1 == -1 || var0.field274 == -1 || class242.method1218(var1).field920 >= class242.method1218(var0.field274).field920) {
         var0.field274 = var1;
         var0.field265 = 0;
         var0.field276 = 0;
         var0.field277 = var2;
         var0.field278 = 0;
         var0.field307 = var0.field232;
      }

   }

   static void method599(int var0, int var1) {
      class81 var3 = class189.method982(class165.field1810, client.field483.field3459);
      var3.field933.method694(var1);
      var3.field933.method656(var0);
      client.field483.method1920(var3);
   }
}
