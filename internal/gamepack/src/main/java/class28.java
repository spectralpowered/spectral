public class class28 {
   public final Object field224;
   public final Object field225;

   public class28(Object var1, Object var2) {
      this.field225 = var1;
      this.field224 = var2;
   }

   public String toString() {
      return this.field225 + ", " + this.field224;
   }

   public boolean equals(Object var1) {
      if (null != var1 && var1 instanceof class28) {
         class28 var2 = (class28)var1;
         if (null == this.field225) {
            if (null != var2.field225) {
               return false;
            }
         } else if (!this.field225.equals(var2.field225)) {
            return false;
         }

         if (null == this.field224) {
            if (null != var2.field224) {
               return false;
            }
         } else if (!this.field224.equals(var2.field224)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field225 != null) {
         var1 += this.field225.hashCode();
      }

      if (this.field224 != null) {
         var1 += 31 * this.field224.hashCode();
      }

      return var1;
   }
}
