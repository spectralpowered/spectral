public class class367 {
   static {
      int var0 = 0;
      int var1 = 0;
      class320[] var2 = class153.method805();

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class320 var4 = var2[var3];
         if (var4.field3021 > var0) {
            var0 = var4.field3021;
         }

         if (var4.field3022 > var1) {
            var1 = var4.field3022;
         }
      }

   }

   public static class116 method1767(int var0) {
      class116 var2 = (class116)class116.field1413.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class116.field1414.method892(5, var0);
         var2 = new class116();
         if (var3 != null) {
            var2.method600(new class134(var3));
         }

         class116.field1413.method163(var2, (long)var0);
         return var2;
      }
   }
}
