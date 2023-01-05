import java.util.ArrayList;
import java.util.Calendar;

public class class386 {
   static boolean field3253 = false;
   static boolean field3256 = false;
   static class241[] field3252 = new class241[50];
   static int field3250;
   static int field3251 = 0;
   static int field3259 = 0;
   static int[] field3246 = new int[5];
   static int[] field3248 = new int[1000];
   static int[] field3257;
   static int[][] field3247 = new int[5][5000];
   static String[] field3249 = new String[1000];
   static ArrayList field3255 = new ArrayList();
   static Calendar field3245 = Calendar.getInstance();
   static final double field3258 = Math.log(2.0D);
   static final String[] field3254 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

   public static void method1899(class364 var0) {
      class243.field2052 = var0;
   }

   static int method1901(int var0, int var1) {
      class179 var4 = (class179)class179.field1647.method394((long)var0);
      class179 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class179.field1646.method1365(4, var0);
         var4 = new class179();
         if (null != var5) {
            var4.method815(new class127(var5), var0);
         }

         var4.method814();
         class179.field1647.method396(var4, (long)var0);
         var3 = var4;
      }

      if (null == var3) {
         return var1;
      } else if (var3.field1651 >= 0) {
         return var3.field1651 | -16777216;
      } else if (var3.field1649 >= 0) {
         int var11 = class101.method407(class341.field2728.method1496(var3.field1649), 96);
         return class341.field2740[var11] | -16777216;
      } else if (var3.field1648 == 16711935) {
         return var1;
      } else {
         int var6 = var3.field1654;
         int var7 = var3.field1652;
         int var8 = var3.field1653;
         if (var8 > 179) {
            var7 /= 2;
         }

         if (var8 > 192) {
            var7 /= 2;
         }

         if (var8 > 217) {
            var7 /= 2;
         }

         if (var8 > 243) {
            var7 /= 2;
         }

         int var9 = var8 / 2 + (var6 / 4 << 10) + (var7 / 32 << 7);
         int var10 = class101.method407(var9, 96);
         return class341.field2740[var10] | -16777216;
      }
   }

   static final void method1900(int var0, int var1, int var2, int var3, int var4) {
      class306.field2458[0].method1745(var0, var1);
      class306.field2458[1].method1745(var0, var3 + var1 - 16);
      class162.method749(var0, var1 + 16, 16, var3 - 32, client.field432);
      int var6 = (var3 - 32) * var3 / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
      class162.method749(var0, var1 + 16 + var7, 16, var6, client.field364);
      class162.method753(var0, var1 + 16 + var7, var6, client.field297);
      class162.method753(var0 + 1, var1 + 16 + var7, var6, client.field297);
      class162.method752(var0, var7 + var1 + 16, 16, client.field297);
      class162.method752(var0, var1 + 17 + var7, 16, client.field297);
      class162.method753(var0 + 15, var7 + var1 + 16, var6, client.field245);
      class162.method753(var0 + 14, var1 + 17 + var7, var6 - 1, client.field245);
      class162.method752(var0, var1 + 15 + var7 + var6, 16, client.field245);
      class162.method752(var0 + 1, var1 + 14 + var7 + var6, 15, client.field245);
   }
}
