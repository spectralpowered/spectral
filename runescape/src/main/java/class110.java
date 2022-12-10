public class class110 extends class409 {
	public static String field1118;
	final boolean field1123;

	public class110(boolean var1) {
		this.field1123 = var1;
	}

	int method2177(class391 var1, class391 var2) {
		if (var1.field4520 != var2.field4520) {
			return this.field1123 ? var1.field4520 - var2.field4520 : var2.field4520 - var1.field4520;
		} else {
			return this.method7584(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2177((class391)var1, (class391)var2);
	}

	static void method2183() {
		if (client.field1727) {
			class246.method4885(class142.field1370, false);
		}

	}
}
