public class class263 extends class195 {
   public static class99 field2143 = new class99(50);
   public static class99 field2144 = new class99(200);
   public static class99 field2188 = new class99(64);
   public static int field2179;
   static class274 field2140;
   class385 field2171;
   int field2138;
   int field2146;
   int field2161;
   int field2163;
   int field2165;
   int field2166;
   int field2167;
   int field2169;
   int field2172;
   int field2173;
   int field2174;
   int field2175;
   int field2176;
   int field2177;
   int field2182;
   int field2183;
   int field2184;
   int field2189;
   int field2191;
   int[] field2139;
   int[] field2178;
   public boolean field2162;
   public boolean field2190;
   public int field2141;
   public int field2142;
   public int field2150;
   public int field2151;
   public int field2152;
   public int field2153;
   public int field2154;
   public int field2155;
   public int field2156;
   public int field2157;
   public int field2158;
   public int field2159;
   public int field2160;
   public int field2168;
   public int field2170;
   public int field2180;
   public int field2181;
   public int field2185;
   public int field2187;
   public int field2193;
   public String field2147;
   public String[] field2145;
   public String[] field2164;
   public short[] field2148;
   public short[] field2149;
   public short[] field2186;
   public short[] field2192;

   class263() {
      this.field2147 = class177.field1325;
      this.field2151 = 2000;
      this.field2152 = 0;
      this.field2153 = 0;
      this.field2160 = 0;
      this.field2155 = 0;
      this.field2141 = 0;
      this.field2157 = 0;
      this.field2158 = 1;
      this.field2159 = -1;
      this.field2180 = -1;
      this.field2150 = -1;
      this.field2162 = false;
      this.field2145 = new String[]{null, null, class177.field1571, null, null};
      this.field2164 = new String[]{null, null, null, null, class177.field1638};
      this.field2165 = -2;
      this.field2166 = -1;
      this.field2167 = -1;
      this.field2189 = 0;
      this.field2146 = -1;
      this.field2161 = -1;
      this.field2138 = 0;
      this.field2172 = -1;
      this.field2173 = -1;
      this.field2174 = -1;
      this.field2175 = -1;
      this.field2176 = -1;
      this.field2177 = -1;
      this.field2185 = -1;
      this.field2181 = -1;
      this.field2182 = 128;
      this.field2183 = 128;
      this.field2184 = 128;
      this.field2142 = 0;
      this.field2154 = 0;
      this.field2187 = 0;
      this.field2156 = 0;
      this.field2190 = false;
      this.field2163 = -1;
      this.field2169 = -1;
      this.field2170 = -1;
      this.field2193 = -1;
   }

   void method1197() {
      if (1 == this.field2157) {
         this.field2156 = 0;
      }

   }

