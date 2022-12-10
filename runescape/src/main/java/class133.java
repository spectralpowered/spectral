public class class133 extends class152 {
	static int field1314;
	boolean field1316;
	byte field1309;
	byte field1310;
	byte field1311;
	byte field1312;
	// $FF: synthetic field
	final class143 this$0;

	public static void method2471() {
		class204.field2331.method5357();
	}

	static int method2478(class78 var0, class78 var1, int var2, boolean var3, int var4, boolean var5) {
		int var7 = class127.method2410(var0, var1, var2, var3);
		if (var7 != 0) {
			return var3 ? -var7 : var7;
		} else if (var4 == -1) {
			return 0;
		} else {
			int var8 = class127.method2410(var0, var1, var4, var5);
			return var5 ? -var8 : var8;
		}
	}

	class133(class143 var1) {
		this.this$0 = var1;
	}

	void method2674(class467 var1) {
		this.field1316 = var1.method8326() == 1;
		this.field1312 = var1.method8327();
		this.field1311 = var1.method8327();
		this.field1310 = var1.method8327();
		this.field1309 = var1.method8327();
	}

	void method2677(class146 var1) {
		var1.field1394 = this.field1316;
		var1.field1395 = this.field1312;
		var1.field1396 = this.field1311;
		var1.field1401 = this.field1310;
		var1.field1398 = this.field1309;
	}

	static class469 method2476(boolean var0, boolean var1) {
		return var0 ? (var1 ? class73.field639 : class92.field882) : (var1 ? class73.field661 : class243.field2900);
	}

	static final void method2479(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var6 = var3 - 334;
		int var7;
		if (var6 < 0) {
			var7 = client.field1960;
		} else if (var6 >= 100) {
			var7 = client.field1732;
		} else {
			var7 = var6 * (client.field1732 - client.field1960) / 100 + client.field1960;
		}

		int var8 = var7 * var3 * 512 / (var2 * 334);
		int var9;
		int var10;
		short var19;
		if (var8 < client.field1966) {
			var19 = client.field1966;
			var7 = 334 * var2 * var19 / (var3 * 512);
			if (var7 > client.field1965) {
				var7 = client.field1965;
				var9 = 512 * var7 * var3 / (var19 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					class478.method8712();
					class478.method8680(var0, var1, var10, var3, -16777216);
					class478.method8680(var2 + var0 - var10, var1, var10, var3, -16777216);
				}

				var0 += var10;
				var2 -= var10 * 2;
			}
		} else if (var8 > client.field1692) {
			var19 = client.field1692;
			var7 = var19 * var2 * 334 / (var3 * 512);
			if (var7 < client.field1872) {
				var7 = client.field1872;
				var9 = 334 * var2 * var19 / (var7 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					class478.method8712();
					class478.method8680(var0, var1, var2, var10, -16777216);
					class478.method8680(var0, var3 + var1 - var10, var2, var10, -16777216);
				}

				var1 += var10;
				var3 -= var10 * 2;
			}
		}

		client.field1972 = var7 * var3 / 334;
		if (client.field1970 != var2 || var3 != client.field1869) {
			int[] var18 = new int[9];

			for (var10 = 0; var10 < var18.length; ++var10) {
				int var11 = 128 + var10 * 32 + 15;
				int var12 = var11 * 3 + 600;
				int var14 = class221.field2667[var11];
				int var16 = var3 - 334;
				if (var16 < 0) {
					var16 = 0;
				} else if (var16 > 100) {
					var16 = 100;
				}

				int var17 = client.field1962 + var16 * (client.field1854 - client.field1962) / 100;
				int var15 = var12 * var17 / 256;
				var18[var10] = var14 * var15 >> 16;
			}

			class211.method4187(var18, 500, 800, var2 * 334 / var3, 334);
		}

		client.field1841 = var0;
		client.field1969 = var1;
		client.field1970 = var2;
		client.field1869 = var3;
	}
}
