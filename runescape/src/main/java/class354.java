public class class354 {
	static char[] field4300;
	static char[] field4302;
	static char[] field4303;
	static int[] field4301;

	static {
		field4300 = new char[64];

		int var0;
		for (var0 = 0; var0 < 26; ++var0) {
			field4300[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4300[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4300[var0] = (char)(var0 + 48 - 52);
		}

		field4300[62] = '+';
		field4300[63] = '/';
		field4303 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4303[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4303[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4303[var0] = (char)(var0 + 48 - 52);
		}

		field4303[62] = '*';
		field4303[63] = '-';
		field4302 = new char[64];

		for (var0 = 0; var0 < 26; ++var0) {
			field4302[var0] = (char)(var0 + 65);
		}

		for (var0 = 26; var0 < 52; ++var0) {
			field4302[var0] = (char)(var0 + 97 - 26);
		}

		for (var0 = 52; var0 < 62; ++var0) {
			field4302[var0] = (char)(var0 + 48 - 52);
		}

		field4302[62] = '-';
		field4302[63] = '_';
		field4301 = new int[128];

		for (var0 = 0; var0 < field4301.length; ++var0) {
			field4301[var0] = -1;
		}

		for (var0 = 65; var0 <= 90; ++var0) {
			field4301[var0] = var0 - 65;
		}

		for (var0 = 97; var0 <= 122; ++var0) {
			field4301[var0] = var0 - 97 + 26;
		}

		for (var0 = 48; var0 <= 57; ++var0) {
			field4301[var0] = var0 - 48 + 52;
		}

		int[] var2 = field4301;
		field4301[43] = 62;
		var2[42] = 62;
		int[] var1 = field4301;
		field4301[47] = 63;
		var1[45] = 63;
	}

	class354() throws Throwable {
		throw new Error();
	}
}
