import java.io.File;
import java.io.RandomAccessFile;

@ObfInfo(
   name = "kf"
)
public class class328 {
   @ObfInfo(
      owner = "kf",
      name = "f",
      desc = "Lly;"
   )
   static class274 field2595;

   @ObfInfo(
      owner = "kf",
      name = "e",
      desc = "(Ljava/lang/String;I)Ljava/io/File;"
   )
   public static File method1668(String var0) {
      if (!class229.field1936) {
         throw new RuntimeException("");
      } else {
         File var2 = (File)class229.field1938.get(var0);
         if (null != var2) {
            return var2;
         } else {
            File var3 = new File(class229.field1937, var0);
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
                  class229.field1938.put(var0, var3);
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

   @ObfInfo(
      owner = "kf",
      name = "lj",
      desc = "(Lkd;I)Lkd;"
   )
   static class120 method1669(class120 var0) {
      class120 var3 = var0;
      int var5 = class203.method892(var0);
      int var4 = var5 >> 17 & 7;
      int var6 = var4;
      class120 var2;
      if (var4 == 0) {
         var2 = null;
      } else {
         int var7 = 0;

         while(true) {
            if (var7 >= var6) {
               var2 = var3;
               break;
            }

            var3 = class67.method299(var3.field912);
            if (null == var3) {
               var2 = null;
               break;
            }

            ++var7;
         }
      }

      class120 var8 = var2;
      if (null == var2) {
         var8 = var0.field979;
      }

      return var8;
   }
}
