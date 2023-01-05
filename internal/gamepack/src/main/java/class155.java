public class class155 {
   static class161[] field1618;

   static final void method817(class421 var0) {
      var0.method2022();
      int var2 = client.field552;
      class47 var3 = class89.field982 = client.field551[var2] = new class47();
      var3.field409 = var2;
      int var4 = var0.method2024(30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      int var7 = var4 & 16383;
      var3.field258[0] = var6 - class381.field3325;
      var3.field297 = (var3.field258[0] << 7) + (var3.method249() << 6);
      var3.field306[0] = var7 - class345.field3166;
      var3.field233 = (var3.field306[0] << 7) + (var3.method249() << 6);
      class195.field2036 = var3.field408 = var5;
      if (null != class25.field177[var2]) {
         var3.method250(class25.field177[var2]);
      }

      class25.field180 = 0;
      class25.field179[++class25.field180 - 1] = var2;
      class25.field176[var2] = 0;
      class25.field175 = 0;

      for(int var8 = 1; var8 < 2048; ++var8) {
         if (var2 != var8) {
            int var9 = var0.method2024(18);
            int var10 = var9 >> 16;
            int var11 = var9 >> 8 & 597;
            int var12 = var9 & 597;
            class25.field178[var8] = var12 + (var11 << 14) + (var10 << 28);
            class25.field183[var8] = 0;
            class25.field185[var8] = -1;
            class25.field181[++class25.field175 - 1] = var8;
            class25.field176[var8] = 0;
         }
      }

      var0.method2023();
   }

   static final void method818(int var0, int var1, int var2) {
      if (class342.field3148 < var0) {
         class342.field3148 += class373.field3298 + (var0 - class342.field3148) * class448.field3689 / 1000;
         if (class342.field3148 > var0) {
            class342.field3148 = var0;
         }
      }

      if (class342.field3148 > var0) {
         class342.field3148 -= class373.field3298 + class448.field3689 * (class342.field3148 - var0) / 1000;
         if (class342.field3148 < var0) {
            class342.field3148 = var0;
         }
      }

      if (class318.field3010 < var1) {
         class318.field3010 += class373.field3298 + class448.field3689 * (var1 - class318.field3010) / 1000;
         if (class318.field3010 > var1) {
            class318.field3010 = var1;
         }
      }

      if (class318.field3010 > var1) {
         class318.field3010 -= class373.field3298 + class448.field3689 * (class318.field3010 - var1) / 1000;
         if (class318.field3010 < var1) {
            class318.field3010 = var1;
         }
      }

      if (class112.field1394 < var2) {
         class112.field1394 += class373.field3298 + (var2 - class112.field1394) * class448.field3689 / 1000;
         if (class112.field1394 > var2) {
            class112.field1394 = var2;
         }
      }

      if (class112.field1394 > var2) {
         class112.field1394 -= class373.field3298 + class448.field3689 * (class112.field1394 - var2) / 1000;
         if (class112.field1394 < var2) {
            class112.field1394 = var2;
         }
      }

   }
}
