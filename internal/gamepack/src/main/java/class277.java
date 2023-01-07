import io.spectralpowered.ObfInfo;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfInfo(
	name = "fk"
)
public class class277 {
	@ObfInfo(
		owner = "fk",
		name = "j",
		desc = "Ldm;"
	)
	class140 field2325;
	@ObfInfo(
		owner = "fk",
		name = "i",
		desc = "[F"
	)
	float[] field2321;
	@ObfInfo(
		owner = "fk",
		name = "u",
		desc = "I"
	)
	int field2322;
	@ObfInfo(
		owner = "fk",
		name = "g",
		desc = "Ljava/lang/String;"
	)
	String field2320;
	@ObfInfo(
		owner = "fk",
		name = "b",
		desc = "Ljava/lang/String;"
	)
	String field2323;
	@ObfInfo(
		owner = "fk",
		name = "k",
		desc = "Ljava/util/ArrayList;"
	)
	ArrayList field2324;
	@ObfInfo(
		owner = "fk",
		name = "o",
		desc = "Ljava/util/ArrayList;"
	)
	ArrayList field2326;
	@ObfInfo(
		owner = "fk",
		name = "n",
		desc = "Ljava/util/ArrayList;"
	)
	ArrayList field2327;
	@ObfInfo(
		owner = "fk",
		name = "a",
		desc = "Ljava/util/Map;"
	)
	Map field2328;
	@ObfInfo(
		owner = "fk",
		name = "s",
		desc = "Ljava/util/Map;"
	)
	Map field2329;

	@ObfInfo(
		owner = "fk",
		name = "<init>",
		desc = "()V"
	)
	public class277() {
		this.field2322 = -1;
		this.field2320 = null;
		this.field2321 = new float[4];
		this.field2326 = new ArrayList();
		this.field2327 = new ArrayList();
		this.field2324 = new ArrayList();
		this.field2328 = new HashMap();
		this.field2329 = new HashMap();
	}

