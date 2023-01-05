import java.io.File;
import java.io.IOException;

public class class188 implements class445 {
   static class161[] field1991;
   static int field1982;
   static int field1989;
   static final class188 field1983 = new class188(1, 2);
   static final class188 field1984 = new class188(3, 4);
   static final class188 field1985 = new class188(4, 5);
   static final class188 field1986 = new class188(0, -1);
   static final class188 field1990 = new class188(5, 6);
   static final class188 field1992 = new class188(2, 3);
   final int field1987;
   final int field1988;

   class188(int var1, int var2) {
      this.field1987 = var1;
      this.field1988 = var2;
   }

   public int method2118() {
      return this.field1988;
   }

   public static boolean method978(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   public static class438 method977(int var0) {
      class438 var2 = (class438)class438.field3629.method161((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class198.field2038.method892(8, var0);
         var2 = new class438();
         if (var3 != null) {
            var2.method2090(new class134(var3));
         }

         class438.field3629.method163(var2, (long)var0);
         return var2;
      }
   }

   public static class476 method976(String var0, String var1, boolean var2) {
      File var4 = new File(class103.field1351, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            class476 var11 = new class476(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
            ;
         }
      }

      String var5 = "";
      if (class451.field3707 == 33) {
         var5 = "_rc";
      } else if (class451.field3707 == 34) {
         var5 = "_wip";
      }

      File var6 = new File(class131.field1474, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class476 var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new class476(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
            ;
         }
      }

      try {
         var7 = new class476(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }
}
