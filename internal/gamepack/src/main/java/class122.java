public class class122 {
   static class344 field1054;
   int field1050;
   int field1051;
   int field1052;
   int field1053;

   class122(int var1, int var2, int var3, int var4) {
      this.field1053 = var1;
      this.field1050 = var2;
      this.field1051 = var3;
      this.field1052 = var4;
   }

   int method517() {
      return this.field1053;
   }

   int method518() {
      return this.field1050;
   }

   int method519() {
      return this.field1051;
   }

   int method520() {
      return this.field1052;
   }

   static boolean method521(class87 var0) {
      if (var0.field745 != null) {
         int[] var2 = var0.field745;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            class87 var5 = class85.method356(var4);
            if (-1 != var5.field733) {
               return true;
            }
         }
      } else if (var0.field733 != -1) {
         return true;
      }

      return false;
   }
}
