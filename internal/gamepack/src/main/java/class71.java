@ObfInfo(
   name = "cf"
)
public final class class71 {
   @ObfInfo(
      owner = "cf",
      name = "q",
      desc = "[[[B"
   )
   static byte[][][] field643;
   @ObfInfo(
      owner = "cf",
      name = "e",
      desc = "[[[B"
   )
   static byte[][][] field644 = new byte[4][104][104];
   @ObfInfo(
      owner = "cf",
      name = "v",
      desc = "I"
   )
   static int field637 = 99;
   @ObfInfo(
      owner = "cf",
      name = "z",
      desc = "I"
   )
   static int field649 = (int)(Math.random() * 17.0D) - 8;
   @ObfInfo(
      owner = "cf",
      name = "w",
      desc = "I"
   )
   static int field650 = (int)(Math.random() * 33.0D) - 16;
   @ObfInfo(
      owner = "cf",
      name = "b",
      desc = "[I"
   )
   static int[] field641;
   @ObfInfo(
      owner = "cf",
      name = "g",
      desc = "[I"
   )
   static int[] field648;
   @ObfInfo(
      owner = "cf",
      name = "u",
      desc = "[[I"
   )
   static int[][] field640;
   @ObfInfo(
      owner = "cf",
      name = "h",
      desc = "[[[I"
   )
   static int[][][] field636 = new int[4][105][105];
   @ObfInfo(
      owner = "cf",
      name = "x",
      desc = "[[[S"
   )
   static short[][][] field638;
   @ObfInfo(
      owner = "cf",
      name = "y",
      desc = "[I"
   )
   static final int[] field635 = new int[]{-1, -1, 1, 1};
   @ObfInfo(
      owner = "cf",
      name = "p",
      desc = "[I"
   )
   static final int[] field639 = new int[]{0, -1, 0, 1};
   @ObfInfo(
      owner = "cf",
      name = "l",
      desc = "[I"
   )
   static final int[] field642 = new int[]{1, 2, 4, 8};
   @ObfInfo(
      owner = "cf",
      name = "c",
      desc = "[I"
   )
   static final int[] field645 = new int[]{1, 0, -1, 0};
   @ObfInfo(
      owner = "cf",
      name = "t",
      desc = "[I"
   )
   static final int[] field646 = new int[]{16, 32, 64, 128};
   @ObfInfo(
      owner = "cf",
      name = "d",
      desc = "[I"
   )
   static final int[] field647 = new int[]{1, -1, -1, 1};

