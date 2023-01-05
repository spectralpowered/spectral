@ObfInfo(
   name = "ma"
)
public class class12 {
   @ObfInfo(
      owner = "ma",
      name = "h",
      desc = "Lpr;"
   )
   class315 field64 = new class315();
   @ObfInfo(
      owner = "ma",
      name = "e",
      desc = "Lpr;"
   )
   class315 field65;

   @ObfInfo(
      owner = "ma",
      name = "<init>",
      desc = "()V"
   )
   public class12() {
      this.field64.field2477 = this.field64;
      this.field64.field2476 = this.field64;
   }

   @ObfInfo(
      owner = "ma",
      name = "h",
      desc = "(Lpr;)V"
   )
   public void method68(class315 var1) {
      if (var1.field2476 != null) {
         var1.method1514();
      }

      var1.field2476 = this.field64.field2476;
      var1.field2477 = this.field64;
      var1.field2476.field2477 = var1;
      var1.field2477.field2476 = var1;
   }

   @ObfInfo(
      owner = "ma",
      name = "e",
      desc = "()Lpr;"
   )
   public class315 method67() {
      class315 var1 = this.field64.field2477;
      if (var1 == this.field64) {
         this.field65 = null;
         return null;
      } else {
         this.field65 = var1.field2477;
         return var1;
      }
   }

   @ObfInfo(
      owner = "ma",
      name = "v",
      desc = "()Lpr;"
   )
   public class315 method69() {
      class315 var1 = this.field65;
      if (var1 == this.field64) {
         this.field65 = null;
         return null;
      } else {
         this.field65 = var1.field2477;
         return var1;
      }
   }
}
