public class class21 {
	final int field124;
	final int field125;
	final String field126;

	class21(int var1, int var2, String var3) {
		this.field125 = var1;
		this.field124 = var2;
		this.field126 = var3;
	}

	class21(class467 var1) {
		this(var1.method8326(), var1.method8326(), var1.method8335());
	}

	String method303() {
		return Integer.toHexString(this.field125) + Integer.toHexString(this.field124) + this.field126;
	}

	int method304() {
		return this.field124;
	}
}
