import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@ObfInfo(
   name = "bl"
)
public class class241 {
   @ObfInfo(
      owner = "bl",
      name = "h",
      desc = "Lbm;"
   )
   class461 field2024;
   @ObfInfo(
      owner = "bl",
      name = "e",
      desc = "I"
   )
   int field2023 = -1;
   @ObfInfo(
      owner = "bl",
      name = "v",
      desc = "[I"
   )
   int[] field2022;
   @ObfInfo(
      owner = "bl",
      name = "x",
      desc = "[Ljava/lang/String;"
   )
   String[] field2025;

   @ObfInfo(
      owner = "bl",
      name = "x",
      desc = "(B)V"
   )
   public static void method1050() {
      class85.field700.method395();
   }

   @ObfInfo(
      owner = "bl",
      name = "ao",
      desc = "(Lfp;IIB)Lax;"
   )
   public static final class233 method1044(class300 var0, int var1, int var2) {
      if (0 == class233.field1985) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            class233 var4 = class91.field772.method1426();
            var4.field1991 = new int[256 * (class40.field207 ? 2 : 1)];
            var4.field1980 = var2;
            var4.method1012();
            var4.field1979 = 1024 + (var2 & -1024);
            if (var4.field1979 > 16384) {
               var4.field1979 = 16384;
            }

            var4.method1019(var4.field1979);
            if (class189.field1707 > 0 && class233.field1974 == null) {
               class233.field1974 = new class492();
               class418.field3432 = Executors.newScheduledThreadPool(1);
               class418.field3432.scheduleAtFixedRate(class233.field1974, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (null != class233.field1974) {
               if (null != class233.field1974.field4110[var1]) {
                  throw new IllegalArgumentException();
               }

               class233.field1974.field4110[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new class233();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfInfo(
      owner = "bl",
      name = "r",
      desc = "(I)V"
   )
   public static void method1049() {
      class164.field1240.method395();
   }

   @ObfInfo(
      owner = "bl",
      name = "q",
      desc = "(IIII)V"
   )
   static final void method1046(int var0, int var1, int var2) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            class71.field636[var0][var4 + var1][var5 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class71.field636[var0][var1][var4 + var2] = class71.field636[var0][var1 - 1][var4 + var2];
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class71.field636[var0][var4 + var1][var2] = class71.field636[var0][var1 + var4][var2 - 1];
         }
      }

      if (var1 > 0 && 0 != class71.field636[var0][var1 - 1][var2]) {
         class71.field636[var0][var1][var2] = class71.field636[var0][var1 - 1][var2];
      } else if (var2 > 0 && class71.field636[var0][var1][var2 - 1] != 0) {
         class71.field636[var0][var1][var2] = class71.field636[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && class71.field636[var0][var1 - 1][var2 - 1] != 0) {
         class71.field636[var0][var1][var2] = class71.field636[var0][var1 - 1][var2 - 1];
      }

   }

   @ObfInfo(
      owner = "bl",
      name = "ir",
      desc = "(IIIB)V"
   )
   static final void method1043(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = class327.method1666(var0, var1, class347.field2878) - var2;
         var0 -= class463.field3850;
         var4 -= class110.field825;
         var1 -= class57.field594;
         int var5 = class341.field2726[class442.field3666];
         int var6 = class341.field2744[class442.field3666];
         int var7 = class341.field2726[class22.field105];
         int var8 = class341.field2744[class22.field105];
         int var9 = var0 * var8 + var7 * var1 >> 16;
         var1 = var8 * var1 - var7 * var0 >> 16;
         var0 = var9;
         var9 = var4 * var6 - var1 * var5 >> 16;
         var1 = var6 * var1 + var4 * var5 >> 16;
         if (var1 >= 50) {
            client.field436 = client.field501 / 2 + var0 * client.field503 / var1;
            client.field257 = client.field400 / 2 + client.field503 * var9 / var1;
         } else {
            client.field436 = -1;
            client.field257 = -1;
         }

      } else {
         client.field436 = -1;
         client.field257 = -1;
      }
   }

   @ObfInfo(
      owner = "bl",
      name = "kn",
      desc = "(Ljava/lang/String;Ljava/lang/String;IIIIIB)V"
   )
   static final void method1048(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      class323.method1653(var0, var1, var2, var3, var4, var5, var6, false);
   }

   @ObfInfo(
      owner = "bl",
      name = "md",
      desc = "(III)V"
   )
   static final void method1047(int var0, int var1) {
      class57 var3 = var0 >= 0 ? client.field345[var0] : class198.field1746;
      if (var3 != null && var1 >= 0 && var1 < var3.method270()) {
         class49 var4 = (class49)var3.field597.get(var1);
         if (var4.field569 == -1) {
            String var5 = var4.field567.method1101();
            class299 var6 = class480.method2370(class356.field3025, client.field279.field4042);
            var6.field2403.method544(3 + class319.method1614(var5));
            var6.field2403.method544(var0);
            var6.field2403.method533(var1);
            var6.field2403.method538(var5, (byte)42);
            client.field279.method2389(var6);
         }
      }
   }

   @ObfInfo(
      owner = "bl",
      name = "mj",
      desc = "(Ljava/lang/String;ZI)Ljava/lang/String;"
   )
   static String method1045(String var0, boolean var1) {
      String var3 = var1 ? "https://" : "http://";
      if (1 == client.field221) {
         var0 = var0 + "-wtrc";
      } else if (2 == client.field221) {
         var0 = var0 + "-wtqa";
      } else if (client.field221 == 3) {
         var0 = var0 + "-wtwip";
      } else if (5 == client.field221) {
         var0 = var0 + "-wti";
      } else if (client.field221 == 4) {
         var0 = "local";
      }

      String var4 = "";
      if (class467.field3879 != null) {
         var4 = "/p=" + class467.field3879;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + class235.field1995 + "/a=" + class173.field1290 + var4 + "/";
   }
}
