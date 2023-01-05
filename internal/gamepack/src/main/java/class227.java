public class class227 extends class187 {
   static int field2462;
   byte field2461;
   int field2458;
   int field2460;
   String field2459;
   // $FF: synthetic field
   final class124 this$0;

   class227(class124 var1) {
      this.this$0 = var1;
      this.field2458 = -1;
   }

   void method972(class134 var1) {
      this.field2458 = var1.method671();
      this.field2461 = var1.method670();
      this.field2460 = var1.method671();
      var1.method720();
      this.field2459 = var1.method677();
   }

   void method973(class112 var1) {
      class278 var3 = (class278)var1.field1397.get(this.field2458);
      var3.field2759 = this.field2461;
      var3.field2758 = this.field2460;
      var3.field2757 = new class174(this.field2459);
   }
}
