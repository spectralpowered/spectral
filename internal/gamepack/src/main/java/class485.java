@ObfInfo(
   name = "lm"
)
public class class485 {
   @ObfInfo(
      owner = "lm",
      name = "m",
      desc = "(Ldu;FFFFFFFFI)V"
   )
   static void method2378(class84 var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      if (null != var0) {
         var0.field680 = var1;
         float var10 = var4 - var1;
         float var11 = var8 - var5;
         float var12 = var2 - var1;
         float var13 = 0.0F;
         float var14 = 0.0F;
         if (0.0D != (double)var12) {
            var13 = (var6 - var5) / var12;
         }

         var12 = var4 - var3;
         if ((double)var12 != 0.0D) {
            var14 = (var8 - var7) / var12;
         }

         float var15 = 1.0F / (var10 * var10);
         float var16 = var13 * var10;
         float var17 = var14 * var10;
         var0.field682 = (var17 + var16 - var11 - var11) * var15 / var10;
         var0.field696 = var15 * (var11 + var11 + var11 - var16 - var16 - var17);
         var0.field674 = var13;
         var0.field685 = var5;
      }
   }
}
