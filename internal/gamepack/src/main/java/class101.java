import java.util.Iterator;

public class class101 implements Iterator {
   class106 field1345;
   class106 field1347 = null;
   class376 field1344;
   int field1346;

   class101(class376 var1) {
      this.field1344 = var1;
      this.method554();
   }

   void method554() {
      this.field1345 = this.field1344.field3304[0].field1359;
      this.field1346 = 1;
      this.field1347 = null;
   }

   public Object next() {
      class106 var1;
      if (this.field1345 != this.field1344.field3304[this.field1346 - 1]) {
         var1 = this.field1345;
         this.field1345 = var1.field1359;
         this.field1347 = var1;
         return var1;
      } else {
         do {
            if (this.field1346 >= this.field1344.field3307) {
               return null;
            }

            var1 = this.field1344.field3304[this.field1346++].field1359;
         } while(var1 == this.field1344.field3304[this.field1346 - 1]);

         this.field1345 = var1.field1359;
         this.field1347 = var1;
         return var1;
      }
   }

   public boolean hasNext() {
      if (this.field1345 != this.field1344.field3304[this.field1346 - 1]) {
         return true;
      } else {
         while(this.field1346 < this.field1344.field3307) {
            if (this.field1344.field3304[this.field1346++].field1359 != this.field1344.field3304[this.field1346 - 1]) {
               this.field1345 = this.field1344.field3304[this.field1346 - 1].field1359;
               return true;
            }

            this.field1345 = this.field1344.field3304[this.field1346 - 1];
         }

         return false;
      }
   }

   public void remove() {
      if (this.field1347 == null) {
         throw new IllegalStateException();
      } else {
         this.field1347.method567();
         this.field1347 = null;
      }
   }
}
