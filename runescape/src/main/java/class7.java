import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;

import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

class class7 implements TlsAuthentication {
	public static int[] field44;
	static ScheduledExecutorService field45;
	// $FF: synthetic field
	final class15 this$2;

	class7(class15 var1) {
		this.this$2 = var1;
	}

	static final void method56(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		class91 var11 = null;

		for (class91 var12 = (class91)client.field1919.method6577(); var12 != null; var12 = (class91)client.field1919.method6579()) {
			if (var0 == var12.field867 && var12.field863 == var1 && var12.field875 == var2 && var3 == var12.field874) {
				var11 = var12;
				break;
			}
		}

		if (var11 == null) {
			var11 = new class91();
			var11.field867 = var0;
			var11.field874 = var3;
			var11.field863 = var1;
			var11.field875 = var2;
			class126.method2400(var11);
			client.field1919.method6572(var11);
		}

		var11.field870 = var4;
		var11.field872 = var5;
		var11.field871 = var6;
		var11.field865 = var8;
		var11.field876 = var9;
		var11.method1959(var7);
	}

	@Override
	public void notifyServerCertificate(Certificate serverCertificate) throws IOException {

	}

	@Override
	public TlsCredentials getClientCredentials(CertificateRequest certificateRequest) throws IOException {
		return null;
	}
}
