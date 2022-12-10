public class class49 implements Runnable {
	static class337 field347;
	volatile class50[] field349;

	class49() {
		this.field349 = new class50[2];
	}

	public static int method938(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 <= 127) {
				++var3;
			} else if (var5 <= 2047) {
				var3 += 2;
			} else {
				var3 += 3;
			}
		}

		return var3;
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				class50 var2 = this.field349[var1];
				if (null != var2) {
					var2.method995();
				}
			}
		} catch (Exception var4) {
			class150.method2660((String)null, var4);
		}

	}

	static void method943() {
		if (client.field1737 && null != class73.field652 && class73.field652.length() > 0) {
			class73.field654 = 1;
		} else {
			class73.field654 = 0;
		}

	}

	static final void method940(String var0, boolean var1) {
		if (client.field1815) {
			byte var3 = 4;
			int var4 = var3 + 6;
			int var5 = var3 + 6;
			int var6 = class248.field2935.method6851(var0, 250);
			int var7 = class248.field2935.method6852(var0, 250) * 13;
			class478.method8680(var4 - var3, var5 - var3, var3 + var3 + var6, var7 + var3 + var3, 0);
			class478.method8671(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
			class248.field2935.method6858(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
			class33.method428(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3);
			if (var1) {
				class189.field2059.method8762(0, 0);
			} else {
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;
				int var11 = var7;

				for (int var12 = 0; var12 < client.field1911; ++var12) {
					if (client.field1916[var12] + client.field1904[var12] > var8 && client.field1916[var12] < var10 + var8 && client.field1716[var12] + client.field1917[var12] > var9 && client.field1917[var12] < var9 + var11) {
						client.field1914[var12] = true;
					}
				}
			}

		}
	}

	static final void method937(class290 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (client.field1871) {
			client.field1768 = 32;
		} else {
			client.field1768 = 0;
		}

		client.field1871 = false;
		int var8;
		if (class28.field157 == 1 || !class218.field2651 && class28.field157 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field3421 -= 4;
				class53.method1040(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.field3421 += 4;
				class53.method1040(var0);
			} else if (var5 >= var1 - client.field1768 && var5 < var1 + 16 + client.field1768 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
				var8 = var3 * (var3 - 32) / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field3421 = var9 * (var4 - var3) / var10;
				class53.method1040(var0);
				client.field1871 = true;
			}
		}

		if (client.field1796 != 0) {
			var8 = var0.field3414;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.field3421 += client.field1796 * 45;
				class53.method1040(var0);
			}
		}

	}
}
