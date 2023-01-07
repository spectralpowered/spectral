import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "jw"
)
public class class424 {
	@ObfInfo(
		owner = "jw",
		name = "f",
		desc = "(I)V"
	)
	public static void method2071() {
		class50.field572.method395();
	}

	@ObfInfo(
		owner = "jw",
		name = "ht",
		desc = "(Lct;I)V"
	)
	static final void method2070(class334 var0) {
		int var2 = Math.max(1, var0.field2663 - client.field231);
		int var3 = var0.field2611 * -31241280 + var0.field2626 * -600195968;
		int var4 = var0.field2615 * 221025152 + var0.field2611 * -31241280;
		var0.field2672 += (var3 - var0.field2672) / var2;
		var0.field2608 += (var4 - var0.field2608) / var2;
		var0.field2669 = 0;
		var0.field2674 = var0.field2665;
	}

	@ObfInfo(
		owner = "jw",
		name = "kj",
		desc = "(Lkd;IIB)V"
	)
	static final void method2068(class120 var0, int var1, int var2) {
		if (var0.field897 == 1) {
			class241.method1048(var0.field1025, "", 24, 0, 0, var0.field985, var0.field898);
		}

		String var4;
		if (2 == var0.field897 && !client.field388) {
			var4 = class193.method868(var0);
			if (null != var4) {
				class241.method1048(var4, class238.method1032(65280) + var0.field1000, 25, 0, -1, var0.field985, var0.field898);
			}
		}

		if (3 == var0.field897) {
			class156.method721(class177.field1495, "", 26, 0, 0, var0.field985);
		}

		if (var0.field897 == 4) {
			class156.method721(var0.field1025, "", 28, 0, 0, var0.field985);
		}

		if (var0.field897 == 5) {
			class156.method721(var0.field1025, "", 29, 0, 0, var0.field985);
		}

		if (6 == var0.field897 && null == client.field399) {
			class156.method721(var0.field1025, "", 30, 0, -1, var0.field985);
		}

		int var5;
		int var6;
		int var14;
		if (2 == var0.field1026) {
			var14 = 0;

			for (var5 = 0; var5 < var0.field967; ++var5) {
				for (var6 = 0; var6 < var0.field908; ++var6) {
					int var7 = var6 * (var0.field1011 + 32);
					int var8 = (var0.field944 + 32) * var5;
					if (var14 < 20) {
						var7 += var0.field962[var14];
						var8 += var0.field881[var14];
					}

					if (var1 >= var7 && var2 >= var8 && var1 < var7 + 32 && var2 < var8 + 32) {
						client.field511 = var14;
						class167.field1257 = var0;
						if (var0.field887[var14] > 0) {
							class263 var9 = class423.method2062(var0.field887[var14] - 1);
							if (client.field386 == 1 && class285.method1417(class203.method892(var0))) {
								if (class10.field52 != var0.field985 || class249.field2059 != var14) {
									class241.method1048(class177.field1486, client.field483 + " " + class442.field3664 + " " + class238.method1032(16748608) + var9.field2147, 31, 0, var14, var0.field985, var9.field2168);
								}
							} else if (client.field388 && class285.method1417(class203.method892(var0))) {
								if (16 == (class32.field177 & 16)) {
									class241.method1048(client.field391, client.field510 + " " + class442.field3664 + " " + class238.method1032(16748608) + var9.field2147, 32, 0, var14, var0.field985, var9.field2168);
								}
							} else {
								String[] var10 = var9.field2164;
								int var11 = -1;
								if (client.field384) {
									boolean var12 = client.field380 || client.field460.method2132(81);
									if (var12) {
										var11 = var9.method1210();
									}
								}

								int var19;
								if (class285.method1417(class203.method892(var0))) {
									for (var19 = 4; var19 >= 3; --var19) {
										if (var11 != var19) {
											class116.method452(var0, var9, var14, var19, false);
										}
									}
								}

								if (class81.method338(class203.method892(var0))) {
									class241.method1048(class177.field1486, class238.method1032(16748608) + var9.field2147, 38, 0, var14, var0.field985, var9.field2168);
								}

								if (class285.method1417(class203.method892(var0))) {
									for (var19 = 2; var19 >= 0; --var19) {
										if (var19 != var11) {
											class116.method452(var0, var9, var14, var19, false);
										}
									}

									if (var11 >= 0) {
										class116.method452(var0, var9, var14, var11, true);
									}
								}

								var10 = var0.field965;
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

											class241.method1048(var10[var19], class238.method1032(16748608) + var9.field2147, var13, 0, var14, var0.field985, var9.field2168);
										}
									}
								}

								class241.method1048(class177.field1538, class238.method1032(16748608) + var9.field2147, 1005, 0, var14, var0.field985, var9.field2168);
							}
						}
					}

					++var14;
				}
			}
		}

		if (var0.field893) {
			if (client.field388) {
				var5 = class203.method892(var0);
				boolean var20 = 0 != (var5 >> 21 & 1);
				if (var20 && (class32.field177 & 32) == 32) {
					class241.method1048(client.field391, client.field510 + " " + class442.field3664 + " " + var0.field894, 58, 0, var0.field895, var0.field985, var0.field898);
				}
			} else {
				for (var14 = 9; var14 >= 5; --var14) {
					String var15;
					if (!class230.method999(class203.method892(var0), var14) && null == var0.field930) {
						var15 = null;
					} else if (null != var0.field978 && var0.field978.length > var14 && var0.field978[var14] != null && var0.field978[var14].trim().length() != 0) {
						var15 = var0.field978[var14];
					} else {
						var15 = null;
					}

					if (null != var15) {
						class241.method1048(var15, var0.field894, 1007, var14 + 1, var0.field895, var0.field985, var0.field898);
					}
				}

				var4 = class193.method868(var0);
				if (var4 != null) {
					class241.method1048(var4, var0.field894, 25, 0, var0.field895, var0.field985, var0.field898);
				}

				for (var5 = 4; var5 >= 0; --var5) {
					String var16;
					if (!class230.method999(class203.method892(var0), var5) && null == var0.field930) {
						var16 = null;
					} else if (var0.field978 != null && var0.field978.length > var5 && null != var0.field978[var5] && var0.field978[var5].trim().length() != 0) {
						var16 = var0.field978[var5];
					} else {
						var16 = null;
					}

					if (null != var16) {
						class323.method1653(var16, var0.field894, 57, var5 + 1, var0.field895, var0.field985, var0.field898, var0.field1043);
					}
				}

				var6 = class203.method892(var0);
				boolean var18 = (var6 & 1) != 0;
				if (var18) {
					class156.method721(class177.field1329, "", 30, 0, var0.field895, var0.field985);
				}
			}
		}

	}

	@ObfInfo(
		owner = "jw",
		name = "lt",
		desc = "(I)I"
	)
	static final int method2069() {
		float var1 = 200.0F * ((float)class50.field574.method2208() - 0.5F);
		return 100 - Math.round(var1);
	}
}
