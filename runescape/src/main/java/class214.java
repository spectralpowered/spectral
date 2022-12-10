public class class214 {
	int field2537;
	int field2538;
	int field2539;
	int field2540;
	int field2541;
	int field2542;

	class214(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field2542 = var1;
		this.field2538 = var2;
		this.field2539 = var3;
		this.field2540 = var4;
		this.field2541 = var5;
		this.field2537 = var6;
	}

	public static class183 method4351(int var0) {
		class183 var2 = (class183)class183.field1994.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class183.field1992.method6374(12, var0);
			var2 = new class183();
			if (var3 != null) {
				var2.method3500(new class467(var3));
			}

			var2.method3501();
			class183.field1994.method5364(var2, (long)var0);
			return var2;
		}
	}
}
