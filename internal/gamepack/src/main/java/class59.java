import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@ObfInfo(
   name = "pn"
)
public class class59 implements class373 {
   @ObfInfo(
      owner = "pn",
      name = "e",
      desc = "Ljava/util/Map;"
   )
   final Map field598;

   @ObfInfo(
      owner = "pn",
      name = "<init>",
      desc = "(Ljava/util/Map;)V"
   )
   public class59(Map var1) {
      this.field598 = var1;
   }

   @ObfInfo(
      owner = "pn",
      name = "h",
      desc = "(B)[B"
   )
   public byte[] method1841() throws UnsupportedEncodingException {
      return this.method277().getBytes("UTF-8");
   }

   @ObfInfo(
      owner = "pn",
      name = "v",
      desc = "(I)Ljava/lang/String;"
   )
   public String method277() throws UnsupportedEncodingException {
      StringBuilder var2 = new StringBuilder();
      Iterator var3 = this.field598.entrySet().iterator();

      while(var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         String var5 = URLEncoder.encode((String)var4.getKey(), "UTF-8");
         String var6 = URLEncoder.encode((String)var4.getValue(), "UTF-8");
         var2.append(var5).append("=").append(var6).append("&");
      }

      if (var2.length() == 0) {
         return "";
      } else {
         var2.deleteCharAt(var2.length() - 1);
         var2.insert(0, "?");
         return var2.toString();
      }
   }
}
