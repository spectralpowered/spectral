import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

class class9 extends SSLSocket {
	Certificate[] field55;
	// $FF: synthetic field
	final class11 this$0;
	// $FF: synthetic field
	final String val$host;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;

	static void method114(int var0, int var1, int var2, int var3) {
		class81 var5 = (class81)class81.field749.method8177((long)var0);
		if (null == var5) {
			var5 = new class81();
			class81.field749.method8170(var5, (long)var0);
		}

		if (var5.field747.length <= var1) {
			int[] var6 = new int[var1 + 1];
			int[] var7 = new int[var1 + 1];

			int var8;
			for (var8 = 0; var8 < var5.field747.length; ++var8) {
				var6[var8] = var5.field747[var8];
				var7[var8] = var5.field748[var8];
			}

			for (var8 = var5.field747.length; var8 < var1; ++var8) {
				var6[var8] = -1;
				var7[var8] = 0;
			}

			var5.field747 = var6;
			var5.field748 = var7;
		}

		var5.field747[var1] = var2;
		var5.field748[var1] = var3;
	}

	class9(class11 var1, TlsClientProtocol var2, String var3) {
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
		return new class19(this);
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
		this.val$tlsClientProtocol.connect(new class15(this));
	}
}
