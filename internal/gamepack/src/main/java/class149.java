public class class149 {
   static int[] field1567 = new int[500];
   static int[] field1568 = new int[500];
   static int[] field1569 = new int[500];
   static int[] field1573 = new int[500];
   boolean field1576 = false;
   class268 field1570 = null;
   int field1571 = -1;
   int[] field1566;
   int[] field1572;
   int[] field1574;
   int[] field1575;

   class149(byte[] var1, class268 var2) {
      this.field1570 = var2;
      class134 var3 = new class134(var1);
      class134 var4 = new class134(var1);
      var3.field1487 = 2;
      int var5 = var3.method669();
      int var6 = -1;
      int var7 = 0;
      var4.field1487 = var3.field1487 + var5;

      int var8;
      for(var8 = 0; var8 < var5; ++var8) {
         int var9 = var3.method669();
         if (var9 > 0) {
            if (this.field1570.field2696[var8] != 0) {
               for(int var10 = var8 - 1; var10 > var6; --var10) {
                  if (this.field1570.field2696[var10] == 0) {
                     field1573[var7] = var10;
                     field1567[var7] = 0;
                     field1568[var7] = 0;
                     field1569[var7] = 0;
                     ++var7;
                     break;
                  }
               }
            }

            field1573[var7] = var8;
            short var11 = 0;
            if (this.field1570.field2696[var8] == 3) {
               var11 = 128;
            }

            if ((var9 & 1) != 0) {
               field1567[var7] = var4.method680();
            } else {
               field1567[var7] = var11;
            }

            if ((var9 & 2) != 0) {
               field1568[var7] = var4.method680();
            } else {
               field1568[var7] = var11;
            }

            if ((var9 & 4) != 0) {
               field1569[var7] = var4.method680();
            } else {
               field1569[var7] = var11;
            }

            var6 = var8;
            ++var7;
            if (this.field1570.field2696[var8] == 5) {
               this.field1576 = true;
            }
         }
      }

      if (var4.field1487 != var1.length) {
         throw new RuntimeException();
      } else {
         this.field1571 = var7;
         this.field1572 = new int[var7];
         this.field1566 = new int[var7];
         this.field1574 = new int[var7];
         this.field1575 = new int[var7];

         for(var8 = 0; var8 < var7; ++var8) {
            this.field1572[var8] = field1573[var8];
            this.field1566[var8] = field1567[var8];
            this.field1574[var8] = field1568[var8];
            this.field1575[var8] = field1569[var8];
         }

      }
   }
}
