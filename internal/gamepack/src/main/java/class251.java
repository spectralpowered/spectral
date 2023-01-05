@ObfInfo(
   name = "ht"
)
public class class251 implements class308 {
   @ObfInfo(
      owner = "ht",
      name = "fx",
      desc = "I"
   )
   static int field2068;
   @ObfInfo(
      owner = "ht",
      name = "e",
      desc = "Lmq;"
   )
   class141 field2062 = new class141();
   @ObfInfo(
      owner = "ht",
      name = "f",
      desc = "Lly;"
   )
   class274 field2061;
   @ObfInfo(
      owner = "ht",
      name = "h",
      desc = "[Lhx;"
   )
   class29[] field2066;
   @ObfInfo(
      owner = "ht",
      name = "m",
      desc = "D"
   )
   double field2065 = 1.0D;
   @ObfInfo(
      owner = "ht",
      name = "q",
      desc = "I"
   )
   int field2063 = 128;
   @ObfInfo(
      owner = "ht",
      name = "x",
      desc = "I"
   )
   int field2064 = 0;
   @ObfInfo(
      owner = "ht",
      name = "v",
      desc = "I"
   )
   int field2067;

   @ObfInfo(
      owner = "ht",
      name = "<init>",
      desc = "(Lly;Lly;IDI)V"
   )
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

   @ObfInfo(
      owner = "ht",
      name = "h",
      desc = "(B)I"
   )
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

   @ObfInfo(
      owner = "ht",
      name = "e",
      desc = "(D)V"
   )
   public void method1085(double var1) {
      this.field2065 = var1;
      this.method1083();
   }

   @ObfInfo(
      owner = "ht",
      name = "v",
      desc = "(II)[I"
   )
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

   @ObfInfo(
      owner = "ht",
      name = "x",
      desc = "(IB)I"
   )
   public int method1496(int var1) {
      return this.field2066[var1] != null ? this.field2066[var1].field165 : 0;
   }

   @ObfInfo(
      owner = "ht",
      name = "m",
      desc = "(II)Z"
   )
   public boolean method1494(int var1) {
      return this.field2066[var1].field170;
   }

   @ObfInfo(
      owner = "ht",
      name = "q",
      desc = "(II)Z"
   )
   public boolean method1493(int var1) {
      return this.field2063 == 64;
   }

   @ObfInfo(
      owner = "ht",
      name = "f",
      desc = "(I)V"
   )
   public void method1083() {
      for(int var2 = 0; var2 < this.field2066.length; ++var2) {
         if (null != this.field2066[var2]) {
            this.field2066[var2].method134();
         }
      }

      this.field2062 = new class141();
      this.field2064 = this.field2067;
   }

   @ObfInfo(
      owner = "ht",
      name = "r",
      desc = "(IB)V"
   )
   public void method1090(int var1) {
      for(int var3 = 0; var3 < this.field2066.length; ++var3) {
         class29 var4 = this.field2066[var3];
         if (var4 != null && var4.field164 != 0 && var4.field172) {
            var4.method132(var1);
            var4.field172 = false;
         }
      }

   }

   @ObfInfo(
      owner = "ht",
      name = "lb",
      desc = "(I)Z"
   )
   static boolean method1091() {
      return client.field380;
   }
}
