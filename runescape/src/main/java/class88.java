public final class class88 extends class98 {
	boolean field838;
	boolean field844;
	boolean field846;
	class216 field839;
	class301 field827;
	class398 field843;
	class398 field845;
	class398 field849;
	class483 field840;
	int field826;
	int field828;
	int field829;
	int field830;
	int field831;
	int field832;
	int field833;
	int field834;
	int field835;
	int field836;
	int field837;
	int field841;
	int field842;
	int field847;
	int field848;
	int field851;
	int field852;
	int field853;
	int field854;
	String[] field850;

	class88() {
		this.field828 = -1;
		this.field829 = -1;
		this.field850 = new String[3];

		for (int var1 = 0; var1 < 3; ++var1) {
			this.field850[var1] = "";
		}

		this.field831 = 0;
		this.field832 = 0;
		this.field851 = 0;
		this.field835 = 0;
		this.field844 = false;
		this.field830 = 0;
		this.field846 = false;
		this.field849 = class398.field4550;
		this.field843 = class398.field4550;
		this.field845 = class398.field4550;
		this.field838 = false;
	}

	final void method1926(class467 var1) {
		var1.field4915 = 0;
		int var3 = var1.method8326();
		int var4 = -1;
		this.field828 = var1.method8327();
		this.field829 = var1.method8327();
		int var5 = -1;
		this.field830 = 0;
		int[] var6 = new int[12];

		int var8;
		int var9;
		int var10;
		for (int var7 = 0; var7 < 12; ++var7) {
			var8 = var1.method8326();
			if (var8 == 0) {
				var6[var7] = 0;
			} else {
				var9 = var1.method8326();
				var6[var7] = (var8 << 8) + var9;
				if (var7 == 0 && 65535 == var6[0]) {
					var5 = var1.method8328();
					break;
				}

				if (var6[var7] >= 512) {
					var10 = class208.method4105(var6[var7] - 512).field2300;
					if (var10 != 0) {
						this.field830 = var10;
					}
				}
			}
		}

		int[] var26 = new int[5];

		for (var8 = 0; var8 < 5; ++var8) {
			var9 = var1.method8326();
			if (var9 < 0 || var9 >= class398.field4553[var8].length) {
				var9 = 0;
			}

			var26[var8] = var9;
		}

		super.field953 = var1.method8328();
		if (super.field953 == 65535) {
			super.field953 = -1;
		}

		super.field958 = var1.method8328();
		if (65535 == super.field958) {
			super.field958 = -1;
		}

		super.field1020 = super.field958;
		super.field956 = var1.method8328();
		if (super.field956 == 65535) {
			super.field956 = -1;
		}

		super.field1017 = var1.method8328();
		if (65535 == super.field1017) {
			super.field1017 = -1;
		}

		super.field974 = var1.method8328();
		if (65535 == super.field974) {
			super.field974 = -1;
		}

		super.field959 = var1.method8328();
		if (65535 == super.field959) {
			super.field959 = -1;
		}

		super.field950 = var1.method8328();
		if (65535 == super.field950) {
			super.field950 = -1;
		}

		this.field840 = new class483(var1.method8335(), class54.field404);
		this.method1904();
		this.method1913();
		this.method1910();
		if (class142.field1370 == this) {
			class490.field5053 = this.field840.method8771();
		}

		this.field831 = var1.method8326();
		this.field832 = var1.method8328();
		this.field846 = var1.method8326() == 1;
		if (0 == client.field1690 && client.field1950 >= 2) {
			this.field846 = false;
		}

		class180[] var27 = null;
		boolean var28 = false;
		var10 = var1.method8328();
		var28 = (var10 >> 15 & 1) == 1;
		int var11;
		if (var10 > 0 && var10 != 32768) {
			var27 = new class180[12];

			for (var11 = 0; var11 < 12; ++var11) {
				int var12 = var10 >> 12 - var11 & 1;
				if (var12 == 1) {
					int var16 = var6[var11] - 512;
					int var17 = var1.method8326();
					boolean var18 = (var17 & 1) != 0;
					boolean var19 = 0 != (var17 & 2);
					class180 var20 = new class180(var16);
					int var21;
					int[] var22;
					boolean var23;
					int var24;
					short var25;
					if (var18) {
						var21 = var1.method8326();
						var22 = new int[]{var21 & 15, var21 >> 4 & 15};
						var23 = null != var20.field1673 && var20.field1673.length == var22.length;

						for (var24 = 0; var24 < 2; ++var24) {
							if (var22[var24] != 15) {
								var25 = (short)var1.method8328();
								if (var23) {
									var20.field1673[var22[var24]] = var25;
								}
							}
						}
					}

					if (var19) {
						var21 = var1.method8326();
						var22 = new int[]{var21 & 15, var21 >> 4 & 15};
						var23 = null != var20.field1674 && var20.field1674.length == var22.length;

						for (var24 = 0; var24 < 2; ++var24) {
							if (15 != var22[var24]) {
								var25 = (short)var1.method8328();
								if (var23) {
									var20.field1674[var22[var24]] = var25;
								}
							}
						}
					}

					var27[var11] = var20;
				}
			}
		}

		for (var11 = 0; var11 < 3; ++var11) {
			this.field850[var11] = var1.method8335();
		}

		if (client.field1697 > 208) {
			var4 = var1.method8326();
		}

		if (this.field827 == null) {
			this.field827 = new class301();
		}

		this.field827.method6061(var6, var27, var28, var26, var3, var5, var4);
	}

	public static int method1936(int var0) {
		int var2 = 0;
		if (var0 < 0 || var0 >= 65536) {
			var0 >>>= 16;
			var2 += 16;
		}

		if (var0 >= 256) {
			var0 >>>= 8;
			var2 += 8;
		}

		if (var0 >= 16) {
			var0 >>>= 4;
			var2 += 4;
		}

		if (var0 >= 4) {
			var0 >>>= 2;
			var2 += 2;
		}

		if (var0 >= 1) {
			var0 >>>= 1;
			++var2;
		}

		return var2 + var0;
	}

	boolean method1902() {
		if (class398.field4550 == this.field849) {
			this.method1905();
		}

		return class398.field4551 == this.field849;
	}

	void method1904() {
		this.field849 = class398.field4550;
	}

	void method1905() {
		this.field849 = class405.field4602.method1155(this.field840) ? class398.field4551 : class398.field4552;
	}

	boolean method1942() {
		if (this.field843 == class398.field4550) {
			this.method1908();
		}

		return this.field843 == class398.field4551;
	}

	void method1913() {
		this.field843 = class398.field4550;
	}

	void method1908() {
		this.field843 = null != class267.field3147 && class267.field3147.method7293(this.field840) ? class398.field4551 : class398.field4552;
	}

	void method1909() {
		for (int var2 = 0; var2 < 4; ++var2) {
			if (client.field1935[var2] != null && client.field1935[var2].method2569(this.field840.method8771()) != -1 && var2 != 2) {
				this.field845 = class398.field4551;
				return;
			}
		}

		this.field845 = class398.field4552;
	}

	void method1910() {
		this.field845 = class398.field4550;
	}

	boolean method1911() {
		if (class398.field4550 == this.field845) {
			this.method1909();
		}

		return class398.field4551 == this.field845;
	}

	int method1917() {
		return this.field827 != null && this.field827.field3641 != -1 ? class119.method2293(this.field827.field3641).field2388 : 1;
	}

	protected final class216 method4625() {
		if (null == this.field827) {
			return null;
		} else {
			class183 var2 = -1 != super.field989 && 0 == super.field992 ? class214.method4351(super.field989) : null;
			class183 var3 = -1 != super.field985 && !this.field844 && (super.field953 != super.field985 || null == var2) ? class214.method4351(super.field985) : null;
			class216 var4 = this.field827.method6043(var2, super.field980, var3, super.field986);
			if (var4 == null) {
				return null;
			} else {
				var4.method4412();
				super.field1007 = var4.field2740;
				int var5 = var4.field2607;
				class216 var6;
				class216[] var7;
				if (!this.field844 && -1 != super.field994 && -1 != super.field995) {
					var6 = class146.method2640(super.field994).method3896(super.field995);
					if (var6 != null) {
						var6.method4408(0, -super.field1016, 0);
						var7 = new class216[]{var4, var6};
						var4 = new class216(var7, 2);
					}
				}

				if (!this.field844 && null != this.field839) {
					if (client.field1700 >= this.field835) {
						this.field839 = null;
					}

					if (client.field1700 >= this.field851 && client.field1700 < this.field835) {
						var6 = this.field839;
						var6.method4408(this.field836 - super.field1012, this.field826 - this.field834, this.field842 - super.field948);
						if (512 == super.field1014) {
							var6.method4397();
							var6.method4397();
							var6.method4397();
						} else if (super.field1014 == 1024) {
							var6.method4397();
							var6.method4397();
						} else if (super.field1014 == 1536) {
							var6.method4397();
						}

						var7 = new class216[]{var4, var6};
						var4 = new class216(var7, 2);
						if (super.field1014 == 512) {
							var6.method4397();
						} else if (super.field1014 == 1024) {
							var6.method4397();
							var6.method4397();
						} else if (super.field1014 == 1536) {
							var6.method4397();
							var6.method4397();
							var6.method4397();
						}

						var6.method4408(super.field1012 - this.field836, this.field834 - this.field826, super.field948 - this.field842);
					}
				}

				var4.field2589 = true;
				if (super.field1013 != 0 && client.field1700 >= super.field1008 && client.field1700 < super.field970) {
					var4.field2628 = super.field1010;
					var4.field2629 = super.field990;
					var4.field2630 = super.field1002;
					var4.field2570 = super.field1013;
					var4.field2632 = (short)var5;
				} else {
					var4.field2570 = 0;
				}

				return var4;
			}
		}
	}

	final void method1914(int var1, int var2, class201 var3) {
		if (-1 != super.field989 && class214.method4351(super.field989).field1999 == 1) {
			super.field989 = -1;
		}

		super.field960 = -1;
		if (var1 >= 0 && var1 < 104 && var2 >= 0 && var2 < 104) {
			if (super.field973[0] >= 0 && super.field973[0] < 104 && super.field1021[0] >= 0 && super.field1021[0] < 104) {
				if (class201.field2311 == var3) {
					class88 var5 = this;
					class201 var6 = class201.field2311;
					int var7 = super.field973[0];
					int var8 = super.field1021[0];
					int var9 = this.method1917();
					if (var7 >= var9 && var7 < 104 - var9 && var8 >= var9 && var8 < 104 - var9 && var1 >= var9 && var1 < 104 - var9 && var2 >= var9 && var2 < 104 - var9) {
						int var10 = class182.method3009(var7, var8, this.method1917(), client.method4631(var1, var2), client.field1758[this.field847], true, client.field1988, client.field1967);
						if (var10 >= 1) {
							for (int var11 = 0; var11 < var10 - 1; ++var11) {
								var5.method1916(client.field1988[var11], client.field1967[var11], var6);
							}
						}
					}
				}

				this.method1916(var1, var2, var3);
			} else {
				this.method1915(var1, var2);
			}
		} else {
			this.method1915(var1, var2);
		}

	}

	void method1915(int var1, int var2) {
		super.field947 = 0;
		super.field1022 = 0;
		super.field1009 = 0;
		super.field973[0] = var1;
		super.field1021[0] = var2;
		int var4 = this.method1917();
		super.field1012 = 128 * super.field973[0] + var4 * 64;
		super.field948 = var4 * 64 + super.field1021[0] * 128;
	}

	final void method1916(int var1, int var2, class201 var3) {
		if (super.field947 < 9) {
			++super.field947;
		}

		for (int var5 = super.field947; var5 > 0; --var5) {
			super.field973[var5] = super.field973[var5 - 1];
			super.field1021[var5] = super.field1021[var5 - 1];
			super.field1001[var5] = super.field1001[var5 - 1];
		}

		super.field973[0] = var1;
		super.field1021[0] = var2;
		super.field1001[0] = var3;
	}

	final boolean method2043() {
		return this.field827 != null;
	}

	static int method1950(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.ISMENUOPEN) {
			class69.field579[++class94.field920 - 1] = client.method3643() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	static void method1944(class290 var0, int var1, int var2, boolean var3) {
		int var5 = var0.field3414;
		int var6 = var0.field3474;
		if (0 == var0.field3405) {
			var0.field3414 = var0.field3410;
		} else if (1 == var0.field3405) {
			var0.field3414 = var1 - var0.field3410;
		} else if (2 == var0.field3405) {
			var0.field3414 = var0.field3410 * var1 >> 14;
		}

		if (var0.field3407 == 0) {
			var0.field3474 = var0.field3429;
		} else if (1 == var0.field3407) {
			var0.field3474 = var2 - var0.field3429;
		} else if (2 == var0.field3407) {
			var0.field3474 = var0.field3429 * var2 >> 14;
		}

		if (4 == var0.field3405) {
			var0.field3414 = var0.field3474 * var0.field3519 / var0.field3417;
		}

		if (var0.field3407 == 4) {
			var0.field3474 = var0.field3417 * var0.field3414 / var0.field3519;
		}

		if (1337 == var0.field3500) {
			client.field1951 = var0;
		}

		if (12 == var0.field3536) {
			var0.method5510().method5685(var0.field3414, var0.field3474);
		}

		if (var3 && null != var0.field3525 && (var5 != var0.field3414 || var6 != var0.field3474)) {
			class80 var7 = new class80();
			var7.field733 = var0;
			var7.field735 = var0.field3525;
			client.field1764.method6572(var7);
		}

	}

	static final void method1907(class290 var0, int var1, int var2, int var3) {
		client.method3406();
		class308 var5 = var0.method5508(false);
		if (var5 != null) {
			class478.method8672(var1, var2, var1 + var5.field3679, var2 + var5.field3680);
			if (client.field1765 != 2 && client.field1765 != 5) {
				int var6 = client.field1770 & 2047;
				int var7 = 48 + class142.field1370.field1012 / 32;
				int var8 = 464 - class142.field1370.field948 / 32;
				class224.field2727.method8861(var1, var2, var5.field3679, var5.field3680, var7, var8, var6, 256, var5.field3681, var5.field3678);

				int var9;
				int var10;
				int var11;
				for (var9 = 0; var9 < client.field1938; ++var9) {
					var10 = client.field1939[var9] * 4 + 2 - class142.field1370.field1012 / 32;
					var11 = 4 * client.field1940[var9] + 2 - class142.field1370.field948 / 32;
					class263.method5260(var1, var2, var10, var11, client.field1941[var9], var5);
				}

				int var12;
				int var13;
				for (var9 = 0; var9 < 104; ++var9) {
					for (var10 = 0; var10 < 104; ++var10) {
						class355 var15 = client.field1829[class384.field4486][var9][var10];
						if (var15 != null) {
							var12 = var9 * 4 + 2 - class142.field1370.field1012 / 32;
							var13 = var10 * 4 + 2 - class142.field1370.field948 / 32;
							class263.method5260(var1, var2, var12, var13, class267.field3150[0], var5);
						}
					}
				}

				for (var9 = 0; var9 < client.field1744; ++var9) {
					class85 var16 = client.field1934[client.field1900[var9]];
					if (var16 != null && var16.method2043()) {
						class208 var18 = var16.field790;
						if (null != var18 && var18.field2412 != null) {
							var18 = var18.method4083();
						}

						if (null != var18 && var18.field2404 && var18.field2415) {
							var12 = var16.field1012 / 32 - class142.field1370.field1012 / 32;
							var13 = var16.field948 / 32 - class142.field1370.field948 / 32;
							class263.method5260(var1, var2, var12, var13, class267.field3150[1], var5);
						}
					}
				}

				var9 = class87.field818;
				int[] var19 = class87.field817;

				for (var11 = 0; var11 < var9; ++var11) {
					class88 var17 = client.field1816[var19[var11]];
					if (var17 != null && var17.method2043() && !var17.field846 && var17 != class142.field1370) {
						var13 = var17.field1012 / 32 - class142.field1370.field1012 / 32;
						int var14 = var17.field948 / 32 - class142.field1370.field948 / 32;
						if (var17.method1902()) {
							class263.method5260(var1, var2, var13, var14, class267.field3150[3], var5);
						} else if (class142.field1370.field830 != 0 && 0 != var17.field830 && class142.field1370.field830 == var17.field830) {
							class263.method5260(var1, var2, var13, var14, class267.field3150[4], var5);
						} else if (var17.method1942()) {
							class263.method5260(var1, var2, var13, var14, class267.field3150[5], var5);
						} else if (var17.method1911()) {
							class263.method5260(var1, var2, var13, var14, class267.field3150[6], var5);
						} else {
							class263.method5260(var1, var2, var13, var14, class267.field3150[2], var5);
						}
					}
				}

				if (0 != client.field1707 && client.field1700 % 20 < 10) {
					if (client.field1707 == 1 && client.field1708 >= 0 && client.field1708 < client.field1934.length) {
						class85 var20 = client.field1934[client.field1708];
						if (null != var20) {
							var12 = var20.field1012 / 32 - class142.field1370.field1012 / 32;
							var13 = var20.field948 / 32 - class142.field1370.field948 / 32;
							class40.method537(var1, var2, var12, var13, class132.field1306[1], var5);
						}
					}

					if (2 == client.field1707) {
						var11 = 2 + (client.field1710 * 4 - class151.field1447 * 4) - class142.field1370.field1012 / 32;
						var12 = 2 + (client.field1751 * 4 - class388.field4509 * 4) - class142.field1370.field948 / 32;
						class40.method537(var1, var2, var11, var12, class132.field1306[1], var5);
					}

					if (10 == client.field1707 && client.field1776 >= 0 && client.field1776 < client.field1816.length) {
						class88 var21 = client.field1816[client.field1776];
						if (var21 != null) {
							var12 = var21.field1012 / 32 - class142.field1370.field1012 / 32;
							var13 = var21.field948 / 32 - class142.field1370.field948 / 32;
							class40.method537(var1, var2, var12, var13, class132.field1306[1], var5);
						}
					}
				}

				if (0 != client.field1942) {
					var11 = 2 + client.field1942 * 4 - class142.field1370.field1012 / 32;
					var12 = 2 + client.field1688 * 4 - class142.field1370.field948 / 32;
					class263.method5260(var1, var2, var11, var12, class132.field1306[0], var5);
				}

				if (!class142.field1370.field846) {
					class478.method8680(var5.field3679 / 2 + var1 - 1, var2 + var5.field3680 / 2 - 1, 3, 3, 16777215);
				}
			} else {
				class478.method8692(var1, var2, 0, var5.field3681, var5.field3678);
			}

			client.field1914[var3] = true;
		}
	}
}
