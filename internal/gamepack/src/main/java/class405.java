public class class405 extends class108 {
   public static int[] field3529;
   static class161 field3530;
   static class230 field3532;
   static int field3533;
   class149[] field3531;

   public class405(class164 var1, class164 var2, int var3, boolean var4) {
      class397 var5 = new class397();
      int var6 = var1.method887(var3);
      this.field3531 = new class149[var6];
      int[] var7 = var1.method878(var3);

      for(int var8 = 0; var8 < var7.length; ++var8) {
         byte[] var9 = var1.method892(var3, var7[var8]);
         class268 var10 = null;
         int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

         for(class268 var12 = (class268)var5.method1934(); null != var12; var12 = (class268)var5.method1936()) {
            if (var12.field2694 == var11) {
               var10 = var12;
               break;
            }
         }

         if (null == var10) {
            byte[] var13;
            if (var4) {
               var13 = var2.method875(0, var11);
            } else {
               var13 = var2.method875(var11, 0);
            }

            var10 = new class268(var11, var13);
            var5.method1930(var10);
         }

         this.field3531[var7[var8]] = new class149(var9, var10);
      }

   }

   public boolean method1979(int var1) {
      return this.field3531[var1].field1576;
   }

   public static byte[] method1980(Object var0, boolean var1) {
      if (null == var0) {
         return null;
      } else if (var0 instanceof byte[]) {
         byte[] var4 = (byte[])((byte[])var0);
         return var1 ? class407.method1992(var4) : var4;
      } else if (var0 instanceof class440) {
         class440 var3 = (class440)var0;
         return var3.method2095();
      } else {
         throw new IllegalArgumentException();
      }
   }
}
