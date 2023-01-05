public class class124 {
   class55 field1455 = new class55();
   long field1454 = -1L;
   long field1456;

   public class124(class134 var1) {
      this.method634(var1);
   }

   void method634(class134 var1) {
      this.field1456 = var1.method720();
      this.field1454 = var1.method720();

      for(int var3 = var1.method669(); var3 != 0; var3 = var1.method669()) {
         Object var4;
         if (var3 == 1) {
            var4 = new class45(this);
         } else if (var3 == 4) {
            var4 = new class15(this);
         } else if (var3 == 3) {
            var4 = new class493(this);
         } else if (var3 == 2) {
            var4 = new class227(this);
         } else {
            if (var3 != 5) {
               throw new RuntimeException("");
            }

            var4 = new class251(this);
         }

         ((class187)var4).method972(var1);
         this.field1455.method325((class106)var4);
      }

   }

   public void method632(class112 var1) {
      if (var1.field1361 == this.field1456 && this.field1454 == var1.field1391) {
         for(class187 var3 = (class187)this.field1455.method327(); var3 != null; var3 = (class187)this.field1455.method321()) {
            var3.method973(var1);
         }

         ++var1.field1391;
      } else {
         throw new RuntimeException("");
      }
   }

   public static String method633(class134 var0) {
      String var2;
      try {
         int var3 = var0.method681();
         if (var3 > 32767) {
            var3 = 32767;
         }

         byte[] var4 = new byte[var3];
         var0.field1487 += class223.field2435.method1781(var0.field1489, var0.field1487, var4, 0, var3);
         String var5 = class165.method896(var4, 0, var3);
         var2 = var5;
      } catch (Exception var6) {
         var2 = "Cabbage";
      }

      return var2;
   }
}
