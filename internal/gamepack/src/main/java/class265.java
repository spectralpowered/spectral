import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gj"
)
public class class265 implements class78 {
	@ObfInfo(
		owner = "gj",
		name = "e",
		desc = "Lgj;"
	)
	static final class265 field2194;
	@ObfInfo(
		owner = "gj",
		name = "h",
		desc = "Lgj;"
	)
	static final class265 field2195;
	@ObfInfo(
		owner = "gj",
		name = "v",
		desc = "Lgj;"
	)
	static final class265 field2197;
	@ObfInfo(
		owner = "gj",
		name = "m",
		desc = "I"
	)
	final int field2198;
	@ObfInfo(
		owner = "gj",
		name = "x",
		desc = "I"
	)
	public final int field2196;

	static {
		field2195 = new class265(2, 0);
		field2194 = new class265(1, 1);
		field2197 = new class265(0, 2);
	}

	@ObfInfo(
		owner = "gj",
		name = "<init>",
		desc = "(II)V"
	)
	class265(int var1, int var2) {
		this.field2196 = var1;
		this.field2198 = var2;
	}

	@ObfInfo(
		owner = "gj",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field2198;
	}

	@ObfInfo(
		owner = "gj",
		name = "r",
		desc = "(IIS)I"
	)
	public static int method1219(int var0, int var1) {
		int var3 = var0 >>> 31;
		return (var0 + var3) / var1 - var3;
	}

	@ObfInfo(
		owner = "gj",
		name = "j",
		desc = "(I)V"
	)
	public static void method1218() {
		class473.field3981.method395();
		class473.field3971.method395();
		class473.field3986.method395();
	}