	@ObfInfo(
		owner = "fk",
		name = "h",
		desc = "(Ljava/lang/String;Ldl;I)Z"
	)
	public boolean method1369(String var1, class434 var2) {
		if (null != var1 && !var1.isEmpty()) {
			if (var2 == null) {
				return false;
			} else {
				this.method1381();

				try {
					this.field2323 = var1;
					this.field2325 = var2.method2151(new URL(this.field2323));
					this.field2322 = 0;
					return true;
				} catch (MalformedURLException var5) {
					this.method1381();
					this.field2322 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfInfo(
		owner = "fk",
		name = "e",
		desc = "(Ldl;S)V"
	)
	public void method1370(class434 var1) {
		switch(this.field2322) {
		case 0:
			this.method1377(var1);
			break;
		case 1:
			this.method1378();
			break;
		default:
			return;
		}

	}

	@ObfInfo(
		owner = "fk",
		name = "v",
		desc = "(I)I"
	)
	public int method1371() {
		return this.field2322;
	}

	@ObfInfo(
		owner = "fk",
		name = "x",
		desc = "(Ljava/lang/String;I)I"
	)
	public int method1372(String var1) {
		return this.field2328.containsKey(var1) ? (Integer)this.field2328.get(var1) : -1;
	}

	@ObfInfo(
		owner = "fk",
		name = "m",
		desc = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	public String method1373(String var1) {
		return (String)((String)(this.field2329.containsKey(var1) ? this.field2329.get(var1) : null));
	}

	@ObfInfo(
		owner = "fk",
		name = "q",
		desc = "(B)Ljava/util/ArrayList;"
	)
	public ArrayList method1380() {
		return this.field2327;
	}

	@ObfInfo(
		owner = "fk",
		name = "f",
		desc = "(B)Ljava/util/ArrayList;"
	)
	public ArrayList method1374() {
		return this.field2324;
	}

	@ObfInfo(
		owner = "fk",
		name = "r",
		desc = "(B)Ljava/lang/String;"
	)
	public String method1375() {
		return this.field2320;
	}

	@ObfInfo(
		owner = "fk",
		name = "u",
		desc = "(I)Ljava/util/ArrayList;"
	)
	public ArrayList method1376() {
		return this.field2326;
	}

	@ObfInfo(
		owner = "fk",
		name = "b",
		desc = "(I)V"
	)
	void method1381() {
		this.field2325 = null;
		this.field2320 = null;
		this.field2321[0] = 0.0F;
		this.field2321[1] = 0.0F;
		this.field2321[2] = 1.0F;
		this.field2321[3] = 1.0F;
		this.field2326.clear();
		this.field2327.clear();
		this.field2324.clear();
		this.field2328.clear();
		this.field2329.clear();
	}

	@ObfInfo(
		owner = "fk",
		name = "j",
		desc = "(Ldl;B)V"
	)
	void method1377(class434 var1) {
		if (this.field2325 != null && this.field2325.method640()) {
			byte[] var3 = this.field2325.method638();
			if (null == var3) {
				this.method1381();
				this.field2322 = 100;
			} else {
				JSONObject var4;
				try {
					class126 var5 = new class126(var3);
					var4 = var5.method528();
					var4 = var4.getJSONObject("message");
				} catch (Exception var10) {
					this.method1381();
					this.field2322 = 102;
					return;
				}

				try {
					this.method1379(var4.getJSONArray("images"), var1);
				} catch (Exception var9) {
					this.field2327.clear();
				}

				try {
					this.method1383(var4.getJSONArray("labels"));
				} catch (Exception var8) {
					this.field2324.clear();
				}

				try {
					this.method1384(var4.getJSONObject("behaviour"));
				} catch (Exception var7) {
					this.field2320 = null;
					this.field2321[0] = 0.0F;
					this.field2321[1] = 0.0F;
					this.field2321[2] = 1.0F;
					this.field2321[3] = 1.0F;
					this.field2326.clear();
				}

				try {
					this.method1382(var4.getJSONObject("meta"));
				} catch (Exception var6) {
					this.field2328.clear();
					this.field2329.clear();
				}

				this.field2322 = this.field2327.size() > 0 ? 1 : 2;
				this.field2325 = null;
			}
		}
	}

	@ObfInfo(
		owner = "fk",
		name = "g",
		desc = "(B)V"
	)
	void method1378() {
		Iterator var2 = this.field2327.iterator();

		class459 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field2327.iterator();

				while (var2.hasNext()) {
					var3 = (class459)var2.next();
					if (null != var3.field3805) {
						byte[] var4 = var3.field3805.method638();
						if (var4 != null && var4.length > 0) {
							this.field2322 = 2;
							return;
						}
					}
				}

				this.method1381();
				this.field2322 = 101;
				return;
			}

			var3 = (class459)var2.next();
		} while(var3.field3805 == null || var3.field3805.method640());

	}

	@ObfInfo(
		owner = "fk",
		name = "i",
		desc = "(Lorg/json/JSONArray;Ldl;I)V"
	)
	void method1379(JSONArray var1, class434 var2) throws JSONException {
		if (var1 != null) {
			for (int var4 = 0; var4 < var1.length(); ++var4) {
				try {
					JSONObject var5 = var1.getJSONObject(var4);
					class459 var6 = new class459(this);
					var6.field3805 = var2.method2151(new URL(var5.getString("src")));
					var6.field3806 = class359.method1790(var5, "placement");
					this.field2327.add(var6);
				} catch (MalformedURLException var7) {
				}
			}

		}
	}

	@ObfInfo(
		owner = "fk",
		name = "o",
		desc = "(Lorg/json/JSONArray;B)V"
	)
	void method1383(JSONArray var1) throws JSONException {
		if (null != var1) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				JSONObject var4 = var1.getJSONObject(var3);
				class378 var5 = new class378(this);
				var5.field3186 = var4.getString("text");
				String var8 = var4.getString("align_x");
				byte var7;
				if (var8.equals("centre")) {
					var7 = 1;
				} else if (!var8.equals("bottom") && !var8.equals("right")) {
					var7 = 0;
				} else {
					var7 = 2;
				}

				var5.field3189 = var7;
				var5.field3190 = class409.method2006(var4.getString("align_y"));
				var5.field3188 = var4.getInt("font");
				var5.field3187 = class359.method1790(var4, "placement");
				this.field2324.add(var5);
			}

		}
	}

	@ObfInfo(
		owner = "fk",
		name = "n",
		desc = "(Lorg/json/JSONObject;B)V"
	)
	void method1384(JSONObject var1) throws JSONException {
		if (null != var1) {
			this.field2321 = class359.method1790(var1, "clickbounds");
			this.field2320 = var1.getString("endpoint");
			String[] var3 = JSONObject.getNames(var1);

			for (int var4 = 0; var4 < var1.length(); ++var4) {
				if (!var3[var4].equals("clickbounds") && !var3[var4].equals("endpoint")) {
					try {
						int var5 = var1.getInt(var3[var4]);
						this.field2326.add(new class96(this, var3[var4], var5));
					} catch (Exception var9) {
						try {
							String var6 = var1.getString(var3[var4]);
							if (var6.equals("true")) {
								this.field2326.add(new class96(this, var3[var4], 1));
							} else if (var6.equals("false")) {
								this.field2326.add(new class96(this, var3[var4], 0));
							} else {
								this.field2326.add(new class317(this, var3[var4], var6));
							}
						} catch (Exception var8) {
						}
					}
				}
			}

		}
	}

	@ObfInfo(
		owner = "fk",
		name = "k",
		desc = "(Lorg/json/JSONObject;S)V"
	)
	void method1382(JSONObject var1) throws JSONException {
		String[] var3 = JSONObject.getNames(var1);

		for (int var4 = 0; var4 < var1.length(); ++var4) {
			try {
				int var5 = var1.getInt(var3[var4]);
				this.field2328.put(var3[var4], var5);
			} catch (Exception var9) {
				try {
					String var6 = var1.getString(var3[var4]);
					if (var6.equals("true")) {
						this.field2328.put(var3[var4], 1);
					} else if (var6.equals("false")) {
						this.field2328.put(var3[var4], 0);
					} else {
						this.field2329.put(var3[var4], var6);
					}
				} catch (Exception var8) {
				}
			}
		}

	}

	@ObfInfo(
		owner = "fk",
		name = "h",
		desc = "(I)[Lcp;"
	)
	static class161[] method1388() {
		return new class161[]{class161.field1221, class161.field1222, class161.field1223, class161.field1224, class161.field1228, class161.field1230};
	}

	@ObfInfo(
		owner = "fk",
		name = "v",
		desc = "(II)I"
	)
	public static int method1386(int var0) {
		return (var0 & class227.field1929) - 1;
	}

	@ObfInfo(
		owner = "fk",
		name = "e",
		desc = "(II)I"
	)
	public static int method1385(int var0) {
		return class83.field672[var0 & 16383];
	}

	@ObfInfo(
		owner = "fk",
		name = "iy",
		desc = "(B)I"
	)
	static final int method1387() {
		if (class50.field574.method2202()) {
			return class347.field2878;
		} else {
			int var1 = 3;
			if (class442.field3666 < 310) {
				int var2;
				int var3;
				if (1 == client.field306) {
					var2 = class74.field658 >> 7;
					var3 = class19.field96 >> 7;
				} else {
					var2 = class113.field846.field2672 >> 7;
					var3 = class113.field846.field2608 >> 7;
				}

				int var4 = class463.field3850 >> 7;
				int var5 = class57.field594 >> 7;
				if (var4 < 0 || var5 < 0 || var4 >= 104 || var5 >= 104) {
					return class347.field2878;
				}

				if (var2 < 0 || var3 < 0 || var2 >= 104 || var3 >= 104) {
					return class347.field2878;
				}

				if (0 != (class71.field644[class347.field2878][var4][var5] & 4)) {
					var1 = class347.field2878;
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

						if (0 != (class71.field644[class347.field2878][var4][var5] & 4)) {
							var1 = class347.field2878;
						}

						var9 += var8;
						if (var9 >= 65536) {
							var9 -= 65536;
							if (var5 < var3) {
								++var5;
							} else if (var5 > var3) {
								--var5;
							}

							if ((class71.field644[class347.field2878][var4][var5] & 4) != 0) {
								var1 = class347.field2878;
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

						if (0 != (class71.field644[class347.field2878][var4][var5] & 4)) {
							var1 = class347.field2878;
						}

						var9 += var8;
						if (var9 >= 65536) {
							var9 -= 65536;
							if (var4 < var2) {
								++var4;
							} else if (var4 > var2) {
								--var4;
							}

							if (0 != (class71.field644[class347.field2878][var4][var5] & 4)) {
								var1 = class347.field2878;
							}
						}
					}
				}
			}

			if (class113.field846.field2672 >= 0 && class113.field846.field2608 >= 0 && class113.field846.field2672 < 13312 && class113.field846.field2608 < 13312) {
				if ((class71.field644[class347.field2878][class113.field846.field2672 >> 7][class113.field846.field2608 >> 7] & 4) != 0) {
					var1 = class347.field2878;
				}

				return var1;
			} else {
				return class347.field2878;
			}
		}
	}
}
