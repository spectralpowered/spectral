public final class class394 extends class93 {
   public class394(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   public class394(byte[] var1) {
      super(var1);
   }

   final void method528(byte[] var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var2 + var3 * class362.field3242;
      int var8 = class362.field3242 - var4;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if (var3 < class362.field3244) {
         var11 = class362.field3244 - var3;
         var5 -= var11;
         var3 = class362.field3244;
         var10 += var11 * var4;
         var7 += var11 * class362.field3242;
      }

      if (var3 + var5 > class362.field3245) {
         var5 -= var3 + var5 - class362.field3245;
      }

      if (var2 < class362.field3246) {
         var11 = class362.field3246 - var2;
         var4 -= var11;
         var2 = class362.field3246;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if (var2 + var4 > class362.field3247) {
         var11 = var2 + var4 - class362.field3247;
         var4 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if (var4 > 0 && var5 > 0) {
         method531(class362.field3243, var1, var6, var10, var7, var4, var5, var8, var9);
      }
   }

   final void method529(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var2 + var3 * class362.field3242;
      int var9 = class362.field3242 - var4;
      int var10 = 0;
      int var11 = 0;
      int var12;
      if (var3 < class362.field3244) {
         var12 = class362.field3244 - var3;
         var5 -= var12;
         var3 = class362.field3244;
         var11 += var12 * var4;
         var8 += var12 * class362.field3242;
      }

      if (var3 + var5 > class362.field3245) {
         var5 -= var3 + var5 - class362.field3245;
      }

      if (var2 < class362.field3246) {
         var12 = class362.field3246 - var2;
         var4 -= var12;
         var2 = class362.field3246;
         var11 += var12;
         var8 += var12;
         var10 += var12;
         var9 += var12;
      }

      if (var2 + var4 > class362.field3247) {
         var12 = var2 + var4 - class362.field3247;
         var4 -= var12;
         var10 += var12;
         var9 += var12;
      }

      if (var4 > 0 && var5 > 0) {
         method536(class362.field3243, var1, var6, var11, var8, var4, var5, var9, var10, var7);
      }
   }
}
