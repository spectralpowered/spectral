public final class class263 {
	static long field3020;

	class263() throws Throwable {
		throw new Error();
	}

	static class469[] method5259() {
		class469[] var1 = new class469[class477.field5008];

		for (int var2 = 0; var2 < class477.field5008; ++var2) {
			class469 var3 = var1[var2] = new class469();
			var3.field4926 = class336.field4226;
			var3.field4929 = class477.field5007;
			var3.field4924 = class477.field5009[var2];
			var3.field4927 = class392.field4524[var2];
			var3.field4928 = class7.field44[var2];
			var3.field4925 = class186.field2042[var2];
			var3.field4923 = class271.field3171;
			var3.field4922 = class227.field2749[var2];
		}

		class477.field5009 = null;
		class392.field4524 = null;
		class7.field44 = null;
		class186.field2042 = null;
		class271.field3171 = null;
		class227.field2749 = (byte[][])null;
		return var1;
	}

	static int method5258(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.GETWINDOWMODE) {
			class69.field579[++class94.field920 - 1] = class74.method1502();
			return 1;
		} else {
			int var4;
			if (var0 == CS2Opcodes.SETWINDOWMODE) {
				var4 = class69.field579[--class94.field920];
				if (var4 == 1 || var4 == 2) {
					class82.method1636(var4);
				}

				return 1;
			} else if (var0 == CS2Opcodes.GETDEFAULTWINDOWMODE) {
				class69.field579[++class94.field920 - 1] = class186.field2040.method1796();
				return 1;
			} else if (var0 != CS2Opcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == CS2Opcodes._5310) {
					--class94.field920;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = class69.field579[--class94.field920];
				if (var4 == 1 || var4 == 2) {
					class186.field2040.method1822(var4);
				}

				return 1;
			}
		}
	}

	static final void method5260(int var0, int var1, int var2, int var3, class491 var4, class308 var5) {
		if (var4 != null) {
			int var7 = client.field1770 & 2047;
			int var8 = var2 * var2 + var3 * var3;
			if (var8 <= 6400) {
				int var9 = class221.field2667[var7];
				int var10 = class221.field2690[var7];
				int var11 = var3 * var9 + var10 * var2 >> 16;
				int var12 = var10 * var3 - var2 * var9 >> 16;
				if (var8 > 2500) {
					var4.method8865(var5.field3679 / 2 + var11 - var4.field5061 / 2, var5.field3680 / 2 - var12 - var4.field5062 / 2, var0, var1, var5.field3679, var5.field3680, var5.field3681, var5.field3678);
				} else {
					var4.method8866(var0 + var5.field3679 / 2 + var11 - var4.field5061 / 2, var5.field3680 / 2 + var1 - var12 - var4.field5062 / 2);
				}

			}
		}
	}

	static String method5257(String var0) {
		class329[] var2 = class329.method2501();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class329 var4 = var2[var3];
			if (var4.field4163 != -1 && var0.startsWith(class79.method8214(var4.field4163))) {
				var0 = var0.substring(6 + Integer.toString(var4.field4163).length());
				break;
			}
		}

		return var0;
	}
}
