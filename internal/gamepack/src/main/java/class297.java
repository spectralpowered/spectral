import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "y"
)
public class class297 implements class289 {
	@ObfInfo(
		owner = "y",
		name = "ty",
		desc = "Lby;"
	)
	static class129 field2393;

	@ObfInfo(
		owner = "y",
		name = "<init>",
		desc = "()V"
	)
	class297() {
	}

	@ObfInfo(
		owner = "y",
		name = "h",
		desc = "(I)Lax;"
	)
	public class233 method1426() {
		return new class260();
	}

	@ObfInfo(
		owner = "y",
		name = "a",
		desc = "(IB)V"
	)
	static void method1443(int var0) {
		class286.method1419(14);
		class359.field3055 = var0;
	}

	@ObfInfo(
		owner = "y",
		name = "hi",
		desc = "(Lkd;IIB)V"
	)
	static final void method1441(class120 var0, int var1, int var2) {
		if (client.field296 == 0 || client.field296 == 3) {
			if (!client.field368 && (class466.field3869 == 1 || !class151.field1180 && 4 == class466.field3869)) {
				class226 var4 = var0.method483(true);
				if (null == var4) {
					return;
				}

				int var5 = class466.field3870 - var1;
				int var6 = class466.field3867 - var2;
				if (var4.method991(var5, var6)) {
					var5 -= var4.field1926 / 2;
					var6 -= var4.field1927 / 2;
					int var7 = client.field301 & 2047;
					int var8 = class341.field2726[var7];
					int var9 = class341.field2744[var7];
					int var10 = var8 * var6 + var5 * var9 >> 11;
					int var11 = var6 * var9 - var5 * var8 >> 11;
					int var12 = var10 + class113.field846.field2672 >> 7;
					int var13 = class113.field846.field2608 - var11 >> 7;
					class299 var14 = class480.method2370(class356.field2980, client.field279.field4042);
					var14.field2403.method544(18);
					var14.field2403.method568(client.field460.method2132(82) ? (client.field460.method2132(81) ? 2 : 1) : 0);
					var14.field2403.method584(var12 + class312.field2465);
					var14.field2403.method572(class325.field2575 + var13);
					var14.field2403.method544(var5);
					var14.field2403.method544(var6);
					var14.field2403.method533(client.field301);
					var14.field2403.method544(57);
					var14.field2403.method544(0);
					var14.field2403.method544(0);
					var14.field2403.method544(89);
					var14.field2403.method533(class113.field846.field2672);
					var14.field2403.method533(class113.field846.field2608);
					var14.field2403.method544(63);
					client.field279.method2389(var14);
					client.field473 = var12;
					client.field219 = var13;
				}
			}

		}
	}

