import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "hm"
)
public class class341 extends class162 {
	@ObfInfo(
		owner = "hm",
		name = "x",
		desc = "Z"
	)
	public static boolean field2732;
	@ObfInfo(
		owner = "hm",
		name = "d",
		desc = "Lhw;"
	)
	public static class308 field2728;
	@ObfInfo(
		owner = "hm",
		name = "g",
		desc = "I"
	)
	public static int field2730;
	@ObfInfo(
		owner = "hm",
		name = "w",
		desc = "[I"
	)
	public static int[] field2726;
	@ObfInfo(
		owner = "hm",
		name = "p",
		desc = "[I"
	)
	public static int[] field2740;
	@ObfInfo(
		owner = "hm",
		name = "as",
		desc = "[I"
	)
	public static int[] field2744;
	@ObfInfo(
		owner = "hm",
		name = "v",
		desc = "Z"
	)
	static boolean field2725;
	@ObfInfo(
		owner = "hm",
		name = "h",
		desc = "Z"
	)
	static boolean field2739;
	@ObfInfo(
		owner = "hm",
		name = "e",
		desc = "Z"
	)
	static boolean field2741;
	@ObfInfo(
		owner = "hm",
		name = "a",
		desc = "I"
	)
	static int field2724;
	@ObfInfo(
		owner = "hm",
		name = "m",
		desc = "I"
	)
	static int field2727;
	@ObfInfo(
		owner = "hm",
		name = "i",
		desc = "I"
	)
	static int field2731;
	@ObfInfo(
		owner = "hm",
		name = "n",
		desc = "I"
	)
	static int field2733;
	@ObfInfo(
		owner = "hm",
		name = "k",
		desc = "I"
	)
	static int field2734;
	@ObfInfo(
		owner = "hm",
		name = "s",
		desc = "I"
	)
	static int field2736;
	@ObfInfo(
		owner = "hm",
		name = "l",
		desc = "I"
	)
	static int field2737;
	@ObfInfo(
		owner = "hm",
		name = "t",
		desc = "I"
	)
	static int field2738;
	@ObfInfo(
		owner = "hm",
		name = "o",
		desc = "I"
	)
	static int field2743;
	@ObfInfo(
		owner = "hm",
		name = "c",
		desc = "[I"
	)
	static int[] field2729;
	@ObfInfo(
		owner = "hm",
		name = "y",
		desc = "[I"
	)
	static int[] field2735;
	@ObfInfo(
		owner = "hm",
		name = "z",
		desc = "[I"
	)
	static int[] field2742;

