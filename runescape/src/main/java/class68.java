import java.util.Random;

public class class68 {
	static int[] field547;
	static int[] field552;
	static int[] field558;
	static int[] field566;
	static int[] field568;
	static int[] field569;
	static int[] field570;
	static int[] field572;
	class34 field548;
	class34 field549;
	class34 field550;
	class34 field551;
	class34 field553;
	class34 field561;
	class34 field564;
	class34 field565;
	class34 field567;
	class75 field560;
	int field559;
	int field562;
	int field563;
	int field571;
	int[] field555;
	int[] field556;
	int[] field557;

	static {
		field552 = new int[32768];
		Random var0 = new Random(0L);

		int var1;
		for (var1 = 0; var1 < 32768; ++var1) {
			field552[var1] = (var0.nextInt() & 2) - 1;
		}

		field566 = new int[32768];

		for (var1 = 0; var1 < 32768; ++var1) {
			field566[var1] = (int)(Math.sin((double)var1 / 5215.1903D) * 16384.0D);
		}

		field558 = new int[220500];
		field568 = new int[5];
		field569 = new int[5];
		field547 = new int[5];
		field570 = new int[5];
		field572 = new int[5];
	}

	class68() {
		this.field555 = new int[]{0, 0, 0, 0, 0};
		this.field556 = new int[]{0, 0, 0, 0, 0};
		this.field557 = new int[]{0, 0, 0, 0, 0};
		this.field559 = 0;
		this.field571 = 100;
		this.field562 = 500;
		this.field563 = 0;
	}

	final int[] method1249(int var1, int var2) {
		class376.method7044(field558, 0, var1);
		if (var2 < 10) {
			return field558;
		} else {
			double var3 = (double)var1 / ((double)var2 + 0.0D);
			this.field565.method432();
			this.field548.method432();
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;
			if (this.field549 != null) {
				this.field549.method432();
				this.field550.method432();
				var5 = (int)((double)(this.field549.field200 - this.field549.field199) * 32.768D / var3);
				var6 = (int)((double)this.field549.field199 * 32.768D / var3);
			}

			int var8 = 0;
			int var9 = 0;
			int var10 = 0;
			if (this.field551 != null) {
				this.field551.method432();
				this.field564.method432();
				var8 = (int)((double)(this.field551.field200 - this.field551.field199) * 32.768D / var3);
				var9 = (int)((double)this.field551.field199 * 32.768D / var3);
			}

			int var11;
			for (var11 = 0; var11 < 5; ++var11) {
				if (this.field555[var11] != 0) {
					field568[var11] = 0;
					field569[var11] = (int)((double)this.field557[var11] * var3);
					field547[var11] = (this.field555[var11] << 14) / 100;
					field570[var11] = (int)((double)(this.field565.field200 - this.field565.field199) * 32.768D * Math.pow(1.0057929410678534D, (double)this.field556[var11]) / var3);
					field572[var11] = (int)((double)this.field565.field199 * 32.768D / var3);
				}
			}

			int var12;
			int var13;
			int var14;
			int var15;
			int[] var10000;
			for (var11 = 0; var11 < var1; ++var11) {
				var12 = this.field565.method430(var1);
				var13 = this.field548.method430(var1);
				if (this.field549 != null) {
					var14 = this.field549.method430(var1);
					var15 = this.field550.method430(var1);
					var12 += this.method1237(var7, var15, this.field549.field206) >> 1;
					var7 += (var14 * var5 >> 16) + var6;
				}

				if (this.field551 != null) {
					var14 = this.field551.method430(var1);
					var15 = this.field564.method430(var1);
					var13 = var13 * ((this.method1237(var10, var15, this.field551.field206) >> 1) + 32768) >> 15;
					var10 += (var14 * var8 >> 16) + var9;
				}

				for (var14 = 0; var14 < 5; ++var14) {
					if (this.field555[var14] != 0) {
						var15 = var11 + field569[var14];
						if (var15 < var1) {
							var10000 = field558;
							var10000[var15] += this.method1237(field568[var14], var13 * field547[var14] >> 15, this.field565.field206);
							var10000 = field568;
							var10000[var14] += (var12 * field570[var14] >> 16) + field572[var14];
						}
					}
				}
			}

			int var16;
			if (this.field553 != null) {
				this.field553.method432();
				this.field567.method432();
				var11 = 0;
				boolean var19 = false;
				boolean var20 = true;

				for (var14 = 0; var14 < var1; ++var14) {
					var15 = this.field553.method430(var1);
					var16 = this.field567.method430(var1);
					if (var20) {
						var12 = this.field553.field199 + ((this.field553.field200 - this.field553.field199) * var15 >> 8);
					} else {
						var12 = this.field553.field199 + ((this.field553.field200 - this.field553.field199) * var16 >> 8);
					}

					var11 += 256;
					if (var11 >= var12) {
						var11 = 0;
						var20 = !var20;
					}

					if (var20) {
						field558[var14] = 0;
					}
				}
			}

			if (this.field559 > 0 && this.field571 > 0) {
				var11 = (int)((double)this.field559 * var3);

				for (var12 = var11; var12 < var1; ++var12) {
					var10000 = field558;
					var10000[var12] += field558[var12 - var11] * this.field571 / 100;
				}
			}

			if (this.field560.field687[0] > 0 || this.field560.field687[1] > 0) {
				this.field561.method432();
				var11 = this.field561.method430(var1 + 1);
				var12 = this.field560.method1508(0, (float)var11 / 65536.0F);
				var13 = this.field560.method1508(1, (float)var11 / 65536.0F);
				if (var1 >= var12 + var13) {
					var14 = 0;
					var15 = var13;
					if (var13 > var1 - var12) {
						var15 = var1 - var12;
					}

					int var17;
					while (var14 < var15) {
						var16 = (int)((long)field558[var14 + var12] * (long)class75.field681 >> 16);

						for (var17 = 0; var17 < var12; ++var17) {
							var16 += (int)((long)field558[var14 + var12 - 1 - var17] * (long)class75.field682[0][var17] >> 16);
						}

						for (var17 = 0; var17 < var14; ++var17) {
							var16 -= (int)((long)field558[var14 - 1 - var17] * (long)class75.field682[1][var17] >> 16);
						}

						field558[var14] = var16;
						var11 = this.field561.method430(var1 + 1);
						++var14;
					}

					boolean var21 = true;
					var15 = 128;

					while (true) {
						if (var15 > var1 - var12) {
							var15 = var1 - var12;
						}

						int var18;
						while (var14 < var15) {
							var17 = (int)((long)field558[var14 + var12] * (long)class75.field681 >> 16);

							for (var18 = 0; var18 < var12; ++var18) {
								var17 += (int)((long)field558[var14 + var12 - 1 - var18] * (long)class75.field682[0][var18] >> 16);
							}

							for (var18 = 0; var18 < var13; ++var18) {
								var17 -= (int)((long)field558[var14 - 1 - var18] * (long)class75.field682[1][var18] >> 16);
							}

							field558[var14] = var17;
							var11 = this.field561.method430(var1 + 1);
							++var14;
						}

						if (var14 >= var1 - var12) {
							while (var14 < var1) {
								var17 = 0;

								for (var18 = var14 + var12 - var1; var18 < var12; ++var18) {
									var17 += (int)((long)field558[var14 + var12 - 1 - var18] * (long)class75.field682[0][var18] >> 16);
								}

								for (var18 = 0; var18 < var13; ++var18) {
									var17 -= (int)((long)field558[var14 - 1 - var18] * (long)class75.field682[1][var18] >> 16);
								}

								field558[var14] = var17;
								this.field561.method430(var1 + 1);
								++var14;
							}
							break;
						}

						var12 = this.field560.method1508(0, (float)var11 / 65536.0F);
						var13 = this.field560.method1508(1, (float)var11 / 65536.0F);
						var15 += 128;
					}
				}
			}

			for (var11 = 0; var11 < var1; ++var11) {
				if (field558[var11] < -32768) {
					field558[var11] = -32768;
				}

				if (field558[var11] > 32767) {
					field558[var11] = 32767;
				}
			}

			return field558;
		}
	}

