public final class class156 extends class139 {
   static class141 field1200 = new class141();
   class316 field1198;
   class316 field1203;
   class87 field1204;
   int field1190;
   int field1191;
   int field1192;
   int field1193;
   int field1194;
   int field1195;
   int field1196;
   int field1197;
   int field1199;
   int field1202;
   int[] field1201;

   void method719() {
      int var2 = this.field1197;
      class87 var3 = this.field1204.method372();
      if (null != var3) {
         this.field1197 = var3.field752;
         this.field1199 = var3.field734 * 128;
         this.field1194 = var3.field750;
         this.field1191 = var3.field751;
         this.field1201 = var3.field713;
      } else {
         this.field1197 = -1;
         this.field1199 = 0;
         this.field1194 = 0;
         this.field1191 = 0;
         this.field1201 = null;
      }

      if (var2 != this.field1197 && this.field1198 != null) {
         class197.field1739.method1066(this.field1198);
         this.field1198 = null;
      }

   }

   public static boolean method720(char var0) {
      if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
         if (var0 != 0) {
            char[] var2 = class471.field3959;

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

   public static final void method721(String var0, String var1, int var2, int var3, int var4, int var5) {
      class323.method1653(var0, var1, var2, var3, var4, var5, -1, false);
   }
}
