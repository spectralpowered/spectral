import io.spectralpowered.ObfInfo;
import java.lang.management.GarbageCollectorMXBean;

@ObfInfo(
	name = "bj"
)
public final class class208 extends class295 {
	@ObfInfo(
		owner = "bj",
		name = "aq",
		desc = "Ljava/lang/management/GarbageCollectorMXBean;"
	)
	static GarbageCollectorMXBean field1814;
	@ObfInfo(
		owner = "bj",
		name = "g",
		desc = "Z"
	)
	boolean field1798;
	@ObfInfo(
		owner = "bj",
		name = "d",
		desc = "Lga;"
	)
	class242 field1811;
	@ObfInfo(
		owner = "bj",
		name = "s",
		desc = "D"
	)
	double field1793;
	@ObfInfo(
		owner = "bj",
		name = "n",
		desc = "D"
	)
	double field1797;
	@ObfInfo(
		owner = "bj",
		name = "i",
		desc = "D"
	)
	double field1801;
	@ObfInfo(
		owner = "bj",
		name = "o",
		desc = "D"
	)
	double field1802;
	@ObfInfo(
		owner = "bj",
		name = "k",
		desc = "D"
	)
	double field1804;
	@ObfInfo(
		owner = "bj",
		name = "a",
		desc = "D"
	)
	double field1805;
	@ObfInfo(
		owner = "bj",
		name = "l",
		desc = "D"
	)
	double field1807;
	@ObfInfo(
		owner = "bj",
		name = "t",
		desc = "D"
	)
	double field1808;
	@ObfInfo(
		owner = "bj",
		name = "b",
		desc = "I"
	)
	int field1789;
	@ObfInfo(
		owner = "bj",
		name = "q",
		desc = "I"
	)
	int field1790;
	@ObfInfo(
		owner = "bj",
		name = "v",
		desc = "I"
	)
	int field1791;
	@ObfInfo(
		owner = "bj",
		name = "x",
		desc = "I"
	)
	int field1792;
	@ObfInfo(
		owner = "bj",
		name = "m",
		desc = "I"
	)
	int field1794;
	@ObfInfo(
		owner = "bj",
		name = "y",
		desc = "I"
	)
	int field1795;
	@ObfInfo(
		owner = "bj",
		name = "r",
		desc = "I"
	)
	int field1796;
	@ObfInfo(
		owner = "bj",
		name = "j",
		desc = "I"
	)
	int field1799;
	@ObfInfo(
		owner = "bj",
		name = "f",
		desc = "I"
	)
	int field1800;
	@ObfInfo(
		owner = "bj",
		name = "h",
		desc = "I"
	)
	int field1803;
	@ObfInfo(
		owner = "bj",
		name = "u",
		desc = "I"
	)
	int field1806;
	@ObfInfo(
		owner = "bj",
		name = "c",
		desc = "I"
	)
	int field1809;
	@ObfInfo(
		owner = "bj",
		name = "p",
		desc = "I"
	)
	int field1810;
	@ObfInfo(
		owner = "bj",
		name = "e",
		desc = "I"
	)
	int field1812;
	@ObfInfo(
		owner = "bj",
		name = "z",
		desc = "I"
	)
	int field1813;

	@ObfInfo(
		owner = "bj",
		name = "<init>",
		desc = "(IIIIIIIIIII)V"
	)
	class208(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field1798 = false;
		this.field1795 = 0;
		this.field1813 = 0;
		this.field1803 = var1;
		this.field1812 = var2;
		this.field1791 = var3;
		this.field1792 = var4;
		this.field1794 = var5;
		this.field1800 = var6;
		this.field1796 = var7;
		this.field1806 = var8;
		this.field1789 = var9;
		this.field1799 = var10;
		this.field1790 = var11;
		this.field1798 = false;
		int var12 = class429.method2119(this.field1803).field2585;
		if (var12 != -1) {
			this.field1811 = class271.method1277(var12);
		} else {
			this.field1811 = null;
		}

	}

