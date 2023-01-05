public class class133 {
   static class161 field1485;
   class2 field1484;
   int field1481;
   int field1482;
   String field1483;

   class133(String var1, int var2, int var3, class2 var4) {
      this.field1483 = var1;
      this.field1482 = var2;
      this.field1481 = var3;
      this.field1484 = var4;
   }

   static int method651(char var0, class22 var1) {
      int var3 = var0 << 4;
      if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
         var0 = Character.toLowerCase(var0);
         var3 = 1 + (var0 << 4);
      }

      if (var0 == 241 && var1 == class22.field160) {
         var3 = 1762;
      }

      return var3;
   }

   static final void method652(class210[] var0, int var1) {
      for(int var3 = 0; var3 < var0.length; ++var3) {
         class210 var4 = var0[var3];
         if (null != var4) {
            if (0 == var4.field2348) {
               if (null != var4.field2353) {
                  method652(var4.field2353, var1);
               }

               class240 var5 = (class240)client.field598.method545((long)var4.field2307);
               if (var5 != null) {
                  class100.method552(var5.field2580, var1);
               }
            }

            class169 var6;
            if (var1 == 0 && var4.field2336 != null) {
               var6 = new class169();
               var6.field1848 = var4;
               var6.field1850 = var4.field2336;
               class194.method1001(var6);
            }

            if (var1 == 1 && var4.field2337 != null) {
               if (var4.field2217 >= 0) {
                  class210 var7 = class274.method1301(var4.field2307);
                  if (null == var7 || null == var7.field2353 || var4.field2217 >= var7.field2353.length || var7.field2353[var4.field2217] != var4) {
                     continue;
                  }
               }

               var6 = new class169();
               var6.field1848 = var4;
               var6.field1850 = var4.field2337;
               class194.method1001(var6);
            }
         }
      }

   }
}
