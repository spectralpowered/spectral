public class class232 {
   int field1969;
   int field1970;
   int field1971;
   int field1972;

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field1970).length();
      int var3 = 10 - Integer.toString(this.field1971).length();
      int var4 = 10 - Integer.toString(this.field1969).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field1970 + var5 + "Created: " + this.field1969 + var7 + "Total used: " + this.field1971 + var6 + "Max-In-Use: " + this.field1972;
   }

   public static long method1003(int var0) {
      if (var0 > 63) {
         throw new class276("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0D, (double)var0) - 1L;
      }
   }

   static class266[] method1005() {
      class266[] var1 = new class266[class18.field91];

      for(int var2 = 0; var2 < class18.field91; ++var2) {
         class266 var3 = var1[var2] = new class266();
         var3.field2203 = class183.field1682;
         var3.field2204 = class18.field90;
         var3.field2201 = class18.field92[var2];
         var3.field2202 = class110.field826[var2];
         var3.field2200 = class418.field3431[var2];
         var3.field2199 = class50.field576[var2];
         int var4 = var3.field2199 * var3.field2200;
         byte[] var5 = class340.field2723[var2];
         var3.field2205 = new int[var4];

         for(int var6 = 0; var6 < var4; ++var6) {
            var3.field2205[var6] = class413.field3422[var5[var6] & 255];
         }
      }

      class18.field92 = null;
      class110.field826 = null;
      class418.field3431 = null;
      class50.field576 = null;
      class413.field3422 = null;
      class340.field2723 = (byte[][])null;
      return var1;
   }

   static final int method1004(int var0, int var1, int var2) {
      if (var2 > 179) {
         var1 /= 2;
      }

      if (var2 > 192) {
         var1 /= 2;
      }

      if (var2 > 217) {
         var1 /= 2;
      }

      if (var2 > 243) {
         var1 /= 2;
      }

      int var4 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
      return var4;
   }
}
