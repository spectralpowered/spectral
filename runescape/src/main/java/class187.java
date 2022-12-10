public class class187 extends class439 {
	static class290 field2044;

	static {
		new class282(64);
	}

	class187() throws Throwable {
		throw new Error();
	}

	public static void method2496(class337 var0) {
	}

	static boolean method3611(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}

					if (var9 == '+' && var2) {
						continue;
					}
				}

				int var11;
				if (var9 >= '0' && var9 <= '9') {
					var11 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var11 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						return false;
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					return false;
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var1 * var6 + var11;
				if (var10 / var1 != var6) {
					return false;
				}

				var6 = var10;
				var5 = true;
			}

			return var5;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
