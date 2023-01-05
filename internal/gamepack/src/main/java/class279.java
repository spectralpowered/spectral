import java.util.Iterator;

class class279 implements Iterator {
   int field2333;
   // $FF: synthetic field
   final class449 this$0;

   class279(class449 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.field2333 < this.this$0.method20();
   }

   public Object next() {
      int var1 = ++this.field2333 - 1;
      class481 var2 = (class481)this.this$0.field3740.method441((long)var1);
      return var2 != null ? var2 : this.this$0.method2236(var1);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
