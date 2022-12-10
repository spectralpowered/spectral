public class class104 implements class343 {
	static int field1078;
	static final class104 field1073;
	static final class104 field1075;
	static final class104 field1076;
	static final class104 field1077;
	static final class104 field1079;
	final int field1074;

	public static class290 method2089(int var0, int var1) {
		class290 var3 = class180.method2988(var0);
		if (var1 == -1) {
			return var3;
		} else {
			return null != var3 && null != var3.field3541 && var1 < var3.field3541.length ? var3.field3541[var1] : null;
		}
	}

	static {
		field1079 = new class104(0);
		field1073 = new class104(1);
		field1077 = new class104(2);
		field1075 = new class104(3);
		field1076 = new class104(4);
	}

	class104(int var1) {
		this.field1074 = var1;
	}

	public int method6487() {
		return this.field1074;
	}
}
