public class class74 extends class439 {
	class398 field668;
	class398 field669;
	class483 field672;
	int field670;
	int field671;
	int field679;
	String field673;
	String field675;
	String field676;

	public static final synchronized long method1493() {
		long var1 = System.currentTimeMillis();
		if (var1 < class47.field343) {
			class263.field3020 += class47.field343 - var1;
		}

		class47.field343 = var1;
		return class263.field3020 + var1;
	}

	class74(int var1, String var2, String var3, String var4) {
		this.field668 = class398.field4550;
		this.field669 = class398.field4550;
		this.method1483(var1, var2, var3, var4);
	}

	void method1483(int var1, String var2, String var3, String var4) {
		int var6 = ++class105.field1083 - 1;
		this.field671 = var6;
		this.field679 = client.field1700;
		this.field670 = var1;
		this.field673 = var2;
		this.method1479();
		this.field675 = var3;
		this.field676 = var4;
		this.method1485();
		this.method1476();
	}

	void method1485() {
		this.field668 = class398.field4550;
	}

	final boolean method1474() {
		if (this.field668 == class398.field4550) {
			this.method1475();
		}

		return this.field668 == class398.field4551;
	}

	void method1475() {
		this.field668 = class405.field4602.field470.method7293(this.field672) ? class398.field4551 : class398.field4552;
	}

	void method1476() {
		this.field669 = class398.field4550;
	}

	final boolean method1477() {
		if (this.field669 == class398.field4550) {
			this.method1478();
		}

		return this.field669 == class398.field4551;
	}

	void method1478() {
		this.field669 = class405.field4602.field471.method7293(this.field672) ? class398.field4551 : class398.field4552;
	}

	final void method1479() {
		if (null != this.field673) {
			this.field672 = new class483(class263.method5257(this.field673), class54.field404);
		} else {
			this.field672 = null;
		}

	}

	static int method1502() {
		return client.field1922 ? 2 : 1;
	}

	static int method1496(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.LC_NAME) {
			int var4 = class69.field579[--class94.field920];
			class196 var5 = class165.method2780(var4);
			class69.field580[++class69.field581 - 1] = var5 != null ? var5.field2173 : "";
			return 1;
		} else {
			return 2;
		}
	}
}
