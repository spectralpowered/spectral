import java.applet.Applet;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class422 implements class437 {
	public static Applet field4723;
	static class337 field4721;
	JSONObject field4722;

	public class422(String var1) throws UnsupportedEncodingException {
		this.method7907(var1);
	}

	public class422(byte[] var1) throws UnsupportedEncodingException {
		this.method7914(var1);
	}

	void method7914(byte[] var1) throws UnsupportedEncodingException {
		String var3 = new String(var1, "UTF-8");
		this.method7907(var3);
	}

	void method7907(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4722 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') {
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder.");
				}

				JSONArray var3 = new JSONArray(var1);
				this.field4722 = new JSONObject();
				this.field4722.put("arrayValues", (Object)var3);
			}

		} catch (JSONException var4) {
			throw new UnsupportedEncodingException(var4.getMessage());
		}
	}

	public JSONObject method7908() {
		return this.field4722;
	}

	public byte[] method7981() throws UnsupportedEncodingException {
		return this.field4722 == null ? new byte[0] : this.field4722.toString().getBytes("UTF-8");
	}
}
