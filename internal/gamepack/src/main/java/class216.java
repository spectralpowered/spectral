public class class216 {
   boolean field2407;
   int field2406;
   int field2408;
   int field2409;
   int field2410;
   int field2411;
   int field2412 = 0;
   int field2413;
   int field2414 = 0;
   int field2415;
   int field2416;
   int field2417;
   int field2418;

   public void method1125(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      this.field2408 = var1;
      this.field2415 = var2;
      this.field2409 = var3;
      this.field2410 = var4;
      this.field2406 = var5;
      this.field2413 = var6;
      this.field2414 = var9;
      this.field2412 = var10;
      this.field2407 = var11;
   }

   public void method1124(int var1, int var2, int var3, int var4) {
      this.field2411 = var1;
      this.field2416 = var2;
      this.field2417 = var3;
      this.field2418 = var4;
   }

   public void method1123(class202 var1, class394 var2) {
      if (null != var2) {
         int var4 = var2.field999;
         int var5 = Math.min(this.field2410, (int)(0.9F * (float)var4));
         int var6 = this.field2408 - this.field2406;
         int var7 = this.field2415 - this.field2413 + var4;
         class362.method1732(this.field2408, this.field2415, this.field2409 + this.field2408, this.field2415 + this.field2410);
         int var8 = this.field2412;
         int var9 = this.field2414;
         if (var8 > var9) {
            int var10 = var8;
            var8 = var9;
            var9 = var10;
         }

         class424 var20 = var1.method1041(0, var8);
         class424 var11 = var1.method1041(var8, var9);
         class424 var12 = var1.method1041(var9, var1.method1020());
         class424 var13 = var1.method1041(0, this.field2414);
         int var15;
         int var17;
         if (!var11.method2031()) {
            int var14 = var2.field1009 + var2.field998;

            for(var15 = 0; var15 < var11.method2035(); ++var15) {
               class314 var16 = var11.method2034(var15);
               var17 = var16.field2984 + var6;
               int var18 = var2.method513(var16.field2982);
               int var19 = var16.field2983 + var7 - var4;
               class362.method1739(var17, var19, var18, var14, this.field2418);
            }
         }

         if (!var20.method2031()) {
            var2.method522(var20, var6, var7, this.field2411, this.field2416, -1);
         }

         if (!var11.method2031()) {
            var2.method522(var11, var6, var7, this.field2417, this.field2416, -1);
         }

         if (!var12.method2031()) {
            var2.method522(var12, var6, var7, this.field2411, this.field2416, -1);
         }

         if (this.field2407) {
            class28 var21 = var13.method2033();
            var15 = var6 + ((Integer)var21.field225).intValue();
            int var22 = var7 + ((Integer)var21.field224).intValue();
            var17 = var22 - var5;
            class362.method1749(var15, var22, var15, var17, this.field2411);
            if (-1 != this.field2416) {
               class362.method1749(var15 + 1, var22 + 1, var15 + 1, var17 + 1, this.field2416);
            }
         }

      }
   }
}
