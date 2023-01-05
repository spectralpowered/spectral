import java.io.IOException;

@ObfInfo(
   name = "hb"
)
public final class class173 {
   @ObfInfo(
      owner = "hb",
      name = "bz",
      desc = "I"
   )
   static int field1290;
   @ObfInfo(
      owner = "hb",
      name = "e",
      desc = "I"
   )
   int field1281;
   @ObfInfo(
      owner = "hb",
      name = "v",
      desc = "I"
   )
   int field1282;
   @ObfInfo(
      owner = "hb",
      name = "j",
      desc = "I"
   )
   int field1283 = 0;
   @ObfInfo(
      owner = "hb",
      name = "m",
      desc = "I"
   )
   int field1284;
   @ObfInfo(
      owner = "hb",
      name = "f",
      desc = "I"
   )
   int field1285;
   @ObfInfo(
      owner = "hb",
      name = "x",
      desc = "I"
   )
   int field1288;
   @ObfInfo(
      owner = "hb",
      name = "q",
      desc = "I"
   )
   int field1289;
   @ObfInfo(
      owner = "hb",
      name = "h",
      desc = "I"
   )
   int field1291;
   @ObfInfo(
      owner = "hb",
      name = "r",
      desc = "Lhr;"
   )
   public class295 field1286;
   @ObfInfo(
      owner = "hb",
      name = "u",
      desc = "Lhr;"
   )
   public class295 field1287;
   @ObfInfo(
      owner = "hb",
      name = "b",
      desc = "J"
   )
   public long field1280 = 0L;

