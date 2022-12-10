public class class395 extends class391 {
	boolean field4545;
	boolean field4546;

	class395() {
	}

	int method7360(class395 var1) {
		if (client.field1864 == super.field4520 && client.field1864 != var1.field4520) {
			return -1;
		} else if (client.field1864 == var1.field4520 && client.field1864 != super.field4520) {
			return 1;
		} else if (0 != super.field4520 && var1.field4520 == 0) {
			return -1;
		} else if (var1.field4520 != 0 && 0 == super.field4520) {
			return 1;
		} else if (this.field4546 && !var1.field4546) {
			return -1;
		} else if (!this.field4546 && var1.field4546) {
			return 1;
		} else if (this.field4545 && !var1.field4545) {
			return -1;
		} else if (!this.field4545 && var1.field4545) {
			return 1;
		} else {
			return super.field4520 != 0 ? super.field4522 - var1.field4522 : var1.field4522 - super.field4522;
		}
	}

	public int method7627(class412 var1) {
		return this.method7360((class395)var1);
	}

	public int compareTo(Object var1) {
		return this.method7360((class395)var1);
	}

	static final void method7370(String var0) {
		if (!var0.equals("")) {
			class284 var2 = class152.method2679(class276.field3290, client.field1748.field1105);
			var2.field3321.method8323(class467.method190(var0));
			var2.field3321.method8316(var0);
			client.field1748.method2173(var2);
		}
	}
}
