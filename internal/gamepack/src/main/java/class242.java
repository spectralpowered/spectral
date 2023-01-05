public class class242 {
   int field2584;
   int field2585;
   int field2586;
   int field2587;
   int field2588;
   int field2589;

   class242(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field2589 = var1;
      this.field2585 = var2;
      this.field2586 = var3;
      this.field2587 = var4;
      this.field2588 = var5;
      this.field2584 = var6;
   }

   public static class79 method1218(int var0) {
      class79 var2 = (class79)class79.field900.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class79.field898.method892(12, var0);
         var2 = new class79();
         if (var3 != null) {
            var2.method421(new class134(var3));
         }

         var2.method422();
         class79.field900.method163(var2, (long)var0);
         return var2;
      }
   }

   public static class397 method1219() {
      return client.field499;
   }
}
