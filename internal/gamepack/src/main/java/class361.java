public class class361 {
   static {
      Math.sqrt(8192.0D);
   }

   public static double method1798(double var0, double var2, double var4) {
      double var8 = (var0 - var2) / var4;
      double var6 = Math.exp(-var8 * var8 / 2.0D) / Math.sqrt(6.283185307179586D);
      return var6 / var4;
   }

   static int method1799(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var4 = false;
         boolean var5 = false;
         int var6 = 0;
         int var7 = var0.length();

         for(int var8 = 0; var8 < var7; ++var8) {
            char var9 = var0.charAt(var8);
            if (var8 == 0) {
               if (var9 == '-') {
                  var4 = true;
                  continue;
               }

               if (var9 == '+' && var2) {
                  continue;
               }
            }

            int var11;
            if (var9 >= '0' && var9 <= '9') {
               var11 = var9 - 48;
            } else if (var9 >= 'A' && var9 <= 'Z') {
               var11 = var9 - 55;
            } else {
               if (var9 < 'a' || var9 > 'z') {
                  throw new NumberFormatException();
               }

               var11 = var9 - 87;
            }

            if (var11 >= var1) {
               throw new NumberFormatException();
            }

            if (var4) {
               var11 = -var11;
            }

            int var10 = var11 + var1 * var6;
            if (var10 / var1 != var6) {
               throw new NumberFormatException();
            }

            var6 = var10;
            var5 = true;
         }

         if (!var5) {
            throw new NumberFormatException();
         } else {
            return var6;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
