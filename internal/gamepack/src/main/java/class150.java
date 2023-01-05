import java.util.ArrayList;
import java.util.Calendar;

public class class150 {
   static boolean field1585 = false;
   static boolean field1588 = false;
   static class69[] field1584 = new class69[50];
   static int field1582;
   static int field1583 = 0;
   static int field1591 = 0;
   static int[] field1578 = new int[5];
   static int[] field1580 = new int[1000];
   static int[] field1589;
   static int[][] field1579 = new int[5][5000];
   static String[] field1581 = new String[1000];
   static ArrayList field1587 = new ArrayList();
   static Calendar field1577 = Calendar.getInstance();
   static final double field1590 = Math.log(2.0D);
   static final String[] field1586 = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

   public static void method792(class369 var0) {
      class223.field2435 = var0;
   }

   static int method794(int var0, int var1) {
      class152 var4 = (class152)class152.field1594.method161((long)var0);
      class152 var3;
      if (null != var4) {
         var3 = var4;
      } else {
         byte[] var5 = class152.field1593.method892(4, var0);
         var4 = new class152();
         if (null != var5) {
            var4.method797(new class134(var5), var0);
         }

         var4.method796();
         class152.field1594.method163(var4, (long)var0);
         var3 = var4;
      }

      if (null == var3) {
         return var1;
      } else if (var3.field1598 >= 0) {
         return var3.field1598 | -16777216;
      } else if (var3.field1596 >= 0) {
         int var11 = class215.method1122(class234.field2528.method1353(var3.field1596), 96);
         return class234.field2540[var11] | -16777216;
      } else if (var3.field1595 == 16711935) {
         return var1;
      } else {
         int var6 = var3.field1601;
         int var7 = var3.field1599;
         int var8 = var3.field1600;
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
         int var10 = class215.method1122(var9, 96);
         return class234.field2540[var10] | -16777216;
      }
   }

   static final void method793(int var0, int var1, int var2, int var3, int var4) {
      class137.field1498[0].method849(var0, var1);
      class137.field1498[1].method849(var0, var3 + var1 - 16);
      class362.method1739(var0, var1 + 16, 16, var3 - 32, client.field636);
      int var6 = (var3 - 32) * var3 / var4;
      if (var6 < 8) {
         var6 = 8;
      }

      int var7 = (var3 - 32 - var6) * var2 / (var4 - var3);
      class362.method1739(var0, var1 + 16 + var7, 16, var6, client.field568);
      class362.method1743(var0, var1 + 16 + var7, var6, client.field501);
      class362.method1743(var0 + 1, var1 + 16 + var7, var6, client.field501);
      class362.method1742(var0, var7 + var1 + 16, 16, client.field501);
      class362.method1742(var0, var1 + 17 + var7, 16, client.field501);
      class362.method1743(var0 + 15, var7 + var1 + 16, var6, client.field449);
      class362.method1743(var0 + 14, var1 + 17 + var7, var6 - 1, client.field449);
      class362.method1742(var0, var1 + 15 + var7 + var6, 16, client.field449);
      class362.method1742(var0 + 1, var1 + 14 + var7 + var6, 15, client.field449);
   }
}
