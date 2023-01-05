public class class381 extends class480 {
   String field3222;
   long field3223;
   // $FF: synthetic field
   final class182 this$0;

   class381(class182 var1) {
      this.this$0 = var1;
      this.field3223 = -1L;
      this.field3222 = null;
   }

   void method2367(class127 var1) {
      if (var1.method547() != 255) {
         --var1.field1070;
         this.field3223 = var1.method598();
      }

      this.field3222 = var1.method554();
   }

   void method2368(class429 var1) {
      var1.method2106(this.field3223, this.field3222);
   }

   static final void method1892(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      }

      if (var0 > 383) {
         var0 = 383;
      }

      if (class442.field3666 < var0) {
         class442.field3666 += class397.field3350 * (var0 - class442.field3666) / 1000 + class4.field25;
         if (class442.field3666 > var0) {
            class442.field3666 = var0;
         }
      }

      if (class442.field3666 > var0) {
         class442.field3666 -= class4.field25 + (class442.field3666 - var0) * class397.field3350 / 1000;
         if (class442.field3666 < var0) {
            class442.field3666 = var0;
         }
      }

      int var3 = var1 - class22.field105;
      if (var3 > 1024) {
         var3 -= 2048;
      }

      if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 > 0) {
         class22.field105 += class4.field25 + var3 * class397.field3350 / 1000;
         class22.field105 &= 2047;
      }

      if (var3 < 0) {
         class22.field105 -= -var3 * class397.field3350 / 1000 + class4.field25;
         class22.field105 &= 2047;
      }

      int var4 = var1 - class22.field105;
      if (var4 > 1024) {
         var4 -= 2048;
      }

      if (var4 < -1024) {
         var4 += 2048;
      }

      if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
         class22.field105 = var1;
      }

   }
}
