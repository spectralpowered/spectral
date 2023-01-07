import io.spectralpowered.ObfInfo;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.DefaultTlsClient;
import org.bouncycastle.crypto.tls.TlsAuthentication;

@ObfInfo(
	name = "o"
)
class class319 extends DefaultTlsClient {
	@ObfInfo(
		owner = "o",
		name = "s",
		desc = "I"
	)
	static int field2552;
	// $FF: synthetic field
	@ObfInfo(
		owner = "o",
		name = "this$1",
		desc = "Li;"
	)
	final class286 this$1;

	@ObfInfo(
		owner = "o",
		name = "<init>",
		desc = "(Li;)V"
	)
	class319(class286 var1) {
		this.this$1 = var1;
	}

	@ObfInfo(
		owner = "o",
		name = "getClientExtensions",
		desc = "()Ljava/util/Hashtable;"
	)
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
		var1.put(0, var3.toByteArray());
		return var1;
	}

	@ObfInfo(
		owner = "o",
		name = "getAuthentication",
		desc = "()Lorg/bouncycastle/crypto/tls/TlsAuthentication;"
	)
	public TlsAuthentication getAuthentication() throws IOException {
		return new class418(this);
	}

	@ObfInfo(
		owner = "o",
		name = "ap",
		desc = "(Ljava/lang/String;I)I"
	)
	public static int method1614(String var0) {
		return var0.length() + 1;
	}
}
