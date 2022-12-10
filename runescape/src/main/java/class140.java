public class class140 extends class152 {
	static class386 field1352;
	static int field1357;
	static String field1356;
	int field1351;
	String field1358;
	// $FF: synthetic field
	final class143 this$0;

	public static class461 method2534(int var0) {
		class461 var2 = (class461)class461.field4896.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class461.field4897.method6374(39, var0);
			var2 = new class461();
			if (var3 != null) {
				var2.method8216(new class467(var3));
			}

			var2.method8218();
			class461.field4896.method5364(var2, (long)var0);
			return var2;
		}
	}

	class140(class143 var1) {
		this.this$0 = var1;
	}

	void method2674(class467 var1) {
		this.field1351 = var1.method8480();
		this.field1358 = var1.method8335();
	}

	void method2677(class146 var1) {
		var1.method2587(this.field1351, this.field1358);
	}
}
