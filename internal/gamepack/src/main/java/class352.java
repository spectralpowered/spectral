import java.security.SecureRandom;

public class class352 {
   public static int field3183;
   static class407 field3182;
   static int field3185;
   static SecureRandom field3184;
   int field3180;
   int field3181;

   class352(int var1, int var2) {
      this.field3180 = var1;
      this.field3181 = var2;
   }

   boolean method1685(class271 var1) {
      if (null == var1) {
         return false;
      } else {
         switch(this.field3180) {
         case 1:
            return var1.method1281(this.field3181);
         case 2:
            return var1.method1282(this.field3181);
         case 3:
            return var1.method1279((char)this.field3181);
         case 4:
            return var1.method1280(this.field3181 == 1);
         default:
            return false;
         }
      }
   }

   static class467 method1688(int var0) {
      class467 var2 = (class467)class296.method1399(class90.method499(), var0);
      if (var2 == null) {
         var2 = class467.field3889;
      }

      return var2;
   }

   public static void method1687() {
      class392.field3456.method162();
   }

   static final void method1684() {
      class12.field91 = false;
      client.field478 = false;
   }

   static String method1689(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return client.field460[var0].length() > 0 ? client.field579[var0] + class96.field1191 + client.field460[var0] : client.field579[var0];
      }
   }

   static final void method1686(class210[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class362.method1732(var2, var3, var4, var5);
      class234.method1167();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         class210 var11 = var0[var10];
         if (null != var11 && (var11.field2234 == var1 || var1 == -1412584499 && client.field610 == var11)) {
            int var12;
            if (var8 == -1) {
               client.field651[client.field646] = var11.field2228 + var6;
               client.field652[client.field646] = var7 + var11.field2229;
               client.field639[client.field646] = var11.field2230;
               client.field451[client.field646] = var11.field2289;
               var12 = ++client.field646 - 1;
            } else {
               var12 = var8;
            }

            var11.field2360 = var12;
            var11.field2361 = client.field435;
            if (!var11.field2215 || !class88.method481(var11)) {
               if (var11.field2315 > 0) {
                  class199.method1007(var11);
               }

               int var13 = var11.field2228 + var6;
               int var14 = var7 + var11.field2229;
               int var15 = var11.field2346;
               int var16;
               int var17;
               if (var11 == client.field610) {
                  if (var1 != -1412584499 && !var11.field2304) {
                     class182.field1969 = var0;
                     class227.field2462 = var6;
                     class5.field29 = var7;
                     continue;
                  }

                  if (client.field621 && client.field662) {
                     var16 = class182.field1957;
                     var17 = class182.field1952;
                     var16 -= client.field612;
                     var17 -= client.field613;
                     if (var16 < client.field616) {
                        var16 = client.field616;
                     }

                     if (var11.field2230 + var16 > client.field611.field2230 + client.field616) {
                        var16 = client.field616 + client.field611.field2230 - var11.field2230;
                     }

                     if (var17 < client.field530) {
                        var17 = client.field530;
                     }

                     if (var11.field2289 + var17 > client.field530 + client.field611.field2289) {
                        var17 = client.field611.field2289 + client.field530 - var11.field2289;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.field2304) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (2 == var11.field2348) {
                  var16 = var2;
                  var17 = var3;
                  var18 = var4;
                  var19 = var5;
               } else if (var11.field2348 == 9) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var13 + var11.field2230;
                  var23 = var14 + var11.field2289;
                  if (var22 < var13) {
                     var20 = var22;
                     var22 = var13;
                  }

                  if (var23 < var14) {
                     var21 = var23;
                     var23 = var14;
                  }

                  ++var22;
                  ++var23;
                  var16 = var20 > var2 ? var20 : var2;
                  var17 = var21 > var3 ? var21 : var3;
                  var18 = var22 < var4 ? var22 : var4;
                  var19 = var23 < var5 ? var23 : var5;
               } else {
                  var20 = var13 + var11.field2230;
                  var21 = var11.field2289 + var14;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var20 < var4 ? var20 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.field2215 || var16 < var18 && var17 < var19) {
                  if (var11.field2315 != 0) {
                     if (1336 == var11.field2315) {
                        if (class111.field1385.method1320()) {
                           var14 += 15;
                           class441.field3651.method519("Fps:" + class141.field1517, var11.field2230 + var13, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var50 = Runtime.getRuntime();
                           var21 = (int)((var50.totalMemory() - var50.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !client.field478) {
                              var22 = 16711680;
                           }

                           class441.field3651.method519("Mem:" + var21 + "k", var11.field2230 + var13, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (var11.field2315 == 1337) {
                        client.field586 = var13;
                        client.field587 = var14;
                        class260.method1254(var13, var14, var11.field2230, var11.field2289);
                        client.field648[var11.field2360] = true;
                        class362.method1732(var2, var3, var4, var5);
                        continue;
                     }

                     if (1338 == var11.field2315) {
                        class47.method240(var11, var13, var14, var12);
                        class362.method1732(var2, var3, var4, var5);
                        continue;
                     }

                     if (1339 == var11.field2315) {
                        class346.method1666(var11, var13, var14, var12);
                        class362.method1732(var2, var3, var4, var5);
                        continue;
                     }

                     if (1400 == var11.field2315) {
                        class237.field2566.method1841(var13, var14, var11.field2230, var11.field2289, client.field435);
                     }

                     if (var11.field2315 == 1401) {
                        class237.field2566.method1863(var13, var14, var11.field2230, var11.field2289);
                     }

                     if (1402 == var11.field2315) {
                        class381.field3327.method1406(var13, client.field435);
                     }
                  }

                  if (0 == var11.field2348) {
                     if (!var11.field2215 && class88.method481(var11) && class353.field3188 != var11) {
                        continue;
                     }

                     if (!var11.field2215) {
                        if (var11.field2236 > var11.field2238 - var11.field2289) {
                           var11.field2236 = var11.field2238 - var11.field2289;
                        }

                        if (var11.field2236 < 0) {
                           var11.field2236 = 0;
                        }
                     }

                     method1686(var0, var11.field2307, var16, var17, var18, var19, var13 - var11.field2242, var14 - var11.field2236, var12);
                     if (null != var11.field2353) {
                        method1686(var11.field2353, var11.field2307, var16, var17, var18, var19, var13 - var11.field2242, var14 - var11.field2236, var12);
                     }

                     class240 var31 = (class240)client.field598.method545((long)var11.field2307);
                     if (var31 != null) {
                        class44.method226(var31.field2580, var16, var17, var18, var19, var13, var14, var12);
                     }

                     class362.method1732(var2, var3, var4, var5);
                     class234.method1167();
                  } else if (11 == var11.field2348) {
                     if (class88.method481(var11) && class353.field3188 != var11) {
                        continue;
                     }

                     if (null != var11.field2353) {
                        method1686(var11.field2353, var11.field2307, var16, var17, var18, var19, var13 - var11.field2242, var14 - var11.field2236, var12);
                     }

                     class362.method1732(var2, var3, var4, var5);
                     class234.method1167();
                  }

                  if (client.field657 || client.field650[var12] || client.field679 > 1) {
                     if (var11.field2348 == 0 && !var11.field2215 && var11.field2238 > var11.field2289) {
                        class150.method793(var11.field2230 + var13, var14, var11.field2236, var11.field2289, var11.field2238);
                     }

                     if (var11.field2348 != 1) {
                        int var26;
                        int var27;
                        int var41;
                        int var43;
                        if (2 == var11.field2348) {
                           var20 = 0;

                           for(var21 = 0; var21 < var11.field2244; ++var21) {
                              for(var22 = 0; var22 < var11.field2226; ++var22) {
                                 var23 = (var11.field2333 + 32) * var22 + var13;
                                 var43 = var14 + (var11.field2266 + 32) * var21;
                                 if (var20 < 20) {
                                    var23 += var11.field2284[var20];
                                    var43 += var11.field2203[var20];
                                 }

                                 if (var11.field2209[var20] <= 0) {
                                    if (var11.field2286 != null && var20 < 20) {
                                       class319 var53 = var11.method1073(var20);
                                       if (var53 != null) {
                                          var53.method1548(var23, var43);
                                       } else if (class210.field2214) {
                                          class214.method1117(var11);
                                       }
                                    }
                                 } else {
                                    boolean var51 = false;
                                    boolean var49 = false;
                                    var27 = var11.field2209[var20] - 1;
                                    if (var23 + 32 > var2 && var23 < var4 && var43 + 32 > var3 && var43 < var5 || var11 == class202.field2178 && client.field535 == var20) {
                                       class319 var47;
                                       if (client.field590 == 1 && var20 == class281.field2780 && class213.field2392 == var11.field2307) {
                                          var47 = class38.method214(var27, var11.field2253[var20], 2, 0, 2, false);
                                       } else {
                                          var47 = class38.method214(var27, var11.field2253[var20], 1, 3153952, 2, false);
                                       }

                                       if (null != var47) {
                                          if (class202.field2178 == var11 && client.field535 == var20) {
                                             var41 = class182.field1957 - client.field544;
                                             var26 = class182.field1952 - client.field545;
                                             if (var41 < 5 && var41 > -5) {
                                                var41 = 0;
                                             }

                                             if (var26 < 5 && var26 > -5) {
                                                var26 = 0;
                                             }

                                             if (client.field548 < 5) {
                                                var41 = 0;
                                                var26 = 0;
                                             }

                                             var47.method1553(var23 + var41, var26 + var43, 128);
                                             if (var1 != -1) {
                                                class210 var29 = var0[var1 & '\uffff'];
                                                int var30;
                                                if (var43 + var26 < class362.field3244 && var29.field2236 > 0) {
                                                   var30 = (class362.field3244 - var43 - var26) * client.field480 / 3;
                                                   if (var30 > client.field480 * 10) {
                                                      var30 = client.field480 * 10;
                                                   }

                                                   if (var30 > var29.field2236) {
                                                      var30 = var29.field2236;
                                                   }

                                                   var29.field2236 -= var30;
                                                   client.field545 += var30;
                                                   class214.method1117(var29);
                                                }

                                                if (32 + var43 + var26 > class362.field3245 && var29.field2236 < var29.field2238 - var29.field2289) {
                                                   var30 = client.field480 * (32 + var43 + var26 - class362.field3245) / 3;
                                                   if (var30 > client.field480 * 10) {
                                                      var30 = client.field480 * 10;
                                                   }

                                                   if (var30 > var29.field2238 - var29.field2289 - var29.field2236) {
                                                      var30 = var29.field2238 - var29.field2289 - var29.field2236;
                                                   }

                                                   var29.field2236 += var30;
                                                   client.field545 -= var30;
                                                   class214.method1117(var29);
                                                }
                                             }
                                          } else if (var11 == class215.field2405 && client.field542 == var20) {
                                             var47.method1553(var23, var43, 128);
                                          } else {
                                             var47.method1548(var23, var43);
                                          }
                                       } else {
                                          class214.method1117(var11);
                                       }
                                    }
                                 }

                                 ++var20;
                              }
                           }
                        } else if (3 == var11.field2348) {
                           if (class117.method611(var11)) {
                              var20 = var11.field2357;
                              if (class353.field3188 == var11 && 0 != var11.field2280) {
                                 var20 = var11.field2280;
                              }
                           } else {
                              var20 = var11.field2239;
                              if (class353.field3188 == var11 && var11.field2222 != 0) {
                                 var20 = var11.field2222;
                              }
                           }

                           if (var11.field2243) {
                              switch(var11.field2261.field1444) {
                              case 1:
                                 class362.method1740(var13, var14, var11.field2230, var11.field2289, var11.field2239, var11.field2357);
                                 break;
                              case 2:
                                 class362.method1741(var13, var14, var11.field2230, var11.field2289, var11.field2239, var11.field2357, 255 - (var11.field2346 & 255), 255 - (var11.field2246 & 255));
                                 break;
                              default:
                                 if (var15 == 0) {
                                    class362.method1739(var13, var14, var11.field2230, var11.field2289, var20);
                                 } else {
                                    class362.method1752(var13, var14, var11.field2230, var11.field2289, var20, 256 - (var15 & 255));
                                 }
                              }
                           } else if (var15 == 0) {
                              class362.method1731(var13, var14, var11.field2230, var11.field2289, var20);
                           } else {
                              class362.method1746(var13, var14, var11.field2230, var11.field2289, var20, 256 - (var15 & 255));
                           }
                        } else {
                           class394 var32;
                           if (4 == var11.field2348) {
                              var32 = var11.method1096();
                              if (null == var32) {
                                 if (class210.field2214) {
                                    class214.method1117(var11);
                                 }
                              } else {
                                 String var46 = var11.field2276;
                                 if (class117.method611(var11)) {
                                    var21 = var11.field2357;
                                    if (var11 == class353.field3188 && 0 != var11.field2280) {
                                       var21 = var11.field2280;
                                    }

                                    if (var11.field2317.length() > 0) {
                                       var46 = var11.field2317;
                                    }
                                 } else {
                                    var21 = var11.field2239;
                                    if (class353.field3188 == var11 && 0 != var11.field2222) {
                                       var21 = var11.field2222;
                                    }
                                 }

                                 if (var11.field2215 && -1 != var11.field2220) {
                                    class458 var52 = class272.method1294(var11.field2220);
                                    var46 = var52.field3764;
                                    if (null == var46) {
                                       var46 = class96.field1020;
                                    }

                                    if ((1 == var52.field3774 || 1 != var11.field2350) && -1 != var11.field2350) {
                                       var46 = class334.method1616(16748608) + var46 + class389.field3437 + " " + 'x' + class39.method218(var11.field2350);
                                    }
                                 }

                                 if (client.field603 == var11) {
                                    var46 = class96.field1160;
                                    var21 = var11.field2239;
                                 }

                                 if (!var11.field2215) {
                                    var46 = class5.method18(var46, var11);
                                 }

                                 var32.method521(var46, var13, var14, var11.field2230, var11.field2289, var21, var11.field2281 ? 0 : -1, var11.field2279, var11.field2340, var11.field2278);
                              }
                           } else if (var11.field2348 == 5) {
                              class319 var38;
                              if (!var11.field2215) {
                                 var38 = var11.method1069(class117.method611(var11), class20.field151);
                                 if (var38 != null) {
                                    var38.method1548(var13, var14);
                                 } else if (class210.field2214) {
                                    class214.method1117(var11);
                                 }
                              } else {
                                 if (var11.field2220 != -1) {
                                    var38 = class38.method214(var11.field2220, var11.field2350, var11.field2254, var11.field2319, var11.field2274, false);
                                 } else {
                                    var38 = var11.method1069(false, class20.field151);
                                 }

                                 if (null == var38) {
                                    if (class210.field2214) {
                                       class214.method1117(var11);
                                    }
                                 } else {
                                    var21 = var38.field3017;
                                    var22 = var38.field3018;
                                    if (!var11.field2232) {
                                       var23 = var11.field2230 * 4096 / var21;
                                       if (var11.field2205 != 0) {
                                          var38.method1549(var11.field2230 / 2 + var13, var11.field2289 / 2 + var14, var11.field2205, var23);
                                       } else if (var15 != 0) {
                                          var38.method1552(var13, var14, var11.field2230, var11.field2289, 256 - (var15 & 255));
                                       } else if (var21 == var11.field2230 && var11.field2289 == var22) {
                                          var38.method1548(var13, var14);
                                       } else {
                                          var38.method1539(var13, var14, var11.field2230, var11.field2289);
                                       }
                                    } else {
                                       class362.method1733(var13, var14, var11.field2230 + var13, var11.field2289 + var14);
                                       var23 = (var11.field2230 + (var21 - 1)) / var21;
                                       var43 = (var22 - 1 + var11.field2289) / var22;

                                       for(var41 = 0; var41 < var23; ++var41) {
                                          for(var26 = 0; var26 < var43; ++var26) {
                                             if (var11.field2205 != 0) {
                                                var38.method1549(var41 * var21 + var13 + var21 / 2, var14 + var26 * var22 + var22 / 2, var11.field2205, 4096);
                                             } else if (var15 != 0) {
                                                var38.method1553(var21 * var41 + var13, var14 + var22 * var26, 256 - (var15 & 255));
                                             } else {
                                                var38.method1548(var13 + var21 * var41, var26 * var22 + var14);
                                             }
                                          }
                                       }

                                       class362.method1732(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class458 var24;
                              if (var11.field2348 == 6) {
                                 boolean var37 = class117.method611(var11);
                                 if (var37) {
                                    var21 = var11.field2263;
                                 } else {
                                    var21 = var11.field2297;
                                 }

                                 class491 var40 = null;
                                 var23 = 0;
                                 if (var11.field2220 != -1) {
                                    var24 = class272.method1294(var11.field2220);
                                    if (null != var24) {
                                       var24 = var24.method2171(var11.field2350);
                                       var40 = var24.method2170(1);
                                       if (var40 != null) {
                                          var40.method2374();
                                          var23 = var40.field2554 / 2;
                                       } else {
                                          class214.method1117(var11);
                                       }
                                    }
                                 } else if (var11.field2258 == 5) {
                                    if (0 == var11.field2277) {
                                       var40 = client.field468.method1898((class79)null, -1, (class79)null, -1);
                                    } else {
                                       var40 = class89.field982.method1194();
                                    }
                                 } else {
                                    class272 var42 = null;
                                    class490 var48 = null;
                                    if (6 == var11.field2258) {
                                       var26 = var11.field2277;
                                       if (var26 >= 0 && var26 < client.field669.length) {
                                          class53 var45 = client.field669[var26];
                                          if (var45 != null) {
                                             var42 = var45.field798;
                                             var48 = var45.method306();
                                          }
                                       }
                                    }

                                    class79 var44 = null;
                                    var27 = -1;
                                    if (var21 != -1) {
                                       var44 = class242.method1218(var21);
                                       var27 = var11.field2351;
                                    }

                                    var40 = var11.method1093(var44, var27, var37, class89.field982.field388, var42, var48);
                                    if (null == var40 && class210.field2214) {
                                       class214.method1117(var11);
                                    }
                                 }

                                 class234.method1192(var13 + var11.field2230 / 2, var14 + var11.field2289 / 2);
                                 var43 = class234.field2526[var11.field2282] * var11.field2204 >> 16;
                                 var41 = class234.field2544[var11.field2282] * var11.field2204 >> 16;
                                 if (var40 != null) {
                                    if (!var11.field2215) {
                                       var40.method2369(0, var11.field2269, 0, var11.field2282, 0, var43, var41);
                                    } else {
                                       var40.method2374();
                                       if (var11.field2272) {
                                          var40.method2376(0, var11.field2269, var11.field2268, var11.field2282, var11.field2264, var11.field2356 + var23 + var43, var41 + var11.field2356, var11.field2204);
                                       } else {
                                          var40.method2369(0, var11.field2269, var11.field2268, var11.field2282, var11.field2264, var23 + var43 + var11.field2356, var11.field2356 + var41);
                                       }
                                    }
                                 }

                                 class234.method1169();
                              } else {
                                 if (var11.field2348 == 7) {
                                    var32 = var11.method1096();
                                    if (var32 == null) {
                                       if (class210.field2214) {
                                          class214.method1117(var11);
                                       }
                                       continue;
                                    }

                                    var21 = 0;

                                    for(var22 = 0; var22 < var11.field2244; ++var22) {
                                       for(var23 = 0; var23 < var11.field2226; ++var23) {
                                          if (var11.field2209[var21] > 0) {
                                             var24 = class272.method1294(var11.field2209[var21] - 1);
                                             String var25;
                                             if (var24.field3774 != 1 && var11.field2253[var21] == 1) {
                                                var25 = class334.method1616(16748608) + var24.field3764 + class389.field3437;
                                             } else {
                                                var25 = class334.method1616(16748608) + var24.field3764 + class389.field3437 + " " + 'x' + class39.method218(var11.field2253[var21]);
                                             }

                                             var26 = var13 + (115 + var11.field2333) * var23;
                                             var27 = var14 + (var11.field2266 + 12) * var22;
                                             if (var11.field2279 == 0) {
                                                var32.method518(var25, var26, var27, var11.field2239, var11.field2281 ? 0 : -1);
                                             } else if (1 == var11.field2279) {
                                                var32.method520(var25, var26 + var11.field2230 / 2, var27, var11.field2239, var11.field2281 ? 0 : -1);
                                             } else {
                                                var32.method519(var25, var26 + var11.field2230 - 1, var27, var11.field2239, var11.field2281 ? 0 : -1);
                                             }
                                          }

                                          ++var21;
                                       }
                                    }
                                 }

                                 class394 var34;
                                 if (8 == var11.field2348 && var11 == class422.field3574 && client.field438 == client.field470) {
                                    var20 = 0;
                                    var21 = 0;
                                    var34 = class441.field3651;
                                    String var39 = var11.field2276;

                                    String var36;
                                    for(var39 = class5.method18(var39, var11); var39.length() > 0; var21 += var34.field999 + 1) {
                                       var41 = var39.indexOf(class389.field3433);
                                       if (var41 != -1) {
                                          var36 = var39.substring(0, var41);
                                          var39 = var39.substring(var41 + 4);
                                       } else {
                                          var36 = var39;
                                          var39 = "";
                                       }

                                       var26 = var34.method538(var36);
                                       if (var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var41 = var13 + var11.field2230 - 5 - var20;
                                    var26 = var11.field2289 + var14 + 5;
                                    if (var41 < var13 + 5) {
                                       var41 = var13 + 5;
                                    }

                                    if (var41 + var20 > var4) {
                                       var41 = var4 - var20;
                                    }

                                    if (var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class362.method1739(var41, var26, var20, var21, 16777120);
                                    class362.method1731(var41, var26, var20, var21, 0);
                                    var39 = var11.field2276;
                                    var27 = var26 + var34.field999 + 2;

                                    for(var39 = class5.method18(var39, var11); var39.length() > 0; var27 += var34.field999 + 1) {
                                       int var28 = var39.indexOf(class389.field3433);
                                       if (var28 != -1) {
                                          var36 = var39.substring(0, var28);
                                          var39 = var39.substring(var28 + 4);
                                       } else {
                                          var36 = var39;
                                          var39 = "";
                                       }

                                       var34.method518(var36, var41 + 3, var27, 0, -1);
                                    }
                                 }

                                 if (9 == var11.field2348) {
                                    if (var11.field2248) {
                                       var20 = var13;
                                       var21 = var14 + var11.field2289;
                                       var22 = var11.field2230 + var13;
                                       var23 = var14;
                                    } else {
                                       var20 = var13;
                                       var21 = var14;
                                       var22 = var11.field2230 + var13;
                                       var23 = var11.field2289 + var14;
                                    }

                                    if (var11.field2247 == 1) {
                                       class362.method1749(var20, var21, var22, var23, var11.field2239);
                                    } else {
                                       class185.method969(var20, var21, var22, var23, var11.field2239, var11.field2247);
                                    }
                                 } else if (12 == var11.field2348) {
                                    class459 var33 = var11.method1076();
                                    class138 var35 = var11.method1100();
                                    if (var33 != null && null != var35 && var33.method2257()) {
                                       var34 = var11.method1096();
                                       if (var34 != null) {
                                          client.field422.method1125(var13, var14, var11.field2230, var11.field2289, var33.method2231(), var33.method2232(), 0, 0, var33.method2229(), var33.method2214(), var33.method2228());
                                          var23 = var11.field2281 ? var11.field2319 : -1;
                                          if (!var33.method2245() && var33.method2247().method1042()) {
                                             client.field422.method1124(var35.field1500, var23, var35.field1499, var35.field1501);
                                             client.field422.method1123(var33.method2198(), var34);
                                          } else {
                                             client.field422.method1124(var11.field2239, var23, var35.field1499, var35.field1501);
                                             client.field422.method1123(var33.method2247(), var34);
                                          }

                                          class362.method1732(var2, var3, var4, var5);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

   }
}
