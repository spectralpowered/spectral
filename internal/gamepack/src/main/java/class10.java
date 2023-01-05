import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

@ObfInfo(
   name = "mr"
)
public class class10 implements class78 {
   @ObfInfo(
      owner = "mr",
      name = "k",
      desc = "Lqy;"
   )
   public static class127 field44;
   @ObfInfo(
      owner = "mr",
      name = "bo",
      desc = "Llz;"
   )
   static class353 field56;
   @ObfInfo(
      owner = "mr",
      name = "ix",
      desc = "I"
   )
   static int field52;
   @ObfInfo(
      owner = "mr",
      name = "e",
      desc = "Lmr;"
   )
   static final class10 field41;
   @ObfInfo(
      owner = "mr",
      name = "x",
      desc = "Lmr;"
   )
   static final class10 field42;
   @ObfInfo(
      owner = "mr",
      name = "v",
      desc = "Lmr;"
   )
   static final class10 field43;
   @ObfInfo(
      owner = "mr",
      name = "m",
      desc = "Lmr;"
   )
   static final class10 field45;
   @ObfInfo(
      owner = "mr",
      name = "q",
      desc = "Lmr;"
   )
   static final class10 field46;
   @ObfInfo(
      owner = "mr",
      name = "i",
      desc = "Lmr;"
   )
   static final class10 field47;
   @ObfInfo(
      owner = "mr",
      name = "r",
      desc = "Lmr;"
   )
   static final class10 field48;
   @ObfInfo(
      owner = "mr",
      name = "u",
      desc = "Lmr;"
   )
   static final class10 field49;
   @ObfInfo(
      owner = "mr",
      name = "b",
      desc = "Lmr;"
   )
   static final class10 field50;
   @ObfInfo(
      owner = "mr",
      name = "j",
      desc = "Lmr;"
   )
   static final class10 field51;
   @ObfInfo(
      owner = "mr",
      name = "f",
      desc = "Lmr;"
   )
   static final class10 field55;
   @ObfInfo(
      owner = "mr",
      name = "g",
      desc = "Lmr;"
   )
   static final class10 field57;
   @ObfInfo(
      owner = "mr",
      name = "h",
      desc = "Lmr;"
   )
   static final class10 field58;
   @ObfInfo(
      owner = "mr",
      name = "o",
      desc = "I"
   )
   final int field53;
   @ObfInfo(
      owner = "mr",
      name = "n",
      desc = "Ljava/util/Set;"
   )
   final Set field54 = new HashSet();

   static {
      field58 = new class10("", 0, new class206[]{class206.field1782});
      field41 = new class10("", 1, new class206[]{class206.field1780, class206.field1782});
      field43 = new class10("", 2, new class206[]{class206.field1780, class206.field1781, class206.field1782});
      field42 = new class10("", 3, new class206[]{class206.field1780});
      field45 = new class10("", 4);
      field46 = new class10("", 5, new class206[]{class206.field1780, class206.field1782});
      field55 = new class10("", 6, new class206[]{class206.field1782});
      field48 = new class10("", 8, new class206[]{class206.field1780, class206.field1782});
      field49 = new class10("", 9, new class206[]{class206.field1780, class206.field1781});
      field50 = new class10("", 10, new class206[]{class206.field1780});
      field51 = new class10("", 11, new class206[]{class206.field1780});
      field57 = new class10("", 12, new class206[]{class206.field1780, class206.field1782});
      field47 = new class10("", 13, new class206[]{class206.field1780});
   }

   @ObfInfo(
      owner = "mr",
      name = "<init>",
      desc = "(Ljava/lang/String;I)V"
   )
   class10(String var1, int var2) {
      this.field53 = var2;
   }

   @ObfInfo(
      owner = "mr",
      name = "<init>",
      desc = "(Ljava/lang/String;I[Lmk;)V"
   )
   class10(String var1, int var2, class206[] var3) {
      this.field53 = var2;
      class206[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class206 var6 = var4[var5];
         this.field54.add(var6);
      }

   }

   @ObfInfo(
      owner = "mr",
      name = "e",
      desc = "(B)I"
   )
   public int method330() {
      return this.field53;
   }

   @ObfInfo(
      owner = "mr",
      name = "h",
      desc = "(Ljava/lang/String;ZZB)V"
   )
   public static void method62(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if (class128.field1074.startsWith("win") && !var2) {
            class286.method1418(var0, 0);
         } else if (class128.field1074.startsWith("mac")) {
            class121.method513(var0, 1, "openjs");
         } else {
            class286.method1418(var0, 2);
         }
      } else {
         class286.method1418(var0, 3);
      }

   }

   @ObfInfo(
      owner = "mr",
      name = "e",
      desc = "(J)Ljava/lang/String;"
   )
   public static String method61(long var0) {
      if (var0 > 0L && var0 < 6582952005840035281L) {
         if (var0 % 37L == 0L) {
            return null;
         } else {
            int var2 = 0;

            for(long var3 = var0; var3 != 0L; var3 /= 37L) {
               ++var2;
            }

            StringBuilder var5;
            char var8;
            for(var5 = new StringBuilder(var2); var0 != 0L; var5.append(var8)) {
               long var6 = var0;
               var0 /= 37L;
               var8 = class417.field3429[(int)(var6 - var0 * 37L)];
               if (var8 == '_') {
                  int var9 = var5.length() - 1;
                  var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
                  var8 = 160;
               }
            }

            var5.reverse();
            var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
            return var5.toString();
         }
      } else {
         return null;
      }
   }

   @ObfInfo(
      owner = "mr",
      name = "gt",
      desc = "(I)V"
   )
   static final void method60() {
      class312.method1505();
      class313.field2470.method395();
      class241.method1049();
      class87.field707.method395();
      class87.field736.method395();
      class87.field709.method395();
      class87.field710.method395();
      class77.method329();
      class263.field2188.method395();
      class263.field2143.method395();
      class263.field2144.method395();
      class242.field2029.method395();
      class242.field2030.method395();
      class242.field2042.method395();
      class283.method1396();
      class457.field3779.method395();
      class241.method1050();
      class15.field74.method2235();
      class189.field1706.method2235();
      class265.method1218();
      class173.method800();
      class424.method2071();
      class398.method1966();
      class396.field3314.method395();
      class106.field818.method395();
      class14.method70();
      client.field437.method395();
      client.field512.method395();
      class189.method855();
      class265.method1217();
      ((class251)class341.field2728).method1083();
      class461.field3821.method395();
      client.field284.method1099();
      class431.field3575.method1366();
      class374.field3179.method1366();
      class313.field2473.method1366();
      class303.field2437.method1366();
      class440.field3648.method1366();
      class317.field2494.method1366();
      class16.field82.method1366();
      class446.field3678.method1366();
      class298.field2397.method1366();
      class49.field570.method1366();
      class32.field176.method1366();
      class329.field2596.method1366();
      class187.field1697.method1366();
   }
}
