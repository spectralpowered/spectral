import java.util.Iterator;

@ObfInfo(
   name = "mo"
)
public class class64 implements Iterator {
   @ObfInfo(
      owner = "mo",
      name = "e",
      desc = "Lpw;"
   )
   class195 field622;
   @ObfInfo(
      owner = "mo",
      name = "v",
      desc = "Lpw;"
   )
   class195 field623 = null;
   @ObfInfo(
      owner = "mo",
      name = "h",
      desc = "Lmm;"
   )
   class477 field621;

   @ObfInfo(
      owner = "mo",
      name = "<init>",
      desc = "(Lmm;)V"
   )
   class64(class477 var1) {
      this.field621 = var1;
      this.field622 = this.field621.field4010.field1737;
      this.field623 = null;
   }

   @ObfInfo(
      owner = "mo",
      name = "next",
      desc = "()Ljava/lang/Object;"
   )
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

   @ObfInfo(
      owner = "mo",
      name = "hasNext",
      desc = "()Z"
   )
   public boolean hasNext() {
      return this.field622 != this.field621.field4010;
   }

   @ObfInfo(
      owner = "mo",
      name = "remove",
      desc = "()V"
   )
   public void remove() {
      if (this.field623 == null) {
         throw new IllegalStateException();
      } else {
         this.field623.method870();
         this.field623 = null;
      }
   }
}
