import java.applet.Applet;

public class class363 {
   public static Applet field3248 = null;
   public static String field3249 = "";
   static class161[] field3250;
   static int field3251;

   public static long method1754(CharSequence var0) {
      long var2 = 0L;
      int var4 = var0.length();

      for(int var5 = 0; var5 < var4; ++var5) {
         var2 *= 37L;
         char var6 = var0.charAt(var5);
         if (var6 >= 'A' && var6 <= 'Z') {
            var2 += (long)(var6 + 1 - 65);
         } else if (var6 >= 'a' && var6 <= 'z') {
            var2 += (long)(var6 + 1 - 97);
         } else if (var6 >= '0' && var6 <= '9') {
            var2 += (long)(var6 + 27 - 48);
         }

         if (var2 >= 177917621779460413L) {
            break;
         }
      }

      while(var2 % 37L == 0L && 0L != var2) {
         var2 /= 37L;
      }

      return var2;
   }

   public static void method1757(int var0) {
      if (class126.field1458 != 0) {
         class219.field2420 = var0;
      } else {
         class158.field1647.method2348(var0);
      }

   }

   static void method1753() {
      class233.field2522 = new class95(32);
   }

   static int method1756(int var0, class472 var1, boolean var2) {
      boolean var4 = true;
      class210 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var5 = class274.method1301(class150.field1580[--class188.field1989]);
         var4 = false;
      } else {
         var5 = var2 ? class142.field1544 : class425.field3580;
      }

      int var10;
      if (var0 == 1300) {
         var10 = class150.field1580[--class188.field1989] - 1;
         if (var10 >= 0 && var10 <= 9) {
            var5.method1075(var10, class150.field1581[--class150.field1582]);
            return 1;
         } else {
            --class150.field1582;
            return 1;
         }
      } else {
         int var11;
         if (var0 == 1301) {
            class188.field1989 -= 2;
            var10 = class150.field1580[class188.field1989];
            var11 = class150.field1580[1 + class188.field1989];
            var5.field2301 = class34.method169(var10, var11);
            return 1;
         } else if (var0 == 1302) {
            var5.field2304 = class150.field1580[--class188.field1989] == 1;
            return 1;
         } else if (var0 == 1303) {
            var5.field2302 = class150.field1580[--class188.field1989];
            return 1;
         } else if (var0 == 1304) {
            var5.field2255 = class150.field1580[--class188.field1989];
            return 1;
         } else if (var0 == 1305) {
            var5.field2216 = class150.field1581[--class150.field1582];
            return 1;
         } else if (var0 == 1306) {
            var5.field2305 = class150.field1581[--class150.field1582];
            return 1;
         } else if (var0 == 1307) {
            var5.field2300 = null;
            return 1;
         } else if (var0 == 1308) {
            var5.field2365 = class150.field1580[--class188.field1989] == 1;
            return 1;
         } else if (var0 == 1309) {
            --class188.field1989;
            return 1;
         } else {
            byte[] var7;
            int var8;
            if (var0 != 1350) {
               byte var9;
               if (var0 == 1351) {
                  class188.field1989 -= 2;
                  var9 = 10;
                  var7 = new byte[]{(byte)class150.field1580[class188.field1989]};
                  byte[] var12 = new byte[]{(byte)class150.field1580[class188.field1989 + 1]};
                  class304.method1436(var5, var9, var7, var12);
                  return 1;
               } else if (var0 == 1352) {
                  class188.field1989 -= 3;
                  var10 = class150.field1580[class188.field1989] - 1;
                  var11 = class150.field1580[1 + class188.field1989];
                  var8 = class150.field1580[class188.field1989 + 2];
                  if (var10 >= 0 && var10 <= 9) {
                     class328.method1588(var5, var10, var11, var8);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1353) {
                  var9 = 10;
                  var11 = class150.field1580[--class188.field1989];
                  var8 = class150.field1580[--class188.field1989];
                  class328.method1588(var5, var9, var11, var8);
                  return 1;
               } else if (var0 == 1354) {
                  --class188.field1989;
                  var10 = class150.field1580[class188.field1989] - 1;
                  if (var10 >= 0 && var10 <= 9) {
                     class104.method562(var5, var10);
                     return 1;
                  } else {
                     throw new RuntimeException();
                  }
               } else if (var0 == 1355) {
                  var9 = 10;
                  class104.method562(var5, var9);
                  return 1;
               } else {
                  return 2;
               }
            } else {
               byte[] var6 = null;
               var7 = null;
               if (var4) {
                  class188.field1989 -= 10;

                  for(var8 = 0; var8 < 10 && class150.field1580[class188.field1989 + var8] >= 0; var8 += 2) {
                     ;
                  }

                  if (var8 > 0) {
                     var6 = new byte[var8 / 2];
                     var7 = new byte[var8 / 2];

                     for(var8 -= 2; var8 >= 0; var8 -= 2) {
                        var6[var8 / 2] = (byte)class150.field1580[class188.field1989 + var8];
                        var7[var8 / 2] = (byte)class150.field1580[1 + class188.field1989 + var8];
                     }
                  }
               } else {
                  class188.field1989 -= 2;
                  var6 = new byte[]{(byte)class150.field1580[class188.field1989]};
                  var7 = new byte[]{(byte)class150.field1580[class188.field1989 + 1]};
               }

               var8 = class150.field1580[--class188.field1989] - 1;
               if (var8 >= 0 && var8 <= 9) {
                  class304.method1436(var5, var8, var6, var7);
                  return 1;
               } else {
                  throw new RuntimeException();
               }
            }
         }
      }
   }

