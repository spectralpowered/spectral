public class class447 extends class305 {
   static int field3665;
   final boolean field3664;

   public class447(boolean var1) {
      this.field3664 = var1;
   }

   int method2120(class185 var1, class185 var2) {
      if (var1.field1978 != 0 && 0 != var2.field1978) {
         return this.field3664 ? var1.method1063().method931(var2.method1063()) : var2.method1063().method931(var1.method1063());
      } else {
         return this.method1440(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method2120((class185)var1, (class185)var2);
   }

   static void method2121(class296 var0) {
      if (var0.method1392() != client.field426) {
         client.field426 = var0.method1392();
         class193.method994(var0.method1392());
      }

      if (client.field512 != var0.field2838) {
         class230 var2 = class280.field2767;
         int var3 = var0.field2838;
         if ((var3 & 536870912) != 0) {
            class52.field759 = class260.method1256(var2, "logo_deadman_mode", "");
         } else if ((var3 & 1073741824) != 0) {
            class52.field759 = class260.method1256(var2, "logo_seasonal_mode", "");
         } else if (0 != (var3 & 256)) {
            class52.field759 = class260.method1256(var2, "logo_speedrunning", "");
         } else {
            class52.field759 = class260.method1256(var2, "logo", "");
         }
      }

      class105.field1354 = var0.field2840;
      client.field599 = var0.field2832;
      client.field512 = var0.field2838;
      class112.field1389 = 0 == client.field425 ? 'ꩊ' : '鱀' + var0.field2832;
      class33.field326 = client.field425 == 0 ? 443 : var0.field2832 + '썐';
      class373.field3296 = class112.field1389;
   }
}
