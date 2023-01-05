import java.util.HashMap;

public class class426 {
   class376 field3524 = new class376(0, 0);
   int field3527 = 0;
   int[] field3525 = new int[2048];
   int[] field3526 = new int[2048];
   final HashMap field3528 = new HashMap();

   public class426() {
      class327.method1665();
   }

   void method2072(int var1) {
      int var3 = 1 + var1 * 2;
      double var5 = (double)((float)var1 / 3.0F);
      int var7 = var1 * 2 + 1;
      double[] var8 = new double[var7];
      int var9 = -var1;

      for(int var10 = 0; var9 <= var1; ++var10) {
         var8[var10] = class361.method1798((double)var9, 0.0D, var5);
         ++var9;
      }

      double[] var15 = var8;
      double var16 = var8[var1] * var8[var1];
      int[] var17 = new int[var3 * var3];
      boolean var11 = false;

      for(int var12 = 0; var12 < var3; ++var12) {
         for(int var13 = 0; var13 < var3; ++var13) {
            int var14 = var17[var13 + var3 * var12] = (int)(var15[var13] * var15[var12] / var16 * 256.0D);
            if (!var11 && var14 > 0) {
               var11 = true;
            }
         }
      }

      class266 var18 = new class266(var17, var3, var3);
      this.field3528.put(var1, var18);
   }

   class266 method2073(int var1) {
      if (!this.field3528.containsKey(var1)) {
         this.method2072(var1);
      }

      return (class266)this.field3528.get(var1);
   }

   public final void method2074(int var1, int var2) {
      if (this.field3527 < this.field3525.length) {
         this.field3525[this.field3527] = var1;
         this.field3526[this.field3527] = var2;
         ++this.field3527;
      }
   }

   public final void method2077() {
      this.field3527 = 0;
   }

