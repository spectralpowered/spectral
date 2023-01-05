@ObfInfo(
   name = "er"
)
public class class168 extends class410 {
   @ObfInfo(
      owner = "er",
      name = "pw",
      desc = "I"
   )
   static int field1265;
   @ObfInfo(
      owner = "er",
      name = "e",
      desc = "B"
   )
   byte field1264;
   @ObfInfo(
      owner = "er",
      name = "h",
      desc = "I"
   )
   int field1261;
   @ObfInfo(
      owner = "er",
      name = "v",
      desc = "I"
   )
   int field1263;
   @ObfInfo(
      owner = "er",
      name = "x",
      desc = "Ljava/lang/String;"
   )
   String field1262;
   // $FF: synthetic field
   @ObfInfo(
      owner = "er",
      name = "this$0",
      desc = "Led;"
   )
   final class302 this$0;

   @ObfInfo(
      owner = "er",
      name = "<init>",
      desc = "(Led;)V"
   )
   class168(class302 var1) {
      this.this$0 = var1;
      this.field1261 = -1;
   }

   @ObfInfo(
      owner = "er",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2007(class127 var1) {
      this.field1261 = var1.method549();
      this.field1264 = var1.method548();
      this.field1263 = var1.method549();
      var1.method598();
      this.field1262 = var1.method555();
   }

   @ObfInfo(
      owner = "er",
      name = "e",
      desc = "(Lfn;I)V"
   )
   void method2008(class57 var1) {
      class49 var3 = (class49)var1.field597.get(this.field1261);
      var3.field569 = this.field1264;
      var3.field568 = this.field1263;
      var3.field567 = new class257(this.field1262);
   }
}
