import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "kb"
)
public class class146 {
	@ObfInfo(
		owner = "kb",
		name = "h",
		desc = "I"
	)
	public int field1160;
	@ObfInfo(
		owner = "kb",
		name = "v",
		desc = "I"
	)
	public int field1161;
	@ObfInfo(
		owner = "kb",
		name = "e",
		desc = "I"
	)
	public int field1162;

	@ObfInfo(
		owner = "kb",
		name = "<init>",
		desc = "()V"
	)
	class146() {
	}

	@ObfInfo(
		owner = "kb",
		name = "mp",
		desc = "(Ljava/lang/String;ZI)V"
	)
	static void method693(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var3 = new short[16];
		int var4 = 0;

		for (int var5 = 0; var5 < class263.field2179; ++var5) {
			class263 var6 = class423.method2062(var5);
			if ((!var1 || var6.field2190) && -1 == var6.field2181 && var6.field2147.toLowerCase().indexOf(var0) != -1) {
				if (var4 >= 250) {
					class488.field4076 = -1;
					class3.field22 = null;
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

		class3.field22 = var3;
		class61.field605 = 0;
		class488.field4076 = var4;
		String[] var9 = new String[class488.field4076];

		for (int var10 = 0; var10 < class488.field4076; ++var10) {
			var9[var10] = class423.method2062(var3[var10]).field2147;
		}

		short[] var11 = class3.field22;
		class79.method332(var9, var11, 0, var9.length - 1);
	}
}
