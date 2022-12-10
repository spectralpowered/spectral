import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class class167 {
	class117 field1557;
	float[] field1551;
	int field1554;
	String field1550;
	String field1555;
	ArrayList field1556;
	ArrayList field1559;
	ArrayList field1560;
	Map field1562;
	Map field1563;

	public class167() {
		this.field1554 = -1;
		this.field1550 = null;
		this.field1551 = new float[4];
		this.field1559 = new ArrayList();
		this.field1560 = new ArrayList();
		this.field1556 = new ArrayList();
		this.field1562 = new HashMap();
		this.field1563 = new HashMap();
	}

	public boolean method2807(String var1, class116 var2) {
		if (null != var1 && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method2822();

				try {
					this.field1555 = var1;
					this.field1557 = var2.method2213(new URL(this.field1555));
					this.field1554 = 0;
					return true;
				} catch (MalformedURLException var5) {
					this.method2822();
					this.field1554 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	public void method2808(class116 var1) {
		switch(this.field1554) {
		case 0:
			this.method2817(var1);
			break;
		case 1:
			this.method2818();
			break;
		default:
			return;
		}

	}

	public int method2809() {
		return this.field1554;
	}

	public int method2810(String var1) {
		return this.field1562.containsKey(var1) ? (Integer)this.field1562.get(var1) : -1;
	}

	public String method2811(String var1) {
		return (String)((String)(this.field1563.containsKey(var1) ? this.field1563.get(var1) : null));
	}

	public ArrayList method2820() {
		return this.field1560;
	}

	public ArrayList method2813() {
		return this.field1556;
	}

	public String method2814() {
		return this.field1550;
	}

	public ArrayList method2815() {
		return this.field1559;
	}

	void method2822() {
		this.field1557 = null;
		this.field1550 = null;
		this.field1551[0] = 0.0F;
		this.field1551[1] = 0.0F;
		this.field1551[2] = 1.0F;
		this.field1551[3] = 1.0F;
		this.field1559.clear();
		this.field1560.clear();
		this.field1556.clear();
		this.field1562.clear();
		this.field1563.clear();
	}

	void method2817(class116 var1) {
		if (this.field1557 != null && this.field1557.method2242()) {
			byte[] var3 = this.field1557.method2239();
			if (null == var3) {
				this.method2822();
				this.field1554 = 100;
			} else {
				JSONObject var4;
				try {
					class422 var5 = new class422(var3);
					var4 = var5.method7908();
					var4 = var4.getJSONObject("message");
				} catch (Exception var10) {
					this.method2822();
					this.field1554 = 102;
					return;
				}

				try {
					this.method2819(var4.getJSONArray("images"), var1);
				} catch (Exception var9) {
					this.field1560.clear();
				}

				try {
					this.method2850(var4.getJSONArray("labels"));
				} catch (Exception var8) {
					this.field1556.clear();
				}

				try {
					this.method2851(var4.getJSONObject("behaviour"));
				} catch (Exception var7) {
					this.field1550 = null;
					this.field1551[0] = 0.0F;
					this.field1551[1] = 0.0F;
					this.field1551[2] = 1.0F;
					this.field1551[3] = 1.0F;
					this.field1559.clear();
				}

				try {
					this.method2833(var4.getJSONObject("meta"));
				} catch (Exception var6) {
					this.field1562.clear();
					this.field1563.clear();
				}

				this.field1554 = this.field1560.size() > 0 ? 1 : 2;
				this.field1557 = null;
			}
		}
	}

	void method2818() {
		Iterator var2 = this.field1560.iterator();

		class175 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field1560.iterator();

				while (var2.hasNext()) {
					var3 = (class175)var2.next();
					if (null != var3.field1638) {
						byte[] var4 = var3.field1638.method2239();
						if (var4 != null && var4.length > 0) {
							this.field1554 = 2;
							return;
						}
					}
				}

				this.method2822();
				this.field1554 = 101;
				return;
			}

			var3 = (class175)var2.next();
		} while(var3.field1638 == null || var3.field1638.method2242());

	}

	void method2819(JSONArray var1, class116 var2) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					class175 var6 = new class175(this);
					var6.field1638 = var2.method2213(new URL(var5.getString("src")));
					var6.field1639 = method1468(var5, "placement");
					this.field1560.add(var6);
				} catch (MalformedURLException var7) {
				}
			}

		}
	}

	void method2850(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				class164 var5 = new class164(this);
				var5.field1523 = var4.getString("text");
				String var8 = var4.getString("align_x");
				byte var7;
				if (var8.equals("centre")) {
					var7 = 1;
				} else if (!var8.equals("bottom") && !var8.equals("right")) {
					var7 = 0;
				} else {
					var7 = 2;
				}

				var5.field1527 = var7;
				var5.field1528 = class132.method2465(var4.getString("align_y"));
				var5.field1526 = var4.getInt("font");
				var5.field1524 = method1468(var4, "placement");
				this.field1556.add(var5);
			}

		}
	}

	void method2851(JSONObject var1) throws JSONException {
		if (null != var1) {
			this.field1551 = method1468(var1, "clickbounds");
			this.field1550 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field1559.add(new class177(this, var3[var4], var5));
					} catch (Exception var9) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field1559.add(new class177(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field1559.add(new class177(this, var3[var4], 0));
							} else {
								this.field1559.add(new class174(this, var3[var4], var6));
							}
						} catch (Exception var8) {
						}
					}
				}
			}

		}
	}

	void method2833(JSONObject var1) throws JSONException {
		String[] var3 = JSONObject.getNames(var1);

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			try {
				int var5 = var1.getInt(var3[var4]);
				this.field1562.put(var3[var4], var5);
			} catch (Exception var9) {
				try {
					String var6 = var1.getString(var3[var4]);
					if (var6.equals("true")) {
						this.field1562.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field1562.put(var3[var4], 0);
					} else {
						this.field1563.put(var3[var4], var6);
					}
				} catch (Exception var8) {
				}
			}
		}

	}

	static float[] method1468(JSONObject var0, String var1) throws JSONException {
		float[] var3 = new float[4];

		try {
			JSONArray var4 = var0.getJSONArray(var1);
			var3[0] = (float)var4.optDouble(0, 0.0D);
			var3[1] = (float)var4.optDouble(1, 0.0D);
			var3[2] = (float)var4.optDouble(2, 1.0D);
			var3[3] = (float)var4.optDouble(3, 1.0D);
		} catch (JSONException var5) {
			var3[0] = 0.0F;
			var3[1] = 0.0F;
			var3[2] = 1.0F;
			var3[3] = 1.0F;
		}

		return var3;
	}

	static final int method2861() {
		if (class186.field2040.method1774()) {
			return class384.field4486;
		} else {
			int var1 = 3;
			if (class79.field730 < 310) {
				int var2;
				int var3;
				if (1 == client.field1775) {
					var2 = class39.field236 >> 7;
					var3 = class14.field83 >> 7;
				} else {
					var2 = class142.field1370.field1012 >> 7;
					var3 = class142.field1370.field948 >> 7;
				}

				int var4 = class141.field1363 >> 7;
				int var5 = class170.field1608 >> 7;
				if (var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
					return class384.field4486;
				}

				if (var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
					return class384.field4486;
				}

				if (0 != (class84.field773[class384.field4486][var4][var5] & 4)) {
					var1 = class384.field4486;
				}

				int var6;
				if (var2 > var4) {
					var6 = var2 - var4;
				} else {
					var6 = var4 - var2;
				}

				int var7;
				if (var3 > var5) {
					var7 = var3 - var5;
				} else {
					var7 = var5 - var3;
				}

				int var8;
				int var9;
				if (var6 > var7) {
					var8 = var7 * 65536 / var6;
					var9 = 32768;

					while (var2 != var4) {
						if (var4 < var2) {
							++var4;
						} else if (var4 > var2) {
							--var4;
						}

						if (0 != (class84.field773[class384.field4486][var4][var5] & 4)) {
							var1 = class384.field4486;
						}

						var9 += var8;
						if (var9 >= 65536) {
							var9 -= 65536;
							if (var5 < var3) {
								++var5;
							} else if (var5 > var3) {
								--var5;
							}

							if ((class84.field773[class384.field4486][var4][var5] & 4) != 0) {
								var1 = class384.field4486;
							}
						}
					}
				} else if (var7 > 0) {
					var8 = var6 * 65536 / var7;
					var9 = 32768;

					while (var5 != var3) {
						if (var5 < var3) {
							++var5;
						} else if (var5 > var3) {
							--var5;
						}

						if (0 != (class84.field773[class384.field4486][var4][var5] & 4)) {
							var1 = class384.field4486;
						}

						var9 += var8;
						if (var9 >= 65536) {
							var9 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if (0 != (class84.field773[class384.field4486][var4][var5] & 4)) {
								var1 = class384.field4486;
							}
						}
					}
				}
			}

			if (class142.field1370.field1012 >= 0 && class142.field1370.field948 >= 0 && class142.field1370.field1012 < 13312 && class142.field1370.field948 < 13312) {
				if ((class84.field773[class384.field4486][class142.field1370.field1012 >> 7][class142.field1370.field948 >> 7] & 4) != 0) {
					var1 = class384.field4486;
				}

				return var1;
			} else {
				return class384.field4486;
			}
		}
	}
}
