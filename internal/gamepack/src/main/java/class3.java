public class class3 extends class172 {
   long field14 = System.nanoTime();

   public void method910() {
      this.field14 = System.nanoTime();
   }

   public int method911(int var1, int var2) {
      long var4 = 1000000L * (long)var2;
      long var6 = this.field14 - System.nanoTime();
      if (var6 < var4) {
         var6 = var4;
      }

      class324.method1571(var6 / 1000000L);
      long var8 = System.nanoTime();

      int var10;
      for(var10 = 0; var10 < 10 && (var10 < 1 || this.field14 < var8); this.field14 += (long)var1 * 1000000L) {
         ++var10;
      }

      if (this.field14 < var8) {
         this.field14 = var8;
      }

      return var10;
   }
}
