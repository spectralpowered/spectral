@ObfInfo(
   name = "ks"
)
public class class291 {
   @ObfInfo(
      owner = "ks",
      name = "e",
      desc = "[I"
   )
   public static int[] field2372;
   @ObfInfo(
      owner = "ks",
      name = "v",
      desc = "[I"
   )
   public static int[] field2373;
   @ObfInfo(
      owner = "ks",
      name = "i",
      desc = "[[S"
   )
   public static short[][] field2374;
   @ObfInfo(
      owner = "ks",
      name = "h",
      desc = "[I"
   )
   static int[] field2375 = new int[32];

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field2375[var1] = var0 - 1;
         var0 += var0;
      }

      field2372 = new int[4000];
      field2373 = new int[4000];
   }

   @ObfInfo(
      owner = "ks",
      name = "x",
      desc = "(J)I"
   )
   static int method1432(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
