import java.io.File;
import java.io.IOException;

public class class161 implements class78 {
   static class344[] field1229;
   static int field1220;
   static int field1227;
   static final class161 field1221 = new class161(1, 2);
   static final class161 field1222 = new class161(3, 4);
   static final class161 field1223 = new class161(4, 5);
   static final class161 field1224 = new class161(0, -1);
   static final class161 field1228 = new class161(5, 6);
   static final class161 field1230 = new class161(2, 3);
   final int field1225;
   final int field1226;

   class161(int var1, int var2) {
      this.field1225 = var1;
      this.field1226 = var2;
   }

   public int method330() {
      return this.field1226;
   }

   public static boolean method739(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   public static class236 method738(int var0) {
      class236 var2 = (class236)class236.field2002.method394((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class209.field1815.method1365(8, var0);
         var2 = new class236();
         if (var3 != null) {
            var2.method1026(new class127(var3));
         }

         class236.field2002.method396(var2, (long)var0);
         return var2;
      }
   }

   public static class455 method737(String var0, String var1, boolean var2) {
      File var4 = new File(class228.field1934, "preferences" + var0 + ".dat");
      if (var4.exists()) {
         try {
            class455 var11 = new class455(var4, "rw", 10000L);
            return var11;
         } catch (IOException var10) {
            ;
         }
      }

      String var5 = "";
      if (class41.field217 == 33) {
         var5 = "_rc";
      } else if (class41.field217 == 34) {
         var5 = "_wip";
      }

      File var6 = new File(class134.field1109, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
      class455 var7;
      if (!var2 && var6.exists()) {
         try {
            var7 = new class455(var6, "rw", 10000L);
            return var7;
         } catch (IOException var9) {
            ;
         }
      }

      try {
         var7 = new class455(var4, "rw", 10000L);
         return var7;
      } catch (IOException var8) {
         throw new RuntimeException();
      }
   }
}
