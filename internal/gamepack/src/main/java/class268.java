public class class268 extends class106 {
   static class118 field2699;
   class348 field2698;
   int field2694;
   int field2695;
   int[] field2696;
   int[][] field2697;

   public class268(int var1, byte[] var2) {
      this.field2694 = var1;
      class134 var3 = new class134(var2);
      this.field2695 = var3.method669();
      this.field2696 = new int[this.field2695];
      this.field2697 = new int[this.field2695][];

      int var4;
      for(var4 = 0; var4 < this.field2695; ++var4) {
         this.field2696[var4] = var3.method669();
      }

      for(var4 = 0; var4 < this.field2695; ++var4) {
         this.field2697[var4] = new int[var3.method669()];
      }

      for(var4 = 0; var4 < this.field2695; ++var4) {
         for(int var5 = 0; var5 < this.field2697[var4].length; ++var5) {
            this.field2697[var4][var5] = var3.method669();
         }
      }

      if (var3.field1487 < var3.field1489.length) {
         var4 = var3.method671();
         if (var4 > 0) {
            this.field2698 = new class348(var3, var4);
         }
      }

   }

   public int method1274() {
      return this.field2695;
   }

   public class348 method1273() {
      return this.field2698;
   }

   static final void method1275() {
      class96 var10000 = (class96)null;
      String var1 = class96.field1201;
      class237.method1197(30, "", var1);
   }
}
