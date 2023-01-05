public class class484 {
   public static int[] field3991;
   public static int[] field3992;
   public static short[][] field3993;
   static int[] field3994 = new int[32];

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field3994[var1] = var0 - 1;
         var0 += var0;
      }

      field3991 = new int[4000];
      field3992 = new int[4000];
   }

   static int method2318(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
