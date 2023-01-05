@ObfInfo(
   name = "ez"
)
public class class332 extends class480 {
   @ObfInfo(
      owner = "ez",
      name = "r",
      desc = "Lra;"
   )
   static class344 field2604;
   @ObfInfo(
      owner = "ez",
      name = "h",
      desc = "I"
   )
   int field2603;
   // $FF: synthetic field
   @ObfInfo(
      owner = "ez",
      name = "this$0",
      desc = "Lem;"
   )
   final class182 this$0;

   @ObfInfo(
      owner = "ez",
      name = "<init>",
      desc = "(Lem;)V"
   )
   class332(class182 var1) {
      this.this$0 = var1;
      this.field2603 = -1;
   }

   @ObfInfo(
      owner = "ez",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2367(class127 var1) {
      this.field2603 = var1.method549();
   }

   @ObfInfo(
      owner = "ez",
      name = "e",
      desc = "(Lep;I)V"
   )
   void method2368(class429 var1) {
      var1.method2116(this.field2603);
   }

   @ObfInfo(
      owner = "ez",
      name = "h",
      desc = "(IB)Z"
   )
   public static boolean method1675(int var0) {
      return var0 == class394.field3306.field3307;
   }
}
