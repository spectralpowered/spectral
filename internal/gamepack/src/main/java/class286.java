import io.spectralpowered.ObfInfo;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfInfo(
	name = "i"
)
class class286 extends SSLSocket {
	@ObfInfo(
		owner = "i",
		name = "h",
		desc = "[Ljava/security/cert/Certificate;"
	)
	Certificate[] field2365;
	// $FF: synthetic field
	@ObfInfo(
		owner = "i",
		name = "this$0",
		desc = "Lk;"
	)
	final class225 this$0;
	// $FF: synthetic field
	@ObfInfo(
		owner = "i",
		name = "val$host",
		desc = "Ljava/lang/String;"
	)
	final String val$host;
	// $FF: synthetic field
	@ObfInfo(
		owner = "i",
		name = "val$tlsClientProtocol",
		desc = "Lorg/bouncycastle/crypto/tls/TlsClientProtocol;"
	)
	final TlsClientProtocol val$tlsClientProtocol;

	@ObfInfo(
		owner = "i",
		name = "<init>",
		desc = "(Lk;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class286(class225 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	@ObfInfo(
		owner = "i",
		name = "getInputStream",
		desc = "()Ljava/io/InputStream;"
	)
	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfInfo(
		owner = "i",
		name = "getOutputStream",
		desc = "()Ljava/io/OutputStream;"
	)
	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfInfo(
		owner = "i",
		name = "close",
		desc = "()V"
	)
	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	@ObfInfo(
		owner = "i",
		name = "addHandshakeCompletedListener",
		desc = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfInfo(
		owner = "i",
		name = "getEnableSessionCreation",
		desc = "()Z"
	)
	public boolean getEnableSessionCreation() {
		return false;
	}

	@ObfInfo(
		owner = "i",
		name = "getEnabledCipherSuites",
		desc = "()[Ljava/lang/String;"
	)
	public String[] getEnabledCipherSuites() {
		return null;
	}

	@ObfInfo(
		owner = "i",
		name = "getEnabledProtocols",
		desc = "()[Ljava/lang/String;"
	)
	public String[] getEnabledProtocols() {
		return null;
	}

	@ObfInfo(
		owner = "i",
		name = "getNeedClientAuth",
		desc = "()Z"
	)
	public boolean getNeedClientAuth() {
		return false;
	}

	@ObfInfo(
		owner = "i",
		name = "getSession",
		desc = "()Ljavax/net/ssl/SSLSession;"
	)
	public SSLSession getSession() {
		return new class391(this);
	}

	@ObfInfo(
		owner = "i",
		name = "getSupportedProtocols",
		desc = "()[Ljava/lang/String;"
	)
	public String[] getSupportedProtocols() {
		return null;
	}

	@ObfInfo(
		owner = "i",
		name = "getSupportedCipherSuites",
		desc = "()[Ljava/lang/String;"
	)
	public String[] getSupportedCipherSuites() {
		return null;
	}

	@ObfInfo(
		owner = "i",
		name = "getUseClientMode",
		desc = "()Z"
	)
	public boolean getUseClientMode() {
		return false;
	}

	@ObfInfo(
		owner = "i",
		name = "getWantClientAuth",
		desc = "()Z"
	)
	public boolean getWantClientAuth() {
		return false;
	}

	@ObfInfo(
		owner = "i",
		name = "removeHandshakeCompletedListener",
		desc = "(Ljavax/net/ssl/HandshakeCompletedListener;)V"
	)
	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfInfo(
		owner = "i",
		name = "setEnableSessionCreation",
		desc = "(Z)V"
	)
	public void setEnableSessionCreation(boolean var1) {
	}

	@ObfInfo(
		owner = "i",
		name = "setEnabledCipherSuites",
		desc = "([Ljava/lang/String;)V"
	)
	public void setEnabledCipherSuites(String[] var1) {
	}

	@ObfInfo(
		owner = "i",
		name = "setEnabledProtocols",
		desc = "([Ljava/lang/String;)V"
	)
	public void setEnabledProtocols(String[] var1) {
	}

	@ObfInfo(
		owner = "i",
		name = "setNeedClientAuth",
		desc = "(Z)V"
	)
	public void setNeedClientAuth(boolean var1) {
	}

	@ObfInfo(
		owner = "i",
		name = "setUseClientMode",
		desc = "(Z)V"
	)
	public void setUseClientMode(boolean var1) {
	}

	@ObfInfo(
		owner = "i",
		name = "setWantClientAuth",
		desc = "(Z)V"
	)
	public void setWantClientAuth(boolean var1) {
	}

	@ObfInfo(
		owner = "i",
		name = "startHandshake",
		desc = "()V"
	)
	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class319(this));
	}

	@ObfInfo(
		owner = "i",
		name = "h",
		desc = "(J)V"
	)
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

	@ObfInfo(
		owner = "i",
		name = "x",
		desc = "(IIIIB)V"
	)
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
			for (var8 = 0; var8 < var5.field1753.length; ++var8) {
				var6[var8] = var5.field1753[var8];
				var7[var8] = var5.field1754[var8];
			}

			for (var8 = var5.field1753.length; var8 < var1; ++var8) {
				var6[var8] = -1;
				var7[var8] = 0;
			}

			var5.field1753 = var6;
			var5.field1754 = var7;
		}

		var5.field1753[var1] = var2;
		var5.field1754[var1] = var3;
	}

	@ObfInfo(
		owner = "i",
		name = "e",
		desc = "(Ljava/lang/String;IB)Z"
	)
	static boolean method1418(String var0, int var1) {
		return class121.method513(var0, var1, "openjs");
	}

	@ObfInfo(
		owner = "i",
		name = "t",
		desc = "(II)V"
	)
	static void method1419(int var0) {
		if (var0 != class359.field3075) {
			class359.field3075 = var0;
		}
	}
}
