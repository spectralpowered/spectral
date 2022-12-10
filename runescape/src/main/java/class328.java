public final class class328 {
	class328() throws Throwable {
		throw new Error();
	}

	static final void method6257(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		class321 var10001 = (class321)null;
		String var2 = var10000.append(class321.field3936).toString();
		class105.method2785(30, "", var2);
	}

	static final void method6256(class290 var0, class200 var1, int var2, int var3, boolean var4) {
		String[] var6 = var1.field2277;
		byte var7 = -1;
		String var8 = null;
		if (null != var6 && null != var6[var3]) {
			if (var3 == 0) {
				var7 = 33;
			} else if (var3 == 1) {
				var7 = 34;
			} else if (var3 == 2) {
				var7 = 35;
			} else if (var3 == 3) {
				var7 = 36;
			} else {
				var7 = 37;
			}

			var8 = var6[var3];
		} else if (var3 == 4) {
			var7 = 37;
			var8 = class321.field4069;
		}

		if (var7 != -1 && null != var8) {
			class38.method497(var8, class79.method2039(16748608) + var1.field2259, var7, 0, var2, var0.field3492, var1.field2281, var4);
		}

	}
}
