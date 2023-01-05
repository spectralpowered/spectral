public class class493 extends class187 {
   static class319[] field4117;
   int field4118;
   // $FF: synthetic field
   final class124 this$0;

   class493(class124 var1) {
      this.this$0 = var1;
      this.field4118 = -1;
   }

   void method972(class134 var1) {
      this.field4118 = var1.method671();
      var1.method669();
      if (var1.method669() != 255) {
         --var1.field1487;
         var1.method720();
      }

   }

   void method973(class112 var1) {
      var1.method586(this.field4118);
   }

   static int method2390(String var0) {
      if (var0.equals("centre")) {
         return 1;
      } else {
         return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
      }
   }

   static int method2389(int var0, class472 var1, boolean var2) {
      if (var0 == 5000) {
         class150.field1580[++class188.field1989 - 1] = client.field659;
         return 1;
      } else if (var0 == 5001) {
         class188.field1989 -= 3;
         client.field659 = class150.field1580[class188.field1989];
         class298.field2878 = class211.method1105(class150.field1580[class188.field1989 + 1]);
         if (class298.field2878 == null) {
            class298.field2878 = class420.field3566;
         }

         client.field660 = class150.field1580[class188.field1989 + 2];
         class81 var14 = class189.method982(class165.field1754, client.field483.field3459);
         var14.field933.method666(client.field659);
         var14.field933.method666(class298.field2878.field3568);
         var14.field933.method666(client.field660);
         client.field483.method1920(var14);
         return 1;
      } else {
         String var4;
         class81 var7;
         int var9;
         int var11;
         if (var0 == 5002) {
            var4 = class150.field1581[--class150.field1582];
            class188.field1989 -= 2;
            var9 = class150.field1580[class188.field1989];
            var11 = class150.field1580[1 + class188.field1989];
            var7 = class189.method982(class165.field1756, client.field483.field3459);
            var7.field933.method666(class444.method2117(var4) + 2);
            var7.field933.method660(var4, (byte)8);
            var7.field933.method666(var9 - 1);
            var7.field933.method666(var11);
            client.field483.method1920(var7);
            return 1;
         } else {
            class154 var6;
            int var8;
            if (var0 == 5003) {
               class188.field1989 -= 2;
               var8 = class150.field1580[class188.field1989];
               var9 = class150.field1580[class188.field1989 + 1];
               var6 = class159.method843(var8, var9);
               if (null != var6) {
                  class150.field1580[++class188.field1989 - 1] = var6.field1612;
                  class150.field1580[++class188.field1989 - 1] = var6.field1617;
                  class150.field1581[++class150.field1582 - 1] = null != var6.field1614 ? var6.field1614 : "";
                  class150.field1581[++class150.field1582 - 1] = var6.field1615 != null ? var6.field1615 : "";
                  class150.field1581[++class150.field1582 - 1] = var6.field1616 != null ? var6.field1616 : "";
                  class150.field1580[++class188.field1989 - 1] = var6.method806() ? 1 : (var6.method809() ? 2 : 0);
               } else {
                  class150.field1580[++class188.field1989 - 1] = -1;
                  class150.field1580[++class188.field1989 - 1] = 0;
                  class150.field1581[++class150.field1582 - 1] = "";
                  class150.field1581[++class150.field1582 - 1] = "";
                  class150.field1581[++class150.field1582 - 1] = "";
                  class150.field1580[++class188.field1989 - 1] = 0;
               }

               return 1;
            } else {
               class154 var5;
               if (var0 == 5004) {
                  var8 = class150.field1580[--class188.field1989];
                  var5 = class472.method2288(var8);
                  if (null != var5) {
                     class150.field1580[++class188.field1989 - 1] = var5.field1611;
                     class150.field1580[++class188.field1989 - 1] = var5.field1617;
                     class150.field1581[++class150.field1582 - 1] = var5.field1614 != null ? var5.field1614 : "";
                     class150.field1581[++class150.field1582 - 1] = var5.field1615 != null ? var5.field1615 : "";
                     class150.field1581[++class150.field1582 - 1] = var5.field1616 != null ? var5.field1616 : "";
                     class150.field1580[++class188.field1989 - 1] = var5.method806() ? 1 : (var5.method809() ? 2 : 0);
                  } else {
                     class150.field1580[++class188.field1989 - 1] = -1;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1581[++class150.field1582 - 1] = "";
                     class150.field1580[++class188.field1989 - 1] = 0;
                  }

                  return 1;
               } else if (var0 == 5005) {
                  if (null == class298.field2878) {
                     class150.field1580[++class188.field1989 - 1] = -1;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = class298.field2878.field3568;
                  }

                  return 1;
               } else {
                  class81 var12;
                  if (var0 == 5008) {
                     var4 = class150.field1581[--class150.field1582];
                     var9 = class150.field1580[--class188.field1989];
                     var12 = class219.method1130(var9, var4, class300.field2886, -1);
                     client.field483.method1920(var12);
                     return 1;
                  } else if (var0 == 5009) {
                     class150.field1582 -= 2;
                     var4 = class150.field1581[class150.field1582];
                     String var10 = class150.field1581[class150.field1582 + 1];
                     var12 = class189.method982(class165.field1787, client.field483.field3459);
                     var12.field933.method655(0);
                     int var13 = var12.field933.field1487;
                     var12.field933.method660(var4, (byte)127);
                     class107.method573(var12.field933, var10);
                     var12.field933.method665(var12.field933.field1487 - var13);
                     client.field483.method1920(var12);
                     return 1;
                  } else if (var0 == 5010) {
                     var4 = class150.field1581[--class150.field1582];
                     class188.field1989 -= 2;
                     var9 = class150.field1580[class188.field1989];
                     var11 = class150.field1580[class188.field1989 + 1];
                     var7 = class219.method1130(var9, var4, class300.field2886, var11);
                     client.field483.method1920(var7);
                     return 1;
                  } else if (var0 != 5015) {
                     if (var0 == 5016) {
                        class150.field1580[++class188.field1989 - 1] = client.field660;
                        return 1;
                     } else if (var0 == 5017) {
                        var8 = class150.field1580[--class188.field1989];
                        class150.field1580[++class188.field1989 - 1] = class33.method165(var8);
                        return 1;
                     } else if (var0 == 5018) {
                        var8 = class150.field1580[--class188.field1989];
                        class150.field1580[++class188.field1989 - 1] = class127.method640(var8);
                        return 1;
                     } else if (var0 == 5019) {
                        var8 = class150.field1580[--class188.field1989];
                        class150.field1580[++class188.field1989 - 1] = class479.method2315(var8);
                        return 1;
                     } else if (var0 == 5020) {
                        var4 = class150.field1581[--class150.field1582];
                        class187.method974(var4);
                        return 1;
                     } else if (var0 == 5021) {
                        client.field661 = class150.field1581[--class150.field1582].toLowerCase().trim();
                        return 1;
                     } else if (var0 == 5022) {
                        class150.field1581[++class150.field1582 - 1] = client.field661;
                        return 1;
                     } else if (var0 == 5023) {
                        var4 = class150.field1581[--class150.field1582];
                        System.out.println(var4);
                        return 1;
                     } else if (var0 == 5030) {
                        class188.field1989 -= 2;
                        var8 = class150.field1580[class188.field1989];
                        var9 = class150.field1580[class188.field1989 + 1];
                        var6 = class159.method843(var8, var9);
                        if (var6 != null) {
                           class150.field1580[++class188.field1989 - 1] = var6.field1612;
                           class150.field1580[++class188.field1989 - 1] = var6.field1617;
                           class150.field1581[++class150.field1582 - 1] = null != var6.field1614 ? var6.field1614 : "";
                           class150.field1581[++class150.field1582 - 1] = var6.field1615 != null ? var6.field1615 : "";
                           class150.field1581[++class150.field1582 - 1] = var6.field1616 != null ? var6.field1616 : "";
                           class150.field1580[++class188.field1989 - 1] = var6.method806() ? 1 : (var6.method809() ? 2 : 0);
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1580[++class188.field1989 - 1] = 0;
                        } else {
                           class150.field1580[++class188.field1989 - 1] = -1;
                           class150.field1580[++class188.field1989 - 1] = 0;
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1580[++class188.field1989 - 1] = 0;
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1580[++class188.field1989 - 1] = 0;
                        }

                        return 1;
                     } else if (var0 == 5031) {
                        var8 = class150.field1580[--class188.field1989];
                        var5 = class472.method2288(var8);
                        if (var5 != null) {
                           class150.field1580[++class188.field1989 - 1] = var5.field1611;
                           class150.field1580[++class188.field1989 - 1] = var5.field1617;
                           class150.field1581[++class150.field1582 - 1] = var5.field1614 != null ? var5.field1614 : "";
                           class150.field1581[++class150.field1582 - 1] = null != var5.field1615 ? var5.field1615 : "";
                           class150.field1581[++class150.field1582 - 1] = var5.field1616 != null ? var5.field1616 : "";
                           class150.field1580[++class188.field1989 - 1] = var5.method806() ? 1 : (var5.method809() ? 2 : 0);
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1580[++class188.field1989 - 1] = 0;
                        } else {
                           class150.field1580[++class188.field1989 - 1] = -1;
                           class150.field1580[++class188.field1989 - 1] = 0;
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1580[++class188.field1989 - 1] = 0;
                           class150.field1581[++class150.field1582 - 1] = "";
                           class150.field1580[++class188.field1989 - 1] = 0;
                        }

                        return 1;
                     } else {
                        return 2;
                     }
                  } else {
                     if (null != class89.field982 && class89.field982.field401 != null) {
                        var4 = class89.field982.field401.method928();
                     } else {
                        var4 = "";
                     }

                     class150.field1581[++class150.field1582 - 1] = var4;
                     return 1;
                  }
               }
            }
         }
      }
   }

   static final void method2388(class210[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      for(int var9 = 0; var9 < var0.length; ++var9) {
         class210 var10 = var0[var9];
         if (var10 != null && var1 == var10.field2234 && (var10.method1101() || class172.method913(var10) != 0 || client.field611 == var10)) {
            if (var10.field2215) {
               if (class88.method481(var10)) {
                  continue;
               }
            } else if (var10.field2348 == 0 && var10 != class353.field3188 && class88.method481(var10)) {
               continue;
            }

            if (var10.field2348 == 11) {
               if (var10.method1097(class20.field151)) {
                  if (var10.method1079()) {
                     class214.method1117(var10);
                     class357.method1708(var10.field2353, var10, true);
                  }

                  if (null != var10.field2341) {
                     class169 var11 = new class169();
                     var11.field1848 = var10;
                     var11.field1850 = var10.field2341;
                     client.field499.method1930(var11);
                  }
               }
            } else if (var10.field2348 == 12 && var10.method1094()) {
               class214.method1117(var10);
            }

            int var27 = var10.field2228 + var6;
            int var12 = var7 + var10.field2229;
            int var13;
            int var14;
            int var15;
            int var16;
            int var18;
            int var19;
            if (2 == var10.field2348) {
               var13 = var2;
               var14 = var3;
               var15 = var4;
               var16 = var5;
            } else {
               int var17;
               if (var10.field2348 == 9) {
                  var17 = var27;
                  var18 = var12;
                  var19 = var10.field2230 + var27;
                  int var20 = var12 + var10.field2289;
                  if (var19 < var27) {
                     var17 = var19;
                     var19 = var27;
                  }

                  if (var20 < var12) {
                     var18 = var20;
                     var20 = var12;
                  }

                  ++var19;
                  ++var20;
                  var13 = var17 > var2 ? var17 : var2;
                  var14 = var18 > var3 ? var18 : var3;
                  var15 = var19 < var4 ? var19 : var4;
                  var16 = var20 < var5 ? var20 : var5;
               } else {
                  var17 = var10.field2230 + var27;
                  var18 = var12 + var10.field2289;
                  var13 = var27 > var2 ? var27 : var2;
                  var14 = var12 > var3 ? var12 : var3;
                  var15 = var17 < var4 ? var17 : var4;
                  var16 = var18 < var5 ? var18 : var5;
               }
            }

            if (var10 == client.field610) {
               client.field618 = true;
               client.field436 = var27;
               client.field620 = var12;
            }

            boolean var28 = false;
            if (var10.field2294) {
               switch(client.field708) {
               case 0:
                  var28 = true;
               case 1:
               default:
                  break;
               case 2:
                  if (client.field600 == var10.field2307 >>> 16) {
                     var28 = true;
                  }
                  break;
               case 3:
                  if (client.field600 == var10.field2307) {
                     var28 = true;
                  }
               }
            }

            if (var28 || !var10.field2215 || var13 < var15 && var14 < var16) {
               if (var10.field2215) {
                  class169 var29;
                  if (var10.field2363) {
                     if (class182.field1957 >= var13 && class182.field1952 >= var14 && class182.field1957 < var15 && class182.field1952 < var16) {
                        for(var29 = (class169)client.field499.method1934(); null != var29; var29 = (class169)client.field499.method1936()) {
                           if (var29.field1847) {
                              var29.method567();
                              var29.field1848.field2354 = false;
                           }
                        }

                        class165.method895();
                        if (0 == class188.field1982) {
                           client.field610 = null;
                           client.field611 = null;
                        }

                        if (!client.field572) {
                           class85.method468();
                        }
                     }
                  } else if (var10.field2364 && class182.field1957 >= var13 && class182.field1952 >= var14 && class182.field1957 < var15 && class182.field1952 < var16) {
                     for(var29 = (class169)client.field499.method1934(); null != var29; var29 = (class169)client.field499.method1936()) {
                        if (var29.field1847 && var29.field1848.field2326 == var29.field1850) {
                           var29.method567();
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

               boolean var30 = var18 >= var13 && var19 >= var14 && var18 < var15 && var19 < var16;
               if (var10.field2315 == 1337) {
                  if (!client.field434 && !client.field572 && var30) {
                     class222.method1139(var18, var19, var13, var14);
                  }
               } else if (var10.field2315 == 1338) {
                  class412.method1998(var10, var27, var12);
               } else {
                  if (1400 == var10.field2315) {
                     class237.field2566.method1827(class182.field1957, class182.field1952, var30, var27, var12, var10.field2230, var10.field2289);
                  }

                  if (!client.field572 && var30) {
                     if (1400 == var10.field2315) {
                        class237.field2566.method1865(var27, var12, var10.field2230, var10.field2289, var18, var19);
                     } else {
                        class125.method635(var10, var18 - var27, var19 - var12);
                     }
                  }

                  boolean var22;
                  int var24;
                  if (var28) {
                     for(int var21 = 0; var21 < var10.field2295.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if (!var22 && null != var10.field2295[var21]) {
                           for(var24 = 0; var24 < var10.field2295[var21].length; ++var24) {
                              boolean var25 = false;
                              if (var10.field2362 != null) {
                                 var25 = client.field664.method2272(var10.field2295[var21][var24]);
                              }

                              if (class103.method557(var10.field2295[var21][var24]) || var25) {
                                 var22 = true;
                                 if (var10.field2362 != null && var10.field2362[var21] > client.field435) {
                                    break;
                                 }

                                 byte var26 = var10.field2296[var21][var24];
                                 if (var26 == 0 || ((var26 & 8) == 0 || !client.field664.method2272(86) && !client.field664.method2272(82) && !client.field664.method2272(81)) && (0 == (var26 & 2) || client.field664.method2272(86)) && (0 == (var26 & 1) || client.field664.method2272(82)) && ((var26 & 4) == 0 || client.field664.method2272(81))) {
                                    var23 = true;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var23) {
                           if (var21 < 10) {
                              class83.method444(var21 + 1, var10.field2307, var10.field2217, var10.field2220, "");
                           } else if (var21 == 10) {
                              class210.method1103();
                              class363.method1755(var10.field2307, var10.field2217, class393.method1910(class172.method913(var10)), var10.field2220);
                              client.field595 = class97.method547(var10);
                              if (client.field595 == null) {
                                 client.field595 = class96.field1020;
                              }

                              client.field714 = var10.field2216 + class334.method1616(16777215);
                           }

                           var24 = var10.field2303[var21];
                           if (var10.field2362 == null) {
                              var10.field2362 = new int[var10.field2295.length];
                           }

                           if (var10.field2298 == null) {
                              var10.field2298 = new int[var10.field2295.length];
                           }

                           if (var24 != 0) {
                              if (0 == var10.field2362[var21]) {
                                 var10.field2362[var21] = var10.field2298[var21] + var24 + client.field435;
                              } else {
                                 var10.field2362[var21] = var24 + client.field435;
                              }
                           } else {
                              var10.field2362[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if (!var22 && null != var10.field2362) {
                           var10.field2362[var21] = 0;
                        }
                     }
                  }

                  if (var10.field2215) {
                     if (class182.field1957 >= var13 && class182.field1952 >= var14 && class182.field1957 < var15 && class182.field1952 < var16) {
                        var30 = true;
                     } else {
                        var30 = false;
                     }

                     boolean var31 = false;
                     if ((1 == class182.field1956 || !class211.field2375 && 4 == class182.field1956) && var30) {
                        var31 = true;
                     }

                     var22 = false;
                     if ((1 == class182.field1963 || !class211.field2375 && class182.field1963 == 4) && class182.field1964 >= var13 && class182.field1961 >= var14 && class182.field1964 < var15 && class182.field1961 < var16) {
                        var22 = true;
                     }

                     if (var22) {
                        class304.method1431(var10, class182.field1964 - var27, class182.field1961 - var12);
                     }

                     if (var10.method1092()) {
                        if (var22) {
                           client.field644.method1930(new class38(0, class182.field1957 - var27, class182.field1952 - var12, var10));
                        }

                        if (var31) {
                           client.field644.method1930(new class38(1, class182.field1957 - var27, class182.field1952 - var12, var10));
                        }
                     }

                     if (var10.field2315 == 1400) {
                        class237.field2566.method1828(var18, var19, var30 & var31, var30 & var22);
                     }

                     if (null != client.field610 && client.field610 != var10 && var30 && class189.method983(class172.method913(var10))) {
                        client.field614 = var10;
                     }

                     if (var10 == client.field611) {
                        client.field662 = true;
                        client.field616 = var27;
                        client.field530 = var12;
                     }

                     if (var10.field2299) {
                        class169 var32;
                        if (var30 && client.field531 != 0 && var10.field2326 != null) {
                           var32 = new class169();
                           var32.field1847 = true;
                           var32.field1848 = var10;
                           var32.field1852 = client.field531;
                           var32.field1850 = var10.field2326;
                           client.field499.method1930(var32);
                        }

                        if (null != client.field610 || class202.field2178 != null || client.field572) {
                           var22 = false;
                           var31 = false;
                           var30 = false;
                        }

                        if (!var10.field2283 && var22) {
                           var10.field2283 = true;
                           if (null != var10.field2241) {
                              var32 = new class169();
                              var32.field1847 = true;
                              var32.field1848 = var10;
                              var32.field1846 = class182.field1964 - var27;
                              var32.field1852 = class182.field1961 - var12;
                              var32.field1850 = var10.field2241;
                              client.field499.method1930(var32);
                           }
                        }

                        if (var10.field2283 && var31 && var10.field2309 != null) {
                           var32 = new class169();
                           var32.field1847 = true;
                           var32.field1848 = var10;
                           var32.field1846 = class182.field1957 - var27;
                           var32.field1852 = class182.field1952 - var12;
                           var32.field1850 = var10.field2309;
                           client.field499.method1930(var32);
                        }

                        if (var10.field2283 && !var31) {
                           var10.field2283 = false;
                           if (null != var10.field2250) {
                              var32 = new class169();
                              var32.field1847 = true;
                              var32.field1848 = var10;
                              var32.field1846 = class182.field1957 - var27;
                              var32.field1852 = class182.field1952 - var12;
                              var32.field1850 = var10.field2250;
                              client.field643.method1930(var32);
                           }
                        }

                        if (var31 && null != var10.field2311) {
                           var32 = new class169();
                           var32.field1847 = true;
                           var32.field1848 = var10;
                           var32.field1846 = class182.field1957 - var27;
                           var32.field1852 = class182.field1952 - var12;
                           var32.field1850 = var10.field2311;
                           client.field499.method1930(var32);
                        }

                        if (!var10.field2354 && var30) {
                           var10.field2354 = true;
                           if (null != var10.field2308) {
                              var32 = new class169();
                              var32.field1847 = true;
                              var32.field1848 = var10;
                              var32.field1846 = class182.field1957 - var27;
                              var32.field1852 = class182.field1952 - var12;
                              var32.field1850 = var10.field2308;
                              client.field499.method1930(var32);
                           }
                        }

                        if (var10.field2354 && var30 && null != var10.field2355) {
                           var32 = new class169();
                           var32.field1847 = true;
                           var32.field1848 = var10;
                           var32.field1846 = class182.field1957 - var27;
                           var32.field1852 = class182.field1952 - var12;
                           var32.field1850 = var10.field2355;
                           client.field499.method1930(var32);
                        }

                        if (var10.field2354 && !var30) {
                           var10.field2354 = false;
                           if (null != var10.field2314) {
                              var32 = new class169();
                              var32.field1847 = true;
                              var32.field1848 = var10;
                              var32.field1846 = class182.field1957 - var27;
                              var32.field1852 = class182.field1952 - var12;
                              var32.field1850 = var10.field2314;
                              client.field643.method1930(var32);
                           }
                        }

                        if (null != var10.field2323) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2323;
                           client.field642.method1930(var32);
                        }

                        int var35;
                        class169 var37;
                        int var38;
                        if (var10.field2257 != null && client.field624 > var10.field2318) {
                           if (var10.field2320 != null && client.field624 - var10.field2318 <= 32) {
                              label652:
                              for(var38 = var10.field2318; var38 < client.field624; ++var38) {
                                 var24 = client.field623[var38 & 31];

                                 for(var35 = 0; var35 < var10.field2320.length; ++var35) {
                                    if (var10.field2320[var35] == var24) {
                                       var37 = new class169();
                                       var37.field1848 = var10;
                                       var37.field1850 = var10.field2257;
                                       client.field499.method1930(var37);
                                       break label652;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class169();
                              var32.field1848 = var10;
                              var32.field1850 = var10.field2257;
                              client.field499.method1930(var32);
                           }

                           var10.field2318 = client.field624;
                        }

                        if (var10.field2208 != null && client.field626 > var10.field2339) {
                           if (var10.field2259 != null && client.field626 - var10.field2339 <= 32) {
                              label628:
                              for(var38 = var10.field2339; var38 < client.field626; ++var38) {
                                 var24 = client.field625[var38 & 31];

                                 for(var35 = 0; var35 < var10.field2259.length; ++var35) {
                                    if (var10.field2259[var35] == var24) {
                                       var37 = new class169();
                                       var37.field1848 = var10;
                                       var37.field1850 = var10.field2208;
                                       client.field499.method1930(var37);
                                       break label628;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class169();
                              var32.field1848 = var10;
                              var32.field1850 = var10.field2208;
                              client.field499.method1930(var32);
                           }

                           var10.field2339 = client.field626;
                        }

                        if (var10.field2321 != null && client.field628 > var10.field2310) {
                           if (null != var10.field2218 && client.field628 - var10.field2310 <= 32) {
                              label604:
                              for(var38 = var10.field2310; var38 < client.field628; ++var38) {
                                 var24 = client.field553[var38 & 31];

                                 for(var35 = 0; var35 < var10.field2218.length; ++var35) {
                                    if (var10.field2218[var35] == var24) {
                                       var37 = new class169();
                                       var37.field1848 = var10;
                                       var37.field1850 = var10.field2321;
                                       client.field499.method1930(var37);
                                       break label604;
                                    }
                                 }
                              }
                           } else {
                              var32 = new class169();
                              var32.field1848 = var10;
                              var32.field1850 = var10.field2321;
                              client.field499.method1930(var32);
                           }

                           var10.field2310 = client.field628;
                        }

                        if (client.field631 > var10.field2245 && null != var10.field2327) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2327;
                           client.field499.method1930(var32);
                        }

                        if (client.field632 > var10.field2245 && var10.field2331 != null) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2331;
                           client.field499.method1930(var32);
                        }

                        if (client.field527 > var10.field2245 && null != var10.field2285) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2285;
                           client.field499.method1930(var32);
                        }

                        if (client.field634 > var10.field2245 && var10.field2227 != null) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2227;
                           client.field499.method1930(var32);
                        }

                        if (client.field430 > var10.field2245 && var10.field2334 != null) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2334;
                           client.field499.method1930(var32);
                        }

                        if (client.field694 > var10.field2245 && null != var10.field2202) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2202;
                           client.field499.method1930(var32);
                        }

                        if (client.field637 > var10.field2245 && null != var10.field2240) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2240;
                           client.field499.method1930(var32);
                        }

                        if (client.field638 > var10.field2245 && null != var10.field2335) {
                           var32 = new class169();
                           var32.field1848 = var10;
                           var32.field1850 = var10.field2335;
                           client.field499.method1930(var32);
                        }

                        var10.field2245 = client.field622;
                        if (null != var10.field2328) {
                           for(var38 = 0; var38 < client.field627; ++var38) {
                              class169 var36 = new class169();
                              var36.field1848 = var10;
                              var36.field1849 = client.field668[var38];
                              var36.field1853 = client.field691[var38];
                              var36.field1850 = var10.field2328;
                              client.field499.method1930(var36);
                           }
                        }

                        class169 var39;
                        int[] var40;
                        if (var10.field2329 != null) {
                           var40 = client.field664.method2273();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new class169();
                              var39.field1848 = var10;
                              var39.field1849 = var40[var24];
                              var39.field1850 = var10.field2329;
                              client.field499.method1930(var39);
                           }
                        }

                        if (null != var10.field2324) {
                           var40 = client.field664.method2274();

                           for(var24 = 0; var24 < var40.length; ++var24) {
                              var39 = new class169();
                              var39.field1848 = var10;
                              var39.field1849 = var40[var24];
                              var39.field1850 = var10.field2324;
                              client.field499.method1930(var39);
                           }
                        }
                     }
                  }

                  if (!var10.field2215) {
                     if (client.field610 != null || class202.field2178 != null || client.field572) {
                        continue;
                     }

                     if ((var10.field2345 >= 0 || 0 != var10.field2222) && class182.field1957 >= var13 && class182.field1952 >= var14 && class182.field1957 < var15 && class182.field1952 < var16) {
                        if (var10.field2345 >= 0) {
                           class353.field3188 = var0[var10.field2345];
                        } else {
                           class353.field3188 = var10;
                        }
                     }

                     if (8 == var10.field2348 && class182.field1957 >= var13 && class182.field1952 >= var14 && class182.field1957 < var15 && class182.field1952 < var16) {
                        class422.field3574 = var10;
                     }

                     if (var10.field2238 > var10.field2289) {
                        class414.method2001(var10, var10.field2230 + var27, var12, var10.field2289, var10.field2238, class182.field1957, class182.field1952);
                     }
                  }

                  if (0 == var10.field2348) {
                     method2388(var0, var10.field2307, var13, var14, var15, var16, var27 - var10.field2242, var12 - var10.field2236);
                     if (null != var10.field2353) {
                        method2388(var10.field2353, var10.field2307, var13, var14, var15, var16, var27 - var10.field2242, var12 - var10.field2236);
                     }

                     class240 var33 = (class240)client.field598.method545((long)var10.field2307);
                     if (null != var33) {
                        if (0 == var33.field2578 && class182.field1957 >= var13 && class182.field1952 >= var14 && class182.field1957 < var15 && class182.field1952 < var16 && !client.field572) {
                           for(class169 var34 = (class169)client.field499.method1934(); var34 != null; var34 = (class169)client.field499.method1936()) {
                              if (var34.field1847) {
                                 var34.method567();
                                 var34.field1848.field2354 = false;
                              }
                           }

                           if (0 == class188.field1982) {
                              client.field610 = null;
                              client.field611 = null;
                           }

                           if (!client.field572) {
                              class85.method468();
                           }
                        }

                        class64.method349(var33.field2580, var13, var14, var15, var16, var27, var12);
                     }
                  }
               }
            }
         }
      }

   }
}
