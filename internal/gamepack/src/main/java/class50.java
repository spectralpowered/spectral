public class class50 extends class195 {
   public static class274 field575;
   public static int[] field576;
   static class446 field574;
   static class99 field572 = new class99(64);
   static int[] field571;
   class385 field573;

   void method256() {
   }

   void method258(class127 var1) {
      while(true) {
         int var3 = var1.method547();
         if (var3 == 0) {
            return;
         }

         this.method252(var1, var3);
      }
   }

   void method252(class127 var1, int var2) {
      if (var2 == 249) {
         this.field573 = class89.method380(var1, this.field573);
      }

   }

   public int method253(int var1, int var2) {
      return class288.method1424(this.field573, var1, var2);
   }

   public String method254(int var1, String var2) {
      class385 var5 = this.field573;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class135 var6 = (class135)var5.method1897((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field1111;
         }
      }

      return var4;
   }

   static final void method257(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         ;
      }

   }

   public static int method255(byte[] var0, int var1, CharSequence var2) {
      int var4 = var2.length();
      int var5 = var1;

      for(int var6 = 0; var6 < var4; ++var6) {
         char var7 = var2.charAt(var6);
         if (var7 <= 127) {
            var0[var5++] = (byte)var7;
         } else if (var7 <= 2047) {
            var0[var5++] = (byte)(192 | var7 >> 6);
            var0[var5++] = (byte)(128 | var7 & 63);
         } else {
            var0[var5++] = (byte)(224 | var7 >> 12);
            var0[var5++] = (byte)(128 | var7 >> 6 & 63);
            var0[var5++] = (byte)(128 | var7 & 63);
         }
      }

      return var5 - var1;
   }
}
