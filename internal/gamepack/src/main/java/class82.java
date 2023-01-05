public final class class82 extends class106 {
   static class397 field946 = new class397();
   class173 field950;
   class310 field944;
   class310 field949;
   int field936;
   int field937;
   int field938;
   int field939;
   int field940;
   int field941;
   int field942;
   int field943;
   int field945;
   int field948;
   int[] field947;

   void method440() {
      int var2 = this.field943;
      class173 var3 = this.field950.method925();
      if (null != var3) {
         this.field943 = var3.field1910;
         this.field945 = var3.field1892 * 128;
         this.field940 = var3.field1908;
         this.field937 = var3.field1909;
         this.field947 = var3.field1871;
      } else {
         this.field943 = -1;
         this.field945 = 0;
         this.field940 = 0;
         this.field937 = 0;
         this.field947 = null;
      }

      if (var2 != this.field943 && this.field944 != null) {
         class488.field4008.method1924(this.field944);
         this.field944 = null;
      }

   }

   public static boolean method441(char var0) {
      if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var2 = class307.field2898;

            for(int var3 = 0; var3 < var2.length; ++var3) {
               char var4 = var2[var3];
               if (var0 == var4) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static final void method442(String var0, String var1, int var2, int var3, int var4, int var5) {
      class384.method1821(var0, var1, var2, var3, var4, var5, -1, false);
   }
}
