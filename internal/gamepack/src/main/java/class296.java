public class class296 {
   public final Object field2391;
   public final Object field2392;

   public class296(Object var1, Object var2) {
      this.field2392 = var1;
      this.field2391 = var2;
   }

   public String toString() {
      return this.field2392 + ", " + this.field2391;
   }

   public boolean equals(Object var1) {
      if (null != var1 && var1 instanceof class296) {
         class296 var2 = (class296)var1;
         if (null == this.field2392) {
            if (null != var2.field2392) {
               return false;
            }
         } else if (!this.field2392.equals(var2.field2392)) {
            return false;
         }

         if (null == this.field2391) {
            if (null != var2.field2391) {
               return false;
            }
         } else if (!this.field2391.equals(var2.field2391)) {
            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public int hashCode() {
      int var1 = 0;
      if (this.field2392 != null) {
         var1 += this.field2392.hashCode();
      }

      if (this.field2391 != null) {
         var1 += 31 * this.field2391.hashCode();
      }

      return var1;
   }
}
