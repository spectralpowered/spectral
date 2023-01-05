import java.util.Iterator;

class class471 implements Iterator {
   int field3911;
   // $FF: synthetic field
   final class407 this$0;

   class471(class407 var1) {
      this.this$0 = var1;
   }

   public boolean hasNext() {
      return this.field3911 < this.this$0.method88();
   }

   public Object next() {
      int var1 = ++this.field3911 - 1;
      class436 var2 = (class436)this.this$0.field3543.method1309((long)var1);
      return var2 != null ? var2 : this.this$0.method1991(var1);
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }
}
