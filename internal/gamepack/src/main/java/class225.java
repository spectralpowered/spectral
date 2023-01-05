import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfInfo(
   name = "k"
)
public class class225 extends SSLSocketFactory {
   @ObfInfo(
      owner = "k",
      name = "e",
      desc = "Lk;"
   )
   public static class225 field1924;
   @ObfInfo(
      owner = "k",
      name = "h",
      desc = "Ljava/security/SecureRandom;"
   )
   SecureRandom field1923 = new SecureRandom();

   static {
      if (Security.getProvider("BC") == null) {
         Security.addProvider(new BouncyCastleProvider());
      }

   }

   @ObfInfo(
      owner = "k",
      name = "createSocket",
      desc = "(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;"
   )
   public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
      if (null == var1) {
         var1 = new Socket();
      }

      if (!var1.isConnected()) {
         var1.connect(new InetSocketAddress(var2, var3));
      }

      TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field1923);
      return this.method990(var2, var5);
   }

   @ObfInfo(
      owner = "k",
      name = "getDefaultCipherSuites",
      desc = "()[Ljava/lang/String;"
   )
   public String[] getDefaultCipherSuites() {
      return null;
   }

   @ObfInfo(
      owner = "k",
      name = "getSupportedCipherSuites",
      desc = "()[Ljava/lang/String;"
   )
   public String[] getSupportedCipherSuites() {
      return null;
   }

   @ObfInfo(
      owner = "k",
      name = "createSocket",
      desc = "(Ljava/lang/String;I)Ljava/net/Socket;"
   )
   public Socket createSocket(String var1) throws IOException, UnknownHostException {
      return null;
   }

   @ObfInfo(
      owner = "k",
      name = "createSocket",
      desc = "(Ljava/net/InetAddress;I)Ljava/net/Socket;"
   )
   public Socket createSocket(InetAddress var1) throws IOException {
      return null;
   }

   @ObfInfo(
      owner = "k",
      name = "createSocket",
      desc = "(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;"
   )
   public Socket createSocket(String var1, int var2, InetAddress var3) throws IOException, UnknownHostException {
      return null;
   }

   @ObfInfo(
      owner = "k",
      name = "createSocket",
      desc = "(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;"
   )
   public Socket createSocket(InetAddress var1, int var2, InetAddress var3) throws IOException {
      return null;
   }

   @ObfInfo(
      owner = "k",
      name = "h",
      desc = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;"
   )
   SSLSocket method990(String var1, TlsClientProtocol var2) {
      return new class286(this, var2, var1);
   }

   @Override
   public Socket createSocket(String host, int port) throws IOException, UnknownHostException {
      return null;
   }

   @Override
   public Socket createSocket(String host, int port, InetAddress localHost, int localPort) throws IOException, UnknownHostException {
      return null;
   }

   @Override
   public Socket createSocket(InetAddress host, int port) throws IOException {
      return null;
   }

   @Override
   public Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
      return null;
   }
}
