import java.util.Iterator;

public class class355 implements Iterator {
   class108 field3190;
   class108 field3191 = null;
   class148 field3189;

   class355(class148 var1) {
      this.field3189 = var1;
      this.field3190 = this.field3189.field1564.field1371;
      this.field3191 = null;
   }

   public Object next() {
      class108 var1 = this.field3190;
      if (var1 == this.field3189.field1564) {
         var1 = null;
         this.field3190 = null;
      } else {
         this.field3190 = var1.field1371;
      }

      this.field3191 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field3190 != this.field3189.field1564;
   }

   public void remove() {
      if (this.field3191 == null) {
         throw new IllegalStateException();
      } else {
         this.field3191.method574();
         this.field3191 = null;
      }
   }
}
