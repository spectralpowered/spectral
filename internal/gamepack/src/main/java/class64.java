import java.util.Iterator;

public class class64 implements Iterator {
   class195 field622;
   class195 field623 = null;
   class477 field621;

   class64(class477 var1) {
      this.field621 = var1;
      this.field622 = this.field621.field4010.field1737;
      this.field623 = null;
   }

   public Object next() {
      class195 var1 = this.field622;
      if (var1 == this.field621.field4010) {
         var1 = null;
         this.field622 = null;
      } else {
         this.field622 = var1.field1737;
      }

      this.field623 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.field622 != this.field621.field4010;
   }

   public void remove() {
      if (this.field623 == null) {
         throw new IllegalStateException();
      } else {
         this.field623.method870();
         this.field623 = null;
      }
   }
}
