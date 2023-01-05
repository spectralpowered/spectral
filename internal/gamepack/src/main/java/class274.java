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

public class class274 {
   public short[] field2753;
   public short[] field2754;

   public class274(int var1) {
      class458 var2 = class272.method1294(var1);
      if (var2.method2180()) {
         this.field2753 = new short[var2.field3765.length];
         System.arraycopy(var2.field3765, 0, this.field2753, 0, this.field2753.length);
      }

      if (var2.method2178()) {
         this.field2754 = new short[var2.field3809.length];
         System.arraycopy(var2.field3809, 0, this.field2754, 0, this.field2754.length);
      }

   }

   public static int method1302(int var0) {
      class465 var3 = (class465)class465.field3868.method161((long)var0);
      class465 var2;
      if (null != var3) {
         var2 = var3;
      } else {
         byte[] var4 = class465.field3867.method892(14, var0);
         var3 = new class465();
         if (null != var4) {
            var3.method2279(new class134(var4));
         }

         class465.field3868.method163(var3, (long)var0);
         var2 = var3;
      }

      int var8 = var2.field3869;
      int var5 = var2.field3870;
      int var6 = var2.field3871;
      int var7 = class484.field3994[var6 - var5];
      return class484.field3992[var8] >> var5 & var7;
   }

   public static class210 method1301(int var0) {
      int var2 = var0 >> 16;
      int var3 = var0 & '\uffff';
      if (null == class71.field853[var2] || class71.field853[var2][var3] == null) {
         boolean var4 = class25.method126(var2);
         if (!var4) {
            return null;
         }
      }

      return class71.field853[var2][var3];
   }

