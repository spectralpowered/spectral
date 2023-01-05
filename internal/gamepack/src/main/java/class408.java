public class class408 extends class189 {
   String field3544;
   long field3545;
   // $FF: synthetic field
   final class105 this$0;

   class408(class105 var1) {
      this.this$0 = var1;
      this.field3545 = -1L;
      this.field3544 = null;
   }

   void method979(class134 var1) {
      if (var1.method669() != 255) {
         --var1.field1487;
         this.field3545 = var1.method720();
      }

      this.field3544 = var1.method676();
   }

   void method980(class27 var1) {
      var1.method135(this.field3545, this.field3544);
   }

   static final void method1993(int var0, int var1) {
      if (var0 < 128) {
         var0 = 128;
      }

      if (var0 > 383) {
         var0 = 383;
      }

      if (class389.field3438 < var0) {
         class389.field3438 += class298.field2875 * (var0 - class389.field3438) / 1000 + class14.field127;
         if (class389.field3438 > var0) {
            class389.field3438 = var0;
         }
      }

      if (class389.field3438 > var0) {
         class389.field3438 -= class14.field127 + (class389.field3438 - var0) * class298.field2875 / 1000;
         if (class389.field3438 < var0) {
            class389.field3438 = var0;
         }
      }

      int var3 = var1 - class177.field1929;
      if (var3 > 1024) {
         var3 -= 2048;
      }

      if (var3 < -1024) {
         var3 += 2048;
      }

      if (var3 > 0) {
         class177.field1929 += class14.field127 + var3 * class298.field2875 / 1000;
         class177.field1929 &= 2047;
      }

      if (var3 < 0) {
         class177.field1929 -= -var3 * class298.field2875 / 1000 + class14.field127;
         class177.field1929 &= 2047;
      }

      int var4 = var1 - class177.field1929;
      if (var4 > 1024) {
         var4 -= 2048;
      }

      if (var4 < -1024) {
         var4 += 2048;
      }

      if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
         class177.field1929 = var1;
      }

   }
}
