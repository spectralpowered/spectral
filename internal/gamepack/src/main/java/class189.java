public abstract class class189 extends class106 {
   abstract void method979(class134 var1);

   abstract void method980(class27 var1);

   public static boolean method983(int var0) {
      return (var0 >> 20 & 1) != 0;
   }

   public static class81 method982(class165 var0, class1 var1) {
      class81 var3 = class329.method1595();
      var3.field935 = var0;
      var3.field930 = var0.field1825;
      if (-1 == var3.field930) {
         var3.field933 = new class421(260);
      } else if (var3.field930 == -2) {
         var3.field933 = new class421(10000);
      } else if (var3.field930 <= 18) {
         var3.field933 = new class421(20);
      } else if (var3.field930 <= 98) {
         var3.field933 = new class421(100);
      } else {
         var3.field933 = new class421(260);
      }

      var3.field933.method2017(var1);
      var3.field933.method2021(var3.field935.field1824);
      var3.field932 = 0;
      return var3;
   }

   static void method981() {
      for(class240 var1 = (class240)client.field598.method543(); null != var1; var1 = (class240)client.field598.method544()) {
         int var2 = var1.field2580;
         if (class25.method126(var2)) {
            boolean var3 = true;
            class210[] var4 = class71.field853[var2];

            int var5;
            for(var5 = 0; var5 < var4.length; ++var5) {
               if (var4[var5] != null) {
                  var3 = var4[var5].field2215;
                  break;
               }
            }

            if (!var3) {
               var5 = (int)var1.field1361;
               class210 var6 = class274.method1301(var5);
               if (var6 != null) {
                  class214.method1117(var6);
               }
            }
         }
      }

   }
}
