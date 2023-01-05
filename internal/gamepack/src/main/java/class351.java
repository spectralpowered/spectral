public class class351 {
   class231[] field2892 = new class231[10];
   int field2891;
   int field2893;

   class351(class127 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method547();
         if (var3 != 0) {
            --var1.field1070;
            this.field2892[var2] = new class231();
            this.field2892[var2].method1001(var1);
         }
      }

      this.field2891 = var1.method549();
      this.field2893 = var1.method549();
   }

   public class82 method1768() {
      byte[] var1 = this.method1770();
      return new class82(22050, var1, this.field2891 * 22050 / 1000, this.field2893 * 22050 / 1000);
   }

   public final int method1769() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field2892[var2] != null && this.field2892[var2].field1959 / 20 < var1) {
            var1 = this.field2892[var2].field1959 / 20;
         }
      }

      if (this.field2891 < this.field2893 && this.field2891 / 20 < var1) {
         var1 = this.field2891 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field2892[var2] != null) {
               this.field2892[var2].field1959 -= var1 * 20;
            }
         }

         if (this.field2891 < this.field2893) {
            this.field2891 -= var1 * 20;
            this.field2893 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method1770() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field2892[var2] != null && this.field2892[var2].field1958 + this.field2892[var2].field1959 > var1) {
            var1 = this.field2892[var2].field1958 + this.field2892[var2].field1959;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field2892[var4] != null) {
               int var5 = this.field2892[var4].field1958 * 22050 / 1000;
               int var6 = this.field2892[var4].field1959 * 22050 / 1000;
               int[] var7 = this.field2892[var4].method1002(var5, this.field2892[var4].field1958);

               for(int var8 = 0; var8 < var5; ++var8) {
                  int var9 = var3[var8 + var6] + (var7[var8] >> 8);
                  if ((var9 + 128 & -256) != 0) {
                     var9 = var9 >> 31 ^ 127;
                  }

                  var3[var8 + var6] = (byte)var9;
               }
            }
         }

         return var3;
      }
   }

   public static class351 method1767(class274 var0, int var1, int var2) {
      byte[] var3 = var0.method1365(var1, var2);
      return var3 == null ? null : new class351(new class127(var3));
   }
}
