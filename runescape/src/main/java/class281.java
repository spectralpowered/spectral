public abstract class class281 implements class272 {
	static class386 field3307;
	protected int field3306;

	protected class281(class335 var1, class340 var2, int var3) {
		this.field3306 = var3;
	}

	static int method5350(int var0, int var1, int var2) {
		if (0 != (class84.field773[var0][var1][var2] & 8)) {
			return 0;
		} else {
			return var0 > 0 && 0 != (class84.field773[1][var1][var2] & 2) ? var0 - 1 : var0;
		}
	}

	static void method5351(class88 var0, int var1, int var2) {
		if (var1 == var0.field989 && var1 != -1) {
			int var4 = class214.method4351(var1).field1991;
			if (var4 == 1) {
				var0.field980 = 0;
				var0.field991 = 0;
				var0.field992 = var2;
				var0.field993 = 0;
			}

			if (var4 == 2) {
				var0.field993 = 0;
			}
		} else if (var1 == -1 || var0.field989 == -1 || class214.method4351(var1).field2015 >= class214.method4351(var0.field989).field2015) {
			var0.field989 = var1;
			var0.field980 = 0;
			var0.field991 = 0;
			var0.field992 = var2;
			var0.field993 = 0;
			var0.field1022 = var0.field947;
		}

	}
}
