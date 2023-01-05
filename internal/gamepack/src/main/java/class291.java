public class class291 {
   public static int[] field2372;
   public static int[] field2373;
   public static short[][] field2374;
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

   static int method1432(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
