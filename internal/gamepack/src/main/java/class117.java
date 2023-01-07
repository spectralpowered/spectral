import io.spectralpowered.ObfInfo;
import java.awt.datatransfer.Clipboard;

@ObfInfo(
	name = "gb"
)
public class class117 implements class310 {
	@ObfInfo(
		owner = "gb",
		name = "e",
		desc = "Z"
	)
	boolean field874;
	@ObfInfo(
		owner = "gb",
		name = "v",
		desc = "Z"
	)
	boolean field876;
	@ObfInfo(
		owner = "gb",
		name = "h",
		desc = "Lkd;"
	)
	class120 field875;

	@ObfInfo(
		owner = "gb",
		name = "<init>",
		desc = "()V"
	)
	public class117() {
		this.field875 = null;
		this.field874 = false;
		this.field876 = false;
	}

	@ObfInfo(
		owner = "gb",
		name = "a",
		desc = "(Lkd;I)V"
	)
	public void method454(class120 var1) {
		this.method456();
		if (var1 != null) {
			this.field875 = var1;
			class16 var3 = var1.method496();
			if (null != var3) {
				var3.field78.method1118(true);
				if (var3.field79 != null) {
					class488 var4 = new class488();
					var4.method2396(var1);
					var4.method2394(var3.field79);
					class271.method1278().method642(var4);
				}
			}
		}

	}

	@ObfInfo(
		owner = "gb",
		name = "s",
		desc = "(B)Lkd;"
	)
	public class120 method455() {
		return this.field875;
	}

	@ObfInfo(
		owner = "gb",
		name = "l",
		desc = "(B)V"
	)
	public void method456() {
		if (null != this.field875) {
			class16 var2 = this.field875.method496();
			class120 var3 = this.field875;
			this.field875 = null;
			if (var2 != null) {
				var2.field78.method1118(false);
				if (null != var2.field79) {
					class488 var4 = new class488();
					var4.method2396(var3);
					var4.method2394(var2.field79);
					class271.method1278().method642(var4);
				}

			}
		}
	}

	@ObfInfo(
		owner = "gb",
		name = "h",
		desc = "(II)Z"
	)
	public boolean method1501(int var1) {
		if (null == this.field875) {
			return false;
		} else {
			class109 var3 = this.field875.method498();
			if (var3 == null) {
				return false;
			} else {
				if (var3.method432(var1)) {
					switch(var1) {
					case 81:
						this.field876 = true;
						break;
					case 82:
						this.field874 = true;
						break;
					default:
						if (this.method459(var1)) {
							class184.method836(this.field875);
						}
					}
				}

				return var3.method437(var1);
			}
		}
	}

	@ObfInfo(
		owner = "gb",
		name = "e",
		desc = "(II)Z"
	)
	public boolean method1502(int var1) {
		switch(var1) {
		case 81:
			this.field876 = false;
			return false;
		case 82:
			this.field874 = false;
			return false;
		default:
			return false;
		}
	}

	@ObfInfo(
		owner = "gb",
		name = "v",
		desc = "(CI)Z"
	)
	public boolean method1499(char var1) {
		if (this.field875 == null) {
			return false;
		} else if (!class156.method720(var1)) {
			return false;
		} else {
			class262 var3 = this.field875.method485();
			if (var3 != null && var3.method1189()) {
				class109 var4 = this.field875.method498();
				if (var4 == null) {
					return false;
				} else {
					if (var4.method436(var1) && var3.method1132(var1)) {
						class184.method836(this.field875);
					}

					return var4.method430(var1);
				}
			} else {
				return false;
			}
		}
	}

	@ObfInfo(
		owner = "gb",
		name = "x",
		desc = "(ZI)Z"
	)
	public boolean method1500(boolean var1) {
		return false;
	}

