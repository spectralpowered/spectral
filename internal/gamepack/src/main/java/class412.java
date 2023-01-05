public class class412 implements class179 {
   static class119 field3552;

   public class157 method938() {
      return new class460();
   }

   static void method2000(int var0) {
      class324.method1569(14);
      class52.field760 = var0;
   }

   static final void method1998(class210 var0, int var1, int var2) {
      if (client.field500 == 0 || client.field500 == 3) {
         if (!client.field572 && (class182.field1963 == 1 || !class211.field2375 && 4 == class182.field1963)) {
            class400 var4 = var0.method1074(true);
            if (null == var4) {
               return;
            }

            int var5 = class182.field1964 - var1;
            int var6 = class182.field1961 - var2;
            if (var4.method1958(var5, var6)) {
               var5 -= var4.field3511 / 2;
               var6 -= var4.field3512 / 2;
               int var7 = client.field505 & 2047;
               int var8 = class234.field2526[var7];
               int var9 = class234.field2544[var7];
               int var10 = var8 * var6 + var5 * var9 >> 11;
               int var11 = var6 * var9 - var5 * var8 >> 11;
               int var12 = var10 + class89.field982.field297 >> 7;
               int var13 = class89.field982.field233 - var11 >> 7;
               class81 var14 = class189.method982(class165.field1766, client.field483.field3459);
               var14.field933.method666(18);
               var14.field933.method690(client.field664.method2272(82) ? (client.field664.method2272(81) ? 2 : 1) : 0);
               var14.field933.method706(var12 + class381.field3325);
               var14.field933.method694(class345.field3166 + var13);
               var14.field933.method666(var5);
               var14.field933.method666(var6);
               var14.field933.method655(client.field505);
               var14.field933.method666(57);
               var14.field933.method666(0);
               var14.field933.method666(0);
               var14.field933.method666(89);
               var14.field933.method655(class89.field982.field297);
               var14.field933.method655(class89.field982.field233);
               var14.field933.method666(63);
               client.field483.method1920(var14);
               client.field677 = var12;
               client.field423 = var13;
            }
         }

      }
   }

   static final void method1999(boolean var0) {
      for(int var2 = 0; var2 < client.field479; ++var2) {
         class53 var3 = client.field669[client.field635[var2]];
         if (null != var3 && var3.method156() && var3.field798.field2740 == var0 && var3.field798.method1295()) {
            int var4 = var3.field297 >> 7;
            int var5 = var3.field233 >> 7;
            if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
               if (1 == var3.field236 && (var3.field297 & 127) == 64 && 64 == (var3.field233 & 127)) {
                  if (client.field532[var4][var5] == client.field533) {
                     continue;
                  }

                  client.field532[var4][var5] = client.field533;
               }

               long var6 = class141.method764(0, 0, 1, !var3.field798.field2746, client.field635[var2]);
               var3.field237 = client.field435;
               class13.field126.method74(class195.field2036, var3.field297, var3.field233, class192.method991(var3.field297 + (var3.field236 * 64 - 64), var3.field236 * 64 - 64 + var3.field233, class195.field2036), 60 + (var3.field236 * 64 - 64), var3, var3.field247, var6, var3.field234);
            }
         }
      }

   }

   static final void method1997(class167 var0) {
      class421 var2 = client.field483.field3460;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      class327 var35;
      if (var0 == class167.field1835) {
         var3 = var2.method669();
         var4 = var2.method696();
         var5 = var2.method717();
         var6 = var2.method691();
         var7 = (var6 >> 4 & 7) + class116.field1415;
         var8 = class360.field3233 + (var6 & 7);
         if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
            var35 = new class327();
            var35.field3053 = var4;
            var35.field3051 = var5;
            var35.method1580(var3);
            if (client.field564[class195.field2036][var7][var8] == null) {
               client.field564[class195.field2036][var7][var8] = new class397();
            }

            client.field564[class195.field2036][var7][var8].method1930(var35);
            class307.method1443(var7, var8);
         }

      } else if (class167.field1830 == var0) {
         var3 = var2.method696();
         var4 = var2.method669();
         var5 = var2.method716();
         var6 = (var5 >> 4 & 7) + class116.field1415;
         var7 = class360.field3233 + (var5 & 7);
         var8 = var2.method696();
         if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
            var6 = 64 + var6 * 128;
            var7 = 64 + var7 * 128;
            class378 var44 = new class378(var8, class195.field2036, var6, var7, class192.method991(var6, var7, class195.field2036) - var4, var3, client.field435);
            client.field556.method1930(var44);
         }

      } else if (var0 == class167.field1833) {
         var3 = var2.method669();
         var4 = (var3 >> 4 & 7) + class116.field1415;
         var5 = class360.field3233 + (var3 & 7);
         var2.method697();
         var6 = var2.method714();
         var2.method653();
         var7 = var2.method717();
         var2.method716();
         var2.method716();
         var8 = var2.method671();
         if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
            var35 = new class327();
            var35.field3053 = var8;
            var35.field3051 = var7;
            var35.method1580(var6);
            if (client.field564[class195.field2036][var4][var5] == null) {
               client.field564[class195.field2036][var4][var5] = new class397();
            }

            client.field564[class195.field2036][var4][var5].method1930(var35);
            class307.method1443(var4, var5);
         }

      } else {
         int var9;
         int var10;
         int var11;
         int var13;
         byte var14;
         byte var15;
         int var42;
         int var45;
         int var46;
         class260 var47;
         if (var0 == class167.field1841) {
            var3 = var2.method714() * 4;
            var4 = var2.method669();
            var5 = class116.field1415 + (var4 >> 4 & 7);
            var6 = (var4 & 7) + class360.field3233;
            var7 = var2.method696();
            var8 = var2.method696();
            var9 = var2.method691() * 4;
            var10 = var2.method714();
            var11 = var2.method669();
            var42 = var2.method672();
            var13 = var2.method696();
            var14 = var2.method715();
            var15 = var2.method670();
            var45 = var14 + var5;
            var46 = var15 + var6;
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && var13 != 65535) {
               var5 = 64 + var5 * 128;
               var6 = var6 * 128 + 64;
               var45 = var45 * 128 + 64;
               var46 = var46 * 128 + 64;
               var47 = new class260(var13, class195.field2036, var5, var6, class192.method991(var5, var6, class195.field2036) - var9, client.field435 + var7, client.field435 + var8, var11, var10, var42, var3);
               var47.method1252(var45, var46, class192.method991(var45, var46, class195.field2036) - var3, var7 + client.field435);
               client.field566.method1930(var47);
            }

         } else if (class167.field1828 == var0) {
            var3 = var2.method716();
            var4 = var3 >> 2;
            var5 = var3 & 3;
            var6 = client.field496[var4];
            var7 = var2.method716();
            var8 = class116.field1415 + (var7 >> 4 & 7);
            var9 = (var7 & 7) + class360.field3233;
            var10 = var2.method716();
            var11 = var2.method653();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
               class110.method577(class195.field2036, var8, var9, var6, var11, var4, var5, var10, 0, -1);
            }

         } else {
            class397 var33;
            if (var0 == class167.field1839) {
               var3 = var2.method691();
               var4 = class116.field1415 + (var3 >> 4 & 7);
               var5 = (var3 & 7) + class360.field3233;
               var6 = var2.method671();
               var7 = var2.method693();
               if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
                  var33 = client.field564[class195.field2036][var4][var5];
                  if (var33 != null) {
                     for(var35 = (class327)var33.method1934(); null != var35; var35 = (class327)var33.method1936()) {
                        if (var35.field3053 == (var6 & 32767) && var35.field3051 == var7) {
                           var35.method567();
                           break;
                        }
                     }

                     if (var33.method1934() == null) {
                        client.field564[class195.field2036][var4][var5] = null;
                     }

                     class307.method1443(var4, var5);
                  }
               }

            } else if (class167.field1836 == var0) {
               var3 = var2.method691();
               var4 = var3 >> 2;
               var5 = var3 & 3;
               var6 = client.field496[var4];
               var7 = var2.method691();
               var8 = (var7 >> 4 & 7) + class116.field1415;
               var9 = (var7 & 7) + class360.field3233;
               if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104) {
                  class110.method577(class195.field2036, var8, var9, var6, -1, var4, var5, 31, 0, -1);
               }

            } else {
               if (class167.field1829 == var0) {
                  var3 = var2.method669();
                  var4 = var2.method697();
                  var5 = var2.method716();
                  var6 = (var5 >> 4 & 7) + class116.field1415;
                  var7 = class360.field3233 + (var5 & 7);
                  var8 = var2.method691();
                  var9 = var8 >> 4 & 15;
                  var10 = var8 & 7;
                  if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                     var11 = var9 + 1;
                     if (class89.field982.field258[0] >= var6 - var11 && class89.field982.field258[0] <= var6 + var11 && class89.field982.field306[0] >= var7 - var11 && class89.field982.field306[0] <= var11 + var7 && class111.field1385.method1345() != 0 && var10 > 0 && client.field682 < 50) {
                        client.field683[client.field682] = var4;
                        client.field684[client.field682] = var10;
                        client.field712[client.field682] = var3;
                        client.field492[client.field682] = null;
                        client.field538[client.field682] = (var6 << 16) + (var7 << 8) + var9;
                        ++client.field682;
                     }
                  }
               }

               if (class167.field1834 == var0) {
                  var3 = var2.method716();
                  var4 = var2.method653();
                  var5 = var2.method696();
                  var6 = var2.method669() * 4;
                  var7 = var2.method716();
                  var8 = (var7 >> 4 & 7) + class116.field1415;
                  var9 = class360.field3233 + (var7 & 7);
                  var10 = var2.method669() * 4;
                  var11 = var2.method653();
                  var42 = var2.method716();
                  byte var43 = var2.method715();
                  var14 = var2.method721();
                  var46 = var2.method668();
                  var45 = var14 + var8;
                  var13 = var43 + var9;
                  if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var45 >= 0 && var13 >= 0 && var45 < 104 && var13 < 104 && var5 != 65535) {
                     var8 = 64 + var8 * 128;
                     var9 = 64 + var9 * 128;
                     var45 = 64 + var45 * 128;
                     var13 = var13 * 128 + 64;
                     var47 = new class260(var5, class195.field2036, var8, var9, class192.method991(var8, var9, class195.field2036) - var6, client.field435 + var11, var4 + client.field435, var3, var42, var46, var10);
                     var47.method1252(var45, var13, class192.method991(var45, var13, class195.field2036) - var10, client.field435 + var11);
                     client.field566.method1930(var47);
                  }

               } else if (class167.field1838 == var0) {
                  var3 = var2.method696();
                  var4 = var2.method697();
                  var5 = var2.method714();
                  var6 = class116.field1415 + (var5 >> 4 & 7);
                  var7 = class360.field3233 + (var5 & 7);
                  var8 = var2.method653();
                  if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
                     class397 var36 = client.field564[class195.field2036][var6][var7];
                     if (null != var36) {
                        for(class327 var37 = (class327)var36.method1934(); var37 != null; var37 = (class327)var36.method1936()) {
                           if ((var8 & 32767) == var37.field3053 && var4 == var37.field3051) {
                              var37.field3051 = var3;
                              break;
                           }
                        }

                        class307.method1443(var6, var7);
                     }
                  }

               } else {
                  if (class167.field1837 == var0) {
                     var3 = var2.method691();
                     var4 = var3 >> 2;
                     var5 = var3 & 3;
                     var6 = client.field496[var4];
                     var7 = var2.method653();
                     var8 = var2.method696();
                     var9 = var2.method691();
                     var10 = class116.field1415 + (var9 >> 4 & 7);
                     var11 = class360.field3233 + (var9 & 7);
                     byte var12 = var2.method715();
                     var13 = var2.method653();
                     var14 = var2.method715();
                     var15 = var2.method670();
                     byte var16 = var2.method721();
                     int var17 = var2.method696();
                     class47 var18;
                     if (var17 == client.field552) {
                        var18 = class89.field982;
                     } else {
                        var18 = client.field551[var17];
                     }

                     if (null != var18) {
                        class173 var19 = class212.method1110(var8);
                        int var20;
                        int var21;
                        if (var5 != 1 && var5 != 3) {
                           var20 = var19.field1878;
                           var21 = var19.field1879;
                        } else {
                           var20 = var19.field1879;
                           var21 = var19.field1878;
                        }

                        int var22 = var10 + (var20 >> 1);
                        int var23 = (var20 + 1 >> 1) + var10;
                        int var24 = (var21 >> 1) + var11;
                        int var25 = var11 + (var21 + 1 >> 1);
                        int[][] var26 = class74.field858[class195.field2036];
                        int var27 = var26[var22][var25] + var26[var22][var24] + var26[var23][var24] + var26[var23][var25] >> 2;
                        int var28 = (var20 << 6) + (var10 << 7);
                        int var29 = (var11 << 7) + (var21 << 6);
                        class491 var30 = var19.method920(var4, var5, var26, var28, var27, var29);
                        if (var30 != null) {
                           class110.method577(class195.field2036, var10, var11, var6, -1, 0, 0, 31, var7 + 1, var13 + 1);
                           var18.field412 = client.field435 + var7;
                           var18.field396 = var13 + client.field435;
                           var18.field400 = var30;
                           var18.field397 = var10 * 128 + var20 * 64;
                           var18.field403 = var21 * 64 + var11 * 128;
                           var18.field387 = var27;
                           byte var31;
                           if (var15 > var12) {
                              var31 = var15;
                              var15 = var12;
                              var12 = var31;
                           }

                           if (var16 > var14) {
                              var31 = var16;
                              var16 = var14;
                              var14 = var31;
                           }

                           var18.field414 = var10 + var15;
                           var18.field398 = var10 + var12;
                           var18.field402 = var11 + var16;
                           var18.field394 = var11 + var14;
                        }
                     }
                  }

                  if (class167.field1840 == var0) {
                     var3 = var2.method716();
                     var4 = (var3 >> 4 & 7) + class116.field1415;
                     var5 = (var3 & 7) + class360.field3233;
                     var6 = var2.method697();
                     var7 = var2.method691();
                     var8 = var7 >> 2;
                     var9 = var7 & 3;
                     var10 = client.field496[var8];
                     if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
                        if (var10 == 0) {
                           class176 var38 = class13.field126.method48(class195.field2036, var4, var5);
                           if (var38 != null) {
                              var42 = class7.method24(var38.field1926);
                              if (var8 == 2) {
                                 var38.field1919 = new class479(var42, 2, var9 + 4, class195.field2036, var4, var5, var6, false, var38.field1919);
                                 var38.field1925 = new class479(var42, 2, var9 + 1 & 3, class195.field2036, var4, var5, var6, false, var38.field1925);
                              } else {
                                 var38.field1919 = new class479(var42, var8, var9, class195.field2036, var4, var5, var6, false, var38.field1919);
                              }
                           }
                        }

                        if (var10 == 1) {
                           class316 var39 = class13.field126.method82(class195.field2036, var4, var5);
                           if (var39 != null) {
                              var42 = class7.method24(var39.field2996);
                              if (var8 != 4 && var8 != 5) {
                                 if (var8 == 6) {
                                    var39.field3002 = new class479(var42, 4, var9 + 4, class195.field2036, var4, var5, var6, false, var39.field3002);
                                 } else if (var8 == 7) {
                                    var39.field3002 = new class479(var42, 4, 4 + (var9 + 2 & 3), class195.field2036, var4, var5, var6, false, var39.field3002);
                                 } else if (var8 == 8) {
                                    var39.field3002 = new class479(var42, 4, var9 + 4, class195.field2036, var4, var5, var6, false, var39.field3002);
                                    var39.field3003 = new class479(var42, 4, (var9 + 2 & 3) + 4, class195.field2036, var4, var5, var6, false, var39.field3003);
                                 }
                              } else {
                                 var39.field3002 = new class479(var42, 4, var9, class195.field2036, var4, var5, var6, false, var39.field3002);
                              }
                           }
                        }

                        if (var10 == 2) {
                           class323 var40 = class13.field126.method50(class195.field2036, var4, var5);
                           if (var8 == 11) {
                              var8 = 10;
                           }

                           if (var40 != null) {
                              var40.field3029 = new class479(class7.method24(var40.field3038), var8, var9, class195.field2036, var4, var5, var6, false, var40.field3029);
                           }
                        }

                        if (var10 == 3) {
                           class344 var41 = class13.field126.method72(class195.field2036, var4, var5);
                           if (null != var41) {
                              var41.field3157 = new class479(class7.method24(var41.field3158), 22, var9, class195.field2036, var4, var5, var6, false, var41.field3157);
                           }
                        }
                     }

                  } else if (class167.field1831 == var0) {
                     var3 = var2.method696();
                     var2.method671();
                     var4 = var2.method691();
                     var5 = class116.field1415 + (var4 >> 4 & 7);
                     var6 = class360.field3233 + (var4 & 7);
                     if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                        class397 var32 = client.field564[class195.field2036][var5][var6];
                        if (var32 != null) {
                           for(class327 var34 = (class327)var32.method1934(); var34 != null; var34 = (class327)var32.method1936()) {
                              if ((var3 & 32767) == var34.field3053) {
                                 var34.method567();
                                 break;
                              }
                           }

                           if (var32.method1934() == null) {
                              client.field564[class195.field2036][var5][var6] = null;
                           }

                           class307.method1443(var5, var6);
                        }
                     }

                  } else if (var0 == class167.field1832) {
                     var3 = var2.method697();
                     var4 = var2.method716();
                     var5 = (var4 >> 4 & 7) + class116.field1415;
                     var6 = (var4 & 7) + class360.field3233;
                     var7 = var2.method714();
                     if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                        var33 = client.field564[class195.field2036][var5][var6];
                        if (null != var33) {
                           for(var35 = (class327)var33.method1934(); null != var35; var35 = (class327)var33.method1936()) {
                              if (var35.field3053 == (var3 & 32767)) {
                                 var35.method1580(var7);
                                 break;
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
