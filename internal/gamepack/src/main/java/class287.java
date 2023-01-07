import io.spectralpowered.ObfInfo;
import java.util.concurrent.Callable;

@ObfInfo(
	name = "cl"
)
public class class287 implements Callable {
	@ObfInfo(
		owner = "cl",
		name = "u",
		desc = "Lrx;"
	)
	static class266 field2366;

	@ObfInfo(
		owner = "cl",
		name = "<init>",
		desc = "()V"
	)
	class287() {
	}

	@ObfInfo(
		owner = "cl",
		name = "call",
		desc = "()Ljava/lang/Object;"
	)
	public Object call() {
		return class184.method837();
	}

	@ObfInfo(
		owner = "cl",
		name = "o",
		desc = "(IB)Lha;"
	)
	static class298 method1422(int var0) {
		class298 var2 = (class298)class242.field2030.method394((long)var0);
		if (null != var2) {
			return var2;
		} else {
			class274 var4 = class242.field2028;
			class274 var5 = class309.field2462;
			boolean var6 = true;
			int[] var7 = var4.method1351(var0);

			for (int var8 = 0; var8 < var7.length; ++var8) {
				byte[] var9 = var4.method1348(var0, var7[var8]);
				if (null == var9) {
					var6 = false;
				} else {
					int var10 = (var9[0] & 255) << 8 | var9[1] & 255;
					byte[] var11 = var5.method1348(var10, 0);
					if (var11 == null) {
						var6 = false;
					}
				}
			}

			class298 var3;
			if (!var6) {
				var3 = null;
			} else {
				try {
					var3 = new class298(var4, var5, var0, false);
				} catch (Exception var13) {
					var3 = null;
				}
			}

			if (var3 != null) {
				class242.field2030.method396(var3, (long)var0);
			}

			return var3;
		}
	}
}