	@ObfInfo(
		owner = "gb",
		name = "t",
		desc = "(II)Z"
	)
	boolean method459(int var1) {
		if (null == this.field875) {
			return false;
		} else {
			class262 var3 = this.field875.method485();
			if (var3 != null && var3.method1189()) {
				Clipboard var6;
				switch(var1) {
				case 13:
					this.method456();
					return true;
				case 48:
					if (this.field874) {
						var3.method1193();
					}

					return true;
				case 65:
					if (this.field874) {
						var6 = class309.field2461.method927();
						var3.method1153(var6);
					}

					return true;
				case 66:
					if (this.field874) {
						var6 = class309.field2461.method927();
						var3.method1184(var6);
					}

					return true;
				case 67:
					if (this.field874) {
						var6 = class309.field2461.method927();
						var3.method1154(var6);
					}

					return true;
				case 84:
					if (var3.method1168() == 0) {
						var3.method1132(10);
					} else if (this.field876 && var3.method1170()) {
						var3.method1132(10);
					} else {
						class16 var4 = this.field875.method496();
						class488 var5 = new class488();
						var5.method2396(this.field875);
						var5.method2394(var4.field77);
						class271.method1278().method642(var5);
						this.method456();
					}

					return true;
				case 85:
					if (this.field874) {
						var3.method1135();
					} else {
						var3.method1133();
					}

					return true;
				case 96:
					if (this.field874) {
						var3.method1145(this.field876);
					} else {
						var3.method1143(this.field876);
					}

					return true;
				case 97:
					if (this.field874) {
						var3.method1138(this.field876);
					} else {
						var3.method1144(this.field876);
					}

					return true;
				case 98:
					if (this.field874) {
						var3.method1155();
					} else {
						var3.method1182(this.field876);
					}

					return true;
				case 99:
					if (this.field874) {
						var3.method1178();
					} else {
						var3.method1162(this.field876);
					}

					return true;
				case 101:
					if (this.field874) {
						var3.method1136();
					} else {
						var3.method1134();
					}

					return true;
				case 102:
					if (this.field874) {
						var3.method1141(this.field876);
					} else {
						var3.method1195(this.field876);
					}

					return true;
				case 103:
					if (this.field874) {
						var3.method1142(this.field876);
					} else {
						var3.method1140(this.field876);
					}

					return true;
				case 104:
					if (this.field874) {
						var3.method1149(this.field876);
					} else {
						var3.method1147(this.field876);
					}

					return true;
				case 105:
					if (this.field874) {
						var3.method1150(this.field876);
					} else {
						var3.method1148(this.field876);
					}

					return true;
				default:
					return false;
				}
			} else {
				return false;
			}
		}
	}