   void method1198(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method1199(var1, var3);
      }
   }

   void method1199(class127 var1, int var2) {
      if (var2 == 1) {
         this.field2191 = var1.method549();
      } else if (var2 == 2) {
         this.field2147 = var1.method555();
      } else if (var2 == 4) {
         this.field2151 = var1.method549();
      } else if (var2 == 5) {
         this.field2152 = var1.method549();
      } else if (var2 == 6) {
         this.field2153 = var1.method549();
      } else if (var2 == 7) {
         this.field2155 = var1.method549();
         if (this.field2155 > 32767) {
            this.field2155 -= 65536;
         }
      } else if (var2 == 8) {
         this.field2141 = var1.method549();
         if (this.field2141 > 32767) {
            this.field2141 -= 65536;
         }
      } else if (var2 == 9) {
         var1.method555();
      } else if (var2 == 11) {
         this.field2157 = 1;
      } else if (var2 == 12) {
         this.field2158 = var1.method595();
      } else if (var2 == 13) {
         this.field2159 = var1.method547();
      } else if (var2 == 14) {
         this.field2180 = var1.method547();
      } else if (var2 == 16) {
         this.field2162 = true;
      } else if (var2 == 23) {
         this.field2166 = var1.method549();
         this.field2189 = var1.method547();
      } else if (var2 == 24) {
         this.field2167 = var1.method549();
      } else if (var2 == 25) {
         this.field2146 = var1.method549();
         this.field2138 = var1.method547();
      } else if (var2 == 26) {
         this.field2161 = var1.method549();
      } else if (var2 == 27) {
         this.field2150 = var1.method547();
      } else if (var2 >= 30 && var2 < 35) {
         this.field2145[var2 - 30] = var1.method555();
         if (this.field2145[var2 - 30].equalsIgnoreCase(class177.field1326)) {
            this.field2145[var2 - 30] = null;
         }
      } else if (var2 >= 35 && var2 < 40) {
         this.field2164[var2 - 35] = var1.method555();
      } else {
         int var4;
         int var5;
         if (var2 == 40) {
            var4 = var1.method547();
            this.field2186 = new short[var4];
            this.field2148 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2186[var5] = (short)var1.method549();
               this.field2148[var5] = (short)var1.method549();
            }
         } else if (var2 == 41) {
            var4 = var1.method547();
            this.field2149 = new short[var4];
            this.field2192 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field2149[var5] = (short)var1.method549();
               this.field2192[var5] = (short)var1.method549();
            }
         } else if (var2 == 42) {
            this.field2165 = var1.method548();
         } else if (var2 == 65) {
            this.field2190 = true;
         } else if (var2 == 75) {
            this.field2156 = var1.method550();
         } else if (var2 == 78) {
            this.field2172 = var1.method549();
         } else if (var2 == 79) {
            this.field2173 = var1.method549();
         } else if (var2 == 90) {
            this.field2174 = var1.method549();
         } else if (var2 == 91) {
            this.field2176 = var1.method549();
         } else if (var2 == 92) {
            this.field2175 = var1.method549();
         } else if (var2 == 93) {
            this.field2177 = var1.method549();
         } else if (var2 == 94) {
            var1.method549();
         } else if (var2 == 95) {
            this.field2160 = var1.method549();
         } else if (var2 == 97) {
            this.field2185 = var1.method549();
         } else if (var2 == 98) {
            this.field2181 = var1.method549();
         } else if (var2 >= 100 && var2 < 110) {
            if (null == this.field2178) {
               this.field2178 = new int[10];
               this.field2139 = new int[10];
            }

            this.field2178[var2 - 100] = var1.method549();
            this.field2139[var2 - 100] = var1.method549();
         } else if (var2 == 110) {
            this.field2182 = var1.method549();
         } else if (var2 == 111) {
            this.field2183 = var1.method549();
         } else if (var2 == 112) {
            this.field2184 = var1.method549();
         } else if (var2 == 113) {
            this.field2142 = var1.method548();
         } else if (var2 == 114) {
            this.field2154 = var1.method548() * 5;
         } else if (var2 == 115) {
            this.field2187 = var1.method547();
         } else if (var2 == 139) {
            this.field2163 = var1.method549();
         } else if (var2 == 140) {
            this.field2169 = var1.method549();
         } else if (var2 == 148) {
            this.field2170 = var1.method549();
         } else if (var2 == 149) {
            this.field2193 = var1.method549();
         } else if (var2 == 249) {
            this.field2171 = class89.method380(var1, this.field2171);
         }
      }

   }

   void method1213(class263 var1, class263 var2) {
      this.field2191 = var1.field2191;
      this.field2151 = var1.field2151;
      this.field2152 = var1.field2152;
      this.field2153 = var1.field2153;
      this.field2160 = var1.field2160;
      this.field2155 = var1.field2155;
      this.field2141 = var1.field2141;
      this.field2186 = var1.field2186;
      this.field2148 = var1.field2148;
      this.field2149 = var1.field2149;
      this.field2192 = var1.field2192;
      this.field2147 = var2.field2147;
      this.field2162 = var2.field2162;
      this.field2158 = var2.field2158;
      this.field2157 = 1;
   }

   void method1196(class263 var1, class263 var2) {
      this.field2191 = var1.field2191;
      this.field2151 = var1.field2151;
      this.field2152 = var1.field2152;
      this.field2153 = var1.field2153;
      this.field2160 = var1.field2160;
      this.field2155 = var1.field2155;
      this.field2141 = var1.field2141;
      this.field2186 = var2.field2186;
      this.field2148 = var2.field2148;
      this.field2149 = var2.field2149;
      this.field2192 = var2.field2192;
      this.field2147 = var2.field2147;
      this.field2162 = var2.field2162;
      this.field2157 = var2.field2157;
      this.field2159 = var2.field2159;
      this.field2180 = var2.field2180;
      this.field2150 = var2.field2150;
      this.field2166 = var2.field2166;
      this.field2167 = var2.field2167;
      this.field2172 = var2.field2172;
      this.field2146 = var2.field2146;
      this.field2161 = var2.field2161;
      this.field2173 = var2.field2173;
      this.field2174 = var2.field2174;
      this.field2175 = var2.field2175;
      this.field2176 = var2.field2176;
      this.field2177 = var2.field2177;
      this.field2187 = var2.field2187;
      this.field2145 = var2.field2145;
      this.field2156 = var2.field2156;
      this.field2164 = new String[5];
      if (var2.field2164 != null) {
         for(int var4 = 0; var4 < 4; ++var4) {
            this.field2164[var4] = var2.field2164[var4];
         }
      }

      this.field2164[4] = class177.field1581;
      this.field2158 = 0;
   }

   void method1212(class263 var1, class263 var2) {
      this.field2191 = var1.field2191;
      this.field2151 = var1.field2151;
      this.field2152 = var1.field2152;
      this.field2153 = var1.field2153;
      this.field2160 = var1.field2160;
      this.field2155 = var1.field2155;
      this.field2141 = var1.field2141;
      this.field2186 = var1.field2186;
      this.field2148 = var1.field2148;
      this.field2149 = var1.field2149;
      this.field2192 = var1.field2192;
      this.field2157 = var1.field2157;
      this.field2147 = var2.field2147;
      this.field2158 = 0;
      this.field2162 = false;
      this.field2190 = false;
   }

   public final class26 method1200(int var1) {
      int var4;
      if (this.field2178 != null && var1 > 1) {
         int var3 = -1;

         for(var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field2139[var4] && this.field2139[var4] != 0) {
               var3 = this.field2178[var4];
            }
         }

         if (var3 != -1) {
            return class423.method2062(var3).method1200(1);
         }
      }

      class26 var5 = class26.method103(class328.field2595, this.field2191, 0);
      if (null == var5) {
         return null;
      } else {
         if (this.field2182 != 128 || this.field2183 != 128 || this.field2184 != 128) {
            var5.method116(this.field2182, this.field2183, this.field2184);
         }

         if (null != this.field2186) {
            for(var4 = 0; var4 < this.field2186.length; ++var4) {
               var5.method113(this.field2186[var4], this.field2148[var4]);
            }
         }

         if (this.field2149 != null) {
            for(var4 = 0; var4 < this.field2149.length; ++var4) {
               var5.method114(this.field2149[var4], this.field2192[var4]);
            }
         }

         return var5;
      }
   }

   public final class470 method1201(int var1) {
      if (null != this.field2178 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field2139[var4] && 0 != this.field2139[var4]) {
               var3 = this.field2178[var4];
            }
         }

         if (var3 != -1) {
            return class423.method2062(var3).method1201(1);
         }
      }

      class470 var6 = (class470)field2143.method394((long)this.field2168);
      if (null != var6) {
         return var6;
      } else {
         class26 var7 = class26.method103(class328.field2595, this.field2191, 0);
         if (var7 == null) {
            return null;
         } else {
            if (128 != this.field2182 || this.field2183 != 128 || 128 != this.field2184) {
               var7.method116(this.field2182, this.field2183, this.field2184);
            }

            int var5;
            if (null != this.field2186) {
               for(var5 = 0; var5 < this.field2186.length; ++var5) {
                  var7.method113(this.field2186[var5], this.field2148[var5]);
               }
            }

            if (null != this.field2149) {
               for(var5 = 0; var5 < this.field2149.length; ++var5) {
                  var7.method114(this.field2149[var5], this.field2192[var5]);
               }
            }

            var6 = var7.method121(this.field2142 + 64, 768 + this.field2154, -50, -10, -50);
            var6.field3920 = true;
            field2143.method396(var6, (long)this.field2168);
            return var6;
         }
      }
   }

   public class263 method1202(int var1) {
      if (null != this.field2178 && var1 > 1) {
         int var3 = -1;

         for(int var4 = 0; var4 < 10; ++var4) {
            if (var1 >= this.field2139[var4] && 0 != this.field2139[var4]) {
               var3 = this.field2178[var4];
            }
         }

         if (var3 != -1) {
            return class423.method2062(var3);
         }
      }

      return this;
   }

   public final boolean method1203(int var1) {
      int var3 = this.field2166;
      int var4 = this.field2167;
      int var5 = this.field2172;
      if (var1 == 1) {
         var3 = this.field2146;
         var4 = this.field2161;
         var5 = this.field2173;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var6 = true;
         if (!class328.field2595.method1363(var3, 0)) {
            var6 = false;
         }

         if (var4 != -1 && !class328.field2595.method1363(var4, 0)) {
            var6 = false;
         }

         if (var5 != -1 && !class328.field2595.method1363(var5, 0)) {
            var6 = false;
         }

         return var6;
      }
   }

   public final class26 method1204(int var1) {
      int var3 = this.field2166;
      int var4 = this.field2167;
      int var5 = this.field2172;
      if (var1 == 1) {
         var3 = this.field2146;
         var4 = this.field2161;
         var5 = this.field2173;
      }

      if (var3 == -1) {
         return null;
      } else {
         class26 var6 = class26.method103(class328.field2595, var3, 0);
         if (var4 != -1) {
            class26 var7 = class26.method103(class328.field2595, var4, 0);
            if (var5 != -1) {
               class26 var8 = class26.method103(class328.field2595, var5, 0);
               class26[] var9 = new class26[]{var6, var7, var8};
               var6 = new class26(var9, 3);
            } else {
               class26[] var11 = new class26[]{var6, var7};
               var6 = new class26(var11, 2);
            }
         }

         if (var1 == 0 && 0 != this.field2189) {
            var6.method112(0, this.field2189, 0);
         }

         if (var1 == 1 && 0 != this.field2138) {
            var6.method112(0, this.field2138, 0);
         }

         int var10;
         if (null != this.field2186) {
            for(var10 = 0; var10 < this.field2186.length; ++var10) {
               var6.method113(this.field2186[var10], this.field2148[var10]);
            }
         }

         if (this.field2149 != null) {
            for(var10 = 0; var10 < this.field2149.length; ++var10) {
               var6.method114(this.field2149[var10], this.field2192[var10]);
            }
         }

         return var6;
      }
   }

   public final boolean method1205(int var1) {
      int var3 = this.field2174;
      int var4 = this.field2175;
      if (var1 == 1) {
         var3 = this.field2176;
         var4 = this.field2177;
      }

      if (var3 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if (!class328.field2595.method1363(var3, 0)) {
            var5 = false;
         }

         if (var4 != -1 && !class328.field2595.method1363(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   public final class26 method1206(int var1) {
      int var3 = this.field2174;
      int var4 = this.field2175;
      if (var1 == 1) {
         var3 = this.field2176;
         var4 = this.field2177;
      }

      if (var3 == -1) {
         return null;
      } else {
         class26 var5 = class26.method103(class328.field2595, var3, 0);
         if (var4 != -1) {
            class26 var6 = class26.method103(class328.field2595, var4, 0);
            class26[] var7 = new class26[]{var5, var6};
            var5 = new class26(var7, 2);
         }

         int var8;
         if (null != this.field2186) {
            for(var8 = 0; var8 < this.field2186.length; ++var8) {
               var5.method113(this.field2186[var8], this.field2148[var8]);
            }
         }

         if (null != this.field2149) {
            for(var8 = 0; var8 < this.field2149.length; ++var8) {
               var5.method114(this.field2149[var8], this.field2192[var8]);
            }
         }

         return var5;
      }
   }

   public int method1207(int var1, int var2) {
      return class288.method1424(this.field2171, var1, var2);
   }

   public String method1208(int var1, String var2) {
      class385 var5 = this.field2171;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class135 var6 = (class135)var5.method1897((long)var1);
         if (null == var6) {
            var4 = var2;
         } else {
            var4 = (String)var6.field1111;
         }
      }

      return var4;
   }

   public int method1210() {
      if (this.field2165 != -1 && null != this.field2164) {
         if (this.field2165 >= 0) {
            return this.field2164[this.field2165] != null ? this.field2165 : -1;
         } else {
            return class177.field1638.equalsIgnoreCase(this.field2164[4]) ? 4 : -1;
         }
      } else {
         return -1;
      }
   }

   boolean method1211() {
      return null != this.field2148;
   }

   boolean method1209() {
      return this.field2192 != null;
   }

   public static int method1214(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (1 == (var5 & 1)) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
      }
   }
}
