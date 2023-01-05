@ObfInfo(
   name = "cd"
)
final class class249 implements class366 {
   @ObfInfo(
      owner = "cd",
      name = "ng",
      desc = "I"
   )
   static int field2059;
   @ObfInfo(
      owner = "cd",
      name = "tt",
      desc = "I"
   )
   static int field2060;
   // $FF: synthetic field
   @ObfInfo(
      owner = "cd",
      name = "val$cc",
      desc = "Lkd;"
   )
   final class120 val$cc;

   @ObfInfo(
      owner = "cd",
      name = "<init>",
      desc = "(Lkd;)V"
   )
   class249(class120 var1) {
      this.val$cc = var1;
   }

   @ObfInfo(
      owner = "cd",
      name = "h",
      desc = "(I)V"
   )
   public void method1811() {
      if (null != this.val$cc && this.val$cc.method496().field80 != null) {
         class488 var2 = new class488();
         var2.method2396(this.val$cc);
         var2.method2394(this.val$cc.method496().field80);
         class271.method1278().method642(var2);
      }

   }

   @ObfInfo(
      owner = "cd",
      name = "hl",
      desc = "(II)V"
   )
   static void method1080(int var0) {
      client.field452 = 0L;
      if (var0 >= 2) {
         client.field453 = true;
      } else {
         client.field453 = false;
      }

      if (class152.method713() == 1) {
         class309.field2461.method922(765, 503);
      } else {
         class309.field2461.method922(7680, 2160);
      }

      if (client.field229 >= 25) {
         class214.method957();
      }

   }
}
