@class291
public final class class341 {
	static class290 field4273;

	class341() throws Throwable {
		throw new Error();
	}

	public static boolean method6511(CharSequence var0) {
		return class187.method3611(var0, 10, true);
	}

	public static int method7671(CharSequence var0) {
		return class319.method6189(var0, 10, true);
	}

	public static int method2882(CharSequence var0, int var1) {
		return class319.method6189(var0, var1, true);
	}

	public static int method2764(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			var3 = (var3 << 5) - var3 + class302.method6078(var0.charAt(var4));
		}

		return var3;
	}

	public static String method2927(CharSequence var0) {
		return class83.method1647('*', var0.length());
	}
}
