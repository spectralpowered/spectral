import io.spectralpowered.ObfInfo;
import java.applet.Applet;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(
	name = "pf"
)
public class class126 implements class373 {
	@ObfInfo(
		owner = "pf",
		name = "h",
		desc = "Ljava/applet/Applet;"
	)
	public static Applet field1068;
	@ObfInfo(
		owner = "pf",
		name = "ao",
		desc = "Lly;"
	)
	static class274 field1066;
	@ObfInfo(
		owner = "pf",
		name = "v",
		desc = "Lorg/json/JSONObject;"
	)
	JSONObject field1067;

	@ObfInfo(
		owner = "pf",
		name = "<init>",
		desc = "(Ljava/lang/String;)V"
	)
	public class126(String var1) throws UnsupportedEncodingException {
		this.method527(var1);
	}

	@ObfInfo(
		owner = "pf",
		name = "<init>",
		desc = "([B)V"
	)
	public class126(byte[] var1) throws UnsupportedEncodingException {
		this.method530(var1);
	}

	@ObfInfo(
		owner = "pf",
		name = "v",
		desc = "([BI)V"
	)
	void method530(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method527(var3);
	}

	@ObfInfo(
		owner = "pf",
		name = "x",
		desc = "(Ljava/lang/String;I)V"
	)
	void method527(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field1067 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.field1067 = new JSONObject();
				this.field1067.put("arrayValues", (Object)var3);
			}

		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	@ObfInfo(
		owner = "pf",
		name = "m",
		desc = "(I)Lorg/json/JSONObject;"
	)
	public JSONObject method528() {
		return this.field1067;
	}

	@ObfInfo(
		owner = "pf",
		name = "h",
		desc = "(B)[B"
	)
	public byte[] method1841() throws UnsupportedEncodingException {
		return this.field1067 == null ? new byte[0] : this.field1067.toString().getBytes("UTF-8");
	}
}
