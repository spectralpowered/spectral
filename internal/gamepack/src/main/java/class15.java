@ObfInfo(
   name = "eq"
)
public class class15 extends class480 {
   @ObfInfo(
      owner = "eq",
      name = "qa",
      desc = "Lqk;"
   )
   static class449 field74;
   @ObfInfo(
      owner = "eq",
      name = "fl",
      desc = "I"
   )
   static int field72;
   @ObfInfo(
      owner = "eq",
      name = "e",
      desc = "Z"
   )
   boolean field71;
   @ObfInfo(
      owner = "eq",
      name = "h",
      desc = "I"
   )
   int field73;
   // $FF: synthetic field
   @ObfInfo(
      owner = "eq",
      name = "this$0",
      desc = "Lem;"
   )
   final class182 this$0;

   @ObfInfo(
      owner = "eq",
      name = "<init>",
      desc = "(Lem;)V"
   )
   class15(class182 var1) {
      this.this$0 = var1;
      this.field73 = -1;
   }

   @ObfInfo(
      owner = "eq",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2367(class127 var1) {
      this.field73 = var1.method549();
      this.field71 = var1.method547() == 1;
   }

   @ObfInfo(
      owner = "eq",
      name = "e",
      desc = "(Lep;I)V"
   )
   void method2368(class429 var1) {
      var1.method2115(this.field73, this.field71);
   }

   @ObfInfo(
      owner = "eq",
      name = "m",
      desc = "(IB)I"
   )
   static int method73(int var0) {
      class34 var2 = (class34)class100.field792.get(var0);
      return var2 == null ? 0 : var2.method143();
   }
}
