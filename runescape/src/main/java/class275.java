public class class275 {
	static class469[] field3187;

	class275() throws Throwable {
		throw new Error();
	}

	static final void method5313(class466 var0) {
		var0.method8275();
		int var2 = client.field1817;
		class88 var3 = class142.field1370 = client.field1816[var2] = new class88();
		var3.field848 = var2;
		int var4 = var0.method8281(30);
		byte var5 = (byte)(var4 >> 28);
		int var6 = var4 >> 14 & 16383;
		int var7 = var4 & 16383;
		var3.field973[0] = var6 - class151.field1447;
		var3.field1012 = (var3.field973[0] << 7) + (var3.method1917() << 6);
		var3.field1021[0] = var7 - class388.field4509;
		var3.field948 = (var3.field1021[0] << 7) + (var3.method1917() << 6);
		class384.field4486 = var3.field847 = var5;
		if (null != class87.field815[var2]) {
			var3.method1926(class87.field815[var2]);
		}

		class87.field818 = 0;
		class87.field817[++class87.field818 - 1] = var2;
		class87.field813[var2] = 0;
		class87.field812 = 0;

		for (int var8 = 1; var8 < 2048; ++var8) {
			if (var2 != var8) {
				int var9 = var0.method8281(18);
				int var10 = var9 >> 16;
				int var11 = var9 >> 8 & 597;
				int var12 = var9 & 597;
				class87.field816[var8] = var12 + (var11 << 14) + (var10 << 28);
				class87.field821[var8] = 0;
				class87.field823[var8] = -1;
				class87.field819[++class87.field812 - 1] = var8;
				class87.field813[var8] = 0;
			}
		}

		var0.method8277();
	}

	static final void method5314(int var0, int var1, int var2) {
		if (class141.field1363 < var0) {
			class141.field1363 += class47.field344 + (var0 - class141.field1363) * class213.field2536 / 1000;
			if (class141.field1363 > var0) {
				class141.field1363 = var0;
			}
		}

		if (class141.field1363 > var0) {
			class141.field1363 -= class47.field344 + class213.field2536 * (class141.field1363 - var0) / 1000;
			if (class141.field1363 < var0) {
				class141.field1363 = var0;
			}
		}

		if (class392.field4523 < var1) {
			class392.field4523 += class47.field344 + class213.field2536 * (var1 - class392.field4523) / 1000;
			if (class392.field4523 > var1) {
				class392.field4523 = var1;
			}
		}

		if (class392.field4523 > var1) {
			class392.field4523 -= class47.field344 + class213.field2536 * (class392.field4523 - var1) / 1000;
			if (class392.field4523 < var1) {
				class392.field4523 = var1;
			}
		}

		if (class170.field1608 < var2) {
			class170.field1608 += class47.field344 + (var2 - class170.field1608) * class213.field2536 / 1000;
			if (class170.field1608 > var2) {
				class170.field1608 = var2;
			}
		}

		if (class170.field1608 > var2) {
			class170.field1608 -= class47.field344 + class213.field2536 * (class170.field1608 - var2) / 1000;
			if (class170.field1608 < var2) {
				class170.field1608 = var2;
			}
		}

	}
}
