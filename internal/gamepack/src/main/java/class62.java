public class class62 implements class256 {
   static int field826;
   int field820;
   int field821;
   int field822;
   int field823;
   int field824;
   int field825;

   public void method1244(class430 var1) {
      if (var1.field3592 > this.field820) {
         var1.field3592 = this.field820;
      }

      if (var1.field3593 < this.field820) {
         var1.field3593 = this.field820;
      }

      if (var1.field3588 > this.field824) {
         var1.field3588 = this.field824;
      }

      if (var1.field3595 < this.field824) {
         var1.field3595 = this.field824;
      }

   }

   public boolean method1240(int var1, int var2, int var3) {
      if (var1 >= this.field825 && var1 < this.field825 + this.field821) {
         return this.field822 == var2 >> 6 && var3 >> 6 == this.field823;
      } else {
         return false;
      }
   }

   public boolean method1239(int var1, int var2) {
      return var1 >> 6 == this.field820 && this.field824 == var2 >> 6;
   }

   public int[] method1241(int var1, int var2, int var3) {
      if (!this.method1240(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field820 * 64 - this.field822 * 64), this.field824 * 64 - this.field823 * 64 + var3};
         return var5;
      }
   }

   public class308 method1243(int var1, int var2) {
      if (!this.method1239(var1, var2)) {
         return null;
      } else {
         int var4 = this.field822 * 64 - this.field820 * 64 + var1;
         int var5 = var2 + (this.field823 * 64 - this.field824 * 64);
         return new class308(this.field825, var4, var5);
      }
   }

   public void method1242(class134 var1) {
      this.field825 = var1.method669();
      this.field821 = var1.method669();
      this.field822 = var1.method671();
      this.field823 = var1.method671();
      this.field820 = var1.method671();
      this.field824 = var1.method671();
      this.method347();
   }

   void method347() {
   }

   static void method341(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         class296 var9 = class296.field2834[var7];
         class296.field2834[var7] = class296.field2834[var1];
         class296.field2834[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            if (class250.method1232(class296.field2834[var10], var9, var2, var3, var4, var5) <= 0) {
               class296 var11 = class296.field2834[var10];
               class296.field2834[var10] = class296.field2834[var8];
               class296.field2834[var8++] = var11;
            }
         }

         class296.field2834[var1] = class296.field2834[var8];
         class296.field2834[var8] = var9;
         method341(var0, var8 - 1, var2, var3, var4, var5);
         method341(var8 + 1, var1, var2, var3, var4, var5);
      }

   }
}
