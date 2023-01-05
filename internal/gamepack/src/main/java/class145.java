import java.util.Iterator;

public class class145 implements Iterator {
   class106 field1556 = null;
   class106 field1557;
   class55 field1558;

   class145(class55 var1) {
      this.method779(var1);
   }

   void method779(class55 var1) {
      this.field1558 = var1;
      this.method780();
   }

   void method780() {
      this.field1557 = this.field1558 != null ? this.field1558.field802.field1359 : null;
      this.field1556 = null;
   }

   public Object next() {
      class106 var1 = this.field1557;
      if (var1 == this.field1558.field802) {
         var1 = null;
         this.field1557 = null;
      } else {
         this.field1557 = var1.field1359;
      }

      this.field1556 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field1557 != this.field1558.field802 && this.field1557 != null;
   }

   public void remove() {
      if (this.field1556 == null) {
         throw new IllegalStateException();
      } else {
         this.field1556.method567();
         this.field1556 = null;
      }
   }
}
