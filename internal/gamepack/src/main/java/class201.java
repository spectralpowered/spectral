import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

public class class201 {
   boolean field2165 = false;
   boolean field2167 = false;
   class464 field2164;
   int field2168 = 300000;
   Map field2169;
   HttpsURLConnection field2166;
   final class328 field2162;
   final Map field2163;

   public class201(URL var1, class328 var2, boolean var3) throws IOException {
      if (!var2.method1583()) {
         throw new UnsupportedEncodingException("Unsupported request method used " + var2.method1584());
      } else {
         this.field2166 = (HttpsURLConnection)var1.openConnection();
         if (!var3) {
            HttpsURLConnection var4 = this.field2166;
            if (class309.field2908 == null) {
               class309.field2908 = new class309();
            }

            class309 var5 = class309.field2908;
            var4.setSSLSocketFactory(var5);
         }

         this.field2162 = var2;
         this.field2163 = new HashMap();
         this.field2169 = new HashMap();
      }
   }

   public void method1012(String var1, String var2) {
      if (!this.field2165) {
         this.field2163.put(var1, var2);
      }
   }

   String method1011() {
      ArrayList var2 = new ArrayList(this.field2169.entrySet());
      Collections.sort(var2, new class304(this));
      StringBuilder var3 = new StringBuilder();
      Iterator var4 = var2.iterator();

      while(var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         if (var3.length() > 0) {
            var3.append(",");
         }

         var3.append(((class450)var5.getKey()).method2128());
         float var6 = ((Float)var5.getValue()).floatValue();
         if (var6 < 1.0F) {
            String var7 = Float.toString(var6).substring(0, 4);
            var3.append(";q=" + var7);
         }
      }

      return var3.toString();
   }

   void method1013() throws ProtocolException {
      if (!this.field2165) {
         this.field2166.setRequestMethod(this.field2162.method1584());
         if (!this.field2169.isEmpty()) {
            this.field2163.put("Accept", this.method1011());
         }

         Iterator var2 = this.field2163.entrySet().iterator();

         while(var2.hasNext()) {
            Entry var3 = (Entry)var2.next();
            this.field2166.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
         }

         if (this.field2162.method1585() && null != this.field2164) {
            this.field2166.setDoOutput(true);
            ByteArrayOutputStream var14 = new ByteArrayOutputStream();

            try {
               var14.write(this.field2164.method2278());
               var14.writeTo(this.field2166.getOutputStream());
            } catch (IOException var12) {
               var12.printStackTrace();
            } finally {
               if (null != var14) {
                  try {
                     var14.close();
                  } catch (IOException var11) {
                     var11.printStackTrace();
                  }
               }

            }
         }

         this.field2166.setConnectTimeout(this.field2168);
         this.field2166.setInstanceFollowRedirects(this.field2167);
         this.field2165 = true;
      }
   }

   boolean method1014() throws IOException, SocketTimeoutException {
      if (!this.field2165) {
         this.method1013();
      }

      this.field2166.connect();
      return this.field2166.getResponseCode() == -1;
   }

   class269 method1015() {
      try {
         if (!this.field2165 || this.field2166.getResponseCode() == -1) {
            return new class269("No REST response has been received yet.");
         }
      } catch (IOException var11) {
         this.field2166.disconnect();
         return new class269("Error decoding REST response code: " + var11.getMessage());
      }

      class269 var2 = null;

      class269 var4;
      try {
         var2 = new class269(this.field2166);
         return var2;
      } catch (IOException var9) {
         var4 = new class269("Error decoding REST response: " + var9.getMessage());
      } finally {
         this.field2166.disconnect();
      }

      return var4;
   }

   static int method1016(int var0, class472 var1, boolean var2) {
      if (var0 == 6200) {
         class188.field1989 -= 2;
         client.field695 = (short)class34.method172(class150.field1580[class188.field1989]);
         if (client.field695 <= 0) {
            client.field695 = 256;
         }

         client.field467 = (short)class34.method172(class150.field1580[class188.field1989 + 1]);
         if (client.field467 <= 0) {
            client.field467 = 256;
         }

         return 1;
      } else if (var0 == 6201) {
         class188.field1989 -= 2;
         client.field697 = (short)class150.field1580[class188.field1989];
         if (client.field697 <= 0) {
            client.field697 = 256;
         }

         client.field589 = (short)class150.field1580[1 + class188.field1989];
         if (client.field589 <= 0) {
            client.field589 = 320;
         }

         return 1;
      } else if (var0 == 6202) {
         class188.field1989 -= 4;
         client.field607 = (short)class150.field1580[class188.field1989];
         if (client.field607 <= 0) {
            client.field607 = 1;
         }

         client.field700 = (short)class150.field1580[class188.field1989 + 1];
         if (client.field700 <= 0) {
            client.field700 = 32767;
         } else if (client.field700 < client.field607) {
            client.field700 = client.field607;
         }

         client.field701 = (short)class150.field1580[class188.field1989 + 2];
         if (client.field701 <= 0) {
            client.field701 = 1;
         }

         client.field427 = (short)class150.field1580[class188.field1989 + 3];
         if (client.field427 <= 0) {
            client.field427 = 32767;
         } else if (client.field427 < client.field701) {
            client.field427 = client.field701;
         }

         return 1;
      } else if (var0 == 6203) {
         if (null != client.field686) {
            class250.method1233(0, 0, client.field686.field2230, client.field686.field2289, false);
            class150.field1580[++class188.field1989 - 1] = client.field705;
            class150.field1580[++class188.field1989 - 1] = client.field604;
         } else {
            class150.field1580[++class188.field1989 - 1] = -1;
            class150.field1580[++class188.field1989 - 1] = -1;
         }

         return 1;
      } else if (var0 == 6204) {
         class150.field1580[++class188.field1989 - 1] = client.field697;
         class150.field1580[++class188.field1989 - 1] = client.field589;
         return 1;
      } else if (var0 == 6205) {
         class150.field1580[++class188.field1989 - 1] = class231.method1162(client.field695);
         class150.field1580[++class188.field1989 - 1] = class231.method1162(client.field467);
         return 1;
      } else if (var0 == 6220) {
         class150.field1580[++class188.field1989 - 1] = 0;
         return 1;
      } else if (var0 == 6221) {
         class150.field1580[++class188.field1989 - 1] = 0;
         return 1;
      } else if (var0 == 6222) {
         class150.field1580[++class188.field1989 - 1] = class391.field3440;
         return 1;
      } else if (var0 == 6223) {
         class150.field1580[++class188.field1989 - 1] = class22.field161;
         return 1;
      } else {
         return 2;
      }
   }
}
