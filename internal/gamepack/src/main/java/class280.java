import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class class280 {
   static class230 field2767;
   boolean field2766;
   boolean field2768 = false;
   boolean field2769;
   boolean field2770 = false;
   double field2779 = 0.8D;
   int field2772;
   int field2773 = 127;
   int field2774 = 127;
   int field2775 = 127;
   int field2776 = -1;
   int field2778 = 1;
   String field2777 = null;
   final Map field2771 = new LinkedHashMap();

   class280() {
      this.method1315(true);
   }

   class280(class134 var1) {
      if (null != var1 && var1.field1489 != null) {
         int var2 = var1.method669();
         if (var2 >= 0 && var2 <= 10) {
            if (var1.method669() == 1) {
               this.field2766 = true;
            }

            if (var2 > 1) {
               this.field2769 = var1.method669() == 1;
            }

            if (var2 > 3) {
               this.field2778 = var1.method669();
            }

            if (var2 > 2) {
               int var3 = var1.method669();

               for(int var4 = 0; var4 < var3; ++var4) {
                  int var5 = var1.method717();
                  int var6 = var1.method717();
                  this.field2771.put(var5, var6);
               }
            }

            if (var2 > 4) {
               this.field2777 = var1.method676();
            }

            if (var2 > 5) {
               this.field2768 = var1.method675();
            }

            if (var2 > 6) {
               this.field2779 = (double)var1.method669() / 100.0D;
               this.field2773 = var1.method669();
               this.field2774 = var1.method669();
               this.field2775 = var1.method669();
            }

            if (var2 > 7) {
               this.field2776 = var1.method669();
            }

            if (var2 > 8) {
               this.field2770 = var1.method669() == 1;
            }

            if (var2 > 9) {
               this.field2772 = var1.method717();
            }
         } else {
            this.method1315(true);
         }
      } else {
         this.method1315(true);
      }

   }

   void method1315(boolean var1) {
   }

   class134 method1316() {
      class134 var2 = new class134(417, true);
      var2.method666(10);
      var2.method666(this.field2766 ? 1 : 0);
      var2.method666(this.field2769 ? 1 : 0);
      var2.method666(this.field2778);
      var2.method666(this.field2771.size());
      Iterator var3 = this.field2771.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         var2.method656(((Integer)var4.getKey()).intValue());
         var2.method656(((Integer)var4.getValue()).intValue());
      }

      var2.method660(null != this.field2777 ? this.field2777 : "", (byte)116);
      var2.method659(this.field2768);
      var2.method666((int)(this.field2779 * 100.0D));
      var2.method666(this.field2773);
      var2.method666(this.field2774);
      var2.method666(this.field2775);
      var2.method666(this.field2776);
      var2.method666(this.field2770 ? 1 : 0);
      var2.method656(this.field2772);
      return var2;
   }

   void method1344(boolean var1) {
      this.field2766 = var1;
      class448.method2122();
   }

   boolean method1317() {
      return this.field2766;
   }

   void method1340(boolean var1) {
      this.field2768 = var1;
      class448.method2122();
   }

   boolean method1318() {
      return this.field2768;
   }

   void method1338(boolean var1) {
      this.field2769 = var1;
      class448.method2122();
   }

   boolean method1328() {
      return this.field2769;
   }

   void method1341(boolean var1) {
      this.field2770 = var1;
      class448.method2122();
   }

   void method1332() {
      this.method1341(!this.field2770);
   }

   boolean method1320() {
      return this.field2770;
   }

   void method1321(int var1) {
      this.field2772 = var1;
      class448.method2122();
   }

   int method1322() {
      return this.field2772;
   }

   void method1343(double var1) {
      this.field2779 = var1;
      class448.method2122();
   }

   double method1323() {
      return this.field2779;
   }

   void method1319(int var1) {
      this.field2773 = var1;
      class448.method2122();
   }

   int method1325() {
      return this.field2773;
   }

   void method1342(int var1) {
      this.field2774 = var1;
      class448.method2122();
   }

   int method1326() {
      return this.field2774;
   }

   void method1327(int var1) {
      this.field2775 = var1;
      class448.method2122();
   }

   int method1345() {
      return this.field2775;
   }

   void method1329(String var1) {
      this.field2777 = var1;
      class448.method2122();
   }

   String method1330() {
      return this.field2777;
   }

   void method1331(int var1) {
      this.field2776 = var1;
      class448.method2122();
   }

   int method1324() {
      return this.field2776;
   }

   void method1339(int var1) {
      this.field2778 = var1;
      class448.method2122();
   }

   int method1333() {
      return this.field2778;
   }

   void method1334(String var1, int var2) {
      int var4 = this.method1337(var1);
      if (this.field2771.size() >= 10 && !this.field2771.containsKey(var4)) {
         Iterator var5 = this.field2771.entrySet().iterator();
         var5.next();
         var5.remove();
      }

      this.field2771.put(var4, var2);
      class448.method2122();
   }

   boolean method1335(String var1) {
      int var3 = this.method1337(var1);
      return this.field2771.containsKey(var3);
   }

   int method1336(String var1) {
      int var3 = this.method1337(var1);
      return !this.field2771.containsKey(var3) ? 0 : ((Integer)this.field2771.get(var3)).intValue();
   }

   int method1337(String var1) {
      String var4 = var1.toLowerCase();
      int var5 = var4.length();
      int var6 = 0;

      for(int var7 = 0; var7 < var5; ++var7) {
         var6 = (var6 << 5) - var6 + var4.charAt(var7);
      }

      return var6;
   }

   static int method1347(int var0, int var1) {
      class233 var3 = (class233)class233.field2522.method545((long)var0);
      if (var3 == null) {
         return 0;
      } else {
         return var1 >= 0 && var1 < var3.field2521.length ? var3.field2521[var1] : 0;
      }
   }

   static final void method1346(class30 var0, int var1) {
      class69.method387(var0.field297, var0.field233, var1);
   }
}
