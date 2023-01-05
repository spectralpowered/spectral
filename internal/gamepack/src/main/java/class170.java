import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class170 {
   static class468 field1860;
   ExecutorService field1861 = Executors.newSingleThreadExecutor();
   Future field1859;

   class170() {
      this.field1859 = this.field1861.submit(new class335());
   }

   void method903() {
      this.field1861.shutdown();
      this.field1861 = null;
   }

   boolean method904() {
      return this.field1859.isDone();
   }

   SecureRandom method905() {
      try {
         return (SecureRandom)this.field1859.get();
      } catch (Exception var5) {
         SecureRandom var4 = new SecureRandom();
         var4.nextInt();
         return var4;
      }
   }

   static float method908(float[] var0, int var1, float var2) {
      float var4 = var0[var1];

      for(int var5 = var1 - 1; var5 >= 0; --var5) {
         var4 = var0[var5] + var4 * var2;
      }

      return var4;
   }

   static int method907(int var0, class472 var1, boolean var2) {
      if (var0 < 1000) {
         return class175.method934(var0, var1, var2);
      } else if (var0 < 1100) {
         return class259.method1251(var0, var1, var2);
      } else if (var0 < 1200) {
         return class53.method296(var0, var1, var2);
      } else if (var0 < 1300) {
         return class302.method1428(var0, var1, var2);
      } else if (var0 < 1400) {
         return class363.method1756(var0, var1, var2);
      } else if (var0 < 1500) {
         return class76.method414(var0, var1, var2);
      } else if (var0 < 1600) {
         return class71.method397(var0, var1, var2);
      } else if (var0 < 1700) {
         return class92.method509(var0, var1, var2);
      } else if (var0 < 1800) {
         return class215.method1119(var0, var1, var2);
      } else if (var0 < 1900) {
         return class430.method2077(var0, var1, var2);
      } else if (var0 < 2000) {
         return class345.method1659(var0, var1, var2);
      } else if (var0 < 2100) {
         return class259.method1251(var0, var1, var2);
      } else if (var0 < 2200) {
         return class53.method296(var0, var1, var2);
      } else if (var0 < 2300) {
         return class302.method1428(var0, var1, var2);
      } else if (var0 < 2400) {
         return class363.method1756(var0, var1, var2);
      } else if (var0 < 2500) {
         return class76.method414(var0, var1, var2);
      } else if (var0 < 2600) {
         return class18.method106(var0, var1, var2);
      } else if (var0 < 2700) {
         return class285.method1360(var0, var1, var2);
      } else if (var0 < 2800) {
         return class334.method1615(var0, var1, var2);
      } else if (var0 < 2900) {
         return class261.method1258(var0, var1, var2);
      } else if (var0 < 3000) {
         return class345.method1659(var0, var1, var2);
      } else if (var0 < 3200) {
         return class199.method1009(var0, var1, var2);
      } else if (var0 < 3300) {
         return client.method288(var0, var1, var2);
      } else if (var0 < 3400) {
         return class462.method2268(var0, var1, var2);
      } else if (var0 < 3500) {
         return class346.method1665(var0, var1, var2);
      } else if (var0 < 3600) {
         return class51.method291(var0, var1, var2);
      } else if (var0 < 3700) {
         return class48.method259(var0, var1, var2);
      } else if (var0 < 3800) {
         return class449.method2124(var0, var1, var2);
      } else if (var0 < 3900) {
         return class211.method1104(var0, var1, var2);
      } else if (var0 < 4000) {
         return class307.method1444(var0, var1, var2);
      } else if (var0 < 4100) {
         return class295.method1391(var0, var1, var2);
      } else if (var0 < 4200) {
         return class272.method1299(var0, var1, var2);
      } else if (var0 < 4300) {
         return class449.method2126(var0, var1, var2);
      } else if (var0 < 5100) {
         return class493.method2389(var0, var1, var2);
      } else if (var0 < 5400) {
         return class247.method1225(var0, var1, var2);
      } else if (var0 < 5600) {
         return class86.method469(var0, var1, var2);
      } else if (var0 < 5700) {
         return class316.method1522(var0, var1, var2);
      } else if (var0 < 6300) {
         return class201.method1016(var0, var1, var2);
      } else if (var0 < 6600) {
         return class492.method2387(var0, var1, var2);
      } else if (var0 < 6700) {
         return class293.method1384(var0, var1, var2);
      } else if (var0 < 6800) {
         return class117.method609(var0, var1, var2);
      } else if (var0 < 6900) {
         return class154.method815(var0, var1, var2);
      } else if (var0 < 7000) {
         return class36.method183(var0, var1, var2);
      } else if (var0 < 7100) {
         return class147.method782(var0, var1, var2);
      } else if (var0 < 7200) {
         return class47.method257(var0, var1, var2);
      } else if (var0 < 7300) {
         return class398.method1944(var0, var1, var2);
      } else if (var0 < 7500) {
         return class2.method6(var0, var1, var2);
      } else if (var0 < 7600) {
         return class419.method2015(var0, var1, var2);
      } else {
         return var0 < 7700 ? class132.method650(var0, var1, var2) : 2;
      }
   }

   static final int method906() {
      if (class111.field1385.method1317()) {
         return class195.field2036;
      } else {
         int var1 = class192.method991(class342.field3148, class112.field1394, class195.field2036);
         return var1 - class318.field3010 < 800 && (class74.field866[class195.field2036][class342.field3148 >> 7][class112.field1394 >> 7] & 4) != 0 ? class195.field2036 : 3;
      }
   }
}
