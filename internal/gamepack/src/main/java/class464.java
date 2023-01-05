public class class464 {
   static class344[] field3854;
   public int field3851;
   public int field3852;
   public int field3853;

   public class464(int var1, int var2, int var3) {
      this.field3851 = var1;
      this.field3852 = var2;
      this.field3853 = var3;
   }

   public class464(class464 var1) {
      this.field3851 = var1.field3851;
      this.field3852 = var1.field3852;
      this.field3853 = var1.field3853;
   }

   public class464(int var1) {
      if (var1 == -1) {
         this.field3851 = -1;
      } else {
         this.field3851 = var1 >> 28 & 3;
         this.field3852 = var1 >> 14 & 16383;
         this.field3853 = var1 & 16383;
      }

   }

   public int method2278() {
      return class261.method1114(this.field3851, this.field3852, this.field3853);
   }

   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof class464) ? false : this.method2277((class464)var1);
      }
   }

   boolean method2277(class464 var1) {
      if (this.field3851 != var1.field3851) {
         return false;
      } else if (this.field3852 != var1.field3852) {
         return false;
      } else {
         return this.field3853 == var1.field3853;
      }
   }

   public int hashCode() {
      return this.method2278();
   }

   public String toString() {
      return this.method2279(",");
   }

   String method2279(String var1) {
      return this.field3851 + var1 + (this.field3852 >> 6) + var1 + (this.field3853 >> 6) + var1 + (this.field3852 & 63) + var1 + (this.field3853 & 63);
   }
}
