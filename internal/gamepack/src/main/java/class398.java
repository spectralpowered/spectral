import java.awt.datatransfer.Clipboard;

public class class398 implements class271 {
   boolean field3485 = false;
   boolean field3487 = false;
   class210 field3486 = null;

   public void method1940(class210 var1) {
      this.method1942();
      if (var1 != null) {
         this.field3486 = var1;
         class252 var3 = var1.method1087();
         if (null != var3) {
            var3.field2630.method2186(true);
            if (var3.field2631 != null) {
               class169 var4 = new class169();
               var4.method902(var1);
               var4.method900(var3.field2631);
               class242.method1219().method1930(var4);
            }
         }
      }

   }

   public class210 method1941() {
      return this.field3486;
   }

   public void method1942() {
      if (null != this.field3486) {
         class252 var2 = this.field3486.method1087();
         class210 var3 = this.field3486;
         this.field3486 = null;
         if (var2 != null) {
            var2.field2630.method2186(false);
            if (null != var2.field2631) {
               class169 var4 = new class169();
               var4.method902(var3);
               var4.method900(var2.field2631);
               class242.method1219().method1930(var4);
            }

         }
      }
   }

   public boolean method1281(int var1) {
      if (null == this.field3486) {
         return false;
      } else {
         class402 var3 = this.field3486.method1089();
         if (var3 == null) {
            return false;
         } else {
            if (var3.method1967(var1)) {
               switch(var1) {
               case 81:
                  this.field3487 = true;
                  break;
               case 82:
                  this.field3485 = true;
                  break;
               default:
                  if (this.method1943(var1)) {
                     class214.method1117(this.field3486);
                  }
               }
            }

            return var3.method1972(var1);
         }
      }
   }

   public boolean method1282(int var1) {
      switch(var1) {
      case 81:
         this.field3487 = false;
         return false;
      case 82:
         this.field3485 = false;
         return false;
      default:
         return false;
      }
   }

   public boolean method1279(char var1) {
      if (this.field3486 == null) {
         return false;
      } else if (!class82.method441(var1)) {
         return false;
      } else {
         class459 var3 = this.field3486.method1076();
         if (var3 != null && var3.method2257()) {
            class402 var4 = this.field3486.method1089();
            if (var4 == null) {
               return false;
            } else {
               if (var4.method1971(var1) && var3.method2200(var1)) {
                  class214.method1117(this.field3486);
               }

               return var4.method1965(var1);
            }
         } else {
            return false;
         }
      }
   }

   public boolean method1280(boolean var1) {
      return false;
   }

