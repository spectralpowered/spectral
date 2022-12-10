public class class302 {
	static class469 field3652;
	static int field3653;

	class302() throws Throwable {
		throw new Error();
	}

	public static byte method6078(char var0) {
		byte var2;
		if (var0 > 0 && var0 < 128 || var0 >= 160 && var0 <= 255) {
			var2 = (byte)var0;
		} else if (var0 == 8364) {
			var2 = -128;
		} else if (var0 == 8218) {
			var2 = -126;
		} else if (var0 == 402) {
			var2 = -125;
		} else if (var0 == 8222) {
			var2 = -124;
		} else if (var0 == 8230) {
			var2 = -123;
		} else if (var0 == 8224) {
			var2 = -122;
		} else if (var0 == 8225) {
			var2 = -121;
		} else if (var0 == 710) {
			var2 = -120;
		} else if (var0 == 8240) {
			var2 = -119;
		} else if (var0 == 352) {
			var2 = -118;
		} else if (var0 == 8249) {
			var2 = -117;
		} else if (var0 == 338) {
			var2 = -116;
		} else if (var0 == 381) {
			var2 = -114;
		} else if (var0 == 8216) {
			var2 = -111;
		} else if (var0 == 8217) {
			var2 = -110;
		} else if (var0 == 8220) {
			var2 = -109;
		} else if (var0 == 8221) {
			var2 = -108;
		} else if (var0 == 8226) {
			var2 = -107;
		} else if (var0 == 8211) {
			var2 = -106;
		} else if (var0 == 8212) {
			var2 = -105;
		} else if (var0 == 732) {
			var2 = -104;
		} else if (var0 == 8482) {
			var2 = -103;
		} else if (var0 == 353) {
			var2 = -102;
		} else if (var0 == 8250) {
			var2 = -101;
		} else if (var0 == 339) {
			var2 = -100;
		} else if (var0 == 382) {
			var2 = -98;
		} else if (var0 == 376) {
			var2 = -97;
		} else {
			var2 = 63;
		}

		return var2;
	}

	static final void method6074(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class186.field2040.method1787()) {
			if (class186.field2040.method1787() == 0 && client.field1945 != -1) {
				class300.method502(class174.field1635, client.field1945, 0, var0, false);
				client.field1946 = false;
			} else if (var0 == 0) {
				class300.method48();
				client.field1946 = false;
			} else {
				class300.method868(var0);
			}

			class186.field2040.method1776(var0);
		}

	}
}
