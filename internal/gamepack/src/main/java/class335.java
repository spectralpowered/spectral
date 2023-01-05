import java.util.concurrent.Callable;

public class class335 implements Callable {
   static class319 field3107;

   public Object call() {
      return class214.method1118();
   }

   static class405 method1618(int var0) {
      class405 var2 = (class405)class79.field901.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         class164 var4 = class79.field899;
         class164 var5 = class140.field1509;
         boolean var6 = true;
         int[] var7 = var4.method878(var0);

         for(int var8 = 0; var8 < var7.length; ++var8) {
            byte[] var9 = var4.method875(var0, var7[var8]);
            if (null == var9) {
               var6 = false;
            } else {
               int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
               byte[] var11 = var5.method875(var10, 0);
               if (var11 == null) {
                  var6 = false;
               }
            }
         }

         class405 var3;
         if (!var6) {
            var3 = null;
         } else {
            try {
               var3 = new class405(var4, var5, var0, false);
            } catch (Exception var12) {
               var3 = null;
            }
         }

         if (var3 != null) {
            class79.field901.method163(var3, (long)var0);
         }

         return var3;
      }
   }
}
