public final class class99 {
   class195 field789 = new class195();
   class385 field790;
   class477 field791 = new class477();
   int field787;
   int field788;

   public class99(int var1) {
      this.field788 = var1;
      this.field787 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.field790 = new class385(var2);
   }

   public class195 method394(long var1) {
      class195 var3 = (class195)this.field790.method1897(var1);
      if (var3 != null) {
         this.field791.method2360(var3);
      }

      return var3;
   }

   public void method393(long var1) {
      class195 var3 = (class195)this.field790.method1897(var1);
      if (var3 != null) {
         var3.method637();
         var3.method870();
         ++this.field787;
      }

   }

   public void method396(class195 var1, long var2) {
      if (this.field787 == 0) {
         class195 var4 = this.field791.method2361();
         var4.method637();
         var4.method870();
         if (var4 == this.field789) {
            var4 = this.field791.method2361();
            var4.method637();
            var4.method870();
         }
      } else {
         --this.field787;
      }

      this.field790.method1896(var1, var2);
      this.field791.method2360(var1);
   }

   public void method395() {
      this.field791.method2359();
      this.field790.method1894();
      this.field789 = new class195();
      this.field787 = this.field788;
   }
}
