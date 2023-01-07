import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ip"
)
public class class166 extends class389 {
	@ObfInfo(
		owner = "ip",
		name = "eq",
		desc = "Lou;"
	)
	static class160 field1254;
	@ObfInfo(
		owner = "ip",
		name = "x",
		desc = "Lii;"
	)
	class23 field1253;
	@ObfInfo(
		owner = "ip",
		name = "m",
		desc = "I"
	)
	int field1250;
	@ObfInfo(
		owner = "ip",
		name = "v",
		desc = "I"
	)
	int field1252;
	@ObfInfo(
		owner = "ip",
		name = "q",
		desc = "I"
	)
	int field1255;
	@ObfInfo(
		owner = "ip",
		name = "e",
		desc = "Liy;"
	)
	final class144 field1251;
	@ObfInfo(
		owner = "ip",
		name = "h",
		desc = "I"
	)
	final int field1256;

	@ObfInfo(
		owner = "ip",
		name = "<init>",
		desc = "(Lky;Lky;ILiy;)V"
	)
	class166(class464 var1, class464 var2, int var3, class144 var4) {
		super(var1, var2);
		this.field1256 = var3;
		this.field1251 = var4;
		this.method773();
	}

	@ObfInfo(
		owner = "ip",
		name = "h",
		desc = "(B)V"
	)
	void method773() {
		this.field1252 = class85.method356(this.field1256).method372().field733;
		this.field1253 = this.field1251.method689(class25.method100(this.field1252));
		class396 var2 = class25.method100(this.method1910());
		class266 var3 = var2.method1946(false);
		if (null != var3) {
			this.field1250 = var3.field2200;
			this.field1255 = var3.field2199;
		} else {
			this.field1250 = 0;
			this.field1255 = 0;
		}

	}

	@ObfInfo(
		owner = "ip",
		name = "e",
		desc = "(I)I"
	)
	public int method1910() {
		return this.field1252;
	}

	@ObfInfo(
		owner = "ip",
		name = "v",
		desc = "(I)Lii;"
	)
	class23 method1911() {
		return this.field1253;
	}

	@ObfInfo(
		owner = "ip",
		name = "x",
		desc = "(I)I"
	)
	int method1906() {
		return this.field1250;
	}

	@ObfInfo(
		owner = "ip",
		name = "m",
		desc = "(I)I"
	)
	int method1912() {
		return this.field1255;
	}

	@ObfInfo(
		owner = "ip",
		name = "h",
		desc = "(Lly;I)V"
	)
	public static void method780(class274 var0) {
		class209.field1815 = var0;
	}

	@ObfInfo(
		owner = "ip",
		name = "h",
		desc = "(Lly;Lly;Lly;I)V"
	)
	public static void method781(class274 var0, class274 var1, class274 var2) {
		class242.field2027 = var0;
		class242.field2028 = var1;
		class309.field2462 = var2;
	}

