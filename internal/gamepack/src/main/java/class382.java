public final class class382 implements Comparable {
   Object field3225;
   Object field3226;
   long field3224;
   long field3227;

   class382(Object var1, Object var2) {
      this.field3226 = var1;
      this.field3225 = var2;
   }

   int method1893(class382 var1) {
      if (this.field3227 < var1.field3227) {
         return -1;
      } else {
         return this.field3227 > var1.field3227 ? 1 : 0;
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class382) {
         return this.field3225.equals(((class382)var1).field3225);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int hashCode() {
      return this.field3225.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method1893((class382)var1);
   }
}
