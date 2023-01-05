@ObfInfo(
   name = "ck"
)
final class class292 implements class366 {
   @ObfInfo(
      owner = "ck",
      name = "tk",
      desc = "I"
   )
   static int field2376;
   // $FF: synthetic field
   @ObfInfo(
      owner = "ck",
      name = "val$cc",
      desc = "Lkd;"
   )
   final class120 val$cc;

   @ObfInfo(
      owner = "ck",
      name = "<init>",
      desc = "(Lkd;)V"
   )
   class292(class120 var1) {
      this.val$cc = var1;
   }

   @ObfInfo(
      owner = "ck",
      name = "h",
      desc = "(I)V"
   )
   public void method1811() {
      if (this.val$cc != null && this.val$cc.method496().field81 != null) {
         class488 var2 = new class488();
         var2.method2396(this.val$cc);
         var2.method2394(this.val$cc.method496().field81);
         class271.method1278().method642(var2);
      }

   }

   @ObfInfo(
      owner = "ck",
      name = "v",
      desc = "(Ldu;FB)F"
   )
   static float method1434(class84 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var3 = var1 - var0.field680;
         return (var0.field674 + var3 * (var0.field682 * var3 + var0.field696)) * var3 + var0.field685;
      }
   }
}
