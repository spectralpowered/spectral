import java.lang.management.GarbageCollectorMXBean;

public final class class260 extends class236 {
   static GarbageCollectorMXBean field2675;
   boolean field2659 = false;
   class79 field2672;
   double field2654;
   double field2658;
   double field2662;
   double field2663;
   double field2665;
   double field2666;
   double field2668;
   double field2669;
   int field2650;
   int field2651;
   int field2652;
   int field2653;
   int field2655;
   int field2656 = 0;
   int field2657;
   int field2660;
   int field2661;
   int field2664;
   int field2667;
   int field2670;
   int field2671;
   int field2673;
   int field2674 = 0;

   class260(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      this.field2664 = var1;
      this.field2673 = var2;
      this.field2652 = var3;
      this.field2653 = var4;
      this.field2655 = var5;
      this.field2661 = var6;
      this.field2657 = var7;
      this.field2667 = var8;
      this.field2650 = var9;
      this.field2660 = var10;
      this.field2651 = var11;
      this.field2659 = false;
      int var12 = class27.method148(this.field2664).field1999;
      if (var12 != -1) {
         this.field2672 = class242.method1218(var12);
      } else {
         this.field2672 = null;
      }

   }

   final void method1252(int var1, int var2, int var3, int var4) {
      double var6;
      if (!this.field2659) {
         var6 = (double)(var1 - this.field2652);
         double var8 = (double)(var2 - this.field2653);
         double var10 = Math.sqrt(var8 * var8 + var6 * var6);
         this.field2662 = (double)this.field2652 + var6 * (double)this.field2650 / var10;
         this.field2663 = (double)this.field2653 + (double)this.field2650 * var8 / var10;
         this.field2658 = (double)this.field2655;
      }

      var6 = (double)(this.field2657 + 1 - var4);
      this.field2665 = ((double)var1 - this.field2662) / var6;
      this.field2666 = ((double)var2 - this.field2663) / var6;
      this.field2654 = Math.sqrt(this.field2666 * this.field2666 + this.field2665 * this.field2665);
      if (!this.field2659) {
         this.field2668 = -this.field2654 * Math.tan((double)this.field2667 * 0.02454369D);
      }

      this.field2669 = 2.0D * ((double)var3 - this.field2658 - var6 * this.field2668) / (var6 * var6);
   }

   final void method1253(int var1) {
      this.field2659 = true;
      this.field2662 += (double)var1 * this.field2665;
      this.field2663 += (double)var1 * this.field2666;
      this.field2658 += (double)var1 * this.field2668 + (double)var1 * this.field2669 * 0.5D * (double)var1;
      this.field2668 += (double)var1 * this.field2669;
      this.field2670 = (int)(Math.atan2(this.field2665, this.field2666) * 325.949D) + 1024 & 2047;
      this.field2671 = (int)(Math.atan2(this.field2668, this.field2654) * 325.949D) & 2047;
      if (null != this.field2672) {
         if (!this.field2672.method426()) {
            this.field2674 += var1;

            while(true) {
               do {
                  do {
                     if (this.field2674 <= this.field2672.field908[this.field2656]) {
                        return;
                     }

                     this.field2674 -= this.field2672.field908[this.field2656];
                     ++this.field2656;
                  } while(this.field2656 < this.field2672.field914.length);

                  this.field2656 -= this.field2672.field917;
               } while(this.field2656 >= 0 && this.field2656 < this.field2672.field914.length);

               this.field2656 = 0;
            }
         } else {
            this.field2656 += var1;
            int var3 = this.field2672.method428();
            if (this.field2656 >= var3) {
               this.field2656 = var3 - this.field2672.field917;
            }
         }
      }

   }

   protected final class491 method1194() {
      class192 var2 = class27.method148(this.field2664);
      class491 var3 = var2.method988(this.field2656);
      if (var3 == null) {
         return null;
      } else {
         var3.method2380(this.field2671);
         return var3;
      }
   }

   public static int method1255(int var0) {
      return class7.method24(class245.field2606[var0]);
   }

