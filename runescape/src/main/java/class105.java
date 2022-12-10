import java.awt.FontMetrics;
import java.util.HashMap;
import java.util.Map;

public class class105 {
	static int field1083;
	static FontMetrics field1086;
	static final class351 field1082;
	static final class454 field1084;
	static final Map field1080;

	static {
		field1080 = new HashMap();
		field1084 = new class454(1024);
		field1082 = new class351();
		field1083 = 0;
	}

	class105() throws Throwable {
		throw new Error();
	}

	static void method2785(int var0, String var1, String var2) {
		class381.method7106(var0, var1, var2, (String)null);
	}

	static class74 method2688(int var0, int var1) {
		class56 var3 = (class56)field1080.get(var0);
		return var3.method1056(var1);
	}

	static class74 method1222(int var0) {
		return (class74)field1084.method8135((long)var0);
	}

	static void method6272() {
		field1080.clear();
		field1084.method8122();
		field1082.method6517();
		field1083 = 0;
	}

	static final void method2114(class467 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var8 = var1 >= 0 && var1 < 4 && var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104;
		int var9;
		if (var8) {
			class84.field773[var1][var2][var3] = 0;

			while (true) {
				var9 = client.field1697 < 209 ? var0.method8326() : var0.method8328();
				if (var9 == 0) {
					if (var1 == 0) {
						int[] var10 = class84.field765[0][var2];
						int var13 = var4 + 932731;
						int var14 = var5 + 556238;
						int var15 = class84.method1589(var13 + 45365, var14 + 91923, 4) - 128 + (class84.method1589(var13 + 10294, var14 + 37821, 2) - 128 >> 1) + (class84.method1589(var13, var14, 1) - 128 >> 2);
						var15 = (int)((double)var15 * 0.3D) + 35;
						if (var15 < 10) {
							var15 = 10;
						} else if (var15 > 60) {
							var15 = 60;
						}

						var10[var3] = -var15 * 8;
					} else {
						class84.field765[var1][var2][var3] = class84.field765[var1 - 1][var2][var3] - 240;
					}
					break;
				}

				if (var9 == 1) {
					int var16 = var0.method8326();
					if (var16 == 1) {
						var16 = 0;
					}

					if (var1 == 0) {
						class84.field765[0][var2][var3] = 8 * -var16;
					} else {
						class84.field765[var1][var2][var3] = class84.field765[var1 - 1][var2][var3] - var16 * 8;
					}
					break;
				}

				if (var9 <= 49) {
					class482.field5023[var1][var2][var3] = client.field1697 < 209 ? (short)var0.method8327() : (short)var0.method8329();
					class84.field772[var1][var2][var3] = (byte)((var9 - 2) / 4);
					class363.field4350[var1][var2][var3] = (byte)(var9 - 2 + var6 & 3);
				} else if (var9 <= 81) {
					class84.field773[var1][var2][var3] = (byte)(var9 - 49);
				} else {
					class84.field767[var1][var2][var3] = (short)(var9 - 81);
				}
			}
		} else {
			while (true) {
				var9 = client.field1697 < 209 ? var0.method8326() : var0.method8328();
				if (var9 == 0) {
					break;
				}

				if (var9 == 1) {
					var0.method8326();
					break;
				}

				if (var9 <= 49) {
					if (client.field1697 < 209) {
						var0.method8327();
					} else {
						var0.method8329();
					}
				}
			}
		}

	}
}
