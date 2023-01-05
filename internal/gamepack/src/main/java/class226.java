public class class226 extends class441 {
   void method1143(class134 var1) {
      int var3 = var1.method669();
      if (var3 != class325.field3045.field3046) {
         throw new IllegalStateException("");
      } else {
         super.field3647 = var1.method669();
         super.field3640 = var1.method669();
         super.field3639 = var1.method671();
         super.field3636 = var1.method671();
         super.field3637 = var1.method671();
         super.field3643 = var1.method671();
         super.field3635 = var1.method682();
         super.field3642 = var1.method682();
      }
   }

   void method2103(class134 var1) {
      super.field3640 = Math.min(super.field3640, 4);
      super.field3644 = new short[1][64][64];
      super.field3638 = new short[super.field3640][64][64];
      super.field3645 = new byte[super.field3640][64][64];
      super.field3646 = new byte[super.field3640][64][64];
      super.field3641 = new class50[super.field3640][64][64][];
      int var3 = var1.method669();
      if (class158.field1644.field1646 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.method669();
         int var5 = var1.method669();
         if (super.field3637 == var4 && super.field3643 == var5) {
            for(int var6 = 0; var6 < 64; ++var6) {
               for(int var7 = 0; var7 < 64; ++var7) {
                  this.method2100(var6, var7, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class226)) {
         return false;
      } else {
         class226 var2 = (class226)var1;
         return super.field3637 == var2.field3637 && var2.field3643 == super.field3643;
      }
   }

   public int hashCode() {
      return super.field3637 | super.field3643 << 8;
   }

   static final void method1145(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
      if (var2 >= 2000) {
         var2 -= 2000;
      }

      class81 var10;
      if (var2 == 3) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1786, client.field483.field3459);
         var10.field933.method666(client.field664.method2272(82) ? 1 : 0);
         var10.field933.method695(var0 + class381.field3325);
         var10.field933.method694(var1 + class345.field3166);
         var10.field933.method655(var3);
         client.field483.method1920(var10);
      }

      if (var2 == 43) {
         var10 = class189.method982(class165.field1780, client.field483.field3459);
         var10.field933.method655(var4);
         var10.field933.method694(var0);
         var10.field933.method701(var1);
         client.field483.method1920(var10);
         client.field541 = 0;
         class215.field2405 = class274.method1301(var1);
         client.field542 = var0;
      }

      if (var2 == 34) {
         var10 = class189.method982(class165.field1770, client.field483.field3459);
         var10.field933.method695(var4);
         var10.field933.method701(var1);
         var10.field933.method706(var0);
         client.field483.method1920(var10);
         client.field541 = 0;
         class215.field2405 = class274.method1301(var1);
         client.field542 = var0;
      }

      class81 var11;
      class47 var13;
      if (var2 == 47) {
         var13 = client.field551[var3];
         if (var13 != null) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1716, client.field483.field3459);
            var11.field933.method655(var3);
            var11.field933.method690(client.field664.method2272(82) ? 1 : 0);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 17) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1733, client.field483.field3459);
         var10.field933.method655(class345.field3166 + var1);
         var10.field933.method655(client.field593);
         var10.field933.method703(class307.field2899);
         var10.field933.method695(class381.field3325 + var0);
         var10.field933.method655(var3);
         var10.field933.method688(client.field664.method2272(82) ? 1 : 0);
         var10.field933.method655(client.field594);
         client.field483.method1920(var10);
      }

      if (var2 == 31) {
         var10 = class189.method982(class165.field1800, client.field483.field3459);
         var10.field933.method703(var1);
         var10.field933.method701(class213.field2392);
         var10.field933.method655(var4);
         var10.field933.method706(class281.field2780);
         var10.field933.method706(var0);
         var10.field933.method655(class132.field1477);
         client.field483.method1920(var10);
         client.field541 = 0;
         class215.field2405 = class274.method1301(var1);
         client.field542 = var0;
      }

      class53 var15;
      if (var2 == 7) {
         var15 = client.field669[var3];
         if (var15 != null) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1751, client.field483.field3459);
            var11.field933.method702(class213.field2392);
            var11.field933.method690(client.field664.method2272(82) ? 1 : 0);
            var11.field933.method695(var3);
            var11.field933.method694(class281.field2780);
            var11.field933.method694(class132.field1477);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 21) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1781, client.field483.field3459);
         var10.field933.method694(var0 + class381.field3325);
         var10.field933.method690(client.field664.method2272(82) ? 1 : 0);
         var10.field933.method655(class345.field3166 + var1);
         var10.field933.method655(var3);
         client.field483.method1920(var10);
      }

      class210 var16;
      if (var2 == 58) {
         var16 = class34.method169(var1, var0);
         if (null != var16) {
            if (null != var16.field2325) {
               class169 var14 = new class169();
               var14.field1848 = var16;
               var14.field1851 = var3;
               var14.field1854 = var6;
               var14.field1850 = var16.field2325;
               class194.method1001(var14);
            }

            var11 = class189.method982(class165.field1822, client.field483.field3459);
            var11.field933.method706(client.field594);
            var11.field933.method656(var1);
            var11.field933.method703(class307.field2899);
            var11.field933.method695(client.field593);
            var11.field933.method706(var0);
            var11.field933.method695(var4);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 51) {
         var13 = client.field551[var3];
         if (null != var13) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1807, client.field483.field3459);
            var11.field933.method695(var3);
            var11.field933.method688(client.field664.method2272(82) ? 1 : 0);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 1) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1738, client.field483.field3459);
         var10.field933.method706(var3);
         var10.field933.method706(class345.field3166 + var1);
         var10.field933.method706(class281.field2780);
         var10.field933.method694(class132.field1477);
         var10.field933.method701(class213.field2392);
         var10.field933.method694(var0 + class381.field3325);
         var10.field933.method666(client.field664.method2272(82) ? 1 : 0);
         client.field483.method1920(var10);
      }

      int var12;
      class210 var17;
      if (var2 == 28) {
         var10 = class189.method982(class165.field1802, client.field483.field3459);
         var10.field933.method656(var1);
         client.field483.method1920(var10);
         var17 = class274.method1301(var1);
         if (null != var17 && var17.field2207 != null && var17.field2207[0][0] == 5) {
            var12 = var17.field2207[0][1];
            class484.field3992[var12] = 1 - class484.field3992[var12];
            class334.method1617(var12);
         }
      }

      if (var2 == 29) {
         var10 = class189.method982(class165.field1802, client.field483.field3459);
         var10.field933.method656(var1);
         client.field483.method1920(var10);
         var17 = class274.method1301(var1);
         if (null != var17 && null != var17.field2207 && 5 == var17.field2207[0][0]) {
            var12 = var17.field2207[0][1];
            if (class484.field3992[var12] != var17.field2344[0]) {
               class484.field3992[var12] = var17.field2344[0];
               class334.method1617(var12);
            }
         }
      }

      if (var2 == 49) {
         var13 = client.field551[var3];
         if (var13 != null) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1735, client.field483.field3459);
            var11.field933.method690(client.field664.method2272(82) ? 1 : 0);
            var11.field933.method655(var3);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 26) {
         class341.method1637();
      }

      if (var2 == 14) {
         var13 = client.field551[var3];
         if (var13 != null) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1755, client.field483.field3459);
            var11.field933.method690(client.field664.method2272(82) ? 1 : 0);
            var11.field933.method703(class213.field2392);
            var11.field933.method695(class281.field2780);
            var11.field933.method695(class132.field1477);
            var11.field933.method694(var3);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
         class237.field2566.method1878(var2, var3, new class308(var0), new class308(var1));
      }

      if (var2 == 46) {
         var13 = client.field551[var3];
         if (null != var13) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1763, client.field483.field3459);
            var11.field933.method666(client.field664.method2272(82) ? 1 : 0);
            var11.field933.method695(var3);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 39) {
         var10 = class189.method982(class165.field1728, client.field483.field3459);
         var10.field933.method656(var1);
         var10.field933.method694(var4);
         var10.field933.method695(var0);
         client.field483.method1920(var10);
         client.field541 = 0;
         class215.field2405 = class274.method1301(var1);
         client.field542 = var0;
      }

      if (var2 == 37) {
         var10 = class189.method982(class165.field1773, client.field483.field3459);
         var10.field933.method703(var1);
         var10.field933.method655(var4);
         var10.field933.method694(var0);
         client.field483.method1920(var10);
         client.field541 = 0;
         class215.field2405 = class274.method1301(var1);
         client.field542 = var0;
      }

      if (var2 == 41) {
         var10 = class189.method982(class165.field1785, client.field483.field3459);
         var10.field933.method702(var1);
         var10.field933.method695(var0);
         var10.field933.method694(var4);
         client.field483.method1920(var10);
         client.field541 = 0;
         class215.field2405 = class274.method1301(var1);
         client.field542 = var0;
      }

      if (var2 == 16) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1730, client.field483.field3459);
         var10.field933.method655(var3);
         var10.field933.method694(class345.field3166 + var1);
         var10.field933.method689(client.field664.method2272(82) ? 1 : 0);
         var10.field933.method695(class281.field2780);
         var10.field933.method656(class213.field2392);
         var10.field933.method695(class132.field1477);
         var10.field933.method694(var0 + class381.field3325);
         client.field483.method1920(var10);
      }

      if (var2 == 18) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1779, client.field483.field3459);
         var10.field933.method706(var1 + class345.field3166);
         var10.field933.method666(client.field664.method2272(82) ? 1 : 0);
         var10.field933.method695(var3);
         var10.field933.method706(var0 + class381.field3325);
         client.field483.method1920(var10);
      }

      if (var2 == 48) {
         var13 = client.field551[var3];
         if (var13 != null) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1757, client.field483.field3459);
            var11.field933.method706(var3);
            var11.field933.method690(client.field664.method2272(82) ? 1 : 0);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 1001) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1788, client.field483.field3459);
         var10.field933.method695(class345.field3166 + var1);
         var10.field933.method655(class381.field3325 + var0);
         var10.field933.method694(var3);
         var10.field933.method688(client.field664.method2272(82) ? 1 : 0);
         client.field483.method1920(var10);
      }

      if (var2 == 9) {
         var15 = client.field669[var3];
         if (var15 != null) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1806, client.field483.field3459);
            var11.field933.method706(var3);
            var11.field933.method688(client.field664.method2272(82) ? 1 : 0);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 4) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1769, client.field483.field3459);
         var10.field933.method688(client.field664.method2272(82) ? 1 : 0);
         var10.field933.method706(var3);
         var10.field933.method695(class345.field3166 + var1);
         var10.field933.method706(class381.field3325 + var0);
         client.field483.method1920(var10);
      }

      if (var2 == 5) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1749, client.field483.field3459);
         var10.field933.method688(client.field664.method2272(82) ? 1 : 0);
         var10.field933.method695(class345.field3166 + var1);
         var10.field933.method694(var0 + class381.field3325);
         var10.field933.method694(var3);
         client.field483.method1920(var10);
      }

      if (var2 == 15) {
         var13 = client.field551[var3];
         if (var13 != null) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1765, client.field483.field3459);
            var11.field933.method655(var3);
            var11.field933.method688(client.field664.method2272(82) ? 1 : 0);
            var11.field933.method706(client.field593);
            var11.field933.method656(class307.field2899);
            var11.field933.method695(client.field594);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 35) {
         var10 = class189.method982(class165.field1762, client.field483.field3459);
         var10.field933.method656(var1);
         var10.field933.method694(var4);
         var10.field933.method694(var0);
         client.field483.method1920(var10);
         client.field541 = 0;
         class215.field2405 = class274.method1301(var1);
         client.field542 = var0;
      }

      if (var2 == 6) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1740, client.field483.field3459);
         var10.field933.method655(var3);
         var10.field933.method689(client.field664.method2272(82) ? 1 : 0);
         var10.field933.method695(class345.field3166 + var1);
         var10.field933.method706(class381.field3325 + var0);
         client.field483.method1920(var10);
      }

      if (var2 == 44) {
         var13 = client.field551[var3];
         if (null != var13) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var11 = class189.method982(class165.field1760, client.field483.field3459);
            var11.field933.method666(client.field664.method2272(82) ? 1 : 0);
            var11.field933.method655(var3);
            client.field483.method1920(var11);
         }
      }

      if (var2 == 30 && client.field603 == null) {
         class115.method599(var1, var0);
         client.field603 = class34.method169(var1, var0);
         class214.method1117(client.field603);
      }

      if (var2 == 20) {
         client.field498 = var7;
         client.field431 = var8;
         client.field539 = 2;
         client.field517 = 0;
         client.field677 = var0;
         client.field423 = var1;
         var10 = class189.method982(class165.field1731, client.field483.field3459);
         var10.field933.method694(class381.field3325 + var0);
         var10.field933.method706(var3);
         var10.field933.method706(class345.field3166 + var1);
         var10.field933.method688(client.field664.method2272(82) ? 1 : 0);
         client.field483.method1920(var10);
      }

      if (var2 == 23) {
         if (client.field572) {
            class13.field126.method76();
         } else {
            class13.field126.method69(class195.field2036, var0, var1, true);
         }
      }

      if (var2 == 57 || var2 == 1007) {
         var16 = class34.method169(var1, var0);
         if (null != var16) {
            class83.method444(var3, var1, var0, var4, var6);
         }
      }

      if (var2 == 38) {
         class210.method1103();
         var16 = class274.method1301(var1);
         client.field590 = 1;
         class281.field2780 = var0;
         class213.field2392 = var1;
         class132.field1477 = var4;
         class214.method1117(var16);
         client.field687 = class334.method1616(16748608) + class272.method1294(var4).field3764 + class334.method1616(16777215);
         if (null == client.field687) {
            client.field687 = class96.field1020;
         }

      } else {
         if (var2 == 10) {
            var15 = client.field669[var3];
            if (null != var15) {
               client.field498 = var7;
               client.field431 = var8;
               client.field539 = 2;
               client.field517 = 0;
               client.field677 = var0;
               client.field423 = var1;
               var11 = class189.method982(class165.field1737, client.field483.field3459);
               var11.field933.method695(var3);
               var11.field933.method666(client.field664.method2272(82) ? 1 : 0);
               client.field483.method1920(var11);
            }
         }

         if (var2 == 33) {
            var10 = class189.method982(class165.field1764, client.field483.field3459);
            var10.field933.method706(var0);
            var10.field933.method703(var1);
            var10.field933.method694(var4);
            client.field483.method1920(var10);
            client.field541 = 0;
            class215.field2405 = class274.method1301(var1);
            client.field542 = var0;
         }

         if (var2 == 1005) {
            var16 = class274.method1301(var1);
            if (var16 != null && var16.field2253[var0] >= 100000) {
               class237.method1197(27, "", var16.field2253[var0] + " x " + class272.method1294(var4).field3764);
            } else {
               var11 = class189.method982(class165.field1796, client.field483.field3459);
               var11.field933.method695(var4);
               client.field483.method1920(var11);
            }

            client.field541 = 0;
            class215.field2405 = class274.method1301(var1);
            client.field542 = var0;
         }

         if (var2 == 36) {
            var10 = class189.method982(class165.field1791, client.field483.field3459);
            var10.field933.method703(var1);
            var10.field933.method655(var0);
            var10.field933.method695(var4);
            client.field483.method1920(var10);
            client.field541 = 0;
            class215.field2405 = class274.method1301(var1);
            client.field542 = var0;
         }

         if (var2 == 32) {
            var10 = class189.method982(class165.field1718, client.field483.field3459);
            var10.field933.method706(client.field593);
            var10.field933.method695(var4);
            var10.field933.method702(class307.field2899);
            var10.field933.method695(var0);
            var10.field933.method701(var1);
            client.field483.method1920(var10);
            client.field541 = 0;
            class215.field2405 = class274.method1301(var1);
            client.field542 = var0;
         }

         if (var2 == 19) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var10 = class189.method982(class165.field1775, client.field483.field3459);
            var10.field933.method706(var3);
            var10.field933.method688(client.field664.method2272(82) ? 1 : 0);
            var10.field933.method655(var1 + class345.field3166);
            var10.field933.method694(class381.field3325 + var0);
            client.field483.method1920(var10);
         }

         class81 var18;
         if (var2 == 24) {
            var16 = class274.method1301(var1);
            if (null != var16) {
               boolean var19 = true;
               if (var16.field2315 > 0) {
                  var19 = class53.method314(var16);
               }

               if (var19) {
                  var18 = class189.method982(class165.field1802, client.field483.field3459);
                  var18.field933.method656(var1);
                  client.field483.method1920(var18);
               }
            }
         }

         if (var2 == 12) {
            var15 = client.field669[var3];
            if (var15 != null) {
               client.field498 = var7;
               client.field431 = var8;
               client.field539 = 2;
               client.field517 = 0;
               client.field677 = var0;
               client.field423 = var1;
               var11 = class189.method982(class165.field1771, client.field483.field3459);
               var11.field933.method689(client.field664.method2272(82) ? 1 : 0);
               var11.field933.method655(var3);
               client.field483.method1920(var11);
            }
         }

         if (var2 == 1004) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            var10 = class189.method982(class165.field1801, client.field483.field3459);
            var10.field933.method694(var0 + class381.field3325);
            var10.field933.method655(class345.field3166 + var1);
            var10.field933.method695(var3);
            client.field483.method1920(var10);
         }

         if (var2 == 13) {
            var15 = client.field669[var3];
            if (var15 != null) {
               client.field498 = var7;
               client.field431 = var8;
               client.field539 = 2;
               client.field517 = 0;
               client.field677 = var0;
               client.field423 = var1;
               var11 = class189.method982(class165.field1736, client.field483.field3459);
               var11.field933.method695(var3);
               var11.field933.method689(client.field664.method2272(82) ? 1 : 0);
               client.field483.method1920(var11);
            }
         }

         if (var2 == 22) {
            client.field498 = var7;
            client.field431 = var8;
            client.field539 = 2;
            client.field517 = 0;
            client.field677 = var0;
            client.field423 = var1;
            var10 = class189.method982(class165.field1792, client.field483.field3459);
            var10.field933.method695(class345.field3166 + var1);
            var10.field933.method706(var3);
            var10.field933.method688(client.field664.method2272(82) ? 1 : 0);
            var10.field933.method706(class381.field3325 + var0);
            client.field483.method1920(var10);
         }

         if (var2 == 8) {
            var15 = client.field669[var3];
            if (var15 != null) {
               client.field498 = var7;
               client.field431 = var8;
               client.field539 = 2;
               client.field517 = 0;
               client.field677 = var0;
               client.field423 = var1;
               var11 = class189.method982(class165.field1722, client.field483.field3459);
               var11.field933.method694(client.field593);
               var11.field933.method695(var3);
               var11.field933.method703(class307.field2899);
               var11.field933.method694(client.field594);
               var11.field933.method690(client.field664.method2272(82) ? 1 : 0);
               client.field483.method1920(var11);
            }
         }

         if (var2 == 45) {
            var13 = client.field551[var3];
            if (var13 != null) {
               client.field498 = var7;
               client.field431 = var8;
               client.field539 = 2;
               client.field517 = 0;
               client.field677 = var0;
               client.field423 = var1;
               var11 = class189.method982(class165.field1816, client.field483.field3459);
               var11.field933.method694(var3);
               var11.field933.method666(client.field664.method2272(82) ? 1 : 0);
               client.field483.method1920(var11);
            }
         }

         if (var2 == 40) {
            var10 = class189.method982(class165.field1808, client.field483.field3459);
            var10.field933.method655(var0);
            var10.field933.method656(var1);
            var10.field933.method706(var4);
            client.field483.method1920(var10);
            client.field541 = 0;
            class215.field2405 = class274.method1301(var1);
            client.field542 = var0;
         }

         if (var2 == 25) {
            var16 = class34.method169(var1, var0);
            if (null != var16) {
               class210.method1103();
               class363.method1755(var1, var0, class393.method1910(class172.method913(var16)), var4);
               client.field590 = 0;
               client.field595 = class97.method547(var16);
               if (client.field595 == null) {
                  client.field595 = class96.field1020;
               }

               if (var16.field2215) {
                  client.field714 = var16.field2216 + class334.method1616(16777215);
               } else {
                  client.field714 = class334.method1616(65280) + var16.field2322 + class334.method1616(16777215);
               }
            }

         } else {
            if (var2 == 1002) {
               client.field498 = var7;
               client.field431 = var8;
               client.field539 = 2;
               client.field517 = 0;
               var10 = class189.method982(class165.field1820, client.field483.field3459);
               var10.field933.method695(var3);
               client.field483.method1920(var10);
            }

            if (var2 == 1003) {
               client.field498 = var7;
               client.field431 = var8;
               client.field539 = 2;
               client.field517 = 0;
               var15 = client.field669[var3];
               if (var15 != null) {
                  class272 var20 = var15.field798;
                  if (var20.field2743 != null) {
                     var20 = var20.method1286();
                  }

                  if (null != var20) {
                     var18 = class189.method982(class165.field1772, client.field483.field3459);
                     var18.field933.method695(var20.field2711);
                     client.field483.method1920(var18);
                  }
               }
            }

            if (var2 == 2) {
               client.field498 = var7;
               client.field431 = var8;
               client.field539 = 2;
               client.field517 = 0;
               client.field677 = var0;
               client.field423 = var1;
               var10 = class189.method982(class165.field1821, client.field483.field3459);
               var10.field933.method695(class381.field3325 + var0);
               var10.field933.method706(client.field593);
               var10.field933.method702(class307.field2899);
               var10.field933.method694(client.field594);
               var10.field933.method655(var1 + class345.field3166);
               var10.field933.method689(client.field664.method2272(82) ? 1 : 0);
               var10.field933.method694(var3);
               client.field483.method1920(var10);
            }

            if (var2 == 11) {
               var15 = client.field669[var3];
               if (var15 != null) {
                  client.field498 = var7;
                  client.field431 = var8;
                  client.field539 = 2;
                  client.field517 = 0;
                  client.field677 = var0;
                  client.field423 = var1;
                  var11 = class189.method982(class165.field1809, client.field483.field3459);
                  var11.field933.method694(var3);
                  var11.field933.method666(client.field664.method2272(82) ? 1 : 0);
                  client.field483.method1920(var11);
               }
            }

            if (var2 == 42) {
               var10 = class189.method982(class165.field1725, client.field483.field3459);
               var10.field933.method706(var0);
               var10.field933.method706(var4);
               var10.field933.method703(var1);
               client.field483.method1920(var10);
               client.field541 = 0;
               class215.field2405 = class274.method1301(var1);
               client.field542 = var0;
            }

            if (var2 == 50) {
               var13 = client.field551[var3];
               if (var13 != null) {
                  client.field498 = var7;
                  client.field431 = var8;
                  client.field539 = 2;
                  client.field517 = 0;
                  client.field677 = var0;
                  client.field423 = var1;
                  var11 = class189.method982(class165.field1774, client.field483.field3459);
                  var11.field933.method695(var3);
                  var11.field933.method690(client.field664.method2272(82) ? 1 : 0);
                  client.field483.method1920(var11);
               }
            }

            if (0 != client.field590) {
               client.field590 = 0;
               class214.method1117(class274.method1301(class213.field2392));
            }

            if (client.field592) {
               class210.method1103();
            }

            if (null != class215.field2405 && 0 == client.field541) {
               class214.method1117(class215.field2405);
            }

         }
      }
   }

   static void method1146() {
      class111.field1385.method1331(client.field428);
   }
}
