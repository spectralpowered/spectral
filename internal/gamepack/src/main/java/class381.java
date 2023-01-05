public class class381 extends class189 {
   static class298 field3327;
   static int field3325;
   int field3324;
   int field3326;
   // $FF: synthetic field
   final class105 this$0;

   class381(class105 var1) {
      this.this$0 = var1;
   }

   void method979(class134 var1) {
      this.field3324 = var1.method717();
      this.field3326 = var1.method717();
   }

   void method980(class27 var1) {
      var1.method139(this.field3324, this.field3326);
   }

   static void method1811() {
      Object var1 = class267.field2692;
      synchronized(class267.field2692) {
         if (0 == class267.field2691) {
            class440.field3634 = new Thread(new class267());
            class440.field3634.setDaemon(true);
            class440.field3634.start();
            class440.field3634.setPriority(5);
         }

         class267.field2691 = 600;
      }
   }

   public static void method1810() {
      class152.field1594.method162();
   }

   static long method1812() {
      return client.field554;
   }
}
