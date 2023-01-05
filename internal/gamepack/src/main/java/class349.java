@ObfInfo(
   name = "ig"
)
public class class349 implements class360 {
   @ObfInfo(
      owner = "ig",
      name = "bs",
      desc = "I"
   )
   static int field2890;
   @ObfInfo(
      owner = "ig",
      name = "m",
      desc = "I"
   )
   int field2884;
   @ObfInfo(
      owner = "ig",
      name = "e",
      desc = "I"
   )
   int field2885;
   @ObfInfo(
      owner = "ig",
      name = "v",
      desc = "I"
   )
   int field2886;
   @ObfInfo(
      owner = "ig",
      name = "x",
      desc = "I"
   )
   int field2887;
   @ObfInfo(
      owner = "ig",
      name = "q",
      desc = "I"
   )
   int field2888;
   @ObfInfo(
      owner = "ig",
      name = "h",
      desc = "I"
   )
   int field2889;

   @ObfInfo(
      owner = "ig",
      name = "h",
      desc = "(Lit;B)V"
   )
   public void method1797(class46 var1) {
      if (var1.field552 > this.field2884) {
         var1.field552 = this.field2884;
      }

      if (var1.field553 < this.field2884) {
         var1.field553 = this.field2884;
      }

      if (var1.field548 > this.field2888) {
         var1.field548 = this.field2888;
      }

      if (var1.field555 < this.field2888) {
         var1.field555 = this.field2888;
      }

   }

   @ObfInfo(
      owner = "ig",
      name = "e",
      desc = "(IIII)Z"
   )
   public boolean method1793(int var1, int var2, int var3) {
      if (var1 >= this.field2889 && var1 < this.field2889 + this.field2885) {
         return this.field2886 == var2 >> 6 && var3 >> 6 == this.field2887;
      } else {
         return false;
      }
   }

   @ObfInfo(
      owner = "ig",
      name = "v",
      desc = "(IIS)Z"
   )
   public boolean method1792(int var1, int var2) {
      return var1 >> 6 == this.field2884 && this.field2888 == var2 >> 6;
   }

   @ObfInfo(
      owner = "ig",
      name = "x",
      desc = "(IIIB)[I"
   )
   public int[] method1794(int var1, int var2, int var3) {
      if (!this.method1793(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{var2 + (this.field2884 * 64 - this.field2886 * 64), this.field2888 * 64 - this.field2887 * 64 + var3};
         return var5;
      }
   }

   @ObfInfo(
      owner = "ig",
      name = "m",
      desc = "(III)Lky;"
   )
   public class464 method1796(int var1, int var2) {
      if (!this.method1792(var1, var2)) {
         return null;
      } else {
         int var4 = this.field2886 * 64 - this.field2884 * 64 + var1;
         int var5 = var2 + (this.field2887 * 64 - this.field2888 * 64);
         return new class464(this.field2889, var4, var5);
      }
   }

   @ObfInfo(
      owner = "ig",
      name = "q",
      desc = "(Lqy;I)V"
   )
   public void method1795(class127 var1) {
      this.field2889 = var1.method547();
      this.field2885 = var1.method547();
      this.field2886 = var1.method549();
      this.field2887 = var1.method549();
      this.field2884 = var1.method549();
      this.field2888 = var1.method549();
      this.method1764();
   }

   @ObfInfo(
      owner = "ig",
      name = "f",
      desc = "(I)V"
   )
   void method1764() {
   }

   @ObfInfo(
      owner = "ig",
      name = "m",
      desc = "(IIIZIZI)V"
   )
   static void method1758(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
      if (var0 < var1) {
         int var7 = (var0 + var1) / 2;
         int var8 = var0;
         class2 var9 = class2.field12[var7];
         class2.field12[var7] = class2.field12[var1];
         class2.field12[var1] = var9;

         for(int var10 = var0; var10 < var1; ++var10) {
            if (class398.method1969(class2.field12[var10], var9, var2, var3, var4, var5) <= 0) {
               class2 var11 = class2.field12[var10];
               class2.field12[var10] = class2.field12[var8];
               class2.field12[var8++] = var11;
            }
         }

         class2.field12[var1] = class2.field12[var8];
         class2.field12[var8] = var9;
         method1758(var0, var8 - 1, var2, var3, var4, var5);
         method1758(var8 + 1, var1, var2, var3, var4, var5);
      }

   }
}
