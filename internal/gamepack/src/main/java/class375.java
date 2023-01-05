import java.util.Comparator;

final class class375 implements Comparator {
   static boolean field3180;
   static class413 field3181;

   int method1850(class258 var1, class258 var2) {
      return var1.field2108.field2568 < var2.field2108.field2568 ? -1 : (var2.field2108.field2568 == var1.field2108.field2568 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method1850((class258)var1, (class258)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static int method1852(int var0, class461 var1, boolean var2) {
      if (var0 == 3300) {
         class386.field3248[++class161.field1227 - 1] = client.field231;
         return 1;
      } else {
         int var4;
         int var5;
         if (var0 == 3301) {
            class161.field1227 -= 2;
            var4 = class386.field3248[class161.field1227];
            var5 = class386.field3248[1 + class161.field1227];
            class386.field3248[++class161.field1227 - 1] = class362.method1804(var4, var5);
            return 1;
         } else if (var0 == 3302) {
            class161.field1227 -= 2;
            var4 = class386.field3248[class161.field1227];
            var5 = class386.field3248[1 + class161.field1227];
            class386.field3248[++class161.field1227 - 1] = class446.method2232(var4, var5);
            return 1;
         } else if (var0 == 3303) {
            class161.field1227 -= 2;
            var4 = class386.field3248[class161.field1227];
            var5 = class386.field3248[class161.field1227 + 1];
            class386.field3248[++class161.field1227 - 1] = class70.method309(var4, var5);
            return 1;
         } else if (var0 == 3304) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3248[++class161.field1227 - 1] = class422.method2050(var4).field1266;
            return 1;
         } else if (var0 == 3305) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3248[++class161.field1227 - 1] = client.field293[var4];
            return 1;
         } else if (var0 == 3306) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3248[++class161.field1227 - 1] = client.field365[var4];
            return 1;
         } else if (var0 == 3307) {
            var4 = class386.field3248[--class161.field1227];
            class386.field3248[++class161.field1227 - 1] = client.field366[var4];
            return 1;
         } else {
            int var6;
            if (var0 == 3308) {
               var4 = class347.field2878;
               var5 = (class113.field846.field2672 >> 7) + class312.field2465;
               var6 = (class113.field846.field2608 >> 7) + class325.field2575;
               class386.field3248[++class161.field1227 - 1] = (var4 << 28) + (var5 << 14) + var6;
               return 1;
            } else if (var0 == 3309) {
               var4 = class386.field3248[--class161.field1227];
               class386.field3248[++class161.field1227 - 1] = var4 >> 14 & 16383;
               return 1;
            } else if (var0 == 3310) {
               var4 = class386.field3248[--class161.field1227];
               class386.field3248[++class161.field1227 - 1] = var4 >> 28;
               return 1;
            } else if (var0 == 3311) {
               var4 = class386.field3248[--class161.field1227];
               class386.field3248[++class161.field1227 - 1] = var4 & 16383;
               return 1;
            } else if (var0 == 3312) {
               class386.field3248[++class161.field1227 - 1] = client.field222 ? 1 : 0;
               return 1;
            } else if (var0 == 3313) {
               class161.field1227 -= 2;
               var4 = class386.field3248[class161.field1227] + '耀';
               var5 = class386.field3248[class161.field1227 + 1];
               class386.field3248[++class161.field1227 - 1] = class362.method1804(var4, var5);
               return 1;
            } else if (var0 == 3314) {
               class161.field1227 -= 2;
               var4 = '耀' + class386.field3248[class161.field1227];
               var5 = class386.field3248[1 + class161.field1227];
               class386.field3248[++class161.field1227 - 1] = class446.method2232(var4, var5);
               return 1;
            } else if (var0 == 3315) {
               class161.field1227 -= 2;
               var4 = class386.field3248[class161.field1227] + '耀';
               var5 = class386.field3248[1 + class161.field1227];
               class386.field3248[++class161.field1227 - 1] = class70.method309(var4, var5);
               return 1;
            } else if (var0 == 3316) {
               if (client.field481 >= 2) {
                  class386.field3248[++class161.field1227 - 1] = client.field481;
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3317) {
               class386.field3248[++class161.field1227 - 1] = client.field237;
               return 1;
            } else if (var0 == 3318) {
               class386.field3248[++class161.field1227 - 1] = client.field395;
               return 1;
            } else if (var0 == 3321) {
               class386.field3248[++class161.field1227 - 1] = client.field342 / 100;
               return 1;
            } else if (var0 == 3322) {
               class386.field3248[++class161.field1227 - 1] = client.field401;
               return 1;
            } else if (var0 == 3323) {
               if (client.field441) {
                  class386.field3248[++class161.field1227 - 1] = 1;
               } else {
                  class386.field3248[++class161.field1227 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3324) {
               class386.field3248[++class161.field1227 - 1] = client.field308;
               return 1;
            } else if (var0 == 3325) {
               class161.field1227 -= 4;
               var4 = class386.field3248[class161.field1227];
               var5 = class386.field3248[1 + class161.field1227];
               var6 = class386.field3248[2 + class161.field1227];
               int var7 = class386.field3248[3 + class161.field1227];
               var4 += var5 << 14;
               var4 += var6 << 28;
               var4 += var7;
               class386.field3248[++class161.field1227 - 1] = var4;
               return 1;
            } else if (var0 == 3326) {
               class386.field3248[++class161.field1227 - 1] = client.field233;
               return 1;
            } else if (var0 == 3327) {
               class386.field3248[++class161.field1227 - 1] = client.field265;
               return 1;
            } else if (var0 == 3331) {
               class386.field3248[++class161.field1227 - 1] = client.field342;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   static void method1851() {
      if (class113.field846.field2672 >> 7 == client.field473 && class113.field846.field2608 >> 7 == client.field219) {
         client.field473 = 0;
      }

   }
}
