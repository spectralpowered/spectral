public class class125 {
   public static void method638() {
      class111.field1383.method162();
   }

   static final void method637(class30 var0) {
      int var2 = Math.max(1, var0.field288 - client.field435);
      int var3 = var0.field236 * -31241280 + var0.field251 * -600195968;
      int var4 = var0.field240 * 221025152 + var0.field236 * -31241280;
      var0.field297 += (var3 - var0.field297) / var2;
      var0.field233 += (var4 - var0.field233) / var2;
      var0.field294 = 0;
      var0.field299 = var0.field290;
   }

   static final void method635(class210 var0, int var1, int var2) {
      if (var0.field2219 == 1) {
         class69.method392(var0.field2347, "", 24, 0, 0, var0.field2307, var0.field2220);
      }

      String var4;
      if (2 == var0.field2219 && !client.field592) {
         var4 = class97.method547(var0);
         if (null != var4) {
            class69.method392(var4, class334.method1616(65280) + var0.field2322, 25, 0, -1, var0.field2307, var0.field2220);
         }
      }

      if (3 == var0.field2219) {
         class82.method442(class96.field1190, "", 26, 0, 0, var0.field2307);
      }

      if (var0.field2219 == 4) {
         class82.method442(var0.field2347, "", 28, 0, 0, var0.field2307);
      }

      if (var0.field2219 == 5) {
         class82.method442(var0.field2347, "", 29, 0, 0, var0.field2307);
      }

      if (6 == var0.field2219 && null == client.field603) {
         class82.method442(var0.field2347, "", 30, 0, -1, var0.field2307);
      }

      int var5;
      int var6;
      int var14;
      if (2 == var0.field2348) {
         var14 = 0;

         for(var5 = 0; var5 < var0.field2289; ++var5) {
            for(var6 = 0; var6 < var0.field2230; ++var6) {
               int var7 = var6 * (var0.field2333 + 32);
               int var8 = (var0.field2266 + 32) * var5;
               if (var14 < 20) {
                  var7 += var0.field2284[var14];
                  var8 += var0.field2203[var14];
               }

               if (var1 >= var7 && var2 >= var8 && var1 < var7 + 32 && var2 < var8 + 32) {
                  client.field715 = var14;
                  class325.field3043 = var0;
                  if (var0.field2209[var14] > 0) {
                     class458 var9 = class272.method1294(var0.field2209[var14] - 1);
                     if (client.field590 == 1 && class261.method1259(class172.method913(var0))) {
                        if (class213.field2392 != var0.field2307 || class281.field2780 != var14) {
                           class69.method392(class96.field1181, client.field687 + " " + class389.field3436 + " " + class334.method1616(16748608) + var9.field3764, 31, 0, var14, var0.field2307, var9.field3785);
                        }
                     } else if (client.field592 && class261.method1259(class172.method913(var0))) {
                        if (16 == (class269.field2703 & 16)) {
                           class69.method392(client.field595, client.field714 + " " + class389.field3436 + " " + class334.method1616(16748608) + var9.field3764, 32, 0, var14, var0.field2307, var9.field3785);
                        }
                     } else {
                        String[] var10 = var9.field3781;
                        int var11 = -1;
                        if (client.field588) {
                           boolean var12 = client.field584 || client.field664.method2272(81);
                           if (var12) {
                              var11 = var9.method2179();
                           }
                        }

                        int var19;
                        if (class261.method1259(class172.method913(var0))) {
                           for(var19 = 4; var19 >= 3; --var19) {
                              if (var11 != var19) {
                                 class8.method26(var0, var9, var14, var19, false);
                              }
                           }
                        }

                        if (class77.method418(class172.method913(var0))) {
                           class69.method392(class96.field1181, class334.method1616(16748608) + var9.field3764, 38, 0, var14, var0.field2307, var9.field3785);
                        }

                        if (class261.method1259(class172.method913(var0))) {
                           for(var19 = 2; var19 >= 0; --var19) {
                              if (var19 != var11) {
                                 class8.method26(var0, var9, var14, var19, false);
                              }
                           }

                           if (var11 >= 0) {
                              class8.method26(var0, var9, var14, var11, true);
                           }
                        }

                        var10 = var0.field2287;
                        if (null != var10) {
                           for(var19 = 4; var19 >= 0; --var19) {
                              if (var10[var19] != null) {
                                 byte var13 = 0;
                                 if (var19 == 0) {
                                    var13 = 39;
                                 }

                                 if (var19 == 1) {
                                    var13 = 40;
                                 }

                                 if (var19 == 2) {
                                    var13 = 41;
                                 }

                                 if (var19 == 3) {
                                    var13 = 42;
                                 }

                                 if (var19 == 4) {
                                    var13 = 43;
                                 }

                                 class69.method392(var10[var19], class334.method1616(16748608) + var9.field3764, var13, 0, var14, var0.field2307, var9.field3785);
                              }
                           }
                        }

                        class69.method392(class96.field1233, class334.method1616(16748608) + var9.field3764, 1005, 0, var14, var0.field2307, var9.field3785);
                     }
                  }
               }

               ++var14;
            }
         }
      }

      if (var0.field2215) {
         if (client.field592) {
            var5 = class172.method913(var0);
            boolean var15 = 0 != (var5 >> 21 & 1);
            if (var15 && (class269.field2703 & 32) == 32) {
               class69.method392(client.field595, client.field714 + " " + class389.field3436 + " " + var0.field2216, 58, 0, var0.field2217, var0.field2307, var0.field2220);
            }
         } else {
            for(var14 = 9; var14 >= 5; --var14) {
               String var16;
               if (!class158.method836(class172.method913(var0), var14) && null == var0.field2252) {
                  var16 = null;
               } else if (null != var0.field2300 && var0.field2300.length > var14 && var0.field2300[var14] != null && var0.field2300[var14].trim().length() != 0) {
                  var16 = var0.field2300[var14];
               } else {
                  var16 = null;
               }

               if (null != var16) {
                  class69.method392(var16, var0.field2216, 1007, var14 + 1, var0.field2217, var0.field2307, var0.field2220);
               }
            }

            var4 = class97.method547(var0);
            if (var4 != null) {
               class69.method392(var4, var0.field2216, 25, 0, var0.field2217, var0.field2307, var0.field2220);
            }

            for(var5 = 4; var5 >= 0; --var5) {
               String var17;
               if (!class158.method836(class172.method913(var0), var5) && null == var0.field2252) {
                  var17 = null;
               } else if (var0.field2300 != null && var0.field2300.length > var5 && null != var0.field2300[var5] && var0.field2300[var5].trim().length() != 0) {
                  var17 = var0.field2300[var5];
               } else {
                  var17 = null;
               }

               if (null != var17) {
                  class384.method1821(var17, var0.field2216, 57, var5 + 1, var0.field2217, var0.field2307, var0.field2220, var0.field2365);
               }
            }

            var6 = class172.method913(var0);
            boolean var18 = (var6 & 1) != 0;
            if (var18) {
               class82.method442(class96.field1024, "", 30, 0, var0.field2217, var0.field2307);
            }
         }
      }

   }

   static final int method636() {
      float var1 = 200.0F * ((float)class111.field1385.method1323() - 0.5F);
      return 100 - Math.round(var1);
   }
}
