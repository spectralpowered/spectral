public class class375 {
	int field4449;
	int field4450;
	int field4451;
	int field4452;

	class375() throws Throwable {
		throw new Error();
	}

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4450).length();
		int var3 = 10 - Integer.toString(this.field4451).length();
		int var4 = 10 - Integer.toString(this.field4449).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4450 + var5 + "Created: " + this.field4449 + var7 + "Total used: " + this.field4451 + var6 + "Max-In-Use: " + this.field4452;
	}

	public static long method7030(int var0) {
		if (var0 > 63) {
			throw new class344("Cannot generate max unsigned value for more than 63 bits as this is greater than the boundaries of a java long. Value provided: %d", new Object[]{var0});
		} else {
			return (long)Math.pow(2.0D, (double)var0) - 1L;
		}
	}

	static class491[] method7033() {
		class491[] var1 = new class491[class477.field5008];

		for (int var2 = 0; var2 < class477.field5008; ++var2) {
			class491 var3 = var1[var2] = new class491();
			var3.field5061 = class336.field4226;
			var3.field5062 = class477.field5007;
			var3.field5059 = class477.field5009[var2];
			var3.field5060 = class392.field4524[var2];
			var3.field5057 = class7.field44[var2];
			var3.field5056 = class186.field2042[var2];
			int var4 = var3.field5056 * var3.field5057;
			byte[] var5 = class227.field2749[var2];
			var3.field5067 = new int[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				var3.field5067[var6] = class271.field3171[var5[var6] & 255];
			}
		}

		class477.field5009 = null;
		class392.field4524 = null;
		class7.field44 = null;
		class186.field2042 = null;
		class271.field3171 = null;
		class227.field2749 = (byte[][])null;
		return var1;
	}

	static final int method7032(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var4 = var2 / 2 + (var0 / 4 << 10) + (var1 / 32 << 7);
		return var4;
	}
}
