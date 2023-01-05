public class class259 extends class441 {
   int field2646;
   int field2647;
   int field2648;
   int field2649;

   void method1249(class134 var1) {
      int var3 = var1.method669();
      if (var3 != class325.field3044.field3046) {
         throw new IllegalStateException("");
      } else {
         super.field3647 = var1.method669();
         super.field3640 = var1.method669();
         super.field3639 = var1.method671();
         super.field3636 = var1.method671();
         this.field2647 = var1.method669();
         this.field2646 = var1.method669();
         super.field3637 = var1.method671();
         super.field3643 = var1.method671();
         this.field2648 = var1.method669();
         this.field2649 = var1.method669();
         super.field3635 = var1.method682();
         super.field3642 = var1.method682();
      }
   }

   void method2103(class134 var1) {
      super.field3640 = Math.min(super.field3640, 4);
      super.field3644 = new short[1][64][64];
      super.field3638 = new short[super.field3640][64][64];
      super.field3645 = new byte[super.field3640][64][64];
      super.field3646 = new byte[super.field3640][64][64];
      super.field3641 = new class50[super.field3640][64][64][];
      int var3 = var1.method669();
      if (class158.field1645.field1646 != var3) {
         throw new IllegalStateException("");
      } else {
         int var4 = var1.method669();
         int var5 = var1.method669();
         int var6 = var1.method669();
         int var7 = var1.method669();
         if (super.field3637 == var4 && super.field3643 == var5 && this.field2648 == var6 && var7 == this.field2649) {
            for(int var8 = 0; var8 < 8; ++var8) {
               for(int var9 = 0; var9 < 8; ++var9) {
                  this.method2100(this.field2648 * 8 + var8, var9 + this.field2649 * 8, var1);
               }
            }

         } else {
            throw new IllegalStateException("");
         }
      }
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class259)) {
         return false;
      } else {
         class259 var2 = (class259)var1;
         if (super.field3637 == var2.field3637 && super.field3643 == var2.field3643) {
            return this.field2648 == var2.field2648 && this.field2649 == var2.field2649;
         } else {
            return false;
         }
      }
   }

   public int hashCode() {
      return super.field3637 | super.field3643 << 8 | this.field2648 << 16 | this.field2649 << 24;
   }

   int method1246() {
      return this.field2647;
   }

   int method1247() {
      return this.field2646;
   }

   int method1248() {
      return this.field2648;
   }

   int method1245() {
      return this.field2649;
   }

   static int method1251(int var0, class472 var1, boolean var2) {
      int var4 = -1;
      class210 var5;
      if (var0 >= 2000) {
         var0 -= 1000;
         var4 = class150.field1580[--class188.field1989];
         var5 = class274.method1301(var4);
      } else {
         var5 = var2 ? class142.field1544 : class425.field3580;
      }

      if (var0 == 1000) {
         class188.field1989 -= 4;
         var5.field2224 = class150.field1580[class188.field1989];
         var5.field2225 = class150.field1580[1 + class188.field1989];
         var5.field2262 = class150.field1580[2 + class188.field1989];
         var5.field2358 = class150.field1580[3 + class188.field1989];
         class214.method1117(var5);
         class140.field1508.method286(var5);
         if (var4 != -1 && 0 == var5.field2348) {
            class357.method1708(class71.field853[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1001) {
         class188.field1989 -= 4;
         var5.field2226 = class150.field1580[class188.field1989];
         var5.field2244 = class150.field1580[class188.field1989 + 1];
         var5.field2221 = class150.field1580[2 + class188.field1989];
         var5.field2223 = class150.field1580[3 + class188.field1989];
         class214.method1117(var5);
         class140.field1508.method286(var5);
         if (var4 != -1 && var5.field2348 == 0) {
            class357.method1708(class71.field853[var4 >> 16], var5, false);
         }

         return 1;
      } else if (var0 == 1003) {
         boolean var6 = class150.field1580[--class188.field1989] == 1;
         if (var6 != var5.field2267) {
            var5.field2267 = var6;
            class214.method1117(var5);
         }

         return 1;
      } else if (var0 == 1005) {
         var5.field2363 = class150.field1580[--class188.field1989] == 1;
         return 1;
      } else if (var0 == 1006) {
         var5.field2364 = class150.field1580[--class188.field1989] == 1;
         return 1;
      } else {
         return 2;
      }
   }
}