   @ObfInfo(
      owner = "hb",
      name = "h",
      desc = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lmb;I)I"
   )
   public static int method801(CharSequence var0, CharSequence var1, class476 var2) {
      int var4 = var0.length();
      int var5 = var1.length();
      int var6 = 0;
      int var7 = 0;
      char var8 = 0;
      char var9 = 0;

      while(var6 - var8 < var4 || var7 - var9 < var5) {
         if (var6 - var8 >= var4) {
            return -1;
         }

         if (var7 - var9 >= var5) {
            return 1;
         }

         char var10;
         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var0.charAt(var6++);
         }

         char var11;
         if (var9 != 0) {
            var11 = var9;
            boolean var16 = false;
         } else {
            var11 = var1.charAt(var7++);
         }

         var8 = class166.method778(var10);
         var9 = class166.method778(var11);
         var10 = class459.method2265(var10, var2);
         var11 = class459.method2265(var11, var2);
         if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
            var10 = Character.toLowerCase(var10);
            var11 = Character.toLowerCase(var11);
            if (var11 != var10) {
               return class23.method97(var10, var2) - class23.method97(var11, var2);
            }
         }
      }

      int var17 = Math.min(var4, var5);

      char var13;
      int var18;
      for(var18 = 0; var18 < var17; ++var18) {
         if (var2 == class476.field3999) {
            var6 = var4 - 1 - var18;
            var7 = var5 - 1 - var18;
         } else {
            var7 = var18;
            var6 = var18;
         }

         char var12 = var0.charAt(var6);
         var13 = var1.charAt(var7);
         if (var12 != var13 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
            var12 = Character.toLowerCase(var12);
            var13 = Character.toLowerCase(var13);
            if (var13 != var12) {
               return class23.method97(var12, var2) - class23.method97(var13, var2);
            }
         }
      }

      var18 = var4 - var5;
      if (var18 != 0) {
         return var18;
      } else {
         for(int var19 = 0; var19 < var17; ++var19) {
            var13 = var0.charAt(var19);
            char var14 = var1.charAt(var19);
            if (var13 != var14) {
               return class23.method97(var13, var2) - class23.method97(var14, var2);
            }
         }

         return 0;
      }
   }

   @ObfInfo(
      owner = "hb",
      name = "h",
      desc = "(I)Z"
   )
   public static boolean method802() {
      long var1 = class152.method711();
      int var3 = (int)(var1 - class462.field3828);
      class462.field3828 = var1;
      if (var3 > 200) {
         var3 = 200;
      }

      class462.field3843 += var3;
      if (class462.field3842 == 0 && 0 == class462.field3832 && class462.field3835 == 0 && 0 == class462.field3830) {
         return true;
      } else if (null == class462.field3844) {
         return false;
      } else {
         try {
            if (class462.field3843 > 30000) {
               throw new IOException();
            } else {
               class363 var4;
               class127 var5;
               while(class462.field3832 < 200 && class462.field3830 > 0) {
                  var4 = (class363)class462.field3837.method789();
                  var5 = new class127(4);
                  var5.method544(1);
                  var5.method602((int)var4.field1134);
                  class462.field3844.method731(var5.field1072, 0, 4);
                  class462.field3831.method788(var4, var4.field1134);
                  --class462.field3830;
                  ++class462.field3832;
               }

               while(class462.field3842 < 200 && class462.field3835 > 0) {
                  var4 = (class363)class462.field3829.method860();
                  var5 = new class127(4);
                  var5.method544(0);
                  var5.method602((int)var4.field1134);
                  class462.field3844.method731(var5.field1072, 0, 4);
                  var4.method870();
                  class462.field3836.method788(var4, var4.field1134);
                  --class462.field3835;
                  ++class462.field3842;
               }

               for(int var19 = 0; var19 < 100; ++var19) {
                  int var20 = class462.field3844.method732();
                  if (var20 < 0) {
                     throw new IOException();
                  }

                  if (var20 == 0) {
                     break;
                  }

                  class462.field3843 = 0;
                  byte var6 = 0;
                  if (class207.field1788 == null) {
                     var6 = 8;
                  } else if (0 == class462.field3826) {
                     var6 = 1;
                  }

                  int var7;
                  int var8;
                  int var9;
                  int var11;
                  if (var6 > 0) {
                     var7 = var6 - class462.field3838.field1070;
                     if (var7 > var20) {
                        var7 = var20;
                     }

                     class462.field3844.method730(class462.field3838.field1072, class462.field3838.field1070, var7);
                     if (class462.field3841 != 0) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           class462.field3838.field1072[class462.field3838.field1070 + var8] ^= class462.field3841;
                        }
                     }

                     class462.field3838.field1070 += var7;
                     if (class462.field3838.field1070 < var6) {
                        break;
                     }

                     if (class207.field1788 == null) {
                        class462.field3838.field1070 = 0;
                        var8 = class462.field3838.method547();
                        var9 = class462.field3838.method549();
                        int var10 = class462.field3838.method547();
                        var11 = class462.field3838.method595();
                        long var12 = (long)((var8 << 16) + var9);
                        class363 var14 = (class363)class462.field3831.method791(var12);
                        class371.field3164 = true;
                        if (null == var14) {
                           var14 = (class363)class462.field3836.method791(var12);
                           class371.field3164 = false;
                        }

                        if (null == var14) {
                           throw new IOException();
                        }

                        int var15 = var10 == 0 ? 5 : 9;
                        class207.field1788 = var14;
                        class10.field44 = new class127(class207.field1788.field3089 + var11 + var15);
                        class10.field44.method544(var10);
                        class10.field44.method534(var11);
                        class462.field3826 = 8;
                        class462.field3838.field1070 = 0;
                     } else if (class462.field3826 == 0) {
                        if (-1 == class462.field3838.field1072[0]) {
                           class462.field3826 = 1;
                           class462.field3838.field1070 = 0;
                        } else {
                           class207.field1788 = null;
                        }
                     }
                  } else {
                     var7 = class10.field44.field1072.length - class207.field1788.field3089;
                     var8 = 512 - class462.field3826;
                     if (var8 > var7 - class10.field44.field1070) {
                        var8 = var7 - class10.field44.field1070;
                     }

                     if (var8 > var20) {
                        var8 = var20;
                     }

                     class462.field3844.method730(class10.field44.field1072, class10.field44.field1070, var8);
                     if (class462.field3841 != 0) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           class10.field44.field1072[class10.field44.field1070 + var9] ^= class462.field3841;
                        }
                     }

                     class10.field44.field1070 += var8;
                     class462.field3826 += var8;
                     if (class10.field44.field1070 == var7) {
                        if (class207.field1788.field1134 == 16711935L) {
                           class378.field3191 = class10.field44;

                           for(var9 = 0; var9 < 256; ++var9) {
                              class38 var21 = class462.field3840[var9];
                              if (var21 != null) {
                                 class378.field3191.field1070 = 5 + var9 * 8;
                                 if (class378.field3191.field1070 >= class378.field3191.field1072.length) {
                                    if (!var21.field194) {
                                       throw new RuntimeException("");
                                    }

                                    var21.method154();
                                 } else {
                                    var11 = class378.field3191.method595();
                                    int var22 = class378.field3191.method595();
                                    var21.method164(var11, var22);
                                 }
                              }
                           }
                        } else {
                           class462.field3839.reset();
                           class462.field3839.update(class10.field44.field1072, 0, var7);
                           var9 = (int)class462.field3839.getValue();
                           if (var9 != class207.field1788.field3088) {
                              try {
                                 class462.field3844.method734();
                              } catch (Exception var17) {
                                 ;
                              }

                              ++class462.field3846;
                              class462.field3844 = null;
                              class462.field3841 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           class462.field3846 = 0;
                           class462.field3833 = 0;
                           class207.field1788.field3087.method161((int)(class207.field1788.field1134 & 65535L), class10.field44.field1072, 16711680L == (class207.field1788.field1134 & 16711680L), class371.field3164);
                        }

                        class207.field1788.method637();
                        if (class371.field3164) {
                           --class462.field3832;
                        } else {
                           --class462.field3842;
                        }

                        class462.field3826 = 0;
                        class207.field1788 = null;
                        class10.field44 = null;
                     } else {
                        if (class462.field3826 != 512) {
                           break;
                        }

                        class462.field3826 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               class462.field3844.method734();
            } catch (Exception var16) {
               ;
            }

            ++class462.field3833;
            class462.field3844 = null;
            return false;
         }
      }
   }

   @ObfInfo(
      owner = "hb",
      name = "v",
      desc = "(Ljava/lang/CharSequence;II[BIB)I"
   )
   public static int method798(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
      int var6 = var2 - var1;

      for(int var7 = 0; var7 < var6; ++var7) {
         char var8 = var0.charAt(var7 + var1);
         if ((var8 <= 0 || var8 >= 128) && (var8 < 160 || var8 > 255)) {
            if (var8 == 8364) {
               var3[var4 + var7] = -128;
            } else if (var8 == 8218) {
               var3[var7 + var4] = -126;
            } else if (var8 == 402) {
               var3[var7 + var4] = -125;
            } else if (var8 == 8222) {
               var3[var7 + var4] = -124;
            } else if (var8 == 8230) {
               var3[var4 + var7] = -123;
            } else if (var8 == 8224) {
               var3[var7 + var4] = -122;
            } else if (var8 == 8225) {
               var3[var4 + var7] = -121;
            } else if (var8 == 710) {
               var3[var7 + var4] = -120;
            } else if (var8 == 8240) {
               var3[var4 + var7] = -119;
            } else if (var8 == 352) {
               var3[var7 + var4] = -118;
            } else if (var8 == 8249) {
               var3[var7 + var4] = -117;
            } else if (var8 == 338) {
               var3[var7 + var4] = -116;
            } else if (var8 == 381) {
               var3[var7 + var4] = -114;
            } else if (var8 == 8216) {
               var3[var7 + var4] = -111;
            } else if (var8 == 8217) {
               var3[var4 + var7] = -110;
            } else if (var8 == 8220) {
               var3[var4 + var7] = -109;
            } else if (var8 == 8221) {
               var3[var7 + var4] = -108;
            } else if (var8 == 8226) {
               var3[var7 + var4] = -107;
            } else if (var8 == 8211) {
               var3[var4 + var7] = -106;
            } else if (var8 == 8212) {
               var3[var7 + var4] = -105;
            } else if (var8 == 732) {
               var3[var4 + var7] = -104;
            } else if (var8 == 8482) {
               var3[var4 + var7] = -103;
            } else if (var8 == 353) {
               var3[var7 + var4] = -102;
            } else if (var8 == 8250) {
               var3[var4 + var7] = -101;
            } else if (var8 == 339) {
               var3[var7 + var4] = -100;
            } else if (var8 == 382) {
               var3[var4 + var7] = -98;
            } else if (var8 == 376) {
               var3[var4 + var7] = -97;
            } else {
               var3[var4 + var7] = 63;
            }
         } else {
            var3[var7 + var4] = (byte)var8;
         }
      }

      return var6;
   }

   @ObfInfo(
      owner = "hb",
      name = "q",
      desc = "(I)V"
   )
   public static void method800() {
      class406.field3396.method395();
      class406.field3395.method395();
   }

   @ObfInfo(
      owner = "hb",
      name = "ag",
      desc = "(ILbm;ZB)I"
   )
   static int method799(int var0, class461 var1, boolean var2) {
      if (var0 == 5630) {
         client.field280 = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
