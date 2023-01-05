import java.io.File;
import java.io.RandomAccessFile;

public class class61 {
   static class164 field819;

   public static File method339(String var0) {
      if (!class51.field751) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)class51.field753.get(var0);
         if (null != var2) {
            return var2;
         } else {
            File var3 = new File(class51.field752, var0);
            RandomAccessFile var4 = null;

            try {
               File var5 = new File(var3.getParent());
               if (!var5.exists()) {
                  throw new RuntimeException("");
               } else {
                  var4 = new RandomAccessFile(var3, "rw");
                  int var6 = var4.read();
                  var4.seek(0L);
                  var4.write(var6);
                  var4.seek(0L);
                  var4.close();
                  class51.field753.put(var0, var3);
                  return var3;
               }
            } catch (Exception var8) {
               try {
                  if (null != var4) {
                     var4.close();
                     var4 = null;
                  }
               } catch (Exception var7) {
                  ;
               }

               throw new RuntimeException();
            }
         }
      }
   }

   static class210 method340(class210 var0) {
      class210 var3 = var0;
      int var5 = class172.method913(var0);
      int var4 = var5 >> 17 & 7;
      int var6 = var4;
      class210 var2;
      if (var4 == 0) {
         var2 = null;
      } else {
         int var7 = 0;

         while(true) {
            if (var7 >= var6) {
               var2 = var3;
               break;
            }

            var3 = class274.method1301(var3.field2234);
            if (null == var3) {
               var2 = null;
               break;
            }

            ++var7;
         }
      }

      class210 var8 = var2;
      if (null == var2) {
         var8 = var0.field2301;
      }

      return var8;
   }
}
