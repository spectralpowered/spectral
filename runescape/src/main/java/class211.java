public class class211 {
	public static boolean field2479;
	public static int field2481;
	public static int field2485;
	static boolean field2462;
	static boolean field2476;
	static boolean[][] field2505;
	static boolean[][][][] field2504;
	static class224[] field2445;
	static class230[] field2489;
	static class230[][] field2482;
	static class355 field2490;
	static int field2447;
	static int field2449;
	static int field2451;
	static int field2456;
	static int field2457;
	static int field2459;
	static int field2460;
	static int field2461;
	static int field2463;
	static int field2464;
	static int field2465;
	static int field2466;
	static int field2468;
	static int field2469;
	static int field2470;
	static int field2473;
	static int field2474;
	static int field2475;
	static int field2477;
	static int field2478;
	static int field2483;
	static int field2487;
	static int field2488;
	static int field2506;
	static int field2507;
	static int field2508;
	static int field2510;
	static int[] field2500;
	static final int[] field2471;
	static final int[] field2491;
	static final int[] field2492;
	static final int[] field2493;
	static final int[] field2494;
	static final int[] field2496;
	static final int[] field2497;
	class213[][][] field2450;
	class224[] field2509;
	int field2446;
	int field2448;
	int field2452;
	int field2455;
	int field2486;
	int[][] field2501;
	int[][] field2503;
	int[][][] field2454;
	int[][][] field2499;

	static {
		field2479 = true;
		field2459 = 0;
		field2460 = 0;
		field2445 = new class224[100];
		field2476 = false;
		field2477 = 0;
		field2478 = 0;
		field2456 = 0;
		field2481 = -1;
		field2485 = -1;
		field2462 = false;
		field2457 = 4;
		field2500 = new int[field2457];
		field2482 = new class230[field2457][500];
		field2488 = 0;
		field2489 = new class230[500];
		field2490 = new class355();
		field2491 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
		field2492 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
		field2493 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
		field2494 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
		field2471 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
		field2496 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
		field2497 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
		field2504 = new boolean[8][32][51][51];
	}

	public class211(int var1, int var2, int var3, int[][][] var4) {
		this.field2455 = 0;
		this.field2452 = 0;
		this.field2509 = new class224[5000];
		this.field2501 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
		this.field2503 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
		this.field2446 = var1;
		this.field2486 = var2;
		this.field2448 = var3;
		this.field2450 = new class213[var1][var2][var3];
		this.field2454 = new int[var1][var2 + 1][var3 + 1];
		this.field2499 = var4;
		this.method4152();
	}

	public void method4152() {
		int var1;
		int var2;
		for (var1 = 0; var1 < this.field2446; ++var1) {
			for (var2 = 0; var2 < this.field2486; ++var2) {
				for (int var3 = 0; var3 < this.field2448; ++var3) {
					this.field2450[var1][var2][var3] = null;
				}
			}
		}

		for (var1 = 0; var1 < field2457; ++var1) {
			for (var2 = 0; var2 < field2500[var1]; ++var2) {
				field2482[var1][var2] = null;
			}

			field2500[var1] = 0;
		}

		for (var1 = 0; var1 < this.field2452; ++var1) {
			this.field2509[var1] = null;
		}

		this.field2452 = 0;

		for (var1 = 0; var1 < field2445.length; ++var1) {
			field2445[var1] = null;
		}

	}

	public void method4258(int var1) {
		this.field2455 = var1;

		for (int var2 = 0; var2 < this.field2486; ++var2) {
			for (int var3 = 0; var3 < this.field2448; ++var3) {
				if (this.field2450[var1][var2][var3] == null) {
					this.field2450[var1][var2][var3] = new class213(var1, var2, var3);
				}
			}
		}

	}

	public void method4154(int var1, int var2) {
		class213 var3 = this.field2450[0][var1][var2];

		for (int var4 = 0; var4 < 3; ++var4) {
			class213 var5 = this.field2450[var4][var1][var2] = this.field2450[var4 + 1][var1][var2];
			if (var5 != null) {
				--var5.field2533;

				for (int var6 = 0; var6 < var5.field2523; ++var6) {
					class224 var7 = var5.field2524[var6];
					long var9 = var7.field2724;
					boolean var8 = class215.method6099(var9) == 2;
					if (var8 && var7.field2722 == var1 && var7.field2720 == var2) {
						--var7.field2718;
					}
				}
			}
		}

		if (this.field2450[0][var1][var2] == null) {
			this.field2450[0][var1][var2] = new class213(0, var1, var2);
		}

		this.field2450[0][var1][var2].field2528 = var3;
		this.field2450[3][var1][var2] = null;
	}

	public static void method4281(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		class230 var8 = new class230();
		var8.field2763 = var2 / 128;
		var8.field2764 = var3 / 128;
		var8.field2769 = var4 / 128;
		var8.field2774 = var5 / 128;
		var8.field2767 = var1;
		var8.field2768 = var2;
		var8.field2771 = var3;
		var8.field2770 = var4;
		var8.field2765 = var5;
		var8.field2772 = var6;
		var8.field2773 = var7;
		field2482[var0][field2500[var0]++] = var8;
	}

	public void method4156(int var1, int var2, int var3, int var4) {
		class213 var5 = this.field2450[var1][var2][var3];
		if (var5 != null) {
			this.field2450[var1][var2][var3].field2527 = var4;
		}
	}

	public void method4157(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
		class218 var21;
		int var22;
		if (var4 == 0) {
			var21 = new class218(var11, var12, var13, var14, -1, var19, false);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2450[var22][var2][var3] == null) {
					this.field2450[var22][var2][var3] = new class213(var22, var2, var3);
				}
			}

			this.field2450[var1][var2][var3].field2513 = var21;
		} else if (var4 != 1) {
			class233 var23 = new class233(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2450[var22][var2][var3] == null) {
					this.field2450[var22][var2][var3] = new class213(var22, var2, var3);
				}
			}

			this.field2450[var1][var2][var3].field2518 = var23;
		} else {
			var21 = new class218(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);

			for (var22 = var1; var22 >= 0; --var22) {
				if (this.field2450[var22][var2][var3] == null) {
					this.field2450[var22][var2][var3] = new class213(var22, var2, var3);
				}
			}

			this.field2450[var1][var2][var3].field2513 = var21;
		}
	}

	public void method4158(int var1, int var2, int var3, int var4, class226 var5, long var6, int var8) {
		if (var5 != null) {
			class227 var9 = new class227();
			var9.field2744 = var5;
			var9.field2742 = var2 * 128 + 64;
			var9.field2741 = var3 * 128 + 64;
			var9.field2748 = var4;
			var9.field2745 = var6;
			var9.field2746 = var8;
			if (this.field2450[var1][var2][var3] == null) {
				this.field2450[var1][var2][var3] = new class213(var1, var2, var3);
			}

			this.field2450[var1][var2][var3].field2521 = var9;
		}
	}

	public void method4159(int var1, int var2, int var3, int var4, class226 var5, long var6, class226 var8, class226 var9) {
		class207 var10 = new class207();
		var10.field2367 = var5;
		var10.field2364 = var2 * 128 + 64;
		var10.field2366 = var3 * 128 + 64;
		var10.field2365 = var4;
		var10.field2371 = var6;
		var10.field2368 = var8;
		var10.field2369 = var9;
		int var11 = 0;
		class213 var12 = this.field2450[var1][var2][var3];
		if (var12 != null) {
			for (int var13 = 0; var13 < var12.field2523; ++var13) {
				if ((var12.field2524[var13].field2725 & 256) == 256 && var12.field2524[var13].field2714 instanceof class216) {
					class216 var14 = (class216)var12.field2524[var13].field2714;
					var14.method4412();
					if (var14.field2740 > var11) {
						var11 = var14.field2740;
					}
				}
			}
		}

		var10.field2370 = var11;
		if (this.field2450[var1][var2][var3] == null) {
			this.field2450[var1][var2][var3] = new class213(var1, var2, var3);
		}

		this.field2450[var1][var2][var3].field2522 = var10;
	}

	public void method4160(int var1, int var2, int var3, int var4, class226 var5, class226 var6, int var7, int var8, long var9, int var11) {
		if (var5 != null || var6 != null) {
			class225 var12 = new class225();
			var12.field2737 = var9;
			var12.field2735 = var11;
			var12.field2731 = var2 * 128 + 64;
			var12.field2733 = var3 * 128 + 64;
			var12.field2734 = var4;
			var12.field2730 = var5;
			var12.field2736 = var6;
			var12.field2738 = var7;
			var12.field2732 = var8;

			for (int var13 = var1; var13 >= 0; --var13) {
				if (this.field2450[var13][var2][var3] == null) {
					this.field2450[var13][var2][var3] = new class213(var13, var2, var3);
				}
			}

			this.field2450[var1][var2][var3].field2519 = var12;
		}
	}

	public void method4161(int var1, int var2, int var3, int var4, class226 var5, class226 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
		if (var5 != null) {
			class210 var14 = new class210();
			var14.field2432 = var11;
			var14.field2435 = var13;
			var14.field2433 = var2 * 128 + 64;
			var14.field2434 = var3 * 128 + 64;
			var14.field2444 = var4;
			var14.field2439 = var5;
			var14.field2440 = var6;
			var14.field2441 = var7;
			var14.field2436 = var8;
			var14.field2442 = var9;
			var14.field2438 = var10;

			for (int var15 = var1; var15 >= 0; --var15) {
				if (this.field2450[var15][var2][var3] == null) {
					this.field2450[var15][var2][var3] = new class213(var15, var2, var3);
				}
			}

			this.field2450[var1][var2][var3].field2520 = var14;
		}
	}

	public boolean method4162(int var1, int var2, int var3, int var4, int var5, int var6, class226 var7, int var8, long var9, int var11) {
		if (var7 == null) {
			return true;
		} else {
			int var12 = var2 * 128 + var5 * 64;
			int var13 = var3 * 128 + var6 * 64;
			return this.method4165(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
		}
	}

	public boolean method4261(int var1, int var2, int var3, int var4, int var5, class226 var6, int var7, long var8, boolean var10) {
		if (var6 == null) {
			return true;
		} else {
			int var11 = var2 - var5;
			int var12 = var3 - var5;
			int var13 = var2 + var5;
			int var14 = var3 + var5;
			if (var10) {
				if (var7 > 640 && var7 < 1408) {
					var14 += 128;
				}

				if (var7 > 1152 && var7 < 1920) {
					var13 += 128;
				}

				if (var7 > 1664 || var7 < 384) {
					var12 -= 128;
				}

				if (var7 > 128 && var7 < 896) {
					var11 -= 128;
				}
			}

			var11 /= 128;
			var12 /= 128;
			var13 /= 128;
			var14 /= 128;
			return this.method4165(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
		}
	}

	public boolean method4164(int var1, int var2, int var3, int var4, int var5, class226 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
		return var6 == null ? true : this.method4165(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
	}

	boolean method4165(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class226 var9, int var10, boolean var11, long var12, int var14) {
		int var16;
		for (int var15 = var2; var15 < var2 + var4; ++var15) {
			for (var16 = var3; var16 < var3 + var5; ++var16) {
				if (var15 < 0 || var16 < 0 || var15 >= this.field2486 || var16 >= this.field2448) {
					return false;
				}

				class213 var17 = this.field2450[var1][var15][var16];
				if (var17 != null && var17.field2523 >= 5) {
					return false;
				}
			}
		}

		class224 var21 = new class224();
		var21.field2724 = var12;
		var21.field2725 = var14;
		var21.field2718 = var1;
		var21.field2728 = var6;
		var21.field2715 = var7;
		var21.field2713 = var8;
		var21.field2714 = var9;
		var21.field2723 = var10;
		var21.field2722 = var2;
		var21.field2720 = var3;
		var21.field2719 = var2 + var4 - 1;
		var21.field2721 = var3 + var5 - 1;

		for (var16 = var2; var16 < var2 + var4; ++var16) {
			for (int var22 = var3; var22 < var3 + var5; ++var22) {
				int var18 = 0;
				if (var16 > var2) {
					++var18;
				}

				if (var16 < var2 + var4 - 1) {
					var18 += 4;
				}

				if (var22 > var3) {
					var18 += 8;
				}

				if (var22 < var3 + var5 - 1) {
					var18 += 2;
				}

				for (int var19 = var1; var19 >= 0; --var19) {
					if (this.field2450[var19][var16][var22] == null) {
						this.field2450[var19][var16][var22] = new class213(var19, var16, var22);
					}
				}

				class213 var23 = this.field2450[var1][var16][var22];
				var23.field2524[var23.field2523] = var21;
				var23.field2517[var23.field2523] = var18;
				var23.field2526 |= var18;
				++var23.field2523;
			}
		}

		if (var11) {
			this.field2509[this.field2452++] = var21;
		}

		return true;
	}

	public void method4166() {
		for (int var1 = 0; var1 < this.field2452; ++var1) {
			class224 var2 = this.field2509[var1];
			this.method4167(var2);
			this.field2509[var1] = null;
		}

		this.field2452 = 0;
	}

	void method4167(class224 var1) {
		for (int var2 = var1.field2722; var2 <= var1.field2719; ++var2) {
			for (int var3 = var1.field2720; var3 <= var1.field2721; ++var3) {
				class213 var4 = this.field2450[var1.field2718][var2][var3];
				if (var4 != null) {
					int var5;
					for (var5 = 0; var5 < var4.field2523; ++var5) {
						if (var4.field2524[var5] == var1) {
							--var4.field2523;

							for (int var6 = var5; var6 < var4.field2523; ++var6) {
								var4.field2524[var6] = var4.field2524[var6 + 1];
								var4.field2517[var6] = var4.field2517[var6 + 1];
							}

							var4.field2524[var4.field2523] = null;
							break;
						}
					}

					var4.field2526 = 0;

					for (var5 = 0; var5 < var4.field2523; ++var5) {
						var4.field2526 |= var4.field2517[var5];
					}
				}
			}
		}

	}

	public void method4168(int var1, int var2, int var3, int var4) {
		class213 var5 = this.field2450[var1][var2][var3];
		if (var5 != null) {
			class210 var6 = var5.field2520;
			if (var6 != null) {
				var6.field2442 = var6.field2442 * var4 / 16;
				var6.field2438 = var6.field2438 * var4 / 16;
			}
		}
	}

	public void method4264(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		if (var4 != null) {
			var4.field2519 = null;
		}
	}

	public void method4292(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		if (var4 != null) {
			var4.field2520 = null;
		}
	}

	public void method4231(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		if (var4 != null) {
			for (int var5 = 0; var5 < var4.field2523; ++var5) {
				class224 var6 = var4.field2524[var5];
				long var8 = var6.field2724;
				boolean var7 = class215.method6099(var8) == 2;
				if (var7 && var6.field2722 == var2 && var6.field2720 == var3) {
					this.method4167(var6);
					return;
				}
			}

		}
	}

	public void method4172(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		if (var4 != null) {
			var4.field2521 = null;
		}
	}

	public void method4173(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		if (var4 != null) {
			var4.field2522 = null;
		}
	}

	public class225 method4174(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		return var4 == null ? null : var4.field2519;
	}

	public class210 method4326(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		return var4 == null ? null : var4.field2520;
	}

	public class224 method4176(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		if (var4 == null) {
			return null;
		} else {
			for (int var5 = 0; var5 < var4.field2523; ++var5) {
				class224 var6 = var4.field2524[var5];
				long var8 = var6.field2724;
				boolean var7 = class215.method6099(var8) == 2;
				if (var7 && var6.field2722 == var2 && var6.field2720 == var3) {
					return var6;
				}
			}

			return null;
		}
	}

	public class227 method4251(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		return var4 != null && var4.field2521 != null ? var4.field2521 : null;
	}

	public long method4331(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		return var4 != null && var4.field2519 != null ? var4.field2519.field2737 : 0L;
	}

	public long method4276(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		return var4 != null && var4.field2520 != null ? var4.field2520.field2432 : 0L;
	}

	public long method4311(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		if (var4 == null) {
			return 0L;
		} else {
			for (int var5 = 0; var5 < var4.field2523; ++var5) {
				class224 var6 = var4.field2524[var5];
				long var8 = var6.field2724;
				boolean var7 = class215.method6099(var8) == 2;
				if (var7 && var6.field2722 == var2 && var6.field2720 == var3) {
					return var6.field2724;
				}
			}

			return 0L;
		}
	}

	public long method4181(int var1, int var2, int var3) {
		class213 var4 = this.field2450[var1][var2][var3];
		return var4 != null && var4.field2521 != null ? var4.field2521.field2745 : 0L;
	}

	public int method4275(int var1, int var2, int var3, long var4) {
		class213 var6 = this.field2450[var1][var2][var3];
		if (var6 == null) {
			return -1;
		} else if (var6.field2519 != null && var6.field2519.field2737 == var4) {
			return var6.field2519.field2735 & 255;
		} else if (var6.field2520 != null && var6.field2520.field2432 == var4) {
			return var6.field2520.field2435 & 255;
		} else if (var6.field2521 != null && var6.field2521.field2745 == var4) {
			return var6.field2521.field2746 & 255;
		} else {
			for (int var7 = 0; var7 < var6.field2523; ++var7) {
				if (var6.field2524[var7].field2724 == var4) {
					return var6.field2524[var7].field2725 & 255;
				}
			}

			return -1;
		}
	}

	public void method4183(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2446; ++var4) {
			for (int var5 = 0; var5 < this.field2486; ++var5) {
				for (int var6 = 0; var6 < this.field2448; ++var6) {
					class213 var7 = this.field2450[var4][var5][var6];
					if (var7 != null) {
						class225 var8 = var7.field2519;
						class191 var10;
						if (var8 != null && var8.field2730 instanceof class191) {
							class191 var9 = (class191)var8.field2730;
							this.method4224(var9, var4, var5, var6, 1, 1);
							if (var8.field2736 instanceof class191) {
								var10 = (class191)var8.field2736;
								this.method4224(var10, var4, var5, var6, 1, 1);
								class191.method3667(var9, var10, 0, 0, 0, false);
								var8.field2736 = var10.method3668(var10.field2100, var10.field2108, var1, var2, var3);
							}

							var8.field2730 = var9.method3668(var9.field2100, var9.field2108, var1, var2, var3);
						}

						for (int var12 = 0; var12 < var7.field2523; ++var12) {
							class224 var14 = var7.field2524[var12];
							if (var14 != null && var14.field2714 instanceof class191) {
								class191 var11 = (class191)var14.field2714;
								this.method4224(var11, var4, var5, var6, var14.field2719 - var14.field2722 + 1, var14.field2721 - var14.field2720 + 1);
								var14.field2714 = var11.method3668(var11.field2100, var11.field2108, var1, var2, var3);
							}
						}

						class227 var13 = var7.field2521;
						if (var13 != null && var13.field2744 instanceof class191) {
							var10 = (class191)var13.field2744;
							this.method4184(var10, var4, var5, var6);
							var13.field2744 = var10.method3668(var10.field2100, var10.field2108, var1, var2, var3);
						}
					}
				}
			}
		}

	}

	void method4184(class191 var1, int var2, int var3, int var4) {
		class213 var5;
		class191 var6;
		if (var3 < this.field2486) {
			var5 = this.field2450[var2][var3 + 1][var4];
			if (var5 != null && var5.field2521 != null && var5.field2521.field2744 instanceof class191) {
				var6 = (class191)var5.field2521.field2744;
				class191.method3667(var1, var6, 128, 0, 0, true);
			}
		}

		if (var4 < this.field2486) {
			var5 = this.field2450[var2][var3][var4 + 1];
			if (var5 != null && var5.field2521 != null && var5.field2521.field2744 instanceof class191) {
				var6 = (class191)var5.field2521.field2744;
				class191.method3667(var1, var6, 0, 0, 128, true);
			}
		}

		if (var3 < this.field2486 && var4 < this.field2448) {
			var5 = this.field2450[var2][var3 + 1][var4 + 1];
			if (var5 != null && var5.field2521 != null && var5.field2521.field2744 instanceof class191) {
				var6 = (class191)var5.field2521.field2744;
				class191.method3667(var1, var6, 128, 0, 128, true);
			}
		}

		if (var3 < this.field2486 && var4 > 0) {
			var5 = this.field2450[var2][var3 + 1][var4 - 1];
			if (var5 != null && var5.field2521 != null && var5.field2521.field2744 instanceof class191) {
				var6 = (class191)var5.field2521.field2744;
				class191.method3667(var1, var6, 128, 0, -128, true);
			}
		}

	}

	void method4224(class191 var1, int var2, int var3, int var4, int var5, int var6) {
		boolean var7 = true;
		int var8 = var3;
		int var9 = var3 + var5;
		int var10 = var4 - 1;
		int var11 = var4 + var6;

		for (int var12 = var2; var12 <= var2 + 1; ++var12) {
			if (var12 != this.field2446) {
				for (int var13 = var8; var13 <= var9; ++var13) {
					if (var13 >= 0 && var13 < this.field2486) {
						for (int var14 = var10; var14 <= var11; ++var14) {
							if (var14 >= 0 && var14 < this.field2448 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
								class213 var15 = this.field2450[var12][var13][var14];
								if (var15 != null) {
									int var16 = (this.field2499[var12][var13][var14] + this.field2499[var12][var13 + 1][var14] + this.field2499[var12][var13][var14 + 1] + this.field2499[var12][var13 + 1][var14 + 1]) / 4 - (this.field2499[var2][var3][var4] + this.field2499[var2][var3 + 1][var4] + this.field2499[var2][var3][var4 + 1] + this.field2499[var2][var3 + 1][var4 + 1]) / 4;
									class225 var17 = var15.field2519;
									if (var17 != null) {
										class191 var18;
										if (var17.field2730 instanceof class191) {
											var18 = (class191)var17.field2730;
											class191.method3667(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}

										if (var17.field2736 instanceof class191) {
											var18 = (class191)var17.field2736;
											class191.method3667(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
										}
									}

									for (int var23 = 0; var23 < var15.field2523; ++var23) {
										class224 var19 = var15.field2524[var23];
										if (var19 != null && var19.field2714 instanceof class191) {
											class191 var20 = (class191)var19.field2714;
											int var21 = var19.field2719 - var19.field2722 + 1;
											int var22 = var19.field2721 - var19.field2720 + 1;
											class191.method3667(var1, var20, (var19.field2722 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field2720 - var4) * 128 + (var22 - var6) * 64, var7);
										}
									}
								}
							}
						}
					}
				}

				--var8;
				var7 = false;
			}
		}

	}

	public void method4186(int[] var1, int var2, int var3, int var4, int var5, int var6) {
		class213 var7 = this.field2450[var4][var5][var6];
		if (var7 != null) {
			class218 var8 = var7.field2513;
			int var10;
			if (var8 != null) {
				int var9 = var8.field2642;
				if (var9 != 0) {
					for (var10 = 0; var10 < 4; ++var10) {
						var1[var2] = var9;
						var1[var2 + 1] = var9;
						var1[var2 + 2] = var9;
						var1[var2 + 3] = var9;
						var2 += var3;
					}

				}
			} else {
				class233 var18 = var7.field2518;
				if (var18 != null) {
					var10 = var18.field2796;
					int var11 = var18.field2817;
					int var12 = var18.field2803;
					int var13 = var18.field2813;
					int[] var14 = this.field2501[var10];
					int[] var15 = this.field2503[var11];
					int var16 = 0;
					int var17;
					if (var12 != 0) {
						for (var17 = 0; var17 < 4; ++var17) {
							var1[var2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 1] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 2] = var14[var15[var16++]] == 0 ? var12 : var13;
							var1[var2 + 3] = var14[var15[var16++]] == 0 ? var12 : var13;
							var2 += var3;
						}
					} else {
						for (var17 = 0; var17 < 4; ++var17) {
							if (var14[var15[var16++]] != 0) {
								var1[var2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 1] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 2] = var13;
							}

							if (var14[var15[var16++]] != 0) {
								var1[var2 + 3] = var13;
							}

							var2 += var3;
						}
					}

				}
			}
		}
	}

	public static void method4187(int[] var0, int var1, int var2, int var3, int var4) {
		field2508 = 0;
		field2447 = 0;
		field2510 = var3;
		field2487 = var4;
		field2506 = var3 / 2;
		field2507 = var4 / 2;
		boolean[][][][] var5 = new boolean[var0.length][32][53][53];

		int var6;
		int var7;
		int var8;
		int var9;
		int var11;
		int var12;
		for (var6 = 128; var6 <= 383; var6 += 32) {
			for (var7 = 0; var7 < 2048; var7 += 64) {
				field2449 = class221.field2667[var6];
				field2475 = class221.field2690[var6];
				field2473 = class221.field2667[var7];
				field2474 = class221.field2690[var7];
				var8 = (var6 - 128) / 32;
				var9 = var7 / 64;

				for (int var10 = -26; var10 < 26; ++var10) {
					for (var11 = -26; var11 < 26; ++var11) {
						var12 = var10 * 128;
						int var13 = var11 * 128;
						boolean var14 = false;

						for (int var15 = -var1; var15 <= var2; var15 += 128) {
							if (method4188(var12, var0[var8] + var15, var13)) {
								var14 = true;
								break;
							}
						}

						var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
					}
				}
			}
		}

		for (var6 = 0; var6 < 8; ++var6) {
			for (var7 = 0; var7 < 32; ++var7) {
				for (var8 = -25; var8 < 25; ++var8) {
					for (var9 = -25; var9 < 25; ++var9) {
						boolean var16 = false;

						label76:
						for (var11 = -1; var11 <= 1; ++var11) {
							for (var12 = -1; var12 <= 1; ++var12) {
								if (var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}

								if (var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
									var16 = true;
									break label76;
								}
							}
						}

						field2504[var6][var7][var8 + 25][var9 + 25] = var16;
					}
				}
			}
		}

	}

	static boolean method4188(int var0, int var1, int var2) {
		int var3 = var2 * field2473 + var0 * field2474 >> 16;
		int var4 = var2 * field2474 - var0 * field2473 >> 16;
		int var5 = var1 * field2449 + var4 * field2475 >> 16;
		int var6 = var1 * field2475 - var4 * field2449 >> 16;
		if (var5 >= 50 && var5 <= 3500) {
			int var7 = field2506 + var3 * 128 / var5;
			int var8 = field2507 + var6 * 128 / var5;
			return var7 >= field2508 && var7 <= field2510 && var8 >= field2447 && var8 <= field2487;
		} else {
			return false;
		}
	}

	public void method4210(int var1, int var2, int var3, boolean var4) {
		if (!method4191() || var4) {
			field2476 = true;
			field2462 = var4;
			field2477 = var1;
			field2478 = var2;
			field2456 = var3;
			field2481 = -1;
			field2485 = -1;
		}
	}

	public void method4265() {
		field2462 = true;
	}

	public static boolean method4191() {
		return field2462 && field2481 != -1;
	}

	public static void method4192() {
		field2481 = -1;
		field2462 = false;
	}

	public void method4193(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 < 0) {
			var1 = 0;
		} else if (var1 >= this.field2486 * 128) {
			var1 = this.field2486 * 128 - 1;
		}

		if (var3 < 0) {
			var3 = 0;
		} else if (var3 >= this.field2448 * 128) {
			var3 = this.field2448 * 128 - 1;
		}

		if (var4 < 128) {
			var4 = 128;
		} else if (var4 > 383) {
			var4 = 383;
		}

		++field2461;
		field2449 = class221.field2667[var4];
		field2475 = class221.field2690[var4];
		field2473 = class221.field2667[var5];
		field2474 = class221.field2690[var5];
		field2505 = field2504[(var4 - 128) / 32][var5 / 64];
		field2468 = var1;
		field2469 = var2;
		field2470 = var3;
		field2466 = var1 / 128;
		field2465 = var3 / 128;
		field2460 = var6;
		field2483 = field2466 - 25;
		if (field2483 < 0) {
			field2483 = 0;
		}

		field2464 = field2465 - 25;
		if (field2464 < 0) {
			field2464 = 0;
		}

		field2463 = field2466 + 25;
		if (field2463 > this.field2486) {
			field2463 = this.field2486;
		}

		field2451 = field2465 + 25;
		if (field2451 > this.field2448) {
			field2451 = this.field2448;
		}

		this.method4199();
		field2459 = 0;

		int var7;
		class213[][] var8;
		int var9;
		int var10;
		for (var7 = this.field2455; var7 < this.field2446; ++var7) {
			var8 = this.field2450[var7];

			for (var9 = field2483; var9 < field2463; ++var9) {
				for (var10 = field2464; var10 < field2451; ++var10) {
					class213 var11 = var8[var9][var10];
					if (var11 != null) {
						if (var11.field2527 > var6 || !field2505[var9 - field2466 + 25][var10 - field2465 + 25] && this.field2499[var7][var9][var10] - var2 < 2000) {
							var11.field2535 = false;
							var11.field2529 = false;
							var11.field2531 = 0;
						} else {
							var11.field2535 = true;
							var11.field2529 = true;
							if (var11.field2523 > 0) {
								var11.field2530 = true;
							} else {
								var11.field2530 = false;
							}

							++field2459;
						}
					}
				}
			}
		}

		int var12;
		int var13;
		int var14;
		class213 var15;
		int var16;
		for (var7 = this.field2455; var7 < this.field2446; ++var7) {
			var8 = this.field2450[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field2466 + var9;
				var16 = field2466 - var9;
				if (var10 >= field2483 || var16 < field2463) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field2465 + var12;
						var14 = field2465 - var12;
						if (var10 >= field2483) {
							if (var13 >= field2464) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field2535) {
									this.method4194(var15, true);
								}
							}

							if (var14 < field2451) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field2535) {
									this.method4194(var15, true);
								}
							}
						}

						if (var16 < field2463) {
							if (var13 >= field2464) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field2535) {
									this.method4194(var15, true);
								}
							}

							if (var14 < field2451) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field2535) {
									this.method4194(var15, true);
								}
							}
						}

						if (field2459 == 0) {
							field2476 = false;
							return;
						}
					}
				}
			}
		}

		for (var7 = this.field2455; var7 < this.field2446; ++var7) {
			var8 = this.field2450[var7];

			for (var9 = -25; var9 <= 0; ++var9) {
				var10 = field2466 + var9;
				var16 = field2466 - var9;
				if (var10 >= field2483 || var16 < field2463) {
					for (var12 = -25; var12 <= 0; ++var12) {
						var13 = field2465 + var12;
						var14 = field2465 - var12;
						if (var10 >= field2483) {
							if (var13 >= field2464) {
								var15 = var8[var10][var13];
								if (var15 != null && var15.field2535) {
									this.method4194(var15, false);
								}
							}

							if (var14 < field2451) {
								var15 = var8[var10][var14];
								if (var15 != null && var15.field2535) {
									this.method4194(var15, false);
								}
							}
						}

						if (var16 < field2463) {
							if (var13 >= field2464) {
								var15 = var8[var16][var13];
								if (var15 != null && var15.field2535) {
									this.method4194(var15, false);
								}
							}

							if (var14 < field2451) {
								var15 = var8[var16][var14];
								if (var15 != null && var15.field2535) {
									this.method4194(var15, false);
								}
							}
						}

						if (field2459 == 0) {
							field2476 = false;
							return;
						}
					}
				}
			}
		}

		field2476 = false;
	}

	void method4194(class213 var1, boolean var2) {
		field2490.method6572(var1);

		while (true) {
			class213 var3;
			int var4;
			int var5;
			int var6;
			int var7;
			class213[][] var8;
			class213 var9;
			int var11;
			int var14;
			int var15;
			int var16;
			int var24;
			int var25;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										class225 var10;
										class224 var12;
										int var17;
										int var18;
										boolean var20;
										int var21;
										class213 var36;
										while (true) {
											do {
												var3 = (class213)field2490.method6575();
												if (var3 == null) {
													return;
												}
											} while(!var3.field2529);

											var4 = var3.field2514;
											var5 = var3.field2515;
											var6 = var3.field2533;
											var7 = var3.field2516;
											var8 = this.field2450[var6];
											if (!var3.field2535) {
												break;
											}

											if (var2) {
												if (var6 > 0) {
													var9 = this.field2450[var6 - 1][var4][var5];
													if (var9 != null && var9.field2529) {
														continue;
													}
												}

												if (var4 <= field2466 && var4 > field2483) {
													var9 = var8[var4 - 1][var5];
													if (var9 != null && var9.field2529 && (var9.field2535 || (var3.field2526 & 1) == 0)) {
														continue;
													}
												}

												if (var4 >= field2466 && var4 < field2463 - 1) {
													var9 = var8[var4 + 1][var5];
													if (var9 != null && var9.field2529 && (var9.field2535 || (var3.field2526 & 4) == 0)) {
														continue;
													}
												}

												if (var5 <= field2465 && var5 > field2464) {
													var9 = var8[var4][var5 - 1];
													if (var9 != null && var9.field2529 && (var9.field2535 || (var3.field2526 & 8) == 0)) {
														continue;
													}
												}

												if (var5 >= field2465 && var5 < field2451 - 1) {
													var9 = var8[var4][var5 + 1];
													if (var9 != null && var9.field2529 && (var9.field2535 || (var3.field2526 & 2) == 0)) {
														continue;
													}
												}
											} else {
												var2 = true;
											}

											var3.field2535 = false;
											if (var3.field2528 != null) {
												var9 = var3.field2528;
												if (var9.field2513 != null) {
													if (!this.method4200(0, var4, var5)) {
														this.method4195(var9.field2513, 0, field2449, field2475, field2473, field2474, var4, var5);
													}
												} else if (var9.field2518 != null && !this.method4200(0, var4, var5)) {
													this.method4196(var9.field2518, field2449, field2475, field2473, field2474, var4, var5);
												}

												var10 = var9.field2519;
												if (var10 != null) {
													var10.field2730.method4626(0, field2449, field2475, field2473, field2474, var10.field2731 - field2468, var10.field2734 - field2469, var10.field2733 - field2470, var10.field2737);
												}

												for (var11 = 0; var11 < var9.field2523; ++var11) {
													var12 = var9.field2524[var11];
													if (var12 != null) {
														var12.field2714.method4626(var12.field2723, field2449, field2475, field2473, field2474, var12.field2728 - field2468, var12.field2713 - field2469, var12.field2715 - field2470, var12.field2724);
													}
												}
											}

											var20 = false;
											if (var3.field2513 != null) {
												if (!this.method4200(var7, var4, var5)) {
													var20 = true;
													if (var3.field2513.field2644 != 12345678 || field2476 && var6 <= field2477) {
														this.method4195(var3.field2513, var7, field2449, field2475, field2473, field2474, var4, var5);
													}
												}
											} else if (var3.field2518 != null && !this.method4200(var7, var4, var5)) {
												var20 = true;
												this.method4196(var3.field2518, field2449, field2475, field2473, field2474, var4, var5);
											}

											var21 = 0;
											var11 = 0;
											class225 var31 = var3.field2519;
											class210 var13 = var3.field2520;
											if (var31 != null || var13 != null) {
												if (field2466 == var4) {
													++var21;
												} else if (field2466 < var4) {
													var21 += 2;
												}

												if (field2465 == var5) {
													var21 += 3;
												} else if (field2465 > var5) {
													var21 += 6;
												}

												var11 = field2491[var21];
												var3.field2534 = field2493[var21];
											}

											if (var31 != null) {
												if ((var31.field2738 & field2492[var21]) != 0) {
													if (var31.field2738 == 16) {
														var3.field2531 = 3;
														var3.field2532 = field2494[var21];
														var3.field2525 = 3 - var3.field2532;
													} else if (var31.field2738 == 32) {
														var3.field2531 = 6;
														var3.field2532 = field2471[var21];
														var3.field2525 = 6 - var3.field2532;
													} else if (var31.field2738 == 64) {
														var3.field2531 = 12;
														var3.field2532 = field2496[var21];
														var3.field2525 = 12 - var3.field2532;
													} else {
														var3.field2531 = 9;
														var3.field2532 = field2497[var21];
														var3.field2525 = 9 - var3.field2532;
													}
												} else {
													var3.field2531 = 0;
												}

												if ((var31.field2738 & var11) != 0 && !this.method4201(var7, var4, var5, var31.field2738)) {
													var31.field2730.method4626(0, field2449, field2475, field2473, field2474, var31.field2731 - field2468, var31.field2734 - field2469, var31.field2733 - field2470, var31.field2737);
												}

												if ((var31.field2732 & var11) != 0 && !this.method4201(var7, var4, var5, var31.field2732)) {
													var31.field2736.method4626(0, field2449, field2475, field2473, field2474, var31.field2731 - field2468, var31.field2734 - field2469, var31.field2733 - field2470, var31.field2737);
												}
											}

											if (var13 != null && !this.method4202(var7, var4, var5, var13.field2439.field2740)) {
												if ((var13.field2441 & var11) != 0) {
													var13.field2439.method4626(0, field2449, field2475, field2473, field2474, var13.field2433 - field2468 + var13.field2442, var13.field2444 - field2469, var13.field2434 - field2470 + var13.field2438, var13.field2432);
												} else if (var13.field2441 == 256) {
													var14 = var13.field2433 - field2468;
													var15 = var13.field2444 - field2469;
													var16 = var13.field2434 - field2470;
													var17 = var13.field2436;
													if (var17 != 1 && var17 != 2) {
														var18 = var14;
													} else {
														var18 = -var14;
													}

													int var19;
													if (var17 != 2 && var17 != 3) {
														var19 = var16;
													} else {
														var19 = -var16;
													}

													if (var19 < var18) {
														var13.field2439.method4626(0, field2449, field2475, field2473, field2474, var14 + var13.field2442, var15, var16 + var13.field2438, var13.field2432);
													} else if (var13.field2440 != null) {
														var13.field2440.method4626(0, field2449, field2475, field2473, field2474, var14, var15, var16, var13.field2432);
													}
												}
											}

											if (var20) {
												class227 var22 = var3.field2521;
												if (var22 != null) {
													var22.field2744.method4626(0, field2449, field2475, field2473, field2474, var22.field2742 - field2468, var22.field2748 - field2469, var22.field2741 - field2470, var22.field2745);
												}

												class207 var23 = var3.field2522;
												if (var23 != null && var23.field2370 == 0) {
													if (var23.field2368 != null) {
														var23.field2368.method4626(0, field2449, field2475, field2473, field2474, var23.field2364 - field2468, var23.field2365 - field2469, var23.field2366 - field2470, var23.field2371);
													}

													if (var23.field2369 != null) {
														var23.field2369.method4626(0, field2449, field2475, field2473, field2474, var23.field2364 - field2468, var23.field2365 - field2469, var23.field2366 - field2470, var23.field2371);
													}

													if (var23.field2367 != null) {
														var23.field2367.method4626(0, field2449, field2475, field2473, field2474, var23.field2364 - field2468, var23.field2365 - field2469, var23.field2366 - field2470, var23.field2371);
													}
												}
											}

											var14 = var3.field2526;
											if (var14 != 0) {
												if (var4 < field2466 && (var14 & 4) != 0) {
													var36 = var8[var4 + 1][var5];
													if (var36 != null && var36.field2529) {
														field2490.method6572(var36);
													}
												}

												if (var5 < field2465 && (var14 & 2) != 0) {
													var36 = var8[var4][var5 + 1];
													if (var36 != null && var36.field2529) {
														field2490.method6572(var36);
													}
												}

												if (var4 > field2466 && (var14 & 1) != 0) {
													var36 = var8[var4 - 1][var5];
													if (var36 != null && var36.field2529) {
														field2490.method6572(var36);
													}
												}

												if (var5 > field2465 && (var14 & 8) != 0) {
													var36 = var8[var4][var5 - 1];
													if (var36 != null && var36.field2529) {
														field2490.method6572(var36);
													}
												}
											}
											break;
										}

										if (var3.field2531 != 0) {
											var20 = true;

											for (var21 = 0; var21 < var3.field2523; ++var21) {
												if (var3.field2524[var21].field2712 != field2461 && (var3.field2517[var21] & var3.field2531) == var3.field2532) {
													var20 = false;
													break;
												}
											}

											if (var20) {
												var10 = var3.field2519;
												if (!this.method4201(var7, var4, var5, var10.field2738)) {
													var10.field2730.method4626(0, field2449, field2475, field2473, field2474, var10.field2731 - field2468, var10.field2734 - field2469, var10.field2733 - field2470, var10.field2737);
												}

												var3.field2531 = 0;
											}
										}

										if (!var3.field2530) {
											break;
										}

										try {
											int var34 = var3.field2523;
											var3.field2530 = false;
											var21 = 0;

											label563:
											for (var11 = 0; var11 < var34; ++var11) {
												var12 = var3.field2524[var11];
												if (var12.field2712 != field2461) {
													for (var24 = var12.field2722; var24 <= var12.field2719; ++var24) {
														for (var14 = var12.field2720; var14 <= var12.field2721; ++var14) {
															var36 = var8[var24][var14];
															if (var36.field2535) {
																var3.field2530 = true;
																continue label563;
															}

															if (var36.field2531 != 0) {
																var16 = 0;
																if (var24 > var12.field2722) {
																	++var16;
																}

																if (var24 < var12.field2719) {
																	var16 += 4;
																}

																if (var14 > var12.field2720) {
																	var16 += 8;
																}

																if (var14 < var12.field2721) {
																	var16 += 2;
																}

																if ((var16 & var36.field2531) == var3.field2525) {
																	var3.field2530 = true;
																	continue label563;
																}
															}
														}
													}

													field2445[var21++] = var12;
													var24 = field2466 - var12.field2722;
													var14 = var12.field2719 - field2466;
													if (var14 > var24) {
														var24 = var14;
													}

													var15 = field2465 - var12.field2720;
													var16 = var12.field2721 - field2465;
													if (var16 > var15) {
														var12.field2717 = var24 + var16;
													} else {
														var12.field2717 = var24 + var15;
													}
												}
											}

											while (var21 > 0) {
												var11 = -50;
												var25 = -1;

												for (var24 = 0; var24 < var21; ++var24) {
													class224 var35 = field2445[var24];
													if (var35.field2712 != field2461) {
														if (var35.field2717 > var11) {
															var11 = var35.field2717;
															var25 = var24;
														} else if (var35.field2717 == var11) {
															var15 = var35.field2728 - field2468;
															var16 = var35.field2715 - field2470;
															var17 = field2445[var25].field2728 - field2468;
															var18 = field2445[var25].field2715 - field2470;
															if (var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
																var25 = var24;
															}
														}
													}
												}

												if (var25 == -1) {
													break;
												}

												class224 var33 = field2445[var25];
												var33.field2712 = field2461;
												if (!this.method4203(var7, var33.field2722, var33.field2719, var33.field2720, var33.field2721, var33.field2714.field2740)) {
													var33.field2714.method4626(var33.field2723, field2449, field2475, field2473, field2474, var33.field2728 - field2468, var33.field2713 - field2469, var33.field2715 - field2470, var33.field2724);
												}

												for (var14 = var33.field2722; var14 <= var33.field2719; ++var14) {
													for (var15 = var33.field2720; var15 <= var33.field2721; ++var15) {
														class213 var26 = var8[var14][var15];
														if (var26.field2531 != 0) {
															field2490.method6572(var26);
														} else if ((var14 != var4 || var15 != var5) && var26.field2529) {
															field2490.method6572(var26);
														}
													}
												}
											}

											if (!var3.field2530) {
												break;
											}
										} catch (Exception var28) {
											var3.field2530 = false;
											break;
										}
									}
								} while(!var3.field2529);
							} while(var3.field2531 != 0);

							if (var4 > field2466 || var4 <= field2483) {
								break;
							}

							var9 = var8[var4 - 1][var5];
						} while(var9 != null && var9.field2529);

						if (var4 < field2466 || var4 >= field2463 - 1) {
							break;
						}

						var9 = var8[var4 + 1][var5];
					} while(var9 != null && var9.field2529);

					if (var5 > field2465 || var5 <= field2464) {
						break;
					}

					var9 = var8[var4][var5 - 1];
				} while(var9 != null && var9.field2529);

				if (var5 < field2465 || var5 >= field2451 - 1) {
					break;
				}

				var9 = var8[var4][var5 + 1];
			} while(var9 != null && var9.field2529);

			var3.field2529 = false;
			--field2459;
			class207 var32 = var3.field2522;
			if (var32 != null && var32.field2370 != 0) {
				if (var32.field2368 != null) {
					var32.field2368.method4626(0, field2449, field2475, field2473, field2474, var32.field2364 - field2468, var32.field2365 - field2469 - var32.field2370, var32.field2366 - field2470, var32.field2371);
				}

				if (var32.field2369 != null) {
					var32.field2369.method4626(0, field2449, field2475, field2473, field2474, var32.field2364 - field2468, var32.field2365 - field2469 - var32.field2370, var32.field2366 - field2470, var32.field2371);
				}

				if (var32.field2367 != null) {
					var32.field2367.method4626(0, field2449, field2475, field2473, field2474, var32.field2364 - field2468, var32.field2365 - field2469 - var32.field2370, var32.field2366 - field2470, var32.field2371);
				}
			}

			if (var3.field2534 != 0) {
				class210 var29 = var3.field2520;
				if (var29 != null && !this.method4202(var7, var4, var5, var29.field2439.field2740)) {
					if ((var29.field2441 & var3.field2534) != 0) {
						var29.field2439.method4626(0, field2449, field2475, field2473, field2474, var29.field2433 - field2468 + var29.field2442, var29.field2444 - field2469, var29.field2434 - field2470 + var29.field2438, var29.field2432);
					} else if (var29.field2441 == 256) {
						var11 = var29.field2433 - field2468;
						var25 = var29.field2444 - field2469;
						var24 = var29.field2434 - field2470;
						var14 = var29.field2436;
						if (var14 != 1 && var14 != 2) {
							var15 = var11;
						} else {
							var15 = -var11;
						}

						if (var14 != 2 && var14 != 3) {
							var16 = var24;
						} else {
							var16 = -var24;
						}

						if (var16 >= var15) {
							var29.field2439.method4626(0, field2449, field2475, field2473, field2474, var11 + var29.field2442, var25, var24 + var29.field2438, var29.field2432);
						} else if (var29.field2440 != null) {
							var29.field2440.method4626(0, field2449, field2475, field2473, field2474, var11, var25, var24, var29.field2432);
						}
					}
				}

				class225 var27 = var3.field2519;
				if (var27 != null) {
					if ((var27.field2732 & var3.field2534) != 0 && !this.method4201(var7, var4, var5, var27.field2732)) {
						var27.field2736.method4626(0, field2449, field2475, field2473, field2474, var27.field2731 - field2468, var27.field2734 - field2469, var27.field2733 - field2470, var27.field2737);
					}

					if ((var27.field2738 & var3.field2534) != 0 && !this.method4201(var7, var4, var5, var27.field2738)) {
						var27.field2730.method4626(0, field2449, field2475, field2473, field2474, var27.field2731 - field2468, var27.field2734 - field2469, var27.field2733 - field2470, var27.field2737);
					}
				}
			}

			class213 var30;
			if (var6 < this.field2446 - 1) {
				var30 = this.field2450[var6 + 1][var4][var5];
				if (var30 != null && var30.field2529) {
					field2490.method6572(var30);
				}
			}

			if (var4 < field2466) {
				var30 = var8[var4 + 1][var5];
				if (var30 != null && var30.field2529) {
					field2490.method6572(var30);
				}
			}

			if (var5 < field2465) {
				var30 = var8[var4][var5 + 1];
				if (var30 != null && var30.field2529) {
					field2490.method6572(var30);
				}
			}

			if (var4 > field2466) {
				var30 = var8[var4 - 1][var5];
				if (var30 != null && var30.field2529) {
					field2490.method6572(var30);
				}
			}

			if (var5 > field2465) {
				var30 = var8[var4][var5 - 1];
				if (var30 != null && var30.field2529) {
					field2490.method6572(var30);
				}
			}
		}
	}

	void method4195(class218 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9;
		int var10 = var9 = (var7 << 7) - field2468;
		int var11;
		int var12 = var11 = (var8 << 7) - field2470;
		int var13;
		int var14 = var13 = var10 + 128;
		int var15;
		int var16 = var15 = var12 + 128;
		int var17 = this.field2499[var2][var7][var8] - field2469;
		int var18 = this.field2499[var2][var7 + 1][var8] - field2469;
		int var19 = this.field2499[var2][var7 + 1][var8 + 1] - field2469;
		int var20 = this.field2499[var2][var7][var8 + 1] - field2469;
		int var21 = var12 * var5 + var10 * var6 >> 16;
		var12 = var12 * var6 - var10 * var5 >> 16;
		var10 = var21;
		var21 = var17 * var4 - var12 * var3 >> 16;
		var12 = var17 * var3 + var12 * var4 >> 16;
		var17 = var21;
		if (var12 >= 50) {
			var21 = var11 * var5 + var14 * var6 >> 16;
			var11 = var11 * var6 - var14 * var5 >> 16;
			var14 = var21;
			var21 = var18 * var4 - var11 * var3 >> 16;
			var11 = var18 * var3 + var11 * var4 >> 16;
			var18 = var21;
			if (var11 >= 50) {
				var21 = var16 * var5 + var13 * var6 >> 16;
				var16 = var16 * var6 - var13 * var5 >> 16;
				var13 = var21;
				var21 = var19 * var4 - var16 * var3 >> 16;
				var16 = var19 * var3 + var16 * var4 >> 16;
				var19 = var21;
				if (var16 >= 50) {
					var21 = var15 * var5 + var9 * var6 >> 16;
					var15 = var15 * var6 - var9 * var5 >> 16;
					var9 = var21;
					var21 = var20 * var4 - var15 * var3 >> 16;
					var15 = var20 * var3 + var15 * var4 >> 16;
					if (var15 >= 50) {
						int var22 = class221.field2676 + var10 * class221.field2675 / var12;
						int var23 = class221.field2689 + var17 * class221.field2675 / var12;
						int var24 = class221.field2676 + var14 * class221.field2675 / var11;
						int var25 = class221.field2689 + var18 * class221.field2675 / var11;
						int var26 = class221.field2676 + var13 * class221.field2675 / var16;
						int var27 = class221.field2689 + var19 * class221.field2675 / var16;
						int var28 = class221.field2676 + var9 * class221.field2675 / var15;
						int var29 = class221.field2689 + var21 * class221.field2675 / var15;
						class221.field2668 = 0;
						int var30;
						if ((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
							class221.field2684 = false;
							if (var26 < 0 || var28 < 0 || var24 < 0 || var26 > class221.field2678 || var28 > class221.field2678 || var24 > class221.field2678) {
								class221.field2684 = true;
							}

							if (field2476 && method4198(field2478, field2456, var27, var29, var25, var26, var28, var24)) {
								field2481 = var7;
								field2485 = var8;
							}

							if (var1.field2646 == -1) {
								if (var1.field2644 != 12345678) {
									class221.method4557(var27, var29, var25, var26, var28, var24, var1.field2644, var1.field2645, var1.field2648);
								}
							} else if (!field2479) {
								if (var1.field2647) {
									class221.method4602(var27, var29, var25, var26, var28, var24, var1.field2644, var1.field2645, var1.field2648, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2646);
								} else {
									class221.method4602(var27, var29, var25, var26, var28, var24, var1.field2644, var1.field2645, var1.field2648, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field2646);
								}
							} else {
								var30 = class221.field2672.method4673(var1.field2646);
								class221.method4557(var27, var29, var25, var26, var28, var24, method4169(var30, var1.field2644), method4169(var30, var1.field2645), method4169(var30, var1.field2648));
							}
						}

						if ((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
							class221.field2684 = false;
							if (var22 < 0 || var24 < 0 || var28 < 0 || var22 > class221.field2678 || var24 > class221.field2678 || var28 > class221.field2678) {
								class221.field2684 = true;
							}

							if (field2476 && method4198(field2478, field2456, var23, var25, var29, var22, var24, var28)) {
								field2481 = var7;
								field2485 = var8;
							}

							if (var1.field2646 == -1) {
								if (var1.field2649 != 12345678) {
									class221.method4557(var23, var25, var29, var22, var24, var28, var1.field2649, var1.field2648, var1.field2645);
								}
							} else if (!field2479) {
								class221.method4602(var23, var25, var29, var22, var24, var28, var1.field2649, var1.field2648, var1.field2645, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field2646);
							} else {
								var30 = class221.field2672.method4673(var1.field2646);
								class221.method4557(var23, var25, var29, var22, var24, var28, method4169(var30, var1.field2649), method4169(var30, var1.field2648), method4169(var30, var1.field2645));
							}
						}

					}
				}
			}
		}
	}

	void method4196(class233 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		int var8 = var1.field2810.length;

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field2810[var9] - field2468;
			var11 = var1.field2797[var9] - field2469;
			var12 = var1.field2798[var9] - field2470;
			var13 = var12 * var4 + var10 * var5 >> 16;
			var12 = var12 * var5 - var10 * var4 >> 16;
			var10 = var13;
			var13 = var11 * var3 - var12 * var2 >> 16;
			var12 = var11 * var2 + var12 * var3 >> 16;
			if (var12 < 50) {
				return;
			}

			if (var1.field2805 != null) {
				class233.field2804[var9] = var10;
				class233.field2808[var9] = var13;
				class233.field2815[var9] = var12;
			}

			class233.field2809[var9] = class221.field2676 + var10 * class221.field2675 / var12;
			class233.field2812[var9] = class221.field2689 + var13 * class221.field2675 / var12;
		}

		class221.field2668 = 0;
		var8 = var1.field2802.length;

		for (var9 = 0; var9 < var8; ++var9) {
			var10 = var1.field2802[var9];
			var11 = var1.field2814[var9];
			var12 = var1.field2806[var9];
			var13 = class233.field2809[var10];
			int var14 = class233.field2809[var11];
			int var15 = class233.field2809[var12];
			int var16 = class233.field2812[var10];
			int var17 = class233.field2812[var11];
			int var18 = class233.field2812[var12];
			if ((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
				class221.field2684 = false;
				if (var13 < 0 || var14 < 0 || var15 < 0 || var13 > class221.field2678 || var14 > class221.field2678 || var15 > class221.field2678) {
					class221.field2684 = true;
				}

				if (field2476 && method4198(field2478, field2456, var16, var17, var18, var13, var14, var15)) {
					field2481 = var6;
					field2485 = var7;
				}

				if (var1.field2805 != null && var1.field2805[var9] != -1) {
					if (!field2479) {
						if (var1.field2807) {
							class221.method4602(var16, var17, var18, var13, var14, var15, var1.field2799[var9], var1.field2800[var9], var1.field2801[var9], class233.field2804[0], class233.field2804[1], class233.field2804[3], class233.field2808[0], class233.field2808[1], class233.field2808[3], class233.field2815[0], class233.field2815[1], class233.field2815[3], var1.field2805[var9]);
						} else {
							class221.method4602(var16, var17, var18, var13, var14, var15, var1.field2799[var9], var1.field2800[var9], var1.field2801[var9], class233.field2804[var10], class233.field2804[var11], class233.field2804[var12], class233.field2808[var10], class233.field2808[var11], class233.field2808[var12], class233.field2815[var10], class233.field2815[var11], class233.field2815[var12], var1.field2805[var9]);
						}
					} else {
						int var19 = class221.field2672.method4673(var1.field2805[var9]);
						class221.method4557(var16, var17, var18, var13, var14, var15, method4169(var19, var1.field2799[var9]), method4169(var19, var1.field2800[var9]), method4169(var19, var1.field2801[var9]));
					}
				} else if (var1.field2799[var9] != 12345678) {
					class221.method4557(var16, var17, var18, var13, var14, var15, var1.field2799[var9], var1.field2800[var9], var1.field2801[var9]);
				}
			}
		}

	}

	static final int method4169(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static boolean method4198(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 < var2 && var1 < var3 && var1 < var4) {
			return false;
		} else if (var1 > var2 && var1 > var3 && var1 > var4) {
			return false;
		} else if (var0 < var5 && var0 < var6 && var0 < var7) {
			return false;
		} else if (var0 > var5 && var0 > var6 && var0 > var7) {
			return false;
		} else {
			int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
			int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
			int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
			if (var8 == 0) {
				if (var9 != 0) {
					return var9 < 0 ? var10 <= 0 : var10 >= 0;
				} else {
					return true;
				}
			} else {
				return var8 < 0 ? var9 <= 0 && var10 <= 0 : var9 >= 0 && var10 >= 0;
			}
		}
	}

	void method4199() {
		int var1 = field2500[field2460];
		class230[] var2 = field2482[field2460];
		field2488 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			class230 var4 = var2[var3];
			int var5;
			int var6;
			int var7;
			int var9;
			boolean var13;
			if (var4.field2767 == 1) {
				var5 = var4.field2763 - field2466 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field2769 - field2465 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2774 - field2465 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (field2505[var5][var6++]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = field2468 - var4.field2768;
						if (var9 > 32) {
							var4.field2766 = 1;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2766 = 2;
							var9 = -var9;
						}

						var4.field2777 = (var4.field2770 - field2470 << 8) / var9;
						var4.field2778 = (var4.field2765 - field2470 << 8) / var9;
						var4.field2779 = (var4.field2772 - field2469 << 8) / var9;
						var4.field2780 = (var4.field2773 - field2469 << 8) / var9;
						field2489[field2488++] = var4;
					}
				}
			} else if (var4.field2767 == 2) {
				var5 = var4.field2769 - field2465 + 25;
				if (var5 >= 0 && var5 <= 50) {
					var6 = var4.field2763 - field2466 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2764 - field2466 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					var13 = false;

					while (var6 <= var7) {
						if (field2505[var6++][var5]) {
							var13 = true;
							break;
						}
					}

					if (var13) {
						var9 = field2470 - var4.field2770;
						if (var9 > 32) {
							var4.field2766 = 3;
						} else {
							if (var9 >= -32) {
								continue;
							}

							var4.field2766 = 4;
							var9 = -var9;
						}

						var4.field2775 = (var4.field2768 - field2468 << 8) / var9;
						var4.field2776 = (var4.field2771 - field2468 << 8) / var9;
						var4.field2779 = (var4.field2772 - field2469 << 8) / var9;
						var4.field2780 = (var4.field2773 - field2469 << 8) / var9;
						field2489[field2488++] = var4;
					}
				}
			} else if (var4.field2767 == 4) {
				var5 = var4.field2772 - field2469;
				if (var5 > 128) {
					var6 = var4.field2769 - field2465 + 25;
					if (var6 < 0) {
						var6 = 0;
					}

					var7 = var4.field2774 - field2465 + 25;
					if (var7 > 50) {
						var7 = 50;
					}

					if (var6 <= var7) {
						int var8 = var4.field2763 - field2466 + 25;
						if (var8 < 0) {
							var8 = 0;
						}

						var9 = var4.field2764 - field2466 + 25;
						if (var9 > 50) {
							var9 = 50;
						}

						boolean var10 = false;

						label144:
						for (int var11 = var8; var11 <= var9; ++var11) {
							for (int var12 = var6; var12 <= var7; ++var12) {
								if (field2505[var11][var12]) {
									var10 = true;
									break label144;
								}
							}
						}

						if (var10) {
							var4.field2766 = 5;
							var4.field2775 = (var4.field2768 - field2468 << 8) / var5;
							var4.field2776 = (var4.field2771 - field2468 << 8) / var5;
							var4.field2777 = (var4.field2770 - field2470 << 8) / var5;
							var4.field2778 = (var4.field2765 - field2470 << 8) / var5;
							field2489[field2488++] = var4;
						}
					}
				}
			}
		}

	}

	boolean method4200(int var1, int var2, int var3) {
		int var4 = this.field2454[var1][var2][var3];
		if (var4 == -field2461) {
			return false;
		} else if (var4 == field2461) {
			return true;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			if (this.method4175(var5 + 1, this.field2499[var1][var2][var3], var6 + 1) && this.method4175(var5 + 128 - 1, this.field2499[var1][var2 + 1][var3], var6 + 1) && this.method4175(var5 + 128 - 1, this.field2499[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method4175(var5 + 1, this.field2499[var1][var2][var3 + 1], var6 + 128 - 1)) {
				this.field2454[var1][var2][var3] = field2461;
				return true;
			} else {
				this.field2454[var1][var2][var3] = -field2461;
				return false;
			}
		}
	}

	boolean method4201(int var1, int var2, int var3, int var4) {
		if (!this.method4200(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			int var7 = this.field2499[var1][var2][var3] - 1;
			int var8 = var7 - 120;
			int var9 = var7 - 230;
			int var10 = var7 - 238;
			if (var4 < 16) {
				if (var4 == 1) {
					if (var5 > field2468) {
						if (!this.method4175(var5, var7, var6)) {
							return false;
						}

						if (!this.method4175(var5, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4175(var5, var8, var6)) {
							return false;
						}

						if (!this.method4175(var5, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4175(var5, var9, var6)) {
						return false;
					}

					if (!this.method4175(var5, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 2) {
					if (var6 < field2470) {
						if (!this.method4175(var5, var7, var6 + 128)) {
							return false;
						}

						if (!this.method4175(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4175(var5, var8, var6 + 128)) {
							return false;
						}

						if (!this.method4175(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4175(var5, var9, var6 + 128)) {
						return false;
					}

					if (!this.method4175(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 4) {
					if (var5 < field2468) {
						if (!this.method4175(var5 + 128, var7, var6)) {
							return false;
						}

						if (!this.method4175(var5 + 128, var7, var6 + 128)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4175(var5 + 128, var8, var6)) {
							return false;
						}

						if (!this.method4175(var5 + 128, var8, var6 + 128)) {
							return false;
						}
					}

					if (!this.method4175(var5 + 128, var9, var6)) {
						return false;
					}

					if (!this.method4175(var5 + 128, var9, var6 + 128)) {
						return false;
					}

					return true;
				}

				if (var4 == 8) {
					if (var6 > field2470) {
						if (!this.method4175(var5, var7, var6)) {
							return false;
						}

						if (!this.method4175(var5 + 128, var7, var6)) {
							return false;
						}
					}

					if (var1 > 0) {
						if (!this.method4175(var5, var8, var6)) {
							return false;
						}

						if (!this.method4175(var5 + 128, var8, var6)) {
							return false;
						}
					}

					if (!this.method4175(var5, var9, var6)) {
						return false;
					}

					if (!this.method4175(var5 + 128, var9, var6)) {
						return false;
					}

					return true;
				}
			}

			if (!this.method4175(var5 + 64, var10, var6 + 64)) {
				return false;
			} else if (var4 == 16) {
				return this.method4175(var5, var9, var6 + 128);
			} else if (var4 == 32) {
				return this.method4175(var5 + 128, var9, var6 + 128);
			} else if (var4 == 64) {
				return this.method4175(var5 + 128, var9, var6);
			} else if (var4 == 128) {
				return this.method4175(var5, var9, var6);
			} else {
				return true;
			}
		}
	}

	boolean method4202(int var1, int var2, int var3, int var4) {
		if (!this.method4200(var1, var2, var3)) {
			return false;
		} else {
			int var5 = var2 << 7;
			int var6 = var3 << 7;
			return this.method4175(var5 + 1, this.field2499[var1][var2][var3] - var4, var6 + 1) && this.method4175(var5 + 128 - 1, this.field2499[var1][var2 + 1][var3] - var4, var6 + 1) && this.method4175(var5 + 128 - 1, this.field2499[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method4175(var5 + 1, this.field2499[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
		}
	}

	boolean method4203(int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7;
		int var8;
		if (var2 == var3 && var4 == var5) {
			if (!this.method4200(var1, var2, var4)) {
				return false;
			} else {
				var7 = var2 << 7;
				var8 = var4 << 7;
				return this.method4175(var7 + 1, this.field2499[var1][var2][var4] - var6, var8 + 1) && this.method4175(var7 + 128 - 1, this.field2499[var1][var2 + 1][var4] - var6, var8 + 1) && this.method4175(var7 + 128 - 1, this.field2499[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method4175(var7 + 1, this.field2499[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
			}
		} else {
			for (var7 = var2; var7 <= var3; ++var7) {
				for (var8 = var4; var8 <= var5; ++var8) {
					if (this.field2454[var1][var7][var8] == -field2461) {
						return false;
					}
				}
			}

			var7 = (var2 << 7) + 1;
			var8 = (var4 << 7) + 2;
			int var9 = this.field2499[var1][var2][var4] - var6;
			if (!this.method4175(var7, var9, var8)) {
				return false;
			} else {
				int var10 = (var3 << 7) - 1;
				if (!this.method4175(var10, var9, var8)) {
					return false;
				} else {
					int var11 = (var5 << 7) - 1;
					if (!this.method4175(var7, var9, var11)) {
						return false;
					} else if (!this.method4175(var10, var9, var11)) {
						return false;
					} else {
						return true;
					}
				}
			}
		}
	}

	boolean method4175(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < field2488; ++var4) {
			class230 var5 = field2489[var4];
			int var6;
			int var7;
			int var8;
			int var9;
			int var10;
			if (var5.field2766 == 1) {
				var6 = var5.field2768 - var1;
				if (var6 > 0) {
					var7 = var5.field2770 + (var5.field2777 * var6 >> 8);
					var8 = var5.field2765 + (var5.field2778 * var6 >> 8);
					var9 = var5.field2772 + (var5.field2779 * var6 >> 8);
					var10 = var5.field2773 + (var5.field2780 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2766 == 2) {
				var6 = var1 - var5.field2768;
				if (var6 > 0) {
					var7 = var5.field2770 + (var5.field2777 * var6 >> 8);
					var8 = var5.field2765 + (var5.field2778 * var6 >> 8);
					var9 = var5.field2772 + (var5.field2779 * var6 >> 8);
					var10 = var5.field2773 + (var5.field2780 * var6 >> 8);
					if (var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2766 == 3) {
				var6 = var5.field2770 - var3;
				if (var6 > 0) {
					var7 = var5.field2768 + (var5.field2775 * var6 >> 8);
					var8 = var5.field2771 + (var5.field2776 * var6 >> 8);
					var9 = var5.field2772 + (var5.field2779 * var6 >> 8);
					var10 = var5.field2773 + (var5.field2780 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2766 == 4) {
				var6 = var3 - var5.field2770;
				if (var6 > 0) {
					var7 = var5.field2768 + (var5.field2775 * var6 >> 8);
					var8 = var5.field2771 + (var5.field2776 * var6 >> 8);
					var9 = var5.field2772 + (var5.field2779 * var6 >> 8);
					var10 = var5.field2773 + (var5.field2780 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
						return true;
					}
				}
			} else if (var5.field2766 == 5) {
				var6 = var2 - var5.field2772;
				if (var6 > 0) {
					var7 = var5.field2768 + (var5.field2775 * var6 >> 8);
					var8 = var5.field2771 + (var5.field2776 * var6 >> 8);
					var9 = var5.field2770 + (var5.field2777 * var6 >> 8);
					var10 = var5.field2765 + (var5.field2778 * var6 >> 8);
					if (var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
						return true;
					}
				}
			}
		}

		return false;
	}
}
