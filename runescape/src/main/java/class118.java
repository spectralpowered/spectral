import java.io.EOFException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

@Deprecated
public class class118 {
	boolean field1183;
	boolean[] field1180;
	/** @deprecated */
	String[] field1182;
	Map field1181;
	long field1184;

	class118() {
		this.field1183 = false;
		int var1 = class195.field2162.method6330(19);
		this.field1181 = new HashMap();
		this.field1180 = new boolean[var1];

		int var2;
		for (var2 = 0; var2 < var1; ++var2) {
			class161 var3 = class76.method1520(var2);
			this.field1180[var2] = var3.field1503;
		}

		var2 = 0;
		if (class195.field2162.method6236(15)) {
			var2 = class195.field2162.method6330(15);
		}

		this.field1182 = new String[var2];
		this.method2261();
	}

	void method2253(int var1, int var2) {
		this.field1181.put(var1, var2);
		if (this.field1180[var1]) {
			this.field1183 = true;
		}

	}

	int method2267(int var1) {
		Object var3 = this.field1181.get(var1);
		return var3 instanceof Integer ? (Integer)var3 : -1;
	}

	void method2254(int var1, String var2) {
		this.field1181.put(var1, var2);
	}

	String method2255(int var1) {
		Object var3 = this.field1181.get(var1);
		return var3 instanceof String ? (String)var3 : "";
	}

	/** @deprecated */
	@Deprecated
	void method2256(int var1, String var2) {
		this.field1182[var1] = var2;
	}

	/** @deprecated */
	@Deprecated
	String method2257(int var1) {
		return this.field1182[var1];
	}

	void method2258() {
		int var2;
		for (var2 = 0; var2 < this.field1180.length; ++var2) {
			if (!this.field1180[var2]) {
				this.field1181.remove(var2);
			}
		}

		for (var2 = 0; var2 < this.field1182.length; ++var2) {
			this.field1182[var2] = null;
		}

	}

	class459 method2262(boolean var1) {
		return class94.method2015("2", class268.field3153.field4224, var1);
	}

	void method2260() {
		class459 var2 = this.method2262(true);

		try {
			int var3 = 3;
			int var4 = 0;
			Iterator var5 = this.field1181.entrySet().iterator();

			while (var5.hasNext()) {
				Entry var6 = (Entry)var5.next();
				int var7 = (Integer)var6.getKey();
				if (this.field1180[var7]) {
					Object var8 = var6.getValue();
					var3 += 3;
					if (var8 instanceof Integer) {
						var3 += 4;
					} else if (var8 instanceof String) {
						var3 += class467.method190((String)var8);
					}

					++var4;
				}
			}

			class467 var24 = new class467(var3);
			var24.method8323(2);
			var24.method8310(var4);
			Iterator var25 = this.field1181.entrySet().iterator();

			while (var25.hasNext()) {
				Entry var13 = (Entry)var25.next();
				int var14 = (Integer)var13.getKey();
				if (this.field1180[var14]) {
					var24.method8310(var14);
					Object var9 = var13.getValue();
					class460 var10 = class460.method8201(var9.getClass());
					var24.method8323(var10.field4893);
					class460.method8202(var9, var24);
				}
			}

			var2.method8184(var24.field4917, 0, var24.field4915);
		} catch (Exception var22) {
		} finally {
			try {
				var2.method8185();
			} catch (Exception var21) {
			}

		}

		this.field1183 = false;
		this.field1184 = class74.method1493();
	}

	void method2261() {
		class459 var2 = this.method2262(false);

		try {
			byte[] var3 = new byte[(int)var2.method8194()];

			int var5;
			for (int var4 = 0; var4 < var3.length; var4 += var5) {
				var5 = var2.method8188(var3, var4, var3.length - var4);
				if (var5 == -1) {
					throw new EOFException();
				}
			}

			class467 var15 = new class467(var3);
			if (var15.field4917.length - var15.field4915 < 1) {
				return;
			}

			int var16 = var15.method8326();
			if (var16 < 0 || var16 > 2) {
				return;
			}

			int var8;
			int var9;
			int var10;
			int var17;
			if (var16 >= 2) {
				var17 = var15.method8328();

				for (var8 = 0; var8 < var17; ++var8) {
					var9 = var15.method8328();
					var10 = var15.method8326();
					class460 var11 = (class460)class78.method1584(class460.method8211(), var10);
					Object var12 = var11.method8203(var15);
					if (this.field1180[var9]) {
						this.field1181.put(var9, var12);
					}
				}
			} else {
				var17 = var15.method8328();

				for (var8 = 0; var8 < var17; ++var8) {
					var9 = var15.method8328();
					var10 = var15.method8480();
					if (this.field1180[var9]) {
						this.field1181.put(var9, var10);
					}
				}

				var8 = var15.method8328();

				for (var9 = 0; var9 < var8; ++var9) {
					var15.method8328();
					var15.method8335();
				}
			}
		} catch (Exception var26) {
		} finally {
			try {
				var2.method8185();
			} catch (Exception var25) {
			}

		}

		this.field1183 = false;
	}

	void method2274() {
		if (this.field1183 && this.field1184 < class74.method1493() - 60000L) {
			this.method2260();
		}

	}

	boolean method2252() {
		return this.field1183;
	}
}
