public final class class433 implements Comparable {
   Object field3610;
   Object field3611;
   long field3609;
   long field3612;

   class433(Object var1, Object var2) {
      this.field3611 = var1;
      this.field3610 = var2;
   }

   int method2083(class433 var1) {
      if (this.field3612 < var1.field3612) {
         return -1;
      } else {
         return this.field3612 > var1.field3612 ? 1 : 0;
      }
   }

   public boolean equals(Object var1) {
      if (var1 instanceof class433) {
         return this.field3610.equals(((class433)var1).field3610);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int hashCode() {
      return this.field3610.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method2083((class433)var1);
   }
}
