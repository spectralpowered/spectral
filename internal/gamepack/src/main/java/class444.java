@ObfInfo(
   name = "nb"
)
public final class class444 {
   @ObfInfo(
      owner = "nb",
      name = "e",
      desc = "I"
   )
   int field3669;
   @ObfInfo(
      owner = "nb",
      name = "h",
      desc = "Ljava/lang/Object;"
   )
   final Object field3668;

   @ObfInfo(
      owner = "nb",
      name = "<init>",
      desc = "(Ljava/lang/Object;I)V"
   )
   class444(Object var1, int var2) {
      this.field3668 = var1;
      this.field3669 = var2;
   }

   @ObfInfo(
      owner = "nb",
      name = "h",
      desc = "(II)Lgm;"
   )
   public static class473 method2198(int var0) {
      class473 var2 = (class473)class473.field3981.method394((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class362.field3086.method1365(32, var0);
         var2 = new class473();
         if (var3 != null) {
            var2.method2348(new class127(var3));
         }

         class473.field3981.method396(var2, (long)var0);
         return var2;
      }
   }
}
