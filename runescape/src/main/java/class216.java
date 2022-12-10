import java.util.HashMap;

public class class216 extends class226 {
	static boolean field2619;
	static boolean[] field2597;
	static boolean[] field2598;
	static byte[] field2559;
	static byte[] field2561;
	static char[] field2612;
	static char[][] field2576;
	static class216 field2622;
	static class216 field2625;
	static class400 field2562;
	static class400 field2563;
	static class400 field2564;
	static int field2560;
	static int field2616;
	static int field2617;
	static int[] field2558;
	static int[] field2566;
	static int[] field2567;
	static int[] field2568;
	static int[] field2571;
	static int[] field2579;
	static int[] field2581;
	static int[] field2600;
	static int[] field2601;
	static int[] field2602;
	static int[] field2603;
	static int[] field2604;
	static int[] field2609;
	static int[] field2610;
	static int[] field2611;
	static int[] field2613;
	static int[] field2623;
	static int[][] field2631;
	byte field2580;
	byte[] field2593;
	byte[] field2606;
	byte[] field2618;
	int field2565;
	int field2574;
	int field2577;
	int field2590;
	int field2591;
	int field2594;
	int field2614;
	int[] field2569;
	int[] field2572;
	int[] field2573;
	int[] field2575;
	int[] field2578;
	int[] field2582;
	int[] field2583;
	int[] field2584;
	int[] field2592;
	int[] field2599;
	int[] field2608;
	int[] field2615;
	int[][] field2585;
	int[][] field2586;
	int[][] field2587;
	int[][] field2588;
	HashMap field2595;
	short[] field2605;
	public boolean field2589;
	public byte field2570;
	public byte field2628;
	public byte field2629;
	public byte field2630;
	public int field2607;
	public short field2632;

	static {
		field2622 = new class216();
		field2559 = new byte[1];
		field2625 = new class216();
		field2561 = new byte[1];
		field2562 = new class400();
		field2563 = new class400();
		field2564 = new class400();
		field2597 = new boolean[6500];
		field2598 = new boolean[6500];
		field2609 = new int[6500];
		field2600 = new int[6500];
		field2566 = new int[6500];
		field2602 = new int[6500];
		field2603 = new int[6500];
		field2567 = new int[6500];
		field2612 = new char[6000];
		field2576 = new char[6000][512];
		field2568 = new int[12];
		field2631 = new int[12][2000];
		field2610 = new int[2000];
		field2611 = new int[2000];
		field2581 = new int[12];
		field2613 = new int[10];
		field2558 = new int[10];
		field2604 = new int[10];
		field2619 = true;
		field2601 = class221.field2667;
		field2623 = class221.field2690;
		field2571 = class221.field2685;
		field2579 = class221.field2688;
	}

	class216() {
		this.field2565 = 0;
		this.field2607 = 0;
		this.field2580 = 0;
		this.field2614 = 0;
		this.field2589 = false;
		this.field2595 = new HashMap();
	}

