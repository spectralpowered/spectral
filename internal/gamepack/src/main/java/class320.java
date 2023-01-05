import java.io.IOException;

public class class320 {
   static final class320 field3020 = new class320(25, 28, 800, 656, 40, 40);
   static final class320 field3023 = new class320(51, 27, 800, 0, 16, 16);
   final int field3021;
   final int field3022;

   class320(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field3021 = var5;
      this.field3022 = var6;
   }

   static void method1564() {
      class58.field812.clear();
      class58.field815.method1791();
      class58.field813.method785();
      class58.field814 = 0;
   }

   static class280 method1563() {
      class476 var1 = null;
      class280 var2 = new class280();

      try {
         var1 = class188.method976("", class451.field3700.field3137, false);
         byte[] var3 = new byte[(int)var1.method2305()];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.method2304(var3, var4, var3.length - var4);
            if (var5 == -1) {
               throw new IOException();
            }
         }

         var2 = new class280(new class134(var3));
      } catch (Exception var7) {
         ;
      }

      try {
         if (var1 != null) {
            var1.method2302();
         }
      } catch (Exception var6) {
         ;
      }

      return var2;
   }
}
