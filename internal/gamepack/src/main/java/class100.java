import java.awt.FontMetrics;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(
   name = "da"
)
public class class100 {
   @ObfInfo(
      owner = "da",
      name = "x",
      desc = "I"
   )
   static int field794 = 0;
   @ObfInfo(
      owner = "da",
      name = "av",
      desc = "Ljava/awt/FontMetrics;"
   )
   static FontMetrics field796;
   @ObfInfo(
      owner = "da",
      name = "e",
      desc = "Lql;"
   )
   static final class385 field795 = new class385(1024);
   @ObfInfo(
      owner = "da",
      name = "v",
      desc = "Lmm;"
   )
   static final class477 field793 = new class477();
   @ObfInfo(
      owner = "da",
      name = "h",
      desc = "Ljava/util/Map;"
   )
   static final Map field792 = new HashMap();

   @ObfInfo(
      owner = "da",
      name = "h",
      desc = "(Lly;B)V"
   )
   public static void method398(class274 var0) {
      class169.field1268 = var0;
   }

   @ObfInfo(
      owner = "da",
      name = "f",
      desc = "(Lqy;IIIIIII)V"
   )
   static final void method397(class127 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
      int var9;
      if (var8) {
         class71.field644[var1][var2][var3] = 0;

         while(true) {
            var9 = client.field228 < 209 ? var0.method547() : var0.method549();
            if (var9 == 0) {
               if (var1 == 0) {
                  int[] var16 = class71.field636[0][var2];
                  int var13 = var4 + 932731;
                  int var14 = var5 + 556238;
                  int var15 = class2.method11(var13 + '넵', var14 + 91923, 4) - 128 + (class2.method11(var13 + 10294, var14 + '鎽', 2) - 128 >> 1) + (class2.method11(var13, var14, 1) - 128 >> 2);
                  var15 = (int)((double)var15 * 0.3D) + 35;
                  if (var15 < 10) {
                     var15 = 10;
                  } else if (var15 > 60) {
                     var15 = 60;
                  }

                  var16[var3] = -var15 * 8;
               } else {
                  class71.field636[var1][var2][var3] = class71.field636[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var9 == 1) {
               int var10 = var0.method547();
               if (var10 == 1) {
                  var10 = 0;
               }

               if (var1 == 0) {
                  class71.field636[0][var2][var3] = 8 * -var10;
               } else {
                  class71.field636[var1][var2][var3] = class71.field636[var1 - 1][var2][var3] - var10 * 8;
               }
               break;
            }

            if (var9 <= 49) {
               class419.field3433[var1][var2][var3] = client.field228 < 209 ? (short)var0.method548() : (short)var0.method550();
               class71.field643[var1][var2][var3] = (byte)((var9 - 2) / 4);
               class471.field3958[var1][var2][var3] = (byte)(var9 - 2 + var6 & 3);
            } else if (var9 <= 81) {
               class71.field644[var1][var2][var3] = (byte)(var9 - 49);
            } else {
               class71.field638[var1][var2][var3] = (short)(var9 - 81);
            }
         }
      } else {
         while(true) {
            var9 = client.field228 < 209 ? var0.method547() : var0.method549();
            if (var9 == 0) {
               break;
            }

            if (var9 == 1) {
               var0.method547();
               break;
            }

            if (var9 <= 49) {
               if (client.field228 < 209) {
                  var0.method548();
               } else {
                  var0.method550();
               }
            }
         }
      }

   }
}