   @ObfInfo(
      owner = "cf",
      name = "r",
      desc = "([BIIB)Z"
   )
   static final boolean method313(byte[] var0, int var1, int var2) {
      boolean var4 = true;
      class127 var5 = new class127(var0);
      int var6 = -1;

      label57:
      while(true) {
         int var7 = var5.method601();
         if (var7 == 0) {
            return var4;
         }

         var6 += var7;
         int var8 = 0;
         boolean var9 = false;

         while(true) {
            int var10;
            while(!var9) {
               var10 = var5.method559();
               if (var10 == 0) {
                  continue label57;
               }

               var8 += var10 - 1;
               int var11 = var8 & 63;
               int var12 = var8 >> 6 & 63;
               int var13 = var5.method547() >> 2;
               int var14 = var12 + var1;
               int var15 = var2 + var11;
               if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                  class87 var16 = class85.method356(var6);
                  if (var13 != 22 || !client.field274 || var16.field724 != 0 || 1 == var16.field717 || var16.field743) {
                     if (!var16.method373()) {
                        ++client.field499;
                        var4 = false;
                     }

                     var9 = true;
                  }
               }
            }

            var10 = var5.method559();
            if (var10 == 0) {
               break;
            }

            var5.method547();
         }
      }
   }

   @ObfInfo(
      owner = "cf",
      name = "b",
      desc = "([BIIIIIIILhc;[Lgw;)V"
   )
   static final void method312(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class318 var8, class427[] var9) {
      class127 var10 = new class127(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.method601();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method559();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.method547();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var4 == var17 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               class87 var21 = class85.method356(var11);
               int var22 = var2 + class263.method1214(var16 & 7, var15 & 7, var7, var21.field720, var21.field721, var20);
               int var25 = var16 & 7;
               int var26 = var15 & 7;
               int var28 = var21.field720;
               int var29 = var21.field721;
               int var30;
               if (1 == (var20 & 1)) {
                  var30 = var28;
                  var28 = var29;
                  var29 = var30;
               }

               int var27 = var7 & 3;
               int var24;
               if (var27 == 0) {
                  var24 = var26;
               } else if (var27 == 1) {
                  var24 = 7 - var25 - (var28 - 1);
               } else if (var27 == 2) {
                  var24 = 7 - var26 - (var29 - 1);
               } else {
                  var24 = var25;
               }

               var30 = var3 + var24;
               if (var22 > 0 && var30 > 0 && var22 < 103 && var30 < 103) {
                  int var31 = var1;
                  if ((field644[1][var22][var30] & 2) == 2) {
                     var31 = var1 - 1;
                  }

                  class427 var32 = null;
                  if (var31 >= 0) {
                     var32 = var9[var31];
                  }

                  class434.method2156(var1, var22, var30, var11, var7 + var20 & 3, var19, var8, var32);
               }
            }
         }
      }
   }

   @ObfInfo(
      owner = "cf",
      name = "gv",
      desc = "(I)V"
   )
   static void method311() {
      int var14;
      if (client.field248 == 0) {
         class408.field3415 = new class318(4, 104, 104, field636);

         for(var14 = 0; var14 < 4; ++var14) {
            client.field289[var14] = new class427(104, 104);
         }

         class211.field1833 = new class266(512, 512);
         class359.field3057 = class177.field1337;
         class359.field3056 = 5;
         client.field248 = 20;
      } else if (client.field248 == 20) {
         class359.field3057 = class177.field1338;
         class359.field3056 = 10;
         client.field248 = 30;
      } else if (client.field248 == 30) {
         class431.field3575 = class458.method2262(0, false, true, true, false);
         class374.field3179 = class458.method2262(1, false, true, true, false);
         class473.field3989 = class458.method2262(2, true, false, true, false);
         class313.field2473 = class458.method2262(3, false, true, true, false);
         class303.field2437 = class458.method2262(4, false, true, true, false);
         class440.field3648 = class458.method2262(5, true, true, true, false);
         class317.field2494 = class458.method2262(6, true, true, true, false);
         class16.field82 = class458.method2262(7, false, true, true, false);
         class446.field3678 = class458.method2262(8, false, true, true, false);
         class298.field2397 = class458.method2262(9, false, true, true, false);
         class49.field570 = class458.method2262(10, false, true, true, false);
         class32.field176 = class458.method2262(11, false, true, true, false);
         class329.field2596 = class458.method2262(12, false, true, true, false);
         class471.field3963 = class458.method2262(13, true, false, true, false);
         class85.field702 = class458.method2262(14, false, true, true, false);
         class306.field2456 = class458.method2262(15, false, true, true, false);
         class1.field7 = class458.method2262(17, true, true, true, false);
         class96.field782 = class458.method2262(18, false, true, true, false);
         class460.field3809 = class458.method2262(19, false, true, true, false);
         class46.field549 = class458.method2262(20, false, true, true, false);
         class187.field1697 = class458.method2262(21, false, true, true, true);
         class359.field3057 = class177.field1573;
         class359.field3056 = 20;
         client.field248 = 40;
      } else if (40 == client.field248) {
         byte var25 = 0;
         var14 = var25 + class431.field3575.method151() * 4 / 100;
         var14 += class374.field3179.method151() * 4 / 100;
         var14 += class473.field3989.method151() * 2 / 100;
         var14 += class313.field2473.method151() * 2 / 100;
         var14 += class303.field2437.method151() * 6 / 100;
         var14 += class440.field3648.method151() * 4 / 100;
         var14 += class317.field2494.method151() * 2 / 100;
         var14 += class16.field82.method151() * 55 / 100;
         var14 += class446.field3678.method151() * 2 / 100;
         var14 += class298.field2397.method151() * 2 / 100;
         var14 += class49.field570.method151() * 2 / 100;
         var14 += class32.field176.method151() * 2 / 100;
         var14 += class329.field2596.method151() * 2 / 100;
         var14 += class471.field3963.method151() * 2 / 100;
         var14 += class85.field702.method151() * 2 / 100;
         var14 += class306.field2456.method151() * 2 / 100;
         var14 += class460.field3809.method151() / 100;
         var14 += class96.field782.method151() / 100;
         var14 += class46.field549.method151() / 100;
         var14 += class187.field1697.method151() / 100;
         var14 += class1.field7.method150() && class1.field7.method1345() ? 1 : 0;
         if (var14 != 100) {
            if (var14 != 0) {
               class359.field3057 = class177.field1340 + var14 + "%";
            }

            class359.field3056 = 30;
         } else {
            class362.method1802(class431.field3575, "Animations");
            class362.method1802(class374.field3179, "Skeletons");
            class362.method1802(class303.field2437, "Sound FX");
            class362.method1802(class440.field3648, "Maps");
            class362.method1802(class317.field2494, "Music Tracks");
            class362.method1802(class16.field82, "Models");
            class362.method1802(class446.field3678, "Sprites");
            class362.method1802(class32.field176, "Music Jingles");
            class362.method1802(class85.field702, "Music Samples");
            class362.method1802(class306.field2456, "Music Patches");
            class362.method1802(class460.field3809, "World Map");
            class362.method1802(class96.field782, "World Map Geography");
            class362.method1802(class46.field549, "World Map Ground");
            class202.field1758 = new class305();
            class202.field1758.method1490(class1.field7);
            class359.field3057 = class177.field1341;
            class359.field3056 = 30;
            client.field248 = 45;
         }
      } else if (45 == client.field248) {
         boolean var24 = !client.field274;
         class233.field1985 = 22050;
         class40.field207 = var24;
         class189.field1707 = 2;
         class491 var16 = new class491();
         var16.method2407(9, 128);
         class402.field3388 = class241.method1044(class21.field104, 0, 22050);
         class402.field3388.method1006(var16);
         class387.method1902(class306.field2456, class85.field702, class303.field2437, var16);
         class288.field2367 = class241.method1044(class21.field104, 1, 2048);
         class197.field1739 = new class244();
         class288.field2367.method1006(class197.field1739);
         class297.field2393 = new class129(22050, class233.field1985);
         class359.field3057 = class177.field1533;
         class359.field3056 = 35;
         client.field248 = 50;
         class238.field2014 = new class180(class446.field3678, class471.field3963);
      } else if (50 == client.field248) {
         var14 = class460.method2268().length;
         client.field283 = class238.field2014.method818(class460.method2268());
         if (client.field283.size() < var14) {
            class359.field3057 = class177.field1520 + client.field283.size() * 100 / var14 + "%";
            class359.field3056 = 40;
         } else {
            class188.field1702 = (class58)client.field283.get(class460.field3812);
            class400.field3376 = (class58)client.field283.get(class460.field3808);
            class114.field848 = (class58)client.field283.get(class460.field3814);
            class372.field3166 = client.field255.method39();
            class359.field3057 = class177.field1502;
            class359.field3056 = 40;
            client.field248 = 60;
         }
      } else {
         int var4;
         class38 var17;
         if (60 == client.field248) {
            var14 = class416.method2016(class49.field570, class446.field3678);
            var17 = class446.field3678;
            var4 = class359.field3063.length + class359.field3065.length;
            String[] var20 = class359.field3083;

            for(int var21 = 0; var21 < var20.length; ++var21) {
               String var22 = var20[var21];
               if (var17.method1356(var22) != -1) {
                  ++var4;
               }
            }

            if (var14 < var4) {
               class359.field3057 = class177.field1345 + var14 * 100 / var4 + "%";
               class359.field3056 = 50;
            } else {
               class359.field3057 = class177.field1346;
               class359.field3056 = 50;
               class261.method1113(5);
               client.field248 = 70;
            }
         } else if (client.field248 == 70) {
            if (!class473.field3989.method1345()) {
               class359.field3057 = class177.field1347 + class473.field3989.method159() + "%";
               class359.field3056 = 60;
            } else if (!class187.field1697.method1345()) {
               class359.field3057 = class177.field1347 + (80 + class329.field2596.method159() / 6) + "%";
               class359.field3056 = 60;
            } else {
               class38 var23 = class473.field3989;
               class179.field1646 = var23;
               class261.method1112(class473.field3989);
               class38 var15 = class473.field3989;
               var17 = class16.field82;
               class164.field1239 = var15;
               class164.field1247 = var17;
               class329.field2598 = class164.field1239.method1360(3);
               class434.method2155(class473.field3989, class16.field82, client.field274);
               class486.method2387(class473.field3989, class16.field82, client.field228 <= 209, class202.field1758.field2447);
               class38 var18 = class473.field3989;
               class50.field575 = var18;
               class154.method717(class473.field3989, class16.field82, client.field222, class188.field1702);
               class166.method781(class473.field3989, class431.field3575, class374.field3179);
               class212.method916(class473.field3989, class16.field82);
               class475.method2351(class473.field3989);
               class38 var19 = class473.field3989;
               class85.field699 = var19;
               class85.field701 = class85.field699.method1360(16);
               class242.method1063(class313.field2473, class16.field82, class446.field3678, class471.field3963);
               class100.method398(class473.field3989);
               class166.method780(class473.field3989);
               class38 var6 = class473.field3989;
               class198.field1743 = var6;
               class188.method851(class473.field3989);
               class431.method2128(class473.field3989);
               class187.method846(class473.field3989);
               class407.method1997(class473.field3989);
               class15.field74 = new class449(class41.field210, 54, class235.field1995, class473.field3989);
               class189.field1706 = new class449(class41.field210, 47, class235.field1995, class473.field3989);
               class46.field560 = new class220();
               class38 var7 = class473.field3989;
               class38 var8 = class446.field3678;
               class38 var9 = class471.field3963;
               class362.field3086 = var7;
               class473.field3973 = var8;
               class473.field3969 = var9;
               class223.method988(class473.field3989, class446.field3678);
               class38 var10 = class473.field3989;
               class38 var11 = class446.field3678;
               class396.field3330 = var11;
               if (var10.method1345()) {
                  class396.field3313 = var10.method1360(35);
                  class396.field3312 = new class396[class396.field3313];

                  for(int var12 = 0; var12 < class396.field3313; ++var12) {
                     byte[] var13 = var10.method1365(35, var12);
                     class396.field3312[var12] = new class396(var12);
                     if (null != var13) {
                        class396.field3312[var12].method1943(new class127(var13));
                        class396.field3312[var12].method1945();
                     }
                  }
               }

               class359.field3057 = class177.field1410;
               class359.field3056 = 60;
               client.field248 = 80;
            }
         } else if (client.field248 == 80) {
            var14 = 0;
            if (null == class432.field3591) {
               class432.field3591 = class84.method341(class446.field3678, class202.field1758.field2445, 0);
            } else {
               ++var14;
            }

            if (null == class182.field1681) {
               class182.field1681 = class84.method341(class446.field3678, class202.field1758.field2450, 0);
            } else {
               ++var14;
            }

            if (null == class128.field1075) {
               class128.field1075 = class400.method1972(class446.field3678, class202.field1758.field2446, 0);
            } else {
               ++var14;
            }

            if (null == class2.field8) {
               class2.field8 = class242.method1064(class446.field3678, class202.field1758.field2444, 0);
            } else {
               ++var14;
            }

            if (class44.field540 == null) {
               class44.field540 = class242.method1064(class446.field3678, class202.field1758.field2447, 0);
            } else {
               ++var14;
            }

            if (class471.field3962 == null) {
               class471.field3962 = class242.method1064(class446.field3678, class202.field1758.field2449, 0);
            } else {
               ++var14;
            }

            if (class409.field3416 == null) {
               class409.field3416 = class242.method1064(class446.field3678, class202.field1758.field2453, 0);
            } else {
               ++var14;
            }

            if (null == class466.field3874) {
               class466.field3874 = class242.method1064(class446.field3678, class202.field1758.field2451, 0);
            } else {
               ++var14;
            }

            if (null == class228.field1935) {
               class228.field1935 = class242.method1064(class446.field3678, class202.field1758.field2452, 0);
            } else {
               ++var14;
            }

            if (null == class306.field2458) {
               class306.field2458 = class400.method1972(class446.field3678, class202.field1758.field2448, 0);
            } else {
               ++var14;
            }

            if (class464.field3854 == null) {
               class464.field3854 = class400.method1972(class446.field3678, class202.field1758.field2454, 0);
            } else {
               ++var14;
            }

            if (var14 < 11) {
               class359.field3057 = class177.field1444 + var14 * 100 / 12 + "%";
               class359.field3056 = 70;
            } else {
               class420.field3443 = class464.field3854;
               class182.field1681.method1225();
               int var2 = (int)(Math.random() * 21.0D) - 10;
               int var3 = (int)(Math.random() * 21.0D) - 10;
               var4 = (int)(Math.random() * 21.0D) - 10;
               int var5 = (int)(Math.random() * 41.0D) - 20;
               class128.field1075[0].method1747(var2 + var5, var3 + var5, var5 + var4);
               class359.field3057 = class177.field1350;
               class359.field3056 = 70;
               client.field248 = 90;
            }
         } else if (client.field248 == 90) {
            if (!class298.field2397.method1345()) {
               class359.field3057 = class177.field1351 + "0%";
               class359.field3056 = 90;
            } else {
               class176.field1322 = new class251(class298.field2397, class446.field3678, 20, class50.field574.method2208(), client.field274 ? 64 : 128);
               class341.method1712(class176.field1322);
               class341.method1708(class50.field574.method2208());
               client.field248 = 100;
            }
         } else if (client.field248 == 100) {
            var14 = class176.field1322.method1084();
            if (var14 < 100) {
               class359.field3057 = class177.field1351 + var14 + "%";
               class359.field3056 = 90;
            } else {
               class359.field3057 = class177.field1627;
               class359.field3056 = 90;
               client.field248 = 110;
            }
         } else if (client.field248 == 110) {
            class414.field3423 = new class238();
            class21.field104.method1449(class414.field3423, 10);
            class359.field3057 = class177.field1407;
            class359.field3056 = 92;
            client.field248 = 120;
         } else if (client.field248 == 120) {
            if (!class49.field570.method1358("huffman", "")) {
               class359.field3057 = class177.field1354 + 0 + "%";
               class359.field3056 = 94;
            } else {
               class364 var1 = new class364(class49.field570.method1357("huffman", ""));
               class386.method1899(var1);
               class359.field3057 = class177.field1568;
               class359.field3056 = 94;
               client.field248 = 130;
            }
         } else if (client.field248 == 130) {
            if (!class313.field2473.method1345()) {
               class359.field3057 = class177.field1356 + class313.field2473.method159() * 4 / 5 + "%";
               class359.field3056 = 96;
            } else if (!class329.field2596.method1345()) {
               class359.field3057 = class177.field1356 + (80 + class329.field2596.method159() / 6) + "%";
               class359.field3056 = 96;
            } else if (!class471.field3963.method1345()) {
               class359.field3057 = class177.field1356 + (96 + class471.field3963.method159() / 50) + "%";
               class359.field3056 = 96;
            } else {
               class359.field3057 = class177.field1445;
               class359.field3056 = 98;
               client.field248 = 140;
            }
         } else if (client.field248 == 140) {
            class359.field3056 = 100;
            if (!class460.field3809.method1364(class430.field3573.field3571)) {
               class359.field3057 = class177.field1323 + class460.field3809.method1343(class430.field3573.field3571) / 10 + "%";
            } else {
               if (null == class164.field1249) {
                  class164.field1249 = new class272();
                  class164.field1249.method1279(class460.field3809, class96.field782, class46.field549, class114.field848, client.field283, class128.field1075);
               }

               class359.field3057 = class177.field1611;
               client.field248 = 150;
            }
         } else if (client.field248 == 150) {
            class261.method1113(10);
         }
      }
   }
}
