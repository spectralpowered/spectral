public class class315 implements class256 {
   static byte[][] field2995;
   int field2985;
   int field2986;
   int field2987;
   int field2988;
   int field2989;
   int field2990;
   int field2991;
   int field2992;
   int field2993;
   int field2994;

   public void method1244(class430 var1) {
      if (var1.field3592 > this.field2993) {
         var1.field3592 = this.field2993;
      }

      if (var1.field3593 < this.field2993) {
         var1.field3593 = this.field2993;
      }

      if (var1.field3588 > this.field2989) {
         var1.field3588 = this.field2989;
      }

      if (var1.field3595 < this.field2989) {
         var1.field3595 = this.field2989;
      }

   }

   public boolean method1240(int var1, int var2, int var3) {
      if (var1 >= this.field2991 && var1 < this.field2991 + this.field2986) {
         return var2 >= (this.field2987 << 6) + (this.field2992 << 3) && var2 <= (this.field2987 << 6) + (this.field2992 << 3) + 7 && var3 >= (this.field2985 << 6) + (this.field2988 << 3) && var3 <= 7 + (this.field2988 << 3) + (this.field2985 << 6);
      } else {
         return false;
      }
   }

   public boolean method1239(int var1, int var2) {
      return var1 >= (this.field2993 << 6) + (this.field2990 << 3) && var1 <= 7 + (this.field2993 << 6) + (this.field2990 << 3) && var2 >= (this.field2994 << 3) + (this.field2989 << 6) && var2 <= (this.field2994 << 3) + (this.field2989 << 6) + 7;
   }

   public int[] method1241(int var1, int var2, int var3) {
      if (!this.method1240(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field2990 * 8 - this.field2992 * 8 + this.field2993 * 64 - this.field2987 * 64 + var2, var3 + (this.field2989 * 64 - this.field2985 * 64) + (this.field2994 * 8 - this.field2988 * 8)};
         return var5;
      }
   }

   public class308 method1243(int var1, int var2) {
      if (!this.method1239(var1, var2)) {
         return null;
      } else {
         int var4 = this.field2987 * 64 - this.field2993 * 64 + var1 + (this.field2992 * 8 - this.field2990 * 8);
         int var5 = this.field2988 * 8 - this.field2994 * 8 + var2 + (this.field2985 * 64 - this.field2989 * 64);
         return new class308(this.field2991, var4, var5);
      }
   }

   public void method1242(class134 var1) {
      this.field2991 = var1.method669();
      this.field2986 = var1.method669();
      this.field2987 = var1.method671();
      this.field2992 = var1.method669();
      this.field2985 = var1.method671();
      this.field2988 = var1.method669();
      this.field2993 = var1.method671();
      this.field2990 = var1.method669();
      this.field2989 = var1.method671();
      this.field2994 = var1.method669();
      this.method1519();
   }

   void method1519() {
   }

   public static void method1520() {
      if (null != class475.field3962) {
         class475.field3962.method2054();
      }

   }
}
