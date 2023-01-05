@ObfInfo(
   name = "rz"
)
public class class331 {
   @ObfInfo(
      owner = "rz",
      name = "e",
      desc = "Ljava/lang/Object;"
   )
   public Object field2602;
   @ObfInfo(
      owner = "rz",
      name = "h",
      desc = "I"
   )
   public final int field2601;

   @ObfInfo(
      owner = "rz",
      name = "<init>",
      desc = "(I)V"
   )
   public class331(int var1) {
      this.field2601 = var1;
   }

   @ObfInfo(
      owner = "rz",
      name = "<init>",
      desc = "(ILjava/lang/Object;)V"
   )
   public class331(int var1, Object var2) {
      this.field2601 = var1;
      this.field2602 = var2;
   }

   @ObfInfo(
      owner = "rz",
      name = "hashCode",
      desc = "()I"
   )
   public int hashCode() {
      return super.hashCode();
   }

   @ObfInfo(
      owner = "rz",
      name = "equals",
      desc = "(Ljava/lang/Object;)Z"
   )
   public boolean equals(Object var1) {
      if (!(var1 instanceof class331)) {
         return false;
      } else {
         class331 var2 = (class331)var1;
         if (var2.field2602 == null && null != this.field2602) {
            return false;
         } else if (null == this.field2602 && null != var2.field2602) {
            return false;
         } else {
            return var2.field2601 == this.field2601 && var2.field2602.equals(this.field2602);
         }
      }
   }
}
