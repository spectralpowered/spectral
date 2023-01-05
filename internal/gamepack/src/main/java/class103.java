import java.util.Iterator;

@ObfInfo(
   name = "mu"
)
public class class103 implements Iterator {
   @ObfInfo(
      owner = "mu",
      name = "v",
      desc = "Lpl;"
   )
   class139 field803 = null;
   @ObfInfo(
      owner = "mu",
      name = "e",
      desc = "Lpl;"
   )
   class139 field804;
   @ObfInfo(
      owner = "mu",
      name = "h",
      desc = "Lmv;"
   )
   class395 field805;

   @ObfInfo(
      owner = "mu",
      name = "<init>",
      desc = "(Lmv;)V"
   )
   class103(class395 var1) {
      this.method414(var1);
   }

   @ObfInfo(
      owner = "mu",
      name = "h",
      desc = "(Lmv;)V"
   )
   void method414(class395 var1) {
      this.field805 = var1;
      this.method415();
   }

   @ObfInfo(
      owner = "mu",
      name = "e",
      desc = "()V"
   )
   void method415() {
      this.field804 = this.field805 != null ? this.field805.field3309.field1132 : null;
      this.field803 = null;
   }

   @ObfInfo(
      owner = "mu",
      name = "next",
      desc = "()Ljava/lang/Object;"
   )
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

   @ObfInfo(
      owner = "mu",
      name = "hasNext",
      desc = "()Z"
   )
   public boolean hasNext() {
      return this.field804 != this.field805.field3309 && this.field804 != null;
   }

   @ObfInfo(
      owner = "mu",
      name = "remove",
      desc = "()V"
   )
   public void remove() {
      if (this.field803 == null) {
         throw new IllegalStateException();
      } else {
         this.field803.method637();
         this.field803 = null;
      }
   }
}