	@ObfInfo(
		owner = "gb",
		name = "o",
		desc = "(Lnv;Lnv;Lnv;I)V"
	)
	static void method463(class58 var0, class58 var1, class58 var2) {
		class359.field3052 = (class427.field3529 - 765) / 2;
		class359.field3072 = 202 + class359.field3052;
		class140.field1136 = class359.field3072 + 180;
		int var8;
		int var9;
		int var11;
		byte var24;
		int var25;
		int var34;
		int var43;
		if (class359.field3076) {
			class38 var33;
			int var37;
			if (null == class290.field2370) {
				var33 = class446.field3678;
				var34 = var33.method1356("sl_back");
				var37 = var33.method1359(var34, "");
				class266[] var31 = class242.method1064(var33, var34, var37);
				class290.field2370 = var31;
			}

			class344[] var32;
			if (class161.field1229 == null) {
				var33 = class446.field3678;
				var34 = var33.method1356("sl_flags");
				var37 = var33.method1359(var34, "");
				var32 = class400.method1972(var33, var34, var37);
				class161.field1229 = var32;
			}

			if (null == class340.field2721) {
				var33 = class446.field3678;
				var34 = var33.method1356("sl_arrows");
				var37 = var33.method1359(var34, "");
				var32 = class400.method1972(var33, var34, var37);
				class340.field2721 = var32;
			}

			if (null == class247.field2058) {
				var33 = class446.field3678;
				var34 = var33.method1356("sl_stars");
				var37 = var33.method1359(var34, "");
				var32 = class400.method1972(var33, var34, var37);
				class247.field2058 = var32;
			}

			if (null == class48.field566) {
				class48.field566 = class208.method906(class446.field3678, "leftarrow", "");
			}

			if (class261.field2115 == null) {
				class261.field2115 = class208.method906(class446.field3678, "rightarrow", "");
			}

			class162.method749(class359.field3052, 23, 765, 480, 0);
			class162.method750(class359.field3052, 0, 125, 23, 12425273, 9135624);
			class162.method750(125 + class359.field3052, 0, 640, 23, 5197647, 2697513);
			var0.method2027(class177.field1635, class359.field3052 + 62, 15, 0, -1);
			if (class247.field2058 != null) {
				class247.field2058[1].method1745(class359.field3052 + 140, 1);
				var1.method2025(class177.field1557, class359.field3052 + 152, 10, 16777215, -1);
				class247.field2058[0].method1745(140 + class359.field3052, 12);
				var1.method2025(class177.field1637, 152 + class359.field3052, 21, 16777215, -1);
			}

			if (class340.field2721 != null) {
				var43 = class359.field3052 + 280;
				if (class2.field14[0] == 0 && 0 == class2.field15[0]) {
					class340.field2721[2].method1745(var43, 4);
				} else {
					class340.field2721[0].method1745(var43, 4);
				}

				if (class2.field14[0] == 0 && 1 == class2.field15[0]) {
					class340.field2721[3].method1745(var43 + 15, 4);
				} else {
					class340.field2721[1].method1745(var43 + 15, 4);
				}

				var0.method2025(class177.field1372, var43 + 32, 17, 16777215, -1);
				var25 = 390 + class359.field3052;
				if (class2.field14[0] == 1 && class2.field15[0] == 0) {
					class340.field2721[2].method1745(var25, 4);
				} else {
					class340.field2721[0].method1745(var25, 4);
				}

				if (1 == class2.field14[0] && class2.field15[0] == 1) {
					class340.field2721[3].method1745(var25 + 15, 4);
				} else {
					class340.field2721[1].method1745(var25 + 15, 4);
				}

				var0.method2025(class177.field1352, var25 + 32, 17, 16777215, -1);
				var34 = 500 + class359.field3052;
				if (2 == class2.field14[0] && class2.field15[0] == 0) {
					class340.field2721[2].method1745(var34, 4);
				} else {
					class340.field2721[0].method1745(var34, 4);
				}

				if (class2.field14[0] == 2 && class2.field15[0] == 1) {
					class340.field2721[3].method1745(var34 + 15, 4);
				} else {
					class340.field2721[1].method1745(var34 + 15, 4);
				}

				var0.method2025(class177.field1640, var34 + 32, 17, 16777215, -1);
				var37 = class359.field3052 + 610;
				if (class2.field14[0] == 3 && 0 == class2.field15[0]) {
					class340.field2721[2].method1745(var37, 4);
				} else {
					class340.field2721[0].method1745(var37, 4);
				}

				if (3 == class2.field14[0] && class2.field15[0] == 1) {
					class340.field2721[3].method1745(var37 + 15, 4);
				} else {
					class340.field2721[1].method1745(var37 + 15, 4);
				}

				var0.method2025(class177.field1641, var37 + 32, 17, 16777215, -1);
			}

			class162.method749(class359.field3052 + 708, 4, 50, 16, 0);
			var1.method2027(class177.field1406, 25 + class359.field3052 + 708, 16, 16777215, -1);
			class359.field3077 = -1;
			if (class290.field2370 != null) {
				var24 = 88;
				byte var46 = 19;
				var34 = 765 / (var24 + 1) - 1;
				var37 = 480 / (var46 + 1);

				do {
					var8 = var37;
					var9 = var34;
					if (var37 * (var34 - 1) >= class2.field11) {
						--var34;
					}

					if (var34 * (var37 - 1) >= class2.field11) {
						--var37;
					}

					if ((var37 - 1) * var34 >= class2.field11) {
						--var37;
					}
				} while(var37 != var8 || var34 != var9);

				var8 = (765 - var34 * var24) / (var34 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				var9 = (480 - var46 * var37) / (var37 + 1);
				if (var9 > 5) {
					var9 = 5;
				}

				int var10 = (765 - var34 * var24 - var8 * (var34 - 1)) / 2;
				var11 = (480 - var46 * var37 - (var37 - 1) * var9) / 2;
				int var40 = (var37 + class2.field11 - 1) / var37;
				class359.field3079 = var40 - var34;
				if (class48.field566 != null && class359.field3078 > 0) {
					class48.field566.method1745(8, class476.field4003 / 2 - class48.field566.field2755 / 2);
				}

				if (null != class261.field2115 && class359.field3078 < class359.field3079) {
					class261.field2115.method1745(class427.field3529 - class261.field2115.field2758 - 8, class476.field4003 / 2 - class261.field2115.field2755 / 2);
				}

				int var13 = var11 + 23;
				int var14 = class359.field3052 + var10;
				int var15 = 0;
				boolean var16 = false;
				int var17 = class359.field3078;

				int var18;
				for (var18 = var17 * var37; var18 < class2.field11 && var17 - class359.field3078 < var34; ++var18) {
					class2 var26 = class2.field12[var18];
					boolean var20 = true;
					String var21 = Integer.toString(var26.field17);
					if (-1 == var26.field17) {
						var21 = class177.field1344;
						var20 = false;
					} else if (var26.field17 > 1980) {
						var21 = class177.field1643;
						var20 = false;
					}

					int var22 = -1;
					int var23 = 0;
					if (var26.method6()) {
						if (var26.method3()) {
							var22 = class252.field2075.field2082;
						} else {
							var22 = class252.field2074.field2082;
						}
					} else if (var26.method9()) {
						var23 = 16711680;
						if (var26.method3()) {
							var22 = class252.field2073.field2082;
						} else {
							var22 = class252.field2076.field2082;
						}
					} else if (var26.method13()) {
						if (var26.method3()) {
							var22 = class252.field2077.field2082;
						} else {
							var22 = class252.field2080.field2082;
						}
					} else if (var26.method4()) {
						if (var26.method3()) {
							var22 = class252.field2071.field2082;
						} else {
							var22 = class252.field2070.field2082;
						}
					} else if (var26.method12()) {
						if (var26.method3()) {
							var22 = class252.field2072.field2082;
						} else {
							var22 = class252.field2079.field2082;
						}
					} else if (var26.method7()) {
						if (var26.method3()) {
							var22 = class252.field2081.field2082;
						} else {
							var22 = class252.field2078.field2082;
						}
					}

					if (var22 == -1 || var22 >= class290.field2370.length) {
						if (var26.method3()) {
							var22 = class252.field2069.field2082;
						} else {
							var22 = class252.field2085.field2082;
						}
					}

					if (class466.field3863 >= var14 && class466.field3858 >= var13 && class466.field3863 < var14 + var24 && class466.field3858 < var46 + var13 && var20) {
						class359.field3077 = var18;
						class290.field2370[var22].method1221(var14, var13, 128, 16777215);
						var16 = true;
					} else {
						class290.field2370[var22].method1229(var14, var13);
					}

					if (class161.field1229 != null) {
						class161.field1229[(var26.method3() ? 8 : 0) + var26.field19].method1745(var14 + 29, var13);
					}

					var0.method2027(Integer.toString(var26.field10), var14 + 15, 5 + var13 + var46 / 2, var23, -1);
					var1.method2027(var21, var14 + 60, var46 / 2 + var13 + 5, 268435455, -1);
					var13 += var9 + var46;
					++var15;
					if (var15 >= var37) {
						var13 = var11 + 23;
						var14 += var8 + var24;
						var15 = 0;
						++var17;
					}
				}

				if (var16) {
					var18 = var1.method2045(class2.field12[class359.field3077].field13) + 6;
					int var19 = var1.field3442 + 8;
					int var41 = 25 + class466.field3858;
					if (var19 + var41 > 480) {
						var41 = class466.field3858 - 25 - var19;
					}

					class162.method749(class466.field3863 - var18 / 2, var41, var18, var19, 16777120);
					class162.method741(class466.field3863 - var18 / 2, var41, var18, var19, 0);
					var1.method2027(class2.field12[class359.field3077].field13, class466.field3863, var1.field3442 + var41 + 4, 0, -1);
				}
			}

			class39.field199.method263(0, 0);
		} else {
			class287.field2366.method1229(class359.field3052, 0);
			class374.field3173.method1229(class359.field3052 + 382, 0);
			class359.field3054.method1745(class359.field3052 + 382 - class359.field3054.field2758 / 2, 18);
			if (client.field229 == 0 || 5 == client.field229) {
				var24 = 20;
				var0.method2027(class177.field1546, 180 + class359.field3072, 245 - var24, 16777215, -1);
				var25 = 253 - var24;
				class162.method741(class359.field3072 + 180 - 152, var25, 304, 34, 9179409);
				class162.method741(class359.field3072 + 180 - 151, var25 + 1, 302, 32, 0);
				class162.method749(class359.field3072 + 180 - 150, var25 + 2, class359.field3056 * 3, 30, 9179409);
				class162.method749(class359.field3056 * 3 + (class359.field3072 + 180 - 150), var25 + 2, 300 - class359.field3056 * 3, 30, 0);
				var0.method2027(class359.field3057, class359.field3072 + 180, 276 - var24, 16777215, -1);
			}

			String var27;
			String var28;
			String var29;
			short var42;
			short var44;
			if (20 == client.field229) {
				class119.field878.method1745(class359.field3072 + 180 - class119.field878.field2758 / 2, 271 - class119.field878.field2755 / 2);
				var42 = 201;
				var0.method2027(class359.field3051, 180 + class359.field3072, var42, 16776960, 0);
				var43 = var42 + 15;
				var0.method2027(class359.field3064, class359.field3072 + 180, var43, 16776960, 0);
				var43 += 15;
				var0.method2027(class359.field3084, 180 + class359.field3072, var43, 16776960, 0);
				var43 += 15;
				var43 += 7;
				if (class359.field3075 != 4 && 10 != class359.field3075) {
					var0.method2025(class177.field1574, 180 + class359.field3072 - 110, var43, 16777215, 0);
					var44 = 200;
					var27 = class50.field574.method2203() ? class300.method1453(class359.field3071) : class359.field3071;

					for (var28 = var27; var0.method2045(var28) > var44; var28 = var28.substring(0, var28.length() - 1)) {
					}

					var0.method2025(class420.method2042(var28), class359.field3072 + 180 - 70, var43, 16777215, 0);
					var43 += 15;

					for (var29 = class300.method1453(class359.field3067); var0.method2045(var29) > var44; var29 = var29.substring(1)) {
					}

					var0.method2025(class177.field1324 + var29, 180 + class359.field3072 - 108, var43, 16777215, 0);
					var43 += 15;
				}
			}

			if (client.field229 == 10 || 11 == client.field229 || client.field229 == 50) {
				class119.field878.method1745(class359.field3072, 171);
				short var6;
				if (0 == class359.field3075) {
					var42 = 251;
					var0.method2027(class177.field1577, 180 + class359.field3072, var42, 16776960, 0);
					var43 = var42 + 30;
					var25 = class359.field3072 + 180 - 80;
					var6 = 291;
					class298.field2395.method1745(var25 - 73, var6 - 20);
					var0.method2028(class177.field1578, var25 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var25 = class359.field3072 + 180 + 80;
					class298.field2395.method1745(var25 - 73, var6 - 20);
					var0.method2028(class177.field1579, var25 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (class359.field3075 == 1) {
					var0.method2027(class359.field3062, 180 + class359.field3072, 201, 16776960, 0);
					var42 = 236;
					var0.method2027(class359.field3051, class359.field3072 + 180, var42, 16777215, 0);
					var43 = var42 + 15;
					var0.method2027(class359.field3064, 180 + class359.field3072, var43, 16777215, 0);
					var43 += 15;
					var0.method2027(class359.field3084, class359.field3072 + 180, var43, 16777215, 0);
					var43 += 15;
					var25 = 180 + class359.field3072 - 80;
					var6 = 321;
					class298.field2395.method1745(var25 - 73, var6 - 20);
					var0.method2027(class177.field1329, var25, var6 + 5, 16777215, 0);
					var25 = 80 + 180 + class359.field3072;
					class298.field2395.method1745(var25 - 73, var6 - 20);
					var0.method2027(class177.field1406, var25, var6 + 5, 16777215, 0);
				} else if (class359.field3075 == 2) {
					var42 = 201;
					var0.method2027(class359.field3051, class140.field1136, var42, 16776960, 0);
					var43 = var42 + 15;
					var0.method2027(class359.field3064, class140.field1136, var43, 16776960, 0);
					var43 += 15;
					var0.method2027(class359.field3084, class140.field1136, var43, 16776960, 0);
					var43 += 15;
					var43 += 7;
					var0.method2025(class177.field1574, class140.field1136 - 110, var43, 16777215, 0);
					var44 = 200;
					var27 = class50.field574.method2203() ? class300.method1453(class359.field3071) : class359.field3071;

					for (var28 = var27; var0.method2045(var28) > var44; var28 = var28.substring(1)) {
					}

					var0.method2025(class420.method2042(var28) + (class359.field3073 == 0 & client.field231 % 40 < 20 ? class238.method1032(16776960) + class442.field3663 : ""), class140.field1136 - 70, var43, 16777215, 0);
					var43 += 15;

					for (var29 = class300.method1453(class359.field3067); var0.method2045(var29) > var44; var29 = var29.substring(1)) {
					}

					var0.method2025(class177.field1324 + var29 + (class359.field3073 == 1 & client.field231 % 40 < 20 ? class238.method1032(16776960) + class442.field3663 : ""), class140.field1136 - 108, var43, 16777215, 0);
					var43 += 15;
					var42 = 277;
					var9 = class140.field1136 + -117;
					class344 var30 = class398.method1968(client.field268, class359.field3070);
					var30.method1745(var9, var42);
					var9 += var30.field2758 + 5;
					var1.method2025(class177.field1582, var9, var42 + 13, 16776960, 0);
					var9 = class140.field1136 + 24;
					var30 = class398.method1968(class50.field574.method2203(), class359.field3085);
					var30.method1745(var9, var42);
					var9 += var30.field2758 + 5;
					var1.method2025(class177.field1583, var9, var42 + 13, 16776960, 0);
					var43 = var42 + 15;
					var11 = class140.field1136 - 80;
					short var12 = 321;
					class298.field2395.method1745(var11 - 73, var12 - 20);
					var0.method2027(class177.field1632, var11, var12 + 5, 16777215, 0);
					var11 = 80 + class140.field1136;
					class298.field2395.method1745(var11 - 73, var12 - 20);
					var0.method2027(class177.field1406, var11, var12 + 5, 16777215, 0);
					var42 = 357;
					switch(class359.field3059) {
					case 2:
						class359.field3060 = class177.field1355;
						break;
					default:
						class359.field3060 = class177.field1593;
					}

					class191.field1712 = new class376(class140.field1136, var42, var1.method2045(class359.field3060), 11);
					class188.field1701 = new class376(class140.field1136, var42, var1.method2045(class177.field1594), 11);
					var1.method2027(class359.field3060, class140.field1136, var42, 16777215, 0);
				} else if (class359.field3075 == 3) {
					var42 = 201;
					var0.method2027(class177.field1584, 180 + class359.field3072, var42, 16776960, 0);
					var43 = var42 + 20;
					var1.method2027(class177.field1585, 180 + class359.field3072, var43, 16776960, 0);
					var43 += 15;
					var1.method2027(class177.field1586, class359.field3072 + 180, var43, 16776960, 0);
					var43 += 15;
					var25 = 180 + class359.field3072;
					var6 = 276;
					class298.field2395.method1745(var25 - 73, var6 - 20);
					var2.method2027(class177.field1587, var25, var6 + 5, 16777215, 0);
					var25 = class359.field3072 + 180;
					var6 = 326;
					class298.field2395.method1745(var25 - 73, var6 - 20);
					var2.method2027(class177.field1588, var25, var6 + 5, 16777215, 0);
				} else {
					short var38;
					if (4 == class359.field3075) {
						var0.method2027(class177.field1563, class359.field3072 + 180, 201, 16776960, 0);
						var42 = 236;
						var0.method2027(class359.field3051, 180 + class359.field3072, var42, 16777215, 0);
						var43 = var42 + 15;
						var0.method2027(class359.field3064, class359.field3072 + 180, var43, 16777215, 0);
						var43 += 15;
						var0.method2027(class359.field3084, 180 + class359.field3072, var43, 16777215, 0);
						var43 += 15;
						var0.method2025(class177.field1449 + class300.method1453(class60.field603) + (client.field231 % 40 < 20 ? class238.method1032(16776960) + class442.field3663 : ""), class359.field3072 + 180 - 108, var43, 16777215, 0);
						var43 -= 8;
						var0.method2025(class177.field1357, 180 + class359.field3072 - 9, var43, 16776960, 0);
						var43 += 15;
						var0.method2025(class177.field1510, 180 + class359.field3072 - 9, var43, 16776960, 0);
						var25 = class359.field3072 + 180 - 9 + var0.method2045(class177.field1510) + 15;
						var34 = var43 - var0.field3442;
						class344 var45;
						if (class359.field3061) {
							var45 = class306.field2455;
						} else {
							var45 = class23.field110;
						}

						var45.method1745(var25, var34);
						var43 += 15;
						var8 = 180 + class359.field3072 - 80;
						var38 = 321;
						class298.field2395.method1745(var8 - 73, var38 - 20);
						var0.method2027(class177.field1329, var8, var38 + 5, 16777215, 0);
						var8 = 80 + class359.field3072 + 180;
						class298.field2395.method1745(var8 - 73, var38 - 20);
						var0.method2027(class177.field1406, var8, var38 + 5, 16777215, 0);
						var1.method2027(class177.field1564, 180 + class359.field3072, var38 + 36, 255, 0);
					} else if (class359.field3075 == 5) {
						var0.method2027(class177.field1589, 180 + class359.field3072, 201, 16776960, 0);
						var42 = 221;
						var2.method2027(class359.field3051, 180 + class359.field3072, var42, 16776960, 0);
						var43 = var42 + 15;
						var2.method2027(class359.field3064, class359.field3072 + 180, var43, 16776960, 0);
						var43 += 15;
						var2.method2027(class359.field3084, 180 + class359.field3072, var43, 16776960, 0);
						var43 += 15;
						var43 += 14;
						var0.method2025(class177.field1590, 180 + class359.field3072 - 145, var43, 16777215, 0);
						var44 = 174;
						var27 = class50.field574.method2203() ? class300.method1453(class359.field3071) : class359.field3071;

						for (var28 = var27; var0.method2045(var28) > var44; var28 = var28.substring(1)) {
						}

						var0.method2025(class420.method2042(var28) + (client.field231 % 40 < 20 ? class238.method1032(16776960) + class442.field3663 : ""), 180 + class359.field3072 - 34, var43, 16777215, 0);
						var43 += 15;
						var8 = class359.field3072 + 180 - 80;
						var38 = 321;
						class298.field2395.method1745(var8 - 73, var38 - 20);
						var0.method2027(class177.field1591, var8, var38 + 5, 16777215, 0);
						var8 = 80 + 180 + class359.field3072;
						class298.field2395.method1745(var8 - 73, var38 - 20);
						var0.method2027(class177.field1592, var8, var38 + 5, 16777215, 0);
						var38 = 356;
						var1.method2027(class177.field1594, class140.field1136, var38, 268435455, 0);
					} else if (class359.field3075 == 6) {
						var42 = 201;
						var0.method2027(class359.field3051, class359.field3072 + 180, var42, 16776960, 0);
						var43 = var42 + 15;
						var0.method2027(class359.field3064, class359.field3072 + 180, var43, 16776960, 0);
						var43 += 15;
						var0.method2027(class359.field3084, 180 + class359.field3072, var43, 16776960, 0);
						var43 += 15;
						var25 = class359.field3072 + 180;
						var6 = 321;
						class298.field2395.method1745(var25 - 73, var6 - 20);
						var0.method2027(class177.field1592, var25, var6 + 5, 16777215, 0);
					} else if (7 == class359.field3075) {
						if (class113.field842 && !client.field461) {
							var42 = 201;
							var0.method2027(class359.field3051, class140.field1136, var42, 16776960, 0);
							var43 = var42 + 15;
							var0.method2027(class359.field3064, class140.field1136, var43, 16776960, 0);
							var43 += 15;
							var0.method2027(class359.field3084, class140.field1136, var43, 16776960, 0);
							var25 = class140.field1136 - 150;
							var43 += 10;

							for (var34 = 0; var34 < 8; ++var34) {
								class298.field2395.method1750(var25, var43, 30, 40);
								boolean var7 = class359.field3069 == var34 & client.field231 % 40 < 20;
								var0.method2025((null == class359.field3050[var34] ? "" : class359.field3050[var34]) + (var7 ? class238.method1032(16776960) + class442.field3663 : ""), var25 + 10, var43 + 27, 16777215, 0);
								if (var34 != 1 && var34 != 3) {
									var25 += 35;
								} else {
									var25 += 50;
									var0.method2025(class420.method2042("/"), var25 - 13, var43 + 27, 16777215, 0);
								}
							}

							var34 = class140.field1136 - 80;
							short var35 = 321;
							class298.field2395.method1745(var34 - 73, var35 - 20);
							var0.method2027("Submit", var34, var35 + 5, 16777215, 0);
							var34 = 80 + class140.field1136;
							class298.field2395.method1745(var34 - 73, var35 - 20);
							var0.method2027(class177.field1406, var34, var35 + 5, 16777215, 0);
						} else {
							var42 = 216;
							var0.method2027(class177.field1620, class359.field3072 + 180, var42, 16776960, 0);
							var43 = var42 + 15;
							var2.method2027(class177.field1490, 180 + class359.field3072, var43, 16776960, 0);
							var43 += 15;
							var2.method2027(class177.field1622, 180 + class359.field3072, var43, 16776960, 0);
							var43 += 15;
							var25 = class359.field3072 + 180 - 80;
							var6 = 321;
							class298.field2395.method1745(var25 - 73, var6 - 20);
							var0.method2027(class177.field1639, var25, var6 + 5, 16777215, 0);
							var25 = class359.field3072 + 180 + 80;
							class298.field2395.method1745(var25 - 73, var6 - 20);
							var0.method2027(class177.field1592, var25, var6 + 5, 16777215, 0);
						}
					} else if (class359.field3075 == 8) {
						var42 = 216;
						var0.method2027(class177.field1461, 180 + class359.field3072, var42, 16776960, 0);
						var43 = var42 + 15;
						var2.method2027(class177.field1462, 180 + class359.field3072, var43, 16776960, 0);
						var43 += 15;
						var2.method2027(class177.field1450, class359.field3072 + 180, var43, 16776960, 0);
						var43 += 15;
						var25 = 180 + class359.field3072 - 80;
						var6 = 321;
						class298.field2395.method1745(var25 - 73, var6 - 20);
						var0.method2027(class177.field1576, var25, var6 + 5, 16777215, 0);
						var25 = 80 + 180 + class359.field3072;
						class298.field2395.method1745(var25 - 73, var6 - 20);
						var0.method2027(class177.field1592, var25, var6 + 5, 16777215, 0);
					} else if (9 == class359.field3075) {
						var42 = 221;
						var0.method2027(class359.field3051, 180 + class359.field3072, var42, 16776960, 0);
						var43 = var42 + 25;
						var0.method2027(class359.field3064, class359.field3072 + 180, var43, 16776960, 0);
						var43 += 25;
						var0.method2027(class359.field3084, class359.field3072 + 180, var43, 16776960, 0);
						var25 = class359.field3072 + 180;
						var6 = 311;
						class298.field2395.method1745(var25 - 73, var6 - 20);
						var0.method2027(class177.field1587, var25, var6 + 5, 16777215, 0);
					} else if (class359.field3075 == 10) {
						var43 = 180 + class359.field3072;
						var44 = 209;
						var0.method2027(class177.field1577, 180 + class359.field3072, var44, 16776960, 0);
						var25 = var44 + 20;
						class72.field651.method1745(var43 - 109, var25);
						class332.field2604.method1745(var43 - 48, var25 + 18);
					} else if (12 == class359.field3075) {
						var43 = class140.field1136;
						var44 = 216;
						var2.method2027(class177.field1334, var43, var44, 16777215, 0);
						var25 = var44 + 17;
						var2.method2027(class177.field1353, var43, var25, 16777215, 0);
						var25 += 17;
						var2.method2027(class177.field1629, var43, var25, 16777215, 0);
						var25 += 17;
						var2.method2027(class177.field1575, var43, var25, 16777215, 0);
						var43 = class140.field1136 - 80;
						var44 = 311;
						class298.field2395.method1745(var43 - 73, var44 - 20);
						var0.method2027(class177.field1633, var43, var44 + 5, 16777215, 0);
						var43 = 80 + class140.field1136;
						class298.field2395.method1745(var43 - 73, var44 - 20);
						var0.method2027(class177.field1634, var43, var44 + 5, 16777215, 0);
					} else if (13 == class359.field3075) {
						var42 = 231;
						var2.method2027(class177.field1482, class359.field3072 + 180, var42, 16777215, 0);
						var43 = var42 + 20;
						var2.method2027(class177.field1378, 180 + class359.field3072, var43, 16777215, 0);
						var25 = 180 + class359.field3072;
						var42 = 311;
						class298.field2395.method1745(var25 - 73, var42 - 20);
						var0.method2027(class177.field1592, var25, var42 + 5, 16777215, 0);
					} else if (14 == class359.field3075) {
						var42 = 201;
						String var5 = "";
						var27 = "";
						var28 = "";
						switch(class359.field3055) {
						case 0:
							var5 = class177.field1377;
							var27 = class177.field1343;
							var28 = class177.field1379;
							break;
						case 1:
							var5 = class177.field1416;
							var27 = class177.field1417;
							var28 = class177.field1418;
							break;
						case 2:
							var5 = class177.field1452;
							var27 = class177.field1453;
							var28 = class177.field1454;
							break;
						default:
							class426.method2080(false);
						}

						var0.method2027(var5, 180 + class359.field3072, var42, 16776960, 0);
						var43 = var42 + 20;
						var0.method2027(var27, 180 + class359.field3072, var43, 16776960, 0);
						var43 += 20;
						var0.method2027(var28, class359.field3072 + 180, var43, 16776960, 0);
						var8 = 180 + class359.field3072;
						var38 = 276;
						class298.field2395.method1745(var8 - 73, var38 - 20);
						var0.method2027(class177.field1413, var8, var38 + 5, 16777215, 0);
						var8 = 180 + class359.field3072;
						var38 = 326;
						class298.field2395.method1745(var8 - 73, var38 - 20);
						var0.method2027(class177.field1592, var8, var38 + 5, 16777215, 0);
					} else if (24 == class359.field3075) {
						var42 = 221;
						var0.method2027(class359.field3051, 180 + class359.field3072, var42, 16777215, 0);
						var43 = var42 + 15;
						var0.method2027(class359.field3064, 180 + class359.field3072, var43, 16777215, 0);
						var43 += 15;
						var0.method2027(class359.field3084, class359.field3072 + 180, var43, 16777215, 0);
						var43 += 15;
						var25 = class359.field3072 + 180;
						var6 = 301;
						class298.field2395.method1745(var25 - 73, var6 - 20);
						var0.method2027(class177.field1327, var25, var6 + 5, 16777215, 0);
					} else if (26 == class359.field3075) {
						var42 = 216;
						var0.method2027(class177.field1620, class359.field3072 + 180, var42, 16776960, 0);
						var43 = var42 + 15;
						var2.method2027(class177.field1490, class359.field3072 + 180, var43, 16776960, 0);
						var43 += 15;
						var2.method2027(class177.field1622, 180 + class359.field3072, var43, 16776960, 0);
						var43 += 15;
						var25 = class359.field3072 + 180 - 80;
						var6 = 321;
						class298.field2395.method1745(var25 - 73, var6 - 20);
						var0.method2027(class177.field1639, var25, var6 + 5, 16777215, 0);
						var25 = 80 + class359.field3072 + 180;
						class298.field2395.method1745(var25 - 73, var6 - 20);
						var0.method2027(class177.field1592, var25, var6 + 5, 16777215, 0);
					}
				}
			}

			if (client.field229 >= 10) {
				int[] var4 = new int[4];
				class162.method744(var4);
				class162.method742(class359.field3052, 0, 765 + class359.field3052, class476.field4003);
				class312.field2467.method1954(class359.field3052 - 22, client.field231);
				class312.field2467.method1954(22 + 765 + class359.field3052 - 128, client.field231);
				class162.method745(var4);
			}

			class342.field2746[class50.field574.method2213() ? 1 : 0].method1745(765 + class359.field3052 - 40, 463);
			if (client.field229 > 5 && class235.field1995 == class476.field3997) {
				if (null != class122.field1054) {
					var43 = class359.field3052 + 5;
					var44 = 463;
					byte var39 = 100;
					byte var36 = 35;
					class122.field1054.method1745(var43, var44);
					var0.method2027(class177.field1501 + " " + client.field395, var39 / 2 + var43, var36 / 2 + var44 - 2, 16777215, 0);
					if (null != class338.field2702) {
						var1.method2027(class177.field1644, var43 + var39 / 2, var36 / 2 + var44 + 12, 16777215, 0);
					} else {
						var1.method2027(class177.field1645, var43 + var39 / 2, 12 + var36 / 2 + var44, 16777215, 0);
					}
				} else {
					class122.field1054 = class208.method906(class446.field3678, "sl_button", "");
				}
			}

		}
	}

	@ObfInfo(
		owner = "gb",
		name = "aa",
		desc = "(ILbm;ZI)I"
	)
	static int method462(int var0, class461 var1, boolean var2) {
		return 2;
	}
}
