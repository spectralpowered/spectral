public class class368 implements Comparable {
   class257 field3127;
   class257 field3128;

   public class257 method1817() {
      return this.field3127;
   }

   public String method1814() {
      return null == this.field3127 ? "" : this.field3127.method1101();
   }

   public String method1818() {
      return this.field3128 == null ? "" : this.field3128.method1101();
   }

   void method1815(class257 var1, class257 var2) {
      if (null == var1) {
         throw new NullPointerException();
      } else {
         this.field3127 = var1;
         this.field3128 = var2;
      }
   }

   public int method1816(class368 var1) {
      return this.field3127.method1104(var1.field3127);
   }

   public int compareTo(Object var1) {
      return this.method1816((class368)var1);
   }
}
