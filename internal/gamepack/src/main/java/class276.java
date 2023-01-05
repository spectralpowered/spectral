public class class276 {
   class40 field2755 = new class40();
   class40 field2756;

   public class276() {
      this.field2755.field373 = this.field2755;
      this.field2755.field372 = this.field2755;
   }

   public void method1305(class40 var1) {
      if (var1.field372 != null) {
         var1.method219();
      }

      var1.field372 = this.field2755.field372;
      var1.field373 = this.field2755;
      var1.field372.field373 = var1;
      var1.field373.field372 = var1;
   }

   public class40 method1304() {
      class40 var1 = this.field2755.field373;
      if (var1 == this.field2755) {
         this.field2756 = null;
         return null;
      } else {
         this.field2756 = var1.field373;
         return var1;
      }
   }

   public class40 method1306() {
      class40 var1 = this.field2756;
      if (var1 == this.field2755) {
         this.field2756 = null;
         return null;
      } else {
         this.field2756 = var1.field373;
         return var1;
      }
   }
}
