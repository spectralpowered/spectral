public class class137 extends class139 {
	byte field1342;
	int field1343;
	int field1344;
	String field1345;
	// $FF: synthetic field
	final class134 this$0;

	public static class204 method2506(int var0) {
		class204 var2 = (class204)class204.field2331.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class204.field2335.method6374(11, var0);
			var2 = new class204();
			if (var3 != null) {
				var2.method4009(new class467(var3));
			}

			var2.method4017();
			class204.field2331.method5364(var2, (long)var0);
			return var2;
		}
	}

	class137(class134 var1) {
		this.this$0 = var1;
		this.field1343 = -1;
	}

	void method2518(class467 var1) {
		var1.method8326();
		this.field1343 = var1.method8328();
		this.field1342 = var1.method8327();
		this.field1344 = var1.method8328();
		var1.method8492();
		this.field1345 = var1.method8335();
		var1.method8326();
	}

	void method2519(class170 var1) {
		class135 var3 = (class135)var1.field1614.get(this.field1343);
		var3.field1330 = this.field1342;
		var3.field1329 = this.field1344;
		var3.field1327 = new class483(this.field1345);
	}
}
