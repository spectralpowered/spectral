public class class293 implements class445 {
   static class27 field2821;
   static int field2818;
   static final class293 field2811 = new class293(5, 5, (String)null, 3);
   static final class293 field2812 = new class293(1, 1, (String)null, 9);
   static final class293 field2813 = new class293(3, 3, (String)null, 6);
   static final class293 field2814 = new class293(0, 0, (String)null, 0);
   static final class293 field2815 = new class293(4, 4, (String)null, 1);
   static final class293 field2816 = new class293(2, 2, (String)null, 3);
   final int field2817;
   final int field2819;
   final int field2820;

   class293(int var1, int var2, String var3, int var4) {
      this.field2817 = var1;
      this.field2819 = var2;
      this.field2820 = var4;
   }

   int method1381() {
      return this.field2820;
   }

   public int method2118() {
      return this.field2819;
   }

   public static void method1383(class164 var0, class164 var1) {
      class5.field24 = var0;
      class5.field16 = var1;
   }

   static int method1384(int var0, class472 var1, boolean var2) {
      int var4;
      if (var0 == 6600) {
         var4 = class195.field2036;
         int var17 = class381.field3325 + (class89.field982.field297 >> 7);
         int var13 = class345.field3166 + (class89.field982.field233 >> 7);
         client.method289().method1835(var4, var17, var13, true);
         return 1;
      } else {
         class430 var8;
         if (var0 == 6601) {
            var4 = class150.field1580[--class188.field1989];
            String var16 = "";
            var8 = client.method289().method1847(var4);
            if (var8 != null) {
               var16 = var8.method2075();
            }

            class150.field1581[++class150.field1582 - 1] = var16;
            return 1;
         } else if (var0 == 6602) {
            var4 = class150.field1580[--class188.field1989];
            client.method289().method1836(var4);
            return 1;
         } else if (var0 == 6603) {
            class150.field1580[++class188.field1989 - 1] = client.method289().method1845();
            return 1;
         } else if (var0 == 6604) {
            var4 = class150.field1580[--class188.field1989];
            client.method289().method1842(var4);
            return 1;
         } else if (var0 == 6605) {
            class150.field1580[++class188.field1989 - 1] = client.method289().method1879() ? 1 : 0;
            return 1;
         } else {
            class308 var15;
            if (var0 == 6606) {
               var15 = new class308(class150.field1580[--class188.field1989]);
               client.method289().method1871(var15.field2904, var15.field2905);
               return 1;
            } else if (var0 == 6607) {
               var15 = new class308(class150.field1580[--class188.field1989]);
               client.method289().method1849(var15.field2904, var15.field2905);
               return 1;
            } else if (var0 == 6608) {
               var15 = new class308(class150.field1580[--class188.field1989]);
               client.method289().method1848(var15.field2903, var15.field2904, var15.field2905);
               return 1;
            } else if (var0 == 6609) {
               var15 = new class308(class150.field1580[--class188.field1989]);
               client.method289().method1874(var15.field2903, var15.field2904, var15.field2905);
               return 1;
            } else if (var0 == 6610) {
               class150.field1580[++class188.field1989 - 1] = client.method289().method1872();
               class150.field1580[++class188.field1989 - 1] = client.method289().method1850();
               return 1;
            } else {
               class430 var12;
               if (var0 == 6611) {
                  var4 = class150.field1580[--class188.field1989];
                  var12 = client.method289().method1847(var4);
                  if (null == var12) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = var12.method2064().method1446();
                  }

                  return 1;
               } else if (var0 == 6612) {
                  var4 = class150.field1580[--class188.field1989];
                  var12 = client.method289().method1847(var4);
                  if (var12 == null) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     class150.field1580[++class188.field1989 - 1] = 0;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = (var12.method2066() - var12.method2072() + 1) * 64;
                     class150.field1580[++class188.field1989 - 1] = (var12.method2068() - var12.method2067() + 1) * 64;
                  }

                  return 1;
               } else if (var0 == 6613) {
                  var4 = class150.field1580[--class188.field1989];
                  var12 = client.method289().method1847(var4);
                  if (null == var12) {
                     class150.field1580[++class188.field1989 - 1] = 0;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     class150.field1580[++class188.field1989 - 1] = 0;
                     class150.field1580[++class188.field1989 - 1] = 0;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = var12.method2072() * 64;
                     class150.field1580[++class188.field1989 - 1] = var12.method2067() * 64;
                     class150.field1580[++class188.field1989 - 1] = var12.method2066() * 64 + 64 - 1;
                     class150.field1580[++class188.field1989 - 1] = var12.method2068() * 64 + 64 - 1;
                  }

                  return 1;
               } else if (var0 == 6614) {
                  var4 = class150.field1580[--class188.field1989];
                  var12 = client.method289().method1847(var4);
                  if (null == var12) {
                     class150.field1580[++class188.field1989 - 1] = -1;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = var12.method2065();
                  }

                  return 1;
               } else if (var0 == 6615) {
                  var15 = client.method289().method1882();
                  if (null == var15) {
                     class150.field1580[++class188.field1989 - 1] = -1;
                     class150.field1580[++class188.field1989 - 1] = -1;
                  } else {
                     class150.field1580[++class188.field1989 - 1] = var15.field2904;
                     class150.field1580[++class188.field1989 - 1] = var15.field2905;
                  }

                  return 1;
               } else if (var0 == 6616) {
                  class150.field1580[++class188.field1989 - 1] = client.method289().method1877();
                  return 1;
               } else if (var0 == 6617) {
                  var15 = new class308(class150.field1580[--class188.field1989]);
                  var12 = client.method289().method1837();
                  if (null == var12) {
                     class150.field1580[++class188.field1989 - 1] = -1;
                     class150.field1580[++class188.field1989 - 1] = -1;
                     return 1;
                  } else {
                     int[] var11 = var12.method2073(var15.field2903, var15.field2904, var15.field2905);
                     if (null == var11) {
                        class150.field1580[++class188.field1989 - 1] = -1;
                        class150.field1580[++class188.field1989 - 1] = -1;
                     } else {
                        class150.field1580[++class188.field1989 - 1] = var11[0];
                        class150.field1580[++class188.field1989 - 1] = var11[1];
                     }

                     return 1;
                  }
               } else {
                  class308 var6;
                  if (var0 == 6618) {
                     var15 = new class308(class150.field1580[--class188.field1989]);
                     var12 = client.method289().method1837();
                     if (var12 == null) {
                        class150.field1580[++class188.field1989 - 1] = -1;
                        class150.field1580[++class188.field1989 - 1] = -1;
                        return 1;
                     } else {
                        var6 = var12.method2059(var15.field2904, var15.field2905);
                        if (var6 == null) {
                           class150.field1580[++class188.field1989 - 1] = -1;
                        } else {
                           class150.field1580[++class188.field1989 - 1] = var6.method1446();
                        }

                        return 1;
                     }
                  } else {
                     class308 var9;
                     if (var0 == 6619) {
                        class188.field1989 -= 2;
                        var4 = class150.field1580[class188.field1989];
                        var9 = new class308(class150.field1580[1 + class188.field1989]);
                        class34.method170(var4, var9, false);
                        return 1;
                     } else if (var0 == 6620) {
                        class188.field1989 -= 2;
                        var4 = class150.field1580[class188.field1989];
                        var9 = new class308(class150.field1580[class188.field1989 + 1]);
                        class34.method170(var4, var9, true);
                        return 1;
                     } else if (var0 == 6621) {
                        class188.field1989 -= 2;
                        var4 = class150.field1580[class188.field1989];
                        var9 = new class308(class150.field1580[1 + class188.field1989]);
                        var8 = client.method289().method1847(var4);
                        if (null == var8) {
                           class150.field1580[++class188.field1989 - 1] = 0;
                           return 1;
                        } else {
                           class150.field1580[++class188.field1989 - 1] = var8.method2076(var9.field2903, var9.field2904, var9.field2905) ? 1 : 0;
                           return 1;
                        }
                     } else if (var0 == 6622) {
                        class150.field1580[++class188.field1989 - 1] = client.method289().method1851();
                        class150.field1580[++class188.field1989 - 1] = client.method289().method1852();
                        return 1;
                     } else if (var0 == 6623) {
                        var15 = new class308(class150.field1580[--class188.field1989]);
                        var12 = client.method289().method1834(var15.field2903, var15.field2904, var15.field2905);
                        if (null == var12) {
                           class150.field1580[++class188.field1989 - 1] = -1;
                        } else {
                           class150.field1580[++class188.field1989 - 1] = var12.method2061();
                        }

                        return 1;
                     } else if (var0 == 6624) {
                        client.method289().method1853(class150.field1580[--class188.field1989]);
                        return 1;
                     } else if (var0 == 6625) {
                        client.method289().method1854();
                        return 1;
                     } else if (var0 == 6626) {
                        client.method289().method1875(class150.field1580[--class188.field1989]);
                        return 1;
                     } else if (var0 == 6627) {
                        client.method289().method1881();
                        return 1;
                     } else {
                        boolean var14;
                        if (var0 == 6628) {
                           var14 = class150.field1580[--class188.field1989] == 1;
                           client.method289().method1855(var14);
                           return 1;
                        } else if (var0 == 6629) {
                           var4 = class150.field1580[--class188.field1989];
                           client.method289().method1856(var4);
                           return 1;
                        } else if (var0 == 6630) {
                           var4 = class150.field1580[--class188.field1989];
                           client.method289().method1857(var4);
                           return 1;
                        } else if (var0 == 6631) {
                           client.method289().method1858();
                           return 1;
                        } else if (var0 == 6632) {
                           var14 = class150.field1580[--class188.field1989] == 1;
                           client.method289().method1830(var14);
                           return 1;
                        } else {
                           boolean var10;
                           if (var0 == 6633) {
                              class188.field1989 -= 2;
                              var4 = class150.field1580[class188.field1989];
                              var10 = class150.field1580[class188.field1989 + 1] == 1;
                              client.method289().method1860(var4, var10);
                              return 1;
                           } else if (var0 == 6634) {
                              class188.field1989 -= 2;
                              var4 = class150.field1580[class188.field1989];
                              var10 = 1 == class150.field1580[1 + class188.field1989];
                              client.method289().method1861(var4, var10);
                              return 1;
                           } else if (var0 == 6635) {
                              class150.field1580[++class188.field1989 - 1] = client.method289().method1862() ? 1 : 0;
                              return 1;
                           } else if (var0 == 6636) {
                              var4 = class150.field1580[--class188.field1989];
                              class150.field1580[++class188.field1989 - 1] = client.method289().method1883(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6637) {
                              var4 = class150.field1580[--class188.field1989];
                              class150.field1580[++class188.field1989 - 1] = client.method289().method1873(var4) ? 1 : 0;
                              return 1;
                           } else if (var0 == 6638) {
                              class188.field1989 -= 2;
                              var4 = class150.field1580[class188.field1989];
                              var9 = new class308(class150.field1580[class188.field1989 + 1]);
                              var6 = client.method289().method1866(var4, var9);
                              if (null == var6) {
                                 class150.field1580[++class188.field1989 - 1] = -1;
                              } else {
                                 class150.field1580[++class188.field1989 - 1] = var6.method1446();
                              }

                              return 1;
                           } else {
                              class428 var7;
                              if (var0 == 6639) {
                                 var7 = client.method289().method1867();
                                 if (null == var7) {
                                    class150.field1580[++class188.field1989 - 1] = -1;
                                    class150.field1580[++class188.field1989 - 1] = -1;
                                 } else {
                                    class150.field1580[++class188.field1989 - 1] = var7.method2047();
                                    class150.field1580[++class188.field1989 - 1] = var7.field3586.method1446();
                                 }

                                 return 1;
                              } else if (var0 == 6640) {
                                 var7 = client.method289().method1876();
                                 if (var7 == null) {
                                    class150.field1580[++class188.field1989 - 1] = -1;
                                    class150.field1580[++class188.field1989 - 1] = -1;
                                 } else {
                                    class150.field1580[++class188.field1989 - 1] = var7.method2047();
                                    class150.field1580[++class188.field1989 - 1] = var7.field3586.method1446();
                                 }

                                 return 1;
                              } else {
                                 class194 var5;
                                 if (var0 == 6693) {
                                    var4 = class150.field1580[--class188.field1989];
                                    var5 = class143.method776(var4);
                                    if (var5.field2019 == null) {
                                       class150.field1581[++class150.field1582 - 1] = "";
                                    } else {
                                       class150.field1581[++class150.field1582 - 1] = var5.field2019;
                                    }

                                    return 1;
                                 } else if (var0 == 6694) {
                                    var4 = class150.field1580[--class188.field1989];
                                    var5 = class143.method776(var4);
                                    class150.field1580[++class188.field1989 - 1] = var5.field2022;
                                    return 1;
                                 } else if (var0 == 6695) {
                                    var4 = class150.field1580[--class188.field1989];
                                    var5 = class143.method776(var4);
                                    if (var5 == null) {
                                       class150.field1580[++class188.field1989 - 1] = -1;
                                    } else {
                                       class150.field1580[++class188.field1989 - 1] = var5.field2035;
                                    }

                                    return 1;
                                 } else if (var0 == 6696) {
                                    var4 = class150.field1580[--class188.field1989];
                                    var5 = class143.method776(var4);
                                    if (var5 == null) {
                                       class150.field1580[++class188.field1989 - 1] = -1;
                                    } else {
                                       class150.field1580[++class188.field1989 - 1] = var5.field2012;
                                    }

                                    return 1;
                                 } else if (var0 == 6697) {
                                    class150.field1580[++class188.field1989 - 1] = class462.field3851.field3988;
                                    return 1;
                                 } else if (var0 == 6698) {
                                    class150.field1580[++class188.field1989 - 1] = class462.field3851.field3986.method1446();
                                    return 1;
                                 } else if (var0 == 6699) {
                                    class150.field1580[++class188.field1989 - 1] = class462.field3851.field3987.method1446();
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
