public class class308 {
   static class161[] field2906;
   public int field2903;
   public int field2904;
   public int field2905;

   public class308(int var1, int var2, int var3) {
      this.field2903 = var1;
      this.field2904 = var2;
      this.field2905 = var3;
   }

   public class308(class308 var1) {
      this.field2903 = var1.field2903;
      this.field2904 = var1.field2904;
      this.field2905 = var1.field2905;
   }

   public class308(int var1) {
      if (var1 == -1) {
         this.field2903 = -1;
      } else {
         this.field2903 = var1 >> 28 & 3;
         this.field2904 = var1 >> 14 & 16383;
         this.field2905 = var1 & 16383;
      }

   }

   public int method1446() {
      return class72.method403(this.field2903, this.field2904, this.field2905);
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof class308) ? false : this.method1445((class308)var1);
      }
   }

   boolean method1445(class308 var1) {
      if (this.field2903 != var1.field2903) {
         return false;
      } else if (this.field2904 != var1.field2904) {
         return false;
      } else {
         return this.field2905 == var1.field2905;
      }
   }

   public int hashCode() {
      return this.method1446();
   }

   public String toString() {
      return this.method1447(",");
   }

   String method1447(String var1) {
      return this.field2903 + var1 + (this.field2904 >> 6) + var1 + (this.field2905 >> 6) + var1 + (this.field2904 & 63) + var1 + (this.field2905 & 63);
   }
}
