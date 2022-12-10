public class class202 extends class428 {
	static boolean field2320;
	public class290 field2318;
	public int field2313;
	public int field2316;
	public int field2317;

	public class202(int var1, int var2, int var3, class290 var4) {
		this.field2313 = var1;
		this.field2317 = var2;
		this.field2316 = var3;
		this.field2318 = var4;
	}

	static int method3993(int var0, int var1) {
		class81 var3 = (class81)class81.field749.method8177((long)var0);
		if (var3 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var5 = 0; var5 < var3.field748.length; ++var5) {
				if (var3.field747[var5] == var1) {
					var4 += var3.field748[var5];
				}
			}

			return var4;
		}
	}

	public static synchronized void method3992(byte[] var0) {
		if (100 == var0.length && class370.field4419 < class370.field4413) {
			class370.field4417[++class370.field4419 - 1] = var0;
		} else if (5000 == var0.length && class370.field4410 < class370.field4406) {
			class370.field4418[++class370.field4410 - 1] = var0;
		} else if (var0.length == 10000 && class370.field4411 < class370.field4415) {
			class370.field4407[++class370.field4411 - 1] = var0;
		} else if (30000 == var0.length && class370.field4412 < class370.field4414) {
			class370.field4420[++class370.field4412 - 1] = var0;
		} else {
			if (null != class218.field2643) {
				for (int var2 = 0; var2 < class209.field2424.length; ++var2) {
					if (class209.field2424[var2] == var0.length && class219.field2656[var2] < class218.field2643[var2].length) {
						class218.field2643[var2][class219.field2656[var2]++] = var0;
						return;
					}
				}
			}

		}
	}

	public static final class491 method3994(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var7 = ((long)var1 << 16) + (long)var0 + ((long)var2 << 38) + ((long)var4 << 40) + ((long)var3 << 42);
		class491 var9;
		if (!var5) {
			var9 = (class491)class200.field2256.method5356(var7);
			if (null != var9) {
				return var9;
			}
		}

		class200 var10 = class208.method4105(var0);
		if (var1 > 1 && null != var10.field2291) {
			int var11 = -1;

			for (int var12 = 0; var12 < 10; ++var12) {
				if (var1 >= var10.field2250[var12] && 0 != var10.field2250[var12]) {
					var11 = var10.field2291[var12];
				}
			}

			if (var11 != -1) {
				var10 = class208.method4105(var11);
			}
		}

		class216 var20 = var10.method3922(1);
		if (var20 == null) {
			return null;
		} else {
			class491 var21 = null;
			if (-1 != var10.field2294) {
				var21 = method3994(var10.field2298, 10, 1, 0, 0, true);
				if (null == var21) {
					return null;
				}
			} else if (-1 != var10.field2282) {
				var21 = method3994(var10.field2276, var1, var2, var3, 0, false);
				if (null == var21) {
					return null;
				}
			} else if (-1 != var10.field2307) {
				var21 = method3994(var10.field2283, var1, 0, 0, 0, false);
				if (null == var21) {
					return null;
				}
			}

			int[] var13 = class478.field5012;
			int var14 = class478.field5011;
			int var15 = class478.field5010;
			int[] var16 = new int[4];
			class478.method8674(var16);
			var9 = new class491(36, 32);
			class478.method8679(var9.field5067, 36, 32);
			class478.method8676();
			class221.method4530();
			class221.method4612(16, 16);
			class221.field2677 = false;
			if (var10.field2307 != -1) {
				var21.method8866(0, 0);
			}

			int var17 = var10.field2264;
			if (var5) {
				var17 = (int)((double)var17 * 1.5D);
			} else if (var2 == 2) {
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * class221.field2667[var10.field2265] >> 16;
			int var19 = class221.field2690[var10.field2265] * var17 >> 16;
			var20.method4412();
			var20.method4403(0, var10.field2266, var10.field2273, var10.field2265, var10.field2268, var10.field2253 + var20.field2740 / 2 + var18, var19 + var10.field2253);
			if (var10.field2282 != -1) {
				var21.method8866(0, 0);
			}

			if (var2 >= 1) {
				var9.method8847(1);
			}

			if (var2 >= 2) {
				var9.method8847(16777215);
			}

			if (var3 != 0) {
				var9.method8934(var3);
			}

			class478.method8679(var9.field5067, 36, 32);
			if (-1 != var10.field2294) {
				var21.method8866(0, 0);
			}

			if (var4 == 1 || var4 == 2 && 1 == var10.field2270) {
				class281.field3307.method6854(class109.method2171(var1), 0, 9, 16776960, 1);
			}

			if (!var5) {
				class200.field2256.method5364(var9, var7);
			}

			class478.method8679(var13, var14, var15);
			class478.method8675(var16);
			class221.method4530();
			class221.field2677 = true;
			return var9;
		}
	}
}
