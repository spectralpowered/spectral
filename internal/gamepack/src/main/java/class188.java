@ObfInfo(
   name = "ef"
)
public class class188 extends class480 {
   @ObfInfo(
      owner = "ef",
      name = "ae",
      desc = "Lok;"
   )
   static class376 field1701;
   @ObfInfo(
      owner = "ef",
      name = "ht",
      desc = "Lnv;"
   )
   static class58 field1702;
   @ObfInfo(
      owner = "ef",
      name = "v",
      desc = "I"
   )
   int field1700;
   @ObfInfo(
      owner = "ef",
      name = "e",
      desc = "Ljava/lang/String;"
   )
   String field1699;
   @ObfInfo(
      owner = "ef",
      name = "h",
      desc = "J"
   )
   long field1703;
   // $FF: synthetic field
   @ObfInfo(
      owner = "ef",
      name = "this$0",
      desc = "Lem;"
   )
   final class182 this$0;

   @ObfInfo(
      owner = "ef",
      name = "<init>",
      desc = "(Lem;)V"
   )
   class188(class182 var1) {
      this.this$0 = var1;
      this.field1703 = -1L;
      this.field1699 = null;
      this.field1700 = 0;
   }

   @ObfInfo(
      owner = "ef",
      name = "h",
      desc = "(Lqy;I)V"
   )
   void method2367(class127 var1) {
      if (var1.method547() != 255) {
         --var1.field1070;
         this.field1703 = var1.method598();
      }

      this.field1699 = var1.method554();
      this.field1700 = var1.method549();
   }

   @ObfInfo(
      owner = "ef",
      name = "e",
      desc = "(Lep;I)V"
   )
   void method2368(class429 var1) {
      var1.method2118(this.field1703, this.field1699, this.field1700);
   }

   @ObfInfo(
      owner = "ef",
      name = "h",
      desc = "(Lly;B)V"
   )
   public static void method851(class274 var0) {
   }
}
