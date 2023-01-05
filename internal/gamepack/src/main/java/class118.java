public final class class118 {
   static class448 field877 = new class448();

   public static int method464(byte[] var0, int var1, byte[] var2, int var3, int var4) {
      class448 var5 = field877;
      synchronized(field877) {
         field877.field3712 = var2;
         field877.field3706 = var4;
         field877.field3708 = var0;
         field877.field3709 = 0;
         field877.field3710 = var1;
         field877.field3715 = 0;
         field877.field3730 = 0;
         field877.field3707 = 0;
         field877.field3714 = 0;
         method465(field877);
         var1 -= field877.field3710;
         field877.field3712 = null;
         field877.field3708 = null;
         return var1;
      }
   }

   static void method466(class448 var0) {
      byte var2 = var0.field3720;
      int var3 = var0.field3713;
      int var4 = var0.field3721;
      int var5 = var0.field3719;
      int[] var6 = class448.field3723;
      int var7 = var0.field3718;
      byte[] var8 = var0.field3708;
      int var9 = var0.field3709;
      int var10 = var0.field3710;
      int var12 = var0.field3737 + 1;

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

      int var13 = var0.field3714;
      var0.field3714 += var10 - var10;
      if (var0.field3714 < var13) {
         ;
      }

      var0.field3720 = var2;
      var0.field3713 = var3;
      var0.field3721 = var4;
      var0.field3719 = var5;
      class448.field3723 = var6;
      var0.field3718 = var7;
      var0.field3708 = var8;
      var0.field3709 = var9;
      var0.field3710 = var10;
   }

   static void method465(class448 var0) {
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
      var0.field3705 = 2039955545;
      if (class448.field3723 == null) {
         class448.field3723 = new int[var0.field3705 * 881977248];
      }

      boolean var26 = true;

      while(true) {
         while(var26) {
            byte var1 = method471(var0);
            if (var1 == 23) {
               return;
            }

            var1 = method471(var0);
            var1 = method471(var0);
            var1 = method471(var0);
            var1 = method471(var0);
            var1 = method471(var0);
            var1 = method471(var0);
            var1 = method471(var0);
            var1 = method471(var0);
            var1 = method471(var0);
            var1 = method467(var0);
            if (var1 != 0) {
               ;
            }

            var0.field3717 = 0;
            var1 = method471(var0);
            var0.field3717 = var0.field3717 << 8 | var1 & 255;
            var1 = method471(var0);
            var0.field3717 = var0.field3717 << 8 | var1 & 255;
            var1 = method471(var0);
            var0.field3717 = var0.field3717 << 8 | var1 & 255;

            int var35;
            for(var35 = 0; var35 < 16; ++var35) {
               var1 = method467(var0);
               if (var1 == 1) {
                  var0.field3726[var35] = true;
               } else {
                  var0.field3726[var35] = false;
               }
            }

            for(var35 = 0; var35 < 256; ++var35) {
               var0.field3725[var35] = false;
            }

            int var36;
            for(var35 = 0; var35 < 16; ++var35) {
               if (var0.field3726[var35]) {
                  for(var36 = 0; var36 < 16; ++var36) {
                     var1 = method467(var0);
                     if (var1 == 1) {
                        var0.field3725[var35 * 16 + var36] = true;
                     }
                  }
               }
            }

            method468(var0);
            int var38 = var0.field3716 + 2;
            int var39 = method470(3, var0);
            int var40 = method470(15, var0);

            for(var35 = 0; var35 < var40; ++var35) {
               var36 = 0;

               while(true) {
                  var1 = method467(var0);
                  if (var1 == 0) {
                     var0.field3731[var35] = (byte)var36;
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
               var29 = var0.field3731[var35];

               byte var28;
               for(var28 = var27[var29]; var29 > 0; --var29) {
                  var27[var29] = var27[var29 - 1];
               }

               var27[0] = var28;
               var0.field3711[var35] = var28;
            }

            int var37;
            for(var37 = 0; var37 < var39; ++var37) {
               int var49 = method470(5, var0);

               for(var35 = 0; var35 < var38; ++var35) {
                  while(true) {
                     var1 = method467(var0);
                     if (var1 == 0) {
                        var0.field3729[var37][var35] = (byte)var49;
                        break;
                     }

                     var1 = method467(var0);
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
                  if (var0.field3729[var37][var35] > var3) {
                     var3 = var0.field3729[var37][var35];
                  }

                  if (var0.field3729[var37][var35] < var2) {
                     var2 = var0.field3729[var37][var35];
                  }
               }

               method469(var0.field3733[var37], var0.field3734[var37], var0.field3735[var37], var0.field3729[var37], var2, var3, var38);
               var0.field3736[var37] = var2;
            }

            int var41 = var0.field3716 + 1;
            int var42 = -1;
            byte var43 = 0;

            for(var35 = 0; var35 <= 255; ++var35) {
               var0.field3700[var35] = 0;
            }

            int var56 = 4095;

            int var54;
            int var55;
            for(var54 = 15; var54 >= 0; --var54) {
               for(var55 = 15; var55 >= 0; --var55) {
                  var0.field3699[var56] = (byte)(var54 * 16 + var55);
                  --var56;
               }

               var0.field3728[var54] = var56 + 1;
            }

            int var46 = 0;
            byte var53;
            if (var43 == 0) {
               ++var42;
               var43 = 50;
               var53 = var0.field3711[var42];
               var22 = var0.field3736[var53];
               var23 = var0.field3733[var53];
               var25 = var0.field3735[var53];
               var24 = var0.field3734[var53];
            }

            int var44 = var43 - 1;
            int var50 = var22;

            int var51;
            byte var52;
            for(var51 = method470(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
               ++var50;
               var52 = method467(var0);
            }

            int var45 = var25[var51 - var24[var50]];

            while(true) {
               while(var45 != var41) {
                  if (var45 != 0 && var45 != 1) {
                     int var33 = var45 - 1;
                     int var30;
                     if (var33 < 16) {
                        var30 = var0.field3728[0];

                        for(var1 = var0.field3699[var30 + var33]; var33 > 3; var33 -= 4) {
                           int var34 = var30 + var33;
                           var0.field3699[var34] = var0.field3699[var34 - 1];
                           var0.field3699[var34 - 1] = var0.field3699[var34 - 2];
                           var0.field3699[var34 - 2] = var0.field3699[var34 - 3];
                           var0.field3699[var34 - 3] = var0.field3699[var34 - 4];
                        }

                        while(var33 > 0) {
                           var0.field3699[var30 + var33] = var0.field3699[var30 + var33 - 1];
                           --var33;
                        }

                        var0.field3699[var30] = var1;
                     } else {
                        int var31 = var33 / 16;
                        int var32 = var33 % 16;
                        var30 = var0.field3728[var31] + var32;

                        for(var1 = var0.field3699[var30]; var30 > var0.field3728[var31]; --var30) {
                           var0.field3699[var30] = var0.field3699[var30 - 1];
                        }

                        ++var0.field3728[var31];

                        while(var31 > 0) {
                           --var0.field3728[var31];
                           var0.field3699[var0.field3728[var31]] = var0.field3699[var0.field3728[var31 - 1] + 16 - 1];
                           --var31;
                        }

                        --var0.field3728[0];
                        var0.field3699[var0.field3728[0]] = var1;
                        if (var0.field3728[0] == 0) {
                           var56 = 4095;

                           for(var54 = 15; var54 >= 0; --var54) {
                              for(var55 = 15; var55 >= 0; --var55) {
                                 var0.field3699[var56] = var0.field3699[var0.field3728[var54] + var55];
                                 --var56;
                              }

                              var0.field3728[var54] = var56 + 1;
                           }
                        }
                     }

                     ++var0.field3700[var0.field3724[var1 & 255] & 255];
                     class448.field3723[var46] = var0.field3724[var1 & 255] & 255;
                     ++var46;
                     if (var44 == 0) {
                        ++var42;
                        var44 = 50;
                        var53 = var0.field3711[var42];
                        var22 = var0.field3736[var53];
                        var23 = var0.field3733[var53];
                        var25 = var0.field3735[var53];
                        var24 = var0.field3734[var53];
                     }

                     --var44;
                     var50 = var22;

                     for(var51 = method470(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                        ++var50;
                        var52 = method467(var0);
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
                           var53 = var0.field3711[var42];
                           var22 = var0.field3736[var53];
                           var23 = var0.field3733[var53];
                           var25 = var0.field3735[var53];
                           var24 = var0.field3734[var53];
                        }

                        --var44;
                        var50 = var22;

                        for(var51 = method470(var22, var0); var51 > var23[var50]; var51 = var51 << 1 | var52) {
                           ++var50;
                           var52 = method467(var0);
                        }

                        var45 = var25[var51 - var24[var50]];
                     } while(var45 == 0 || var45 == 1);

                     ++var47;
                     var1 = var0.field3724[var0.field3699[var0.field3728[0]] & 255];

                     for(var0.field3700[var1 & 255] += var47; var47 > 0; --var47) {
                        class448.field3723[var46] = var1 & 255;
                        ++var46;
                     }
                  }
               }

               var0.field3713 = 0;
               var0.field3720 = 0;
               var0.field3722[0] = 0;

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.field3722[var35] = var0.field3700[var35 - 1];
               }

               for(var35 = 1; var35 <= 256; ++var35) {
                  var0.field3722[var35] += var0.field3722[var35 - 1];
               }

               for(var35 = 0; var35 < var46; ++var35) {
                  var1 = (byte)(class448.field3723[var35] & 255);
                  class448.field3723[var0.field3722[var1 & 255]] |= var35 << 8;
                  ++var0.field3722[var1 & 255];
               }

               var0.field3718 = class448.field3723[var0.field3717] >> 8;
               var0.field3721 = 0;
               var0.field3718 = class448.field3723[var0.field3718];
               var0.field3719 = (byte)(var0.field3718 & 255);
               var0.field3718 >>= 8;
               ++var0.field3721;
               var0.field3737 = var46;
               method466(var0);
               if (var0.field3721 == var0.field3737 + 1 && var0.field3713 == 0) {
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

   static byte method471(class448 var0) {
      return (byte)method470(8, var0);
   }

   static byte method467(class448 var0) {
      return (byte)method470(1, var0);
   }

   static int method470(int var0, class448 var1) {
      while(var1.field3715 < var0) {
         var1.field3730 = var1.field3730 << 8 | var1.field3712[var1.field3706] & 255;
         var1.field3715 += 8;
         ++var1.field3706;
         ++var1.field3707;
         if (var1.field3707 == 0) {
            ;
         }
      }

      int var2 = var1.field3730 >> var1.field3715 - var0 & (1 << var0) - 1;
      var1.field3715 -= var0;
      return var2;
   }

   static void method468(class448 var0) {
      var0.field3716 = 0;

      for(int var1 = 0; var1 < 256; ++var1) {
         if (var0.field3725[var1]) {
            var0.field3724[var0.field3716] = (byte)var1;
            ++var0.field3716;
         }
      }

   }

   static void method469(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
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
