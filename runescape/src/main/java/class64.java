public class class64 {
	class65 field520;
	int field519;
	int[] field518;
	String[] field521;

	class64() {
		this.field519 = -1;
	}

	static final void method1204(int var0, int var1, int var2) {
		int var4;
		for (var4 = 0; var4 < 8; ++var4) {
			for (int var5 = 0; var5 < 8; ++var5) {
				class84.field765[var0][var4 + var1][var5 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				class84.field765[var0][var1][var4 + var2] = class84.field765[var0][var1 - 1][var4 + var2];
			}
		}

		if (var2 > 0) {
			for (var4 = 1; var4 < 8; ++var4) {
				class84.field765[var0][var4 + var1][var2] = class84.field765[var0][var1 + var4][var2 - 1];
			}
		}

		if (var1 > 0 && 0 != class84.field765[var0][var1 - 1][var2]) {
			class84.field765[var0][var1][var2] = class84.field765[var0][var1 - 1][var2];
		} else if (var2 > 0 && class84.field765[var0][var1][var2 - 1] != 0) {
			class84.field765[var0][var1][var2] = class84.field765[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && class84.field765[var0][var1 - 1][var2 - 1] != 0) {
			class84.field765[var0][var1][var2] = class84.field765[var0][var1 - 1][var2 - 1];
		}

	}

	static final void method1201(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var4 = class199.method3912(var0, var1, class384.field4486) - var2;
			var0 -= class141.field1363;
			var4 -= class392.field4523;
			var1 -= class170.field1608;
			int var5 = class221.field2667[class79.field730];
			int var6 = class221.field2690[class79.field730];
			int var7 = class221.field2667[class113.field1145];
			int var8 = class221.field2690[class113.field1145];
			int var9 = var0 * var8 + var7 * var1 >> 16;
			var1 = var8 * var1 - var7 * var0 >> 16;
			var0 = var9;
			var9 = var4 * var6 - var1 * var5 >> 16;
			var1 = var6 * var1 + var4 * var5 >> 16;
			if (var1 >= 50) {
				client.field1905 = client.field1970 / 2 + var0 * client.field1972 / var1;
				client.field1726 = client.field1869 / 2 + client.field1972 * var9 / var1;
			} else {
				client.field1905 = -1;
				client.field1726 = -1;
			}

		} else {
			client.field1905 = -1;
			client.field1726 = -1;
		}
	}

	static final void method1205(int var0, int var1) {
		class170 var3 = var0 >= 0 ? client.field1814[var0] : class161.field1507;
		if (var3 != null && var1 >= 0 && var1 < var3.method2889()) {
			class135 var4 = (class135)var3.field1614.get(var1);
			if (var4.field1330 == -1) {
				String var5 = var4.field1327.method8771();
				class284 var6 = class152.method2679(class276.field3287, client.field1748.field1105);
				var6.field3321.method8323(3 + class467.method190(var5));
				var6.field3321.method8323(var0);
				var6.field3321.method8310(var1);
				var6.field3321.method8316(var5);
				client.field1748.method2173(var6);
			}
		}
	}

	static String method1203(String var0, boolean var1) {
		String var3 = var1 ? "https://" : "http://";
		if (1 == client.field1690) {
			var0 = var0 + "-wtrc";
		} else if (2 == client.field1690) {
			var0 = var0 + "-wtqa";
		} else if (client.field1690 == 3) {
			var0 = var0 + "-wtwip";
		} else if (5 == client.field1690) {
			var0 = var0 + "-wti";
		} else if (client.field1690 == 4) {
			var0 = "local";
		}

		String var4 = "";
		if (class149.field1432 != null) {
			var4 = "/p=" + class149.field1432;
		}

		String var5 = "runescape.com";
		return var3 + var0 + "." + var5 + "/l=" + class178.field1654 + "/a=" + class210.field2443 + var4 + "/";
	}
}
