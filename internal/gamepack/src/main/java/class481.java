public class class481 {
   static final int[] field3984 = new int[2048];
   static final int[] field3985 = new int[2048];

   static {
      double var0 = 0.0030679615757712823D;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field3984[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
         field3985[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
      }

   }
}
