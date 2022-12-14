import io.spectralpowered.ObfInfo;
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

@ObfInfo(
	name = "j"
)
public class class192 {
	@ObfInfo(
		owner = "j",
		name = "q",
		desc = "Z"
	)
	boolean field1716;
	@ObfInfo(
		owner = "j",
		name = "f",
		desc = "Z"
	)
	boolean field1718;
	@ObfInfo(
		owner = "j",
		name = "v",
		desc = "Lpu;"
	)
	class373 field1715;
	@ObfInfo(
		owner = "j",
		name = "r",
		desc = "I"
	)
	int field1719;
	@ObfInfo(
		owner = "j",
		name = "x",
		desc = "Ljava/util/Map;"
	)
	Map field1720;
	@ObfInfo(
		owner = "j",
		name = "h",
		desc = "Ljavax/net/ssl/HttpsURLConnection;"
	)
	HttpsURLConnection field1717;
	@ObfInfo(
		owner = "j",
		name = "m",
		desc = "Lb;"
	)
	final class374 field1713;
	@ObfInfo(
		owner = "j",
		name = "e",
		desc = "Ljava/util/Map;"
	)
	final Map field1714;

	@ObfInfo(
		owner = "j",
		name = "<init>",
		desc = "(Ljava/net/URL;Lb;Z)V"
	)
	public class192(URL var1, class374 var2, boolean var3) throws IOException {
		this.field1716 = false;
		this.field1718 = false;
		this.field1719 = 300000;
		if (!var2.method1842()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method1843());
		} else {
			this.field1717 = (HttpsURLConnection)var1.openConnection();
			if (!var3) {
				HttpsURLConnection var4 = this.field1717;
				if (class225.field1924 == null) {
					class225.field1924 = new class225();
				}

				class225 var5 = class225.field1924;
				var4.setSSLSocketFactory(var5);
			}

			this.field1713 = var2;
			this.field1714 = new HashMap();
			this.field1720 = new HashMap();
		}
	}

	@ObfInfo(
		owner = "j",
		name = "h",
		desc = "(Ljava/lang/String;Ljava/lang/String;I)V"
	)
	public void method862(String var1, String var2) {
		if (!this.field1716) {
			this.field1714.put(var1, var2);
		}
	}

	@ObfInfo(
		owner = "j",
		name = "e",
		desc = "(I)Ljava/lang/String;"
	)
	String method861() {
		ArrayList var2 = new ArrayList(this.field1720.entrySet());
		Collections.sort(var2, new class362(this));
		StringBuilder var3 = new StringBuilder();
		Iterator var4 = var2.iterator();

		while (var4.hasNext()) {
			Entry var5 = (Entry)var4.next();
			if (var3.length() > 0) {
				var3.append(",");
			}

			var3.append(((class14)var5.getKey()).method71());
			float var6 = (Float)var5.getValue();
			if (var6 < 1.0F) {
				String var7 = Float.toString(var6).substring(0, 4);
				var3.append(";q=" + var7);
			}
		}

		return var3.toString();
	}

	@ObfInfo(
		owner = "j",
		name = "v",
		desc = "(I)V"
	)
	void method863() throws ProtocolException {
		if (!this.field1716) {
			this.field1717.setRequestMethod(this.field1713.method1843());
			if (!this.field1720.isEmpty()) {
				this.field1714.put("Accept", this.method861());
			}

			Iterator var2 = this.field1714.entrySet().iterator();

			while (var2.hasNext()) {
				Entry var3 = (Entry)var2.next();
				this.field1717.setRequestProperty((String)var3.getKey(), (String)var3.getValue());
			}

			if (this.field1713.method1844() && null != this.field1715) {
				this.field1717.setDoOutput(true);
				ByteArrayOutputStream var14 = new ByteArrayOutputStream();

				try {
					var14.write(this.field1715.method1841());
					var14.writeTo(this.field1717.getOutputStream());
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

			this.field1717.setConnectTimeout(this.field1719);
			this.field1717.setInstanceFollowRedirects(this.field1718);
			this.field1716 = true;
		}
	}

	@ObfInfo(
		owner = "j",
		name = "x",
		desc = "(I)Z"
	)
	boolean method864() throws IOException, SocketTimeoutException {
		if (!this.field1716) {
			this.method863();
		}

		this.field1717.connect();
		return this.field1717.getResponseCode() == -1;
	}

	@ObfInfo(
		owner = "j",
		name = "m",
		desc = "(B)Lp;"
	)
	class32 method865() {
		try {
			if (!this.field1716 || this.field1717.getResponseCode() == -1) {
				return new class32("No REST response has been received yet.");
			}
		} catch (IOException var11) {
			this.field1717.disconnect();
			return new class32("Error decoding REST response code: " + var11.getMessage());
		}

		class32 var2 = null;

		class32 var4;
		try {
			var2 = new class32(this.field1717);
			return var2;
		} catch (IOException var9) {
			var4 = new class32("Error decoding REST response: " + var9.getMessage());
		} finally {
			this.field1717.disconnect();
		}

		return var4;
	}

	@ObfInfo(
		owner = "j",
		name = "af",
		desc = "(ILbm;ZI)I"
	)
	static int method866(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class161.field1227 -= 2;
			client.field491 = (short)class483.method2377(class386.field3248[class161.field1227]);
			if (client.field491 <= 0) {
				client.field491 = 256;
			}

			client.field263 = (short)class483.method2377(class386.field3248[class161.field1227 + 1]);
			if (client.field263 <= 0) {
				client.field263 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class161.field1227 -= 2;
			client.field493 = (short)class386.field3248[class161.field1227];
			if (client.field493 <= 0) {
				client.field493 = 256;
			}

			client.field385 = (short)class386.field3248[1 + class161.field1227];
			if (client.field385 <= 0) {
				client.field385 = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class161.field1227 -= 4;
			client.field403 = (short)class386.field3248[class161.field1227];
			if (client.field403 <= 0) {
				client.field403 = 1;
			}

			client.field496 = (short)class386.field3248[class161.field1227 + 1];
			if (client.field496 <= 0) {
				client.field496 = 32767;
			} else if (client.field496 < client.field403) {
				client.field496 = client.field403;
			}

			client.field497 = (short)class386.field3248[class161.field1227 + 2];
			if (client.field497 <= 0) {
				client.field497 = 1;
			}

			client.field223 = (short)class386.field3248[class161.field1227 + 3];
			if (client.field223 <= 0) {
				client.field223 = 32767;
			} else if (client.field223 < client.field497) {
				client.field223 = client.field497;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (null != client.field482) {
				class398.method1970(0, 0, client.field482.field908, client.field482.field967, false);
				class386.field3248[++class161.field1227 - 1] = client.field501;
				class386.field3248[++class161.field1227 - 1] = client.field400;
			} else {
				class386.field3248[++class161.field1227 - 1] = -1;
				class386.field3248[++class161.field1227 - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			class386.field3248[++class161.field1227 - 1] = client.field493;
			class386.field3248[++class161.field1227 - 1] = client.field385;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			class386.field3248[++class161.field1227 - 1] = class348.method1757(client.field491);
			class386.field3248[++class161.field1227 - 1] = class348.method1757(client.field263);
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETX) {
			class386.field3248[++class161.field1227 - 1] = 0;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETY) {
			class386.field3248[++class161.field1227 - 1] = 0;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETWIDTH) {
			class386.field3248[++class161.field1227 - 1] = class427.field3529;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETHEIGHT) {
			class386.field3248[++class161.field1227 - 1] = class476.field4003;
			return 1;
		} else {
			return 2;
		}
	}
}