	public class216(class216[] var1, int var2) {
		this.field2565 = 0;
		this.field2607 = 0;
		this.field2580 = 0;
		this.field2614 = 0;
		this.field2589 = false;
		this.field2595 = new HashMap();
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		this.field2565 = 0;
		this.field2607 = 0;
		this.field2614 = 0;
		this.field2580 = -1;

		int var7;
		class216 var8;
		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				this.field2565 += var8.field2565;
				this.field2607 += var8.field2607;
				this.field2614 += var8.field2614;
				if (var8.field2618 != null) {
					var3 = true;
				} else {
					if (this.field2580 == -1) {
						this.field2580 = var8.field2580;
					}

					if (this.field2580 != var8.field2580) {
						var3 = true;
					}
				}

				var4 |= var8.field2606 != null;
				var5 |= var8.field2605 != null;
				var6 |= var8.field2593 != null;
			}
		}

		this.field2592 = new int[this.field2565];
		this.field2599 = new int[this.field2565];
		this.field2615 = new int[this.field2565];
		this.field2582 = new int[this.field2607];
		this.field2578 = new int[this.field2607];
		this.field2572 = new int[this.field2607];
		this.field2573 = new int[this.field2607];
		this.field2608 = new int[this.field2607];
		this.field2575 = new int[this.field2607];
		if (var3) {
			this.field2618 = new byte[this.field2607];
		}

		if (var4) {
			this.field2606 = new byte[this.field2607];
		}

		if (var5) {
			this.field2605 = new short[this.field2607];
		}

		if (var6) {
			this.field2593 = new byte[this.field2607];
		}

		if (this.field2614 > 0) {
			this.field2569 = new int[this.field2614];
			this.field2583 = new int[this.field2614];
			this.field2584 = new int[this.field2614];
		}

		this.field2565 = 0;
		this.field2607 = 0;
		this.field2614 = 0;

		for (var7 = 0; var7 < var2; ++var7) {
			var8 = var1[var7];
			if (var8 != null) {
				int var9;
				for (var9 = 0; var9 < var8.field2607; ++var9) {
					this.field2582[this.field2607] = var8.field2582[var9] + this.field2565;
					this.field2578[this.field2607] = var8.field2578[var9] + this.field2565;
					this.field2572[this.field2607] = var8.field2572[var9] + this.field2565;
					this.field2573[this.field2607] = var8.field2573[var9];
					this.field2608[this.field2607] = var8.field2608[var9];
					this.field2575[this.field2607] = var8.field2575[var9];
					if (var3) {
						if (var8.field2618 != null) {
							this.field2618[this.field2607] = var8.field2618[var9];
						} else {
							this.field2618[this.field2607] = var8.field2580;
						}
					}

					if (var4 && var8.field2606 != null) {
						this.field2606[this.field2607] = var8.field2606[var9];
					}

					if (var5) {
						if (var8.field2605 != null) {
							this.field2605[this.field2607] = var8.field2605[var9];
						} else {
							this.field2605[this.field2607] = -1;
						}
					}

					if (var6) {
						if (var8.field2593 != null && var8.field2593[var9] != -1) {
							this.field2593[this.field2607] = (byte)(var8.field2593[var9] + this.field2614);
						} else {
							this.field2593[this.field2607] = -1;
						}
					}

					++this.field2607;
				}

				for (var9 = 0; var9 < var8.field2614; ++var9) {
					this.field2569[this.field2614] = var8.field2569[var9] + this.field2565;
					this.field2583[this.field2614] = var8.field2583[var9] + this.field2565;
					this.field2584[this.field2614] = var8.field2584[var9] + this.field2565;
					++this.field2614;
				}

				for (var9 = 0; var9 < var8.field2565; ++var9) {
					this.field2592[this.field2565] = var8.field2592[var9];
					this.field2599[this.field2565] = var8.field2599[var9];
					this.field2615[this.field2565] = var8.field2615[var9];
					++this.field2565;
				}
			}
		}

	}

	public class216 method4381(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method4412();
		int var7 = var2 - this.field2574;
		int var8 = var2 + this.field2574;
		int var9 = var4 - this.field2574;
		int var10 = var4 + this.field2574;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class216 var11;
				if (var5) {
					var11 = new class216();
					var11.field2565 = this.field2565;
					var11.field2607 = this.field2607;
					var11.field2614 = this.field2614;
					var11.field2592 = this.field2592;
					var11.field2615 = this.field2615;
					var11.field2582 = this.field2582;
					var11.field2578 = this.field2578;
					var11.field2572 = this.field2572;
					var11.field2573 = this.field2573;
					var11.field2608 = this.field2608;
					var11.field2575 = this.field2575;
					var11.field2618 = this.field2618;
					var11.field2606 = this.field2606;
					var11.field2593 = this.field2593;
					var11.field2605 = this.field2605;
					var11.field2580 = this.field2580;
					var11.field2569 = this.field2569;
					var11.field2583 = this.field2583;
					var11.field2584 = this.field2584;
					var11.field2585 = this.field2585;
					var11.field2586 = this.field2586;
					var11.field2589 = this.field2589;
					var11.field2599 = new int[var11.field2565];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field2565; ++var12) {
						var13 = this.field2592[var12] + var2;
						var14 = this.field2615[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field2599[var12] = this.field2599[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2565; ++var12) {
						var13 = (-this.field2599[var12] << 16) / super.field2740;
						if (var13 < var6) {
							var14 = this.field2592[var12] + var2;
							var15 = this.field2615[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field2599[var12] = this.field2599[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method4469();
				return var11;
			}
		} else {
			return this;
		}
	}

	public class216 method4382(boolean var1) {
		if (!var1 && field2559.length < this.field2607) {
			field2559 = new byte[this.field2607 + 100];
		}

		return this.method4433(var1, field2622, field2559);
	}

	public class216 method4383(boolean var1) {
		if (!var1 && field2561.length < this.field2607) {
			field2561 = new byte[this.field2607 + 100];
		}

		return this.method4433(var1, field2625, field2561);
	}

	class216 method4433(boolean var1, class216 var2, byte[] var3) {
		var2.field2565 = this.field2565;
		var2.field2607 = this.field2607;
		var2.field2614 = this.field2614;
		if (var2.field2592 == null || var2.field2592.length < this.field2565) {
			var2.field2592 = new int[this.field2565 + 100];
			var2.field2599 = new int[this.field2565 + 100];
			var2.field2615 = new int[this.field2565 + 100];
		}

		int var4;
		for (var4 = 0; var4 < this.field2565; ++var4) {
			var2.field2592[var4] = this.field2592[var4];
			var2.field2599[var4] = this.field2599[var4];
			var2.field2615[var4] = this.field2615[var4];
		}

		if (var1) {
			var2.field2606 = this.field2606;
		} else {
			var2.field2606 = var3;
			if (this.field2606 == null) {
				for (var4 = 0; var4 < this.field2607; ++var4) {
					var2.field2606[var4] = 0;
				}
			} else {
				for (var4 = 0; var4 < this.field2607; ++var4) {
					var2.field2606[var4] = this.field2606[var4];
				}
			}
		}

		var2.field2582 = this.field2582;
		var2.field2578 = this.field2578;
		var2.field2572 = this.field2572;
		var2.field2573 = this.field2573;
		var2.field2608 = this.field2608;
		var2.field2575 = this.field2575;
		var2.field2618 = this.field2618;
		var2.field2593 = this.field2593;
		var2.field2605 = this.field2605;
		var2.field2580 = this.field2580;
		var2.field2569 = this.field2569;
		var2.field2583 = this.field2583;
		var2.field2584 = this.field2584;
		var2.field2585 = this.field2585;
		var2.field2586 = this.field2586;
		var2.field2587 = this.field2587;
		var2.field2588 = this.field2588;
		var2.field2589 = this.field2589;
		var2.method4469();
		var2.field2570 = 0;
		return var2;
	}

	void method4485(int var1) {
		if (!this.field2595.containsKey(var1)) {
			int var2 = 0;
			int var3 = 0;
			int var4 = 0;
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			int var8 = field2623[var1];
			int var9 = field2601[var1];

			for (int var10 = 0; var10 < this.field2565; ++var10) {
				int var11 = class221.method4539(this.field2592[var10], this.field2615[var10], var8, var9);
				int var12 = this.field2599[var10];
				int var13 = class221.method4552(this.field2592[var10], this.field2615[var10], var8, var9);
				if (var11 < var2) {
					var2 = var11;
				}

				if (var11 > var5) {
					var5 = var11;
				}

				if (var12 < var3) {
					var3 = var12;
				}

				if (var12 > var6) {
					var6 = var12;
				}

				if (var13 < var4) {
					var4 = var13;
				}

				if (var13 > var7) {
					var7 = var13;
				}
			}

			class214 var14 = new class214((var5 + var2) / 2, (var6 + var3) / 2, (var7 + var4) / 2, (var5 - var2 + 1) / 2, (var6 - var3 + 1) / 2, (var7 - var4 + 1) / 2);
			boolean var15 = true;
			if (var14.field2540 < 32) {
				var14.field2540 = 32;
			}

			if (var14.field2537 < 32) {
				var14.field2537 = 32;
			}

			if (this.field2589) {
				boolean var16 = true;
				var14.field2540 += 8;
				var14.field2537 += 8;
			}

			this.field2595.put(var1, var14);
		}
	}

	public void method4412() {
		if (this.field2590 != 1) {
			this.field2590 = 1;
			super.field2740 = 0;
			this.field2591 = 0;
			this.field2574 = 0;

			for (int var1 = 0; var1 < this.field2565; ++var1) {
				int var2 = this.field2592[var1];
				int var3 = this.field2599[var1];
				int var4 = this.field2615[var1];
				if (-var3 > super.field2740) {
					super.field2740 = -var3;
				}

				if (var3 > this.field2591) {
					this.field2591 = var3;
				}

				int var5 = var2 * var2 + var4 * var4;
				if (var5 > this.field2574) {
					this.field2574 = var5;
				}
			}

			this.field2574 = (int)(Math.sqrt((double)this.field2574) + 0.99D);
			this.field2594 = (int)(Math.sqrt((double)(this.field2574 * this.field2574 + super.field2740 * super.field2740)) + 0.99D);
			this.field2577 = this.field2594 + (int)(Math.sqrt((double)(this.field2574 * this.field2574 + this.field2591 * this.field2591)) + 0.99D);
		}
	}

	void method4386() {
		if (this.field2590 != 2) {
			this.field2590 = 2;
			this.field2574 = 0;

			for (int var1 = 0; var1 < this.field2565; ++var1) {
				int var2 = this.field2592[var1];
				int var3 = this.field2599[var1];
				int var4 = this.field2615[var1];
				int var5 = var2 * var2 + var4 * var4 + var3 * var3;
				if (var5 > this.field2574) {
					this.field2574 = var5;
				}
			}

			this.field2574 = (int)(Math.sqrt((double)this.field2574) + 0.99D);
			this.field2594 = this.field2574;
			this.field2577 = this.field2574 + this.field2574;
		}
	}

	public int method4387() {
		this.method4412();
		return this.field2574;
	}

	public void method4469() {
		this.field2590 = 0;
		this.field2595.clear();
	}

	public void method4389(class209 var1, int var2) {
		if (this.field2585 != null) {
			if (var2 != -1) {
				class223 var3 = var1.field2426[var2];
				class222 var4 = var3.field2705;
				field2616 = 0;
				field2617 = 0;
				field2560 = 0;

				for (int var5 = 0; var5 < var3.field2706; ++var5) {
					int var6 = var3.field2707[var5];
					this.method4393(var4.field2696[var6], var4.field2697[var6], var3.field2701[var5], var3.field2709[var5], var3.field2710[var5]);
				}

				this.method4469();
			}
		}
	}

	public void method4434(class153 var1, int var2) {
		class222 var3 = var1.field1456;
		class217 var4 = var3.method4616();
		if (var4 != null) {
			var3.method4616().method4507(var1, var2);
			this.method4392(var3.method4616(), var1.method2699());
		}

		if (var1.method2683()) {
			this.method4391(var1, var2);
		}

		this.method4469();
	}

	void method4391(class153 var1, int var2) {
		class222 var3 = var1.field1456;

		for (int var4 = 0; var4 < var3.field2695; ++var4) {
			int var5 = var3.field2696[var4];
			if (var5 == 5 && var1.field1457 != null && var1.field1457[var4] != null && var1.field1457[var4][0] != null && this.field2586 != null && this.field2606 != null) {
				class125 var6 = var1.field1457[var4][0];
				int[] var7 = var3.field2697[var4];
				int var8 = var7.length;

				for (int var9 = 0; var9 < var8; ++var9) {
					int var10 = var7[var9];
					if (var10 < this.field2586.length) {
						int[] var11 = this.field2586[var10];

						for (int var12 = 0; var12 < var11.length; ++var12) {
							int var13 = var11[var12];
							int var14 = (int)((float)(this.field2606[var13] & 255) + var6.method2384(var2) * 255.0F);
							if (var14 < 0) {
								var14 = 0;
							} else if (var14 > 255) {
								var14 = 255;
							}

							this.field2606[var13] = (byte)var14;
						}
					}
				}
			}
		}

	}

	void method4392(class217 var1, int var2) {
		this.method4422(var1, var2);
	}

	public void method4405(class209 var1, int var2, class209 var3, int var4, int[] var5) {
		if (var2 != -1) {
			if (var5 != null && var4 != -1) {
				class223 var6 = var1.field2426[var2];
				class223 var7 = var3.field2426[var4];
				class222 var8 = var6.field2705;
				field2616 = 0;
				field2617 = 0;
				field2560 = 0;
				byte var9 = 0;
				int var13 = var9 + 1;
				int var10 = var5[var9];

				int var11;
				int var12;
				for (var11 = 0; var11 < var6.field2706; ++var11) {
					for (var12 = var6.field2707[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 != var10 || var8.field2696[var12] == 0) {
						this.method4393(var8.field2696[var12], var8.field2697[var12], var6.field2701[var11], var6.field2709[var11], var6.field2710[var11]);
					}
				}

				field2616 = 0;
				field2617 = 0;
				field2560 = 0;
				var9 = 0;
				var13 = var9 + 1;
				var10 = var5[var9];

				for (var11 = 0; var11 < var7.field2706; ++var11) {
					for (var12 = var7.field2707[var11]; var12 > var10; var10 = var5[var13++]) {
					}

					if (var12 == var10 || var8.field2696[var12] == 0) {
						this.method4393(var8.field2696[var12], var8.field2697[var12], var7.field2701[var11], var7.field2709[var11], var7.field2710[var11]);
					}
				}

				this.method4469();
			} else {
				this.method4389(var1, var2);
			}
		}
	}

	public void method4459(class222 var1, class153 var2, int var3, boolean[] var4, boolean var5, boolean var6) {
		class217 var7 = var1.method4616();
		if (var7 != null) {
			var7.method4518(var2, var3, var4, var5);
			if (var6) {
				this.method4392(var7, var2.method2699());
			}
		}

		if (!var5 && var2.method2683()) {
			this.method4391(var2, var3);
		}

	}

	public void method4395(class209 var1, int var2, int[] var3, boolean var4) {
		if (var3 == null) {
			this.method4389(var1, var2);
		} else {
			class223 var5 = var1.field2426[var2];
			class222 var6 = var5.field2705;
			byte var7 = 0;
			int var11 = var7 + 1;
			int var8 = var3[var7];
			field2616 = 0;
			field2617 = 0;
			field2560 = 0;

			for (int var9 = 0; var9 < var5.field2706; ++var9) {
				int var10;
				for (var10 = var5.field2707[var9]; var10 > var8; var8 = var3[var11++]) {
				}

				if (var4) {
					if (var10 == var8 || var6.field2696[var10] == 0) {
						this.method4393(var6.field2696[var10], var6.field2697[var10], var5.field2701[var9], var5.field2709[var9], var5.field2710[var9]);
					}
				} else if (var10 != var8 || var6.field2696[var10] == 0) {
					this.method4393(var6.field2696[var10], var6.field2697[var10], var5.field2701[var9], var5.field2709[var9], var5.field2710[var9]);
				}
			}

		}
	}

	void method4393(int var1, int[] var2, int var3, int var4, int var5) {
		int var6 = var2.length;
		int var7;
		int var8;
		int var11;
		int var12;
		if (var1 == 0) {
			var7 = 0;
			field2616 = 0;
			field2617 = 0;
			field2560 = 0;

			for (var8 = 0; var8 < var6; ++var8) {
				int var9 = var2[var8];
				if (var9 < this.field2585.length) {
					int[] var10 = this.field2585[var9];

					for (var11 = 0; var11 < var10.length; ++var11) {
						var12 = var10[var11];
						field2616 += this.field2592[var12];
						field2617 += this.field2599[var12];
						field2560 += this.field2615[var12];
						++var7;
					}
				}
			}

			if (var7 > 0) {
				field2616 = field2616 / var7 + var3;
				field2617 = field2617 / var7 + var4;
				field2560 = field2560 / var7 + var5;
			} else {
				field2616 = var3;
				field2617 = var4;
				field2560 = var5;
			}

		} else {
			int[] var10000;
			int[] var18;
			int var19;
			if (var1 == 1) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2585.length) {
						var18 = this.field2585[var8];

						for (var19 = 0; var19 < var18.length; ++var19) {
							var11 = var18[var19];
							var10000 = this.field2592;
							var10000[var11] += var3;
							var10000 = this.field2599;
							var10000[var11] += var4;
							var10000 = this.field2615;
							var10000[var11] += var5;
						}
					}
				}

			} else if (var1 == 2) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2585.length) {
						var18 = this.field2585[var8];

						for (var19 = 0; var19 < var18.length; ++var19) {
							var11 = var18[var19];
							var10000 = this.field2592;
							var10000[var11] -= field2616;
							var10000 = this.field2599;
							var10000[var11] -= field2617;
							var10000 = this.field2615;
							var10000[var11] -= field2560;
							var12 = (var3 & 255) * 8;
							int var13 = (var4 & 255) * 8;
							int var14 = (var5 & 255) * 8;
							int var15;
							int var16;
							int var17;
							if (var14 != 0) {
								var15 = field2601[var14];
								var16 = field2623[var14];
								var17 = this.field2599[var11] * var15 + this.field2592[var11] * var16 >> 16;
								this.field2599[var11] = this.field2599[var11] * var16 - this.field2592[var11] * var15 >> 16;
								this.field2592[var11] = var17;
							}

							if (var12 != 0) {
								var15 = field2601[var12];
								var16 = field2623[var12];
								var17 = this.field2599[var11] * var16 - this.field2615[var11] * var15 >> 16;
								this.field2615[var11] = this.field2599[var11] * var15 + this.field2615[var11] * var16 >> 16;
								this.field2599[var11] = var17;
							}

							if (var13 != 0) {
								var15 = field2601[var13];
								var16 = field2623[var13];
								var17 = this.field2615[var11] * var15 + this.field2592[var11] * var16 >> 16;
								this.field2615[var11] = this.field2615[var11] * var16 - this.field2592[var11] * var15 >> 16;
								this.field2592[var11] = var17;
							}

							var10000 = this.field2592;
							var10000[var11] += field2616;
							var10000 = this.field2599;
							var10000[var11] += field2617;
							var10000 = this.field2615;
							var10000[var11] += field2560;
						}
					}
				}

			} else if (var1 == 3) {
				for (var7 = 0; var7 < var6; ++var7) {
					var8 = var2[var7];
					if (var8 < this.field2585.length) {
						var18 = this.field2585[var8];

						for (var19 = 0; var19 < var18.length; ++var19) {
							var11 = var18[var19];
							var10000 = this.field2592;
							var10000[var11] -= field2616;
							var10000 = this.field2599;
							var10000[var11] -= field2617;
							var10000 = this.field2615;
							var10000[var11] -= field2560;
							this.field2592[var11] = this.field2592[var11] * var3 / 128;
							this.field2599[var11] = this.field2599[var11] * var4 / 128;
							this.field2615[var11] = this.field2615[var11] * var5 / 128;
							var10000 = this.field2592;
							var10000[var11] += field2616;
							var10000 = this.field2599;
							var10000[var11] += field2617;
							var10000 = this.field2615;
							var10000[var11] += field2560;
						}
					}
				}

			} else if (var1 == 5) {
				if (this.field2586 != null && this.field2606 != null) {
					for (var7 = 0; var7 < var6; ++var7) {
						var8 = var2[var7];
						if (var8 < this.field2586.length) {
							var18 = this.field2586[var8];

							for (var19 = 0; var19 < var18.length; ++var19) {
								var11 = var18[var19];
								var12 = (this.field2606[var11] & 255) + var3 * 8;
								if (var12 < 0) {
									var12 = 0;
								} else if (var12 > 255) {
									var12 = 255;
								}

								this.field2606[var11] = (byte)var12;
							}
						}
					}
				}

			}
		}
	}

	public void method4397() {
		for (int var1 = 0; var1 < this.field2565; ++var1) {
			int var2 = this.field2592[var1];
			this.field2592[var1] = this.field2615[var1];
			this.field2615[var1] = -var2;
		}

		this.method4469();
	}

	public void method4398() {
		for (int var1 = 0; var1 < this.field2565; ++var1) {
			this.field2592[var1] = -this.field2592[var1];
			this.field2615[var1] = -this.field2615[var1];
		}

		this.method4469();
	}

	public void method4478() {
		for (int var1 = 0; var1 < this.field2565; ++var1) {
			int var2 = this.field2615[var1];
			this.field2615[var1] = this.field2592[var1];
			this.field2592[var1] = -var2;
		}

		this.method4469();
	}

	public void method4441(int var1) {
		int var2 = field2601[var1];
		int var3 = field2623[var1];

		for (int var4 = 0; var4 < this.field2565; ++var4) {
			int var5 = this.field2599[var4] * var3 - this.field2615[var4] * var2 >> 16;
			this.field2615[var4] = this.field2599[var4] * var2 + this.field2615[var4] * var3 >> 16;
			this.field2599[var4] = var5;
		}

		this.method4469();
	}

	public void method4408(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2565; ++var4) {
			int[] var10000 = this.field2592;
			var10000[var4] += var1;
			var10000 = this.field2599;
			var10000[var4] += var2;
			var10000 = this.field2615;
			var10000[var4] += var3;
		}

		this.method4469();
	}

	public void method4437(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2565; ++var4) {
			this.field2592[var4] = this.field2592[var4] * var1 / 128;
			this.field2599[var4] = this.field2599[var4] * var2 / 128;
			this.field2615[var4] = this.field2615[var4] * var3 / 128;
		}

		this.method4469();
	}

	public final void method4403(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (this.field2590 != 2 && this.field2590 != 1) {
			this.method4386();
		}

		int var8 = class221.field2676;
		int var9 = class221.field2689;
		int var10 = field2601[var1];
		int var11 = field2623[var1];
		int var12 = field2601[var2];
		int var13 = field2623[var2];
		int var14 = field2601[var3];
		int var15 = field2623[var3];
		int var16 = field2601[var4];
		int var17 = field2623[var4];
		int var18 = var6 * var16 + var7 * var17 >> 16;

		for (int var19 = 0; var19 < this.field2565; ++var19) {
			int var20 = this.field2592[var19];
			int var21 = this.field2599[var19];
			int var22 = this.field2615[var19];
			int var23;
			if (var3 != 0) {
				var23 = var21 * var14 + var20 * var15 >> 16;
				var21 = var21 * var15 - var20 * var14 >> 16;
				var20 = var23;
			}

			if (var1 != 0) {
				var23 = var21 * var11 - var22 * var10 >> 16;
				var22 = var21 * var10 + var22 * var11 >> 16;
				var21 = var23;
			}

			if (var2 != 0) {
				var23 = var22 * var12 + var20 * var13 >> 16;
				var22 = var22 * var13 - var20 * var12 >> 16;
				var20 = var23;
			}

			var20 += var5;
			var21 += var6;
			var22 += var7;
			var23 = var21 * var17 - var22 * var16 >> 16;
			var22 = var21 * var16 + var22 * var17 >> 16;
			field2566[var19] = var22 - var18;
			field2609[var19] = var8 + var20 * class221.field2675 / var22;
			field2600[var19] = var9 + var23 * class221.field2675 / var22;
			if (this.field2614 > 0) {
				field2602[var19] = var20;
				field2603[var19] = var23;
				field2567[var19] = var22;
			}
		}

		try {
			this.method4406(false, false, false, 0L);
		} catch (Exception var25) {
		}

	}

	public final void method4432(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		if (this.field2590 != 2 && this.field2590 != 1) {
			this.method4386();
		}

		int var9 = class221.field2676;
		int var10 = class221.field2689;
		int var11 = field2601[var1];
		int var12 = field2623[var1];
		int var13 = field2601[var2];
		int var14 = field2623[var2];
		int var15 = field2601[var3];
		int var16 = field2623[var3];
		int var17 = field2601[var4];
		int var18 = field2623[var4];
		int var19 = var6 * var17 + var7 * var18 >> 16;

		for (int var20 = 0; var20 < this.field2565; ++var20) {
			int var21 = this.field2592[var20];
			int var22 = this.field2599[var20];
			int var23 = this.field2615[var20];
			int var24;
			if (var3 != 0) {
				var24 = var22 * var15 + var21 * var16 >> 16;
				var22 = var22 * var16 - var21 * var15 >> 16;
				var21 = var24;
			}

			if (var1 != 0) {
				var24 = var22 * var12 - var23 * var11 >> 16;
				var23 = var22 * var11 + var23 * var12 >> 16;
				var22 = var24;
			}

			if (var2 != 0) {
				var24 = var23 * var13 + var21 * var14 >> 16;
				var23 = var23 * var14 - var21 * var13 >> 16;
				var21 = var24;
			}

			var21 += var5;
			var22 += var6;
			var23 += var7;
			var24 = var22 * var18 - var23 * var17 >> 16;
			var23 = var22 * var17 + var23 * var18 >> 16;
			field2566[var20] = var23 - var19;
			field2609[var20] = var9 + var21 * class221.field2675 / var8;
			field2600[var20] = var10 + var24 * class221.field2675 / var8;
			if (this.field2614 > 0) {
				field2602[var20] = var21;
				field2603[var20] = var24;
				field2567[var20] = var23;
			}
		}

		try {
			this.method4406(false, false, false, 0L);
		} catch (Exception var26) {
		}

	}

	void method4626(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		if (this.field2590 != 1) {
			this.method4412();
		}

		this.method4485(var1);
		int var11 = var8 * var5 - var6 * var4 >> 16;
		int var12 = var7 * var2 + var11 * var3 >> 16;
		int var13 = this.field2574 * var3 >> 16;
		int var14 = var12 + var13;
		if (var14 > 50 && var12 < 3500) {
			int var15 = var8 * var4 + var6 * var5 >> 16;
			int var16 = (var15 - this.field2574) * class221.field2675;
			if (var16 / var14 < class221.field2681) {
				int var17 = (var15 + this.field2574) * class221.field2675;
				if (var17 / var14 > class221.field2664) {
					int var18 = var7 * var3 - var11 * var2 >> 16;
					int var19 = this.field2574 * var2 >> 16;
					int var20 = var19 + (this.field2591 * var3 >> 16);
					int var21 = (var18 + var20) * class221.field2675;
					if (var21 / var14 > class221.field2682) {
						int var22 = var19 + (super.field2740 * var3 >> 16);
						int var23 = (var18 - var22) * class221.field2675;
						if (var23 / var14 < class221.field2683) {
							int var24 = var13 + (super.field2740 * var2 >> 16);
							boolean var25 = false;
							boolean var26 = false;
							if (var12 - var24 <= 50) {
								var26 = true;
							}

							boolean var27 = var26 || this.field2614 > 0;
							int var28 = class215.field2545;
							int var30 = class215.field2554;
							boolean var32 = class215.method2878();
							boolean var33 = var9 != 0L && !class215.method5254(var9);
							boolean var35 = false;
							int var39;
							int var40;
							int var41;
							int var42;
							int var51;
							int var55;
							int var56;
							int var57;
							if (var33 && var32) {
								boolean var36 = false;
								if (field2619) {
									boolean var37;
									if (!class215.method2878()) {
										var37 = false;
									} else {
										int var45;
										int var46;
										int var47;
										int var48;
										if (!class215.field2547) {
											var39 = class211.field2449;
											var40 = class211.field2475;
											var41 = class211.field2473;
											var42 = class211.field2474;
											byte var43 = 50;
											short var44 = 3500;
											var45 = var43 * (class215.field2545 - class221.field2676) / class221.field2675;
											var46 = (class215.field2554 - class221.field2689) * var43 / class221.field2675;
											var47 = var44 * (class215.field2545 - class221.field2676) / class221.field2675;
											var48 = (class215.field2554 - class221.field2689) * var44 / class221.field2675;
											int var49 = class221.method4550(var46, var43, var40, var39);
											var56 = class221.method4556(var46, var43, var40, var39);
											var46 = var49;
											var49 = class221.method4550(var48, var44, var40, var39);
											var57 = class221.method4556(var48, var44, var40, var39);
											var48 = var49;
											var49 = class221.method4553(var45, var56, var42, var41);
											var56 = class221.method4554(var45, var56, var42, var41);
											var45 = var49;
											var49 = class221.method4553(var47, var57, var42, var41);
											var57 = class221.method4554(var47, var57, var42, var41);
											class363.field4353 = (var49 + var45) / 2;
											class215.field2548 = (var48 + var46) / 2;
											class149.field1434 = (var56 + var57) / 2;
											class302.field3653 = (var49 - var45) / 2;
											class44.field327 = (var48 - var46) / 2;
											class215.field2549 = (var57 - var56) / 2;
											class215.field2551 = Math.abs(class302.field3653);
											class36.field219 = Math.abs(class44.field327);
											class215.field2544 = Math.abs(class215.field2549);
										}

										class214 var50 = (class214)this.field2595.get(var1);
										var40 = var6 + var50.field2542;
										var41 = var50.field2538 + var7;
										var42 = var8 + var50.field2539;
										var56 = var50.field2540;
										var57 = var50.field2541;
										var45 = var50.field2537;
										var46 = class363.field4353 - var40;
										var47 = class215.field2548 - var41;
										var48 = class149.field1434 - var42;
										if (Math.abs(var46) > var56 + class215.field2551) {
											var37 = false;
										} else if (Math.abs(var47) > var57 + class36.field219) {
											var37 = false;
										} else if (Math.abs(var48) > var45 + class215.field2544) {
											var37 = false;
										} else if (Math.abs(class44.field327 * var48 - class215.field2549 * var47) > var45 * class36.field219 + var57 * class215.field2544) {
											var37 = false;
										} else if (Math.abs(class215.field2549 * var46 - var48 * class302.field3653) > var56 * class215.field2544 + var45 * class215.field2551) {
											var37 = false;
										} else if (Math.abs(class302.field3653 * var47 - var46 * class44.field327) > class36.field219 * var56 + class215.field2551 * var57) {
											var37 = false;
										} else {
											var37 = true;
										}
									}

									var36 = var37;
								} else {
									var55 = var12 - var13;
									if (var55 <= 50) {
										var55 = 50;
									}

									if (var15 > 0) {
										var16 /= var14;
										var17 /= var55;
									} else {
										var17 /= var14;
										var16 /= var55;
									}

									if (var18 > 0) {
										var23 /= var14;
										var21 /= var55;
									} else {
										var21 /= var14;
										var23 /= var55;
									}

									var51 = var28 - class221.field2676;
									var39 = var30 - class221.field2689;
									if (var51 > var16 && var51 < var17 && var39 > var23 && var39 < var21) {
										var36 = true;
									}
								}

								if (var36) {
									if (this.field2589) {
										class215.method6555(var9);
									} else {
										var35 = true;
									}
								}
							}

							int var54 = class221.field2676;
							var55 = class221.field2689;
							var51 = 0;
							var39 = 0;
							if (var1 != 0) {
								var51 = field2601[var1];
								var39 = field2623[var1];
							}

							for (var40 = 0; var40 < this.field2565; ++var40) {
								var41 = this.field2592[var40];
								var42 = this.field2599[var40];
								var56 = this.field2615[var40];
								if (var1 != 0) {
									var57 = var56 * var51 + var41 * var39 >> 16;
									var56 = var56 * var39 - var41 * var51 >> 16;
									var41 = var57;
								}

								var41 += var6;
								var42 += var7;
								var56 += var8;
								var57 = var56 * var4 + var41 * var5 >> 16;
								var56 = var56 * var5 - var41 * var4 >> 16;
								var41 = var57;
								var57 = var42 * var3 - var56 * var2 >> 16;
								var56 = var42 * var2 + var56 * var3 >> 16;
								field2566[var40] = var56 - var12;
								if (var56 >= 50) {
									field2609[var40] = var54 + var41 * class221.field2675 / var56;
									field2600[var40] = var55 + var57 * class221.field2675 / var56;
								} else {
									field2609[var40] = -5000;
									var25 = true;
								}

								if (var27) {
									field2602[var40] = var41;
									field2603[var40] = var57;
									field2567[var40] = var56;
								}
							}

							try {
								this.method4406(var25, var35, this.field2589, var9);
							} catch (Exception var53) {
							}

						}
					}
				}
			}
		}
	}

	final void method4406(boolean var1, boolean var2, boolean var3, long var4) {
		if (this.field2577 < 6000) {
			int var6;
			for (var6 = 0; var6 < this.field2577; ++var6) {
				field2612[var6] = 0;
			}

			var6 = var3 ? 20 : 5;

			int var8;
			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			int var15;
			int var16;
			int var18;
			for (char var7 = 0; var7 < this.field2607; ++var7) {
				if (this.field2575[var7] != -2) {
					var8 = this.field2582[var7];
					var9 = this.field2578[var7];
					var10 = this.field2572[var7];
					var11 = field2609[var8];
					var12 = field2609[var9];
					var13 = field2609[var10];
					int var14;
					if (!var1 || var11 != -5000 && var12 != -5000 && var13 != -5000) {
						if (var2 && class131.method2444(field2600[var8], field2600[var9], field2600[var10], var11, var12, var13, var6)) {
							class215.method6555(var4);
							var2 = false;
						}

						if ((var11 - var12) * (field2600[var10] - field2600[var9]) - (field2600[var8] - field2600[var9]) * (var13 - var12) > 0) {
							field2598[var7] = false;
							if (var11 >= 0 && var12 >= 0 && var13 >= 0 && var11 <= class221.field2678 && var12 <= class221.field2678 && var13 <= class221.field2678) {
								field2597[var7] = false;
							} else {
								field2597[var7] = true;
							}

							var14 = (field2566[var8] + field2566[var9] + field2566[var10]) / 3 + this.field2594;
							field2576[var14][field2612[var14]++] = var7;
						}
					} else {
						var14 = field2602[var8];
						var15 = field2602[var9];
						var16 = field2602[var10];
						int var17 = field2603[var8];
						var18 = field2603[var9];
						int var19 = field2603[var10];
						int var20 = field2567[var8];
						int var21 = field2567[var9];
						int var22 = field2567[var10];
						var14 -= var15;
						var16 -= var15;
						var17 -= var18;
						var19 -= var18;
						var20 -= var21;
						var22 -= var21;
						int var23 = var17 * var22 - var20 * var19;
						int var24 = var20 * var16 - var14 * var22;
						int var25 = var14 * var19 - var17 * var16;
						if (var15 * var23 + var18 * var24 + var21 * var25 > 0) {
							field2598[var7] = true;
							int var26 = (field2566[var8] + field2566[var9] + field2566[var10]) / 3 + this.field2594;
							field2576[var26][field2612[var26]++] = var7;
						}
					}
				}
			}

			char[] var27;
			int var31;
			char var32;
			if (this.field2618 == null) {
				for (var31 = this.field2577 - 1; var31 >= 0; --var31) {
					var32 = field2612[var31];
					if (var32 > 0) {
						var27 = field2576[var31];

						for (var10 = 0; var10 < var32; ++var10) {
							this.method4400(var27[var10]);
						}
					}
				}

			} else {
				for (var31 = 0; var31 < 12; ++var31) {
					field2568[var31] = 0;
					field2581[var31] = 0;
				}

				for (var31 = this.field2577 - 1; var31 >= 0; --var31) {
					var32 = field2612[var31];
					if (var32 > 0) {
						var27 = field2576[var31];

						for (var10 = 0; var10 < var32; ++var10) {
							char var33 = var27[var10];
							byte var34 = this.field2618[var33];
							var13 = field2568[var34]++;
							field2631[var34][var13] = var33;
							if (var34 < 10) {
								int[] var35 = field2581;
								var35[var34] += var31;
							} else if (var34 == 10) {
								field2610[var13] = var31;
							} else {
								field2611[var13] = var31;
							}
						}
					}
				}

				var31 = 0;
				if (field2568[1] > 0 || field2568[2] > 0) {
					var31 = (field2581[1] + field2581[2]) / (field2568[1] + field2568[2]);
				}

				var8 = 0;
				if (field2568[3] > 0 || field2568[4] > 0) {
					var8 = (field2581[3] + field2581[4]) / (field2568[3] + field2568[4]);
				}

				var9 = 0;
				if (field2568[6] > 0 || field2568[8] > 0) {
					var9 = (field2581[6] + field2581[8]) / (field2568[6] + field2568[8]);
				}

				var11 = 0;
				var12 = field2568[10];
				int[] var28 = field2631[10];
				int[] var29 = field2610;
				if (var11 == var12) {
					var11 = 0;
					var12 = field2568[11];
					var28 = field2631[11];
					var29 = field2611;
				}

				if (var11 < var12) {
					var10 = var29[var11];
				} else {
					var10 = -1000;
				}

				for (var15 = 0; var15 < 10; ++var15) {
					while (var15 == 0 && var10 > var31) {
						this.method4400(var28[var11++]);
						if (var11 == var12 && var28 != field2631[11]) {
							var11 = 0;
							var12 = field2568[11];
							var28 = field2631[11];
							var29 = field2611;
						}

						if (var11 < var12) {
							var10 = var29[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 3 && var10 > var8) {
						this.method4400(var28[var11++]);
						if (var11 == var12 && var28 != field2631[11]) {
							var11 = 0;
							var12 = field2568[11];
							var28 = field2631[11];
							var29 = field2611;
						}

						if (var11 < var12) {
							var10 = var29[var11];
						} else {
							var10 = -1000;
						}
					}

					while (var15 == 5 && var10 > var9) {
						this.method4400(var28[var11++]);
						if (var11 == var12 && var28 != field2631[11]) {
							var11 = 0;
							var12 = field2568[11];
							var28 = field2631[11];
							var29 = field2611;
						}

						if (var11 < var12) {
							var10 = var29[var11];
						} else {
							var10 = -1000;
						}
					}

					var16 = field2568[var15];
					int[] var30 = field2631[var15];

					for (var18 = 0; var18 < var16; ++var18) {
						this.method4400(var30[var18]);
					}
				}

				while (var10 != -1000) {
					this.method4400(var28[var11++]);
					if (var11 == var12 && var28 != field2631[11]) {
						var11 = 0;
						var28 = field2631[11];
						var12 = field2568[11];
						var29 = field2611;
					}

					if (var11 < var12) {
						var10 = var29[var11];
					} else {
						var10 = -1000;
					}
				}

			}
		}
	}

	final void method4400(int var1) {
		if (field2598[var1]) {
			this.method4380(var1);
		} else {
			int var2 = this.field2582[var1];
			int var3 = this.field2578[var1];
			int var4 = this.field2572[var1];
			class221.field2684 = field2597[var1];
			if (this.field2606 == null) {
				class221.field2668 = 0;
			} else {
				class221.field2668 = this.field2606[var1] & 255;
			}

			this.method4442(var1, field2600[var2], field2600[var3], field2600[var4], field2609[var2], field2609[var3], field2609[var4], this.field2573[var1], this.field2608[var1], this.field2575[var1]);
		}
	}

	boolean method4448(int var1) {
		return this.field2570 > 0 && var1 < this.field2632;
	}

	final void method4442(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (this.field2605 != null && this.field2605[var1] != -1) {
			int var12;
			int var13;
			int var15;
			if (this.field2593 != null && this.field2593[var1] != -1) {
				int var14 = this.field2593[var1] & 255;
				var15 = this.field2569[var14];
				var12 = this.field2583[var14];
				var13 = this.field2584[var14];
			} else {
				var15 = this.field2582[var1];
				var12 = this.field2578[var1];
				var13 = this.field2572[var1];
			}

			if (this.field2575[var1] == -1) {
				class221.method4546(var2, var3, var4, var5, var6, var7, var8, var8, var8, field2602[var15], field2602[var12], field2602[var13], field2603[var15], field2603[var12], field2603[var13], field2567[var15], field2567[var12], field2567[var13], this.field2605[var1]);
			} else {
				class221.method4546(var2, var3, var4, var5, var6, var7, var8, var9, var10, field2602[var15], field2602[var12], field2602[var13], field2603[var15], field2603[var12], field2603[var13], field2567[var15], field2567[var12], field2567[var13], this.field2605[var1]);
			}
		} else {
			boolean var11 = this.method4448(var1);
			if (this.field2575[var1] == -1 && var11) {
				class221.method4544(var2, var3, var4, var5, var6, var7, field2571[this.field2573[var1]], this.field2628, this.field2629, this.field2630, this.field2570);
			} else if (this.field2575[var1] == -1) {
				class221.method4543(var2, var3, var4, var5, var6, var7, field2571[this.field2573[var1]]);
			} else if (var11) {
				class221.method4540(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.field2628, this.field2629, this.field2630, this.field2570);
			} else {
				class221.method4557(var2, var3, var4, var5, var6, var7, var8, var9, var10);
			}
		}

	}

	final void method4380(int var1) {
		int var2 = class221.field2676;
		int var3 = class221.field2689;
		int var4 = 0;
		int var5 = this.field2582[var1];
		int var6 = this.field2578[var1];
		int var7 = this.field2572[var1];
		int var8 = field2567[var5];
		int var9 = field2567[var6];
		int var10 = field2567[var7];
		if (this.field2606 == null) {
			class221.field2668 = 0;
		} else {
			class221.field2668 = this.field2606[var1] & 255;
		}

		int var11;
		int var12;
		int var13;
		int var14;
		if (var8 >= 50) {
			field2613[var4] = field2609[var5];
			field2558[var4] = field2600[var5];
			field2604[var4++] = this.field2573[var1];
		} else {
			var11 = field2602[var5];
			var12 = field2603[var5];
			var13 = this.field2573[var1];
			if (var10 >= 50) {
				var14 = (50 - var8) * field2579[var10 - var8];
				field2613[var4] = var2 + (var11 + ((field2602[var7] - var11) * var14 >> 16)) * class221.field2675 / 50;
				field2558[var4] = var3 + (var12 + ((field2603[var7] - var12) * var14 >> 16)) * class221.field2675 / 50;
				field2604[var4++] = var13 + ((this.field2575[var1] - var13) * var14 >> 16);
			}

			if (var9 >= 50) {
				var14 = (50 - var8) * field2579[var9 - var8];
				field2613[var4] = var2 + (var11 + ((field2602[var6] - var11) * var14 >> 16)) * class221.field2675 / 50;
				field2558[var4] = var3 + (var12 + ((field2603[var6] - var12) * var14 >> 16)) * class221.field2675 / 50;
				field2604[var4++] = var13 + ((this.field2608[var1] - var13) * var14 >> 16);
			}
		}

		if (var9 >= 50) {
			field2613[var4] = field2609[var6];
			field2558[var4] = field2600[var6];
			field2604[var4++] = this.field2608[var1];
		} else {
			var11 = field2602[var6];
			var12 = field2603[var6];
			var13 = this.field2608[var1];
			if (var8 >= 50) {
				var14 = (50 - var9) * field2579[var8 - var9];
				field2613[var4] = var2 + (var11 + ((field2602[var5] - var11) * var14 >> 16)) * class221.field2675 / 50;
				field2558[var4] = var3 + (var12 + ((field2603[var5] - var12) * var14 >> 16)) * class221.field2675 / 50;
				field2604[var4++] = var13 + ((this.field2573[var1] - var13) * var14 >> 16);
			}

			if (var10 >= 50) {
				var14 = (50 - var9) * field2579[var10 - var9];
				field2613[var4] = var2 + (var11 + ((field2602[var7] - var11) * var14 >> 16)) * class221.field2675 / 50;
				field2558[var4] = var3 + (var12 + ((field2603[var7] - var12) * var14 >> 16)) * class221.field2675 / 50;
				field2604[var4++] = var13 + ((this.field2575[var1] - var13) * var14 >> 16);
			}
		}

		if (var10 >= 50) {
			field2613[var4] = field2609[var7];
			field2558[var4] = field2600[var7];
			field2604[var4++] = this.field2575[var1];
		} else {
			var11 = field2602[var7];
			var12 = field2603[var7];
			var13 = this.field2575[var1];
			if (var9 >= 50) {
				var14 = (50 - var10) * field2579[var9 - var10];
				field2613[var4] = var2 + (var11 + ((field2602[var6] - var11) * var14 >> 16)) * class221.field2675 / 50;
				field2558[var4] = var3 + (var12 + ((field2603[var6] - var12) * var14 >> 16)) * class221.field2675 / 50;
				field2604[var4++] = var13 + ((this.field2608[var1] - var13) * var14 >> 16);
			}

			if (var8 >= 50) {
				var14 = (50 - var10) * field2579[var8 - var10];
				field2613[var4] = var2 + (var11 + ((field2602[var5] - var11) * var14 >> 16)) * class221.field2675 / 50;
				field2558[var4] = var3 + (var12 + ((field2603[var5] - var12) * var14 >> 16)) * class221.field2675 / 50;
				field2604[var4++] = var13 + ((this.field2573[var1] - var13) * var14 >> 16);
			}
		}

		var11 = field2613[0];
		var12 = field2613[1];
		var13 = field2613[2];
		var14 = field2558[0];
		int var15 = field2558[1];
		int var16 = field2558[2];
		class221.field2684 = false;
		if (var4 == 3) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class221.field2678 || var12 > class221.field2678 || var13 > class221.field2678) {
				class221.field2684 = true;
			}

			this.method4442(var1, var14, var15, var16, var11, var12, var13, field2604[0], field2604[1], field2604[2]);
		}

		if (var4 == 4) {
			if (var11 < 0 || var12 < 0 || var13 < 0 || var11 > class221.field2678 || var12 > class221.field2678 || var13 > class221.field2678 || field2613[3] < 0 || field2613[3] > class221.field2678) {
				class221.field2684 = true;
			}

			int var18;
			if (this.field2605 != null && this.field2605[var1] != -1) {
				int var19;
				int var21;
				if (this.field2593 != null && this.field2593[var1] != -1) {
					int var20 = this.field2593[var1] & 255;
					var21 = this.field2569[var20];
					var18 = this.field2583[var20];
					var19 = this.field2584[var20];
				} else {
					var21 = var5;
					var18 = var6;
					var19 = var7;
				}

				short var22 = this.field2605[var1];
				if (this.field2575[var1] == -1) {
					class221.method4546(var14, var15, var16, var11, var12, var13, this.field2573[var1], this.field2573[var1], this.field2573[var1], field2602[var21], field2602[var18], field2602[var19], field2603[var21], field2603[var18], field2603[var19], field2567[var21], field2567[var18], field2567[var19], var22);
					class221.method4546(var14, var16, field2558[3], var11, var13, field2613[3], this.field2573[var1], this.field2573[var1], this.field2573[var1], field2602[var21], field2602[var18], field2602[var19], field2603[var21], field2603[var18], field2603[var19], field2567[var21], field2567[var18], field2567[var19], var22);
				} else {
					class221.method4546(var14, var15, var16, var11, var12, var13, field2604[0], field2604[1], field2604[2], field2602[var21], field2602[var18], field2602[var19], field2603[var21], field2603[var18], field2603[var19], field2567[var21], field2567[var18], field2567[var19], var22);
					class221.method4546(var14, var16, field2558[3], var11, var13, field2613[3], field2604[0], field2604[2], field2604[3], field2602[var21], field2602[var18], field2602[var19], field2603[var21], field2603[var18], field2603[var19], field2567[var21], field2567[var18], field2567[var19], var22);
				}
			} else {
				boolean var17 = this.method4448(var1);
				if (this.field2575[var1] == -1 && var17) {
					var18 = field2571[this.field2573[var1]];
					class221.method4544(var14, var15, var16, var11, var12, var13, var18, this.field2628, this.field2629, this.field2630, this.field2570);
					class221.method4544(var14, var16, field2558[3], var11, var13, field2613[3], var18, this.field2628, this.field2629, this.field2630, this.field2570);
				} else if (this.field2575[var1] == -1) {
					var18 = field2571[this.field2573[var1]];
					class221.method4543(var14, var15, var16, var11, var12, var13, var18);
					class221.method4543(var14, var16, field2558[3], var11, var13, field2613[3], var18);
				} else if (var17) {
					class221.method4540(var14, var15, var16, var11, var12, var13, field2604[0], field2604[1], field2604[2], this.field2628, this.field2630, this.field2629, this.field2570);
					class221.method4540(var14, var16, field2558[3], var11, var13, field2613[3], field2604[0], field2604[2], field2604[3], this.field2628, this.field2630, this.field2629, this.field2570);
				} else {
					class221.method4557(var14, var15, var16, var11, var12, var13, field2604[0], field2604[1], field2604[2]);
					class221.method4557(var14, var16, field2558[3], var11, var13, field2613[3], field2604[0], field2604[2], field2604[3]);
				}
			}
		}

	}

	void method4411(int var1, class400 var2) {
		float var3 = (float)this.field2592[var1];
		float var4 = (float)(-this.field2599[var1]);
		float var5 = (float)(-this.field2615[var1]);
		float var6 = 1.0F;
		this.field2592[var1] = (int)(var2.field4563[0] * var3 + var2.field4563[4] * var4 + var2.field4563[8] * var5 + var2.field4563[12] * var6);
		this.field2599[var1] = -((int)(var2.field4563[1] * var3 + var2.field4563[5] * var4 + var2.field4563[9] * var5 + var2.field4563[13] * var6));
		this.field2615[var1] = -((int)(var2.field4563[2] * var3 + var2.field4563[6] * var4 + var2.field4563[10] * var5 + var2.field4563[14] * var6));
	}

	void method4422(class217 var1, int var2) {
		if (this.field2587 != null) {
			for (int var3 = 0; var3 < this.field2565; ++var3) {
				int[] var4 = this.field2587[var3];
				if (var4 != null && var4.length != 0) {
					int[] var5 = this.field2588[var3];
					field2562.method7419();

					for (int var6 = 0; var6 < var4.length; ++var6) {
						int var7 = var4[var6];
						class124 var8 = var1.method4505(var7);
						if (var8 != null) {
							field2563.method7421((float)var5[var6] / 255.0F);
							field2564.method7420(var8.method2329(var2));
							field2564.method7424(field2563);
							field2562.method7466(field2564);
						}
					}

					this.method4411(var3, field2562);
				}
			}

		}
	}
}
