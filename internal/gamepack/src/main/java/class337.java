import java.util.Iterator;

public class class337 {
   static Iterator field2701;
   int field2692 = 0;
   int field2694 = 0;
   int field2698 = 0;
   int field2700 = 0;
   long field2691 = 0L;
   long field2695 = 0L;
   long field2696 = 0L;
   long field2697 = -1L;
   long field2699 = -1L;
   public boolean field2693 = false;

   public void method1694() {
      this.field2699 = class152.method711();
   }

   public void method1689() {
      if (-1L != this.field2699) {
         this.field2695 = class152.method711() - this.field2699;
         this.field2699 = -1L;
      }

   }

   public void method1690(int var1) {
      this.field2697 = class152.method711();
      this.field2694 = var1;
   }

   public void method1691() {
      if (this.field2697 != -1L) {
         this.field2691 = class152.method711() - this.field2697;
         this.field2697 = -1L;
      }

      ++this.field2692;
      this.field2693 = true;
   }

   public void method1692() {
      this.field2693 = false;
      this.field2698 = 0;
   }

   public void method1688() {
      this.method1691();
   }

   public void method1693(class127 var1) {
      long var3 = this.field2695;
      var3 /= 10L;
      if (var3 < 0L) {
         var3 = 0L;
      } else if (var3 > 65535L) {
         var3 = 65535L;
      }

      var1.method533((int)var3);
      long var5 = this.field2691;
      var5 /= 10L;
      if (var5 < 0L) {
         var5 = 0L;
      } else if (var5 > 65535L) {
         var5 = 65535L;
      }

      var1.method533((int)var5);
      long var7 = this.field2696;
      var7 /= 10L;
      if (var7 < 0L) {
         var7 = 0L;
      } else if (var7 > 65535L) {
         var7 = 65535L;
      }

      var1.method533((int)var7);
      var1.method533(this.field2694);
      var1.method533(this.field2698);
      var1.method533(this.field2692);
      var1.method533(this.field2700);
   }

   static int method1695(byte[] var0, int var1, int var2) {
      int var4 = -1;

      for(int var5 = var1; var5 < var2; ++var5) {
         var4 = var4 >>> 8 ^ class127.field1071[(var4 ^ var0[var5]) & 255];
      }

      var4 = ~var4;
      return var4;
   }

   public static class58 method1696(class274 var0, class274 var1, int var2, int var3) {
      byte[] var6 = var0.method1365(var2, var3);
      boolean var5;
      if (null == var6) {
         var5 = false;
      } else {
         class85.method354(var6);
         var5 = true;
      }

      if (!var5) {
         return null;
      } else {
         byte[] var7 = var1.method1365(var2, var3);
         class58 var9;
         if (null == var7) {
            var9 = null;
         } else {
            class58 var8 = new class58(var7, class18.field92, class110.field826, class418.field3431, class50.field576, class413.field3422, class340.field2723);
            class18.field92 = null;
            class110.field826 = null;
            class418.field3431 = null;
            class50.field576 = null;
            class413.field3422 = null;
            class340.field2723 = (byte[][])null;
            var9 = var8;
         }

         return var9;
      }
   }
}
