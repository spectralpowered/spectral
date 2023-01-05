public class class301 extends class108 {
   public static class31 field2888 = new class31(64);
   static class164 field2889;
   public int[][] field2890;
   public Object[][] field2887;

   void method1421(class134 var1) {
      while(true) {
         int var3 = var1.method669();
         if (var3 == 0) {
            return;
         }

         this.method1424(var1, var3);
      }
   }

   void method1424(class134 var1, int var2) {
      if (var2 == 1) {
         int var4 = var1.method669();
         if (null == this.field2890) {
            this.field2890 = new int[var4][];
         }

         for(int var5 = var1.method669(); var5 != 255; var5 = var1.method669()) {
            int var6 = var5 & 127;
            boolean var7 = (var5 & 128) != 0;
            int[] var8 = new int[var1.method669()];

            for(int var9 = 0; var9 < var8.length; ++var9) {
               var8[var9] = var1.method681();
            }

            this.field2890[var6] = var8;
            if (var7) {
               if (this.field2887 == null) {
                  this.field2887 = new Object[this.field2890.length][];
               }

               Object[][] var18 = this.field2887;
               int var12 = var1.method681();
               Object[] var13 = new Object[var8.length * var12];

               for(int var14 = 0; var14 < var12; ++var14) {
                  for(int var15 = 0; var15 < var8.length; ++var15) {
                     int var16 = var15 + var14 * var8.length;
                     class180 var17 = class328.method1591(var8[var15]);
                     var13[var16] = var17.method941(var1);
                  }
               }

               var18[var6] = var13;
            }
         }
      }

   }

   void method1422() {
   }

   public static String method1423(CharSequence var0) {
      int var2 = var0.length();
      StringBuilder var3 = new StringBuilder(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         char var5 = var0.charAt(var4);
         if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
            if (var5 == ' ') {
               var3.append('+');
            } else {
               byte var6 = class291.method1369(var5);
               var3.append('%');
               int var7 = var6 >> 4 & 15;
               if (var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }

               var7 = var6 & 15;
               if (var7 >= 10) {
                  var3.append((char)(var7 + 55));
               } else {
                  var3.append((char)(var7 + 48));
               }
            }
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   public static int method1425(int var0) {
      return var0 >>> 4 & class469.field3907;
   }
}
