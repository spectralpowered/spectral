public class class35 implements class256 {
   static class230 field350;
   int field336;
   int field337;
   int field338;
   int field339;
   int field340;
   int field341;
   int field342;
   int field343;
   int field344;
   int field345;
   int field346;
   int field347;
   int field348;
   int field349;

   public void method1244(class430 var1) {
      if (var1.field3592 > this.field340) {
         var1.field3592 = this.field340;
      }

      if (var1.field3593 < this.field340) {
         var1.field3593 = this.field340;
      }

      if (var1.field3588 > this.field338) {
         var1.field3588 = this.field338;
      }

      if (var1.field3595 < this.field338) {
         var1.field3595 = this.field338;
      }

   }

   public boolean method1240(int var1, int var2, int var3) {
      if (var1 >= this.field343 && var1 < this.field337 + this.field343) {
         return var2 >= (this.field347 << 6) + (this.field342 << 3) && var2 <= (this.field347 << 6) + (this.field344 << 3) + 7 && var3 >= (this.field346 << 3) + (this.field339 << 6) && var3 <= (this.field339 << 6) + (this.field345 << 3) + 7;
      } else {
         return false;
      }
   }

   public boolean method1239(int var1, int var2) {
      return var1 >= (this.field340 << 6) + (this.field336 << 3) && var1 <= 7 + (this.field348 << 3) + (this.field340 << 6) && var2 >= (this.field338 << 6) + (this.field341 << 3) && var2 <= (this.field349 << 3) + (this.field338 << 6) + 7;
   }

   public int[] method1241(int var1, int var2, int var3) {
      if (!this.method1240(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field336 * 8 - this.field342 * 8 + var2 + (this.field340 * 64 - this.field347 * 64), this.field341 * 8 - this.field346 * 8 + this.field338 * 64 - this.field339 * 64 + var3};
         return var5;
      }
   }

   public class308 method1243(int var1, int var2) {
      if (!this.method1239(var1, var2)) {
         return null;
      } else {
         int var4 = this.field342 * 8 - this.field336 * 8 + var1 + (this.field347 * 64 - this.field340 * 64);
         int var5 = this.field346 * 8 - this.field341 * 8 + var2 + (this.field339 * 64 - this.field338 * 64);
         return new class308(this.field343, var4, var5);
      }
   }

   public void method1242(class134 var1) {
      this.field343 = var1.method669();
      this.field337 = var1.method669();
      this.field347 = var1.method671();
      this.field342 = var1.method669();
      this.field344 = var1.method669();
      this.field339 = var1.method671();
      this.field346 = var1.method669();
      this.field345 = var1.method669();
      this.field340 = var1.method671();
      this.field336 = var1.method669();
      this.field348 = var1.method669();
      this.field338 = var1.method671();
      this.field341 = var1.method669();
      this.field349 = var1.method669();
      this.method178();
   }

   void method178() {
   }

   static void method180() {
      if (class377.method1799()) {
         class52.field781 = true;
         class52.field783 = 0;
         class52.field784 = 0;
      }

   }
}
