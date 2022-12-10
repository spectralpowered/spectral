public class class173 extends class439 {
	static class282 field1630;
	static class337 field1631;
	static int field1632;
	public int field1629;

	static {
		field1630 = new class282(64);
	}

	class173() {
		this.field1629 = 0;
	}

	public static void method2120(class337 var0) {
		field1631 = var0;
	}

	void method2929(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method2936(var1, var3);
		}
	}

	void method2936(class467 var1, int var2) {
		if (var2 == 2) {
			this.field1629 = var1.method8328();
		}

	}
}
