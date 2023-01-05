@ObfInfo(
   name = "ib"
)
public class class411 {
   @ObfInfo(
      owner = "ib",
      name = "hm",
      desc = "(I)V"
   )
   static final void method2010() {
      if (class347.field2878 != client.field332) {
         client.field332 = class347.field2878;
         int var1 = class347.field2878;
         int[] var2 = class211.field1833.field2205;
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
               if (0 == (class71.field644[var1][var6][var4] & 24)) {
                  class408.field3415.method1584(var2, var5, 512, var1, var6, var4);
               }

               if (var1 < 3 && 0 != (class71.field644[var1 + 1][var6][var4] & 8)) {
                  class408.field3415.method1584(var2, var5, 512, var1 + 1, var6, var4);
               }

               var5 += 4;
            }
         }

         var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
         var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
         class211.field1833.method1233();

         int var7;
         for(var6 = 1; var6 < 103; ++var6) {
            for(var7 = 1; var7 < 103; ++var7) {
               if (0 == (class71.field644[var1][var7][var6] & 24)) {
                  class475.method2352(var1, var7, var6, var4, var5);
               }

               if (var1 < 3 && 0 != (class71.field644[var1 + 1][var7][var6] & 8)) {
                  class475.method2352(var1 + 1, var7, var6, var4, var5);
               }
            }
         }

         client.field469 = 0;

         for(var6 = 0; var6 < 104; ++var6) {
            for(var7 = 0; var7 < 104; ++var7) {
               long var8 = class408.field3415.method1581(class347.field2878, var6, var7);
               if (var8 != 0L) {
                  int var10 = class174.method803(var8);
                  int var11 = class85.method356(var10).field733;
                  if (var11 >= 0 && class25.method100(var11).field3326) {
                     client.field472[client.field469] = class25.method100(var11).method1946(false);
                     client.field470[client.field469] = var6;
                     client.field471[client.field469] = var7;
                     ++client.field469;
                  }
               }
            }
         }

         class39.field199.method264();
      }

   }
}
