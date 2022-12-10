public class class250 extends class258 {
	static class411 field2945;
	class243 field2944;
	int field2941;
	int field2943;
	int field2946;
	final class259 field2942;
	final int field2947;

	class250(class311 var1, class311 var2, int var3, class259 var4) {
		super(var1, var2);
		this.field2947 = var3;
		this.field2942 = var4;
		this.method4940();
	}

	void method4940() {
		this.field2943 = class165.method2780(this.field2947).method3863().field2191;
		this.field2944 = this.field2942.method5237(class163.method2762(this.field2943));
		class169 var2 = class163.method2762(this.method5105());
		class491 var3 = var2.method2869(false);
		if (null != var3) {
			this.field2941 = var3.field5057;
			this.field2946 = var3.field5056;
		} else {
			this.field2941 = 0;
			this.field2946 = 0;
		}

	}

	public int method5105() {
		return this.field2943;
	}

	class243 method5113() {
		return this.field2944;
	}

	int method5093() {
		return this.field2941;
	}

	int method5118() {
		return this.field2946;
	}

	static char method4950(char var0) {
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

	static final void method4956(class211 var0, class205[] var1) {
		int var3;
		int var4;
		int var5;
		int var6;
		for (var3 = 0; var3 < 4; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				for (var5 = 0; var5 < 104; ++var5) {
					if ((class84.field773[var3][var4][var5] & 1) == 1) {
						var6 = var3;
						if (2 == (class84.field773[1][var4][var5] & 2)) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							var1[var6].method4030(var4, var5);
						}
					}
				}
			}
		}

		class84.field778 += (int)(Math.random() * 5.0D) - 2;
		if (class84.field778 < -8) {
			class84.field778 = -8;
		}

		if (class84.field778 > 8) {
			class84.field778 = 8;
		}

		class84.field779 += (int)(Math.random() * 5.0D) - 2;
		if (class84.field779 < -16) {
			class84.field779 = -16;
		}

		if (class84.field779 > 16) {
			class84.field779 = 16;
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
			byte[][] var46 = class26.field141[var3];
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
					var14 = class84.field765[var3][var13 + 1][var12] - class84.field765[var3][var13 - 1][var12];
					var15 = class84.field765[var3][var13][var12 + 1] - class84.field765[var3][var13][var12 - 1];
					var16 = (int)Math.sqrt((double)(var15 * var15 + 65536 + var14 * var14));
					var17 = (var14 << 8) / var16;
					var18 = 65536 / var16;
					var19 = (var15 << 8) / var16;
					var20 = 96 + (var19 * -50 + var18 * -10 + var17 * -50) / var11;
					var21 = (var46[var13][var12] >> 1) + (var46[var13][var12 + 1] >> 3) + (var46[var13][var12 - 1] >> 2) + (var46[var13 + 1][var12] >> 3) + (var46[var13 - 1][var12] >> 2);
					class84.field769[var13][var12] = var20 - var21;
				}
			}

			for (var12 = 0; var12 < 104; ++var12) {
				class84.field770[var12] = 0;
				class50.field364[var12] = 0;
				class84.field777[var12] = 0;
				class85.field791[var12] = 0;
				class71.field617[var12] = 0;
			}

			for (var12 = -5; var12 < 109; ++var12) {
				for (var13 = 0; var13 < 104; ++var13) {
					var14 = var12 + 5;
					int var10002;
					if (var14 >= 0 && var14 < 104) {
						var15 = client.field1697 < 209 ? (int)class375.method7030(8) : (int)class375.method7030(15);
						var16 = class84.field767[var3][var14][var13] & var15;
						if (var16 > 0) {
							class190 var47 = class16.method200(var16 - 1);
							var10000 = class84.field770;
							var10000[var13] += var47.field2061;
							var10000 = class50.field364;
							var10000[var13] += var47.field2062;
							var10000 = class84.field777;
							var10000[var13] += var47.field2064;
							var10000 = class85.field791;
							var10000[var13] += var47.field2067;
							var10002 = class71.field617[var13]++;
						}
					}

					var15 = var12 - 5;
					if (var15 >= 0 && var15 < 104) {
						var16 = client.field1697 < 209 ? (int)class375.method7030(8) : (int)class375.method7030(15);
						var17 = class84.field767[var3][var15][var13] & var16;
						if (var17 > 0) {
							class190 var48 = class16.method200(var17 - 1);
							var10000 = class84.field770;
							var10000[var13] -= var48.field2061;
							var10000 = class50.field364;
							var10000[var13] -= var48.field2062;
							var10000 = class84.field777;
							var10000[var13] -= var48.field2064;
							var10000 = class85.field791;
							var10000[var13] -= var48.field2067;
							var10002 = class71.field617[var13]--;
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
							var13 += class84.field770[var19];
							var14 += class50.field364[var19];
							var15 += class84.field777[var19];
							var16 += class85.field791[var19];
							var17 += class71.field617[var19];
						}

						var20 = var18 - 5;
						if (var20 >= 0 && var20 < 104) {
							var13 -= class84.field770[var20];
							var14 -= class50.field364[var20];
							var15 -= class84.field777[var20];
							var16 -= class85.field791[var20];
							var17 -= class71.field617[var20];
						}

						if (var18 >= 1 && var18 < 103 && (!client.field1743 || 0 != (class84.field773[0][var12][var18] & 2) || 0 == (class84.field773[var3][var12][var18] & 16))) {
							if (var3 < class84.field766) {
								class84.field766 = var3;
							}

							var21 = client.field1697 < 209 ? (int)class375.method7030(8) : (int)class375.method7030(15);
							int var22 = class84.field767[var3][var12][var18] & var21;
							int var23 = class482.field5023[var3][var12][var18] & var21;
							if (var22 > 0 || var23 > 0) {
								int var24 = class84.field765[var3][var12][var18];
								int var25 = class84.field765[var3][var12 + 1][var18];
								int var26 = class84.field765[var3][var12 + 1][var18 + 1];
								int var27 = class84.field765[var3][var12][var18 + 1];
								int var28 = class84.field769[var12][var18];
								int var29 = class84.field769[var12 + 1][var18];
								int var30 = class84.field769[var12 + 1][var18 + 1];
								int var31 = class84.field769[var12][var18 + 1];
								int var32 = -1;
								int var33 = -1;
								int var34;
								int var35;
								int var36;
								if (var22 > 0) {
									var34 = var13 * 256 / var16;
									var35 = var14 / var17;
									var36 = var15 / var17;
									var32 = class375.method7032(var34, var35, var36);
									var34 = class84.field778 + var34 & 255;
									var36 += class84.field779;
									if (var36 < 0) {
										var36 = 0;
									} else if (var36 > 255) {
										var36 = 255;
									}

									var33 = class375.method7032(var34, var35, var36);
								}

								class193 var37;
								if (var3 > 0) {
									boolean var58 = true;
									if (var22 == 0 && 0 != class84.field772[var3][var12][var18]) {
										var58 = false;
									}

									if (var23 > 0) {
										var36 = var23 - 1;
										var37 = (class193)class193.field2120.method5356((long)var36);
										class193 var49;
										if (null != var37) {
											var49 = var37;
										} else {
											byte[] var51 = class193.field2119.method6374(4, var36);
											var37 = new class193();
											if (var51 != null) {
												var37.method3753(new class467(var51), var36);
											}

											var37.method3752();
											class193.field2120.method5364(var37, (long)var36);
											var49 = var37;
										}

										if (!var49.field2123) {
											var58 = false;
										}
									}

									if (var58 && var25 == var24 && var24 == var26 && var27 == var24) {
										var10000 = class171.field1618[var3][var12];
										var10000[var18] |= 2340;
									}
								}

								var34 = 0;
								if (var33 != -1) {
									var34 = class221.field2685[class188.method3622(var33, 96)];
								}

								if (var23 == 0) {
									var0.method4157(var3, var12, var18, 0, 0, -1, var24, var25, var26, var27, class188.method3622(var32, var28), class188.method3622(var32, var29), class188.method3622(var32, var30), class188.method3622(var32, var31), 0, 0, 0, 0, var34, 0);
								} else {
									var35 = 1 + class84.field772[var3][var12][var18];
									byte var59 = class363.field4350[var3][var12][var18];
									int var38 = var23 - 1;
									class193 var39 = (class193)class193.field2120.method5356((long)var38);
									if (null != var39) {
										var37 = var39;
									} else {
										byte[] var50 = class193.field2119.method6374(4, var38);
										var39 = new class193();
										if (null != var50) {
											var39.method3753(new class467(var50), var38);
										}

										var39.method3752();
										class193.field2120.method5364(var39, (long)var38);
										var37 = var39;
									}

									int var40 = var37.field2122;
									int var41;
									int var42;
									int var43;
									int var44;
									if (var40 >= 0) {
										var42 = class221.field2672.method4673(var40);
										var41 = -1;
									} else if (16711935 == var37.field2121) {
										var41 = -2;
										var40 = -1;
										var42 = -2;
									} else {
										var41 = class375.method7032(var37.field2127, var37.field2125, var37.field2126);
										var43 = var37.field2127 + class84.field778 & 255;
										var44 = class84.field779 + var37.field2126;
										if (var44 < 0) {
											var44 = 0;
										} else if (var44 > 255) {
											var44 = 255;
										}

										var42 = class375.method7032(var43, var37.field2125, var44);
									}

									var43 = 0;
									if (var42 != -2) {
										var43 = class221.field2685[class247.method4891(var42, 96)];
									}

									if (var37.field2124 != -1) {
										var44 = class84.field778 + var37.field2128 & 255;
										int var45 = var37.field2130 + class84.field779;
										if (var45 < 0) {
											var45 = 0;
										} else if (var45 > 255) {
											var45 = 255;
										}

										var42 = class375.method7032(var44, var37.field2129, var45);
										var43 = class221.field2685[class247.method4891(var42, 96)];
									}

									var0.method4157(var3, var12, var18, var35, var59, var40, var24, var25, var26, var27, class188.method3622(var32, var28), class188.method3622(var32, var29), class188.method3622(var32, var30), class188.method3622(var32, var31), class247.method4891(var41, var28), class247.method4891(var41, var29), class247.method4891(var41, var30), class247.method4891(var41, var31), var34, var43);
								}
							}
						}
					}
				}
			}

			for (var12 = 1; var12 < 103; ++var12) {
				for (var13 = 1; var13 < 103; ++var13) {
					var0.method4156(var3, var13, var12, class281.method5350(var3, var13, var12));
				}
			}

			class84.field767[var3] = (short[][])null;
			class482.field5023[var3] = (short[][])null;
			class84.field772[var3] = (byte[][])null;
			class363.field4350[var3] = (byte[][])null;
			class26.field141[var3] = (byte[][])null;
		}

		var0.method4183(-50, -10, -50);

		for (var3 = 0; var3 < 104; ++var3) {
			for (var4 = 0; var4 < 104; ++var4) {
				if ((class84.field773[1][var3][var4] & 2) == 2) {
					var0.method4154(var3, var4);
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
						if (0 != (class171.field1618[var54][var56][var55] & var3)) {
							var10 = var55;
							var11 = var55;
							var12 = var54;

							for (var13 = var54; var10 > 0 && 0 != (class171.field1618[var54][var56][var10 - 1] & var3); --var10) {
							}

							while (var11 < 104 && (class171.field1618[var54][var56][var11 + 1] & var3) != 0) {
								++var11;
							}

							label458:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if (0 == (class171.field1618[var12 - 1][var56][var14] & var3)) {
										break label458;
									}
								}

								--var12;
							}

							label447:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class171.field1618[var13 + 1][var56][var14] & var3) == 0) {
										break label447;
									}
								}

								++var13;
							}

							var14 = (var13 + 1 - var12) * (1 + (var11 - var10));
							if (var14 >= 8) {
								var57 = 240;
								var16 = class84.field765[var13][var56][var10] - var57;
								var17 = class84.field765[var12][var56][var10];
								class211.method4281(var6, 1, var56 * 128, var56 * 128, var10 * 128, var11 * 128 + 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class171.field1618[var18][var56];
										var10000[var19] &= ~var3;
									}
								}
							}
						}

						if (0 != (class171.field1618[var54][var56][var55] & var4)) {
							var10 = var56;
							var11 = var56;
							var12 = var54;

							for (var13 = var54; var10 > 0 && (class171.field1618[var54][var10 - 1][var55] & var4) != 0; --var10) {
							}

							while (var11 < 104 && 0 != (class171.field1618[var54][var11 + 1][var55] & var4)) {
								++var11;
							}

							label511:
							while (var12 > 0) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class171.field1618[var12 - 1][var14][var55] & var4) == 0) {
										break label511;
									}
								}

								--var12;
							}

							label500:
							while (var13 < var6) {
								for (var14 = var10; var14 <= var11; ++var14) {
									if ((class171.field1618[var13 + 1][var14][var55] & var4) == 0) {
										break label500;
									}
								}

								++var13;
							}

							var14 = (1 + (var11 - var10)) * (var13 + 1 - var12);
							if (var14 >= 8) {
								var57 = 240;
								var16 = class84.field765[var13][var10][var55] - var57;
								var17 = class84.field765[var12][var10][var55];
								class211.method4281(var6, 2, var10 * 128, 128 + var11 * 128, var55 * 128, var55 * 128, var16, var17);

								for (var18 = var12; var18 <= var13; ++var18) {
									for (var19 = var10; var19 <= var11; ++var19) {
										var10000 = class171.field1618[var18][var19];
										var10000[var55] &= ~var4;
									}
								}
							}
						}

						if (0 != (class171.field1618[var54][var56][var55] & var5)) {
							var10 = var56;
							var11 = var56;
							var12 = var55;

							for (var13 = var55; var12 > 0 && (class171.field1618[var54][var56][var12 - 1] & var5) != 0; --var12) {
							}

							while (var13 < 104 && (class171.field1618[var54][var56][var13 + 1] & var5) != 0) {
								++var13;
							}

							label564:
							while (var10 > 0) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if (0 == (class171.field1618[var54][var10 - 1][var14] & var5)) {
										break label564;
									}
								}

								--var10;
							}

							label553:
							while (var11 < 104) {
								for (var14 = var12; var14 <= var13; ++var14) {
									if ((class171.field1618[var54][var11 + 1][var14] & var5) == 0) {
										break label553;
									}
								}

								++var11;
							}

							if ((var13 - var12 + 1) * (1 + (var11 - var10)) >= 4) {
								var14 = class84.field765[var54][var10][var12];
								class211.method4281(var6, 4, var10 * 128, 128 + var11 * 128, var12 * 128, var13 * 128 + 128, var14, var14);

								for (var15 = var10; var15 <= var11; ++var15) {
									for (var16 = var12; var16 <= var13; ++var16) {
										var10000 = class171.field1618[var54][var15];
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
