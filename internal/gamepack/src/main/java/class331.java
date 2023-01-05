public class class331 {
   int field3074;
   int field3075;
   int field3076;
   int field3077;

   public String toString() {
      boolean var1 = true;
      int var2 = 10 - Integer.toString(this.field3075).length();
      int var3 = 10 - Integer.toString(this.field3076).length();
      int var4 = 10 - Integer.toString(this.field3074).length();
      String var5 = "          ".substring(10 - var2);
      String var6 = "          ".substring(10 - var3);
      String var7 = "          ".substring(10 - var4);
      return "    Size: " + this.field3075 + var5 + "Created: " + this.field3074 + var7 + "Total used: " + this.field3076 + var6 + "Max-In-Use: " + this.field3077;
   }

   public static long method1599(int var0) {
      if (var0 > 63) {
         throw new class486("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
      } else {
         return (long)Math.pow(2.0D, (double)var0) - 1L;
      }
   }

   static class319[] method1601() {
      class319[] var1 = new class319[class207.field2197];

      for(int var2 = 0; var2 < class207.field2197; ++var2) {
         class319 var3 = var1[var2] = new class319();
         var3.field3017 = class104.field1353;
         var3.field3018 = class207.field2196;
         var3.field3015 = class207.field2198[var2];
         var3.field3016 = class318.field3011[var2];
         var3.field3014 = class110.field1380[var2];
         var3.field3013 = class111.field1387[var2];
         int var4 = var3.field3013 * var3.field3014;
         byte[] var5 = class344.field3162[var2];
         var3.field3019 = new int[var4];

         for(int var6 = 0; var6 < var4; ++var6) {
            var3.field3019[var6] = class482.field3990[var5[var6] & 255];
         }
      }

      class207.field2198 = null;
      class318.field3011 = null;
      class110.field1380 = null;
      class111.field1387 = null;
      class482.field3990 = null;
      class344.field3162 = (byte[][])null;
      return var1;
   }

   static final int method1600(int var0, int var1, int var2) {
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
