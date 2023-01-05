public class class251 implements class308 {
   static int field2068;
   class141 field2062 = new class141();
   class274 field2061;
   class29[] field2066;
   double field2065 = 1.0D;
   int field2063 = 128;
   int field2064 = 0;
   int field2067;

   public class251(class274 var1, class274 var2, int var3, double var4, int var6) {
      this.field2061 = var2;
      this.field2067 = var3;
      this.field2064 = this.field2067;
      this.field2065 = var4;
      this.field2063 = var6;
      int[] var7 = var1.method1351(0);
      int var8 = var7.length;
      this.field2066 = new class29[var1.method1360(0)];

      for(int var9 = 0; var9 < var8; ++var9) {
         class127 var10 = new class127(var1.method1365(0, var7[var9]));
         this.field2066[var7[var9]] = new class29(var10);
      }

   }

   public int method1084() {
      int var2 = 0;
      int var3 = 0;
      class29[] var4 = this.field2066;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class29 var6 = var4[var5];
         if (null != var6 && var6.field166 != null) {
            var2 += var6.field166.length;
            int[] var7 = var6.field166;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               int var9 = var7[var8];
               if (this.field2061.method1361(var9)) {
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

   public void method1085(double var1) {
      this.field2065 = var1;
      this.method1083();
   }

   public int[] method1495(int var1) {
      class29 var3 = this.field2066[var1];
      if (var3 != null) {
         if (null != var3.field163) {
            this.field2062.method643(var3);
            var3.field172 = true;
            return var3.field163;
         }

         boolean var4 = var3.method133(this.field2065, this.field2063, this.field2061);
         if (var4) {
            if (0 == this.field2064) {
               class29 var5 = (class29)this.field2062.method651();
               var5.method134();
            } else {
               --this.field2064;
            }

            this.field2062.method643(var3);
            var3.field172 = true;
            return var3.field163;
         }
      }

      return null;
   }

   public int method1496(int var1) {
      return this.field2066[var1] != null ? this.field2066[var1].field165 : 0;
   }

   public boolean method1494(int var1) {
      return this.field2066[var1].field170;
   }

   public boolean method1493(int var1) {
      return this.field2063 == 64;
   }

   public void method1083() {
      for(int var2 = 0; var2 < this.field2066.length; ++var2) {
         if (null != this.field2066[var2]) {
            this.field2066[var2].method134();
         }
      }

      this.field2062 = new class141();
      this.field2064 = this.field2067;
   }

   public void method1090(int var1) {
      for(int var3 = 0; var3 < this.field2066.length; ++var3) {
         class29 var4 = this.field2066[var3];
         if (var4 != null && var4.field164 != 0 && var4.field172) {
            var4.method132(var1);
            var4.field172 = false;
         }
      }

   }

   static boolean method1091() {
      return client.field380;
   }
}
