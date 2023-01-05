import java.io.File;
import java.util.Date;

@ObfInfo(
   name = "fg"
)
public class class25 {
   @ObfInfo(
      owner = "fg",
      name = "i",
      desc = "Lqa;"
   )
   public static class435 field112 = null;
   @ObfInfo(
      owner = "fg",
      name = "o",
      desc = "Lqa;"
   )
   public static class435 field113 = null;
   @ObfInfo(
      owner = "fg",
      name = "g",
      desc = "Lqa;"
   )
   public static class435 field115 = null;
   @ObfInfo(
      owner = "fg",
      name = "n",
      desc = "[Lqa;"
   )
   public static class435[] field116;
   @ObfInfo(
      owner = "fg",
      name = "x",
      desc = "Ljava/io/File;"
   )
   static File field114;

   @ObfInfo(
      owner = "fg",
      name = "h",
      desc = "(J)Ljava/lang/String;"
   )
   public static String method101(long var0) {
      class482.field4019.setTime(new Date(var0));
      int var2 = class482.field4019.get(7);
      int var3 = class482.field4019.get(5);
      int var4 = class482.field4019.get(2);
      int var5 = class482.field4019.get(1);
      int var6 = class482.field4019.get(11);
      int var7 = class482.field4019.get(12);
      int var8 = class482.field4019.get(13);
      return class482.field4021[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + class482.field4020[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   @ObfInfo(
      owner = "fg",
      name = "h",
      desc = "(II)Lfm;"
   )
   public static class396 method100(int var0) {
      return var0 >= 0 && var0 < class396.field3312.length && class396.field3312[var0] != null ? class396.field3312[var0] : new class396(var0);
   }

   @ObfInfo(
      owner = "fg",
      name = "u",
      desc = "(Ljava/lang/CharSequence;B)I"
   )
   public static int method102(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + class72.method315(var0.charAt(var4));
      }

      return var3;
   }
}
