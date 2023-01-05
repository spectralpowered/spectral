import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class class32 {
   static class38 field176;
   static int field177;
   final int field174;
   final String field175;

   class32(HttpURLConnection var1) throws IOException {
      this.field174 = var1.getResponseCode();
      var1.getResponseMessage();
      var1.getHeaderFields();
      StringBuilder var2 = new StringBuilder();
      InputStream var3 = this.field174 >= 300 ? var1.getErrorStream() : var1.getInputStream();
      if (null != var3) {
         InputStreamReader var4 = new InputStreamReader(var3);
         BufferedReader var5 = new BufferedReader(var4);

         String var6;
         while((var6 = var5.readLine()) != null) {
            var2.append(var6);
         }

         var3.close();
      }

      this.field175 = var2.toString();
   }

   class32(String var1) {
      this.field174 = 400;
      this.field175 = "";
   }

   public int method138() {
      return this.field174;
   }

   public String method139() {
      return this.field175;
   }

   public static class313 method140(int var0) {
      class313 var2 = (class313)class313.field2470.method394((long)var0);
      if (null != var2) {
         return var2;
      } else {
         byte[] var3 = class33.field178.method1365(1, var0);
         var2 = new class313();
         if (var3 != null) {
            var2.method1511(new class127(var3), var0);
         }

         var2.method1508();
         class313.field2470.method396(var2, (long)var0);
         return var2;
      }
   }
}
