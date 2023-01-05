@ObfInfo(
   name = "rd"
)
public class class354 {
   @ObfInfo(
      owner = "rd",
      name = "b",
      desc = "Z"
   )
   boolean field2905;
   @ObfInfo(
      owner = "rd",
      name = "q",
      desc = "I"
   )
   int field2904;
   @ObfInfo(
      owner = "rd",
      name = "e",
      desc = "I"
   )
   int field2906;
   @ObfInfo(
      owner = "rd",
      name = "x",
      desc = "I"
   )
   int field2907;
   @ObfInfo(
      owner = "rd",
      name = "m",
      desc = "I"
   )
   int field2908;
   @ObfInfo(
      owner = "rd",
      name = "j",
      desc = "I"
   )
   int field2909;
   @ObfInfo(
      owner = "rd",
      name = "u",
      desc = "I"
   )
   int field2910 = 0;
   @ObfInfo(
      owner = "rd",
      name = "f",
      desc = "I"
   )
   int field2911;
   @ObfInfo(
      owner = "rd",
      name = "r",
      desc = "I"
   )
   int field2912 = 0;
   @ObfInfo(
      owner = "rd",
      name = "v",
      desc = "I"
   )
   int field2913;
   @ObfInfo(
      owner = "rd",
      name = "g",
      desc = "I"
   )
   int field2914;
   @ObfInfo(
      owner = "rd",
      name = "i",
      desc = "I"
   )
   int field2915;
   @ObfInfo(
      owner = "rd",
      name = "o",
      desc = "I"
   )
   int field2916;

   @ObfInfo(
      owner = "rd",
      name = "h",
      desc = "(IIIIIIIIIIZI)V"
   )
   public void method1773(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, boolean var11) {
      this.field2906 = var1;
      this.field2913 = var2;
      this.field2907 = var3;
      this.field2908 = var4;
      this.field2904 = var5;
      this.field2911 = var6;
      this.field2912 = var9;
      this.field2910 = var10;
      this.field2905 = var11;
   }

   @ObfInfo(
      owner = "rd",
      name = "e",
      desc = "(IIIII)V"
   )
   public void method1772(int var1, int var2, int var3, int var4) {
      this.field2909 = var1;
      this.field2914 = var2;
      this.field2915 = var3;
      this.field2916 = var4;
   }

   @ObfInfo(
      owner = "rd",
      name = "v",
      desc = "(Lnu;Lnv;B)V"
   )
   public void method1771(class321 var1, class58 var2) {
      if (null != var2) {
         int var4 = var2.field3442;
         int var5 = Math.min(this.field2908, (int)(0.9F * (float)var4));
         int var6 = this.field2906 - this.field2904;
         int var7 = this.field2913 - this.field2911 + var4;
         class162.method742(this.field2906, this.field2913, this.field2907 + this.field2906, this.field2913 + this.field2908);
         int var8 = this.field2910;
         int var9 = this.field2912;
         if (var8 > var9) {
            int var10 = var8;
            var8 = var9;
            var9 = var10;
         }

         class239 var20 = var1.method1641(0, var8);
         class239 var11 = var1.method1641(var8, var9);
         class239 var12 = var1.method1641(var9, var1.method1620());
         class239 var13 = var1.method1641(0, this.field2912);
         int var15;
         int var17;
         if (!var11.method1035()) {
            int var14 = var2.field3452 + var2.field3441;

            for(var15 = 0; var15 < var11.method1039(); ++var15) {
               class45 var16 = var11.method1038(var15);
               var17 = var16.field546 + var6;
               int var18 = var2.method2020(var16.field544);
               int var19 = var16.field545 + var7 - var4;
               class162.method749(var17, var19, var18, var14, this.field2916);
            }
         }

         if (!var20.method1035()) {
            var2.method2029(var20, var6, var7, this.field2909, this.field2914, -1);
         }

         if (!var11.method1035()) {
            var2.method2029(var11, var6, var7, this.field2915, this.field2914, -1);
         }

         if (!var12.method1035()) {
            var2.method2029(var12, var6, var7, this.field2909, this.field2914, -1);
         }

         if (this.field2905) {
            class296 var21 = var13.method1037();
            var15 = var6 + ((Integer)var21.field2392).intValue();
            int var22 = var7 + ((Integer)var21.field2391).intValue();
            var17 = var22 - var5;
            class162.method759(var15, var22, var15, var17, this.field2909);
            if (-1 != this.field2914) {
               class162.method759(var15 + 1, var22 + 1, var15 + 1, var17 + 1, this.field2914);
            }
         }

      }
   }
}
