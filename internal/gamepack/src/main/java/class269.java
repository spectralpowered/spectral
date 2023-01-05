import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class class269 {
   static class230 field2702;
   static int field2703;
   final int field2700;
   final String field2701;

   class269(HttpURLConnection var1) throws IOException {
      this.field2700 = var1.getResponseCode();
      var1.getResponseMessage();
      var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.field2700 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (null != var3) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field2701 = var2.toString();
   }

   class269(String var1) {
      this.field2700 = 400;
      this.field2701 = "";
   }

   public int method1276() {
      return this.field2700;
   }

   public String method1277() {
      return this.field2701;
   }

   public static class361 method1278(int var0) {
      class361 var2 = (class361)class361.field3236.method161((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class218.field2419.method892(1, var0);
         var2 = new class361();
         if (var3 != null) {
            var2.method1728(new class134(var3), var0);
         }

         var2.method1725();
         class361.field3236.method163(var2, (long)var0);
         return var2;
      }
   }
}
