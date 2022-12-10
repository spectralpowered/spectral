public class class323 {
	public static int[] field4083;
	public static final boolean[] field4081;

	static {
		field4081 = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
		field4083 = new int[99];
		int var0 = 0;

		for (int var1 = 0; var1 < 99; ++var1) {
			int var2 = var1 + 1;
			int var3 = (int)((double)var2 + 300.0D * Math.pow(2.0D, (double)var2 / 7.0D));
			var0 += var3;
			field4083[var1] = var0 / 4;
		}

	}

	class323() throws Throwable {
		throw new Error();
	}
}
