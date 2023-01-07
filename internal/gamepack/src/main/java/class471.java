import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "my"
)
public class class471 {
	@ObfInfo(
		owner = "my",
		name = "h",
		desc = "[C"
	)
	public static final char[] field3959;
	@ObfInfo(
		owner = "my",
		name = "f",
		desc = "[[[B"
	)
	static byte[][][] field3958;
	@ObfInfo(
		owner = "my",
		name = "iw",
		desc = "[Lrx;"
	)
	static class266[] field3962;
	@ObfInfo(
		owner = "my",
		name = "eu",
		desc = "Lln;"
	)
	static class38 field3963;
	@ObfInfo(
		owner = "my",
		name = "oe",
		desc = "I"
	)
	static int field3960;
	@ObfInfo(
		owner = "my",
		name = "m",
		desc = "I"
	)
	static int field3961;

	static {
		field3959 = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfInfo(
		owner = "my",
		name = "au",
		desc = "(ILbm;ZI)I"
	)
	static int method2330(int var0, class461 var1, boolean var2) {
		int var4;
		if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERTYPE) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field429[var4].method1658();
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERITEM) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2567;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERPRICE) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2568;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOUNT) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2569;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2571;
			return 1;
		} else if (var0 == ScriptOpcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = client.field429[var4].field2566;
			return 1;
		} else {
			int var13;
			if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFEREMPTY) {
				var4 = class386.field3248[--class161.field1227];
				var13 = client.field429[var4].method1656();
				class386.field3248[++class161.field1227 - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERSTABLE) {
				var4 = class386.field3248[--class161.field1227];
				var13 = client.field429[var4].method1656();
				class386.field3248[++class161.field1227 - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERFINISHED) {
				var4 = class386.field3248[--class161.field1227];
				var13 = client.field429[var4].method1656();
				class386.field3248[++class161.field1227 - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.STOCKMARKET_ISOFFERADDING) {
				var4 = class386.field3248[--class161.field1227];
				var13 = client.field429[var4].method1656();
				class386.field3248[++class161.field1227 - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var14;
				if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_NAME) {
					var14 = class386.field3248[--class161.field1227] == 1;
					if (class201.field1756 != null) {
						class201.field1756.method1756(class348.field2881, var14);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_PRICE) {
					var14 = class386.field3248[--class161.field1227] == 1;
					if (null != class201.field1756) {
						class201.field1756.method1756(class348.field2879, var14);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					class161.field1227 -= 2;
					var14 = class386.field3248[class161.field1227] == 1;
					boolean var5 = class386.field3248[1 + class161.field1227] == 1;
					if (class201.field1756 != null) {
						client.field509.field2371 = var5;
						class201.field1756.method1756(client.field509, var14);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_AGE) {
					var14 = class386.field3248[--class161.field1227] == 1;
					if (null != class201.field1756) {
						class201.field1756.method1756(class348.field2883, var14);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_SORTBY_COUNT) {
					var14 = class386.field3248[--class161.field1227] == 1;
					if (class201.field1756 != null) {
						class201.field1756.method1756(class348.field2882, var14);
					}

					return 1;
				} else if (var0 == ScriptOpcodes.TRADINGPOST_GETTOTALOFFERS) {
					class386.field3248[++class161.field1227 - 1] = null == class201.field1756 ? 0 : class201.field1756.field2880.size();
					return 1;
				} else {
					class258 var12;
					if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERWORLD) {
						var4 = class386.field3248[--class161.field1227];
						var12 = (class258)class201.field1756.field2880.get(var4);
						class386.field3248[++class161.field1227 - 1] = var12.field2106;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERNAME) {
						var4 = class386.field3248[--class161.field1227];
						var12 = (class258)class201.field1756.field2880.get(var4);
						class386.field3249[++class386.field3250 - 1] = var12.method1107();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var4 = class386.field3248[--class161.field1227];
						var12 = (class258)class201.field1756.field2880.get(var4);
						class386.field3249[++class386.field3250 - 1] = var12.method1106();
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERAGE) {
						var4 = class386.field3248[--class161.field1227];
						var12 = (class258)class201.field1756.field2880.get(var4);
						long var6 = class152.method711() - class221.field1901 - var12.field2105;
						int var8 = (int)(var6 / 3600000L);
						int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
						int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						class386.field3249[++class386.field3250 - 1] = var11;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERCOUNT) {
						var4 = class386.field3248[--class161.field1227];
						var12 = (class258)class201.field1756.field2880.get(var4);
						class386.field3248[++class161.field1227 - 1] = var12.field2108.field2569;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERPRICE) {
						var4 = class386.field3248[--class161.field1227];
						var12 = (class258)class201.field1756.field2880.get(var4);
						class386.field3248[++class161.field1227 - 1] = var12.field2108.field2568;
						return 1;
					} else if (var0 == ScriptOpcodes.TRADINGPOST_GETOFFERITEM) {
						var4 = class386.field3248[--class161.field1227];
						var12 = (class258)class201.field1756.field2880.get(var4);
						class386.field3248[++class161.field1227 - 1] = var12.field2108.field2567;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "my",
		name = "jl",
		desc = "(III)V"
	)
	static final void method2329(int var0, int var1) {
		class141 var3 = client.field360[class347.field2878][var0][var1];
		if (var3 == null) {
			class408.field3415.method1577(class347.field2878, var0, var1);
		} else {
			long var4 = -99999999L;
			class402 var6 = null;

			class402 var7;
			for (var7 = (class402)var3.method646(); null != var7; var7 = (class402)var3.method648()) {
				class263 var8 = class423.method2062(var7.field3387);
				long var9 = (long)var8.field2158;
				if (1 == var8.field2157) {
					var9 *= (long)(var7.field3385 + 1);
				}

				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}

			if (null == var6) {
				class408.field3415.method1577(class347.field2878, var0, var1);
			} else {
				var3.method643(var6);
				class402 var13 = null;
				class402 var12 = null;

				for (var7 = (class402)var3.method646(); var7 != null; var7 = (class402)var3.method648()) {
					if (var6.field3387 != var7.field3387) {
						if (var13 == null) {
							var13 = var7;
						}

						if (var13.field3387 != var7.field3387 && var12 == null) {
							var12 = var7;
						}
					}
				}

				long var10 = class214.method949(var0, var1, 3, false, 0);
				class408.field3415.method1566(class347.field2878, var0, var1, class327.method1666(var0 * 128 + 64, 64 + var1 * 128, class347.field2878), var6, var10, var13, var12);
			}
		}
	}

	@ObfInfo(
		owner = "my",
		name = "kh",
		desc = "(ZI)V"
	)
	static void method2328(boolean var0) {
		client.field380 = var0;
	}
}
