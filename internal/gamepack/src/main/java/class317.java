@ObfInfo(
   name = "fr"
)
public class class317 extends class235 {
   @ObfInfo(
      owner = "fr",
      name = "ep",
      desc = "Lln;"
   )
   static class38 field2494;
   @ObfInfo(
      owner = "fr",
      name = "h",
      desc = "Ljava/lang/String;"
   )
   String field2493;
   // $FF: synthetic field
   @ObfInfo(
      owner = "fr",
      name = "this$0",
      desc = "Lfk;"
   )
   final class277 this$0;

   @ObfInfo(
      owner = "fr",
      name = "<init>",
      desc = "(Lfk;Ljava/lang/String;Ljava/lang/String;)V"
   )
   class317(class277 var1, String var2, String var3) {
      super(var1, var2);
      this.this$0 = var1;
      this.field2493 = var3;
   }

   @ObfInfo(
      owner = "fr",
      name = "h",
      desc = "(B)I"
   )
   public int method1023() {
      return 1;
   }

   @ObfInfo(
      owner = "fr",
      name = "e",
      desc = "(I)Ljava/lang/String;"
   )
   public String method1024() {
      return this.field2493;
   }
}
