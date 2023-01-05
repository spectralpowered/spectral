public final class class340 {
   public static byte[][] field2723;
   static class344[] field2721;
   int field2716;
   int field2717;
   int field2720;
   int field2722;
   public class295 field2718;
   public long field2719;

   static final void method1707(class334 var0, int var1) {
      class242 var4;
      int var5;
      class242 var12;
      int var13;
      int var14;
      if (var0.field2663 >= client.field231) {
         class424.method2070(var0);
      } else {
         int var6;
         int var8;
         int var9;
         if (var0.field2664 >= client.field231) {
            boolean var3 = client.field231 == var0.field2664 || var0.field2649 == -1 || var0.field2652 != 0;
            if (!var3) {
               var4 = class271.method1277(var0.field2649);
               if (null != var4 && !var4.method1056()) {
                  var3 = 1 + var0.field2651 > var4.field2037[var0.field2640];
               } else {
                  var3 = true;
               }
            }

            if (var3) {
               var13 = var0.field2664 - var0.field2663;
               var5 = client.field231 - var0.field2663;
               var6 = var0.field2611 * -31241280 + var0.field2626 * -600195968;
               int var7 = var0.field2611 * -31241280 + var0.field2615 * 221025152;
               var8 = var0.field2611 * -31241280 + var0.field2660 * -2082827392;
               var9 = var0.field2643 * -1434588800 + var0.field2611 * -31241280;
               var0.field2672 = (var8 * var5 + (var13 - var5) * var6) / var13;
               var0.field2608 = (var9 * var5 + (var13 - var5) * var7) / var13;
            }

            var0.field2669 = 0;
            var0.field2674 = var0.field2665;
            var0.field2622 = var0.field2674;
         } else {
            var0.field2645 = var0.field2613;
            if (var0.field2607 == 0) {
               var0.field2669 = 0;
            } else {
               label496: {
                  if (-1 != var0.field2649 && var0.field2652 == 0) {
                     var12 = class271.method1277(var0.field2649);
                     if (var0.field2682 > 0 && 0 == var12.field2039) {
                        ++var0.field2669;
                        break label496;
                     }

                     if (var0.field2682 <= 0 && var12.field2034 == 0) {
                        ++var0.field2669;
                        break label496;
                     }
                  }

                  var14 = var0.field2672;
                  var13 = var0.field2608;
                  var5 = var0.field2611 * -31241280 + var0.field2633[var0.field2607 - 1] * 128;
                  var6 = var0.field2681[var0.field2607 - 1] * 128 + var0.field2611 * -31241280;
                  if (var14 < var5) {
                     if (var13 < var6) {
                        var0.field2674 = 1280;
                     } else if (var13 > var6) {
                        var0.field2674 = 1792;
                     } else {
                        var0.field2674 = 1536;
                     }
                  } else if (var14 > var5) {
                     if (var13 < var6) {
                        var0.field2674 = 768;
                     } else if (var13 > var6) {
                        var0.field2674 = 256;
                     } else {
                        var0.field2674 = 512;
                     }
                  } else if (var13 < var6) {
                     var0.field2674 = 1024;
                  } else if (var13 > var6) {
                     var0.field2674 = 0;
                  }

                  class294 var15 = var0.field2661[var0.field2607 - 1];
                  if (var5 - var14 <= 256 && var5 - var14 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
                     var8 = var0.field2674 - var0.field2622 & 2047;
                     if (var8 > 1024) {
                        var8 -= 2048;
                     }

                     var9 = var0.field2677;
                     if (var8 >= -256 && var8 <= 256) {
                        var9 = var0.field2616;
                     } else if (var8 >= 256 && var8 < 768) {
                        var9 = var0.field2619;
                     } else if (var8 >= -768 && var8 <= -256) {
                        var9 = var0.field2634;
                     }

                     if (var9 == -1) {
                        var9 = var0.field2616;
                     }

                     var0.field2645 = var9;
                     int var10 = 4;
                     boolean var11 = true;
                     if (var0 instanceof class267) {
                        var11 = ((class267)var0).field2213.field3497;
                     }

                     if (var11) {
                        if (var0.field2622 != var0.field2674 && -1 == var0.field2641 && 0 != var0.field2679) {
                           var10 = 2;
                        }

                        if (var0.field2607 > 2) {
                           var10 = 6;
                        }

                        if (var0.field2607 > 3) {
                           var10 = 8;
                        }

                        if (var0.field2669 > 0 && var0.field2607 > 1) {
                           var10 = 8;
                           --var0.field2669;
                        }
                     } else {
                        if (var0.field2607 > 1) {
                           var10 = 6;
                        }

                        if (var0.field2607 > 2) {
                           var10 = 8;
                        }

                        if (var0.field2669 > 0 && var0.field2607 > 1) {
                           var10 = 8;
                           --var0.field2669;
                        }
                     }

                     if (class294.field2388 == var15) {
                        var10 <<= 1;
                     } else if (class294.field2387 == var15) {
                        var10 >>= 1;
                     }

                     if (var10 >= 8) {
                        if (var0.field2645 == var0.field2616 && -1 != var0.field2610) {
                           var0.field2645 = var0.field2610;
                        } else if (var0.field2645 == var0.field2677 && -1 != var0.field2621) {
                           var0.field2645 = var0.field2621;
                        } else if (var0.field2634 == var0.field2645 && var0.field2631 != -1) {
                           var0.field2645 = var0.field2631;
                        } else if (var0.field2619 == var0.field2645 && -1 != var0.field2623) {
                           var0.field2645 = var0.field2623;
                        }
                     } else if (var10 <= 1) {
                        if (var0.field2616 == var0.field2645 && var0.field2624 != -1) {
                           var0.field2645 = var0.field2624;
                        } else if (var0.field2645 == var0.field2677 && -1 != var0.field2625) {
                           var0.field2645 = var0.field2625;
                        } else if (var0.field2645 == var0.field2634 && -1 != var0.field2656) {
                           var0.field2645 = var0.field2656;
                        } else if (var0.field2645 == var0.field2619 && -1 != var0.field2627) {
                           var0.field2645 = var0.field2627;
                        }
                     }

                     if (var5 != var14 || var13 != var6) {
                        if (var14 < var5) {
                           var0.field2672 += var10;
                           if (var0.field2672 > var5) {
                              var0.field2672 = var5;
                           }
                        } else if (var14 > var5) {
                           var0.field2672 -= var10;
                           if (var0.field2672 < var5) {
                              var0.field2672 = var5;
                           }
                        }

                        if (var13 < var6) {
                           var0.field2608 += var10;
                           if (var0.field2608 > var6) {
                              var0.field2608 = var6;
                           }
                        } else if (var13 > var6) {
                           var0.field2608 -= var10;
                           if (var0.field2608 < var6) {
                              var0.field2608 = var6;
                           }
                        }
                     }

                     if (var5 == var0.field2672 && var0.field2608 == var6) {
                        --var0.field2607;
                        if (var0.field2682 > 0) {
                           --var0.field2682;
                        }
                     }
                  } else {
                     var0.field2672 = var5;
                     var0.field2608 = var6;
                     --var0.field2607;
                     if (var0.field2682 > 0) {
                        --var0.field2682;
                     }
                  }
               }
            }
         }
      }

      if (var0.field2672 < 128 || var0.field2608 < 128 || var0.field2672 >= 13184 || var0.field2608 >= 13184) {
         var0.field2649 = -1;
         var0.field2654 = -1;
         var0.field2663 = 0;
         var0.field2664 = 0;
         var0.field2672 = var0.field2633[0] * 128 + var0.field2611 * -31241280;
         var0.field2608 = var0.field2681[0] * 128 + var0.field2611 * -31241280;
         var0.method1677();
      }

      if (class113.field846 == var0 && (var0.field2672 < 1536 || var0.field2608 < 1536 || var0.field2672 >= 11776 || var0.field2608 >= 11776)) {
         var0.field2649 = -1;
         var0.field2654 = -1;
         var0.field2663 = 0;
         var0.field2664 = 0;
         var0.field2672 = 128 * var0.field2633[0] + var0.field2611 * -31241280;
         var0.field2608 = var0.field2681[0] * 128 + var0.field2611 * -31241280;
         var0.method1677();
      }

      class9.method58(var0);
      var0.field2609 = false;
      if (var0.field2645 != -1) {
         var12 = class271.method1277(var0.field2645);
         if (var12 != null) {
            if (!var12.method1056() && null != var12.field2043) {
               ++var0.field2647;
               if (var0.field2646 < var12.field2043.length && var0.field2647 > var12.field2037[var0.field2646]) {
                  var0.field2647 = 1;
                  ++var0.field2646;
                  class17.method84(var12, var0.field2646, var0.field2672, var0.field2608);
               }

               if (var0.field2646 >= var12.field2043.length) {
                  if (var12.field2046 > 0) {
                     var0.field2646 -= var12.field2046;
                     if (var12.field2047) {
                        ++var0.field2648;
                     }

                     if (var0.field2646 < 0 || var0.field2646 >= var12.field2043.length || var12.field2047 && var0.field2648 >= var12.field2050) {
                        var0.field2647 = 0;
                        var0.field2646 = 0;
                        var0.field2648 = 0;
                     }
                  } else {
                     var0.field2647 = 0;
                     var0.field2646 = 0;
                  }

                  class17.method84(var12, var0.field2646, var0.field2672, var0.field2608);
               }
            } else if (var12.method1056()) {
               ++var0.field2646;
               var13 = var12.method1058();
               if (var0.field2646 < var13) {
                  class91.method383(var12, var0.field2646, var0.field2672, var0.field2608);
               } else {
                  if (var12.field2046 > 0) {
                     var0.field2646 -= var12.field2046;
                     if (var12.field2047) {
                        ++var0.field2648;
                     }

                     if (var0.field2646 < 0 || var0.field2646 >= var13 || var12.field2047 && var0.field2648 >= var12.field2050) {
                        var0.field2646 = 0;
                        var0.field2647 = 0;
                        var0.field2648 = 0;
                     }
                  } else {
                     var0.field2647 = 0;
                     var0.field2646 = 0;
                  }

                  class91.method383(var12, var0.field2646, var0.field2672, var0.field2608);
               }
            } else {
               var0.field2645 = -1;
            }
         } else {
            var0.field2645 = -1;
         }
      }

      if (-1 != var0.field2654 && client.field231 >= var0.field2657) {
         if (var0.field2655 < 0) {
            var0.field2655 = 0;
         }

         var14 = class429.method2119(var0.field2654).field2585;
         if (var14 != -1) {
            var4 = class271.method1277(var14);
            if (var4 != null && var4.field2043 != null && !var4.method1056()) {
               ++var0.field2644;
               if (var0.field2655 < var4.field2043.length && var0.field2644 > var4.field2037[var0.field2655]) {
                  var0.field2644 = 1;
                  ++var0.field2655;
                  class17.method84(var4, var0.field2655, var0.field2672, var0.field2608);
               }

               if (var0.field2655 >= var4.field2043.length && (var0.field2655 < 0 || var0.field2655 >= var4.field2043.length)) {
                  var0.field2654 = -1;
               }
            } else if (var4.method1056()) {
               ++var0.field2655;
               var5 = var4.method1058();
               if (var0.field2655 < var5) {
                  class91.method383(var4, var0.field2655, var0.field2672, var0.field2608);
               } else if (var0.field2655 < 0 || var0.field2655 >= var5) {
                  var0.field2654 = -1;
               }
            } else {
               var0.field2654 = -1;
            }
         } else {
            var0.field2654 = -1;
         }
      }

      if (var0.field2649 != -1 && var0.field2652 <= 1) {
         var12 = class271.method1277(var0.field2649);
         if (1 == var12.field2039 && var0.field2682 > 0 && var0.field2663 <= client.field231 && var0.field2664 < client.field231) {
            var0.field2652 = 1;
            return;
         }
      }

      if (-1 != var0.field2649 && 0 == var0.field2652) {
         var12 = class271.method1277(var0.field2649);
         if (null == var12) {
            var0.field2649 = -1;
         } else if (!var12.method1056() && null != var12.field2043) {
            ++var0.field2651;
            if (var0.field2640 < var12.field2043.length && var0.field2651 > var12.field2037[var0.field2640]) {
               var0.field2651 = 1;
               ++var0.field2640;
               class17.method84(var12, var0.field2640, var0.field2672, var0.field2608);
            }

            if (var0.field2640 >= var12.field2043.length) {
               var0.field2640 -= var12.field2046;
               ++var0.field2653;
               if (var0.field2653 >= var12.field2050) {
                  var0.field2649 = -1;
               } else if (var0.field2640 >= 0 && var0.field2640 < var12.field2043.length) {
                  class17.method84(var12, var0.field2640, var0.field2672, var0.field2608);
               } else {
                  var0.field2649 = -1;
               }
            }

            var0.field2609 = var12.field2031;
         } else if (var12.method1056()) {
            ++var0.field2640;
            var13 = var12.method1058();
            if (var0.field2640 < var13) {
               class91.method383(var12, var0.field2640, var0.field2672, var0.field2608);
            } else {
               var0.field2640 -= var12.field2046;
               ++var0.field2653;
               if (var0.field2653 >= var12.field2050) {
                  var0.field2649 = -1;
               } else if (var0.field2640 >= 0 && var0.field2640 < var13) {
                  class91.method383(var12, var0.field2640, var0.field2672, var0.field2608);
               } else {
                  var0.field2649 = -1;
               }
            }
         } else {
            var0.field2649 = -1;
         }
      }

      if (var0.field2652 > 0) {
         --var0.field2652;
      }

   }

   static class39 method1706(int var0, int var1) {
      client.field518.field195 = var0;
      client.field518.field198 = var1;
      client.field518.field196 = 1579007973;
      client.field518.field197 = -1169949035;
      return client.field518;
   }
}
