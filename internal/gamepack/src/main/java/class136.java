public class class136 {
   class162[] field1493 = new class162[10];
   int field1492;
   int field1494;

   class136(class134 var1) {
      for(int var2 = 0; var2 < 10; ++var2) {
         int var3 = var1.method669();
         if (var3 != 0) {
            --var1.field1487;
            this.field1493[var2] = new class162();
            this.field1493[var2].method856(var1);
         }
      }

      this.field1492 = var1.method671();
      this.field1494 = var1.method671();
   }

   public class388 method729() {
      byte[] var1 = this.method731();
      return new class388(22050, var1, this.field1492 * 22050 / 1000, this.field1494 * 22050 / 1000);
   }

   public final int method730() {
      int var1 = 9999999;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1493[var2] != null && this.field1493[var2].field1685 / 20 < var1) {
            var1 = this.field1493[var2].field1685 / 20;
         }
      }

      if (this.field1492 < this.field1494 && this.field1492 / 20 < var1) {
         var1 = this.field1492 / 20;
      }

      if (var1 != 9999999 && var1 != 0) {
         for(var2 = 0; var2 < 10; ++var2) {
            if (this.field1493[var2] != null) {
               this.field1493[var2].field1685 -= var1 * 20;
            }
         }

         if (this.field1492 < this.field1494) {
            this.field1492 -= var1 * 20;
            this.field1494 -= var1 * 20;
         }

         return var1;
      } else {
         return 0;
      }
   }

   final byte[] method731() {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < 10; ++var2) {
         if (this.field1493[var2] != null && this.field1493[var2].field1684 + this.field1493[var2].field1685 > var1) {
            var1 = this.field1493[var2].field1684 + this.field1493[var2].field1685;
         }
      }

      if (var1 == 0) {
         return new byte[0];
      } else {
         var2 = var1 * 22050 / 1000;
         byte[] var3 = new byte[var2];

         for(int var4 = 0; var4 < 10; ++var4) {
            if (this.field1493[var4] != null) {
               int var5 = this.field1493[var4].field1684 * 22050 / 1000;
               int var6 = this.field1493[var4].field1685 * 22050 / 1000;
               int[] var7 = this.field1493[var4].method857(var5, this.field1493[var4].field1684);

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

   public static class136 method728(class164 var0, int var1, int var2) {
      byte[] var3 = var0.method892(var1, var2);
      return var3 == null ? null : new class136(new class134(var3));
   }
}
