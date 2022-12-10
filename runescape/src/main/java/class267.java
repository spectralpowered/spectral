import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;

@class291
public final class class267 {
	public static File field3148;
	static boolean field3143;
	static class367 field3147;
	static class491[] field3150;
	static final HashMap field3142;

	static {
		field3142 = new HashMap();
		Calendar.getInstance(method5272("Europe/London"));
	}

	class267() throws Throwable {
		throw new Error();
	}

	static TimeZone method5272(String var0) {
		synchronized(field3142) {
			TimeZone var3 = (TimeZone)field3142.get(var0);
			if (var3 == null) {
				var3 = TimeZone.getTimeZone(var0);
				field3142.put(var0, var3);
			}

			return var3;
		}
	}

	static void method5273() {
		int var1 = class87.field818;
		int[] var2 = class87.field817;

		for (int var3 = 0; var3 < var1; ++var3) {
			if (client.field1828 != var2[var3] && var2[var3] != client.field1817) {
				class246.method4885(client.field1816[var2[var3]], true);
			}
		}

	}

	static final void method5268(int var0, int var1, boolean var2) {
		if (!var2 || var0 != class19.field113 || var1 != class285.field3337) {
			class19.field113 = var0;
			class285.field3337 = var1;
			class131.method2451(25);
			class49.method940(class321.field3886, true);
			int var4 = class151.field1447;
			int var5 = class388.field4509;
			class151.field1447 = 8 * (var0 - 6);
			class388.field4509 = 8 * (var1 - 6);
			int var6 = class151.field1447 - var4;
			int var7 = class388.field4509 - var5;
			var4 = class151.field1447;
			var5 = class388.field4509;

			int var8;
			int var10;
			int[] var10000;
			for (var8 = 0; var8 < 65536; ++var8) {
				class85 var9 = client.field1934[var8];
				if (var9 != null) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var9.field973;
						var10000[var10] -= var6;
						var10000 = var9.field1021;
						var10000[var10] -= var7;
					}

					var9.field1012 -= var6 * 128;
					var9.field948 -= var7 * 128;
				}
			}

			for (var8 = 0; var8 < 2048; ++var8) {
				class88 var22 = client.field1816[var8];
				if (null != var22) {
					for (var10 = 0; var10 < 10; ++var10) {
						var10000 = var22.field973;
						var10000[var10] -= var6;
						var10000 = var22.field1021;
						var10000[var10] -= var7;
					}

					var22.field1012 -= var6 * 128;
					var22.field948 -= var7 * 128;
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
							client.field1829[var18][var14][var15] = client.field1829[var18][var16][var17];
						} else {
							client.field1829[var18][var14][var15] = null;
						}
					}
				}
			}

			for (class91 var20 = (class91)client.field1919.method6577(); var20 != null; var20 = (class91)client.field1919.method6579()) {
				var20.field863 -= var6;
				var20.field875 -= var7;
				if (var20.field863 < 0 || var20.field875 < 0 || var20.field863 >= 104 || var20.field875 >= 104) {
					var20.method7951();
				}
			}

			if (0 != client.field1942) {
				client.field1942 -= var6;
				client.field1688 -= var7;
			}

			client.field1947 = 0;
			client.field1953 = false;
			class141.field1363 -= var6 << 7;
			class170.field1608 -= var7 << 7;
			class39.field236 -= var6 << 7;
			class14.field83 -= var7 << 7;
			client.field1801 = -1;
			client.field1821.method6583();
			client.field1831.method6583();

			for (var15 = 0; var15 < 4; ++var15) {
				client.field1758[var15].method4027();
			}

		}
	}

	static final boolean method5274(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var2 = client.field1932[var0];
			if (var2 >= 2000) {
				var2 -= 2000;
			}

			return var2 == 1007;
		}
	}

	static boolean method5270(int var0) {
		for (int var2 = 0; var2 < client.field1892; ++var2) {
			if (var0 == client.field1933[var2]) {
				return true;
			}
		}

		return false;
	}
}
