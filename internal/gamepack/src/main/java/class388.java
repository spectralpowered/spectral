public class class388 implements class360 {
   static byte[][] field3273;
   int field3263;
   int field3264;
   int field3265;
   int field3266;
   int field3267;
   int field3268;
   int field3269;
   int field3270;
   int field3271;
   int field3272;

   public void method1797(class46 var1) {
      if (var1.field552 > this.field3271) {
         var1.field552 = this.field3271;
      }

      if (var1.field553 < this.field3271) {
         var1.field553 = this.field3271;
      }

      if (var1.field548 > this.field3267) {
         var1.field548 = this.field3267;
      }

      if (var1.field555 < this.field3267) {
         var1.field555 = this.field3267;
      }

   }

   public boolean method1793(int var1, int var2, int var3) {
      if (var1 >= this.field3269 && var1 < this.field3269 + this.field3264) {
         return var2 >= (this.field3265 << 6) + (this.field3270 << 3) && var2 <= (this.field3265 << 6) + (this.field3270 << 3) + 7 && var3 >= (this.field3263 << 6) + (this.field3266 << 3) && var3 <= 7 + (this.field3266 << 3) + (this.field3263 << 6);
      } else {
         return false;
      }
   }

   public boolean method1792(int var1, int var2) {
      return var1 >= (this.field3271 << 6) + (this.field3268 << 3) && var1 <= 7 + (this.field3271 << 6) + (this.field3268 << 3) && var2 >= (this.field3272 << 3) + (this.field3267 << 6) && var2 <= (this.field3272 << 3) + (this.field3267 << 6) + 7;
   }

   public int[] method1794(int var1, int var2, int var3) {
      if (!this.method1793(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field3268 * 8 - this.field3270 * 8 + this.field3271 * 64 - this.field3265 * 64 + var2, var3 + (this.field3267 * 64 - this.field3263 * 64) + (this.field3272 * 8 - this.field3266 * 8)};
         return var5;
      }
   }

   public class464 method1796(int var1, int var2) {
      if (!this.method1792(var1, var2)) {
         return null;
      } else {
         int var4 = this.field3265 * 64 - this.field3271 * 64 + var1 + (this.field3270 * 8 - this.field3268 * 8);
         int var5 = this.field3266 * 8 - this.field3272 * 8 + var2 + (this.field3263 * 64 - this.field3267 * 64);
         return new class464(this.field3269, var4, var5);
      }
   }

   public void method1795(class127 var1) {
      this.field3269 = var1.method547();
      this.field3264 = var1.method547();
      this.field3265 = var1.method549();
      this.field3270 = var1.method547();
      this.field3263 = var1.method549();
      this.field3266 = var1.method547();
      this.field3271 = var1.method549();
      this.field3268 = var1.method547();
      this.field3267 = var1.method549();
      this.field3272 = var1.method547();
      this.method1903();
   }

   void method1903() {
   }

   public static void method1904() {
      if (null != class462.field3844) {
         class462.field3844.method734();
      }

   }
}
