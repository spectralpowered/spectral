public abstract class class204 {
   public static class206 field2184;
   public int field2180;
   public int field2181;
   public int field2182;
   public int field2183;

   protected abstract boolean method1050(int var1, int var2, int var3, class391 var4);

   public static final boolean method1052(char var0) {
      if (Character.isISOControl(var0)) {
         return false;
      } else if (class173.method927(var0)) {
         return true;
      } else {
         char[] var2 = class288.field2791;

         int var3;
         char var4;
         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if (var4 == var0) {
               return true;
            }
         }

         var2 = class288.field2790;

         for(var3 = 0; var3 < var2.length; ++var3) {
            var4 = var2[var3];
            if (var0 == var4) {
               return true;
            }
         }

         return false;
      }
   }

   static final void method1051(int var0, int var1) {
      if (client.field442 == 2) {
         class69.method387((client.field445 - class381.field3325 << 7) + client.field448, (client.field486 - class345.field3166 << 7) + client.field543, client.field447 * 2);
         if (client.field640 > -1 && client.field435 % 20 < 10) {
            class307.field2901[0].method1548(var0 + client.field640 - 12, var1 + client.field461 - 28);
         }

      }
   }
}
