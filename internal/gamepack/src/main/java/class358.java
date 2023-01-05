import java.util.Iterator;

@ObfInfo(
   name = "pi"
)
public class class358 implements Iterator {
   @ObfInfo(
      owner = "pi",
      name = "e",
      desc = "Lpl;"
   )
   class139 field3047;
   @ObfInfo(
      owner = "pi",
      name = "x",
      desc = "Lpl;"
   )
   class139 field3049 = null;
   @ObfInfo(
      owner = "pi",
      name = "h",
      desc = "Lql;"
   )
   class385 field3046;
   @ObfInfo(
      owner = "pi",
      name = "v",
      desc = "I"
   )
   int field3048;

   @ObfInfo(
      owner = "pi",
      name = "<init>",
      desc = "(Lql;)V"
   )
   class358(class385 var1) {
      this.field3046 = var1;
      this.method1788();
   }

   @ObfInfo(
      owner = "pi",
      name = "h",
      desc = "()V"
   )
   void method1788() {
      this.field3047 = this.field3046.field3241[0].field1132;
      this.field3048 = 1;
      this.field3049 = null;
   }

   @ObfInfo(
      owner = "pi",
      name = "next",
      desc = "()Ljava/lang/Object;"
   )
   public Object next() {
      class139 var1;
      if (this.field3047 != this.field3046.field3241[this.field3048 - 1]) {
         var1 = this.field3047;
         this.field3047 = var1.field1132;
         this.field3049 = var1;
         return var1;
      } else {
         do {
            if (this.field3048 >= this.field3046.field3244) {
               return null;
            }

            var1 = this.field3046.field3241[this.field3048++].field1132;
         } while(var1 == this.field3046.field3241[this.field3048 - 1]);

         this.field3047 = var1.field1132;
         this.field3049 = var1;
         return var1;
      }
   }

   @ObfInfo(
      owner = "pi",
      name = "hasNext",
      desc = "()Z"
   )
   public boolean hasNext() {
      if (this.field3047 != this.field3046.field3241[this.field3048 - 1]) {
         return true;
      } else {
         while(this.field3048 < this.field3046.field3244) {
            if (this.field3046.field3241[this.field3048++].field1132 != this.field3046.field3241[this.field3048 - 1]) {
               this.field3047 = this.field3046.field3241[this.field3048 - 1].field1132;
               return true;
            }

            this.field3047 = this.field3046.field3241[this.field3048 - 1];
         }

         return false;
      }
   }

   @ObfInfo(
      owner = "pi",
      name = "remove",
      desc = "()V"
   )
   public void remove() {
      if (this.field3049 == null) {
         throw new IllegalStateException();
      } else {
         this.field3049.method637();
         this.field3049 = null;
      }
   }
}
