import java.io.IOException;

public class class436 {
	public static final class436 field4786;
	public static final class436 field4787;
	public static final class436 field4789;
	public static final class436 field4790;
	public static final class436 field4791;
	public static final class436 field4793;
	static class326 field4788;
	String field4792;

	static {
		field4791 = new class436("p11_full");
		field4787 = new class436("p12_full");
		field4793 = new class436("b12_full");
		field4789 = new class436("verdana_11pt_regular");
		field4790 = new class436("verdana_13pt_regular");
		field4786 = new class436("verdana_15pt_regular");
	}

	public static class436[] method7978() {
		return new class436[]{field4787, field4789, field4793, field4786, field4790, field4791};
	}

	class436(String var1) {
		this.field4792 = var1;
	}

	static void method7974() {
		if (class73.field647) {
			class219.field2653 = null;
			class209.field2425 = null;
			class73.field630 = null;
			class90.field860 = null;
			class2.field12 = null;
			class73.field631 = null;
			class127.field1267 = null;
			class243.field2900 = null;
			class92.field882 = null;
			class59.field457 = null;
			class94.field922 = null;
			class227.field2747 = null;
			class275.field3187 = null;
			class100.field1042 = null;
			class151.field1450.method1982();
			class300.method6996(2);
			if (class334.field4215 != null) {
				try {
					class467 var1 = new class467(4);
					var1.method8323(2);
					var1.method8516(0);
					class334.field4215.method7605(var1.field4917, 0, 4);
				} catch (IOException var4) {
					try {
						class334.field4215.method7609();
					} catch (Exception var3) {
					}

					++class334.field4203;
					class334.field4215 = null;
				}
			}

			class73.field647 = false;
		}
	}

	static final void method7977(boolean var0) {
		client.method3406();
		++client.field1748.field1108;
		if (client.field1748.field1108 >= 50 || var0) {
			client.field1748.field1108 = 0;
			if (!client.field1750 && client.field1748.method2157() != null) {
				class284 var2 = class152.method2679(class276.field3274, client.field1748.field1105);
				client.field1748.method2173(var2);

				try {
					client.field1748.method2164();
				} catch (IOException var4) {
					client.field1750 = true;
				}
			}

		}
	}

	static final String method7979(int var0) {
		String var2 = Integer.toString(var0);

		for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
			var2 = var2.substring(0, var3) + class79.field723 + var2.substring(var3);
		}

		if (var2.length() > 9) {
			return " " + class79.method2039(65408) + var2.substring(0, var2.length() - 8) + class321.field3928 + " " + class79.field722 + var2 + class79.field726 + class79.field729;
		} else {
			return var2.length() > 6 ? " " + class79.method2039(16777215) + var2.substring(0, var2.length() - 4) + class321.field3930 + " " + class79.field722 + var2 + class79.field726 + class79.field729 : " " + class79.method2039(16776960) + var2 + class79.field729;
		}
	}
}
