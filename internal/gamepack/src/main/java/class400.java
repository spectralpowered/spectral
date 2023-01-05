public class class400 extends class108 {
   public final int field3511;
   public final int field3512;
   public final int[] field3510;
   public final int[] field3513;

   class400(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field3511 = var1;
      this.field3512 = var2;
      this.field3510 = var3;
      this.field3513 = var4;
   }

   public boolean method1958(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field3513.length) {
         int var4 = this.field3513[var2];
         if (var1 >= var4 && var1 <= this.field3510[var2] + var4) {
            return true;
         }
      }

      return false;
   }
}
