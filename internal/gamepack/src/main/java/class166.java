public class class166 {
   public static int[] field1827 = new int[99];
   public static final boolean[] field1826 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};

   static {
      int var0 = 0;

      for(int var1 = 0; var1 < 99; ++var1) {
         int var2 = var1 + 1;
         int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
         var0 += var3;
         field1827[var1] = var0 / 4;
      }

   }

   public static class91[] method897() {
      return new class91[]{class91.field984};
   }
}
