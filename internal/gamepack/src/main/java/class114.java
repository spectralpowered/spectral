public class class114 extends class480 {
   static class58 field848;
   static int field850;
   static String field849;
   int field847;
   String field851;
   // $FF: synthetic field
   final class182 this$0;

   class114(class182 var1) {
      this.this$0 = var1;
   }

   void method2367(class127 var1) {
      this.field847 = var1.method595();
      this.field851 = var1.method555();
   }

   void method2368(class429 var1) {
      var1.method2113(this.field847, this.field851);
   }

   public static class106 method451(int var0) {
      class106 var2 = (class106)class106.field818.method394((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class106.field819.method1365(39, var0);
         var2 = new class106();
         if (var3 != null) {
            var2.method419(new class127(var3));
         }

         var2.method420();
         class106.field818.method396(var2, (long)var0);
         return var2;
      }
   }
}
