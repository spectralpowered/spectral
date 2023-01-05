public class class168 extends class410 {
   static int field1265;
   byte field1264;
   int field1261;
   int field1263;
   String field1262;
   // $FF: synthetic field
   final class302 this$0;

   class168(class302 var1) {
      this.this$0 = var1;
      this.field1261 = -1;
   }

   void method2007(class127 var1) {
      this.field1261 = var1.method549();
      this.field1264 = var1.method548();
      this.field1263 = var1.method549();
      var1.method598();
      this.field1262 = var1.method555();
   }

   void method2008(class57 var1) {
      class49 var3 = (class49)var1.field597.get(this.field1261);
      var3.field569 = this.field1264;
      var3.field568 = this.field1263;
      var3.field567 = new class257(this.field1262);
   }
}