	@ObfInfo(
		owner = "gj",
		name = "r",
		desc = "(Lqx;ILcj;II)V"
	)
	static final void method1220(class6 var0, int var1, class380 var2, int var3) {
		byte var5 = class294.field2385.field2389;
		if (0 != (var3 & 8192)) {
			var2.field2626 = var0.method593();
			var2.field2615 = var0.method548();
			var2.field2660 = var0.method593();
			var2.field2643 = var0.method570();
			var2.field2663 = var0.method531() + client.field231;
			var2.field2664 = var0.method574() + client.field231;
			var2.field2665 = var0.method549();
			if (var2.field3205) {
				var2.field2626 += var2.field3219;
				var2.field2615 += var2.field3221;
				var2.field2660 += var2.field3219;
				var2.field2643 += var2.field3221;
				var2.field2607 = 0;
			} else {
				var2.field2626 += var2.field2633[0];
				var2.field2615 += var2.field2681[0];
				var2.field2660 += var2.field2633[0];
				var2.field2643 += var2.field2681[0];
				var2.field2607 = 1;
			}

			var2.field2682 = 0;
		}

		if (0 != (var3 & 32)) {
			var2.field2628 = var0.method555();
			if (var2.field2628.charAt(0) == '~') {
				var2.field2628 = var2.field2628.substring(1);
				class164.method765(2, var2.field3207.method1101(), var2.field2628);
			} else if (var2 == class113.field846) {
				class164.method765(2, var2.field3207.method1101(), var2.field2628);
			}

			var2.field2629 = false;
			var2.field2632 = 0;
			var2.field2659 = 0;
			var2.field2678 = 150;
		}

		int var6;
		if ((var3 & 4096) != 0) {
			var2.field2654 = var0.method549();
			var6 = var0.method582();
			var2.field2676 = var6 >> 16;
			var2.field2657 = (var6 & 65535) + client.field231;
			var2.field2655 = 0;
			var2.field2644 = 0;
			if (var2.field2657 > client.field231) {
				var2.field2655 = -1;
			}

			if (65535 == var2.field2654) {
				var2.field2654 = -1;
			}
		}

		int var7;
		if ((var3 & 8) != 0) {
			var6 = var0.method574();
			if (var6 == 65535) {
				var6 = -1;
			}

			var7 = var0.method547();
			class439.method2177(var2, var6, var7);
		}

		if ((var3 & 256) != 0) {
			for (var6 = 0; var6 < 3; ++var6) {
				var2.field3217[var6] = var0.method555();
			}
		}

		if (0 != (var3 & 16)) {
			var2.field2641 = var0.method575();
			if (class70.field634) {
				var2.field2641 += var0.method547() << 16;
				var6 = 16777215;
			} else {
				var6 = 65535;
			}

			if (var6 == var2.field2641) {
				var2.field2641 = -1;
			}
		}

		if (0 != (var3 & 16384)) {
			var2.field2668 = client.field231 + var0.method574();
			var2.field2630 = client.field231 + var0.method531();
			var2.field2670 = var0.method599();
			var2.field2650 = var0.method599();
			var2.field2662 = var0.method548();
			var2.field2673 = (byte)var0.method569();
		}

		if (0 != (var3 & 128)) {
			var2.field2620 = var0.method575();
			if (0 == var2.field2607) {
				var2.field2674 = var2.field2620;
				var2.field2620 = -1;
			}
		}

		if (0 != (var3 & 4)) {
			var6 = var0.method592();
			byte[] var14 = new byte[var6];
			class127 var8 = new class127(var14);
			var0.method583(var14, 0, var6);
			class268.field2218[var1] = var8;
			var2.method1882(var8);
		}

		if ((var3 & 1024) != 0) {
			var5 = var0.method548();
		}

		int var9;
		int var10;
		int var13;
		if (0 != (var3 & 2)) {
			var6 = var0.method575();
			class425 var20 = (class425)class2.method10(class283.method1394(), var0.method592());
			boolean var15 = var0.method592() == 1;
			var9 = var0.method569();
			var10 = var0.field1070;
			if (var2.field3207 != null && null != var2.field3194) {
				boolean var11 = false;
				if (var20.field3523 && class240.field2021.method41(var2.field3207)) {
					var11 = true;
				}

				if (!var11 && client.field404 == 0 && !var2.field3213) {
					class268.field2228.field1070 = 0;
					var0.method583(class268.field2228.field1072, 0, var9);
					class268.field2228.field1070 = 0;
					String var12 = class420.method2042(class457.method2258(class302.method1456(class268.field2228)));
					var2.field2628 = var12.trim();
					var2.field2632 = var6 >> 8;
					var2.field2659 = var6 & 255;
					var2.field2678 = 150;
					var2.field2629 = var15;
					var2.field2617 = class113.field846 != var2 && var20.field3523 && client.field457 != "" && var12.toLowerCase().indexOf(client.field457) == -1;
					if (var20.field3509) {
						var13 = var15 ? 91 : 1;
					} else {
						var13 = var15 ? 90 : 2;
					}

					if (-1 != var20.field3521) {
						class164.method765(var13, class185.method843(var20.field3521) + var2.field3207.method1101(), var12);
					} else {
						class164.method765(var13, var2.field3207.method1101(), var12);
					}
				}
			}

			var0.field1070 = var10 + var9;
		}

		if ((var3 & 1) != 0) {
			var6 = var0.method547();
			int var16;
			int var19;
			int var22;
			if (var6 > 0) {
				for (var7 = 0; var7 < var6; ++var7) {
					var9 = -1;
					var10 = -1;
					var19 = -1;
					var22 = var0.method559();
					if (var22 == 32767) {
						var22 = var0.method559();
						var10 = var0.method559();
						var9 = var0.method559();
						var19 = var0.method559();
					} else if (var22 != 32766) {
						var10 = var0.method559();
					} else {
						var22 = -1;
					}

					var16 = var0.method559();
					var2.method1676(var22, var10, var9, var19, client.field231, var16);
				}
			}

			var7 = var0.method592();
			if (var7 > 0) {
				for (var22 = 0; var22 < var7; ++var22) {
					var9 = var0.method559();
					var10 = var0.method559();
					if (var10 != 32767) {
						var19 = var0.method559();
						var16 = var0.method569();
						var13 = var10 > 0 ? var0.method547() : var16;
						var2.method1679(var9, client.field231, var10, var19, var16, var13);
					} else {
						var2.method1680(var9);
					}
				}
			}
		}

		if (0 != (var3 & 2048)) {
			class294[] var17 = class268.field2225;
			class294[] var18 = new class294[]{class294.field2387, class294.field2385, class294.field2388, class294.field2386};
			var17[var1] = (class294)class2.method10(var18, var0.method548());
		}

		if (var2.field3205) {
			if (var5 == 127) {
				var2.method1879(var2.field3219, var2.field3221);
			} else {
				class294 var23;
				if (var5 != class294.field2385.field2389) {
					class294[] var21 = new class294[]{class294.field2387, class294.field2385, class294.field2388, class294.field2386};
					var23 = (class294)class2.method10(var21, var5);
				} else {
					var23 = class268.field2225[var1];
				}

				var2.method1878(var2.field3219, var2.field3221, var23);
			}
		}

	}

	@ObfInfo(
		owner = "gj",
		name = "t",
		desc = "(I)V"
	)
	public static void method1217() {
		class120.field943.method395();
		class120.field1020.method395();
		class120.field888.method395();
		class120.field889.method395();
	}
}
