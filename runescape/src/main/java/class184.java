import java.awt.datatransfer.Clipboard;

public class class184 implements class48 {
	boolean field2019;
	boolean field2021;
	class290 field2020;

	public class184() {
		this.field2020 = null;
		this.field2019 = false;
		this.field2021 = false;
	}

	public void method3550(class290 var1) {
		this.method3552();
		if (var1 != null) {
			this.field2020 = var1;
			class306 var3 = var1.method5528();
			if (null != var3) {
				var3.field3669.method5680(true);
				if (var3.field3670 != null) {
					class80 var4 = new class80();
					var4.method1605(var1);
					var4.method1603(var3.field3670);
					client.method4352().method6572(var4);
				}
			}
		}

	}

	public class290 method3551() {
		return this.field2020;
	}

	public void method3552() {
		if (null != this.field2020) {
			class306 var2 = this.field2020.method5528();
			class290 var3 = this.field2020;
			this.field2020 = null;
			if (var2 != null) {
				var2.field3669.method5680(false);
				if (null != var2.field3670) {
					class80 var4 = new class80();
					var4.method1605(var3);
					var4.method1603(var2.field3670);
					client.method4352().method6572(var4);
				}

			}
		}
	}

	public boolean method928(int var1) {
		if (null == this.field2020) {
			return false;
		} else {
			class41 var3 = this.field2020.method5530();
			if (var3 == null) {
				return false;
			} else {
				if (var3.method696(var1)) {
					switch(var1) {
					case 81:
						this.field2021 = true;
						break;
					case 82:
						this.field2019 = true;
						break;
					default:
						if (this.method3553(var1)) {
							class53.method1040(this.field2020);
						}
					}
				}

				return var3.method717(var1);
			}
		}
	}

	public boolean method929(int var1) {
		switch(var1) {
		case 81:
			this.field2021 = false;
			return false;
		case 82:
			this.field2019 = false;
			return false;
		default:
			return false;
		}
	}

	public boolean method923(char var1) {
		if (this.field2020 == null) {
			return false;
		} else if (!class70.method1403(var1)) {
			return false;
		} else {
			class295 var3 = this.field2020.method5510();
			if (var3 != null && var3.method5862()) {
				class41 var4 = this.field2020.method5530();
				if (var4 == null) {
					return false;
				} else {
					if (var4.method706(var1) && var3.method5697(var1)) {
						class53.method1040(this.field2020);
					}

					return var4.method693(var1);
				}
			} else {
				return false;
			}
		}
	}

	public boolean method924(boolean var1) {
		return false;
	}

