import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "jo"
)
public class class247 {
	@ObfInfo(
		owner = "jo",
		name = "cb",
		desc = "[Lra;"
	)
	static class344[] field2058;

	@ObfInfo(
		owner = "jo",
		name = "h",
		desc = "(Lqx;I)V"
	)
	static final void method1077(class6 var0) {
		var0.method33();
		int var2 = client.field348;
		class380 var3 = class113.field846 = client.field347[var2] = new class380();
		var3.field3215 = var2;
		int var4 = var0.method35(30);
		byte var5 = (byte)(var4 >> 28);
		int var6 = var4 >> 14 & 16383;
		int var7 = var4 & 16383;
		var3.field2633[0] = var6 - class312.field2465;
		var3.field2672 = (var3.field2633[0] << 7) + (var3.method1881() << 6);
		var3.field2681[0] = var7 - class325.field2575;
		var3.field2608 = (var3.field2681[0] << 7) + (var3.method1881() << 6);
		class347.field2878 = var3.field3214 = var5;
		if (null != class268.field2218[var2]) {
			var3.method1882(class268.field2218[var2]);
		}

		class268.field2221 = 0;
		class268.field2220[++class268.field2221 - 1] = var2;
		class268.field2217[var2] = 0;
		class268.field2216 = 0;

		for (int var8 = 1; var8 < 2048; ++var8) {
			if (var2 != var8) {
				int var9 = var0.method35(18);
				int var10 = var9 >> 16;
				int var11 = var9 >> 8 & 597;
				int var12 = var9 & 597;
				class268.field2219[var8] = var12 + (var11 << 14) + (var10 << 28);
				class268.field2224[var8] = 0;
				class268.field2226[var8] = -1;
				class268.field2222[++class268.field2216 - 1] = var8;
				class268.field2217[var8] = 0;
			}
		}

		var0.method34();
	}

	@ObfInfo(
		owner = "jo",
		name = "hf",
		desc = "(IIIB)V"
	)
	static final void method1078(int var0, int var1, int var2) {
		if (class463.field3850 < var0) {
			class463.field3850 += class148.field1166 + (var0 - class463.field3850) * class438.field3645 / 1000;
			if (class463.field3850 > var0) {
				class463.field3850 = var0;
			}
		}

		if (class463.field3850 > var0) {
			class463.field3850 -= class148.field1166 + class438.field3645 * (class463.field3850 - var0) / 1000;
			if (class463.field3850 < var0) {
				class463.field3850 = var0;
			}
		}

		if (class110.field825 < var1) {
			class110.field825 += class148.field1166 + class438.field3645 * (var1 - class110.field825) / 1000;
			if (class110.field825 > var1) {
				class110.field825 = var1;
			}
		}

		if (class110.field825 > var1) {
			class110.field825 -= class148.field1166 + class438.field3645 * (class110.field825 - var1) / 1000;
			if (class110.field825 < var1) {
				class110.field825 = var1;
			}
		}

		if (class57.field594 < var2) {
			class57.field594 += class148.field1166 + (var2 - class57.field594) * class438.field3645 / 1000;
			if (class57.field594 > var2) {
				class57.field594 = var2;
			}
		}

		if (class57.field594 > var2) {
			class57.field594 -= class148.field1166 + class438.field3645 * (class57.field594 - var2) / 1000;
			if (class57.field594 < var2) {
				class57.field594 = var2;
			}
		}

	}
}
