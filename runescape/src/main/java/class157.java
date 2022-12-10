public class class157 extends class152 {
	String field1487;
	long field1491;
	// $FF: synthetic field
	final class143 this$0;

	class157(class143 var1) {
		this.this$0 = var1;
		this.field1491 = -1L;
		this.field1487 = null;
	}

	void method2674(class467 var1) {
		if (var1.method8326() != 255) {
			--var1.field4915;
			this.field1491 = var1.method8492();
		}

		this.field1487 = var1.method8334();
	}

	void method2677(class146 var1) {
		var1.method2579(this.field1491, this.field1487);
	}

	static final void method2718(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}

		if (var0 > 383) {
			var0 = 383;
		}

		if (class79.field730 < var0) {
			class79.field730 += class93.field907 * (var0 - class79.field730) / 1000 + class408.field4615;
			if (class79.field730 > var0) {
				class79.field730 = var0;
			}
		}

		if (class79.field730 > var0) {
			class79.field730 -= class408.field4615 + (class79.field730 - var0) * class93.field907 / 1000;
			if (class79.field730 < var0) {
				class79.field730 = var0;
			}
		}

		int var3 = var1 - class113.field1145;
		if (var3 > 1024) {
			var3 -= 2048;
		}

		if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 > 0) {
			class113.field1145 += class408.field4615 + var3 * class93.field907 / 1000;
			class113.field1145 &= 2047;
		}

		if (var3 < 0) {
			class113.field1145 -= -var3 * class93.field907 / 1000 + class408.field4615;
			class113.field1145 &= 2047;
		}

		int var4 = var1 - class113.field1145;
		if (var4 > 1024) {
			var4 -= 2048;
		}

		if (var4 < -1024) {
			var4 += 2048;
		}

		if (var4 < 0 && var3 > 0 || var4 > 0 && var3 < 0) {
			class113.field1145 = var1;
		}

	}
}
