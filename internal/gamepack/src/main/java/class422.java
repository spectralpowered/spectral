import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "lj"
)
public class class422 {
	static {
		int var0 = 0;
		int var1 = 0;
		class159[] var2 = class450.method2239();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class159 var4 = var2[var3];
			if (var4.field1217 > var0) {
				var0 = var4.field1217;
			}

			if (var4.field1218 > var1) {
				var1 = var4.field1218;
			}
		}

	}

	@ObfInfo(
		owner = "lj",
		name = "e",
		desc = "(IB)Lfq;"
	)
	public static class169 method2050(int var0) {
		class169 var2 = (class169)class169.field1267.method394((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class169.field1268.method1365(5, var0);
			var2 = new class169();
			if (var3 != null) {
				var2.method786(new class127(var3));
			}

			class169.field1267.method396(var2, (long)var0);
			return var2;
		}
	}
}
