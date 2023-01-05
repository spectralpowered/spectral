public class class120 extends class108 {
   static class164 field1433;
   static class31 field1434 = new class31(64);
   int[][] field1436;
   Object[][] field1437;
   public int field1435 = -1;

   void method624(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method626(var1, var3);
      }
   }

   public Object[] method627(int var1) {
      return this.field1437 == null ? null : this.field1437[var1];
   }

   void method626(class134 var1, int var2) {
      if (var2 == 3) {
         int var4 = var1.method669();
         if (null == this.field1437) {
            this.field1437 = new Object[var4][];
            this.field1436 = new int[var4][];
         }

         for(int var5 = var1.method669(); var5 != 255; var5 = var1.method669()) {
            int var6 = var1.method669();
            int[] var7 = new int[var6];

            for(int var8 = 0; var8 < var6; ++var8) {
               var7[var8] = var1.method681();
            }

            Object[][] var17 = this.field1437;
            int var11 = var1.method681();
            Object[] var12 = new Object[var7.length * var11];

            for(int var13 = 0; var13 < var11; ++var13) {
               for(int var14 = 0; var14 < var7.length; ++var14) {
                  int var15 = var13 * var7.length + var14;
                  class180 var16 = class328.method1591(var7[var14]);
                  var12[var15] = var16.method941(var1);
               }
            }

            var17[var5] = var12;
            this.field1436[var5] = var7;
         }
      } else if (var2 == 4) {
         this.field1435 = var1.method683();
      }

   }

   void method625() {
   }
}
