public class class450 {
   public static final class450 field3694 = new class450("application/json");
   static int field3697;
   static final class450 field3695 = new class450("text/plain");
   String field3696;

   class450(String var1) {
      this.field3696 = var1;
   }

   public String method2128() {
      return this.field3696;
   }

   static void method2129(class296[] var0, int var1, int var2, int[] var3, int[] var4) {
      if (var1 < var2) {
         int var6 = var1 - 1;
         int var7 = var2 + 1;
         int var8 = (var1 + var2) / 2;
         class296 var9 = var0[var8];
         var0[var8] = var0[var1];
         var0[var1] = var9;

         while(var6 < var7) {
            boolean var10 = true;

            int var11;
            int var12;
            int var13;
            do {
               --var7;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (2 == var3[var11]) {
                     var12 = var0[var7].field2842;
                     var13 = var9.field2842;
                  } else if (var3[var11] == 1) {
                     var12 = var0[var7].field2839;
                     var13 = var9.field2839;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && 1 == var4[var11]) {
                        var13 = 2001;
                     }
                  } else if (3 == var3[var11]) {
                     var12 = var0[var7].method1392() ? 1 : 0;
                     var13 = var9.method1392() ? 1 : 0;
                  } else {
                     var12 = var0[var7].field2832;
                     var13 = var9.field2832;
                  }

                  if (var12 != var13) {
                     if ((1 != var4[var11] || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            var10 = true;

            do {
               ++var6;

               for(var11 = 0; var11 < 4; ++var11) {
                  if (2 == var3[var11]) {
                     var12 = var0[var6].field2842;
                     var13 = var9.field2842;
                  } else if (1 == var3[var11]) {
                     var12 = var0[var6].field2839;
                     var13 = var9.field2839;
                     if (var12 == -1 && var4[var11] == 1) {
                        var12 = 2001;
                     }

                     if (var13 == -1 && var4[var11] == 1) {
                        var13 = 2001;
                     }
                  } else if (var3[var11] == 3) {
                     var12 = var0[var6].method1392() ? 1 : 0;
                     var13 = var9.method1392() ? 1 : 0;
                  } else {
                     var12 = var0[var6].field2832;
                     var13 = var9.field2832;
                  }

                  if (var12 != var13) {
                     if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
                        var10 = false;
                     }
                     break;
                  }

                  if (var11 == 3) {
                     var10 = false;
                  }
               }
            } while(var10);

            if (var6 < var7) {
               class296 var14 = var0[var6];
               var0[var6] = var0[var7];
               var0[var7] = var14;
            }
         }

         method2129(var0, var1, var7, var3, var4);
         method2129(var0, var7 + 1, var2, var3, var4);
      }

   }

   public static void method2127() {
      class120.field1434.method162();
   }
}
