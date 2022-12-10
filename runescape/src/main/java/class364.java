public class class364 {
	byte field4360;
	public int field4356;
	public int field4357;
	public int field4358;
	public int field4359;
	public int field4361;

	public class364() {
	}

	public class364(class467 var1, boolean var2) {
		this.field4360 = var1.method8327();
		this.field4357 = var1.method8328();
		this.field4358 = var1.method8480();
		this.field4359 = var1.method8480();
		this.field4361 = var1.method8480();
		this.field4356 = var1.method8480();
		if (var2) {
			int var4 = 0;
			boolean var5 = false;

			while (true) {
				int var6 = var1.method8326();
				if (var6 == 255) {
					Integer var3 = var5 ? var4 : null;
					this.method6769(var3);
					break;
				}

				if (var6 != 0) {
					throw new IllegalStateException("");
				}

				while (true) {
					int var7 = var1.method8326();
					if (var7 == 255) {
						break;
					}

					--var1.field4915;
					if (var1.method8328() != 0) {
						throw new IllegalStateException("");
					}

					if (var5) {
						throw new IllegalStateException("");
					}

					var4 = var1.method8480();
					var5 = true;
				}
			}
		}

	}

	void method6769(Integer var1) {
	}

	public int method6770() {
		return this.field4360 & 7;
	}

	public int method6776() {
		return (this.field4360 & 8) == 8 ? 1 : 0;
	}

	void method6780(int var1) {
		this.field4360 &= -8;
		this.field4360 = (byte)(this.field4360 | var1 & 7);
	}

	void method6772(int var1) {
		this.field4360 &= -9;
		if (var1 == 1) {
			this.field4360 = (byte)(this.field4360 | 8);
		}

	}
}
