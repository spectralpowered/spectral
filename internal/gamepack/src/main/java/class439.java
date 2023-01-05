@ObfInfo(
   name = "ju"
)
public abstract class class439 implements class76 {
   @ObfInfo(
      owner = "ju",
      name = "i",
      desc = "Lnv;"
   )
   static class58 field3647;
   @ObfInfo(
      owner = "ju",
      name = "h",
      desc = "I"
   )
   protected int field3646;

   @ObfInfo(
      owner = "ju",
      name = "<init>",
      desc = "(Llw;Lmb;I)V"
   )
   protected class439(class493 var1, class476 var2, int var3) {
      this.field3646 = var3;
   }

   @ObfInfo(
      owner = "ju",
      name = "i",
      desc = "(IIIB)I"
   )
   static int method2176(int var0, int var1, int var2) {
      if (0 != (class71.field644[var0][var1][var2] & 8)) {
         return 0;
      } else {
         return var0 > 0 && 0 != (class71.field644[1][var1][var2] & 2) ? var0 - 1 : var0;
      }
   }

   @ObfInfo(
      owner = "ju",
      name = "hh",
      desc = "(Lcj;IIB)V"
   )
   static void method2177(class380 var0, int var1, int var2) {
      if (var1 == var0.field2649 && var1 != -1) {
         int var4 = class271.method1277(var1).field2026;
         if (var4 == 1) {
            var0.field2640 = 0;
            var0.field2651 = 0;
            var0.field2652 = var2;
            var0.field2653 = 0;
         }

         if (var4 == 2) {
            var0.field2653 = 0;
         }
      } else if (var1 == -1 || var0.field2649 == -1 || class271.method1277(var1).field2049 >= class271.method1277(var0.field2649).field2049) {
         var0.field2649 = var1;
         var0.field2640 = 0;
         var0.field2651 = 0;
         var0.field2652 = var2;
         var0.field2653 = 0;
         var0.field2682 = var0.field2607;
      }

   }

   @ObfInfo(
      owner = "ju",
      name = "ja",
      desc = "(III)V"
   )
   static void method2178(int var0, int var1) {
      class299 var3 = class480.method2370(class356.field3024, client.field279.field4042);
      var3.field2403.method572(var1);
      var3.field2403.method534(var0);
      client.field279.method2389(var3);
   }
}
