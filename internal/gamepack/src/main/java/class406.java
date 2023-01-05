public class class406 extends class428 {
   static class429 field3538;
   class133 field3537;
   int field3534;
   int field3536;
   int field3539;
   final class68 field3535;
   final int field3540;

   class406(class308 var1, class308 var2, int var3, class68 var4) {
      super(var1, var2);
      this.field3540 = var3;
      this.field3535 = var4;
      this.method1981();
   }

   void method1981() {
      this.field3536 = class212.method1110(this.field3540).method925().field1891;
      this.field3537 = this.field3535.method386(class143.method776(this.field3536));
      class194 var2 = class143.method776(this.method2047());
      class319 var3 = var2.method998(false);
      if (null != var3) {
         this.field3534 = var3.field3014;
         this.field3539 = var3.field3013;
      } else {
         this.field3534 = 0;
         this.field3539 = 0;
      }

   }

   public int method2047() {
      return this.field3536;
   }

   class133 method2048() {
      return this.field3537;
   }

   int method2043() {
      return this.field3534;
   }

   int method2049() {
      return this.field3539;
   }

   public static void method1988(class164 var0) {
      class198.field2038 = var0;
   }

   public static void method1989(class164 var0, class164 var1, class164 var2) {
      class79.field898 = var0;
      class79.field899 = var1;
      class140.field1509 = var2;
   }

   static char method1986(char var0) {
      if (var0 == 198) {
         return 'E';
      } else if (var0 == 230) {
         return 'e';
      } else if (var0 == 223) {
         return 's';
      } else if (var0 == 338) {
         return 'E';
      } else {
         return (char)(var0 == 339 ? 'e' : '\u0000');
      }
   }

   static final void method1987(class12 var0, class391[] var1) {
      int var3;
      int var4;
      int var5;
      int var6;
      for(var3 = 0; var3 < 4; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            for(var5 = 0; var5 < 104; ++var5) {
               if ((class74.field866[var3][var4][var5] & 1) == 1) {
                  var6 = var3;
                  if (2 == (class74.field866[1][var4][var5] & 2)) {
                     var6 = var3 - 1;
                  }

                  if (var6 >= 0) {
                     var1[var6].method1888(var4, var5);
                  }
               }
            }
         }
      }

      class74.field871 += (int)(Math.random() * 5.0D) - 2;
      if (class74.field871 < -8) {
         class74.field871 = -8;
      }

      if (class74.field871 > 8) {
         class74.field871 = 8;
      }

      class74.field872 += (int)(Math.random() * 5.0D) - 2;
      if (class74.field872 < -16) {
         class74.field872 = -16;
      }

      if (class74.field872 > 16) {
         class74.field872 = 16;
      }

      int var10;
      int var11;
      int var12;
      int var13;
      int var14;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      for(var3 = 0; var3 < 4; ++var3) {
         byte[][] var46 = class431.field3603[var3];
         boolean var47 = true;
         boolean var48 = true;
         boolean var7 = true;
         boolean var8 = true;
         boolean var9 = true;
         var10 = (int)Math.sqrt(5100.0D);
         var11 = var10 * 768 >> 8;

         int var20;
         int var21;
         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               var14 = class74.field858[var3][var13 + 1][var12] - class74.field858[var3][var13 - 1][var12];
               var15 = class74.field858[var3][var13][var12 + 1] - class74.field858[var3][var13][var12 - 1];
               var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
               var17 = (var14 << 8) / var16;
               var18 = 65536 / var16;
               var19 = (var15 << 8) / var16;
               var20 = 96 + (var19 * -50 + var18 * -10 + var17 * -50) / var11;
               var21 = (var46[var13][var12] >> 1) + (var46[var13][var12 + 1] >> 3) + (var46[var13][var12 - 1] >> 2) + (var46[var13 + 1][var12] >> 3) + (var46[var13 - 1][var12] >> 2);
               class74.field862[var13][var12] = var20 - var21;
            }
         }

         for(var12 = 0; var12 < 104; ++var12) {
            class74.field863[var12] = 0;
            class157.field1637[var12] = 0;
            class74.field870[var12] = 0;
            class53.field799[var12] = 0;
            class387.field3423[var12] = 0;
         }

         for(var12 = -5; var12 < 109; ++var12) {
            for(var13 = 0; var13 < 104; ++var13) {
               var14 = var12 + 5;
               if (var14 >= 0 && var14 < 104) {
                  var15 = client.field432 < 209 ? (int)class331.method1599(8) : (int)class331.method1599(15);
                  var16 = class74.field860[var3][var14][var13] & var15;
                  if (var16 > 0) {
                     class361 var52 = class269.method1278(var16 - 1);
                     class74.field863[var13] += var52.field3234;
                     class157.field1637[var13] += var52.field3235;
                     class74.field870[var13] += var52.field3237;
                     class53.field799[var13] += var52.field3240;
                     ++class387.field3423[var13];
                  }
               }

               var15 = var12 - 5;
               if (var15 >= 0 && var15 < 104) {
                  var16 = client.field432 < 209 ? (int)class331.method1599(8) : (int)class331.method1599(15);
                  var17 = class74.field860[var3][var15][var13] & var16;
                  if (var17 > 0) {
                     class361 var54 = class269.method1278(var17 - 1);
                     class74.field863[var13] -= var54.field3234;
                     class157.field1637[var13] -= var54.field3235;
                     class74.field870[var13] -= var54.field3237;
                     class53.field799[var13] -= var54.field3240;
                     --class387.field3423[var13];
                  }
               }
            }

            if (var12 >= 1 && var12 < 103) {
               var13 = 0;
               var14 = 0;
               var15 = 0;
               var16 = 0;
               var17 = 0;

               for(var18 = -5; var18 < 109; ++var18) {
                  var19 = var18 + 5;
                  if (var19 >= 0 && var19 < 104) {
                     var13 += class74.field863[var19];
                     var14 += class157.field1637[var19];
                     var15 += class74.field870[var19];
                     var16 += class53.field799[var19];
                     var17 += class387.field3423[var19];
                  }

                  var20 = var18 - 5;
                  if (var20 >= 0 && var20 < 104) {
                     var13 -= class74.field863[var20];
                     var14 -= class157.field1637[var20];
                     var15 -= class74.field870[var20];
                     var16 -= class53.field799[var20];
                     var17 -= class387.field3423[var20];
                  }

                  if (var18 >= 1 && var18 < 103 && (!client.field478 || 0 != (class74.field866[0][var12][var18] & 2) || 0 == (class74.field866[var3][var12][var18] & 16))) {
                     if (var3 < class74.field859) {
                        class74.field859 = var3;
                     }

                     var21 = client.field432 < 209 ? (int)class331.method1599(8) : (int)class331.method1599(15);
                     int var22 = class74.field860[var3][var12][var18] & var21;
                     int var23 = class151.field1592[var3][var12][var18] & var21;
                     if (var22 > 0 || var23 > 0) {
                        int var24 = class74.field858[var3][var12][var18];
                        int var25 = class74.field858[var3][var12 + 1][var18];
                        int var26 = class74.field858[var3][var12 + 1][var18 + 1];
                        int var27 = class74.field858[var3][var12][var18 + 1];
                        int var28 = class74.field862[var12][var18];
                        int var29 = class74.field862[var12 + 1][var18];
                        int var30 = class74.field862[var12 + 1][var18 + 1];
                        int var31 = class74.field862[var12][var18 + 1];
                        int var32 = -1;
                        int var33 = -1;
                        int var34;
                        int var35;
                        int var36;
                        if (var22 > 0) {
                           var34 = var13 * 256 / var16;
                           var35 = var14 / var17;
                           var36 = var15 / var17;
                           var32 = class331.method1600(var34, var35, var36);
                           var34 = class74.field871 + var34 & 255;
                           var36 += class74.field872;
                           if (var36 < 0) {
                              var36 = 0;
                           } else if (var36 > 255) {
                              var36 = 255;
                           }

                           var33 = class331.method1600(var34, var35, var36);
                        }

                        class152 var37;
                        if (var3 > 0) {
                           boolean var55 = true;
                           if (var22 == 0 && 0 != class74.field865[var3][var12][var18]) {
                              var55 = false;
                           }

                           if (var23 > 0) {
                              var36 = var23 - 1;
                              var37 = (class152)class152.field1594.method161((long)var36);
                              class152 var56;
                              if (null != var37) {
                                 var56 = var37;
                              } else {
                                 byte[] var38 = class152.field1593.method892(4, var36);
                                 var37 = new class152();
                                 if (var38 != null) {
                                    var37.method797(new class134(var38), var36);
                                 }

                                 var37.method796();
                                 class152.field1594.method163(var37, (long)var36);
                                 var56 = var37;
                              }

                              if (!var56.field1597) {
                                 var55 = false;
                              }
                           }

                           if (var55 && var25 == var24 && var24 == var26 && var27 == var24) {
                              class15.field132[var3][var12][var18] |= 2340;
                           }
                        }

                        var34 = 0;
                        if (var33 != -1) {
                           var34 = class234.field2540[class90.method498(var33, 96)];
                        }

                        if (var23 == 0) {
                           var0.method34(var3, var12, var18, 0, 0, -1, var24, var25, var26, var27, class90.method498(var32, var28), class90.method498(var32, var29), class90.method498(var32, var30), class90.method498(var32, var31), 0, 0, 0, 0, var34, 0);
                        } else {
                           var35 = 1 + class74.field865[var3][var12][var18];
                           byte var57 = class307.field2897[var3][var12][var18];
                           int var58 = var23 - 1;
                           class152 var39 = (class152)class152.field1594.method161((long)var58);
                           if (null != var39) {
                              var37 = var39;
                           } else {
                              byte[] var40 = class152.field1593.method892(4, var58);
                              var39 = new class152();
                              if (null != var40) {
                                 var39.method797(new class134(var40), var58);
                              }

                              var39.method796();
                              class152.field1594.method163(var39, (long)var58);
                              var37 = var39;
                           }

                           int var59 = var37.field1596;
                           int var41;
                           int var42;
                           int var43;
                           int var44;
                           if (var59 >= 0) {
                              var42 = class234.field2528.method1353(var59);
                              var41 = -1;
                           } else if (16711935 == var37.field1595) {
                              var41 = -2;
                              var59 = -1;
                              var42 = -2;
                           } else {
                              var41 = class331.method1600(var37.field1601, var37.field1599, var37.field1600);
                              var43 = var37.field1601 + class74.field871 & 255;
                              var44 = class74.field872 + var37.field1600;
                              if (var44 < 0) {
                                 var44 = 0;
                              } else if (var44 > 255) {
                                 var44 = 255;
                              }

                              var42 = class331.method1600(var43, var37.field1599, var44);
                           }

                           var43 = 0;
                           if (var42 != -2) {
                              var43 = class234.field2540[class341.method1636(var42, 96)];
                           }

                           if (var37.field1598 != -1) {
                              var44 = class74.field871 + var37.field1602 & 255;
                              int var45 = var37.field1604 + class74.field872;
                              if (var45 < 0) {
                                 var45 = 0;
                              } else if (var45 > 255) {
                                 var45 = 255;
                              }

                              var42 = class331.method1600(var44, var37.field1603, var45);
                              var43 = class234.field2540[class341.method1636(var42, 96)];
                           }

                           var0.method34(var3, var12, var18, var35, var57, var59, var24, var25, var26, var27, class90.method498(var32, var28), class90.method498(var32, var29), class90.method498(var32, var30), class90.method498(var32, var31), class341.method1636(var41, var28), class341.method1636(var41, var29), class341.method1636(var41, var30), class341.method1636(var41, var31), var34, var43);
                        }
                     }
                  }
               }
            }
         }

         for(var12 = 1; var12 < 103; ++var12) {
            for(var13 = 1; var13 < 103; ++var13) {
               var0.method33(var3, var13, var12, class115.method597(var3, var13, var12));
            }
         }

         class74.field860[var3] = (short[][])null;
         class151.field1592[var3] = (short[][])null;
         class74.field865[var3] = (byte[][])null;
         class307.field2897[var3] = (byte[][])null;
         class431.field3603[var3] = (byte[][])null;
      }

      var0.method52(-50, -10, -50);

      for(var3 = 0; var3 < 104; ++var3) {
         for(var4 = 0; var4 < 104; ++var4) {
            if ((class74.field866[1][var3][var4] & 2) == 2) {
               var0.method32(var3, var4);
            }
         }
      }

      var3 = 1;
      var4 = 2;
      var5 = 4;

      for(var6 = 0; var6 < 4; ++var6) {
         if (var6 > 0) {
            var3 <<= 3;
            var4 <<= 3;
            var5 <<= 3;
         }

         for(int var49 = 0; var49 <= var6; ++var49) {
            for(int var50 = 0; var50 <= 104; ++var50) {
               for(int var51 = 0; var51 <= 104; ++var51) {
                  short var53;
                  if (0 != (class15.field132[var49][var51][var50] & var3)) {
                     var10 = var50;
                     var11 = var50;
                     var12 = var49;

                     for(var13 = var49; var10 > 0 && 0 != (class15.field132[var49][var51][var10 - 1] & var3); --var10) {
                        ;
                     }

                     while(var11 < 104 && (class15.field132[var49][var51][var11 + 1] & var3) != 0) {
                        ++var11;
                     }

                     label364:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if (0 == (class15.field132[var12 - 1][var51][var14] & var3)) {
                              break label364;
                           }
                        }

                        --var12;
                     }

                     label353:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class15.field132[var13 + 1][var51][var14] & var3) == 0) {
                              break label353;
                           }
                        }

                        ++var13;
                     }

                     var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
                     if (var14 >= 8) {
                        var53 = 240;
                        var16 = class74.field858[var13][var51][var10] - var53;
                        var17 = class74.field858[var12][var51][var10];
                        class12.method79(var6, 1, var51 * 128, var51 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              class15.field132[var18][var51][var19] &= ~var3;
                           }
                        }
                     }
                  }

                  if (0 != (class15.field132[var49][var51][var50] & var4)) {
                     var10 = var51;
                     var11 = var51;
                     var12 = var49;

                     for(var13 = var49; var10 > 0 && (class15.field132[var49][var10 - 1][var50] & var4) != 0; --var10) {
                        ;
                     }

                     while(var11 < 104 && 0 != (class15.field132[var49][var11 + 1][var50] & var4)) {
                        ++var11;
                     }

                     label417:
                     while(var12 > 0) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class15.field132[var12 - 1][var14][var50] & var4) == 0) {
                              break label417;
                           }
                        }

                        --var12;
                     }

                     label406:
                     while(var13 < var6) {
                        for(var14 = var10; var14 <= var11; ++var14) {
                           if ((class15.field132[var13 + 1][var14][var50] & var4) == 0) {
                              break label406;
                           }
                        }

                        ++var13;
                     }

                     var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
                     if (var14 >= 8) {
                        var53 = 240;
                        var16 = class74.field858[var13][var10][var50] - var53;
                        var17 = class74.field858[var12][var10][var50];
                        class12.method79(var6, 2, var10 * 128, 128 + var11 * 128, var50 * 128, var50 * 128, var16, var17);

                        for(var18 = var12; var18 <= var13; ++var18) {
                           for(var19 = var10; var19 <= var11; ++var19) {
                              class15.field132[var18][var19][var50] &= ~var4;
                           }
                        }
                     }
                  }

                  if (0 != (class15.field132[var49][var51][var50] & var5)) {
                     var10 = var51;
                     var11 = var51;
                     var12 = var50;

                     for(var13 = var50; var12 > 0 && (class15.field132[var49][var51][var12 - 1] & var5) != 0; --var12) {
                        ;
                     }

                     while(var13 < 104 && (class15.field132[var49][var51][var13 + 1] & var5) != 0) {
                        ++var13;
                     }

                     label470:
                     while(var10 > 0) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if (0 == (class15.field132[var49][var10 - 1][var14] & var5)) {
                              break label470;
                           }
                        }

                        --var10;
                     }

                     label459:
                     while(var11 < 104) {
                        for(var14 = var12; var14 <= var13; ++var14) {
                           if ((class15.field132[var49][var11 + 1][var14] & var5) == 0) {
                              break label459;
                           }
                        }

                        ++var11;
                     }

                     if ((var13 - var12 + 1) * (1 + (var11 - var10)) >= 4) {
                        var14 = class74.field858[var49][var10][var12];
                        class12.method79(var6, 4, var10 * 128, 128 + var11 * 128, var12 * 128, var13 * 128 + 128, var14, var14);

                        for(var15 = var10; var15 <= var11; ++var15) {
                           for(var16 = var12; var16 <= var13; ++var16) {
                              class15.field132[var49][var15][var16] &= ~var5;
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
