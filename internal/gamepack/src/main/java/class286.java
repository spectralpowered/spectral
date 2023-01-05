import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class class286 extends SSLSocket {
   Certificate[] field2365;
   // $FF: synthetic field
   final class225 this$0;
   // $FF: synthetic field
   final String val$host;
   // $FF: synthetic field
   final TlsClientProtocol val$tlsClientProtocol;

   class286(class225 var1, TlsClientProtocol var2, String var3) {
      this.this$0 = var1;
      this.val$tlsClientProtocol = var2;
      this.val$host = var3;
   }

   public InputStream getInputStream() throws IOException {
      return this.val$tlsClientProtocol.getInputStream();
   }

   public OutputStream getOutputStream() throws IOException {
      return this.val$tlsClientProtocol.getOutputStream();
   }

   public synchronized void close() throws IOException {
      this.val$tlsClientProtocol.close();
   }

   public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public boolean getEnableSessionCreation() {
      return false;
   }

   public String[] getEnabledCipherSuites() {
      return null;
   }

   public String[] getEnabledProtocols() {
      return null;
   }

   public boolean getNeedClientAuth() {
      return false;
   }

   public SSLSession getSession() {
      return new class391(this);
   }

   public String[] getSupportedProtocols() {
      return null;
   }

   public String[] getSupportedCipherSuites() {
      return null;
   }

   public boolean getUseClientMode() {
      return false;
   }

   public boolean getWantClientAuth() {
      return false;
   }

   public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
   }

   public void setEnableSessionCreation(boolean var1) {
   }

   public void setEnabledCipherSuites(String[] var1) {
   }

   public void setEnabledProtocols(String[] var1) {
   }

   public void setNeedClientAuth(boolean var1) {
   }

   public void setUseClientMode(boolean var1) {
   }

   public void setWantClientAuth(boolean var1) {
   }

   public void startHandshake() throws IOException {
      this.val$tlsClientProtocol.connect(new class319(this));
   }

   public static final void method1421(long var0) {
      if (var0 > 0L) {
         if (var0 % 10L == 0L) {
            class50.method257(var0 - 1L);
            class50.method257(1L);
         } else {
            class50.method257(var0);
         }

      }
   }

   static void method1420(int var0, int var1, int var2, int var3) {
      class201 var5 = (class201)class201.field1755.method791((long)var0);
      if (null == var5) {
         var5 = new class201();
         class201.field1755.method788(var5, (long)var0);
      }

      if (var5.field1753.length <= var1) {
         int[] var6 = new int[var1 + 1];
         int[] var7 = new int[var1 + 1];

         int var8;
         for(var8 = 0; var8 < var5.field1753.length; ++var8) {
            var6[var8] = var5.field1753[var8];
            var7[var8] = var5.field1754[var8];
         }

         for(var8 = var5.field1753.length; var8 < var1; ++var8) {
            var6[var8] = -1;
            var7[var8] = 0;
         }

         var5.field1753 = var6;
         var5.field1754 = var7;
      }

      var5.field1753[var1] = var2;
      var5.field1754[var1] = var3;
   }

   static boolean method1418(String var0, int var1) {
      return class121.method513(var0, var1, "openjs");
   }

   static void method1419(int var0) {
      if (var0 != class359.field3075) {
         class359.field3075 = var0;
      }
   }
}
