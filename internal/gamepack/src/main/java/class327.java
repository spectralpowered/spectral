public final class class327 extends class236 {
   static class157 field3054;
   int field3051;
   int field3052 = 31;
   int field3053;

   void method1580(int var1) {
      this.field3052 = var1;
   }

   boolean method1581(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field3052 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   protected final class491 method1194() {
      return class272.method1294(this.field3053).method2170(this.field3051);
   }

   static void method1582(class134 var0, int var1) {
      class97.method546(var0.field1489, var1);
      class360.method1713(var0, var1);
   }
}
