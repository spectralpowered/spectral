public class class440 {
	static final int[] field4802;
	static final int[] field4803;

	static {
		field4802 = new int[16384];
		field4803 = new int[16384];
		double var0 = 3.834951969714103E-4D;

		for (int var2 = 0; var2 < 16384; ++var2) {
			field4802[var2] = (int)(16384.0D * Math.sin(var0 * (double)var2));
			field4803[var2] = (int)(16384.0D * Math.cos((double)var2 * var0));
		}

	}

	class440() throws Throwable {
		throw new Error();
	}

	public static int method7558(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	public static int method2853(int var0) {
		return field4802[var0 & 16383];
	}

	public static int method944(int var0) {
		return field4803[var0 & 16383];
	}
}
