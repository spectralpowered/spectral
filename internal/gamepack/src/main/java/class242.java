import java.util.HashMap;
import java.util.Map;

@ObfInfo(
   name = "ga"
)
public class class242 extends class195 {
   @ObfInfo(
      owner = "ga",
      name = "m",
      desc = "Ljv;"
   )
   public static class99 field2029 = new class99(64);
   @ObfInfo(
      owner = "ga",
      name = "q",
      desc = "Ljv;"
   )
   public static class99 field2030 = new class99(100);
   @ObfInfo(
      owner = "ga",
      name = "f",
      desc = "Ljv;"
   )
   public static class99 field2042 = new class99(100);
   @ObfInfo(
      owner = "ga",
      name = "h",
      desc = "Z"
   )
   static boolean field2051 = false;
   @ObfInfo(
      owner = "ga",
      name = "e",
      desc = "Lly;"
   )
   static class274 field2027;
   @ObfInfo(
      owner = "ga",
      name = "v",
      desc = "Lly;"
   )
   static class274 field2028;
   @ObfInfo(
      owner = "ga",
      name = "s",
      desc = "[Z"
   )
   boolean[] field2041;
   @ObfInfo(
      owner = "ga",
      name = "j",
      desc = "I"
   )
   int field2035 = 0;
   @ObfInfo(
      owner = "ga",
      name = "b",
      desc = "I"
   )
   int field2048 = 0;
   @ObfInfo(
      owner = "ga",
      name = "i",
      desc = "[I"
   )
   int[] field2036;
   @ObfInfo(
      owner = "ga",
      name = "a",
      desc = "[I"
   )
   int[] field2040;
   @ObfInfo(
      owner = "ga",
      name = "l",
      desc = "Z"
   )
   public boolean field2031 = false;
   @ObfInfo(
      owner = "ga",
      name = "y",
      desc = "Z"
   )
   public boolean field2047 = false;
   @ObfInfo(
      owner = "ga",
      name = "as",
      desc = "I"
   )
   public int field2026 = 2;
   @ObfInfo(
      owner = "ga",
      name = "r",
      desc = "I"
   )
   public int field2032 = -1;
   @ObfInfo(
      owner = "ga",
      name = "w",
      desc = "I"
   )
   public int field2034 = -1;
   @ObfInfo(
      owner = "ga",
      name = "z",
      desc = "I"
   )
   public int field2039 = -1;
   @ObfInfo(
      owner = "ga",
      name = "c",
      desc = "I"
   )
   public int field2044 = -1;
   @ObfInfo(
      owner = "ga",
      name = "p",
      desc = "I"
   )
   public int field2045 = -1;
   @ObfInfo(
      owner = "ga",
      name = "k",
      desc = "I"
   )
   public int field2046 = -1;
   @ObfInfo(
      owner = "ga",
      name = "t",
      desc = "I"
   )
   public int field2049 = 5;
   @ObfInfo(
      owner = "ga",
      name = "d",
      desc = "I"
   )
   public int field2050 = 99;
   @ObfInfo(
      owner = "ga",
      name = "o",
      desc = "[I"
   )
   public int[] field2037;
   @ObfInfo(
      owner = "ga",
      name = "n",
      desc = "[I"
   )
   public int[] field2038;
   @ObfInfo(
      owner = "ga",
      name = "g",
      desc = "[I"
   )
   public int[] field2043;
   @ObfInfo(
      owner = "ga",
      name = "u",
      desc = "Ljava/util/Map;"
   )
   public Map field2033;