	final int method1237(int var1, int var2, int var3) {
		if (var3 == 1) {
			return (var1 & 32767) < 16384 ? var2 : -var2;
		} else if (var3 == 2) {
			return field566[var1 & 32767] * var2 >> 14;
		} else if (var3 == 3) {
			return ((var1 & 32767) * var2 >> 14) - var2;
		} else {
			return var3 == 4 ? field552[var1 / 2607 & 32767] * var2 : 0;
		}
	}

	final void method1239(class467 var1) {
		this.field565 = new class34();
		this.field565.method434(var1);
		this.field548 = new class34();
		this.field548.method434(var1);
		int var2 = var1.method8326();
		if (var2 != 0) {
			--var1.field4915;
			this.field549 = new class34();
			this.field549.method434(var1);
			this.field550 = new class34();
			this.field550.method434(var1);
		}

		var2 = var1.method8326();
		if (var2 != 0) {
			--var1.field4915;
			this.field551 = new class34();
			this.field551.method434(var1);
			this.field564 = new class34();
			this.field564.method434(var1);
		}

		var2 = var1.method8326();
		if (var2 != 0) {
			--var1.field4915;
			this.field553 = new class34();
			this.field553.method434(var1);
			this.field567 = new class34();
			this.field567.method434(var1);
		}

		for (int var3 = 0; var3 < 10; ++var3) {
			int var4 = var1.method8340();
			if (var4 == 0) {
				break;
			}

			this.field555[var3] = var4;
			this.field556[var3] = var1.method8339();
			this.field557[var3] = var1.method8340();
		}

		this.field559 = var1.method8340();
		this.field571 = var1.method8340();
		this.field562 = var1.method8328();
		this.field563 = var1.method8328();
		this.field560 = new class75();
		this.field561 = new class34();
		this.field560.method1510(var1, this.field561);
	}
}
