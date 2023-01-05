public abstract class class334 extends class295 {
   boolean field2609 = false;
   boolean field2617 = false;
   boolean field2629;
   boolean field2642 = false;
   boolean field2658;
   byte field2614 = 0;
   byte field2650;
   byte field2662;
   byte field2670;
   byte field2673;
   class294[] field2661 = new class294[10];
   class395 field2671 = new class395();
   int field2607 = 0;
   int field2608;
   int field2610 = -1;
   int field2611 = 452450767;
   int field2612;
   int field2613 = -1;
   int field2615;
   int field2616 = -1;
   int field2618 = -1;
   int field2619 = -1;
   int field2620 = -1;
   int field2621 = -1;
   int field2622;
   int field2623 = -1;
   int field2624 = -1;
   int field2625 = -1;
   int field2626;
   int field2627 = -1;
   int field2630 = -1790566807;
   int field2631 = -1;
   int field2632 = 0;
   int field2634 = -1;
   int field2640 = 0;
   int field2641 = -1;
   int field2643;
   int field2644 = 0;
   int field2645 = -1;
   int field2646 = 0;
   int field2647 = 0;
   int field2648 = 0;
   int field2649 = -1;
   int field2651 = 0;
   int field2652 = 0;
   int field2653 = 0;
   int field2654 = -1;
   int field2655 = 0;
   int field2656 = -1;
   int field2657;
   int field2659 = 0;
   int field2660;
   int field2663;
   int field2664;
   int field2665;
   int field2666 = 0;
   int field2667 = 200;
   int field2668 = -560800595;
   int field2669 = 0;
   int field2672;
   int field2674;
   int field2675 = 0;
   int field2676;
   int field2677 = -1;
   int field2678 = 100;
   int field2679 = 32;
   int field2680 = -1;
   int field2682 = 0;
   int field2683 = 1702343865;
   int[] field2633 = new int[10];
   int[] field2635 = new int[4];
   int[] field2636 = new int[4];
   int[] field2637 = new int[4];
   int[] field2638 = new int[4];
   int[] field2639 = new int[4];
   int[] field2681 = new int[10];
   String field2628 = null;

   final void method1677() {
      this.field2607 = 0;
      this.field2682 = 0;
   }

   boolean method1678() {
      return false;
   }

   final void method1676(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var8 = true;
      boolean var9 = true;

      int var10;
      for(var10 = 0; var10 < 4; ++var10) {
         if (this.field2637[var10] > var5) {
            var8 = false;
         } else {
            var9 = false;
         }
      }

      var10 = -1;
      int var11 = -1;
      int var12 = 0;
      if (var1 >= 0) {
         class473 var13 = class444.method2198(var1);
         var11 = var13.field3984;
         var12 = var13.field3972;
      }

      int var15;
      if (var9) {
         if (var11 == -1) {
            return;
         }

         var10 = 0;
         var15 = 0;
         if (var11 == 0) {
            var15 = this.field2637[0];
         } else if (var11 == 1) {
            var15 = this.field2636[0];
         }

         for(int var14 = 1; var14 < 4; ++var14) {
            if (var11 == 0) {
               if (this.field2637[var14] < var15) {
                  var10 = var14;
                  var15 = this.field2637[var14];
               }
            } else if (var11 == 1 && this.field2636[var14] < var15) {
               var10 = var14;
               var15 = this.field2636[var14];
            }
         }

         if (var11 == 1 && var15 >= var2) {
            return;
         }
      } else {
         if (var8) {
            this.field2614 = 0;
         }

         for(var15 = 0; var15 < 4; ++var15) {
            byte var16 = this.field2614;
            this.field2614 = (byte)((this.field2614 + 1) % 4);
            if (this.field2637[var16] <= var5) {
               var10 = var16;
               break;
            }
         }
      }

      if (var10 >= 0) {
         this.field2635[var10] = var1;
         this.field2636[var10] = var2;
         this.field2638[var10] = var3;
         this.field2639[var10] = var4;
         this.field2637[var10] = var6 + var12 + var5;
      }
   }

   final void method1679(int var1, int var2, int var3, int var4, int var5, int var6) {
      class406 var9 = (class406)class406.field3396.method394((long)var1);
      class406 var8;
      if (null != var9) {
         var8 = var9;
      } else {
         byte[] var10 = class406.field3401.method1365(33, var1);
         var9 = new class406();
         if (null != var10) {
            var9.method1995(new class127(var10));
         }

         class406.field3396.method396(var9, (long)var1);
         var8 = var9;
      }

      var9 = var8;
      class431 var15 = null;
      class431 var11 = null;
      int var12 = var8.field3398;
      int var13 = 0;

      class431 var14;
      for(var14 = (class431)this.field2671.method1941(); var14 != null; var14 = (class431)this.field2671.method1935()) {
         ++var13;
         if (var14.field3574.field3400 == var9.field3400) {
            var14.method2122(var2 + var4, var5, var6, var3);
            return;
         }

         if (var14.field3574.field3397 <= var9.field3397) {
            var15 = var14;
         }

         if (var14.field3574.field3398 > var12) {
            var11 = var14;
            var12 = var14.field3574.field3398;
         }
      }

      if (var11 != null || var13 < 4) {
         var14 = new class431(var9);
         if (null == var15) {
            this.field2671.method1933(var14);
         } else {
            class395.method1942(var14, var15);
         }

         var14.method2122(var4 + var2, var5, var6, var3);
         if (var13 >= 4) {
            var11.method637();
         }

      }
   }

   final void method1680(int var1) {
      class406 var4 = (class406)class406.field3396.method394((long)var1);
      class406 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class406.field3401.method1365(33, var1);
         var4 = new class406();
         if (null != var5) {
            var4.method1995(new class127(var5));
         }

         class406.field3396.method396(var4, (long)var1);
         var3 = var4;
      }

      var4 = var3;

      for(class431 var6 = (class431)this.field2671.method1941(); var6 != null; var6 = (class431)this.field2671.method1935()) {
         if (var6.field3574 == var4) {
            var6.method637();
            return;
         }
      }

   }

   public static int method1681(int var0) {
      return class28.field162[var0];
   }
}
