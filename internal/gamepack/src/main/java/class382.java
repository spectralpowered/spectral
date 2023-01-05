public class class382 extends class305 {
   final boolean field3328;

   public class382(boolean var1) {
      this.field3328 = var1;
   }

   int method1813(class185 var1, class185 var2) {
      if (client.field599 == var1.field1978 && var2.field1978 == client.field599) {
         return this.field3328 ? var1.method1063().method931(var2.method1063()) : var2.method1063().method931(var1.method1063());
      } else {
         return this.method1440(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1813((class185)var1, (class185)var2);
   }

   static class296 method1814() {
      return class296.field2831 < class296.field2833 ? class296.field2834[++class296.field2831 - 1] : null;
   }
}
