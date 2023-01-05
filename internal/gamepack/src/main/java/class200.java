import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class class200 extends class46 {
   HashSet field1749;
   HashSet field1750;
   List field1751;

   void method882(class127 var1, class127 var2, int var3, boolean var4) {
      this.method221(var1, var3);
      int var6 = var2.method549();
      this.field1749 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class35 var8 = new class35();

         try {
            var8.method145(var2);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field1749.add(var8);
      }

      var7 = var2.method549();
      this.field1750 = new HashSet(var7);

      for(int var13 = 0; var13 < var7; ++var13) {
         class468 var9 = new class468();

         try {
            var9.method2288(var2);
         } catch (IllegalStateException var11) {
            continue;
         }

         this.field1750.add(var9);
      }

      this.method881(var2, var4);
   }

   void method881(class127 var1, boolean var2) {
      this.field1751 = new LinkedList();
      int var4 = var1.method549();

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var1.method560();
         class464 var7 = new class464(var1.method595());
         boolean var8 = var1.method547() == 1;
         if (var2 || !var8) {
            this.field1751.add(new class450((class464)null, var7, var6, (class23)null));
         }
      }

   }

   static void method883(class380 var0, boolean var1) {
      if (null != var0 && var0.method1678() && !var0.field3213) {
         var0.field3211 = false;
         if ((client.field274 && class268.field2221 > 50 || class268.field2221 > 200) && var1 && var0.field2645 == var0.field2613) {
            var0.field3211 = true;
         }

         int var3 = var0.field2672 >> 7;
         int var4 = var0.field2608 >> 7;
         if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
            long var5 = class214.method949(0, 0, 0, false, var0.field3215);
            if (var0.field3206 != null && client.field231 >= var0.field3218 && client.field231 < var0.field3202) {
               var0.field3211 = false;
               var0.field3201 = class327.method1666(var0.field2672, var0.field2608, class347.field2878);
               var0.field2612 = client.field231;
               class408.field3415.method1570(class347.field2878, var0.field2672, var0.field2608, var0.field3201, 60, var0, var0.field2622, var5, var0.field3220, var0.field3208, var0.field3204, var0.field3200);
            } else {
               if ((var0.field2672 & 127) == 64 && 64 == (var0.field2608 & 127)) {
                  if (client.field328[var3][var4] == client.field329) {
                     return;
                  }

                  client.field328[var3][var4] = client.field329;
               }

               var0.field3201 = class327.method1666(var0.field2672, var0.field2608, class347.field2878);
               var0.field2612 = client.field231;
               class408.field3415.method1604(class347.field2878, var0.field2672, var0.field2608, var0.field3201, 60, var0, var0.field2622, var5, var0.field2609);
            }
         }
      }

   }
}
