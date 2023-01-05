public class class360 {
   static int field3233;
   boolean field3211;
   boolean field3220;
   boolean field3226 = true;
   boolean field3230;
   class109[] field3214;
   class313 field3212;
   class313 field3213;
   float field3210;
   float field3216;
   float field3217;
   float field3218;
   float field3221;
   float field3222;
   float field3223;
   float field3224;
   float field3225;
   float field3227;
   float field3231;
   float field3232;
   float[] field3219;
   int field3215;
   int field3228;
   int field3229 = 0;

   int method1716(class134 var1, int var2) {
      int var4 = var1.method671();
      class365.method1764(var1.method669());
      int var6 = var1.method669();
      class313 var7 = (class313)class296.method1399(class489.method2347(), var6);
      if (var7 == null) {
         var7 = class313.field2980;
      }

      this.field3212 = var7;
      int var8 = var1.method669();
      class313 var9 = (class313)class296.method1399(class489.method2347(), var8);
      if (null == var9) {
         var9 = class313.field2980;
      }

      this.field3213 = var9;
      this.field3220 = var1.method669() != 0;
      this.field3214 = new class109[var4];
      class109 var12 = null;

      int var10;
      for(var10 = 0; var10 < var4; ++var10) {
         class109 var11 = new class109();
         var11.method575(var1, var2);
         this.field3214[var10] = var11;
         if (null != var12) {
            var12.field1377 = var11;
         }

         var12 = var11;
      }

      this.field3215 = this.field3214[0].field1378;
      this.field3228 = this.field3214[this.method1720() - 1].field1378;
      this.field3219 = new float[this.method1717() + 1];

      for(var10 = this.method1719(); var10 <= this.method1715(); ++var10) {
         this.field3219[var10 - this.method1719()] = class152.method795(this, (float)var10);
      }

      this.field3214 = null;
      this.field3231 = class152.method795(this, (float)(this.method1719() - 1));
      this.field3227 = class152.method795(this, (float)(this.method1715() + 1));
      return var4;
   }

   public float method1722(int var1) {
      if (var1 < this.method1719()) {
         return this.field3231;
      } else {
         return var1 > this.method1715() ? this.field3227 : this.field3219[var1 - this.method1719()];
      }
   }

   int method1719() {
      return this.field3215;
   }

   int method1715() {
      return this.field3228;
   }

   int method1717() {
      return this.method1715() - this.method1719();
   }

   int method1718(float var1) {
      if (this.field3229 < 0 || (float)this.field3214[this.field3229].field1378 > var1 || null != this.field3214[this.field3229].field1377 && (float)this.field3214[this.field3229].field1377.field1378 <= var1) {
         if (var1 >= (float)this.method1719() && var1 <= (float)this.method1715()) {
            int var3 = this.method1720();
            int var4 = this.field3229;
            if (var3 > 0) {
               int var5 = 0;
               int var6 = var3 - 1;

               do {
                  int var7 = var6 + var5 >> 1;
                  if (var1 < (float)this.field3214[var7].field1378) {
                     if (var1 > (float)this.field3214[var7 - 1].field1378) {
                        var4 = var7 - 1;
                        break;
                     }

                     var6 = var7 - 1;
                  } else {
                     if (var1 <= (float)this.field3214[var7].field1378) {
                        var4 = var7;
                        break;
                     }

                     if (var1 < (float)this.field3214[var7 + 1].field1378) {
                        var4 = var7;
                        break;
                     }

                     var5 = var7 + 1;
                  }
               } while(var5 <= var6);
            }

            if (this.field3229 != var4) {
               this.field3229 = var4;
               this.field3226 = true;
            }

            return this.field3229;
         } else {
            return -1;
         }
      } else {
         return this.field3229;
      }
   }

   class109 method1721(float var1) {
      int var3 = this.method1718(var1);
      return var3 >= 0 && var3 < this.field3214.length ? this.field3214[var3] : null;
   }

   int method1720() {
      return this.field3214 == null ? 0 : this.field3214.length;
   }

   public static class319 method1714(class164 var0, int var1, int var2) {
      byte[] var5 = var0.method892(var1, var2);
      boolean var4;
      if (var5 == null) {
         var4 = false;
      } else {
         class212.method1108(var5);
         var4 = true;
      }

      return !var4 ? null : class425.method2038();
   }

   static void method1723(class169 var0, int var1, int var2) {
      Object[] var4 = var0.field1850;
      class472 var5;
      int var26;
      if (class188.method978(var0.field1856)) {
         class462.field3851 = (class482)var4[0];
         class194 var6 = class143.method776(class462.field3851.field3988);
         var5 = class377.method1800(var0.field1856, var6.field2016, var6.field2035);
      } else {
         var26 = ((Integer)var4[0]).intValue();
         var5 = class465.method2282(var26);
      }

      if (null != var5) {
         class188.field1989 = 0;
         class150.field1582 = 0;
         var26 = -1;
         int[] var7 = var5.field3913;
         int[] var8 = var5.field3914;
         byte var9 = -1;
         class150.field1583 = 0;
         class150.field1585 = false;
         boolean var10 = false;
         int var11 = 0;
         boolean var23 = false;

         label872: {
            label873: {
               try {
                  int var14;
                  try {
                     var23 = true;
                     class150.field1589 = new int[var5.field3915];
                     int var12 = 0;
                     class14.field128 = new String[var5.field3917];
                     int var29 = 0;

                     int var15;
                     String var39;
                     for(var14 = 1; var14 < var4.length; ++var14) {
                        if (var4[var14] instanceof Integer) {
                           var15 = ((Integer)var4[var14]).intValue();
                           if (var15 == -2147483647) {
                              var15 = var0.field1846;
                           }

                           if (var15 == -2147483646) {
                              var15 = var0.field1852;
                           }

                           if (var15 == -2147483645) {
                              var15 = null != var0.field1848 ? var0.field1848.field2307 : -1;
                           }

                           if (var15 == -2147483644) {
                              var15 = var0.field1851;
                           }

                           if (var15 == -2147483643) {
                              var15 = null != var0.field1848 ? -915599827 * var0.field1848.field2217 * 1271165349 : -1;
                           }

                           if (var15 == -2147483642) {
                              var15 = var0.field1858 != null ? var0.field1858.field2307 : -1;
                           }

                           if (var15 == -2147483641) {
                              var15 = var0.field1858 != null ? var0.field1858.field2217 : -1;
                           }

                           if (var15 == -2147483640) {
                              var15 = var0.field1849;
                           }

                           if (var15 == -2147483639) {
                              var15 = var0.field1853;
                           }

                           class150.field1589[var12++] = var15;
                        } else if (var4[var14] instanceof String) {
                           var39 = (String)var4[var14];
                           if (var39.equals("event_opbase")) {
                              var39 = var0.field1854;
                           }

                           class14.field128[var29++] = var39;
                        }
                     }

                     class150.field1591 = var0.field1855;

                     while(true) {
                        ++var11;
                        if (var11 > var1) {
                           throw new RuntimeException();
                        }

                        ++var26;
                        int var27 = var7[var26];
                        if (var27 >= 100) {
                           boolean var38;
                           if (var5.field3914[var26] == 1) {
                              var38 = true;
                           } else {
                              var38 = false;
                           }

                           var15 = class170.method907(var27, var5, var38);
                           switch(var15) {
                           case 0:
                              var23 = false;
                              break label872;
                           case 1:
                           default:
                              break;
                           case 2:
                              throw new IllegalStateException();
                           }
                        } else if (var27 == 0) {
                           class150.field1580[++class188.field1989 - 1] = var8[var26];
                        } else if (var27 == 1) {
                           var14 = var8[var26];
                           class150.field1580[++class188.field1989 - 1] = class484.field3992[var14];
                        } else if (var27 == 2) {
                           var14 = var8[var26];
                           class484.field3992[var14] = class150.field1580[--class188.field1989];
                           class334.method1617(var14);
                        } else if (var27 == 3) {
                           class150.field1581[++class150.field1582 - 1] = var5.field3919[var26];
                        } else if (var27 == 6) {
                           var26 += var8[var26];
                        } else if (var27 == 7) {
                           class188.field1989 -= 2;
                           if (class150.field1580[1 + class188.field1989] != class150.field1580[class188.field1989]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 8) {
                           class188.field1989 -= 2;
                           if (class150.field1580[class188.field1989] == class150.field1580[class188.field1989 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 9) {
                           class188.field1989 -= 2;
                           if (class150.field1580[class188.field1989] < class150.field1580[class188.field1989 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 10) {
                           class188.field1989 -= 2;
                           if (class150.field1580[class188.field1989] > class150.field1580[class188.field1989 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 21) {
                           if (0 == class150.field1583) {
                              var23 = false;
                              break;
                           }

                           class69 var37 = class150.field1584[--class150.field1583];
                           var5 = var37.field847;
                           var7 = var5.field3913;
                           var8 = var5.field3914;
                           var26 = var37.field846;
                           class150.field1589 = var37.field845;
                           class14.field128 = var37.field848;
                        } else if (var27 == 25) {
                           var14 = var8[var26];
                           class150.field1580[++class188.field1989 - 1] = class274.method1302(var14);
                        } else if (var27 == 27) {
                           var14 = var8[var26];
                           class52.method293(var14, class150.field1580[--class188.field1989]);
                        } else if (var27 == 31) {
                           class188.field1989 -= 2;
                           if (class150.field1580[class188.field1989] <= class150.field1580[1 + class188.field1989]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 32) {
                           class188.field1989 -= 2;
                           if (class150.field1580[class188.field1989] >= class150.field1580[class188.field1989 + 1]) {
                              var26 += var8[var26];
                           }
                        } else if (var27 == 33) {
                           class150.field1580[++class188.field1989 - 1] = class150.field1589[var8[var26]];
                        } else if (var27 == 34) {
                           class150.field1589[var8[var26]] = class150.field1580[--class188.field1989];
                        } else if (var27 == 35) {
                           class150.field1581[++class150.field1582 - 1] = class14.field128[var8[var26]];
                        } else if (var27 == 36) {
                           class14.field128[var8[var26]] = class150.field1581[--class150.field1582];
                        } else if (var27 == 37) {
                           var14 = var8[var26];
                           class150.field1582 -= var14;
                           var39 = class448.method2123(class150.field1581, class150.field1582, var14);
                           class150.field1581[++class150.field1582 - 1] = var39;
                        } else if (var27 == 38) {
                           --class188.field1989;
                        } else if (var27 == 39) {
                           --class150.field1582;
                        } else {
                           int var18;
                           if (var27 != 40) {
                              if (var27 == 42) {
                                 class150.field1580[++class188.field1989 - 1] = class430.field3600.method1778(var8[var26]);
                              } else if (var27 == 43) {
                                 class430.field3600.method1769(var8[var26], class150.field1580[--class188.field1989]);
                              } else if (var27 == 44) {
                                 var14 = var8[var26] >> 16;
                                 var15 = var8[var26] & '\uffff';
                                 int var30 = class150.field1580[--class188.field1989];
                                 if (var30 < 0 || var30 > 5000) {
                                    throw new RuntimeException();
                                 }

                                 class150.field1578[var14] = var30;
                                 byte var33 = -1;
                                 if (var15 == 105) {
                                    var33 = 0;
                                 }

                                 for(var18 = 0; var18 < var30; ++var18) {
                                    class150.field1579[var14][var18] = var33;
                                 }
                              } else if (var27 == 45) {
                                 var14 = var8[var26];
                                 var15 = class150.field1580[--class188.field1989];
                                 if (var15 < 0 || var15 >= class150.field1578[var14]) {
                                    throw new RuntimeException();
                                 }

                                 class150.field1580[++class188.field1989 - 1] = class150.field1579[var14][var15];
                              } else if (var27 == 46) {
                                 var14 = var8[var26];
                                 class188.field1989 -= 2;
                                 var15 = class150.field1580[class188.field1989];
                                 if (var15 < 0 || var15 >= class150.field1578[var14]) {
                                    throw new RuntimeException();
                                 }

                                 class150.field1579[var14][var15] = class150.field1580[class188.field1989 + 1];
                              } else {
                                 String var31;
                                 if (var27 == 47) {
                                    var31 = class430.field3600.method1773(var8[var26]);
                                    if (null == var31) {
                                       var31 = class96.field1020;
                                    }

                                    class150.field1581[++class150.field1582 - 1] = var31;
                                 } else if (var27 == 48) {
                                    class430.field3600.method1772(var8[var26], class150.field1581[--class150.field1582]);
                                 } else if (var27 == 49) {
                                    var31 = class430.field3600.method1771(var8[var26]);
                                    class150.field1581[++class150.field1582 - 1] = var31;
                                 } else if (var27 == 50) {
                                    class430.field3600.method1770(var8[var26], class150.field1581[--class150.field1582]);
                                 } else if (var27 == 60) {
                                    class376 var34 = var5.field3920[var8[var26]];
                                    class258 var42 = (class258)var34.method1794((long)class150.field1580[--class188.field1989]);
                                    if (null != var42) {
                                       var26 += var42.field2645;
                                    }
                                 } else {
                                    Integer var35;
                                    if (var27 == 74) {
                                       var35 = class293.field2821.method132(var8[var26]);
                                       if (null == var35) {
                                          class150.field1580[++class188.field1989 - 1] = -1;
                                       } else {
                                          class150.field1580[++class188.field1989 - 1] = var35.intValue();
                                       }
                                    } else {
                                       if (var27 != 76) {
                                          throw new IllegalStateException();
                                       }

                                       var35 = class298.field2877.method1528(var8[var26]);
                                       if (var35 == null) {
                                          class150.field1580[++class188.field1989 - 1] = -1;
                                       } else {
                                          class150.field1580[++class188.field1989 - 1] = var35.intValue();
                                       }
                                    }
                                 }
                              }
                           } else {
                              var14 = var8[var26];
                              class472 var41 = class465.method2282(var14);
                              int[] var16 = new int[var41.field3915];
                              String[] var17 = new String[var41.field3917];

                              for(var18 = 0; var18 < var41.field3921; ++var18) {
                                 var16[var18] = class150.field1580[var18 + (class188.field1989 - var41.field3921)];
                              }

                              for(var18 = 0; var18 < var41.field3916; ++var18) {
                                 var17[var18] = class150.field1581[var18 + (class150.field1582 - var41.field3916)];
                              }

                              class188.field1989 -= var41.field3921;
                              class150.field1582 -= var41.field3916;
                              class69 var36 = new class69();
                              var36.field847 = var5;
                              var36.field846 = var26;
                              var36.field845 = class150.field1589;
                              var36.field848 = class14.field128;
                              class150.field1584[++class150.field1583 - 1] = var36;
                              var5 = var41;
                              var7 = var41.field3913;
                              var8 = var41.field3914;
                              var26 = -1;
                              class150.field1589 = var16;
                              class14.field128 = var17;
                           }
                        }
                     }
                  } catch (Exception var24) {
                     var10 = true;
                     StringBuilder var13 = new StringBuilder(30);
                     var13.append("").append(var5.field1361).append(" ");

                     for(var14 = class150.field1583 - 1; var14 >= 0; --var14) {
                        var13.append("").append(class150.field1584[var14].field847.field1361).append(" ");
                     }

                     var13.append("").append(var9);
                     class23.method122(var13.toString(), var24);
                     var23 = false;
                     break label873;
                  }
               } finally {
                  if (var23) {
                     while(class150.field1587.size() > 0) {
                        class356 var20 = (class356)class150.field1587.remove(0);
                        class83.method444(var20.method1702(), var20.method1703(), var20.method1704(), var20.method1705(), "");
                     }

                     if (class150.field1585) {
                        class150.field1585 = false;
                        class341.method1637();
                     }

                     if (!var10 && var2 > 0 && var11 >= var2) {
                        class23.method122("Warning: Script " + var5.field3912 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
                     }

                  }
               }

               while(class150.field1587.size() > 0) {
                  class356 var40 = (class356)class150.field1587.remove(0);
                  class83.method444(var40.method1702(), var40.method1703(), var40.method1704(), var40.method1705(), "");
               }

               if (class150.field1585) {
                  class150.field1585 = false;
                  class341.method1637();
               }

               if (!var10 && var2 > 0 && var11 >= var2) {
                  class23.method122("Warning: Script " + var5.field3912 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
               }

               return;
            }

            while(class150.field1587.size() > 0) {
               class356 var28 = (class356)class150.field1587.remove(0);
               class83.method444(var28.method1702(), var28.method1703(), var28.method1704(), var28.method1705(), "");
            }

            if (class150.field1585) {
               class150.field1585 = false;
               class341.method1637();
            }

            if (!var10 && var2 > 0 && var11 >= var2) {
               class23.method122("Warning: Script " + var5.field3912 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
            }

            return;
         }

         while(class150.field1587.size() > 0) {
            class356 var32 = (class356)class150.field1587.remove(0);
            class83.method444(var32.method1702(), var32.method1703(), var32.method1704(), var32.method1705(), "");
         }

         if (class150.field1585) {
            class150.field1585 = false;
            class341.method1637();
         }

         if (!var10 && var2 > 0 && var11 >= var2) {
            class23.method122("Warning: Script " + var5.field3912 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
         }

      }
   }

   public static void method1713(class134 var0, int var1) {
      if (null != class143.field1548) {
         try {
            class143.field1548.method2116(0L);
            class143.field1548.method2114(var0.field1489, var1, 24);
         } catch (Exception var4) {
            ;
         }
      }

   }

   static final String method1724(int var0, int var1) {
      int var3 = var1 - var0;
      if (var3 < -9) {
         return class334.method1616(16711680);
      } else if (var3 < -6) {
         return class334.method1616(16723968);
      } else if (var3 < -3) {
         return class334.method1616(16740352);
      } else if (var3 < 0) {
         return class334.method1616(16756736);
      } else if (var3 > 9) {
         return class334.method1616(65280);
      } else if (var3 > 6) {
         return class334.method1616(4259584);
      } else if (var3 > 3) {
         return class334.method1616(8453888);
      } else {
         return var3 > 0 ? class334.method1616(12648192) : class334.method1616(16776960);
      }
   }
}
