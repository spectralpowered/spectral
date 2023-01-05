public final class class402 extends class295 {
   static class233 field3388;
   int field3385;
   int field3386 = 31;
   int field3387;

   void method1985(int var1) {
      this.field3386 = var1;
   }

   boolean method1986(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field3386 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   protected final class470 method1438() {
      return class423.method2062(this.field3387).method1201(this.field3385);
   }

   static void method1987(class127 var0, int var1) {
      class193.method867(var0.field1072, var1);
      class84.method340(var0, var1);
   }
}
