import java.util.concurrent.Callable;

public class class338 implements Callable {
   static class140 field2702;
   static int field2704;
   final class127 field2705;
   final class269 field2703;
   // $FF: synthetic field
   final class472 this$0;

   class338(class472 var1, class127 var2, class269 var3) {
      this.this$0 = var1;
      this.field2705 = var2;
      this.field2703 = var3;
   }

   public Object call() {
      return this.field2703.method1276(this.field2705);
   }

   static final void method1698(String var0) {
      StringBuilder var10000 = (new StringBuilder()).append(var0);
      class177 var10001 = (class177)null;
      String var2 = var10000.append(class177.field1503).toString();
      class164.method765(30, "", var2);
   }

   static void method1699(int var0, int var1, int var2) {
      if (class50.field574.method2211() != 0 && var1 != 0 && client.field478 < 50) {
         client.field479[client.field478] = var0;
         client.field480[client.field478] = var1;
         client.field508[client.field478] = var2;
         client.field288[client.field478] = null;
         client.field334[client.field478] = 0;
         ++client.field478;
      }

   }

   static final void method1697(class6 var0) {
      for(int var2 = 0; var2 < client.field277; ++var2) {
         int var3 = client.field278[var2];
         class267 var4 = client.field465[var3];
         int var5 = var0.method547();
         int var6;
         if ((var5 & 1) != 0) {
            var6 = var0.method547();
            var5 += var6 << 8;
         }

         if (0 != (var5 & 2048)) {
            var6 = var0.method547();
            var5 += var6 << 16;
         }

         if (0 != (var5 & 131072)) {
            var6 = var0.method603();
            var4.field2618 = 0 != (var6 & 1) ? var0.method575() : 274326889 * var4.field2213.field3467 * 2133129945;
            var4.field2680 = (var6 & 2) != 0 ? var0.method549() : -634834111 * var4.field2213.field3468 * -398107455;
            var4.field2616 = (var6 & 4) != 0 ? var0.method549() : var4.field2213.field3469;
            var4.field2677 = 0 != (var6 & 8) ? var0.method549() : 1430199505 * var4.field2213.field3492 * -501040079;
            var4.field2634 = (var6 & 16) != 0 ? var0.method549() : var4.field2213.field3489;
            var4.field2619 = (var6 & 32) != 0 ? var0.method531() : 1871825673 * var4.field2213.field3472 * 253702969;
            var4.field2610 = 0 != (var6 & 64) ? var0.method574() : -2080788827 * var4.field2213.field3471 * 154044717;
            var4.field2621 = 0 != (var6 & 128) ? var0.method531() : 752796561 * var4.field2213.field3474 * 1788894577;
            var4.field2631 = 0 != (var6 & 256) ? var0.method531() : 1054411661 * var4.field2213.field3475 * 1998925637;
            var4.field2623 = 0 != (var6 & 512) ? var0.method575() : 875795671 * var4.field2213.field3476 * -500654361;
            var4.field2624 = 0 != (var6 & 1024) ? var0.method574() : var4.field2213.field3477;
            var4.field2625 = 0 != (var6 & 2048) ? var0.method531() : 1152150225 * var4.field2213.field3478 * -630313423;
            var4.field2656 = (var6 & 4096) != 0 ? var0.method531() : var4.field2213.field3479;
            var4.field2627 = 0 != (var6 & 8192) ? var0.method574() : var4.field2213.field3480;
            var4.field2613 = 0 != (var6 & 16384) ? var0.method531() : -499537861 * var4.field2213.field3463 * -171249421;
         }

         if (0 != (var5 & 4)) {
            var4.field2213 = class421.method2049(var0.method531(), (byte)69);
            class211.method914(var4);
            var4.method1263();
         }

         if ((var5 & 1024) != 0) {
            var4.field2668 = client.field231 + var0.method575();
            var4.field2630 = client.field231 + var0.method575();
            var4.field2670 = var0.method599();
            var4.field2650 = var0.method548();
            var4.field2662 = var0.method599();
            var4.field2673 = (byte)var0.method569();
         }

         int[] var7;
         int var8;
         int var9;
         int var10;
         int var11;
         short[] var15;
         short[] var16;
         long var17;
         if (0 != (var5 & 512)) {
            var6 = var0.method569();
            if (1 == (var6 & 1)) {
               var4.method1269();
            } else {
               var7 = null;
               if ((var6 & 2) == 2) {
                  var8 = var0.method592();
                  var7 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var0.method531();
                     var10 = var10 == 65535 ? -1 : var10;
                     var7[var9] = var10;
                  }
               }

               var15 = null;
               if ((var6 & 4) == 4) {
                  var9 = 0;
                  if (null != var4.field2213.field3482) {
                     var9 = var4.field2213.field3482.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.method575();
                  }
               }

               var16 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (var4.field2213.field3484 != null) {
                     var10 = var4.field2213.field3484.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var0.method531();
                  }
               }

               var17 = (long)(++class267.field2210 - 1);
               var4.method1266(new class207(var17, var7, var15, var16));
            }
         }

         if ((var5 & 8192) != 0) {
            var4.field2683 = var0.method571();
         }

         int var14;
         if (0 != (var5 & 32)) {
            var6 = var0.method574();
            if (var6 == 65535) {
               var6 = -1;
            }

            var14 = var0.method547();
            if (var6 == var4.field2649 && var6 != -1) {
               var8 = class271.method1277(var6).field2026;
               if (var8 == 1) {
                  var4.field2640 = 0;
                  var4.field2651 = 0;
                  var4.field2652 = var14;
                  var4.field2653 = 0;
               }

               if (var8 == 2) {
                  var4.field2653 = 0;
               }
            } else if (var6 == -1 || -1 == var4.field2649 || class271.method1277(var6).field2049 >= class271.method1277(var4.field2649).field2049) {
               var4.field2649 = var6;
               var4.field2640 = 0;
               var4.field2651 = 0;
               var4.field2652 = var14;
               var4.field2653 = 0;
               var4.field2682 = var4.field2607;
            }
         }

