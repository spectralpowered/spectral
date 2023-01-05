public final class class8 {
   static final void method27(String var0) {
      StringBuilder var10000 = (new StringBuilder()).append(var0);
      class96 var10001 = (class96)null;
      String var2 = var10000.append(class96.field1200).toString();
      class237.method1197(30, "", var2);
   }

   static final void method26(class210 var0, class458 var1, int var2, int var3, boolean var4) {
      String[] var6 = var1.field3781;
      byte var7 = -1;
      String var8 = null;
      if (null != var6 && null != var6[var3]) {
         if (var3 == 0) {
            var7 = 33;
         } else if (var3 == 1) {
            var7 = 34;
         } else if (var3 == 2) {
            var7 = 35;
         } else if (var3 == 3) {
            var7 = 36;
         } else {
            var7 = 37;
         }

         var8 = var6[var3];
      } else if (var3 == 4) {
         var7 = 37;
         var8 = class96.field1333;
      }

      if (var7 != -1 && null != var8) {
         class384.method1821(var8, class334.method1616(16748608) + var1.field3764, var7, 0, var2, var0.field2307, var1.field3785, var4);
      }

   }
}
