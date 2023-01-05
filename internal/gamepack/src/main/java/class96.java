import java.io.File;

@ObfInfo(
   name = "fu"
)
public class class96 extends class235 {
   @ObfInfo(
      owner = "fu",
      name = "fa",
      desc = "Lln;"
   )
   static class38 field782;
   @ObfInfo(
      owner = "fu",
      name = "h",
      desc = "I"
   )
   int field783;
   // $FF: synthetic field
   @ObfInfo(
      owner = "fu",
      name = "this$0",
      desc = "Lfk;"
   )
   final class277 this$0;

   @ObfInfo(
      owner = "fu",
      name = "<init>",
      desc = "(Lfk;Ljava/lang/String;I)V"
   )
   class96(class277 var1, String var2, int var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field783 = var3;
   }

   @ObfInfo(
      owner = "fu",
      name = "h",
      desc = "(B)I"
   )
   public int method1023() {
      return 0;
   }

   @ObfInfo(
      owner = "fu",
      name = "q",
      desc = "(I)I"
   )
   public int method1025() {
      return this.field783;
   }

   @ObfInfo(
      owner = "fu",
      name = "h",
      desc = "(Ljava/io/File;I)V"
   )
   public static void method387(File var0) {
      class229.field1937 = var0;
      if (!class229.field1937.exists()) {
         throw new RuntimeException("");
      } else {
         class229.field1936 = true;
      }
   }
}
