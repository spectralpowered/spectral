public class class283 {
	class283() throws Throwable {
		throw new Error();
	}

	public static void method5370() {
		class186.field2038.method5357();
	}

	static final void method5367(class290 var0, int var1, int var2) {
		if (var0.field3402 == 1) {
			client.method1206(var0.field3534, "", 24, 0, 0, var0.field3492, var0.field3404);
		}

		String var4;
		if (2 == var0.field3402 && !client.field1857) {
			var4 = class95.method2023(var0);
			if (null != var4) {
				client.method1206(var4, class79.method2039(65280) + var0.field3509, 25, 0, -1, var0.field3492, var0.field3404);
			}
		}

		if (3 == var0.field3402) {
			client.method1404(class321.field3926, "", 26, 0, 0, var0.field3492);
		}

		if (var0.field3402 == 4) {
			client.method1404(var0.field3534, "", 28, 0, 0, var0.field3492);
		}

		if (var0.field3402 == 5) {
			client.method1404(var0.field3534, "", 29, 0, 0, var0.field3492);
		}

		if (6 == var0.field3402 && null == client.field1868) {
			client.method1404(var0.field3534, "", 30, 0, -1, var0.field3492);
		}

		int var5;
		int var6;
		int var14;
		if (2 == var0.field3536) {
			var14 = 0;

			for (var5 = 0; var5 < var0.field3474; ++var5) {
				for (var6 = 0; var6 < var0.field3414; ++var6) {
					int var7 = var6 * (var0.field3520 + 32);
					int var8 = (var0.field3451 + 32) * var5;
					if (var14 < 20) {
						var7 += var0.field3469[var14];
						var8 += var0.field3381[var14];
					}

					if (var1 >= var7 && var2 >= var8 && var1 < var7 + 32 && var2 < var8 + 32) {
						client.field1980 = var14;
						class256.field2991 = var0;
						if (var0.field3392[var14] > 0) {
							class200 var9 = class208.method4105(var0.field3392[var14] - 1);
							if (client.field1855 == 1 && class255.method5066(class182.method3010(var0))) {
								if (class356.field4318 != var0.field3492 || class82.field755 != var14) {
									client.method1206(class321.field3917, client.field1952 + " " + class79.field728 + " " + class79.method2039(16748608) + var9.field2259, 31, 0, var14, var0.field3492, var9.field2281);
								}
							} else if (client.field1857 && class255.method5066(class182.method3010(var0))) {
								if (16 == (class16.field99 & 16)) {
									client.method1206(client.field1860, client.field1979 + " " + class79.field728 + " " + class79.method2039(16748608) + var9.field2259, 32, 0, var14, var0.field3492, var9.field2281);
								}
							} else {
								String[] var10 = var9.field2277;
								int var11 = -1;
								if (client.field1853) {
									boolean var12 = client.field1849 || client.field1929.method3567(81);
									if (var12) {
										var11 = var9.method3939();
									}
								}

								int var19;
								if (class255.method5066(class182.method3010(var0))) {
									for (var19 = 4; var19 >= 3; --var19) {
										if (var11 != var19) {
											class328.method6256(var0, var9, var14, var19, false);
										}
									}
								}

								if (class128.method2419(class182.method3010(var0))) {
									client.method1206(class321.field3917, class79.method2039(16748608) + var9.field2259, 38, 0, var14, var0.field3492, var9.field2281);
								}

								if (class255.method5066(class182.method3010(var0))) {
									for (var19 = 2; var19 >= 0; --var19) {
										if (var19 != var11) {
											class328.method6256(var0, var9, var14, var19, false);
										}
									}

									if (var11 >= 0) {
										class328.method6256(var0, var9, var14, var11, true);
									}
								}

								var10 = var0.field3472;
								if (null != var10) {
									for (var19 = 4; var19 >= 0; --var19) {
										if (var10[var19] != null) {
											byte var13 = 0;
											if (var19 == 0) {
												var13 = 39;
											}

											if (var19 == 1) {
												var13 = 40;
											}

											if (var19 == 2) {
												var13 = 41;
											}

											if (var19 == 3) {
												var13 = 42;
											}

											if (var19 == 4) {
												var13 = 43;
											}

											client.method1206(var10[var19], class79.method2039(16748608) + var9.field2259, var13, 0, var14, var0.field3492, var9.field2281);
										}
									}
								}

								client.method1206(class321.field3969, class79.method2039(16748608) + var9.field2259, 1005, 0, var14, var0.field3492, var9.field2281);
							}
						}
					}

					++var14;
				}
			}
		}

		if (var0.field3398) {
			if (client.field1857) {
				var5 = class182.method3010(var0);
				boolean var20 = 0 != (var5 >> 21 & 1);
				if (var20 && (class16.field99 & 32) == 32) {
					client.method1206(client.field1860, client.field1979 + " " + class79.field728 + " " + var0.field3399, 58, 0, var0.field3400, var0.field3492, var0.field3404);
				}
			} else {
				for (var14 = 9; var14 >= 5; --var14) {
					String var15;
					if (!class253.method4974(class182.method3010(var0), var14) && null == var0.field3437) {
						var15 = null;
					} else if (null != var0.field3485 && var0.field3485.length > var14 && var0.field3485[var14] != null && var0.field3485[var14].trim().length() != 0) {
						var15 = var0.field3485[var14];
					} else {
						var15 = null;
					}

					if (null != var15) {
						client.method1206(var15, var0.field3399, 1007, var14 + 1, var0.field3400, var0.field3492, var0.field3404);
					}
				}

				var4 = class95.method2023(var0);
				if (var4 != null) {
					client.method1206(var4, var0.field3399, 25, 0, var0.field3400, var0.field3492, var0.field3404);
				}

				for (var5 = 4; var5 >= 0; --var5) {
					String var16;
					if (!class253.method4974(class182.method3010(var0), var5) && null == var0.field3437) {
						var16 = null;
					} else if (var0.field3485 != null && var0.field3485.length > var5 && null != var0.field3485[var5] && var0.field3485[var5].trim().length() != 0) {
						var16 = var0.field3485[var5];
					} else {
						var16 = null;
					}

					if (null != var16) {
						class38.method497(var16, var0.field3399, 57, var5 + 1, var0.field3400, var0.field3492, var0.field3404, var0.field3553);
					}
				}

				var6 = class182.method3010(var0);
				boolean var18 = (var6 & 1) != 0;
				if (var18) {
					client.method1404(class321.field3760, "", 30, 0, var0.field3400, var0.field3492);
				}
			}
		}

	}

	static final int method5368() {
		float var1 = 200.0F * ((float)class186.field2040.method1784() - 0.5F);
		return 100 - Math.round(var1);
	}
}
