public class class298 extends class195 {
   public static int[] field2394;
   static class344 field2395;
   static class38 field2397;
   static int field2398;
   class216[] field2396;

   public class298(class274 var1, class274 var2, int var3, boolean var4) {
      class141 var5 = new class141();
      int var6 = var1.method1360(var3);
      this.field2396 = new class216[var6];
      int[] var7 = var1.method1351(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method1365(var3, var7[var8]);
         class176 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class176 var12 = (class176)var5.method646(); null != var12; var12 = (class176)var5.method648()) {
            if (var12.field1317 == var11) {
               var10 = var12;
               break;
            }
         }

         if (null == var10) {
            byte[] var13;
            if (var4) {
               var13 = var2.method1348(0, var11);
            } else {
               var13 = var2.method1348(var11, 0);
            }

            var10 = new class176(var11, var13);
            var5.method642(var10);
         }

         this.field2396[var7[var8]] = new class216(var9, var10);
      }

   }

   public boolean method1444(int var1) {
      return this.field2396[var1].field1886;
   }

   public static byte[] method1445(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])var0);
         return var1 ? class449.method2237(var4) : var4;
      } else if (var0 instanceof class53) {
         class53 var3 = (class53)var0;
         return var3.method260();
      } else {
         throw new IllegalArgumentException();
      }
   }
}
