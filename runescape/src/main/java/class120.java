public class class120 implements class343 {
	static final class120 field1194;
	static final class120 field1195;
	static final class120 field1197;
	static final class120 field1201;
	static final class120 field1202;
	final int field1196;
	final int field1198;

	static {
		field1201 = new class120(0, 0);
		field1194 = new class120(1, 1);
		field1195 = new class120(2, 2);
		field1202 = new class120(3, 3);
		field1197 = new class120(4, 4);
	}

	static class120[] method5437() {
		return new class120[]{field1201, field1194, field1195, field1202, field1197};
	}

	class120(int var1, int var2) {
		this.field1198 = var1;
		this.field1196 = var2;
	}

	public int method6487() {
		return this.field1196;
	}

	static void method2300(boolean var0) {
		byte var2 = 0;
		boolean var3 = class186.field2040.method1786() >= client.field1693;
		if (!var3) {
			var2 = 12;
		} else if (class122.field1212.method3014() || class122.field1212.method3015()) {
			var2 = 10;
		}

		class73.method113(var2);
		if (var0) {
			class73.field652 = "";
			class73.field648 = "";
			class133.field1314 = 0;
			class154.field1469 = "";
		}

		class224.method4623();
		class49.method943();
	}
}
