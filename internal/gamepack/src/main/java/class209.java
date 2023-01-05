public class class209 implements Comparable {
   class174 field2200;
   class174 field2201;

   public class174 method1063() {
      return this.field2200;
   }

   public String method1060() {
      return null == this.field2200 ? "" : this.field2200.method928();
   }

   public String method1064() {
      return this.field2201 == null ? "" : this.field2201.method928();
   }

   void method1061(class174 var1, class174 var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.field2200 = var1;
         this.field2201 = var2;
      }
   }

   public int method1062(class209 var1) {
      return this.field2200.method931(var1.field2200);
   }

   public int compareTo(Object var1) {
      return this.method1062((class209)var1);
   }
}
