@ObfInfo(
   name = "qp"
)
public final class class170 {
   @ObfInfo(
      owner = "qp",
      name = "v",
      desc = "Lpl;"
   )
   class139 field1272;
   @ObfInfo(
      owner = "qp",
      name = "x",
      desc = "Lpl;"
   )
   class139 field1274;
   @ObfInfo(
      owner = "qp",
      name = "e",
      desc = "[Lpl;"
   )
   class139[] field1271;
   @ObfInfo(
      owner = "qp",
      name = "m",
      desc = "I"
   )
   int field1270 = 0;
   @ObfInfo(
      owner = "qp",
      name = "h",
      desc = "I"
   )
   int field1273;

   @ObfInfo(
      owner = "qp",
      name = "<init>",
      desc = "(I)V"
   )
   public class170(int var1) {
      this.field1273 = var1;
      this.field1271 = new class139[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class139 var3 = this.field1271[var2] = new class139();
         var3.field1132 = var3;
         var3.field1133 = var3;
      }

   }

   @ObfInfo(
      owner = "qp",
      name = "h",
      desc = "(J)Lpl;"
   )
   public class139 method791(long var1) {
      class139 var3 = this.field1271[(int)(var1 & (long)(this.field1273 - 1))];

      for(this.field1272 = var3.field1132; this.field1272 != var3; this.field1272 = this.field1272.field1132) {
         if (this.field1272.field1134 == var1) {
            class139 var4 = this.field1272;
            this.field1272 = this.field1272.field1132;
            return var4;
         }
      }

      this.field1272 = null;
      return null;
   }

   @ObfInfo(
      owner = "qp",
      name = "e",
      desc = "(Lpl;J)V"
   )
   public void method788(class139 var1, long var2) {
      if (var1.field1133 != null) {
         var1.method637();
      }

      class139 var4 = this.field1271[(int)(var2 & (long)(this.field1273 - 1))];
      var1.field1133 = var4.field1133;
      var1.field1132 = var4;
      var1.field1133.field1132 = var1;
      var1.field1132.field1133 = var1;
      var1.field1134 = var2;
   }

   @ObfInfo(
      owner = "qp",
      name = "v",
      desc = "()Lpl;"
   )
   public class139 method789() {
      this.field1270 = 0;
      return this.method790();
   }

   @ObfInfo(
      owner = "qp",
      name = "x",
      desc = "()Lpl;"
   )
   public class139 method790() {
      class139 var1;
      if (this.field1270 > 0 && this.field1274 != this.field1271[this.field1270 - 1]) {
         var1 = this.field1274;
         this.field1274 = var1.field1132;
         return var1;
      } else {
         do {
            if (this.field1270 >= this.field1273) {
               return null;
            }

            var1 = this.field1271[this.field1270++].field1132;
         } while(var1 == this.field1271[this.field1270 - 1]);

         this.field1274 = var1.field1132;
         return var1;
      }
   }
}
