import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class272 {
   static final class460 field2244;
   static final class460 field2245;
   static final class460 field2254;
   boolean field2267 = false;
   boolean field2278 = true;
   boolean field2283 = false;
   class181 field2239;
   class222 field2255;
   class266 field2249;
   class274 field2241;
   class274 field2242;
   class274 field2243;
   class344[] field2285;
   class46 field2251;
   class46 field2252;
   class46 field2253;
   class464 field2289 = null;
   class58 field2247;
   float field2260;
   float field2266;
   int field2240 = -1;
   int field2246;
   int field2256;
   int field2258 = -1;
   int field2259 = -1;
   int field2261 = -1;
   int field2262 = -1;
   int field2263 = -1;
   int field2264 = 3;
   int field2265 = -1;
   int field2269 = -1;
   int field2270 = -1;
   int field2272 = -1;
   int field2273 = -1;
   int field2274 = -1;
   int field2276 = 50;
   int field2277;
   int field2279 = -1;
   int field2284 = 0;
   int field2288;
   int field2291;
   int field2292 = -1;
   int field2293 = -1;
   HashMap field2248;
   HashMap field2250;
   HashSet field2257 = new HashSet();
   HashSet field2268 = null;
   HashSet field2271 = new HashSet();
   HashSet field2280 = new HashSet();
   HashSet field2281 = new HashSet();
   HashSet field2282 = new HashSet();
   Iterator field2287;
   List field2286;
   long field2275;
   final int[] field2294 = new int[]{1008, 1009, 1010, 1011, 1012};
   public boolean field2290 = false;

   static {
      field2244 = class460.field3810;
      field2245 = class460.field3811;
      field2254 = class460.field3807;
   }

   public void method1279(class274 var1, class274 var2, class274 var3, class58 var4, HashMap var5, class344[] var6) {
      this.field2285 = var6;
      this.field2241 = var1;
      this.field2242 = var2;
      this.field2243 = var3;
      this.field2247 = var4;
      this.field2248 = new HashMap();
      this.field2248.put(class221.field1903, var5.get(field2244));
      this.field2248.put(class221.field1902, var5.get(field2245));
      this.field2248.put(class221.field1904, var5.get(field2254));
      this.field2255 = new class222(var1);
      int var8 = this.field2241.method1356(class430.field3573.field3571);
      int[] var9 = this.field2241.method1351(var8);
      this.field2250 = new HashMap(var9.length);

      for(int var10 = 0; var10 < var9.length; ++var10) {
         class127 var11 = new class127(this.field2241.method1365(var8, var9[var10]));
         class46 var12 = new class46();
         var12.method221(var11, var9[var10]);
         this.field2250.put(var12.method227(), var12);
         if (var12.method238()) {
            this.field2251 = var12;
         }
      }

      this.method1292(this.field2251);
      this.field2253 = null;
   }

   public void method1280() {
      class144.field1152.method445(5);
   }

   public void method1281(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field2255.method984()) {
         this.method1334();
         this.method1322();
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field2260));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field2260));
            List var11 = this.field2239.method823(this.field2256 - var9 / 2 - 1, this.field2246 - var10 / 2 - 1, this.field2256 + var9 / 2 + 1, 1 + var10 / 2 + this.field2246, var4, var5, var6, var7, var1, var2);
            HashSet var12 = new HashSet();

            Iterator var13;
            class389 var14;
            class488 var15;
            class413 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class396.method1949(var15)) {
               var14 = (class389)var13.next();
               var12.add(var14);
               var15 = new class488();
               var16 = new class413(var14.method1910(), var14.field3274, var14.field3277);
               var15.method2394(new Object[]{var16, var1, var2});
               if (this.field2280.contains(var14)) {
                  var15.method2395(17);
               } else {
                  var15.method2395(15);
               }
            }

            var13 = this.field2280.iterator();

            while(var13.hasNext()) {
               var14 = (class389)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new class488();
                  var16 = new class413(var14.method1910(), var14.field3274, var14.field3277);
                  var15.method2394(new Object[]{var16, var1, var2});
                  var15.method2395(16);
                  class396.method1949(var15);
               }
            }

            this.field2280 = var12;
         }
      }
   }

   public void method1282(int var1, int var2, boolean var3, boolean var4) {
      long var6 = class152.method711();
      this.method1283(var1, var2, var4, var6);
      if (!this.method1287() && (var4 || var3) && !class372.method1840()) {
         if (var4) {
            this.field2292 = var1;
            this.field2274 = var2;
            this.field2273 = this.field2256;
            this.field2272 = this.field2246;
         }

         if (-1 != this.field2273) {
            int var8 = var1 - this.field2292;
            int var9 = var2 - this.field2274;
            this.method1285(this.field2273 - (int)((float)var8 / this.field2266), (int)((float)var9 / this.field2266) + this.field2272, false);
         }
      } else {
         this.method1286();
      }

      if (var4) {
         this.field2275 = var6;
         this.field2288 = var1;
         this.field2277 = var2;
      }

   }

   void method1283(int var1, int var2, boolean var3, long var4) {
      if (null != this.field2252) {
         int var6 = (int)((float)this.field2256 + ((float)(var1 - this.field2261) - (float)this.method1305() * this.field2260 / 2.0F) / this.field2260);
         int var7 = (int)((float)this.field2246 - ((float)(var2 - this.field2265) - (float)this.method1306() * this.field2260 / 2.0F) / this.field2260);
         this.field2289 = this.field2252.method223(var6 + this.field2252.method236() * 64, var7 + this.field2252.method231() * 64);
         if (null != this.field2289 && var3) {
            class432 var8 = client.field460;
            int var11;
            int var12;
            if (class300.method1451() && var8.method2132(82) && var8.method2132(81)) {
               int var14 = this.field2289.field3852;
               var11 = this.field2289.field3853;
               var12 = this.field2289.field3851;
               class299 var13 = class480.method2370(class356.field3003, client.field279.field4042);
               var13.field2403.method584(var11);
               var13.field2403.method566(var12);
               var13.field2403.method572(var14);
               var13.field2403.method581(0);
               client.field279.method2389(var13);
            } else {
               boolean var10 = true;
               if (this.field2278) {
                  var11 = var1 - this.field2288;
                  var12 = var2 - this.field2277;
                  if (var4 - this.field2275 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  class299 var15 = class480.method2370(class356.field2991, client.field279.field4042);
                  var15.field2403.method534(this.field2289.method2278());
                  client.field279.method2389(var15);
                  this.field2275 = 0L;
               }
            }
         }
      } else {
         this.field2289 = null;
      }

   }

   void method1334() {
      if (null != class214.field1874) {
         this.field2260 = this.field2266;
      } else {
         if (this.field2260 < this.field2266) {
            this.field2260 = Math.min(this.field2266, this.field2260 + this.field2260 / 30.0F);
         }

         if (this.field2260 > this.field2266) {
            this.field2260 = Math.max(this.field2266, this.field2260 - this.field2260 / 30.0F);
         }

      }
   }

   void method1322() {
      if (this.method1287()) {
         int var2 = this.field2258 - this.field2256;
         int var3 = this.field2259 - this.field2246;
         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method1285(var2 + this.field2256, this.field2246 + var3, true);
         if (this.field2258 == this.field2256 && this.field2259 == this.field2246) {
            this.field2258 = -1;
            this.field2259 = -1;
         }

      }
   }

   final void method1285(int var1, int var2, boolean var3) {
      this.field2256 = var1;
      this.field2246 = var2;
      class152.method711();
      if (var3) {
         this.method1286();
      }

   }

   final void method1286() {
      this.field2274 = -1;
      this.field2292 = -1;
      this.field2272 = -1;
      this.field2273 = -1;
   }

   boolean method1287() {
      return this.field2258 != -1 && this.field2259 != -1;
   }

   public class46 method1288(int var1, int var2, int var3) {
      Iterator var5 = this.field2250.values().iterator();

      class46 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class46)var5.next();
      } while(!var6.method240(var1, var2, var3));

      return var6;
   }

   public void method1289(int var1, int var2, int var3, boolean var4) {
      class46 var6 = this.method1288(var1, var2, var3);
      if (var6 == null) {
         if (!var4) {
            return;
         }

         var6 = this.field2251;
      }

      boolean var7 = false;
      if (var6 != this.field2253 || var4) {
         this.field2253 = var6;
         this.method1292(var6);
         var7 = true;
      }

      if (var7 || var4) {
         this.method1294(var1, var2, var3);
      }

   }

   public void method1290(int var1) {
      class46 var3 = this.method1301(var1);
      if (null != var3) {
         this.method1292(var3);
      }

   }

   public int method1331() {
      return this.field2252 == null ? -1 : this.field2252.method225();
   }

   public class46 method1291() {
      return this.field2252;
   }

   void method1292(class46 var1) {
      if (this.field2252 == null || this.field2252 != var1) {
         this.method1293(var1);
         this.method1294(-1, -1, -1);
      }
   }

   void method1293(class46 var1) {
      this.field2252 = var1;
      this.field2239 = new class181(this.field2285, this.field2248, this.field2242, this.field2243);
      this.field2255.method983(this.field2252.method227());
   }

   public void method1323(class46 var1, class464 var2, class464 var3, boolean var4) {
      if (var1 != null) {
         if (this.field2252 == null || var1 != this.field2252) {
            this.method1293(var1);
         }

         if (!var4 && this.field2252.method240(var2.field3851, var2.field3852, var2.field3853)) {
            this.method1294(var2.field3851, var2.field3852, var2.field3853);
         } else {
            this.method1294(var3.field3851, var3.field3852, var3.field3853);
         }

      }
   }

   void method1294(int var1, int var2, int var3) {
      if (null != this.field2252) {
         int[] var5 = this.field2252.method237(var1, var2, var3);
         if (null == var5) {
            var5 = this.field2252.method237(this.field2252.method242(), this.field2252.method233(), this.field2252.method235());
         }

         this.method1285(var5[0] - this.field2252.method236() * 64, var5[1] - this.field2252.method231() * 64, true);
         this.field2258 = -1;
         this.field2259 = -1;
         this.field2260 = this.method1298(this.field2252.method229());
         this.field2266 = this.field2260;
         this.field2286 = null;
         this.field2287 = null;
         this.field2239.method819();
      }
   }

   public void method1295(int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[4];
      class162.method744(var7);
      class162.method742(var1, var2, var3 + var1, var2 + var4);
      class162.method749(var1, var2, var3, var4, -16777216);
      int var8 = this.field2255.method982();
      if (var8 < 100) {
         this.method1297(var1, var2, var3, var4, var8);
      } else {
         if (!this.field2239.method825()) {
            this.field2239.method829(this.field2241, this.field2252.method227(), client.field222);
            if (!this.field2239.method825()) {
               return;
            }
         }

         if (this.field2268 != null) {
            ++this.field2270;
            if (this.field2270 % this.field2276 == 0) {
               this.field2270 = 0;
               ++this.field2269;
            }

            if (this.field2269 >= this.field2264 && !this.field2267) {
               this.field2268 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field2260));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field2260));
         class400.field3373 = client.field228 >= 209;
         this.field2239.method820(this.field2256 - var9 / 2, this.field2246 - var10 / 2, var9 / 2 + this.field2256, var10 / 2 + this.field2246, var1, var2, var3 + var1, var4 + var2);
         if (!this.field2283) {
            boolean var11 = false;
            if (var5 - this.field2284 > 100) {
               this.field2284 = var5;
               var11 = true;
            }

            this.field2239.method821(this.field2256 - var9 / 2, this.field2246 - var10 / 2, this.field2256 + var9 / 2, this.field2246 + var10 / 2, var1, var2, var3 + var1, var4 + var2, this.field2282, this.field2268, this.field2270, this.field2276, var11);
         }

         this.method1313(var1, var2, var3, var4, var9, var10);
         if (class300.method1451() && this.field2290 && this.field2289 != null) {
            this.field2247.method2025("Coord: " + this.field2289, class162.field1236 + 10, class162.field1234 + 20, 16776960, -1);
         }

         this.field2262 = var9;
         this.field2263 = var10;
         this.field2261 = var1;
         this.field2265 = var2;
         class162.method745(var7);
      }
   }

   boolean method1324(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field2249 == null) {
         return true;
      } else if (this.field2249.field2200 == var1 && this.field2249.field2199 == var2) {
         if (this.field2291 != this.field2239.field1676) {
            return true;
         } else if (client.field514 != this.field2279) {
            return true;
         } else if (var3 <= 0 && var4 <= 0) {
            return var1 + var3 < var5 || var4 + var2 < var6;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   void method1313(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class214.field1874 != null) {
         int var8 = 512 / (this.field2239.field1676 * 2);
         int var9 = var3 + 512;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method1326() - var5 / 2 - var8;
         int var13 = this.method1304() - var6 / 2 - var8;
         int var14 = var1 - this.field2239.field1676 * (var12 + var8 - this.field2293);
         int var15 = var2 - (var8 - (var13 - this.field2240)) * this.field2239.field1676;
         if (this.method1324(var9, var10, var14, var15, var3, var4)) {
            if (this.field2249 != null && var9 == this.field2249.field2200 && var10 == this.field2249.field2199) {
               Arrays.fill(this.field2249.field2205, 0);
            } else {
               this.field2249 = new class266(var9, var10);
            }

            this.field2293 = this.method1326() - var5 / 2 - var8;
            this.field2240 = this.method1304() - var6 / 2 - var8;
            this.field2291 = this.field2239.field1676;
            class214.field1874.method2078(this.field2293, this.field2240, this.field2249, (float)this.field2291 / var11);
            this.field2279 = client.field514;
            var14 = var1 - this.field2239.field1676 * (var8 + var12 - this.field2293);
            var15 = var2 - this.field2239.field1676 * (var8 - (var13 - this.field2240));
         }

         class162.method762(var1, var2, var3, var4, 0, 128);
         if (var11 == 1.0F) {
            this.field2249.method1235(var14, var15, 192);
         } else {
            this.field2249.method1237(var14, var15, (int)(var11 * (float)var9), (int)((float)var10 * var11), 192);
         }
      }

   }

   public void method1317(int var1, int var2, int var3, int var4) {
      if (this.field2255.method984()) {
         if (!this.field2239.method825()) {
            this.field2239.method829(this.field2241, this.field2252.method227(), client.field222);
            if (!this.field2239.method825()) {
               return;
            }
         }

         this.field2239.method822(var1, var2, var3, var4, this.field2268, this.field2270, this.field2276);
      }
   }

   public void method1296(int var1) {
      this.field2266 = this.method1298(var1);
   }

   void method1297(int var1, int var2, int var3, int var4, int var5) {
      byte var7 = 20;
      int var8 = var1 + var3 / 2;
      int var9 = var4 / 2 + var2 - 18 - var7;
      class162.method749(var1, var2, var3, var4, -16777216);
      class162.method741(var8 - 152, var9, 304, 34, -65536);
      class162.method749(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field2247.method2027(class177.field1644, var8, var7 + var9, -1, -1);
   }

   float method1298(int var1) {
      if (var1 == 25) {
         return 1.0F;
      } else if (var1 == 37) {
         return 1.5F;
      } else if (var1 == 50) {
         return 2.0F;
      } else if (var1 == 75) {
         return 3.0F;
      } else {
         return var1 == 100 ? 4.0F : 8.0F;
      }
   }

   public int method1299() {
      if ((double)this.field2266 == 1.0D) {
         return 25;
      } else if (1.5D == (double)this.field2266) {
         return 37;
      } else if ((double)this.field2266 == 2.0D) {
         return 50;
      } else if ((double)this.field2266 == 3.0D) {
         return 75;
      } else {
         return (double)this.field2266 == 4.0D ? 100 : 200;
      }
   }

   public void method1300() {
      this.field2255.method985();
   }

   public boolean method1333() {
      return this.field2255.method984();
   }

   public class46 method1301(int var1) {
      Iterator var3 = this.field2250.values().iterator();

      class46 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class46)var3.next();
      } while(var4.method225() != var1);

      return var4;
   }

   public void method1325(int var1, int var2) {
      if (null != this.field2252 && this.field2252.method226(var1, var2)) {
         this.field2258 = var1 - this.field2252.method236() * 64;
         this.field2259 = var2 - this.field2252.method231() * 64;
      }
   }

   public void method1303(int var1, int var2) {
      if (this.field2252 != null) {
         this.method1285(var1 - this.field2252.method236() * 64, var2 - this.field2252.method231() * 64, true);
         this.field2258 = -1;
         this.field2259 = -1;
      }
   }

   public void method1302(int var1, int var2, int var3) {
      if (null != this.field2252) {
         int[] var5 = this.field2252.method237(var1, var2, var3);
         if (var5 != null) {
            this.method1325(var5[0], var5[1]);
         }

      }
   }

   public void method1328(int var1, int var2, int var3) {
      if (this.field2252 != null) {
         int[] var5 = this.field2252.method237(var1, var2, var3);
         if (null != var5) {
            this.method1303(var5[0], var5[1]);
         }

      }
   }

   public int method1326() {
      return this.field2252 == null ? -1 : this.field2256 + this.field2252.method236() * 64;
   }

   public int method1304() {
      return this.field2252 == null ? -1 : this.field2246 + this.field2252.method231() * 64;
   }

   public class464 method1336() {
      return this.field2252 == null ? null : this.field2252.method223(this.method1326(), this.method1304());
   }

   public int method1305() {
      return this.field2262;
   }

   public int method1306() {
      return this.field2263;
   }

   public void method1307(int var1) {
      if (var1 >= 1) {
         this.field2264 = var1;
      }

   }

   public void method1308() {
      this.field2264 = 3;
   }

   public void method1329(int var1) {
      if (var1 >= 1) {
         this.field2276 = var1;
      }

   }

   public void method1335() {
      this.field2276 = 50;
   }

   public void method1309(boolean var1) {
      this.field2267 = var1;
   }

   public void method1310(int var1) {
      this.field2268 = new HashSet();
      this.field2268.add(var1);
      this.field2269 = 0;
      this.field2270 = 0;
   }

   public void method1311(int var1) {
      this.field2268 = new HashSet();
      this.field2269 = 0;
      this.field2270 = 0;

      for(int var3 = 0; var3 < class396.field3313; ++var3) {
         if (class25.method100(var3) != null && class25.method100(var3).field3334 == var1) {
            this.field2268.add(class25.method100(var3).field3315);
         }
      }

   }

   public void method1312() {
      this.field2268 = null;
   }

   public void method1284(boolean var1) {
      this.field2283 = !var1;
   }

   public void method1314(int var1, boolean var2) {
      if (!var2) {
         this.field2271.add(var1);
      } else {
         this.field2271.remove(var1);
      }

      this.method1318();
   }

   public void method1315(int var1, boolean var2) {
      if (!var2) {
         this.field2257.add(var1);
      } else {
         this.field2257.remove(var1);
      }

      for(int var4 = 0; var4 < class396.field3313; ++var4) {
         if (class25.method100(var4) != null && class25.method100(var4).field3334 == var1) {
            int var5 = class25.method100(var4).field3315;
            if (!var2) {
               this.field2281.add(var5);
            } else {
               this.field2281.remove(var5);
            }
         }
      }

      this.method1318();
   }

   public boolean method1316() {
      return !this.field2283;
   }

   public boolean method1337(int var1) {
      return !this.field2271.contains(var1);
   }

   public boolean method1327(int var1) {
      return !this.field2257.contains(var1);
   }

   void method1318() {
      this.field2282.clear();
      this.field2282.addAll(this.field2271);
      this.field2282.addAll(this.field2281);
   }

   public void method1319(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field2255.method984()) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field2260));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field2260));
         List var10 = this.field2239.method823(this.field2256 - var8 / 2 - 1, this.field2246 - var9 / 2 - 1, var8 / 2 + this.field2256 + 1, 1 + var9 / 2 + this.field2246, var1, var2, var3, var4, var5, var6);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               class389 var12 = (class389)var11.next();
               class396 var13 = class25.method100(var12.method1910());
               var14 = false;

               for(int var15 = this.field2294.length - 1; var15 >= 0; --var15) {
                  if (var13.field3324[var15] != null) {
                     class156.method721(var13.field3324[var15], var13.field3325, this.field2294[var15], var12.method1910(), var12.field3274.method2278(), var12.field3277.method2278());
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public class464 method1320(int var1, class464 var2) {
      if (!this.field2255.method984()) {
         return null;
      } else if (!this.field2239.method825()) {
         return null;
      } else if (!this.field2252.method226(var2.field3852, var2.field3853)) {
         return null;
      } else {
         HashMap var4 = this.field2239.method826();
         List var5 = (List)var4.get(var1);
         if (var5 != null && !var5.isEmpty()) {
            class389 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(true) {
               class389 var9;
               int var12;
               do {
                  if (!var8.hasNext()) {
                     return var6.field3277;
                  }

                  var9 = (class389)var8.next();
                  int var10 = var9.field3277.field3852 - var2.field3852;
                  int var11 = var9.field3277.field3853 - var2.field3853;
                  var12 = var10 * var10 + var11 * var11;
                  if (var12 == 0) {
                     return var9.field3277;
                  }
               } while(var12 >= var7 && var6 != null);

               var6 = var9;
               var7 = var12;
            }
         } else {
            return null;
         }
      }
   }

   public void method1332(int var1, int var2, class464 var3, class464 var4) {
      class488 var6 = new class488();
      class413 var7 = new class413(var2, var3, var4);
      var6.method2394(new Object[]{var7});
      switch(var1) {
      case 1008:
         var6.method2395(10);
         break;
      case 1009:
         var6.method2395(11);
         break;
      case 1010:
         var6.method2395(12);
         break;
      case 1011:
         var6.method2395(13);
         break;
      case 1012:
         var6.method2395(14);
      }

      class396.method1949(var6);
   }

   public class389 method1321() {
      if (!this.field2255.method984()) {
         return null;
      } else if (!this.field2239.method825()) {
         return null;
      } else {
         HashMap var2 = this.field2239.method826();
         this.field2286 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field2286.addAll(var4);
         }

         this.field2287 = this.field2286.iterator();
         return this.method1330();
      }
   }

   public class389 method1330() {
      if (this.field2287 == null) {
         return null;
      } else {
         class389 var2;
         do {
            if (!this.field2287.hasNext()) {
               return null;
            }

            var2 = (class389)this.field2287.next();
         } while(var2.method1910() == -1);

         return var2;
      }
   }
}
