import java.util.Iterator;

public final class class376 implements Iterable {
   class106 field3305;
   class106 field3306;
   class106[] field3304;
   int field3303 = 0;
   int field3307;

   public class376(int var1) {
      this.field3307 = var1;
      this.field3304 = new class106[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         class106 var3 = this.field3304[var2] = new class106();
         var3.field1359 = var3;
         var3.field1360 = var3;
      }

   }

   public class106 method1794(long var1) {
      class106 var3 = this.field3304[(int)(var1 & (long)(this.field3307 - 1))];

      for(this.field3305 = var3.field1359; this.field3305 != var3; this.field3305 = this.field3305.field1359) {
         if (this.field3305.field1361 == var1) {
            class106 var4 = this.field3305;
            this.field3305 = this.field3305.field1359;
            return var4;
         }
      }

      this.field3305 = null;
      return null;
   }

   public void method1793(class106 var1, long var2) {
      if (var1.field1360 != null) {
         var1.method567();
      }

      class106 var4 = this.field3304[(int)(var2 & (long)(this.field3307 - 1))];
      var1.field1360 = var4.field1360;
      var1.field1359 = var4;
      var1.field1360.field1359 = var1;
      var1.field1359.field1360 = var1;
      var1.field1361 = var2;
   }

   public void method1791() {
      for(int var1 = 0; var1 < this.field3307; ++var1) {
         class106 var2 = this.field3304[var1];

         while(true) {
            class106 var3 = var2.field1359;
            if (var3 == var2) {
               break;
            }

            var3.method567();
         }
      }

      this.field3305 = null;
      this.field3306 = null;
   }

   public class106 method1792() {
      this.field3303 = 0;
      return this.method1795();
   }

   public class106 method1795() {
      class106 var1;
      if (this.field3303 > 0 && this.field3306 != this.field3304[this.field3303 - 1]) {
         var1 = this.field3306;
         this.field3306 = var1.field1359;
         return var1;
      } else {
         do {
            if (this.field3303 >= this.field3307) {
               return null;
            }

            var1 = this.field3304[this.field3303++].field1359;
         } while(var1 == this.field3304[this.field3303 - 1]);

         this.field3306 = var1.field1359;
         return var1;
      }
   }

   public Iterator iterator() {
      return new class101(this);
   }
}