   public final void method2078(int var1, int var2, class266 var3, float var4) {
      int var6 = (int)(var4 * 18.0F);
      class266 var7 = this.method2073(var6);
      int var8 = var6 * 2 + 1;
      class376 var9 = new class376(0, 0, var3.field2200, var3.field2199);
      class376 var10 = new class376(0, 0);
      this.field3524.method1853(var8, var8);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field3527; ++var11) {
         var12 = this.field3525[var11];
         var13 = this.field3526[var11];
         int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
         int var15 = (int)((float)var3.field2199 - var4 * (float)(var13 - var2)) - var6;
         this.field3524.method1854(var14, var15);
         this.field3524.method1860(var9, var10);
         this.method2075(var7, var3, var10);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field2205.length; ++var11) {
         if (0 == var3.field2205[var11]) {
            var3.field2205[var11] = -16777216;
         } else {
            var12 = (var3.field2205[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.field2205[var11] = -16777216;
            } else {
               if (var12 > class50.field571.length) {
                  var12 = class50.field571.length;
               }

               var13 = class50.field571[var12 - 1];
               var3.field2205[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   void method2075(class266 var1, class266 var2, class376 var3) {
      if (0 != var3.field3185 && var3.field3182 != 0) {
         int var5 = 0;
         int var6 = 0;
         if (0 == var3.field3184) {
            var5 = var1.field2200 - var3.field3185;
         }

         if (var3.field3183 == 0) {
            var6 = var1.field2199 - var3.field3182;
         }

         int var7 = var5 + var1.field2200 * var6;
         int var8 = var3.field3183 * var2.field2200 + var3.field3184;

         for(int var9 = 0; var9 < var3.field3182; ++var9) {
            for(int var10 = 0; var10 < var3.field3185; ++var10) {
               int var10001 = var8++;
               var2.field2205[var10001] += var1.field2205[var7++];
            }

            var7 += var1.field2200 - var3.field3185;
            var8 += var2.field2200 - var3.field3185;
         }

      }
   }

   static class223 method2076(int var0) {
      class223[] var2 = new class223[]{class223.field1915, class223.field1913, class223.field1917, class223.field1914, class223.field1916, class223.field1912};
      class223 var3 = (class223)class2.method10(var2, var0);
      if (null == var3) {
         var3 = class223.field1915;
      }

      return var3;
   }

   public static int method2081(byte[] var0, int var1) {
      int var4 = -1;

      for(int var5 = 0; var5 < var1; ++var5) {
         var4 = var4 >>> 8 ^ class127.field1071[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   static int method2079(int var0, class461 var1, boolean var2) {
      class120 var4 = var2 ? class108.field822 : class37.field183;
      if (var0 == 1600) {
         class386.field3248[++class161.field1227 - 1] = var4.field920;
         return 1;
      } else if (var0 == 1601) {
         class386.field3248[++class161.field1227 - 1] = var4.field914;
         return 1;
      } else {
         class262 var8;
         if (var0 == 1602) {
            if (12 == var4.field1026) {
               var8 = var4.method485();
               if (var8 != null) {
                  class386.field3249[++class386.field3250 - 1] = var8.method1179().method1640();
                  return 1;
               }
            }

            class386.field3249[++class386.field3250 - 1] = var4.field954;
            return 1;
         } else if (var0 == 1603) {
            class386.field3248[++class161.field1227 - 1] = var4.field915;
            return 1;
         } else if (var0 == 1604) {
            class386.field3248[++class161.field1227 - 1] = var4.field916;
            return 1;
         } else if (var0 == 1605) {
            class386.field3248[++class161.field1227 - 1] = var4.field882;
            return 1;
         } else if (var0 == 1606) {
            class386.field3248[++class161.field1227 - 1] = var4.field960;
            return 1;
         } else if (var0 == 1607) {
            class386.field3248[++class161.field1227 - 1] = var4.field946;
            return 1;
         } else if (var0 == 1608) {
            class386.field3248[++class161.field1227 - 1] = var4.field947;
            return 1;
         } else if (var0 == 1609) {
            class386.field3248[++class161.field1227 - 1] = var4.field1024;
            return 1;
         } else if (var0 == 1610) {
            class386.field3248[++class161.field1227 - 1] = var4.field924;
            return 1;
         } else if (var0 == 1611) {
            class386.field3248[++class161.field1227 - 1] = var4.field917;
            return 1;
         } else if (var0 == 1612) {
            class386.field3248[++class161.field1227 - 1] = var4.field1035;
            return 1;
         } else if (var0 == 1613) {
            class386.field3248[++class161.field1227 - 1] = var4.field939.method330();
            return 1;
         } else if (var0 == 1614) {
            class386.field3248[++class161.field1227 - 1] = var4.field951 ? 1 : 0;
            return 1;
         } else {
            class146 var5;
            if (var0 == 1617) {
               var5 = var4.method509();
               class386.field3248[++class161.field1227 - 1] = var5 != null ? var5.field1160 : 0;
            }

            if (var0 == 1618) {
               var5 = var4.method509();
               class386.field3248[++class161.field1227 - 1] = null != var5 ? var5.field1162 : 0;
               return 1;
            } else if (var0 == 1619) {
               var8 = var4.method485();
               class386.field3249[++class386.field3250 - 1] = var8 != null ? var8.method1130().method1640() : "";
               return 1;
            } else if (var0 == 1620) {
               var5 = var4.method509();
               class386.field3248[++class161.field1227 - 1] = var5 != null ? var5.field1161 : 0;
               return 1;
            } else if (var0 == 1621) {
               var8 = var4.method485();
               class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1165() : 0;
               return 1;
            } else if (var0 == 1622) {
               var8 = var4.method485();
               class386.field3248[++class161.field1227 - 1] = null != var8 ? var8.method1166() : 0;
               return 1;
            } else if (var0 == 1623) {
               var8 = var4.method485();
               class386.field3248[++class161.field1227 - 1] = null != var8 ? var8.method1191() : 0;
               return 1;
            } else if (var0 == 1624) {
               var8 = var4.method485();
               class386.field3248[++class161.field1227 - 1] = null != var8 && var8.method1177() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var8 = var4.method485();
                  class386.field3249[++class386.field3250 - 1] = var8 != null ? var8.method1159().method1041() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var8 = var4.method485();
                  int var6 = null != var8 ? var8.method1146() : 0;
                  int var7 = null != var8 ? var8.method1161() : 0;
                  class386.field3248[++class161.field1227 - 1] = Math.min(var6, var7);
                  class386.field3248[++class161.field1227 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 1628) {
                  var8 = var4.method485();
                  class386.field3248[++class161.field1227 - 1] = null != var8 ? var8.method1161() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var8 = var4.method485();
                  class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1187() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var8 = var4.method485();
                  class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1168() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var8 = var4.method485();
                  class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1169() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var8 = var4.method485();
                  class386.field3248[++class161.field1227 - 1] = var8 != null ? var8.method1181() : 0;
                  return 1;
               } else {
                  class109 var9;
                  if (var0 == 1633) {
                     var9 = var4.method498();
                     class386.field3248[class161.field1227 - 1] = var9 != null ? var9.method427(class386.field3248[class161.field1227 - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var9 = var4.method498();
                     class386.field3248[class161.field1227 - 1] = null != var9 ? var9.method429((char)class386.field3248[class161.field1227 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method485();
               class386.field3248[++class161.field1227 - 1] = null != var8 && var8.method1116() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static void method2080(boolean var0) {
      if (!class309.field2461.method169() && !class309.field2461.method170()) {
         class359.field3051 = class177.field1330;
         class359.field3064 = class177.field1494;
         class359.field3084 = class177.field1549;
         class286.method1419(2);
         if (var0) {
            class359.field3067 = "";
         }

         class211.method913();
         class492.method2437();
      } else {
         class286.method1419(10);
      }
   }
}