   @ObfInfo(
      owner = "ga",
      name = "v",
      desc = "(Lqy;I)V"
   )
   void method1051(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method1061(var1, var3);
      }
   }

   @ObfInfo(
      owner = "ga",
      name = "x",
      desc = "(Lqy;II)V"
   )
   void method1061(class127 var1, int var2) {
      int var4;
      int var5;
      if (var2 == 1) {
         var4 = var1.method549();
         this.field2037 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2037[var5] = var1.method549();
         }

         this.field2043 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2043[var5] = var1.method549();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2043[var5] += var1.method549() << 16;
         }
      } else if (var2 == 2) {
         this.field2046 = var1.method549();
      } else if (var2 == 3) {
         var4 = var1.method547();
         this.field2040 = new int[var4 + 1];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2040[var5] = var1.method547();
         }

         this.field2040[var4] = 9999999;
      } else if (var2 == 4) {
         this.field2031 = true;
      } else if (var2 == 5) {
         this.field2049 = var1.method547();
      } else if (var2 == 6) {
         this.field2044 = var1.method549();
      } else if (var2 == 7) {
         this.field2045 = var1.method549();
      } else if (var2 == 8) {
         this.field2050 = var1.method547();
         this.field2047 = true;
      } else if (var2 == 9) {
         this.field2039 = var1.method547();
      } else if (var2 == 10) {
         this.field2034 = var1.method547();
      } else if (var2 == 11) {
         this.field2026 = var1.method547();
      } else if (var2 == 12) {
         var4 = var1.method547();
         this.field2036 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2036[var5] = var1.method549();
         }

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2036[var5] += var1.method549() << 16;
         }
      } else if (var2 == 13) {
         var4 = var1.method547();
         this.field2038 = new int[var4];

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2038[var5] = var1.method551();
         }
      } else if (var2 == 14) {
         this.field2032 = var1.method595();
      } else if (var2 == 15) {
         var4 = var1.method549();
         this.field2033 = new HashMap();

         for(var5 = 0; var5 < var4; ++var5) {
            int var6 = var1.method549();
            int var7 = var1.method551();
            this.field2033.put(var6, var7);
         }
      } else if (var2 == 16) {
         this.field2048 = var1.method549();
         this.field2035 = var1.method549();
      } else if (var2 == 17) {
         this.field2041 = new boolean[256];

         for(var4 = 0; var4 < this.field2041.length; ++var4) {
            this.field2041[var4] = false;
         }

         var4 = var1.method547();

         for(var5 = 0; var5 < var4; ++var5) {
            this.field2041[var1.method547()] = true;
         }
      }

   }

   @ObfInfo(
      owner = "ga",
      name = "m",
      desc = "(I)V"
   )
   void method1052() {
      if (-1 == this.field2039) {
         if (null == this.field2040 && this.field2041 == null) {
            this.field2039 = 0;
         } else {
            this.field2039 = 2;
         }
      }

      if (this.field2034 == -1) {
         if (null == this.field2040 && this.field2041 == null) {
            this.field2034 = 0;
         } else {
            this.field2034 = 2;
         }
      }

   }

   @ObfInfo(
      owner = "ga",
      name = "q",
      desc = "(Lhh;II)Lhh;"
   )
   public class470 method1053(class470 var1, int var2) {
      class470 var5;
      if (!this.method1056()) {
         var2 = this.field2043[var2];
         class298 var6 = class287.method1422(var2 >> 16);
         var2 &= 65535;
         if (var6 == null) {
            return var1.method2298(true);
         } else {
            var5 = var1.method2298(!var6.method1444(var2));
            var5.method2302(var6, var2);
            return var5;
         }
      } else {
         class357 var4 = class359.method1791(this.field2032);
         if (null == var4) {
            return var1.method2298(true);
         } else {
            var5 = var1.method2298(!var4.method1780());
            var5.method2319(var4, var2);
            return var5;
         }
      }
   }

   @ObfInfo(
      owner = "ga",
      name = "f",
      desc = "(Lhh;III)Lhh;"
   )
   class470 method1054(class470 var1, int var2, int var3) {
      class470 var6;
      if (!this.method1056()) {
         var2 = this.field2043[var2];
         class298 var7 = class287.method1422(var2 >> 16);
         var2 &= 65535;
         if (var7 == null) {
            return var1.method2298(true);
         } else {
            var6 = var1.method2298(!var7.method1444(var2));
            var3 &= 3;
            if (var3 == 1) {
               var6.method2326();
            } else if (var3 == 2) {
               var6.method2308();
            } else if (var3 == 3) {
               var6.method2307();
            }

            var6.method2302(var7, var2);
            if (var3 == 1) {
               var6.method2307();
            } else if (var3 == 2) {
               var6.method2308();
            } else if (var3 == 3) {
               var6.method2326();
            }

            return var6;
         }
      } else {
         class357 var5 = class359.method1791(this.field2032);
         if (null == var5) {
            return var1.method2298(true);
         } else {
            var6 = var1.method2298(!var5.method1780());
            var3 &= 3;
            if (var3 == 1) {
               var6.method2326();
            } else if (var3 == 2) {
               var6.method2308();
            } else if (var3 == 3) {
               var6.method2307();
            }

            var6.method2319(var5, var2);
            if (var3 == 1) {
               var6.method2307();
            } else if (var3 == 2) {
               var6.method2308();
            } else if (var3 == 3) {
               var6.method2326();
            }

            return var6;
         }
      }
   }

   @ObfInfo(
      owner = "ga",
      name = "r",
      desc = "(Lhh;II)Lhh;"
   )
   class470 method1055(class470 var1, int var2) {
      class470 var5;
      if (!this.method1056()) {
         var2 = this.field2043[var2];
         class298 var6 = class287.method1422(var2 >> 16);
         var2 &= 65535;
         if (var6 == null) {
            return var1.method2299(true);
         } else {
            var5 = var1.method2299(!var6.method1444(var2));
            var5.method2302(var6, var2);
            return var5;
         }
      } else {
         class357 var4 = class359.method1791(this.field2032);
         if (null == var4) {
            return var1.method2299(true);
         } else {
            var5 = var1.method2299(!var4.method1780());
            var5.method2319(var4, var2);
            return var5;
         }
      }
   }

   @ObfInfo(
      owner = "ga",
      name = "u",
      desc = "(Lhh;ILga;IB)Lhh;"
   )
   public class470 method1062(class470 var1, int var2, class242 var3, int var4) {
      if (field2051 && !this.method1056() && !var3.method1056()) {
         return this.method1060(var1, var2, var3, var4);
      } else {
         class470 var6 = var1.method2298(false);
         boolean var7 = false;
         class298 var8 = null;
         class176 var9 = null;
         class357 var10;
         if (this.method1056()) {
            var10 = this.method1059();
            if (var10 == null) {
               return var6;
            }

            if (var3.method1056() && null == this.field2041) {
               var6.method2319(var10, var2);
               return var6;
            }

            var9 = var10.field3040;
            var6.method2324(var9, var10, var2, this.field2041, false, !var3.method1056());
         } else {
            var2 = this.field2043[var2];
            var8 = class287.method1422(var2 >> 16);
            var2 &= 65535;
            if (null == var8) {
               return var3.method1053(var1, var4);
            }

            if (!var3.method1056() && (null == this.field2040 || var4 == -1)) {
               var6.method2302(var8, var2);
               return var6;
            }

            if (this.field2040 == null || var4 == -1) {
               var6.method2302(var8, var2);
               return var6;
            }

            var7 = var3.method1056();
            if (!var7) {
               var6.method2306(var8, var2, this.field2040, false);
            }
         }

         if (var3.method1056()) {
            var10 = var3.method1059();
            if (null == var10) {
               return var6;
            }

            if (var9 == null) {
               var9 = var10.field3040;
            }

            var6.method2324(var9, var10, var4, this.field2041, true, true);
         } else {
            var4 = var3.field2043[var4];
            class298 var11 = class287.method1422(var4 >> 16);
            var4 &= 65535;
            if (null == var11) {
               return this.method1053(var1, var2);
            }

            var6.method2306(var11, var4, this.field2040, true);
         }

         if (var7 && null != var8) {
            var6.method2306(var8, var2, this.field2040, false);
         }

         var6.method2325();
         return var6;
      }
   }

   @ObfInfo(
      owner = "ga",
      name = "b",
      desc = "(Lhh;ILga;II)Lhh;"
   )
   class470 method1060(class470 var1, int var2, class242 var3, int var4) {
      var2 = this.field2043[var2];
      class298 var6 = class287.method1422(var2 >> 16);
      var2 &= 65535;
      if (null == var6) {
         return var3.method1053(var1, var4);
      } else {
         var4 = var3.field2043[var4];
         class298 var7 = class287.method1422(var4 >> 16);
         var4 &= 65535;
         class470 var8;
         if (var7 == null) {
            var8 = var1.method2298(!var6.method1444(var2));
            var8.method2302(var6, var2);
            return var8;
         } else {
            var8 = var1.method2298(!var6.method1444(var2) & !var7.method1444(var4));
            var8.method2311(var6, var2, var7, var4, this.field2040);
            return var8;
         }
      }
   }

   @ObfInfo(
      owner = "ga",
      name = "j",
      desc = "(Lhh;II)Lhh;"
   )
   public class470 method1057(class470 var1, int var2) {
      if (!this.method1056()) {
         int var4 = this.field2043[var2];
         class298 var5 = class287.method1422(var4 >> 16);
         var4 &= 65535;
         if (var5 == null) {
            return var1.method2298(true);
         } else {
            class298 var6 = null;
            int var7 = 0;
            if (null != this.field2036 && var2 < this.field2036.length) {
               var7 = this.field2036[var2];
               var6 = class287.method1422(var7 >> 16);
               var7 &= 65535;
            }

            class470 var8;
            if (null != var6 && var7 != 65535) {
               var8 = var1.method2298(!var5.method1444(var4) & !var6.method1444(var7));
               var8.method2302(var5, var4);
               var8.method2302(var6, var7);
               return var8;
            } else {
               var8 = var1.method2298(!var5.method1444(var4));
               var8.method2302(var5, var4);
               return var8;
            }
         }
      } else {
         return this.method1053(var1, var2);
      }
   }

   @ObfInfo(
      owner = "ga",
      name = "g",
      desc = "(I)Z"
   )
   public boolean method1056() {
      return this.field2032 >= 0;
   }

   @ObfInfo(
      owner = "ga",
      name = "i",
      desc = "(B)I"
   )
   public int method1058() {
      return this.field2035 - this.field2048;
   }

   @ObfInfo(
      owner = "ga",
      name = "n",
      desc = "(I)Lew;"
   )
   class357 method1059() {
      return this.method1056() ? class359.method1791(this.field2032) : null;
   }

   @ObfInfo(
      owner = "ga",
      name = "e",
      desc = "(Lly;III)[Lrx;"
   )
   public static class266[] method1064(class274 var0, int var1, int var2) {
      byte[] var5 = var0.method1365(var1, var2);
      boolean var4;
      if (null == var5) {
         var4 = false;
      } else {
         class85.method354(var5);
         var4 = true;
      }

      return !var4 ? null : class232.method1005();
   }

   @ObfInfo(
      owner = "ga",
      name = "h",
      desc = "(Lly;Lly;Lly;Lly;I)V"
   )
   public static void method1063(class274 var0, class274 var1, class274 var2, class274 var3) {
      class126.field1066 = var0;
      class120.field884 = var1;
      class120.field913 = var2;
      class299.field2399 = var3;
      class329.field2600 = new class120[class126.field1066.method1353()][];
      class476.field4009 = new boolean[class126.field1066.method1353()];
   }
}
