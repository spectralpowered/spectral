import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfInfo(
   name = "bb"
)
public class class63 {
   @ObfInfo(
      owner = "bb",
      name = "bp",
      desc = "Lqi;"
   )
   static class194 field619;
   @ObfInfo(
      owner = "bb",
      name = "h",
      desc = "Ljava/util/concurrent/ExecutorService;"
   )
   ExecutorService field620 = Executors.newSingleThreadExecutor();
   @ObfInfo(
      owner = "bb",
      name = "e",
      desc = "Ljava/util/concurrent/Future;"
   )
   Future field618;

   @ObfInfo(
      owner = "bb",
      name = "<init>",
      desc = "()V"
   )
   class63() {
      this.field618 = this.field620.submit(new class287());
   }

   @ObfInfo(
      owner = "bb",
      name = "h",
      desc = "(B)V"
   )
   void method290() {
      this.field620.shutdown();
      this.field620 = null;
   }

   @ObfInfo(
      owner = "bb",
      name = "e",
      desc = "(I)Z"
   )
   boolean method291() {
      return this.field618.isDone();
   }

   @ObfInfo(
      owner = "bb",
      name = "v",
      desc = "(I)Ljava/security/SecureRandom;"
   )
   SecureRandom method292() {
      try {
         return (SecureRandom)this.field618.get();
      } catch (Exception var5) {
         SecureRandom var4 = new SecureRandom();
         var4.nextInt();
         return var4;
      }
   }

   @ObfInfo(
      owner = "bb",
      name = "e",
      desc = "([FIFI)F"
   )
   static float method295(float[] var0, int var1, float var2) {
      float var4 = var0[var1];

      for(int var5 = var1 - 1; var5 >= 0; --var5) {
         var4 = var0[var5] + var4 * var2;
      }

      return var4;
   }

   @ObfInfo(
      owner = "bb",
      name = "v",
      desc = "(ILbm;ZI)I"
   )
   static int method294(int var0, class461 var1, boolean var2) {
      if (var0 < 1000) {
         return class288.method1425(var0, var1, var2);
      } else if (var0 < 1100) {
         return class468.method2289(var0, var1, var2);
      } else if (var0 < 1200) {
         return class267.method1255(var0, var1, var2);
      } else if (var0 < 1300) {
         return class290.method1429(var0, var1, var2);
      } else if (var0 < 1400) {
         return class128.method609(var0, var1, var2);
      } else if (var0 < 1500) {
         return class458.method2261(var0, var1, var2);
      } else if (var0 < 1600) {
         return class329.method1671(var0, var1, var2);
      } else if (var0 < 1700) {
         return class426.method2079(var0, var1, var2);
      } else if (var0 < 1800) {
         return class101.method401(var0, var1, var2);
      } else if (var0 < 1900) {
         return class46.method241(var0, var1, var2);
      } else if (var0 < 2000) {
         return class325.method1660(var0, var1, var2);
      } else if (var0 < 2100) {
         return class468.method2289(var0, var1, var2);
      } else if (var0 < 2200) {
         return class267.method1255(var0, var1, var2);
      } else if (var0 < 2300) {
         return class290.method1429(var0, var1, var2);
      } else if (var0 < 2400) {
         return class128.method609(var0, var1, var2);
      } else if (var0 < 2500) {
         return class458.method2261(var0, var1, var2);
      } else if (var0 < 2600) {
         return class19.method92(var0, var1, var2);
      } else if (var0 < 2700) {
         return class472.method2335(var0, var1, var2);
      } else if (var0 < 2800) {
         return class238.method1031(var0, var1, var2);
      } else if (var0 < 2900) {
         return class285.method1416(var0, var1, var2);
      } else if (var0 < 3000) {
         return class325.method1660(var0, var1, var2);
      } else if (var0 < 3200) {
         return class436.method2166(var0, var1, var2);
      } else if (var0 < 3300) {
         return client.method196(var0, var1, var2);
      } else if (var0 < 3400) {
         return class375.method1852(var0, var1, var2);
      } else if (var0 < 3500) {
         return class73.method321(var0, var1, var2);
      } else if (var0 < 3600) {
         return class229.method997(var0, var1, var2);
      } else if (var0 < 3700) {
         return class430.method2121(var0, var1, var2);
      } else if (var0 < 3800) {
         return class91.method382(var0, var1, var2);
      } else if (var0 < 3900) {
         return class151.method701(var0, var1, var2);
      } else if (var0 < 4000) {
         return class471.method2330(var0, var1, var2);
      } else if (var0 < 4100) {
         return class123.method526(var0, var1, var2);
      } else if (var0 < 4200) {
         return class423.method2067(var0, var1, var2);
      } else if (var0 < 4300) {
         return class91.method384(var0, var1, var2);
      } else if (var0 < 5100) {
         return class409.method2005(var0, var1, var2);
      } else if (var0 < 5400) {
         return class196.method872(var0, var1, var2);
      } else if (var0 < 5600) {
         return class79.method331(var0, var1, var2);
      } else if (var0 < 5700) {
         return class173.method799(var0, var1, var2);
      } else if (var0 < 6300) {
         return class192.method866(var0, var1, var2);
      } else if (var0 < 6600) {
         return class60.method278(var0, var1, var2);
      } else if (var0 < 6700) {
         return class223.method989(var0, var1, var2);
      } else if (var0 < 6800) {
         return class433.method2145(var0, var1, var2);
      } else if (var0 < 6900) {
         return class152.method712(var0, var1, var2);
      } else if (var0 < 7000) {
         return class102.method410(var0, var1, var2);
      } else if (var0 < 7100) {
         return class459.method2263(var0, var1, var2);
      } else if (var0 < 7200) {
         return class380.method1889(var0, var1, var2);
      } else if (var0 < 7300) {
         return class117.method462(var0, var1, var2);
      } else if (var0 < 7500) {
         return class221.method977(var0, var1, var2);
      } else if (var0 < 7600) {
         return class379.method1868(var0, var1, var2);
      } else {
         return var0 < 7700 ? class121.method516(var0, var1, var2) : 2;
      }
   }

   @ObfInfo(
      owner = "bb",
      name = "ie",
      desc = "(B)I"
   )
   static final int method293() {
      if (class50.field574.method2202()) {
         return class347.field2878;
      } else {
         int var1 = class327.method1666(class463.field3850, class57.field594, class347.field2878);
         return var1 - class110.field825 < 800 && (class71.field644[class347.field2878][class463.field3850 >> 7][class57.field594 >> 7] & 4) != 0 ? class347.field2878 : 3;
      }
   }
}
