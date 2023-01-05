public class class312 extends class480 {
   static class397 field2467;
   static int field2465;
   int field2464;
   int field2466;
   // $FF: synthetic field
   final class182 this$0;

   class312(class182 var1) {
      this.this$0 = var1;
   }

   void method2367(class127 var1) {
      this.field2464 = var1.method595();
      this.field2466 = var1.method595();
   }

   void method2368(class429 var1) {
      var1.method2110(this.field2464, this.field2466);
   }

   static void method1506() {
      Object var1 = class254.field2093;
      synchronized(class254.field2093) {
         if (0 == class254.field2092) {
            class53.field577 = new Thread(new class254());
            class53.field577.setDaemon(true);
            class53.field577.start();
            class53.field577.setPriority(5);
         }

         class254.field2092 = 600;
      }
   }

   public static void method1505() {
      class179.field1647.method395();
   }

   static long method1507() {
      return client.field350;
   }
}
