import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class class210 extends class106 {
   public static boolean field2214;
   static class164 field2206;
   static class164 field2235;
   static class31 field2210 = new class31(20);
   static class31 field2211 = new class31(8);
   static class31 field2265 = new class31(200);
   static class31 field2342 = new class31(50);
   static class473 field2212;
   static class473 field2213;
   class252 field2292;
   class452 field2288;
   int field2260;
   int field2270;
   int field2313;
   HashMap field2290;
   HashMap field2291;
   public boolean field2215 = false;
   public boolean field2232;
   public boolean field2243 = false;
   public boolean field2248;
   public boolean field2256;
   public boolean field2267 = false;
   public boolean field2272;
   public boolean field2273;
   public boolean field2281;
   public boolean field2283;
   public boolean field2294;
   public boolean field2299;
   public boolean field2304;
   public boolean field2354;
   public boolean field2363;
   public boolean field2364;
   public boolean field2365;
   public boolean field2366;
   public byte[][] field2295;
   public byte[][] field2296;
   public class122 field2261;
   public class210 field2301;
   public class210[] field2353;
   public int field2204;
   public int field2205;
   public int field2217 = -1;
   public int field2219 = 0;
   public int field2220;
   public int field2221 = 0;
   public int field2222 = 0;
   public int field2223 = 0;
   public int field2224 = 0;
   public int field2225 = 0;
   public int field2226 = 0;
   public int field2228 = 0;
   public int field2229 = 0;
   public int field2230 = 0;
   public int field2233 = 1;
   public int field2234 = -1;
   public int field2236 = 0;
   public int field2237 = 0;
   public int field2238 = 0;
   public int field2239 = 0;
   public int field2242 = 0;
   public int field2244 = 0;
   public int field2245;
   public int field2246;
   public int field2247;
   public int field2249;
   public int field2254;
   public int field2255;
   public int field2258;
   public int field2262 = 0;
   public int field2263;
   public int field2264;
   public int field2266;
   public int field2268;
   public int field2269;
   public int field2271;
   public int field2274;
   public int field2275;
   public int field2277;
   public int field2278;
   public int field2279;
   public int field2280 = 0;
   public int field2282;
   public int field2289 = 0;
   public int field2293;
   public int field2297;
   public int field2302;
   public int field2307 = -1;
   public int field2310;
   public int field2312;
   public int field2315 = 0;
   public int field2318;
   public int field2319;
   public int field2330;
   public int field2332 = 1;
   public int field2333;
   public int field2339;
   public int field2340;
   public int field2345;
   public int field2346;
   public int field2348;
   public int field2350;
   public int field2351;
   public int field2352;
   public int field2356;
   public int field2357 = 0;
   public int field2358 = 0;
   public int field2360;
   public int field2361;
   public int[] field2203;
   public int[] field2209;
   public int[] field2218;
   public int[] field2253;
   public int[] field2259;
   public int[] field2284;
   public int[] field2286;
   public int[] field2298;
   public int[] field2303;
   public int[] field2320;
   public int[] field2343;
   public int[] field2344;
   public int[] field2362;
   public int[][] field2207;
   public Object[] field2202;
   public Object[] field2208;
   public Object[] field2227;
   public Object[] field2231;
   public Object[] field2240;
   public Object[] field2241;
   public Object[] field2250;
   public Object[] field2252;
   public Object[] field2257;
   public Object[] field2285;
   public Object[] field2306;
   public Object[] field2308;
   public Object[] field2309;
   public Object[] field2311;
   public Object[] field2314;
   public Object[] field2316;
   public Object[] field2321;
   public Object[] field2323;
   public Object[] field2324;
   public Object[] field2325;
   public Object[] field2326;
   public Object[] field2327;
   public Object[] field2328;
   public Object[] field2329;
   public Object[] field2331;
   public Object[] field2334;
   public Object[] field2335;
   public Object[] field2336;
   public Object[] field2337;
   public Object[] field2338;
   public Object[] field2341;
   public Object[] field2349;
   public Object[] field2355;
   public Object[] field2359;
   public String field2216;
   public String field2251;
   public String field2276;
   public String field2305;
   public String field2317;
   public String field2322;
   public String field2347;
   public String[] field2287;
   public String[] field2300;

   static {
      field2212 = new class473(10, class404.field3527);
      field2213 = new class473(10, class404.field3527);
      field2214 = false;
   }

   public class210() {
      this.field2261 = class122.field1445;
      this.field2346 = 0;
      this.field2246 = 0;
      this.field2247 = 1;
      this.field2248 = false;
      this.field2249 = -1;
      this.field2312 = -1;
      this.field2205 = 0;
      this.field2232 = false;
      this.field2254 = 0;
      this.field2319 = 0;
      this.field2258 = 1;
      this.field2277 = -1;
      this.field2260 = 1;
      this.field2313 = -1;
      this.field2297 = -1;
      this.field2263 = -1;
      this.field2264 = 0;
      this.field2356 = 0;
      this.field2282 = 0;
      this.field2269 = 0;
      this.field2268 = 0;
      this.field2204 = 100;
      this.field2330 = 0;
      this.field2271 = 0;
      this.field2272 = false;
      this.field2273 = false;
      this.field2274 = 2;
      this.field2275 = -1;
      this.field2276 = "";
      this.field2317 = "";
      this.field2278 = 0;
      this.field2279 = 0;
      this.field2340 = 0;
      this.field2281 = false;
      this.field2333 = 0;
      this.field2266 = 0;
      this.field2270 = -1;
      this.field2293 = 0;
      this.field2294 = false;
      this.field2216 = "";
      this.field2301 = null;
      this.field2302 = 0;
      this.field2255 = 0;
      this.field2304 = false;
      this.field2305 = "";
      this.field2299 = false;
      this.field2345 = -1;
      this.field2322 = "";
      this.field2347 = class96.field1022;
      this.field2220 = -1;
      this.field2350 = 0;
      this.field2351 = 0;
      this.field2352 = 0;
      this.field2354 = false;
      this.field2283 = false;
      this.field2245 = -1;
      this.field2318 = 0;
      this.field2339 = 0;
      this.field2310 = 0;
      this.field2360 = -1;
      this.field2361 = -1;
      this.field2363 = false;
      this.field2364 = false;
      this.field2365 = false;
   }

   void method1066(class134 var1) {
      this.field2215 = false;
      this.field2348 = var1.method669();
      this.field2219 = var1.method669();
      this.field2315 = var1.method671();
      this.field2224 = var1.method672();
      this.field2225 = var1.method672();
      this.field2226 = var1.method671();
      this.field2244 = var1.method671();
      this.field2346 = var1.method669();
      this.field2234 = var1.method671();
      if (this.field2234 == 65535) {
         this.field2234 = -1;
      } else {
         this.field2234 += this.field2307 & -65536;
      }

      this.field2345 = var1.method671();
      if (65535 == this.field2345) {
         this.field2345 = -1;
      }

      int var3 = var1.method669();
      int var4;
      if (var3 > 0) {
         this.field2343 = new int[var3];
         this.field2344 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field2343[var4] = var1.method669();
            this.field2344[var4] = var1.method671();
         }
      }

      var4 = var1.method669();
      int var5;
      int var6;
      int var7;
      if (var4 > 0) {
         this.field2207 = new int[var4][];

         for(var5 = 0; var5 < var4; ++var5) {
            var6 = var1.method671();
            this.field2207[var5] = new int[var6];

            for(var7 = 0; var7 < var6; ++var7) {
               this.field2207[var5][var7] = var1.method671();
               if (65535 == this.field2207[var5][var7]) {
                  this.field2207[var5][var7] = -1;
               }
            }
         }
      }

      if (this.field2348 == 0) {
         this.field2238 = var1.method671();
         this.field2267 = var1.method669() == 1;
      }

      if (this.field2348 == 1) {
         var1.method671();
         var1.method669();
      }

      if (this.field2348 == 2) {
         this.field2209 = new int[this.field2244 * this.field2226];
         this.field2253 = new int[this.field2226 * this.field2244];
         var5 = var1.method669();
         if (var5 == 1) {
            this.field2293 |= 268435456;
         }

         var6 = var1.method669();
         if (var6 == 1) {
            this.field2293 |= 1073741824;
         }

         var7 = var1.method669();
         if (var7 == 1) {
            this.field2293 |= Integer.MIN_VALUE;
         }

         int var8 = var1.method669();
         if (var8 == 1) {
            this.field2293 |= 536870912;
         }

         this.field2333 = var1.method669();
         this.field2266 = var1.method669();
         this.field2284 = new int[20];
         this.field2203 = new int[20];
         this.field2286 = new int[20];

         int var9;
         for(var9 = 0; var9 < 20; ++var9) {
            int var10 = var1.method669();
            if (var10 == 1) {
               this.field2284[var9] = var1.method672();
               this.field2203[var9] = var1.method672();
               this.field2286[var9] = var1.method717();
            } else {
               this.field2286[var9] = -1;
            }
         }

         this.field2287 = new String[5];

         for(var9 = 0; var9 < 5; ++var9) {
            String var12 = var1.method677();
            if (var12.length() > 0) {
               this.field2287[var9] = var12;
               this.field2293 |= 1 << var9 + 23;
            }
         }
      }

      if (this.field2348 == 3) {
         this.field2243 = var1.method669() == 1;
      }

      if (4 == this.field2348 || this.field2348 == 1) {
         this.field2279 = var1.method669();
         this.field2340 = var1.method669();
         this.field2278 = var1.method669();
         this.field2275 = var1.method671();
         if (65535 == this.field2275) {
            this.field2275 = -1;
         }

         this.field2281 = var1.method669() == 1;
      }

      if (4 == this.field2348) {
         this.field2276 = var1.method677();
         this.field2317 = var1.method677();
      }

      if (this.field2348 == 1 || this.field2348 == 3 || 4 == this.field2348) {
         this.field2239 = var1.method717();
      }

      if (3 == this.field2348 || this.field2348 == 4) {
         this.field2357 = var1.method717();
         this.field2222 = var1.method717();
         this.field2280 = var1.method717();
      }

      if (this.field2348 == 5) {
         this.field2249 = var1.method717();
         this.field2312 = var1.method717();
      }

      if (6 == this.field2348) {
         this.field2258 = 1;
         this.field2277 = var1.method671();
         if (this.field2277 == 65535) {
            this.field2277 = -1;
         }

         this.field2260 = 1;
         this.field2313 = var1.method671();
         if (65535 == this.field2313) {
            this.field2313 = -1;
         }

         this.field2297 = var1.method671();
         if (65535 == this.field2297) {
            this.field2297 = -1;
         }

         this.field2263 = var1.method671();
         if (65535 == this.field2263) {
            this.field2263 = -1;
         }

         this.field2204 = var1.method671();
         this.field2282 = var1.method671();
         this.field2269 = var1.method671();
      }

      if (this.field2348 == 7) {
         this.field2209 = new int[this.field2226 * this.field2244];
         this.field2253 = new int[this.field2226 * this.field2244];
         this.field2279 = var1.method669();
         this.field2275 = var1.method671();
         if (this.field2275 == 65535) {
            this.field2275 = -1;
         }

         this.field2281 = var1.method669() == 1;
         this.field2239 = var1.method717();
         this.field2333 = var1.method672();
         this.field2266 = var1.method672();
         var5 = var1.method669();
         if (var5 == 1) {
            this.field2293 |= 1073741824;
         }

         this.field2287 = new String[5];

         for(var6 = 0; var6 < 5; ++var6) {
            String var11 = var1.method677();
            if (var11.length() > 0) {
               this.field2287[var6] = var11;
               this.field2293 |= 1 << var6 + 23;
            }
         }
      }

      if (8 == this.field2348) {
         this.field2276 = var1.method677();
      }

      if (this.field2219 == 2 || this.field2348 == 2) {
         this.field2305 = var1.method677();
         this.field2322 = var1.method677();
         var5 = var1.method671() & 63;
         this.field2293 |= var5 << 11;
      }

      if (this.field2219 == 1 || 4 == this.field2219 || 5 == this.field2219 || this.field2219 == 6) {
         this.field2347 = var1.method677();
         if (this.field2347.length() == 0) {
            if (this.field2219 == 1) {
               this.field2347 = class96.field1022;
            }

            if (4 == this.field2219) {
               this.field2347 = class96.field1023;
            }

            if (5 == this.field2219) {
               this.field2347 = class96.field1023;
            }

            if (this.field2219 == 6) {
               this.field2347 = class96.field1024;
            }
         }
      }

      if (this.field2219 == 1 || this.field2219 == 4 || this.field2219 == 5) {
         this.field2293 |= 4194304;
      }

      if (this.field2219 == 6) {
         this.field2293 |= 1;
      }

   }

   void method1085(class134 var1) {
      var1.method669();
      this.field2215 = true;
      this.field2348 = var1.method669();
      this.field2315 = var1.method671();
      this.field2224 = var1.method672();
      this.field2225 = var1.method672();
      this.field2226 = var1.method671();
      if (this.field2348 == 9) {
         this.field2244 = var1.method672();
      } else {
         this.field2244 = var1.method671();
      }

      this.field2221 = var1.method670();
      this.field2223 = var1.method670();
      this.field2262 = var1.method670();
      this.field2358 = var1.method670();
      this.field2234 = var1.method671();
      if (this.field2234 == 65535) {
         this.field2234 = -1;
      } else {
         this.field2234 += this.field2307 & -65536;
      }

      this.field2267 = var1.method669() == 1;
      if (0 == this.field2348) {
         this.field2237 = var1.method671();
         this.field2238 = var1.method671();
         this.field2363 = var1.method669() == 1;
      }

      if (5 == this.field2348) {
         this.field2249 = var1.method717();
         this.field2205 = var1.method671();
         this.field2232 = var1.method669() == 1;
         this.field2346 = var1.method669();
         this.field2254 = var1.method669();
         this.field2319 = var1.method717();
         this.field2256 = var1.method669() == 1;
         this.field2366 = var1.method669() == 1;
      }

      if (this.field2348 == 6) {
         this.field2258 = 1;
         this.field2277 = var1.method671();
         if (65535 == this.field2277) {
            this.field2277 = -1;
         }

         this.field2264 = var1.method672();
         this.field2356 = var1.method672();
         this.field2282 = var1.method671();
         this.field2269 = var1.method671();
         this.field2268 = var1.method671();
         this.field2204 = var1.method671();
         this.field2297 = var1.method671();
         if (65535 == this.field2297) {
            this.field2297 = -1;
         }

         this.field2272 = var1.method669() == 1;
         var1.method671();
         if (0 != this.field2221) {
            this.field2330 = var1.method671();
         }

         if (this.field2223 != 0) {
            var1.method671();
         }
      }

      if (this.field2348 == 4) {
         this.field2275 = var1.method671();
         if (this.field2275 == 65535) {
            this.field2275 = -1;
         }

         this.field2276 = var1.method677();
         this.field2278 = var1.method669();
         this.field2279 = var1.method669();
         this.field2340 = var1.method669();
         this.field2281 = var1.method669() == 1;
         this.field2239 = var1.method717();
      }

      if (3 == this.field2348) {
         this.field2239 = var1.method717();
         this.field2243 = var1.method669() == 1;
         this.field2346 = var1.method669();
      }

      if (9 == this.field2348) {
         this.field2247 = var1.method669();
         this.field2239 = var1.method717();
         this.field2248 = var1.method669() == 1;
      }

      this.field2293 = var1.method673();
      this.field2216 = var1.method677();
      int var3 = var1.method669();
      if (var3 > 0) {
         this.field2300 = new String[var3];

         for(int var4 = 0; var4 < var3; ++var4) {
            this.field2300[var4] = var1.method677();
         }
      }

      this.field2302 = var1.method669();
      this.field2255 = var1.method669();
      this.field2304 = var1.method669() == 1;
      this.field2305 = var1.method677();
      this.field2349 = this.method1065(var1);
      this.field2308 = this.method1065(var1);
      this.field2314 = this.method1065(var1);
      this.field2231 = this.method1065(var1);
      this.field2306 = this.method1065(var1);
      this.field2257 = this.method1065(var1);
      this.field2208 = this.method1065(var1);
      this.field2321 = this.method1065(var1);
      this.field2323 = this.method1065(var1);
      this.field2252 = this.method1065(var1);
      this.field2355 = this.method1065(var1);
      this.field2241 = this.method1065(var1);
      this.field2309 = this.method1065(var1);
      this.field2250 = this.method1065(var1);
      this.field2311 = this.method1065(var1);
      this.field2359 = this.method1065(var1);
      this.field2316 = this.method1065(var1);
      this.field2326 = this.method1065(var1);
      this.field2320 = this.method1068(var1);
      this.field2259 = this.method1068(var1);
      this.field2218 = this.method1068(var1);
   }

   Object[] method1065(class134 var1) {
      int var3 = var1.method669();
      if (var3 == 0) {
         return null;
      } else {
         Object[] var4 = new Object[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            int var6 = var1.method669();
            if (var6 == 0) {
               var4[var5] = new Integer(var1.method717());
            } else if (var6 == 1) {
               var4[var5] = var1.method677();
            }
         }

         this.field2299 = true;
         return var4;
      }
   }

   int[] method1068(class134 var1) {
      int var3 = var1.method669();
      if (var3 == 0) {
         return null;
      } else {
         int[] var4 = new int[var3];

         for(int var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var1.method717();
         }

         return var4;
      }
   }

   public void method1090(int var1, int var2) {
      int var4 = this.field2209[var2];
      this.field2209[var2] = this.field2209[var1];
      this.field2209[var1] = var4;
      var4 = this.field2253[var2];
      this.field2253[var2] = this.field2253[var1];
      this.field2253[var1] = var4;
   }

   public class319 method1069(boolean var1, class163 var2) {
      field2214 = false;
      if (null != this.field2251) {
         class319 var4 = this.method1070(var2);
         if (var4 != null) {
            return var4;
         }
      }

      int var8;
      if (var1) {
         var8 = this.field2312;
      } else {
         var8 = this.field2249;
      }

      if (var8 == -1) {
         return null;
      } else {
         long var5 = ((long)this.field2254 << 36) + (long)var8 + ((this.field2256 ? 1L : 0L) << 38) + ((this.field2366 ? 1L : 0L) << 39) + ((long)this.field2319 << 40);
         class319 var7 = (class319)field2265.method161(var5);
         if (null != var7) {
            return var7;
         } else {
            var7 = class360.method1714(field2235, var8, 0);
            if (var7 == null) {
               field2214 = true;
               return null;
            } else {
               this.method1067(var7);
               field2265.method163(var7, var5);
               return var7;
            }
         }
      }
   }

   class319 method1070(class163 var1) {
      if (!this.method1071()) {
         return this.method1088(var1);
      } else {
         String var3 = this.field2251 + (this.field2256 ? 1 : 0) + (this.field2366 ? 1 : 0) + this.field2254 + this.field2319;
         class319 var4 = (class319)field2213.method2294(var3);
         if (null == var4) {
            class319 var5 = this.method1088(var1);
            if (null != var5) {
               var4 = var5.method1531();
               this.method1067(var4);
               field2213.method2292(var3, var4);
            }
         }

         return var4;
      }
   }

   class319 method1088(class163 var1) {
      if (this.field2251 != null && var1 != null) {
         class36 var3 = (class36)field2212.method2294(this.field2251);
         if (var3 == null) {
            var3 = new class36(this.field2251, var1);
            field2212.method2292(this.field2251, var3);
         }

         return var3.method181();
      } else {
         return null;
      }
   }

   boolean method1071() {
      return this.field2256 || this.field2366 || this.field2254 != 0 || 0 != this.field2319;
   }

   void method1067(class319 var1) {
      if (this.field2256) {
         var1.method1559();
      }

      if (this.field2366) {
         var1.method1535();
      }

      if (this.field2254 > 0) {
         var1.method1534(this.field2254);
      }

      if (this.field2254 >= 1) {
         var1.method1536(1);
      }

      if (this.field2254 >= 2) {
         var1.method1536(16777215);
      }

      if (0 != this.field2319) {
         var1.method1561(this.field2319);
      }

   }

   public class394 method1096() {
      field2214 = false;
      if (this.field2275 == -1) {
         return null;
      } else {
         class394 var2 = (class394)field2210.method161((long)this.field2275);
         if (null != var2) {
            return var2;
         } else {
            var2 = class238.method1211(field2235, class81.field929, this.field2275, 0);
            if (null != var2) {
               field2210.method163(var2, (long)this.field2275);
            } else {
               field2214 = true;
            }

            return var2;
         }
      }
   }

   public class319 method1073(int var1) {
      field2214 = false;
      if (var1 >= 0 && var1 < this.field2286.length) {
         int var3 = this.field2286[var1];
         if (var3 == -1) {
            return null;
         } else {
            class319 var4 = (class319)field2265.method161((long)var3);
            if (var4 != null) {
               return var4;
            } else {
               var4 = class360.method1714(field2235, var3, 0);
               if (null != var4) {
                  field2265.method163(var4, (long)var3);
               } else {
                  field2214 = true;
               }

               return var4;
            }
         }
      } else {
         return null;
      }
   }

   public class491 method1093(class79 var1, int var2, boolean var3, class392 var4, class272 var5, class490 var6) {
      field2214 = false;
      int var8;
      int var9;
      if (var3) {
         var8 = this.field2260;
         var9 = this.field2313;
      } else {
         var8 = this.field2258;
         var9 = this.field2277;
      }

      if (var8 == 6) {
         if (var5 == null) {
            return null;
         }

         var9 = var5.field2711;
      }

      if (var8 == 0) {
         return null;
      } else if (var8 == 1 && var9 == -1) {
         return null;
      } else {
         long var10 = (long)(var9 + (var8 << 16));
         if (var6 != null) {
            var10 |= var6.field4041 << 20;
         }

         class491 var12 = (class491)field2342.method161(var10);
         if (var12 == null) {
            class311 var13 = null;
            int var14 = 64;
            int var15 = 768;
            switch(var8) {
            case 1:
               var13 = class311.method1489(field2206, var9, 0);
               break;
            case 2:
               var13 = class190.method984(var9, (byte)40).method1285((class490)null);
               break;
            case 3:
               var13 = var4 != null ? var4.method1907() : null;
               break;
            case 4:
               class458 var16 = class272.method1294(var9);
               var13 = var16.method2169(10);
               var14 += var16.field3759;
               var15 += var16.field3771;
            case 5:
            default:
               break;
            case 6:
               var13 = class190.method984(var9, (byte)45).method1285(var6);
            }

            if (null == var13) {
               field2214 = true;
               return null;
            }

            var12 = var13.method1507(var14, var15, -50, -10, -50);
            field2342.method163(var12, var10);
         }

         if (var1 != null) {
            var12 = var1.method427(var12, var2);
         }

         return var12;
      }
   }

   public class400 method1074(boolean var1) {
      if (-1 == this.field2312) {
         var1 = false;
      }

      int var3 = var1 ? this.field2312 : this.field2249;
      if (var3 == -1) {
         return null;
      } else {
         long var4 = ((this.field2366 ? 1L : 0L) << 39) + ((this.field2256 ? 1L : 0L) << 38) + ((long)this.field2254 << 36) + (long)var3 + ((long)this.field2319 << 40);
         class400 var6 = (class400)field2211.method161(var4);
         if (null != var6) {
            return var6;
         } else {
            class319 var7 = this.method1069(var1, (class163)null);
            if (null == var7) {
               return null;
            } else {
               class319 var8 = var7.method1562();
               int[] var9 = new int[var8.field3013];
               int[] var10 = new int[var8.field3013];

               for(int var11 = 0; var11 < var8.field3013; ++var11) {
                  int var12 = 0;
                  int var13 = var8.field3014;

                  int var14;
                  for(var14 = 0; var14 < var8.field3014; ++var14) {
                     if (var8.field3019[var14 + var8.field3014 * var11] == 0) {
                        var12 = var14;
                        break;
                     }
                  }

                  for(var14 = var8.field3014 - 1; var14 >= var12; --var14) {
                     if (0 == var8.field3019[var14 + var8.field3014 * var11]) {
                        var13 = var14 + 1;
                        break;
                     }
                  }

                  var9[var11] = var12;
                  var10[var11] = var13 - var12;
               }

               var6 = new class400(var8.field3014, var8.field3013, var10, var9, var3);
               field2211.method163(var6, var4);
               return var6;
            }
         }
      }
   }

   public void method1075(int var1, String var2) {
      if (this.field2300 == null || this.field2300.length <= var1) {
         String[] var4 = new String[var1 + 1];
         if (this.field2300 != null) {
            for(int var5 = 0; var5 < this.field2300.length; ++var5) {
               var4[var5] = this.field2300[var5];
            }
         }

         this.field2300 = var4;
      }

      this.field2300[var1] = var2;
   }

   public boolean method1101() {
      return !this.field2215 || 0 == this.field2348 || this.field2348 == 11 || this.field2299 || this.field2315 == 1338 || this.field2348 == 12;
   }

   public boolean method1092() {
      return this.field2348 == 11 || 12 == this.field2348;
   }

   public void method1098(String var1, class163 var2, long var3) {
      if (11 == this.field2348 && -1L != var3) {
         var1 = var1.replaceAll("%userid%", Long.toString(var3));
         this.field2288 = new class452();
         if (!this.field2288.method2130(var1, var2)) {
            this.field2288 = null;
         } else {
            if (this.field2290 == null || null == this.field2291) {
               this.method1091();
            }

         }
      }
   }

   void method1091() {
      this.field2290 = new HashMap();
      this.field2291 = new HashMap();
   }

   public void method1077(int var1, int var2) {
      if (this.field2348 == 11) {
         if (null == this.field2290) {
            this.method1091();
         }

         this.field2290.put(var1, var2);
      }
   }

   public void method1072(String var1, int var2) {
      if (11 == this.field2348) {
         if (this.field2291 == null) {
            this.method1091();
         }

         this.field2291.put(var1, var2);
      }
   }

   public boolean method1079() {
      return 2 == this.field2270;
   }

   public int method1080(String var1) {
      return this.field2348 == 11 && null != this.field2288 && this.method1079() ? this.field2288.method2133(var1) : -1;
   }

   public String method1078(String var1) {
      return 11 == this.field2348 && null != this.field2288 && this.method1079() ? this.field2288.method2134(var1) : null;
   }

   public int method1081() {
      return this.field2291 != null && this.field2291.size() > 0 ? 1 : 0;
   }

   public int method1082() {
      if (11 == this.field2348 && this.field2288 != null && null != this.field2291 && !this.field2291.isEmpty()) {
         String var2 = this.field2288.method2136();
         return null != var2 && this.field2291.containsKey(this.field2288.method2136()) ? ((Integer)this.field2291.get(var2)).intValue() : -1;
      } else {
         return -1;
      }
   }

   public String method1083() {
      if (this.field2348 == 11 && this.field2288 != null) {
         String var2 = this.field2288.method2136();
         Iterator var3 = this.field2288.method2137().iterator();

         while(var3.hasNext()) {
            class300 var4 = (class300)var3.next();
            String var5 = String.format("%%%S%%", var4.method1417());
            if (var4.method1418() == 0) {
               var2.replaceAll(var5, Integer.toString(var4.method1420()));
            } else {
               var2.replaceAll(var5, var4.method1419());
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public int[] method1084() {
      if (11 == this.field2348 && this.field2288 != null) {
         int[] var2 = new int[3];
         int var3 = 0;
         Iterator var4 = this.field2288.method2137().iterator();

         while(var4.hasNext()) {
            class300 var5 = (class300)var4.next();
            if (!var5.method1417().equals("user_id")) {
               if (var5.method1418() != 0) {
                  return null;
               }

               var2[var3++] = var5.method1420();
               if (var3 > 3) {
                  return null;
               }
            }
         }

         return var2;
      } else {
         return null;
      }
   }

   public boolean method1097(class163 var1) {
      if (this.field2348 == 11 && null != this.field2288) {
         this.field2288.method2131(var1);
         if (this.field2288.method2132() != this.field2270) {
            this.field2270 = this.field2288.method2132();
            if (this.field2270 >= 100) {
               return true;
            }

            if (2 == this.field2270) {
               this.method1086();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   void method1086() {
      this.field2363 = true;
      ArrayList var2 = this.field2288.method2141();
      ArrayList var3 = this.field2288.method2135();
      int var4 = var2.size() + var3.size();
      this.field2353 = new class210[var4];
      int var5 = 0;

      Iterator var6;
      class210 var8;
      for(var6 = var2.iterator(); var6.hasNext(); this.field2353[var5++] = var8) {
         class147 var7 = (class147)var6.next();
         var8 = class479.method2312(5, this, var5, 0, 0, 0, 0, var7.field1563);
         var8.field2251 = var7.field1562.method2080();
         class36 var9 = new class36(var7.field1562);
         field2212.method2292(var8.field2251, var9);
      }

      for(var6 = var3.iterator(); var6.hasNext(); this.field2353[var5++] = var8) {
         class357 var10 = (class357)var6.next();
         var8 = class479.method2312(4, this, var5, 0, 0, 0, 0, var10.field3198);
         var8.field2276 = var10.field3197;
         var8.field2275 = ((Integer)this.field2290.get(var10.field3199)).intValue();
         var8.field2279 = var10.field3200;
         var8.field2340 = var10.field3201;
      }

   }

   public void method1095() {
      this.field2292 = new class252();

      for(int var2 = 1; var2 <= 12; ++var2) {
         this.field2292.field2627.method1966(var2, 0);
      }

      for(char var3 = 0; var3 < ' '; ++var3) {
         this.field2292.field2627.method1963(var3, 0);
      }

      this.field2292.field2627.method1963('\u0080', 0);
      this.field2292.field2627.method1966(82, 2);
      this.field2292.field2627.method1966(81, 2);
      this.field2292.field2627.method1966(86, 2);
   }

   public class459 method1076() {
      return null != this.field2292 ? this.field2292.field2630 : null;
   }

   public class138 method1100() {
      return null != this.field2292 ? this.field2292.field2628 : null;
   }

   public class402 method1089() {
      return this.field2292 != null ? this.field2292.field2627 : null;
   }

   public class252 method1087() {
      return this.field2292;
   }

   boolean method1099(class459 var1) {
      boolean var3 = false;
      if (null != this.field2276 && !this.field2276.isEmpty()) {
         var3 |= var1.method2188(class329.method1596(this.field2276));
         this.field2276 = "";
      }

      if (null != this.field2317 && !this.field2317.isEmpty()) {
         var3 |= var1.method2262(class329.method1596(this.field2317));
         this.field2317 = "";
      }

      return var3;
   }

   public boolean method1094() {
      class459 var2 = this.method1076();
      if (var2 == null) {
         return false;
      } else {
         boolean var3 = false;
         if (!var2.method2257() && this.field2275 != -1) {
            int var4 = var2.method2231();
            int var5 = var2.method2232();
            int var6 = var2.method2214();
            int var7 = var2.method2229();
            class394 var8 = this.method1096();
            if (var8 != null) {
               var3 |= var2.method2189(var8);
               var3 |= this.method1099(var2);
               var3 |= var2.method2194(var4, var5);
               var3 |= var2.method2207(var6, var7);
            }
         } else if (var2.method2257()) {
            var3 |= this.method1099(var2);
         }

         var2.method2185();
         return var3;
      }
   }

   static String method1102(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         if (var2 && var0 >= 0) {
            int var4 = 2;

            for(int var5 = var0 / var1; var5 != 0; ++var4) {
               var5 /= var1;
            }

            char[] var6 = new char[var4];
            var6[0] = '+';

            for(int var7 = var4 - 1; var7 > 0; --var7) {
               int var8 = var0;
               var0 /= var1;
               int var9 = var8 - var0 * var1;
               if (var9 >= 10) {
                  var6[var7] = (char)(var9 + 87);
               } else {
                  var6[var7] = (char)(var9 + 48);
               }
            }

            return new String(var6);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }

   static void method1103() {
      if (client.field592) {
         class210 var1 = class34.method169(class307.field2899, client.field593);
         if (var1 != null && null != var1.field2231) {
            class169 var2 = new class169();
            var2.field1848 = var1;
            var2.field1850 = var1.field2231;
            class194.method1001(var2);
         }

         client.field594 = -1;
         client.field592 = false;
         class214.method1117(var1);
      }
   }
}
