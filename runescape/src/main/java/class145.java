public class class145 extends class152 {
	String field1384;
	long field1385;
	// $FF: synthetic field
	final class143 this$0;

	class145(class143 var1) {
		this.this$0 = var1;
		this.field1385 = -1L;
		this.field1384 = null;
	}

	void method2674(class467 var1) {
		if (var1.method8326() != 255) {
			--var1.field4915;
			this.field1385 = var1.method8492();
		}

		this.field1384 = var1.method8334();
	}

	void method2677(class146 var1) {
		var1.method2615(this.field1385, this.field1384, 0);
	}

	static int method2562(class337 var0, class337 var1) {
		int var3 = 0;
		String[] var4 = class73.field646;

		int var5;
		String var6;
		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var0.method6323(var6, "")) {
				++var3;
			}
		}

		var4 = class73.field644;

		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var1.method6323(var6, "")) {
				++var3;
			}
		}

		var4 = class73.field665;

		for (var5 = 0; var5 < var4.length; ++var5) {
			var6 = var4[var5];
			if (var1.method6319(var6) != -1 && var1.method6323(var6, "")) {
				++var3;
			}
		}

		return var3;
	}
}
