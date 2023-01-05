public final class class266 {
   static class229 field2689 = new class229();

   public static int method1265(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      class229 var5 = field2689;
      synchronized(field2689) {
         field2689.field2476 = var2;
         field2689.field2470 = var4;
         field2689.field2472 = var0;
         field2689.field2473 = 0;
         field2689.field2474 = var1;
         field2689.field2479 = 0;
         field2689.field2494 = 0;
         field2689.field2471 = 0;
         field2689.field2478 = 0;
         method1266(field2689);
         var1 -= field2689.field2474;
         field2689.field2476 = null;
         field2689.field2472 = null;
         return var1;
      }
   }

   static void method1267(class229 var0) {
      byte var2 = var0.field2484;
      int var3 = var0.field2477;
      int var4 = var0.field2485;
      int var5 = var0.field2483;
      int[] var6 = class229.field2487;
      int var7 = var0.field2482;
      byte[] var8 = var0.field2472;
      int var9 = var0.field2473;
      int var10 = var0.field2474;
      int var12 = var0.field2501 + 1;

      label61:
      while(true) {
         if (var3 > 0) {
            while(true) {
               if (var10 == 0) {
                  break label61;
               }

               if (var3 == 1) {
                  if (var10 == 0) {
                     var3 = 1;
                     break label61;
                  }

                  var8[var9] = var2;
                  ++var9;
                  --var10;
                  break;
               }

               var8[var9] = var2;
               --var3;
               ++var9;
               --var10;
            }
         }

         while(var4 != var12) {
            var2 = (byte)var5;
            var7 = var6[var7];
            byte var1 = (byte)var7;
            var7 >>= 8;
            ++var4;
            if (var1 != var5) {
               var5 = var1;
               if (var10 == 0) {
                  var3 = 1;
                  break label61;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            } else {
               if (var4 != var12) {
                  var3 = 2;
                  var7 = var6[var7];
                  var1 = (byte)var7;
                  var7 >>= 8;
                  ++var4;
                  if (var4 != var12) {
                     if (var1 != var5) {
                        var5 = var1;
                     } else {
                        var3 = 3;
                        var7 = var6[var7];
                        var1 = (byte)var7;
                        var7 >>= 8;
                        ++var4;
                        if (var4 != var12) {
                           if (var1 != var5) {
                              var5 = var1;
                           } else {
                              var7 = var6[var7];
                              var1 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                              var3 = (var1 & 255) + 4;
                              var7 = var6[var7];
                              var5 = (byte)var7;
                              var7 >>= 8;
                              ++var4;
                           }
                        }
                     }
                  }
                  continue label61;
               }

               if (var10 == 0) {
                  var3 = 1;
                  break label61;
               }

               var8[var9] = var2;
               ++var9;
               --var10;
            }
         }

         var3 = 0;
         break;
      }

      int var13 = var0.field2478;
      var0.field2478 += var10 - var10;
      if (var0.field2478 < var13) {
         ;
      }

      var0.field2484 = var2;
      var0.field2477 = var3;
      var0.field2485 = var4;
      var0.field2483 = var5;
      class229.field2487 = var6;
      var0.field2482 = var7;
      var0.field2472 = var8;
      var0.field2473 = var9;
      var0.field2474 = var10;
   }

   static void method1266(class229 var0) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      boolean var15 = false;
      boolean var16 = false;
      boolean var17 = false;
      boolean var18 = false;
      boolean var19 = false;
      boolean var20 = false;
      boolean var21 = false;
      int var22 = 0;
      int[] var23 = null;
      int[] var24 = null;
      int[] var25 = null;
      var0.field2469 = 2039955545;
      if (class229.field2487 == null) {
         class229.field2487 = new int[var0.field2469 * 881977248];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = method1272(var0);
            if (var1 == 23) {
               return;
            }

            var1 = method1272(var0);
            var1 = method1272(var0);
            var1 = method1272(var0);
            var1 = method1272(var0);
            var1 = method1272(var0);
            var1 = method1272(var0);
            var1 = method1272(var0);
            var1 = method1272(var0);
            var1 = method1272(var0);
            var1 = method1268(var0);
            if (var1 != 0) {
               ;
            }

            var0.field2481 = 0;
            var1 = method1272(var0);
            var0.field2481 = var0.field2481 << 8 | var1 & 255;
            var1 = method1272(var0);
            var0.field2481 = var0.field2481 << 8 | var1 & 255;
            var1 = method1272(var0);
            var0.field2481 = var0.field2481 << 8 | var1 & 255;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = method1268(var0);
               if (var1 == 1) {
                  var0.field2490[var35] = true;
               } else {
                  var0.field2490[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.field2489[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.field2490[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = method1268(var0);
                     if (var1 == 1) {
                        var0.field2489[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            method1269(var0);
            int var38 = var0.field2480 + 2;
            int var39 = method1271(3, var0);
            int var40 = method1271(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = method1268(var0);
                  if (var1 == 0) {
                     var0.field2495[var35] = (byte)var36;
                     break;
                  }

                  ++var36;
               }
            }

            byte[] var27 = new byte[6];

            byte var29;
            for(var29 = 0; var29 < var39; var27[var29] = var29++) {
               ;
            }

            for(var35 = 0; var35 < var40; ++var35) {
               var29 = var0.field2495[var35];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.field2475[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = method1271(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = method1268(var0);
                     if (var1 == 0) {
                        var0.field2493[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = method1268(var0);
                     if (var1 == 0) {
                        ++var49;
                     } else {
                        --var49;
                     }
                  }
               }
            }

            for(var37 = 0; var37 < var39; ++var37) {
               byte var2 = 32;
               byte var3 = 0;

               for(var35 = 0; var35 < var38; ++var35) {
                  if (var0.field2493[var37][var35] > var3) {
                     var3 = var0.field2493[var37][var35];
                  }

                  if (var0.field2493[var37][var35] < var2) {
                     var2 = var0.field2493[var37][var35];
                  }
               }

               method1270(var0.field2497[var37], var0.field2498[var37], var0.field2499[var37], var0.field2493[var37], var2, var3, var38);
               var0.field2500[var37] = var2;
            }

            int var41 = var0.field2480 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.field2464[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.field2463[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               var0.field2492[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.field2475[var42];
               var22 = var0.field2500[var53];
               var23 = var0.field2497[var53];
               var25 = var0.field2499[var53];
               var24 = var0.field2498[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = method1271(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = method1268(var0);
            }

            int var45 = var25[var51 - var24[var50]];

            while(true) {
               while(var45 != var41) {
                  if (var45 != 0 && var45 != 1) {
                     int var33 = var45 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0.field2492[0];

                        for(var1 = var0.field2463[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.field2463[var34] = var0.field2463[var34 - 1];
                           var0.field2463[var34 - 1] = var0.field2463[var34 - 2];
                           var0.field2463[var34 - 2] = var0.field2463[var34 - 3];
                           var0.field2463[var34 - 3] = var0.field2463[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.field2463[var30 + var33] = var0.field2463[var30 + var33 - 1];
                           --var33;
                        }

                        var0.field2463[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.field2492[var31] + var32;

                        for(var1 = var0.field2463[var30]; var30 > var0.field2492[var31]; --var30) {
                           var0.field2463[var30] = var0.field2463[var30 - 1];
                        }

                        ++var0.field2492[var31];

                        while(var31 > 0) {
                           --var0.field2492[var31];
                           var0.field2463[var0.field2492[var31]] = var0.field2463[var0.field2492[var31 - 1] + 16 - 1];
                           --var31;
                        }

                        --var0.field2492[0];
                        var0.field2463[var0.field2492[0]] = var1;
                        if (var0.field2492[0] == 0) {
                           var56 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.field2463[var56] = var0.field2463[var0.field2492[var54] + var55];
                                 --var56;
                              }

                              var0.field2492[var54] = var56 + 1;
                           }
                        }
                     }

                     ++var0.field2464[var0.field2488[var1 & 255] & 255];
                     class229.field2487[var46] = var0.field2488[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.field2475[var42];
                        var22 = var0.field2500[var53];
                        var23 = var0.field2497[var53];
                        var25 = var0.field2499[var53];
                        var24 = var0.field2498[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = method1271(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = method1268(var0);
                     }

                     var45 = var25[var51 - var24[var50]];
                  } else {
                     int var47 = -1;
                     int var48 = 1;

                     do {
                        if (var45 == 0) {
                           var47 += var48;
                        } else if (var45 == 1) {
                           var47 += var48 * 2;
                        }

                        var48 *= 2;
                        if (var44 == 0) {
                           ++var42;
                           var44 = 50;
                           var53 = var0.field2475[var42];
                           var22 = var0.field2500[var53];
                           var23 = var0.field2497[var53];
                           var25 = var0.field2499[var53];
                           var24 = var0.field2498[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = method1271(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = method1268(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.field2488[var0.field2463[var0.field2492[0]] & 255];

                     for(var0.field2464[var1 & 255] += var47; var47 > 0; --var47) {
                        class229.field2487[var46] = var1 & 255;
                        ++var46;
                     }
                  }
               }

               var0.field2477 = 0;
               var0.field2484 = 0;
               var0.field2486[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.field2486[var35] = var0.field2464[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.field2486[var35] += var0.field2486[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(class229.field2487[var35] & 255);
                  class229.field2487[var0.field2486[var1 & 255]] |= var35 << 8;
                  ++var0.field2486[var1 & 255];
               }

               var0.field2482 = class229.field2487[var0.field2481] >> 8;
               var0.field2485 = 0;
               var0.field2482 = class229.field2487[var0.field2482];
               var0.field2483 = (byte)(var0.field2482 & 255);
               var0.field2482 >>= 8;
               ++var0.field2485;
               var0.field2501 = var46;
               method1267(var0);
               if (var0.field2485 == var0.field2501 + 1 && var0.field2477 == 0) {
                  var26 = true;
                  break;
               }

               var26 = false;
               break;
            }
         }

         return;
      }
   }

   static byte method1272(class229 var0) {
      return (byte)method1271(8, var0);
   }

   static byte method1268(class229 var0) {
      return (byte)method1271(1, var0);
   }

   static int method1271(int var0, class229 var1) {
      while(var1.field2479 < var0) {
         var1.field2494 = var1.field2494 << 8 | var1.field2476[var1.field2470] & 255;
         var1.field2479 += 8;
         ++var1.field2470;
         ++var1.field2471;
         if (var1.field2471 == 0) {
            ;
         }
      }

      int var2 = var1.field2494 >> var1.field2479 - var0 & (1 << var0) - 1;
      var1.field2479 -= var0;
      return var2;
   }

   static void method1269(class229 var0) {
      var0.field2480 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.field2489[var1]) {
            var0.field2488[var0.field2480] = (byte)var1;
            ++var0.field2480;
         }
      }

   }

   static void method1270(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
      int var7 = 0;

      int var8;
      for(var8 = var4; var8 <= var5; ++var8) {
         for(int var9 = 0; var9 < var6; ++var9) {
            if (var3[var9] == var8) {
               var2[var7] = var9;
               ++var7;
            }
         }
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var1[var8] = 0;
      }

      for(var8 = 0; var8 < var6; ++var8) {
         ++var1[var3[var8] + 1];
      }

      for(var8 = 1; var8 < 23; ++var8) {
         var1[var8] += var1[var8 - 1];
      }

      for(var8 = 0; var8 < 23; ++var8) {
         var0[var8] = 0;
      }

      int var10 = 0;

      for(var8 = var4; var8 <= var5; ++var8) {
         var10 += var1[var8 + 1] - var1[var8];
         var0[var8] = var10 - 1;
         var10 <<= 1;
      }

      for(var8 = var4 + 1; var8 <= var5; ++var8) {
         var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
      }

   }
}
