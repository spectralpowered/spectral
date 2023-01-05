final class class59 implements class290 {
   static int field817;
   // $FF: synthetic field
   final class210 val$cc;

   class59(class210 var1) {
      this.val$cc = var1;
   }

   public void method1367() {
      if (this.val$cc != null && this.val$cc.method1087().field2633 != null) {
         class169 var2 = new class169();
         var2.method902(this.val$cc);
         var2.method900(this.val$cc.method1087().field2633);
         class242.method1219().method1930(var2);
      }

   }

   static float method338(class360 var0, float var1) {
      if (var0 == null) {
         return 0.0F;
      } else {
         float var3 = var1 - var0.field3216;
         return (var0.field3210 + var3 * (var0.field3218 * var3 + var0.field3232)) * var3 + var0.field3221;
      }
   }
}
