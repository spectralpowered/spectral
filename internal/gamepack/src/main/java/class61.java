@ObfInfo(
   name = "dd"
)
public class class61 extends class392 {
   @ObfInfo(
      owner = "dd",
      name = "vz",
      desc = "I"
   )
   static int field605;
   @ObfInfo(
      owner = "dd",
      name = "h",
      desc = "Z"
   )
   final boolean field604;

   @ObfInfo(
      owner = "dd",
      name = "<init>",
      desc = "(Z)V"
   )
   public class61(boolean var1) {
      this.field604 = var1;
   }

   @ObfInfo(
      owner = "dd",
      name = "h",
      desc = "(Loa;Loa;I)I"
   )
   int method281(class69 var1, class69 var2) {
      if (var1.field627 != 0 && 0 != var2.field627) {
         return this.field604 ? var1.method1817().method1104(var2.method1817()) : var2.method1817().method1104(var1.method1817());
      } else {
         return this.method1918(var1, var2);
      }
   }

   @ObfInfo(
      owner = "dd",
      name = "compare",
      desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
   )
   public int compare(Object var1, Object var2) {
      return this.method281((class69)var1, (class69)var2);
   }

   @ObfInfo(
      owner = "dd",
      name = "k",
      desc = "(Lbz;I)V"
   )
   static void method282(class2 var0) {
      if (var0.method3() != client.field222) {
         client.field222 = var0.method3();
         class206.method900(var0.method3());
      }

      if (client.field308 != var0.field16) {
         class38 var2 = class446.field3678;
         int var3 = var0.field16;
         if ((var3 & 536870912) != 0) {
            class359.field3054 = class208.method906(var2, "logo_deadman_mode", "");
         } else if ((var3 & 1073741824) != 0) {
            class359.field3054 = class208.method906(var2, "logo_seasonal_mode", "");
         } else if (0 != (var3 & 256)) {
            class359.field3054 = class208.method906(var2, "logo_speedrunning", "");
         } else {
            class359.field3054 = class208.method906(var2, "logo", "");
         }
      }

      class182.field1677 = var0.field18;
      client.field395 = var0.field10;
      client.field308 = var0.field16;
      class57.field589 = 0 == client.field221 ? 'ꩊ' : '鱀' + var0.field10;
      class15.field72 = client.field221 == 0 ? 443 : var0.field10 + '썐';
      class148.field1164 = class57.field589;
   }
}
