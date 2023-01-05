public class class97 {
   int field1341 = 0;
   final class230 field1342;
   final int field1343;

   class97(class230 var1, String var2) {
      this.field1342 = var1;
      this.field1343 = var1.method880();
   }

   boolean method548() {
      this.field1341 = 0;

      for(int var2 = 0; var2 < this.field1343; ++var2) {
         if (!this.field1342.method1155(var2) || this.field1342.method1152(var2)) {
            ++this.field1341;
         }
      }

      return this.field1341 >= this.field1343;
   }

   static String method547(class210 var0) {
      if (class393.method1910(class172.method913(var0)) == 0) {
         return null;
      } else {
         return var0.field2305 != null && var0.field2305.trim().length() != 0 ? var0.field2305 : null;
      }
   }

   static void method546(byte[] var0, int var1) {
      if (client.field477 == null) {
         client.field477 = new byte[24];
      }

      class364.method1759(var0, var1, client.field477, 0, 24);
   }
}
