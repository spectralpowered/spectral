public class class423 extends class209 {
   static class230 field3575;
   int field3576;

   int method2027(class423 var1) {
      return this.field3576 - var1.field3576;
   }

   public int method1062(class209 var1) {
      return this.method2027((class423)var1);
   }

   public int compareTo(Object var1) {
      return this.method2027((class423)var1);
   }

   public static void method2028(class164 var0) {
      class301.field2889 = var0;
   }

   public static int method2029(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
   }
}
