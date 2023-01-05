public class class374 implements class78 {
   public static final class374 field3168 = new class374(1, "GET", true, false);
   public static final class374 field3177 = new class374(0, "POST", true, true);
   static class266 field3173;
   static class38 field3179;
   static String field3175;
   static final class374 field3170 = new class374(3, "PATCH", false, true);
   static final class374 field3171 = new class374(4, "DELETE", false, true);
   static final class374 field3176 = new class374(2, "PUT", false, true);
   boolean field3169;
   boolean field3174;
   int field3178;
   String field3172;

   class374(int var1, String var2, boolean var3, boolean var4) {
      this.field3178 = var1;
      this.field3172 = var2;
      this.field3169 = var3;
      this.field3174 = var4;
   }

   boolean method1842() {
      return this.field3169;
   }

   public String method1843() {
      return this.field3172;
   }

   boolean method1844() {
      return this.field3174;
   }

   public int method330() {
      return this.field3178;
   }

   public static class185 method1849(int var0) {
      int var2 = class147.field1163[var0];
      if (var2 == 1) {
         return class185.field1690;
      } else if (var2 == 2) {
         return class185.field1688;
      } else {
         return var2 == 3 ? class185.field1687 : null;
      }
   }

   static void method1845(int var0, int var1) {
      int[] var3 = new int[4];
      int[] var4 = new int[4];
      var3[0] = var0;
      var4[0] = var1;
      int var5 = 1;

      for(int var6 = 0; var6 < 4; ++var6) {
         if (var0 != class2.field14[var6]) {
            var3[var5] = class2.field14[var6];
            var4[var5] = class2.field15[var6];
            ++var5;
         }
      }

      class2.field14 = var3;
      class2.field15 = var4;
      class14.method72(class2.field12, 0, class2.field12.length - 1, class2.field14, class2.field15);
   }

   static final void method1846(class120 var0, int var1, int var2, int var3) {
      if (null == var0.field981) {
         throw new RuntimeException();
      } else {
         var0.field981[var1] = var2;
         var0.field976[var1] = var3;
      }
   }

   static final void method1847() {
      int var1;
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      if (client.field306 == 0) {
         var1 = class113.field846.field2672;
         var2 = class113.field846.field2608;
         if (class74.field658 - var1 < -500 || class74.field658 - var1 > 500 || class19.field96 - var2 < -500 || class19.field96 - var2 > 500) {
            class74.field658 = var1;
            class19.field96 = var2;
         }

         if (class74.field658 != var1) {
            class74.field658 += (var1 - class74.field658) / 16;
         }

         if (var2 != class19.field96) {
            class19.field96 += (var2 - class19.field96) / 16;
         }

         var3 = class74.field658 >> 7;
         var4 = class19.field96 >> 7;
         var5 = class327.method1666(class74.field658, class19.field96, class347.field2878);
         var6 = 0;
         int var7;
         if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for(var7 = var3 - 4; var7 <= var3 + 4; ++var7) {
               for(int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                  int var9 = class347.field2878;
                  if (var9 < 3 && 2 == (class71.field644[1][var7][var8] & 2)) {
                     ++var9;
                  }

                  int var10 = var5 - class71.field636[var9][var7][var8];
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

         if (var7 > client.field317) {
            client.field317 += (var7 - client.field317) / 24;
         } else if (var7 < client.field317) {
            client.field317 += (var7 - client.field317) / 80;
         }

         class197.field1740 = class327.method1666(class113.field846.field2672, class113.field846.field2608, class347.field2878) - client.field462;
      } else if (1 == client.field306) {
         if (client.field242 && class113.field846 != null) {
            var1 = class113.field846.field2633[0];
            var2 = class113.field846.field2681[0];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
               class74.field658 = class113.field846.field2672;
               var3 = class327.method1666(class113.field846.field2672, class113.field846.field2608, class347.field2878) - client.field462;
               if (var3 < class197.field1740) {
                  class197.field1740 = var3;
               }

               class19.field96 = class113.field846.field2608;
               client.field242 = false;
            }
         }

         short var11 = -1;
         if (client.field460.method2132(33)) {
            var11 = 0;
         } else if (client.field460.method2132(49)) {
            var11 = 1024;
         }

         if (client.field460.method2132(48)) {
            if (var11 == 0) {
               var11 = 1792;
            } else if (var11 == 1024) {
               var11 = 1280;
            } else {
               var11 = 1536;
            }
         } else if (client.field460.method2132(50)) {
            if (var11 == 0) {
               var11 = 256;
            } else if (var11 == 1024) {
               var11 = 768;
            } else {
               var11 = 512;
            }
         }

         byte var12 = 0;
         if (client.field460.method2132(35)) {
            var12 = -1;
         } else if (client.field460.method2132(51)) {
            var12 = 1;
         }

         var3 = 0;
         if (var11 >= 0 || var12 != 0) {
            var3 = client.field460.method2132(81) ? client.field312 : client.field373;
            var3 *= 16;
            client.field309 = var11;
            client.field310 = var12;
         }

         if (client.field351 < var3) {
            client.field351 += var3 / 8;
            if (client.field351 > var3) {
               client.field351 = var3;
            }
         } else if (client.field351 > var3) {
            client.field351 = client.field351 * 9 / 10;
         }

         if (client.field351 > 0) {
            var4 = client.field351 / 16;
            if (client.field309 >= 0) {
               var1 = client.field309 - class22.field105 & 2047;
               var5 = class341.field2726[var1];
               var6 = class341.field2744[var1];
               class74.field658 += var5 * var4 / 65536;
               class19.field96 += var6 * var4 / 65536;
            }

            if (0 != client.field310) {
               class197.field1740 += client.field310 * var4;
               if (class197.field1740 > 0) {
                  class197.field1740 = 0;
               }
            }
         } else {
            client.field309 = -1;
            client.field310 = -1;
         }

         if (client.field460.method2132(13)) {
            client.field279.method2389(class480.method2370(class356.field2956, client.field279.field4042));
            client.field306 = 0;
         }
      }

      if (class466.field3862 == 4 && class151.field1180) {
         var1 = class466.field3858 - client.field305;
         client.field376 = var1 * 2;
         client.field305 = var1 != -1 && var1 != 1 ? (client.field305 + class466.field3858) / 2 : class466.field3858;
         var2 = client.field304 - class466.field3863;
         client.field302 = var2 * 2;
         client.field304 = var2 != -1 && var2 != 1 ? (class466.field3863 + client.field304) / 2 : class466.field3863;
      } else {
         if (client.field460.method2132(96)) {
            client.field302 += (-24 - client.field302) / 2;
         } else if (client.field460.method2132(97)) {
            client.field302 += (24 - client.field302) / 2;
         } else {
            client.field302 /= 2;
         }

         if (client.field460.method2132(98)) {
            client.field376 += (12 - client.field376) / 2;
         } else if (client.field460.method2132(99)) {
            client.field376 += (-12 - client.field376) / 2;
         } else {
            client.field376 /= 2;
         }

         client.field305 = class466.field3858;
         client.field304 = class466.field3863;
      }

      client.field301 = client.field301 + client.field302 / 2 & 2047;
      client.field300 += client.field376 / 2;
      if (client.field300 < 128) {
         client.field300 = 128;
      }

      if (client.field300 > 383) {
         client.field300 = 383;
      }

   }

   static final void method1848(class415 var0, boolean var1, byte var2) {
      int var3 = var0.field3426;
      int var4 = (int)var0.field1134;
      var0.method637();
      if (var1) {
         if (var2 <= -1) {
            throw new IllegalStateException();
         }

         class473.method2346(var3);
      }

      class85.method355(var3);
      class120 var5 = class67.method299(var4);
      if (null != var5) {
         if (var2 <= -1) {
            return;
         }

         class184.method836(var5);
      }

      if (-1 != client.field393) {
         if (var2 <= -1) {
            throw new IllegalStateException();
         }

         class452.method2240(client.field393, 1);
      }

   }
}
