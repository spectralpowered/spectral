public class class35 extends class400 {
   void method145(class127 var1) {
      int var3 = var1.method547();
      if (var3 != class167.field1259.field1260) {
         throw new IllegalStateException("");
      } else {
         super.field3372 = var1.method547();
         super.field3365 = var1.method547();
         super.field3364 = var1.method549();
         super.field3361 = var1.method549();
         super.field3362 = var1.method549();
         super.field3368 = var1.method549();
         super.field3360 = var1.method560();
         super.field3367 = var1.method560();
      }
   }

   void method1978(class127 var1) {
      super.field3365 = Math.min(super.field3365, 4);
      super.field3369 = new short[1][64][64];
      super.field3363 = new short[super.field3365][64][64];
      super.field3370 = new byte[super.field3365][64][64];
      super.field3371 = new byte[super.field3365][64][64];
      super.field3366 = new class387[super.field3365][64][64][];
      int var3 = var1.method547();
      if (class230.field1940.field1942 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.method547();
         int var5 = var1.method547();
         if (super.field3362 == var4 && super.field3368 == var5) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.method1975(var6, var7, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class35)) {
         return false;
      } else {
         class35 var2 = (class35)var1;
         return super.field3362 == var2.field3362 && var2.field3368 == super.field3368;
      }
   }

   public int hashCode() {
      return super.field3362 | super.field3368 << 8;
   }

   static final void method147(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      class299 var10;
      if (var2 == 3) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field3000, client.field279.field4042);
         var10.field2403.method544(client.field460.method2132(82) ? 1 : 0);
         var10.field2403.method573(var0 + class312.field2465);
         var10.field2403.method572(var1 + class325.field2575);
         var10.field2403.method533(var3);
         client.field279.method2389(var10);
      }

      if (var2 == 43) {
         var10 = class480.method2370(class356.field2994, client.field279.field4042);
         var10.field2403.method533(var4);
         var10.field2403.method572(var0);
         var10.field2403.method579(var1);
         client.field279.method2389(var10);
         client.field337 = 0;
         class101.field800 = class67.method299(var1);
         client.field338 = var0;
      }

      if (var2 == 34) {
         var10 = class480.method2370(class356.field2984, client.field279.field4042);
         var10.field2403.method573(var4);
         var10.field2403.method579(var1);
         var10.field2403.method584(var0);
         client.field279.method2389(var10);
         client.field337 = 0;
         class101.field800 = class67.method299(var1);
         client.field338 = var0;
      }

      class299 var11;
      class380 var13;
      if (var2 == 47) {
         var13 = client.field347[var3];
         if (var13 != null) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field2930, client.field279.field4042);
            var11.field2403.method533(var3);
            var11.field2403.method568(client.field460.method2132(82) ? 1 : 0);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 17) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2947, client.field279.field4042);
         var10.field2403.method533(class325.field2575 + var1);
         var10.field2403.method533(client.field389);
         var10.field2403.method581(class471.field3960);
         var10.field2403.method573(class312.field2465 + var0);
         var10.field2403.method533(var3);
         var10.field2403.method566(client.field460.method2132(82) ? 1 : 0);
         var10.field2403.method533(client.field390);
         client.field279.method2389(var10);
      }

      if (var2 == 31) {
         var10 = class480.method2370(class356.field3014, client.field279.field4042);
         var10.field2403.method581(var1);
         var10.field2403.method579(class10.field52);
         var10.field2403.method533(var4);
         var10.field2403.method584(class249.field2059);
         var10.field2403.method584(var0);
         var10.field2403.method533(class121.field1046);
         client.field279.method2389(var10);
         client.field337 = 0;
         class101.field800 = class67.method299(var1);
         client.field338 = var0;
      }

      class267 var15;
      if (var2 == 7) {
         var15 = client.field465[var3];
         if (var15 != null) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field2965, client.field279.field4042);
            var11.field2403.method580(class10.field52);
            var11.field2403.method568(client.field460.method2132(82) ? 1 : 0);
            var11.field2403.method573(var3);
            var11.field2403.method572(class249.field2059);
            var11.field2403.method572(class121.field1046);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 21) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2995, client.field279.field4042);
         var10.field2403.method572(var0 + class312.field2465);
         var10.field2403.method568(client.field460.method2132(82) ? 1 : 0);
         var10.field2403.method533(class325.field2575 + var1);
         var10.field2403.method533(var3);
         client.field279.method2389(var10);
      }

      class120 var16;
      if (var2 == 58) {
         var16 = class483.method2375(var1, var0);
         if (null != var16) {
            if (null != var16.field1003) {
               class488 var14 = new class488();
               var14.field4067 = var16;
               var14.field4070 = var3;
               var14.field4073 = var6;
               var14.field4069 = var16.field1003;
               class396.method1949(var14);
            }

            var11 = class480.method2370(class356.field3036, client.field279.field4042);
            var11.field2403.method584(client.field390);
            var11.field2403.method534(var1);
            var11.field2403.method581(class471.field3960);
            var11.field2403.method573(client.field389);
            var11.field2403.method584(var0);
            var11.field2403.method573(var4);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 51) {
         var13 = client.field347[var3];
         if (null != var13) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field3021, client.field279.field4042);
            var11.field2403.method573(var3);
            var11.field2403.method566(client.field460.method2132(82) ? 1 : 0);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 1) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2952, client.field279.field4042);
         var10.field2403.method584(var3);
         var10.field2403.method584(class325.field2575 + var1);
         var10.field2403.method584(class249.field2059);
         var10.field2403.method572(class121.field1046);
         var10.field2403.method579(class10.field52);
         var10.field2403.method572(var0 + class312.field2465);
         var10.field2403.method544(client.field460.method2132(82) ? 1 : 0);
         client.field279.method2389(var10);
      }

      int var12;
      class120 var17;
      if (var2 == 28) {
         var10 = class480.method2370(class356.field3016, client.field279.field4042);
         var10.field2403.method534(var1);
         client.field279.method2389(var10);
         var17 = class67.method299(var1);
         if (null != var17 && var17.field885 != null && var17.field885[0][0] == 5) {
            var12 = var17.field885[0][1];
            class291.field2373[var12] = 1 - class291.field2373[var12];
            class238.method1033(var12);
         }
      }

      if (var2 == 29) {
         var10 = class480.method2370(class356.field3016, client.field279.field4042);
         var10.field2403.method534(var1);
         client.field279.method2389(var10);
         var17 = class67.method299(var1);
         if (null != var17 && null != var17.field885 && 5 == var17.field885[0][0]) {
            var12 = var17.field885[0][1];
            if (class291.field2373[var12] != var17.field1022[0]) {
               class291.field2373[var12] = var17.field1022[0];
               class238.method1033(var12);
            }
         }
      }

      if (var2 == 49) {
         var13 = client.field347[var3];
         if (var13 != null) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field2949, client.field279.field4042);
            var11.field2403.method568(client.field460.method2132(82) ? 1 : 0);
            var11.field2403.method533(var3);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 26) {
         class212.method918();
      }

      if (var2 == 14) {
         var13 = client.field347[var3];
         if (var13 != null) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field2969, client.field279.field4042);
            var11.field2403.method568(client.field460.method2132(82) ? 1 : 0);
            var11.field2403.method581(class10.field52);
            var11.field2403.method573(class249.field2059);
            var11.field2403.method573(class121.field1046);
            var11.field2403.method572(var3);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
         class164.field1249.method1332(var2, var3, new class464(var0), new class464(var1));
      }

      if (var2 == 46) {
         var13 = client.field347[var3];
         if (null != var13) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field2977, client.field279.field4042);
            var11.field2403.method544(client.field460.method2132(82) ? 1 : 0);
            var11.field2403.method573(var3);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 39) {
         var10 = class480.method2370(class356.field2942, client.field279.field4042);
         var10.field2403.method534(var1);
         var10.field2403.method572(var4);
         var10.field2403.method573(var0);
         client.field279.method2389(var10);
         client.field337 = 0;
         class101.field800 = class67.method299(var1);
         client.field338 = var0;
      }

      if (var2 == 37) {
         var10 = class480.method2370(class356.field2987, client.field279.field4042);
         var10.field2403.method581(var1);
         var10.field2403.method533(var4);
         var10.field2403.method572(var0);
         client.field279.method2389(var10);
         client.field337 = 0;
         class101.field800 = class67.method299(var1);
         client.field338 = var0;
      }

      if (var2 == 41) {
         var10 = class480.method2370(class356.field2999, client.field279.field4042);
         var10.field2403.method580(var1);
         var10.field2403.method573(var0);
         var10.field2403.method572(var4);
         client.field279.method2389(var10);
         client.field337 = 0;
         class101.field800 = class67.method299(var1);
         client.field338 = var0;
      }

      if (var2 == 16) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2944, client.field279.field4042);
         var10.field2403.method533(var3);
         var10.field2403.method572(class325.field2575 + var1);
         var10.field2403.method567(client.field460.method2132(82) ? 1 : 0);
         var10.field2403.method573(class249.field2059);
         var10.field2403.method534(class10.field52);
         var10.field2403.method573(class121.field1046);
         var10.field2403.method572(var0 + class312.field2465);
         client.field279.method2389(var10);
      }

      if (var2 == 18) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2993, client.field279.field4042);
         var10.field2403.method584(var1 + class325.field2575);
         var10.field2403.method544(client.field460.method2132(82) ? 1 : 0);
         var10.field2403.method573(var3);
         var10.field2403.method584(var0 + class312.field2465);
         client.field279.method2389(var10);
      }

      if (var2 == 48) {
         var13 = client.field347[var3];
         if (var13 != null) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field2971, client.field279.field4042);
            var11.field2403.method584(var3);
            var11.field2403.method568(client.field460.method2132(82) ? 1 : 0);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 1001) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field3002, client.field279.field4042);
         var10.field2403.method573(class325.field2575 + var1);
         var10.field2403.method533(class312.field2465 + var0);
         var10.field2403.method572(var3);
         var10.field2403.method566(client.field460.method2132(82) ? 1 : 0);
         client.field279.method2389(var10);
      }

      if (var2 == 9) {
         var15 = client.field465[var3];
         if (var15 != null) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field3020, client.field279.field4042);
            var11.field2403.method584(var3);
            var11.field2403.method566(client.field460.method2132(82) ? 1 : 0);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 4) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2983, client.field279.field4042);
         var10.field2403.method566(client.field460.method2132(82) ? 1 : 0);
         var10.field2403.method584(var3);
         var10.field2403.method573(class325.field2575 + var1);
         var10.field2403.method584(class312.field2465 + var0);
         client.field279.method2389(var10);
      }

      if (var2 == 5) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2963, client.field279.field4042);
         var10.field2403.method566(client.field460.method2132(82) ? 1 : 0);
         var10.field2403.method573(class325.field2575 + var1);
         var10.field2403.method572(var0 + class312.field2465);
         var10.field2403.method572(var3);
         client.field279.method2389(var10);
      }

      if (var2 == 15) {
         var13 = client.field347[var3];
         if (var13 != null) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field2979, client.field279.field4042);
            var11.field2403.method533(var3);
            var11.field2403.method566(client.field460.method2132(82) ? 1 : 0);
            var11.field2403.method584(client.field389);
            var11.field2403.method534(class471.field3960);
            var11.field2403.method573(client.field390);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 35) {
         var10 = class480.method2370(class356.field2976, client.field279.field4042);
         var10.field2403.method534(var1);
         var10.field2403.method572(var4);
         var10.field2403.method572(var0);
         client.field279.method2389(var10);
         client.field337 = 0;
         class101.field800 = class67.method299(var1);
         client.field338 = var0;
      }

      if (var2 == 6) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2954, client.field279.field4042);
         var10.field2403.method533(var3);
         var10.field2403.method567(client.field460.method2132(82) ? 1 : 0);
         var10.field2403.method573(class325.field2575 + var1);
         var10.field2403.method584(class312.field2465 + var0);
         client.field279.method2389(var10);
      }

      if (var2 == 44) {
         var13 = client.field347[var3];
         if (null != var13) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var11 = class480.method2370(class356.field2974, client.field279.field4042);
            var11.field2403.method544(client.field460.method2132(82) ? 1 : 0);
            var11.field2403.method533(var3);
            client.field279.method2389(var11);
         }
      }

      if (var2 == 30 && client.field399 == null) {
         class439.method2178(var1, var0);
         client.field399 = class483.method2375(var1, var0);
         class184.method836(client.field399);
      }

      if (var2 == 20) {
         client.field294 = var7;
         client.field227 = var8;
         client.field335 = 2;
         client.field313 = 0;
         client.field473 = var0;
         client.field219 = var1;
         var10 = class480.method2370(class356.field2945, client.field279.field4042);
         var10.field2403.method572(class312.field2465 + var0);
         var10.field2403.method584(var3);
         var10.field2403.method584(class325.field2575 + var1);
         var10.field2403.method566(client.field460.method2132(82) ? 1 : 0);
         client.field279.method2389(var10);
      }

      if (var2 == 23) {
         if (client.field368) {
            class408.field3415.method1606();
         } else {
            class408.field3415.method1599(class347.field2878, var0, var1, true);
         }
      }

      if (var2 == 57 || var2 == 1007) {
         var16 = class483.method2375(var1, var0);
         if (null != var16) {
            class119.method473(var3, var1, var0, var4, var6);
         }
      }

      if (var2 == 38) {
         class120.method512();
         var16 = class67.method299(var1);
         client.field386 = 1;
         class249.field2059 = var0;
         class10.field52 = var1;
         class121.field1046 = var4;
         class184.method836(var16);
         client.field483 = class238.method1032(16748608) + class423.method2062(var4).field2147 + class238.method1032(16777215);
         if (null == client.field483) {
            client.field483 = class177.field1325;
         }

      } else {
         if (var2 == 10) {
            var15 = client.field465[var3];
            if (null != var15) {
               client.field294 = var7;
               client.field227 = var8;
               client.field335 = 2;
               client.field313 = 0;
               client.field473 = var0;
               client.field219 = var1;
               var11 = class480.method2370(class356.field2951, client.field279.field4042);
               var11.field2403.method573(var3);
               var11.field2403.method544(client.field460.method2132(82) ? 1 : 0);
               client.field279.method2389(var11);
            }
         }

         if (var2 == 33) {
            var10 = class480.method2370(class356.field2978, client.field279.field4042);
            var10.field2403.method584(var0);
            var10.field2403.method581(var1);
            var10.field2403.method572(var4);
            client.field279.method2389(var10);
            client.field337 = 0;
            class101.field800 = class67.method299(var1);
            client.field338 = var0;
         }

         if (var2 == 1005) {
            var16 = class67.method299(var1);
            if (var16 != null && var16.field931[var0] >= 100000) {
               class164.method765(27, "", var16.field931[var0] + " x " + class423.method2062(var4).field2147);
            } else {
               var11 = class480.method2370(class356.field3010, client.field279.field4042);
               var11.field2403.method573(var4);
               client.field279.method2389(var11);
            }

            client.field337 = 0;
            class101.field800 = class67.method299(var1);
            client.field338 = var0;
         }

         if (var2 == 36) {
            var10 = class480.method2370(class356.field3005, client.field279.field4042);
            var10.field2403.method581(var1);
            var10.field2403.method533(var0);
            var10.field2403.method573(var4);
            client.field279.method2389(var10);
            client.field337 = 0;
            class101.field800 = class67.method299(var1);
            client.field338 = var0;
         }

         if (var2 == 32) {
            var10 = class480.method2370(class356.field2932, client.field279.field4042);
            var10.field2403.method584(client.field389);
            var10.field2403.method573(var4);
            var10.field2403.method580(class471.field3960);
            var10.field2403.method573(var0);
            var10.field2403.method579(var1);
            client.field279.method2389(var10);
            client.field337 = 0;
            class101.field800 = class67.method299(var1);
            client.field338 = var0;
         }

         if (var2 == 19) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var10 = class480.method2370(class356.field2989, client.field279.field4042);
            var10.field2403.method584(var3);
            var10.field2403.method566(client.field460.method2132(82) ? 1 : 0);
            var10.field2403.method533(var1 + class325.field2575);
            var10.field2403.method572(class312.field2465 + var0);
            client.field279.method2389(var10);
         }

         class299 var18;
         if (var2 == 24) {
            var16 = class67.method299(var1);
            if (null != var16) {
               boolean var19 = true;
               if (var16.field993 > 0) {
                  var19 = class267.method1274(var16);
               }

               if (var19) {
                  var18 = class480.method2370(class356.field3016, client.field279.field4042);
                  var18.field2403.method534(var1);
                  client.field279.method2389(var18);
               }
            }
         }

         if (var2 == 12) {
            var15 = client.field465[var3];
            if (var15 != null) {
               client.field294 = var7;
               client.field227 = var8;
               client.field335 = 2;
               client.field313 = 0;
               client.field473 = var0;
               client.field219 = var1;
               var11 = class480.method2370(class356.field2985, client.field279.field4042);
               var11.field2403.method567(client.field460.method2132(82) ? 1 : 0);
               var11.field2403.method533(var3);
               client.field279.method2389(var11);
            }
         }

         if (var2 == 1004) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            var10 = class480.method2370(class356.field3015, client.field279.field4042);
            var10.field2403.method572(var0 + class312.field2465);
            var10.field2403.method533(class325.field2575 + var1);
            var10.field2403.method573(var3);
            client.field279.method2389(var10);
         }

         if (var2 == 13) {
            var15 = client.field465[var3];
            if (var15 != null) {
               client.field294 = var7;
               client.field227 = var8;
               client.field335 = 2;
               client.field313 = 0;
               client.field473 = var0;
               client.field219 = var1;
               var11 = class480.method2370(class356.field2950, client.field279.field4042);
               var11.field2403.method573(var3);
               var11.field2403.method567(client.field460.method2132(82) ? 1 : 0);
               client.field279.method2389(var11);
            }
         }

         if (var2 == 22) {
            client.field294 = var7;
            client.field227 = var8;
            client.field335 = 2;
            client.field313 = 0;
            client.field473 = var0;
            client.field219 = var1;
            var10 = class480.method2370(class356.field3006, client.field279.field4042);
            var10.field2403.method573(class325.field2575 + var1);
            var10.field2403.method584(var3);
            var10.field2403.method566(client.field460.method2132(82) ? 1 : 0);
            var10.field2403.method584(class312.field2465 + var0);
            client.field279.method2389(var10);
         }

         if (var2 == 8) {
            var15 = client.field465[var3];
            if (var15 != null) {
               client.field294 = var7;
               client.field227 = var8;
               client.field335 = 2;
               client.field313 = 0;
               client.field473 = var0;
               client.field219 = var1;
               var11 = class480.method2370(class356.field2936, client.field279.field4042);
               var11.field2403.method572(client.field389);
               var11.field2403.method573(var3);
               var11.field2403.method581(class471.field3960);
               var11.field2403.method572(client.field390);
               var11.field2403.method568(client.field460.method2132(82) ? 1 : 0);
               client.field279.method2389(var11);
            }
         }

         if (var2 == 45) {
            var13 = client.field347[var3];
            if (var13 != null) {
               client.field294 = var7;
               client.field227 = var8;
               client.field335 = 2;
               client.field313 = 0;
               client.field473 = var0;
               client.field219 = var1;
               var11 = class480.method2370(class356.field3030, client.field279.field4042);
               var11.field2403.method572(var3);
               var11.field2403.method544(client.field460.method2132(82) ? 1 : 0);
               client.field279.method2389(var11);
            }
         }

         if (var2 == 40) {
            var10 = class480.method2370(class356.field3022, client.field279.field4042);
            var10.field2403.method533(var0);
            var10.field2403.method534(var1);
            var10.field2403.method584(var4);
            client.field279.method2389(var10);
            client.field337 = 0;
            class101.field800 = class67.method299(var1);
            client.field338 = var0;
         }

         if (var2 == 25) {
            var16 = class483.method2375(var1, var0);
            if (null != var16) {
               class120.method512();
               class128.method608(var1, var0, class486.method2379(class203.method892(var16)), var4);
               client.field386 = 0;
               client.field391 = class193.method868(var16);
               if (client.field391 == null) {
                  client.field391 = class177.field1325;
               }

               if (var16.field893) {
                  client.field510 = var16.field894 + class238.method1032(16777215);
               } else {
                  client.field510 = class238.method1032(65280) + var16.field1000 + class238.method1032(16777215);
               }
            }

         } else {
            if (var2 == 1002) {
               client.field294 = var7;
               client.field227 = var8;
               client.field335 = 2;
               client.field313 = 0;
               var10 = class480.method2370(class356.field3034, client.field279.field4042);
               var10.field2403.method573(var3);
               client.field279.method2389(var10);
            }

            if (var2 == 1003) {
               client.field294 = var7;
               client.field227 = var8;
               client.field335 = 2;
               client.field313 = 0;
               var15 = client.field465[var3];
               if (var15 != null) {
                  class423 var20 = var15.field2213;
                  if (var20.field3493 != null) {
                     var20 = var20.method2054();
                  }

                  if (null != var20) {
                     var18 = class480.method2370(class356.field2986, client.field279.field4042);
                     var18.field2403.method573(var20.field3461);
                     client.field279.method2389(var18);
                  }
               }
            }

            if (var2 == 2) {
               client.field294 = var7;
               client.field227 = var8;
               client.field335 = 2;
               client.field313 = 0;
               client.field473 = var0;
               client.field219 = var1;
               var10 = class480.method2370(class356.field3035, client.field279.field4042);
               var10.field2403.method573(class312.field2465 + var0);
               var10.field2403.method584(client.field389);
               var10.field2403.method580(class471.field3960);
               var10.field2403.method572(client.field390);
               var10.field2403.method533(var1 + class325.field2575);
               var10.field2403.method567(client.field460.method2132(82) ? 1 : 0);
               var10.field2403.method572(var3);
               client.field279.method2389(var10);
            }

            if (var2 == 11) {
               var15 = client.field465[var3];
               if (var15 != null) {
                  client.field294 = var7;
                  client.field227 = var8;
                  client.field335 = 2;
                  client.field313 = 0;
                  client.field473 = var0;
                  client.field219 = var1;
                  var11 = class480.method2370(class356.field3023, client.field279.field4042);
                  var11.field2403.method572(var3);
                  var11.field2403.method544(client.field460.method2132(82) ? 1 : 0);
                  client.field279.method2389(var11);
               }
            }

            if (var2 == 42) {
               var10 = class480.method2370(class356.field2939, client.field279.field4042);
               var10.field2403.method584(var0);
               var10.field2403.method584(var4);
               var10.field2403.method581(var1);
               client.field279.method2389(var10);
               client.field337 = 0;
               class101.field800 = class67.method299(var1);
               client.field338 = var0;
            }

            if (var2 == 50) {
               var13 = client.field347[var3];
               if (var13 != null) {
                  client.field294 = var7;
                  client.field227 = var8;
                  client.field335 = 2;
                  client.field313 = 0;
                  client.field473 = var0;
                  client.field219 = var1;
                  var11 = class480.method2370(class356.field2988, client.field279.field4042);
                  var11.field2403.method573(var3);
                  var11.field2403.method568(client.field460.method2132(82) ? 1 : 0);
                  client.field279.method2389(var11);
               }
            }

            if (0 != client.field386) {
               client.field386 = 0;
               class184.method836(class67.method299(class10.field52));
            }

            if (client.field388) {
               class120.method512();
            }

            if (null != class101.field800 && 0 == client.field337) {
               class184.method836(class101.field800);
            }

         }
      }
   }

   static void method148() {
      class50.field574.method2216(client.field224);
   }
}
