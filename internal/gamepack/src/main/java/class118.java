public class class118 implements class282 {
   static int field1428;
   class164 field1421;
   class397 field1422 = new class397();
   class487[] field1426;
   double field1425 = 1.0D;
   int field1423 = 128;
   int field1424 = 0;
   int field1427;

   public class118(class164 var1, class164 var2, int var3, double var4, int var6) {
      this.field1421 = var2;
      this.field1427 = var3;
      this.field1424 = this.field1427;
      this.field1425 = var4;
      this.field1423 = var6;
      int[] var7 = var1.method878(0);
      int var8 = var7.length;
      this.field1426 = new class487[var1.method887(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         class134 var10 = new class134(var1.method892(0, var7[var9]));
         this.field1426[var7[var9]] = new class487(var10);
      }

   }

   public int method613() {
      int var2 = 0;
      int var3 = 0;
      class487[] var4 = this.field1426;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class487 var6 = var4[var5];
         if (null != var6 && var6.field4000 != null) {
            var2 += var6.field4000.length;
            int[] var7 = var6.field4000;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               int var9 = var7[var8];
               if (this.field1421.method888(var9)) {
                  ++var3;
               }
            }
         }
      }

      if (var2 == 0) {
         return 0;
      } else {
         return var3 * 100 / var2;
      }
   }

   public void method614(double var1) {
      this.field1425 = var1;
      this.method612();
   }

   public int[] method1352(int var1) {
      class487 var3 = this.field1426[var1];
      if (var3 != null) {
         if (null != var3.field3997) {
            this.field1422.method1931(var3);
            var3.field4006 = true;
            return var3.field3997;
         }

         boolean var4 = var3.method2320(this.field1425, this.field1423, this.field1421);
         if (var4) {
            if (0 == this.field1424) {
               class487 var5 = (class487)this.field1422.method1939();
               var5.method2321();
            } else {
               --this.field1424;
            }

            this.field1422.method1931(var3);
            var3.field4006 = true;
            return var3.field3997;
         }
      }

      return null;
   }

   public int method1353(int var1) {
      return this.field1426[var1] != null ? this.field1426[var1].field3999 : 0;
   }

   public boolean method1351(int var1) {
      return this.field1426[var1].field4004;
   }

   public boolean method1350(int var1) {
      return this.field1423 == 64;
   }

   public void method612() {
      for(int var2 = 0; var2 < this.field1426.length; ++var2) {
         if (null != this.field1426[var2]) {
            this.field1426[var2].method2321();
         }
      }

      this.field1422 = new class397();
      this.field1424 = this.field1427;
   }

   public void method619(int var1) {
      for(int var3 = 0; var3 < this.field1426.length; ++var3) {
         class487 var4 = this.field1426[var3];
         if (var4 != null && var4.field3998 != 0 && var4.field4006) {
            var4.method2319(var1);
            var4.field4006 = false;
         }
      }

   }

   static boolean method620() {
      return client.field584;
   }
}
