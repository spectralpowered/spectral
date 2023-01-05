import java.util.Comparator;

final class class462 implements Comparator {
   static boolean field3850;
   static class482 field3851;

   int method2266(class87 var1, class87 var2) {
      return var1.field973.field228 < var2.field973.field228 ? -1 : (var2.field973.field228 == var1.field973.field228 ? 0 : 1);
   }

   public int compare(Object var1, Object var2) {
      return this.method2266((class87)var1, (class87)var2);
   }

   public boolean equals(Object var1) {
      return super.equals(var1);
   }

   static int method2268(int var0, class472 var1, boolean var2) {
      if (var0 == 3300) {
         class150.field1580[++class188.field1989 - 1] = client.field435;
         return 1;
      } else {
         int var4;
         int var5;
         if (var0 == 3301) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            class150.field1580[++class188.field1989 - 1] = class304.method1435(var4, var5);
            return 1;
         } else if (var0 == 3302) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[1 + class188.field1989];
            class150.field1580[++class188.field1989 - 1] = class280.method1347(var4, var5);
            return 1;
         } else if (var0 == 3303) {
            class188.field1989 -= 2;
            var4 = class150.field1580[class188.field1989];
            var5 = class150.field1580[class188.field1989 + 1];
            class150.field1580[++class188.field1989 - 1] = class38.method213(var4, var5);
            return 1;
         } else if (var0 == 3304) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1580[++class188.field1989 - 1] = class367.method1767(var4).field1412;
            return 1;
         } else if (var0 == 3305) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1580[++class188.field1989 - 1] = client.field497[var4];
            return 1;
         } else if (var0 == 3306) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1580[++class188.field1989 - 1] = client.field569[var4];
            return 1;
         } else if (var0 == 3307) {
            var4 = class150.field1580[--class188.field1989];
            class150.field1580[++class188.field1989 - 1] = client.field570[var4];
            return 1;
         } else {
            int var6;
            if (var0 == 3308) {
               var4 = class195.field2036;
               var5 = (class89.field982.field297 >> 7) + class381.field3325;
               var6 = (class89.field982.field233 >> 7) + class345.field3166;
               class150.field1580[++class188.field1989 - 1] = (var4 << 28) + (var5 << 14) + var6;
               return 1;
            } else if (var0 == 3309) {
               var4 = class150.field1580[--class188.field1989];
               class150.field1580[++class188.field1989 - 1] = var4 >> 14 & 16383;
               return 1;
            } else if (var0 == 3310) {
               var4 = class150.field1580[--class188.field1989];
               class150.field1580[++class188.field1989 - 1] = var4 >> 28;
               return 1;
            } else if (var0 == 3311) {
               var4 = class150.field1580[--class188.field1989];
               class150.field1580[++class188.field1989 - 1] = var4 & 16383;
               return 1;
            } else if (var0 == 3312) {
               class150.field1580[++class188.field1989 - 1] = client.field426 ? 1 : 0;
               return 1;
            } else if (var0 == 3313) {
               class188.field1989 -= 2;
               var4 = class150.field1580[class188.field1989] + '耀';
               var5 = class150.field1580[class188.field1989 + 1];
               class150.field1580[++class188.field1989 - 1] = class304.method1435(var4, var5);
               return 1;
            } else if (var0 == 3314) {
               class188.field1989 -= 2;
               var4 = '耀' + class150.field1580[class188.field1989];
               var5 = class150.field1580[1 + class188.field1989];
               class150.field1580[++class188.field1989 - 1] = class280.method1347(var4, var5);
               return 1;
            } else if (var0 == 3315) {
               class188.field1989 -= 2;
               var4 = class150.field1580[class188.field1989] + '耀';
               var5 = class150.field1580[1 + class188.field1989];
               class150.field1580[++class188.field1989 - 1] = class38.method213(var4, var5);
               return 1;
            } else if (var0 == 3316) {
               if (client.field685 >= 2) {
                  class150.field1580[++class188.field1989 - 1] = client.field685;
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3317) {
               class150.field1580[++class188.field1989 - 1] = client.field441;
               return 1;
            } else if (var0 == 3318) {
               class150.field1580[++class188.field1989 - 1] = client.field599;
               return 1;
            } else if (var0 == 3321) {
               class150.field1580[++class188.field1989 - 1] = client.field546 / 100;
               return 1;
            } else if (var0 == 3322) {
               class150.field1580[++class188.field1989 - 1] = client.field605;
               return 1;
            } else if (var0 == 3323) {
               if (client.field645) {
                  class150.field1580[++class188.field1989 - 1] = 1;
               } else {
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else if (var0 == 3324) {
               class150.field1580[++class188.field1989 - 1] = client.field512;
               return 1;
            } else if (var0 == 3325) {
               class188.field1989 -= 4;
               var4 = class150.field1580[class188.field1989];
               var5 = class150.field1580[1 + class188.field1989];
               var6 = class150.field1580[2 + class188.field1989];
               int var7 = class150.field1580[3 + class188.field1989];
               var4 += var5 << 14;
               var4 += var6 << 28;
               var4 += var7;
               class150.field1580[++class188.field1989 - 1] = var4;
               return 1;
            } else if (var0 == 3326) {
               class150.field1580[++class188.field1989 - 1] = client.field437;
               return 1;
            } else if (var0 == 3327) {
               class150.field1580[++class188.field1989 - 1] = client.field469;
               return 1;
            } else if (var0 == 3331) {
               class150.field1580[++class188.field1989 - 1] = client.field546;
               return 1;
            } else {
               return 2;
            }
         }
      }
   }

   static void method2267() {
      if (class89.field982.field297 >> 7 == client.field677 && class89.field982.field233 >> 7 == client.field423) {
         client.field677 = 0;
      }

   }
}
