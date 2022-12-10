public class class477 {
	public static int field5007;
	public static int[] field5009;
	static int field5008;

	class477() throws Throwable {
		throw new Error();
	}

	static class491 method6472() {
		class491 var1 = new class491();
		var1.field5061 = class336.field4226;
		var1.field5062 = field5007;
		var1.field5059 = field5009[0];
		var1.field5060 = class392.field4524[0];
		var1.field5057 = class7.field44[0];
		var1.field5056 = class186.field2042[0];
		int var2 = var1.field5056 * var1.field5057;
		byte[] var3 = class227.field2749[0];
		var1.field5067 = new int[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var1.field5067[var4] = class271.field3171[var3[var4] & 255];
		}

		field5009 = null;
		class392.field4524 = null;
		class7.field44 = null;
		class186.field2042 = null;
		class271.field3171 = null;
		class227.field2749 = (byte[][])null;
		return var1;
	}
}
