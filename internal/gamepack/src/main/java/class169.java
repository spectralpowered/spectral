@ObfInfo(
   name = "fq"
)
public class class169 extends class195 {
   @ObfInfo(
      owner = "fq",
      name = "h",
      desc = "Lly;"
   )
   static class274 field1268;
   @ObfInfo(
      owner = "fq",
      name = "e",
      desc = "Ljv;"
   )
   static class99 field1267 = new class99(64);
   @ObfInfo(
      owner = "fq",
      name = "if",
      desc = "I"
   )
   static int field1269;
   @ObfInfo(
      owner = "fq",
      name = "v",
      desc = "I"
   )
   public int field1266 = 0;

   @ObfInfo(
      owner = "fq",
      name = "v",
      desc = "(Lqy;I)V"
   )
   void method786(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method787(var1, var3);
      }
   }

   @ObfInfo(
      owner = "fq",
      name = "x",
      desc = "(Lqy;IB)V"
   )
   void method787(class127 var1, int var2) {
      if (var2 == 2) {
         this.field1266 = var1.method549();
      }

   }
}
