public class class288 {
	public int field3375;
	public int field3376;
	public int field3377;

	class288() {
	}

	static void method5482(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;

		for (int var5 = 0; var5 < class200.field2292; ++var5) {
			class200 var6 = class208.method4105(var5);
			if ((!var1 || var6.field2303) && -1 == var6.field2294 && var6.field2259.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					class80.field743 = -1;
					class20.field117 = null;
					return;
				}

				if (var4 >= var3.length) {
					short[] var7 = new short[2 * var3.length];

					for (int var8 = 0; var8 < var4; ++var8) {
						var7[var8] = var3[var8];
					}

					var3 = var7;
				}

				var3[var4++] = (short)var5;
			}
		}

		class20.field117 = var3;
		class108.field1098 = 0;
		class80.field743 = var4;
		String[] var9 = new String[class80.field743];

		for (int var10 = 0; var10 < class80.field743; ++var10) {
			var9[var10] = class208.method4105(var3[var10]).field2259;
		}

		short[] var11 = class20.field117;
		class101.method2076(var9, var11, 0, var9.length - 1);
	}
}