   boolean method1943(int var1) {
      if (null == this.field3486) {
         return false;
      } else {
         class459 var3 = this.field3486.method1076();
         if (var3 != null && var3.method2257()) {
            Clipboard var6;
            switch(var1) {
            case 13:
               this.method1942();
               return true;
            case 48:
               if (this.field3485) {
                  var3.method2261();
               }

               return true;
            case 65:
               if (this.field3485) {
                  var6 = class140.field1508.method742();
                  var3.method2221(var6);
               }

               return true;
            case 66:
               if (this.field3485) {
                  var6 = class140.field1508.method742();
                  var3.method2252(var6);
               }

               return true;
            case 67:
               if (this.field3485) {
                  var6 = class140.field1508.method742();
                  var3.method2222(var6);
               }

               return true;
            case 84:
               if (var3.method2236() == 0) {
                  var3.method2200(10);
               } else if (this.field3487 && var3.method2238()) {
                  var3.method2200(10);
               } else {
                  class252 var4 = this.field3486.method1087();
                  class169 var5 = new class169();
                  var5.method902(this.field3486);
                  var5.method900(var4.field2629);
                  class242.method1219().method1930(var5);
                  this.method1942();
               }

               return true;
            case 85:
               if (this.field3485) {
                  var3.method2203();
               } else {
                  var3.method2201();
               }

               return true;
            case 96:
               if (this.field3485) {
                  var3.method2213(this.field3487);
               } else {
                  var3.method2211(this.field3487);
               }

               return true;
            case 97:
               if (this.field3485) {
                  var3.method2206(this.field3487);
               } else {
                  var3.method2212(this.field3487);
               }

               return true;
            case 98:
               if (this.field3485) {
                  var3.method2223();
               } else {
                  var3.method2250(this.field3487);
               }

               return true;
            case 99:
               if (this.field3485) {
                  var3.method2246();
               } else {
                  var3.method2230(this.field3487);
               }

               return true;
            case 101:
               if (this.field3485) {
                  var3.method2204();
               } else {
                  var3.method2202();
               }

               return true;
            case 102:
               if (this.field3485) {
                  var3.method2209(this.field3487);
               } else {
                  var3.method2263(this.field3487);
               }

               return true;
            case 103:
               if (this.field3485) {
                  var3.method2210(this.field3487);
               } else {
                  var3.method2208(this.field3487);
               }

               return true;
            case 104:
               if (this.field3485) {
                  var3.method2217(this.field3487);
               } else {
                  var3.method2215(this.field3487);
               }

               return true;
            case 105:
               if (this.field3485) {
                  var3.method2218(this.field3487);
               } else {
                  var3.method2216(this.field3487);
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

   static void method1945(class394 var0, class394 var1, class394 var2) {
      class52.field757 = (class391.field3440 - 765) / 2;
      class52.field777 = 202 + class52.field757;
      class432.field3605 = class52.field777 + 180;
      byte var4;
      int var5;
      int var9;
      int var11;
      int var25;
      int var28;
      int var30;
      if (class52.field781) {
         int var37;
         class230 var40;
         if (null == class302.field2891) {
            var40 = class280.field2767;
            var28 = var40.method883("sl_back");
            var37 = var40.method886(var28, "");
            class319[] var45 = class79.method434(var40, var28, var37);
            class302.field2891 = var45;
         }

         class161[] var46;
         if (class188.field1991 == null) {
            var40 = class280.field2767;
            var28 = var40.method883("sl_flags");
            var37 = var40.method886(var28, "");
            var46 = class441.method2097(var40, var28, var37);
            class188.field1991 = var46;
         }

         if (null == class344.field3160) {
            var40 = class280.field2767;
            var28 = var40.method883("sl_arrows");
            var37 = var40.method886(var28, "");
            var46 = class441.method2097(var40, var28, var37);
            class344.field3160 = var46;
         }

         if (null == class155.field1618) {
            var40 = class280.field2767;
            var28 = var40.method883("sl_stars");
            var37 = var40.method886(var28, "");
            var46 = class441.method2097(var40, var28, var37);
            class155.field1618 = var46;
         }

         if (null == class56.field807) {
            class56.field807 = class260.method1256(class280.field2767, "leftarrow", "");
         }

         if (class72.field856 == null) {
            class72.field856 = class260.method1256(class280.field2767, "rightarrow", "");
         }

         class362.method1739(class52.field757, 23, 765, 480, 0);
         class362.method1740(class52.field757, 0, 125, 23, 12425273, 9135624);
         class362.method1740(125 + class52.field757, 0, 640, 23, 5197647, 2697513);
         var0.method520(class96.field1330, class52.field757 + 62, 15, 0, -1);
         if (class155.field1618 != null) {
            class155.field1618[1].method849(class52.field757 + 140, 1);
            var1.method518(class96.field1252, class52.field757 + 152, 10, 16777215, -1);
            class155.field1618[0].method849(140 + class52.field757, 12);
            var1.method518(class96.field1332, 152 + class52.field757, 21, 16777215, -1);
         }

         if (class344.field3160 != null) {
            var25 = class52.field757 + 280;
            if (class296.field2836[0] == 0 && 0 == class296.field2837[0]) {
               class344.field3160[2].method849(var25, 4);
            } else {
               class344.field3160[0].method849(var25, 4);
            }

            if (class296.field2836[0] == 0 && 1 == class296.field2837[0]) {
               class344.field3160[3].method849(var25 + 15, 4);
            } else {
               class344.field3160[1].method849(var25 + 15, 4);
            }

            var0.method518(class96.field1067, var25 + 32, 17, 16777215, -1);
            var5 = 390 + class52.field757;
            if (class296.field2836[0] == 1 && class296.field2837[0] == 0) {
               class344.field3160[2].method849(var5, 4);
            } else {
               class344.field3160[0].method849(var5, 4);
            }

            if (1 == class296.field2836[0] && class296.field2837[0] == 1) {
               class344.field3160[3].method849(var5 + 15, 4);
            } else {
               class344.field3160[1].method849(var5 + 15, 4);
            }

            var0.method518(class96.field1047, var5 + 32, 17, 16777215, -1);
            var28 = 500 + class52.field757;
            if (2 == class296.field2836[0] && class296.field2837[0] == 0) {
               class344.field3160[2].method849(var28, 4);
            } else {
               class344.field3160[0].method849(var28, 4);
            }

            if (class296.field2836[0] == 2 && class296.field2837[0] == 1) {
               class344.field3160[3].method849(var28 + 15, 4);
            } else {
               class344.field3160[1].method849(var28 + 15, 4);
            }

            var0.method518(class96.field1335, var28 + 32, 17, 16777215, -1);
            var37 = class52.field757 + 610;
            if (class296.field2836[0] == 3 && 0 == class296.field2837[0]) {
               class344.field3160[2].method849(var37, 4);
            } else {
               class344.field3160[0].method849(var37, 4);
            }

            if (3 == class296.field2836[0] && class296.field2837[0] == 1) {
               class344.field3160[3].method849(var37 + 15, 4);
            } else {
               class344.field3160[1].method849(var37 + 15, 4);
            }

            var0.method518(class96.field1336, var37 + 32, 17, 16777215, -1);
         }

         class362.method1739(class52.field757 + 708, 4, 50, 16, 0);
         var1.method520(class96.field1101, 25 + class52.field757 + 708, 16, 16777215, -1);
         class52.field782 = -1;
         if (class302.field2891 != null) {
            var4 = 88;
            byte var41 = 19;
            var28 = 765 / (var4 + 1) - 1;
            var37 = 480 / (var41 + 1);

            do {
               var30 = var37;
               var9 = var28;
               if (var37 * (var28 - 1) >= class296.field2833) {
                  --var28;
               }

               if (var28 * (var37 - 1) >= class296.field2833) {
                  --var37;
               }

               if ((var37 - 1) * var28 >= class296.field2833) {
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
            int var36 = (var37 + class296.field2833 - 1) / var37;
            class52.field784 = var36 - var28;
            if (class56.field807 != null && class52.field783 > 0) {
               class56.field807.method849(8, class22.field161 / 2 - class56.field807.field1665 / 2);
            }

            if (null != class72.field856 && class52.field783 < class52.field784) {
               class72.field856.method849(class391.field3440 - class72.field856.field1668 - 8, class22.field161 / 2 - class72.field856.field1665 / 2);
            }

            int var13 = var11 + 23;
            int var14 = class52.field757 + var34;
            int var15 = 0;
            boolean var16 = false;
            int var17 = class52.field783;

            int var18;
            for(var18 = var17 * var37; var18 < class296.field2833 && var17 - class52.field783 < var28; ++var18) {
               class296 var19 = class296.field2834[var18];
               boolean var20 = true;
               String var21 = Integer.toString(var19.field2839);
               if (-1 == var19.field2839) {
                  var21 = class96.field1039;
                  var20 = false;
               } else if (var19.field2839 > 1980) {
                  var21 = class96.field1338;
                  var20 = false;
               }

               int var22 = -1;
               int var23 = 0;
               if (var19.method1395()) {
                  if (var19.method1392()) {
                     var22 = class297.field2849.field2856;
                  } else {
                     var22 = class297.field2848.field2856;
                  }
               } else if (var19.method1398()) {
                  var23 = 16711680;
                  if (var19.method1392()) {
                     var22 = class297.field2847.field2856;
                  } else {
                     var22 = class297.field2850.field2856;
                  }
               } else if (var19.method1402()) {
                  if (var19.method1392()) {
                     var22 = class297.field2851.field2856;
                  } else {
                     var22 = class297.field2854.field2856;
                  }
               } else if (var19.method1393()) {
                  if (var19.method1392()) {
                     var22 = class297.field2845.field2856;
                  } else {
                     var22 = class297.field2844.field2856;
                  }
               } else if (var19.method1401()) {
                  if (var19.method1392()) {
                     var22 = class297.field2846.field2856;
                  } else {
                     var22 = class297.field2853.field2856;
                  }
               } else if (var19.method1396()) {
                  if (var19.method1392()) {
                     var22 = class297.field2855.field2856;
                  } else {
                     var22 = class297.field2852.field2856;
                  }
               }

               if (var22 == -1 || var22 >= class302.field2891.length) {
                  if (var19.method1392()) {
                     var22 = class297.field2843.field2856;
                  } else {
                     var22 = class297.field2859.field2856;
                  }
               }

               if (class182.field1957 >= var14 && class182.field1952 >= var13 && class182.field1957 < var14 + var4 && class182.field1952 < var41 + var13 && var20) {
                  class52.field782 = var18;
                  class302.field2891[var22].method1529(var14, var13, 128, 16777215);
                  var16 = true;
               } else {
                  class302.field2891[var22].method1537(var14, var13);
               }

               if (class188.field1991 != null) {
                  class188.field1991[(var19.method1392() ? 8 : 0) + var19.field2841].method849(var14 + 29, var13);
               }

               var0.method520(Integer.toString(var19.field2832), var14 + 15, 5 + var13 + var41 / 2, var23, -1);
               var1.method520(var21, var14 + 60, var41 / 2 + var13 + 5, 268435455, -1);
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
               var18 = var1.method538(class296.field2834[class52.field782].field2835) + 6;
               int var42 = var1.field999 + 8;
               int var43 = 25 + class182.field1952;
               if (var42 + var43 > 480) {
                  var43 = class182.field1952 - 25 - var42;
               }

               class362.method1739(class182.field1957 - var18 / 2, var43, var18, var42, 16777120);
               class362.method1731(class182.field1957 - var18 / 2, var43, var18, var42, 0);
               var1.method520(class296.field2834[class52.field782].field2835, class182.field1957, var1.field999 + var43 + 4, 0, -1);
            }
         }

         class204.field2184.method1056(0, 0);
      } else {
         class335.field3107.method1537(class52.field757, 0);
         class328.field3060.method1537(class52.field757 + 382, 0);
         class52.field759.method849(class52.field757 + 382 - class52.field759.field1668 / 2, 18);
         if (client.field433 == 0 || 5 == client.field433) {
            var4 = 20;
            var0.method520(class96.field1241, 180 + class52.field777, 245 - var4, 16777215, -1);
            var5 = 253 - var4;
            class362.method1731(class52.field777 + 180 - 152, var5, 304, 34, 9179409);
            class362.method1731(class52.field777 + 180 - 151, var5 + 1, 302, 32, 0);
            class362.method1739(class52.field777 + 180 - 150, var5 + 2, class52.field761 * 3, 30, 9179409);
            class362.method1739(class52.field761 * 3 + (class52.field777 + 180 - 150), var5 + 2, 300 - class52.field761 * 3, 30, 0);
            var0.method520(class52.field762, class52.field777 + 180, 276 - var4, 16777215, -1);
         }

         String var6;
         String var7;
         String var8;
         short var24;
         short var26;
         if (20 == client.field433) {
            class83.field951.method849(class52.field777 + 180 - class83.field951.field1668 / 2, 271 - class83.field951.field1665 / 2);
            var24 = 201;
            var0.method520(class52.field756, 180 + class52.field777, var24, 16776960, 0);
            var25 = var24 + 15;
            var0.method520(class52.field769, class52.field777 + 180, var25, 16776960, 0);
            var25 += 15;
            var0.method520(class52.field789, 180 + class52.field777, var25, 16776960, 0);
            var25 += 15;
            var25 += 7;
            if (class52.field780 != 4 && 10 != class52.field780) {
               var0.method518(class96.field1269, 180 + class52.field777 - 110, var25, 16777215, 0);
               var26 = 200;
               var6 = class111.field1385.method1318() ? class20.method114(class52.field776) : class52.field776;

               for(var7 = var6; var0.method538(var7) > var26; var7 = var7.substring(0, var7.length() - 1)) {
                  ;
               }

               var0.method518(class93.method535(var7), class52.field777 + 180 - 70, var25, 16777215, 0);
               var25 += 15;

               for(var8 = class20.method114(class52.field772); var0.method538(var8) > var26; var8 = var8.substring(1)) {
                  ;
               }

               var0.method518(class96.field1019 + var8, 180 + class52.field777 - 108, var25, 16777215, 0);
               var25 += 15;
            }
         }

         if (client.field433 == 10 || 11 == client.field433 || client.field433 == 50) {
            class83.field951.method849(class52.field777, 171);
            short var27;
            if (0 == class52.field780) {
               var24 = 251;
               var0.method520(class96.field1272, 180 + class52.field777, var24, 16776960, 0);
               var25 = var24 + 30;
               var5 = class52.field777 + 180 - 80;
               var27 = 291;
               class405.field3530.method849(var5 - 73, var27 - 20);
               var0.method521(class96.field1273, var5 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
               var5 = class52.field777 + 180 + 80;
               class405.field3530.method849(var5 - 73, var27 - 20);
               var0.method521(class96.field1274, var5 - 73, var27 - 20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class52.field780 == 1) {
               var0.method520(class52.field767, 180 + class52.field777, 201, 16776960, 0);
               var24 = 236;
               var0.method520(class52.field756, class52.field777 + 180, var24, 16777215, 0);
               var25 = var24 + 15;
               var0.method520(class52.field769, 180 + class52.field777, var25, 16777215, 0);
               var25 += 15;
               var0.method520(class52.field789, class52.field777 + 180, var25, 16777215, 0);
               var25 += 15;
               var5 = 180 + class52.field777 - 80;
               var27 = 321;
               class405.field3530.method849(var5 - 73, var27 - 20);
               var0.method520(class96.field1024, var5, var27 + 5, 16777215, 0);
               var5 = 80 + 180 + class52.field777;
               class405.field3530.method849(var5 - 73, var27 - 20);
               var0.method520(class96.field1101, var5, var27 + 5, 16777215, 0);
            } else if (class52.field780 == 2) {
               var24 = 201;
               var0.method520(class52.field756, class432.field3605, var24, 16776960, 0);
               var25 = var24 + 15;
               var0.method520(class52.field769, class432.field3605, var25, 16776960, 0);
               var25 += 15;
               var0.method520(class52.field789, class432.field3605, var25, 16776960, 0);
               var25 += 15;
               var25 += 7;
               var0.method518(class96.field1269, class432.field3605 - 110, var25, 16777215, 0);
               var26 = 200;
               var6 = class111.field1385.method1318() ? class20.method114(class52.field776) : class52.field776;

               for(var7 = var6; var0.method538(var7) > var26; var7 = var7.substring(1)) {
                  ;
               }

               var0.method518(class93.method535(var7) + (class52.field778 == 0 & client.field435 % 40 < 20 ? class334.method1616(16776960) + class389.field3435 : ""), class432.field3605 - 70, var25, 16777215, 0);
               var25 += 15;

               for(var8 = class20.method114(class52.field772); var0.method538(var8) > var26; var8 = var8.substring(1)) {
                  ;
               }

               var0.method518(class96.field1019 + var8 + (class52.field778 == 1 & client.field435 % 40 < 20 ? class334.method1616(16776960) + class389.field3435 : ""), class432.field3605 - 108, var25, 16777215, 0);
               var25 += 15;
               var24 = 277;
               var9 = class432.field3605 + -117;
               class161 var10 = class250.method1231(client.field472, class52.field775);
               var10.method849(var9, var24);
               var9 += var10.field1668 + 5;
               var1.method518(class96.field1277, var9, var24 + 13, 16776960, 0);
               var9 = class432.field3605 + 24;
               var10 = class250.method1231(class111.field1385.method1318(), class52.field790);
               var10.method849(var9, var24);
               var9 += var10.field1668 + 5;
               var1.method518(class96.field1278, var9, var24 + 13, 16776960, 0);
               var25 = var24 + 15;
               var11 = class432.field3605 - 80;
               short var12 = 321;
               class405.field3530.method849(var11 - 73, var12 - 20);
               var0.method520(class96.field1327, var11, var12 + 5, 16777215, 0);
               var11 = 80 + class432.field3605;
               class405.field3530.method849(var11 - 73, var12 - 20);
               var0.method520(class96.field1101, var11, var12 + 5, 16777215, 0);
               var24 = 357;
               switch(class52.field764) {
               case 2:
                  class52.field765 = class96.field1050;
                  break;
               default:
                  class52.field765 = class96.field1288;
               }

               class270.field2705 = new class349(class432.field3605, var24, var1.method538(class52.field765), 11);
               class248.field2614 = new class349(class432.field3605, var24, var1.method538(class96.field1289), 11);
               var1.method520(class52.field765, class432.field3605, var24, 16777215, 0);
            } else if (class52.field780 == 3) {
               var24 = 201;
               var0.method520(class96.field1279, 180 + class52.field777, var24, 16776960, 0);
               var25 = var24 + 20;
               var1.method520(class96.field1280, 180 + class52.field777, var25, 16776960, 0);
               var25 += 15;
               var1.method520(class96.field1281, class52.field777 + 180, var25, 16776960, 0);
               var25 += 15;
               var5 = 180 + class52.field777;
               var27 = 276;
               class405.field3530.method849(var5 - 73, var27 - 20);
               var2.method520(class96.field1282, var5, var27 + 5, 16777215, 0);
               var5 = class52.field777 + 180;
               var27 = 326;
               class405.field3530.method849(var5 - 73, var27 - 20);
               var2.method520(class96.field1283, var5, var27 + 5, 16777215, 0);
            } else {
               short var32;
               if (4 == class52.field780) {
                  var0.method520(class96.field1258, class52.field777 + 180, 201, 16776960, 0);
                  var24 = 236;
                  var0.method520(class52.field756, 180 + class52.field777, var24, 16777215, 0);
                  var25 = var24 + 15;
                  var0.method520(class52.field769, class52.field777 + 180, var25, 16777215, 0);
                  var25 += 15;
                  var0.method520(class52.field789, 180 + class52.field777, var25, 16777215, 0);
                  var25 += 15;
                  var0.method518(class96.field1144 + class20.method114(class492.field4116) + (client.field435 % 40 < 20 ? class334.method1616(16776960) + class389.field3435 : ""), class52.field777 + 180 - 108, var25, 16777215, 0);
                  var25 -= 8;
                  var0.method518(class96.field1052, 180 + class52.field777 - 9, var25, 16776960, 0);
                  var25 += 15;
                  var0.method518(class96.field1205, 180 + class52.field777 - 9, var25, 16776960, 0);
                  var5 = class52.field777 + 180 - 9 + var0.method538(class96.field1205) + 15;
                  var28 = var25 - var0.field999;
                  class161 var29;
                  if (class52.field766) {
                     var29 = class137.field1495;
                  } else {
                     var29 = class133.field1485;
                  }

                  var29.method849(var5, var28);
                  var25 += 15;
                  var30 = 180 + class52.field777 - 80;
                  var32 = 321;
                  class405.field3530.method849(var30 - 73, var32 - 20);
                  var0.method520(class96.field1024, var30, var32 + 5, 16777215, 0);
                  var30 = 80 + class52.field777 + 180;
                  class405.field3530.method849(var30 - 73, var32 - 20);
                  var0.method520(class96.field1101, var30, var32 + 5, 16777215, 0);
                  var1.method520(class96.field1259, 180 + class52.field777, var32 + 36, 255, 0);
               } else if (class52.field780 == 5) {
                  var0.method520(class96.field1284, 180 + class52.field777, 201, 16776960, 0);
                  var24 = 221;
                  var2.method520(class52.field756, 180 + class52.field777, var24, 16776960, 0);
                  var25 = var24 + 15;
                  var2.method520(class52.field769, class52.field777 + 180, var25, 16776960, 0);
                  var25 += 15;
                  var2.method520(class52.field789, 180 + class52.field777, var25, 16776960, 0);
                  var25 += 15;
                  var25 += 14;
                  var0.method518(class96.field1285, 180 + class52.field777 - 145, var25, 16777215, 0);
                  var26 = 174;
                  var6 = class111.field1385.method1318() ? class20.method114(class52.field776) : class52.field776;

                  for(var7 = var6; var0.method538(var7) > var26; var7 = var7.substring(1)) {
                     ;
                  }

                  var0.method518(class93.method535(var7) + (client.field435 % 40 < 20 ? class334.method1616(16776960) + class389.field3435 : ""), 180 + class52.field777 - 34, var25, 16777215, 0);
                  var25 += 15;
                  var30 = class52.field777 + 180 - 80;
                  var32 = 321;
                  class405.field3530.method849(var30 - 73, var32 - 20);
                  var0.method520(class96.field1286, var30, var32 + 5, 16777215, 0);
                  var30 = 80 + 180 + class52.field777;
                  class405.field3530.method849(var30 - 73, var32 - 20);
                  var0.method520(class96.field1287, var30, var32 + 5, 16777215, 0);
                  var32 = 356;
                  var1.method520(class96.field1289, class432.field3605, var32, 268435455, 0);
               } else if (class52.field780 == 6) {
                  var24 = 201;
                  var0.method520(class52.field756, class52.field777 + 180, var24, 16776960, 0);
                  var25 = var24 + 15;
                  var0.method520(class52.field769, class52.field777 + 180, var25, 16776960, 0);
                  var25 += 15;
                  var0.method520(class52.field789, 180 + class52.field777, var25, 16776960, 0);
                  var25 += 15;
                  var5 = class52.field777 + 180;
                  var27 = 321;
                  class405.field3530.method849(var5 - 73, var27 - 20);
                  var0.method520(class96.field1287, var5, var27 + 5, 16777215, 0);
               } else if (7 == class52.field780) {
                  if (class89.field978 && !client.field665) {
                     var24 = 201;
                     var0.method520(class52.field756, class432.field3605, var24, 16776960, 0);
                     var25 = var24 + 15;
                     var0.method520(class52.field769, class432.field3605, var25, 16776960, 0);
                     var25 += 15;
                     var0.method520(class52.field789, class432.field3605, var25, 16776960, 0);
                     var5 = class432.field3605 - 150;
                     var25 += 10;

                     for(var28 = 0; var28 < 8; ++var28) {
                        class405.field3530.method854(var5, var25, 30, 40);
                        boolean var31 = class52.field774 == var28 & client.field435 % 40 < 20;
                        var0.method518((null == class52.field755[var28] ? "" : class52.field755[var28]) + (var31 ? class334.method1616(16776960) + class389.field3435 : ""), var5 + 10, var25 + 27, 16777215, 0);
                        if (var28 != 1 && var28 != 3) {
                           var5 += 35;
                        } else {
                           var5 += 50;
                           var0.method518(class93.method535("/"), var5 - 13, var25 + 27, 16777215, 0);
                        }
                     }

                     var28 = class432.field3605 - 80;
                     short var33 = 321;
                     class405.field3530.method849(var28 - 73, var33 - 20);
                     var0.method520("Submit", var28, var33 + 5, 16777215, 0);
                     var28 = 80 + class432.field3605;
                     class405.field3530.method849(var28 - 73, var33 - 20);
                     var0.method520(class96.field1101, var28, var33 + 5, 16777215, 0);
                  } else {
                     var24 = 216;
                     var0.method520(class96.field1315, class52.field777 + 180, var24, 16776960, 0);
                     var25 = var24 + 15;
                     var2.method520(class96.field1185, 180 + class52.field777, var25, 16776960, 0);
                     var25 += 15;
                     var2.method520(class96.field1317, 180 + class52.field777, var25, 16776960, 0);
                     var25 += 15;
                     var5 = class52.field777 + 180 - 80;
                     var27 = 321;
                     class405.field3530.method849(var5 - 73, var27 - 20);
                     var0.method520(class96.field1334, var5, var27 + 5, 16777215, 0);
                     var5 = class52.field777 + 180 + 80;
                     class405.field3530.method849(var5 - 73, var27 - 20);
                     var0.method520(class96.field1287, var5, var27 + 5, 16777215, 0);
                  }
               } else if (class52.field780 == 8) {
                  var24 = 216;
                  var0.method520(class96.field1156, 180 + class52.field777, var24, 16776960, 0);
                  var25 = var24 + 15;
                  var2.method520(class96.field1157, 180 + class52.field777, var25, 16776960, 0);
                  var25 += 15;
                  var2.method520(class96.field1145, class52.field777 + 180, var25, 16776960, 0);
                  var25 += 15;
                  var5 = 180 + class52.field777 - 80;
                  var27 = 321;
                  class405.field3530.method849(var5 - 73, var27 - 20);
                  var0.method520(class96.field1271, var5, var27 + 5, 16777215, 0);
                  var5 = 80 + 180 + class52.field777;
                  class405.field3530.method849(var5 - 73, var27 - 20);
                  var0.method520(class96.field1287, var5, var27 + 5, 16777215, 0);
               } else if (9 == class52.field780) {
                  var24 = 221;
                  var0.method520(class52.field756, 180 + class52.field777, var24, 16776960, 0);
                  var25 = var24 + 25;
                  var0.method520(class52.field769, class52.field777 + 180, var25, 16776960, 0);
                  var25 += 25;
                  var0.method520(class52.field789, class52.field777 + 180, var25, 16776960, 0);
                  var5 = class52.field777 + 180;
                  var27 = 311;
                  class405.field3530.method849(var5 - 73, var27 - 20);
                  var0.method520(class96.field1282, var5, var27 + 5, 16777215, 0);
               } else if (class52.field780 == 10) {
                  var25 = 180 + class52.field777;
                  var26 = 209;
                  var0.method520(class96.field1272, 180 + class52.field777, var26, 16776960, 0);
                  var5 = var26 + 20;
                  class291.field2795.method849(var25 - 109, var5);
                  class374.field3300.method849(var25 - 48, var5 + 18);
               } else if (12 == class52.field780) {
                  var25 = class432.field3605;
                  var26 = 216;
                  var2.method520(class96.field1029, var25, var26, 16777215, 0);
                  var5 = var26 + 17;
                  var2.method520(class96.field1048, var25, var5, 16777215, 0);
                  var5 += 17;
                  var2.method520(class96.field1324, var25, var5, 16777215, 0);
                  var5 += 17;
                  var2.method520(class96.field1270, var25, var5, 16777215, 0);
                  var25 = class432.field3605 - 80;
                  var26 = 311;
                  class405.field3530.method849(var25 - 73, var26 - 20);
                  var0.method520(class96.field1328, var25, var26 + 5, 16777215, 0);
                  var25 = 80 + class432.field3605;
                  class405.field3530.method849(var25 - 73, var26 - 20);
                  var0.method520(class96.field1329, var25, var26 + 5, 16777215, 0);
               } else if (13 == class52.field780) {
                  var24 = 231;
                  var2.method520(class96.field1177, class52.field777 + 180, var24, 16777215, 0);
                  var25 = var24 + 20;
                  var2.method520(class96.field1073, 180 + class52.field777, var25, 16777215, 0);
                  var5 = 180 + class52.field777;
                  var24 = 311;
                  class405.field3530.method849(var5 - 73, var24 - 20);
                  var0.method520(class96.field1287, var5, var24 + 5, 16777215, 0);
               } else if (14 == class52.field780) {
                  var24 = 201;
                  String var39 = "";
                  var6 = "";
                  var7 = "";
                  switch(class52.field760) {
                  case 0:
                     var39 = class96.field1072;
                     var6 = class96.field1038;
                     var7 = class96.field1074;
                     break;
                  case 1:
                     var39 = class96.field1111;
                     var6 = class96.field1112;
                     var7 = class96.field1113;
                     break;
                  case 2:
                     var39 = class96.field1147;
                     var6 = class96.field1148;
                     var7 = class96.field1149;
                     break;
                  default:
                     class92.method510(false);
                  }

                  var0.method520(var39, 180 + class52.field777, var24, 16776960, 0);
                  var25 = var24 + 20;
                  var0.method520(var6, 180 + class52.field777, var25, 16776960, 0);
                  var25 += 20;
                  var0.method520(var7, class52.field777 + 180, var25, 16776960, 0);
                  var30 = 180 + class52.field777;
                  var32 = 276;
                  class405.field3530.method849(var30 - 73, var32 - 20);
                  var0.method520(class96.field1108, var30, var32 + 5, 16777215, 0);
                  var30 = 180 + class52.field777;
                  var32 = 326;
                  class405.field3530.method849(var30 - 73, var32 - 20);
                  var0.method520(class96.field1287, var30, var32 + 5, 16777215, 0);
               } else if (24 == class52.field780) {
                  var24 = 221;
                  var0.method520(class52.field756, 180 + class52.field777, var24, 16777215, 0);
                  var25 = var24 + 15;
                  var0.method520(class52.field769, 180 + class52.field777, var25, 16777215, 0);
                  var25 += 15;
                  var0.method520(class52.field789, class52.field777 + 180, var25, 16777215, 0);
                  var25 += 15;
                  var5 = class52.field777 + 180;
                  var27 = 301;
                  class405.field3530.method849(var5 - 73, var27 - 20);
                  var0.method520(class96.field1022, var5, var27 + 5, 16777215, 0);
               } else if (26 == class52.field780) {
                  var24 = 216;
                  var0.method520(class96.field1315, class52.field777 + 180, var24, 16776960, 0);
                  var25 = var24 + 15;
                  var2.method520(class96.field1185, class52.field777 + 180, var25, 16776960, 0);
                  var25 += 15;
                  var2.method520(class96.field1317, 180 + class52.field777, var25, 16776960, 0);
                  var25 += 15;
                  var5 = class52.field777 + 180 - 80;
                  var27 = 321;
                  class405.field3530.method849(var5 - 73, var27 - 20);
                  var0.method520(class96.field1334, var5, var27 + 5, 16777215, 0);
                  var5 = 80 + class52.field777 + 180;
                  class405.field3530.method849(var5 - 73, var27 - 20);
                  var0.method520(class96.field1287, var5, var27 + 5, 16777215, 0);
               }
            }
         }

         if (client.field433 >= 10) {
            int[] var44 = new int[4];
            class362.method1734(var44);
            class362.method1732(class52.field757, 0, 765 + class52.field757, class22.field161);
            class381.field3327.method1406(class52.field757 - 22, client.field435);
            class381.field3327.method1406(22 + 765 + class52.field757 - 128, client.field435);
            class362.method1735(var44);
         }

         class329.field3068[class111.field1385.method1328() ? 1 : 0].method849(765 + class52.field757 - 40, 463);
         if (client.field433 > 5 && class300.field2886 == class22.field155) {
            if (null != class356.field3196) {
               var25 = class52.field757 + 5;
               var26 = 463;
               byte var38 = 100;
               byte var35 = 35;
               class356.field3196.method849(var25, var26);
               var0.method520(class96.field1196 + " " + client.field599, var38 / 2 + var25, var35 / 2 + var26 - 2, 16777215, 0);
               if (null != class123.field1450) {
                  var1.method520(class96.field1339, var25 + var38 / 2, var35 / 2 + var26 + 12, 16777215, 0);
               } else {
                  var1.method520(class96.field1340, var25 + var38 / 2, 12 + var35 / 2 + var26, 16777215, 0);
               }
            } else {
               class356.field3196 = class260.method1256(class280.field2767, "sl_button", "");
            }
         }

      }
   }

   static int method1944(int var0, class472 var1, boolean var2) {
      return 2;
   }
}
