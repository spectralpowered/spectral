public class class438 extends class108 {
   static class31 field3629 = new class31(64);
   static String field3632;
   public char field3624;
   public char field3625;
   public int field3627;
   public int field3628;
   public int[] field3623;
   public int[] field3631;
   public String field3626;
   public String[] field3630;

   class438() {
      this.field3626 = class96.field1020;
      this.field3628 = 0;
   }

   void method2090(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method2091(var1, var3);
      }
   }

   void method2091(class134 var1, int var2) {
      if (var2 == 1) {
         this.field3624 = (char)var1.method669();
      } else if (var2 == 2) {
         this.field3625 = (char)var1.method669();
      } else if (var2 == 3) {
         this.field3626 = var1.method677();
      } else if (var2 == 4) {
         this.field3627 = var1.method717();
      } else {
         int var4;
         if (var2 == 5) {
            this.field3628 = var1.method671();
            this.field3623 = new int[this.field3628];
            this.field3630 = new String[this.field3628];

            for(var4 = 0; var4 < this.field3628; ++var4) {
               this.field3623[var4] = var1.method717();
               this.field3630[var4] = var1.method677();
            }
         } else if (var2 == 6) {
            this.field3628 = var1.method671();
            this.field3623 = new int[this.field3628];
            this.field3631 = new int[this.field3628];

            for(var4 = 0; var4 < this.field3628; ++var4) {
               this.field3623[var4] = var1.method717();
               this.field3631[var4] = var1.method717();
            }
         }
      }

   }

   public int method2092() {
      return this.field3628;
   }

   public static String method2093(byte[] var0) {
      int var3 = var0.length;
      StringBuilder var4 = new StringBuilder();

      for(int var5 = 0; var5 < var3 + 0; var5 += 3) {
         int var6 = var0[var5] & 255;
         var4.append(class168.field1842[var6 >>> 2]);
         if (var5 < var3 - 1) {
            int var7 = var0[var5 + 1] & 255;
            var4.append(class168.field1842[(var6 & 3) << 4 | var7 >>> 4]);
            if (var5 < var3 - 2) {
               int var8 = var0[var5 + 2] & 255;
               var4.append(class168.field1842[(var7 & 15) << 2 | var8 >>> 6]).append(class168.field1842[var8 & 63]);
            } else {
               var4.append(class168.field1842[(var7 & 15) << 2]).append("=");
            }
         } else {
            var4.append(class168.field1842[(var6 & 3) << 4]).append("==");
         }
      }

      String var2 = var4.toString();
      return var2;
   }

   public static class200[] method2094() {
      return new class200[]{class200.field2080, class200.field2079, class200.field2156, class200.field2048, class200.field2059, class200.field2050, class200.field2047, class200.field2052, class200.field2053, class200.field2070, class200.field2055, class200.field2056, class200.field2057, class200.field2124, class200.field2133, class200.field2060, class200.field2061, class200.field2062, class200.field2063, class200.field2092, class200.field2058, class200.field2066, class200.field2136, class200.field2068, class200.field2134, class200.field2045, class200.field2071, class200.field2072, class200.field2073, class200.field2074, class200.field2067, class200.field2076, class200.field2064, class200.field2132, class200.field2049, class200.field2142, class200.field2081, class200.field2075, class200.field2083, class200.field2084, class200.field2085, class200.field2086, class200.field2113, class200.field2088, class200.field2089, class200.field2046, class200.field2091, class200.field2104, class200.field2093, class200.field2094, class200.field2054, class200.field2119, class200.field2097, class200.field2098, class200.field2099, class200.field2118, class200.field2078, class200.field2102, class200.field2103, class200.field2101, class200.field2105, class200.field2106, class200.field2107, class200.field2108, class200.field2109, class200.field2128, class200.field2147, class200.field2096, class200.field2111, class200.field2087, class200.field2115, class200.field2116, class200.field2117, class200.field2069, class200.field2110, class200.field2120, class200.field2126, class200.field2122, class200.field2123, class200.field2161, class200.field2125, class200.field2100, class200.field2127, class200.field2121, class200.field2129, class200.field2130, class200.field2131, class200.field2148, class200.field2065, class200.field2077, class200.field2149, class200.field2090, class200.field2137, class200.field2138, class200.field2139, class200.field2140, class200.field2141, class200.field2135, class200.field2143, class200.field2144, class200.field2145, class200.field2146, class200.field2114, class200.field2095, class200.field2112, class200.field2150, class200.field2151, class200.field2152, class200.field2153, class200.field2154, class200.field2155, class200.field2051, class200.field2157, class200.field2158, class200.field2159};
   }
}
