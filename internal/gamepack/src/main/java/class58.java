import java.awt.FontMetrics;
import java.util.HashMap;
import java.util.Map;

public class class58 {
   static int field814 = 0;
   static FontMetrics field816;
   static final class148 field813 = new class148();
   static final class376 field815 = new class376(1024);
   static final Map field812 = new HashMap();

   public static void method336(class164 var0) {
      class116.field1414 = var0;
   }

   static final void method335(class134 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
      int var9;
      if (var8) {
         class74.field866[var1][var2][var3] = 0;

         while(true) {
            var9 = client.field432 < 209 ? var0.method669() : var0.method671();
            if (var9 == 0) {
               if (var1 == 0) {
                  int[] var16 = class74.field858[0][var2];
                  int var13 = var4 + 932731;
                  int var14 = var5 + 556238;
                  int var15 = class296.method1400(var13 + '넵', var14 + 91923, 4) - 128 + (class296.method1400(var13 + 10294, var14 + '鎽', 2) - 128 >> 1) + (class296.method1400(var13, var14, 1) - 128 >> 2);
                  var15 = (int)((double)var15 * 0.3D) + 35;
                  if (var15 < 10) {
                     var15 = 10;
                  } else if (var15 > 60) {
                     var15 = 60;
                  }

                  var16[var3] = -var15 * 8;
               } else {
                  class74.field858[var1][var2][var3] = class74.field858[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var9 == 1) {
               int var10 = var0.method669();
               if (var10 == 1) {
                  var10 = 0;
               }

               if (var1 == 0) {
                  class74.field858[0][var2][var3] = 8 * -var10;
               } else {
                  class74.field858[var1][var2][var3] = class74.field858[var1 - 1][var2][var3] - var10 * 8;
               }
               break;
            }

            if (var9 <= 49) {
               class151.field1592[var1][var2][var3] = client.field432 < 209 ? (short)var0.method670() : (short)var0.method672();
               class74.field865[var1][var2][var3] = (byte)((var9 - 2) / 4);
               class307.field2897[var1][var2][var3] = (byte)(var9 - 2 + var6 & 3);
            } else if (var9 <= 81) {
               class74.field866[var1][var2][var3] = (byte)(var9 - 49);
            } else {
               class74.field860[var1][var2][var3] = (short)(var9 - 81);
            }
         }
      } else {
         while(true) {
            var9 = client.field432 < 209 ? var0.method669() : var0.method671();
            if (var9 == 0) {
               break;
            }

            if (var9 == 1) {
               var0.method669();
               break;
            }

            if (var9 <= 49) {
               if (client.field432 < 209) {
                  var0.method670();
               } else {
                  var0.method672();
               }
            }
         }
      }

   }
}
