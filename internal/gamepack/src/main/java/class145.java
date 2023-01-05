import java.io.File;
import java.io.IOException;

public class class145 extends class392 {
   final boolean field1159;

   public class145(boolean var1) {
      this.field1159 = var1;
   }

   int method690(class69 var1, class69 var2) {
      if (0 != var1.field627 && 0 != var2.field627) {
         return this.field1159 ? var1.field629 - var2.field629 : var2.field629 - var1.field629;
      } else {
         return this.method1918(var1, var2);
      }
   }

   public int compare(Object var1, Object var2) {
      return this.method690((class69)var1, (class69)var2);
   }

   static boolean method692(int var0, int var1) {
      return var0 != 4 || var1 < 8;
   }

   static void method691(File var0, File var1) {
      try {
         class455 var3 = new class455(class25.field114, "rw", 10000L);
         class127 var4 = new class127(500);
         var4.method544(3);
         var4.method544(null != var1 ? 1 : 0);
         var4.method539(var0.getPath());
         if (null != var1) {
            var4.method539("");
         }

         var3.method2247(var4.field1072, 0, var4.field1070);
         var3.method2248();
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }
}
