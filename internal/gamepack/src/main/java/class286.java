import java.io.File;

public class class286 extends class300 {
   static class230 field2786;
   int field2787;
   // $FF: synthetic field
   final class452 this$0;

   class286(class452 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field2787 = var3;
   }

   public int method1418() {
      return 0;
   }

   public int method1420() {
      return this.field2787;
   }

   public static void method1364(File var0) {
      class51.field752 = var0;
      if (!class51.field752.exists()) {
         throw new RuntimeException("");
      } else {
         class51.field751 = true;
      }
   }
}
