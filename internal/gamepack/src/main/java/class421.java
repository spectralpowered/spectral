import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "do"
)
public class class421 {
	@ObfInfo(
		owner = "do",
		name = "e",
		desc = "(IB)Lgz;"
	)
	public static class423 method2049(int var0, byte var1) {
		class423 var2 = (class423)class423.field3459.method394((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class423.field3465.method1365(9, var0);
			var2 = new class423();
			var2.field3461 = var0;
			if (null != var3) {
				if (var1 <= -1) {
					throw new IllegalStateException();
				}

				var2.method2065(new class127(var3));
			}

			var2.method2051();
			class423.field3459.method396(var2, (long)var0);
			return var2;
		}
	}
}
