import io.spectralpowered.ObfInfo;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@ObfInfo(
	name = "jg"
)
@class451
public final class class228 {
	@ObfInfo(
		owner = "jg",
		name = "m",
		desc = "Ljava/io/File;"
	)
	public static File field1934;
	@ObfInfo(
		owner = "jg",
		name = "sa",
		desc = "Z"
	)
	static boolean field1932;
	@ObfInfo(
		owner = "jg",
		name = "sf",
		desc = "Lnc;"
	)
	static class17 field1933;
	@ObfInfo(
		owner = "jg",
		name = "jk",
		desc = "[Lrx;"
	)
	static class266[] field1935;
	@ObfInfo(
		owner = "jg",
		name = "v",
		desc = "Ljava/util/HashMap;"
	)
	static final HashMap field1931;

	static {
		field1931 = new HashMap();
		Calendar.getInstance(method994("Europe/London"));
	}

	@ObfInfo(
		owner = "jg",
		name = "h",
		desc = "(Ljava/lang/String;I)Ljava/util/TimeZone;"
	)
	static TimeZone method994(String var0) {
		synchronized(field1931) {
			TimeZone var3 = (TimeZone)field1931.get(var0);
			if (var3 == null) {
				var3 = TimeZone.getTimeZone(var0);
				field1931.put(var0, var3);
			}

			return var3;
		}
	}

	@ObfInfo(
		owner = "jg",
		name = "iq",
		desc = "(B)V"
	)
	static void method995() {
		int var1 = class268.field2221;
		int[] var2 = class268.field2220;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (client.field359 != var2[var3] && var2[var3] != client.field348) {
				class200.method883(client.field347[var2[var3]], true);
			}
		}

	}

	@ObfInfo(
		owner = "jg",
		name = "iv",
		desc = "(IIZI)V"
	)
	static final void method992(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class391.field3279 || var1 != class132.field1104) {
			class391.field3279 = var0;
			class132.field1104 = var1;
			class261.method1113(25);
			class492.method2436(class177.field1455, true);
			int var4 = class312.field2465;
			int var5 = class325.field2575;
			class312.field2465 = 8 * (var0 - 6);
			class325.field2575 = 8 * (var1 - 6);
			int var6 = class312.field2465 - var4;
			int var7 = class325.field2575 - var5;
			var4 = class312.field2465;
			var5 = class325.field2575;

			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				class267 var9 = client.field465[var8];
				if (var9 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field2633;
						var10000[var10] -= var6;
						var10000 = var9.field2681;
						var10000[var10] -= var7;
					}

					var9.field2672 -= var6 * 128;
					var9.field2608 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				class380 var22 = client.field347[var8];
				if (null != var22) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var22.field2633;
						var10000[var10] -= var6;
						var10000 = var22.field2681;
						var10000[var10] -= var7;
					}

					var22.field2672 -= var6 * 128;
					var22.field2608 -= var7 * 128;
				}
			}

			byte var21 = 0;
			byte var19 = 104;
			byte var23 = 1;
			if (var6 < 0) {
				var21 = 103;
				var19 = -1;
				var23 = -1;
			}

			byte var11 = 0;
			byte var12 = 104;
			byte var13 = 1;
			if (var7 < 0) {
				var11 = 103;
				var12 = -1;
				var13 = -1;
			}

			int var15;
			for (int var14 = var21; var14 != var19; var14 += var23) {
				for (var15 = var11; var12 != var15; var15 += var13) {
					int var16 = var14 + var6;
					int var17 = var15 + var7;

					for (int var18 = 0; var18 < 4; ++var18) {
						if (var16 >= 0 && var17 >= 0 && var16 < 104 && var17 < 104) {
							client.field360[var18][var14][var15] = client.field360[var18][var16][var17];
						} else {
							client.field360[var18][var14][var15] = null;
						}
					}
				}
			}

			for (class138 var20 = (class138)client.field450.method646(); var20 != null; var20 = (class138)client.field450.method648()) {
				var20.field1118 -= var6;
				var20.field1129 -= var7;
				if (var20.field1118 < 0 || var20.field1129 < 0 || var20.field1118 >= 104 || var20.field1129 >= 104) {
					var20.method637();
				}
			}

			if (0 != client.field473) {
				client.field473 -= var6;
				client.field219 -= var7;
			}

			client.field478 = 0;
			client.field484 = false;
			class463.field3850 -= var6 << 7;
			class57.field594 -= var7 << 7;
			class74.field658 -= var6 << 7;
			class19.field96 -= var7 << 7;
			client.field332 = -1;
			client.field352.method649();
			client.field362.method649();

			for (var15 = 0; var15 < 4; ++var15) {
				client.field289[var15].method2082();
			}

		}
	}

	@ObfInfo(
		owner = "jg",
		name = "jx",
		desc = "(II)Z"
	)
	static final boolean method996(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = client.field463[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 1007;
		}
	}

	@ObfInfo(
		owner = "jg",
		name = "lk",
		desc = "(II)Z"
	)
	static boolean method993(int var0) {
		for (int var2 = 0; var2 < client.field423; ++var2) {
			if (var0 == client.field464[var2]) {
				return true;
			}
		}

		return false;
	}
}
