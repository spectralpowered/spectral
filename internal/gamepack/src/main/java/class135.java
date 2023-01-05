public class class135 {
   static final int[] field1490 = new int[16384];
   static final int[] field1491 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4D;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field1490[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
         field1491[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
      }

   }
}
