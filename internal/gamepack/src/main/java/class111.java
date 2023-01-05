public class class111 extends class108 {
   public static class164 field1386;
   public static int[] field1387;
   static class280 field1385;
   static class31 field1383 = new class31(64);
   static int[] field1382;
   class376 field1384;

   void method582() {
   }

   void method584(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method578(var1, var3);
      }
   }

   void method578(class134 var1, int var2) {
      if (var2 == 249) {
         this.field1384 = class479.method2314(var1, this.field1384);
      }

   }

   public int method579(int var1, int var2) {
      return class175.method933(this.field1384, var1, var2);
   }

   public String method580(int var1, String var2) {
      class376 var5 = this.field1384;
      String var4;
      if (var5 == null) {
         var4 = var2;
      } else {
         class232 var6 = (class232)var5.method1794((long)var1);
         if (var6 == null) {
            var4 = var2;
         } else {
            var4 = (String)var6.field2518;
         }
      }

      return var4;
   }

   static final void method583(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         ;
      }

   }

   public static int method581(byte[] var0, int var1, CharSequence var2) {
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
