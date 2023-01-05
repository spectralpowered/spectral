public final class class74 {
   static byte[][][] field865;
   static byte[][][] field866 = new byte[4][104][104];
   static int field859 = 99;
   static int field871 = (int)(Math.random() * 17.0D) - 8;
   static int field872 = (int)(Math.random() * 33.0D) - 16;
   static int[] field863;
   static int[] field870;
   static int[][] field862;
   static int[][][] field858 = new int[4][105][105];
   static short[][][] field860;
   static final int[] field857 = new int[]{-1, -1, 1, 1};
   static final int[] field861 = new int[]{0, -1, 0, 1};
   static final int[] field864 = new int[]{1, 2, 4, 8};
   static final int[] field867 = new int[]{1, 0, -1, 0};
   static final int[] field868 = new int[]{16, 32, 64, 128};
   static final int[] field869 = new int[]{1, -1, -1, 1};

   static final boolean method409(byte[] var0, int var1, int var2) {
      boolean var4 = true;
      class134 var5 = new class134(var0);
      int var6 = -1;

      label57:
      while(true) {
         int var7 = var5.method723();
         if (var7 == 0) {
            return var4;
         }

         var6 += var7;
         int var8 = 0;
         boolean var9 = false;

         while(true) {
            int var10;
            while(!var9) {
               var10 = var5.method681();
               if (var10 == 0) {
                  continue label57;
               }

               var8 += var10 - 1;
               int var11 = var8 & 63;
               int var12 = var8 >> 6 & 63;
               int var13 = var5.method669() >> 2;
               int var14 = var12 + var1;
               int var15 = var2 + var11;
               if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
                  class173 var16 = class212.method1110(var6);
                  if (var13 != 22 || !client.field478 || var16.field1882 != 0 || 1 == var16.field1875 || var16.field1901) {
                     if (!var16.method926()) {
                        ++client.field703;
                        var4 = false;
                     }

                     var9 = true;
                  }
               }
            }

            var10 = var5.method681();
            if (var10 == 0) {
               break;
            }

            var5.method669();
         }
      }
   }

   static final void method408(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, class12 var8, class391[] var9) {
      class134 var10 = new class134(var0);
      int var11 = -1;

      while(true) {
         int var12 = var10.method723();
         if (var12 == 0) {
            return;
         }

         var11 += var12;
         int var13 = 0;

         while(true) {
            int var14 = var10.method681();
            if (var14 == 0) {
               break;
            }

            var13 += var14 - 1;
            int var15 = var13 & 63;
            int var16 = var13 >> 6 & 63;
            int var17 = var13 >> 12;
            int var18 = var10.method669();
            int var19 = var18 >> 2;
            int var20 = var18 & 3;
            if (var4 == var17 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
               class173 var21 = class212.method1110(var11);
               int var22 = var2 + class458.method2183(var16 & 7, var15 & 7, var7, var21.field1878, var21.field1879, var20);
               int var25 = var16 & 7;
               int var26 = var15 & 7;
               int var28 = var21.field1878;
               int var29 = var21.field1879;
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
                  if ((field866[1][var22][var30] & 2) == 2) {
                     var31 = var1 - 1;
                  }

                  class391 var32 = null;
                  if (var31 >= 0) {
                     var32 = var9[var31];
                  }

                  class163.method866(var1, var22, var30, var11, var7 + var20 & 3, var19, var8, var32);
               }
            }
         }
      }
   }

   static void method407() {
      int var14;
      if (client.field452 == 0) {
         class13.field126 = new class12(4, 104, 104, field858);

         for(var14 = 0; var14 < 4; ++var14) {
            client.field493[var14] = new class391(104, 104);
         }

         class323.field3040 = new class319(512, 512);
         class52.field762 = class96.field1032;
         class52.field761 = 5;
         client.field452 = 20;
      } else if (client.field452 == 20) {
         class52.field762 = class96.field1033;
         class52.field761 = 10;
         client.field452 = 30;
      } else if (client.field452 == 30) {
         class44.field377 = class76.method415(0, false, true, true, false);
         class328.field3066 = class76.method415(1, false, true, true, false);
         class399.field3509 = class76.method415(2, true, false, true, false);
         class361.field3239 = class76.method415(3, false, true, true, false);
         class35.field350 = class76.method415(4, false, true, true, false);
         class42.field375 = class76.method415(5, true, true, true, false);
         class417.field3564 = class76.method415(6, true, true, true, false);
         class252.field2634 = class76.method415(7, false, true, true, false);
         class280.field2767 = class76.method415(8, false, true, true, false);
         class405.field3532 = class76.method415(9, false, true, true, false);
         class278.field2760 = class76.method415(10, false, true, true, false);
         class269.field2702 = class76.method415(11, false, true, true, false);
         class71.field849 = class76.method415(12, false, true, true, false);
         class307.field2902 = class76.method415(13, true, false, true, false);
         class212.field2380 = class76.method415(14, false, true, true, false);
         class137.field1496 = class76.method415(15, false, true, true, false);
         class205.field2191 = class76.method415(17, true, true, true, false);
         class286.field2786 = class76.method415(18, false, true, true, false);
         class39.field366 = class76.method415(19, false, true, true, false);
         class430.field3589 = class76.method415(20, false, true, true, false);
         class423.field3575 = class76.method415(21, false, true, true, true);
         class52.field762 = class96.field1268;
         class52.field761 = 20;
         client.field452 = 40;
      } else if (40 == client.field452) {
         byte var25 = 0;
         var14 = var25 + class44.field377.method1149() * 4 / 100;
         var14 += class328.field3066.method1149() * 4 / 100;
         var14 += class399.field3509.method1149() * 2 / 100;
         var14 += class361.field3239.method1149() * 2 / 100;
         var14 += class35.field350.method1149() * 6 / 100;
         var14 += class42.field375.method1149() * 4 / 100;
         var14 += class417.field3564.method1149() * 2 / 100;
         var14 += class252.field2634.method1149() * 55 / 100;
         var14 += class280.field2767.method1149() * 2 / 100;
         var14 += class405.field3532.method1149() * 2 / 100;
         var14 += class278.field2760.method1149() * 2 / 100;
         var14 += class269.field2702.method1149() * 2 / 100;
         var14 += class71.field849.method1149() * 2 / 100;
         var14 += class307.field2902.method1149() * 2 / 100;
         var14 += class212.field2380.method1149() * 2 / 100;
         var14 += class137.field1496.method1149() * 2 / 100;
         var14 += class39.field366.method1149() / 100;
         var14 += class286.field2786.method1149() / 100;
         var14 += class430.field3589.method1149() / 100;
         var14 += class423.field3575.method1149() / 100;
         var14 += class205.field2191.method1148() && class205.field2191.method872() ? 1 : 0;
         if (var14 != 100) {
            if (var14 != 0) {
               class52.field762 = class96.field1035 + var14 + "%";
            }

            class52.field761 = 30;
         } else {
            class304.method1433(class44.field377, "Animations");
            class304.method1433(class328.field3066, "Skeletons");
            class304.method1433(class35.field350, "Sound FX");
            class304.method1433(class42.field375, "Maps");
            class304.method1433(class417.field3564, "Music Tracks");
            class304.method1433(class252.field2634, "Models");
            class304.method1433(class280.field2767, "Sprites");
            class304.method1433(class269.field2702, "Music Jingles");
            class304.method1433(class212.field2380, "Music Samples");
            class304.method1433(class137.field1496, "Music Patches");
            class304.method1433(class39.field366, "World Map");
            class304.method1433(class286.field2786, "World Map Geography");
            class304.method1433(class430.field3589, "World Map Ground");
            class254.field2640 = new class32();
            class254.field2640.method164(class205.field2191);
            class52.field762 = class96.field1036;
            class52.field761 = 30;
            client.field452 = 45;
         }
      } else if (45 == client.field452) {
         boolean var24 = !client.field478;
         class157.field1636 = 22050;
         class126.field1464 = var24;
         class352.field3183 = 2;
         class489 var16 = new class489();
         var16.method2328(9, 128);
         class327.field3054 = class69.method388(class358.field3203, 0, 22050);
         class327.field3054.method821(var16);
         class50.method290(class137.field1496, class212.field2380, class35.field350, var16);
         class175.field1916 = class69.method388(class358.field3203, 1, 2048);
         class488.field4008 = new class396();
         class175.field1916.method821(class488.field4008);
         class412.field3552 = new class119(22050, class157.field1636);
         class52.field762 = class96.field1228;
         class52.field761 = 35;
         client.field452 = 50;
         class334.field3105 = new class146(class280.field2767, class307.field2902);
      } else if (50 == client.field452) {
         var14 = class39.method217().length;
         client.field487 = class334.field3105.method781(class39.method217());
         if (client.field487.size() < var14) {
            class52.field762 = class96.field1215 + client.field487.size() * 100 / var14 + "%";
            class52.field761 = 40;
         } else {
            class248.field2615 = (class394)client.field487.get(class39.field369);
            class441.field3651 = (class394)client.field487.get(class39.field365);
            class299.field2880 = (class394)client.field487.get(class39.field371);
            class348.field3173 = client.field459.method549();
            class52.field762 = class96.field1197;
            class52.field761 = 40;
            client.field452 = 60;
         }
      } else {
         int var4;
         class230 var17;
         if (60 == client.field452) {
            var14 = class306.method1441(class278.field2760, class280.field2767);
            var17 = class280.field2767;
            var4 = class52.field768.length + class52.field770.length;
            String[] var20 = class52.field788;

            for(int var21 = 0; var21 < var20.length; ++var21) {
               String var22 = var20[var21];
               if (var17.method883(var22) != -1) {
                  ++var4;
               }
            }

            if (var14 < var4) {
               class52.field762 = class96.field1040 + var14 * 100 / var4 + "%";
               class52.field761 = 50;
            } else {
               class52.field762 = class96.field1041;
               class52.field761 = 50;
               class72.method402(5);
               client.field452 = 70;
            }
         } else if (client.field452 == 70) {
            if (!class399.field3509.method872()) {
               class52.field762 = class96.field1042 + class399.field3509.method1154() + "%";
               class52.field761 = 60;
            } else if (!class423.field3575.method872()) {
               class52.field762 = class96.field1042 + (80 + class71.field849.method1154() / 6) + "%";
               class52.field761 = 60;
            } else {
               class230 var23 = class399.field3509;
               class152.field1593 = var23;
               class72.method401(class399.field3509);
               class230 var15 = class399.field3509;
               var17 = class252.field2634;
               class237.field2556 = var15;
               class237.field2564 = var17;
               class71.field851 = class237.field2556.method887(3);
               class163.method865(class399.field3509, class252.field2634, client.field478);
               class393.method1918(class399.field3509, class252.field2634, client.field432 <= 209, class254.field2640.field317);
               class230 var18 = class399.field3509;
               class111.field1386 = var18;
               class427.method2041(class399.field3509, class252.field2634, client.field426, class248.field2615);
               class406.method1989(class399.field3509, class44.field377, class328.field3066);
               class341.method1635(class399.field3509, class252.field2634);
               class90.method495(class399.field3509);
               class230 var19 = class399.field3509;
               class212.field2377 = var19;
               class212.field2379 = class212.field2377.method887(16);
               class79.method433(class361.field3239, class252.field2634, class280.field2767, class307.field2902);
               class58.method336(class399.field3509);
               class406.method1988(class399.field3509);
               class230 var6 = class399.field3509;
               class359.field3206 = var6;
               class248.method1228(class399.field3509);
               class44.method229(class399.field3509);
               class423.method2028(class399.field3509);
               class283.method1354(class399.field3509);
               class33.field328 = new class407(class451.field3700, 54, class300.field2886, class399.field3509);
               class352.field3182 = new class407(class451.field3700, 47, class300.field2886, class399.field3509);
               class430.field3600 = new class368();
               class230 var7 = class399.field3509;
               class230 var8 = class280.field2767;
               class230 var9 = class307.field2902;
               class304.field2893 = var7;
               class399.field3493 = var8;
               class399.field3489 = var9;
               class293.method1383(class399.field3509, class280.field2767);
               class230 var10 = class399.field3509;
               class230 var11 = class280.field2767;
               class194.field2031 = var11;
               if (var10.method872()) {
                  class194.field2014 = var10.method887(35);
                  class194.field2013 = new class194[class194.field2014];

                  for(int var12 = 0; var12 < class194.field2014; ++var12) {
                     byte[] var13 = var10.method892(35, var12);
                     class194.field2013[var12] = new class194(var12);
                     if (null != var13) {
                        class194.field2013[var12].method995(new class134(var13));
                        class194.field2013[var12].method997();
                     }
                  }
               }

               class52.field762 = class96.field1105;
               class52.field761 = 60;
               client.field452 = 80;
            }
         } else if (client.field452 == 80) {
            var14 = 0;
            if (null == class463.field3866) {
               class463.field3866 = class360.method1714(class280.field2767, class254.field2640.field315, 0);
            } else {
               ++var14;
            }

            if (null == class105.field1358) {
               class105.field1358 = class360.method1714(class280.field2767, class254.field2640.field320, 0);
            } else {
               ++var14;
            }

            if (null == class363.field3250) {
               class363.field3250 = class441.method2097(class280.field2767, class254.field2640.field316, 0);
            } else {
               ++var14;
            }

            if (null == class296.field2830) {
               class296.field2830 = class79.method434(class280.field2767, class254.field2640.field314, 0);
            } else {
               ++var14;
            }

            if (class343.field3151 == null) {
               class343.field3151 = class79.method434(class280.field2767, class254.field2640.field317, 0);
            } else {
               ++var14;
            }

            if (class307.field2901 == null) {
               class307.field2901 = class79.method434(class280.field2767, class254.field2640.field319, 0);
            } else {
               ++var14;
            }

            if (class493.field4117 == null) {
               class493.field4117 = class79.method434(class280.field2767, class254.field2640.field323, 0);
            } else {
               ++var14;
            }

            if (null == class182.field1968) {
               class182.field1968 = class79.method434(class280.field2767, class254.field2640.field321, 0);
            } else {
               ++var14;
            }

            if (null == class103.field1352) {
               class103.field1352 = class79.method434(class280.field2767, class254.field2640.field322, 0);
            } else {
               ++var14;
            }

            if (null == class137.field1498) {
               class137.field1498 = class441.method2097(class280.field2767, class254.field2640.field318, 0);
            } else {
               ++var14;
            }

            if (class308.field2906 == null) {
               class308.field2906 = class441.method2097(class280.field2767, class254.field2640.field324, 0);
            } else {
               ++var14;
            }

            if (var14 < 11) {
               class52.field762 = class96.field1139 + var14 * 100 / 12 + "%";
               class52.field761 = 70;
            } else {
               class93.field1000 = class308.field2906;
               class105.field1358.method1533();
               int var2 = (int)(Math.random() * 21.0D) - 10;
               int var3 = (int)(Math.random() * 21.0D) - 10;
               var4 = (int)(Math.random() * 21.0D) - 10;
               int var5 = (int)(Math.random() * 41.0D) - 20;
               class363.field3250[0].method851(var2 + var5, var3 + var5, var5 + var4);
               class52.field762 = class96.field1045;
               class52.field761 = 70;
               client.field452 = 90;
            }
         } else if (client.field452 == 90) {
            if (!class405.field3532.method872()) {
               class52.field762 = class96.field1046 + "0%";
               class52.field761 = 90;
            } else {
               class268.field2699 = new class118(class405.field3532, class280.field2767, 20, class111.field1385.method1323(), client.field478 ? 64 : 128);
               class234.method1170(class268.field2699);
               class234.method1166(class111.field1385.method1323());
               client.field452 = 100;
            }
         } else if (client.field452 == 100) {
            var14 = class268.field2699.method613();
            if (var14 < 100) {
               class52.field762 = class96.field1046 + var14 + "%";
               class52.field761 = 90;
            } else {
               class52.field762 = class96.field1322;
               class52.field761 = 90;
               client.field452 = 110;
            }
         } else if (client.field452 == 110) {
            class351.field3179 = new class334();
            class358.field3203.method110(class351.field3179, 10);
            class52.field762 = class96.field1102;
            class52.field761 = 92;
            client.field452 = 120;
         } else if (client.field452 == 120) {
            if (!class278.field2760.method885("huffman", "")) {
               class52.field762 = class96.field1049 + 0 + "%";
               class52.field761 = 94;
            } else {
               class369 var1 = new class369(class278.field2760.method884("huffman", ""));
               class150.method792(var1);
               class52.field762 = class96.field1263;
               class52.field761 = 94;
               client.field452 = 130;
            }
         } else if (client.field452 == 130) {
            if (!class361.field3239.method872()) {
               class52.field762 = class96.field1051 + class361.field3239.method1154() * 4 / 5 + "%";
               class52.field761 = 96;
            } else if (!class71.field849.method872()) {
               class52.field762 = class96.field1051 + (80 + class71.field849.method1154() / 6) + "%";
               class52.field761 = 96;
            } else if (!class307.field2902.method872()) {
               class52.field762 = class96.field1051 + (96 + class307.field2902.method1154() / 50) + "%";
               class52.field761 = 96;
            } else {
               class52.field762 = class96.field1140;
               class52.field761 = 98;
               client.field452 = 140;
            }
         } else if (client.field452 == 140) {
            class52.field761 = 100;
            if (!class39.field366.method891(class48.field421.field419)) {
               class52.field762 = class96.field1018 + class39.field366.method870(class48.field421.field419) / 10 + "%";
            } else {
               if (null == class237.field2566) {
                  class237.field2566 = new class386();
                  class237.field2566.method1825(class39.field366, class286.field2786, class430.field3589, class299.field2880, client.field487, class363.field3250);
               }

               class52.field762 = class96.field1306;
               client.field452 = 150;
            }
         } else if (client.field452 == 150) {
            class72.method402(10);
         }
      }
   }
}
