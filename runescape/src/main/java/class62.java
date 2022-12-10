import java.lang.management.GarbageCollectorMXBean;

public final class class62 extends class226 {
	static GarbageCollectorMXBean field505;
	boolean field489;
	class183 field502;
	double field484;
	double field488;
	double field492;
	double field493;
	double field495;
	double field496;
	double field498;
	double field499;
	int field480;
	int field481;
	int field482;
	int field483;
	int field485;
	int field486;
	int field487;
	int field490;
	int field491;
	int field494;
	int field497;
	int field500;
	int field501;
	int field503;
	int field504;

	class62(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		this.field489 = false;
		this.field486 = 0;
		this.field504 = 0;
		this.field494 = var1;
		this.field503 = var2;
		this.field482 = var3;
		this.field483 = var4;
		this.field485 = var5;
		this.field491 = var6;
		this.field487 = var7;
		this.field497 = var8;
		this.field480 = var9;
		this.field490 = var10;
		this.field481 = var11;
		this.field489 = false;
		int var12 = class146.method2640(this.field494).field2238;
		if (var12 != -1) {
			this.field502 = class214.method4351(var12);
		} else {
			this.field502 = null;
		}

	}

	final void method1185(int var1, int var2, int var3, int var4) {
		double var6;
		if (!this.field489) {
			var6 = (double)(var1 - this.field482);
			double var8 = (double)(var2 - this.field483);
			double var10 = Math.sqrt(var8 * var8 + var6 * var6);
			this.field492 = (double)this.field482 + var6 * (double)this.field480 / var10;
			this.field493 = (double)this.field483 + (double)this.field480 * var8 / var10;
			this.field488 = (double)this.field485;
		}

		var6 = (double)(this.field487 + 1 - var4);
		this.field495 = ((double)var1 - this.field492) / var6;
		this.field496 = ((double)var2 - this.field493) / var6;
		this.field484 = Math.sqrt(this.field496 * this.field496 + this.field495 * this.field495);
		if (!this.field489) {
			this.field498 = -this.field484 * Math.tan((double)this.field497 * 0.02454369D);
		}

		this.field499 = 2.0D * ((double)var3 - this.field488 - var6 * this.field498) / (var6 * var6);
	}

	public static int method1192(int var0) {
		return class215.method4664(class215.field2552[var0]);
	}

	final void method1186(int var1) {
		this.field489 = true;
		this.field492 += (double)var1 * this.field495;
		this.field493 += (double)var1 * this.field496;
		this.field488 += (double)var1 * this.field498 + (double)var1 * this.field499 * 0.5D * (double)var1;
		this.field498 += (double)var1 * this.field499;
		this.field500 = (int)(Math.atan2(this.field495, this.field496) * 325.949D) + 1024 & 2047;
		this.field501 = (int)(Math.atan2(this.field498, this.field484) * 325.949D) & 2047;
		if (null != this.field502) {
			if (!this.field502.method3505()) {
				this.field504 += var1;

				while (true) {
					do {
						do {
							if (this.field504 <= this.field502.field2003[this.field486]) {
								return;
							}

							this.field504 -= this.field502.field2003[this.field486];
							++this.field486;
						} while(this.field486 < this.field502.field2009.length);

						this.field486 -= this.field502.field2012;
					} while(this.field486 >= 0 && this.field486 < this.field502.field2009.length);

					this.field486 = 0;
				}
			} else {
				this.field486 += var1;
				int var3 = this.field502.method3509();
				if (this.field486 >= var3) {
					this.field486 = var3 - this.field502.field2012;
				}
			}
		}

	}

	protected final class216 method4625() {
		class199 var2 = class146.method2640(this.field494);
		class216 var3 = var2.method3896(this.field486);
		if (var3 == null) {
			return null;
		} else {
			var3.method4441(this.field501);
			return var3;
		}
	}

