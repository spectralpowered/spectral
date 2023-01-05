public class class251 extends class187 {
   byte field2623;
   int field2624;
   int field2625;
   String field2626;
   // $FF: synthetic field
   final class124 this$0;

   class251(class124 var1) {
      this.this$0 = var1;
      this.field2624 = -1;
   }

   void method972(class134 var1) {
      var1.method669();
      this.field2624 = var1.method671();
      this.field2623 = var1.method670();
      this.field2625 = var1.method671();
      var1.method720();
      this.field2626 = var1.method677();
      var1.method669();
   }

   void method973(class112 var1) {
      class278 var3 = (class278)var1.field1397.get(this.field2624);
      var3.field2759 = this.field2623;
      var3.field2758 = this.field2625;
      var3.field2757 = new class174(this.field2626);
   }

   public static class295 method1235(int var0) {
      class295 var2 = (class295)class295.field2824.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class295.field2828.method892(11, var0);
         var2 = new class295();
         if (var3 != null) {
            var2.method1387(new class134(var3));
         }

         var2.method1390();
         class295.field2824.method163(var2, (long)var0);
         return var2;
      }
   }

   public static class224[] method1234() {
      return new class224[]{class224.field2441, class224.field2446, class224.field2439, class224.field2440, class224.field2452, class224.field2438, class224.field2448, class224.field2447, class224.field2455, class224.field2444, class224.field2436, class224.field2445, class224.field2437, class224.field2443, class224.field2449, class224.field2450, class224.field2451};
   }

   public static void method1236() {
      class192.field1995.method162();
      class192.field1996.method162();
   }
}
