@ObfInfo(
   name = "cj"
)
public final class class380 extends class334 {
   @ObfInfo(
      owner = "cj",
      name = "ad",
      desc = "Z"
   )
   boolean field3205;
   @ObfInfo(
      owner = "cj",
      name = "t",
      desc = "Z"
   )
   boolean field3211;
   @ObfInfo(
      owner = "cj",
      name = "p",
      desc = "Z"
   )
   boolean field3213;
   @ObfInfo(
      owner = "cj",
      name = "h",
      desc = "Lrp;"
   )
   class257 field3207;
   @ObfInfo(
      owner = "cj",
      name = "e",
      desc = "Lko;"
   )
   class284 field3194;
   @ObfInfo(
      owner = "cj",
      name = "n",
      desc = "Lhh;"
   )
   class470 field3206;
   @ObfInfo(
      owner = "cj",
      name = "w",
      desc = "Loh;"
   )
   class90 field3210;
   @ObfInfo(
      owner = "cj",
      name = "as",
      desc = "Loh;"
   )
   class90 field3212;
   @ObfInfo(
      owner = "cj",
      name = "z",
      desc = "Loh;"
   )
   class90 field3216;
   @ObfInfo(
      owner = "cj",
      name = "i",
      desc = "I"
   )
   int field3193;
   @ObfInfo(
      owner = "cj",
      name = "v",
      desc = "I"
   )
   int field3195 = -1;
   @ObfInfo(
      owner = "cj",
      name = "x",
      desc = "I"
   )
   int field3196 = -1;
   @ObfInfo(
      owner = "cj",
      name = "c",
      desc = "I"
   )
   int field3197;
   @ObfInfo(
      owner = "cj",
      name = "f",
      desc = "I"
   )
   int field3198;
   @ObfInfo(
      owner = "cj",
      name = "r",
      desc = "I"
   )
   int field3199;
   @ObfInfo(
      owner = "cj",
      name = "l",
      desc = "I"
   )
   int field3200;
   @ObfInfo(
      owner = "cj",
      name = "u",
      desc = "I"
   )
   int field3201;
   @ObfInfo(
      owner = "cj",
      name = "j",
      desc = "I"
   )
   int field3202;
   @ObfInfo(
      owner = "cj",
      name = "g",
      desc = "I"
   )
   int field3203;
   @ObfInfo(
      owner = "cj",
      name = "s",
      desc = "I"
   )
   int field3204;
   @ObfInfo(
      owner = "cj",
      name = "a",
      desc = "I"
   )
   int field3208;
   @ObfInfo(
      owner = "cj",
      name = "o",
      desc = "I"
   )
   int field3209;
   @ObfInfo(
      owner = "cj",
      name = "d",
      desc = "I"
   )
   int field3214;
   @ObfInfo(
      owner = "cj",
      name = "y",
      desc = "I"
   )
   int field3215;
   @ObfInfo(
      owner = "cj",
      name = "b",
      desc = "I"
   )
   int field3218;
   @ObfInfo(
      owner = "cj",
      name = "ao",
      desc = "I"
   )
   int field3219;
   @ObfInfo(
      owner = "cj",
      name = "k",
      desc = "I"
   )
   int field3220;
   @ObfInfo(
      owner = "cj",
      name = "am",
      desc = "I"
   )
   int field3221;
   @ObfInfo(
      owner = "cj",
      name = "q",
      desc = "[Ljava/lang/String;"
   )
   String[] field3217 = new String[3];

   @ObfInfo(
      owner = "cj",
      name = "<init>",
      desc = "()V"
   )
   class380() {
      for(int var1 = 0; var1 < 3; ++var1) {
         this.field3217[var1] = "";
      }

      this.field3198 = 0;
      this.field3199 = 0;
      this.field3218 = 0;
      this.field3202 = 0;
      this.field3211 = false;
      this.field3197 = 0;
      this.field3213 = false;
      this.field3216 = class90.field766;
      this.field3210 = class90.field766;
      this.field3212 = class90.field766;
      this.field3205 = false;
   }

