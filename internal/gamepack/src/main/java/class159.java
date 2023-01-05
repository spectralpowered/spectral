import java.io.IOException;

@ObfInfo(
   name = "ls"
)
public class class159 {
   @ObfInfo(
      owner = "ls",
      name = "e",
      desc = "Lls;"
   )
   static final class159 field1216 = new class159(25, 28, 800, 656, 40, 40);
   @ObfInfo(
      owner = "ls",
      name = "h",
      desc = "Lls;"
   )
   static final class159 field1219 = new class159(51, 27, 800, 0, 16, 16);
   @ObfInfo(
      owner = "ls",
      name = "v",
      desc = "I"
   )
   final int field1217;
   @ObfInfo(
      owner = "ls",
      name = "x",
      desc = "I"
   )
   final int field1218;

   @ObfInfo(
      owner = "ls",
      name = "<init>",
      desc = "(IIIIII)V"
   )
   class159(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.field1217 = var5;
      this.field1218 = var6;
   }

   @ObfInfo(
      owner = "ls",
      name = "q",
      desc = "(I)V"
   )
   static void method729() {
      class100.field792.clear();
      class100.field795.method1894();
      class100.field793.method2359();
      class100.field794 = 0;
   }

   @ObfInfo(
      owner = "ls",
      name = "v",
      desc = "(S)Lch;"
   )
   static class446 method728() {
      class455 var1 = null;
      class446 var2 = new class446();

      try {
         var1 = class161.method737("", class41.field210.field4117, false);
         byte[] var3 = new byte[(int)var1.method2251()];

         int var5;
         for(int var4 = 0; var4 < var3.length; var4 += var5) {
            var5 = var1.method2250(var3, var4, var3.length - var4);
            if (var5 == -1) {
               throw new IOException();
            }
         }

         var2 = new class446(new class127(var3));
      } catch (Exception var7) {
         ;
      }

      try {
         if (var1 != null) {
            var1.method2248();
         }
      } catch (Exception var6) {
         ;
      }

      return var2;
   }
}
