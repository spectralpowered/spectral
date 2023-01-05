public class class5 extends class108 {
   public static class164 field24;
   public static class31 field19 = new class31(64);
   static class164 field16;
   static class31 field18 = new class31(64);
   static int field29;
   int field25 = -1;
   int field26 = -1;
   public int field15 = 70;
   public int field17 = 1;
   public int field20 = 255;
   public int field21 = 255;
   public int field22 = -1;
   public int field23;
   public int field27 = 30;
   public int field28 = 0;

   public void method17(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method14(var1, var3);
      }
   }

   void method14(class134 var1, int var2) {
      if (var2 == 1) {
         var1.method671();
      } else if (var2 == 2) {
         this.field20 = var1.method669();
      } else if (var2 == 3) {
         this.field21 = var1.method669();
      } else if (var2 == 4) {
         this.field22 = 0;
      } else if (var2 == 5) {
         this.field15 = var1.method671();
      } else if (var2 == 6) {
         var1.method669();
      } else if (var2 == 7) {
         this.field25 = var1.method682();
      } else if (var2 == 8) {
         this.field26 = var1.method682();
      } else if (var2 == 11) {
         this.field22 = var1.method671();
      } else if (var2 == 14) {
         this.field27 = var1.method669();
      } else if (var2 == 15) {
         this.field28 = var1.method669();
      }

   }

   public class319 method15() {
      if (this.field25 < 0) {
         return null;
      } else {
         class319 var2 = (class319)field18.method161((long)this.field25);
         if (var2 != null) {
            return var2;
         } else {
            var2 = class360.method1714(field16, this.field25, 0);
            if (var2 != null) {
               field18.method163(var2, (long)this.field25);
            }

            return var2;
         }
      }
   }

   public class319 method16() {
      if (this.field26 < 0) {
         return null;
      } else {
         class319 var2 = (class319)field18.method161((long)this.field26);
         if (null != var2) {
            return var2;
         } else {
            var2 = class360.method1714(field16, this.field26, 0);
            if (var2 != null) {
               field18.method163(var2, (long)this.field26);
            }

            return var2;
         }
      }
   }

   static String method18(String var0, class210 var1) {
      if (var0.indexOf("%") != -1) {
         for(int var3 = 1; var3 <= 5; ++var3) {
            while(true) {
               int var4 = var0.indexOf("%" + var3);
               if (var4 == -1) {
                  break;
               }

               String var5 = var0.substring(0, var4);
               int var7 = class378.method1803(var1, var3 - 1);
               String var6;
               if (var7 < 999999999) {
                  var6 = Integer.toString(var7);
               } else {
                  var6 = "*";
               }

               var0 = var5 + var6 + var0.substring(var4 + 2);
            }
         }
      }

      return var0;
   }
}