	public static class469 method1193(class337 var0, String var1, String var2) {
		int var4 = var0.method6319(var1);
		int var5 = var0.method6326(var4, var2);
		byte[] var8 = var0.method6374(var4, var5);
		boolean var7;
		if (var8 == null) {
			var7 = false;
		} else {
			class165.method2776(var8);
			var7 = true;
		}

		class469 var6;
		if (!var7) {
			var6 = null;
		} else {
			class469 var9 = new class469();
			var9.field4926 = class336.field4226;
			var9.field4929 = class477.field5007;
			var9.field4924 = class477.field5009[0];
			var9.field4927 = class392.field4524[0];
			var9.field4928 = class7.field44[0];
			var9.field4925 = class186.field2042[0];
			var9.field4923 = class271.field3171;
			var9.field4922 = class227.field2749[0];
			class477.field5009 = null;
			class392.field4524 = null;
			class7.field44 = null;
			class186.field2042 = null;
			class271.field3171 = null;
			class227.field2749 = (byte[][])null;
			var6 = var9;
		}

		return var6;
	}

	static final void method1191(int var0, int var1, int var2, int var3) {
		++client.field1798;
		class362.method6744();
		class110.method2183();
		if (client.field1828 >= 0 && null != client.field1816[client.field1828]) {
			class246.method4885(client.field1816[client.field1828], false);
		}

		class25.method348(true);
		class267.method5273();
		class25.method348(false);
		class47.method919();

		for (class66 var5 = (class66)client.field1821.method6577(); var5 != null; var5 = (class66)client.field1821.method6579()) {
			if (var5.field538 == class384.field4486 && !var5.field540) {
				if (client.field1700 >= var5.field537) {
					var5.method1230(client.field1745);
					if (var5.field540) {
						var5.method7951();
					} else {
						class33.field194.method4261(var5.field538, var5.field539, var5.field545, var5.field541, 60, var5, 0, -1L, false);
					}
				}
			} else {
				var5.method7951();
			}
		}

		class133.method2479(var0, var1, var2, var3, true);
		var0 = client.field1841;
		var1 = client.field1969;
		var2 = client.field1970;
		var3 = client.field1869;
		class478.method8672(var0, var1, var2 + var0, var1 + var3);
		class221.method4530();
		int var36 = client.field1769;
		if (client.field1786 / 256 > var36) {
			var36 = client.field1786 / 256;
		}

		if (client.field1955[4] && 128 + client.field1957[4] > var36) {
			var36 = client.field1957[4] + 128;
		}

		int var6 = client.field1770 & 2047;
		int var7 = class39.field236;
		int var8 = class76.field695;
		int var9 = class14.field83;
		int var10 = 600 + var36 * 3;
		int var13 = var3 - 334;
		if (var13 < 0) {
			var13 = 0;
		} else if (var13 > 100) {
			var13 = 100;
		}

		int var14 = (client.field1854 - client.field1962) * var13 / 100 + client.field1962;
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
			var18 = class221.field2667[var13];
			var19 = class221.field2690[var13];
			var20 = var19 * var16 - var12 * var18 >> 16;
			var17 = var18 * var16 + var19 * var12 >> 16;
			var16 = var20;
		}

		if (var14 != 0) {
			var18 = class221.field2667[var14];
			var19 = class221.field2690[var14];
			var20 = var17 * var18 + var15 * var19 >> 16;
			var17 = var19 * var17 - var18 * var15 >> 16;
			var15 = var20;
		}

		if (client.field1953) {
			class89.field857 = var7 - var15;
			class209.field2430 = var8 - var16;
			class285.field3338 = var9 - var17;
			class208.field2421 = var36;
			class82.field757 = var6;
		} else {
			class141.field1363 = var7 - var15;
			class392.field4523 = var8 - var16;
			class170.field1608 = var9 - var17;
			class79.field730 = var36;
			class113.field1145 = var6;
		}

		if (1 == client.field1775 && client.field1950 >= 2 && 0 == client.field1700 % 50 && (class142.field1370.field1012 >> 7 != class39.field236 >> 7 || class14.field83 >> 7 != class142.field1370.field948 >> 7)) {
			var18 = class142.field1370.field847;
			var19 = (class39.field236 >> 7) + class151.field1447;
			var20 = class388.field4509 + (class14.field83 >> 7);
			class284 var21 = class152.method2679(class276.field3265, client.field1748.field1105);
			var21.field3321.method8383(var20);
			var21.field3321.method8354(var18);
			var21.field3321.method8364(var19);
			var21.field3321.method8377(client.field1971);
			client.field1748.method2173(var21);
		}

