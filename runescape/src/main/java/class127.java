import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class class127 extends class116 {
	public static int field1269;
	static class469[] field1267;
	static int field1266;
	final boolean field1271;

	public class127(boolean var1, int var2) {
		super(var2);
		this.field1271 = var1;
	}

	public static class165 method2404(int var0) {
		class165 var2 = (class165)class165.field1533.method5356((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class165.field1532.method6374(16, var0);
			var2 = new class165();
			if (var3 != null) {
				var2.method2770(new class467(var3));
			}

			class165.field1533.method5364(var2, (long)var0);
			return var2;
		}
	}

	void method2210(class117 var1) throws IOException {
		URLConnection var3 = null;

		try {
			String var4 = var1.field1175.getProtocol();
			if (var4.equals("http")) {
				var3 = this.method2403(var1);
			} else {
				if (!var4.equals("https")) {
					var1.field1176 = true;
					return;
				}

				var3 = this.method2402(var1);
			}

			this.method2218(var3, var1);
		} catch (IOException var8) {
		} finally {
			var1.field1176 = true;
			if (var3 != null) {
				if (var3 instanceof HttpURLConnection) {
					((HttpURLConnection)var3).disconnect();
				} else if (var3 instanceof HttpsURLConnection) {
					((HttpsURLConnection)var3).disconnect();
				}
			}

		}

	}

	public static class284 method2407() {
		return class284.field3322 == 0 ? new class284() : class284.field3319[--class284.field3322];
	}

	URLConnection method2403(class117 var1) throws IOException {
		URLConnection var3 = var1.field1175.openConnection();
		this.method2211(var3);
		return var3;
	}

	URLConnection method2402(class117 var1) throws IOException {
		HttpsURLConnection var3 = (HttpsURLConnection)var1.field1175.openConnection();
		if (!this.field1271) {
			if (null == class11.field69) {
				class11.field69 = new class11();
			}

			class11 var5 = class11.field69;
			var3.setSSLSocketFactory(var5);
		}

		this.method2211(var3);
		return var3;
	}

	public static String method2408(String var0) {
		StringBuilder var2 = new StringBuilder(var0.length());
		int var3 = 0;
		int var4 = -1;

		for (int var5 = 0; var5 < var0.length(); ++var5) {
			char var6 = var0.charAt(var5);
			if (var6 == '<') {
				var2.append(var0.substring(var3, var5));
				var4 = var5;
			} else if (var6 == '>' && var4 != -1) {
				String var7 = var0.substring(var4 + 1, var5);
				var4 = -1;
				if (var7.equals("lt")) {
					var2.append("<");
				} else if (var7.equals("gt")) {
					var2.append(">");
				} else if (var7.equals("br")) {
					var2.append("\n");
				}

				var3 = var5 + 1;
			}
		}

		if (var3 < var0.length()) {
			var2.append(var0.substring(var3, var0.length()));
		}

		return var2.toString();
	}

	static int method2410(class78 var0, class78 var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var5 = var0.field715;
			int var6 = var1.field715;
			if (!var3) {
				if (var5 == -1) {
					var5 = 2001;
				}

				if (var6 == -1) {
					var6 = 2001;
				}
			}

			return var5 - var6;
		} else if (var2 == 2) {
			return var0.field717 - var1.field717;
		} else if (var2 == 3) {
			if (var0.field711.equals("-")) {
				if (var1.field711.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.field711.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.field711.compareTo(var1.field711);
			}
		} else if (var2 == 4) {
			return var0.method1536() ? (var1.method1536() ? 0 : 1) : (var1.method1536() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1573() ? (var1.method1573() ? 0 : 1) : (var1.method1573() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.method1535() ? (var1.method1535() ? 0 : 1) : (var1.method1535() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.method1533() ? (var1.method1533() ? 0 : 1) : (var1.method1533() ? -1 : 0);
		} else {
			return var0.field708 - var1.field708;
		}
	}
}
