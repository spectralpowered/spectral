public class class129 extends class409 {
	final boolean field1276;

	public class129(boolean var1) {
		this.field1276 = var1;
	}

	int method2421(class391 var1, class391 var2) {
		if (client.field1864 == var1.field4520 && var2.field4520 == client.field1864) {
			return this.field1276 ? var1.method7628().method8779(var2.method7628()) : var2.method7628().method8779(var1.method7628());
		} else {
			return this.method7584(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2421((class391)var1, (class391)var2);
	}

	static class78 method2429() {
		return class78.field707 < class78.field709 ? class78.field710[++class78.field707 - 1] : null;
	}
}