   @ObfInfo(
      owner = "cj",
      name = "h",
      desc = "(Lqy;B)V"
   )
   final void method1882(class127 var1) {
      var1.field1070 = 0;
      int var3 = var1.method547();
      int var4 = -1;
      this.field3195 = var1.method548();
      this.field3196 = var1.method548();
      int var5 = -1;
      this.field3197 = 0;
      int[] var6 = new int[12];

      int var8;
      int var9;
      int var10;
      for(int var7 = 0; var7 < 12; ++var7) {
         var8 = var1.method547();
         if (var8 == 0) {
            var6[var7] = 0;
         } else {
            var9 = var1.method547();
            var6[var7] = (var8 << 8) + var9;
            if (var7 == 0 && 65535 == var6[0]) {
               var5 = var1.method549();
               break;
            }

            if (var6[var7] >= 512) {
               var10 = class423.method2062(var6[var7] - 512).field2187;
               if (var10 != 0) {
                  this.field3197 = var10;
               }
            }
         }
      }

      int[] var26 = new int[5];

      for(var8 = 0; var8 < 5; ++var8) {
         var9 = var1.method547();
         if (var9 < 0 || var9 >= class90.field769[var8].length) {
            var9 = 0;
         }

         var26[var8] = var9;
      }

      super.field2613 = var1.method549();
      if (super.field2613 == 65535) {
         super.field2613 = -1;
      }

      super.field2618 = var1.method549();
      if (65535 == super.field2618) {
         super.field2618 = -1;
      }

      super.field2680 = super.field2618;
      super.field2616 = var1.method549();
      if (super.field2616 == 65535) {
         super.field2616 = -1;
      }

      super.field2677 = var1.method549();
      if (65535 == super.field2677) {
         super.field2677 = -1;
      }

      super.field2634 = var1.method549();
      if (65535 == super.field2634) {
         super.field2634 = -1;
      }

      super.field2619 = var1.method549();
      if (65535 == super.field2619) {
         super.field2619 = -1;
      }

      super.field2610 = var1.method549();
      if (65535 == super.field2610) {
         super.field2610 = -1;
      }

      this.field3207 = new class257(var1.method555(), class63.field619);
      this.method1870();
      this.method1877();
      this.method1875();
      if (class113.field846 == this) {
         class478.field4015 = this.field3207.method1101();
      }

      this.field3198 = var1.method547();
      this.field3199 = var1.method549();
      this.field3213 = var1.method547() == 1;
      if (0 == client.field221 && client.field481 >= 2) {
         this.field3213 = false;
      }

      class67[] var27 = null;
      boolean var28 = false;
      var10 = var1.method549();
      var28 = (var10 >> 15 & 1) == 1;
      int var11;
      if (var10 > 0 && var10 != 32768) {
         var27 = new class67[12];

         for(var11 = 0; var11 < 12; ++var11) {
            int var12 = var10 >> 12 - var11 & 1;
            if (var12 == 1) {
               int var16 = var6[var11] - 512;
               int var17 = var1.method547();
               boolean var18 = (var17 & 1) != 0;
               boolean var19 = 0 != (var17 & 2);
               class67 var20 = new class67(var16);
               int var21;
               int[] var22;
               boolean var23;
               int var24;
               short var25;
               if (var18) {
                  var21 = var1.method547();
                  var22 = new int[]{var21 & 15, var21 >> 4 & 15};
                  var23 = null != var20.field625 && var20.field625.length == var22.length;

                  for(var24 = 0; var24 < 2; ++var24) {
                     if (var22[var24] != 15) {
                        var25 = (short)var1.method549();
                        if (var23) {
                           var20.field625[var22[var24]] = var25;
                        }
                     }
                  }
               }

               if (var19) {
                  var21 = var1.method547();
                  var22 = new int[]{var21 & 15, var21 >> 4 & 15};
                  var23 = null != var20.field626 && var20.field626.length == var22.length;

                  for(var24 = 0; var24 < 2; ++var24) {
                     if (15 != var22[var24]) {
                        var25 = (short)var1.method549();
                        if (var23) {
                           var20.field626[var22[var24]] = var25;
                        }
                     }
                  }
               }

               var27[var11] = var20;
            }
         }
      }

      for(var11 = 0; var11 < 3; ++var11) {
         this.field3217[var11] = var1.method555();
      }

      if (client.field228 > 208) {
         var4 = var1.method547();
      }

      if (this.field3194 == null) {
         this.field3194 = new class284();
      }

      this.field3194.method1405(var6, var27, var28, var26, var3, var5, var4);
   }

