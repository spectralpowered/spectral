@ObfInfo(
   name = "fv"
)
public abstract class class235 {
   @ObfInfo(
      owner = "fv",
      name = "bv",
      desc = "Lmb;"
   )
   static class476 field1995;
   @ObfInfo(
      owner = "fv",
      name = "r",
      desc = "I"
   )
   static int field1993;
   @ObfInfo(
      owner = "fv",
      name = "x",
      desc = "Ljava/lang/String;"
   )
   String field1994;
   // $FF: synthetic field
   @ObfInfo(
      owner = "fv",
      name = "this$0",
      desc = "Lfk;"
   )
   final class277 this$0;

   @ObfInfo(
      owner = "fv",
      name = "<init>",
      desc = "(Lfk;Ljava/lang/String;)V"
   )
   class235(class277 var1, String var2) {
      this.this$0 = var1;
      this.field1994 = var2;
   }

   @ObfInfo(
      owner = "fv",
      name = "h",
      desc = "(B)I"
   )
   public abstract int method1023();

   @ObfInfo(
      owner = "fv",
      name = "r",
      desc = "(I)Ljava/lang/String;"
   )
   public String method1022() {
      return this.field1994;
   }

   @ObfInfo(
      owner = "fv",
      name = "e",
      desc = "(I)Ljava/lang/String;"
   )
   public String method1024() {
      return null;
   }

   @ObfInfo(
      owner = "fv",
      name = "q",
      desc = "(I)I"
   )
   public int method1025() {
      return -1;
   }
}
