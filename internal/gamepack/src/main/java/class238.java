import java.util.Iterator;

public class class238 {
   static Iterator field2577;
   int field2568 = 0;
   int field2570 = 0;
   int field2574 = 0;
   int field2576 = 0;
   long field2567 = 0L;
   long field2571 = 0L;
   long field2572 = 0L;
   long field2573 = -1L;
   long field2575 = -1L;
   public boolean field2569 = false;

   public void method1209() {
      this.field2575 = class154.method814();
   }

   public void method1204() {
      if (-1L != this.field2575) {
         this.field2571 = class154.method814() - this.field2575;
         this.field2575 = -1L;
      }

   }

   public void method1205(int var1) {
      this.field2573 = class154.method814();
      this.field2570 = var1;
   }

   public void method1206() {
      if (this.field2573 != -1L) {
         this.field2567 = class154.method814() - this.field2573;
         this.field2573 = -1L;
      }

      ++this.field2568;
      this.field2569 = true;
   }

   public void method1207() {
      this.field2569 = false;
      this.field2574 = 0;
   }

   public void method1203() {
      this.method1206();
   }

   public void method1208(class134 var1) {
      long var3 = this.field2571;
      var3 /= 10L;
      if (var3 < 0L) {
         var3 = 0L;
      } else if (var3 > 65535L) {
         var3 = 65535L;
      }

      var1.method655((int)var3);
      long var5 = this.field2567;
      var5 /= 10L;
      if (var5 < 0L) {
         var5 = 0L;
      } else if (var5 > 65535L) {
         var5 = 65535L;
      }

      var1.method655((int)var5);
      long var7 = this.field2572;
      var7 /= 10L;
      if (var7 < 0L) {
         var7 = 0L;
      } else if (var7 > 65535L) {
         var7 = 65535L;
      }

      var1.method655((int)var7);
      var1.method655(this.field2570);
      var1.method655(this.field2574);
      var1.method655(this.field2568);
      var1.method655(this.field2576);
   }

   static int method1210(byte[] var0, int var1, int var2) {
      int var4 = -1;

      for(int var5 = var1; var5 < var2; ++var5) {
         var4 = var4 >>> 8 ^ class134.field1488[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   public static class394 method1211(class164 var0, class164 var1, int var2, int var3) {
      byte[] var6 = var0.method892(var2, var3);
      boolean var5;
      if (null == var6) {
         var5 = false;
      } else {
         class212.method1108(var6);
         var5 = true;
      }

      if (!var5) {
         return null;
      } else {
         byte[] var7 = var1.method892(var2, var3);
         class394 var9;
         if (null == var7) {
            var9 = null;
         } else {
            class394 var8 = new class394(var7, class207.field2198, class318.field3011, class110.field1380, class111.field1387, class482.field3990, class344.field3162);
            class207.field2198 = null;
            class318.field3011 = null;
            class110.field1380 = null;
            class111.field1387 = null;
            class482.field3990 = null;
            class344.field3162 = (byte[][])null;
            var9 = var8;
         }

         return var9;
      }
   }
}
