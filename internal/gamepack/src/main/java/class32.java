import io.spectralpowered.ObfInfo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

@ObfInfo(
	name = "p"
)
public class class32 {
	@ObfInfo(
		owner = "p",
		name = "ei",
		desc = "Lln;"
	)
	static class38 field176;
	@ObfInfo(
		owner = "p",
		name = "ov",
		desc = "I"
	)
	static int field177;
	@ObfInfo(
		owner = "p",
		name = "h",
		desc = "I"
	)
	final int field174;
	@ObfInfo(
		owner = "p",
		name = "e",
		desc = "Ljava/lang/String;"
	)
	final String field175;

	@ObfInfo(
		owner = "p",
		name = "<init>",
		desc = "(Ljava/net/HttpURLConnection;)V"
	)
	class32(HttpURLConnection var1) throws IOException {
		this.field174 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field174 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (null != var3) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field175 = var2.toString();
	}

	@ObfInfo(
		owner = "p",
		name = "<init>",
		desc = "(Ljava/lang/String;)V"
	)
	class32(String var1) {
		this.field174 = 400;
		this.field175 = "";
	}

	@ObfInfo(
		owner = "p",
		name = "h",
		desc = "(I)I"
	)
	public int method138() {
		return this.field174;
	}

	@ObfInfo(
		owner = "p",
		name = "e",
		desc = "(I)Ljava/lang/String;"
	)
	public String method139() {
		return this.field175;
	}

	@ObfInfo(
		owner = "p",
		name = "e",
		desc = "(IB)Lgh;"
	)
	public static class313 method140(int var0) {
		class313 var2 = (class313)class313.field2470.method394((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class33.field178.method1365(1, var0);
			var2 = new class313();
			if (var3 != null) {
				var2.method1511(new class127(var3), var0);
			}

			var2.method1508();
			class313.field2470.method396(var2, (long)var0);
			return var2;
		}
	}
}
