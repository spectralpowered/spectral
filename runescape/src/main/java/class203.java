public class class203 extends class439 {
	public static class282 field2322;
	public static class337 field2321;
	static final int[] field2327;
	public int field2323;
	public int field2324;
	public int field2325;

	public class203() {
	}

	static {
		field2322 = new class282(64);
		field2327 = new int[32];
		int var0 = 2;

		for (int var1 = 0; var1 < 32; ++var1) {
			field2327[var1] = var0 - 1;
			var0 += var0;
		}

	}

	static class65 method4006(int var0) {
		class65 var2 = (class65)class65.field529.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class72.field619.method6374(var0, 0);
			if (null == var3) {
				return null;
			} else {
				var2 = class61.method1179(var3);
				class65.field529.method5364(var2, (long)var0);
				return var2;
			}
		}
	}

	public static void method3614(class337 var0) {
		field2321 = var0;
	}

	public void method3995(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method3996(var1, var3);
		}
	}

	void method3996(class467 var1, int var2) {
		if (var2 == 1) {
			this.field2323 = var1.method8328();
			this.field2324 = var1.method8326();
			this.field2325 = var1.method8326();
		}

	}

	public static String method4001(String var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];
		byte var4 = 2;

		for (int var5 = 0; var5 < var2; ++var5) {
			char var6 = var0.charAt(var5);
			if (var4 == 0) {
				var6 = Character.toLowerCase(var6);
			} else if (var4 == 2 || Character.isUpperCase(var6)) {
				char var7;
				if (var6 != 181 && var6 != 402) {
					var7 = Character.toTitleCase(var6);
				} else {
					var7 = var6;
				}

				var6 = var7;
			}

			if (Character.isLetter(var6)) {
				var4 = 0;
			} else if (var6 != '.' && var6 != '?' && var6 != '!') {
				if (Character.isSpaceChar(var6)) {
					if (var4 != 2) {
						var4 = 1;
					}
				} else {
					var4 = 1;
				}
			} else {
				var4 = 2;
			}

			var3[var5] = var6;
		}

		return new String(var3);
	}
}
