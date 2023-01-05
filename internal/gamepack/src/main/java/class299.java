public class class299 extends class189 {
   static class394 field2880;
   static int field2882;
   static String field2881;
   int field2879;
   String field2883;
   // $FF: synthetic field
   final class105 this$0;

   class299(class105 var1) {
      this.this$0 = var1;
   }

   void method979(class134 var1) {
      this.field2879 = var1.method717();
      this.field2883 = var1.method677();
   }

   void method980(class27 var1) {
      var1.method142(this.field2879, this.field2883);
   }

   public static class301 method1416(int var0) {
      class301 var2 = (class301)class301.field2888.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class301.field2889.method892(39, var0);
         var2 = new class301();
         if (var3 != null) {
            var2.method1421(new class134(var3));
         }

         var2.method1422();
         class301.field2888.method163(var2, (long)var0);
         return var2;
      }
   }
}
