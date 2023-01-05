import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class class329 extends class163 {
   public static int field3069;
   static class161[] field3068;
   static int field3067;
   final boolean field3070;

   public class329(boolean var1, int var2) {
      super(var2);
      this.field3070 = var1;
   }

   void method858(class432 var1) throws IOException {
      URLConnection var3 = null;

      try {
         String var4 = var1.field3606.getProtocol();
         if (var4.equals("http")) {
            var3 = this.method1593(var1);
         } else {
            if (!var4.equals("https")) {
               var1.field3607 = true;
               return;
            }

            var3 = this.method1592(var1);
         }

         this.method862(var3, var1);
      } catch (IOException var8) {
         ;
      } finally {
         var1.field3607 = true;
         if (var3 != null) {
            if (var3 instanceof HttpURLConnection) {
               ((HttpURLConnection)var3).disconnect();
            } else if (var3 instanceof HttpsURLConnection) {
               ((HttpsURLConnection)var3).disconnect();
            }
         }

      }

   }

   URLConnection method1593(class432 var1) throws IOException {
      URLConnection var3 = var1.field3606.openConnection();
      this.method859(var3);
      return var3;
   }

   URLConnection method1592(class432 var1) throws IOException {
      HttpsURLConnection var3 = (HttpsURLConnection)var1.field3606.openConnection();
      if (!this.field3070) {
         if (null == class309.field2908) {
            class309.field2908 = new class309();
         }

         class309 var5 = class309.field2908;
         var3.setSSLSocketFactory(var5);
      }

      this.method859(var3);
      return var3;
   }

   public static class212 method1594(int var0) {
      class212 var2 = (class212)class212.field2378.method161((long)var0);
      if (var2 != null) {
         return var2;
      } else {
         byte[] var3 = class212.field2377.method892(16, var0);
         var2 = new class212();
         if (var3 != null) {
            var2.method1107(new class134(var3));
         }

         class212.field2378.method163(var2, (long)var0);
         return var2;
      }
   }

   public static class81 method1595() {
      return class81.field934 == 0 ? new class81() : class81.field931[--class81.field934];
   }

   public static String method1596(String var0) {
      StringBuilder var2 = new StringBuilder(var0.length());
      int var3 = 0;
      int var4 = -1;

      for(int var5 = 0; var5 < var0.length(); ++var5) {
         char var6 = var0.charAt(var5);
         if (var6 == '<') {
            var2.append(var0.substring(var3, var5));
            var4 = var5;
         } else if (var6 == '>' && var4 != -1) {
            String var7 = var0.substring(var4 + 1, var5);
            var4 = -1;
            if (var7.equals("lt")) {
               var2.append("<");
            } else if (var7.equals("gt")) {
               var2.append(">");
            } else if (var7.equals("br")) {
               var2.append("\n");
            }

            var3 = var5 + 1;
         }
      }

      if (var3 < var0.length()) {
         var2.append(var0.substring(var3, var0.length()));
      }

      return var2.toString();
   }

   static int method1597(class296 var0, class296 var1, int var2, boolean var3) {
      if (var2 == 1) {
         int var5 = var0.field2839;
         int var6 = var1.field2839;
         if (!var3) {
            if (var5 == -1) {
               var5 = 2001;
            }

            if (var6 == -1) {
               var6 = 2001;
            }
         }

         return var5 - var6;
      } else if (var2 == 2) {
         return var0.field2841 - var1.field2841;
      } else if (var2 == 3) {
         if (var0.field2835.equals("-")) {
            if (var1.field2835.equals("-")) {
               return 0;
            } else {
               return var3 ? -1 : 1;
            }
         } else if (var1.field2835.equals("-")) {
            return var3 ? 1 : -1;
         } else {
            return var0.field2835.compareTo(var1.field2835);
         }
      } else if (var2 == 4) {
         return var0.method1394() ? (var1.method1394() ? 0 : 1) : (var1.method1394() ? -1 : 0);
      } else if (var2 == 5) {
         return var0.method1397() ? (var1.method1397() ? 0 : 1) : (var1.method1397() ? -1 : 0);
      } else if (var2 == 6) {
         return var0.method1393() ? (var1.method1393() ? 0 : 1) : (var1.method1393() ? -1 : 0);
      } else if (var2 == 7) {
         return var0.method1392() ? (var1.method1392() ? 0 : 1) : (var1.method1392() ? -1 : 0);
      } else {
         return var0.field2832 - var1.field2832;
      }
   }
}
