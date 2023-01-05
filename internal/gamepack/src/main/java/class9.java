public final class class9 {
   class108 field49 = new class108();

   public class9() {
      this.field49.field1371 = this.field49;
      this.field49.field1369 = this.field49;
   }

   public void method28(class108 var1) {
      if (var1.field1369 != null) {
         var1.method574();
      }

      var1.field1369 = this.field49.field1369;
      var1.field1371 = this.field49;
      var1.field1369.field1371 = var1;
      var1.field1371.field1369 = var1;
   }

   public void method29(class108 var1) {
      if (var1.field1369 != null) {
         var1.method574();
      }

      var1.field1369 = this.field49;
      var1.field1371 = this.field49.field1371;
      var1.field1369.field1371 = var1;
      var1.field1371.field1369 = var1;
   }

   public class108 method30() {
      class108 var1 = this.field49.field1371;
      return var1 == this.field49 ? null : var1;
   }
}
