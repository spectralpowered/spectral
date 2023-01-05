public class class285 implements class360 {
   int field2355;
   int field2356;
   int field2357;
   int field2358;
   int field2359;
   int field2360;
   int field2361;
   int field2362;
   int field2363;
   int field2364;

   public void method1797(class46 var1) {
      if (var1.field552 > this.field2361) {
         var1.field552 = this.field2361;
      }

      if (var1.field553 < this.field2357) {
         var1.field553 = this.field2357;
      }

      if (var1.field548 > this.field2360) {
         var1.field548 = this.field2360;
      }

      if (var1.field555 < this.field2364) {
         var1.field555 = this.field2364;
      }

   }

   public boolean method1793(int var1, int var2, int var3) {
      if (var1 >= this.field2358 && var1 < this.field2356 + this.field2358) {
         return var2 >> 6 >= this.field2355 && var2 >> 6 <= this.field2359 && var3 >> 6 >= this.field2362 && var3 >> 6 <= this.field2363;
      } else {
         return false;
      }
   }

   public boolean method1792(int var1, int var2) {
      return var1 >> 6 >= this.field2361 && var1 >> 6 <= this.field2357 && var2 >> 6 >= this.field2360 && var2 >> 6 <= this.field2364;
   }

   public int[] method1794(int var1, int var2, int var3) {
      if (!this.method1793(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field2361 * 64 - this.field2355 * 64 + var2, var3 + (this.field2360 * 64 - this.field2362 * 64)};
         return var5;
      }
   }

   public class464 method1796(int var1, int var2) {
      if (!this.method1792(var1, var2)) {
         return null;
      } else {
         int var4 = var1 + (this.field2355 * 64 - this.field2361 * 64);
         int var5 = this.field2362 * 64 - this.field2360 * 64 + var2;
         return new class464(this.field2358, var4, var5);
      }
   }

   public void method1795(class127 var1) {
      this.field2358 = var1.method547();
      this.field2356 = var1.method547();
      this.field2355 = var1.method549();
      this.field2362 = var1.method549();
      this.field2359 = var1.method549();
      this.field2363 = var1.method549();
      this.field2361 = var1.method549();
      this.field2360 = var1.method549();
      this.field2357 = var1.method549();
      this.field2364 = var1.method549();
      this.method1415();
   }

   void method1415() {
   }

   public static boolean method1417(int var0) {
      return (var0 >> 30 & 1) != 0;
   }

   static int method1416(int var0, class461 var1, boolean var2) {
      class120 var4 = class67.method299(class386.field3248[--class161.field1227]);
      if (var0 == 2800) {
         class386.field3248[++class161.field1227 - 1] = class486.method2379(class203.method892(var4));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var4.field894 == null) {
               class386.field3249[++class386.field3250 - 1] = "";
            } else {
               class386.field3249[++class386.field3250 - 1] = var4.field894;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class386.field3248[--class161.field1227];
         --var5;
         if (null != var4.field978 && var5 < var4.field978.length && var4.field978[var5] != null) {
            class386.field3249[++class386.field3250 - 1] = var4.field978[var5];
         } else {
            class386.field3249[++class386.field3250 - 1] = "";
         }

         return 1;
      }
   }
}