   static void method1303(class141 var0, class394 var1) {
      int var5;
      int var51;
      int var52;
      if (class52.field781) {
         class463 var49 = client.field664;
         class463 var50 = var49;

         while(true) {
            if (!var50.method2276()) {
               if (1 != class182.field1963 && (class211.field2375 || 4 != class182.field1963)) {
                  break;
               }

               var5 = 280 + class52.field757;
               if (class182.field1964 >= var5 && class182.field1964 <= var5 + 14 && class182.field1961 >= 4 && class182.field1961 <= 18) {
                  class328.method1587(0, 0);
                  break;
               }

               if (class182.field1964 >= var5 + 15 && class182.field1964 <= var5 + 80 && class182.field1961 >= 4 && class182.field1961 <= 18) {
                  class328.method1587(0, 1);
                  break;
               }

               var51 = class52.field757 + 390;
               if (class182.field1964 >= var51 && class182.field1964 <= var51 + 14 && class182.field1961 >= 4 && class182.field1961 <= 18) {
                  class328.method1587(1, 0);
                  break;
               }

               if (class182.field1964 >= var51 + 15 && class182.field1964 <= var51 + 80 && class182.field1961 >= 4 && class182.field1961 <= 18) {
                  class328.method1587(1, 1);
                  break;
               }

               var52 = class52.field757 + 500;
               if (class182.field1964 >= var52 && class182.field1964 <= var52 + 14 && class182.field1961 >= 4 && class182.field1961 <= 18) {
                  class328.method1587(2, 0);
                  break;
               }

               if (class182.field1964 >= var52 + 15 && class182.field1964 <= var52 + 80 && class182.field1961 >= 4 && class182.field1961 <= 18) {
                  class328.method1587(2, 1);
                  break;
               }

               int var54 = class52.field757 + 610;
               if (class182.field1964 >= var54 && class182.field1964 <= var54 + 14 && class182.field1961 >= 4 && class182.field1961 <= 18) {
                  class328.method1587(3, 0);
                  break;
               }

               if (class182.field1964 >= var54 + 15 && class182.field1964 <= var54 + 80 && class182.field1961 >= 4 && class182.field1961 <= 18) {
                  class328.method1587(3, 1);
                  break;
               }

               if (class182.field1964 >= 708 + class52.field757 && class182.field1961 >= 4 && class182.field1964 <= 50 + class52.field757 + 708 && class182.field1961 <= 20) {
                  class52.field781 = false;
                  class335.field3107.method1537(class52.field757, 0);
                  class328.field3060.method1537(class52.field757 + 382, 0);
                  class52.field759.method849(382 + class52.field757 - class52.field759.field1668 / 2, 18);
                  break;
               }

               if (class52.field782 != -1) {
                  class296 var55 = class296.field2834[class52.field782];
                  class447.method2121(var55);
                  class52.field781 = false;
                  class335.field3107.method1537(class52.field757, 0);
                  class328.field3060.method1537(class52.field757 + 382, 0);
                  class52.field759.method849(class52.field757 + 382 - class52.field759.field1668 / 2, 18);
               } else {
                  if (class52.field783 > 0 && null != class56.field807 && class182.field1964 >= 0 && class182.field1964 <= class56.field807.field1668 && class182.field1961 >= class22.field161 / 2 - 50 && class182.field1961 <= 50 + class22.field161 / 2) {
                     --class52.field783;
                  }

                  if (class52.field783 < class52.field784 && class72.field856 != null && class182.field1964 >= class391.field3440 - class72.field856.field1668 - 5 && class182.field1964 <= class391.field3440 && class182.field1961 >= class22.field161 / 2 - 50 && class182.field1961 <= 50 + class22.field161 / 2) {
                     ++class52.field783;
                  }
               }
               break;
            }

            if (var50.field3865 == 13) {
               class52.field781 = false;
               class335.field3107.method1537(class52.field757, 0);
               class328.field3060.method1537(382 + class52.field757, 0);
               class52.field759.method849(class52.field757 + 382 - class52.field759.field1668 / 2, 18);
               break;
            }

            if (var50.field3865 == 96) {
               if (class52.field783 > 0 && class56.field807 != null) {
                  --class52.field783;
               }
            } else if (var50.field3865 == 97 && class52.field783 < class52.field784 && class72.field856 != null) {
               ++class52.field783;
            }
         }

      } else {
         if ((1 == class182.field1963 || !class211.field2375 && 4 == class182.field1963) && class182.field1964 >= 765 + class52.field757 - 50 && class182.field1961 >= 453) {
            class111.field1385.method1338(!class111.field1385.method1328());
            if (!class111.field1385.method1328()) {
               class230 var3 = class417.field3564;
               int var4 = var3.method883("scape main");
               var5 = var3.method886(var4, "");
               class377.method1796(var3, var4, var5, 255, false);
            } else {
               class91.method501();
            }
         }

         if (client.field433 != 5) {
            if (-1L == class52.field773) {
               class52.field773 = class154.method814() + 1000L;
            }

            long var48 = class154.method814();
            if (class399.method1946() && class52.field786 == -1L) {
               class52.field786 = var48;
               if (class52.field786 > class52.field773) {
                  class52.field773 = class52.field786;
               }
            }

            if (client.field433 == 10 || 11 == client.field433) {
               if (class22.field155 == class300.field2886) {
                  if (class182.field1963 == 1 || !class211.field2375 && 4 == class182.field1963) {
                     var5 = class52.field757 + 5;
                     short var6 = 463;
                     byte var7 = 100;
                     byte var8 = 35;
                     if (class182.field1964 >= var5 && class182.field1964 <= var5 + var7 && class182.field1961 >= var6 && class182.field1961 <= var6 + var8) {
                        class35.method180();
                        return;
                     }
                  }

                  if (null != class123.field1450) {
                     class35.method180();
                  }
               }

               var5 = class182.field1963;
               var51 = class182.field1964;
               var52 = class182.field1961;
               if (var5 == 0) {
                  var51 = class182.field1957;
                  var52 = class182.field1952;
               }

               if (!class211.field2375 && var5 == 4) {
                  var5 = 1;
               }

               class463 var53 = client.field664;
               class463 var9 = var53;
               int var57;
               short var58;
               if (class52.field780 == 0) {
                  boolean var87 = false;

                  while(var9.method2276()) {
                     if (84 == var9.field3865) {
                        var87 = true;
                     }
                  }

                  var57 = class432.field3605 - 80;
                  var58 = 291;
                  if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                     class213.method1115(class69.method389("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
                  }

                  var57 = 80 + class432.field3605;
                  if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20 || var87) {
                     if (0 != (client.field512 & 33554432)) {
                        class52.field767 = "";
                        class52.field756 = class96.field1238;
                        class52.field769 = class96.field1256;
                        class52.field789 = class96.field1326;
                        class324.method1569(1);
                        class414.method2004();
                     } else if ((client.field512 & 4) != 0) {
                        if ((client.field512 & 1024) != 0) {
                           class52.field756 = class96.field1027;
                           class52.field769 = class96.field1253;
                           class52.field789 = class96.field1254;
                        } else {
                           class52.field756 = class96.field1246;
                           class52.field769 = class96.field1236;
                           class52.field789 = class96.field1248;
                        }

                        class52.field767 = class96.field1245;
                        class324.method1569(1);
                        class414.method2004();
                     } else if ((client.field512 & 1024) != 0) {
                        class52.field756 = class96.field1249;
                        class52.field769 = class96.field1250;
                        class52.field789 = class96.field1222;
                        class52.field767 = class96.field1245;
                        class324.method1569(1);
                        class414.method2004();
                     } else {
                        class92.method510(false);
                     }
                  }
               } else {
                  int var10;
                  short var11;
                  if (class52.field780 == 1) {
                     while(true) {
                        if (!var9.method2276()) {
                           var10 = class432.field3605 - 80;
                           var11 = 321;
                           if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                              class92.method510(false);
                           }

                           var10 = class432.field3605 + 80;
                           if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                              class324.method1569(0);
                           }
                           break;
                        }

                        if (84 == var9.field3865) {
                           class92.method510(false);
                        } else if (13 == var9.field3865) {
                           class324.method1569(0);
                        }
                     }
                  } else {
                     int var14;
                     short var56;
                     int var67;
                     if (2 == class52.field780) {
                        var56 = 201;
                        var10 = var56 + 52;
                        if (var5 == 1 && var52 >= var10 - 12 && var52 < var10 + 2) {
                           class52.field778 = 0;
                        }

                        var10 += 15;
                        if (var5 == 1 && var52 >= var10 - 12 && var52 < var10 + 2) {
                           class52.field778 = 1;
                        }

                        var10 += 15;
                        var56 = 361;
                        if (class270.field2705 != null) {
                           var57 = class270.field2705.field3178 / 2;
                           if (var5 == 1 && var51 >= class270.field2705.field3177 - var57 && var51 <= var57 + class270.field2705.field3177 && var52 >= var56 - 15 && var52 < var56) {
                              switch(class52.field764) {
                              case 1:
                                 class20.method113(class96.field1294, class96.field1295, class96.field1290);
                                 class324.method1569(5);
                                 return;
                              case 2:
                                 class213.method1115("https://support.runescape.com/hc/en-gb", true, false);
                              }
                           }
                        }

                        var57 = class432.field3605 - 80;
                        var58 = 321;
                        if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                           class52.field776 = class52.field776.trim();
                           if (class52.field776.length() == 0) {
                              class20.method113(class96.field1138, class96.field1107, class96.field1166);
                              return;
                           }

                           if (class52.field772.length() == 0) {
                              class20.method113(class96.field1165, class96.field1100, class96.field1143);
                              return;
                           }

                           class20.method113(class96.field1260, class96.field1115, class96.field1262);
                           class240.method1215(false);
                           class72.method402(20);
                           return;
                        }

                        var57 = 180 + class52.field777 + 80;
                        if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                           class324.method1569(0);
                           class52.field776 = "";
                           class52.field772 = "";
                           class250.field2621 = 0;
                           class492.field4116 = "";
                           class52.field766 = true;
                        }

                        var57 = class432.field3605 + -117;
                        var58 = 277;
                        class52.field775 = var51 >= var57 && var51 < var57 + class293.field2818 && var52 >= var58 && var52 < var58 + class62.field826;
                        if (var5 == 1 && class52.field775) {
                           client.field472 = !client.field472;
                           if (!client.field472 && class111.field1385.method1330() != null) {
                              class111.field1385.method1329((String)null);
                           }
                        }

                        var57 = 24 + class432.field3605;
                        var58 = 277;
                        class52.field790 = var51 >= var57 && var51 < var57 + class293.field2818 && var52 >= var58 && var52 < class62.field826 + var58;
                        if (var5 == 1 && class52.field790) {
                           class111.field1385.method1340(!class111.field1385.method1318());
                           if (!class111.field1385.method1318()) {
                              class52.field776 = "";
                              class111.field1385.method1329((String)null);
                              class414.method2004();
                           }
                        }

                        while(true) {
                           Transferable var78;
                           do {
                              while(true) {
                                 label1521:
                                 do {
                                    while(true) {
                                       while(var9.method2276()) {
                                          if (var9.field3865 != 13) {
                                             if (class52.field778 != 0) {
                                                continue label1521;
                                             }

                                             char var70 = var9.field3852;

                                             for(var14 = 0; var14 < class52.field779.length() && var70 != class52.field779.charAt(var14); ++var14) {
                                                ;
                                             }

                                             if (85 == var9.field3865 && class52.field776.length() > 0) {
                                                class52.field776 = class52.field776.substring(0, class52.field776.length() - 1);
                                             }

                                             if (var9.field3865 == 84 || var9.field3865 == 80) {
                                                class52.field778 = 1;
                                             }

                                             if (class42.method221(var9.field3852) && class52.field776.length() < 320) {
                                                class52.field776 = class52.field776 + var9.field3852;
                                             }
                                          } else {
                                             class324.method1569(0);
                                             class52.field776 = "";
                                             class52.field772 = "";
                                             class250.field2621 = 0;
                                             class492.field4116 = "";
                                             class52.field766 = true;
                                          }
                                       }

                                       return;
                                    }
                                 } while(1 != class52.field778);

                                 if (var9.field3865 == 85 && class52.field772.length() > 0) {
                                    class52.field772 = class52.field772.substring(0, class52.field772.length() - 1);
                                 } else if (84 == var9.field3865 || 80 == var9.field3865) {
                                    class52.field778 = 0;
                                    if (84 == var9.field3865) {
                                       class52.field776 = class52.field776.trim();
                                       if (class52.field776.length() == 0) {
                                          class20.method113(class96.field1138, class96.field1107, class96.field1166);
                                          return;
                                       }

                                       if (class52.field772.length() == 0) {
                                          class20.method113(class96.field1165, class96.field1100, class96.field1143);
                                          return;
                                       }

                                       class20.method113(class96.field1260, class96.field1115, class96.field1262);
                                       class240.method1215(false);
                                       class72.method402(20);
                                       return;
                                    }
                                 }

                                 if ((var9.method2272(82) || var9.method2272(87)) && 67 == var9.field3865) {
                                    Clipboard var73 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    var78 = var73.getContents(class140.field1508);
                                    var67 = 20 - class52.field772.length();
                                    break;
                                 }

                                 if (class82.method441(var9.field3852) && class42.method221(var9.field3852) && class52.field772.length() < 20) {
                                    class52.field772 = class52.field772 + var9.field3852;
                                 }
                              }
                           } while(var67 <= 0);

                           try {
                              String var84 = (String)var78.getTransferData(DataFlavor.stringFlavor);
                              int var91 = Math.min(var67, var84.length());

                              for(int var93 = 0; var93 < var91; ++var93) {
                                 if (!class82.method441(var84.charAt(var93)) || !class42.method221(var84.charAt(var93))) {
                                    class324.method1569(3);
                                    return;
                                 }
                              }

                              class52.field772 = class52.field772 + var84.substring(0, var91);
                           } catch (UnsupportedFlavorException var46) {
                              ;
                           } catch (IOException var47) {
                              ;
                           }
                        }
                     } else if (class52.field780 == 3) {
                        var10 = 180 + class52.field777;
                        var11 = 276;
                        if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                           class313.method1518(false);
                        }

                        var10 = class52.field777 + 180;
                        var11 = 326;
                        if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                           class20.method113(class96.field1294, class96.field1295, class96.field1290);
                           class324.method1569(5);
                           return;
                        }
                     } else {
                        int var13;
                        if (class52.field780 == 4) {
                           var10 = 180 + class52.field777 - 80;
                           var11 = 321;
                           if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                              class492.field4116.trim();
                              if (class492.field4116.length() != 6) {
                                 class20.method113(class96.field1057, class96.field1058, class96.field1059);
                                 return;
                              }

                              class250.field2621 = Integer.parseInt(class492.field4116);
                              class492.field4116 = "";
                              class240.method1215(true);
                              class20.method113(class96.field1260, class96.field1115, class96.field1262);
                              class72.method402(20);
                              return;
                           }

                           if (var5 == 1 && var51 >= 180 + class52.field777 - 9 && var51 <= 130 + class52.field777 + 180 && var52 >= 263 && var52 <= 296) {
                              class52.field766 = !class52.field766;
                           }

                           if (var5 == 1 && var51 >= class52.field777 + 180 - 34 && var51 <= 34 + class52.field777 + 180 && var52 >= 351 && var52 <= 363) {
                              class213.method1115(class69.method389("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                           }

                           var10 = class52.field777 + 180 + 80;
                           if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                              class324.method1569(0);
                              class52.field776 = "";
                              class52.field772 = "";
                              class250.field2621 = 0;
                              class492.field4116 = "";
                           }

                           while(var9.method2276()) {
                              boolean var12 = false;

                              for(var13 = 0; var13 < class52.field787.length(); ++var13) {
                                 if (var9.field3852 == class52.field787.charAt(var13)) {
                                    var12 = true;
                                    break;
                                 }
                              }

                              if (var9.field3865 == 13) {
                                 class324.method1569(0);
                                 class52.field776 = "";
                                 class52.field772 = "";
                                 class250.field2621 = 0;
                                 class492.field4116 = "";
                              } else {
                                 if (85 == var9.field3865 && class492.field4116.length() > 0) {
                                    class492.field4116 = class492.field4116.substring(0, class492.field4116.length() - 1);
                                 }

                                 if (var9.field3865 == 84) {
                                    class492.field4116.trim();
                                    if (class492.field4116.length() != 6) {
                                       class20.method113(class96.field1057, class96.field1058, class96.field1059);
                                       return;
                                    }

                                    class250.field2621 = Integer.parseInt(class492.field4116);
                                    class492.field4116 = "";
                                    class240.method1215(true);
                                    class20.method113(class96.field1260, class96.field1115, class96.field1262);
                                    class72.method402(20);
                                    return;
                                 }

                                 if (var12 && class492.field4116.length() < 6) {
                                    class492.field4116 = class492.field4116 + var9.field3852;
                                 }
                              }
                           }
                        } else {
                           int var22;
                           if (5 == class52.field780) {
                              var10 = class52.field777 + 180 - 80;
                              var11 = 321;
                              class134 var21;
                              int var25;
                              if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                 class52.field776 = class52.field776.trim();
                                 if (class52.field776.length() == 0) {
                                    class20.method113(class96.field1294, class96.field1295, class96.field1290);
                                 } else {
                                    long var63;
                                    try {
                                       URL var65 = new URL(class69.method389("services", false) + "m=accountappeal/login.ws");
                                       URLConnection var16 = var65.openConnection();
                                       var16.setRequestProperty("connection", "close");
                                       var16.setDoInput(true);
                                       var16.setDoOutput(true);
                                       var16.setConnectTimeout(5000);
                                       OutputStreamWriter var71 = new OutputStreamWriter(var16.getOutputStream());
                                       var71.write("data1=req");
                                       var71.flush();
                                       InputStream var77 = var16.getInputStream();
                                       class134 var96 = new class134(new byte[1000]);

                                       while(true) {
                                          int var85 = var77.read(var96.field1489, var96.field1487, 1000 - var96.field1487);
                                          if (var85 == -1) {
                                             var96.field1487 = 0;
                                             long var88 = var96.method720();
                                             var63 = var88;
                                             break;
                                          }

                                          var96.field1487 += var85;
                                          if (var96.field1487 >= 1000) {
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
                                       String var79 = class52.field776;
                                       Random var99 = new Random();
                                       class134 var89 = new class134(128);
                                       var21 = new class134(128);
                                       int[] var101 = new int[]{var99.nextInt(), var99.nextInt(), (int)(var63 >> 32), (int)var63};
                                       var89.method666(10);

                                       int var103;
                                       for(var103 = 0; var103 < 4; ++var103) {
                                          var89.method656(var99.nextInt());
                                       }

                                       var89.method656(var101[0]);
                                       var89.method656(var101[1]);
                                       var89.method658(var63);
                                       var89.method658(0L);

                                       for(var103 = 0; var103 < 4; ++var103) {
                                          var89.method656(var99.nextInt());
                                       }

                                       var89.method685(class214.field2400, class214.field2399);
                                       var21.method666(10);

                                       for(var103 = 0; var103 < 3; ++var103) {
                                          var21.method656(var99.nextInt());
                                       }

                                       var21.method658(var99.nextLong());
                                       var21.method657(var99.nextLong());
                                       if (null != client.field477) {
                                          var21.method662(client.field477, 0, client.field477.length);
                                       } else {
                                          byte[] var105 = new byte[24];

                                          try {
                                             class143.field1548.method2116(0L);
                                             class143.field1548.method2111(var105);

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

                                          var21.method662(var105, 0, var105.length);
                                       }

                                       var21.method658(var99.nextLong());
                                       var21.method685(class214.field2400, class214.field2399);
                                       var103 = class444.method2117(var79);
                                       if (var103 % 8 != 0) {
                                          var103 += 8 - var103 % 8;
                                       }

                                       class134 var106 = new class134(var103);
                                       var106.method660(var79, (byte)72);
                                       var106.field1487 = var103;
                                       var106.method713(var101);
                                       class134 var113 = new class134(var21.field1487 + var89.field1487 + 5 + var106.field1487);
                                       var113.method666(2);
                                       var113.method666(var89.field1487);
                                       var113.method662(var89.field1489, 0, var89.field1487);
                                       var113.method666(var21.field1487);
                                       var113.method662(var21.field1489, 0, var21.field1487);
                                       var113.method655(var106.field1487);
                                       var113.method662(var106.field1489, 0, var106.field1487);
                                       String var110 = class438.method2093(var113.field1489);

                                       byte var75;
                                       try {
                                          URL var112 = new URL(class69.method389("services", false) + "m=accountappeal/login.ws");
                                          URLConnection var115 = var112.openConnection();
                                          var115.setDoInput(true);
                                          var115.setDoOutput(true);
                                          var115.setConnectTimeout(5000);
                                          OutputStreamWriter var116 = new OutputStreamWriter(var115.getOutputStream());
                                          var116.write("data2=" + class301.method1423(var110) + "&dest=" + class301.method1423("passwordchoice.ws"));
                                          var116.flush();
                                          InputStream var117 = var115.getInputStream();
                                          var113 = new class134(new byte[1000]);

                                          while(true) {
                                             int var118 = var117.read(var113.field1489, var113.field1487, 1000 - var113.field1487);
                                             if (var118 == -1) {
                                                var116.close();
                                                var117.close();
                                                String var119 = new String(var113.field1489);
                                                if (var119.startsWith("OFFLINE")) {
                                                   var75 = 4;
                                                } else if (var119.startsWith("WRONG")) {
                                                   var75 = 7;
                                                } else if (var119.startsWith("RELOAD")) {
                                                   var75 = 3;
                                                } else if (var119.startsWith("Not permitted for social network accounts.")) {
                                                   var75 = 6;
                                                } else {
                                                   var113.method684(var101);

                                                   while(var113.field1487 > 0 && 0 == var113.field1489[var113.field1487 - 1]) {
                                                      --var113.field1487;
                                                   }

                                                   var119 = new String(var113.field1489, 0, var113.field1487);
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
                                                      class213.method1115(var119, true, false);
                                                      var75 = 2;
                                                   } else {
                                                      var75 = 5;
                                                   }
                                                }
                                                break;
                                             }

                                             var113.field1487 += var118;
                                             if (var113.field1487 >= 1000) {
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
                                       class20.method113(class96.field1297, class96.field1298, class96.field1034);
                                       class324.method1569(6);
                                       break;
                                    case 3:
                                       class20.method113(class96.field1161, class96.field1301, class96.field1302);
                                       break;
                                    case 4:
                                       class20.method113(class96.field1303, class96.field1304, class96.field1305);
                                       break;
                                    case 5:
                                       class20.method113(class96.field1319, class96.field1307, class96.field1308);
                                       break;
                                    case 6:
                                       class20.method113(class96.field1159, class96.field1310, class96.field1311);
                                       break;
                                    case 7:
                                       class20.method113(class96.field1337, class96.field1313, class96.field1184);
                                    }
                                 }

                                 return;
                              }

                              var10 = 80 + 180 + class52.field777;
                              if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                 class92.method510(true);
                              }

                              var58 = 361;
                              if (null != class248.field2614) {
                                 var13 = class248.field2614.field3178 / 2;
                                 if (var5 == 1 && var51 >= class248.field2614.field3177 - var13 && var51 <= class248.field2614.field3177 + var13 && var52 >= var58 - 15 && var52 < var58) {
                                    class213.method1115(class69.method389("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
                                 }
                              }

                              while(var9.method2276()) {
                                 boolean var60 = false;

                                 for(var14 = 0; var14 < class52.field779.length(); ++var14) {
                                    if (var9.field3852 == class52.field779.charAt(var14)) {
                                       var60 = true;
                                       break;
                                    }
                                 }

                                 if (13 == var9.field3865) {
                                    class92.method510(true);
                                 } else {
                                    if (var9.field3865 == 85 && class52.field776.length() > 0) {
                                       class52.field776 = class52.field776.substring(0, class52.field776.length() - 1);
                                    }

                                    if (84 == var9.field3865) {
                                       class52.field776 = class52.field776.trim();
                                       if (class52.field776.length() == 0) {
                                          class20.method113(class96.field1294, class96.field1295, class96.field1290);
                                       } else {
                                          long var15;
                                          try {
                                             URL var17 = new URL(class69.method389("services", false) + "m=accountappeal/login.ws");
                                             URLConnection var18 = var17.openConnection();
                                             var18.setRequestProperty("connection", "close");
                                             var18.setDoInput(true);
                                             var18.setDoOutput(true);
                                             var18.setConnectTimeout(5000);
                                             OutputStreamWriter var19 = new OutputStreamWriter(var18.getOutputStream());
                                             var19.write("data1=req");
                                             var19.flush();
                                             InputStream var20 = var18.getInputStream();
                                             var21 = new class134(new byte[1000]);

                                             while(true) {
                                                var22 = var20.read(var21.field1489, var21.field1487, 1000 - var21.field1487);
                                                if (var22 == -1) {
                                                   var21.field1487 = 0;
                                                   long var98 = var21.method720();
                                                   var15 = var98;
                                                   break;
                                                }

                                                var21.field1487 += var22;
                                                if (var21.field1487 >= 1000) {
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
                                             String var83 = class52.field776;
                                             Random var90 = new Random();
                                             class134 var100 = new class134(128);
                                             class134 var23 = new class134(128);
                                             int[] var24 = new int[]{var90.nextInt(), var90.nextInt(), (int)(var15 >> 32), (int)var15};
                                             var100.method666(10);

                                             for(var25 = 0; var25 < 4; ++var25) {
                                                var100.method656(var90.nextInt());
                                             }

                                             var100.method656(var24[0]);
                                             var100.method656(var24[1]);
                                             var100.method658(var15);
                                             var100.method658(0L);

                                             for(var25 = 0; var25 < 4; ++var25) {
                                                var100.method656(var90.nextInt());
                                             }

                                             var100.method685(class214.field2400, class214.field2399);
                                             var23.method666(10);

                                             for(var25 = 0; var25 < 3; ++var25) {
                                                var23.method656(var90.nextInt());
                                             }

                                             var23.method658(var90.nextLong());
                                             var23.method657(var90.nextLong());
                                             if (client.field477 != null) {
                                                var23.method662(client.field477, 0, client.field477.length);
                                             } else {
                                                byte[] var26 = new byte[24];

                                                try {
                                                   class143.field1548.method2116(0L);
                                                   class143.field1548.method2111(var26);

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

                                                var23.method662(var26, 0, var26.length);
                                             }

                                             var23.method658(var90.nextLong());
                                             var23.method685(class214.field2400, class214.field2399);
                                             var25 = class444.method2117(var83);
                                             if (0 != var25 % 8) {
                                                var25 += 8 - var25 % 8;
                                             }

                                             class134 var108 = new class134(var25);
                                             var108.method660(var83, (byte)107);
                                             var108.field1487 = var25;
                                             var108.method713(var24);
                                             class134 var111 = new class134(var23.field1487 + 5 + var100.field1487 + var108.field1487);
                                             var111.method666(2);
                                             var111.method666(var100.field1487);
                                             var111.method662(var100.field1489, 0, var100.field1487);
                                             var111.method666(var23.field1487);
                                             var111.method662(var23.field1489, 0, var23.field1487);
                                             var111.method655(var108.field1487);
                                             var111.method662(var108.field1489, 0, var108.field1487);
                                             String var114 = class438.method2093(var111.field1489);

                                             byte var81;
                                             try {
                                                URL var29 = new URL(class69.method389("services", false) + "m=accountappeal/login.ws");
                                                URLConnection var30 = var29.openConnection();
                                                var30.setDoInput(true);
                                                var30.setDoOutput(true);
                                                var30.setConnectTimeout(5000);
                                                OutputStreamWriter var31 = new OutputStreamWriter(var30.getOutputStream());
                                                var31.write("data2=" + class301.method1423(var114) + "&dest=" + class301.method1423("passwordchoice.ws"));
                                                var31.flush();
                                                InputStream var32 = var30.getInputStream();
                                                var111 = new class134(new byte[1000]);

                                                while(true) {
                                                   int var33 = var32.read(var111.field1489, var111.field1487, 1000 - var111.field1487);
                                                   if (var33 == -1) {
                                                      var31.close();
                                                      var32.close();
                                                      String var121 = new String(var111.field1489);
                                                      if (var121.startsWith("OFFLINE")) {
                                                         var81 = 4;
                                                      } else if (var121.startsWith("WRONG")) {
                                                         var81 = 7;
                                                      } else if (var121.startsWith("RELOAD")) {
                                                         var81 = 3;
                                                      } else if (var121.startsWith("Not permitted for social network accounts.")) {
                                                         var81 = 6;
                                                      } else {
                                                         var111.method684(var24);

                                                         while(var111.field1487 > 0 && var111.field1489[var111.field1487 - 1] == 0) {
                                                            --var111.field1487;
                                                         }

                                                         var121 = new String(var111.field1489, 0, var111.field1487);
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
                                                            class213.method1115(var121, true, false);
                                                            var81 = 2;
                                                         } else {
                                                            var81 = 5;
                                                         }
                                                      }
                                                      break;
                                                   }

                                                   var111.field1487 += var33;
                                                   if (var111.field1487 >= 1000) {
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
                                             class20.method113(class96.field1297, class96.field1298, class96.field1034);
                                             class324.method1569(6);
                                             break;
                                          case 3:
                                             class20.method113(class96.field1161, class96.field1301, class96.field1302);
                                             break;
                                          case 4:
                                             class20.method113(class96.field1303, class96.field1304, class96.field1305);
                                             break;
                                          case 5:
                                             class20.method113(class96.field1319, class96.field1307, class96.field1308);
                                             break;
                                          case 6:
                                             class20.method113(class96.field1159, class96.field1310, class96.field1311);
                                             break;
                                          case 7:
                                             class20.method113(class96.field1337, class96.field1313, class96.field1184);
                                          }
                                       }

                                       return;
                                    }

                                    if (var60 && class52.field776.length() < 320) {
                                       class52.field776 = class52.field776 + var9.field3852;
                                    }
                                 }
                              }
                           } else if (6 != class52.field780) {
                              if (7 == class52.field780) {
                                 if (class89.field978 && !client.field665) {
                                    var10 = class432.field3605 - 150;
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

                                       class52.field774 = var14;
                                    }

                                    var14 = 180 + class52.field777 - 80;
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
                                             var94 = class52.field755;
                                             var22 = 0;

                                             while(true) {
                                                if (var22 < var94.length) {
                                                   var107 = var94[var22];
                                                   if (var107 != null) {
                                                      var92.append(var107);
                                                      ++var22;
                                                      continue;
                                                   }

                                                   class47.method254("Date not valid.", "Please ensure all characters are populated.", "");
                                                   var80 = null;
                                                } else {
                                                   var92.append("12");
                                                   var80 = var102.parse(var92.toString());
                                                }

                                                var86 = var80;
                                                break;
                                             }
                                          } catch (ParseException var45) {
                                             class47.method254("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
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
                                             var97 = class343.method1656(var86);
                                             if (!var97) {
                                                class47.method254("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                var69 = false;
                                             } else {
                                                if (!var82) {
                                                   class377.field3309 = 8388607;
                                                } else {
                                                   class377.field3309 = (int)(var86.getTime() / 86400000L - 11745L);
                                                }

                                                var69 = true;
                                             }
                                          }
                                       }

                                       if (var69) {
                                          class72.method402(50);
                                          return;
                                       }
                                    }

                                    var14 = 80 + 180 + class52.field777;
                                    if (var5 == 1 && var51 >= var14 - 75 && var51 <= var14 + 75 && var52 >= var74 - 20 && var52 <= var74 + 20) {
                                       class52.field755 = new String[8];
                                       class92.method510(true);
                                    }

                                    while(var9.method2276()) {
                                       if (var9.field3865 == 101) {
                                          class52.field755[class52.field774] = null;
                                       }

                                       if (85 == var9.field3865) {
                                          if (null == class52.field755[class52.field774] && class52.field774 > 0) {
                                             --class52.field774;
                                          }

                                          class52.field755[class52.field774] = null;
                                       }

                                       if (var9.field3852 >= '0' && var9.field3852 <= '9') {
                                          class52.field755[class52.field774] = "" + var9.field3852;
                                          if (class52.field774 < 7) {
                                             ++class52.field774;
                                          }
                                       }

                                       if (var9.field3865 == 84) {
                                          label1321: {
                                             try {
                                                var102 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
                                                var102.setLenient(false);
                                                var92 = new StringBuilder();
                                                var94 = class52.field755;
                                                var22 = 0;

                                                while(true) {
                                                   if (var22 < var94.length) {
                                                      var107 = var94[var22];
                                                      if (var107 != null) {
                                                         var92.append(var107);
                                                         ++var22;
                                                         continue;
                                                      }

                                                      class47.method254("Date not valid.", "Please ensure all characters are populated.", "");
                                                      var80 = null;
                                                   } else {
                                                      var92.append("12");
                                                      var80 = var102.parse(var92.toString());
                                                   }

                                                   var86 = var80;
                                                   break;
                                                }
                                             } catch (ParseException var44) {
                                                class47.method254("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
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
                                                var97 = class343.method1656(var86);
                                                if (!var97) {
                                                   class47.method254("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
                                                   var69 = false;
                                                } else {
                                                   if (!var82) {
                                                      class377.field3309 = 8388607;
                                                   } else {
                                                      class377.field3309 = (int)(var86.getTime() / 86400000L - 11745L);
                                                   }

                                                   var69 = true;
                                                }
                                             }
                                          }

                                          if (var69) {
                                             class72.method402(50);
                                          }

                                          return;
                                       }
                                    }
                                 } else {
                                    var10 = 180 + class52.field777 - 80;
                                    var11 = 321;
                                    if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                       class213.method1115(class69.method389("secure", true) + "m=dob/set_dob.ws", true, false);
                                       class20.method113(class96.field1291, class96.field1292, class96.field1293);
                                       class324.method1569(6);
                                       return;
                                    }

                                    var10 = 180 + class52.field777 + 80;
                                    if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                       class92.method510(true);
                                    }
                                 }
                              } else if (class52.field780 == 8) {
                                 var10 = class52.field777 + 180 - 80;
                                 var11 = 321;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class213.method1115("https://www.jagex.com/terms/privacy", true, false);
                                    class20.method113(class96.field1291, class96.field1292, class96.field1293);
                                    class324.method1569(6);
                                    return;
                                 }

                                 var10 = class52.field777 + 180 + 80;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class92.method510(true);
                                 }
                              } else if (9 == class52.field780) {
                                 var10 = class52.field777 + 180;
                                 var11 = 311;
                                 if (var53.field3865 == 84 || 13 == var53.field3865 || var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class313.method1518(false);
                                 }
                              } else if (class52.field780 == 10) {
                                 var10 = class52.field777 + 180;
                                 var11 = 209;
                                 if (84 == var53.field3865 || var5 == 1 && var51 >= var10 - 109 && var51 <= var10 + 109 && var52 >= var11 && var52 <= var11 + 68) {
                                    class20.method113(class96.field1260, class96.field1115, class96.field1262);
                                    client.field557 = class160.field1654;
                                    class240.method1215(false);
                                    class72.method402(20);
                                 }
                              } else if (12 == class52.field780) {
                                 var10 = class432.field3605;
                                 var11 = 233;
                                 class349 var61 = var1.method523(0, 30, class96.field1048, var10, var11);
                                 class349 var68 = var1.method523(32, 32, class96.field1048, var10, var11);
                                 class349 var72 = var1.method523(70, 34, class96.field1048, var10, var11);
                                 var57 = var11 + 17;
                                 class349 var76 = var1.method523(0, 34, class96.field1324, var10, var57);
                                 if (var5 == 1) {
                                    if (var61.method1677(var51, var52)) {
                                       class213.method1115("https://www.jagex.com/terms", true, false);
                                    } else if (var68.method1677(var51, var52)) {
                                       class213.method1115("https://www.jagex.com/terms/privacy", true, false);
                                    } else if (var72.method1677(var51, var52) || var76.method1677(var51, var52)) {
                                       class213.method1115("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
                                    }
                                 }

                                 var10 = class432.field3605 - 80;
                                 var11 = 311;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class226.method1146();
                                    class313.method1518(true);
                                 }

                                 var10 = class432.field3605 + 80;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class52.field780 = 13;
                                 }
                              } else if (13 == class52.field780) {
                                 var10 = class432.field3605;
                                 var11 = 321;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class313.method1518(true);
                                 }
                              } else if (class52.field780 == 14) {
                                 String var64 = "";
                                 switch(class52.field760) {
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
                                    class92.method510(false);
                                 }

                                 var57 = 180 + class52.field777;
                                 var58 = 276;
                                 if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                                    class213.method1115(var64, true, false);
                                    class20.method113(class96.field1291, class96.field1292, class96.field1293);
                                    class324.method1569(6);
                                    return;
                                 }

                                 var57 = class52.field777 + 180;
                                 var58 = 326;
                                 if (var5 == 1 && var51 >= var57 - 75 && var51 <= var57 + 75 && var52 >= var58 - 20 && var52 <= var58 + 20) {
                                    class92.method510(false);
                                 }
                              } else if (class52.field780 == 24) {
                                 var10 = class52.field777 + 180;
                                 var11 = 301;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class313.method1518(false);
                                 }
                              } else if (class52.field780 == 26) {
                                 var10 = class52.field777 + 180 - 80;
                                 var11 = 321;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class213.method1115(class69.method389("secure", true) + "m=dob/set_dob.ws", true, false);
                                    class20.method113(class96.field1291, class96.field1292, class96.field1293);
                                    class324.method1569(6);
                                    return;
                                 }

                                 var10 = class52.field777 + 180 + 80;
                                 if (var5 == 1 && var51 >= var10 - 75 && var51 <= var10 + 75 && var52 >= var11 - 20 && var52 <= var11 + 20) {
                                    class92.method510(true);
                                 }
                              }
                           } else {
                              while(true) {
                                 do {
                                    if (!var9.method2276()) {
                                       var56 = 321;
                                       if (var5 == 1 && var52 >= var56 - 20 && var52 <= var56 + 20) {
                                          class92.method510(true);
                                       }

                                       return;
                                    }
                                 } while(84 != var9.field3865 && var9.field3865 != 13);

                                 class92.method510(true);
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
