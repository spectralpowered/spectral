public class class212 extends class248 {
	class212() {
	}

	void method4332(class467 var1) {
		int var3 = var1.method8326();
		if (var3 != class256.field2994.field2995) {
			throw new IllegalStateException("");
		} else {
			super.field2931 = var1.method8326();
			super.field2924 = var1.method8326();
			super.field2923 = var1.method8328();
			super.field2920 = var1.method8328();
			super.field2921 = var1.method8328();
			super.field2927 = var1.method8328();
			super.field2919 = var1.method8344();
			super.field2926 = var1.method8344();
		}
	}

	void method4902(class467 var1) {
		super.field2924 = Math.min(super.field2924, 4);
		super.field2928 = new short[1][64][64];
		super.field2922 = new short[super.field2924][64][64];
		super.field2929 = new byte[super.field2924][64][64];
		super.field2930 = new byte[super.field2924][64][64];
		super.field2925 = new class260[super.field2924][64][64][];
		int var3 = var1.method8326();
		if (class253.field2960.field2962 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method8326();
			int var5 = var1.method8326();
			if (super.field2921 == var4 && super.field2927 == var5) {
				for (int var6 = 0; var6 < 64; ++var6) {
					for (int var7 = 0; var7 < 64; ++var7) {
						this.method4899(var6, var7, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class212)) {
			return false;
		} else {
			class212 var2 = (class212)var1;
			return super.field2921 == var2.field2921 && var2.field2927 == super.field2927;
		}
	}

	public int hashCode() {
		return super.field2921 | super.field2927 << 8;
	}

	static final void method4343(int var0, int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8) {
		if (var2 >= 2000) {
			var2 -= 2000;
		}

		class284 var10;
		if (var2 == 3) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3262, client.field1748.field1105);
			var10.field3321.method8323(client.field1929.method3567(82) ? 1 : 0);
			var10.field3321.method8365(var0 + class151.field1447);
			var10.field3321.method8364(var1 + class388.field4509);
			var10.field3321.method8310(var3);
			client.field1748.method2173(var10);
		}

		if (var2 == 43) {
			var10 = class152.method2679(class276.field3256, client.field1748.field1105);
			var10.field3321.method8310(var4);
			var10.field3321.method8364(var0);
			var10.field3321.method8375(var1);
			client.field1748.method2173(var10);
			client.field1806 = 0;
			class293.field3565 = class180.method2988(var1);
			client.field1807 = var0;
		}

		if (var2 == 34) {
			var10 = class152.method2679(class276.field3246, client.field1748.field1105);
			var10.field3321.method8365(var4);
			var10.field3321.method8375(var1);
			var10.field3321.method8383(var0);
			client.field1748.method2173(var10);
			client.field1806 = 0;
			class293.field3565 = class180.method2988(var1);
			client.field1807 = var0;
		}

		class284 var11;
		class88 var15;
		if (var2 == 47) {
			var15 = client.field1816[var3];
			if (var15 != null) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3192, client.field1748.field1105);
				var11.field3321.method8310(var3);
				var11.field3321.method8356(client.field1929.method3567(82) ? 1 : 0);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 17) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3209, client.field1748.field1105);
			var10.field3321.method8310(class388.field4509 + var1);
			var10.field3321.method8310(client.field1858);
			var10.field3321.method8377(class363.field4352);
			var10.field3321.method8365(class151.field1447 + var0);
			var10.field3321.method8310(var3);
			var10.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
			var10.field3321.method8310(client.field1859);
			client.field1748.method2173(var10);
		}

		if (var2 == 31) {
			var10 = class152.method2679(class276.field3276, client.field1748.field1105);
			var10.field3321.method8377(var1);
			var10.field3321.method8375(class356.field4318);
			var10.field3321.method8310(var4);
			var10.field3321.method8383(class82.field755);
			var10.field3321.method8383(var0);
			var10.field3321.method8310(class99.field1027);
			client.field1748.method2173(var10);
			client.field1806 = 0;
			class293.field3565 = class180.method2988(var1);
			client.field1807 = var0;
		}

		class85 var17;
		if (var2 == 7) {
			var17 = client.field1934[var3];
			if (var17 != null) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3227, client.field1748.field1105);
				var11.field3321.method8376(class356.field4318);
				var11.field3321.method8356(client.field1929.method3567(82) ? 1 : 0);
				var11.field3321.method8365(var3);
				var11.field3321.method8364(class82.field755);
				var11.field3321.method8364(class99.field1027);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 21) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3257, client.field1748.field1105);
			var10.field3321.method8364(var0 + class151.field1447);
			var10.field3321.method8356(client.field1929.method3567(82) ? 1 : 0);
			var10.field3321.method8310(class388.field4509 + var1);
			var10.field3321.method8310(var3);
			client.field1748.method2173(var10);
		}

		class290 var18;
		if (var2 == 58) {
			var18 = class104.method2089(var1, var0);
			if (null != var18) {
				if (null != var18.field3512) {
					class80 var16 = new class80();
					var16.field733 = var18;
					var16.field736 = var3;
					var16.field740 = var6;
					var16.field735 = var18.field3512;
					class69.method2874(var16);
				}

				var11 = class152.method2679(class276.field3298, client.field1748.field1105);
				var11.field3321.method8383(client.field1859);
				var11.field3321.method8312(var1);
				var11.field3321.method8377(class363.field4352);
				var11.field3321.method8365(client.field1858);
				var11.field3321.method8383(var0);
				var11.field3321.method8365(var4);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 51) {
			var15 = client.field1816[var3];
			if (null != var15) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3283, client.field1748.field1105);
				var11.field3321.method8365(var3);
				var11.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 1) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3214, client.field1748.field1105);
			var10.field3321.method8383(var3);
			var10.field3321.method8383(class388.field4509 + var1);
			var10.field3321.method8383(class82.field755);
			var10.field3321.method8364(class99.field1027);
			var10.field3321.method8375(class356.field4318);
			var10.field3321.method8364(var0 + class151.field1447);
			var10.field3321.method8323(client.field1929.method3567(82) ? 1 : 0);
			client.field1748.method2173(var10);
		}

		int var12;
		class290 var19;
		if (var2 == 28) {
			var10 = class152.method2679(class276.field3278, client.field1748.field1105);
			var10.field3321.method8312(var1);
			client.field1748.method2173(var10);
			var19 = class180.method2988(var1);
			if (null != var19 && var19.field3390 != null && var19.field3390[0][0] == 5) {
				var12 = var19.field3390[0][1];
				class305.field3661[var12] = 1 - class305.field3661[var12];
				class97.method2040(var12);
			}
		}

		if (var2 == 29) {
			var10 = class152.method2679(class276.field3278, client.field1748.field1105);
			var10.field3321.method8312(var1);
			client.field1748.method2173(var10);
			var19 = class180.method2988(var1);
			if (null != var19 && null != var19.field3390 && 5 == var19.field3390[0][0]) {
				var12 = var19.field3390[0][1];
				if (class305.field3661[var12] != var19.field3531[0]) {
					class305.field3661[var12] = var19.field3531[0];
					class97.method2040(var12);
				}
			}
		}

		if (var2 == 49) {
			var15 = client.field1816[var3];
			if (var15 != null) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3211, client.field1748.field1105);
				var11.field3321.method8356(client.field1929.method3567(82) ? 1 : 0);
				var11.field3321.method8310(var3);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 26) {
			class247.method4893();
		}

		if (var2 == 14) {
			var15 = client.field1816[var3];
			if (var15 != null) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3231, client.field1748.field1105);
				var11.field3321.method8356(client.field1929.method3567(82) ? 1 : 0);
				var11.field3321.method8377(class356.field4318);
				var11.field3321.method8365(class82.field755);
				var11.field3321.method8365(class99.field1027);
				var11.field3321.method8364(var3);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 1008 || var2 == 1009 || var2 == 1010 || var2 == 1011 || var2 == 1012) {
			class166.field1548.method7823(var2, var3, new class311(var0), new class311(var1));
		}

		if (var2 == 46) {
			var15 = client.field1816[var3];
			if (null != var15) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3239, client.field1748.field1105);
				var11.field3321.method8323(client.field1929.method3567(82) ? 1 : 0);
				var11.field3321.method8365(var3);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 39) {
			var10 = class152.method2679(class276.field3204, client.field1748.field1105);
			var10.field3321.method8312(var1);
			var10.field3321.method8364(var4);
			var10.field3321.method8365(var0);
			client.field1748.method2173(var10);
			client.field1806 = 0;
			class293.field3565 = class180.method2988(var1);
			client.field1807 = var0;
		}

		if (var2 == 37) {
			var10 = class152.method2679(class276.field3249, client.field1748.field1105);
			var10.field3321.method8377(var1);
			var10.field3321.method8310(var4);
			var10.field3321.method8364(var0);
			client.field1748.method2173(var10);
			client.field1806 = 0;
			class293.field3565 = class180.method2988(var1);
			client.field1807 = var0;
		}

		if (var2 == 41) {
			var10 = class152.method2679(class276.field3261, client.field1748.field1105);
			var10.field3321.method8376(var1);
			var10.field3321.method8365(var0);
			var10.field3321.method8364(var4);
			client.field1748.method2173(var10);
			client.field1806 = 0;
			class293.field3565 = class180.method2988(var1);
			client.field1807 = var0;
		}

		if (var2 == 16) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3206, client.field1748.field1105);
			var10.field3321.method8310(var3);
			var10.field3321.method8364(class388.field4509 + var1);
			var10.field3321.method8355(client.field1929.method3567(82) ? 1 : 0);
			var10.field3321.method8365(class82.field755);
			var10.field3321.method8312(class356.field4318);
			var10.field3321.method8365(class99.field1027);
			var10.field3321.method8364(var0 + class151.field1447);
			client.field1748.method2173(var10);
		}

		if (var2 == 18) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3255, client.field1748.field1105);
			var10.field3321.method8383(var1 + class388.field4509);
			var10.field3321.method8323(client.field1929.method3567(82) ? 1 : 0);
			var10.field3321.method8365(var3);
			var10.field3321.method8383(var0 + class151.field1447);
			client.field1748.method2173(var10);
		}

		if (var2 == 48) {
			var15 = client.field1816[var3];
			if (var15 != null) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3233, client.field1748.field1105);
				var11.field3321.method8383(var3);
				var11.field3321.method8356(client.field1929.method3567(82) ? 1 : 0);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 1001) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3264, client.field1748.field1105);
			var10.field3321.method8365(class388.field4509 + var1);
			var10.field3321.method8310(class151.field1447 + var0);
			var10.field3321.method8364(var3);
			var10.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
			client.field1748.method2173(var10);
		}

		if (var2 == 9) {
			var17 = client.field1934[var3];
			if (var17 != null) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3282, client.field1748.field1105);
				var11.field3321.method8383(var3);
				var11.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 4) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3245, client.field1748.field1105);
			var10.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
			var10.field3321.method8383(var3);
			var10.field3321.method8365(class388.field4509 + var1);
			var10.field3321.method8383(class151.field1447 + var0);
			client.field1748.method2173(var10);
		}

		if (var2 == 5) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3225, client.field1748.field1105);
			var10.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
			var10.field3321.method8365(class388.field4509 + var1);
			var10.field3321.method8364(var0 + class151.field1447);
			var10.field3321.method8364(var3);
			client.field1748.method2173(var10);
		}

		if (var2 == 15) {
			var15 = client.field1816[var3];
			if (var15 != null) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3241, client.field1748.field1105);
				var11.field3321.method8310(var3);
				var11.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
				var11.field3321.method8383(client.field1858);
				var11.field3321.method8312(class363.field4352);
				var11.field3321.method8365(client.field1859);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 35) {
			var10 = class152.method2679(class276.field3238, client.field1748.field1105);
			var10.field3321.method8312(var1);
			var10.field3321.method8364(var4);
			var10.field3321.method8364(var0);
			client.field1748.method2173(var10);
			client.field1806 = 0;
			class293.field3565 = class180.method2988(var1);
			client.field1807 = var0;
		}

		if (var2 == 6) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3216, client.field1748.field1105);
			var10.field3321.method8310(var3);
			var10.field3321.method8355(client.field1929.method3567(82) ? 1 : 0);
			var10.field3321.method8365(class388.field4509 + var1);
			var10.field3321.method8383(class151.field1447 + var0);
			client.field1748.method2173(var10);
		}

		if (var2 == 44) {
			var15 = client.field1816[var3];
			if (null != var15) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var11 = class152.method2679(class276.field3236, client.field1748.field1105);
				var11.field3321.method8323(client.field1929.method3567(82) ? 1 : 0);
				var11.field3321.method8310(var3);
				client.field1748.method2173(var11);
			}
		}

		if (var2 == 30 && client.field1868 == null) {
			client.method5352(var1, var0);
			client.field1868 = class104.method2089(var1, var0);
			class53.method1040(client.field1868);
		}

		if (var2 == 20) {
			client.field1763 = var7;
			client.field1696 = var8;
			client.field1804 = 2;
			client.field1782 = 0;
			client.field1942 = var0;
			client.field1688 = var1;
			var10 = class152.method2679(class276.field3207, client.field1748.field1105);
			var10.field3321.method8364(class151.field1447 + var0);
			var10.field3321.method8383(var3);
			var10.field3321.method8383(class388.field4509 + var1);
			var10.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
			client.field1748.method2173(var10);
		}

		if (var2 == 23) {
			if (client.field1837) {
				class33.field194.method4265();
			} else {
				class33.field194.method4210(class384.field4486, var0, var1, true);
			}
		}

		if (var2 == 57 || var2 == 1007) {
			var18 = class104.method2089(var1, var0);
			if (null != var18) {
				class219.method4528(var3, var1, var0, var4, var6);
			}
		}

		if (var2 == 38) {
			class290.method5644();
			var18 = class180.method2988(var1);
			client.field1855 = 1;
			class82.field755 = var0;
			class356.field4318 = var1;
			class99.field1027 = var4;
			class53.method1040(var18);
			client.field1952 = class79.method2039(16748608) + class208.method4105(var4).field2259 + class79.method2039(16777215);
			if (null == client.field1952) {
				client.field1952 = class321.field3756;
			}

		} else {
			if (var2 == 10) {
				var17 = client.field1934[var3];
				if (null != var17) {
					client.field1763 = var7;
					client.field1696 = var8;
					client.field1804 = 2;
					client.field1782 = 0;
					client.field1942 = var0;
					client.field1688 = var1;
					var11 = class152.method2679(class276.field3213, client.field1748.field1105);
					var11.field3321.method8365(var3);
					var11.field3321.method8323(client.field1929.method3567(82) ? 1 : 0);
					client.field1748.method2173(var11);
				}
			}

			if (var2 == 33) {
				var10 = class152.method2679(class276.field3240, client.field1748.field1105);
				var10.field3321.method8383(var0);
				var10.field3321.method8377(var1);
				var10.field3321.method8364(var4);
				client.field1748.method2173(var10);
				client.field1806 = 0;
				class293.field3565 = class180.method2988(var1);
				client.field1807 = var0;
			}

			if (var2 == 1005) {
				var18 = class180.method2988(var1);
				if (var18 != null && var18.field3438[var0] >= 100000) {
					class105.method2785(27, "", var18.field3438[var0] + " x " + class208.method4105(var4).field2259);
				} else {
					var11 = class152.method2679(class276.field3272, client.field1748.field1105);
					var11.field3321.method8365(var4);
					client.field1748.method2173(var11);
				}

				client.field1806 = 0;
				class293.field3565 = class180.method2988(var1);
				client.field1807 = var0;
			}

			if (var2 == 36) {
				var10 = class152.method2679(class276.field3267, client.field1748.field1105);
				var10.field3321.method8377(var1);
				var10.field3321.method8310(var0);
				var10.field3321.method8365(var4);
				client.field1748.method2173(var10);
				client.field1806 = 0;
				class293.field3565 = class180.method2988(var1);
				client.field1807 = var0;
			}

			if (var2 == 32) {
				var10 = class152.method2679(class276.field3194, client.field1748.field1105);
				var10.field3321.method8383(client.field1858);
				var10.field3321.method8365(var4);
				var10.field3321.method8376(class363.field4352);
				var10.field3321.method8365(var0);
				var10.field3321.method8375(var1);
				client.field1748.method2173(var10);
				client.field1806 = 0;
				class293.field3565 = class180.method2988(var1);
				client.field1807 = var0;
			}

			if (var2 == 19) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var10 = class152.method2679(class276.field3251, client.field1748.field1105);
				var10.field3321.method8383(var3);
				var10.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
				var10.field3321.method8310(var1 + class388.field4509);
				var10.field3321.method8364(class151.field1447 + var0);
				client.field1748.method2173(var10);
			}

			class284 var14;
			if (var2 == 24) {
				var18 = class180.method2988(var1);
				if (null != var18) {
					boolean var13 = true;
					if (var18.field3500 > 0) {
						var13 = class85.method1768(var18);
					}

					if (var13) {
						var14 = class152.method2679(class276.field3278, client.field1748.field1105);
						var14.field3321.method8312(var1);
						client.field1748.method2173(var14);
					}
				}
			}

			if (var2 == 12) {
				var17 = client.field1934[var3];
				if (var17 != null) {
					client.field1763 = var7;
					client.field1696 = var8;
					client.field1804 = 2;
					client.field1782 = 0;
					client.field1942 = var0;
					client.field1688 = var1;
					var11 = class152.method2679(class276.field3247, client.field1748.field1105);
					var11.field3321.method8355(client.field1929.method3567(82) ? 1 : 0);
					var11.field3321.method8310(var3);
					client.field1748.method2173(var11);
				}
			}

			if (var2 == 1004) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				var10 = class152.method2679(class276.field3277, client.field1748.field1105);
				var10.field3321.method8364(var0 + class151.field1447);
				var10.field3321.method8310(class388.field4509 + var1);
				var10.field3321.method8365(var3);
				client.field1748.method2173(var10);
			}

			if (var2 == 13) {
				var17 = client.field1934[var3];
				if (var17 != null) {
					client.field1763 = var7;
					client.field1696 = var8;
					client.field1804 = 2;
					client.field1782 = 0;
					client.field1942 = var0;
					client.field1688 = var1;
					var11 = class152.method2679(class276.field3212, client.field1748.field1105);
					var11.field3321.method8365(var3);
					var11.field3321.method8355(client.field1929.method3567(82) ? 1 : 0);
					client.field1748.method2173(var11);
				}
			}

			if (var2 == 22) {
				client.field1763 = var7;
				client.field1696 = var8;
				client.field1804 = 2;
				client.field1782 = 0;
				client.field1942 = var0;
				client.field1688 = var1;
				var10 = class152.method2679(class276.field3268, client.field1748.field1105);
				var10.field3321.method8365(class388.field4509 + var1);
				var10.field3321.method8383(var3);
				var10.field3321.method8354(client.field1929.method3567(82) ? 1 : 0);
				var10.field3321.method8383(class151.field1447 + var0);
				client.field1748.method2173(var10);
			}

			if (var2 == 8) {
				var17 = client.field1934[var3];
				if (var17 != null) {
					client.field1763 = var7;
					client.field1696 = var8;
					client.field1804 = 2;
					client.field1782 = 0;
					client.field1942 = var0;
					client.field1688 = var1;
					var11 = class152.method2679(class276.field3198, client.field1748.field1105);
					var11.field3321.method8364(client.field1858);
					var11.field3321.method8365(var3);
					var11.field3321.method8377(class363.field4352);
					var11.field3321.method8364(client.field1859);
					var11.field3321.method8356(client.field1929.method3567(82) ? 1 : 0);
					client.field1748.method2173(var11);
				}
			}

			if (var2 == 45) {
				var15 = client.field1816[var3];
				if (var15 != null) {
					client.field1763 = var7;
					client.field1696 = var8;
					client.field1804 = 2;
					client.field1782 = 0;
					client.field1942 = var0;
					client.field1688 = var1;
					var11 = class152.method2679(class276.field3292, client.field1748.field1105);
					var11.field3321.method8364(var3);
					var11.field3321.method8323(client.field1929.method3567(82) ? 1 : 0);
					client.field1748.method2173(var11);
				}
			}

			if (var2 == 40) {
				var10 = class152.method2679(class276.field3284, client.field1748.field1105);
				var10.field3321.method8310(var0);
				var10.field3321.method8312(var1);
				var10.field3321.method8383(var4);
				client.field1748.method2173(var10);
				client.field1806 = 0;
				class293.field3565 = class180.method2988(var1);
				client.field1807 = var0;
			}

			if (var2 == 25) {
				var18 = class104.method2089(var1, var0);
				if (null != var18) {
					class290.method5644();
					class44.method865(var1, var0, class292.method2150(class182.method3010(var18)), var4);
					client.field1855 = 0;
					client.field1860 = class95.method2023(var18);
					if (client.field1860 == null) {
						client.field1860 = class321.field3756;
					}

					if (var18.field3398) {
						client.field1979 = var18.field3399 + class79.method2039(16777215);
					} else {
						client.field1979 = class79.method2039(65280) + var18.field3509 + class79.method2039(16777215);
					}
				}

			} else {
				if (var2 == 1002) {
					client.field1763 = var7;
					client.field1696 = var8;
					client.field1804 = 2;
					client.field1782 = 0;
					var10 = class152.method2679(class276.field3296, client.field1748.field1105);
					var10.field3321.method8365(var3);
					client.field1748.method2173(var10);
				}

				if (var2 == 1003) {
					client.field1763 = var7;
					client.field1696 = var8;
					client.field1804 = 2;
					client.field1782 = 0;
					var17 = client.field1934[var3];
					if (var17 != null) {
						class208 var20 = var17.field790;
						if (var20.field2412 != null) {
							var20 = var20.method4083();
						}

						if (null != var20) {
							var14 = class152.method2679(class276.field3248, client.field1748.field1105);
							var14.field3321.method8365(var20.field2379);
							client.field1748.method2173(var14);
						}
					}
				}

				if (var2 == 2) {
					client.field1763 = var7;
					client.field1696 = var8;
					client.field1804 = 2;
					client.field1782 = 0;
					client.field1942 = var0;
					client.field1688 = var1;
					var10 = class152.method2679(class276.field3297, client.field1748.field1105);
					var10.field3321.method8365(class151.field1447 + var0);
					var10.field3321.method8383(client.field1858);
					var10.field3321.method8376(class363.field4352);
					var10.field3321.method8364(client.field1859);
					var10.field3321.method8310(var1 + class388.field4509);
					var10.field3321.method8355(client.field1929.method3567(82) ? 1 : 0);
					var10.field3321.method8364(var3);
					client.field1748.method2173(var10);
				}

				if (var2 == 11) {
					var17 = client.field1934[var3];
					if (var17 != null) {
						client.field1763 = var7;
						client.field1696 = var8;
						client.field1804 = 2;
						client.field1782 = 0;
						client.field1942 = var0;
						client.field1688 = var1;
						var11 = class152.method2679(class276.field3285, client.field1748.field1105);
						var11.field3321.method8364(var3);
						var11.field3321.method8323(client.field1929.method3567(82) ? 1 : 0);
						client.field1748.method2173(var11);
					}
				}

				if (var2 == 42) {
					var10 = class152.method2679(class276.field3201, client.field1748.field1105);
					var10.field3321.method8383(var0);
					var10.field3321.method8383(var4);
					var10.field3321.method8377(var1);
					client.field1748.method2173(var10);
					client.field1806 = 0;
					class293.field3565 = class180.method2988(var1);
					client.field1807 = var0;
				}

				if (var2 == 50) {
					var15 = client.field1816[var3];
					if (var15 != null) {
						client.field1763 = var7;
						client.field1696 = var8;
						client.field1804 = 2;
						client.field1782 = 0;
						client.field1942 = var0;
						client.field1688 = var1;
						var11 = class152.method2679(class276.field3250, client.field1748.field1105);
						var11.field3321.method8365(var3);
						var11.field3321.method8356(client.field1929.method3567(82) ? 1 : 0);
						client.field1748.method2173(var11);
					}
				}

				if (0 != client.field1855) {
					client.field1855 = 0;
					class53.method1040(class180.method2988(class356.field4318));
				}

				if (client.field1857) {
					class290.method5644();
				}

				if (null != class293.field3565 && 0 == client.field1806) {
					class53.method1040(class293.field3565);
				}

			}
		}
	}
}
