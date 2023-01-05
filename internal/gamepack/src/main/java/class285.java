import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class class285 {
   ExecutorService field2782 = Executors.newSingleThreadExecutor();
   Future field2783;
   final class134 field2784;
   final class347 field2785;

   public class285(class134 var1, class347 var2) {
      this.field2784 = var1;
      this.field2785 = var2;
      this.method1359();
   }

   public boolean method1362() {
      return this.field2783.isDone();
   }

   public void method1358() {
      this.field2782.shutdown();
      this.field2782 = null;
   }

   public class134 method1361() {
      try {
         return (class134)this.field2783.get();
      } catch (Exception var3) {
         return null;
      }
   }

   void method1359() {
      this.field2783 = this.field2782.submit(new class123(this, this.field2784, this.field2785));
   }

   static int method1360(int var0, class472 var1, boolean var2) {
      class210 var4 = class274.method1301(class150.field1580[--class188.field1989]);
      if (var0 == 2600) {
         class150.field1580[++class188.field1989 - 1] = var4.field2242;
         return 1;
      } else if (var0 == 2601) {
         class150.field1580[++class188.field1989 - 1] = var4.field2236;
         return 1;
      } else if (var0 == 2602) {
         class150.field1581[++class150.field1582 - 1] = var4.field2276;
         return 1;
      } else if (var0 == 2603) {
         class150.field1580[++class188.field1989 - 1] = var4.field2237;
         return 1;
      } else if (var0 == 2604) {
         class150.field1580[++class188.field1989 - 1] = var4.field2238;
         return 1;
      } else if (var0 == 2605) {
         class150.field1580[++class188.field1989 - 1] = var4.field2204;
         return 1;
      } else if (var0 == 2606) {
         class150.field1580[++class188.field1989 - 1] = var4.field2282;
         return 1;
      } else if (var0 == 2607) {
         class150.field1580[++class188.field1989 - 1] = var4.field2268;
         return 1;
      } else if (var0 == 2608) {
         class150.field1580[++class188.field1989 - 1] = var4.field2269;
         return 1;
      } else if (var0 == 2609) {
         class150.field1580[++class188.field1989 - 1] = var4.field2346;
         return 1;
      } else if (var0 == 2610) {
         class150.field1580[++class188.field1989 - 1] = var4.field2246;
         return 1;
      } else if (var0 == 2611) {
         class150.field1580[++class188.field1989 - 1] = var4.field2239;
         return 1;
      } else if (var0 == 2612) {
         class150.field1580[++class188.field1989 - 1] = var4.field2357;
         return 1;
      } else if (var0 == 2613) {
         class150.field1580[++class188.field1989 - 1] = var4.field2261.method2118();
         return 1;
      } else if (var0 == 2614) {
         class150.field1580[++class188.field1989 - 1] = var4.field2273 ? 1 : 0;
         return 1;
      } else {
         class138 var5;
         if (var0 == 2617) {
            var5 = var4.method1100();
            class150.field1580[++class188.field1989 - 1] = null != var5 ? var5.field1499 : 0;
         }

         if (var0 == 2618) {
            var5 = var4.method1100();
            class150.field1580[++class188.field1989 - 1] = var5 != null ? var5.field1501 : 0;
            return 1;
         } else {
            class459 var8;
            if (var0 == 2619) {
               var8 = var4.method1076();
               class150.field1581[++class150.field1582 - 1] = var8 != null ? var8.method2198().method1040() : "";
               return 1;
            } else if (var0 == 2620) {
               var5 = var4.method1100();
               class150.field1580[++class188.field1989 - 1] = var5 != null ? var5.field1500 : 0;
               return 1;
            } else if (var0 == 2621) {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2233() : 0;
               return 1;
            } else if (var0 == 2622) {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2234() : 0;
               return 1;
            } else if (var0 == 2623) {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2259() : 0;
               return 1;
            } else if (var0 == 2624) {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = null != var8 && var8.method2245() ? 1 : 0;
               return 1;
            } else if (var0 != 2625) {
               if (var0 == 2626) {
                  var8 = var4.method1076();
                  class150.field1581[++class150.field1582 - 1] = null != var8 ? var8.method2227().method2037() : "";
                  return 1;
               } else if (var0 == 2627) {
                  var8 = var4.method1076();
                  int var6 = null != var8 ? var8.method2214() : 0;
                  int var7 = null != var8 ? var8.method2229() : 0;
                  class150.field1580[++class188.field1989 - 1] = Math.min(var6, var7);
                  class150.field1580[++class188.field1989 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 2628) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2229() : 0;
                  return 1;
               } else if (var0 == 2629) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = null != var8 ? var8.method2255() : 0;
                  return 1;
               } else if (var0 == 2630) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = null != var8 ? var8.method2236() : 0;
                  return 1;
               } else if (var0 == 2631) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2237() : 0;
                  return 1;
               } else if (var0 == 2632) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2249() : 0;
                  return 1;
               } else {
                  class402 var9;
                  if (var0 == 2633) {
                     var9 = var4.method1089();
                     class150.field1580[class188.field1989 - 1] = null != var9 ? var9.method1962(class150.field1580[class188.field1989 - 1]) : 0;
                     return 1;
                  } else if (var0 == 2634) {
                     var9 = var4.method1089();
                     class150.field1580[class188.field1989 - 1] = null != var9 ? var9.method1964((char)class150.field1580[class188.field1989 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = null != var8 && var8.method2184() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static final void method1356(int var0) {
      var0 = Math.min(Math.max(var0, 0), 127);
      class111.field1385.method1342(var0);
   }

   static final class240 method1357(int var0, int var1, int var2) {
      class240 var4 = new class240();
      var4.field2580 = var1;
      var4.field2578 = var2;
      client.field598.method542(var4, (long)var0);
      class214.method1116(var1);
      class210 var5 = class274.method1301(var0);
      class214.method1117(var5);
      if (null != client.field603) {
         class214.method1117(client.field603);
         client.field603 = null;
      }

      class357.method1708(class71.field853[var0 >> 16], var5, false);
      class373.method1786(var1);
      if (client.field597 != -1) {
         class100.method552(client.field597, 1);
      }

      return var4;
   }

   static final void method1363() {
      class81 var1 = class189.method982(class165.field1814, client.field483.field3459);
      var1.field933.method666(0);
      client.field483.method1920(var1);
   }
}