   @ObfInfo(
      owner = "cj",
      name = "m",
      desc = "(I)Z"
   )
   boolean method1869() {
      if (class90.field766 == this.field3216) {
         this.method1871();
      }

      return class90.field767 == this.field3216;
   }

   @ObfInfo(
      owner = "cj",
      name = "q",
      desc = "(I)V"
   )
   void method1870() {
      this.field3216 = class90.field766;
   }

   @ObfInfo(
      owner = "cj",
      name = "f",
      desc = "(I)V"
   )
   void method1871() {
      this.field3216 = class240.field2021.method54(this.field3207) ? class90.field767 : class90.field768;
   }

   @ObfInfo(
      owner = "cj",
      name = "r",
      desc = "(I)Z"
   )
   boolean method1884() {
      if (this.field3210 == class90.field766) {
         this.method1873();
      }

      return this.field3210 == class90.field767;
   }

   @ObfInfo(
      owner = "cj",
      name = "u",
      desc = "(I)V"
   )
   void method1877() {
      this.field3210 = class90.field766;
   }

   @ObfInfo(
      owner = "cj",
      name = "b",
      desc = "(I)V"
   )
   void method1873() {
      this.field3210 = null != class228.field1933 && class228.field1933.method1469(this.field3207) ? class90.field767 : class90.field768;
   }

   @ObfInfo(
      owner = "cj",
      name = "j",
      desc = "(I)V"
   )
   void method1874() {
      for(int var2 = 0; var2 < 4; ++var2) {
         if (client.field466[var2] != null && client.field466[var2].method2099(this.field3207.method1101()) != -1 && var2 != 2) {
            this.field3212 = class90.field767;
            return;
         }
      }

      this.field3212 = class90.field768;
   }

   @ObfInfo(
      owner = "cj",
      name = "g",
      desc = "(B)V"
   )
   void method1875() {
      this.field3212 = class90.field766;
   }

   @ObfInfo(
      owner = "cj",
      name = "i",
      desc = "(I)Z"
   )
   boolean method1876() {
      if (class90.field766 == this.field3212) {
         this.method1874();
      }

      return class90.field767 == this.field3212;
   }

   @ObfInfo(
      owner = "cj",
      name = "o",
      desc = "(B)I"
   )
   int method1881() {
      return this.field3194 != null && this.field3194.field2344 != -1 ? class421.method2049(this.field3194.field2344, (byte)35).field3470 : 1;
   }

   @ObfInfo(
      owner = "cj",
      name = "e",
      desc = "(I)Lhh;"
   )
   protected final class470 method1438() {
      if (null == this.field3194) {
         return null;
      } else {
         class242 var2 = -1 != super.field2649 && 0 == super.field2652 ? class271.method1277(super.field2649) : null;
         class242 var3 = -1 == super.field2645 || this.field3211 || super.field2613 == super.field2645 && null != var2 ? null : class271.method1277(super.field2645);
         class470 var4 = this.field3194.method1397(var2, super.field2640, var3, super.field2646);
         if (var4 == null) {
            return null;
         } else {
            var4.method2315();
            super.field2667 = var4.field2390;
            int var5 = var4.field3937;
            class470 var6;
            class470[] var7;
            if (!this.field3211 && -1 != super.field2654 && -1 != super.field2655) {
               var6 = class429.method2119(super.field2654).method1663(super.field2655);
               if (var6 != null) {
                  var6.method2313(0, -super.field2676, 0);
                  var7 = new class470[]{var4, var6};
                  var4 = new class470(var7, 2);
               }
            }

            if (!this.field3211 && null != this.field3206) {
               if (client.field231 >= this.field3202) {
                  this.field3206 = null;
               }

               if (client.field231 >= this.field3218 && client.field231 < this.field3202) {
                  var6 = this.field3206;
                  var6.method2313(this.field3203 - super.field2672, this.field3193 - this.field3201, this.field3209 - super.field2608);
                  if (512 == super.field2674) {
                     var6.method2307();
                     var6.method2307();
                     var6.method2307();
                  } else if (super.field2674 == 1024) {
                     var6.method2307();
                     var6.method2307();
                  } else if (super.field2674 == 1536) {
                     var6.method2307();
                  }

                  var7 = new class470[]{var4, var6};
                  var4 = new class470(var7, 2);
                  if (super.field2674 == 512) {
                     var6.method2307();
                  } else if (super.field2674 == 1024) {
                     var6.method2307();
                     var6.method2307();
                  } else if (super.field2674 == 1536) {
                     var6.method2307();
                     var6.method2307();
                     var6.method2307();
                  }

                  var6.method2313(super.field2672 - this.field3203, this.field3201 - this.field3193, super.field2608 - this.field3209);
               }
            }

            var4.field3920 = true;
            if (super.field2673 != 0 && client.field231 >= super.field2668 && client.field231 < super.field2630) {
               var4.field3953 = super.field2670;
               var4.field3954 = super.field2650;
               var4.field3955 = super.field2662;
               var4.field3901 = super.field2673;
               var4.field3957 = (short)var5;
            } else {
               var4.field3901 = 0;
            }

            return var4;
         }
      }
   }

