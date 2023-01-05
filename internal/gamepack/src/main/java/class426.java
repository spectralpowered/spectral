public class class426 {
   public Object field3582;
   public final int field3581;

   public class426(int var1) {
      this.field3581 = var1;
   }

   public class426(int var1, Object var2) {
      this.field3581 = var1;
      this.field3582 = var2;
   }

   public int hashCode() {
      return super.hashCode();
   }

   public boolean equals(Object var1) {
      if (!(var1 instanceof class426)) {
         return false;
      } else {
         class426 var2 = (class426)var1;
         if (var2.field3582 == null && null != this.field3582) {
            return false;
         } else if (null == this.field3582 && null != var2.field3582) {
            return false;
         } else {
            return var2.field3581 == this.field3581 && var2.field3582.equals(this.field3582);
         }
      }
   }
}
