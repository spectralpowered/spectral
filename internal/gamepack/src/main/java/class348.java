public class class348 {
   static class385 field3173;
   class292[] field3172;
   int field3174;

   class348(class134 var1, int var2) {
      this.field3172 = new class292[var2];
      this.field3174 = var1.method669();

      for(int var3 = 0; var3 < this.field3172.length; ++var3) {
         class292 var4 = new class292(this.field3174, var1, false);
         this.field3172[var3] = var4;
      }

      this.method1668();
   }

   void method1668() {
      class292[] var2 = this.field3172;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         class292 var4 = var2[var3];
         if (var4.field2801 >= 0) {
            var4.field2798 = this.field3172[var4.field2801];
         }
      }

   }

   public int method1669() {
      return this.field3172.length;
   }

   class292 method1670(int var1) {
      return var1 >= this.method1669() ? null : this.field3172[var1];
   }

   class292[] method1672() {
      return this.field3172;
   }

   void method1671(class159 var1, int var2) {
      this.method1673(var1, var2, (boolean[])null, false);
   }

   void method1673(class159 var1, int var2, boolean[] var3, boolean var4) {
      int var6 = var1.method844();
      int var7 = 0;
      class292[] var8 = this.method1672();

      for(int var9 = 0; var9 < var8.length; ++var9) {
         class292 var10 = var8[var9];
         if (var3 == null || var4 == var3[var7]) {
            var1.method837(var2, var10, var7, var6);
         }

         ++var7;
      }

   }

   public static boolean method1674() {
      return client.field610 != null;
   }
}