   @ObfInfo(
      owner = "cj",
      name = "n",
      desc = "(IILgs;B)V"
   )
   final void method1878(int var1, int var2, class294 var3) {
      if (-1 != super.field2649 && class271.method1277(super.field2649).field2034 == 1) {
         super.field2649 = -1;
      }

      super.field2620 = -1;
      if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
         if (super.field2633[0] >= 0 && super.field2633[0] < 104 && super.field2681[0] >= 0 && super.field2681[0] < 104) {
            if (class294.field2388 == var3) {
               class380 var5 = this;
               class294 var6 = class294.field2388;
               int var7 = super.field2633[0];
               int var8 = super.field2681[0];
               int var9 = this.method1881();
               if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
                  int var10 = class203.method891(var7, var8, this.method1881(), class340.method1706(var1, var2), client.field289[this.field3214], true, client.field519, client.field498);
                  if (var10 >= 1) {
                     for(int var11 = 0; var11 < var10 - 1; ++var11) {
                        var5.method1880(client.field519[var11], client.field498[var11], var6);
                     }
                  }
               }
            }

            this.method1880(var1, var2, var3);
         } else {
            this.method1879(var1, var2);
         }
      } else {
         this.method1879(var1, var2);
      }

   }

   @ObfInfo(
      owner = "cj",
      name = "k",
      desc = "(IIB)V"
   )
   void method1879(int var1, int var2) {
      super.field2607 = 0;
      super.field2682 = 0;
      super.field2669 = 0;
      super.field2633[0] = var1;
      super.field2681[0] = var2;
      int var4 = this.method1881();
      super.field2672 = 128 * super.field2633[0] + var4 * 64;
      super.field2608 = var4 * 64 + super.field2681[0] * 128;
   }

   @ObfInfo(
      owner = "cj",
      name = "a",
      desc = "(IILgs;I)V"
   )
   final void method1880(int var1, int var2, class294 var3) {
      if (super.field2607 < 9) {
         ++super.field2607;
      }

      for(int var5 = super.field2607; var5 > 0; --var5) {
         super.field2633[var5] = super.field2633[var5 - 1];
         super.field2681[var5] = super.field2681[var5 - 1];
         super.field2661[var5] = super.field2661[var5 - 1];
      }

      super.field2633[0] = var1;
      super.field2681[0] = var2;
      super.field2661[0] = var3;
   }

   @ObfInfo(
      owner = "cj",
      name = "s",
      desc = "(I)Z"
   )
   final boolean method1678() {
      return this.field3194 != null;
   }

   @ObfInfo(
      owner = "cj",
      name = "e",
      desc = "(II)V"
   )
   public static void method1888(int var0) {
      class466.field3871 = var0;
   }

   @ObfInfo(
      owner = "cj",
      name = "q",
      desc = "(IB)I"
   )
   public static int method1883(int var0) {
      int var2 = 0;
      if (var0 < 0 || var0 >= 65536) {
         var0 >>>= 16;
         var2 += 16;
      }

      if (var0 >= 256) {
         var0 >>>= 8;
         var2 += 8;
      }

      if (var0 >= 16) {
         var0 >>>= 4;
         var2 += 4;
      }

      if (var0 >= 4) {
         var0 >>>= 2;
         var2 += 2;
      }

      if (var0 >= 1) {
         var0 >>>= 1;
         ++var2;
      }

      return var2 + var0;
   }

   @ObfInfo(
      owner = "cj",
      name = "b",
      desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V"
   )
   static void method1886(String var0, String var1, String var2) {
      class286.method1419(7);
      class300.method1452(var0, var1, var2);
   }

   @ObfInfo(
      owner = "cj",
      name = "gk",
      desc = "(I)V"
   )
   static final void method1887() {
      client.field279.method2382();
      class10.method60();
      class408.field3415.method1561();

      for(int var1 = 0; var1 < 4; ++var1) {
         client.field289[var1].method2082();
      }

      client.field285.method456();
      System.gc();
      class255.method1093(2);
      client.field476 = -1;
      client.field477 = false;
      class434.method2154();
      class261.method1113(10);
   }

   @ObfInfo(
      owner = "cj",
      name = "ap",
      desc = "(ILbm;ZI)I"
   )
   static int method1889(int var0, class461 var1, boolean var2) {
      if (var0 == 7108) {
         class386.field3248[++class161.field1227 - 1] = class313.method1512() ? 1 : 0;
         return 1;
      } else {
         return 2;
      }
   }

   @ObfInfo(
      owner = "cj",
      name = "ki",
      desc = "(Lkd;IIZI)V"
   )
   static void method1885(class120 var0, int var1, int var2, boolean var3) {
      int var5 = var0.field908;
      int var6 = var0.field967;
      if (0 == var0.field899) {
         var0.field908 = var0.field904;
      } else if (1 == var0.field899) {
         var0.field908 = var1 - var0.field904;
      } else if (2 == var0.field899) {
         var0.field908 = var0.field904 * var1 >> 14;
      }

      if (var0.field901 == 0) {
         var0.field967 = var0.field922;
      } else if (1 == var0.field901) {
         var0.field967 = var2 - var0.field922;
      } else if (2 == var0.field901) {
         var0.field967 = var0.field922 * var2 >> 14;
      }

      if (4 == var0.field899) {
         var0.field908 = var0.field967 * var0.field1010 / var0.field911;
      }

      if (var0.field901 == 4) {
         var0.field967 = var0.field911 * var0.field908 / var0.field1010;
      }

      if (1337 == var0.field993) {
         client.field482 = var0;
      }

      if (12 == var0.field1026) {
         var0.method485().method1122(var0.field908, var0.field967);
      }

      if (var3 && null != var0.field1016 && (var5 != var0.field908 || var6 != var0.field967)) {
         class488 var7 = new class488();
         var7.field4067 = var0;
         var7.field4069 = var0.field1016;
         client.field295.method642(var7);
      }

   }

   @ObfInfo(
      owner = "cj",
      name = "mt",
      desc = "(Lkd;IIII)V"
   )
   static final void method1872(class120 var0, int var1, int var2, int var3) {
      client.method189();
      class226 var5 = var0.method483(false);
      if (var5 != null) {
         class162.method742(var1, var2, var1 + var5.field1926, var2 + var5.field1927);
         if (client.field296 != 2 && client.field296 != 5) {
            int var6 = client.field301 & 2047;
            int var7 = 48 + class113.field846.field2672 / 32;
            int var8 = 464 - class113.field846.field2608 / 32;
            class211.field1833.method1236(var1, var2, var5.field1926, var5.field1927, var7, var8, var6, 256, var5.field1928, var5.field1925);

            int var9;
            int var10;
            int var11;
            for(var9 = 0; var9 < client.field469; ++var9) {
               var10 = client.field470[var9] * 4 + 2 - class113.field846.field2672 / 32;
               var11 = 4 * client.field471[var9] + 2 - class113.field846.field2608 / 32;
               class196.method874(var1, var2, var10, var11, client.field472[var9], var5);
            }

            int var12;
            int var13;
            for(var9 = 0; var9 < 104; ++var9) {
               for(var10 = 0; var10 < 104; ++var10) {
                  class141 var17 = client.field360[class347.field2878][var9][var10];
                  if (var17 != null) {
                     var12 = var9 * 4 + 2 - class113.field846.field2672 / 32;
                     var13 = var10 * 4 + 2 - class113.field846.field2608 / 32;
                     class196.method874(var1, var2, var12, var13, class228.field1935[0], var5);
                  }
               }
            }

            for(var9 = 0; var9 < client.field275; ++var9) {
               class267 var15 = client.field465[client.field431[var9]];
               if (var15 != null && var15.method1678()) {
                  class423 var18 = var15.field2213;
                  if (null != var18 && var18.field3493 != null) {
                     var18 = var18.method2054();
                  }

                  if (null != var18 && var18.field3486 && var18.field3496) {
                     var12 = var15.field2672 / 32 - class113.field846.field2672 / 32;
                     var13 = var15.field2608 / 32 - class113.field846.field2608 / 32;
                     class196.method874(var1, var2, var12, var13, class228.field1935[1], var5);
                  }
               }
            }

            var9 = class268.field2221;
            int[] var16 = class268.field2220;

            for(var11 = 0; var11 < var9; ++var11) {
               class380 var19 = client.field347[var16[var11]];
               if (var19 != null && var19.method1678() && !var19.field3213 && var19 != class113.field846) {
                  var13 = var19.field2672 / 32 - class113.field846.field2672 / 32;
                  int var14 = var19.field2608 / 32 - class113.field846.field2608 / 32;
                  if (var19.method1869()) {
                     class196.method874(var1, var2, var13, var14, class228.field1935[3], var5);
                  } else if (class113.field846.field3197 != 0 && 0 != var19.field3197 && class113.field846.field3197 == var19.field3197) {
                     class196.method874(var1, var2, var13, var14, class228.field1935[4], var5);
                  } else if (var19.method1884()) {
                     class196.method874(var1, var2, var13, var14, class228.field1935[5], var5);
                  } else if (var19.method1876()) {
                     class196.method874(var1, var2, var13, var14, class228.field1935[6], var5);
                  } else {
                     class196.method874(var1, var2, var13, var14, class228.field1935[2], var5);
                  }
               }
            }

            if (0 != client.field238 && client.field231 % 20 < 10) {
               if (client.field238 == 1 && client.field239 >= 0 && client.field239 < client.field465.length) {
                  class267 var20 = client.field465[client.field239];
                  if (null != var20) {
                     var12 = var20.field2672 / 32 - class113.field846.field2672 / 32;
                     var13 = var20.field2608 / 32 - class113.field846.field2608 / 32;
                     class214.method940(var1, var2, var12, var13, class409.field3416[1], var5);
                  }
               }

               if (2 == client.field238) {
                  var11 = 2 + (client.field241 * 4 - class312.field2465 * 4) - class113.field846.field2672 / 32;
                  var12 = 2 + (client.field282 * 4 - class325.field2575 * 4) - class113.field846.field2608 / 32;
                  class214.method940(var1, var2, var11, var12, class409.field3416[1], var5);
               }

               if (10 == client.field238 && client.field307 >= 0 && client.field307 < client.field347.length) {
                  class380 var21 = client.field347[client.field307];
                  if (var21 != null) {
                     var12 = var21.field2672 / 32 - class113.field846.field2672 / 32;
                     var13 = var21.field2608 / 32 - class113.field846.field2608 / 32;
                     class214.method940(var1, var2, var12, var13, class409.field3416[1], var5);
                  }
               }
            }

            if (0 != client.field473) {
               var11 = 2 + client.field473 * 4 - class113.field846.field2672 / 32;
               var12 = 2 + client.field219 * 4 - class113.field846.field2608 / 32;
               class196.method874(var1, var2, var11, var12, class409.field3416[0], var5);
            }

            if (!class113.field846.field3213) {
               class162.method749(var5.field1926 / 2 + var1 - 1, var2 + var5.field1927 / 2 - 1, 3, 3, 16777215);
            }
         } else {
            class162.method755(var1, var2, 0, var5.field1928, var5.field1925);
         }

         client.field445[var3] = true;
      }
   }
}
