public class class256 {
	static class290 field2991;
	static final class256 field2993;
	static final class256 field2994;
	final int field2995;

	static {
		field2994 = new class256(0);
		field2993 = new class256(1);
	}

	class256(int var1) {
		this.field2995 = var1;
	}

	static void method5069(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (null == var7 || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method5069(var0, var1, var2, var6 - 1);
			method5069(var0, var1, var6 + 1, var3);
		}

	}

	static void method5068() {
		if (class40.field285 != null) {
			client.field1983 = client.field1700;
			class40.field285.method6619();

			for (int var1 = 0; var1 < client.field1816.length; ++var1) {
				if (client.field1816[var1] != null) {
					class40.field285.method6608((client.field1816[var1].field1012 >> 7) + class151.field1447, class388.field4509 + (client.field1816[var1].field948 >> 7));
				}
			}
		}

	}
}
