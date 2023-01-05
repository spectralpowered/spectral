public class class365 {
   class154[] field3253 = new class154[100];
   int field3252;

   class154 method1762(int var1, String var2, String var3, String var4) {
      class154 var6 = this.field3253[99];

      for(int var7 = this.field3252; var7 > 0; --var7) {
         if (var7 != 100) {
            this.field3253[var7] = this.field3253[var7 - 1];
         }
      }

      if (var6 == null) {
         var6 = new class154(var1, var2, var4, var3);
      } else {
         var6.method567();
         var6.method574();
         var6.method812(var1, var2, var4, var3);
      }

      this.field3253[0] = var6;
      if (this.field3252 < 100) {
         ++this.field3252;
      }

      return var6;
   }

   class154 method1761(int var1) {
      return var1 >= 0 && var1 < this.field3252 ? this.field3253[var1] : null;
   }

   int method1763() {
      return this.field3252;
   }

   static class26 method1764(int var0) {
      class26[] var2 = new class26[]{class26.field197, class26.field189, class26.field190, class26.field191, class26.field192, class26.field193, class26.field196, class26.field195, class26.field198};
      class26 var3 = (class26)class296.method1399(var2, var0);
      if (var3 == null) {
         var3 = class26.field198;
      }

      return var3;
   }
}
