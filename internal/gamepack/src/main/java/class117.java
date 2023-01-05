import java.awt.datatransfer.Clipboard;

public class class117 implements class310 {
   boolean field874 = false;
   boolean field876 = false;
   class120 field875 = null;

   public void method454(class120 var1) {
      this.method456();
      if (var1 != null) {
         this.field875 = var1;
         class16 var3 = var1.method496();
         if (null != var3) {
            var3.field78.method1118(true);
            if (var3.field79 != null) {
               class488 var4 = new class488();
               var4.method2396(var1);
               var4.method2394(var3.field79);
               class271.method1278().method642(var4);
            }
         }
      }

   }

   public class120 method455() {
      return this.field875;
   }

   public void method456() {
      if (null != this.field875) {
         class16 var2 = this.field875.method496();
         class120 var3 = this.field875;
         this.field875 = null;
         if (var2 != null) {
            var2.field78.method1118(false);
            if (null != var2.field79) {
               class488 var4 = new class488();
               var4.method2396(var3);
               var4.method2394(var2.field79);
               class271.method1278().method642(var4);
            }

         }
      }
   }

   public boolean method1501(int var1) {
      if (null == this.field875) {
         return false;
      } else {
         class109 var3 = this.field875.method498();
         if (var3 == null) {
            return false;
         } else {
            if (var3.method432(var1)) {
               switch(var1) {
               case 81:
                  this.field876 = true;
                  break;
               case 82:
                  this.field874 = true;
                  break;
               default:
                  if (this.method459(var1)) {
                     class184.method836(this.field875);
                  }
               }
            }

            return var3.method437(var1);
         }
      }
   }

   public boolean method1502(int var1) {
      switch(var1) {
      case 81:
         this.field876 = false;
         return false;
      case 82:
         this.field874 = false;
         return false;
      default:
         return false;
      }
   }

   public boolean method1499(char var1) {
      if (this.field875 == null) {
         return false;
      } else if (!class156.method720(var1)) {
         return false;
      } else {
         class262 var3 = this.field875.method485();
         if (var3 != null && var3.method1189()) {
            class109 var4 = this.field875.method498();
            if (var4 == null) {
               return false;
            } else {
               if (var4.method436(var1) && var3.method1132(var1)) {
                  class184.method836(this.field875);
               }

               return var4.method430(var1);
            }
         } else {
            return false;
         }
      }
   }

   public boolean method1500(boolean var1) {
      return false;
   }

   boolean method459(int var1) {
      if (null == this.field875) {
         return false;
      } else {
         class262 var3 = this.field875.method485();
         if (var3 != null && var3.method1189()) {
            Clipboard var6;
            switch(var1) {
            case 13:
               this.method456();
               return true;
            case 48:
               if (this.field874) {
                  var3.method1193();
               }

               return true;
            case 65:
               if (this.field874) {
                  var6 = class309.field2461.method927();
                  var3.method1153(var6);
               }

               return true;
            case 66:
               if (this.field874) {
                  var6 = class309.field2461.method927();
                  var3.method1184(var6);
               }

               return true;
            case 67:
               if (this.field874) {
                  var6 = class309.field2461.method927();
                  var3.method1154(var6);
               }

               return true;
            case 84:
               if (var3.method1168() == 0) {
                  var3.method1132(10);
               } else if (this.field876 && var3.method1170()) {
                  var3.method1132(10);
               } else {
                  class16 var4 = this.field875.method496();
                  class488 var5 = new class488();
                  var5.method2396(this.field875);
                  var5.method2394(var4.field77);
                  class271.method1278().method642(var5);
                  this.method456();
               }

               return true;
            case 85:
               if (this.field874) {
                  var3.method1135();
               } else {
                  var3.method1133();
               }

               return true;
            case 96:
               if (this.field874) {
                  var3.method1145(this.field876);
               } else {
                  var3.method1143(this.field876);
               }

               return true;
            case 97:
               if (this.field874) {
                  var3.method1138(this.field876);
               } else {
                  var3.method1144(this.field876);
               }

               return true;
            case 98:
               if (this.field874) {
                  var3.method1155();
               } else {
                  var3.method1182(this.field876);
               }

               return true;
            case 99:
               if (this.field874) {
                  var3.method1178();
               } else {
                  var3.method1162(this.field876);
               }

               return true;
            case 101:
               if (this.field874) {
                  var3.method1136();
               } else {
                  var3.method1134();
               }

               return true;
            case 102:
               if (this.field874) {
                  var3.method1141(this.field876);
               } else {
                  var3.method1195(this.field876);
               }

               return true;
            case 103:
               if (this.field874) {
                  var3.method1142(this.field876);
               } else {
                  var3.method1140(this.field876);
               }

               return true;
            case 104:
               if (this.field874) {
                  var3.method1149(this.field876);
               } else {
                  var3.method1147(this.field876);
               }

               return true;
            case 105:
               if (this.field874) {
                  var3.method1150(this.field876);
               } else {
                  var3.method1148(this.field876);
               }

               return true;
            default:
               return false;
            }
         } else {
            return false;
         }
      }
   }

