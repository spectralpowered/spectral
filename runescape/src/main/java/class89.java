final class class89 implements class304 {
	static int field857;
	// $FF: synthetic field
	final class290 val$cc;

	static float method1953(class125 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var3 = var1 - var0.field1244;
			return (var0.field1238 + var3 * (var0.field1246 * var3 + var0.field1260)) * var3 + var0.field1249;
		}
	}

	class89(class290 var1) {
		this.val$cc = var1;
	}

	public void method6088() {
		if (this.val$cc != null && this.val$cc.method5528().field3672 != null) {
			class80 var2 = new class80();
			var2.method1605(this.val$cc);
			var2.method1603(this.val$cc.method5528().field3672);
			client.method4352().method6572(var2);
		}

	}
}
