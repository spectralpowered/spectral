import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

public class class213 implements class445 {
   public static class134 field2384;
   static class121 field2396;
   static int field2392;
   static final class213 field2381;
   static final class213 field2382;
   static final class213 field2383;
   static final class213 field2385;
   static final class213 field2386;
   static final class213 field2387;
   static final class213 field2388;
   static final class213 field2389;
   static final class213 field2390;
   static final class213 field2391;
   static final class213 field2395;
   static final class213 field2397;
   static final class213 field2398;
   final int field2393;
   final Set field2394 = new HashSet();

   static {
      field2398 = new class213("", 0, new class193[]{class193.field2011});
      field2381 = new class213("", 1, new class193[]{class193.field2009, class193.field2011});
      field2383 = new class213("", 2, new class193[]{class193.field2009, class193.field2010, class193.field2011});
      field2382 = new class213("", 3, new class193[]{class193.field2009});
      field2385 = new class213("", 4);
      field2386 = new class213("", 5, new class193[]{class193.field2009, class193.field2011});
      field2395 = new class213("", 6, new class193[]{class193.field2011});
      field2388 = new class213("", 8, new class193[]{class193.field2009, class193.field2011});
      field2389 = new class213("", 9, new class193[]{class193.field2009, class193.field2010});
      field2390 = new class213("", 10, new class193[]{class193.field2009});
      field2391 = new class213("", 11, new class193[]{class193.field2009});
      field2397 = new class213("", 12, new class193[]{class193.field2009, class193.field2011});
      field2387 = new class213("", 13, new class193[]{class193.field2009});
   }

   class213(String var1, int var2) {
      this.field2393 = var2;
   }

   class213(String var1, int var2, class193[] var3) {
      this.field2393 = var2;
      class193[] var4 = var3;

      for(int var5 = 0; var5 < var4.length; ++var5) {
         class193 var6 = var4[var5];
         this.field2394.add(var6);
      }

   }

   public int method2118() {
      return this.field2393;
   }

   public static void method1115(String var0, boolean var1, boolean var2) {
      if (var1) {
         if (!var2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
            try {
               Desktop.getDesktop().browse(new URI(var0));
               return;
            } catch (Exception var5) {
               ;
            }
         }

         if (class363.field3249.startsWith("win") && !var2) {
            class324.method1568(var0, 0);
         } else if (class363.field3249.startsWith("mac")) {
            class132.method647(var0, 1, "openjs");
         } else {
            class324.method1568(var0, 2);
         }
      } else {
         class324.method1568(var0, 3);
      }

   }

   public static String method1114(long var0) {
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
               var8 = class413.field3553[(int)(var6 - var0 * 37L)];
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

   static final void method1113() {
      class381.method1810();
      class361.field3236.method162();
      class69.method393();
      class173.field1865.method162();
      class173.field1894.method162();
      class173.field1867.method162();
      class173.field1868.method162();
      class114.method596();
      class458.field3805.method162();
      class458.field3760.method162();
      class458.field3761.method162();
      class79.field900.method162();
      class79.field901.method162();
      class79.field913.method162();
      class251.method1236();
      class465.field3868.method162();
      class69.method394();
      class33.field328.method1990();
      class352.field3182.method1990();
      class383.method1817();
      class316.method1523();
      class125.method638();
      class250.method1229();
      class194.field2015.method162();
      class301.field2888.method162();
      class450.method2127();
      client.field641.method162();
      client.field716.method162();
      class352.method1687();
      class383.method1815();
      ((class118)class234.field2528).method612();
      class472.field3918.method162();
      client.field488.method2295();
      class44.field377.method893();
      class328.field3066.method893();
      class361.field3239.method893();
      class35.field350.method893();
      class42.field375.method893();
      class417.field3564.method893();
      class252.field2634.method893();
      class280.field2767.method893();
      class405.field3532.method893();
      class278.field2760.method893();
      class269.field2702.method893();
      class71.field849.method893();
      class423.field3575.method893();
   }
}
