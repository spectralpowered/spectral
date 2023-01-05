public class class44 extends class106 {
   static class230 field377;
   class5 field376;
   class55 field378 = new class55();

   class44(class5 var1) {
      this.field376 = var1;
   }

   void method223(int var1, int var2, int var3, int var4) {
      class132 var6 = null;
      int var7 = 0;

      for(class132 var8 = (class132)this.field378.method327(); null != var8; var8 = (class132)this.field378.method321()) {
         ++var7;
         if (var8.field1479 == var1) {
            var8.method648(var1, var2, var3, var4);
            return;
         }

         if (var8.field1479 <= var1) {
            var6 = var8;
         }
      }

      if (null == var6) {
         if (var7 < 4) {
            this.field378.method319(new class132(var1, var2, var3, var4));
         }

      } else {
         class55.method328(new class132(var1, var2, var3, var4), var6);
         if (var7 >= 4) {
            this.field378.method327().method567();
         }

      }
   }

   class132 method224(int var1) {
      class132 var3 = (class132)this.field378.method327();
      if (null != var3 && var3.field1479 <= var1) {
         for(class132 var4 = (class132)this.field378.method321(); var4 != null && var4.field1479 <= var1; var4 = (class132)this.field378.method321()) {
            var3.method567();
            var3 = var4;
         }

         if (var3.field1480 + var3.field1479 + this.field376.field15 > var1) {
            return var3;
         } else {
            var3.method567();
            return null;
         }
      } else {
         return null;
      }
   }

   boolean method225() {
      return this.field378.method323();
   }

   public static void method229(class164 var0) {
      class295.field2828 = var0;
   }

   static void method228() {
      for(class82 var1 = (class82)class82.field946.method1934(); null != var1; var1 = (class82)class82.field946.method1936()) {
         if (null != var1.field950) {
            var1.method440();
         }
      }

   }

   static String method227(char var0, int var1) {
      char[] var3 = new char[var1];

      for(int var4 = 0; var4 < var1; ++var4) {
         var3[var4] = var0;
      }

      return new String(var3);
   }

   static final void method226(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (class25.method126(var0)) {
         class182.field1969 = null;
         class352.method1686(class71.field853[var0], -1, var1, var2, var3, var4, var5, var6, var7);
         if (null != class182.field1969) {
            class352.method1686(class182.field1969, -1412584499, var1, var2, var3, var4, class227.field2462, class5.field29, var7);
            class182.field1969 = null;
         }

      } else {
         if (var7 != -1) {
            client.field648[var7] = true;
         } else {
            for(int var9 = 0; var9 < 100; ++var9) {
               client.field648[var9] = true;
            }
         }

      }
   }
}
