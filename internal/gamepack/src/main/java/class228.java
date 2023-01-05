public class class228 {
   static final void method1147() {
      if (class195.field2036 != client.field536) {
         client.field536 = class195.field2036;
         int var1 = class195.field2036;
         int[] var2 = class323.field3040.field3019;
         int var3 = var2.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            var2[var4] = 0;
         }

         int var5;
         int var6;
         for(var4 = 1; var4 < 103; ++var4) {
            var5 = 2048 * (103 - var4) + 24628;

            for(var6 = 1; var6 < 103; ++var6) {
               if (0 == (class74.field866[var1][var6][var4] & 24)) {
                  class13.field126.method54(var2, var5, 512, var1, var6, var4);
               }

               if (var1 < 3 && 0 != (class74.field866[var1 + 1][var6][var4] & 8)) {
                  class13.field126.method54(var2, var5, 512, var1 + 1, var6, var4);
               }

               var5 += 4;
            }
         }

         var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
         var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
         class323.field3040.method1541();

         int var7;
         for(var6 = 1; var6 < 103; ++var6) {
            for(var7 = 1; var7 < 103; ++var7) {
               if (0 == (class74.field866[var1][var7][var6] & 24)) {
                  class90.method496(var1, var7, var6, var4, var5);
               }

               if (var1 < 3 && 0 != (class74.field866[var1 + 1][var7][var6] & 8)) {
                  class90.method496(var1 + 1, var7, var6, var4, var5);
               }
            }
         }

         client.field673 = 0;

         for(var6 = 0; var6 < 104; ++var6) {
            for(var7 = 0; var7 < 104; ++var7) {
               long var8 = class13.field126.method51(class195.field2036, var6, var7);
               if (var8 != 0L) {
                  int var10 = class7.method24(var8);
                  int var11 = class212.method1110(var10).field1891;
                  if (var11 >= 0 && class143.method776(var11).field2027) {
                     client.field676[client.field673] = class143.method776(var11).method998(false);
                     client.field674[client.field673] = var6;
                     client.field675[client.field673] = var7;
                     ++client.field673;
                  }
               }
            }
         }

         class204.field2184.method1057();
      }

   }
}
