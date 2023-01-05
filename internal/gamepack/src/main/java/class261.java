@ObfInfo(
   name = "ea"
)
public class class261 extends class480 {
   @ObfInfo(
      owner = "ea",
      name = "cp",
      desc = "Lra;"
   )
   static class344 field2115;
   @ObfInfo(
      owner = "ea",
      name = "e",
      desc = "B"
   )
   byte field2114;
   @ObfInfo(
      owner = "ea",
      name = "h",
      desc = "I"
   )
   int field2113;
   // $FF: synthetic field
   @ObfInfo(
      owner = "ea",
      name = "this$0",
      desc = "Lem;"
   )
   final class182 this$0;

   @ObfInfo(
      owner = "ea",
      name = "<init>",
      desc = "(Lem;)V"
   )
   class261(class182 var1) {
      this.this$0 = var1;
      this.field2113 = -1;
   }

   @ObfInfo(
      owner = "ea",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2367(class127 var1) {
      this.field2113 = var1.method549();
      this.field2114 = var1.method548();
   }

   @ObfInfo(
      owner = "ea",
      name = "e",
      desc = "(Lep;I)V"
   )
   void method2368(class429 var1) {
      var1.method2107(this.field2113, this.field2114);
   }

   @ObfInfo(
      owner = "ea",
      name = "h",
      desc = "(Lly;I)V"
   )
   public static void method1112(class274 var0) {
      class33.field178 = var0;
   }

   @ObfInfo(
      owner = "ea",
      name = "e",
      desc = "(IIIB)I"
   )
   static int method1114(int var0, int var1, int var2) {
      return var0 << 28 | var1 << 14 | var2;
   }

   @ObfInfo(
      owner = "ea",
      name = "g",
      desc = "(IIIIIIII)Z"
   )
   static final boolean method1109(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var8 = class105.field815 + var6;
      if (var8 < var0 && var8 < var1 && var8 < var2) {
         return false;
      } else {
         var8 = class105.field815 - var6;
         if (var8 > var0 && var8 > var1 && var8 > var2) {
            return false;
         } else {
            var8 = var6 + class105.field808;
            if (var8 < var3 && var8 < var4 && var8 < var5) {
               return false;
            } else {
               var8 = class105.field808 - var6;
               return var8 <= var3 || var8 <= var4 || var8 <= var5;
            }
         }
      }
   }

   @ObfInfo(
      owner = "ea",
      name = "h",
      desc = "(II)I"
   )
   static int method1115(int var0) {
      return class74.field660[var0];
   }

   @ObfInfo(
      owner = "ea",
      name = "gp",
      desc = "(II)V"
   )
   static void method1113(int var0) {
      if (var0 != client.field229) {
         if (30 == client.field229) {
            client.field285.method456();
         }

         if (0 == client.field229) {
            class309.field2461.method944();
         }

         if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
            class323.method1654(0);
            client.field361 = 0;
            client.field254 = 0;
            client.field225.method1690(var0);
            if (var0 != 20) {
               class415.method2014(false);
            }
         }

         if (var0 != 20 && var0 != 40 && class19.field95 != null) {
            class19.field95.method734();
            class19.field95 = null;
         }

         if (25 == client.field229) {
            client.field371 = 0;
            client.field314 = 0;
            client.field468 = 1;
            client.field499 = 0;
            client.field287 = 1;
         }

         if (var0 != 5 && var0 != 10) {
            if (var0 == 20) {
               int var4 = 11 == client.field229 ? 4 : 0;
               class202.method887(class49.field570, class446.field3678, false, var4);
            } else if (var0 == 11) {
               class202.method887(class49.field570, class446.field3678, false, 4);
            } else if (var0 == 50) {
               class300.method1452("", "Updating date of birth...", "");
               class202.method887(class49.field570, class446.field3678, false, 7);
            } else {
               class460.method2266();
            }
         } else {
            boolean var2 = class50.field574.method2209() >= client.field224;
            int var3 = var2 ? 0 : 12;
            class202.method887(class49.field570, class446.field3678, true, var3);
         }

         client.field229 = var0;
      }
   }
}
