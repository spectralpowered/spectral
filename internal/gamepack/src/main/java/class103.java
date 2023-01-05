import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class455
public final class class103 {
   public static File field1351;
   static boolean field1349;
   static class319[] field1352;
   static class85 field1350;
   static final HashMap field1348 = new HashMap();

   static {
      Calendar.getInstance(method558("Europe/London"));
   }

   static TimeZone method558(String var0) {
      HashMap var2 = field1348;
      synchronized(field1348) {
         TimeZone var3 = (TimeZone)field1348.get(var0);
         if (var3 == null) {
            var3 = TimeZone.getTimeZone(var0);
            field1348.put(var0, var3);
         }

         return var3;
      }
   }

   static void method559() {
      int var1 = class25.field180;
      int[] var2 = class25.field179;

      for(int var3 = 0; var3 < var1; ++var3) {
         if (client.field563 != var2[var3] && var2[var3] != client.field552) {
            class16.method98(client.field551[var2[var3]], true);
         }
      }

   }

   static final void method556(int var0, int var1, boolean var2) {
      if (!var2 || var0 != class222.field2433 || var1 != class11.field59) {
         class222.field2433 = var0;
         class11.field59 = var1;
         class72.method402(25);
         class414.method2003(class96.field1150, true);
         int var4 = class381.field3325;
         int var5 = class345.field3166;
         class381.field3325 = 8 * (var0 - 6);
         class345.field3166 = 8 * (var1 - 6);
         int var6 = class381.field3325 - var4;
         int var7 = class345.field3166 - var5;
         var4 = class381.field3325;
         var5 = class345.field3166;

         int var8;
         int var10;
         for(var8 = 0; var8 < 65536; ++var8) {
            class53 var9 = client.field669[var8];
            if (var9 != null) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var9.field258[var10] -= var6;
                  var9.field306[var10] -= var7;
               }

               var9.field297 -= var6 * 128;
               var9.field233 -= var7 * 128;
            }
         }

         for(var8 = 0; var8 < 2048; ++var8) {
            class47 var20 = client.field551[var8];
            if (null != var20) {
               for(var10 = 0; var10 < 10; ++var10) {
                  var20.field258[var10] -= var6;
                  var20.field306[var10] -= var7;
               }

               var20.field297 -= var6 * 128;
               var20.field233 -= var7 * 128;
            }
         }

         byte var19 = 0;
         byte var21 = 104;
         byte var22 = 1;
         if (var6 < 0) {
            var19 = 103;
            var21 = -1;
            var22 = -1;
         }

         byte var11 = 0;
         byte var12 = 104;
         byte var13 = 1;
         if (var7 < 0) {
            var11 = 103;
            var12 = -1;
            var13 = -1;
         }

         int var15;
         for(int var14 = var19; var14 != var21; var14 += var22) {
            for(var15 = var11; var12 != var15; var15 += var13) {
               int var16 = var14 + var6;
               int var17 = var15 + var7;

               for(int var18 = 0; var18 < 4; ++var18) {
                  if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
                     client.field564[var18][var14][var15] = client.field564[var18][var16][var17];
                  } else {
                     client.field564[var18][var14][var15] = null;
                  }
               }
            }
         }

         for(class474 var23 = (class474)client.field654.method1934(); var23 != null; var23 = (class474)client.field654.method1936()) {
            var23.field3930 -= var6;
            var23.field3941 -= var7;
            if (var23.field3930 < 0 || var23.field3941 < 0 || var23.field3930 >= 104 || var23.field3941 >= 104) {
               var23.method567();
            }
         }

         if (0 != client.field677) {
            client.field677 -= var6;
            client.field423 -= var7;
         }

         client.field682 = 0;
         client.field688 = false;
         class342.field3148 -= var6 << 7;
         class112.field1394 -= var7 << 7;
         class377.field3308 -= var6 << 7;
         class18.field140 -= var7 << 7;
         client.field536 = -1;
         client.field556.method1937();
         client.field566.method1937();

         for(var15 = 0; var15 < 4; ++var15) {
            client.field493[var15].method1886();
         }

      }
   }

   static final boolean method560(int var0) {
      if (var0 < 0) {
         return false;
      } else {
         int var2 = client.field667[var0];
         if (var2 >= 2000) {
            var2 -= 2000;
         }

         return var2 == 1007;
      }
   }

   static boolean method557(int var0) {
      for(int var2 = 0; var2 < client.field627; ++var2) {
         if (var0 == client.field668[var2]) {
            return true;
         }
      }

      return false;
   }
}
