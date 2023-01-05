public class class187 extends class368 {
   static class38 field1697;
   int field1698;

   int method845(class187 var1) {
      return this.field1698 - var1.field1698;
   }

   public int method1816(class368 var1) {
      return this.method845((class187)var1);
   }

   public int compareTo(Object var1) {
      return this.method845((class187)var1);
   }

   public static void method846(class274 var0) {
      class106.field819 = var0;
   }

   public static int method847(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
   }
}
