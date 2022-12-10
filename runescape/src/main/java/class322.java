public class class322 {
	static {
		int var0 = 0;
		int var1 = 0;
		class331[] var2 = class331.method4939();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class331 var4 = var2[var3];
			if (var4.field4175 > var0) {
				var0 = var4.field4175;
			}

			if (var4.field4176 > var1) {
				var1 = var4.field4176;
			}
		}

	}

	public static class173 method6191(int var0) {
		class173 var2 = (class173)class173.field1630.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class173.field1631.method6374(5, var0);
			var2 = new class173();
			if (var3 != null) {
				var2.method2929(new class467(var3));
			}

			class173.field1630.method5364(var2, (long)var0);
			return var2;
		}
	}

	class322() throws Throwable {
		throw new Error();
	}
}
