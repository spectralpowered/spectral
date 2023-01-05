public class class223 implements class78 {
   static class429 field1922;
   static int field1919;
   static final class223 field1912 = new class223(5, 5, (String)null, 3);
   static final class223 field1913 = new class223(1, 1, (String)null, 9);
   static final class223 field1914 = new class223(3, 3, (String)null, 6);
   static final class223 field1915 = new class223(0, 0, (String)null, 0);
   static final class223 field1916 = new class223(4, 4, (String)null, 1);
   static final class223 field1917 = new class223(2, 2, (String)null, 3);
   final int field1918;
   final int field1920;
   final int field1921;

   class223(int var1, int var2, String var3, int var4) {
      this.field1918 = var1;
      this.field1920 = var2;
      this.field1921 = var4;
   }

   int method987() {
      return this.field1921;
   }

   public int method330() {
      return this.field1920;
   }

   public static void method988(class274 var0, class274 var1) {
      class406.field3401 = var0;
      class406.field3393 = var1;
   }

   static int method989(int var0, class461 var1, boolean var2) {
      int var4;
      if (var0 == 6600) {
         var4 = class347.field2878;
         int var17 = class312.field2465 + (class113.field846.field2672 >> 7);
         int var13 = class325.field2575 + (class113.field846.field2608 >> 7);
         client.method197().method1289(var4, var17, var13, true);
         return 1;
      } else {
         class46 var8;
         if (var0 == 6601) {
            var4 = class386.field3248[--class161.field1227];
            String var16 = "";
            var8 = client.method197().method1301(var4);
            if (var8 != null) {
               var16 = var8.method239();
            }

            class386.field3249[++class386.field3250 - 1] = var16;
            return 1;
         } else if (var0 == 6602) {
            var4 = class386.field3248[--class161.field1227];
            client.method197().method1290(var4);
            return 1;
         } else if (var0 == 6603) {
            class386.field3248[++class161.field1227 - 1] = client.method197().method1299();
            return 1;
         } else if (var0 == 6604) {
            var4 = class386.field3248[--class161.field1227];
            client.method197().method1296(var4);
            return 1;
         } else if (var0 == 6605) {
            class386.field3248[++class161.field1227 - 1] = client.method197().method1333() ? 1 : 0;
            return 1;
         } else {
            class464 var15;
            if (var0 == 6606) {
               var15 = new class464(class386.field3248[--class161.field1227]);
               client.method197().method1325(var15.field3852, var15.field3853);
               return 1;
            } else if (var0 == 6607) {
               var15 = new class464(class386.field3248[--class161.field1227]);
               client.method197().method1303(var15.field3852, var15.field3853);
               return 1;
            } else if (var0 == 6608) {
               var15 = new class464(class386.field3248[--class161.field1227]);
               client.method197().method1302(var15.field3851, var15.field3852, var15.field3853);
               return 1;
            } else if (var0 == 6609) {
               var15 = new class464(class386.field3248[--class161.field1227]);
               client.method197().method1328(var15.field3851, var15.field3852, var15.field3853);
               return 1;
            } else if (var0 == 6610) {
               class386.field3248[++class161.field1227 - 1] = client.method197().method1326();
               class386.field3248[++class161.field1227 - 1] = client.method197().method1304();
               return 1;
            } else {
               class46 var12;
               if (var0 == 6611) {
                  var4 = class386.field3248[--class161.field1227];
                  var12 = client.method197().method1301(var4);
                  if (null == var12) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                  } else {
                     class386.field3248[++class161.field1227 - 1] = var12.method228().method2278();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = class386.field3248[--class161.field1227];
                  var12 = client.method197().method1301(var4);
                  if (var12 == null) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     class386.field3248[++class161.field1227 - 1] = 0;
                  } else {
                     class386.field3248[++class161.field1227 - 1] = (var12.method230() - var12.method236() + 1) * 64;
                     class386.field3248[++class161.field1227 - 1] = (var12.method232() - var12.method231() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var4 = class386.field3248[--class161.field1227];
                  var12 = client.method197().method1301(var4);
                  if (null == var12) {
                     class386.field3248[++class161.field1227 - 1] = 0;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     class386.field3248[++class161.field1227 - 1] = 0;
                     class386.field3248[++class161.field1227 - 1] = 0;
                  } else {
                     class386.field3248[++class161.field1227 - 1] = var12.method236() * 64;
                     class386.field3248[++class161.field1227 - 1] = var12.method231() * 64;
                     class386.field3248[++class161.field1227 - 1] = var12.method230() * 64 + 64 - 1;
                     class386.field3248[++class161.field1227 - 1] = var12.method232() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = class386.field3248[--class161.field1227];
                  var12 = client.method197().method1301(var4);
                  if (null == var12) {
                     class386.field3248[++class161.field1227 - 1] = -1;
                  } else {
                     class386.field3248[++class161.field1227 - 1] = var12.method229();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var15 = client.method197().method1336();
                  if (null == var15) {
                     class386.field3248[++class161.field1227 - 1] = -1;
                     class386.field3248[++class161.field1227 - 1] = -1;
                  } else {
                     class386.field3248[++class161.field1227 - 1] = var15.field3852;
                     class386.field3248[++class161.field1227 - 1] = var15.field3853;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  class386.field3248[++class161.field1227 - 1] = client.method197().method1331();
                  return 1;
               } else if (var0 == 6617) {
                  var15 = new class464(class386.field3248[--class161.field1227]);
                  var12 = client.method197().method1291();
                  if (null == var12) {
                     class386.field3248[++class161.field1227 - 1] = -1;
                     class386.field3248[++class161.field1227 - 1] = -1;
                     return 1;
                  } else {
                     int[] var11 = var12.method237(var15.field3851, var15.field3852, var15.field3853);
                     if (null == var11) {
                        class386.field3248[++class161.field1227 - 1] = -1;
                        class386.field3248[++class161.field1227 - 1] = -1;
                     } else {
                        class386.field3248[++class161.field1227 - 1] = var11[0];
                        class386.field3248[++class161.field1227 - 1] = var11[1];
                     }

                     return 1;
                  }
               } else {
                  class464 var6;
                  if (var0 == 6618) {
                     var15 = new class464(class386.field3248[--class161.field1227]);
                     var12 = client.method197().method1291();
                     if (var12 == null) {
                        class386.field3248[++class161.field1227 - 1] = -1;
                        class386.field3248[++class161.field1227 - 1] = -1;
                        return 1;
                     } else {
                        var6 = var12.method223(var15.field3852, var15.field3853);
                        if (var6 == null) {
                           class386.field3248[++class161.field1227 - 1] = -1;
                        } else {
                           class386.field3248[++class161.field1227 - 1] = var6.method2278();
                        }

                        return 1;
                     }
                  } else {
                     class464 var9;
                     if (var0 == 6619) {
                        class161.field1227 -= 2;
                        var4 = class386.field3248[class161.field1227];
                        var9 = new class464(class386.field3248[1 + class161.field1227]);
                        class483.method2376(var4, var9, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class161.field1227 -= 2;
                        var4 = class386.field3248[class161.field1227];
                        var9 = new class464(class386.field3248[class161.field1227 + 1]);
                        class483.method2376(var4, var9, true);
                        return 1;
                     } else if (var0 == 6621) {
                        class161.field1227 -= 2;
                        var4 = class386.field3248[class161.field1227];
                        var9 = new class464(class386.field3248[1 + class161.field1227]);
                        var8 = client.method197().method1301(var4);
                        if (null == var8) {
                           class386.field3248[++class161.field1227 - 1] = 0;
                           return 1;
                        } else {
                           class386.field3248[++class161.field1227 - 1] = var8.method240(var9.field3851, var9.field3852, var9.field3853) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        class386.field3248[++class161.field1227 - 1] = client.method197().method1305();
                        class386.field3248[++class161.field1227 - 1] = client.method197().method1306();
                        return 1;
                     } else if (var0 == 6623) {
                        var15 = new class464(class386.field3248[--class161.field1227]);
                        var12 = client.method197().method1288(var15.field3851, var15.field3852, var15.field3853);
                        if (null == var12) {
                           class386.field3248[++class161.field1227 - 1] = -1;
                        } else {
                           class386.field3248[++class161.field1227 - 1] = var12.method225();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        client.method197().method1307(class386.field3248[--class161.field1227]);
                        return 1;
                     } else if (var0 == 6625) {
                        client.method197().method1308();
                        return 1;
                     } else if (var0 == 6626) {
                        client.method197().method1329(class386.field3248[--class161.field1227]);
                        return 1;
                     } else if (var0 == 6627) {
                        client.method197().method1335();
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = class386.field3248[--class161.field1227] == 1;
                           client.method197().method1309(var14);
                           return 1;
                        } else if (var0 == 6629) {
                           var4 = class386.field3248[--class161.field1227];
                           client.method197().method1310(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = class386.field3248[--class161.field1227];
                           client.method197().method1311(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           client.method197().method1312();
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = class386.field3248[--class161.field1227] == 1;
                           client.method197().method1284(var14);
                           return 1;
                        } else {
                           boolean var10;
                           if (var0 == 6633) {
                              class161.field1227 -= 2;
                              var4 = class386.field3248[class161.field1227];
                              var10 = class386.field3248[class161.field1227 + 1] == 1;
                              client.method197().method1314(var4, var10);
                              return 1;
                           } else if (var0 == 6634) {
                              class161.field1227 -= 2;
                              var4 = class386.field3248[class161.field1227];
                              var10 = 1 == class386.field3248[1 + class161.field1227];
                              client.method197().method1315(var4, var10);
                              return 1;
                           } else if (var0 == 6635) {
                              class386.field3248[++class161.field1227 - 1] = client.method197().method1316() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var4 = class386.field3248[--class161.field1227];
                              class386.field3248[++class161.field1227 - 1] = client.method197().method1337(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = class386.field3248[--class161.field1227];
                              class386.field3248[++class161.field1227 - 1] = client.method197().method1327(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class161.field1227 -= 2;
                              var4 = class386.field3248[class161.field1227];
                              var9 = new class464(class386.field3248[class161.field1227 + 1]);
                              var6 = client.method197().method1320(var4, var9);
                              if (null == var6) {
                                 class386.field3248[++class161.field1227 - 1] = -1;
                              } else {
                                 class386.field3248[++class161.field1227 - 1] = var6.method2278();
                              }

                              return 1;
                           } else {
                              class389 var7;
                              if (var0 == 6639) {
                                 var7 = client.method197().method1321();
                                 if (null == var7) {
                                    class386.field3248[++class161.field1227 - 1] = -1;
                                    class386.field3248[++class161.field1227 - 1] = -1;
                                 } else {
                                    class386.field3248[++class161.field1227 - 1] = var7.method1910();
                                    class386.field3248[++class161.field1227 - 1] = var7.field3277.method2278();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var7 = client.method197().method1330();
                                 if (var7 == null) {
                                    class386.field3248[++class161.field1227 - 1] = -1;
                                    class386.field3248[++class161.field1227 - 1] = -1;
                                 } else {
                                    class386.field3248[++class161.field1227 - 1] = var7.method1910();
                                    class386.field3248[++class161.field1227 - 1] = var7.field3277.method2278();
                                 }

                                 return 1;
                              } else {
                                 class396 var5;
                                 if (var0 == 6693) {
                                    var4 = class386.field3248[--class161.field1227];
                                    var5 = class25.method100(var4);
                                    if (var5.field3318 == null) {
                                       class386.field3249[++class386.field3250 - 1] = "";
                                    } else {
                                       class386.field3249[++class386.field3250 - 1] = var5.field3318;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = class386.field3248[--class161.field1227];
                                    var5 = class25.method100(var4);
                                    class386.field3248[++class161.field1227 - 1] = var5.field3321;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var4 = class386.field3248[--class161.field1227];
                                    var5 = class25.method100(var4);
                                    if (var5 == null) {
                                       class386.field3248[++class161.field1227 - 1] = -1;
                                    } else {
                                       class386.field3248[++class161.field1227 - 1] = var5.field3334;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var4 = class386.field3248[--class161.field1227];
                                    var5 = class25.method100(var4);
                                    if (var5 == null) {
                                       class386.field3248[++class161.field1227 - 1] = -1;
                                    } else {
                                       class386.field3248[++class161.field1227 - 1] = var5.field3311;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    class386.field3248[++class161.field1227 - 1] = class375.field3181.field3420;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    class386.field3248[++class161.field1227 - 1] = class375.field3181.field3418.method2278();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    class386.field3248[++class161.field1227 - 1] = class375.field3181.field3419.method2278();
                                    return 1;
                                 } else {
                                    return 2;
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