	boolean method3553(int var1) {
		if (null == this.field2020) {
			return false;
		} else {
			class295 var3 = this.field2020.method5510();
			if (var3 != null && var3.method5862()) {
				Clipboard var6;
				switch(var1) {
				case 13:
					this.method3552();
					return true;
				case 48:
					if (this.field2019) {
						var3.method5916();
					}

					return true;
				case 65:
					if (this.field2019) {
						var6 = class122.field1212.method516();
						var3.method5722(var6);
					}

					return true;
				case 66:
					if (this.field2019) {
						var6 = class122.field1212.method516();
						var3.method5834(var6);
					}

					return true;
				case 67:
					if (this.field2019) {
						var6 = class122.field1212.method516();
						var3.method5723(var6);
					}

					return true;
				case 84:
					if (var3.method5742() == 0) {
						var3.method5697(10);
					} else if (this.field2021 && var3.method5746()) {
						var3.method5697(10);
					} else {
						class306 var4 = this.field2020.method5528();
						class80 var5 = new class80();
						var5.method1605(this.field2020);
						var5.method1603(var4.field3668);
						client.method4352().method6572(var5);
						this.method3552();
					}

					return true;
				case 85:
					if (this.field2019) {
						var3.method5700();
					} else {
						var3.method5698();
					}

					return true;
				case 96:
					if (this.field2019) {
						var3.method5711(this.field2021);
					} else {
						var3.method5709(this.field2021);
					}

					return true;
				case 97:
					if (this.field2019) {
						var3.method5703(this.field2021);
					} else {
						var3.method5710(this.field2021);
					}

					return true;
				case 98:
					if (this.field2019) {
						var3.method5724();
					} else {
						var3.method5828(this.field2021);
					}

					return true;
				case 99:
					if (this.field2019) {
						var3.method5801();
					} else {
						var3.method5735(this.field2021);
					}

					return true;
				case 101:
					if (this.field2019) {
						var3.method5701();
					} else {
						var3.method5699();
					}

					return true;
				case 102:
					if (this.field2019) {
						var3.method5707(this.field2021);
					} else {
						var3.method5943(this.field2021);
					}

					return true;
				case 103:
					if (this.field2019) {
						var3.method5708(this.field2021);
					} else {
						var3.method5706(this.field2021);
					}

					return true;
				case 104:
					if (this.field2019) {
						var3.method5717(this.field2021);
					} else {
						var3.method5715(this.field2021);
					}

					return true;
				case 105:
					if (this.field2019) {
						var3.method5718(this.field2021);
					} else {
						var3.method5716(this.field2021);
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

	static void method3561(class386 var0, class386 var1, class386 var2) {
		class73.field629 = (class205.field2337 - 765) / 2;
		class73.field653 = 202 + class73.field629;
		class117.field1174 = class73.field653 + 180;
		int var8;
		int var9;
		int var11;
		byte var24;
		int var25;
		int var34;
		int var43;
		if (class73.field657) {
			class326 var33;
			int var37;
			if (null == class59.field457) {
				var33 = class86.field798;
				var34 = var33.method6319("sl_back");
				var37 = var33.method6326(var34, "");
				class491[] var31 = class183.method3549(var33, var34, var37);
				class59.field457 = var31;
			}

			class469[] var32;
			if (class94.field922 == null) {
				var33 = class86.field798;
				var34 = var33.method6319("sl_flags");
				var37 = var33.method6326(var34, "");
				var32 = class248.method4895(var33, var34, var37);
				class94.field922 = var32;
			}

			if (null == class227.field2747) {
				var33 = class86.field798;
				var34 = var33.method6319("sl_arrows");
				var37 = var33.method6326(var34, "");
				var32 = class248.method4895(var33, var34, var37);
				class227.field2747 = var32;
			}

			if (null == class275.field3187) {
				var33 = class86.field798;
				var34 = var33.method6319("sl_stars");
				var37 = var33.method6326(var34, "");
				var32 = class248.method4895(var33, var34, var37);
				class275.field3187 = var32;
			}

			if (null == class410.field4623) {
				class410.field4623 = class62.method1193(class86.field798, "leftarrow", "");
			}

			if (class131.field1303 == null) {
				class131.field1303 = class62.method1193(class86.field798, "rightarrow", "");
			}

			class478.method8680(class73.field629, 23, 765, 480, 0);
			class478.method8681(class73.field629, 0, 125, 23, 12425273, 9135624);
			class478.method8681(125 + class73.field629, 0, 640, 23, 5197647, 2697513);
			var0.method6857(class321.field4066, class73.field629 + 62, 15, 0, -1);
			if (class275.field3187 != null) {
				class275.field3187[1].method8587(class73.field629 + 140, 1);
				var1.method6854(class321.field3988, class73.field629 + 152, 10, 16777215, -1);
				class275.field3187[0].method8587(140 + class73.field629, 12);
				var1.method6854(class321.field4068, 152 + class73.field629, 21, 16777215, -1);
			}

			if (class227.field2747 != null) {
				var43 = class73.field629 + 280;
				if (class78.field712[0] == 0 && 0 == class78.field713[0]) {
					class227.field2747[2].method8587(var43, 4);
				} else {
					class227.field2747[0].method8587(var43, 4);
				}

				if (class78.field712[0] == 0 && 1 == class78.field713[0]) {
					class227.field2747[3].method8587(var43 + 15, 4);
				} else {
					class227.field2747[1].method8587(var43 + 15, 4);
				}

				var0.method6854(class321.field3803, var43 + 32, 17, 16777215, -1);
				var25 = 390 + class73.field629;
				if (class78.field712[0] == 1 && class78.field713[0] == 0) {
					class227.field2747[2].method8587(var25, 4);
				} else {
					class227.field2747[0].method8587(var25, 4);
				}

				if (1 == class78.field712[0] && class78.field713[0] == 1) {
					class227.field2747[3].method8587(var25 + 15, 4);
				} else {
					class227.field2747[1].method8587(var25 + 15, 4);
				}

				var0.method6854(class321.field3783, var25 + 32, 17, 16777215, -1);
				var34 = 500 + class73.field629;
				if (2 == class78.field712[0] && class78.field713[0] == 0) {
					class227.field2747[2].method8587(var34, 4);
				} else {
					class227.field2747[0].method8587(var34, 4);
				}

				if (class78.field712[0] == 2 && class78.field713[0] == 1) {
					class227.field2747[3].method8587(var34 + 15, 4);
				} else {
					class227.field2747[1].method8587(var34 + 15, 4);
				}

				var0.method6854(class321.field4071, var34 + 32, 17, 16777215, -1);
				var37 = class73.field629 + 610;
				if (class78.field712[0] == 3 && 0 == class78.field713[0]) {
					class227.field2747[2].method8587(var37, 4);
				} else {
					class227.field2747[0].method8587(var37, 4);
				}

				if (3 == class78.field712[0] && class78.field713[0] == 1) {
					class227.field2747[3].method8587(var37 + 15, 4);
				} else {
					class227.field2747[1].method8587(var37 + 15, 4);
				}

				var0.method6854(class321.field4072, var37 + 32, 17, 16777215, -1);
			}

			class478.method8680(class73.field629 + 708, 4, 50, 16, 0);
			var1.method6857(class321.field3837, 25 + class73.field629 + 708, 16, 16777215, -1);
			class73.field658 = -1;
			if (class59.field457 != null) {
				var24 = 88;
				byte var46 = 19;
				var34 = 765 / (var24 + 1) - 1;
				var37 = 480 / (var46 + 1);

				do {
					var8 = var37;
					var9 = var34;
					if (var37 * (var34 - 1) >= class78.field709) {
						--var34;
					}

					if (var34 * (var37 - 1) >= class78.field709) {
						--var37;
					}

					if ((var37 - 1) * var34 >= class78.field709) {
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
				int var40 = (var37 + class78.field709 - 1) / var37;
				class73.field660 = var40 - var34;
				if (class410.field4623 != null && class73.field659 > 0) {
					class410.field4623.method8587(8, class340.field4263 / 2 - class410.field4623.field4925 / 2);
				}

				if (null != class131.field1303 && class73.field659 < class73.field660) {
					class131.field1303.method8587(class205.field2337 - class131.field1303.field4928 - 8, class340.field4263 / 2 - class131.field1303.field4925 / 2);
				}

				int var13 = var11 + 23;
				int var14 = class73.field629 + var10;
				int var15 = 0;
				boolean var16 = false;
				int var17 = class73.field659;

				int var18;
				for (var18 = var17 * var37; var18 < class78.field709 && var17 - class73.field659 < var34; ++var18) {
					class78 var26 = class78.field710[var18];
					boolean var20 = true;
					String var21 = Integer.toString(var26.field715);
					if (-1 == var26.field715) {
						var21 = class321.field3775;
						var20 = false;
					} else if (var26.field715 > 1980) {
						var21 = class321.field4074;
						var20 = false;
					}

					int var22 = -1;
					int var23 = 0;
					if (var26.method1538()) {
						if (var26.method1533()) {
							var22 = class112.field1132.field1139;
						} else {
							var22 = class112.field1131.field1139;
						}
					} else if (var26.method1578()) {
						var23 = 16711680;
						if (var26.method1533()) {
							var22 = class112.field1130.field1139;
						} else {
							var22 = class112.field1133.field1139;
						}
					} else if (var26.method1594()) {
						if (var26.method1533()) {
							var22 = class112.field1134.field1139;
						} else {
							var22 = class112.field1137.field1139;
						}
					} else if (var26.method1535()) {
						if (var26.method1533()) {
							var22 = class112.field1128.field1139;
						} else {
							var22 = class112.field1127.field1139;
						}
					} else if (var26.method1592()) {
						if (var26.method1533()) {
							var22 = class112.field1129.field1139;
						} else {
							var22 = class112.field1136.field1139;
						}
					} else if (var26.method1541()) {
						if (var26.method1533()) {
							var22 = class112.field1138.field1139;
						} else {
							var22 = class112.field1135.field1139;
						}
					}

					if (var22 == -1 || var22 >= class59.field457.length) {
						if (var26.method1533()) {
							var22 = class112.field1125.field1139;
						} else {
							var22 = class112.field1142.field1139;
						}
					}

					if (class28.field158 >= var14 && class28.field153 >= var13 && class28.field158 < var14 + var24 && class28.field153 < var46 + var13 && var20) {
						class73.field658 = var18;
						class59.field457[var22].method8836(var14, var13, 128, 16777215);
						var16 = true;
					} else {
						class59.field457[var22].method8849(var14, var13);
					}

					if (class94.field922 != null) {
						class94.field922[(var26.method1533() ? 8 : 0) + var26.field717].method8587(var14 + 29, var13);
					}

					var0.method6857(Integer.toString(var26.field708), var14 + 15, 5 + var13 + var46 / 2, var23, -1);
					var1.method6857(var21, var14 + 60, var46 / 2 + var13 + 5, 268435455, -1);
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
					var18 = var1.method6901(class78.field710[class73.field658].field711) + 6;
					int var19 = var1.field4392 + 8;
					int var41 = 25 + class28.field153;
					if (var19 + var41 > 480) {
						var41 = class28.field153 - 25 - var19;
					}

					class478.method8680(class28.field158 - var18 / 2, var41, var18, var19, 16777120);
					class478.method8671(class28.field158 - var18 / 2, var41, var18, var19, 0);
					var1.method6857(class78.field710[class73.field658].field711, class28.field158, var1.field4392 + var41 + 4, 0, -1);
				}
			}

			class189.field2059.method8762(0, 0);
		} else {
			class90.field860.method8849(class73.field629, 0);
			class2.field12.method8849(class73.field629 + 382, 0);
			class73.field631.method8587(class73.field629 + 382 - class73.field631.field4928 / 2, 18);
			if (client.field1698 == 0 || 5 == client.field1698) {
				var24 = 20;
				var0.method6857(class321.field3977, 180 + class73.field653, 245 - var24, 16777215, -1);
				var25 = 253 - var24;
				class478.method8671(class73.field653 + 180 - 152, var25, 304, 34, 9179409);
				class478.method8671(class73.field653 + 180 - 151, var25 + 1, 302, 32, 0);
				class478.method8680(class73.field653 + 180 - 150, var25 + 2, class73.field637 * 3, 30, 9179409);
				class478.method8680(class73.field637 * 3 + (class73.field653 + 180 - 150), var25 + 2, 300 - class73.field637 * 3, 30, 0);
				var0.method6857(class73.field638, class73.field653 + 180, 276 - var24, 16777215, -1);
			}

			String var27;
			String var28;
			String var29;
			short var42;
			short var44;
			if (20 == client.field1698) {
				class219.field2653.method8587(class73.field653 + 180 - class219.field2653.field4928 / 2, 271 - class219.field2653.field4925 / 2);
				var42 = 201;
				var0.method6857(class73.field628, 180 + class73.field653, var42, 16776960, 0);
				var43 = var42 + 15;
				var0.method6857(class73.field645, class73.field653 + 180, var43, 16776960, 0);
				var43 += 15;
				var0.method6857(class73.field666, 180 + class73.field653, var43, 16776960, 0);
				var43 += 15;
				var43 += 7;
				if (class73.field656 != 4 && 10 != class73.field656) {
					var0.method6854(class321.field4005, 180 + class73.field653 - 110, var43, 16777215, 0);
					var44 = 200;
					var27 = class186.field2040.method1775() ? class341.method2927(class73.field652) : class73.field652;

					for (var28 = var27; var0.method6901(var28) > var44; var28 = var28.substring(0, var28.length() - 1)) {
					}

					var0.method6854(class369.method6886(var28), class73.field653 + 180 - 70, var43, 16777215, 0);
					var43 += 15;

					for (var29 = class341.method2927(class73.field648); var0.method6901(var29) > var44; var29 = var29.substring(1)) {
					}

					var0.method6854(class321.field3755 + var29, 180 + class73.field653 - 108, var43, 16777215, 0);
					var43 += 15;
				}
			}

			if (client.field1698 == 10 || 11 == client.field1698 || client.field1698 == 50) {
				class219.field2653.method8587(class73.field653, 171);
				short var6;
				if (0 == class73.field656) {
					var42 = 251;
					var0.method6857(class321.field4008, 180 + class73.field653, var42, 16776960, 0);
					var43 = var42 + 30;
					var25 = class73.field653 + 180 - 80;
					var6 = 291;
					class209.field2425.method8587(var25 - 73, var6 - 20);
					var0.method6858(class321.field4009, var25 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var25 = class73.field653 + 180 + 80;
					class209.field2425.method8587(var25 - 73, var6 - 20);
					var0.method6858(class321.field4010, var25 - 73, var6 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (class73.field656 == 1) {
					var0.method6857(class73.field643, 180 + class73.field653, 201, 16776960, 0);
					var42 = 236;
					var0.method6857(class73.field628, class73.field653 + 180, var42, 16777215, 0);
					var43 = var42 + 15;
					var0.method6857(class73.field645, 180 + class73.field653, var43, 16777215, 0);
					var43 += 15;
					var0.method6857(class73.field666, class73.field653 + 180, var43, 16777215, 0);
					var43 += 15;
					var25 = 180 + class73.field653 - 80;
					var6 = 321;
					class209.field2425.method8587(var25 - 73, var6 - 20);
					var0.method6857(class321.field3760, var25, var6 + 5, 16777215, 0);
					var25 = 80 + 180 + class73.field653;
					class209.field2425.method8587(var25 - 73, var6 - 20);
					var0.method6857(class321.field3837, var25, var6 + 5, 16777215, 0);
				} else if (class73.field656 == 2) {
					var42 = 201;
					var0.method6857(class73.field628, class117.field1174, var42, 16776960, 0);
					var43 = var42 + 15;
					var0.method6857(class73.field645, class117.field1174, var43, 16776960, 0);
					var43 += 15;
					var0.method6857(class73.field666, class117.field1174, var43, 16776960, 0);
					var43 += 15;
					var43 += 7;
					var0.method6854(class321.field4005, class117.field1174 - 110, var43, 16777215, 0);
					var44 = 200;
					var27 = class186.field2040.method1775() ? class341.method2927(class73.field652) : class73.field652;

					for (var28 = var27; var0.method6901(var28) > var44; var28 = var28.substring(1)) {
					}

					var0.method6854(class369.method6886(var28) + (class73.field654 == 0 & client.field1700 % 40 < 20 ? class79.method2039(16776960) + class79.field727 : ""), class117.field1174 - 70, var43, 16777215, 0);
					var43 += 15;

					for (var29 = class341.method2927(class73.field648); var0.method6901(var29) > var44; var29 = var29.substring(1)) {
					}

					var0.method6854(class321.field3755 + var29 + (class73.field654 == 1 & client.field1700 % 40 < 20 ? class79.method2039(16776960) + class79.field727 : ""), class117.field1174 - 108, var43, 16777215, 0);
					var43 += 15;
					var42 = 277;
					var9 = class117.field1174 + -117;
					class469 var30 = class133.method2476(client.field1737, class73.field651);
					var30.method8587(var9, var42);
					var9 += var30.field4928 + 5;
					var1.method6854(class321.field4013, var9, var42 + 13, 16776960, 0);
					var9 = class117.field1174 + 24;
					var30 = class133.method2476(class186.field2040.method1775(), class73.field667);
					var30.method8587(var9, var42);
					var9 += var30.field4928 + 5;
					var1.method6854(class321.field4014, var9, var42 + 13, 16776960, 0);
					var43 = var42 + 15;
					var11 = class117.field1174 - 80;
					short var12 = 321;
					class209.field2425.method8587(var11 - 73, var12 - 20);
					var0.method6857(class321.field4063, var11, var12 + 5, 16777215, 0);
					var11 = 80 + class117.field1174;
					class209.field2425.method8587(var11 - 73, var12 - 20);
					var0.method6857(class321.field3837, var11, var12 + 5, 16777215, 0);
					var42 = 357;
					switch(class73.field640) {
					case 2:
						class73.field641 = class321.field3786;
						break;
					default:
						class73.field641 = class321.field4024;
					}

					class368.field4383 = new class401(class117.field1174, var42, var1.method6901(class73.field641), 11);
					class136.field1337 = new class401(class117.field1174, var42, var1.method6901(class321.field4025), 11);
					var1.method6857(class73.field641, class117.field1174, var42, 16777215, 0);
				} else if (class73.field656 == 3) {
					var42 = 201;
					var0.method6857(class321.field4015, 180 + class73.field653, var42, 16776960, 0);
					var43 = var42 + 20;
					var1.method6857(class321.field4016, 180 + class73.field653, var43, 16776960, 0);
					var43 += 15;
					var1.method6857(class321.field4017, class73.field653 + 180, var43, 16776960, 0);
					var43 += 15;
					var25 = 180 + class73.field653;
					var6 = 276;
					class209.field2425.method8587(var25 - 73, var6 - 20);
					var2.method6857(class321.field4018, var25, var6 + 5, 16777215, 0);
					var25 = class73.field653 + 180;
					var6 = 326;
					class209.field2425.method8587(var25 - 73, var6 - 20);
					var2.method6857(class321.field4019, var25, var6 + 5, 16777215, 0);
				} else {
					short var38;
					if (4 == class73.field656) {
						var0.method6857(class321.field3994, class73.field653 + 180, 201, 16776960, 0);
						var42 = 236;
						var0.method6857(class73.field628, 180 + class73.field653, var42, 16777215, 0);
						var43 = var42 + 15;
						var0.method6857(class73.field645, class73.field653 + 180, var43, 16777215, 0);
						var43 += 15;
						var0.method6857(class73.field666, 180 + class73.field653, var43, 16777215, 0);
						var43 += 15;
						var0.method6854(class321.field3880 + class341.method2927(class154.field1469) + (client.field1700 % 40 < 20 ? class79.method2039(16776960) + class79.field727 : ""), class73.field653 + 180 - 108, var43, 16777215, 0);
						var43 -= 8;
						var0.method6854(class321.field3788, 180 + class73.field653 - 9, var43, 16776960, 0);
						var43 += 15;
						var0.method6854(class321.field3941, 180 + class73.field653 - 9, var43, 16776960, 0);
						var25 = class73.field653 + 180 - 9 + var0.method6901(class321.field3941) + 15;
						var34 = var43 - var0.field4392;
						class469 var45;
						if (class73.field642) {
							var45 = class92.field882;
						} else {
							var45 = class243.field2900;
						}

						var45.method8587(var25, var34);
						var43 += 15;
						var8 = 180 + class73.field653 - 80;
						var38 = 321;
						class209.field2425.method8587(var8 - 73, var38 - 20);
						var0.method6857(class321.field3760, var8, var38 + 5, 16777215, 0);
						var8 = 80 + class73.field653 + 180;
						class209.field2425.method8587(var8 - 73, var38 - 20);
						var0.method6857(class321.field3837, var8, var38 + 5, 16777215, 0);
						var1.method6857(class321.field3995, 180 + class73.field653, var38 + 36, 255, 0);
					} else if (class73.field656 == 5) {
						var0.method6857(class321.field4020, 180 + class73.field653, 201, 16776960, 0);
						var42 = 221;
						var2.method6857(class73.field628, 180 + class73.field653, var42, 16776960, 0);
						var43 = var42 + 15;
						var2.method6857(class73.field645, class73.field653 + 180, var43, 16776960, 0);
						var43 += 15;
						var2.method6857(class73.field666, 180 + class73.field653, var43, 16776960, 0);
						var43 += 15;
						var43 += 14;
						var0.method6854(class321.field4021, 180 + class73.field653 - 145, var43, 16777215, 0);
						var44 = 174;
						var27 = class186.field2040.method1775() ? class341.method2927(class73.field652) : class73.field652;

						for (var28 = var27; var0.method6901(var28) > var44; var28 = var28.substring(1)) {
						}

						var0.method6854(class369.method6886(var28) + (client.field1700 % 40 < 20 ? class79.method2039(16776960) + class79.field727 : ""), 180 + class73.field653 - 34, var43, 16777215, 0);
						var43 += 15;
						var8 = class73.field653 + 180 - 80;
						var38 = 321;
						class209.field2425.method8587(var8 - 73, var38 - 20);
						var0.method6857(class321.field4022, var8, var38 + 5, 16777215, 0);
						var8 = 80 + 180 + class73.field653;
						class209.field2425.method8587(var8 - 73, var38 - 20);
						var0.method6857(class321.field4023, var8, var38 + 5, 16777215, 0);
						var38 = 356;
						var1.method6857(class321.field4025, class117.field1174, var38, 268435455, 0);
					} else if (class73.field656 == 6) {
						var42 = 201;
						var0.method6857(class73.field628, class73.field653 + 180, var42, 16776960, 0);
						var43 = var42 + 15;
						var0.method6857(class73.field645, class73.field653 + 180, var43, 16776960, 0);
						var43 += 15;
						var0.method6857(class73.field666, 180 + class73.field653, var43, 16776960, 0);
						var43 += 15;
						var25 = class73.field653 + 180;
						var6 = 321;
						class209.field2425.method8587(var25 - 73, var6 - 20);
						var0.method6857(class321.field4023, var25, var6 + 5, 16777215, 0);
					} else if (7 == class73.field656) {
						if (class142.field1366 && !client.field1930) {
							var42 = 201;
							var0.method6857(class73.field628, class117.field1174, var42, 16776960, 0);
							var43 = var42 + 15;
							var0.method6857(class73.field645, class117.field1174, var43, 16776960, 0);
							var43 += 15;
							var0.method6857(class73.field666, class117.field1174, var43, 16776960, 0);
							var25 = class117.field1174 - 150;
							var43 += 10;

							for (var34 = 0; var34 < 8; ++var34) {
								class209.field2425.method8608(var25, var43, 30, 40);
								boolean var7 = class73.field650 == var34 & client.field1700 % 40 < 20;
								var0.method6854((null == class73.field627[var34] ? "" : class73.field627[var34]) + (var7 ? class79.method2039(16776960) + class79.field727 : ""), var25 + 10, var43 + 27, 16777215, 0);
								if (var34 != 1 && var34 != 3) {
									var25 += 35;
								} else {
									var25 += 50;
									var0.method6854(class369.method6886("/"), var25 - 13, var43 + 27, 16777215, 0);
								}
							}

							var34 = class117.field1174 - 80;
							short var35 = 321;
							class209.field2425.method8587(var34 - 73, var35 - 20);
							var0.method6857("Submit", var34, var35 + 5, 16777215, 0);
							var34 = 80 + class117.field1174;
							class209.field2425.method8587(var34 - 73, var35 - 20);
							var0.method6857(class321.field3837, var34, var35 + 5, 16777215, 0);
						} else {
							var42 = 216;
							var0.method6857(class321.field4051, class73.field653 + 180, var42, 16776960, 0);
							var43 = var42 + 15;
							var2.method6857(class321.field3921, 180 + class73.field653, var43, 16776960, 0);
							var43 += 15;
							var2.method6857(class321.field4053, 180 + class73.field653, var43, 16776960, 0);
							var43 += 15;
							var25 = class73.field653 + 180 - 80;
							var6 = 321;
							class209.field2425.method8587(var25 - 73, var6 - 20);
							var0.method6857(class321.field4070, var25, var6 + 5, 16777215, 0);
							var25 = class73.field653 + 180 + 80;
							class209.field2425.method8587(var25 - 73, var6 - 20);
							var0.method6857(class321.field4023, var25, var6 + 5, 16777215, 0);
						}
					} else if (class73.field656 == 8) {
						var42 = 216;
						var0.method6857(class321.field3892, 180 + class73.field653, var42, 16776960, 0);
						var43 = var42 + 15;
						var2.method6857(class321.field3893, 180 + class73.field653, var43, 16776960, 0);
						var43 += 15;
						var2.method6857(class321.field3881, class73.field653 + 180, var43, 16776960, 0);
						var43 += 15;
						var25 = 180 + class73.field653 - 80;
						var6 = 321;
						class209.field2425.method8587(var25 - 73, var6 - 20);
						var0.method6857(class321.field4007, var25, var6 + 5, 16777215, 0);
						var25 = 80 + 180 + class73.field653;
						class209.field2425.method8587(var25 - 73, var6 - 20);
						var0.method6857(class321.field4023, var25, var6 + 5, 16777215, 0);
					} else if (9 == class73.field656) {
						var42 = 221;
						var0.method6857(class73.field628, 180 + class73.field653, var42, 16776960, 0);
						var43 = var42 + 25;
						var0.method6857(class73.field645, class73.field653 + 180, var43, 16776960, 0);
						var43 += 25;
						var0.method6857(class73.field666, class73.field653 + 180, var43, 16776960, 0);
						var25 = class73.field653 + 180;
						var6 = 311;
						class209.field2425.method8587(var25 - 73, var6 - 20);
						var0.method6857(class321.field4018, var25, var6 + 5, 16777215, 0);
					} else if (class73.field656 == 10) {
						var43 = 180 + class73.field653;
						var44 = 209;
						var0.method6857(class321.field4008, 180 + class73.field653, var44, 16776960, 0);
						var25 = var44 + 20;
						class302.field3652.method8587(var43 - 109, var25);
						class156.field1484.method8587(var43 - 48, var25 + 18);
					} else if (12 == class73.field656) {
						var43 = class117.field1174;
						var44 = 216;
						var2.method6857(class321.field3765, var43, var44, 16777215, 0);
						var25 = var44 + 17;
						var2.method6857(class321.field3784, var43, var25, 16777215, 0);
						var25 += 17;
						var2.method6857(class321.field4060, var43, var25, 16777215, 0);
						var25 += 17;
						var2.method6857(class321.field4006, var43, var25, 16777215, 0);
						var43 = class117.field1174 - 80;
						var44 = 311;
						class209.field2425.method8587(var43 - 73, var44 - 20);
						var0.method6857(class321.field4064, var43, var44 + 5, 16777215, 0);
						var43 = 80 + class117.field1174;
						class209.field2425.method8587(var43 - 73, var44 - 20);
						var0.method6857(class321.field4065, var43, var44 + 5, 16777215, 0);
					} else if (13 == class73.field656) {
						var42 = 231;
						var2.method6857(class321.field3913, class73.field653 + 180, var42, 16777215, 0);
						var43 = var42 + 20;
						var2.method6857(class321.field3809, 180 + class73.field653, var43, 16777215, 0);
						var25 = 180 + class73.field653;
						var42 = 311;
						class209.field2425.method8587(var25 - 73, var42 - 20);
						var0.method6857(class321.field4023, var25, var42 + 5, 16777215, 0);
					} else if (14 == class73.field656) {
						var42 = 201;
						String var5 = "";
						var27 = "";
						var28 = "";
						switch(class73.field636) {
						case 0:
							var5 = class321.field3808;
							var27 = class321.field3774;
							var28 = class321.field3810;
							break;
						case 1:
							var5 = class321.field3847;
							var27 = class321.field3848;
							var28 = class321.field3849;
							break;
						case 2:
							var5 = class321.field3883;
							var27 = class321.field3884;
							var28 = class321.field3885;
							break;
						default:
							class357.method6628(false);
						}

						var0.method6857(var5, 180 + class73.field653, var42, 16776960, 0);
						var43 = var42 + 20;
						var0.method6857(var27, 180 + class73.field653, var43, 16776960, 0);
						var43 += 20;
						var0.method6857(var28, class73.field653 + 180, var43, 16776960, 0);
						var8 = 180 + class73.field653;
						var38 = 276;
						class209.field2425.method8587(var8 - 73, var38 - 20);
						var0.method6857(class321.field3844, var8, var38 + 5, 16777215, 0);
						var8 = 180 + class73.field653;
						var38 = 326;
						class209.field2425.method8587(var8 - 73, var38 - 20);
						var0.method6857(class321.field4023, var8, var38 + 5, 16777215, 0);
					} else if (24 == class73.field656) {
						var42 = 221;
						var0.method6857(class73.field628, 180 + class73.field653, var42, 16777215, 0);
						var43 = var42 + 15;
						var0.method6857(class73.field645, 180 + class73.field653, var43, 16777215, 0);
						var43 += 15;
						var0.method6857(class73.field666, class73.field653 + 180, var43, 16777215, 0);
						var43 += 15;
						var25 = class73.field653 + 180;
						var6 = 301;
						class209.field2425.method8587(var25 - 73, var6 - 20);
						var0.method6857(class321.field3758, var25, var6 + 5, 16777215, 0);
					} else if (26 == class73.field656) {
						var42 = 216;
						var0.method6857(class321.field4051, class73.field653 + 180, var42, 16776960, 0);
						var43 = var42 + 15;
						var2.method6857(class321.field3921, class73.field653 + 180, var43, 16776960, 0);
						var43 += 15;
						var2.method6857(class321.field4053, 180 + class73.field653, var43, 16776960, 0);
						var43 += 15;
						var25 = class73.field653 + 180 - 80;
						var6 = 321;
						class209.field2425.method8587(var25 - 73, var6 - 20);
						var0.method6857(class321.field4070, var25, var6 + 5, 16777215, 0);
						var25 = 80 + class73.field653 + 180;
						class209.field2425.method8587(var25 - 73, var6 - 20);
						var0.method6857(class321.field4023, var25, var6 + 5, 16777215, 0);
					}
				}
			}

			if (client.field1698 >= 10) {
				int[] var4 = new int[4];
				class478.method8674(var4);
				class478.method8672(class73.field629, 0, 765 + class73.field629, class340.field4263);
				class151.field1450.method1973(class73.field629 - 22, client.field1700);
				class151.field1450.method1973(22 + 765 + class73.field629 - 128, client.field1700);
				class478.method8675(var4);
			}

			class127.field1267[class186.field2040.method1790() ? 1 : 0].method8587(765 + class73.field629 - 40, 463);
			if (client.field1698 > 5 && class178.field1654 == class340.field4257) {
				if (null != class100.field1042) {
					var43 = class73.field629 + 5;
					var44 = 463;
					byte var39 = 100;
					byte var36 = 35;
					class100.field1042.method8587(var43, var44);
					var0.method6857(class321.field3932 + " " + client.field1864, var39 / 2 + var43, var36 / 2 + var44 - 2, 16777215, 0);
					if (null != class5.field30) {
						var1.method6857(class321.field4075, var43 + var39 / 2, var36 / 2 + var44 + 12, 16777215, 0);
					} else {
						var1.method6857(class321.field4076, var43 + var39 / 2, 12 + var36 / 2 + var44, 16777215, 0);
					}
				} else {
					class100.field1042 = class62.method1193(class86.field798, "sl_button", "");
				}
			}

		}
	}
}
