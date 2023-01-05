import java.io.File;

public class class96 extends class235 {
   static class38 field782;
   int field783;
   // $FF: synthetic field
   final class277 this$0;

   class96(class277 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field783 = var3;
   }

   public int method1023() {
      return 0;
   }

   public int method1025() {
      return this.field783;
   }

   public static void method387(File var0) {
      class229.field1937 = var0;
      if (!class229.field1937.exists()) {
         throw new RuntimeException("");
      } else {
         class229.field1936 = true;
      }
   }
}
