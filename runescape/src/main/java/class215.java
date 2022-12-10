public class class215 {
	public static boolean field2546;
	public static boolean field2547;
	public static int field2545;
	public static int field2554;
	public static int field2555;
	public static long[] field2552;
	static int field2544;
	static int field2548;
	static int field2549;
	static int field2551;

	static {
		field2546 = false;
		field2545 = 0;
		field2554 = 0;
		field2547 = false;
		field2555 = 0;
		field2552 = new long[1000];
	}

	class215() throws Throwable {
		throw new Error();
	}

	public static int method1969(int var0) {
		return method2488(field2552[var0]);
	}

	public static int method2488(long var0) {
		return (int)(var0 >>> 0 & 127L);
	}

	public static int method4973(int var0) {
		return method6099(field2552[var0]);
	}

	static int method6099(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	public static boolean method5254(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}

	public static int method4664(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	public static final void method284() {
		field2546 = false;
		field2555 = 0;
	}

	static final void method6555(long var0) {
		field2552[++field2555 - 1] = var0;
	}

	static final boolean method2878() {
		return field2546;
	}

	public static boolean method4366(char var0) {
		return var0 >= 'A' && var0 <= 'Z' || var0 >= 'a' && var0 <= 'z';
	}
}
