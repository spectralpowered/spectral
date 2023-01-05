import java.io.IOException;

public final class class316 {
   static int field3006;
   int field2997;
   int field2998;
   int field2999 = 0;
   int field3000;
   int field3001;
   int field3004;
   int field3005;
   int field3007;
   public class236 field3002;
   public class236 field3003;
   public long field2996 = 0L;

   public static int method1524(CharSequence var0, CharSequence var1, class22 var2) {
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

         var8 = class406.method1986(var10);
         var9 = class406.method1986(var11);
         var10 = class147.method784(var10, var2);
         var11 = class147.method784(var11, var2);
         if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
            var10 = Character.toLowerCase(var10);
            var11 = Character.toLowerCase(var11);
            if (var11 != var10) {
               return class133.method651(var10, var2) - class133.method651(var11, var2);
            }
         }
      }

      int var17 = Math.min(var4, var5);

      char var13;
      int var18;
      for(var18 = 0; var18 < var17; ++var18) {
         if (var2 == class22.field157) {
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
               return class133.method651(var12, var2) - class133.method651(var13, var2);
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
               return class133.method651(var13, var2) - class133.method651(var14, var2);
            }
         }

         return 0;
      }
   }

   public static boolean method1525() {
      long var1 = class154.method814();
      int var3 = (int)(var1 - class475.field3946);
      class475.field3946 = var1;
      if (var3 > 200) {
         var3 = 200;
      }

      class475.field3961 += var3;
      if (class475.field3960 == 0 && 0 == class475.field3950 && class475.field3953 == 0 && 0 == class475.field3948) {
         return true;
      } else if (null == class475.field3962) {
         return false;
      } else {
         try {
            if (class475.field3961 > 30000) {
               throw new IOException();
            } else {
               class289 var4;
               class134 var5;
               while(class475.field3950 < 200 && class475.field3948 > 0) {
                  var4 = (class289)class475.field3955.method543();
                  var5 = new class134(4);
                  var5.method666(1);
                  var5.method724((int)var4.field1361);
                  class475.field3962.method2051(var5.field1489, 0, 4);
                  class475.field3949.method542(var4, var4.field1361);
                  --class475.field3948;
                  ++class475.field3950;
               }

               while(class475.field3960 < 200 && class475.field3953 > 0) {
                  var4 = (class289)class475.field3947.method30();
                  var5 = new class134(4);
                  var5.method666(0);
                  var5.method724((int)var4.field1361);
                  class475.field3962.method2051(var5.field1489, 0, 4);
                  var4.method574();
                  class475.field3954.method542(var4, var4.field1361);
                  --class475.field3953;
                  ++class475.field3960;
               }

               for(int var19 = 0; var19 < 100; ++var19) {
                  int var20 = class475.field3962.method2052();
                  if (var20 < 0) {
                     throw new IOException();
                  }

                  if (var20 == 0) {
                     break;
                  }

                  class475.field3961 = 0;
                  byte var6 = 0;
                  if (class490.field4042 == null) {
                     var6 = 8;
                  } else if (0 == class475.field3944) {
                     var6 = 1;
                  }

                  int var7;
                  int var8;
                  int var9;
                  int var11;
                  if (var6 > 0) {
                     var7 = var6 - class475.field3956.field1487;
                     if (var7 > var20) {
                        var7 = var20;
                     }

                     class475.field3962.method2050(class475.field3956.field1489, class475.field3956.field1487, var7);
                     if (class475.field3959 != 0) {
                        for(var8 = 0; var8 < var7; ++var8) {
                           class475.field3956.field1489[class475.field3956.field1487 + var8] ^= class475.field3959;
                        }
                     }

                     class475.field3956.field1487 += var7;
                     if (class475.field3956.field1487 < var6) {
                        break;
                     }

                     if (class490.field4042 == null) {
                        class475.field3956.field1487 = 0;
                        var8 = class475.field3956.method669();
                        var9 = class475.field3956.method671();
                        int var10 = class475.field3956.method669();
                        var11 = class475.field3956.method717();
                        long var12 = (long)((var8 << 16) + var9);
                        class289 var14 = (class289)class475.field3949.method545(var12);
                        class41.field374 = true;
                        if (null == var14) {
                           var14 = (class289)class475.field3954.method545(var12);
                           class41.field374 = false;
                        }

                        if (null == var14) {
                           throw new IOException();
                        }

                        int var15 = var10 == 0 ? 5 : 9;
                        class490.field4042 = var14;
                        class213.field2384 = new class134(class490.field4042.field2794 + var11 + var15);
                        class213.field2384.method666(var10);
                        class213.field2384.method656(var11);
                        class475.field3944 = 8;
                        class475.field3956.field1487 = 0;
                     } else if (class475.field3944 == 0) {
                        if (-1 == class475.field3956.field1489[0]) {
                           class475.field3944 = 1;
                           class475.field3956.field1487 = 0;
                        } else {
                           class490.field4042 = null;
                        }
                     }
                  } else {
                     var7 = class213.field2384.field1489.length - class490.field4042.field2794;
                     var8 = 512 - class475.field3944;
                     if (var8 > var7 - class213.field2384.field1487) {
                        var8 = var7 - class213.field2384.field1487;
                     }

                     if (var8 > var20) {
                        var8 = var20;
                     }

                     class475.field3962.method2050(class213.field2384.field1489, class213.field2384.field1487, var8);
                     if (class475.field3959 != 0) {
                        for(var9 = 0; var9 < var8; ++var9) {
                           class213.field2384.field1489[class213.field2384.field1487 + var9] ^= class475.field3959;
                        }
                     }

                     class213.field2384.field1487 += var8;
                     class475.field3944 += var8;
                     if (class213.field2384.field1487 == var7) {
                        if (class490.field4042.field1361 == 16711935L) {
                           class357.field3202 = class213.field2384;

                           for(var9 = 0; var9 < 256; ++var9) {
                              class230 var21 = class475.field3958[var9];
                              if (var21 != null) {
                                 class357.field3202.field1487 = 5 + var9 * 8;
                                 if (class357.field3202.field1487 >= class357.field3202.field1489.length) {
                                    if (!var21.field2512) {
                                       throw new RuntimeException("");
                                    }

                                    var21.method1150();
                                 } else {
                                    var11 = class357.field3202.method717();
                                    int var22 = class357.field3202.method717();
                                    var21.method1159(var11, var22);
                                 }
                              }
                           }
                        } else {
                           class475.field3957.reset();
                           class475.field3957.update(class213.field2384.field1489, 0, var7);
                           var9 = (int)class475.field3957.getValue();
                           if (var9 != class490.field4042.field2793) {
                              try {
                                 class475.field3962.method2054();
                              } catch (Exception var17) {
                                 ;
                              }

                              ++class475.field3964;
                              class475.field3962 = null;
                              class475.field3959 = (byte)((int)(Math.random() * 255.0D + 1.0D));
                              return false;
                           }

                           class475.field3964 = 0;
                           class475.field3951 = 0;
                           class490.field4042.field2792.method1156((int)(class490.field4042.field1361 & 65535L), class213.field2384.field1489, 16711680L == (class490.field4042.field1361 & 16711680L), class41.field374);
                        }

                        class490.field4042.method567();
                        if (class41.field374) {
                           --class475.field3950;
                        } else {
                           --class475.field3960;
                        }

                        class475.field3944 = 0;
                        class490.field4042 = null;
                        class213.field2384 = null;
                     } else {
                        if (class475.field3944 != 512) {
                           break;
                        }

                        class475.field3944 = 0;
                     }
                  }
               }

               return true;
            }
         } catch (IOException var18) {
            try {
               class475.field3962.method2054();
            } catch (Exception var16) {
               ;
            }

            ++class475.field3951;
            class475.field3962 = null;
            return false;
         }
      }
   }

   public static int method1521(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
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

   public static void method1523() {
      class5.field19.method162();
      class5.field18.method162();
   }

   static int method1522(int var0, class472 var1, boolean var2) {
      if (var0 == 5630) {
         client.field484 = 250;
         return 1;
      } else {
         return 2;
      }
   }
}
