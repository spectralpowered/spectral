public class class190 {
   public static class272 method984(int var0, byte var1) {
      class272 var2 = (class272)class272.field2709.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class272.field2715.method892(9, var0);
         var2 = new class272();
         var2.field2711 = var0;
         if (null != var3) {
            if (var1 <= -1) {
               throw new IllegalStateException();
            }

            var2.method1297(new class134(var3));
         }

         var2.method1283();
         class272.field2709.method163(var2, (long)var0);
         return var2;
      }
   }
}
