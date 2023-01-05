import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class class386 {
   static final class39 field3366;
   static final class39 field3367;
   static final class39 field3376;
   boolean field3389 = false;
   boolean field3400 = true;
   boolean field3405 = false;
   class161[] field3407;
   class164 field3363;
   class164 field3364;
   class164 field3365;
   class184 field3377;
   class308 field3411 = null;
   class319 field3371;
   class332 field3361;
   class394 field3369;
   class430 field3373;
   class430 field3374;
   class430 field3375;
   float field3382;
   float field3388;
   int field3362 = -1;
   int field3368;
   int field3378;
   int field3380 = -1;
   int field3381 = -1;
   int field3383 = -1;
   int field3384 = -1;
   int field3385 = -1;
   int field3386 = 3;
   int field3387 = -1;
   int field3391 = -1;
   int field3392 = -1;
   int field3394 = -1;
   int field3395 = -1;
   int field3396 = -1;
   int field3398 = 50;
   int field3399;
   int field3401 = -1;
   int field3406 = 0;
   int field3410;
   int field3413;
   int field3414 = -1;
   int field3415 = -1;
   HashMap field3370;
   HashMap field3372;
   HashSet field3379 = new HashSet();
   HashSet field3390 = null;
   HashSet field3393 = new HashSet();
   HashSet field3402 = new HashSet();
   HashSet field3403 = new HashSet();
   HashSet field3404 = new HashSet();
   Iterator field3409;
   List field3408;
   long field3397;
   final int[] field3416 = new int[]{1008, 1009, 1010, 1011, 1012};
   public boolean field3412 = false;

   static {
      field3366 = class39.field367;
      field3367 = class39.field368;
      field3376 = class39.field364;
   }

   public void method1825(class164 var1, class164 var2, class164 var3, class394 var4, HashMap var5, class161[] var6) {
      this.field3407 = var6;
      this.field3363 = var1;
      this.field3364 = var2;
      this.field3365 = var3;
      this.field3369 = var4;
      this.field3370 = new HashMap();
      this.field3370.put(class2.field9, var5.get(field3366));
      this.field3370.put(class2.field8, var5.get(field3367));
      this.field3370.put(class2.field10, var5.get(field3376));
      this.field3377 = new class184(var1);
      int var8 = this.field3363.method883(class48.field421.field419);
      int[] var9 = this.field3363.method878(var8);
      this.field3372 = new HashMap(var9.length);

      for(int var10 = 0; var10 < var9.length; ++var10) {
         class134 var11 = new class134(this.field3363.method892(var8, var9[var10]));
         class430 var12 = new class430();
         var12.method2057(var11, var9[var10]);
         this.field3372.put(var12.method2063(), var12);
         if (var12.method2074()) {
            this.field3373 = var12;
         }
      }

      this.method1838(this.field3373);
      this.field3375 = null;
   }

   public void method1826() {
      class68.field838.method1313(5);
   }

   public void method1827(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.field3377.method963()) {
         this.method1880();
         this.method1868();
         if (var3) {
            int var9 = (int)Math.ceil((double)((float)var6 / this.field3382));
            int var10 = (int)Math.ceil((double)((float)var7 / this.field3382));
            List var11 = this.field3361.method1606(this.field3378 - var9 / 2 - 1, this.field3368 - var10 / 2 - 1, this.field3378 + var9 / 2 + 1, 1 + var10 / 2 + this.field3368, var4, var5, var6, var7, var1, var2);
            HashSet var12 = new HashSet();

            Iterator var13;
            class428 var14;
            class169 var15;
            class482 var16;
            for(var13 = var11.iterator(); var13.hasNext(); class194.method1001(var15)) {
               var14 = (class428)var13.next();
               var12.add(var14);
               var15 = new class169();
               var16 = new class482(var14.method2047(), var14.field3583, var14.field3586);
               var15.method900(new Object[]{var16, var1, var2});
               if (this.field3402.contains(var14)) {
                  var15.method901(17);
               } else {
                  var15.method901(15);
               }
            }

            var13 = this.field3402.iterator();

            while(var13.hasNext()) {
               var14 = (class428)var13.next();
               if (!var12.contains(var14)) {
                  var15 = new class169();
                  var16 = new class482(var14.method2047(), var14.field3583, var14.field3586);
                  var15.method900(new Object[]{var16, var1, var2});
                  var15.method901(16);
                  class194.method1001(var15);
               }
            }

            this.field3402 = var12;
         }
      }
   }

   public void method1828(int var1, int var2, boolean var3, boolean var4) {
      long var6 = class154.method814();
      this.method1829(var1, var2, var4, var6);
      if (!this.method1833() && (var4 || var3) && !class348.method1674()) {
         if (var4) {
            this.field3414 = var1;
            this.field3396 = var2;
            this.field3395 = this.field3378;
            this.field3394 = this.field3368;
         }

         if (-1 != this.field3395) {
            int var8 = var1 - this.field3414;
            int var9 = var2 - this.field3396;
            this.method1831(this.field3395 - (int)((float)var8 / this.field3388), (int)((float)var9 / this.field3388) + this.field3394, false);
         }
      } else {
         this.method1832();
      }

      if (var4) {
         this.field3397 = var6;
         this.field3410 = var1;
         this.field3399 = var2;
      }

   }

   void method1829(int var1, int var2, boolean var3, long var4) {
      if (null != this.field3374) {
         int var6 = (int)((float)this.field3378 + ((float)(var1 - this.field3383) - (float)this.method1851() * this.field3382 / 2.0F) / this.field3382);
         int var7 = (int)((float)this.field3368 - ((float)(var2 - this.field3387) - (float)this.method1852() * this.field3382 / 2.0F) / this.field3382);
         this.field3411 = this.field3374.method2059(var6 + this.field3374.method2072() * 64, var7 + this.field3374.method2067() * 64);
         if (null != this.field3411 && var3) {
            class463 var8 = client.field664;
            int var11;
            int var12;
            if (class20.method112() && var8.method2272(82) && var8.method2272(81)) {
               int var14 = this.field3411.field2904;
               var11 = this.field3411.field2905;
               var12 = this.field3411.field2903;
               class81 var13 = class189.method982(class165.field1789, client.field483.field3459);
               var13.field933.method706(var11);
               var13.field933.method688(var12);
               var13.field933.method694(var14);
               var13.field933.method703(0);
               client.field483.method1920(var13);
            } else {
               boolean var10 = true;
               if (this.field3400) {
                  var11 = var1 - this.field3410;
                  var12 = var2 - this.field3399;
                  if (var4 - this.field3397 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  class81 var15 = class189.method982(class165.field1777, client.field483.field3459);
                  var15.field933.method656(this.field3411.method1446());
                  client.field483.method1920(var15);
                  this.field3397 = 0L;
               }
            }
         }
      } else {
         this.field3411 = null;
      }

   }

   void method1880() {
      if (null != class141.field1542) {
         this.field3382 = this.field3388;
      } else {
         if (this.field3382 < this.field3388) {
            this.field3382 = Math.min(this.field3388, this.field3382 + this.field3382 / 30.0F);
         }

         if (this.field3382 > this.field3388) {
            this.field3382 = Math.max(this.field3388, this.field3382 - this.field3382 / 30.0F);
         }

      }
   }

   void method1868() {
      if (this.method1833()) {
         int var2 = this.field3380 - this.field3378;
         int var3 = this.field3381 - this.field3368;
         if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
         }

         if (var3 != 0) {
            var3 /= Math.min(8, Math.abs(var3));
         }

         this.method1831(var2 + this.field3378, this.field3368 + var3, true);
         if (this.field3380 == this.field3378 && this.field3381 == this.field3368) {
            this.field3380 = -1;
            this.field3381 = -1;
         }

      }
   }

   final void method1831(int var1, int var2, boolean var3) {
      this.field3378 = var1;
      this.field3368 = var2;
      class154.method814();
      if (var3) {
         this.method1832();
      }

   }

   final void method1832() {
      this.field3396 = -1;
      this.field3414 = -1;
      this.field3394 = -1;
      this.field3395 = -1;
   }

   boolean method1833() {
      return this.field3380 != -1 && this.field3381 != -1;
   }

   public class430 method1834(int var1, int var2, int var3) {
      Iterator var5 = this.field3372.values().iterator();

      class430 var6;
      do {
         if (!var5.hasNext()) {
            return null;
         }

         var6 = (class430)var5.next();
      } while(!var6.method2076(var1, var2, var3));

      return var6;
   }

   public void method1835(int var1, int var2, int var3, boolean var4) {
      class430 var6 = this.method1834(var1, var2, var3);
      if (var6 == null) {
         if (!var4) {
            return;
         }

         var6 = this.field3373;
      }

      boolean var7 = false;
      if (var6 != this.field3375 || var4) {
         this.field3375 = var6;
         this.method1838(var6);
         var7 = true;
      }

      if (var7 || var4) {
         this.method1840(var1, var2, var3);
      }

   }

   public void method1836(int var1) {
      class430 var3 = this.method1847(var1);
      if (null != var3) {
         this.method1838(var3);
      }

   }

   public int method1877() {
      return this.field3374 == null ? -1 : this.field3374.method2061();
   }

   public class430 method1837() {
      return this.field3374;
   }

   void method1838(class430 var1) {
      if (this.field3374 == null || this.field3374 != var1) {
         this.method1839(var1);
         this.method1840(-1, -1, -1);
      }
   }

   void method1839(class430 var1) {
      this.field3374 = var1;
      this.field3361 = new class332(this.field3407, this.field3370, this.field3364, this.field3365);
      this.field3377.method962(this.field3374.method2063());
   }

   public void method1869(class430 var1, class308 var2, class308 var3, boolean var4) {
      if (var1 != null) {
         if (this.field3374 == null || var1 != this.field3374) {
            this.method1839(var1);
         }

         if (!var4 && this.field3374.method2076(var2.field2903, var2.field2904, var2.field2905)) {
            this.method1840(var2.field2903, var2.field2904, var2.field2905);
         } else {
            this.method1840(var3.field2903, var3.field2904, var3.field2905);
         }

      }
   }

   void method1840(int var1, int var2, int var3) {
      if (null != this.field3374) {
         int[] var5 = this.field3374.method2073(var1, var2, var3);
         if (null == var5) {
            var5 = this.field3374.method2073(this.field3374.method2078(), this.field3374.method2069(), this.field3374.method2071());
         }

         this.method1831(var5[0] - this.field3374.method2072() * 64, var5[1] - this.field3374.method2067() * 64, true);
         this.field3380 = -1;
         this.field3381 = -1;
         this.field3382 = this.method1844(this.field3374.method2065());
         this.field3388 = this.field3382;
         this.field3408 = null;
         this.field3409 = null;
         this.field3361.method1602();
      }
   }

   public void method1841(int var1, int var2, int var3, int var4, int var5) {
      int[] var7 = new int[4];
      class362.method1734(var7);
      class362.method1732(var1, var2, var3 + var1, var2 + var4);
      class362.method1739(var1, var2, var3, var4, -16777216);
      int var8 = this.field3377.method961();
      if (var8 < 100) {
         this.method1843(var1, var2, var3, var4, var8);
      } else {
         if (!this.field3361.method1608()) {
            this.field3361.method1612(this.field3363, this.field3374.method2063(), client.field426);
            if (!this.field3361.method1608()) {
               return;
            }
         }

         if (this.field3390 != null) {
            ++this.field3392;
            if (this.field3392 % this.field3398 == 0) {
               this.field3392 = 0;
               ++this.field3391;
            }

            if (this.field3391 >= this.field3386 && !this.field3389) {
               this.field3390 = null;
            }
         }

         int var9 = (int)Math.ceil((double)((float)var3 / this.field3382));
         int var10 = (int)Math.ceil((double)((float)var4 / this.field3382));
         class441.field3648 = client.field432 >= 209;
         this.field3361.method1603(this.field3378 - var9 / 2, this.field3368 - var10 / 2, var9 / 2 + this.field3378, var10 / 2 + this.field3368, var1, var2, var3 + var1, var4 + var2);
         if (!this.field3405) {
            boolean var11 = false;
            if (var5 - this.field3406 > 100) {
               this.field3406 = var5;
               var11 = true;
            }

            this.field3361.method1604(this.field3378 - var9 / 2, this.field3368 - var10 / 2, this.field3378 + var9 / 2, this.field3368 + var10 / 2, var1, var2, var3 + var1, var4 + var2, this.field3404, this.field3390, this.field3392, this.field3398, var11);
         }

         this.method1859(var1, var2, var3, var4, var9, var10);
         if (class20.method112() && this.field3412 && this.field3411 != null) {
            this.field3369.method518("Coord: " + this.field3411, class362.field3246 + 10, class362.field3244 + 20, 16776960, -1);
         }

         this.field3384 = var9;
         this.field3385 = var10;
         this.field3383 = var1;
         this.field3387 = var2;
         class362.method1735(var7);
      }
   }

   boolean method1870(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field3371 == null) {
         return true;
      } else if (this.field3371.field3014 == var1 && this.field3371.field3013 == var2) {
         if (this.field3413 != this.field3361.field3093) {
            return true;
         } else if (client.field718 != this.field3401) {
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

   void method1859(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class141.field1542 != null) {
         int var8 = 512 / (this.field3361.field3093 * 2);
         int var9 = var3 + 512;
         int var10 = var4 + 512;
         float var11 = 1.0F;
         var9 = (int)((float)var9 / var11);
         var10 = (int)((float)var10 / var11);
         int var12 = this.method1872() - var5 / 2 - var8;
         int var13 = this.method1850() - var6 / 2 - var8;
         int var14 = var1 - this.field3361.field3093 * (var12 + var8 - this.field3415);
         int var15 = var2 - (var8 - (var13 - this.field3362)) * this.field3361.field3093;
         if (this.method1870(var9, var10, var14, var15, var3, var4)) {
            if (this.field3371 != null && var9 == this.field3371.field3014 && var10 == this.field3371.field3013) {
               Arrays.fill(this.field3371.field3019, 0);
            } else {
               this.field3371 = new class319(var9, var10);
            }

            this.field3415 = this.method1872() - var5 / 2 - var8;
            this.field3362 = this.method1850() - var6 / 2 - var8;
            this.field3413 = this.field3361.field3093;
            class141.field1542.method508(this.field3415, this.field3362, this.field3371, (float)this.field3413 / var11);
            this.field3401 = client.field718;
            var14 = var1 - this.field3361.field3093 * (var8 + var12 - this.field3415);
            var15 = var2 - this.field3361.field3093 * (var8 - (var13 - this.field3362));
         }

         class362.method1752(var1, var2, var3, var4, 0, 128);
         if (var11 == 1.0F) {
            this.field3371.method1543(var14, var15, 192);
         } else {
            this.field3371.method1545(var14, var15, (int)(var11 * (float)var9), (int)((float)var10 * var11), 192);
         }
      }

   }

   public void method1863(int var1, int var2, int var3, int var4) {
      if (this.field3377.method963()) {
         if (!this.field3361.method1608()) {
            this.field3361.method1612(this.field3363, this.field3374.method2063(), client.field426);
            if (!this.field3361.method1608()) {
               return;
            }
         }

         this.field3361.method1605(var1, var2, var3, var4, this.field3390, this.field3392, this.field3398);
      }
   }

   public void method1842(int var1) {
      this.field3388 = this.method1844(var1);
   }

   void method1843(int var1, int var2, int var3, int var4, int var5) {
      byte var7 = 20;
      int var8 = var1 + var3 / 2;
      int var9 = var4 / 2 + var2 - 18 - var7;
      class362.method1739(var1, var2, var3, var4, -16777216);
      class362.method1731(var8 - 152, var9, 304, 34, -65536);
      class362.method1739(var8 - 150, var9 + 2, var5 * 3, 30, -65536);
      this.field3369.method520(class96.field1339, var8, var7 + var9, -1, -1);
   }

   float method1844(int var1) {
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

   public int method1845() {
      if ((double)this.field3388 == 1.0D) {
         return 25;
      } else if (1.5D == (double)this.field3388) {
         return 37;
      } else if ((double)this.field3388 == 2.0D) {
         return 50;
      } else if ((double)this.field3388 == 3.0D) {
         return 75;
      } else {
         return (double)this.field3388 == 4.0D ? 100 : 200;
      }
   }

   public void method1846() {
      this.field3377.method964();
   }

   public boolean method1879() {
      return this.field3377.method963();
   }

   public class430 method1847(int var1) {
      Iterator var3 = this.field3372.values().iterator();

      class430 var4;
      do {
         if (!var3.hasNext()) {
            return null;
         }

         var4 = (class430)var3.next();
      } while(var4.method2061() != var1);

      return var4;
   }

   public void method1871(int var1, int var2) {
      if (null != this.field3374 && this.field3374.method2062(var1, var2)) {
         this.field3380 = var1 - this.field3374.method2072() * 64;
         this.field3381 = var2 - this.field3374.method2067() * 64;
      }
   }

   public void method1849(int var1, int var2) {
      if (this.field3374 != null) {
         this.method1831(var1 - this.field3374.method2072() * 64, var2 - this.field3374.method2067() * 64, true);
         this.field3380 = -1;
         this.field3381 = -1;
      }
   }

   public void method1848(int var1, int var2, int var3) {
      if (null != this.field3374) {
         int[] var5 = this.field3374.method2073(var1, var2, var3);
         if (var5 != null) {
            this.method1871(var5[0], var5[1]);
         }

      }
   }

   public void method1874(int var1, int var2, int var3) {
      if (this.field3374 != null) {
         int[] var5 = this.field3374.method2073(var1, var2, var3);
         if (null != var5) {
            this.method1849(var5[0], var5[1]);
         }

      }
   }

   public int method1872() {
      return this.field3374 == null ? -1 : this.field3378 + this.field3374.method2072() * 64;
   }

   public int method1850() {
      return this.field3374 == null ? -1 : this.field3368 + this.field3374.method2067() * 64;
   }

   public class308 method1882() {
      return this.field3374 == null ? null : this.field3374.method2059(this.method1872(), this.method1850());
   }

   public int method1851() {
      return this.field3384;
   }

   public int method1852() {
      return this.field3385;
   }

   public void method1853(int var1) {
      if (var1 >= 1) {
         this.field3386 = var1;
      }

   }

   public void method1854() {
      this.field3386 = 3;
   }

   public void method1875(int var1) {
      if (var1 >= 1) {
         this.field3398 = var1;
      }

   }

   public void method1881() {
      this.field3398 = 50;
   }

   public void method1855(boolean var1) {
      this.field3389 = var1;
   }

   public void method1856(int var1) {
      this.field3390 = new HashSet();
      this.field3390.add(var1);
      this.field3391 = 0;
      this.field3392 = 0;
   }

   public void method1857(int var1) {
      this.field3390 = new HashSet();
      this.field3391 = 0;
      this.field3392 = 0;

      for(int var3 = 0; var3 < class194.field2014; ++var3) {
         if (class143.method776(var3) != null && class143.method776(var3).field2035 == var1) {
            this.field3390.add(class143.method776(var3).field2016);
         }
      }

   }

   public void method1858() {
      this.field3390 = null;
   }

   public void method1830(boolean var1) {
      this.field3405 = !var1;
   }

   public void method1860(int var1, boolean var2) {
      if (!var2) {
         this.field3393.add(var1);
      } else {
         this.field3393.remove(var1);
      }

      this.method1864();
   }

   public void method1861(int var1, boolean var2) {
      if (!var2) {
         this.field3379.add(var1);
      } else {
         this.field3379.remove(var1);
      }

      for(int var4 = 0; var4 < class194.field2014; ++var4) {
         if (class143.method776(var4) != null && class143.method776(var4).field2035 == var1) {
            int var5 = class143.method776(var4).field2016;
            if (!var2) {
               this.field3403.add(var5);
            } else {
               this.field3403.remove(var5);
            }
         }
      }

      this.method1864();
   }

   public boolean method1862() {
      return !this.field3405;
   }

   public boolean method1883(int var1) {
      return !this.field3393.contains(var1);
   }

   public boolean method1873(int var1) {
      return !this.field3379.contains(var1);
   }

   void method1864() {
      this.field3404.clear();
      this.field3404.addAll(this.field3393);
      this.field3404.addAll(this.field3403);
   }

   public void method1865(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.field3377.method963()) {
         int var8 = (int)Math.ceil((double)((float)var3 / this.field3382));
         int var9 = (int)Math.ceil((double)((float)var4 / this.field3382));
         List var10 = this.field3361.method1606(this.field3378 - var8 / 2 - 1, this.field3368 - var9 / 2 - 1, var8 / 2 + this.field3378 + 1, 1 + var9 / 2 + this.field3368, var1, var2, var3, var4, var5, var6);
         if (!var10.isEmpty()) {
            Iterator var11 = var10.iterator();

            boolean var14;
            do {
               if (!var11.hasNext()) {
                  return;
               }

               class428 var12 = (class428)var11.next();
               class194 var13 = class143.method776(var12.method2047());
               var14 = false;

               for(int var15 = this.field3416.length - 1; var15 >= 0; --var15) {
                  if (var13.field2025[var15] != null) {
                     class82.method442(var13.field2025[var15], var13.field2026, this.field3416[var15], var12.method2047(), var12.field3583.method1446(), var12.field3586.method1446());
                     var14 = true;
                  }
               }
            } while(!var14);

         }
      }
   }

   public class308 method1866(int var1, class308 var2) {
      if (!this.field3377.method963()) {
         return null;
      } else if (!this.field3361.method1608()) {
         return null;
      } else if (!this.field3374.method2062(var2.field2904, var2.field2905)) {
         return null;
      } else {
         HashMap var4 = this.field3361.method1609();
         List var5 = (List)var4.get(var1);
         if (var5 != null && !var5.isEmpty()) {
            class428 var6 = null;
            int var7 = -1;
            Iterator var8 = var5.iterator();

            while(true) {
               class428 var9;
               int var12;
               do {
                  if (!var8.hasNext()) {
                     return var6.field3586;
                  }

                  var9 = (class428)var8.next();
                  int var10 = var9.field3586.field2904 - var2.field2904;
                  int var11 = var9.field3586.field2905 - var2.field2905;
                  var12 = var10 * var10 + var11 * var11;
                  if (var12 == 0) {
                     return var9.field3586;
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

   public void method1878(int var1, int var2, class308 var3, class308 var4) {
      class169 var6 = new class169();
      class482 var7 = new class482(var2, var3, var4);
      var6.method900(new Object[]{var7});
      switch(var1) {
      case 1008:
         var6.method901(10);
         break;
      case 1009:
         var6.method901(11);
         break;
      case 1010:
         var6.method901(12);
         break;
      case 1011:
         var6.method901(13);
         break;
      case 1012:
         var6.method901(14);
      }

      class194.method1001(var6);
   }

   public class428 method1867() {
      if (!this.field3377.method963()) {
         return null;
      } else if (!this.field3361.method1608()) {
         return null;
      } else {
         HashMap var2 = this.field3361.method1609();
         this.field3408 = new LinkedList();
         Iterator var3 = var2.values().iterator();

         while(var3.hasNext()) {
            List var4 = (List)var3.next();
            this.field3408.addAll(var4);
         }

         this.field3409 = this.field3408.iterator();
         return this.method1876();
      }
   }

   public class428 method1876() {
      if (this.field3409 == null) {
         return null;
      } else {
         class428 var2;
         do {
            if (!this.field3409.hasNext()) {
               return null;
            }

            var2 = (class428)this.field3409.next();
         } while(var2.method2047() == -1);

         return var2;
      }
   }
}
