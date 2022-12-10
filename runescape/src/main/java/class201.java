public class class201 implements class343 {
	public static final class201 field2308;
	public static final class201 field2309;
	public static final class201 field2310;
	public static final class201 field2311;
	public byte field2312;

	static {
		field2308 = new class201((byte)-1);
		field2310 = new class201((byte)0);
		field2309 = new class201((byte)1);
		field2311 = new class201((byte)2);
	}

	class201(byte var1) {
		this.field2312 = var1;
	}

	public int method6487() {
		return this.field2312;
	}

	static final void method3986() {
		for (class91 var1 = (class91)client.field1919.method6577(); var1 != null; var1 = (class91)client.field1919.method6579()) {
			if (var1.field876 == -1) {
				var1.field865 = 0;
				class126.method2400(var1);
			} else {
				var1.method7951();
			}
		}

	}
}
