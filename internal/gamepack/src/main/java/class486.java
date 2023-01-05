import java.io.IOException;

public class class486 {
   boolean field4048 = true;
   class127 field4052 = new class127(5000);
   class160 field4053;
   class346 field4044 = null;
   class346 field4049;
   class346 field4050;
   class346 field4051;
   class395 field4046 = new class395();
   class6 field4043 = new class6(40000);
   int field4040 = 0;
   int field4041 = 0;
   int field4045 = 0;
   int field4047 = 0;
   public class205 field4042;

   final void method2380() {
      this.field4046.method1932();
      this.field4041 = 0;
   }

   final void method2386() throws IOException {
      if (null != this.field4053 && this.field4041 > 0) {
         this.field4052.field1070 = 0;

         while(true) {
            class299 var2 = (class299)this.field4046.method1941();
            if (var2 == null || var2.field2402 > this.field4052.field1072.length - this.field4052.field1070) {
               this.field4053.method731(this.field4052.field1072, 0, this.field4052.field1070);
               this.field4045 = 0;
               break;
            }

            this.field4052.method540(var2.field2403.field1072, 0, var2.field2402);
            this.field4041 -= var2.field2402;
            var2.method637();
            var2.field2403.method532();
            var2.method1446();
         }
      }

   }

   public final void method2389(class299 var1) {
      this.field4046.method1939(var1);
      var1.field2402 = var1.field2403.field1070;
      var1.field2403.field1070 = 0;
      this.field4041 += var1.field2402;
   }

   void method2381(class160 var1) {
      this.field4053 = var1;
   }

   void method2382() {
      if (null != this.field4053) {
         this.field4053.method734();
         this.field4053 = null;
      }

   }

   void method2383() {
      this.field4053 = null;
   }

   class160 method2384() {
      return this.field4053;
   }

   public static int method2379(int var0) {
      return var0 >> 11 & 63;
   }

   public static void method2387(class274 var0, class274 var1, boolean var2, int var3) {
      class423.field3465 = var0;
      class276.field2319 = var1;
      class375.field3180 = var2;
      class423.field3458 = var3;
   }

   public static int method2385(int var0, int var1) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }

   static final String method2388(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class177.field1500 + "</col>" : "<col=00ff80>" + var0 / 1000000 + class177.field1498 + "</col>";
      }
   }
}
