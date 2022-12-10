public class class131 extends class152 {
	static class469 field1303;
	byte field1301;
	int field1300;
	// $FF: synthetic field
	final class143 this$0;

	static final boolean method2444(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var8 = class215.field2554 + var6;
		if (var8 < var0 && var8 < var1 && var8 < var2) {
			return false;
		} else {
			var8 = class215.field2554 - var6;
			if (var8 > var0 && var8 > var1 && var8 > var2) {
				return false;
			} else {
				var8 = var6 + class215.field2545;
				if (var8 < var3 && var8 < var4 && var8 < var5) {
					return false;
				} else {
					var8 = class215.field2545 - var6;
					return var8 <= var3 || var8 <= var4 || var8 <= var5;
				}
			}
		}
	}

	class131(class143 var1) {
		this.this$0 = var1;
		this.field1300 = -1;
	}

	void method2674(class467 var1) {
		this.field1300 = var1.method8328();
		this.field1301 = var1.method8327();
	}

	void method2677(class146 var1) {
		var1.method2580(this.field1300, this.field1301);
	}

	static void method2451(int var0) {
		if (var0 != client.field1698) {
			if (30 == client.field1698) {
				client.field1754.method3552();
			}

			if (0 == client.field1698) {
				class122.field1212.method545();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class38.method500(0);
				client.field1830 = 0;
				client.field1723 = 0;
				client.field1694.method6968(var0);
				if (var0 != 20) {
					class102.method2078(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class14.field82 != null) {
				class14.field82.method7609();
				class14.field82 = null;
			}

			if (25 == client.field1698) {
				client.field1840 = 0;
				client.field1783 = 0;
				client.field1937 = 1;
				client.field1968 = 0;
				client.field1756 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var4 = 11 == client.field1698 ? 4 : 0;
					class115.method2200(class135.field1332, class86.field798, false, var4);
				} else if (var0 == 11) {
					class115.method2200(class135.field1332, class86.field798, false, 4);
				} else if (var0 == 50) {
					class73.method2926("", "Updating date of birth...", "");
					class115.method2200(class135.field1332, class86.field798, false, 7);
				} else {
					class436.method7974();
				}
			} else {
				boolean var2 = class186.field2040.method1786() >= client.field1693;
				int var3 = var2 ? 0 : 12;
				class115.method2200(class135.field1332, class86.field798, true, var3);
			}

			client.field1698 = var0;
		}
	}
}
