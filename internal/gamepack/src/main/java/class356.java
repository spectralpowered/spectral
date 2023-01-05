public class class356 {
   static class161 field3196;
   int field3192;
   int field3193;
   int field3194;
   int field3195;

   class356(int var1, int var2, int var3, int var4) {
      this.field3195 = var1;
      this.field3192 = var2;
      this.field3193 = var3;
      this.field3194 = var4;
   }

   int method1702() {
      return this.field3195;
   }

   int method1703() {
      return this.field3192;
   }

   int method1704() {
      return this.field3193;
   }

   int method1705() {
      return this.field3194;
   }

   static boolean method1706(class173 var0) {
      if (var0.field1903 != null) {
         int[] var2 = var0.field1903;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            int var4 = var2[var3];
            class173 var5 = class212.method1110(var4);
            if (-1 != var5.field1891) {
               return true;
            }
         }
      } else if (var0.field1891 != -1) {
         return true;
      }

      return false;
   }
}
