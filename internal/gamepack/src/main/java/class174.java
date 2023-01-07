import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "hv"
)
public final class class174 {
	@ObfInfo(
		owner = "hv",
		name = "h",
		desc = "I"
	)
	int field1292;
	@ObfInfo(
		owner = "hv",
		name = "e",
		desc = "I"
	)
	int field1293;
	@ObfInfo(
		owner = "hv",
		name = "u",
		desc = "I"
	)
	int field1294;
	@ObfInfo(
		owner = "hv",
		name = "g",
		desc = "I"
	)
	int field1295;
	@ObfInfo(
		owner = "hv",
		name = "m",
		desc = "I"
	)
	int field1296;
	@ObfInfo(
		owner = "hv",
		name = "q",
		desc = "I"
	)
	int field1297;
	@ObfInfo(
		owner = "hv",
		name = "v",
		desc = "I"
	)
	int field1298;
	@ObfInfo(
		owner = "hv",
		name = "r",
		desc = "I"
	)
	int field1299;
	@ObfInfo(
		owner = "hv",
		name = "f",
		desc = "I"
	)
	int field1300;
	@ObfInfo(
		owner = "hv",
		name = "b",
		desc = "I"
	)
	int field1301;
	@ObfInfo(
		owner = "hv",
		name = "j",
		desc = "I"
	)
	int field1302;
	@ObfInfo(
		owner = "hv",
		name = "x",
		desc = "I"
	)
	int field1303;
	@ObfInfo(
		owner = "hv",
		name = "i",
		desc = "I"
	)
	int field1304;
	@ObfInfo(
		owner = "hv",
		name = "o",
		desc = "I"
	)
	int field1305;
	@ObfInfo(
		owner = "hv",
		name = "n",
		desc = "I"
	)
	int field1306;
	@ObfInfo(
		owner = "hv",
		name = "k",
		desc = "I"
	)
	int field1307;
	@ObfInfo(
		owner = "hv",
		name = "a",
		desc = "I"
	)
	int field1308;
	@ObfInfo(
		owner = "hv",
		name = "s",
		desc = "I"
	)
	int field1309;

	@ObfInfo(
		owner = "hv",
		name = "<init>",
		desc = "()V"
	)
	class174() {
	}

	@ObfInfo(
		owner = "hv",
		name = "f",
		desc = "(J)I"
	)
	public static int method803(long var0) {
		return (int)(var0 >>> 17 & 4294967295L);
	}

	@ObfInfo(
		owner = "hv",
		name = "f",
		desc = "(B)V"
	)
	public static void method804() {
		try {
			if (1 == class40.field201) {
				int var1 = class230.field1943.method2428();
				if (var1 > 0 && class230.field1943.method2406()) {
					var1 -= class40.field203;
					if (var1 < 0) {
						var1 = 0;
					}

					class230.field1943.method2427(var1);
					return;
				}

				class230.field1943.method2405();
				class230.field1943.method2404();
				if (null != class253.field2089) {
					class40.field201 = 2;
				} else {
					class40.field201 = 0;
				}

				class40.field205 = null;
				class201.field1752 = null;
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			class230.field1943.method2405();
			class40.field201 = 0;
			class40.field205 = null;
			class201.field1752 = null;
			class253.field2089 = null;
		}

	}
}