		if (!client.field1953) {
			var12 = class167.method2861();
		} else {
			var12 = class54.method1053();
		}

		var13 = class141.field1363;
		var14 = class392.field4523;
		var15 = class170.field1608;
		var16 = class79.field730;
		var17 = class113.field1145;

		for (var18 = 0; var18 < 5; ++var18) {
			if (client.field1955[var18]) {
				var19 = (int)(Math.random() * (double)(2 * client.field1985[var18] + 1) - (double)client.field1985[var18] + Math.sin((double)client.field1799[var18] * ((double)client.field1958[var18] / 100.0D)) * (double)client.field1957[var18]);
				if (var18 == 0) {
					class141.field1363 += var19;
				}

				if (var18 == 1) {
					class392.field4523 += var19;
				}

				if (var18 == 2) {
					class170.field1608 += var19;
				}

				if (var18 == 3) {
					class113.field1145 = class113.field1145 + var19 & 2047;
				}

				if (var18 == 4) {
					class79.field730 += var19;
					if (class79.field730 < 128) {
						class79.field730 = 128;
					}

					if (class79.field730 > 383) {
						class79.field730 = 383;
					}
				}
			}
		}

		var18 = class28.field158;
		var19 = class28.field153;
		if (class28.field165 != 0) {
			var18 = class28.field166;
			var19 = class28.field162;
		}

		if (var18 >= var0 && var18 < var2 + var0 && var19 >= var1 && var19 < var3 + var1) {
			var20 = var18 - var0;
			int var37 = var19 - var1;
			class215.field2545 = var20;
			class215.field2554 = var37;
			class215.field2546 = true;
			class215.field2555 = 0;
			class215.field2547 = false;
		} else {
			class215.method284();
		}

		client.method3406();
		class478.method8680(var0, var1, var2, var3, 0);
		client.method3406();
		var20 = class221.field2675;
		class221.field2675 = client.field1972;
		class33.field194.method4193(class141.field1363, class392.field4523, class170.field1608, class79.field730, class113.field1145, var12);
		class221.field2675 = var20;
		client.method3406();
		class33.field194.method4166();
		client.field1943 = 0;
		boolean var41 = false;
		int var22 = -1;
		int var23 = -1;
		int var24 = class87.field818;
		int[] var25 = class87.field817;

		int var26;
		for (var26 = 0; var26 < client.field1744 + var24; ++var26) {
			Object var27;
			if (var26 < var24) {
				var27 = client.field1816[var25[var26]];
				if (client.field1828 == var25[var26]) {
					var41 = true;
					var22 = var26;
					continue;
				}

				if (class142.field1370 == var27) {
					var23 = var26;
					continue;
				}
			} else {
				var27 = client.field1934[client.field1900[var26 - var24]];
			}

			class113.method2185((class98)var27, var26, var0, var1, var2, var3);
		}

		if (client.field1727 && var23 != -1) {
			class113.method2185(class142.field1370, var23, var0, var1, var2, var3);
		}

		if (var41) {
			class113.method2185(client.field1816[client.field1828], var22, var0, var1, var2, var3);
		}

