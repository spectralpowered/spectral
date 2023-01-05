import java.io.File;
import java.io.IOException;

public class class264 extends class305 {
   final boolean field2687;

   public class264(boolean var1) {
      this.field2687 = var1;
   }

   int method1260(class185 var1, class185 var2) {
      if (0 != var1.field1978 && 0 != var2.field1978) {
         return this.field2687 ? var1.field1980 - var2.field1980 : var2.field1980 - var1.field1980;
      } else {
         return this.method1440(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method1260((class185)var1, (class185)var2);
   }

   static boolean method1262(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   static void method1261(File var0, File var1) {
      try {
         class476 var3 = new class476(class143.field1547, "rw", 10000L);
         class134 var4 = new class134(500);
         var4.method666(3);
         var4.method666(null != var1 ? 1 : 0);
         var4.method661(var0.getPath());
         if (null != var1) {
            var4.method661("");
         }

         var3.method2301(var4.field1489, 0, var4.field1487);
         var3.method2302();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }
}
