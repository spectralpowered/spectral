public class class185 extends class209 {
   public int field1978 = -1;
   public int field1979;
   public int field1980;

   void method966(int var1, int var2) {
      this.field1978 = var1;
      this.field1980 = var2;
   }

   public int method968() {
      return this.field1978;
   }

   public boolean method967() {
      return this.field1978 > 0;
   }

   static final void method969(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var7 = var2 - var0;
      int var8 = var3 - var1;
      int var9 = var7 >= 0 ? var7 : -var7;
      int var10 = var8 >= 0 ? var8 : -var8;
      int var11 = var9;
      if (var9 < var10) {
         var11 = var10;
      }

      if (var11 != 0) {
         int var12 = (var7 << 16) / var11;
         int var13 = (var8 << 16) / var11;
         if (var13 <= var12) {
            var12 = -var12;
         } else {
            var13 = -var13;
         }

         int var14 = var13 * var5 >> 17;
         int var15 = var5 * var13 + 1 >> 17;
         int var16 = var5 * var12 >> 17;
         int var17 = 1 + var5 * var12 >> 17;
         var0 -= class362.field3246;
         var1 -= class362.field3244;
         int var18 = var14 + var0;
         int var19 = var0 - var15;
         int var20 = var0 + var7 - var15;
         int var21 = var7 + var0 + var14;
         int var22 = var1 + var16;
         int var23 = var1 - var17;
         int var24 = var8 + var1 - var17;
         int var25 = var16 + var8 + var1;
         class234.method1173(var18, var19, var20);
         class234.method1177(var22, var23, var24, var18, var19, var20, var4);
         class234.method1173(var18, var20, var21);
         class234.method1177(var22, var24, var25, var18, var20, var21, var4);
      }
   }
}
