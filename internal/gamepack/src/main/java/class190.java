@ObfInfo(
   name = "md"
)
public final class class190 {
   @ObfInfo(
      owner = "md",
      name = "h",
      desc = "Lpw;"
   )
   class195 field1710 = new class195();

   @ObfInfo(
      owner = "md",
      name = "<init>",
      desc = "()V"
   )
   public class190() {
      this.field1710.field1737 = this.field1710;
      this.field1710.field1735 = this.field1710;
   }

   @ObfInfo(
      owner = "md",
      name = "h",
      desc = "(Lpw;)V"
   )
   public void method858(class195 var1) {
      if (var1.field1735 != null) {
         var1.method870();
      }

      var1.field1735 = this.field1710.field1735;
      var1.field1737 = this.field1710;
      var1.field1735.field1737 = var1;
      var1.field1737.field1735 = var1;
   }

   @ObfInfo(
      owner = "md",
      name = "e",
      desc = "(Lpw;)V"
   )
   public void method859(class195 var1) {
      if (var1.field1735 != null) {
         var1.method870();
      }

      var1.field1735 = this.field1710;
      var1.field1737 = this.field1710.field1737;
      var1.field1735.field1737 = var1;
      var1.field1737.field1735 = var1;
   }

   @ObfInfo(
      owner = "md",
      name = "v",
      desc = "()Lpw;"
   )
   public class195 method860() {
      class195 var1 = this.field1710.field1737;
      return var1 == this.field1710 ? null : var1;
   }
}
