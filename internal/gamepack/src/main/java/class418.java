import io.spectralpowered.ObfInfo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import java.util.concurrent.ScheduledExecutorService;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfInfo(
	name = "g"
)
class class418 implements TlsAuthentication {
	@ObfInfo(
		owner = "g",
		name = "q",
		desc = "[I"
	)
	public static int[] field3431;
	@ObfInfo(
		owner = "g",
		name = "r",
		desc = "Ljava/util/concurrent/ScheduledExecutorService;"
	)
	static ScheduledExecutorService field3432;
	// $FF: synthetic field
	@ObfInfo(
		owner = "g",
		name = "this$2",
		desc = "Lo;"
	)
	final class319 this$2;

	@ObfInfo(
		owner = "g",
		name = "<init>",
		desc = "(Lo;)V"
	)
	class418(class319 var1) {
		this.this$2 = var1;
	}

	@ObfInfo(
		owner = "g",
		name = "notifyServerCertificate",
		desc = "(Lorg/bouncycastle/crypto/tls/Certificate;)V"
	)
	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field2365 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@ObfInfo(
		owner = "g",
		name = "getClientCredentials",
		desc = "(Lorg/bouncycastle/crypto/tls/CertificateRequest;)Lorg/bouncycastle/crypto/tls/TlsCredentials;"
	)
	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfInfo(
		owner = "g",
		name = "jk",
		desc = "(IIIIIIIIIII)V"
	)
	static final void method2018(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		class138 var11 = null;

		for (class138 var12 = (class138)client.field450.method646(); var12 != null; var12 = (class138)client.field450.method648()) {
			if (var0 == var12.field1122 && var12.field1118 == var1 && var12.field1129 == var2 && var3 == var12.field1128) {
				var11 = var12;
				break;
			}
		}

		if (var11 == null) {
			var11 = new class138();
			var11.field1122 = var0;
			var11.field1128 = var3;
			var11.field1118 = var1;
			var11.field1129 = var2;
			class443.method2197(var11);
			client.field450.method642(var11);
		}

		var11.field1125 = var4;
		var11.field1127 = var5;
		var11.field1126 = var6;
		var11.field1120 = var8;
		var11.field1130 = var9;
		var11.method634(var7);
	}
}
