public class class177 implements class262 {
   static int field1929;

   static final void method935(class30 var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 != null && var0.method156()) {
         if (var0 instanceof class53) {
            class272 var7 = ((class53)var0).field798;
            if (var7.field2743 != null) {
               var7 = var7.method1286();
            }

            if (null == var7) {
               return;
            }
         }

         int var76 = class25.field180;
         int[] var8 = class25.field179;
         byte var9 = 0;
         class47 var11;
         if (var1 < var76 && client.field435 == var0.field237) {
            var11 = (class47)var0;
            boolean var10;
            if (client.field653 == 0) {
               var10 = false;
            } else if (var11 != class89.field982) {
               boolean var12 = 0 != (client.field653 & 4);
               var10 = var12 || class346.method1664((byte)-1) && var11.method237() || class109.method576() && var11.method252();
            } else {
               var10 = class378.method1804();
            }

            if (var10) {
               class47 var79 = (class47)var0;
               if (var1 < var76) {
                  class280.method1346(var0, 15 + var0.field292);
                  class93 var13 = (class93)client.field487.get(class39.field365);
                  byte var14 = 9;
                  var13.method520(var79.field401.method928(), var2 + client.field640, var3 + client.field461 - var14, 16777215, 0);
                  var9 = 18;
               }
            }
         }

         int var77 = -2;
         int var16;
         int var23;
         int var24;
         if (!var0.field296.method323()) {
            class280.method1346(var0, var0.field292 + 15);

            for(class44 var78 = (class44)var0.field296.method327(); var78 != null; var78 = (class44)var0.field296.method321()) {
               class132 var81 = var78.method224(client.field435);
               if (var81 == null) {
                  if (var78.method225()) {
                     var78.method567();
                  }
               } else {
                  class5 var84 = var78.field376;
                  class319 var88 = var84.method16();
                  class319 var15 = var84.method15();
                  int var17 = 0;
                  if (var88 != null && null != var15) {
                     if (var84.field28 * 2 < var15.field3014) {
                        var17 = var84.field28;
                     }

                     var16 = var15.field3014 - var17 * 2;
                  } else {
                     var16 = var84.field27;
                  }

                  int var18 = 255;
                  boolean var19 = true;
                  int var20 = client.field435 - var81.field1479;
                  int var21 = var81.field1476 * var16 / var84.field27;
                  int var22;
                  int var95;
                  if (var81.field1480 > var20) {
                     var22 = var84.field17 == 0 ? 0 : var84.field17 * (var20 / var84.field17);
                     var23 = var16 * var81.field1478 / var84.field27;
                     var95 = (var21 - var23) * var22 / var81.field1480 + var23;
                  } else {
                     var95 = var21;
                     var22 = var84.field15 + var81.field1480 - var20;
                     if (var84.field22 >= 0) {
                        var18 = (var22 << 8) / (var84.field15 - var84.field22);
                     }
                  }

                  if (var81.field1476 > 0 && var95 < 1) {
                     var95 = 1;
                  }

                  if (null != var88 && null != var15) {
                     if (var95 == var16) {
                        var95 += var17 * 2;
                     } else {
                        var95 += var17;
                     }

                     var22 = var88.field3013;
                     var77 += var22;
                     var23 = client.field640 + var2 - (var16 >> 1);
                     var24 = client.field461 + var3 - var77;
                     var23 -= var17;
                     if (var18 >= 0 && var18 < 255) {
                        var88.method1553(var23, var24, var18);
                        class362.method1733(var23, var24, var23 + var95, var22 + var24);
                        var15.method1553(var23, var24, var18);
                     } else {
                        var88.method1548(var23, var24);
                        class362.method1733(var23, var24, var23 + var95, var22 + var24);
                        var15.method1548(var23, var24);
                     }

                     class362.method1732(var2, var3, var2 + var4, var3 + var5);
                     var77 += 2;
                  } else {
                     var77 += 5;
                     if (client.field640 > -1) {
                        var22 = client.field640 + var2 - (var16 >> 1);
                        var23 = var3 + client.field461 - var77;
                        class362.method1739(var22, var23, var95, 5, 65280);
                        class362.method1739(var22 + var95, var23, var16 - var95, 5, 16711680);
                     }

                     var77 += 2;
                  }
               }
            }
         }

         if (var77 == -2) {
            var77 += 7;
         }

         var77 += var9;
         if (var1 < var76) {
            var11 = (class47)var0;
            if (var11.field407) {
               return;
            }

            if (var11.field389 != -1 || -1 != var11.field390) {
               class280.method1346(var0, 15 + var0.field292);
               if (client.field640 > -1) {
                  if (-1 != var11.field389) {
                     var77 += 25;
                     class296.field2830[var11.field389].method1548(client.field640 + var2 - 12, client.field461 + var3 - var77);
                  }

                  if (-1 != var11.field390) {
                     var77 += 25;
                     class343.field3151[var11.field390].method1548(client.field640 + var2 - 12, client.field461 + var3 - var77);
                  }
               }
            }

            if (var1 >= 0 && 10 == client.field442 && var8[var1] == client.field511) {
               class280.method1346(var0, var0.field292 + 15);
               if (client.field640 > -1) {
                  var77 += class307.field2901[1].field3013;
                  class307.field2901[1].method1548(var2 + client.field640 - 12, client.field461 + var3 - var77);
               }
            }
         } else {
            class53 var80 = (class53)var0;
            int[] var83 = var80.method308();
            short[] var86 = var80.method301();
            if (null != var86 && var83 != null) {
               for(int var89 = 0; var89 < var86.length; ++var89) {
                  if (var86[var89] >= 0 && var83[var89] >= 0) {
                     long var90 = (long)var83[var89] << 8 | (long)var86[var89];
                     class319 var93 = (class319)client.field488.method2294(var90);
                     if (var93 == null) {
                        class319[] var94 = class79.method434(class280.field2767, var83[var89], 0);
                        if (null != var94 && var86[var89] < var94.length) {
                           var93 = var94[var86[var89]];
                           client.field488.method2292(var90, var93);
                        }
                     }

                     if (null != var93) {
                        class280.method1346(var0, 15 + var0.field292);
                        if (client.field640 > -1) {
                           var3 -= var93.field3013;
                           var93.method1548(var2 + client.field640 - (var93.field3014 >> 1), client.field461 + var3);
                           var3 -= 2;
                        }
                     }
                  }
               }
            }

            if (client.field442 == 1 && client.field635[var1 - var76] == client.field443 && client.field435 % 20 < 10) {
               class280.method1346(var0, 15 + var0.field292);
               if (client.field640 > -1) {
                  class307.field2901[0].method1548(client.field640 + var2 - 12, client.field461 + var3 - 28);
               }
            }
         }

         if (var0.field253 != null && (var1 >= var76 || !var0.field242 && (4 == client.field659 || !var0.field254 && (client.field659 == 0 || 3 == client.field659 || 1 == client.field659 && ((class47)var0).method237())))) {
            class280.method1346(var0, var0.field292 + 15);
            if (client.field640 > -1 && client.field678 < client.field523) {
               client.field711[client.field678] = class299.field2880.method538(var0.field253) / 2;
               client.field526[client.field678] = class299.field2880.field999;
               client.field524[client.field678] = client.field640;
               client.field525[client.field678] = client.field461 - var77;
               client.field528[client.field678] = var0.field257;
               client.field529[client.field678] = var0.field284;
               client.field619[client.field678] = var0.field303;
               client.field522[client.field678] = var0.field253;
               ++client.field678;
               var77 += 12;
            }
         }

         for(int var82 = 0; var82 < 4; ++var82) {
            int var85 = var0.field262[var82];
            int var87 = var0.field260[var82];
            class399 var91 = null;
            int var92 = 0;
            if (var87 >= 0) {
               if (var85 <= client.field435) {
                  continue;
               }

               var91 = class246.method1223(var0.field260[var82]);
               var92 = var91.field3492;
               if (null != var91 && var91.field3497 != null) {
                  var91 = var91.method1947();
                  if (var91 == null) {
                     var0.field262[var82] = -1;
                     continue;
                  }
               }
            } else if (var85 < 0) {
               continue;
            }

            var16 = var0.field263[var82];
            class399 var97 = null;
            if (var16 >= 0) {
               var97 = class246.method1223(var16);
               if (var97 != null && null != var97.field3497) {
                  var97 = var97.method1947();
               }
            }

            if (var85 - var92 <= client.field435) {
               if (null == var91) {
                  var0.field262[var82] = -1;
               } else {
                  class280.method1346(var0, var0.field292 / 2);
                  if (client.field640 > -1) {
                     boolean var96 = true;
                     if (var82 == 1) {
                        client.field461 -= 20;
                     }

                     if (var82 == 2) {
                        client.field640 -= 15;
                        client.field461 -= 10;
                     }

                     if (var82 == 3) {
                        client.field640 += 15;
                        client.field461 -= 10;
                     }

                     class319 var100 = null;
                     class319 var98 = null;
                     class319 var99 = null;
                     class319 var101 = null;
                     var23 = 0;
                     var24 = 0;
                     int var25 = 0;
                     int var26 = 0;
                     int var27 = 0;
                     int var28 = 0;
                     int var29 = 0;
                     int var30 = 0;
                     class319 var31 = null;
                     class319 var32 = null;
                     class319 var33 = null;
                     class319 var34 = null;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     int var38 = 0;
                     int var39 = 0;
                     int var40 = 0;
                     int var41 = 0;
                     int var42 = 0;
                     int var43 = 0;
                     var100 = var91.method1949();
                     int var44;
                     if (var100 != null) {
                        var23 = var100.field3014;
                        var44 = var100.field3013;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var27 = var100.field3015;
                     }

                     var98 = var91.method1950();
                     if (null != var98) {
                        var24 = var98.field3014;
                        var44 = var98.field3013;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var28 = var98.field3015;
                     }

                     var99 = var91.method1957();
                     if (null != var99) {
                        var25 = var99.field3014;
                        var44 = var99.field3013;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var29 = var99.field3015;
                     }

                     var101 = var91.method1951();
                     if (var101 != null) {
                        var26 = var101.field3014;
                        var44 = var101.field3013;
                        if (var44 > var43) {
                           var43 = var44;
                        }

                        var30 = var101.field3015;
                     }

                     if (var97 != null) {
                        var31 = var97.method1949();
                        if (var31 != null) {
                           var35 = var31.field3014;
                           var44 = var31.field3013;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var39 = var31.field3015;
                        }

                        var32 = var97.method1950();
                        if (var32 != null) {
                           var36 = var32.field3014;
                           var44 = var32.field3013;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var40 = var32.field3015;
                        }

                        var33 = var97.method1957();
                        if (null != var33) {
                           var37 = var33.field3014;
                           var44 = var33.field3013;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var41 = var33.field3015;
                        }

                        var34 = var97.method1951();
                        if (var34 != null) {
                           var38 = var34.field3014;
                           var44 = var34.field3013;
                           if (var44 > var43) {
                              var43 = var44;
                           }

                           var42 = var34.field3015;
                        }
                     }

                     class394 var102 = var91.method1954();
                     if (null == var102) {
                        var102 = class248.field2615;
                     }

                     class394 var45;
                     if (var97 != null) {
                        var45 = var97.method1954();
                        if (null == var45) {
                           var45 = class248.field2615;
                        }
                     } else {
                        var45 = class248.field2615;
                     }

                     String var46 = null;
                     String var47 = null;
                     boolean var48 = false;
                     int var49 = 0;
                     var46 = var91.method1948(var0.field261[var82]);
                     int var103 = var102.method538(var46);
                     if (null != var97) {
                        var47 = var97.method1948(var0.field264[var82]);
                        var49 = var45.method538(var47);
                     }

                     int var50 = 0;
                     int var51 = 0;
                     if (var24 > 0) {
                        if (var99 == null && null == var101) {
                           var50 = 1;
                        } else {
                           var50 = var103 / var24 + 1;
                        }
                     }

                     if (null != var97 && var36 > 0) {
                        if (var33 == null && var34 == null) {
                           var51 = 1;
                        } else {
                           var51 = var49 / var36 + 1;
                        }
                     }

                     int var52 = 0;
                     int var53 = var52;
                     if (var23 > 0) {
                        var52 += var23;
                     }

                     var52 += 2;
                     int var54 = var52;
                     if (var25 > 0) {
                        var52 += var25;
                     }

                     int var55 = var52;
                     int var56 = var52;
                     int var57;
                     if (var24 > 0) {
                        var57 = var50 * var24;
                        var52 += var57;
                        var56 += (var57 - var103) / 2;
                     } else {
                        var52 += var103;
                     }

                     var57 = var52;
                     if (var26 > 0) {
                        var52 += var26;
                     }

                     int var58 = 0;
                     int var59 = 0;
                     int var60 = 0;
                     int var61 = 0;
                     int var62 = 0;
                     int var63;
                     if (null != var97) {
                        var52 += 2;
                        var58 = var52;
                        if (var35 > 0) {
                           var52 += var35;
                        }

                        var52 += 2;
                        var59 = var52;
                        if (var37 > 0) {
                           var52 += var37;
                        }

                        var60 = var52;
                        var62 = var52;
                        if (var36 > 0) {
                           var63 = var51 * var36;
                           var52 += var63;
                           var62 += (var63 - var49) / 2;
                        } else {
                           var52 += var49;
                        }

                        var61 = var52;
                        if (var38 > 0) {
                           var52 += var38;
                        }
                     }

                     var63 = var0.field262[var82] - client.field435;
                     int var64 = var91.field3500 - var91.field3500 * var63 / var91.field3492;
                     int var65 = -var91.field3495 + var63 * var91.field3495 / var91.field3492;
                     int var66 = var2 + client.field640 - (var52 >> 1) + var64;
                     int var67 = var65 + (client.field461 + var3 - 12);
                     int var68 = var67;
                     int var69 = var67 + var43;
                     int var70 = var91.field3505 + var67 + 15;
                     int var71 = var70 - var102.field998;
                     int var72 = var70 + var102.field1009;
                     if (var71 < var67) {
                        var68 = var71;
                     }

                     if (var72 > var69) {
                        var69 = var72;
                     }

                     int var73 = 0;
                     int var74;
                     int var75;
                     if (var97 != null) {
                        var73 = var67 + 15 + var97.field3505;
                        var74 = var73 - var45.field998;
                        var75 = var45.field1009 + var73;
                        if (var74 < var68) {
                           ;
                        }

                        if (var75 > var69) {
                           ;
                        }
                     }

                     var74 = 255;
                     if (var91.field3502 >= 0) {
                        var74 = (var63 << 8) / (var91.field3492 - var91.field3502);
                     }

                     if (var74 >= 0 && var74 < 255) {
                        if (var100 != null) {
                           var100.method1553(var66 + var53 - var27, var67, var74);
                        }

                        if (null != var99) {
                           var99.method1553(var54 + var66 - var29, var67, var74);
                        }

                        if (var98 != null) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var98.method1553(var66 + var55 - var28 + var75 * var24, var67, var74);
                           }
                        }

                        if (null != var101) {
                           var101.method1553(var57 + var66 - var30, var67, var74);
                        }

                        var102.method539(var46, var56 + var66, var70, var91.field3490, 0, var74);
                        if (var97 != null) {
                           if (var31 != null) {
                              var31.method1553(var58 + var66 - var39, var67, var74);
                           }

                           if (var33 != null) {
                              var33.method1553(var59 + var66 - var41, var67, var74);
                           }

                           if (null != var32) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method1553(var66 + var60 - var40 + var75 * var36, var67, var74);
                              }
                           }

                           if (var34 != null) {
                              var34.method1553(var61 + var66 - var42, var67, var74);
                           }

                           var45.method539(var47, var62 + var66, var73, var97.field3490, 0, var74);
                        }
                     } else {
                        if (null != var100) {
                           var100.method1548(var66 + var53 - var27, var67);
                        }

                        if (null != var99) {
                           var99.method1548(var54 + var66 - var29, var67);
                        }

                        if (null != var98) {
                           for(var75 = 0; var75 < var50; ++var75) {
                              var98.method1548(var55 + var66 - var28 + var75 * var24, var67);
                           }
                        }

                        if (null != var101) {
                           var101.method1548(var57 + var66 - var30, var67);
                        }

                        var102.method518(var46, var66 + var56, var70, var91.field3490 | -16777216, 0);
                        if (var97 != null) {
                           if (var31 != null) {
                              var31.method1548(var58 + var66 - var39, var67);
                           }

                           if (null != var33) {
                              var33.method1548(var66 + var59 - var41, var67);
                           }

                           if (var32 != null) {
                              for(var75 = 0; var75 < var51; ++var75) {
                                 var32.method1548(var36 * var75 + (var66 + var60 - var40), var67);
                              }
                           }

                           if (null != var34) {
                              var34.method1548(var61 + var66 - var42, var67);
                           }

                           var45.method518(var47, var66 + var62, var73, var97.field3490 | -16777216, 0);
                        }
                     }
                  }
               }
            }
         }

      }
   }
}
