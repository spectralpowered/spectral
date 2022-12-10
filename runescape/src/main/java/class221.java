public class class221 extends class478 {
	public static boolean field2677;
	public static class231 field2672;
	public static int field2675;
	public static int[] field2667;
	public static int[] field2685;
	public static int[] field2690;
	static boolean field2666;
	static boolean field2684;
	static boolean field2687;
	static int field2664;
	static int field2668;
	static int field2676;
	static int field2678;
	static int field2679;
	static int field2681;
	static int field2682;
	static int field2683;
	static int field2689;
	static int[] field2674;
	static int[] field2680;
	static int[] field2688;

	static {
		field2684 = false;
		field2687 = false;
		field2666 = false;
		field2677 = true;
		field2668 = 0;
		field2675 = 512;
		field2674 = new int[1024];
		field2685 = new int[65536];
		field2680 = new int[512];
		field2688 = new int[2048];
		field2667 = new int[2048];
		field2690 = new int[2048];

		int var0;
		for (var0 = 1; var0 < 512; ++var0) {
			field2680[var0] = 32768 / var0;
		}

		for (var0 = 1; var0 < 2048; ++var0) {
			field2688[var0] = 65536 / var0;
		}

		for (var0 = 0; var0 < 2048; ++var0) {
			field2667[var0] = (int)(65536.0D * Math.sin((double)var0 * 0.0030679615D));
			field2690[var0] = (int)(65536.0D * Math.cos((double)var0 * 0.0030679615D));
		}

	}

	class221() throws Throwable {
		throw new Error();
	}

	public static final void method4530() {
		method4531(class478.field5015, class478.field5013, class478.field5016, class478.field5014);
	}

	static final void method4531(int var0, int var1, int var2, int var3) {
		field2678 = var2 - var0;
		field2679 = var3 - var1;
		method4533();
		if (field2674.length < field2679) {
			field2674 = new int[class279.method8200(field2679)];
		}

		int var4 = var1 * class478.field5011 + var0;

		for (int var5 = 0; var5 < field2679; ++var5) {
			field2674[var5] = var4;
			var4 += class478.field5011;
		}

	}

	public static final void method4533() {
		field2676 = field2678 / 2;
		field2689 = field2679 / 2;
		field2664 = -field2676;
		field2681 = field2678 - field2676;
		field2682 = -field2689;
		field2683 = field2679 - field2689;
	}

	public static final void method4612(int var0, int var1) {
		int var2 = field2674[0];
		int var3 = var2 / class478.field5011;
		int var4 = var2 - var3 * class478.field5011;
		field2676 = var0 - var4;
		field2689 = var1 - var3;
		field2664 = -field2676;
		field2681 = field2678 - field2676;
		field2682 = -field2689;
		field2683 = field2679 - field2689;
	}

	public static final void method4534(class231 var0) {
		field2672 = var0;
	}

	public static final void method4529(double var0) {
		method4536(var0, 0, 512);
	}

	static final void method4536(double var0, int var2, int var3) {
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
				var22 = method4537(var22, var0);
				if (var22 == 0) {
					var22 = 1;
				}

				field2685[var4++] = var22;
			}
		}

	}

	static int method4537(int var0, double var1) {
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

	public static void method4538(int var0, int var1, int var2) {
		field2684 = var0 < 0 || var0 > field2678 || var1 < 0 || var1 > field2678 || var2 < 0 || var2 > field2678;
	}

	static final void method4557(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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
				if (var0 < field2679) {
					if (var1 > field2679) {
						var1 = field2679;
					}

					if (var2 > field2679) {
						var2 = field2679;
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
							var0 = field2674[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method4542(class478.field5012, var0, 0, 0, var4 >> 14, var5 >> 14, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += class478.field5011;
									}
								}

								method4542(class478.field5012, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += class478.field5011;
							}
						} else {
							var2 -= var1;
							var1 -= var0;
							var0 = field2674[var0];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method4542(class478.field5012, var0, 0, 0, var5 >> 14, var4 >> 14, var6, var19);
										var5 += var17;
										var4 += var15;
										var6 += var20;
										var0 += class478.field5011;
									}
								}

								method4542(class478.field5012, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
								var5 += var17;
								var3 += var16;
								var6 += var20;
								var0 += class478.field5011;
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
							var0 = field2674[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method4542(class478.field5012, var0, 0, 0, var5 >> 14, var3 >> 14, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += class478.field5011;
									}
								}

								method4542(class478.field5012, var0, 0, 0, var4 >> 14, var3 >> 14, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += class478.field5011;
							}
						} else {
							var1 -= var2;
							var2 -= var0;
							var0 = field2674[var0];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method4542(class478.field5012, var0, 0, 0, var3 >> 14, var5 >> 14, var6, var19);
										var5 += var15;
										var3 += var16;
										var6 += var20;
										var0 += class478.field5011;
									}
								}

								method4542(class478.field5012, var0, 0, 0, var3 >> 14, var4 >> 14, var6, var19);
								var4 += var17;
								var3 += var16;
								var6 += var20;
								var0 += class478.field5011;
							}
						}
					}
				}
			} else if (var1 <= var2) {
				if (var1 < field2679) {
					if (var2 > field2679) {
						var2 = field2679;
					}

					if (var0 > field2679) {
						var0 = field2679;
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
							var1 = field2674[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method4542(class478.field5012, var1, 0, 0, var5 >> 14, var3 >> 14, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += class478.field5011;
									}
								}

								method4542(class478.field5012, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += class478.field5011;
							}
						} else {
							var0 -= var2;
							var2 -= var1;
							var1 = field2674[var1];

							while (true) {
								--var2;
								if (var2 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method4542(class478.field5012, var1, 0, 0, var3 >> 14, var5 >> 14, var7, var19);
										var3 += var16;
										var5 += var17;
										var7 += var20;
										var1 += class478.field5011;
									}
								}

								method4542(class478.field5012, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
								var3 += var16;
								var4 += var15;
								var7 += var20;
								var1 += class478.field5011;
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
							var1 = field2674[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method4542(class478.field5012, var1, 0, 0, var3 >> 14, var4 >> 14, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += class478.field5011;
									}
								}

								method4542(class478.field5012, var1, 0, 0, var5 >> 14, var4 >> 14, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += class478.field5011;
							}
						} else {
							var2 -= var0;
							var0 -= var1;
							var1 = field2674[var1];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var2;
										if (var2 < 0) {
											return;
										}

										method4542(class478.field5012, var1, 0, 0, var4 >> 14, var3 >> 14, var7, var19);
										var3 += var17;
										var4 += var15;
										var7 += var20;
										var1 += class478.field5011;
									}
								}

								method4542(class478.field5012, var1, 0, 0, var4 >> 14, var5 >> 14, var7, var19);
								var5 += var16;
								var4 += var15;
								var7 += var20;
								var1 += class478.field5011;
							}
						}
					}
				}
			} else if (var2 < field2679) {
				if (var0 > field2679) {
					var0 = field2679;
				}

				if (var1 > field2679) {
					var1 = field2679;
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
						var2 = field2674[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method4542(class478.field5012, var2, 0, 0, var4 >> 14, var3 >> 14, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += class478.field5011;
								}
							}

							method4542(class478.field5012, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += class478.field5011;
						}
					} else {
						var1 -= var0;
						var0 -= var2;
						var2 = field2674[var2];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method4542(class478.field5012, var2, 0, 0, var3 >> 14, var4 >> 14, var8, var19);
									var4 += var15;
									var3 += var16;
									var8 += var20;
									var2 += class478.field5011;
								}
							}

							method4542(class478.field5012, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
							var4 += var15;
							var5 += var17;
							var8 += var20;
							var2 += class478.field5011;
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
						var2 = field2674[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method4542(class478.field5012, var2, 0, 0, var4 >> 14, var5 >> 14, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += class478.field5011;
								}
							}

							method4542(class478.field5012, var2, 0, 0, var3 >> 14, var5 >> 14, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += class478.field5011;
						}
					} else {
						var0 -= var1;
						var1 -= var2;
						var2 = field2674[var2];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method4542(class478.field5012, var2, 0, 0, var5 >> 14, var4 >> 14, var8, var19);
									var4 += var16;
									var5 += var17;
									var8 += var20;
									var2 += class478.field5011;
								}
							}

							method4542(class478.field5012, var2, 0, 0, var5 >> 14, var3 >> 14, var8, var19);
							var3 += var15;
							var5 += var17;
							var8 += var20;
							var2 += class478.field5011;
						}
					}
				}
			}
		}
	}

	static final void method4540(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, byte var9, byte var10, byte var11, byte var12) {
		var6 = method4577(var6, var9, var10, var11, var12);
		var7 = method4577(var7, var9, var10, var11, var12);
		var8 = method4577(var8, var9, var10, var11, var12);
		method4557(var0, var1, var2, var3, var4, var5, var6, var7, var8);
	}

	static int method4577(int var0, byte var1, byte var2, byte var3, byte var4) {
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

	static final void method4542(int[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (field2684) {
			if (var5 > field2678) {
				var5 = field2678;
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
			if (field2677) {
				var3 = var5 - var4 >> 2;
				var7 <<= 2;
				if (field2668 == 0) {
					if (var3 > 0) {
						do {
							var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
							var2 = field2685[var8];
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
						var2 = field2685[var8];

						do {
							var0[var1++] = var2;
							--var3;
						} while(var3 > 0);
					}
				} else {
					var8 = field2668;
					var9 = 256 - field2668;
					if (var3 > 0) {
						do {
							var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
							var2 = field2685[var10];
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
						var2 = field2685[var10];
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
				if (field2668 == 0) {
					do {
						var8 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
						var0[var1++] = field2685[var8];
						var6 += var7;
						--var3;
					} while(var3 > 0);
				} else {
					var8 = field2668;
					var9 = 256 - field2668;

					do {
						var10 = (var6 & (var6 >> 31 & 1) - 1) >> 8;
						var2 = field2685[var10];
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

	public static final void method4543(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
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
			if (var0 < field2679) {
				if (var1 > field2679) {
					var1 = field2679;
				}

				if (var2 > field2679) {
					var2 = field2679;
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
						var0 = field2674[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method4545(class478.field5012, var0, var6, 0, var5 >> 14, var4 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += class478.field5011;
								}
							}

							method4545(class478.field5012, var0, var6, 0, var5 >> 14, var3 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += class478.field5011;
						}
					} else {
						var2 -= var1;
						var1 -= var0;
						var0 = field2674[var0];

						while (true) {
							--var1;
							if (var1 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method4545(class478.field5012, var0, var6, 0, var4 >> 14, var5 >> 14);
									var5 += var9;
									var4 += var8;
									var0 += class478.field5011;
								}
							}

							method4545(class478.field5012, var0, var6, 0, var3 >> 14, var5 >> 14);
							var5 += var9;
							var3 += var7;
							var0 += class478.field5011;
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
						var0 = field2674[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method4545(class478.field5012, var0, var6, 0, var5 >> 14, var3 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += class478.field5011;
								}
							}

							method4545(class478.field5012, var0, var6, 0, var4 >> 14, var3 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += class478.field5011;
						}
					} else {
						var1 -= var2;
						var2 -= var0;
						var0 = field2674[var0];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var1;
									if (var1 < 0) {
										return;
									}

									method4545(class478.field5012, var0, var6, 0, var3 >> 14, var5 >> 14);
									var5 += var8;
									var3 += var7;
									var0 += class478.field5011;
								}
							}

							method4545(class478.field5012, var0, var6, 0, var3 >> 14, var4 >> 14);
							var4 += var9;
							var3 += var7;
							var0 += class478.field5011;
						}
					}
				}
			}
		} else if (var1 <= var2) {
			if (var1 < field2679) {
				if (var2 > field2679) {
					var2 = field2679;
				}

				if (var0 > field2679) {
					var0 = field2679;
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
						var1 = field2674[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method4545(class478.field5012, var1, var6, 0, var3 >> 14, var5 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += class478.field5011;
								}
							}

							method4545(class478.field5012, var1, var6, 0, var3 >> 14, var4 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += class478.field5011;
						}
					} else {
						var0 -= var2;
						var2 -= var1;
						var1 = field2674[var1];

						while (true) {
							--var2;
							if (var2 < 0) {
								while (true) {
									--var0;
									if (var0 < 0) {
										return;
									}

									method4545(class478.field5012, var1, var6, 0, var5 >> 14, var3 >> 14);
									var3 += var7;
									var5 += var9;
									var1 += class478.field5011;
								}
							}

							method4545(class478.field5012, var1, var6, 0, var4 >> 14, var3 >> 14);
							var3 += var7;
							var4 += var8;
							var1 += class478.field5011;
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
						var1 = field2674[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method4545(class478.field5012, var1, var6, 0, var3 >> 14, var4 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += class478.field5011;
								}
							}

							method4545(class478.field5012, var1, var6, 0, var5 >> 14, var4 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += class478.field5011;
						}
					} else {
						var2 -= var0;
						var0 -= var1;
						var1 = field2674[var1];

						while (true) {
							--var0;
							if (var0 < 0) {
								while (true) {
									--var2;
									if (var2 < 0) {
										return;
									}

									method4545(class478.field5012, var1, var6, 0, var4 >> 14, var3 >> 14);
									var3 += var9;
									var4 += var8;
									var1 += class478.field5011;
								}
							}

							method4545(class478.field5012, var1, var6, 0, var4 >> 14, var5 >> 14);
							var5 += var7;
							var4 += var8;
							var1 += class478.field5011;
						}
					}
				}
			}
		} else if (var2 < field2679) {
			if (var0 > field2679) {
				var0 = field2679;
			}

			if (var1 > field2679) {
				var1 = field2679;
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
					var2 = field2674[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method4545(class478.field5012, var2, var6, 0, var4 >> 14, var3 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += class478.field5011;
							}
						}

						method4545(class478.field5012, var2, var6, 0, var4 >> 14, var5 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += class478.field5011;
					}
				} else {
					var1 -= var0;
					var0 -= var2;
					var2 = field2674[var2];

					while (true) {
						--var0;
						if (var0 < 0) {
							while (true) {
								--var1;
								if (var1 < 0) {
									return;
								}

								method4545(class478.field5012, var2, var6, 0, var3 >> 14, var4 >> 14);
								var4 += var8;
								var3 += var7;
								var2 += class478.field5011;
							}
						}

						method4545(class478.field5012, var2, var6, 0, var5 >> 14, var4 >> 14);
						var4 += var8;
						var5 += var9;
						var2 += class478.field5011;
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
					var2 = field2674[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method4545(class478.field5012, var2, var6, 0, var4 >> 14, var5 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += class478.field5011;
							}
						}

						method4545(class478.field5012, var2, var6, 0, var3 >> 14, var5 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += class478.field5011;
					}
				} else {
					var0 -= var1;
					var1 -= var2;
					var2 = field2674[var2];

					while (true) {
						--var1;
						if (var1 < 0) {
							while (true) {
								--var0;
								if (var0 < 0) {
									return;
								}

								method4545(class478.field5012, var2, var6, 0, var5 >> 14, var4 >> 14);
								var4 += var7;
								var5 += var9;
								var2 += class478.field5011;
							}
						}

						method4545(class478.field5012, var2, var6, 0, var5 >> 14, var3 >> 14);
						var3 += var8;
						var5 += var9;
						var2 += class478.field5011;
					}
				}
			}
		}
	}

	static final void method4544(int var0, int var1, int var2, int var3, int var4, int var5, int var6, byte var7, byte var8, byte var9, byte var10) {
		int var11 = method4577(var6, var7, var8, var9, var10);
		var6 = field2685[var11];
		method4543(var0, var1, var2, var3, var4, var5, var6);
	}

	static final void method4545(int[] var0, int var1, int var2, int var3, int var4, int var5) {
		if (field2684) {
			if (var5 > field2678) {
				var5 = field2678;
			}

			if (var4 < 0) {
				var4 = 0;
			}
		}

		if (var4 < var5) {
			var1 += var4;
			var3 = var5 - var4 >> 2;
			if (field2668 != 0) {
				if (field2668 == 254) {
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
					int var6 = field2668;
					int var7 = 256 - field2668;
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

	static final void method4546(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = field2672.method4670(var18);
		int var20;
		if (var19 == null) {
			var20 = field2672.method4673(var18);
			method4557(var0, var1, var2, var3, var4, var5, method4597(var20, var6), method4597(var20, var7), method4597(var20, var8));
		} else {
			field2666 = field2672.method4666(var18);
			field2687 = field2672.method4668(var18);
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
				int var33 = (int)(((long)(var14 * var15 - var17 * var12) << 3 << 14) / (long)field2675);
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)field2675);
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 3 << 14) / (long)field2675);
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)field2675);
				int var38 = var13 * var11 - var10 * var14 << 14;
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 3 << 14) / (long)field2675);
				int var40 = (int)(((long)(var10 * var17 - var16 * var11) << 14) / (long)field2675);
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < field2679) {
						if (var1 > field2679) {
							var1 = field2679;
						}

						if (var2 > field2679) {
							var2 = field2679;
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

							var41 = var0 - field2689;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
								var2 -= var1;
								var1 -= var0;
								var0 = field2674[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method4547(class478.field5012, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4547(class478.field5012, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = field2674[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method4547(class478.field5012, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4547(class478.field5012, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class478.field5011;
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

							var41 = var0 - field2689;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
								var1 -= var2;
								var2 -= var0;
								var0 = field2674[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method4547(class478.field5012, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4547(class478.field5012, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = field2674[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method4547(class478.field5012, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4547(class478.field5012, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < field2679) {
						if (var2 > field2679) {
							var2 = field2679;
						}

						if (var0 > field2679) {
							var0 = field2679;
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

							var41 = var1 - field2689;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
								var0 -= var2;
								var2 -= var1;
								var1 = field2674[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method4547(class478.field5012, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4547(class478.field5012, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = field2674[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method4547(class478.field5012, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4547(class478.field5012, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class478.field5011;
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

							var41 = var1 - field2689;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = field2674[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method4547(class478.field5012, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4547(class478.field5012, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = field2674[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method4547(class478.field5012, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4547(class478.field5012, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < field2679) {
					if (var0 > field2679) {
						var0 = field2679;
					}

					if (var1 > field2679) {
						var1 = field2679;
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

						var41 = var2 - field2689;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = field2674[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method4547(class478.field5012, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += class478.field5011;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method4547(class478.field5012, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class478.field5011;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = field2674[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method4547(class478.field5012, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += class478.field5011;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method4547(class478.field5012, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class478.field5011;
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

						var41 = var2 - field2689;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = field2674[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method4547(class478.field5012, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += class478.field5011;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method4547(class478.field5012, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class478.field5011;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = field2674[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method4547(class478.field5012, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += class478.field5011;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method4547(class478.field5012, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class478.field5011;
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

	static final void method4547(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2684) {
			if (var6 > field2678) {
				var6 = field2678;
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
			if (field2666) {
				var23 = var5 - field2676;
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
				if (field2687) {
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
				var23 = var5 - field2676;
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
				if (field2687) {
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

	static final void method4602(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18) {
		int[] var19 = field2672.method4670(var18);
		int var20;
		if (var19 == null) {
			var20 = field2672.method4673(var18);
			method4557(var0, var1, var2, var3, var4, var5, method4597(var20, var6), method4597(var20, var7), method4597(var20, var8));
		} else {
			field2666 = field2672.method4666(var18);
			field2687 = field2672.method4668(var18);
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
				int var33 = (int)(((long)(var14 * var15 - var17 * var12) << 14) / (long)field2675);
				int var34 = (int)(((long)(var17 * var9 - var11 * var15) << 14) / (long)field2675);
				int var35 = var10 * var12 - var13 * var9 << 14;
				int var36 = (int)(((long)(var13 * var15 - var16 * var12) << 14) / (long)field2675);
				int var37 = (int)(((long)(var16 * var9 - var10 * var15) << 14) / (long)field2675);
				int var38 = var13 * var11 - var10 * var14 << 14;
				int var39 = (int)(((long)(var16 * var14 - var13 * var17) << 14) / (long)field2675);
				int var40 = (int)(((long)(var10 * var17 - var16 * var11) << 14) / (long)field2675);
				int var41;
				if (var0 <= var1 && var0 <= var2) {
					if (var0 < field2679) {
						if (var1 > field2679) {
							var1 = field2679;
						}

						if (var2 > field2679) {
							var2 = field2679;
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

							var41 = var0 - field2689;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var0 != var1 && var28 < var26 || var0 == var1 && var28 > var27) {
								var2 -= var1;
								var1 -= var0;
								var0 = field2674[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method4549(class478.field5012, var19, 0, 0, var0, var5 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4549(class478.field5012, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var1;
								var1 -= var0;
								var0 = field2674[var0];

								while (true) {
									--var1;
									if (var1 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method4549(class478.field5012, var19, 0, 0, var0, var4 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var28;
											var4 += var27;
											var6 += var31;
											var0 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4549(class478.field5012, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var5 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class478.field5011;
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

							var41 = var0 - field2689;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if ((var0 == var2 || var28 >= var26) && (var0 != var2 || var27 <= var26)) {
								var1 -= var2;
								var2 -= var0;
								var0 = field2674[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method4549(class478.field5012, var19, 0, 0, var0, var3 >> 14, var5 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4549(class478.field5012, var19, 0, 0, var0, var3 >> 14, var4 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var1 -= var2;
								var2 -= var0;
								var0 = field2674[var0];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var1;
											if (var1 < 0) {
												return;
											}

											method4549(class478.field5012, var19, 0, 0, var0, var5 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
											var5 += var27;
											var3 += var26;
											var6 += var31;
											var0 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4549(class478.field5012, var19, 0, 0, var0, var4 >> 14, var3 >> 14, var6, var30, var32, var35, var38, var33, var36, var39);
									var4 += var28;
									var3 += var26;
									var6 += var31;
									var0 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var1 <= var2) {
					if (var1 < field2679) {
						if (var2 > field2679) {
							var2 = field2679;
						}

						if (var0 > field2679) {
							var0 = field2679;
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

							var41 = var1 - field2689;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var1 != var2 && var26 < var27 || var1 == var2 && var26 > var28) {
								var0 -= var2;
								var2 -= var1;
								var1 = field2674[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method4549(class478.field5012, var19, 0, 0, var1, var3 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4549(class478.field5012, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var0 -= var2;
								var2 -= var1;
								var1 = field2674[var1];

								while (true) {
									--var2;
									if (var2 < 0) {
										while (true) {
											--var0;
											if (var0 < 0) {
												return;
											}

											method4549(class478.field5012, var19, 0, 0, var1, var5 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var26;
											var5 += var28;
											var7 += var31;
											var1 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4549(class478.field5012, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var3 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class478.field5011;
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

							var41 = var1 - field2689;
							var32 += var34 * var41;
							var35 += var37 * var41;
							var38 += var40 * var41;
							if (var26 < var27) {
								var2 -= var0;
								var0 -= var1;
								var1 = field2674[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method4549(class478.field5012, var19, 0, 0, var1, var3 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4549(class478.field5012, var19, 0, 0, var1, var5 >> 14, var4 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							} else {
								var2 -= var0;
								var0 -= var1;
								var1 = field2674[var1];

								while (true) {
									--var0;
									if (var0 < 0) {
										while (true) {
											--var2;
											if (var2 < 0) {
												return;
											}

											method4549(class478.field5012, var19, 0, 0, var1, var4 >> 14, var3 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
											var3 += var28;
											var4 += var27;
											var7 += var31;
											var1 += class478.field5011;
											var32 += var34;
											var35 += var37;
											var38 += var40;
										}
									}

									method4549(class478.field5012, var19, 0, 0, var1, var4 >> 14, var5 >> 14, var7, var30, var32, var35, var38, var33, var36, var39);
									var5 += var26;
									var4 += var27;
									var7 += var31;
									var1 += class478.field5011;
									var32 += var34;
									var35 += var37;
									var38 += var40;
								}
							}
						}
					}
				} else if (var2 < field2679) {
					if (var0 > field2679) {
						var0 = field2679;
					}

					if (var1 > field2679) {
						var1 = field2679;
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

						var41 = var2 - field2689;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var1 -= var0;
							var0 -= var2;
							var2 = field2674[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method4549(class478.field5012, var19, 0, 0, var2, var4 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += class478.field5011;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method4549(class478.field5012, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class478.field5011;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var1 -= var0;
							var0 -= var2;
							var2 = field2674[var2];

							while (true) {
								--var0;
								if (var0 < 0) {
									while (true) {
										--var1;
										if (var1 < 0) {
											return;
										}

										method4549(class478.field5012, var19, 0, 0, var2, var3 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var27;
										var3 += var26;
										var8 += var31;
										var2 += class478.field5011;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method4549(class478.field5012, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var4 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class478.field5011;
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

						var41 = var2 - field2689;
						var32 += var34 * var41;
						var35 += var37 * var41;
						var38 += var40 * var41;
						if (var27 < var28) {
							var0 -= var1;
							var1 -= var2;
							var2 = field2674[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method4549(class478.field5012, var19, 0, 0, var2, var4 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += class478.field5011;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method4549(class478.field5012, var19, 0, 0, var2, var3 >> 14, var5 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class478.field5011;
								var32 += var34;
								var35 += var37;
								var38 += var40;
							}
						} else {
							var0 -= var1;
							var1 -= var2;
							var2 = field2674[var2];

							while (true) {
								--var1;
								if (var1 < 0) {
									while (true) {
										--var0;
										if (var0 < 0) {
											return;
										}

										method4549(class478.field5012, var19, 0, 0, var2, var5 >> 14, var4 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
										var4 += var26;
										var5 += var28;
										var8 += var31;
										var2 += class478.field5011;
										var32 += var34;
										var35 += var37;
										var38 += var40;
									}
								}

								method4549(class478.field5012, var19, 0, 0, var2, var5 >> 14, var3 >> 14, var8, var30, var32, var35, var38, var33, var36, var39);
								var3 += var27;
								var5 += var28;
								var8 += var31;
								var2 += class478.field5011;
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

	static final void method4549(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14) {
		if (field2684) {
			if (var6 > field2678) {
				var6 = field2678;
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
			if (field2666) {
				var23 = var5 - field2676;
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
				if (field2687) {
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
				var23 = var5 - field2676;
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
				if (field2687) {
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

	static final int method4597(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static final int method4539(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var1 * var3 >> 16;
	}

	static final int method4552(int var0, int var1, int var2, int var3) {
		return var1 * var2 - var0 * var3 >> 16;
	}

	static final int method4553(int var0, int var1, int var2, int var3) {
		return var0 * var2 - var1 * var3 >> 16;
	}

	static final int method4554(int var0, int var1, int var2, int var3) {
		return var0 * var3 + var1 * var2 >> 16;
	}

	static final int method4550(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var1 * var3 >> 16;
	}

	static final int method4556(int var0, int var1, int var2, int var3) {
		return var1 * var2 - var0 * var3 >> 16;
	}
}
