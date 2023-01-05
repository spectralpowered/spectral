public class class90 {
   public static void method495(class164 var0) {
      class465.field3867 = var0;
   }

   static class467[] method499() {
      return new class467[]{class467.field3889, class467.field3892, class467.field3877, class467.field3881, class467.field3879, class467.field3880, class467.field3876, class467.field3882, class467.field3883, class467.field3884, class467.field3885, class467.field3886, class467.field3887, class467.field3878, class467.field3888, class467.field3890, class467.field3891};
   }

   public static void method497() {
      Object var1 = class267.field2692;
      synchronized(class267.field2692) {
         if (class267.field2691 != 0) {
            class267.field2691 = 1;

            try {
               class267.field2692.wait();
            } catch (InterruptedException var4) {
               ;
            }
         }

      }
   }

   static final int method498(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   static final void method496(int var0, int var1, int var2, int var3, int var4) {
      long var6 = class13.field126.method83(var0, var1, var2);
      int var8;
      int var9;
      int var10;
      int var11;
      int var14;
      int var15;
      if (var6 != 0L) {
         var8 = class13.field126.method77(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = var3;
         boolean var12 = 0L != var6 && !class456.method2160(var6);
         if (var12) {
            var11 = var4;
         }

         int[] var13 = class323.field3040.field3019;
         var14 = var1 * 4 + 24624 + 2048 * (103 - var2);
         var15 = class7.method24(var6);
         class173 var16 = class212.method1110(var15);
         if (var16.field1883 != -1) {
            class161 var17 = class363.field3250[var16.field1883];
            if (var17 != null) {
               int var18 = (var16.field1878 * 4 - var17.field1668) / 2;
               int var19 = (var16.field1879 * 4 - var17.field1665) / 2;
               var17.method849(48 + var1 * 4 + var18, 4 * (104 - var2 - var16.field1879) + 48 + var19);
            }
         } else {
            if (var10 == 0 || var10 == 2) {
               if (var9 == 0) {
                  var13[var14] = var11;
                  var13[var14 + 512] = var11;
                  var13[var14 + 1024] = var11;
                  var13[var14 + 1536] = var11;
               } else if (var9 == 1) {
                  var13[var14] = var11;
                  var13[var14 + 1] = var11;
                  var13[var14 + 2] = var11;
                  var13[var14 + 3] = var11;
               } else if (var9 == 2) {
                  var13[var14 + 3] = var11;
                  var13[var14 + 3 + 512] = var11;
                  var13[1024 + var14 + 3] = var11;
                  var13[var14 + 3 + 1536] = var11;
               } else if (var9 == 3) {
                  var13[var14 + 1536] = var11;
                  var13[var14 + 1536 + 1] = var11;
                  var13[var14 + 1536 + 2] = var11;
                  var13[var14 + 1536 + 3] = var11;
               }
            }

            if (var10 == 3) {
               if (var9 == 0) {
                  var13[var14] = var11;
               } else if (var9 == 1) {
                  var13[var14 + 3] = var11;
               } else if (var9 == 2) {
                  var13[var14 + 3 + 1536] = var11;
               } else if (var9 == 3) {
                  var13[var14 + 1536] = var11;
               }
            }

            if (var10 == 2) {
               if (var9 == 3) {
                  var13[var14] = var11;
                  var13[var14 + 512] = var11;
                  var13[var14 + 1024] = var11;
                  var13[var14 + 1536] = var11;
               } else if (var9 == 0) {
                  var13[var14] = var11;
                  var13[var14 + 1] = var11;
                  var13[var14 + 2] = var11;
                  var13[var14 + 3] = var11;
               } else if (var9 == 1) {
                  var13[var14 + 3] = var11;
                  var13[512 + var14 + 3] = var11;
                  var13[1024 + var14 + 3] = var11;
                  var13[1536 + var14 + 3] = var11;
               } else if (var9 == 2) {
                  var13[var14 + 1536] = var11;
                  var13[var14 + 1536 + 1] = var11;
                  var13[2 + var14 + 1536] = var11;
                  var13[3 + var14 + 1536] = var11;
               }
            }
         }
      }

      var6 = class13.field126.method81(var0, var1, var2);
      if (var6 != 0L) {
         var8 = class13.field126.method77(var0, var1, var2, var6);
         var9 = var8 >> 6 & 3;
         var10 = var8 & 31;
         var11 = class7.method24(var6);
         class173 var22 = class212.method1110(var11);
         if (var22.field1883 != -1) {
            class161 var24 = class363.field3250[var22.field1883];
            if (null != var24) {
               var14 = (var22.field1878 * 4 - var24.field1668) / 2;
               var15 = (var22.field1879 * 4 - var24.field1665) / 2;
               var24.method849(48 + var1 * 4 + var14, var15 + 48 + 4 * (104 - var2 - var22.field1879));
            }
         } else if (var10 == 9) {
            int var25 = 15658734;
            boolean var26 = var6 != 0L && !class456.method2160(var6);
            if (var26) {
               var25 = 15597568;
            }

            int[] var27 = class323.field3040.field3019;
            int var28 = var1 * 4 + 24624 + 2048 * (103 - var2);
            if (var9 != 0 && var9 != 2) {
               var27[var28] = var25;
               var27[1 + var28 + 512] = var25;
               var27[2 + var28 + 1024] = var25;
               var27[var28 + 1536 + 3] = var25;
            } else {
               var27[var28 + 1536] = var25;
               var27[1 + var28 + 1024] = var25;
               var27[var28 + 512 + 2] = var25;
               var27[var28 + 3] = var25;
            }
         }
      }

      var6 = class13.field126.method51(var0, var1, var2);
      if (0L != var6) {
         var8 = class7.method24(var6);
         class173 var20 = class212.method1110(var8);
         if (-1 != var20.field1883) {
            class161 var21 = class363.field3250[var20.field1883];
            if (null != var21) {
               var11 = (var20.field1878 * 4 - var21.field1668) / 2;
               int var23 = (var20.field1879 * 4 - var21.field1665) / 2;
               var21.method849(var1 * 4 + 48 + var11, var23 + (104 - var2 - var20.field1879) * 4 + 48);
            }
         }
      }

   }
}
