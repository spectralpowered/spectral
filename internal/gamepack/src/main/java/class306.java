public class class306 {
   public static String[] field2457;
   static class344 field2455;
   static class344[] field2458;
   static class38 field2456;

   public static int method1492(int var0) {
      return class49.method251(class105.field814[var0]);
   }

   static void method1491(class120 var0, int var1, int var2) {
      if (var0.field940 == 0) {
         var0.field906 = var0.field902;
      } else if (1 == var0.field940) {
         var0.field906 = (var1 - var0.field908) / 2 + var0.field902;
      } else if (var0.field940 == 2) {
         var0.field906 = var1 - var0.field908 - var0.field902;
      } else if (3 == var0.field940) {
         var0.field906 = var0.field902 * var1 >> 14;
      } else if (var0.field940 == 4) {
         var0.field906 = (var0.field902 * var1 >> 14) + (var1 - var0.field908) / 2;
      } else {
         var0.field906 = var1 - var0.field908 - (var1 * var0.field902 >> 14);
      }

      if (var0.field1036 == 0) {
         var0.field907 = var0.field903;
      } else if (1 == var0.field1036) {
         var0.field907 = var0.field903 + (var2 - var0.field967) / 2;
      } else if (var0.field1036 == 2) {
         var0.field907 = var2 - var0.field967 - var0.field903;
      } else if (3 == var0.field1036) {
         var0.field907 = var2 * var0.field903 >> 14;
      } else if (4 == var0.field1036) {
         var0.field907 = (var2 - var0.field967) / 2 + (var0.field903 * var2 >> 14);
      } else {
         var0.field907 = var2 - var0.field967 - (var0.field903 * var2 >> 14);
      }

   }
}
