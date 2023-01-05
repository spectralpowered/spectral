public final class class31 {
   class108 field311 = new class108();
   class148 field313 = new class148();
   class376 field312;
   int field309;
   int field310;

   public class31(int var1) {
      this.field310 = var1;
      this.field309 = var1;

      int var2;
      for(var2 = 1; var2 + var2 < var1; var2 += var2) {
         ;
      }

      this.field312 = new class376(var2);
   }

   public class108 method161(long var1) {
      class108 var3 = (class108)this.field312.method1794(var1);
      if (var3 != null) {
         this.field313.method786(var3);
      }

      return var3;
   }

   public void method160(long var1) {
      class108 var3 = (class108)this.field312.method1794(var1);
      if (var3 != null) {
         var3.method567();
         var3.method574();
         ++this.field309;
      }

   }

   public void method163(class108 var1, long var2) {
      if (this.field309 == 0) {
         class108 var4 = this.field313.method787();
         var4.method567();
         var4.method574();
         if (var4 == this.field311) {
            var4 = this.field313.method787();
            var4.method567();
            var4.method574();
         }
      } else {
         --this.field309;
      }

      this.field312.method1793(var1, var2);
      this.field313.method786(var1);
   }

   public void method162() {
      this.field313.method785();
      this.field312.method1791();
      this.field311 = new class108();
      this.field309 = this.field310;
   }
}
