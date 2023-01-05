public final class class95 {
   class106 field1015;
   class106 field1017;
   class106[] field1014;
   int field1013 = 0;
   int field1016;

   public class95(int var1) {
      this.field1016 = var1;
      this.field1014 = new class106[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class106 var3 = this.field1014[var2] = new class106();
         var3.field1359 = var3;
         var3.field1360 = var3;
      }

   }

   public class106 method545(long var1) {
      class106 var3 = this.field1014[(int)(var1 & (long)(this.field1016 - 1))];

      for(this.field1015 = var3.field1359; this.field1015 != var3; this.field1015 = this.field1015.field1359) {
         if (this.field1015.field1361 == var1) {
            class106 var4 = this.field1015;
            this.field1015 = this.field1015.field1359;
            return var4;
         }
      }

      this.field1015 = null;
      return null;
   }

   public void method542(class106 var1, long var2) {
      if (var1.field1360 != null) {
         var1.method567();
      }

      class106 var4 = this.field1014[(int)(var2 & (long)(this.field1016 - 1))];
      var1.field1360 = var4.field1360;
      var1.field1359 = var4;
      var1.field1360.field1359 = var1;
      var1.field1359.field1360 = var1;
      var1.field1361 = var2;
   }

   public class106 method543() {
      this.field1013 = 0;
      return this.method544();
   }

   public class106 method544() {
      class106 var1;
      if (this.field1013 > 0 && this.field1017 != this.field1014[this.field1013 - 1]) {
         var1 = this.field1017;
         this.field1017 = var1.field1359;
         return var1;
      } else {
         do {
            if (this.field1013 >= this.field1016) {
               return null;
            }

            var1 = this.field1014[this.field1013++].field1359;
         } while(var1 == this.field1014[this.field1013 - 1]);

         this.field1017 = var1.field1359;
         return var1;
      }
   }
}
