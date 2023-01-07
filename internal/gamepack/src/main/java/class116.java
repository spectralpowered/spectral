import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "lp"
)
public final class class116 {
	@ObfInfo(
		owner = "lp",
		name = "o",
		desc = "(Ljava/lang/String;I)V"
	)
	static final void method453(String var0) {
		StringBuilder var10000 = (new StringBuilder()).append(var0);
		class177 var10001 = (class177)null;
		String var2 = var10000.append(class177.field1505).toString();
		class164.method765(30, "", var2);
	}

	@ObfInfo(
		owner = "lp",
		name = "kw",
		desc = "(Lkd;Lgr;IIZS)V"
	)
	static final void method452(class120 var0, class263 var1, int var2, int var3, boolean var4) {
		String[] var6 = var1.field2164;
		byte var7 = -1;
		String var8 = null;
		if (null != var6 && null != var6[var3]) {
			if (var3 == 0) {
				var7 = 33;
			} else if (var3 == 1) {
				var7 = 34;
			} else if (var3 == 2) {
				var7 = 35;
			} else if (var3 == 3) {
				var7 = 36;
			} else {
				var7 = 37;
			}

			var8 = var6[var3];
		} else if (var3 == 4) {
			var7 = 37;
			var8 = class177.field1638;
		}

		if (var7 != -1 && null != var8) {
			class323.method1653(var8, class238.method1032(16748608) + var1.field2147, var7, 0, var2, var0.field985, var1.field2168, var4);
		}

	}
}