	@ObfInfo(
		owner = "y",
		name = "iu",
		desc = "(ZS)V"
	)
	static final void method1442(boolean var0) {
		for (int var2 = 0; var2 < client.field275; ++var2) {
			class267 var3 = client.field465[client.field431[var2]];
			if (null != var3 && var3.method1678() && var3.field2213.field3490 == var0 && var3.field2213.method2063()) {
				int var4 = var3.field2672 >> 7;
				int var5 = var3.field2608 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (1 == var3.field2611 && (var3.field2672 & 127) == 64 && 64 == (var3.field2608 & 127)) {
						if (client.field328[var4][var5] == client.field329) {
							continue;
						}

						client.field328[var4][var5] = client.field329;
					}

					long var6 = class214.method949(0, 0, 1, !var3.field2213.field3496, client.field431[var2]);
					var3.field2612 = client.field231;
					class408.field3415.method1604(class347.field2878, var3.field2672, var3.field2608, class327.method1666(var3.field2672 + (var3.field2611 * 64 - 64), var3.field2611 * 64 - 64 + var3.field2608, class347.field2878), 60 + (var3.field2611 * 64 - 64), var3, var3.field2622, var6, var3.field2609);
				}
			}
		}

	}

	@ObfInfo(
		owner = "y",
		name = "ih",
		desc = "(Ljn;I)V"
	)
	static final void method1440(class204 var0) {
		class6 var2 = client.field279.field4043;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		class402 var9;
		if (var0 == class204.field1767) {
			var3 = var2.method547();
			var4 = var2.method574();
			var5 = var2.method595();
			var6 = var2.method569();
			var7 = (var6 >> 4 & 7) + class169.field1269;
			var8 = class84.field697 + (var6 & 7);
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				var9 = new class402();
				var9.field3387 = var4;
				var9.field3385 = var5;
				var9.method1985(var3);
				if (client.field360[class347.field2878][var7][var8] == null) {
					client.field360[class347.field2878][var7][var8] = new class141();
				}

				client.field360[class347.field2878][var7][var8].method642(var9);
				class471.method2329(var7, var8);
			}

		} else if (class204.field1762 == var0) {
			var3 = var2.method574();
			var4 = var2.method547();
			var5 = var2.method594();
			var6 = (var5 >> 4 & 7) + class169.field1269;
			var7 = class84.field697 + (var5 & 7);
			var8 = var2.method574();
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				var6 = 64 + var6 * 128;
				var7 = 64 + var7 * 128;
				class339 var39 = new class339(var8, class347.field2878, var6, var7, class327.method1666(var6, var7, class347.field2878) - var4, var3, client.field231);
				client.field352.method642(var39);
			}

		} else if (var0 == class204.field1765) {
			var3 = var2.method547();
			var4 = (var3 >> 4 & 7) + class169.field1269;
			var5 = class84.field697 + (var3 & 7);
			var2.method575();
			var6 = var2.method592();
			var2.method531();
			var7 = var2.method595();
			var2.method594();
			var2.method594();
			var8 = var2.method549();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var9 = new class402();
				var9.field3387 = var8;
				var9.field3385 = var7;
				var9.method1985(var6);
				if (client.field360[class347.field2878][var4][var5] == null) {
					client.field360[class347.field2878][var4][var5] = new class141();
				}

				client.field360[class347.field2878][var4][var5].method642(var9);
				class471.method2329(var4, var5);
			}

		} else {
			int var10;
			int var11;
			int var13;
			byte var14;
			byte var15;
			class208 var16;
			int var32;
			int var40;
			int var42;
			int var43;
			if (var0 == class204.field1773) {
				var3 = var2.method592() * 4;
				var4 = var2.method547();
				var5 = class169.field1269 + (var4 >> 4 & 7);
				var6 = (var4 & 7) + class84.field697;
				var7 = var2.method574();
				var8 = var2.method574();
				var32 = var2.method569() * 4;
				var10 = var2.method592();
				var11 = var2.method547();
				var40 = var2.method550();
				var13 = var2.method574();
				var14 = var2.method593();
				var15 = var2.method548();
				var42 = var14 + var5;
				var43 = var15 + var6;
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104 && var13 != 65535) {
					var5 = 64 + var5 * 128;
					var6 = var6 * 128 + 64;
					var42 = var42 * 128 + 64;
					var43 = var43 * 128 + 64;
					var16 = new class208(var13, class347.field2878, var5, var6, class327.method1666(var5, var6, class347.field2878) - var32, client.field231 + var7, client.field231 + var8, var11, var10, var40, var3);
					var16.method901(var42, var43, class327.method1666(var42, var43, class347.field2878) - var3, var7 + client.field231);
					client.field362.method642(var16);
				}

			} else if (class204.field1760 == var0) {
				var3 = var2.method594();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = client.field292[var4];
				var7 = var2.method594();
				var8 = class169.field1269 + (var7 >> 4 & 7);
				var32 = (var7 & 7) + class84.field697;
				var10 = var2.method594();
				var11 = var2.method531();
				if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104) {
					class418.method2018(class347.field2878, var8, var32, var6, var11, var4, var5, var10, 0, -1);
				}

			} else {
				class141 var33;
				if (var0 == class204.field1771) {
					var3 = var2.method569();
					var4 = class169.field1269 + (var3 >> 4 & 7);
					var5 = (var3 & 7) + class84.field697;
					var6 = var2.method549();
					var7 = var2.method571();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var33 = client.field360[class347.field2878][var4][var5];
						if (var33 != null) {
							for (var9 = (class402)var33.method646(); null != var9; var9 = (class402)var33.method648()) {
								if (var9.field3387 == (var6 & 32767) && var9.field3385 == var7) {
									var9.method637();
									break;
								}
							}

							if (var33.method646() == null) {
								client.field360[class347.field2878][var4][var5] = null;
							}

							class471.method2329(var4, var5);
						}
					}

				} else if (class204.field1768 == var0) {
					var3 = var2.method569();
					var4 = var3 >> 2;
					var5 = var3 & 3;
					var6 = client.field292[var4];
					var7 = var2.method569();
					var8 = (var7 >> 4 & 7) + class169.field1269;
					var32 = (var7 & 7) + class84.field697;
					if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104) {
						class418.method2018(class347.field2878, var8, var32, var6, -1, var4, var5, 31, 0, -1);
					}

				} else {
					if (class204.field1761 == var0) {
						var3 = var2.method547();
						var4 = var2.method575();
						var5 = var2.method594();
						var6 = (var5 >> 4 & 7) + class169.field1269;
						var7 = class84.field697 + (var5 & 7);
						var8 = var2.method569();
						var32 = var8 >> 4 & 15;
						var10 = var8 & 7;
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							var11 = var32 + 1;
							if (class113.field846.field2633[0] >= var6 - var11 && class113.field846.field2633[0] <= var6 + var11 && class113.field846.field2681[0] >= var7 - var11 && class113.field846.field2681[0] <= var11 + var7 && class50.field574.method2230() != 0 && var10 > 0 && client.field478 < 50) {
								client.field479[client.field478] = var4;
								client.field480[client.field478] = var10;
								client.field508[client.field478] = var3;
								client.field288[client.field478] = null;
								client.field334[client.field478] = (var6 << 16) + (var7 << 8) + var32;
								++client.field478;
							}
						}
					}

					if (class204.field1766 == var0) {
						var3 = var2.method594();
						var4 = var2.method531();
						var5 = var2.method574();
						var6 = var2.method547() * 4;
						var7 = var2.method594();
						var8 = (var7 >> 4 & 7) + class169.field1269;
						var32 = class84.field697 + (var7 & 7);
						var10 = var2.method547() * 4;
						var11 = var2.method531();
						var40 = var2.method594();
						byte var41 = var2.method593();
						var14 = var2.method599();
						var43 = var2.method546();
						var42 = var14 + var8;
						var13 = var41 + var32;
						if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104 && var42 >= 0 && var13 >= 0 && var42 < 104 && var13 < 104 && var5 != 65535) {
							var8 = 64 + var8 * 128;
							var32 = 64 + var32 * 128;
							var42 = 64 + var42 * 128;
							var13 = var13 * 128 + 64;
							var16 = new class208(var5, class347.field2878, var8, var32, class327.method1666(var8, var32, class347.field2878) - var6, client.field231 + var11, var4 + client.field231, var3, var40, var43, var10);
							var16.method901(var42, var13, class327.method1666(var42, var13, class347.field2878) - var10, client.field231 + var11);
							client.field362.method642(var16);
						}

					} else if (class204.field1770 == var0) {
						var3 = var2.method574();
						var4 = var2.method575();
						var5 = var2.method592();
						var6 = class169.field1269 + (var5 >> 4 & 7);
						var7 = class84.field697 + (var5 & 7);
						var8 = var2.method531();
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							class141 var38 = client.field360[class347.field2878][var6][var7];
							if (null != var38) {
								for (class402 var34 = (class402)var38.method646(); var34 != null; var34 = (class402)var38.method648()) {
									if ((var8 & 32767) == var34.field3387 && var4 == var34.field3385) {
										var34.field3385 = var3;
										break;
									}
								}

								class471.method2329(var6, var7);
							}
						}

					} else {
						if (class204.field1769 == var0) {
							var3 = var2.method569();
							var4 = var3 >> 2;
							var5 = var3 & 3;
							var6 = client.field292[var4];
							var7 = var2.method531();
							var8 = var2.method574();
							var32 = var2.method569();
							var10 = class169.field1269 + (var32 >> 4 & 7);
							var11 = class84.field697 + (var32 & 7);
							byte var12 = var2.method593();
							var13 = var2.method531();
							var14 = var2.method593();
							var15 = var2.method548();
							byte var35 = var2.method599();
							int var17 = var2.method574();
							class380 var18;
							if (var17 == client.field348) {
								var18 = class113.field846;
							} else {
								var18 = client.field347[var17];
							}

							if (null != var18) {
								class87 var19 = class85.method356(var8);
								int var20;
								int var21;
								if (var5 != 1 && var5 != 3) {
									var20 = var19.field720;
									var21 = var19.field721;
								} else {
									var20 = var19.field721;
									var21 = var19.field720;
								}

								int var22 = var10 + (var20 >> 1);
								int var23 = (var20 + 1 >> 1) + var10;
								int var24 = (var21 >> 1) + var11;
								int var25 = var11 + (var21 + 1 >> 1);
								int[][] var26 = class71.field636[class347.field2878];
								int var27 = var26[var22][var25] + var26[var22][var24] + var26[var23][var24] + var26[var23][var25] >> 2;
								int var28 = (var20 << 6) + (var10 << 7);
								int var29 = (var11 << 7) + (var21 << 6);
								class470 var30 = var19.method367(var4, var5, var26, var28, var27, var29);
								if (var30 != null) {
									class418.method2018(class347.field2878, var10, var11, var6, -1, 0, 0, 31, var7 + 1, var13 + 1);
									var18.field3218 = client.field231 + var7;
									var18.field3202 = var13 + client.field231;
									var18.field3206 = var30;
									var18.field3203 = var10 * 128 + var20 * 64;
									var18.field3209 = var21 * 64 + var11 * 128;
									var18.field3193 = var27;
									byte var31;
									if (var15 > var12) {
										var31 = var15;
										var15 = var12;
										var12 = var31;
									}

									if (var35 > var14) {
										var31 = var35;
										var35 = var14;
										var14 = var31;
									}

									var18.field3220 = var10 + var15;
									var18.field3204 = var10 + var12;
									var18.field3208 = var11 + var35;
									var18.field3200 = var11 + var14;
								}
							}
						}

						if (class204.field1772 == var0) {
							var3 = var2.method594();
							var4 = (var3 >> 4 & 7) + class169.field1269;
							var5 = (var3 & 7) + class84.field697;
							var6 = var2.method575();
							var7 = var2.method569();
							var8 = var7 >> 2;
							var32 = var7 & 3;
							var10 = client.field292[var8];
							if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
								if (var10 == 0) {
									class384 var36 = class408.field3415.method1578(class347.field2878, var4, var5);
									if (var36 != null) {
										var40 = class174.method803(var36.field3237);
										if (var8 == 2) {
											var36.field3230 = new class89(var40, 2, var32 + 4, class347.field2878, var4, var5, var6, false, var36.field3230);
											var36.field3236 = new class89(var40, 2, var32 + 1 & 3, class347.field2878, var4, var5, var6, false, var36.field3236);
										} else {
											var36.field3230 = new class89(var40, var8, var32, class347.field2878, var4, var5, var6, false, var36.field3230);
										}
									}
								}

								if (var10 == 1) {
									class173 var45 = class408.field3415.method1612(class347.field2878, var4, var5);
									if (var45 != null) {
										var40 = class174.method803(var45.field1280);
										if (var8 != 4 && var8 != 5) {
											if (var8 == 6) {
												var45.field1286 = new class89(var40, 4, var32 + 4, class347.field2878, var4, var5, var6, false, var45.field1286);
											} else if (var8 == 7) {
												var45.field1286 = new class89(var40, 4, 4 + (var32 + 2 & 3), class347.field2878, var4, var5, var6, false, var45.field1286);
											} else if (var8 == 8) {
												var45.field1286 = new class89(var40, 4, var32 + 4, class347.field2878, var4, var5, var6, false, var45.field1286);
												var45.field1287 = new class89(var40, 4, (var32 + 2 & 3) + 4, class347.field2878, var4, var5, var6, false, var45.field1287);
											}
										} else {
											var45.field1286 = new class89(var40, 4, var32, class347.field2878, var4, var5, var6, false, var45.field1286);
										}
									}
								}

								if (var10 == 2) {
									class211 var46 = class408.field3415.method1580(class347.field2878, var4, var5);
									if (var8 == 11) {
										var8 = 10;
									}

									if (var46 != null) {
										var46.field1822 = new class89(class174.method803(var46.field1831), var8, var32, class347.field2878, var4, var5, var6, false, var46.field1822);
									}
								}

								if (var10 == 3) {
									class340 var47 = class408.field3415.method1602(class347.field2878, var4, var5);
									if (null != var47) {
										var47.field2718 = new class89(class174.method803(var47.field2719), 22, var32, class347.field2878, var4, var5, var6, false, var47.field2718);
									}
								}
							}

						} else if (class204.field1763 == var0) {
							var3 = var2.method574();
							var2.method549();
							var4 = var2.method569();
							var5 = class169.field1269 + (var4 >> 4 & 7);
							var6 = class84.field697 + (var4 & 7);
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
								class141 var37 = client.field360[class347.field2878][var5][var6];
								if (var37 != null) {
									for (class402 var44 = (class402)var37.method646(); var44 != null; var44 = (class402)var37.method648()) {
										if ((var3 & 32767) == var44.field3387) {
											var44.method637();
											break;
										}
									}

									if (var37.method646() == null) {
										client.field360[class347.field2878][var5][var6] = null;
									}

									class471.method2329(var5, var6);
								}
							}

						} else if (var0 == class204.field1764) {
							var3 = var2.method575();
							var4 = var2.method594();
							var5 = (var4 >> 4 & 7) + class169.field1269;
							var6 = (var4 & 7) + class84.field697;
							var7 = var2.method592();
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
								var33 = client.field360[class347.field2878][var5][var6];
								if (null != var33) {
									for (var9 = (class402)var33.method646(); null != var9; var9 = (class402)var33.method648()) {
										if (var9.field3387 == (var3 & 32767)) {
											var9.method1985(var7);
											break;
										}
									}
								}
							}

						}
					}
				}
			}
		}
	}
}