	static {
		field2739 = false;
		field2741 = false;
		field2725 = false;
		field2732 = true;
		field2727 = 0;
		field2730 = 512;
		field2729 = new int[1024];
		field2740 = new int[65536];
		field2735 = new int[512];
		field2742 = new int[2048];
		field2726 = new int[2048];
		field2744 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2735[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2742[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field2726[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			field2744[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

	}

	@ObfInfo(
		owner = "hm",
		name = "h",
		desc = "()V"
	)
	public static final void method1709() {
		method1710(class162.field1236, class162.field1234, class162.field1237, class162.field1235);
	}

	@ObfInfo(
		owner = "hm",
		name = "e",
		desc = "(IIII)V"
	)
	static final void method1710(int var0, int var1, int var2, int var3) {
		field2733 = var2 - var0;
		field2734 = var3 - var1;
		method1711();
		if (field2729.length < field2734) {
			field2729 = new int[class455.method2252(field2734)];
		}

		int var4 = var1 * class162.field1232 + var0;

		for (int var5 = 0; var5 < field2734; ++var5) {
			field2729[var5] = var4;
			var4 += class162.field1232;
		}

	}

	@ObfInfo(
		owner = "hm",
		name = "v",
		desc = "()V"
	)
	public static final void method1711() {
		field2731 = field2733 / 2;
		field2743 = field2734 / 2;
		field2724 = -field2731;
		field2736 = field2733 - field2731;
		field2737 = -field2743;
		field2738 = field2734 - field2743;
	}

	@ObfInfo(
		owner = "hm",
		name = "x",
		desc = "(II)V"
	)
	public static final void method1734(int var0, int var1) {
		int var2 = field2729[0];
		int var3 = var2 / class162.field1232;
		int var4 = var2 - var3 * class162.field1232;
		field2731 = var0 - var4;
		field2743 = var1 - var3;
		field2724 = -field2731;
		field2736 = field2733 - field2731;
		field2737 = -field2743;
		field2738 = field2734 - field2743;
	}

	@ObfInfo(
		owner = "hm",
		name = "m",
		desc = "(Lhw;)V"
	)
	public static final void method1712(class308 var0) {
		field2728 = var0;
	}

	@ObfInfo(
		owner = "hm",
		name = "q",
		desc = "(D)V"
	)
	public static final void method1708(double var0) {
		method1713(var0, 0, 512);
	}

	@ObfInfo(
		owner = "hm",
		name = "f",
		desc = "(DII)V"
	)
	static final void method1713(double var0, int var2, int var3) {
		int var4 = var2 * 128;

		for (int var5 = var2; var5 < var3; ++var5) {
			double var6 = (double)(var5 >> 3) / 64.0D + 0.0078125D;
			double var8 = (double)(var5 & 7) / 8.0D + 0.0625D;

			for (int var10 = 0; var10 < 128; ++var10) {
				double var11 = (double)var10 / 128.0D;
				double var13 = var11;
				double var15 = var11;
				double var17 = var11;
				if (var8 != 0.0D) {
					double var19;
					if (var11 < 0.5D) {
						var19 = var11 * (var8 + 1.0D);
					} else {
						var19 = var11 + var8 - var11 * var8;
					}

					double var21 = var11 * 2.0D - var19;
					double var23 = var6 + 0.3333333333333333D;
					if (var23 > 1.0D) {
						--var23;
					}

					double var27 = var6 - 0.3333333333333333D;
					if (var27 < 0.0D) {
						++var27;
					}

					if (var23 * 6.0D < 1.0D) {
						var13 = var21 + (var19 - var21) * 6.0D * var23;
					} else if (var23 * 2.0D < 1.0D) {
						var13 = var19;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var21 + (var19 - var21) * (0.6666666666666666D - var23) * 6.0D;
					} else {
						var13 = var21;
					}

					if (var6 * 6.0D < 1.0D) {
						var15 = var21 + (var19 - var21) * 6.0D * var6;
					} else if (var6 * 2.0D < 1.0D) {
						var15 = var19;
					} else if (var6 * 3.0D < 2.0D) {
						var15 = var21 + (var19 - var21) * (0.6666666666666666D - var6) * 6.0D;
					} else {
						var15 = var21;
					}

					if (var27 * 6.0D < 1.0D) {
						var17 = var21 + (var19 - var21) * 6.0D * var27;
					} else if (var27 * 2.0D < 1.0D) {
						var17 = var19;
					} else if (var27 * 3.0D < 2.0D) {
						var17 = var21 + (var19 - var21) * (0.6666666666666666D - var27) * 6.0D;
					} else {
						var17 = var21;
					}
				}

				int var29 = (int)(var13 * 256.0D);
				int var20 = (int)(var15 * 256.0D);
				int var30 = (int)(var17 * 256.0D);
				int var22 = (var29 << 16) + (var20 << 8) + var30;
				var22 = method1714(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				field2740[var4++] = var22;
			}
		}

	}

	@ObfInfo(
		owner = "hm",
		name = "r",
		desc = "(ID)I"
	)
	static int method1714(int var0, double var1) {
		double var3 = (double)(var0 >> 16) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(var5 * 256.0D);
		int var11 = (int)(var7 * 256.0D);
		return (var9 << 16) + (var10 << 8) + var11;
	}

	@ObfInfo(
		owner = "hm",
		name = "u",
		desc = "(III)V"
	)
	public static void method1715(int var0, int var1, int var2) {
		field2739 = var0 < 0 || var0 > field2733 || var1 < 0 || var1 > field2733 || var2 < 0 || var2 > field2733;
	}

	@ObfInfo(
		owner = "hm",
		name = "b",
		desc = "(IIIIIIIII)V"
	)
	static final void method1730(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = var4 - var3;
		int var10 = var1 - var0;
		int var11 = var5 - var3;
		int var12 = var2 - var0;
		int var13 = var7 - var6;
		int var14 = var8 - var6;
		int var15;
		if (var2 != var1) {
			var15 = (var5 - var4 << 14) / (var2 - var1);
		} else {
			var15 = 0;
		}

		int var16;
		if (var1 != var0) {
			var16 = (var9 << 14) / var10;
		} else {
			var16 = 0;
		}

		int var17;
		if (var2 != var0) {
			var17 = (var11 << 14) / var12;
		} else {
			var17 = 0;
		}

		int var18 = var9 * var12 - var11 * var10;
		if (var18 != 0) {
			int var19 = (var13 * var12 - var14 * var10 << 8) / var18;
			int var20 = (var14 * var9 - var13 * var11 << 8) / var18;
			if (var0 <= var1 && var0 <= var2) {
				if (var0 < field2734) {
					if (var1 > field2734) {
						var1 = field2734;
					}

					if (var2 > field2734) {
						var2 = field2734;
					}

					var6 = (var6 << 8) - var19 * var3 + var19;
					if (var1 < var2) {
						var5 = var3 <<= 14;
						if (var0 < 0) {
							var5 -= var17 * var0;
							var3 -= var16 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var15 * var1;
							var1 = 0;
						}

						if ((var0 == var1 || var17 >= var16) && (var0 != var1 || var17 <= var15)) {
							var2 -= var1;
							var1 -= var0;
							var0 = field2729[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method1718(class162.field1233, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += class162.field1232;
									}
								}

								method1718(class162.field1233, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += class162.field1232;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = field2729[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method1718(class162.field1233, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += class162.field1232;
									}
								}

								method1718(class162.field1233, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += class162.field1232;
							}
						}
					} else {
						var4 = var3 <<= 14;
						if (var0 < 0) {
							var4 -= var17 * var0;
							var3 -= var16 * var0;
							var6 -= var20 * var0;
							var0 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var15 * var2;
							var2 = 0;
						}

						if (var0 != var2 && var17 < var16 || var0 == var2 && var15 > var16) {
							var1 -= var2;
							var2 -= var0;
							var0 = field2729[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method1718(class162.field1233, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += class162.field1232;
									}
								}

								method1718(class162.field1233, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += class162.field1232;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = field2729[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method1718(class162.field1233, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += class162.field1232;
									}
								}

								method1718(class162.field1233, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += class162.field1232;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < field2734) {
					if (var2 > field2734) {
						var2 = field2734;
					}

					if (var0 > field2734) {
						var0 = field2734;
					}

					var7 = (var7 << 8) - var19 * var4 + var19;
					if (var2 < var0) {
						var3 = var4 <<= 14;
						if (var1 < 0) {
							var3 -= var16 * var1;
							var4 -= var15 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}

						var5 <<= 14;
						if (var2 < 0) {
							var5 -= var17 * var2;
							var2 = 0;
						}

						if ((var1 == var2 || var16 >= var15) && (var1 != var2 || var16 <= var17)) {
							var0 -= var2;
							var2 -= var1;
							var1 = field2729[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method1718(class162.field1233, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += class162.field1232;
									}
								}

								method1718(class162.field1233, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += class162.field1232;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = field2729[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method1718(class162.field1233, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += class162.field1232;
									}
								}

								method1718(class162.field1233, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += class162.field1232;
							}
						}
					} else {
						var5 = var4 <<= 14;
						if (var1 < 0) {
							var5 -= var16 * var1;
							var4 -= var15 * var1;
							var7 -= var20 * var1;
							var1 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var17 * var0;
							var0 = 0;
						}

						if (var16 < var15) {
							var2 -= var0;
							var0 -= var1;
							var1 = field2729[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method1718(class162.field1233, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += class162.field1232;
									}
								}

								method1718(class162.field1233, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += class162.field1232;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = field2729[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method1718(class162.field1233, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += class162.field1232;
									}
								}

								method1718(class162.field1233, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += class162.field1232;
							}
						}
					}
				}
			} else if (var2 < field2734) {
				if (var0 > field2734) {
					var0 = field2734;
				}

				if (var1 > field2734) {
					var1 = field2734;
				}

				var8 = (var8 << 8) - var19 * var5 + var19;
				if (var0 < var1) {
					var4 = var5 <<= 14;
					if (var2 < 0) {
						var4 -= var15 * var2;
						var5 -= var17 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var16 * var0;
						var0 = 0;
					}

					if (var15 < var17) {
						var1 -= var0;
						var0 -= var2;
						var2 = field2729[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method1718(class162.field1233, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += class162.field1232;
								}
							}

							method1718(class162.field1233, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += class162.field1232;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = field2729[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method1718(class162.field1233, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += class162.field1232;
								}
							}

							method1718(class162.field1233, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += class162.field1232;
						}
					}
				} else {
					var3 = var5 <<= 14;
					if (var2 < 0) {
						var3 -= var15 * var2;
						var5 -= var17 * var2;
						var8 -= var20 * var2;
						var2 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var16 * var1;
						var1 = 0;
					}

					if (var15 < var17) {
						var0 -= var1;
						var1 -= var2;
						var2 = field2729[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method1718(class162.field1233, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += class162.field1232;
								}
							}

							method1718(class162.field1233, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += class162.field1232;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = field2729[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method1718(class162.field1233, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += class162.field1232;
								}
							}

							method1718(class162.field1233, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += class162.field1232;
						}
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "hm",
		name = "j",
		desc = "(IIIIIIIIIBBBB)V"
	)
	static final void method1717(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9, byte var10, byte var11, byte var12) {
		var6 = method1731(var6, var9, var10, var11, var12);
		var7 = method1731(var7, var9, var10, var11, var12);
		var8 = method1731(var8, var9, var10, var11, var12);
		method1730(var0, var1, var2, var3, var4, var5, var6, var7, var8);
	}

	@ObfInfo(
		owner = "hm",
		name = "g",
		desc = "(IBBBB)I"
	)
	static int method1731(int var0, byte var1, byte var2, byte var3, byte var4) {
		int var5 = var0 >> 10 & 63;
		int var6 = var0 >> 7 & 7;
		int var7 = var0 & 127;
		int var8 = var4 & 255;
		if (var1 != -1) {
			var5 += (var1 - var5) * var8 >> 7;
		}

		if (var2 != -1) {
			var6 += (var2 - var6) * var8 >> 7;
		}

		if (var3 != -1) {
			var7 += (var3 - var7) * var8 >> 7;
		}

		return (var5 << 10 | var6 << 7 | var7) & 65535;
	}

	@ObfInfo(
		owner = "hm",
		name = "i",
		desc = "([IIIIIIII)V"
	)
	static final void method1718(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field2739) {
			if (var5 > field2733) {
				var5 = field2733;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var6 += var7 * var4;
			int var8;
			int var9;
			int var10;
			int var11;
			if (field2732) {
				var3 = var5 - var4 >> 2;
				var7 <<= 2;
				if (field2727 == 0) {
					if (var3 > 0) {
						do {
							var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
							var2 = field2740[var8];
							var6 += var7;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							var0[var1++] = var2;
							--var3;
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
						var2 = field2740[var8];

						do {
							var0[var1++] = var2;
							--var3;
						} while(var3 > 0);
					}
				} else {
					var8 = field2727;
					var9 = 256 - field2727;
					if (var3 > 0) {
						do {
							var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
							var2 = field2740[var10];
							var6 += var7;
							var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & 65280) * var9 >> 8 & 65280);
							var11 = var0[var1];
							var0[var1++] = var2 + ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
							var11 = var0[var1];
							var0[var1++] = var2 + ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
							var11 = var0[var1];
							var0[var1++] = var2 + ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
							var11 = var0[var1];
							var0[var1++] = var2 + ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
							--var3;
						} while(var3 > 0);
					}

					var3 = var5 - var4 & 3;
					if (var3 > 0) {
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
						var2 = field2740[var10];
						var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & 65280) * var9 >> 8 & 65280);

						do {
							var11 = var0[var1];
							var0[var1++] = var2 + ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
							--var3;
						} while(var3 > 0);
					}
				}

			} else {
				var3 = var5 - var4;
				if (field2727 == 0) {
					do {
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
						var0[var1++] = field2740[var8];
						var6 += var7;
						--var3;
					} while(var3 > 0);
				} else {
					var8 = field2727;
					var9 = 256 - field2727;

					do {
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
						var2 = field2740[var10];
						var6 += var7;
						var2 = ((var2 & 16711935) * var9 >> 8 & 16711935) + ((var2 & 65280) * var9 >> 8 & 65280);
						var11 = var0[var1];
						var0[var1++] = var2 + ((var11 & 16711935) * var8 >> 8 & 16711935) + ((var11 & 65280) * var8 >> 8 & 65280);
						--var3;
					} while(var3 > 0);
				}

			}
		}
	}

	@ObfInfo(
		owner = "hm",
		name = "o",
		desc = "(IIIIIII)V"
	)
	public static final void method1719(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = 0;
		if (var1 != var0) {
			var7 = (var4 - var3 << 14) / (var1 - var0);
		}

		int var8 = 0;
		if (var2 != var1) {
			var8 = (var5 - var4 << 14) / (var2 - var1);
		}

		int var9 = 0;
		if (var2 != var0) {
			var9 = (var3 - var5 << 14) / (var0 - var2);
		}

		if (var0 <= var1 && var0 <= var2) {
			if (var0 < field2734) {
				if (var1 > field2734) {
					var1 = field2734;
				}

				if (var2 > field2734) {
					var2 = field2734;
				}

				if (var1 < var2) {
					var5 = var3 <<= 14;
					if (var0 < 0) {
						var5 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var4 <<= 14;
					if (var1 < 0) {
						var4 -= var8 * var1;
						var1 = 0;
					}

					if (var0 != var1 && var9 < var7 || var0 == var1 && var9 > var8) {
						var2 -= var1;
						var1 -= var0;
						var0 = field2729[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method1721(class162.field1233, var0, var6, 0, var5 >> 14, var4 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += class162.field1232;
								}
							}

							method1721(class162.field1233, var0, var6, 0, var5 >> 14, var3 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += class162.field1232;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = field2729[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method1721(class162.field1233, var0, var6, 0, var4 >> 14, var5 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += class162.field1232;
								}
							}

							method1721(class162.field1233, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += class162.field1232;
						}
					}
				} else {
					var4 = var3 <<= 14;
					if (var0 < 0) {
						var4 -= var9 * var0;
						var3 -= var7 * var0;
						var0 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var8 * var2;
						var2 = 0;
					}

					if (var0 != var2 && var9 < var7 || var0 == var2 && var8 > var7) {
						var1 -= var2;
						var2 -= var0;
						var0 = field2729[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method1721(class162.field1233, var0, var6, 0, var5 >> 14, var3 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += class162.field1232;
								}
							}

							method1721(class162.field1233, var0, var6, 0, var4 >> 14, var3 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += class162.field1232;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = field2729[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method1721(class162.field1233, var0, var6, 0, var3 >> 14, var5 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += class162.field1232;
								}
							}

							method1721(class162.field1233, var0, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += class162.field1232;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < field2734) {
				if (var2 > field2734) {
					var2 = field2734;
				}

				if (var0 > field2734) {
					var0 = field2734;
				}

				if (var2 < var0) {
					var3 = var4 <<= 14;
					if (var1 < 0) {
						var3 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var5 <<= 14;
					if (var2 < 0) {
						var5 -= var9 * var2;
						var2 = 0;
					}

					if (var1 != var2 && var7 < var8 || var1 == var2 && var7 > var9) {
						var0 -= var2;
						var2 -= var1;
						var1 = field2729[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method1721(class162.field1233, var1, var6, 0, var3 >> 14, var5 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += class162.field1232;
								}
							}

							method1721(class162.field1233, var1, var6, 0, var3 >> 14, var4 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += class162.field1232;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = field2729[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method1721(class162.field1233, var1, var6, 0, var5 >> 14, var3 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += class162.field1232;
								}
							}

							method1721(class162.field1233, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += class162.field1232;
						}
					}
				} else {
					var5 = var4 <<= 14;
					if (var1 < 0) {
						var5 -= var7 * var1;
						var4 -= var8 * var1;
						var1 = 0;
					}

					var3 <<= 14;
					if (var0 < 0) {
						var3 -= var9 * var0;
						var0 = 0;
					}

					if (var7 < var8) {
						var2 -= var0;
						var0 -= var1;
						var1 = field2729[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method1721(class162.field1233, var1, var6, 0, var3 >> 14, var4 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += class162.field1232;
								}
							}

							method1721(class162.field1233, var1, var6, 0, var5 >> 14, var4 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += class162.field1232;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = field2729[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method1721(class162.field1233, var1, var6, 0, var4 >> 14, var3 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += class162.field1232;
								}
							}

							method1721(class162.field1233, var1, var6, 0, var4 >> 14, var5 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += class162.field1232;
						}
					}
				}
			}
		} else if (var2 < field2734) {
			if (var0 > field2734) {
				var0 = field2734;
			}

			if (var1 > field2734) {
				var1 = field2734;
			}

			if (var0 < var1) {
				var4 = var5 <<= 14;
				if (var2 < 0) {
					var4 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var3 <<= 14;
				if (var0 < 0) {
					var3 -= var7 * var0;
					var0 = 0;
				}

				if (var8 < var9) {
					var1 -= var0;
					var0 -= var2;
					var2 = field2729[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method1721(class162.field1233, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += class162.field1232;
							}
						}

						method1721(class162.field1233, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += class162.field1232;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = field2729[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method1721(class162.field1233, var2, var6, 0, var3 >> 14, var4 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += class162.field1232;
							}
						}

						method1721(class162.field1233, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += class162.field1232;
					}
				}
			} else {
				var3 = var5 <<= 14;
				if (var2 < 0) {
					var3 -= var8 * var2;
					var5 -= var9 * var2;
					var2 = 0;
				}

				var4 <<= 14;
				if (var1 < 0) {
					var4 -= var7 * var1;
					var1 = 0;
				}

				if (var8 < var9) {
					var0 -= var1;
					var1 -= var2;
					var2 = field2729[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method1721(class162.field1233, var2, var6, 0, var4 >> 14, var5 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += class162.field1232;
							}
						}

						method1721(class162.field1233, var2, var6, 0, var3 >> 14, var5 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += class162.field1232;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = field2729[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method1721(class162.field1233, var2, var6, 0, var5 >> 14, var4 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += class162.field1232;
							}
						}

						method1721(class162.field1233, var2, var6, 0, var5 >> 14, var3 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += class162.field1232;
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "hm",
		name = "n",
		desc = "(IIIIIIIBBBB)V"
	)
	static final void method1720(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7, byte var8, byte var9, byte var10) {
		int var11 = method1731(var6, var7, var8, var9, var10);
		var6 = field2740[var11];
		method1719(var0, var1, var2, var3, var4, var5, var6);
	}

	@ObfInfo(
		owner = "hm",
		name = "k",
		desc = "([IIIIII)V"
	)
	static final void method1721(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (field2739) {
			if (var5 > field2733) {
				var5 = field2733;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (field2727 != 0) {
				if (field2727 == 254) {
					while (true) {
						--var3;
						if (var3 < 0) {
							var3 = var5 - var4 & 3;

							while (true) {
								--var3;
								if (var3 < 0) {
									return;
								}

								var0[var1++] = var0[var1];
							}
						}

						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
						var0[var1++] = var0[var1];
					}
				} else {
					int var6 = field2727;
					int var7 = 256 - field2727;
					var2 = ((var2 & 16711935) * var7 >> 8 & 16711935) + ((var2 & 65280) * var7 >> 8 & 65280);

					while (true) {
						--var3;
						int var8;
						if (var3 < 0) {
							var3 = var5 - var4 & 3;

							while (true) {
								--var3;
								if (var3 < 0) {
									return;
								}

								var8 = var0[var1];
								var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
							}
						}

						var8 = var0[var1];
						var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
						var8 = var0[var1];
						var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
						var8 = var0[var1];
						var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
						var8 = var0[var1];
						var0[var1++] = var2 + ((var8 & 16711935) * var6 >> 8 & 16711935) + ((var8 & 65280) * var6 >> 8 & 65280);
					}
				}
			} else {
				while (true) {
					--var3;
					if (var3 < 0) {
						var3 = var5 - var4 & 3;

						while (true) {
							--var3;
							if (var3 < 0) {
								return;
							}

							var0[var1++] = var2;
						}
					}

					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
					var0[var1++] = var2;
				}
			}
		}
	}

	@ObfInfo(
		owner = "hm",
		name = "a",
		desc = "(IIIIIIIIIIIIIIIIIII)V"
	)
	static final void method1722(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = field2728.method1495(var18);
		int var20;
		if (var19 == null) {
			var20 = field2728.method1496(var18);
			method1730(var0, var1, var2, var3, var4, var5, method1732(var20, var6), method1732(var20, var7), method1732(var20, var8));
		} else {
			field2725 = field2728.method1493(var18);
			field2741 = field2728.method1494(var18);
			var20 = var4 - var3;
			int var21 = var1 - var0;
			int var22 = var5 - var3;
			int var23 = var2 - var0;
			int var24 = var7 - var6;
			int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0) {
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0;
			if (var2 != var1) {
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0;
			if (var2 != var0) {
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21;
			if (var29 != 0) {
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var32 = var11 * var12 - var14 * var9 << 14;
				int var33 = (int)(((long)(var14 * var15 - var17 * var12) << 3 << 14) / (long)field2730);
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)field2730);
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)field2730);
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)field2730);
				int var38 = var13 * var11 - var10 * var14 << 14;
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)field2730);
				int var40 = (int)(((long)(var10 * var17 - var16 * var11) << 14) / (long)field2730);
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < field2734) {
						if (var1 > field2734) {
							var1 = field2734;
						}

						if (var2 > field2734) {
							var2 = field2734;
						}

						var6 = (var6 << 9) - var30 * var3 + var30;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}

							var41 = var0 - field2743;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
								var2 -= var1;
								var1 -= var0;
								var0 = field2729[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method1723(class162.field1233, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1723(class162.field1233, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = field2729[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method1723(class162.field1233, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1723(class162.field1233, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}

							var41 = var0 - field2743;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
								var1 -= var2;
								var2 -= var0;
								var0 = field2729[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method1723(class162.field1233, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1723(class162.field1233, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = field2729[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method1723(class162.field1233, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1723(class162.field1233, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < field2734) {
						if (var2 > field2734) {
							var2 = field2734;
						}

						if (var0 > field2734) {
							var0 = field2734;
						}

						var7 = (var7 << 9) - var30 * var4 + var30;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}

							var41 = var1 - field2743;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
								var0 -= var2;
								var2 -= var1;
								var1 = field2729[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method1723(class162.field1233, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1723(class162.field1233, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = field2729[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method1723(class162.field1233, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1723(class162.field1233, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}

							var41 = var1 - field2743;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = field2729[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method1723(class162.field1233, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1723(class162.field1233, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = field2729[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method1723(class162.field1233, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1723(class162.field1233, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < field2734) {
					if (var0 > field2734) {
						var0 = field2734;
					}

					if (var1 > field2734) {
						var1 = field2734;
					}

					var8 = (var8 << 9) - var30 * var5 + var30;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}

						var41 = var2 - field2743;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = field2729[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method1723(class162.field1233, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += class162.field1232;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method1723(class162.field1233, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class162.field1232;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = field2729[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method1723(class162.field1233, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += class162.field1232;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method1723(class162.field1233, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class162.field1232;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}

						var41 = var2 - field2743;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = field2729[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method1723(class162.field1233, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += class162.field1232;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method1723(class162.field1233, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class162.field1232;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = field2729[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method1723(class162.field1233, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += class162.field1232;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method1723(class162.field1233, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class162.field1232;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "hm",
		name = "s",
		desc = "([I[IIIIIIIIIIIIII)V"
	)
	static final void method1723(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2739) {
			if (var6 > field2733) {
				var6 = field2733;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var10000;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (field2725) {
				var23 = var5 - field2731;
				var9 += (var12 >> 3) * var23;
				var10 += (var13 >> 3) * var23;
				var11 += (var14 >> 3) * var23;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
					if (var18 < 0) {
						var18 = 0;
					} else if (var18 > 4032) {
						var18 = 4032;
					}
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
					if (var20 < 0) {
						var20 = 0;
					} else if (var20 > 4032) {
						var20 = 4032;
					}
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 20) + var19;
				var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (field2741) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 12;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
								if (var20 < 0) {
									var20 = 0;
								} else if (var20 > 4032) {
									var20 = 4032;
								}
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 20) + var19;
							var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 12;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
								if (var20 < 0) {
									var20 = 0;
								} else if (var20 > 4032) {
									var20 = 4032;
								}
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 20) + var19;
							var16 = (var20 - var18 >> 3 << 20) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							--var17;
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - field2731;
				var9 += (var12 >> 3) * var23;
				var10 += (var13 >> 3) * var23;
				var11 += (var14 >> 3) * var23;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
					if (var18 < 0) {
						var18 = 0;
					} else if (var18 > 16256) {
						var18 = 16256;
					}
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12;
				var10 += var13;
				var11 += var14;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
					if (var20 < 0) {
						var20 = 0;
					} else if (var20 > 16256) {
						var20 = 16256;
					}
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 18) + var19;
				var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (field2741) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 14;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
								if (var20 < 0) {
									var20 = 0;
								} else if (var20 > 16256) {
									var20 = 16256;
								}
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 18) + var19;
							var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var10000 = var2 + var16;
							var18 = var20;
							var19 = var21;
							var9 += var12;
							var10 += var13;
							var11 += var14;
							var22 = var11 >> 14;
							if (var22 != 0) {
								var20 = var9 / var22;
								var21 = var10 / var22;
								if (var20 < 0) {
									var20 = 0;
								} else if (var20 > 16256) {
									var20 = 16256;
								}
							} else {
								var20 = 0;
								var21 = 0;
							}

							var2 = (var18 << 18) + var19;
							var16 = (var20 - var18 >> 3 << 18) + (var21 - var19 >> 3);
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							--var17;
						} while(var17 > 0);
					}
				}
			}

		}
	}

	@ObfInfo(
		owner = "hm",
		name = "l",
		desc = "(IIIIIIIIIIIIIIIIIII)V"
	)
	static final void method1733(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = field2728.method1495(var18);
		int var20;
		if (var19 == null) {
			var20 = field2728.method1496(var18);
			method1730(var0, var1, var2, var3, var4, var5, method1732(var20, var6), method1732(var20, var7), method1732(var20, var8));
		} else {
			field2725 = field2728.method1493(var18);
			field2741 = field2728.method1494(var18);
			var20 = var4 - var3;
			int var21 = var1 - var0;
			int var22 = var5 - var3;
			int var23 = var2 - var0;
			int var24 = var7 - var6;
			int var25 = var8 - var6;
			int var26 = 0;
			if (var1 != var0) {
				var26 = (var4 - var3 << 14) / (var1 - var0);
			}

			int var27 = 0;
			if (var2 != var1) {
				var27 = (var5 - var4 << 14) / (var2 - var1);
			}

			int var28 = 0;
			if (var2 != var0) {
				var28 = (var3 - var5 << 14) / (var0 - var2);
			}

			int var29 = var20 * var23 - var22 * var21;
			if (var29 != 0) {
				int var30 = (var24 * var23 - var25 * var21 << 9) / var29;
				int var31 = (var25 * var20 - var24 * var22 << 9) / var29;
				var10 = var9 - var10;
				var13 = var12 - var13;
				var16 = var15 - var16;
				var11 -= var9;
				var14 -= var12;
				var17 -= var15;
				int var32 = var11 * var12 - var14 * var9 << 14;
				int var33 = (int)(((long)(var14 * var15 - var17 * var12) << 14) / (long)field2730);
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)field2730);
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)field2730);
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)field2730);
				int var38 = var13 * var11 - var10 * var14 << 14;
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)field2730);
				int var40 = (int)(((long)(var10 * var17 - var16 * var11) << 14) / (long)field2730);
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < field2734) {
						if (var1 > field2734) {
							var1 = field2734;
						}

						if (var2 > field2734) {
							var2 = field2734;
						}

						var6 = (var6 << 9) - var30 * var3 + var30;
						if (var1 < var2) {
							var5 = var3 <<= 14;
							if (var0 < 0) {
								var5 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var4 <<= 14;
							if (var1 < 0) {
								var4 -= var27 * var1;
								var1 = 0;
							}

							var41 = var0 - field2743;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
								var2 -= var1;
								var1 -= var0;
								var0 = field2729[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method1724(class162.field1233, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1724(class162.field1233, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = field2729[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method1724(class162.field1233, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1724(class162.field1233, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var4 = var3 <<= 14;
							if (var0 < 0) {
								var4 -= var28 * var0;
								var3 -= var26 * var0;
								var6 -= var31 * var0;
								var0 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var27 * var2;
								var2 = 0;
							}

							var41 = var0 - field2743;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
								var1 -= var2;
								var2 -= var0;
								var0 = field2729[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method1724(class162.field1233, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1724(class162.field1233, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = field2729[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method1724(class162.field1233, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1724(class162.field1233, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < field2734) {
						if (var2 > field2734) {
							var2 = field2734;
						}

						if (var0 > field2734) {
							var0 = field2734;
						}

						var7 = (var7 << 9) - var30 * var4 + var30;
						if (var2 < var0) {
							var3 = var4 <<= 14;
							if (var1 < 0) {
								var3 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var5 <<= 14;
							if (var2 < 0) {
								var5 -= var28 * var2;
								var2 = 0;
							}

							var41 = var1 - field2743;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
								var0 -= var2;
								var2 -= var1;
								var1 = field2729[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method1724(class162.field1233, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1724(class162.field1233, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = field2729[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method1724(class162.field1233, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1724(class162.field1233, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						} else {
							var5 = var4 <<= 14;
							if (var1 < 0) {
								var5 -= var26 * var1;
								var4 -= var27 * var1;
								var7 -= var31 * var1;
								var1 = 0;
							}

							var3 <<= 14;
							if (var0 < 0) {
								var3 -= var28 * var0;
								var0 = 0;
							}

							var41 = var1 - field2743;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = field2729[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method1724(class162.field1233, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1724(class162.field1233, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = field2729[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method1724(class162.field1233, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += class162.field1232;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method1724(class162.field1233, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class162.field1232;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < field2734) {
					if (var0 > field2734) {
						var0 = field2734;
					}

					if (var1 > field2734) {
						var1 = field2734;
					}

					var8 = (var8 << 9) - var30 * var5 + var30;
					if (var0 < var1) {
						var4 = var5 <<= 14;
						if (var2 < 0) {
							var4 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var3 <<= 14;
						if (var0 < 0) {
							var3 -= var26 * var0;
							var0 = 0;
						}

						var41 = var2 - field2743;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = field2729[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method1724(class162.field1233, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += class162.field1232;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method1724(class162.field1233, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class162.field1232;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = field2729[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method1724(class162.field1233, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += class162.field1232;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method1724(class162.field1233, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class162.field1232;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					} else {
						var3 = var5 <<= 14;
						if (var2 < 0) {
							var3 -= var27 * var2;
							var5 -= var28 * var2;
							var8 -= var31 * var2;
							var2 = 0;
						}

						var4 <<= 14;
						if (var1 < 0) {
							var4 -= var26 * var1;
							var1 = 0;
						}

						var41 = var2 - field2743;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = field2729[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method1724(class162.field1233, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += class162.field1232;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method1724(class162.field1233, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class162.field1232;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = field2729[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method1724(class162.field1233, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += class162.field1232;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method1724(class162.field1233, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class162.field1232;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						}
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "hm",
		name = "t",
		desc = "([I[IIIIIIIIIIIIII)V"
	)
	static final void method1724(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2739) {
			if (var6 > field2733) {
				var6 = field2733;
			}

			if (var5 < 0) {
				var5 = 0;
			}
		}

		if (var5 < var6) {
			var4 += var5;
			var7 += var8 * var5;
			int var17 = var6 - var5;
			int var15;
			int var16;
			int var18;
			int var19;
			int var20;
			int var21;
			int var22;
			int var23;
			if (field2725) {
				var23 = var5 - field2731;
				var9 += var12 * var23;
				var10 += var13 * var23;
				var11 += var14 * var23;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var22 = var11 >> 12;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 20) + var19;
				var16 = ((var20 - var18) / var17 << 20) + (var21 - var19) / var17;
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (field2741) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 4032) + (var2 >>> 26)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 4032) + (var2 >>> 26)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							--var17;
						} while(var17 > 0);
					}
				}
			} else {
				var23 = var5 - field2731;
				var9 += var12 * var23;
				var10 += var13 * var23;
				var11 += var14 * var23;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var18 = var9 / var22;
					var19 = var10 / var22;
				} else {
					var18 = 0;
					var19 = 0;
				}

				var9 += var12 * var17;
				var10 += var13 * var17;
				var11 += var14 * var17;
				var22 = var11 >> 14;
				if (var22 != 0) {
					var20 = var9 / var22;
					var21 = var10 / var22;
				} else {
					var20 = 0;
					var21 = 0;
				}

				var2 = (var18 << 18) + var19;
				var16 = ((var20 - var18) / var17 << 18) + (var21 - var19) / var17;
				var17 >>= 3;
				var8 <<= 3;
				var15 = var7 >> 8;
				if (field2741) {
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							var3 = var1[(var2 & 16256) + (var2 >>> 25)];
							var0[var4++] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							var2 += var16;
							--var17;
						} while(var17 > 0);
					}
				} else {
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							var7 += var8;
							var15 = var7 >> 8;
							--var17;
						} while(var17 > 0);
					}

					var17 = var6 - var5 & 7;
					if (var17 > 0) {
						do {
							if ((var3 = var1[(var2 & 16256) + (var2 >>> 25)]) != 0) {
								var0[var4] = ((var3 & 16711935) * var15 & -16711936) + ((var3 & 65280) * var15 & 16711680) >> 8;
							}

							++var4;
							var2 += var16;
							--var17;
						} while(var17 > 0);
					}
				}
			}

		}
	}

	@ObfInfo(
		owner = "hm",
		name = "c",
		desc = "(II)I"
	)
	static final int method1732(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfInfo(
		owner = "hm",
		name = "p",
		desc = "(IIII)I"
	)
	static final int method1716(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var1 * var3 >> 16;
	}

	@ObfInfo(
		owner = "hm",
		name = "d",
		desc = "(IIII)I"
	)
	static final int method1726(int var0, int var1, int var2, int var3) {
		return var1 * var2 - var0 * var3 >> 16;
	}

	@ObfInfo(
		owner = "hm",
		name = "y",
		desc = "(IIII)I"
	)
	static final int method1727(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var1 * var3 >> 16;
	}

	@ObfInfo(
		owner = "hm",
		name = "z",
		desc = "(IIII)I"
	)
	static final int method1728(int var0, int var1, int var2, int var3) {
		return var0 * var3 + var1 * var2 >> 16;
	}

	@ObfInfo(
		owner = "hm",
		name = "w",
		desc = "(IIII)I"
	)
	static final int method1725(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var1 * var3 >> 16;
	}

	@ObfInfo(
		owner = "hm",
		name = "as",
		desc = "(IIII)I"
	)
	static final int method1729(int var0, int var1, int var2, int var3) {
		return var1 * var2 - var0 * var3 >> 16;
	}
}
