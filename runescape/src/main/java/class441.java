public class class441 {
	static final int[] field4810;
	static final int[] field4811;

	static {
		field4810 = new int[2048];
		field4811 = new int[2048];
		double var0 = 0.0030679615757712823D;

		for (int var2 = 0; var2 < 2048; ++var2) {
			field4810[var2] = (int)(65536.0D * Math.sin(var0 * (double)var2));
			field4811[var2] = (int)(65536.0D * Math.cos((double)var2 * var0));
		}

	}

	class441() throws Throwable {
		throw new Error();
	}
}
