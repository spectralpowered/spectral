import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class class67 {
   public short[] field625;
   public short[] field626;

   public class67(int var1) {
      class263 var2 = class423.method2062(var1);
      if (var2.method1211()) {
         this.field625 = new short[var2.field2148.length];
         System.arraycopy(var2.field2148, 0, this.field625, 0, this.field625.length);
      }

      if (var2.method1209()) {
         this.field626 = new short[var2.field2192.length];
         System.arraycopy(var2.field2192, 0, this.field626, 0, this.field626.length);
      }

   }

   public static int method300(int var0) {
      class457 var3 = (class457)class457.field3779.method394((long)var0);
      class457 var2;
      if (null != var3) {
         var2 = var3;
      } else {
         byte[] var4 = class457.field3778.method1365(14, var0);
         var3 = new class457();
         if (null != var4) {
            var3.method2256(new class127(var4));
         }

         class457.field3779.method396(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.field3780;
      int var5 = var2.field3781;
      int var6 = var2.field3782;
      int var7 = class291.field2375[var6 - var5];
      return class291.field2373[var8] >> var5 & var7;
   }

   public static class120 method299(int var0) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if (null == class329.field2600[var2] || class329.field2600[var2][var3] == null) {
         boolean var4 = class268.method1275(var2);
         if (!var4) {
            return null;
         }
      }

      return class329.field2600[var2][var3];
   }

   static void method301(class214 var0, class58 var1) {
      int var5;
      int var51;
      int var52;
      if (class359.field3076) {
         class432 var49 = client.field460;
         class432 var50 = var49;

         while(true) {
            if (!var50.method2136()) {
               if (1 != class466.field3869 && (class151.field1180 || 4 != class466.field3869)) {
                  break;
               }

               var5 = 280 + class359.field3052;
               if (class466.field3870 >= var5 && class466.field3870 <= var5 + 14 && class466.field3867 >= 4 && class466.field3867 <= 18) {
                  class374.method1845(0, 0);
                  break;
               }

               if (class466.field3870 >= var5 + 15 && class466.field3870 <= var5 + 80 && class466.field3867 >= 4 && class466.field3867 <= 18) {
                  class374.method1845(0, 1);
                  break;
               }

               var51 = class359.field3052 + 390;
               if (class466.field3870 >= var51 && class466.field3870 <= var51 + 14 && class466.field3867 >= 4 && class466.field3867 <= 18) {
                  class374.method1845(1, 0);
                  break;
               }

               if (class466.field3870 >= var51 + 15 && class466.field3870 <= var51 + 80 && class466.field3867 >= 4 && class466.field3867 <= 18) {
                  class374.method1845(1, 1);
                  break;
               }

               var52 = class359.field3052 + 500;
               if (class466.field3870 >= var52 && class466.field3870 <= var52 + 14 && class466.field3867 >= 4 && class466.field3867 <= 18) {
                  class374.method1845(2, 0);
                  break;
               }

               if (class466.field3870 >= var52 + 15 && class466.field3870 <= var52 + 80 && class466.field3867 >= 4 && class466.field3867 <= 18) {
                  class374.method1845(2, 1);
                  break;
               }

               int var54 = class359.field3052 + 610;
               if (class466.field3870 >= var54 && class466.field3870 <= var54 + 14 && class466.field3867 >= 4 && class466.field3867 <= 18) {
                  class374.method1845(3, 0);
                  break;
               }

               if (class466.field3870 >= var54 + 15 && class466.field3870 <= var54 + 80 && class466.field3867 >= 4 && class466.field3867 <= 18) {
                  class374.method1845(3, 1);
                  break;
               }

               if (class466.field3870 >= 708 + class359.field3052 && class466.field3867 >= 4 && class466.field3870 <= 50 + class359.field3052 + 708 && class466.field3867 <= 20) {
                  class359.field3076 = false;
                  class287.field2366.method1229(class359.field3052, 0);
                  class374.field3173.method1229(class359.field3052 + 382, 0);
                  class359.field3054.method1745(382 + class359.field3052 - class359.field3054.field2758 / 2, 18);
                  break;
               }

               if (class359.field3077 != -1) {
                  class2 var55 = class2.field12[class359.field3077];
                  class61.method282(var55);
                  class359.field3076 = false;
                  class287.field2366.method1229(class359.field3052, 0);
                  class374.field3173.method1229(class359.field3052 + 382, 0);
                  class359.field3054.method1745(class359.field3052 + 382 - class359.field3054.field2758 / 2, 18);
               } else {
                  if (class359.field3078 > 0 && null != class48.field566 && class466.field3870 >= 0 && class466.field3870 <= class48.field566.field2758 && class466.field3867 >= class476.field4003 / 2 - 50 && class466.field3867 <= 50 + class476.field4003 / 2) {
                     --class359.field3078;
                  }

                  if (class359.field3078 < class359.field3079 && class261.field2115 != null && class466.field3870 >= class427.field3529 - class261.field2115.field2758 - 5 && class466.field3870 <= class427.field3529 && class466.field3867 >= class476.field4003 / 2 - 50 && class466.field3867 <= 50 + class476.field4003 / 2) {
                     ++class359.field3078;
                  }
               }
               break;
            }

            if (var50.field3590 == 13) {
               class359.field3076 = false;
               class287.field2366.method1229(class359.field3052, 0);
               class374.field3173.method1229(382 + class359.field3052, 0);
               class359.field3054.method1745(class359.field3052 + 382 - class359.field3054.field2758 / 2, 18);
               break;
            }

            if (var50.field3590 == 96) {
               if (class359.field3078 > 0 && class48.field566 != null) {
                  --class359.field3078;
               }
            } else if (var50.field3590 == 97 && class359.field3078 < class359.field3079 && class261.field2115 != null) {
               ++class359.field3078;
            }
         }

      } else {
         if ((1 == class466.field3869 || !class151.field1180 && 4 == class466.field3869) && class466.field3870 >= 765 + class359.field3052 - 50 && class466.field3867 >= 453) {
            class50.field574.method2223(!class50.field574.method2213());
            if (!class50.field574.method2213()) {
               class38 var3 = class317.field2494;
               int var4 = var3.method1356("scape main");
               var5 = var3.method1359(var4, "");
               class74.method323(var3, var4, var5, 255, false);
            } else {
               class403.method1988();
            }
         }

         if (client.field229 != 5) {
            if (-1L == class359.field3068) {
               class359.field3068 = class152.method711() + 1000L;
            }

            long var48 = class152.method711();
            if (class473.method2339() && class359.field3081 == -1L) {
               class359.field3081 = var48;
               if (class359.field3081 > class359.field3068) {
                  class359.field3068 = class359.field3081;
               }
            }

            if (client.field229 == 10 || 11 == client.field229) {
               if (class476.field3997 == class235.field1995) {
                  if (class466.field3869 == 1 || !class151.field1180 && 4 == class466.field3869) {
                     var5 = class359.field3052 + 5;
                     short var6 = 463;
                     byte var7 = 100;
                     byte var8 = 35;
                     if (class466.field3870 >= var5 && class466.field3870 <= var5 + var7 && class466.field3867 >= var6 && class466.field3867 <= var6 + var8) {
                        class303.method1465();
                        return;
                     }
                  }

                  if (null != class338.field2702) {
                     class303.method1465();
                  }
               }

               var5 = class466.field3869;
               var51 = class466.field3870;
               var52 = class466.field3867;
               if (var5 == 0) {
                  var51 = class466.field3863;
                  var52 = class466.field3858;
               }

               if (!class151.field1180 && var5 == 4) {
                  var5 = 1;
               }

               class432 var53 = client.field460;
               class432 var9 = var53;
               int var57;
               short var58;
               if (class359.field3075 == 0) {
                  boolean var87 = false;

                  while(var9.method2136()) {
                     if (84 == var9.field3590) {
                        var87 = true;
                     }
                  }

                  var57 = class140.field1136 - 80;
                  var58 = 291;
                  if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                     class10.method62(class241.method1045("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var57 = 80 + class140.field1136;
                  if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20 || var87) {
                     if (0 != (client.field308 & 33554432)) {
                        class359.field3062 = "";
                        class359.field3051 = class177.field1543;
                        class359.field3064 = class177.field1561;
                        class359.field3084 = class177.field1631;
                        class286.method1419(1);
                        class492.method2437();
                     } else if ((client.field308 & 4) != 0) {
                        if ((client.field308 & 1024) != 0) {
                           class359.field3051 = class177.field1332;
                           class359.field3064 = class177.field1558;
                           class359.field3084 = class177.field1559;
                        } else {
                           class359.field3051 = class177.field1551;
                           class359.field3064 = class177.field1541;
                           class359.field3084 = class177.field1553;
                        }

                        class359.field3062 = class177.field1550;
                        class286.method1419(1);
                        class492.method2437();
                     } else if ((client.field308 & 1024) != 0) {
                        class359.field3051 = class177.field1554;
                        class359.field3064 = class177.field1555;
                        class359.field3084 = class177.field1527;
                        class359.field3062 = class177.field1550;
                        class286.method1419(1);
                        class492.method2437();
                     } else {
                        class426.method2080(false);
                     }
                  }
               } else {
                  int var10;
                  short var11;
                  if (class359.field3075 == 1) {
                     while(true) {
                        if (!var9.method2136()) {
                           var10 = class140.field1136 - 80;
                           var11 = 321;
                           if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                              class426.method2080(false);
                           }

                           var10 = class140.field1136 + 80;
                           if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                              class286.method1419(0);
                           }
                           break;
                        }

                        if (84 == var9.field3590) {
                           class426.method2080(false);
                        } else if (13 == var9.field3590) {
                           class286.method1419(0);
                        }
                     }
                  } else {
                     int var14;
                     short var56;
                     int var67;
                     if (2 == class359.field3075) {
                        var56 = 201;
                        var10 = var56 + 52;
                        if (var5 == 1 && var52 >= var10 - 12 && var52 < var10 + 2) {
                           class359.field3073 = 0;
                        }

                        var10 += 15;
                        if (var5 == 1 && var52 >= var10 - 12 && var52 < var10 + 2) {
                           class359.field3073 = 1;
                        }

                        var10 += 15;
                        var56 = 361;
                        if (class191.field1712 != null) {
                           var57 = class191.field1712.field3185 / 2;
                           if (var5 == 1 && var51 >= class191.field1712.field3184 - var57 && var51 <= var57 + class191.field1712.field3184 && var52 >= var56 - 15 && var52 < var56) {
                              switch(class359.field3059) {
                              case 1:
                                 class300.method1452(class177.field1599, class177.field1600, class177.field1595);
                                 class286.method1419(5);
                                 return;
                              case 2:
                                 class10.method62("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var57 = class140.field1136 - 80;
                        var58 = 321;
                        if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                           class359.field3071 = class359.field3071.trim();
                           if (class359.field3071.length() == 0) {
                              class300.method1452(class177.field1443, class177.field1412, class177.field1471);
                              return;
                           }

                           if (class359.field3067.length() == 0) {
                              class300.method1452(class177.field1470, class177.field1405, class177.field1448);
                              return;
                           }

                           class300.method1452(class177.field1565, class177.field1420, class177.field1567);
                           class415.method2014(false);
                           class261.method1113(20);
                           return;
                        }

                        var57 = 180 + class359.field3072 + 80;
                        if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                           class286.method1419(0);
                           class359.field3071 = "";
                           class359.field3067 = "";
                           class398.field3358 = 0;
                           class60.field603 = "";
                           class359.field3061 = true;
                        }

                        var57 = class140.field1136 + -117;
                        var58 = 277;
                        class359.field3070 = var51 >= var57 && var51 < var57 + class223.field1919 && var52 >= var58 && var52 < var58 + class349.field2890;
                        if (var5 == 1 && class359.field3070) {
                           client.field268 = !client.field268;
                           if (!client.field268 && class50.field574.method2215() != null) {
                              class50.field574.method2214((String)null);
                           }
                        }

                        var57 = 24 + class140.field1136;
                        var58 = 277;
                        class359.field3085 = var51 >= var57 && var51 < var57 + class223.field1919 && var52 >= var58 && var52 < class349.field2890 + var58;
                        if (var5 == 1 && class359.field3085) {
                           class50.field574.method2225(!class50.field574.method2203());
                           if (!class50.field574.method2203()) {
                              class359.field3071 = "";
                              class50.field574.method2214((String)null);
                              class492.method2437();
                           }
                        }

                        while(true) {
                           Transferable var78;
                           do {
                              while(true) {
                                 label1521:
                                 do {
                                    while(true) {
                                       while(var9.method2136()) {
                                          if (var9.field3590 != 13) {
                                             if (class359.field3073 != 0) {
                                                continue label1521;
                                             }

                                             char var70 = var9.field3577;

                                             for(var14 = 0; var14 < class359.field3074.length() && var70 != class359.field3074.charAt(var14); ++var14) {
                                                ;
                                             }

                                             if (85 == var9.field3590 && class359.field3071.length() > 0) {
                                                class359.field3071 = class359.field3071.substring(0, class359.field3071.length() - 1);
                                             }

                                             if (var9.field3590 == 84 || var9.field3590 == 80) {
                                                class359.field3073 = 1;
                                             }

                                             if (class440.method2180(var9.field3577) && class359.field3071.length() < 320) {
                                                class359.field3071 = class359.field3071 + var9.field3577;
                                             }
                                          } else {
                                             class286.method1419(0);
                                             class359.field3071 = "";
                                             class359.field3067 = "";
                                             class398.field3358 = 0;
                                             class60.field603 = "";
                                             class359.field3061 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(1 != class359.field3073);

                                 if (var9.field3590 == 85 && class359.field3067.length() > 0) {
                                    class359.field3067 = class359.field3067.substring(0, class359.field3067.length() - 1);
                                 } else if (84 == var9.field3590 || 80 == var9.field3590) {
                                    class359.field3073 = 0;
                                    if (84 == var9.field3590) {
                                       class359.field3071 = class359.field3071.trim();
                                       if (class359.field3071.length() == 0) {
                                          class300.method1452(class177.field1443, class177.field1412, class177.field1471);
                                          return;
                                       }

                                       if (class359.field3067.length() == 0) {
                                          class300.method1452(class177.field1470, class177.field1405, class177.field1448);
                                          return;
                                       }

                                       class300.method1452(class177.field1565, class177.field1420, class177.field1567);
                                       class415.method2014(false);
                                       class261.method1113(20);
                                       return;
                                    }
                                 }

                                 if ((var9.method2132(82) || var9.method2132(87)) && 67 == var9.field3590) {
                                    Clipboard var73 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var78 = var73.getContents(class309.field2461);
                                    var67 = 20 - class359.field3067.length();
                                    break;
                                 }

                                 if (class156.method720(var9.field3577) && class440.method2180(var9.field3577) && class359.field3067.length() < 20) {
                                    class359.field3067 = class359.field3067 + var9.field3577;
                                 }
                              }
                           } while(var67 <= 0);

                           try {
                              String var84 = (String)var78.getTransferData(DataFlavor.stringFlavor);
                              int var91 = Math.min(var67, var84.length());

                              for(int var93 = 0; var93 < var91; ++var93) {
                                 if (!class156.method720(var84.charAt(var93)) || !class440.method2180(var84.charAt(var93))) {
                                    class286.method1419(3);
                                    return;
                                 }
                              }

                              class359.field3067 = class359.field3067 + var84.substring(0, var91);
                           } catch (UnsupportedFlavorException var46) {
                              ;
                           } catch (IOException var47) {
                              ;
                           }
                        }
                     } else if (class359.field3075 == 3) {
                        var10 = 180 + class359.field3072;
                        var11 = 276;
                        if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                           class301.method1454(false);
                        }

                        var10 = class359.field3072 + 180;
                        var11 = 326;
                        if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                           class300.method1452(class177.field1599, class177.field1600, class177.field1595);
                           class286.method1419(5);
                           return;
                        }
                     } else {
                        int var13;
                        if (class359.field3075 == 4) {
                           var10 = 180 + class359.field3072 - 80;
                           var11 = 321;
                           if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                              class60.field603.trim();
                              if (class60.field603.length() != 6) {
                                 class300.method1452(class177.field1362, class177.field1363, class177.field1364);
                                 return;
                              }

                              class398.field3358 = Integer.parseInt(class60.field603);
                              class60.field603 = "";
                              class415.method2014(true);
                              class300.method1452(class177.field1565, class177.field1420, class177.field1567);
                              class261.method1113(20);
                              return;
                           }

                           if (var5 == 1 && var51 >= 180 + class359.field3072 - 9 && var51 <= 130 + class359.field3072 + 180 && var52 >= 263 && var52 <= 296) {
                              class359.field3061 = !class359.field3061;
                           }

                           if (var5 == 1 && var51 >= class359.field3072 + 180 - 34 && var51 <= 34 + class359.field3072 + 180 && var52 >= 351 && var52 <= 363) {
                              class10.method62(class241.method1045("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var10 = class359.field3072 + 180 + 80;
                           if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                              class286.method1419(0);
                              class359.field3071 = "";
                              class359.field3067 = "";
                              class398.field3358 = 0;
                              class60.field603 = "";
                           }

                           while(var9.method2136()) {
                              boolean var12 = false;

                              for(var13 = 0; var13 < class359.field3082.length(); ++var13) {
                                 if (var9.field3577 == class359.field3082.charAt(var13)) {
                                    var12 = true;
                                    break;
                                 }
                              }

                              if (var9.field3590 == 13) {
                                 class286.method1419(0);
                                 class359.field3071 = "";
                                 class359.field3067 = "";
                                 class398.field3358 = 0;
                                 class60.field603 = "";
                              } else {
                                 if (85 == var9.field3590 && class60.field603.length() > 0) {
                                    class60.field603 = class60.field603.substring(0, class60.field603.length() - 1);
                                 }

                                 if (var9.field3590 == 84) {
                                    class60.field603.trim();
                                    if (class60.field603.length() != 6) {
                                       class300.method1452(class177.field1362, class177.field1363, class177.field1364);
                                       return;
                                    }

                                    class398.field3358 = Integer.parseInt(class60.field603);
                                    class60.field603 = "";
                                    class415.method2014(true);
                                    class300.method1452(class177.field1565, class177.field1420, class177.field1567);
                                    class261.method1113(20);
                                    return;
                                 }

                                 if (var12 && class60.field603.length() < 6) {
                                    class60.field603 = class60.field603 + var9.field3577;
                                 }
                              }
                           }
                        } else {
                           int var22;
                           if (5 == class359.field3075) {
                              var10 = class359.field3072 + 180 - 80;
                              var11 = 321;
                              class127 var21;
                              int var25;
                              if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                 class359.field3071 = class359.field3071.trim();
                                 if (class359.field3071.length() == 0) {
                                    class300.method1452(class177.field1599, class177.field1600, class177.field1595);
                                 } else {
                                    long var63;
                                    try {
                                       URL var65 = new URL(class241.method1045("services", false) + "m=accountappeal/login.ws");
                                       URLConnection var16 = var65.openConnection();
                                       var16.setRequestProperty("connection", "close");
                                       var16.setDoInput(true);
                                       var16.setDoOutput(true);
                                       var16.setConnectTimeout(5000);
                                       OutputStreamWriter var71 = new OutputStreamWriter(var16.getOutputStream());
                                       var71.write("data1=req");
                                       var71.flush();
                                       InputStream var77 = var16.getInputStream();
                                       class127 var96 = new class127(new byte[1000]);

                                       while(true) {
                                          int var85 = var77.read(var96.field1072, var96.field1070, 1000 - var96.field1070);
                                          if (var85 == -1) {
                                             var96.field1070 = 0;
                                             long var88 = var96.method598();
                                             var63 = var88;
                                             break;
                                          }

                                          var96.field1070 += var85;
                                          if (var96.field1070 >= 1000) {
                                             var63 = 0L;
                                             break;
                                          }
                                       }
                                    } catch (Exception var39) {
                                       var63 = 0L;
                                    }

                                    byte var59;
                                    if (var63 == 0L) {
                                       var59 = 5;
                                    } else {
                                       String var79 = class359.field3071;
                                       Random var99 = new Random();
                                       class127 var89 = new class127(128);
                                       var21 = new class127(128);
                                       int[] var101 = new int[]{var99.nextInt(), var99.nextInt(), (int)(var63 >> 32), (int)var63};
                                       var89.method544(10);

                                       int var103;
                                       for(var103 = 0; var103 < 4; ++var103) {
                                          var89.method534(var99.nextInt());
                                       }

                                       var89.method534(var101[0]);
                                       var89.method534(var101[1]);
                                       var89.method536(var63);
                                       var89.method536(0L);

                                       for(var103 = 0; var103 < 4; ++var103) {
                                          var89.method534(var99.nextInt());
                                       }

                                       var89.method563(class184.field1684, class184.field1683);
                                       var21.method544(10);

                                       for(var103 = 0; var103 < 3; ++var103) {
                                          var21.method534(var99.nextInt());
                                       }

                                       var21.method536(var99.nextLong());
                                       var21.method535(var99.nextLong());
                                       if (null != client.field273) {
                                          var21.method540(client.field273, 0, client.field273.length);
                                       } else {
                                          byte[] var105 = new byte[24];

                                          try {
                                             class25.field115.method2164(0L);
                                             class25.field115.method2159(var105);

                                             for(var25 = 0; var25 < 24 && var105[var25] == 0; ++var25) {
                                                ;
                                             }

                                             if (var25 >= 24) {
                                                throw new IOException();
                                             }
                                          } catch (Exception var38) {
                                             for(int var109 = 0; var109 < 24; ++var109) {
                                                var105[var109] = -1;
                                             }
                                          }

                                          var21.method540(var105, 0, var105.length);
                                       }

                                       var21.method536(var99.nextLong());
                                       var21.method563(class184.field1684, class184.field1683);
                                       var103 = class319.method1614(var79);
                                       if (var103 % 8 != 0) {
                                          var103 += 8 - var103 % 8;
                                       }

                                       class127 var106 = new class127(var103);
                                       var106.method538(var79, (byte)72);
                                       var106.field1070 = var103;
                                       var106.method591(var101);
                                       class127 var113 = new class127(var21.field1070 + var89.field1070 + 5 + var106.field1070);
                                       var113.method544(2);
                                       var113.method544(var89.field1070);
                                       var113.method540(var89.field1072, 0, var89.field1070);
                                       var113.method544(var21.field1070);
                                       var113.method540(var21.field1072, 0, var21.field1070);
                                       var113.method533(var106.field1070);
                                       var113.method540(var106.field1072, 0, var106.field1070);
                                       String var110 = class236.method1029(var113.field1072);

                                       byte var75;
                                       try {
                                          URL var112 = new URL(class241.method1045("services", false) + "m=accountappeal/login.ws");
                                          URLConnection var115 = var112.openConnection();
                                          var115.setDoInput(true);
                                          var115.setDoOutput(true);
                                          var115.setConnectTimeout(5000);
                                          OutputStreamWriter var116 = new OutputStreamWriter(var115.getOutputStream());
                                          var116.write("data2=" + class106.method421(var110) + "&dest=" + class106.method421("passwordchoice.ws"));
                                          var116.flush();
                                          InputStream var117 = var115.getInputStream();
                                          var113 = new class127(new byte[1000]);

                                          while(true) {
                                             int var118 = var117.read(var113.field1072, var113.field1070, 1000 - var113.field1070);
                                             if (var118 == -1) {
                                                var116.close();
                                                var117.close();
                                                String var119 = new String(var113.field1072);
                                                if (var119.startsWith("OFFLINE")) {
                                                   var75 = 4;
                                                } else if (var119.startsWith("WRONG")) {
                                                   var75 = 7;
                                                } else if (var119.startsWith("RELOAD")) {
                                                   var75 = 3;
                                                } else if (var119.startsWith("Not permitted for social network accounts.")) {
                                                   var75 = 6;
                                                } else {
                                                   var113.method562(var101);

                                                   while(var113.field1070 > 0 && 0 == var113.field1072[var113.field1070 - 1]) {
                                                      --var113.field1070;
                                                   }

                                                   var119 = new String(var113.field1072, 0, var113.field1070);
                                                   boolean var120;
                                                   if (null == var119) {
                                                      var120 = false;
                                                   } else {
                                                      label1682: {
                                                         try {
                                                            new URL(var119);
                                                         } catch (MalformedURLException var36) {
                                                            var120 = false;
                                                            break label1682;
                                                         }

                                                         var120 = true;
                                                      }
                                                   }

                                                   if (var120) {
                                                      class10.method62(var119, true, false);
                                                      var75 = 2;
                                                   } else {
                                                      var75 = 5;
                                                   }
                                                }
                                                break;
                                             }

                                             var113.field1070 += var118;
                                             if (var113.field1070 >= 1000) {
                                                var75 = 5;
                                                break;
                                             }
                                          }
                                       } catch (Throwable var37) {
                                          var37.printStackTrace();
                                          var75 = 5;
                                       }

                                       var59 = var75;
                                    }

                                    switch(var59) {
                                    case 2:
                                       class300.method1452(class177.field1602, class177.field1603, class177.field1339);
                                       class286.method1419(6);
                                       break;
                                    case 3:
                                       class300.method1452(class177.field1466, class177.field1606, class177.field1607);
                                       break;
                                    case 4:
                                       class300.method1452(class177.field1608, class177.field1609, class177.field1610);
                                       break;
                                    case 5:
                                       class300.method1452(class177.field1624, class177.field1612, class177.field1613);
                                       break;
                                    case 6:
                                       class300.method1452(class177.field1464, class177.field1615, class177.field1616);
                                       break;
                                    case 7:
                                       class300.method1452(class177.field1642, class177.field1618, class177.field1489);
                                    }
                                 }

                                 return;
                              }

                              var10 = 80 + 180 + class359.field3072;
                              if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                 class426.method2080(true);
                              }

                              var58 = 361;
                              if (null != class188.field1701) {
                                 var13 = class188.field1701.field3185 / 2;
                                 if (var5 == 1 && var51 >= class188.field1701.field3184 - var13 && var51 <= class188.field1701.field3184 + var13 && var52 >= var58 - 15 && var52 < var58) {
                                    class10.method62(class241.method1045("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                 }
                              }

                              while(var9.method2136()) {
                                 boolean var60 = false;

                                 for(var14 = 0; var14 < class359.field3074.length(); ++var14) {
                                    if (var9.field3577 == class359.field3074.charAt(var14)) {
                                       var60 = true;
                                       break;
                                    }
                                 }

                                 if (13 == var9.field3590) {
                                    class426.method2080(true);
                                 } else {
                                    if (var9.field3590 == 85 && class359.field3071.length() > 0) {
                                       class359.field3071 = class359.field3071.substring(0, class359.field3071.length() - 1);
                                    }

                                    if (84 == var9.field3590) {
                                       class359.field3071 = class359.field3071.trim();
                                       if (class359.field3071.length() == 0) {
                                          class300.method1452(class177.field1599, class177.field1600, class177.field1595);
                                       } else {
                                          long var15;
                                          try {
                                             URL var17 = new URL(class241.method1045("services", false) + "m=accountappeal/login.ws");
                                             URLConnection var18 = var17.openConnection();
                                             var18.setRequestProperty("connection", "close");
                                             var18.setDoInput(true);
                                             var18.setDoOutput(true);
                                             var18.setConnectTimeout(5000);
                                             OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
                                             var19.write("data1=req");
                                             var19.flush();
                                             InputStream var20 = var18.getInputStream();
                                             var21 = new class127(new byte[1000]);

                                             while(true) {
                                                var22 = var20.read(var21.field1072, var21.field1070, 1000 - var21.field1070);
                                                if (var22 == -1) {
                                                   var21.field1070 = 0;
                                                   long var98 = var21.method598();
                                                   var15 = var98;
                                                   break;
                                                }

                                                var21.field1070 += var22;
                                                if (var21.field1070 >= 1000) {
                                                   var15 = 0L;
                                                   break;
                                                }
                                             }
                                          } catch (Exception var43) {
                                             var15 = 0L;
                                          }

                                          byte var62;
                                          if (var15 == 0L) {
                                             var62 = 5;
                                          } else {
                                             String var83 = class359.field3071;
                                             Random var90 = new Random();
                                             class127 var100 = new class127(128);
                                             class127 var23 = new class127(128);
                                             int[] var24 = new int[]{var90.nextInt(), var90.nextInt(), (int)(var15 >> 32), (int)var15};
                                             var100.method544(10);

                                             for(var25 = 0; var25 < 4; ++var25) {
                                                var100.method534(var90.nextInt());
                                             }

                                             var100.method534(var24[0]);
                                             var100.method534(var24[1]);
                                             var100.method536(var15);
                                             var100.method536(0L);

                                             for(var25 = 0; var25 < 4; ++var25) {
                                                var100.method534(var90.nextInt());
                                             }

                                             var100.method563(class184.field1684, class184.field1683);
                                             var23.method544(10);

                                             for(var25 = 0; var25 < 3; ++var25) {
                                                var23.method534(var90.nextInt());
                                             }

                                             var23.method536(var90.nextLong());
                                             var23.method535(var90.nextLong());
                                             if (client.field273 != null) {
                                                var23.method540(client.field273, 0, client.field273.length);
                                             } else {
                                                byte[] var26 = new byte[24];

                                                try {
                                                   class25.field115.method2164(0L);
                                                   class25.field115.method2159(var26);

                                                   int var27;
                                                   for(var27 = 0; var27 < 24 && 0 == var26[var27]; ++var27) {
                                                      ;
                                                   }

                                                   if (var27 >= 24) {
                                                      throw new IOException();
                                                   }
                                                } catch (Exception var42) {
                                                   for(int var28 = 0; var28 < 24; ++var28) {
                                                      var26[var28] = -1;
                                                   }
                                                }

                                                var23.method540(var26, 0, var26.length);
                                             }

                                             var23.method536(var90.nextLong());
                                             var23.method563(class184.field1684, class184.field1683);
                                             var25 = class319.method1614(var83);
                                             if (0 != var25 % 8) {
                                                var25 += 8 - var25 % 8;
                                             }

                                             class127 var108 = new class127(var25);
                                             var108.method538(var83, (byte)107);
                                             var108.field1070 = var25;
                                             var108.method591(var24);
                                             class127 var111 = new class127(var23.field1070 + 5 + var100.field1070 + var108.field1070);
                                             var111.method544(2);
                                             var111.method544(var100.field1070);
                                             var111.method540(var100.field1072, 0, var100.field1070);
                                             var111.method544(var23.field1070);
                                             var111.method540(var23.field1072, 0, var23.field1070);
                                             var111.method533(var108.field1070);
                                             var111.method540(var108.field1072, 0, var108.field1070);
                                             String var114 = class236.method1029(var111.field1072);

                                             byte var81;
                                             try {
                                                URL var29 = new URL(class241.method1045("services", false) + "m=accountappeal/login.ws");
                                                URLConnection var30 = var29.openConnection();
                                                var30.setDoInput(true);
                                                var30.setDoOutput(true);
                                                var30.setConnectTimeout(5000);
                                                OutputStreamWriter var31 = new OutputStreamWriter(var30.getOutputStream());
                                                var31.write("data2=" + class106.method421(var114) + "&dest=" + class106.method421("passwordchoice.ws"));
                                                var31.flush();
                                                InputStream var32 = var30.getInputStream();
                                                var111 = new class127(new byte[1000]);

                                                while(true) {
                                                   int var33 = var32.read(var111.field1072, var111.field1070, 1000 - var111.field1070);
                                                   if (var33 == -1) {
                                                      var31.close();
                                                      var32.close();
                                                      String var121 = new String(var111.field1072);
                                                      if (var121.startsWith("OFFLINE")) {
                                                         var81 = 4;
                                                      } else if (var121.startsWith("WRONG")) {
                                                         var81 = 7;
                                                      } else if (var121.startsWith("RELOAD")) {
                                                         var81 = 3;
                                                      } else if (var121.startsWith("Not permitted for social network accounts.")) {
                                                         var81 = 6;
                                                      } else {
                                                         var111.method562(var24);

                                                         while(var111.field1070 > 0 && var111.field1072[var111.field1070 - 1] == 0) {
                                                            --var111.field1070;
                                                         }

                                                         var121 = new String(var111.field1072, 0, var111.field1070);
                                                         boolean var34;
                                                         if (var121 == null) {
                                                            var34 = false;
                                                         } else {
                                                            label1684: {
                                                               try {
                                                                  new URL(var121);
                                                               } catch (MalformedURLException var40) {
                                                                  var34 = false;
                                                                  break label1684;
                                                               }

                                                               var34 = true;
                                                            }
                                                         }

                                                         if (var34) {
                                                            class10.method62(var121, true, false);
                                                            var81 = 2;
                                                         } else {
                                                            var81 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var111.field1070 += var33;
                                                   if (var111.field1070 >= 1000) {
                                                      var81 = 5;
                                                      break;
                                                   }
                                                }
                                             } catch (Throwable var41) {
                                                var41.printStackTrace();
                                                var81 = 5;
                                             }

                                             var62 = var81;
                                          }

                                          switch(var62) {
                                          case 2:
                                             class300.method1452(class177.field1602, class177.field1603, class177.field1339);
                                             class286.method1419(6);
                                             break;
                                          case 3:
                                             class300.method1452(class177.field1466, class177.field1606, class177.field1607);
                                             break;
                                          case 4:
                                             class300.method1452(class177.field1608, class177.field1609, class177.field1610);
                                             break;
                                          case 5:
                                             class300.method1452(class177.field1624, class177.field1612, class177.field1613);
                                             break;
                                          case 6:
                                             class300.method1452(class177.field1464, class177.field1615, class177.field1616);
                                             break;
                                          case 7:
                                             class300.method1452(class177.field1642, class177.field1618, class177.field1489);
                                          }
                                       }

                                       return;
                                    }

                                    if (var60 && class359.field3071.length() < 320) {
                                       class359.field3071 = class359.field3071 + var9.field3577;
                                    }
                                 }
                              }
                           } else if (6 != class359.field3075) {
                              if (7 == class359.field3075) {
                                 if (class113.field842 && !client.field461) {
                                    var10 = class140.field1136 - 150;
                                    var57 = var10 + 240 + 25 + 40;
                                    var58 = 231;
                                    var13 = var58 + 40;
                                    if (var5 == 1 && var51 >= var10 && var51 <= var57 && var52 >= var58 && var52 <= var13) {
                                       var67 = var10;
                                       int var66 = 0;

                                       while(true) {
                                          if (var66 >= 8) {
                                             var14 = 0;
                                             break;
                                          }

                                          if (var51 <= var67 + 30) {
                                             var14 = var66;
                                             break;
                                          }

                                          var67 += 30;
                                          var67 += var66 != 1 && var66 != 3 ? 5 : 20;
                                          ++var66;
                                       }

                                       class359.field3069 = var14;
                                    }

                                    var14 = 180 + class359.field3072 - 80;
                                    short var74 = 321;
                                    boolean var69;
                                    Date var80;
                                    boolean var82;
                                    Date var86;
                                    StringBuilder var92;
                                    String[] var94;
                                    Date var95;
                                    boolean var97;
                                    SimpleDateFormat var102;
                                    Calendar var104;
                                    String var107;
                                    if (var5 == 1 && var51 >= var14 - 75 && var51 <= var14 + 75 && var52 >= var74 - 20 && var52 <= var74 + 20) {
                                       label1392: {
                                          try {
                                             var102 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                             var102.setLenient(false);
                                             var92 = new StringBuilder();
                                             var94 = class359.field3050;
                                             var22 = 0;

                                             while(true) {
                                                if (var22 < var94.length) {
                                                   var107 = var94[var22];
                                                   if (var107 != null) {
                                                      var92.append(var107);
                                                      ++var22;
                                                      continue;
                                                   }

                                                   class380.method1886("Date not valid.", "Please ensure all characters are populated.", "");
                                                   var80 = null;
                                                } else {
                                                   var92.append("12");
                                                   var80 = var102.parse(var92.toString());
                                                }

                                                var86 = var80;
                                                break;
                                             }
                                          } catch (ParseException var45) {
                                             class380.method1886("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                             var69 = false;
                                             break label1392;
                                          }

                                          if (null == var86) {
                                             var69 = false;
                                          } else {
                                             var104 = Calendar.getInstance();
                                             var104.set(1, var104.get(1) - 13);
                                             var104.set(5, var104.get(5) + 1);
                                             var104.set(11, 0);
                                             var104.set(12, 0);
                                             var104.set(13, 0);
                                             var104.set(14, 0);
                                             var95 = var104.getTime();
                                             var82 = var86.before(var95);
                                             var97 = class44.method220(var86);
                                             if (!var97) {
                                                class380.method1886("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var69 = false;
                                             } else {
                                                if (!var82) {
                                                   class74.field659 = 8388607;
                                                } else {
                                                   class74.field659 = (int)(var86.getTime() / 86400000L - 11745L);
                                                }

                                                var69 = true;
                                             }
                                          }
                                       }

                                       if (var69) {
                                          class261.method1113(50);
                                          return;
                                       }
                                    }

                                    var14 = 80 + 180 + class359.field3072;
                                    if (var5 == 1 && var51 >= var14 - 75 && var51 <= var14 + 75 && var52 >= var74 - 20 && var52 <= var74 + 20) {
                                       class359.field3050 = new String[8];
                                       class426.method2080(true);
                                    }

                                    while(var9.method2136()) {
                                       if (var9.field3590 == 101) {
                                          class359.field3050[class359.field3069] = null;
                                       }

                                       if (85 == var9.field3590) {
                                          if (null == class359.field3050[class359.field3069] && class359.field3069 > 0) {
                                             --class359.field3069;
                                          }

                                          class359.field3050[class359.field3069] = null;
                                       }

                                       if (var9.field3577 >= '0' && var9.field3577 <= '9') {
                                          class359.field3050[class359.field3069] = "" + var9.field3577;
                                          if (class359.field3069 < 7) {
                                             ++class359.field3069;
                                          }
                                       }

                                       if (var9.field3590 == 84) {
                                          label1321: {
                                             try {
                                                var102 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                var102.setLenient(false);
                                                var92 = new StringBuilder();
                                                var94 = class359.field3050;
                                                var22 = 0;

                                                while(true) {
                                                   if (var22 < var94.length) {
                                                      var107 = var94[var22];
                                                      if (var107 != null) {
                                                         var92.append(var107);
                                                         ++var22;
                                                         continue;
                                                      }

                                                      class380.method1886("Date not valid.", "Please ensure all characters are populated.", "");
                                                      var80 = null;
                                                   } else {
                                                      var92.append("12");
                                                      var80 = var102.parse(var92.toString());
                                                   }

                                                   var86 = var80;
                                                   break;
                                                }
                                             } catch (ParseException var44) {
                                                class380.method1886("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var69 = false;
                                                break label1321;
                                             }

                                             if (var86 == null) {
                                                var69 = false;
                                             } else {
                                                var104 = Calendar.getInstance();
                                                var104.set(1, var104.get(1) - 13);
                                                var104.set(5, var104.get(5) + 1);
                                                var104.set(11, 0);
                                                var104.set(12, 0);
                                                var104.set(13, 0);
                                                var104.set(14, 0);
                                                var95 = var104.getTime();
                                                var82 = var86.before(var95);
                                                var97 = class44.method220(var86);
                                                if (!var97) {
                                                   class380.method1886("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                   var69 = false;
                                                } else {
                                                   if (!var82) {
                                                      class74.field659 = 8388607;
                                                   } else {
                                                      class74.field659 = (int)(var86.getTime() / 86400000L - 11745L);
                                                   }

                                                   var69 = true;
                                                }
                                             }
                                          }

                                          if (var69) {
                                             class261.method1113(50);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var10 = 180 + class359.field3072 - 80;
                                    var11 = 321;
                                    if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                       class10.method62(class241.method1045("secure", true) + "m=dob/set_dob.ws", true, false);
                                       class300.method1452(class177.field1596, class177.field1597, class177.field1598);
                                       class286.method1419(6);
                                       return;
                                    }

                                    var10 = 180 + class359.field3072 + 80;
                                    if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                       class426.method2080(true);
                                    }
                                 }
                              } else if (class359.field3075 == 8) {
                                 var10 = class359.field3072 + 180 - 80;
                                 var11 = 321;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class10.method62("https://www.jagex.com/terms/privacy", true, false);
                                    class300.method1452(class177.field1596, class177.field1597, class177.field1598);
                                    class286.method1419(6);
                                    return;
                                 }

                                 var10 = class359.field3072 + 180 + 80;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class426.method2080(true);
                                 }
                              } else if (9 == class359.field3075) {
                                 var10 = class359.field3072 + 180;
                                 var11 = 311;
                                 if (var53.field3590 == 84 || 13 == var53.field3590 || var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class301.method1454(false);
                                 }
                              } else if (class359.field3075 == 10) {
                                 var10 = class359.field3072 + 180;
                                 var11 = 209;
                                 if (84 == var53.field3590 || var5 == 1 && var51 >= var10 - 109 && var51 <= var10 + 109 && var52 >= var11 && var52 <= var11 + 68) {
                                    class300.method1452(class177.field1565, class177.field1420, class177.field1567);
                                    client.field353 = class218.field1887;
                                    class415.method2014(false);
                                    class261.method1113(20);
                                 }
                              } else if (12 == class359.field3075) {
                                 var10 = class140.field1136;
                                 var11 = 233;
                                 class376 var61 = var1.method2030(0, 30, class177.field1353, var10, var11);
                                 class376 var68 = var1.method2030(32, 32, class177.field1353, var10, var11);
                                 class376 var72 = var1.method2030(70, 34, class177.field1353, var10, var11);
                                 var57 = var11 + 17;
                                 class376 var76 = var1.method2030(0, 34, class177.field1629, var10, var57);
                                 if (var5 == 1) {
                                    if (var61.method1855(var51, var52)) {
                                       class10.method62("https://www.jagex.com/terms", true, false);
                                    } else if (var68.method1855(var51, var52)) {
                                       class10.method62("https://www.jagex.com/terms/privacy", true, false);
                                    } else if (var72.method1855(var51, var52) || var76.method1855(var51, var52)) {
                                       class10.method62("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                    }
                                 }

                                 var10 = class140.field1136 - 80;
                                 var11 = 311;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class35.method148();
                                    class301.method1454(true);
                                 }

                                 var10 = class140.field1136 + 80;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class359.field3075 = 13;
                                 }
                              } else if (13 == class359.field3075) {
                                 var10 = class140.field1136;
                                 var11 = 321;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class301.method1454(true);
                                 }
                              } else if (class359.field3075 == 14) {
                                 String var64 = "";
                                 switch(class359.field3055) {
                                 case 0:
                                    var64 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                                    break;
                                 case 1:
                                    var64 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                                    break;
                                 case 2:
                                    var64 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
                                    break;
                                 default:
                                    class426.method2080(false);
                                 }

                                 var57 = 180 + class359.field3072;
                                 var58 = 276;
                                 if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                                    class10.method62(var64, true, false);
                                    class300.method1452(class177.field1596, class177.field1597, class177.field1598);
                                    class286.method1419(6);
                                    return;
                                 }

                                 var57 = class359.field3072 + 180;
                                 var58 = 326;
                                 if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                                    class426.method2080(false);
                                 }
                              } else if (class359.field3075 == 24) {
                                 var10 = class359.field3072 + 180;
                                 var11 = 301;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class301.method1454(false);
                                 }
                              } else if (class359.field3075 == 26) {
                                 var10 = class359.field3072 + 180 - 80;
                                 var11 = 321;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class10.method62(class241.method1045("secure", true) + "m=dob/set_dob.ws", true, false);
                                    class300.method1452(class177.field1596, class177.field1597, class177.field1598);
                                    class286.method1419(6);
                                    return;
                                 }

                                 var10 = class359.field3072 + 180 + 80;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class426.method2080(true);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var9.method2136()) {
                                       var56 = 321;
                                       if (var5 == 1 && var52 >= var56 - 20 && var52 <= var56 + 20) {
                                          class426.method2080(true);
                                       }

                                       return;
                                    }
                                 } while(84 != var9.field3590 && var9.field3590 != 13);

                                 class426.method2080(true);
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