         if ((var5 & 16) != 0) {
            var6 = var0.method594();
            int var12;
            if (var6 > 0) {
               for(var14 = 0; var14 < var6; ++var14) {
                  var9 = -1;
                  var10 = -1;
                  var11 = -1;
                  var8 = var0.method559();
                  if (var8 == 32767) {
                     var8 = var0.method559();
                     var10 = var0.method559();
                     var9 = var0.method559();
                     var11 = var0.method559();
                  } else if (var8 != 32766) {
                     var10 = var0.method559();
                  } else {
                     var8 = -1;
                  }

                  var12 = var0.method559();
                  var4.method1676(var8, var10, var9, var11, client.field231, var12);
               }
            }

            var14 = var0.method547();
            if (var14 > 0) {
               for(var8 = 0; var8 < var14; ++var8) {
                  var9 = var0.method559();
                  var10 = var0.method559();
                  if (var10 != 32767) {
                     var11 = var0.method559();
                     var12 = var0.method594();
                     int var13 = var10 > 0 ? var0.method569() : var12;
                     var4.method1679(var9, client.field231, var10, var11, var12, var13);
                  } else {
                     var4.method1680(var9);
                  }
               }
            }
         }

         if ((var5 & 128) != 0) {
            var4.field2628 = var0.method555();
            var4.field2678 = 100;
         }

         if ((var5 & 4096) != 0) {
            var4.method1256(var0.method547());
         }

         if ((var5 & 256) != 0) {
            var4.method1272(var0.method555());
         }

         if (0 != (var5 & 8)) {
            var6 = var0.method549();
            var14 = var0.method549();
            var4.field2658 = var0.method547() == 1;
            var8 = var4.field2672 - 64 * (var6 - class312.field2465 - class312.field2465);
            var9 = var4.field2608 - 64 * (var14 - class325.field2575 - class325.field2575);
            if (var8 != 0 || var9 != 0) {
               var4.field2620 = (int)(Math.atan2((double)var8, (double)var9) * 325.949D) & 2047;
            }
         }

         if ((var5 & '耀') != 0) {
            var4.field2626 = var0.method599();
            var4.field2615 = var0.method548();
            var4.field2660 = var0.method599();
            var4.field2643 = var0.method593();
            var4.field2663 = var0.method549() + client.field231;
            var4.field2664 = var0.method531() + client.field231;
            var4.field2665 = var0.method549();
            var4.field2607 = 1;
            var4.field2682 = 0;
            var4.field2626 += var4.field2633[0];
            var4.field2615 += var4.field2681[0];
            var4.field2660 += var4.field2633[0];
            var4.field2643 += var4.field2681[0];
         }

         if (0 != (var5 & 16384)) {
            var6 = var0.method592();
            if (1 == (var6 & 1)) {
               var4.method1268();
            } else {
               var7 = null;
               if (2 == (var6 & 2)) {
                  var8 = var0.method547();
                  var7 = new int[var8];

                  for(var9 = 0; var9 < var8; ++var9) {
                     var10 = var0.method574();
                     var10 = var10 == 65535 ? -1 : var10;
                     var7[var9] = var10;
                  }
               }

               var15 = null;
               if (4 == (var6 & 4)) {
                  var9 = 0;
                  if (var4.field2213.field3482 != null) {
                     var9 = var4.field2213.field3482.length;
                  }

                  var15 = new short[var9];

                  for(var10 = 0; var10 < var9; ++var10) {
                     var15[var10] = (short)var0.method531();
                  }
               }

               var16 = null;
               if ((var6 & 8) == 8) {
                  var10 = 0;
                  if (null != var4.field2213.field3484) {
                     var10 = var4.field2213.field3484.length;
                  }

                  var16 = new short[var10];

                  for(var11 = 0; var11 < var10; ++var11) {
                     var16[var11] = (short)var0.method574();
                  }
               }

               var17 = (long)(++class267.field2212 - 1);
               var4.method1264(new class207(var17, var7, var15, var16));
            }
         }

         if (0 != (var5 & 64)) {
            var4.field2641 = var0.method549();
            if (class123.field1061) {
               var4.field2641 += var0.method592() << 16;
               var6 = 16777215;
            } else {
               var6 = 65535;
            }

            if (var6 == var4.field2641) {
               var4.field2641 = -1;
            }
         }

         if (0 != (var5 & 2)) {
            var4.field2654 = var0.method549();
            var6 = var0.method571();
            var4.field2676 = var6 >> 16;
            var4.field2657 = (var6 & '\uffff') + client.field231;
            var4.field2655 = 0;
            var4.field2644 = 0;
            if (var4.field2657 > client.field231) {
               var4.field2655 = -1;
            }

            if (65535 == var4.field2654) {
               var4.field2654 = -1;
            }
         }

         if ((var5 & 65536) != 0) {
            var6 = var0.method592();
            var7 = new int[8];
            var15 = new short[8];

            for(var9 = 0; var9 < 8; ++var9) {
               if ((var6 & 1 << var9) != 0) {
                  var7[var9] = var0.method560();
                  var15[var9] = (short)var0.method605();
               } else {
                  var7[var9] = -1;
                  var15[var9] = -1;
               }
            }

            var4.method1262(var7, var15);
         }
      }

   }
}