	@ObfInfo(
		owner = "ip",
		name = "v",
		desc = "(CI)C"
	)
	static char method778(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfInfo(
		owner = "ip",
		name = "g",
		desc = "(Lhc;[Lgw;I)V"
	)
	static final void method779(class318 var0, class427[] var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		for (var3 = 0; var3 < 4; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					if ((class71.field644[var3][var4][var5] & 1) == 1) {
						var6 = var3;
						if (2 == (class71.field644[1][var4][var5] & 2)) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							var1[var6].method2084(var4, var5);
						}
					}
				}
			}
		}

		class71.field649 += (int)(Math.random() * 5.0D) - 2;
		if (class71.field649 < -8) {
			class71.field649 = -8;
		}

		if (class71.field649 > 8) {
			class71.field649 = 8;
		}

		class71.field650 += (int)(Math.random() * 5.0D) - 2;
		if (class71.field650 < -16) {
			class71.field650 = -16;
		}

		if (class71.field650 > 16) {
			class71.field650 = 16;
		}

		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		for (var3 = 0; var3 < 4; ++var3) {
			byte[][] var46 = class36.field182[var3];
			boolean var52 = true;
			boolean var53 = true;
			boolean var7 = true;
			boolean var8 = true;
			boolean var9 = true;
			var10 = (int)Math.sqrt(5100.0D);
			var11 = var10 * 768 >> 8;

			int var20;
			int var21;
			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var14 = class71.field636[var3][var13 + 1][var12] - class71.field636[var3][var13 - 1][var12];
					var15 = class71.field636[var3][var13][var12 + 1] - class71.field636[var3][var13][var12 - 1];
					var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
					var17 = (var14 << 8) / var16;
					var18 = 65536 / var16;
					var19 = (var15 << 8) / var16;
					var20 = 96 + (var19 * -50 + var18 * -10 + var17 * -50) / var11;
					var21 = (var46[var13][var12] >> 1) + (var46[var13][var12 + 1] >> 3) + (var46[var13][var12 - 1] >> 2) + (var46[var13 + 1][var12] >> 3) + (var46[var13 - 1][var12] >> 2);
					class71.field640[var13][var12] = var20 - var21;
				}
			}

			for (var12 = 0; var12 < 104; ++var12) {
				class71.field641[var12] = 0;
				class233.field1986[var12] = 0;
				class71.field648[var12] = 0;
				class267.field2214[var12] = 0;
				class365.field3099[var12] = 0;
			}

			for (var12 = -5; var12 < 109; ++var12) {
				for (var13 = 0; var13 < 104; ++var13) {
					var14 = var12 + 5;
					int var10002;
					if (var14 >= 0 && var14 < 104) {
						var15 = client.field228 < 209 ? (int)class232.method1003(8) : (int)class232.method1003(15);
						var16 = class71.field638[var3][var14][var13] & var15;
						if (var16 > 0) {
							class313 var47 = class32.method140(var16 - 1);
							var10000 = class71.field641;
							var10000[var13] += var47.field2468;
							var10000 = class233.field1986;
							var10000[var13] += var47.field2469;
							var10000 = class71.field648;
							var10000[var13] += var47.field2471;
							var10000 = class267.field2214;
							var10000[var13] += var47.field2474;
							var10002 = class365.field3099[var13]++;
						}
					}

					var15 = var12 - 5;
					if (var15 >= 0 && var15 < 104) {
						var16 = client.field228 < 209 ? (int)class232.method1003(8) : (int)class232.method1003(15);
						var17 = class71.field638[var3][var15][var13] & var16;
						if (var17 > 0) {
							class313 var48 = class32.method140(var17 - 1);
							var10000 = class71.field641;
							var10000[var13] -= var48.field2468;
							var10000 = class233.field1986;
							var10000[var13] -= var48.field2469;
							var10000 = class71.field648;
							var10000[var13] -= var48.field2471;
							var10000 = class267.field2214;
							var10000[var13] -= var48.field2474;
							var10002 = class365.field3099[var13]--;
						}
					}
				}

				if (var12 >= 1 && var12 < 103) {
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;
					var17 = 0;

					for (var18 = -5; var18 < 109; ++var18) {
						var19 = var18 + 5;
						if (var19 >= 0 && var19 < 104) {
							var13 += class71.field641[var19];
							var14 += class233.field1986[var19];
							var15 += class71.field648[var19];
							var16 += class267.field2214[var19];
							var17 += class365.field3099[var19];
						}

						var20 = var18 - 5;
						if (var20 >= 0 && var20 < 104) {
							var13 -= class71.field641[var20];
							var14 -= class233.field1986[var20];
							var15 -= class71.field648[var20];
							var16 -= class267.field2214[var20];
							var17 -= class365.field3099[var20];
						}

						if (var18 >= 1 && var18 < 103 && (!client.field274 || 0 != (class71.field644[0][var12][var18] & 2) || 0 == (class71.field644[var3][var12][var18] & 16))) {
							if (var3 < class71.field637) {
								class71.field637 = var3;
							}

							var21 = client.field228 < 209 ? (int)class232.method1003(8) : (int)class232.method1003(15);
							int var22 = class71.field638[var3][var12][var18] & var21;
							int var23 = class419.field3433[var3][var12][var18] & var21;
							if (var22 > 0 || var23 > 0) {
								int var24 = class71.field636[var3][var12][var18];
								int var25 = class71.field636[var3][var12 + 1][var18];
								int var26 = class71.field636[var3][var12 + 1][var18 + 1];
								int var27 = class71.field636[var3][var12][var18 + 1];
								int var28 = class71.field640[var12][var18];
								int var29 = class71.field640[var12 + 1][var18];
								int var30 = class71.field640[var12 + 1][var18 + 1];
								int var31 = class71.field640[var12][var18 + 1];
								int var32 = -1;
								int var33 = -1;
								int var34;
								int var35;
								int var36;
								if (var22 > 0) {
									var34 = var13 * 256 / var16;
									var35 = var14 / var17;
									var36 = var15 / var17;
									var32 = class232.method1004(var34, var35, var36);
									var34 = class71.field649 + var34 & 255;
									var36 += class71.field650;
									if (var36 < 0) {
										var36 = 0;
									} else if (var36 > 255) {
										var36 = 255;
									}

									var33 = class232.method1004(var34, var35, var36);
								}

								class179 var37;
								if (var3 > 0) {
									boolean var58 = true;
									if (var22 == 0 && 0 != class71.field643[var3][var12][var18]) {
										var58 = false;
									}

									if (var23 > 0) {
										var36 = var23 - 1;
										var37 = (class179)class179.field1647.method394((long)var36);
										class179 var49;
										if (null != var37) {
											var49 = var37;
										} else {
											byte[] var51 = class179.field1646.method1365(4, var36);
											var37 = new class179();
											if (var51 != null) {
												var37.method815(new class127(var51), var36);
											}

											var37.method814();
											class179.field1647.method396(var37, (long)var36);
											var49 = var37;
										}

										if (!var49.field1650) {
											var58 = false;
										}
									}

									if (var58 && var25 == var24 && var24 == var26 && var27 == var24) {
										var10000 = class210.field1819[var3][var12];
										var10000[var18] |= 2340;
									}
								}

								var34 = 0;
								if (var33 != -1) {
									var34 = class341.field2740[class475.method2354(var33, 96)];
								}

								if (var23 == 0) {
									var0.method1564(var3, var12, var18, 0, 0, -1, var24, var25, var26, var27, class475.method2354(var32, var28), class475.method2354(var32, var29), class475.method2354(var32, var30), class475.method2354(var32, var31), 0, 0, 0, 0, var34, 0);
								} else {
									var35 = 1 + class71.field643[var3][var12][var18];
									byte var59 = class471.field3958[var3][var12][var18];
									int var38 = var23 - 1;
									class179 var39 = (class179)class179.field1647.method394((long)var38);
									if (null != var39) {
										var37 = var39;
									} else {
										byte[] var50 = class179.field1646.method1365(4, var38);
										var39 = new class179();
										if (null != var50) {
											var39.method815(new class127(var50), var38);
										}

										var39.method814();
										class179.field1647.method396(var39, (long)var38);
										var37 = var39;
									}

									int var40 = var37.field1649;
									int var41;
									int var42;
									int var43;
									int var44;
									if (var40 >= 0) {
										var42 = class341.field2728.method1496(var40);
										var41 = -1;
									} else if (16711935 == var37.field1648) {
										var41 = -2;
										var40 = -1;
										var42 = -2;
									} else {
										var41 = class232.method1004(var37.field1654, var37.field1652, var37.field1653);
										var43 = var37.field1654 + class71.field649 & 255;
										var44 = class71.field650 + var37.field1653;
										if (var44 < 0) {
											var44 = 0;
										} else if (var44 > 255) {
											var44 = 255;
										}

										var42 = class232.method1004(var43, var37.field1652, var44);
									}

									var43 = 0;
									if (var42 != -2) {
										var43 = class341.field2740[class212.method917(var42, 96)];
									}

									if (var37.field1651 != -1) {
										var44 = class71.field649 + var37.field1655 & 255;
										int var45 = var37.field1657 + class71.field650;
										if (var45 < 0) {
											var45 = 0;
										} else if (var45 > 255) {
											var45 = 255;
										}

										var42 = class232.method1004(var44, var37.field1656, var45);
										var43 = class341.field2740[class212.method917(var42, 96)];
									}

									var0.method1564(var3, var12, var18, var35, var59, var40, var24, var25, var26, var27, class475.method2354(var32, var28), class475.method2354(var32, var29), class475.method2354(var32, var30), class475.method2354(var32, var31), class212.method917(var41, var28), class212.method917(var41, var29), class212.method917(var41, var30), class212.method917(var41, var31), var34, var43);
								}
							}
						}
					}
				}
			}

			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var0.method1563(var3, var13, var12, class439.method2176(var3, var13, var12));
				}
			}

			class71.field638[var3] = (short[][])null;
			class419.field3433[var3] = (short[][])null;
			class71.field643[var3] = (byte[][])null;
			class471.field3958[var3] = (byte[][])null;
			class36.field182[var3] = (byte[][])null;
		}

		var0.method1582(-50, -10, -50);

		for (var3 = 0; var3 < 104; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				if ((class71.field644[1][var3][var4] & 2) == 2) {
					var0.method1562(var3, var4);
				}
			}
		}

		var3 = 1;
		var4 = 2;
		var5 = 4;

		for (var6 = 0; var6 < 4; ++var6) {
			if (var6 > 0) {
				var3 <<= 3;
				var4 <<= 3;
				var5 <<= 3;
			}

			for (int var54 = 0; var54 <= var6; ++var54) {
				for (int var55 = 0; var55 <= 104; ++var55) {
					for (int var56 = 0; var56 <= 104; ++var56) {
						short var57;
						if (0 != (class210.field1819[var54][var56][var55] & var3)) {
							var10 = var55;
							var11 = var55;
							var12 = var54;

							for (var13 = var54; var10 > 0 && 0 != (class210.field1819[var54][var56][var10 - 1] & var3); --var10) {
							}

							while (var11 < 104 && (class210.field1819[var54][var56][var11 + 1] & var3) != 0) {
								++var11;
							}

							label364:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if (0 == (class210.field1819[var12 - 1][var56][var14] & var3)) {
										break label364;
									}
								}

								--var12;
							}

							label353:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class210.field1819[var13 + 1][var56][var14] & var3) == 0) {
										break label353;
									}
								}

								++var13;
							}

							var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
							if (var14 >= 8) {
								var57 = 240;
								var16 = class71.field636[var13][var56][var10] - var57;
								var17 = class71.field636[var12][var56][var10];
								class318.method1609(var6, 1, var56 * 128, var56 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class210.field1819[var18][var56];
										var10000[var19] &= ~var3;
									}
								}
							}
						}

						if (0 != (class210.field1819[var54][var56][var55] & var4)) {
							var10 = var56;
							var11 = var56;
							var12 = var54;

							for (var13 = var54; var10 > 0 && (class210.field1819[var54][var10 - 1][var55] & var4) != 0; --var10) {
							}

							while (var11 < 104 && 0 != (class210.field1819[var54][var11 + 1][var55] & var4)) {
								++var11;
							}

							label417:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class210.field1819[var12 - 1][var14][var55] & var4) == 0) {
										break label417;
									}
								}

								--var12;
							}

							label406:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class210.field1819[var13 + 1][var14][var55] & var4) == 0) {
										break label406;
									}
								}

								++var13;
							}

							var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
							if (var14 >= 8) {
								var57 = 240;
								var16 = class71.field636[var13][var10][var55] - var57;
								var17 = class71.field636[var12][var10][var55];
								class318.method1609(var6, 2, var10 * 128, 128 + var11 * 128, var55 * 128, var55 * 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class210.field1819[var18][var19];
										var10000[var55] &= ~var4;
									}
								}
							}
						}

						if (0 != (class210.field1819[var54][var56][var55] & var5)) {
							var10 = var56;
							var11 = var56;
							var12 = var55;

							for (var13 = var55; var12 > 0 && (class210.field1819[var54][var56][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < 104 && (class210.field1819[var54][var56][var13 + 1] & var5) != 0) {
								++var13;
							}

							label470:
							while (var10 > 0) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if (0 == (class210.field1819[var54][var10 - 1][var14] & var5)) {
										break label470;
									}
								}

								--var10;
							}

							label459:
							while (var11 < 104) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class210.field1819[var54][var11 + 1][var14] & var5) == 0) {
										break label459;
									}
								}

								++var11;
							}

							if ((var13 - var12 + 1) * (1 + (var11 - var10)) >= 4) {
								var14 = class71.field636[var54][var10][var12];
								class318.method1609(var6, 4, var10 * 128, 128 + var11 * 128, var12 * 128, var13 * 128 + 128, var14, var14);

								for (var15 = var10; var15 <= var11; ++var15) {
									for (var16 = var12; var16 <= var13; ++var16) {
										var10000 = class210.field1819[var54][var15];
										var10000[var16] &= ~var5;
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
