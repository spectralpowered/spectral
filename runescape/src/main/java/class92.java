public class class92 {
	public static String[] field885;
	static class326 field884;
	static class469 field882;
	static class469[] field887;

	class92() throws Throwable {
		throw new Error();
	}

	static void method1968(class290 var0, int var1, int var2) {
		if (var0.field3447 == 0) {
			var0.field3412 = var0.field3408;
		} else if (1 == var0.field3447) {
			var0.field3412 = (var1 - var0.field3414) / 2 + var0.field3408;
		} else if (var0.field3447 == 2) {
			var0.field3412 = var1 - var0.field3414 - var0.field3408;
		} else if (3 == var0.field3447) {
			var0.field3412 = var0.field3408 * var1 >> 14;
		} else if (var0.field3447 == 4) {
			var0.field3412 = (var0.field3408 * var1 >> 14) + (var1 - var0.field3414) / 2;
		} else {
			var0.field3412 = var1 - var0.field3414 - (var1 * var0.field3408 >> 14);
		}

		if (var0.field3546 == 0) {
			var0.field3413 = var0.field3409;
		} else if (1 == var0.field3546) {
			var0.field3413 = var0.field3409 + (var2 - var0.field3474) / 2;
		} else if (var0.field3546 == 2) {
			var0.field3413 = var2 - var0.field3474 - var0.field3409;
		} else if (3 == var0.field3546) {
			var0.field3413 = var2 * var0.field3409 >> 14;
		} else if (4 == var0.field3546) {
			var0.field3413 = (var2 - var0.field3474) / 2 + (var0.field3409 * var2 >> 14);
		} else {
			var0.field3413 = var2 - var0.field3474 - (var0.field3409 * var2 >> 14);
		}

	}
}
