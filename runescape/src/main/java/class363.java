public class class363 {
	public static final char[] field4351;
	static byte[][][] field4350;
	static class326 field4355;
	static class491[] field4354;
	static int field4352;
	static int field4353;

	static {
		field4351 = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
	}

	class363() throws Throwable {
		throw new Error();
	}

	static int method6766(int var0, class65 var1, boolean var2) {
		int var4;
		if (var0 == CS2Opcodes.STOCKMARKET_GETOFFERTYPE) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1898[var4].method6776();
			return 1;
		} else if (var0 == CS2Opcodes.STOCKMARKET_GETOFFERITEM) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1898[var4].field4357;
			return 1;
		} else if (var0 == CS2Opcodes.STOCKMARKET_GETOFFERPRICE) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1898[var4].field4358;
			return 1;
		} else if (var0 == CS2Opcodes.STOCKMARKET_GETOFFERCOUNT) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1898[var4].field4359;
			return 1;
		} else if (var0 == CS2Opcodes.STOCKMARKET_GETOFFERCOMPLETEDCOUNT) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1898[var4].field4361;
			return 1;
		} else if (var0 == CS2Opcodes.STOCKMARKET_GETOFFERCOMPLETEDGOLD) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = client.field1898[var4].field4356;
			return 1;
		} else {
			int var13;
			if (var0 == CS2Opcodes.STOCKMARKET_ISOFFEREMPTY) {
				var4 = class69.field579[--class94.field920];
				var13 = client.field1898[var4].method6770();
				class69.field579[++class94.field920 - 1] = var13 == 0 ? 1 : 0;
				return 1;
			} else if (var0 == CS2Opcodes.STOCKMARKET_ISOFFERSTABLE) {
				var4 = class69.field579[--class94.field920];
				var13 = client.field1898[var4].method6770();
				class69.field579[++class94.field920 - 1] = var13 == 2 ? 1 : 0;
				return 1;
			} else if (var0 == CS2Opcodes.STOCKMARKET_ISOFFERFINISHED) {
				var4 = class69.field579[--class94.field920];
				var13 = client.field1898[var4].method6770();
				class69.field579[++class94.field920 - 1] = var13 == 5 ? 1 : 0;
				return 1;
			} else if (var0 == CS2Opcodes.STOCKMARKET_ISOFFERADDING) {
				var4 = class69.field579[--class94.field920];
				var13 = client.field1898[var4].method6770();
				class69.field579[++class94.field920 - 1] = var13 == 1 ? 1 : 0;
				return 1;
			} else {
				boolean var14;
				if (var0 == CS2Opcodes.TRADINGPOST_SORTBY_NAME) {
					var14 = class69.field579[--class94.field920] == 1;
					if (class81.field751 != null) {
						class81.field751.method6265(class330.field4169, var14);
					}

					return 1;
				} else if (var0 == CS2Opcodes.TRADINGPOST_SORTBY_PRICE) {
					var14 = class69.field579[--class94.field920] == 1;
					if (null != class81.field751) {
						class81.field751.method6265(class330.field4166, var14);
					}

					return 1;
				} else if (var0 == CS2Opcodes.TRADINGPOST_SORTFILTERBY_WORLD) {
					class94.field920 -= 2;
					var14 = class69.field579[class94.field920] == 1;
					boolean var5 = class69.field579[1 + class94.field920] == 1;
					if (class81.field751 != null) {
						client.field1978.field458 = var5;
						class81.field751.method6265(client.field1978, var14);
					}

					return 1;
				} else if (var0 == CS2Opcodes.TRADINGPOST_SORTBY_AGE) {
					var14 = class69.field579[--class94.field920] == 1;
					if (null != class81.field751) {
						class81.field751.method6265(class330.field4171, var14);
					}

					return 1;
				} else if (var0 == CS2Opcodes.TRADINGPOST_SORTBY_COUNT) {
					var14 = class69.field579[--class94.field920] == 1;
					if (class81.field751 != null) {
						class81.field751.method6265(class330.field4170, var14);
					}

					return 1;
				} else if (var0 == CS2Opcodes.TRADINGPOST_GETTOTALOFFERS) {
					class69.field579[++class94.field920 - 1] = null == class81.field751 ? 0 : class81.field751.field4167.size();
					return 1;
				} else {
					class345 var12;
					if (var0 == CS2Opcodes.TRADINGPOST_GETOFFERWORLD) {
						var4 = class69.field579[--class94.field920];
						var12 = (class345)class81.field751.field4167.get(var4);
						class69.field579[++class94.field920 - 1] = var12.field4279;
						return 1;
					} else if (var0 == CS2Opcodes.TRADINGPOST_GETOFFERNAME) {
						var4 = class69.field579[--class94.field920];
						var12 = (class345)class81.field751.field4167.get(var4);
						class69.field580[++class69.field581 - 1] = var12.method6493();
						return 1;
					} else if (var0 == CS2Opcodes.TRADINGPOST_GETOFFERPREVIOUSNAME) {
						var4 = class69.field579[--class94.field920];
						var12 = (class345)class81.field751.field4167.get(var4);
						class69.field580[++class69.field581 - 1] = var12.method6490();
						return 1;
					} else if (var0 == CS2Opcodes.TRADINGPOST_GETOFFERAGE) {
						var4 = class69.field579[--class94.field920];
						var12 = (class345)class81.field751.field4167.get(var4);
						long var6 = class74.method1493() - class251.field2948 - var12.field4278;
						int var8 = (int)(var6 / 3600000L);
						int var9 = (int)((var6 - (long)(var8 * 3600000)) / 60000L);
						int var10 = (int)((var6 - (long)(var8 * 3600000) - (long)(var9 * 60000)) / 1000L);
						String var11 = var8 + ":" + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
						class69.field580[++class69.field581 - 1] = var11;
						return 1;
					} else if (var0 == CS2Opcodes.TRADINGPOST_GETOFFERCOUNT) {
						var4 = class69.field579[--class94.field920];
						var12 = (class345)class81.field751.field4167.get(var4);
						class69.field579[++class94.field920 - 1] = var12.field4281.field4359;
						return 1;
					} else if (var0 == CS2Opcodes.TRADINGPOST_GETOFFERPRICE) {
						var4 = class69.field579[--class94.field920];
						var12 = (class345)class81.field751.field4167.get(var4);
						class69.field579[++class94.field920 - 1] = var12.field4281.field4358;
						return 1;
					} else if (var0 == CS2Opcodes.TRADINGPOST_GETOFFERITEM) {
						var4 = class69.field579[--class94.field920];
						var12 = (class345)class81.field751.field4167.get(var4);
						class69.field579[++class94.field920 - 1] = var12.field4281.field4357;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}

	static final void method6765(int var0, int var1) {
		class355 var3 = client.field1829[class384.field4486][var0][var1];
		if (var3 == null) {
			class33.field194.method4173(class384.field4486, var0, var1);
		} else {
			long var4 = -99999999L;
			class96 var6 = null;

			class96 var7;
			for (var7 = (class96)var3.method6577(); null != var7; var7 = (class96)var3.method6579()) {
				class200 var8 = class208.method4105(var7.field937);
				long var9 = (long)var8.field2271;
				if (1 == var8.field2270) {
					var9 *= (long)(var7.field929 + 1);
				}

				if (var9 > var4) {
					var4 = var9;
					var6 = var7;
				}
			}

			if (null == var6) {
				class33.field194.method4173(class384.field4486, var0, var1);
			} else {
				var3.method6573(var6);
				class96 var13 = null;
				class96 var12 = null;

				for (var7 = (class96)var3.method6577(); var7 != null; var7 = (class96)var3.method6579()) {
					if (var6.field937 != var7.field937) {
						if (var13 == null) {
							var13 = var7;
						}

						if (var13.field937 != var7.field937 && var12 == null) {
							var12 = var7;
						}
					}
				}

				long var10 = class40.method601(var0, var1, 3, false, 0);
				class33.field194.method4159(class384.field4486, var0, var1, class199.method3912(var0 * 128 + 64, 64 + var1 * 128, class384.field4486), var6, var10, var13, var12);
			}
		}
	}
}
