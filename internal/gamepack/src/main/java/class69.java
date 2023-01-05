import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class class69 {
   class472 field847;
   int field846 = -1;
   int[] field845;
   String[] field848;

   public static void method394() {
      class212.field2378.method162();
   }

   public static final class157 method388(class20 var0, int var1, int var2) {
      if (0 == class157.field1636) {
         throw new IllegalStateException();
      } else if (var1 >= 0 && var1 < 2) {
         if (var2 < 256) {
            var2 = 256;
         }

         try {
            class157 var4 = class449.field3692.method938();
            var4.field1642 = new int[256 * (class126.field1464 ? 2 : 1)];
            var4.field1631 = var2;
            var4.method827();
            var4.field1630 = 1024 + (var2 & -1024);
            if (var4.field1630 > 16384) {
               var4.field1630 = 16384;
            }

            var4.method834(var4.field1630);
            if (class352.field3183 > 0 && class157.field1625 == null) {
               class157.field1625 = new class414();
               class110.field1381 = Executors.newScheduledThreadPool(1);
               class110.field1381.scheduleAtFixedRate(class157.field1625, 0L, 10L, TimeUnit.MILLISECONDS);
            }

            if (null != class157.field1625) {
               if (null != class157.field1625.field3556[var1]) {
                  throw new IllegalArgumentException();
               }

               class157.field1625.field3556[var1] = var4;
            }

            return var4;
         } catch (Throwable var5) {
            return new class157();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static void method393() {
      class237.field2557.method162();
   }

   static final void method390(int var0, int var1, int var2) {
      int var4;
      for(var4 = 0; var4 < 8; ++var4) {
         for(int var5 = 0; var5 < 8; ++var5) {
            class74.field858[var0][var4 + var1][var5 + var2] = 0;
         }
      }

      if (var1 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class74.field858[var0][var1][var4 + var2] = class74.field858[var0][var1 - 1][var4 + var2];
         }
      }

      if (var2 > 0) {
         for(var4 = 1; var4 < 8; ++var4) {
            class74.field858[var0][var4 + var1][var2] = class74.field858[var0][var1 + var4][var2 - 1];
         }
      }

      if (var1 > 0 && 0 != class74.field858[var0][var1 - 1][var2]) {
         class74.field858[var0][var1][var2] = class74.field858[var0][var1 - 1][var2];
      } else if (var2 > 0 && class74.field858[var0][var1][var2 - 1] != 0) {
         class74.field858[var0][var1][var2] = class74.field858[var0][var1][var2 - 1];
      } else if (var1 > 0 && var2 > 0 && class74.field858[var0][var1 - 1][var2 - 1] != 0) {
         class74.field858[var0][var1][var2] = class74.field858[var0][var1 - 1][var2 - 1];
      }

   }

   static final void method387(int var0, int var1, int var2) {
      if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
         int var4 = class192.method991(var0, var1, class195.field2036) - var2;
         var0 -= class342.field3148;
         var4 -= class318.field3010;
         var1 -= class112.field1394;
         int var5 = class234.field2526[class389.field3438];
         int var6 = class234.field2544[class389.field3438];
         int var7 = class234.field2526[class177.field1929];
         int var8 = class234.field2544[class177.field1929];
         int var9 = var0 * var8 + var7 * var1 >> 16;
         var1 = var8 * var1 - var7 * var0 >> 16;
         var0 = var9;
         var9 = var4 * var6 - var1 * var5 >> 16;
         var1 = var6 * var1 + var4 * var5 >> 16;
         if (var1 >= 50) {
            client.field640 = client.field705 / 2 + var0 * client.field707 / var1;
            client.field461 = client.field604 / 2 + client.field707 * var9 / var1;
         } else {
            client.field640 = -1;
            client.field461 = -1;
         }

      } else {
         client.field640 = -1;
         client.field461 = -1;
      }
   }

   static final void method392(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      class384.method1821(var0, var1, var2, var3, var4, var5, var6, false);
   }

   static final void method391(int var0, int var1) {
      class112 var3 = var0 >= 0 ? client.field549[var0] : class359.field3209;
      if (var3 != null && var1 >= 0 && var1 < var3.method587()) {
         class278 var4 = (class278)var3.field1397.get(var1);
         if (var4.field2759 == -1) {
            String var5 = var4.field2757.method928();
            class81 var6 = class189.method982(class165.field1811, client.field483.field3459);
            var6.field933.method666(3 + class444.method2117(var5));
            var6.field933.method666(var0);
            var6.field933.method655(var1);
            var6.field933.method660(var5, (byte)42);
            client.field483.method1920(var6);
         }
      }
   }

   static String method389(String var0, boolean var1) {
      String var3 = var1 ? "https://" : "http://";
      if (1 == client.field425) {
         var0 = var0 + "-wtrc";
      } else if (2 == client.field425) {
         var0 = var0 + "-wtqa";
      } else if (client.field425 == 3) {
         var0 = var0 + "-wtwip";
      } else if (5 == client.field425) {
         var0 = var0 + "-wti";
      } else if (client.field425 == 4) {
         var0 = "local";
      }

      String var4 = "";
      if (class243.field2593 != null) {
         var4 = "/p=" + class243.field2593;
      }

      String var5 = "runescape.com";
      return var3 + var0 + "." + var5 + "/l=" + class300.field2886 + "/a=" + class316.field3006 + var4 + "/";
   }
}
