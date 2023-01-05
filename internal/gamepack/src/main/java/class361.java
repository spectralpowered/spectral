public class class361 extends class108 {
   public static class31 field3236 = new class31(64);
   static class230 field3239;
   int field3238 = 0;
   public int field3234;
   public int field3235;
   public int field3237;
   public int field3240;

   void method1725() {
      this.method1727(this.field3238);
   }

   void method1728(class134 var1, int var2) {
      while(true) {
         int var4 = var1.method669();
         if (var4 == 0) {
            return;
         }

         this.method1726(var1, var4, var2);
      }
   }

   void method1726(class134 var1, int var2, int var3) {
      if (var2 == 1) {
         this.field3238 = var1.method673();
      }

   }

   void method1727(int var1) {
      double var3 = (double)(var1 >> 16 & 255) / 256.0D;
      double var5 = (double)(var1 >> 8 & 255) / 256.0D;
      double var7 = (double)(var1 & 255) / 256.0D;
      double var9 = var3;
      if (var5 < var3) {
         var9 = var5;
      }

      if (var7 < var9) {
         var9 = var7;
      }

      double var11 = var3;
      if (var5 > var3) {
         var11 = var5;
      }

      if (var7 > var11) {
         var11 = var7;
      }

      double var13 = 0.0D;
      double var15 = 0.0D;
      double var17 = (var11 + var9) / 2.0D;
      if (var9 != var11) {
         if (var17 < 0.5D) {
            var15 = (var11 - var9) / (var9 + var11);
         }

         if (var17 >= 0.5D) {
            var15 = (var11 - var9) / (2.0D - var11 - var9);
         }

         if (var3 == var11) {
            var13 = (var5 - var7) / (var11 - var9);
         } else if (var5 == var11) {
            var13 = 2.0D + (var7 - var3) / (var11 - var9);
         } else if (var7 == var11) {
            var13 = 4.0D + (var3 - var5) / (var11 - var9);
         }
      }

      var13 /= 6.0D;
      this.field3235 = (int)(var15 * 256.0D);
      this.field3237 = (int)(var17 * 256.0D);
      if (this.field3235 < 0) {
         this.field3235 = 0;
      } else if (this.field3235 > 255) {
         this.field3235 = 255;
      }

      if (this.field3237 < 0) {
         this.field3237 = 0;
      } else if (this.field3237 > 255) {
         this.field3237 = 255;
      }

      if (var17 > 0.5D) {
         this.field3240 = (int)(512.0D * var15 * (1.0D - var17));
      } else {
         this.field3240 = (int)(512.0D * var17 * var15);
      }

      if (this.field3240 < 1) {
         this.field3240 = 1;
      }

      this.field3234 = (int)((double)this.field3240 * var13);
   }

   static final boolean method1729() {
      return client.field572;
   }
}
