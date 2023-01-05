import java.io.IOException;

public class class393 {
   boolean field3465 = true;
   class134 field3469 = new class134(5000);
   class200 field3461 = null;
   class200 field3466;
   class200 field3467;
   class200 field3468;
   class421 field3460 = new class421(40000);
   class429 field3470;
   class55 field3463 = new class55();
   int field3457 = 0;
   int field3458 = 0;
   int field3462 = 0;
   int field3464 = 0;
   public class1 field3459;

   final void method1911() {
      this.field3463.method318();
      this.field3458 = 0;
   }

   final void method1917() throws IOException {
      if (null != this.field3470 && this.field3458 > 0) {
         this.field3469.field1487 = 0;

         while(true) {
            class81 var2 = (class81)this.field3463.method327();
            if (var2 == null || var2.field932 > this.field3469.field1489.length - this.field3469.field1487) {
               this.field3470.method2051(this.field3469.field1489, 0, this.field3469.field1487);
               this.field3462 = 0;
               break;
            }

            this.field3469.method662(var2.field933.field1489, 0, var2.field932);
            this.field3458 -= var2.field932;
            var2.method567();
            var2.field933.method654();
            var2.method439();
         }
      }

   }

   public final void method1920(class81 var1) {
      this.field3463.method325(var1);
      var1.field932 = var1.field933.field1487;
      var1.field933.field1487 = 0;
      this.field3458 += var1.field932;
   }

   void method1912(class429 var1) {
      this.field3470 = var1;
   }

   void method1913() {
      if (null != this.field3470) {
         this.field3470.method2054();
         this.field3470 = null;
      }

   }

   void method1914() {
      this.field3470 = null;
   }

   class429 method1915() {
      return this.field3470;
   }

   public static int method1910(int var0) {
      return var0 >> 11 & 63;
   }

   public static void method1918(class164 var0, class164 var1, boolean var2, int var3) {
      class272.field2715 = var0;
      class486.field3996 = var1;
      class462.field3850 = var2;
      class272.field2708 = var3;
   }

   public static int method1916(int var0, int var1) {
      int var3;
      for(var3 = 0; var1 > 0; --var1) {
         var3 = var3 << 1 | var0 & 1;
         var0 >>>= 1;
      }

      return var3;
   }

   static final String method1919(int var0) {
      if (var0 < 100000) {
         return "<col=ffff00>" + var0 + "</col>";
      } else {
         return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + class96.field1195 + "</col>" : "<col=00ff80>" + var0 / 1000000 + class96.field1193 + "</col>";
      }
   }
}