   public static class161 method1256(class164 var0, String var1, String var2) {
      int var4 = var0.method883(var1);
      int var5 = var0.method886(var4, var2);
      byte[] var8 = var0.method892(var4, var5);
      boolean var7;
      if (var8 == null) {
         var7 = false;
      } else {
         class212.method1108(var8);
         var7 = true;
      }

      class161 var6;
      if (!var7) {
         var6 = null;
      } else {
         class161 var9 = new class161();
         var9.field1666 = class104.field1353;
         var9.field1669 = class207.field2196;
         var9.field1664 = class207.field2198[0];
         var9.field1667 = class318.field3011[0];
         var9.field1668 = class110.field1380[0];
         var9.field1665 = class111.field1387[0];
         var9.field1663 = class482.field3990;
         var9.field1662 = class344.field3162[0];
         class207.field2198 = null;
         class318.field3011 = null;
         class110.field1380 = null;
         class111.field1387 = null;
         class482.field3990 = null;
         class344.field3162 = (byte[][])null;
         var6 = var9;
      }

      return var6;
   }

   static final void method1254(int var0, int var1, int var2, int var3) {
      ++client.field533;
      class462.method2267();
      class131.method646();
      if (client.field563 >= 0 && null != client.field551[client.field563]) {
         class16.method98(client.field551[client.field563], false);
      }

      class412.method1999(true);
      class103.method559();
      class412.method1999(false);
      class373.method1785();

      for(class378 var5 = (class378)client.field556.method1934(); var5 != null; var5 = (class378)client.field556.method1936()) {
         if (var5.field3313 == class195.field2036 && !var5.field3315) {
            if (client.field435 >= var5.field3312) {
               var5.method1805(client.field480);
               if (var5.field3315) {
                  var5.method567();
               } else {
                  class13.field126.method74(var5.field3313, var5.field3314, var5.field3320, var5.field3316, 60, var5, 0, -1L, false);
               }
            }
         } else {
            var5.method567();
         }
      }

      class250.method1233(var0, var1, var2, var3, true);
      var0 = client.field576;
      var1 = client.field704;
      var2 = client.field705;
      var3 = client.field604;
      class362.method1732(var0, var1, var2 + var0, var1 + var3);
      class234.method1167();
      int var36 = client.field504;
      if (client.field521 / 256 > var36) {
         var36 = client.field521 / 256;
      }

      if (client.field690[4] && 128 + client.field692[4] > var36) {
         var36 = client.field692[4] + 128;
      }

      int var6 = client.field505 & 2047;
      int var7 = class377.field3308;
      int var8 = class488.field4009;
      int var9 = class18.field140;
      int var10 = 600 + var36 * 3;
      int var13 = var3 - 334;
      if (var13 < 0) {
         var13 = 0;
      } else if (var13 > 100) {
         var13 = 100;
      }

      int var14 = (client.field589 - client.field697) * var13 / 100 + client.field697;
      int var12 = var14 * var10 / 256;
      var13 = 2048 - var36 & 2047;
      var14 = 2048 - var6 & 2047;
      int var15 = 0;
      int var16 = 0;
      int var17 = var12;
      int var18;
      int var19;
      int var20;
      if (var13 != 0) {
         var18 = class234.field2526[var13];
         var19 = class234.field2544[var13];
         var20 = var19 * var16 - var12 * var18 >> 16;
         var17 = var18 * var16 + var19 * var12 >> 16;
         var16 = var20;
      }

      if (var14 != 0) {
         var18 = class234.field2526[var14];
         var19 = class234.field2544[var14];
         var20 = var17 * var18 + var15 * var19 >> 16;
         var17 = var19 * var17 - var18 * var15 >> 16;
         var15 = var20;
      }

      if (client.field688) {
         class59.field817 = var7 - var15;
         class405.field3533 = var8 - var16;
         class11.field60 = var9 - var17;
         class272.field2752 = var36;
         class281.field2781 = var6;
      } else {
         class342.field3148 = var7 - var15;
         class318.field3010 = var8 - var16;
         class112.field1394 = var9 - var17;
         class389.field3438 = var36;
         class177.field1929 = var6;
      }

      if (1 == client.field510 && client.field685 >= 2 && 0 == client.field435 % 50 && (class89.field982.field297 >> 7 != class377.field3308 >> 7 || class18.field140 >> 7 != class89.field982.field233 >> 7)) {
         var18 = class89.field982.field408;
         var19 = (class377.field3308 >> 7) + class381.field3325;
         var20 = class345.field3166 + (class18.field140 >> 7);
         class81 var21 = class189.method982(class165.field1789, client.field483.field3459);
         var21.field933.method706(var20);
         var21.field933.method688(var18);
         var21.field933.method694(var19);
         var21.field933.method703(client.field706);
         client.field483.method1920(var21);
      }

      if (!client.field688) {
         var12 = class452.method2148();
      } else {
         var12 = class170.method906();
      }

      var13 = class342.field3148;
      var14 = class318.field3010;
      var15 = class112.field1394;
      var16 = class389.field3438;
      var17 = class177.field1929;

      for(var18 = 0; var18 < 5; ++var18) {
         if (client.field690[var18]) {
            var19 = (int)(Math.random() * (double)(2 * client.field720[var18] + 1) - (double)client.field720[var18] + Math.sin((double)client.field534[var18] * ((double)client.field693[var18] / 100.0D)) * (double)client.field692[var18]);
            if (var18 == 0) {
               class342.field3148 += var19;
            }

            if (var18 == 1) {
               class318.field3010 += var19;
            }

            if (var18 == 2) {
               class112.field1394 += var19;
            }

            if (var18 == 3) {
               class177.field1929 = class177.field1929 + var19 & 2047;
            }

            if (var18 == 4) {
               class389.field3438 += var19;
               if (class389.field3438 < 128) {
                  class389.field3438 = 128;
               }

               if (class389.field3438 > 383) {
                  class389.field3438 = 383;
               }
            }
         }
      }

      var18 = class182.field1957;
      var19 = class182.field1952;
      if (class182.field1963 != 0) {
         var18 = class182.field1964;
         var19 = class182.field1961;
      }

      if (var18 >= var0 && var18 < var2 + var0 && var19 >= var1 && var19 < var3 + var1) {
         var20 = var18 - var0;
         int var37 = var19 - var1;
         class245.field2600 = var20;
         class245.field2607 = var37;
         class245.field2601 = true;
         class245.field2608 = 0;
         class245.field2602 = false;
      } else {
         class222.method1140();
      }

      client.method281();
      class362.method1739(var0, var1, var2, var3, 0);
      client.method281();
      var20 = class234.field2530;
      class234.field2530 = client.field707;
      class13.field126.method59(class342.field3148, class318.field3010, class112.field1394, class389.field3438, class177.field1929, var12);
      class234.field2530 = var20;
      client.method281();
      class13.field126.method42();
      client.field678 = 0;
      boolean var38 = false;
      int var22 = -1;
      int var23 = -1;
      int var24 = class25.field180;
      int[] var25 = class25.field179;

      int var26;
      for(var26 = 0; var26 < client.field479 + var24; ++var26) {
         Object var27;
         if (var26 < var24) {
            var27 = client.field551[var25[var26]];
            if (client.field563 == var25[var26]) {
               var38 = true;
               var22 = var26;
               continue;
            }

            if (class89.field982 == var27) {
               var23 = var26;
               continue;
            }
         } else {
            var27 = client.field669[client.field635[var26 - var24]];
         }

         class177.method935((class30)var27, var26, var0, var1, var2, var3);
      }

      if (client.field462 && var23 != -1) {
         class177.method935(class89.field982, var23, var0, var1, var2, var3);
      }

      if (var38) {
         class177.method935(client.field551[client.field563], var22, var0, var1, var2, var3);
      }

      for(var26 = 0; var26 < client.field678; ++var26) {
         int var40 = client.field524[var26];
         int var28 = client.field525[var26];
         int var29 = client.field711[var26];
         int var30 = client.field526[var26];
         boolean var31 = true;

         while(var31) {
            var31 = false;

            for(int var32 = 0; var32 < var26; ++var32) {
               if (var28 + 2 > client.field525[var32] - client.field526[var32] && var28 - var30 < client.field525[var32] + 2 && var40 - var29 < client.field711[var32] + client.field524[var32] && var29 + var40 > client.field524[var32] - client.field711[var32] && client.field525[var32] - client.field526[var32] < var28) {
                  var28 = client.field525[var32] - client.field526[var32];
                  var31 = true;
               }
            }
         }

         client.field640 = client.field524[var26];
         client.field461 = client.field525[var26] = var28;
         String var41 = client.field522[var26];
         if (client.field601 == 0) {
            int var33 = 16776960;
            if (client.field528[var26] < 6) {
               var33 = client.field658[client.field528[var26]];
            }

            if (6 == client.field528[var26]) {
               var33 = client.field533 % 20 < 10 ? 16711680 : 16776960;
            }

            if (7 == client.field528[var26]) {
               var33 = client.field533 % 20 < 10 ? 255 : '\uffff';
            }

            if (client.field528[var26] == 8) {
               var33 = client.field533 % 20 < 10 ? '뀀' : 8454016;
            }

            int var34;
            if (client.field528[var26] == 9) {
               var34 = 150 - client.field619[var26];
               if (var34 < 50) {
                  var33 = var34 * 1280 + 16711680;
               } else if (var34 < 100) {
                  var33 = 16776960 - 327680 * (var34 - 50);
               } else if (var34 < 150) {
                  var33 = '\uff00' + (var34 - 100) * 5;
               }
            }

            if (10 == client.field528[var26]) {
               var34 = 150 - client.field619[var26];
               if (var34 < 50) {
                  var33 = var34 * 5 + 16711680;
               } else if (var34 < 100) {
                  var33 = 16711935 - 327680 * (var34 - 50);
               } else if (var34 < 150) {
                  var33 = 255 + (var34 - 100) * 327680 - (var34 - 100) * 5;
               }
            }

            if (11 == client.field528[var26]) {
               var34 = 150 - client.field619[var26];
               if (var34 < 50) {
                  var33 = 16777215 - var34 * 327685;
               } else if (var34 < 100) {
                  var33 = 327685 * (var34 - 50) + '\uff00';
               } else if (var34 < 150) {
                  var33 = 16777215 - (var34 - 100) * 327680;
               }
            }

            if (0 == client.field529[var26]) {
               class299.field2880.method520(var41, client.field640 + var0, var1 + client.field461, var33, 0);
            }

            if (client.field529[var26] == 1) {
               class299.field2880.method514(var41, client.field640 + var0, client.field461 + var1, var33, 0, client.field533);
            }

            if (client.field529[var26] == 2) {
               class299.field2880.method540(var41, var0 + client.field640, var1 + client.field461, var33, 0, client.field533);
            }

            if (client.field529[var26] == 3) {
               class299.field2880.method537(var41, client.field640 + var0, var1 + client.field461, var33, 0, client.field533, 150 - client.field619[var26]);
            }

            if (client.field529[var26] == 4) {
               var34 = (150 - client.field619[var26]) * (class299.field2880.method538(var41) + 100) / 150;
               class362.method1733(var0 + client.field640 - 50, var1, client.field640 + var0 + 50, var1 + var3);
               class299.field2880.method518(var41, 50 + client.field640 + var0 - var34, client.field461 + var1, var33, 0);
               class362.method1732(var0, var1, var2 + var0, var1 + var3);
            }

            if (client.field529[var26] == 5) {
               var34 = 150 - client.field619[var26];
               int var35 = 0;
               if (var34 < 25) {
                  var35 = var34 - 25;
               } else if (var34 > 125) {
                  var35 = var34 - 125;
               }

               class362.method1733(var0, var1 + client.field461 - class299.field2880.field999 - 1, var0 + var2, client.field461 + var1 + 5);
               class299.field2880.method520(var41, var0 + client.field640, var35 + client.field461 + var1, var33, 0);
               class362.method1732(var0, var1, var2 + var0, var1 + var3);
            }
         } else {
            class299.field2880.method520(var41, client.field640 + var0, client.field461 + var1, 16776960, 0);
         }
      }

      class204.method1051(var0, var1);
      ((class118)class234.field2528).method619(client.field480);
      class391.method1896((byte)-76);
      class342.field3148 = var13;
      class318.field3010 = var14;
      class112.field1394 = var15;
      class389.field3438 = var16;
      class177.field1929 = var17;
      if (client.field434) {
         byte var39 = 0;
         var22 = var39 + class475.field3948 + class475.field3950;
         if (var22 == 0) {
            client.field434 = false;
         }
      }

      if (client.field434) {
         class362.method1739(var0, var1, var2, var3, 0);
         class414.method2003(class96.field1150, false);
      }

   }
}
