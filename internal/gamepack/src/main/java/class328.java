public class class328 implements class445 {
   public static final class328 field3055 = new class328(1, "GET", true, false);
   public static final class328 field3064 = new class328(0, "POST", true, true);
   static class230 field3066;
   static class319 field3060;
   static String field3062;
   static final class328 field3057 = new class328(3, "PATCH", false, true);
   static final class328 field3058 = new class328(4, "DELETE", false, true);
   static final class328 field3063 = new class328(2, "PUT", false, true);
   boolean field3056;
   boolean field3061;
   int field3065;
   String field3059;

   class328(int var1, String var2, boolean var3, boolean var4) {
      this.field3065 = var1;
      this.field3059 = var2;
      this.field3056 = var3;
      this.field3061 = var4;
   }

   boolean method1583() {
      return this.field3056;
   }

   public String method1584() {
      return this.field3059;
   }

   boolean method1585() {
      return this.field3061;
   }

   public int method2118() {
      return this.field3065;
   }

   public static class180 method1591(int var0) {
      int var2 = class263.field2686[var0];
      if (var2 == 1) {
         return class180.field1934;
      } else if (var2 == 2) {
         return class180.field1932;
      } else {
         return var2 == 3 ? class180.field1931 : null;
      }
   }

   static void method1587(int var0, int var1) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (var0 != class296.field2836[var6]) {
            var3[var5] = class296.field2836[var6];
            var4[var5] = class296.field2837[var6];
            ++var5;
         }
      }

      class296.field2836 = var3;
      class296.field2837 = var4;
      class450.method2129(class296.field2834, 0, class296.field2834.length - 1, class296.field2836, class296.field2837);
   }

   static final void method1588(class210 var0, int var1, int var2, int var3) {
      if (null == var0.field2303) {
         throw new RuntimeException();
      } else {
         var0.field2303[var1] = var2;
         var0.field2298[var1] = var3;
      }
   }

   static final void method1589() {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if (client.field510 == 0) {
         var1 = class89.field982.field297;
         var2 = class89.field982.field233;
         if (class377.field3308 - var1 < -500 || class377.field3308 - var1 > 500 || class18.field140 - var2 < -500 || class18.field140 - var2 > 500) {
            class377.field3308 = var1;
            class18.field140 = var2;
         }

         if (class377.field3308 != var1) {
            class377.field3308 += (var1 - class377.field3308) / 16;
         }

         if (var2 != class18.field140) {
            class18.field140 += (var2 - class18.field140) / 16;
         }

         var3 = class377.field3308 >> 7;
         var4 = class18.field140 >> 7;
         var5 = class192.method991(class377.field3308, class18.field140, class195.field2036);
         var6 = 0;
         int var7;
         if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for(var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
               for(int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                  int var9 = class195.field2036;
                  if (var9 < 3 && 2 == (class74.field866[1][var7][var8] & 2)) {
                     ++var9;
                  }

                  int var10 = var5 - class74.field858[var9][var7][var8];
                  if (var10 > var6) {
                     var6 = var10;
                  }
               }
            }
         }

         var7 = var6 * 192;
         if (var7 > 98048) {
            var7 = 98048;
         }

         if (var7 < 32768) {
            var7 = 32768;
         }

         if (var7 > client.field521) {
            client.field521 += (var7 - client.field521) / 24;
         } else if (var7 < client.field521) {
            client.field521 += (var7 - client.field521) / 80;
         }

         class488.field4009 = class192.method991(class89.field982.field297, class89.field982.field233, class195.field2036) - client.field666;
      } else if (1 == client.field510) {
         if (client.field446 && class89.field982 != null) {
            var1 = class89.field982.field258[0];
            var2 = class89.field982.field306[0];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
               class377.field3308 = class89.field982.field297;
               var3 = class192.method991(class89.field982.field297, class89.field982.field233, class195.field2036) - client.field666;
               if (var3 < class488.field4009) {
                  class488.field4009 = var3;
               }

               class18.field140 = class89.field982.field233;
               client.field446 = false;
            }
         }

         short var11 = -1;
         if (client.field664.method2272(33)) {
            var11 = 0;
         } else if (client.field664.method2272(49)) {
            var11 = 1024;
         }

         if (client.field664.method2272(48)) {
            if (var11 == 0) {
               var11 = 1792;
            } else if (var11 == 1024) {
               var11 = 1280;
            } else {
               var11 = 1536;
            }
         } else if (client.field664.method2272(50)) {
            if (var11 == 0) {
               var11 = 256;
            } else if (var11 == 1024) {
               var11 = 768;
            } else {
               var11 = 512;
            }
         }

         byte var12 = 0;
         if (client.field664.method2272(35)) {
            var12 = -1;
         } else if (client.field664.method2272(51)) {
            var12 = 1;
         }

         var3 = 0;
         if (var11 >= 0 || var12 != 0) {
            var3 = client.field664.method2272(81) ? client.field516 : client.field577;
            var3 *= 16;
            client.field513 = var11;
            client.field514 = var12;
         }

         if (client.field555 < var3) {
            client.field555 += var3 / 8;
            if (client.field555 > var3) {
               client.field555 = var3;
            }
         } else if (client.field555 > var3) {
            client.field555 = client.field555 * 9 / 10;
         }

         if (client.field555 > 0) {
            var4 = client.field555 / 16;
            if (client.field513 >= 0) {
               var1 = client.field513 - class177.field1929 & 2047;
               var5 = class234.field2526[var1];
               var6 = class234.field2544[var1];
               class377.field3308 += var5 * var4 / 65536;
               class18.field140 += var6 * var4 / 65536;
            }

            if (0 != client.field514) {
               class488.field4009 += client.field514 * var4;
               if (class488.field4009 > 0) {
                  class488.field4009 = 0;
               }
            }
         } else {
            client.field513 = -1;
            client.field514 = -1;
         }

         if (client.field664.method2272(13)) {
            client.field483.method1920(class189.method982(class165.field1742, client.field483.field3459));
            client.field510 = 0;
         }
      }

      if (class182.field1956 == 4 && class211.field2375) {
         var1 = class182.field1952 - client.field509;
         client.field580 = var1 * 2;
         client.field509 = var1 != -1 && var1 != 1 ? (client.field509 + class182.field1952) / 2 : class182.field1952;
         var2 = client.field508 - class182.field1957;
         client.field506 = var2 * 2;
         client.field508 = var2 != -1 && var2 != 1 ? (class182.field1957 + client.field508) / 2 : class182.field1957;
      } else {
         if (client.field664.method2272(96)) {
            client.field506 += (-24 - client.field506) / 2;
         } else if (client.field664.method2272(97)) {
            client.field506 += (24 - client.field506) / 2;
         } else {
            client.field506 /= 2;
         }

         if (client.field664.method2272(98)) {
            client.field580 += (12 - client.field580) / 2;
         } else if (client.field664.method2272(99)) {
            client.field580 += (-12 - client.field580) / 2;
         } else {
            client.field580 /= 2;
         }

         client.field509 = class182.field1952;
         client.field508 = class182.field1957;
      }

      client.field505 = client.field505 + client.field506 / 2 & 2047;
      client.field504 += client.field580 / 2;
      if (client.field504 < 128) {
         client.field504 = 128;
      }

      if (client.field504 > 383) {
         client.field504 = 383;
      }

   }

   static final void method1590(class240 var0, boolean var1, byte var2) {
      int var3 = var0.field2580;
      int var4 = (int)var0.field1361;
      var0.method567();
      if (var1) {
         if (var2 <= -1) {
            throw new IllegalStateException();
         }

         class399.method1953(var3);
      }

      class212.method1109(var3);
      class210 var5 = class274.method1301(var4);
      if (null != var5) {
         if (var2 <= -1) {
            return;
         }

         class214.method1117(var5);
      }

      if (-1 != client.field597) {
         if (var2 <= -1) {
            throw new IllegalStateException();
         }

         class100.method552(client.field597, 1);
      }

   }
}
