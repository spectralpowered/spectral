@ObfInfo(
   name = "cr"
)
public final class class402 extends class295 {
   @ObfInfo(
      owner = "cr",
      name = "ss",
      desc = "Lax;"
   )
   static class233 field3388;
   @ObfInfo(
      owner = "cr",
      name = "e",
      desc = "I"
   )
   int field3385;
   @ObfInfo(
      owner = "cr",
      name = "x",
      desc = "I"
   )
   int field3386 = 31;
   @ObfInfo(
      owner = "cr",
      name = "h",
      desc = "I"
   )
   int field3387;

   @ObfInfo(
      owner = "cr",
      name = "h",
      desc = "(II)V"
   )
   void method1985(int var1) {
      this.field3386 = var1;
   }

   @ObfInfo(
      owner = "cr",
      name = "m",
      desc = "(IB)Z"
   )
   boolean method1986(int var1) {
      if (var1 >= 0 && var1 <= 4) {
         return (this.field3386 & 1 << var1) != 0;
      } else {
         return true;
      }
   }

   @ObfInfo(
      owner = "cr",
      name = "e",
      desc = "(I)Lhh;"
   )
   protected final class470 method1438() {
      return class423.method2062(this.field3387).method1201(this.field3385);
   }

   @ObfInfo(
      owner = "cr",
      name = "mh",
      desc = "(Lqy;IB)V"
   )
   static void method1987(class127 var0, int var1) {
      class193.method867(var0.field1072, var1);
      class84.method340(var0, var1);
   }
}
