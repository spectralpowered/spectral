@ObfInfo(
   name = "ej"
)
public class class114 extends class480 {
   @ObfInfo(
      owner = "ej",
      name = "hh",
      desc = "Lnv;"
   )
   static class58 field848;
   @ObfInfo(
      owner = "ej",
      name = "ti",
      desc = "I"
   )
   static int field850;
   @ObfInfo(
      owner = "ej",
      name = "fm",
      desc = "Ljava/lang/String;"
   )
   static String field849;
   @ObfInfo(
      owner = "ej",
      name = "h",
      desc = "I"
   )
   int field847;
   @ObfInfo(
      owner = "ej",
      name = "e",
      desc = "Ljava/lang/String;"
   )
   String field851;
   // $FF: synthetic field
   @ObfInfo(
      owner = "ej",
      name = "this$0",
      desc = "Lem;"
   )
   final class182 this$0;

   @ObfInfo(
      owner = "ej",
      name = "<init>",
      desc = "(Lem;)V"
   )
   class114(class182 var1) {
      this.this$0 = var1;
   }

   @ObfInfo(
      owner = "ej",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2367(class127 var1) {
      this.field847 = var1.method595();
      this.field851 = var1.method555();
   }

   @ObfInfo(
      owner = "ej",
      name = "e",
      desc = "(Lep;I)V"
   )
   void method2368(class429 var1) {
      var1.method2113(this.field847, this.field851);
   }

   @ObfInfo(
      owner = "ej",
      name = "e",
      desc = "(II)Lqs;"
   )
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