   static void method463(class58 var0, class58 var1, class58 var2) {
      class359.field3052 = (class427.field3529 - 765) / 2;
      class359.field3072 = 202 + class359.field3052;
      class140.field1136 = class359.field3072 + 180;
      byte var4;
      int var5;
      int var9;
      int var11;
      int var25;
      int var28;
      int var30;
      if (class359.field3076) {
         int var37;
         class38 var40;
         if (null == class290.field2370) {
            var40 = class446.field3678;
            var28 = var40.method1356("sl_back");
            var37 = var40.method1359(var28, "");
            class266[] var45 = class242.method1064(var40, var28, var37);
            class290.field2370 = var45;
         }

         class344[] var46;
         if (class161.field1229 == null) {
            var40 = class446.field3678;
            var28 = var40.method1356("sl_flags");
            var37 = var40.method1359(var28, "");
            var46 = class400.method1972(var40, var28, var37);
            class161.field1229 = var46;
         }

         if (null == class340.field2721) {
            var40 = class446.field3678;
            var28 = var40.method1356("sl_arrows");
            var37 = var40.method1359(var28, "");
            var46 = class400.method1972(var40, var28, var37);
            class340.field2721 = var46;
         }

         if (null == class247.field2058) {
            var40 = class446.field3678;
            var28 = var40.method1356("sl_stars");
            var37 = var40.method1359(var28, "");
            var46 = class400.method1972(var40, var28, var37);
            class247.field2058 = var46;
         }

         if (null == class48.field566) {
            class48.field566 = class208.method906(class446.field3678, "leftarrow", "");
         }

         if (class261.field2115 == null) {
            class261.field2115 = class208.method906(class446.field3678, "rightarrow", "");
         }

         class162.method749(class359.field3052, 23, 765, 480, 0);
         class162.method750(class359.field3052, 0, 125, 23, 12425273, 9135624);
         class162.method750(125 + class359.field3052, 0, 640, 23, 5197647, 2697513);
         var0.method2027(class177.field1635, class359.field3052 + 62, 15, 0, -1);
         if (class247.field2058 != null) {
            class247.field2058[1].method1745(class359.field3052 + 140, 1);
            var1.method2025(class177.field1557, class359.field3052 + 152, 10, 16777215, -1);
            class247.field2058[0].method1745(140 + class359.field3052, 12);
            var1.method2025(class177.field1637, 152 + class359.field3052, 21, 16777215, -1);
         }

         if (class340.field2721 != null) {
            var25 = class359.field3052 + 280;
            if (class2.field14[0] == 0 && 0 == class2.field15[0]) {
               class340.field2721[2].method1745(var25, 4);
            } else {
               class340.field2721[0].method1745(var25, 4);
            }

            if (class2.field14[0] == 0 && 1 == class2.field15[0]) {
               class340.field2721[3].method1745(var25 + 15, 4);
            } else {
               class340.field2721[1].method1745(var25 + 15, 4);
            }

            var0.method2025(class177.field1372, var25 + 32, 17, 16777215, -1);
            var5 = 390 + class359.field3052;
            if (class2.field14[0] == 1 && class2.field15[0] == 0) {
               class340.field2721[2].method1745(var5, 4);
            } else {
               class340.field2721[0].method1745(var5, 4);
            }

            if (1 == class2.field14[0] && class2.field15[0] == 1) {
               class340.field2721[3].method1745(var5 + 15, 4);
            } else {
               class340.field2721[1].method1745(var5 + 15, 4);
            }

            var0.method2025(class177.field1352, var5 + 32, 17, 16777215, -1);
            var28 = 500 + class359.field3052;
            if (2 == class2.field14[0] && class2.field15[0] == 0) {
               class340.field2721[2].method1745(var28, 4);
            } else {
               class340.field2721[0].method1745(var28, 4);
            }

            if (class2.field14[0] == 2 && class2.field15[0] == 1) {
               class340.field2721[3].method1745(var28 + 15, 4);
            } else {
               class340.field2721[1].method1745(var28 + 15, 4);
            }

            var0.method2025(class177.field1640, var28 + 32, 17, 16777215, -1);
            var37 = class359.field3052 + 610;
            if (class2.field14[0] == 3 && 0 == class2.field15[0]) {
               class340.field2721[2].method1745(var37, 4);
            } else {
               class340.field2721[0].method1745(var37, 4);
            }

            if (3 == class2.field14[0] && class2.field15[0] == 1) {
               class340.field2721[3].method1745(var37 + 15, 4);
            } else {
               class340.field2721[1].method1745(var37 + 15, 4);
            }

            var0.method2025(class177.field1641, var37 + 32, 17, 16777215, -1);
         }

         class162.method749(class359.field3052 + 708, 4, 50, 16, 0);
         var1.method2027(class177.field1406, 25 + class359.field3052 + 708, 16, 16777215, -1);
         class359.field3077 = -1;
         if (class290.field2370 != null) {
            var4 = 88;
            byte var41 = 19;
            var28 = 765 / (var4 + 1) - 1;
            var37 = 480 / (var41 + 1);

            do {
               var30 = var37;
               var9 = var28;
               if (var37 * (var28 - 1) >= class2.field11) {
                  --var28;
               }

               if (var28 * (var37 - 1) >= class2.field11) {
                  --var37;
               }

               if ((var37 - 1) * var28 >= class2.field11) {
                  --var37;
               }
            } while(var37 != var30 || var28 != var9);

            var30 = (765 - var28 * var4) / (var28 + 1);
            if (var30 > 5) {
               var30 = 5;
            }

            var9 = (480 - var41 * var37) / (var37 + 1);
            if (var9 > 5) {
               var9 = 5;
            }

            int var34 = (765 - var28 * var4 - var30 * (var28 - 1)) / 2;
            var11 = (480 - var41 * var37 - (var37 - 1) * var9) / 2;
            int var36 = (var37 + class2.field11 - 1) / var37;
            class359.field3079 = var36 - var28;
            if (class48.field566 != null && class359.field3078 > 0) {
               class48.field566.method1745(8, class476.field4003 / 2 - class48.field566.field2755 / 2);
            }

            if (null != class261.field2115 && class359.field3078 < class359.field3079) {
               class261.field2115.method1745(class427.field3529 - class261.field2115.field2758 - 8, class476.field4003 / 2 - class261.field2115.field2755 / 2);
            }

            int var13 = var11 + 23;
            int var14 = class359.field3052 + var34;
            int var15 = 0;
            boolean var16 = false;
            int var17 = class359.field3078;

            int var18;
            for(var18 = var17 * var37; var18 < class2.field11 && var17 - class359.field3078 < var28; ++var18) {
               class2 var19 = class2.field12[var18];
               boolean var20 = true;
               String var21 = Integer.toString(var19.field17);
               if (-1 == var19.field17) {
                  var21 = class177.field1344;
                  var20 = false;
               } else if (var19.field17 > 1980) {
                  var21 = class177.field1643;
                  var20 = false;
               }

               int var22 = -1;
               int var23 = 0;
               if (var19.method6()) {
                  if (var19.method3()) {
                     var22 = class252.field2075.field2082;
                  } else {
                     var22 = class252.field2074.field2082;
                  }
               } else if (var19.method9()) {
                  var23 = 16711680;
                  if (var19.method3()) {
                     var22 = class252.field2073.field2082;
                  } else {
                     var22 = class252.field2076.field2082;
                  }
               } else if (var19.method13()) {
                  if (var19.method3()) {
                     var22 = class252.field2077.field2082;
                  } else {
                     var22 = class252.field2080.field2082;
                  }
               } else if (var19.method4()) {
                  if (var19.method3()) {
                     var22 = class252.field2071.field2082;
                  } else {
                     var22 = class252.field2070.field2082;
                  }
               } else if (var19.method12()) {
                  if (var19.method3()) {
                     var22 = class252.field2072.field2082;
                  } else {
                     var22 = class252.field2079.field2082;
                  }
               } else if (var19.method7()) {
                  if (var19.method3()) {
                     var22 = class252.field2081.field2082;
                  } else {
                     var22 = class252.field2078.field2082;
                  }
               }

               if (var22 == -1 || var22 >= class290.field2370.length) {
                  if (var19.method3()) {
                     var22 = class252.field2069.field2082;
                  } else {
                     var22 = class252.field2085.field2082;
                  }
               }

               if (class466.field3863 >= var14 && class466.field3858 >= var13 && class466.field3863 < var14 + var4 && class466.field3858 < var41 + var13 && var20) {
                  class359.field3077 = var18;
                  class290.field2370[var22].method1221(var14, var13, 128, 16777215);
                  var16 = true;
               } else {
                  class290.field2370[var22].method1229(var14, var13);
               }

               if (class161.field1229 != null) {
                  class161.field1229[(var19.method3() ? 8 : 0) + var19.field19].method1745(var14 + 29, var13);
               }

               var0.method2027(Integer.toString(var19.field10), var14 + 15, 5 + var13 + var41 / 2, var23, -1);
               var1.method2027(var21, var14 + 60, var41 / 2 + var13 + 5, 268435455, -1);
               var13 += var9 + var41;
               ++var15;
               if (var15 >= var37) {
                  var13 = var11 + 23;
                  var14 += var30 + var4;
                  var15 = 0;
                  ++var17;
               }
            }

            if (var16) {
               var18 = var1.method2045(class2.field12[class359.field3077].field13) + 6;
               int var42 = var1.field3442 + 8;
               int var43 = 25 + class466.field3858;
               if (var42 + var43 > 480) {
                  var43 = class466.field3858 - 25 - var42;
               }

               class162.method749(class466.field3863 - var18 / 2, var43, var18, var42, 16777120);
               class162.method741(class466.field3863 - var18 / 2, var43, var18, var42, 0);
               var1.method2027(class2.field12[class359.field3077].field13, class466.field3863, var1.field3442 + var43 + 4, 0, -1);
            }
         }

         class39.field199.method263(0, 0);
      } else {
         class287.field2366.method1229(class359.field3052, 0);
         class374.field3173.method1229(class359.field3052 + 382, 0);
         class359.field3054.method1745(class359.field3052 + 382 - class359.field3054.field2758 / 2, 18);
         if (client.field229 == 0 || 5 == client.field229) {
            var4 = 20;
            var0.method2027(class177.field1546, 180 + class359.field3072, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class162.method741(class359.field3072 + 180 - 152, var5, 304, 34, 9179409);
            class162.method741(class359.field3072 + 180 - 151, var5 + 1, 302, 32, 0);
            class162.method749(class359.field3072 + 180 - 150, var5 + 2, class359.field3056 * 3, 30, 9179409);
            class162.method749(class359.field3056 * 3 + (class359.field3072 + 180 - 150), var5 + 2, 300 - class359.field3056 * 3, 30, 0);
            var0.method2027(class359.field3057, class359.field3072 + 180, 276 - var4, 16777215, -1);
         }

         String var6;
         String var7;
         String var8;
         short var24;
         short var26;
         if (20 == client.field229) {
            class119.field878.method1745(class359.field3072 + 180 - class119.field878.field2758 / 2, 271 - class119.field878.field2755 / 2);
            var24 = 201;
            var0.method2027(class359.field3051, 180 + class359.field3072, var24, 16776960, 0);
            var25 = var24 + 15;
            var0.method2027(class359.field3064, class359.field3072 + 180, var25, 16776960, 0);
            var25 += 15;
            var0.method2027(class359.field3084, 180 + class359.field3072, var25, 16776960, 0);
            var25 += 15;
            var25 += 7;
            if (class359.field3075 != 4 && 10 != class359.field3075) {
               var0.method2025(class177.field1574, 180 + class359.field3072 - 110, var25, 16777215, 0);
               var26 = 200;
               var6 = class50.field574.method2203() ? class300.method1453(class359.field3071) : class359.field3071;

               for(var7 = var6; var0.method2045(var7) > var26; var7 = var7.substring(0, var7.length() - 1)) {
                  ;
               }

               var0.method2025(class420.method2042(var7), class359.field3072 + 180 - 70, var25, 16777215, 0);
               var25 += 15;

               for(var8 = class300.method1453(class359.field3067); var0.method2045(var8) > var26; var8 = var8.substring(1)) {
                  ;
               }

               var0.method2025(class177.field1324 + var8, 180 + class359.field3072 - 108, var25, 16777215, 0);
               var25 += 15;
            }
         }

         if (client.field229 == 10 || 11 == client.field229 || client.field229 == 50) {
            class119.field878.method1745(class359.field3072, 171);
            short var27;
            if (0 == class359.field3075) {
               var24 = 251;
               var0.method2027(class177.field1577, 180 + class359.field3072, var24, 16776960, 0);
               var25 = var24 + 30;
               var5 = class359.field3072 + 180 - 80;
               var27 = 291;
               class298.field2395.method1745(var5 - 73, var27 - 20);
               var0.method2028(class177.field1578, var5 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class359.field3072 + 180 + 80;
               class298.field2395.method1745(var5 - 73, var27 - 20);
               var0.method2028(class177.field1579, var5 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class359.field3075 == 1) {
               var0.method2027(class359.field3062, 180 + class359.field3072, 201, 16776960, 0);
               var24 = 236;
               var0.method2027(class359.field3051, class359.field3072 + 180, var24, 16777215, 0);
               var25 = var24 + 15;
               var0.method2027(class359.field3064, 180 + class359.field3072, var25, 16777215, 0);
               var25 += 15;
               var0.method2027(class359.field3084, class359.field3072 + 180, var25, 16777215, 0);
               var25 += 15;
               var5 = 180 + class359.field3072 - 80;
               var27 = 321;
               class298.field2395.method1745(var5 - 73, var27 - 20);
               var0.method2027(class177.field1329, var5, var27 + 5, 16777215, 0);
               var5 = 80 + 180 + class359.field3072;
               class298.field2395.method1745(var5 - 73, var27 - 20);
               var0.method2027(class177.field1406, var5, var27 + 5, 16777215, 0);
            } else if (class359.field3075 == 2) {
               var24 = 201;
               var0.method2027(class359.field3051, class140.field1136, var24, 16776960, 0);
               var25 = var24 + 15;
               var0.method2027(class359.field3064, class140.field1136, var25, 16776960, 0);
               var25 += 15;
               var0.method2027(class359.field3084, class140.field1136, var25, 16776960, 0);
               var25 += 15;
               var25 += 7;
               var0.method2025(class177.field1574, class140.field1136 - 110, var25, 16777215, 0);
               var26 = 200;
               var6 = class50.field574.method2203() ? class300.method1453(class359.field3071) : class359.field3071;

               for(var7 = var6; var0.method2045(var7) > var26; var7 = var7.substring(1)) {
                  ;
               }

               var0.method2025(class420.method2042(var7) + (class359.field3073 == 0 & client.field231 % 40 < 20 ? class238.method1032(16776960) + class442.field3663 : ""), class140.field1136 - 70, var25, 16777215, 0);
               var25 += 15;

               for(var8 = class300.method1453(class359.field3067); var0.method2045(var8) > var26; var8 = var8.substring(1)) {
                  ;
               }

               var0.method2025(class177.field1324 + var8 + (class359.field3073 == 1 & client.field231 % 40 < 20 ? class238.method1032(16776960) + class442.field3663 : ""), class140.field1136 - 108, var25, 16777215, 0);
               var25 += 15;
               var24 = 277;
               var9 = class140.field1136 + -117;
               class344 var10 = class398.method1968(client.field268, class359.field3070);
               var10.method1745(var9, var24);
               var9 += var10.field2758 + 5;
               var1.method2025(class177.field1582, var9, var24 + 13, 16776960, 0);
               var9 = class140.field1136 + 24;
               var10 = class398.method1968(class50.field574.method2203(), class359.field3085);
               var10.method1745(var9, var24);
               var9 += var10.field2758 + 5;
               var1.method2025(class177.field1583, var9, var24 + 13, 16776960, 0);
               var25 = var24 + 15;
               var11 = class140.field1136 - 80;
               short var12 = 321;
               class298.field2395.method1745(var11 - 73, var12 - 20);
               var0.method2027(class177.field1632, var11, var12 + 5, 16777215, 0);
               var11 = 80 + class140.field1136;
               class298.field2395.method1745(var11 - 73, var12 - 20);
               var0.method2027(class177.field1406, var11, var12 + 5, 16777215, 0);
               var24 = 357;
               switch(class359.field3059) {
               case 2:
                  class359.field3060 = class177.field1355;
                  break;
               default:
                  class359.field3060 = class177.field1593;
               }

               class191.field1712 = new class376(class140.field1136, var24, var1.method2045(class359.field3060), 11);
               class188.field1701 = new class376(class140.field1136, var24, var1.method2045(class177.field1594), 11);
               var1.method2027(class359.field3060, class140.field1136, var24, 16777215, 0);
            } else if (class359.field3075 == 3) {
               var24 = 201;
               var0.method2027(class177.field1584, 180 + class359.field3072, var24, 16776960, 0);
               var25 = var24 + 20;
               var1.method2027(class177.field1585, 180 + class359.field3072, var25, 16776960, 0);
               var25 += 15;
               var1.method2027(class177.field1586, class359.field3072 + 180, var25, 16776960, 0);
               var25 += 15;
               var5 = 180 + class359.field3072;
               var27 = 276;
               class298.field2395.method1745(var5 - 73, var27 - 20);
               var2.method2027(class177.field1587, var5, var27 + 5, 16777215, 0);
               var5 = class359.field3072 + 180;
               var27 = 326;
               class298.field2395.method1745(var5 - 73, var27 - 20);
               var2.method2027(class177.field1588, var5, var27 + 5, 16777215, 0);
            } else {
               short var32;
               if (4 == class359.field3075) {
                  var0.method2027(class177.field1563, class359.field3072 + 180, 201, 16776960, 0);
                  var24 = 236;
                  var0.method2027(class359.field3051, 180 + class359.field3072, var24, 16777215, 0);
                  var25 = var24 + 15;
                  var0.method2027(class359.field3064, class359.field3072 + 180, var25, 16777215, 0);
                  var25 += 15;
                  var0.method2027(class359.field3084, 180 + class359.field3072, var25, 16777215, 0);
                  var25 += 15;
                  var0.method2025(class177.field1449 + class300.method1453(class60.field603) + (client.field231 % 40 < 20 ? class238.method1032(16776960) + class442.field3663 : ""), class359.field3072 + 180 - 108, var25, 16777215, 0);
                  var25 -= 8;
                  var0.method2025(class177.field1357, 180 + class359.field3072 - 9, var25, 16776960, 0);
                  var25 += 15;
                  var0.method2025(class177.field1510, 180 + class359.field3072 - 9, var25, 16776960, 0);
                  var5 = class359.field3072 + 180 - 9 + var0.method2045(class177.field1510) + 15;
                  var28 = var25 - var0.field3442;
                  class344 var29;
                  if (class359.field3061) {
                     var29 = class306.field2455;
                  } else {
                     var29 = class23.field110;
                  }

                  var29.method1745(var5, var28);
                  var25 += 15;
                  var30 = 180 + class359.field3072 - 80;
                  var32 = 321;
                  class298.field2395.method1745(var30 - 73, var32 - 20);
                  var0.method2027(class177.field1329, var30, var32 + 5, 16777215, 0);
                  var30 = 80 + class359.field3072 + 180;
                  class298.field2395.method1745(var30 - 73, var32 - 20);
                  var0.method2027(class177.field1406, var30, var32 + 5, 16777215, 0);
                  var1.method2027(class177.field1564, 180 + class359.field3072, var32 + 36, 255, 0);
               } else if (class359.field3075 == 5) {
                  var0.method2027(class177.field1589, 180 + class359.field3072, 201, 16776960, 0);
                  var24 = 221;
                  var2.method2027(class359.field3051, 180 + class359.field3072, var24, 16776960, 0);
                  var25 = var24 + 15;
                  var2.method2027(class359.field3064, class359.field3072 + 180, var25, 16776960, 0);
                  var25 += 15;
                  var2.method2027(class359.field3084, 180 + class359.field3072, var25, 16776960, 0);
                  var25 += 15;
                  var25 += 14;
                  var0.method2025(class177.field1590, 180 + class359.field3072 - 145, var25, 16777215, 0);
                  var26 = 174;
                  var6 = class50.field574.method2203() ? class300.method1453(class359.field3071) : class359.field3071;

                  for(var7 = var6; var0.method2045(var7) > var26; var7 = var7.substring(1)) {
                     ;
                  }

                  var0.method2025(class420.method2042(var7) + (client.field231 % 40 < 20 ? class238.method1032(16776960) + class442.field3663 : ""), 180 + class359.field3072 - 34, var25, 16777215, 0);
                  var25 += 15;
                  var30 = class359.field3072 + 180 - 80;
                  var32 = 321;
                  class298.field2395.method1745(var30 - 73, var32 - 20);
                  var0.method2027(class177.field1591, var30, var32 + 5, 16777215, 0);
                  var30 = 80 + 180 + class359.field3072;
                  class298.field2395.method1745(var30 - 73, var32 - 20);
                  var0.method2027(class177.field1592, var30, var32 + 5, 16777215, 0);
                  var32 = 356;
                  var1.method2027(class177.field1594, class140.field1136, var32, 268435455, 0);
               } else if (class359.field3075 == 6) {
                  var24 = 201;
                  var0.method2027(class359.field3051, class359.field3072 + 180, var24, 16776960, 0);
                  var25 = var24 + 15;
                  var0.method2027(class359.field3064, class359.field3072 + 180, var25, 16776960, 0);
                  var25 += 15;
                  var0.method2027(class359.field3084, 180 + class359.field3072, var25, 16776960, 0);
                  var25 += 15;
                  var5 = class359.field3072 + 180;
                  var27 = 321;
                  class298.field2395.method1745(var5 - 73, var27 - 20);
                  var0.method2027(class177.field1592, var5, var27 + 5, 16777215, 0);
               } else if (7 == class359.field3075) {
                  if (class113.field842 && !client.field461) {
                     var24 = 201;
                     var0.method2027(class359.field3051, class140.field1136, var24, 16776960, 0);
                     var25 = var24 + 15;
                     var0.method2027(class359.field3064, class140.field1136, var25, 16776960, 0);
                     var25 += 15;
                     var0.method2027(class359.field3084, class140.field1136, var25, 16776960, 0);
                     var5 = class140.field1136 - 150;
                     var25 += 10;

                     for(var28 = 0; var28 < 8; ++var28) {
                        class298.field2395.method1750(var5, var25, 30, 40);
                        boolean var31 = class359.field3069 == var28 & client.field231 % 40 < 20;
                        var0.method2025((null == class359.field3050[var28] ? "" : class359.field3050[var28]) + (var31 ? class238.method1032(16776960) + class442.field3663 : ""), var5 + 10, var25 + 27, 16777215, 0);
                        if (var28 != 1 && var28 != 3) {
                           var5 += 35;
                        } else {
                           var5 += 50;
                           var0.method2025(class420.method2042("/"), var5 - 13, var25 + 27, 16777215, 0);
                        }
                     }

                     var28 = class140.field1136 - 80;
                     short var33 = 321;
                     class298.field2395.method1745(var28 - 73, var33 - 20);
                     var0.method2027("Submit", var28, var33 + 5, 16777215, 0);
                     var28 = 80 + class140.field1136;
                     class298.field2395.method1745(var28 - 73, var33 - 20);
                     var0.method2027(class177.field1406, var28, var33 + 5, 16777215, 0);
                  } else {
                     var24 = 216;
                     var0.method2027(class177.field1620, class359.field3072 + 180, var24, 16776960, 0);
                     var25 = var24 + 15;
                     var2.method2027(class177.field1490, 180 + class359.field3072, var25, 16776960, 0);
                     var25 += 15;
                     var2.method2027(class177.field1622, 180 + class359.field3072, var25, 16776960, 0);
                     var25 += 15;
                     var5 = class359.field3072 + 180 - 80;
                     var27 = 321;
                     class298.field2395.method1745(var5 - 73, var27 - 20);
                     var0.method2027(class177.field1639, var5, var27 + 5, 16777215, 0);
                     var5 = class359.field3072 + 180 + 80;
                     class298.field2395.method1745(var5 - 73, var27 - 20);
                     var0.method2027(class177.field1592, var5, var27 + 5, 16777215, 0);
                  }
               } else if (class359.field3075 == 8) {
                  var24 = 216;
                  var0.method2027(class177.field1461, 180 + class359.field3072, var24, 16776960, 0);
                  var25 = var24 + 15;
                  var2.method2027(class177.field1462, 180 + class359.field3072, var25, 16776960, 0);
                  var25 += 15;
                  var2.method2027(class177.field1450, class359.field3072 + 180, var25, 16776960, 0);
                  var25 += 15;
                  var5 = 180 + class359.field3072 - 80;
                  var27 = 321;
                  class298.field2395.method1745(var5 - 73, var27 - 20);
                  var0.method2027(class177.field1576, var5, var27 + 5, 16777215, 0);
                  var5 = 80 + 180 + class359.field3072;
                  class298.field2395.method1745(var5 - 73, var27 - 20);
                  var0.method2027(class177.field1592, var5, var27 + 5, 16777215, 0);
               } else if (9 == class359.field3075) {
                  var24 = 221;
                  var0.method2027(class359.field3051, 180 + class359.field3072, var24, 16776960, 0);
                  var25 = var24 + 25;
                  var0.method2027(class359.field3064, class359.field3072 + 180, var25, 16776960, 0);
                  var25 += 25;
                  var0.method2027(class359.field3084, class359.field3072 + 180, var25, 16776960, 0);
                  var5 = class359.field3072 + 180;
                  var27 = 311;
                  class298.field2395.method1745(var5 - 73, var27 - 20);
                  var0.method2027(class177.field1587, var5, var27 + 5, 16777215, 0);
               } else if (class359.field3075 == 10) {
                  var25 = 180 + class359.field3072;
                  var26 = 209;
                  var0.method2027(class177.field1577, 180 + class359.field3072, var26, 16776960, 0);
                  var5 = var26 + 20;
                  class72.field651.method1745(var25 - 109, var5);
                  class332.field2604.method1745(var25 - 48, var5 + 18);
               } else if (12 == class359.field3075) {
                  var25 = class140.field1136;
                  var26 = 216;
                  var2.method2027(class177.field1334, var25, var26, 16777215, 0);
                  var5 = var26 + 17;
                  var2.method2027(class177.field1353, var25, var5, 16777215, 0);
                  var5 += 17;
                  var2.method2027(class177.field1629, var25, var5, 16777215, 0);
                  var5 += 17;
                  var2.method2027(class177.field1575, var25, var5, 16777215, 0);
                  var25 = class140.field1136 - 80;
                  var26 = 311;
                  class298.field2395.method1745(var25 - 73, var26 - 20);
                  var0.method2027(class177.field1633, var25, var26 + 5, 16777215, 0);
                  var25 = 80 + class140.field1136;
                  class298.field2395.method1745(var25 - 73, var26 - 20);
                  var0.method2027(class177.field1634, var25, var26 + 5, 16777215, 0);
               } else if (13 == class359.field3075) {
                  var24 = 231;
                  var2.method2027(class177.field1482, class359.field3072 + 180, var24, 16777215, 0);
                  var25 = var24 + 20;
                  var2.method2027(class177.field1378, 180 + class359.field3072, var25, 16777215, 0);
                  var5 = 180 + class359.field3072;
                  var24 = 311;
                  class298.field2395.method1745(var5 - 73, var24 - 20);
                  var0.method2027(class177.field1592, var5, var24 + 5, 16777215, 0);
               } else if (14 == class359.field3075) {
                  var24 = 201;
                  String var39 = "";
                  var6 = "";
                  var7 = "";
                  switch(class359.field3055) {
                  case 0:
                     var39 = class177.field1377;
                     var6 = class177.field1343;
                     var7 = class177.field1379;
                     break;
                  case 1:
                     var39 = class177.field1416;
                     var6 = class177.field1417;
                     var7 = class177.field1418;
                     break;
                  case 2:
                     var39 = class177.field1452;
                     var6 = class177.field1453;
                     var7 = class177.field1454;
                     break;
                  default:
                     class426.method2080(false);
                  }

                  var0.method2027(var39, 180 + class359.field3072, var24, 16776960, 0);
                  var25 = var24 + 20;
                  var0.method2027(var6, 180 + class359.field3072, var25, 16776960, 0);
                  var25 += 20;
                  var0.method2027(var7, class359.field3072 + 180, var25, 16776960, 0);
                  var30 = 180 + class359.field3072;
                  var32 = 276;
                  class298.field2395.method1745(var30 - 73, var32 - 20);
                  var0.method2027(class177.field1413, var30, var32 + 5, 16777215, 0);
                  var30 = 180 + class359.field3072;
                  var32 = 326;
                  class298.field2395.method1745(var30 - 73, var32 - 20);
                  var0.method2027(class177.field1592, var30, var32 + 5, 16777215, 0);
               } else if (24 == class359.field3075) {
                  var24 = 221;
                  var0.method2027(class359.field3051, 180 + class359.field3072, var24, 16777215, 0);
                  var25 = var24 + 15;
                  var0.method2027(class359.field3064, 180 + class359.field3072, var25, 16777215, 0);
                  var25 += 15;
                  var0.method2027(class359.field3084, class359.field3072 + 180, var25, 16777215, 0);
                  var25 += 15;
                  var5 = class359.field3072 + 180;
                  var27 = 301;
                  class298.field2395.method1745(var5 - 73, var27 - 20);
                  var0.method2027(class177.field1327, var5, var27 + 5, 16777215, 0);
               } else if (26 == class359.field3075) {
                  var24 = 216;
                  var0.method2027(class177.field1620, class359.field3072 + 180, var24, 16776960, 0);
                  var25 = var24 + 15;
                  var2.method2027(class177.field1490, class359.field3072 + 180, var25, 16776960, 0);
                  var25 += 15;
                  var2.method2027(class177.field1622, 180 + class359.field3072, var25, 16776960, 0);
                  var25 += 15;
                  var5 = class359.field3072 + 180 - 80;
                  var27 = 321;
                  class298.field2395.method1745(var5 - 73, var27 - 20);
                  var0.method2027(class177.field1639, var5, var27 + 5, 16777215, 0);
                  var5 = 80 + class359.field3072 + 180;
                  class298.field2395.method1745(var5 - 73, var27 - 20);
                  var0.method2027(class177.field1592, var5, var27 + 5, 16777215, 0);
               }
            }
         }

         if (client.field229 >= 10) {
            int[] var44 = new int[4];
            class162.method744(var44);
            class162.method742(class359.field3052, 0, 765 + class359.field3052, class476.field4003);
            class312.field2467.method1954(class359.field3052 - 22, client.field231);
            class312.field2467.method1954(22 + 765 + class359.field3052 - 128, client.field231);
            class162.method745(var44);
         }

         class342.field2746[class50.field574.method2213() ? 1 : 0].method1745(765 + class359.field3052 - 40, 463);
         if (client.field229 > 5 && class235.field1995 == class476.field3997) {
            if (null != class122.field1054) {
               var25 = class359.field3052 + 5;
               var26 = 463;
               byte var38 = 100;
               byte var35 = 35;
               class122.field1054.method1745(var25, var26);
               var0.method2027(class177.field1501 + " " + client.field395, var38 / 2 + var25, var35 / 2 + var26 - 2, 16777215, 0);
               if (null != class338.field2702) {
                  var1.method2027(class177.field1644, var25 + var38 / 2, var35 / 2 + var26 + 12, 16777215, 0);
               } else {
                  var1.method2027(class177.field1645, var25 + var38 / 2, 12 + var35 / 2 + var26, 16777215, 0);
               }
            } else {
               class122.field1054 = class208.method906(class446.field3678, "sl_button", "");
            }
         }

      }
   }

   static int method462(int var0, class461 var1, boolean var2) {
      return 2;
   }
}
