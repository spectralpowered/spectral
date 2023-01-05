import java.util.Iterator;

public class class103 implements Iterator {
   class139 field803 = null;
   class139 field804;
   class395 field805;

   class103(class395 var1) {
      this.method414(var1);
   }

   void method414(class395 var1) {
      this.field805 = var1;
      this.method415();
   }

   void method415() {
      this.field804 = this.field805 != null ? this.field805.field3309.field1132 : null;
      this.field803 = null;
   }

   public Object next() {
      class139 var1 = this.field804;
      if (var1 == this.field805.field3309) {
         var1 = null;
         this.field804 = null;
      } else {
         this.field804 = var1.field1132;
      }

      this.field803 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field804 != this.field805.field3309 && this.field804 != null;
   }

   public void remove() {
      if (this.field803 == null) {
         throw new IllegalStateException();
      } else {
         this.field803.method637();
         this.field803 = null;
      }
   }
}
