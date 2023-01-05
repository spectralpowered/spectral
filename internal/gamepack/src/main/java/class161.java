import java.io.File;
import java.io.IOException;

@ObfInfo(
   name = "cp"
)
public class class161 implements class78 {
   @ObfInfo(
      owner = "cp",
      name = "cw",
      desc = "[Lra;"
   )
   static class344[] field1229;
   @ObfInfo(
      owner = "cp",
      name = "py",
      desc = "I"
   )
   static int field1220;
   @ObfInfo(
      owner = "cp",
      name = "u",
      desc = "I"
   )
   static int field1227;
   @ObfInfo(
      owner = "cp",
      name = "e",
      desc = "Lcp;"
   )
   static final class161 field1221 = new class161(1, 2);
   @ObfInfo(
      owner = "cp",
      name = "x",
      desc = "Lcp;"
   )
   static final class161 field1222 = new class161(3, 4);
   @ObfInfo(
      owner = "cp",
      name = "m",
      desc = "Lcp;"
   )
   static final class161 field1223 = new class161(4, 5);
   @ObfInfo(
      owner = "cp",
      name = "h",
      desc = "Lcp;"
   )
   static final class161 field1224 = new class161(0, -1);
   @ObfInfo(
      owner = "cp",
      name = "q",
      desc = "Lcp;"
   )
   static final class161 field1228 = new class161(5, 6);
   @ObfInfo(
      owner = "cp",
      name = "v",
      desc = "Lcp;"
   )
   static final class161 field1230 = new class161(2, 3);
   @ObfInfo(
      owner = "cp",
      name = "f",
      desc = "I"
   )
   final int field1225;
   @ObfInfo(
      owner = "cp",
      name = "r",
      desc = "I"
   )
   final int field1226;

   @ObfInfo(
      owner = "cp",
      name = "<init>",
      desc = "(II)V"
   )
   class161(int var1, int var2) {
      this.field1225 = var1;
      this.field1226 = var2;
   }

   @ObfInfo(
      owner = "cp",
      name = "e",
      desc = "(B)I"
   )
   public int method330() {
      return this.field1226;
   }

   @ObfInfo(
      owner = "cp",
      name = "h",
      desc = "(IB)Z"
   )
   public static boolean method739(int var0) {
      return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
   }

   @ObfInfo(
      owner = "cp",
      name = "e",
      desc = "(II)Lgo;"
   )
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

   @ObfInfo(
      owner = "cp",
      name = "x",
      desc = "(Ljava/lang/String;Ljava/lang/String;ZI)Lqq;"
   )
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
