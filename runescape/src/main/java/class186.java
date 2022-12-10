public class class186 extends class439 {
	public static class337 field2041;
	public static int[] field2042;
	static class282 field2038;
	static class86 field2040;
	static int[] field2037;
	class454 field2039;

	static {
		field2038 = new class282(64);
	}

	class186() {
	}

	public static class186 method2182(int var0) {
		class186 var2 = (class186)field2038.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = field2041.method6374(34, var0);
			var2 = new class186();
			if (null != var3) {
				var2.method3606(new class467(var3));
			}

			var2.method3604();
			field2038.method5364(var2, (long)var0);
			return var2;
		}
	}

	public static int method3595(byte[] var0, int var1, CharSequence var2) {
		int var4 = var2.length();
		int var5 = var1;

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var2.charAt(var6);
			if (var7 <= 127) {
				var0[var5++] = (byte)var7;
			} else if (var7 <= 2047) {
				var0[var5++] = (byte)(192 | var7 >> 6);
				var0[var5++] = (byte)(128 | var7 & '?');
			} else {
				var0[var5++] = (byte)(224 | var7 >> '\f');
				var0[var5++] = (byte)(128 | var7 >> 6 & 63);
				var0[var5++] = (byte)(128 | var7 & '?');
			}
		}

		return var5 - var1;
	}

	void method3604() {
	}

	void method3606(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method3589(var1, var3);
		}
	}

	void method3589(class467 var1, int var2) {
		if (var2 == 249) {
			this.field2039 = class63.method1199(var1, this.field2039);
		}

	}

	public int method3593(int var1, int var2) {
		return class123.method2323(this.field2039, var1, var2);
	}

	public String method3594(int var1, String var2) {
		class454 var5 = this.field2039;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class426 var6 = (class426)var5.method8135((long)var1);
			if (var6 == null) {
				var4 = var2;
			} else {
				var4 = (String)var6.field4735;
			}
		}

		return var4;
	}
}
