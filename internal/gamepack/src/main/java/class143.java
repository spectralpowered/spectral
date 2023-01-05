import java.io.File;
import java.util.Date;

public class class143 {
   public static class443 field1545 = null;
   public static class443 field1546 = null;
   public static class443 field1548 = null;
   public static class443[] field1549;
   static File field1547;

   public static String method777(long var0) {
      class480.field3981.setTime(new Date(var0));
      int var2 = class480.field3981.get(7);
      int var3 = class480.field3981.get(5);
      int var4 = class480.field3981.get(2);
      int var5 = class480.field3981.get(1);
      int var6 = class480.field3981.get(11);
      int var7 = class480.field3981.get(12);
      int var8 = class480.field3981.get(13);
      return class480.field3983[var2 - 1] + ", " + var3 / 10 + var3 % 10 + "-" + class480.field3982[0][var4] + "-" + var5 + " " + var6 / 10 + var6 % 10 + ":" + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + " GMT";
   }

   public static class194 method776(int var0) {
      return var0 >= 0 && var0 < class194.field2013.length && class194.field2013[var0] != null ? class194.field2013[var0] : new class194(var0);
   }

   public static int method778(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + class291.method1369(var0.charAt(var4));
      }

      return var3;
   }
}
