import java.io.IOException;

@ObfInfo(
   name = "de"
)
public class class486 {
   @ObfInfo(
      owner = "de",
      name = "u",
      desc = "Z"
   )
   boolean field4048 = true;
   @ObfInfo(
      owner = "de",
      name = "x",
      desc = "Lqy;"
   )
   class127 field4052 = new class127(5000);
   @ObfInfo(
      owner = "de",
      name = "h",
      desc = "Lou;"
   )
   class160 field4053;
   @ObfInfo(
      owner = "de",
      name = "f",
      desc = "Ljf;"
   )
   class346 field4044 = null;
   @ObfInfo(
      owner = "de",
      name = "g",
      desc = "Ljf;"
   )
   class346 field4049;
   @ObfInfo(
      owner = "de",
      name = "i",
      desc = "Ljf;"
   )
   class346 field4050;
   @ObfInfo(
      owner = "de",
      name = "o",
      desc = "Ljf;"
   )
   class346 field4051;
   @ObfInfo(
      owner = "de",
      name = "e",
      desc = "Lmv;"
   )
   class395 field4046 = new class395();
   @ObfInfo(
      owner = "de",
      name = "q",
      desc = "Lqx;"
   )
   class6 field4043 = new class6(40000);
   @ObfInfo(
      owner = "de",
      name = "b",
      desc = "I"
   )
   int field4040 = 0;
   @ObfInfo(
      owner = "de",
      name = "v",
      desc = "I"
   )
   int field4041 = 0;
   @ObfInfo(
      owner = "de",
      name = "j",
      desc = "I"
   )
   int field4045 = 0;
   @ObfInfo(
      owner = "de",
      name = "r",
      desc = "I"
   )
   int field4047 = 0;
   @ObfInfo(
      owner = "de",
      name = "m",
      desc = "Lrg;"
   )
   public class205 field4042;

   @ObfInfo(
      owner = "de",
      name = "h",
      desc = "(I)V"
   )
   final void method2380() {
      this.field4046.method1932();
      this.field4041 = 0;
   }

   @ObfInfo(
      owner = "de",
      name = "e",
      desc = "(I)V"
   )
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

   @ObfInfo(
      owner = "de",
      name = "v",
      desc = "(Ljx;S)V"
   )
   public final void method2389(class299 var1) {
      this.field4046.method1939(var1);
      var1.field2402 = var1.field2403.field1070;
      var1.field2403.field1070 = 0;
      this.field4041 += var1.field2402;
   }

   @ObfInfo(
      owner = "de",
      name = "x",
      desc = "(Lou;B)V"
   )
   void method2381(class160 var1) {
      this.field4053 = var1;
   }

   @ObfInfo(
      owner = "de",
      name = "m",
      desc = "(I)V"
   )
   void method2382() {
      if (null != this.field4053) {
         this.field4053.method734();
         this.field4053 = null;
      }

   }

   @ObfInfo(
      owner = "de",
      name = "q",
      desc = "(I)V"
   )
   void method2383() {
      this.field4053 = null;
   }

   @ObfInfo(
      owner = "de",
      name = "f",
      desc = "(B)Lou;"
   )
   class160 method2384() {
      return this.field4053;
   }

   @ObfInfo(
      owner = "de",
      name = "e",
      desc = "(II)I"
   )
   public static int method2379(int var0) {
      return var0 >> 11 & 63;
   }

   @ObfInfo(
      owner = "de",
      name = "h",
      desc = "(Lly;Lly;ZII)V"
   )
   public static void method2387(class274 var0, class274 var1, boolean var2, int var3) {
      class423.field3465 = var0;
      class276.field2319 = var1;
      class375.field3180 = var2;
      class423.field3458 = var3;
   }

   @ObfInfo(
      owner = "de",
      name = "f",
      desc = "(III)I"
   )
   public static int method2385(int var0, int var1) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }

   @ObfInfo(
      owner = "de",
      name = "i",
      desc = "(II)Ljava/lang/String;"
   )
   static final String method2388(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class177.field1500 + "</col>" : "<col=00ff80>" + var0 / 1000000 + class177.field1498 + "</col>";
      }
   }
}