	@ObfInfo(
		owner = "bj",
		name = "h",
		desc = "(IIIII)V"
	)
	final void method901(int var1, int var2, int var3, int var4) {
		double var6;
		if (!this.field1798) {
			var6 = (double)(var1 - this.field1791);
			double var8 = (double)(var2 - this.field1792);
			double var10 = Math.sqrt(var8 * var8 + var6 * var6);
			this.field1801 = (double)this.field1791 + var6 * (double)this.field1789 / var10;
			this.field1802 = (double)this.field1792 + (double)this.field1789 * var8 / var10;
			this.field1797 = (double)this.field1794;
		}

		var6 = (double)(this.field1796 + 1 - var4);
		this.field1804 = ((double)var1 - this.field1801) / var6;
		this.field1805 = ((double)var2 - this.field1802) / var6;
		this.field1793 = Math.sqrt(this.field1805 * this.field1805 + this.field1804 * this.field1804);
		if (!this.field1798) {
			this.field1807 = -this.field1793 * Math.tan((double)this.field1806 * 0.02454369D);
		}

		this.field1808 = 2.0D * ((double)var3 - this.field1797 - var6 * this.field1807) / (var6 * var6);
	}

	@ObfInfo(
		owner = "bj",
		name = "m",
		desc = "(II)V"
	)
	final void method902(int var1) {
		this.field1798 = true;
		this.field1801 += (double)var1 * this.field1804;
		this.field1802 += (double)var1 * this.field1805;
		this.field1797 += (double)var1 * this.field1807 + (double)var1 * this.field1808 * 0.5D * (double)var1;
		this.field1807 += (double)var1 * this.field1808;
		this.field1809 = (int)(Math.atan2(this.field1804, this.field1805) * 325.949D) + 1024 & 2047;
		this.field1810 = (int)(Math.atan2(this.field1807, this.field1793) * 325.949D) & 2047;
		if (null != this.field1811) {
			if (!this.field1811.method1056()) {
				this.field1813 += var1;

				while (true) {
					do {
						do {
							if (this.field1813 <= this.field1811.field2037[this.field1795]) {
								return;
							}

							this.field1813 -= this.field1811.field2037[this.field1795];
							++this.field1795;
						} while(this.field1795 < this.field1811.field2043.length);

						this.field1795 -= this.field1811.field2046;
					} while(this.field1795 >= 0 && this.field1795 < this.field1811.field2043.length);

					this.field1795 = 0;
				}
			} else {
				this.field1795 += var1;
				int var3 = this.field1811.method1058();
				if (this.field1795 >= var3) {
					this.field1795 = var3 - this.field1811.field2046;
				}
			}
		}

	}

	@ObfInfo(
		owner = "bj",
		name = "e",
		desc = "(I)Lhh;"
	)
	protected final class470 method1438() {
		class327 var2 = class429.method2119(this.field1803);
		class470 var3 = var2.method1663(this.field1795);
		if (var3 == null) {
			return null;
		} else {
			var3.method2321(this.field1810);
			return var3;
		}
	}

	@ObfInfo(
		owner = "bj",
		name = "q",
		desc = "(IB)I"
	)
	public static int method905(int var0) {
		return class174.method803(class105.field814[var0]);
	}

	@ObfInfo(
		owner = "bj",
		name = "m",
		desc = "(Lly;Ljava/lang/String;Ljava/lang/String;I)Lra;"
	)
	public static class344 method906(class274 var0, String var1, String var2) {
		int var4 = var0.method1356(var1);
		int var5 = var0.method1359(var4, var2);
		byte[] var8 = var0.method1365(var4, var5);
		boolean var7;
		if (var8 == null) {
			var7 = false;
		} else {
			class85.method354(var8);
			var7 = true;
		}

		class344 var6;
		if (!var7) {
			var6 = null;
		} else {
			class344 var9 = new class344();
			var9.field2756 = class183.field1682;
			var9.field2759 = class18.field90;
			var9.field2754 = class18.field92[0];
			var9.field2757 = class110.field826[0];
			var9.field2758 = class418.field3431[0];
			var9.field2755 = class50.field576[0];
			var9.field2753 = class413.field3422;
			var9.field2752 = class340.field2723[0];
			class18.field92 = null;
			class110.field826 = null;
			class418.field3431 = null;
			class50.field576 = null;
			class413.field3422 = null;
			class340.field2723 = (byte[][])null;
			var6 = var9;
		}

		return var6;
	}

