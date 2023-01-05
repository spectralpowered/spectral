public class class261 implements class256 {
   int field2676;
   int field2677;
   int field2678;
   int field2679;
   int field2680;
   int field2681;
   int field2682;
   int field2683;
   int field2684;
   int field2685;

   public void method1244(class430 var1) {
      if (var1.field3592 > this.field2682) {
         var1.field3592 = this.field2682;
      }

      if (var1.field3593 < this.field2678) {
         var1.field3593 = this.field2678;
      }

      if (var1.field3588 > this.field2681) {
         var1.field3588 = this.field2681;
      }

      if (var1.field3595 < this.field2685) {
         var1.field3595 = this.field2685;
      }

   }

   public boolean method1240(int var1, int var2, int var3) {
      if (var1 >= this.field2679 && var1 < this.field2677 + this.field2679) {
         return var2 >> 6 >= this.field2676 && var2 >> 6 <= this.field2680 && var3 >> 6 >= this.field2683 && var3 >> 6 <= this.field2684;
      } else {
         return false;
      }
   }

   public boolean method1239(int var1, int var2) {
      return var1 >> 6 >= this.field2682 && var1 >> 6 <= this.field2678 && var2 >> 6 >= this.field2681 && var2 >> 6 <= this.field2685;
   }

   public int[] method1241(int var1, int var2, int var3) {
      if (!this.method1240(var1, var2, var3)) {
         return null;
      } else {
         int[] var5 = new int[]{this.field2682 * 64 - this.field2676 * 64 + var2, var3 + (this.field2681 * 64 - this.field2683 * 64)};
         return var5;
      }
   }

   public class308 method1243(int var1, int var2) {
      if (!this.method1239(var1, var2)) {
         return null;
      } else {
         int var4 = var1 + (this.field2676 * 64 - this.field2682 * 64);
         int var5 = this.field2683 * 64 - this.field2681 * 64 + var2;
         return new class308(this.field2679, var4, var5);
      }
   }

   public void method1242(class134 var1) {
      this.field2679 = var1.method669();
      this.field2677 = var1.method669();
      this.field2676 = var1.method671();
      this.field2683 = var1.method671();
      this.field2680 = var1.method671();
      this.field2684 = var1.method671();
      this.field2682 = var1.method671();
      this.field2681 = var1.method671();
      this.field2678 = var1.method671();
      this.field2685 = var1.method671();
      this.method1257();
   }

   void method1257() {
   }

   public static boolean method1259(int var0) {
      return (var0 >> 30 & 1) != 0;
   }

   static int method1258(int var0, class472 var1, boolean var2) {
      class210 var4 = class274.method1301(class150.field1580[--class188.field1989]);
      if (var0 == 2800) {
         class150.field1580[++class188.field1989 - 1] = class393.method1910(class172.method913(var4));
         return 1;
      } else if (var0 != 2801) {
         if (var0 == 2802) {
            if (var4.field2216 == null) {
               class150.field1581[++class150.field1582 - 1] = "";
            } else {
               class150.field1581[++class150.field1582 - 1] = var4.field2216;
            }

            return 1;
         } else {
            return 2;
         }
      } else {
         int var5 = class150.field1580[--class188.field1989];
         --var5;
         if (null != var4.field2300 && var5 < var4.field2300.length && var4.field2300[var5] != null) {
            class150.field1581[++class150.field1582 - 1] = var4.field2300[var5];
         } else {
            class150.field1581[++class150.field1582 - 1] = "";
         }

         return 1;
      }
   }
}
