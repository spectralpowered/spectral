import java.io.IOException;

public abstract class class160 {
   public abstract boolean method735(int var1) throws IOException;

   public abstract int method730(byte[] var1, int var2, int var3) throws IOException;

   public abstract int method732() throws IOException;

   public abstract int method733() throws IOException;

   public abstract void method731(byte[] var1, int var2, int var3) throws IOException;

   public abstract void method734();

   public static class164 method736(int var0) {
      class164 var2 = (class164)class164.field1240.method394((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class164.field1239.method1365(3, var0);
         var2 = new class164();
         if (var3 != null) {
            var2.method768(new class127(var3));
         }

         class164.field1240.method396(var2, (long)var0);
         return var2;
      }
   }
}
