public class class137 {
   public static String[] field1497;
   static class161 field1495;
   static class161[] field1498;
   static class230 field1496;

   public static int method733(int var0) {
      return class278.method1307(class245.field2606[var0]);
   }

   static void method732(class210 var0, int var1, int var2) {
      if (var0.field2262 == 0) {
         var0.field2228 = var0.field2224;
      } else if (1 == var0.field2262) {
         var0.field2228 = (var1 - var0.field2230) / 2 + var0.field2224;
      } else if (var0.field2262 == 2) {
         var0.field2228 = var1 - var0.field2230 - var0.field2224;
      } else if (3 == var0.field2262) {
         var0.field2228 = var0.field2224 * var1 >> 14;
      } else if (var0.field2262 == 4) {
         var0.field2228 = (var0.field2224 * var1 >> 14) + (var1 - var0.field2230) / 2;
      } else {
         var0.field2228 = var1 - var0.field2230 - (var1 * var0.field2224 >> 14);
      }

      if (var0.field2358 == 0) {
         var0.field2229 = var0.field2225;
      } else if (1 == var0.field2358) {
         var0.field2229 = var0.field2225 + (var2 - var0.field2289) / 2;
      } else if (var0.field2358 == 2) {
         var0.field2229 = var2 - var0.field2289 - var0.field2225;
      } else if (3 == var0.field2358) {
         var0.field2229 = var2 * var0.field2225 >> 14;
      } else if (4 == var0.field2358) {
         var0.field2229 = (var2 - var0.field2289) / 2 + (var0.field2225 * var2 >> 14);
      } else {
         var0.field2229 = var2 - var0.field2289 - (var0.field2225 * var2 >> 14);
      }

   }
}
