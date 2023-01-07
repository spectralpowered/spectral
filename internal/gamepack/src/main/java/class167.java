import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "iv"
)
public class class167 {
	@ObfInfo(
		owner = "iv",
		name = "lw",
		desc = "Lkd;"
	)
	static class120 field1257;
	@ObfInfo(
		owner = "iv",
		name = "e",
		desc = "Liv;"
	)
	static final class167 field1258;
	@ObfInfo(
		owner = "iv",
		name = "h",
		desc = "Liv;"
	)
	static final class167 field1259;
	@ObfInfo(
		owner = "iv",
		name = "v",
		desc = "I"
	)
	final int field1260;

	static {
		field1259 = new class167(0);
		field1258 = new class167(1);
	}

	@ObfInfo(
		owner = "iv",
		name = "<init>",
		desc = "(I)V"
	)
	class167(int var1) {
		this.field1260 = var1;
	}

	@ObfInfo(
		owner = "iv",
		name = "v",
		desc = "([Ljava/lang/String;[IIII)V"
	)
	static void method783(String[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var5 = (var2 + var3) / 2;
			int var6 = var2;
			String var7 = var0[var5];
			var0[var5] = var0[var3];
			var0[var3] = var7;
			int var8 = var1[var5];
			var1[var5] = var1[var3];
			var1[var3] = var8;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (null == var7 || var0[var9] != null && var0[var9].compareTo(var7) < (var9 & 1)) {
					String var10 = var0[var9];
					var0[var9] = var0[var6];
					var0[var6] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var6];
					var1[var6++] = var11;
				}
			}

			var0[var3] = var0[var6];
			var0[var6] = var7;
			var1[var3] = var1[var6];
			var1[var6] = var8;
			method783(var0, var1, var2, var6 - 1);
			method783(var0, var1, var6 + 1, var3);
		}

	}

	@ObfInfo(
		owner = "iv",
		name = "nv",
		desc = "(B)V"
	)
	static void method782() {
		if (class214.field1874 != null) {
			client.field514 = client.field231;
			class214.field1874.method2077();

			for (int var1 = 0; var1 < client.field347.length; ++var1) {
				if (client.field347[var1] != null) {
					class214.field1874.method2074((client.field347[var1].field2672 >> 7) + class312.field2465, class325.field2575 + (client.field347[var1].field2608 >> 7));
				}
			}
		}

	}
}
