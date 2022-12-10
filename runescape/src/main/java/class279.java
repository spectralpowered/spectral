public class class279 {
	static int[] field3302;

	static {
		new Object();
		field3302 = new int[33];
		field3302[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3302[var1] = var0 - 1;
			var0 += var0;
		}

	}

	class279() throws Throwable {
		throw new Error();
	}

	public static int method2056(int var0) {
		return field3302[var0];
	}

	public static int method4663(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = (var0 >>> 4) + var0 & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}

	public static int method2907(int var0, int var1, int var2) {
		int var4 = method2056(var2 - var1 + 1);
		var4 <<= var1;
		return var0 & ~var4;
	}

	public static int method5308(int var0, int var1, int var2) {
		int var4 = method2056(1 + (var2 - var1));
		var4 <<= var1;
		var0 |= var4;
		return var0;
	}

	public static int method8200(int var0) {
		--var0;
		var0 |= var0 >>> 1;
		var0 |= var0 >>> 2;
		var0 |= var0 >>> 4;
		var0 |= var0 >>> 8;
		var0 |= var0 >>> 16;
		return var0 + 1;
	}

	public static int method2158(int var0, int var1) {
		int var3;
		for (var3 = 0; var1 > 0; --var1) {
			var3 = var3 << 1 | var0 & 1;
			var0 >>>= 1;
		}

		return var3;
	}

	public static int method3749(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var0 + var3) / var1 - var3;
	}
}