		for (var26 = 0; var26 < client.field1943; ++var26) {
			int var38 = client.field1789[var26];
			int var28 = client.field1790[var26];
			int var29 = client.field1976[var26];
			int var30 = client.field1791[var26];
			boolean var31 = true;

			while (var31) {
				var31 = false;

				for (int var32 = 0; var32 < var26; ++var32) {
					if (var28 + 2 > client.field1790[var32] - client.field1791[var32] && var28 - var30 < client.field1790[var32] + 2 && var38 - var29 < client.field1976[var32] + client.field1789[var32] && var29 + var38 > client.field1789[var32] - client.field1976[var32] && client.field1790[var32] - client.field1791[var32] < var28) {
						var28 = client.field1790[var32] - client.field1791[var32];
						var31 = true;
					}
				}
			}

			client.field1905 = client.field1789[var26];
			client.field1726 = client.field1790[var26] = var28;
			String var39 = client.field1787[var26];
			if (client.field1866 == 0) {
				int var33 = 16776960;
				if (client.field1793[var26] < 6) {
					var33 = client.field1923[client.field1793[var26]];
				}

				if (6 == client.field1793[var26]) {
					var33 = client.field1798 % 20 < 10 ? 16711680 : 16776960;
				}

				if (7 == client.field1793[var26]) {
					var33 = client.field1798 % 20 < 10 ? 255 : '\uffff';
				}

				if (client.field1793[var26] == 8) {
					var33 = client.field1798 % 20 < 10 ? '\ub000' : 8454016;
				}

				int var34;
				if (client.field1793[var26] == 9) {
					var34 = 150 - client.field1884[var26];
					if (var34 < 50) {
						var33 = var34 * 1280 + 16711680;
					} else if (var34 < 100) {
						var33 = 16776960 - 327680 * (var34 - 50);
					} else if (var34 < 150) {
						var33 = 65280 + (var34 - 100) * 5;
					}
				}

				if (10 == client.field1793[var26]) {
					var34 = 150 - client.field1884[var26];
					if (var34 < 50) {
						var33 = var34 * 5 + 16711680;
					} else if (var34 < 100) {
						var33 = 16711935 - 327680 * (var34 - 50);
					} else if (var34 < 150) {
						var33 = 255 + (var34 - 100) * 327680 - (var34 - 100) * 5;
					}
				}

				if (11 == client.field1793[var26]) {
					var34 = 150 - client.field1884[var26];
					if (var34 < 50) {
						var33 = 16777215 - var34 * 327685;
					} else if (var34 < 100) {
						var33 = 327685 * (var34 - 50) + 65280;
					} else if (var34 < 150) {
						var33 = 16777215 - (var34 - 100) * 327680;
					}
				}

				if (0 == client.field1794[var26]) {
					class140.field1352.method6857(var39, client.field1905 + var0, var1 + client.field1726, var33, 0);
				}

				if (client.field1794[var26] == 1) {
					class140.field1352.method6849(var39, client.field1905 + var0, client.field1726 + var1, var33, 0, client.field1798);
				}

				if (client.field1794[var26] == 2) {
					class140.field1352.method6927(var39, var0 + client.field1905, var1 + client.field1726, var33, 0, client.field1798);
				}

				if (client.field1794[var26] == 3) {
					class140.field1352.method6900(var39, client.field1905 + var0, var1 + client.field1726, var33, 0, client.field1798, 150 - client.field1884[var26]);
				}

				if (client.field1794[var26] == 4) {
					var34 = (150 - client.field1884[var26]) * (class140.field1352.method6901(var39) + 100) / 150;
					class478.method8673(var0 + client.field1905 - 50, var1, client.field1905 + var0 + 50, var1 + var3);
					class140.field1352.method6854(var39, 50 + client.field1905 + var0 - var34, client.field1726 + var1, var33, 0);
					class478.method8672(var0, var1, var2 + var0, var1 + var3);
				}

				if (client.field1794[var26] == 5) {
					var34 = 150 - client.field1884[var26];
					int var35 = 0;
					if (var34 < 25) {
						var35 = var34 - 25;
					} else if (var34 > 125) {
						var35 = var34 - 125;
					}

					class478.method8673(var0, var1 + client.field1726 - class140.field1352.field4392 - 1, var0 + var2, client.field1726 + var1 + 5);
					class140.field1352.method6857(var39, var0 + client.field1905, var35 + client.field1726 + var1, var33, 0);
					class478.method8672(var0, var1, var2 + var0, var1 + var3);
				}
			} else {
				class140.field1352.method6857(var39, client.field1905 + var0, client.field1726 + var1, 16776960, 0);
			}
		}

		class189.method3626(var0, var1);
		((class228)class221.field2672).method4655(client.field1745);
		class205.method4062();
		class141.field1363 = var13;
		class392.field4523 = var14;
		class170.field1608 = var15;
		class79.field730 = var16;
		class113.field1145 = var17;
		if (client.field1699) {
			byte var40 = 0;
			var22 = var40 + class334.field4200 + class334.field4202;
			if (var22 == 0) {
				client.field1699 = false;
			}
		}

		if (client.field1699) {
			class478.method8680(var0, var1, var2, var3, 0);
			class49.method940(class321.field3886, false);
		}

	}
}
