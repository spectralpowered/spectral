import java.util.HashMap;

public class class92 {
   class349 field986 = new class349(0, 0);
   int field989 = 0;
   int[] field987 = new int[2048];
   int[] field988 = new int[2048];
   final HashMap field990 = new HashMap();

   public class92() {
      class192.method990();
   }

   void method502(int var1) {
      int var3 = 1 + var1 * 2;
      double var5 = (double)((float)var1 / 3.0F);
      int var7 = var1 * 2 + 1;
      double[] var8 = new double[var7];
      int var9 = -var1;

      for(int var10 = 0; var9 <= var1; ++var10) {
         var8[var10] = class239.method1212((double)var9, 0.0D, var5);
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

      class319 var18 = new class319(var17, var3, var3);
      this.field990.put(var1, var18);
   }

   class319 method503(int var1) {
      if (!this.field990.containsKey(var1)) {
         this.method502(var1);
      }

      return (class319)this.field990.get(var1);
   }

   public final void method504(int var1, int var2) {
      if (this.field989 < this.field987.length) {
         this.field987[this.field989] = var1;
         this.field988[this.field989] = var2;
         ++this.field989;
      }
   }

   public final void method507() {
      this.field989 = 0;
   }

   public final void method508(int var1, int var2, class319 var3, float var4) {
      int var6 = (int)(var4 * 18.0F);
      class319 var7 = this.method503(var6);
      int var8 = var6 * 2 + 1;
      class349 var9 = new class349(0, 0, var3.field3014, var3.field3013);
      class349 var10 = new class349(0, 0);
      this.field986.method1675(var8, var8);
      System.nanoTime();

      int var11;
      int var12;
      int var13;
      for(var11 = 0; var11 < this.field989; ++var11) {
         var12 = this.field987[var11];
         var13 = this.field988[var11];
         int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
         int var15 = (int)((float)var3.field3013 - var4 * (float)(var13 - var2)) - var6;
         this.field986.method1676(var14, var15);
         this.field986.method1682(var9, var10);
         this.method505(var7, var3, var10);
      }

      System.nanoTime();
      System.nanoTime();

      for(var11 = 0; var11 < var3.field3019.length; ++var11) {
         if (0 == var3.field3019[var11]) {
            var3.field3019[var11] = -16777216;
         } else {
            var12 = (var3.field3019[var11] + 64 - 1) / 256;
            if (var12 <= 0) {
               var3.field3019[var11] = -16777216;
            } else {
               if (var12 > class111.field1382.length) {
                  var12 = class111.field1382.length;
               }

               var13 = class111.field1382[var12 - 1];
               var3.field3019[var11] = -16777216 | var13;
            }
         }
      }

      System.nanoTime();
   }

   void method505(class319 var1, class319 var2, class349 var3) {
      if (0 != var3.field3178 && var3.field3175 != 0) {
         int var5 = 0;
         int var6 = 0;
         if (0 == var3.field3177) {
            var5 = var1.field3014 - var3.field3178;
         }

         if (var3.field3176 == 0) {
            var6 = var1.field3013 - var3.field3175;
         }

         int var7 = var5 + var1.field3014 * var6;
         int var8 = var3.field3176 * var2.field3014 + var3.field3177;

         for(int var9 = 0; var9 < var3.field3175; ++var9) {
            for(int var10 = 0; var10 < var3.field3178; ++var10) {
               int var10001 = var8++;
               var2.field3019[var10001] += var1.field3019[var7++];
            }

            var7 += var1.field3014 - var3.field3178;
            var8 += var2.field3014 - var3.field3178;
         }

      }
   }

   static class293 method506(int var0) {
      class293[] var2 = new class293[]{class293.field2814, class293.field2812, class293.field2816, class293.field2813, class293.field2815, class293.field2811};
      class293 var3 = (class293)class296.method1399(var2, var0);
      if (null == var3) {
         var3 = class293.field2814;
      }

      return var3;
   }

   public static int method511(byte[] var0, int var1) {
      int var4 = -1;

      for(int var5 = 0; var5 < var1; ++var5) {
         var4 = var4 >>> 8 ^ class134.field1488[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   static int method509(int var0, class472 var1, boolean var2) {
      class210 var4 = var2 ? class142.field1544 : class425.field3580;
      if (var0 == 1600) {
         class150.field1580[++class188.field1989 - 1] = var4.field2242;
         return 1;
      } else if (var0 == 1601) {
         class150.field1580[++class188.field1989 - 1] = var4.field2236;
         return 1;
      } else {
         class459 var8;
         if (var0 == 1602) {
            if (12 == var4.field2348) {
               var8 = var4.method1076();
               if (var8 != null) {
                  class150.field1581[++class150.field1582 - 1] = var8.method2247().method1040();
                  return 1;
               }
            }

            class150.field1581[++class150.field1582 - 1] = var4.field2276;
            return 1;
         } else if (var0 == 1603) {
            class150.field1580[++class188.field1989 - 1] = var4.field2237;
            return 1;
         } else if (var0 == 1604) {
            class150.field1580[++class188.field1989 - 1] = var4.field2238;
            return 1;
         } else if (var0 == 1605) {
            class150.field1580[++class188.field1989 - 1] = var4.field2204;
            return 1;
         } else if (var0 == 1606) {
            class150.field1580[++class188.field1989 - 1] = var4.field2282;
            return 1;
         } else if (var0 == 1607) {
            class150.field1580[++class188.field1989 - 1] = var4.field2268;
            return 1;
         } else if (var0 == 1608) {
            class150.field1580[++class188.field1989 - 1] = var4.field2269;
            return 1;
         } else if (var0 == 1609) {
            class150.field1580[++class188.field1989 - 1] = var4.field2346;
            return 1;
         } else if (var0 == 1610) {
            class150.field1580[++class188.field1989 - 1] = var4.field2246;
            return 1;
         } else if (var0 == 1611) {
            class150.field1580[++class188.field1989 - 1] = var4.field2239;
            return 1;
         } else if (var0 == 1612) {
            class150.field1580[++class188.field1989 - 1] = var4.field2357;
            return 1;
         } else if (var0 == 1613) {
            class150.field1580[++class188.field1989 - 1] = var4.field2261.method2118();
            return 1;
         } else if (var0 == 1614) {
            class150.field1580[++class188.field1989 - 1] = var4.field2273 ? 1 : 0;
            return 1;
         } else {
            class138 var5;
            if (var0 == 1617) {
               var5 = var4.method1100();
               class150.field1580[++class188.field1989 - 1] = var5 != null ? var5.field1499 : 0;
            }

            if (var0 == 1618) {
               var5 = var4.method1100();
               class150.field1580[++class188.field1989 - 1] = null != var5 ? var5.field1501 : 0;
               return 1;
            } else if (var0 == 1619) {
               var8 = var4.method1076();
               class150.field1581[++class150.field1582 - 1] = var8 != null ? var8.method2198().method1040() : "";
               return 1;
            } else if (var0 == 1620) {
               var5 = var4.method1100();
               class150.field1580[++class188.field1989 - 1] = var5 != null ? var5.field1500 : 0;
               return 1;
            } else if (var0 == 1621) {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2233() : 0;
               return 1;
            } else if (var0 == 1622) {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = null != var8 ? var8.method2234() : 0;
               return 1;
            } else if (var0 == 1623) {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = null != var8 ? var8.method2259() : 0;
               return 1;
            } else if (var0 == 1624) {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = null != var8 && var8.method2245() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var8 = var4.method1076();
                  class150.field1581[++class150.field1582 - 1] = var8 != null ? var8.method2227().method2037() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var8 = var4.method1076();
                  int var6 = null != var8 ? var8.method2214() : 0;
                  int var7 = null != var8 ? var8.method2229() : 0;
                  class150.field1580[++class188.field1989 - 1] = Math.min(var6, var7);
                  class150.field1580[++class188.field1989 - 1] = Math.max(var6, var7);
                  return 1;
               } else if (var0 == 1628) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = null != var8 ? var8.method2229() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2255() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2236() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2237() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var8 = var4.method1076();
                  class150.field1580[++class188.field1989 - 1] = var8 != null ? var8.method2249() : 0;
                  return 1;
               } else {
                  class402 var9;
                  if (var0 == 1633) {
                     var9 = var4.method1089();
                     class150.field1580[class188.field1989 - 1] = var9 != null ? var9.method1962(class150.field1580[class188.field1989 - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var9 = var4.method1089();
                     class150.field1580[class188.field1989 - 1] = null != var9 ? var9.method1964((char)class150.field1580[class188.field1989 - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var8 = var4.method1076();
               class150.field1580[++class188.field1989 - 1] = null != var8 && var8.method2184() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   static void method510(boolean var0) {
      if (!class140.field1508.method261() && !class140.field1508.method262()) {
         class52.field756 = class96.field1025;
         class52.field769 = class96.field1189;
         class52.field789 = class96.field1244;
         class324.method1569(2);
         if (var0) {
            class52.field772 = "";
         }

         class323.method1566();
         class414.method2004();
      } else {
         class324.method1569(10);
      }
   }
}
