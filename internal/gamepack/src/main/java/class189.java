import java.security.SecureRandom;

@ObfInfo(
   name = "ay"
)
public class class189 {
   @ObfInfo(
      owner = "ay",
      name = "u",
      desc = "I"
   )
   public static int field1707;
   @ObfInfo(
      owner = "ay",
      name = "qv",
      desc = "Lqk;"
   )
   static class449 field1706;
   @ObfInfo(
      owner = "ay",
      name = "te",
      desc = "I"
   )
   static int field1709;
   @ObfInfo(
      owner = "ay",
      name = "ga",
      desc = "Ljava/security/SecureRandom;"
   )
   static SecureRandom field1708;
   @ObfInfo(
      owner = "ay",
      name = "f",
      desc = "I"
   )
   int field1704;
   @ObfInfo(
      owner = "ay",
      name = "r",
      desc = "I"
   )
   int field1705;

   @ObfInfo(
      owner = "ay",
      name = "<init>",
      desc = "(II)V"
   )
   class189(int var1, int var2) {
      this.field1704 = var1;
      this.field1705 = var2;
   }

   @ObfInfo(
      owner = "ay",
      name = "h",
      desc = "(Lav;I)Z"
   )
   boolean method853(class310 var1) {
      if (null == var1) {
         return false;
      } else {
         switch(this.field1704) {
         case 1:
            return var1.method1501(this.field1705);
         case 2:
            return var1.method1502(this.field1705);
         case 3:
            return var1.method1499((char)this.field1705);
         case 4:
            return var1.method1500(this.field1705 == 1);
         default:
            return false;
         }
      }
   }

   @ObfInfo(
      owner = "ay",
      name = "x",
      desc = "(II)Ldz;"
   )
   static class453 method856(int var0) {
      class453 var2 = (class453)class2.method10(class475.method2355(), var0);
      if (var2 == null) {
         var2 = class453.field3759;
      }

      return var2;
   }

   @ObfInfo(
      owner = "ay",
      name = "j",
      desc = "(S)V"
   )
   public static void method855() {
      class284.field2354.method395();
   }

   @ObfInfo(
      owner = "ay",
      name = "fj",
      desc = "(I)V"
   )
   static final void method852() {
      class318.field2525 = false;
      client.field274 = false;
   }

   @ObfInfo(
      owner = "ay",
      name = "km",
      desc = "(II)Ljava/lang/String;"
   )
   static String method857(int var0) {
      if (var0 < 0) {
         return "";
      } else {
         return client.field256[var0].length() > 0 ? client.field375[var0] + class177.field1496 + client.field256[var0] : client.field375[var0];
      }
   }

