import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class class16 {
	static class326 field98;
	static int field99;
	final int field96;
	final String field97;

	class16(HttpURLConnection var1) throws IOException {
		this.field96 = var1.getResponseCode();
		var1.getResponseMessage();
		var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.field96 >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (null != var3) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.field97 = var2.toString();
	}

	public static class190 method200(int var0) {
		class190 var2 = (class190)class190.field2063.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class261.field3018.method6374(1, var0);
			var2 = new class190();
			if (var3 != null) {
				var2.method3639(new class467(var3), var0);
			}

			var2.method3628();
			class190.field2063.method5364(var2, (long)var0);
			return var2;
		}
	}

	class16(String var1) {
		this.field96 = 400;
		this.field97 = "";
	}

	public int method193() {
		return this.field96;
	}

	public String method194() {
		return this.field97;
	}
}
