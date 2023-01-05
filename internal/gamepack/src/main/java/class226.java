@ObfInfo(
   name = "kv"
)
public class class226 extends class195 {
   @ObfInfo(
      owner = "kv",
      name = "h",
      desc = "I"
   )
   public final int field1926;
   @ObfInfo(
      owner = "kv",
      name = "e",
      desc = "I"
   )
   public final int field1927;
   @ObfInfo(
      owner = "kv",
      name = "v",
      desc = "[I"
   )
   public final int[] field1925;
   @ObfInfo(
      owner = "kv",
      name = "x",
      desc = "[I"
   )
   public final int[] field1928;

   @ObfInfo(
      owner = "kv",
      name = "<init>",
      desc = "(II[I[II)V"
   )
   class226(int var1, int var2, int[] var3, int[] var4, int var5) {
      this.field1926 = var1;
      this.field1927 = var2;
      this.field1925 = var3;
      this.field1928 = var4;
   }

   @ObfInfo(
      owner = "kv",
      name = "h",
      desc = "(III)Z"
   )
   public boolean method991(int var1, int var2) {
      if (var2 >= 0 && var2 < this.field1928.length) {
         int var4 = this.field1928[var2];
         if (var1 >= var4 && var1 <= this.field1925[var2] + var4) {
            return true;
         }
      }

      return false;
   }
}
