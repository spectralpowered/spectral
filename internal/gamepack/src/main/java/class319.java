import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

class class319 extends DefaultTlsClient {
   static int field2552;
   // $FF: synthetic field
   final class286 this$1;

   class319(class286 var1) {
      this.this$1 = var1;
   }

   public Hashtable getClientExtensions() throws IOException {
      Hashtable var1 = super.getClientExtensions();
      if (null == var1) {
         var1 = new Hashtable();
      }

      byte[] var2 = this.this$1.val$host.getBytes();
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      DataOutputStream var4 = new DataOutputStream(var3);
      var4.writeShort(3 + var2.length);
      var4.writeByte(0);
      var4.writeShort(var2.length);
      var4.write(var2);
      var4.close();
      var1.put(Integer.valueOf(0), var3.toByteArray());
      return var1;
   }

   public TlsAuthentication getAuthentication() throws IOException {
      return new class418(this);
   }

   public static int method1614(String var0) {
      return var0.length() + 1;
   }
}
