@ObfInfo(
   name = "oe"
)
public class class336 extends class69 {
   @ObfInfo(
      owner = "oe",
      name = "e",
      desc = "Z"
   )
   boolean field2689;
   @ObfInfo(
      owner = "oe",
      name = "h",
      desc = "Z"
   )
   boolean field2690;

   @ObfInfo(
      owner = "oe",
      name = "h",
      desc = "(Loe;I)I"
   )
   int method1685(class336 var1) {
      if (client.field395 == super.field627 && client.field395 != var1.field627) {
         return -1;
      } else if (client.field395 == var1.field627 && client.field395 != super.field627) {
         return 1;
      } else if (0 != super.field627 && var1.field627 == 0) {
         return -1;
      } else if (var1.field627 != 0 && 0 == super.field627) {
         return 1;
      } else if (this.field2690 && !var1.field2690) {
         return -1;
      } else if (!this.field2690 && var1.field2690) {
         return 1;
      } else if (this.field2689 && !var1.field2689) {
         return -1;
      } else if (!this.field2689 && var1.field2689) {
         return 1;
      } else {
         return super.field627 != 0 ? super.field629 - var1.field629 : var1.field629 - super.field629;
      }
   }

   @ObfInfo(
      owner = "oe",
      name = "e",
      desc = "(Lov;I)I"
   )
   public int method1816(class368 var1) {
      return this.method1685((class336)var1);
   }

   @ObfInfo(
      owner = "oe",
      name = "compareTo",
      desc = "(Ljava/lang/Object;)I"
   )
   public int compareTo(Object var1) {
      return this.method1685((class336)var1);
   }

   @ObfInfo(
      owner = "oe",
      name = "mr",
      desc = "(Ljava/lang/String;B)V"
   )
   static final void method1687(String var0) {
      if (!var0.equals("")) {
         class299 var2 = class480.method2370(class356.field3028, client.field279.field4042);
         var2.field2403.method544(class319.method1614(var0));
         var2.field2403.method538(var0, (byte)122);
         client.field279.method2389(var2);
      }
   }
}
