public class class444 {
	static final int field4830;
	static final int field4832;

	static {
		field4830 = (int)(Math.pow(2.0D, 4.0D) - 1.0D);
		field4832 = (int)(Math.pow(2.0D, 8.0D) - 1.0D);
	}

	class444() throws Throwable {
		throw new Error();
	}

	public static int method6107(int var0) {
		return var0 >>> 12;
	}

	public static int method8232(int var0) {
		return var0 >>> 4 & field4832;
	}

	public static int method2859(int var0) {
		return (var0 & field4830) - 1;
	}
}