   static void method1758(int var0) {
      int var2 = class378.method1802();
      if (var0 == -3) {
         class20.method113(class96.field1063, class96.field1251, class96.field1065);
      } else if (var0 == -2) {
         class20.method113(class96.field1066, class96.field1026, class96.field1053);
      } else if (var0 == -1) {
         class20.method113(class96.field1069, class96.field1070, class96.field1071);
      } else if (var0 == 3) {
         class324.method1569(3);
         class52.field764 = 1;
      } else if (var0 == 4) {
         class412.method2000(0);
      } else if (var0 == 5) {
         class52.field764 = 2;
         class20.method113(class96.field1075, class96.field1188, class96.field1077);
      } else if (var0 == 68 || !client.field665 && var0 == 6) {
         class20.method113(class96.field1078, class96.field1079, class96.field1080);
      } else if (var0 == 7) {
         class20.method113(class96.field1081, class96.field1043, class96.field1083);
      } else if (var0 == 8) {
         class20.method113(class96.field1084, class96.field1085, class96.field1086);
      } else if (var0 == 9) {
         class20.method113(class96.field1087, class96.field1088, class96.field1089);
      } else if (var0 == 10) {
         class20.method113(class96.field1090, class96.field1091, class96.field1092);
      } else if (var0 == 11) {
         class20.method113(class96.field1093, class96.field1094, class96.field1095);
      } else if (var0 == 12) {
         class20.method113(class96.field1096, class96.field1097, class96.field1098);
      } else if (var0 == 13) {
         class20.method113(class96.field1099, class96.field1212, class96.field1178);
      } else if (var0 == 14) {
         class20.method113(class96.field1323, class96.field1103, class96.field1129);
      } else if (var0 == 16) {
         class20.method113(class96.field1175, class96.field1106, class96.field1300);
      } else if (var0 == 17) {
         class20.method113(class96.field1316, class96.field1109, class96.field1242);
      } else if (var0 == 18) {
         class412.method2000(1);
      } else if (var0 == 19) {
         class20.method113(class96.field1114, class96.field1164, class96.field1116);
      } else if (var0 == 20) {
         class20.method113(class96.field1117, class96.field1220, class96.field1162);
      } else if (var0 == 22) {
         class20.method113(class96.field1068, class96.field1121, class96.field1122);
      } else if (var0 == 23) {
         class20.method113(class96.field1210, class96.field1124, class96.field1125);
      } else if (var0 == 24) {
         class20.method113(class96.field1119, class96.field1127, class96.field1128);
      } else if (var0 == 25) {
         class20.method113(class96.field1182, class96.field1207, class96.field1229);
      } else if (var0 == 26) {
         class20.method113(class96.field1132, class96.field1133, class96.field1134);
      } else if (var0 == 27) {
         class20.method113(class96.field1135, class96.field1136, class96.field1137);
      } else if (var0 == 31) {
         class20.method113(class96.field1056, class96.field1257, class96.field1247);
      } else if (var0 == 32) {
         class412.method2000(2);
      } else if (var0 == 37) {
         class20.method113(class96.field1314, class96.field1120, class96.field1152);
      } else if (var0 == 38) {
         class20.method113(class96.field1153, class96.field1110, class96.field1155);
      } else if (var0 == 55) {
         class324.method1569(8);
      } else {
         if (var0 == 56) {
            class20.method113(class96.field1167, class96.field1237, class96.field1321);
            class72.method402(11);
            return;
         }

         if (var0 == 57) {
            class20.method113(class96.field1163, class96.field1031, class96.field1126);
            class72.method402(11);
            return;
         }

         if (var0 == 61) {
            class20.method113("", "Please enter your date of birth (DD/MM/YYYY)", "");
            class324.method1569(7);
         } else {
            if (var0 == 62) {
               class72.method402(10);
               class324.method1569(9);
               class20.method113(class96.field1309, class96.field1037, class96.field1168);
               return;
            }

            if (var0 == 63) {
               class72.method402(10);
               class324.method1569(9);
               class20.method113(class96.field1169, class96.field1275, class96.field1171);
               return;
            }

            if (var0 == 65 || var0 == 67) {
               class72.method402(10);
               class324.method1569(9);
               class20.method113(class96.field1172, class96.field1173, class96.field1174);
               return;
            }

            if (var0 == 71) {
               class72.method402(10);
               class324.method1569(7);
               class20.method113("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
            } else if (var0 == 73) {
               class72.method402(10);
               class324.method1569(6);
               class20.method113(class96.field1104, class96.field1320, class96.field1331);
            } else if (var0 == 72) {
               class72.method402(10);
               class324.method1569(26);
            } else {
               class20.method113(class96.field1199, class96.field1176, class96.field1146);
            }
         }
      }

      class72.method402(10);
      boolean var3 = var2 != class378.method1802();
      if (!var3 && client.field557.method848()) {
         class324.method1569(9);
      }

   }

   static void method1755(int var0, int var1, int var2, int var3) {
      class210 var5 = class34.method169(var0, var1);
      if (null != var5 && null != var5.field2306) {
         class169 var6 = new class169();
         var6.field1848 = var5;
         var6.field1850 = var5.field2306;
         class194.method1001(var6);
      }

      client.field594 = var3;
      client.field592 = true;
      class307.field2899 = var0;
      client.field593 = var1;
      class269.field2703 = var2;
      class214.method1117(var5);
   }
}
