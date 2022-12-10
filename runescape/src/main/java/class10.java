import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;

public class class10 {
	boolean field61;
	boolean field64;
	class437 field60;
	int field65;
	Map field67;
	HttpsURLConnection field63;
	final class2 field58;
	final Map field59;

	public class10(URL var1, class2 var2, boolean var3) throws IOException {
		this.field61 = false;
		this.field64 = false;
		this.field65 = 300000;
		if (!var2.method7()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method8());
		} else {
			this.field63 = (HttpsURLConnection)var1.openConnection();
			if (!var3) {
				HttpsURLConnection var4 = this.field63;
				if (class11.field69 == null) {
					class11.field69 = new class11();
				}

				class11 var5 = class11.field69;
				var4.setSSLSocketFactory(var5);
			}

			this.field58 = var2;
			this.field59 = new HashMap();
			this.field67 = new HashMap();
		}
	}

	public void method118(String var1, String var2) {
		if (!this.field61) {
			this.field59.put(var1, var2);
		}
	}

	String method116() {
		ArrayList var2 = new ArrayList(this.field67.entrySet());
		Collections.sort(var2, new class12(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((class424)var5.getKey()).method7922());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = Float.toString(var6).substring(0, 4);
				var3.append(";q=" + var7);
			}
		}

		return var3.toString();
	}

	void method119() throws ProtocolException {
		if (!this.field61) {
			this.field63.setRequestMethod(this.field58.method8());
			if (!this.field67.isEmpty()) {
				this.field59.put("Accept", this.method116());
			}

			Iterator var2 = this.field59.entrySet().iterator();

			while (var2.hasNext()) {
				Entry var3 = (Entry)var2.next();
				this.field63.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
			}

			if (this.field58.method9() && null != this.field60) {
				this.field63.setDoOutput(true);
				ByteArrayOutputStream var14 = new ByteArrayOutputStream();

				try {
					var14.write(this.field60.method7981());
					var14.writeTo(this.field63.getOutputStream());
				} catch (IOException var12) {
					var12.printStackTrace();
				} finally {
					if (null != var14) {
						try {
							var14.close();
						} catch (IOException var11) {
							var11.printStackTrace();
						}
					}

				}
			}

			this.field63.setConnectTimeout(this.field65);
			this.field63.setInstanceFollowRedirects(this.field64);
			this.field61 = true;
		}
	}

	boolean method120() throws IOException, SocketTimeoutException {
		if (!this.field61) {
			this.method119();
		}

		this.field63.connect();
		return this.field63.getResponseCode() == -1;
	}

	class16 method121() {
		try {
			if (!this.field61 || this.field63.getResponseCode() == -1) {
				return new class16("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.field63.disconnect();
			return new class16("Error decoding REST response code: " + var11.getMessage());
		}

		class16 var2 = null;

		class16 var4;
		try {
			var2 = new class16(this.field63);
			return var2;
		} catch (IOException var9) {
			var4 = new class16("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.field63.disconnect();
		}

		return var4;
	}

	static int method132(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.VIEWPORT_SETFOV) {
			class94.field920 -= 2;
			client.field1960 = (short)class69.method2092(class69.field579[class94.field920]);
			if (client.field1960 <= 0) {
				client.field1960 = 256;
			}

			client.field1732 = (short)class69.method2092(class69.field579[class94.field920 + 1]);
			if (client.field1732 <= 0) {
				client.field1732 = 256;
			}

			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_SETZOOM) {
			class94.field920 -= 2;
			client.field1962 = (short)class69.field579[class94.field920];
			if (client.field1962 <= 0) {
				client.field1962 = 256;
			}

			client.field1854 = (short)class69.field579[1 + class94.field920];
			if (client.field1854 <= 0) {
				client.field1854 = 320;
			}

			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_CLAMPFOV) {
			class94.field920 -= 4;
			client.field1872 = (short)class69.field579[class94.field920];
			if (client.field1872 <= 0) {
				client.field1872 = 1;
			}

			client.field1965 = (short)class69.field579[class94.field920 + 1];
			if (client.field1965 <= 0) {
				client.field1965 = 32767;
			} else if (client.field1965 < client.field1872) {
				client.field1965 = client.field1872;
			}

			client.field1966 = (short)class69.field579[class94.field920 + 2];
			if (client.field1966 <= 0) {
				client.field1966 = 1;
			}

			client.field1692 = (short)class69.field579[class94.field920 + 3];
			if (client.field1692 <= 0) {
				client.field1692 = 32767;
			} else if (client.field1692 < client.field1966) {
				client.field1692 = client.field1966;
			}

			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (null != client.field1951) {
				class133.method2479(0, 0, client.field1951.field3414, client.field1951.field3474, false);
				class69.field579[++class94.field920 - 1] = client.field1970;
				class69.field579[++class94.field920 - 1] = client.field1869;
			} else {
				class69.field579[++class94.field920 - 1] = -1;
				class69.field579[++class94.field920 - 1] = -1;
			}

			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_GETZOOM) {
			class69.field579[++class94.field920 - 1] = client.field1962;
			class69.field579[++class94.field920 - 1] = client.field1854;
			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_GETFOV) {
			class69.field579[++class94.field920 - 1] = class69.method6266(client.field1960);
			class69.field579[++class94.field920 - 1] = class69.method6266(client.field1732);
			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_GETX) {
			class69.field579[++class94.field920 - 1] = 0;
			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_GETY) {
			class69.field579[++class94.field920 - 1] = 0;
			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_GETWIDTH) {
			class69.field579[++class94.field920 - 1] = class205.field2337;
			return 1;
		} else if (var0 == CS2Opcodes.VIEWPORT_GETHEIGHT) {
			class69.field579[++class94.field920 - 1] = class340.field4263;
			return 1;
		} else {
			return 2;
		}
	}
}
