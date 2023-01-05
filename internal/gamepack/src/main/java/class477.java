import java.applet.Applet;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class477 implements class464 {
   public static Applet field3970;
   static class164 field3968;
   JSONObject field3969;

   public class477(String var1) throws UnsupportedEncodingException {
      this.method2307(var1);
   }

   public class477(byte[] var1) throws UnsupportedEncodingException {
      this.method2309(var1);
   }

   void method2309(byte[] var1) throws UnsupportedEncodingException {
      String var3 = new String(var1, "UTF-8");
      this.method2307(var3);
   }

   void method2307(String var1) throws UnsupportedEncodingException {
      try {
         if (var1.charAt(0) == '{') {
            this.field3969 = new JSONObject(var1);
         } else {
            if (var1.charAt(0) != '[') {
               throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
            }

            JSONArray var3 = new JSONArray(var1);
            this.field3969 = new JSONObject();
            this.field3969.put("arrayValues", (Object)var3);
         }

      } catch (JSONException var4) {
         throw new UnsupportedEncodingException(var4.getMessage());
      }
   }

   public JSONObject method2308() {
      return this.field3969;
   }

   public byte[] method2278() throws UnsupportedEncodingException {
      return this.field3969 == null ? new byte[0] : this.field3969.toString().getBytes("UTF-8");
   }
}
