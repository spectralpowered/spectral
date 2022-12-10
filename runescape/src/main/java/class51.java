import java.security.SecureRandom;

public class class51 {
	public static int field381;
	static class453 field380;
	static int field384;
	static SecureRandom field382;
	int field376;
	int field378;

	class51(int var1, int var2) {
		this.field376 = var1;
		this.field378 = var2;
	}

	boolean method1012(class48 var1) {
		if (null == var1) {
			return false;
		} else {
			switch(this.field376) {
			case 1:
				return var1.method928(this.field378);
			case 2:
				return var1.method929(this.field378);
			case 3:
				return var1.method923((char)this.field378);
			case 4:
				return var1.method924(this.field378 == 1);
			default:
				return false;
			}
		}
	}

	static class130 method1015(int var0) {
		class130 var2 = (class130)class78.method1584(class130.method3623(), var0);
		if (var2 == null) {
			var2 = class130.field1292;
		}

		return var2;
	}

	static final void method1010() {
		class211.field2479 = false;
		client.field1743 = false;
	}

	static String method1016(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return client.field1725[var0].length() > 0 ? client.field1844[var0] + class321.field3927 + client.field1725[var0] : client.field1844[var0];
		}
	}

	static final void method1013(class290[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		class478.method8672(var2, var3, var4, var5);
		class221.method4530();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			class290 var11 = var0[var10];
			if (null != var11 && (var11.field3418 == var1 || var1 == -1412584499 && client.field1875 == var11)) {
				int var12;
				if (var8 == -1) {
					client.field1916[client.field1911] = var11.field3412 + var6;
					client.field1917[client.field1911] = var7 + var11.field3413;
					client.field1904[client.field1911] = var11.field3414;
					client.field1716[client.field1911] = var11.field3474;
					var12 = ++client.field1911 - 1;
				} else {
					var12 = var8;
				}

				var11.field3548 = var12;
				var11.field3549 = client.field1700;
				if (!var11.field3398 || !client.method1138(var11)) {
					if (var11.field3500 > 0) {
						class403.method7516(var11);
					}

					int var13 = var11.field3412 + var6;
					int var14 = var7 + var11.field3413;
					int var15 = var11.field3533;
					int var16;
					int var17;
					if (var11 == client.field1875) {
						if (var1 != -1412584499 && !var11.field3489) {
							class28.field173 = var0;
							class148.field1427 = var6;
							class179.field1670 = var7;
							continue;
						}

						if (client.field1886 && client.field1927) {
							var16 = class28.field158;
							var17 = class28.field153;
							var16 -= client.field1877;
							var17 -= client.field1878;
							if (var16 < client.field1881) {
								var16 = client.field1881;
							}

							if (var11.field3414 + var16 > client.field1876.field3414 + client.field1881) {
								var16 = client.field1881 + client.field1876.field3414 - var11.field3414;
							}

							if (var17 < client.field1795) {
								var17 = client.field1795;
							}

							if (var11.field3474 + var17 > client.field1795 + client.field1876.field3474) {
								var17 = client.field1876.field3474 + client.field1795 - var11.field3474;
							}

							var13 = var16;
							var14 = var17;
						}

						if (!var11.field3489) {
							var15 = 128;
						}
					}

					int var18;
					int var19;
					int var23;
					int var31;
					int var32;
					int var33;
					if (2 == var11.field3536) {
						var16 = var2;
						var17 = var3;
						var18 = var4;
						var19 = var5;
					} else if (var11.field3536 == 9) {
						var33 = var13;
						var31 = var14;
						var32 = var13 + var11.field3414;
						var23 = var14 + var11.field3474;
						if (var32 < var13) {
							var33 = var32;
							var32 = var13;
						}

						if (var23 < var14) {
							var31 = var23;
							var23 = var14;
						}

						++var32;
						++var23;
						var16 = var33 > var2 ? var33 : var2;
						var17 = var31 > var3 ? var31 : var3;
						var18 = var32 < var4 ? var32 : var4;
						var19 = var23 < var5 ? var23 : var5;
					} else {
						var33 = var13 + var11.field3414;
						var31 = var11.field3474 + var14;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var33 < var4 ? var33 : var4;
						var19 = var31 < var5 ? var31 : var5;
					}

					if (!var11.field3398 || var16 < var18 && var17 < var19) {
						if (var11.field3500 != 0) {
							if (1336 == var11.field3500) {
								if (class186.field2040.method1781()) {
									var14 += 15;
									class248.field2935.method6856("Fps:" + class40.field260, var11.field3414 + var13, var14, 16776960, -1);
									var14 += 15;
									Runtime var43 = Runtime.getRuntime();
									var31 = (int)((var43.totalMemory() - var43.freeMemory()) / 1024L);
									var32 = 16776960;
									if (var31 > 327680 && !client.field1743) {
										var32 = 16711680;
									}

									class248.field2935.method6856("Mem:" + var31 + "k", var11.field3414 + var13, var14, var32, -1);
									var14 += 15;
								}
								continue;
							}

							if (var11.field3500 == 1337) {
								client.field1851 = var13;
								client.field1852 = var14;
								class62.method1191(var13, var14, var11.field3414, var11.field3474);
								client.field1913[var11.field3548] = true;
								class478.method8672(var2, var3, var4, var5);
								continue;
							}

							if (1338 == var11.field3500) {
								class88.method1907(var11, var13, var14, var12);
								class478.method8672(var2, var3, var4, var5);
								continue;
							}

							if (1339 == var11.field3500) {
								class36.method480(var11, var13, var14, var12);
								class478.method8672(var2, var3, var4, var5);
								continue;
							}

							if (1400 == var11.field3500) {
								class166.field1548.method7692(var13, var14, var11.field3414, var11.field3474, client.field1700);
							}

							if (var11.field3500 == 1401) {
								class166.field1548.method7723(var13, var14, var11.field3414, var11.field3474);
							}

							if (1402 == var11.field3500) {
								class151.field1450.method1973(var13, client.field1700);
							}
						}

						if (0 == var11.field3536) {
							if (!var11.field3398 && client.method1138(var11) && class242.field2895 != var11) {
								continue;
							}

							if (!var11.field3398) {
								if (var11.field3421 > var11.field3423 - var11.field3474) {
									var11.field3421 = var11.field3423 - var11.field3474;
								}

								if (var11.field3421 < 0) {
									var11.field3421 = 0;
								}
							}

							method1013(var0, var11.field3492, var16, var17, var18, var19, var13 - var11.field3427, var14 - var11.field3421, var12);
							if (null != var11.field3541) {
								method1013(var11.field3541, var11.field3492, var16, var17, var18, var19, var13 - var11.field3427, var14 - var11.field3421, var12);
							}

							class102 var20 = (class102)client.field1863.method8177((long)var11.field3492);
							if (var20 != null) {
								class83.method1641(var20.field1057, var16, var17, var18, var19, var13, var14, var12);
							}

							class478.method8672(var2, var3, var4, var5);
							class221.method4530();
						} else if (11 == var11.field3536) {
							if (client.method1138(var11) && class242.field2895 != var11) {
								continue;
							}

							if (null != var11.field3541) {
								method1013(var11.field3541, var11.field3492, var16, var17, var18, var19, var13 - var11.field3427, var14 - var11.field3421, var12);
							}

							class478.method8672(var2, var3, var4, var5);
							class221.method4530();
						}

						if (client.field1922 || client.field1915[var12] || client.field1944 > 1) {
							if (var11.field3536 == 0 && !var11.field3398 && var11.field3423 > var11.field3474) {
								client.method1346(var11.field3414 + var13, var14, var11.field3421, var11.field3474, var11.field3423);
							}

							if (var11.field3536 != 1) {
								int var24;
								int var25;
								int var26;
								int var27;
								if (2 == var11.field3536) {
									var33 = 0;

									for (var31 = 0; var31 < var11.field3429; ++var31) {
										for (var32 = 0; var32 < var11.field3410; ++var32) {
											var23 = (var11.field3520 + 32) * var32 + var13;
											var24 = var14 + (var11.field3451 + 32) * var31;
											if (var33 < 20) {
												var23 += var11.field3469[var33];
												var24 += var11.field3381[var33];
											}

											if (var11.field3392[var33] <= 0) {
												if (var11.field3471 != null && var33 < 20) {
													class491 var51 = var11.method5506(var33);
													if (var51 != null) {
														var51.method8866(var23, var24);
													} else if (class290.field3397) {
														class53.method1040(var11);
													}
												}
											} else {
												boolean var46 = false;
												boolean var47 = false;
												var27 = var11.field3392[var33] - 1;
												if (var23 + 32 > var2 && var23 < var4 && var24 + 32 > var3 && var24 < var5 || var11 == class385.field4502 && client.field1800 == var33) {
													class491 var28;
													if (client.field1855 == 1 && var33 == class82.field755 && class356.field4318 == var11.field3492) {
														var28 = class202.method3994(var27, var11.field3438[var33], 2, 0, 2, false);
													} else {
														var28 = class202.method3994(var27, var11.field3438[var33], 1, 3153952, 2, false);
													}

													if (null != var28) {
														if (class385.field4502 == var11 && client.field1800 == var33) {
															var25 = class28.field158 - client.field1809;
															var26 = class28.field153 - client.field1810;
															if (var25 < 5 && var25 > -5) {
																var25 = 0;
															}

															if (var26 < 5 && var26 > -5) {
																var26 = 0;
															}

															if (client.field1813 < 5) {
																var25 = 0;
																var26 = 0;
															}

															var28.method8885(var23 + var25, var26 + var24, 128);
															if (var1 != -1) {
																class290 var29 = var0[var1 & 65535];
																int var30;
																if (var24 + var26 < class478.field5013 && var29.field3421 > 0) {
																	var30 = (class478.field5013 - var24 - var26) * client.field1745 / 3;
																	if (var30 > client.field1745 * 10) {
																		var30 = client.field1745 * 10;
																	}

																	if (var30 > var29.field3421) {
																		var30 = var29.field3421;
																	}

																	var29.field3421 -= var30;
																	client.field1810 += var30;
																	class53.method1040(var29);
																}

																if (32 + var24 + var26 > class478.field5014 && var29.field3421 < var29.field3423 - var29.field3474) {
																	var30 = client.field1745 * (32 + var24 + var26 - class478.field5014) / 3;
																	if (var30 > client.field1745 * 10) {
																		var30 = client.field1745 * 10;
																	}

																	if (var30 > var29.field3423 - var29.field3474 - var29.field3421) {
																		var30 = var29.field3423 - var29.field3474 - var29.field3421;
																	}

																	var29.field3421 += var30;
																	client.field1810 -= var30;
																	class53.method1040(var29);
																}
															}
														} else if (var11 == class293.field3565 && client.field1807 == var33) {
															var28.method8885(var23, var24, 128);
														} else {
															var28.method8866(var23, var24);
														}
													} else {
														class53.method1040(var11);
													}
												}
											}

											++var33;
										}
									}
								} else if (3 == var11.field3536) {
									if (class45.method898(var11)) {
										var33 = var11.field3545;
										if (class242.field2895 == var11 && 0 != var11.field3465) {
											var33 = var11.field3465;
										}
									} else {
										var33 = var11.field3424;
										if (class242.field2895 == var11 && var11.field3406 != 0) {
											var33 = var11.field3406;
										}
									}

									if (var11.field3428) {
										switch(var11.field3446.field5044) {
										case 1:
											class478.method8681(var13, var14, var11.field3414, var11.field3474, var11.field3424, var11.field3545);
											break;
										case 2:
											class478.method8682(var13, var14, var11.field3414, var11.field3474, var11.field3424, var11.field3545, 255 - (var11.field3533 & 255), 255 - (var11.field3431 & 255));
											break;
										default:
											if (var15 == 0) {
												class478.method8680(var13, var14, var11.field3414, var11.field3474, var33);
											} else {
												class478.method8731(var13, var14, var11.field3414, var11.field3474, var33, 256 - (var15 & 255));
											}
										}
									} else if (var15 == 0) {
										class478.method8671(var13, var14, var11.field3414, var11.field3474, var33);
									} else {
										class478.method8704(var13, var14, var11.field3414, var11.field3474, var33, 256 - (var15 & 255));
									}
								} else {
									class386 var40;
									if (4 == var11.field3536) {
										var40 = var11.method5623();
										if (null == var40) {
											if (class290.field3397) {
												class53.method1040(var11);
											}
										} else {
											String var45 = var11.field3461;
											if (class45.method898(var11)) {
												var31 = var11.field3545;
												if (var11 == class242.field2895 && 0 != var11.field3465) {
													var31 = var11.field3465;
												}

												if (var11.field3502.length() > 0) {
													var45 = var11.field3502;
												}
											} else {
												var31 = var11.field3424;
												if (class242.field2895 == var11 && 0 != var11.field3406) {
													var31 = var11.field3406;
												}
											}

											if (var11.field3398 && -1 != var11.field3404) {
												class200 var52 = class208.method4105(var11.field3404);
												var45 = var52.field2259;
												if (null == var45) {
													var45 = class321.field3756;
												}

												if ((1 == var52.field2270 || 1 != var11.field3538) && -1 != var11.field3538) {
													var45 = class79.method2039(16748608) + var45 + class79.field729 + " " + 'x' + class436.method7979(var11.field3538);
												}
											}

											if (client.field1868 == var11) {
												var45 = class321.field3896;
												var31 = var11.field3424;
											}

											if (!var11.field3398) {
												var45 = class179.method2985(var45, var11);
											}

											var40.method6858(var45, var13, var14, var11.field3414, var11.field3474, var31, var11.field3466 ? 0 : -1, var11.field3464, var11.field3527, var11.field3463);
										}
									} else if (var11.field3536 == 5) {
										class491 var42;
										if (!var11.field3398) {
											var42 = var11.method5500(class45.method898(var11), class172.field1625);
											if (var42 != null) {
												var42.method8866(var13, var14);
											} else if (class290.field3397) {
												class53.method1040(var11);
											}
										} else {
											if (var11.field3404 != -1) {
												var42 = class202.method3994(var11.field3404, var11.field3538, var11.field3439, var11.field3504, var11.field3459, false);
											} else {
												var42 = var11.method5500(false, class172.field1625);
											}

											if (null == var42) {
												if (class290.field3397) {
													class53.method1040(var11);
												}
											} else {
												var31 = var42.field5061;
												var32 = var42.field5062;
												if (!var11.field3416) {
													var23 = var11.field3414 * 4096 / var31;
													if (var11.field3388 != 0) {
														var42.method8868(var11.field3414 / 2 + var13, var11.field3474 / 2 + var14, var11.field3388, var23);
													} else if (var15 != 0) {
														var42.method8871(var13, var14, var11.field3414, var11.field3474, 256 - (var15 & 255));
													} else if (var31 == var11.field3414 && var11.field3474 == var32) {
														var42.method8866(var13, var14);
													} else {
														var42.method8852(var13, var14, var11.field3414, var11.field3474);
													}
												} else {
													class478.method8673(var13, var14, var11.field3414 + var13, var11.field3474 + var14);
													var23 = (var11.field3414 + (var31 - 1)) / var31;
													var24 = (var32 - 1 + var11.field3474) / var32;

													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var24; ++var26) {
															if (var11.field3388 != 0) {
																var42.method8868(var25 * var31 + var13 + var31 / 2, var14 + var26 * var32 + var32 / 2, var11.field3388, 4096);
															} else if (var15 != 0) {
																var42.method8885(var31 * var25 + var13, var14 + var32 * var26, 256 - (var15 & 255));
															} else {
																var42.method8866(var13 + var31 * var25, var26 * var32 + var14);
															}
														}
													}

													class478.method8672(var2, var3, var4, var5);
												}
											}
										}
									} else {
										class200 var36;
										if (var11.field3536 == 6) {
											boolean var50 = class45.method898(var11);
											if (var50) {
												var31 = var11.field3448;
											} else {
												var31 = var11.field3482;
											}

											class216 var44 = null;
											var23 = 0;
											if (var11.field3404 != -1) {
												var36 = class208.method4105(var11.field3404);
												if (null != var36) {
													var36 = var36.method3923(var11.field3538);
													var44 = var36.method3922(1);
													if (var44 != null) {
														var44.method4412();
														var23 = var44.field2740 / 2;
													} else {
														class53.method1040(var11);
													}
												}
											} else if (var11.field3443 == 5) {
												if (0 == var11.field3462) {
													var44 = client.field1733.method6043((class183)null, -1, (class183)null, -1);
												} else {
													var44 = class142.field1370.method4625();
												}
											} else {
												class208 var53 = null;
												class198 var48 = null;
												if (6 == var11.field3443) {
													var26 = var11.field3462;
													if (var26 >= 0 && var26 < client.field1934.length) {
														class85 var37 = client.field1934[var26];
														if (var37 != null) {
															var53 = var37.field790;
															var48 = var37.method1728();
														}
													}
												}

												class183 var38 = null;
												var27 = -1;
												if (var31 != -1) {
													var38 = class214.method4351(var31);
													var27 = var11.field3539;
												}

												var44 = var11.method5571(var38, var27, var50, class142.field1370.field827, var53, var48);
												if (null == var44 && class290.field3397) {
													class53.method1040(var11);
												}
											}

											class221.method4612(var13 + var11.field3414 / 2, var14 + var11.field3474 / 2);
											var24 = class221.field2667[var11.field3467] * var11.field3382 >> 16;
											var25 = class221.field2690[var11.field3467] * var11.field3382 >> 16;
											if (var44 != null) {
												if (!var11.field3398) {
													var44.method4403(0, var11.field3454, 0, var11.field3467, 0, var24, var25);
												} else {
													var44.method4412();
													if (var11.field3457) {
														var44.method4432(0, var11.field3454, var11.field3453, var11.field3467, var11.field3449, var11.field3544 + var23 + var24, var25 + var11.field3544, var11.field3382);
													} else {
														var44.method4403(0, var11.field3454, var11.field3453, var11.field3467, var11.field3449, var23 + var24 + var11.field3544, var11.field3544 + var25);
													}
												}
											}

											class221.method4533();
										} else {
											if (var11.field3536 == 7) {
												var40 = var11.method5623();
												if (var40 == null) {
													if (class290.field3397) {
														class53.method1040(var11);
													}
													continue;
												}

												var31 = 0;

												for (var32 = 0; var32 < var11.field3429; ++var32) {
													for (var23 = 0; var23 < var11.field3410; ++var23) {
														if (var11.field3392[var31] > 0) {
															var36 = class208.method4105(var11.field3392[var31] - 1);
															String var34;
															if (var36.field2270 != 1 && var11.field3438[var31] == 1) {
																var34 = class79.method2039(16748608) + var36.field2259 + class79.field729;
															} else {
																var34 = class79.method2039(16748608) + var36.field2259 + class79.field729 + " " + 'x' + class436.method7979(var11.field3438[var31]);
															}

															var26 = var13 + (115 + var11.field3520) * var23;
															var27 = var14 + (var11.field3451 + 12) * var32;
															if (var11.field3464 == 0) {
																var40.method6854(var34, var26, var27, var11.field3424, var11.field3466 ? 0 : -1);
															} else if (1 == var11.field3464) {
																var40.method6857(var34, var26 + var11.field3414 / 2, var27, var11.field3424, var11.field3466 ? 0 : -1);
															} else {
																var40.method6856(var34, var26 + var11.field3414 - 1, var27, var11.field3424, var11.field3466 ? 0 : -1);
															}
														}

														++var31;
													}
												}
											}

											class386 var22;
											if (8 == var11.field3536 && var11 == class379.field4462 && client.field1703 == client.field1735) {
												var33 = 0;
												var31 = 0;
												var22 = class248.field2935;
												String var35 = var11.field3461;

												String var49;
												for (var35 = class179.method2985(var35, var11); var35.length() > 0; var31 += var22.field4392 + 1) {
													var25 = var35.indexOf(class79.field725);
													if (var25 != -1) {
														var49 = var35.substring(0, var25);
														var35 = var35.substring(var25 + 4);
													} else {
														var49 = var35;
														var35 = "";
													}

													var26 = var22.method6901(var49);
													if (var26 > var33) {
														var33 = var26;
													}
												}

												var33 += 6;
												var31 += 7;
												var25 = var13 + var11.field3414 - 5 - var33;
												var26 = var11.field3474 + var14 + 5;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}

												if (var25 + var33 > var4) {
													var25 = var4 - var33;
												}

												if (var31 + var26 > var5) {
													var26 = var5 - var31;
												}

												class478.method8680(var25, var26, var33, var31, 16777120);
												class478.method8671(var25, var26, var33, var31, 0);
												var35 = var11.field3461;
												var27 = var26 + var22.field4392 + 2;

												for (var35 = class179.method2985(var35, var11); var35.length() > 0; var27 += var22.field4392 + 1) {
													int var39 = var35.indexOf(class79.field725);
													if (var39 != -1) {
														var49 = var35.substring(0, var39);
														var35 = var35.substring(var39 + 4);
													} else {
														var49 = var35;
														var35 = "";
													}

													var22.method6854(var49, var25 + 3, var27, 0, -1);
												}
											}

											if (9 == var11.field3536) {
												if (var11.field3433) {
													var33 = var13;
													var31 = var14 + var11.field3474;
													var32 = var11.field3414 + var13;
													var23 = var14;
												} else {
													var33 = var13;
													var31 = var14;
													var32 = var11.field3414 + var13;
													var23 = var11.field3474 + var14;
												}

												if (var11.field3432 == 1) {
													class478.method8715(var33, var31, var32, var23, var11.field3424);
												} else {
													class391.method7267(var33, var31, var32, var23, var11.field3424, var11.field3432);
												}
											} else if (12 == var11.field3536) {
												class295 var41 = var11.method5510();
												class288 var21 = var11.method5636();
												if (var41 != null && null != var21 && var41.method5862()) {
													var22 = var11.method5623();
													if (var22 != null) {
														client.field1687.method8630(var13, var14, var11.field3414, var11.field3474, var41.method5737(), var41.method5738(), 0, 0, var41.method5734(), var41.method5713(), var41.method5733());
														var23 = var11.field3466 ? var11.field3504 : -1;
														if (!var41.method5763() && var41.method5804().method7183()) {
															client.field1687.method8622(var21.field3376, var23, var21.field3375, var21.field3377);
															client.field1687.method8621(var41.method5693(), var22);
														} else {
															client.field1687.method8622(var11.field3424, var23, var21.field3375, var21.field3377);
															client.field1687.method8621(var41.method5804(), var22);
														}

														class478.method8672(var2, var3, var4, var5);
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
		}

	}
}
