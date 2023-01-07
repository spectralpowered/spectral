import io.spectralpowered.ObfInfo;
import javax.imageio.ImageIO;

@ObfInfo(
	name = "au"
)
public class class148 {
	@ObfInfo(
		owner = "au",
		name = "fv",
		desc = "I"
	)
	static int field1164;
	@ObfInfo(
		owner = "au",
		name = "tz",
		desc = "I"
	)
	static int field1166;
	@ObfInfo(
		owner = "au",
		name = "h",
		desc = "J"
	)
	static long field1165;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfInfo(
		owner = "au",
		name = "hc",
		desc = "(I)V"
	)
	static final void method694() {
		class247.method1078(class292.field2376, class298.field2398, class132.field1105);
		class381.method1892(class423.field3502, class249.field2060);
		if (class292.field2376 == class463.field3850 && class110.field825 == class298.field2398 && class132.field1105 == class57.field594 && class442.field3666 == class423.field3502 && class249.field2060 == class22.field105) {
			client.field485 = false;
			client.field484 = false;
			class342.field2745 = 0;
			class114.field850 = 0;
			class252.field2083 = 0;
			class4.field25 = 0;
			class397.field3350 = 0;
			class438.field3645 = 0;
			field1166 = 0;
			class113.field844 = 0;
			class189.field1709 = 0;
			class461.field3825 = 0;
		}

	}

	@ObfInfo(
		owner = "au",
		name = "it",
		desc = "(I)V"
	)
	static final void method695() {
		for (class208 var1 = (class208)client.field362.method646(); var1 != null; var1 = (class208)client.field362.method648()) {
			if (class347.field2878 == var1.field1812 && client.field231 <= var1.field1796) {
				if (client.field231 >= var1.field1800) {
					if (var1.field1799 > 0) {
						class267 var2 = client.field465[var1.field1799 - 1];
						if (var2 != null && var2.field2672 >= 0 && var2.field2672 < 13312 && var2.field2608 >= 0 && var2.field2608 < 13312) {
							var1.method901(var2.field2672, var2.field2608, class327.method1666(var2.field2672, var2.field2608, var1.field1812) - var1.field1790, client.field231);
						}
					}

					if (var1.field1799 < 0) {
						int var3 = -var1.field1799 - 1;
						class380 var4;
						if (client.field348 == var3) {
							var4 = class113.field846;
						} else {
							var4 = client.field347[var3];
						}

						if (var4 != null && var4.field2672 >= 0 && var4.field2672 < 13312 && var4.field2608 >= 0 && var4.field2608 < 13312) {
							var1.method901(var4.field2672, var4.field2608, class327.method1666(var4.field2672, var4.field2608, var1.field1812) - var1.field1790, client.field231);
						}
					}

					var1.method902(client.field276);
					class408.field3415.method1604(class347.field2878, (int)var1.field1801, (int)var1.field1802, (int)var1.field1797, 60, var1, var1.field1809, -1L, false);
				}
			} else {
				var1.method637();
			}
		}

	}

	@ObfInfo(
		owner = "au",
		name = "by",
		desc = "(IB)V"
	)
	static void method696(int var0) {
		if (var0 != -1) {
			if (class268.method1275(var0)) {
				class120[] var2 = class329.field2600[var0];

				for (int var3 = 0; var3 < var2.length; ++var3) {
					class120 var4 = var2[var3];
					if (var4.field1027 != null) {
						class488 var5 = new class488();
						var5.field4067 = var4;
						var5.field4069 = var4.field1027;
						class84.method350(var5, 5000000, 0);
					}
				}

			}
		}
	}
}