	@ObfInfo(
		owner = "bj",
		name = "hb",
		desc = "(IIIII)V"
	)
	static final void method904(int var0, int var1, int var2, int var3) {
		++client.field329;
		class375.method1851();
		class134.method629();
		if (client.field359 >= 0 && null != client.field347[client.field359]) {
			class200.method883(client.field347[client.field359], false);
		}

		class297.method1442(true);
		class228.method995();
		class297.method1442(false);
		class148.method695();

		for (class339 var5 = (class339)client.field352.method646(); var5 != null; var5 = (class339)client.field352.method648()) {
			if (var5.field2708 == class347.field2878 && !var5.field2710) {
				if (client.field231 >= var5.field2707) {
					var5.method1704(client.field276);
					if (var5.field2710) {
						var5.method637();
					} else {
						class408.field3415.method1604(var5.field2708, var5.field2709, var5.field2715, var5.field2711, 60, var5, 0, -1L, false);
					}
				}
			} else {
				var5.method637();
			}
		}

		class398.method1970(var0, var1, var2, var3, true);
		var0 = client.field372;
		var1 = client.field500;
		var2 = client.field501;
		var3 = client.field400;
		class162.method742(var0, var1, var2 + var0, var1 + var3);
		class341.method1709();
		int var36 = client.field300;
		if (client.field317 / 256 > var36) {
			var36 = client.field317 / 256;
		}

		if (client.field486[4] && 128 + client.field488[4] > var36) {
			var36 = client.field488[4] + 128;
		}

		int var6 = client.field301 & 2047;
		int var7 = class74.field658;
		int var8 = class197.field1740;
		int var9 = class19.field96;
		int var10 = 600 + var36 * 3;
		int var13 = var3 - 334;
		if (var13 < 0) {
			var13 = 0;
		} else if (var13 > 100) {
			var13 = 100;
		}

		int var14 = (client.field385 - client.field493) * var13 / 100 + client.field493;
		int var12 = var14 * var10 / 256;
		var13 = 2048 - var36 & 2047;
		var14 = 2048 - var6 & 2047;
		int var15 = 0;
		int var16 = 0;
		int var17 = var12;
		int var18;
		int var19;
		int var20;
		if (var13 != 0) {
			var18 = class341.field2726[var13];
			var19 = class341.field2744[var13];
			var20 = var19 * var16 - var12 * var18 >> 16;
			var17 = var18 * var16 + var19 * var12 >> 16;
			var16 = var20;
		}

		if (var14 != 0) {
			var18 = class341.field2726[var14];
			var19 = class341.field2744[var14];
			var20 = var17 * var18 + var15 * var19 >> 16;
			var17 = var19 * var17 - var18 * var15 >> 16;
			var15 = var20;
		}

		if (client.field484) {
			class292.field2376 = var7 - var15;
			class298.field2398 = var8 - var16;
			class132.field1105 = var9 - var17;
			class423.field3502 = var36;
			class249.field2060 = var6;
		} else {
			class463.field3850 = var7 - var15;
			class110.field825 = var8 - var16;
			class57.field594 = var9 - var17;
			class442.field3666 = var36;
			class22.field105 = var6;
		}

		if (1 == client.field306 && client.field481 >= 2 && 0 == client.field231 % 50 && (class113.field846.field2672 >> 7 != class74.field658 >> 7 || class19.field96 >> 7 != class113.field846.field2608 >> 7)) {
			var18 = class113.field846.field3214;
			var19 = (class74.field658 >> 7) + class312.field2465;
			var20 = class325.field2575 + (class19.field96 >> 7);
			class299 var21 = class480.method2370(class356.field3003, client.field279.field4042);
			var21.field2403.method584(var20);
			var21.field2403.method566(var18);
			var21.field2403.method572(var19);
			var21.field2403.method581(client.field502);
			client.field279.method2389(var21);
		}

		if (!client.field484) {
			var12 = class277.method1387();
		} else {
			var12 = class63.method293();
		}

		var13 = class463.field3850;
		var14 = class110.field825;
		var15 = class57.field594;
		var16 = class442.field3666;
		var17 = class22.field105;

		for (var18 = 0; var18 < 5; ++var18) {
			if (client.field486[var18]) {
				var19 = (int)(Math.random() * (double)(2 * client.field516[var18] + 1) - (double)client.field516[var18] + Math.sin((double)client.field330[var18] * ((double)client.field489[var18] / 100.0D)) * (double)client.field488[var18]);
				if (var18 == 0) {
					class463.field3850 += var19;
				}

				if (var18 == 1) {
					class110.field825 += var19;
				}

				if (var18 == 2) {
					class57.field594 += var19;
				}

				if (var18 == 3) {
					class22.field105 = class22.field105 + var19 & 2047;
				}

				if (var18 == 4) {
					class442.field3666 += var19;
					if (class442.field3666 < 128) {
						class442.field3666 = 128;
					}

					if (class442.field3666 > 383) {
						class442.field3666 = 383;
					}
				}
			}
		}

		var18 = class466.field3863;
		var19 = class466.field3858;
		if (class466.field3869 != 0) {
			var18 = class466.field3870;
			var19 = class466.field3867;
		}

		if (var18 >= var0 && var18 < var2 + var0 && var19 >= var1 && var19 < var3 + var1) {
			var20 = var18 - var0;
			int var37 = var19 - var1;
			class105.field808 = var20;
			class105.field815 = var37;
			class105.field809 = true;
			class105.field816 = 0;
			class105.field810 = false;
		} else {
			class391.method1916();
		}

		client.method189();
		class162.method749(var0, var1, var2, var3, 0);
		client.method189();
		var20 = class341.field2730;
		class341.field2730 = client.field503;
		class408.field3415.method1589(class463.field3850, class110.field825, class57.field594, class442.field3666, class22.field105, var12);
		class341.field2730 = var20;
		client.method189();
		class408.field3415.method1572();
		client.field474 = 0;
		boolean var41 = false;
		int var22 = -1;
		int var23 = -1;
		int var24 = class268.field2221;
		int[] var25 = class268.field2220;

		int var26;
		for (var26 = 0; var26 < client.field275 + var24; ++var26) {
			Object var27;
			if (var26 < var24) {
				var27 = client.field347[var25[var26]];
				if (client.field359 == var25[var26]) {
					var41 = true;
					var22 = var26;
					continue;
				}

				if (class113.field846 == var27) {
					var23 = var26;
					continue;
				}
			} else {
				var27 = client.field465[client.field431[var26 - var24]];
			}

			class22.method96((class334)var27, var26, var0, var1, var2, var3);
		}

		if (client.field258 && var23 != -1) {
			class22.method96(class113.field846, var23, var0, var1, var2, var3);
		}

		if (var41) {
			class22.method96(client.field347[client.field359], var22, var0, var1, var2, var3);
		}

		for (var26 = 0; var26 < client.field474; ++var26) {
			int var38 = client.field320[var26];
			int var28 = client.field321[var26];
			int var29 = client.field507[var26];
			int var30 = client.field322[var26];
			boolean var31 = true;

			while (var31) {
				var31 = false;

				for (int var32 = 0; var32 < var26; ++var32) {
					if (var28 + 2 > client.field321[var32] - client.field322[var32] && var28 - var30 < client.field321[var32] + 2 && var38 - var29 < client.field507[var32] + client.field320[var32] && var29 + var38 > client.field320[var32] - client.field507[var32] && client.field321[var32] - client.field322[var32] < var28) {
						var28 = client.field321[var32] - client.field322[var32];
						var31 = true;
					}
				}
			}

			client.field436 = client.field320[var26];
			client.field257 = client.field321[var26] = var28;
			String var39 = client.field318[var26];
			if (client.field397 == 0) {
				int var33 = 16776960;
				if (client.field324[var26] < 6) {
					var33 = client.field454[client.field324[var26]];
				}

				if (6 == client.field324[var26]) {
					var33 = client.field329 % 20 < 10 ? 16711680 : 16776960;
				}

				if (7 == client.field324[var26]) {
					var33 = client.field329 % 20 < 10 ? 255 : '\uffff';
				}

				if (client.field324[var26] == 8) {
					var33 = client.field329 % 20 < 10 ? '뀀' : 8454016;
				}

				int var34;
				if (client.field324[var26] == 9) {
					var34 = 150 - client.field415[var26];
					if (var34 < 50) {
						var33 = var34 * 1280 + 16711680;
					} else if (var34 < 100) {
						var33 = 16776960 - 327680 * (var34 - 50);
					} else if (var34 < 150) {
						var33 = 65280 + (var34 - 100) * 5;
					}
				}

				if (10 == client.field324[var26]) {
					var34 = 150 - client.field415[var26];
					if (var34 < 50) {
						var33 = var34 * 5 + 16711680;
					} else if (var34 < 100) {
						var33 = 16711935 - 327680 * (var34 - 50);
					} else if (var34 < 150) {
						var33 = 255 + (var34 - 100) * 327680 - (var34 - 100) * 5;
					}
				}

				if (11 == client.field324[var26]) {
					var34 = 150 - client.field415[var26];
					if (var34 < 50) {
						var33 = 16777215 - var34 * 327685;
					} else if (var34 < 100) {
						var33 = 327685 * (var34 - 50) + 65280;
					} else if (var34 < 150) {
						var33 = 16777215 - (var34 - 100) * 327680;
					}
				}

				if (0 == client.field325[var26]) {
					class114.field848.method2027(var39, client.field436 + var0, var1 + client.field257, var33, 0);
				}

				if (client.field325[var26] == 1) {
					class114.field848.method2021(var39, client.field436 + var0, client.field257 + var1, var33, 0, client.field329);
				}

				if (client.field325[var26] == 2) {
					class114.field848.method2047(var39, var0 + client.field436, var1 + client.field257, var33, 0, client.field329);
				}

				if (client.field325[var26] == 3) {
					class114.field848.method2044(var39, client.field436 + var0, var1 + client.field257, var33, 0, client.field329, 150 - client.field415[var26]);
				}

				if (client.field325[var26] == 4) {
					var34 = (150 - client.field415[var26]) * (class114.field848.method2045(var39) + 100) / 150;
					class162.method743(var0 + client.field436 - 50, var1, client.field436 + var0 + 50, var1 + var3);
					class114.field848.method2025(var39, 50 + client.field436 + var0 - var34, client.field257 + var1, var33, 0);
					class162.method742(var0, var1, var2 + var0, var1 + var3);
				}

				if (client.field325[var26] == 5) {
					var34 = 150 - client.field415[var26];
					int var35 = 0;
					if (var34 < 25) {
						var35 = var34 - 25;
					} else if (var34 > 125) {
						var35 = var34 - 125;
					}

					class162.method743(var0, var1 + client.field257 - class114.field848.field3442 - 1, var0 + var2, client.field257 + var1 + 5);
					class114.field848.method2027(var39, var0 + client.field436, var35 + client.field257 + var1, var33, 0);
					class162.method742(var0, var1, var2 + var0, var1 + var3);
				}
			} else {
				class114.field848.method2027(var39, client.field436 + var0, client.field257 + var1, 16776960, 0);
			}
		}

		class39.method166(var0, var1);
		((class251)class341.field2728).method1090(client.field276);
		class427.method2092((byte)-76);
		class463.field3850 = var13;
		class110.field825 = var14;
		class57.field594 = var15;
		class442.field3666 = var16;
		class22.field105 = var17;
		if (client.field230) {
			byte var40 = 0;
			var22 = var40 + class462.field3830 + class462.field3832;
			if (var22 == 0) {
				client.field230 = false;
			}
		}

		if (client.field230) {
			class162.method749(var0, var1, var2, var3, 0);
			class492.method2436(class177.field1455, false);
		}

	}
}
