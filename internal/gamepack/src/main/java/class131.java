public class class131 extends class305 {
   public static String field1474;
   final boolean field1475;

   public class131(boolean var1) {
      this.field1475 = var1;
   }

   int method644(class185 var1, class185 var2) {
      if (var1.field1978 != var2.field1978) {
         return this.field1475 ? var1.field1978 - var2.field1978 : var2.field1978 - var1.field1978;
      } else {
         return this.method1440(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method644((class185)var1, (class185)var2);
   }

   public static class111 method645(int var0) {
      class111 var2 = (class111)class111.field1383.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class111.field1386.method892(34, var0);
         var2 = new class111();
         if (null != var3) {
            var2.method584(new class134(var3));
         }

         var2.method582();
         class111.field1383.method163(var2, (long)var0);
         return var2;
      }
   }

   static void method646() {
      if (client.field462) {
         class16.method98(class89.field982, false);
      }

   }
}
