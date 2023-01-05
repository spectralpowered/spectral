public final class class190 {
   class195 field1710 = new class195();

   public class190() {
      this.field1710.field1737 = this.field1710;
      this.field1710.field1735 = this.field1710;
   }

   public void method858(class195 var1) {
      if (var1.field1735 != null) {
         var1.method870();
      }

      var1.field1735 = this.field1710.field1735;
      var1.field1737 = this.field1710;
      var1.field1735.field1737 = var1;
      var1.field1737.field1735 = var1;
   }

   public void method859(class195 var1) {
      if (var1.field1735 != null) {
         var1.method870();
      }

      var1.field1735 = this.field1710;
      var1.field1737 = this.field1710.field1737;
      var1.field1735.field1737 = var1;
      var1.field1737.field1735 = var1;
   }

   public class195 method860() {
      class195 var1 = this.field1710.field1737;
      return var1 == this.field1710 ? null : var1;
   }
}
