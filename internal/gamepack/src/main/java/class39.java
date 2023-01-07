import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gg"
)
public abstract class class39 {
	@ObfInfo(
		owner = "gg",
		name = "ak",
		desc = "Lrm;"
	)
	public static class54 field199;
	@ObfInfo(
		owner = "gg",
		name = "h",
		desc = "I"
	)
	public int field195;
	@ObfInfo(
		owner = "gg",
		name = "v",
		desc = "I"
	)
	public int field196;
	@ObfInfo(
		owner = "gg",
		name = "x",
		desc = "I"
	)
	public int field197;
	@ObfInfo(
		owner = "gg",
		name = "e",
		desc = "I"
	)
	public int field198;

	@ObfInfo(
		owner = "gg",
		name = "<init>",
		desc = "()V"
	)
	protected class39() {
	}

	@ObfInfo(
		owner = "gg",
		name = "h",
		desc = "(IIILgw;I)Z"
	)
	protected abstract boolean method165(int var1, int var2, int var3, class427 var4);

	@ObfInfo(
		owner = "gg",
		name = "h",
		desc = "(CB)Z"
	)
	public static final boolean method167(char var0) {
		if (Character.isISOControl(var0)) {
			return false;
		} else if (class87.method374(var0)) {
			return true;
		} else {
			char[] var2 = class383.field3229;

			int var3;
			char var4;
			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var4 == var0) {
					return true;
				}
			}

			var2 = class383.field3228;

			for (var3 = 0; var3 < var2.length; ++var3) {
				var4 = var2[var3];
				if (var0 == var4) {
					return true;
				}
			}

			return false;
		}
	}

	@ObfInfo(
		owner = "gg",
		name = "ij",
		desc = "(IIB)V"
	)
	static final void method166(int var0, int var1) {
		if (client.field238 == 2) {
			class241.method1043((client.field241 - class312.field2465 << 7) + client.field244, (client.field282 - class325.field2575 << 7) + client.field339, client.field243 * 2);
			if (client.field436 > -1 && client.field231 % 20 < 10) {
				class471.field3962[0].method1240(var0 + client.field436 - 12, var1 + client.field257 - 28);
			}

		}
	}
}
