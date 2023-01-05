public class class34 {
   class152[] field180 = new class152[100];
   int field179;

   class152 method142(int var1, String var2, String var3, String var4) {
      class152 var6 = this.field180[99];

      for(int var7 = this.field179; var7 > 0; --var7) {
         if (var7 != 100) {
            this.field180[var7] = this.field180[var7 - 1];
         }
      }

      if (var6 == null) {
         var6 = new class152(var1, var2, var4, var3);
      } else {
         var6.method637();
         var6.method870();
         var6.method709(var1, var2, var4, var3);
      }

      this.field180[0] = var6;
      if (this.field179 < 100) {
         ++this.field179;
      }

      return var6;
   }

   class152 method141(int var1) {
      return var1 >= 0 && var1 < this.field179 ? this.field180[var1] : null;
   }

   int method143() {
      return this.field179;
   }

   static class484 method144(int var0) {
      class484[] var2 = new class484[]{class484.field4038, class484.field4030, class484.field4031, class484.field4032, class484.field4033, class484.field4034, class484.field4037, class484.field4036, class484.field4039};
      class484 var3 = (class484)class2.method10(var2, var0);
      if (var3 == null) {
         var3 = class484.field4039;
      }

      return var3;
   }
}
