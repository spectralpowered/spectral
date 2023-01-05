public class class138 {
   public int field1499;
   public int field1500;
   public int field1501;

   static void method734(String var0, boolean var1) {
      var0 = var0.toLowerCase();
      short[] var3 = new short[16];
      int var4 = 0;

      for(int var5 = 0; var5 < class458.field3796; ++var5) {
         class458 var6 = class272.method1294(var5);
         if ((!var1 || var6.field3807) && -1 == var6.field3798 && var6.field3764.toLowerCase().indexOf(var0) != -1) {
            if (var4 >= 250) {
               class169.field1857 = -1;
               class326.field3048 = null;
               return;
            }

            if (var4 >= var3.length) {
               short[] var7 = new short[2 * var3.length];

               for(int var8 = 0; var8 < var4; ++var8) {
                  var7[var8] = var3[var8];
               }

               var3 = var7;
            }

            var3[var4++] = (short)var5;
         }
      }

      class326.field3048 = var3;
      class447.field3665 = 0;
      class169.field1857 = var4;
      String[] var9 = new String[class169.field1857];

      for(int var10 = 0; var10 < class169.field1857; ++var10) {
         var9[var10] = class272.method1294(var3[var10]).field3764;
      }

      short[] var11 = class326.field3048;
      class86.method470(var9, var11, 0, var9.length - 1);
   }
}
