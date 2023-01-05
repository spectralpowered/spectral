@ObfInfo(
   name = "nz"
)
public final class class382 implements Comparable {
   @ObfInfo(
      owner = "nz",
      name = "e",
      desc = "Ljava/lang/Object;"
   )
   Object field3225;
   @ObfInfo(
      owner = "nz",
      name = "h",
      desc = "Ljava/lang/Object;"
   )
   Object field3226;
   @ObfInfo(
      owner = "nz",
      name = "v",
      desc = "J"
   )
   long field3224;
   @ObfInfo(
      owner = "nz",
      name = "x",
      desc = "J"
   )
   long field3227;

   @ObfInfo(
      owner = "nz",
      name = "<init>",
      desc = "(Ljava/lang/Object;Ljava/lang/Object;)V"
   )
   class382(Object var1, Object var2) {
      this.field3226 = var1;
      this.field3225 = var2;
   }

   @ObfInfo(
      owner = "nz",
      name = "h",
      desc = "(Lnz;I)I"
   )
   int method1893(class382 var1) {
      if (this.field3227 < var1.field3227) {
         return -1;
      } else {
         return this.field3227 > var1.field3227 ? 1 : 0;
      }
   }

   @ObfInfo(
      owner = "nz",
      name = "equals",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean equals(Object var1) {
      if (var1 instanceof class382) {
         return this.field3225.equals(((class382)var1).field3225);
      } else {
         throw new IllegalArgumentException();
      }
   }

   @ObfInfo(
      owner = "nz",
      name = "hashCode",
      desc = "()I"
   )
   public int hashCode() {
      return this.field3225.hashCode();
   }

   @ObfInfo(
      owner = "nz",
      name = "compareTo",
      desc = "(Ljava/lang/Object;)I"
   )
   public int compareTo(Object var1) {
      return this.method1893((class382)var1);
   }
}
