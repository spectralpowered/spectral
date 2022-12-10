final class class82 implements class304 {
	static int field755;
	static int field757;
	// $FF: synthetic field
	final class290 val$cc;

	class82(class290 var1) {
		this.val$cc = var1;
	}

	public void method6088() {
		if (null != this.val$cc && this.val$cc.method5528().field3671 != null) {
			class80 var2 = new class80();
			var2.method1605(this.val$cc);
			var2.method1603(this.val$cc.method5528().field3671);
			client.method4352().method6572(var2);
		}

	}

	static void method1636(int var0) {
		client.field1921 = 0L;
		if (var0 >= 2) {
			client.field1922 = true;
		} else {
			client.field1922 = false;
		}

		if (class74.method1502() == 1) {
			class122.field1212.method511(765, 503);
		} else {
			class122.field1212.method511(7680, 2160);
		}

		if (client.field1698 >= 25) {
			client.method683();
		}

	}
}