   @ObfInfo(
      owner = "ay",
      name = "kv",
      desc = "([Lkd;IIIIIIIIB)V"
   )
   static final void method854(class120[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      class162.method742(var2, var3, var4, var5);
      class341.method1709();

      for(int var10 = 0; var10 < var0.length; ++var10) {
         class120 var11 = var0[var10];
         if (null != var11 && (var11.field912 == var1 || var1 == -1412584499 && client.field406 == var11)) {
            int var12;
            if (var8 == -1) {
               client.field447[client.field442] = var11.field906 + var6;
               client.field448[client.field442] = var7 + var11.field907;
               client.field435[client.field442] = var11.field908;
               client.field247[client.field442] = var11.field967;
               var12 = ++client.field442 - 1;
            } else {
               var12 = var8;
            }

            var11.field1038 = var12;
            var11.field1039 = client.field231;
            if (!var11.field893 || !class9.method47(var11)) {
               if (var11.field993 > 0) {
                  class436.method2165(var11);
               }

               int var13 = var11.field906 + var6;
               int var14 = var7 + var11.field907;
               int var15 = var11.field1024;
               int var16;
               int var17;
               if (var11 == client.field406) {
                  if (var1 != -1412584499 && !var11.field982) {
                     class466.field3875 = var0;
                     class168.field1265 = var6;
                     class406.field3406 = var7;
                     continue;
                  }

                  if (client.field417 && client.field458) {
                     var16 = class466.field3863;
                     var17 = class466.field3858;
                     var16 -= client.field408;
                     var17 -= client.field409;
                     if (var16 < client.field412) {
                        var16 = client.field412;
                     }

                     if (var11.field908 + var16 > client.field407.field908 + client.field412) {
                        var16 = client.field412 + client.field407.field908 - var11.field908;
                     }

                     if (var17 < client.field326) {
                        var17 = client.field326;
                     }

                     if (var11.field967 + var17 > client.field326 + client.field407.field967) {
                        var17 = client.field407.field967 + client.field326 - var11.field967;
                     }

                     var13 = var16;
                     var14 = var17;
                  }

                  if (!var11.field982) {
                     var15 = 128;
                  }
               }

               int var18;
               int var19;
               int var20;
               int var21;
               int var22;
               int var23;
               if (2 == var11.field1026) {
                  var16 = var2;
                  var17 = var3;
                  var18 = var4;
                  var19 = var5;
               } else if (var11.field1026 == 9) {
                  var20 = var13;
                  var21 = var14;
                  var22 = var13 + var11.field908;
                  var23 = var14 + var11.field967;
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
                  var20 = var13 + var11.field908;
                  var21 = var11.field967 + var14;
                  var16 = var13 > var2 ? var13 : var2;
                  var17 = var14 > var3 ? var14 : var3;
                  var18 = var20 < var4 ? var20 : var4;
                  var19 = var21 < var5 ? var21 : var5;
               }

               if (!var11.field893 || var16 < var18 && var17 < var19) {
                  if (var11.field993 != 0) {
                     if (1336 == var11.field993) {
                        if (class50.field574.method2205()) {
                           var14 += 15;
                           class400.field3376.method2026("Fps:" + class214.field1849, var11.field908 + var13, var14, 16776960, -1);
                           var14 += 15;
                           Runtime var50 = Runtime.getRuntime();
                           var21 = (int)((var50.totalMemory() - var50.freeMemory()) / 1024L);
                           var22 = 16776960;
                           if (var21 > 327680 && !client.field274) {
                              var22 = 16711680;
                           }

                           class400.field3376.method2026("Mem:" + var21 + "k", var11.field908 + var13, var14, var22, -1);
                           var14 += 15;
                        }
                        continue;
                     }

                     if (var11.field993 == 1337) {
                        client.field382 = var13;
                        client.field383 = var14;
                        class208.method904(var13, var14, var11.field908, var11.field967);
                        client.field444[var11.field1038] = true;
                        class162.method742(var2, var3, var4, var5);
                        continue;
                     }

                     if (1338 == var11.field993) {
                        class380.method1872(var11, var13, var14, var12);
                        class162.method742(var2, var3, var4, var5);
                        continue;
                     }

                     if (1339 == var11.field993) {
                        class73.method322(var11, var13, var14, var12);
                        class162.method742(var2, var3, var4, var5);
                        continue;
                     }

                     if (1400 == var11.field993) {
                        class164.field1249.method1295(var13, var14, var11.field908, var11.field967, client.field231);
                     }

                     if (var11.field993 == 1401) {
                        class164.field1249.method1317(var13, var14, var11.field908, var11.field967);
                     }

                     if (1402 == var11.field993) {
                        class312.field2467.method1954(var13, client.field231);
                     }
                  }

                  if (0 == var11.field1026) {
                     if (!var11.field893 && class9.method47(var11) && class393.field3284 != var11) {
                        continue;
                     }

                     if (!var11.field893) {
                        if (var11.field914 > var11.field916 - var11.field967) {
                           var11.field914 = var11.field916 - var11.field967;
                        }

                        if (var11.field914 < 0) {
                           var11.field914 = 0;
                        }
                     }

                     method854(var0, var11.field985, var16, var17, var18, var19, var13 - var11.field920, var14 - var11.field914, var12);
                     if (null != var11.field1031) {
                        method854(var11.field1031, var11.field985, var16, var17, var18, var19, var13 - var11.field920, var14 - var11.field914, var12);
                     }

                     class415 var31 = (class415)client.field394.method791((long)var11.field985);
                     if (var31 != null) {
                        class431.method2125(var31.field3426, var16, var17, var18, var19, var13, var14, var12);
                     }

                     class162.method742(var2, var3, var4, var5);
                     class341.method1709();
                  } else if (11 == var11.field1026) {
                     if (class9.method47(var11) && class393.field3284 != var11) {
                        continue;
                     }

                     if (null != var11.field1031) {
                        method854(var11.field1031, var11.field985, var16, var17, var18, var19, var13 - var11.field920, var14 - var11.field914, var12);
                     }

                     class162.method742(var2, var3, var4, var5);
                     class341.method1709();
                  }

                  if (client.field453 || client.field446[var12] || client.field475 > 1) {
                     if (var11.field1026 == 0 && !var11.field893 && var11.field916 > var11.field967) {
                        class386.method1900(var11.field908 + var13, var14, var11.field914, var11.field967, var11.field916);
                     }

                     if (var11.field1026 != 1) {
                        int var26;
                        int var27;
                        int var41;
                        int var43;
                        if (2 == var11.field1026) {
                           var20 = 0;

                           for(var21 = 0; var21 < var11.field922; ++var21) {
                              for(var22 = 0; var22 < var11.field904; ++var22) {
                                 var23 = (var11.field1011 + 32) * var22 + var13;
                                 var43 = var14 + (var11.field944 + 32) * var21;
                                 if (var20 < 20) {
                                    var23 += var11.field962[var20];
                                    var43 += var11.field881[var20];
                                 }

                                 if (var11.field887[var20] <= 0) {
                                    if (var11.field964 != null && var20 < 20) {
                                       class266 var53 = var11.method482(var20);
                                       if (var53 != null) {
                                          var53.method1240(var23, var43);
                                       } else if (class120.field892) {
                                          class184.method836(var11);
                                       }
                                    }
                                 } else {
                                    boolean var51 = false;
                                    boolean var49 = false;
                                    var27 = var11.field887[var20] - 1;
                                    if (var23 + 32 > var2 && var23 < var4 && var43 + 32 > var3 && var43 < var5 || var11 == class321.field2562 && client.field331 == var20) {
                                       class266 var47;
                                       if (client.field386 == 1 && var20 == class249.field2059 && class10.field52 == var11.field985) {
                                          var47 = class70.method310(var27, var11.field931[var20], 2, 0, 2, false);
                                       } else {
                                          var47 = class70.method310(var27, var11.field931[var20], 1, 3153952, 2, false);
                                       }

                                       if (null != var47) {
                                          if (class321.field2562 == var11 && client.field331 == var20) {
                                             var41 = class466.field3863 - client.field340;
                                             var26 = class466.field3858 - client.field341;
                                             if (var41 < 5 && var41 > -5) {
                                                var41 = 0;
                                             }

                                             if (var26 < 5 && var26 > -5) {
                                                var26 = 0;
                                             }

                                             if (client.field344 < 5) {
                                                var41 = 0;
                                                var26 = 0;
                                             }

                                             var47.method1245(var23 + var41, var26 + var43, 128);
                                             if (var1 != -1) {
                                                class120 var29 = var0[var1 & '\uffff'];
                                                int var30;
                                                if (var43 + var26 < class162.field1234 && var29.field914 > 0) {
                                                   var30 = (class162.field1234 - var43 - var26) * client.field276 / 3;
                                                   if (var30 > client.field276 * 10) {
                                                      var30 = client.field276 * 10;
                                                   }

                                                   if (var30 > var29.field914) {
                                                      var30 = var29.field914;
                                                   }

                                                   var29.field914 -= var30;
                                                   client.field341 += var30;
                                                   class184.method836(var29);
                                                }

                                                if (32 + var43 + var26 > class162.field1235 && var29.field914 < var29.field916 - var29.field967) {
                                                   var30 = client.field276 * (32 + var43 + var26 - class162.field1235) / 3;
                                                   if (var30 > client.field276 * 10) {
                                                      var30 = client.field276 * 10;
                                                   }

                                                   if (var30 > var29.field916 - var29.field967 - var29.field914) {
                                                      var30 = var29.field916 - var29.field967 - var29.field914;
                                                   }

                                                   var29.field914 += var30;
                                                   client.field341 -= var30;
                                                   class184.method836(var29);
                                                }
                                             }
                                          } else if (var11 == class101.field800 && client.field338 == var20) {
                                             var47.method1245(var23, var43, 128);
                                          } else {
                                             var47.method1240(var23, var43);
                                          }
                                       } else {
                                          class184.method836(var11);
                                       }
                                    }
                                 }

                                 ++var20;
                              }
                           }
                        } else if (3 == var11.field1026) {
                           if (class433.method2147(var11)) {
                              var20 = var11.field1035;
                              if (class393.field3284 == var11 && 0 != var11.field958) {
                                 var20 = var11.field958;
                              }
                           } else {
                              var20 = var11.field917;
                              if (class393.field3284 == var11 && var11.field900 != 0) {
                                 var20 = var11.field900;
                              }
                           }

                           if (var11.field921) {
                              switch(var11.field939.field31) {
                              case 1:
                                 class162.method750(var13, var14, var11.field908, var11.field967, var11.field917, var11.field1035);
                                 break;
                              case 2:
                                 class162.method751(var13, var14, var11.field908, var11.field967, var11.field917, var11.field1035, 255 - (var11.field1024 & 255), 255 - (var11.field924 & 255));
                                 break;
                              default:
                                 if (var15 == 0) {
                                    class162.method749(var13, var14, var11.field908, var11.field967, var20);
                                 } else {
                                    class162.method762(var13, var14, var11.field908, var11.field967, var20, 256 - (var15 & 255));
                                 }
                              }
                           } else if (var15 == 0) {
                              class162.method741(var13, var14, var11.field908, var11.field967, var20);
                           } else {
                              class162.method756(var13, var14, var11.field908, var11.field967, var20, 256 - (var15 & 255));
                           }
                        } else {
                           class58 var32;
                           if (4 == var11.field1026) {
                              var32 = var11.method505();
                              if (null == var32) {
                                 if (class120.field892) {
                                    class184.method836(var11);
                                 }
                              } else {
                                 String var46 = var11.field954;
                                 if (class433.method2147(var11)) {
                                    var21 = var11.field1035;
                                    if (var11 == class393.field3284 && 0 != var11.field958) {
                                       var21 = var11.field958;
                                    }

                                    if (var11.field995.length() > 0) {
                                       var46 = var11.field995;
                                    }
                                 } else {
                                    var21 = var11.field917;
                                    if (class393.field3284 == var11 && 0 != var11.field900) {
                                       var21 = var11.field900;
                                    }
                                 }

                                 if (var11.field893 && -1 != var11.field898) {
                                    class263 var52 = class423.method2062(var11.field898);
                                    var46 = var52.field2147;
                                    if (null == var46) {
                                       var46 = class177.field1325;
                                    }

                                    if ((1 == var52.field2157 || 1 != var11.field1028) && -1 != var11.field1028) {
                                       var46 = class238.method1032(16748608) + var46 + class442.field3665 + " " + 'x' + class460.method2269(var11.field1028);
                                    }
                                 }

                                 if (client.field399 == var11) {
                                    var46 = class177.field1465;
                                    var21 = var11.field917;
                                 }

                                 if (!var11.field893) {
                                    var46 = class406.method1996(var46, var11);
                                 }

                                 var32.method2028(var46, var13, var14, var11.field908, var11.field967, var21, var11.field959 ? 0 : -1, var11.field957, var11.field1018, var11.field956);
                              }
                           } else if (var11.field1026 == 5) {
                              class266 var38;
                              if (!var11.field893) {
                                 var38 = var11.method478(class433.method2147(var11), class300.field2410);
                                 if (var38 != null) {
                                    var38.method1240(var13, var14);
                                 } else if (class120.field892) {
                                    class184.method836(var11);
                                 }
                              } else {
                                 if (var11.field898 != -1) {
                                    var38 = class70.method310(var11.field898, var11.field1028, var11.field932, var11.field997, var11.field952, false);
                                 } else {
                                    var38 = var11.method478(false, class300.field2410);
                                 }

                                 if (null == var38) {
                                    if (class120.field892) {
                                       class184.method836(var11);
                                    }
                                 } else {
                                    var21 = var38.field2203;
                                    var22 = var38.field2204;
                                    if (!var11.field910) {
                                       var23 = var11.field908 * 4096 / var21;
                                       if (var11.field883 != 0) {
                                          var38.method1241(var11.field908 / 2 + var13, var11.field967 / 2 + var14, var11.field883, var23);
                                       } else if (var15 != 0) {
                                          var38.method1244(var13, var14, var11.field908, var11.field967, 256 - (var15 & 255));
                                       } else if (var21 == var11.field908 && var11.field967 == var22) {
                                          var38.method1240(var13, var14);
                                       } else {
                                          var38.method1231(var13, var14, var11.field908, var11.field967);
                                       }
                                    } else {
                                       class162.method743(var13, var14, var11.field908 + var13, var11.field967 + var14);
                                       var23 = (var11.field908 + (var21 - 1)) / var21;
                                       var43 = (var22 - 1 + var11.field967) / var22;

                                       for(var41 = 0; var41 < var23; ++var41) {
                                          for(var26 = 0; var26 < var43; ++var26) {
                                             if (var11.field883 != 0) {
                                                var38.method1241(var41 * var21 + var13 + var21 / 2, var14 + var26 * var22 + var22 / 2, var11.field883, 4096);
                                             } else if (var15 != 0) {
                                                var38.method1245(var21 * var41 + var13, var14 + var22 * var26, 256 - (var15 & 255));
                                             } else {
                                                var38.method1240(var13 + var21 * var41, var26 * var22 + var14);
                                             }
                                          }
                                       }

                                       class162.method742(var2, var3, var4, var5);
                                    }
                                 }
                              }
                           } else {
                              class263 var24;
                              if (var11.field1026 == 6) {
                                 boolean var37 = class433.method2147(var11);
                                 if (var37) {
                                    var21 = var11.field941;
                                 } else {
                                    var21 = var11.field975;
                                 }

                                 class470 var40 = null;
                                 var23 = 0;
                                 if (var11.field898 != -1) {
                                    var24 = class423.method2062(var11.field898);
                                    if (null != var24) {
                                       var24 = var24.method1202(var11.field1028);
                                       var40 = var24.method1201(1);
                                       if (var40 != null) {
                                          var40.method2315();
                                          var23 = var40.field2390 / 2;
                                       } else {
                                          class184.method836(var11);
                                       }
                                    }
                                 } else if (var11.field936 == 5) {
                                    if (0 == var11.field955) {
                                       var40 = client.field264.method1397((class242)null, -1, (class242)null, -1);
                                    } else {
                                       var40 = class113.field846.method1438();
                                    }
                                 } else {
                                    class423 var42 = null;
                                    class207 var48 = null;
                                    if (6 == var11.field936) {
                                       var26 = var11.field955;
                                       if (var26 >= 0 && var26 < client.field465.length) {
                                          class267 var45 = client.field465[var26];
                                          if (var45 != null) {
                                             var42 = var45.field2213;
                                             var48 = var45.method1265();
                                          }
                                       }
                                    }

                                    class242 var44 = null;
                                    var27 = -1;
                                    if (var21 != -1) {
                                       var44 = class271.method1277(var21);
                                       var27 = var11.field1029;
                                    }

                                    var40 = var11.method502(var44, var27, var37, class113.field846.field3194, var42, var48);
                                    if (null == var40 && class120.field892) {
                                       class184.method836(var11);
                                    }
                                 }

                                 class341.method1734(var13 + var11.field908 / 2, var14 + var11.field967 / 2);
                                 var43 = class341.field2726[var11.field960] * var11.field882 >> 16;
                                 var41 = class341.field2744[var11.field960] * var11.field882 >> 16;
                                 if (var40 != null) {
                                    if (!var11.field893) {
                                       var40.method2310(0, var11.field947, 0, var11.field960, 0, var43, var41);
                                    } else {
                                       var40.method2315();
                                       if (var11.field950) {
                                          var40.method2317(0, var11.field947, var11.field946, var11.field960, var11.field942, var11.field1034 + var23 + var43, var41 + var11.field1034, var11.field882);
                                       } else {
                                          var40.method2310(0, var11.field947, var11.field946, var11.field960, var11.field942, var23 + var43 + var11.field1034, var11.field1034 + var41);
                                       }
                                    }
                                 }

                                 class341.method1711();
                              } else {
                                 if (var11.field1026 == 7) {
                                    var32 = var11.method505();
                                    if (var32 == null) {
                                       if (class120.field892) {
                                          class184.method836(var11);
                                       }
                                       continue;
                                    }

                                    var21 = 0;

                                    for(var22 = 0; var22 < var11.field922; ++var22) {
                                       for(var23 = 0; var23 < var11.field904; ++var23) {
                                          if (var11.field887[var21] > 0) {
                                             var24 = class423.method2062(var11.field887[var21] - 1);
                                             String var25;
                                             if (var24.field2157 != 1 && var11.field931[var21] == 1) {
                                                var25 = class238.method1032(16748608) + var24.field2147 + class442.field3665;
                                             } else {
                                                var25 = class238.method1032(16748608) + var24.field2147 + class442.field3665 + " " + 'x' + class460.method2269(var11.field931[var21]);
                                             }

                                             var26 = var13 + (115 + var11.field1011) * var23;
                                             var27 = var14 + (var11.field944 + 12) * var22;
                                             if (var11.field957 == 0) {
                                                var32.method2025(var25, var26, var27, var11.field917, var11.field959 ? 0 : -1);
                                             } else if (1 == var11.field957) {
                                                var32.method2027(var25, var26 + var11.field908 / 2, var27, var11.field917, var11.field959 ? 0 : -1);
                                             } else {
                                                var32.method2026(var25, var26 + var11.field908 - 1, var27, var11.field917, var11.field959 ? 0 : -1);
                                             }
                                          }

                                          ++var21;
                                       }
                                    }
                                 }

                                 class58 var34;
                                 if (8 == var11.field1026 && var11 == class219.field1895 && client.field234 == client.field266) {
                                    var20 = 0;
                                    var21 = 0;
                                    var34 = class400.field3376;
                                    String var39 = var11.field954;

                                    String var36;
                                    for(var39 = class406.method1996(var39, var11); var39.length() > 0; var21 += var34.field3442 + 1) {
                                       var41 = var39.indexOf(class442.field3661);
                                       if (var41 != -1) {
                                          var36 = var39.substring(0, var41);
                                          var39 = var39.substring(var41 + 4);
                                       } else {
                                          var36 = var39;
                                          var39 = "";
                                       }

                                       var26 = var34.method2045(var36);
                                       if (var26 > var20) {
                                          var20 = var26;
                                       }
                                    }

                                    var20 += 6;
                                    var21 += 7;
                                    var41 = var13 + var11.field908 - 5 - var20;
                                    var26 = var11.field967 + var14 + 5;
                                    if (var41 < var13 + 5) {
                                       var41 = var13 + 5;
                                    }

                                    if (var41 + var20 > var4) {
                                       var41 = var4 - var20;
                                    }

                                    if (var21 + var26 > var5) {
                                       var26 = var5 - var21;
                                    }

                                    class162.method749(var41, var26, var20, var21, 16777120);
                                    class162.method741(var41, var26, var20, var21, 0);
                                    var39 = var11.field954;
                                    var27 = var26 + var34.field3442 + 2;

                                    for(var39 = class406.method1996(var39, var11); var39.length() > 0; var27 += var34.field3442 + 1) {
                                       int var28 = var39.indexOf(class442.field3661);
                                       if (var28 != -1) {
                                          var36 = var39.substring(0, var28);
                                          var39 = var39.substring(var28 + 4);
                                       } else {
                                          var36 = var39;
                                          var39 = "";
                                       }

                                       var34.method2025(var36, var41 + 3, var27, 0, -1);
                                    }
                                 }

                                 if (9 == var11.field1026) {
                                    if (var11.field926) {
                                       var20 = var13;
                                       var21 = var14 + var11.field967;
                                       var22 = var11.field908 + var13;
                                       var23 = var14;
                                    } else {
                                       var20 = var13;
                                       var21 = var14;
                                       var22 = var11.field908 + var13;
                                       var23 = var11.field967 + var14;
                                    }

                                    if (var11.field925 == 1) {
                                       class162.method759(var20, var21, var22, var23, var11.field917);
                                    } else {
                                       class69.method306(var20, var21, var22, var23, var11.field917, var11.field925);
                                    }
                                 } else if (12 == var11.field1026) {
                                    class262 var33 = var11.method485();
                                    class146 var35 = var11.method509();
                                    if (var33 != null && null != var35 && var33.method1189()) {
                                       var34 = var11.method505();
                                       if (var34 != null) {
                                          client.field218.method1773(var13, var14, var11.field908, var11.field967, var33.method1163(), var33.method1164(), 0, 0, var33.method1161(), var33.method1146(), var33.method1160());
                                          var23 = var11.field959 ? var11.field997 : -1;
                                          if (!var33.method1177() && var33.method1179().method1642()) {
                                             client.field218.method1772(var35.field1161, var23, var35.field1160, var35.field1162);
                                             client.field218.method1771(var33.method1130(), var34);
                                          } else {
                                             client.field218.method1772(var11.field917, var23, var35.field1160, var35.field1162);
                                             client.field218.method1771(var33.method1179(), var34);
                                          }

                                          class162.method742(var2, var3, var4, var5);
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
