import io.spectralpowered.ObfInfo;
import java.security.SecureRandom;

@ObfInfo(
	name = "ay"
)
public class class189 {
	@ObfInfo(
		owner = "ay",
		name = "u",
		desc = "I"
	)
	public static int field1707;
	@ObfInfo(
		owner = "ay",
		name = "qv",
		desc = "Lqk;"
	)
	static class449 field1706;
	@ObfInfo(
		owner = "ay",
		name = "te",
		desc = "I"
	)
	static int field1709;
	@ObfInfo(
		owner = "ay",
		name = "ga",
		desc = "Ljava/security/SecureRandom;"
	)
	static SecureRandom field1708;
	@ObfInfo(
		owner = "ay",
		name = "f",
		desc = "I"
	)
	int field1704;
	@ObfInfo(
		owner = "ay",
		name = "r",
		desc = "I"
	)
	int field1705;

	@ObfInfo(
		owner = "ay",
		name = "<init>",
		desc = "(II)V"
	)
	class189(int var1, int var2) {
		this.field1704 = var1;
		this.field1705 = var2;
	}

	@ObfInfo(
		owner = "ay",
		name = "h",
		desc = "(Lav;I)Z"
	)
	boolean method853(class310 var1) {
		if (null == var1) {
			return false;
		} else {
			switch(this.field1704) {
			case 1:
				return var1.method1501(this.field1705);
			case 2:
				return var1.method1502(this.field1705);
			case 3:
				return var1.method1499((char)this.field1705);
			case 4:
				return var1.method1500(this.field1705 == 1);
			default:
				return false;
			}
		}
	}

	@ObfInfo(
		owner = "ay",
		name = "x",
		desc = "(II)Ldz;"
	)
	static class453 method856(int var0) {
		class453 var2 = (class453)class2.method10(class475.method2355(), var0);
		if (var2 == null) {
			var2 = class453.field3759;
		}

		return var2;
	}

	@ObfInfo(
		owner = "ay",
		name = "j",
		desc = "(S)V"
	)
	public static void method855() {
		class284.field2354.method395();
	}

	@ObfInfo(
		owner = "ay",
		name = "fj",
		desc = "(I)V"
	)
	static final void method852() {
		class318.field2525 = false;
		client.field274 = false;
	}

	@ObfInfo(
		owner = "ay",
		name = "km",
		desc = "(II)Ljava/lang/String;"
	)
	static String method857(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return client.field256[var0].length() > 0 ? client.field375[var0] + class177.field1496 + client.field256[var0] : client.field375[var0];
		}
	}

	@ObfInfo(
		owner = "ay",
		name = "kv",
		desc = "([Lkd;IIIIIIIIB)V"
	)
	static final void method854(class120[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		class162.method742(var2, var3, var4, var5);
		class341.method1709();

		for (int var10 = 0; var10 < var0.length; ++var10) {
			class120 var11 = var0[var10];
			if (null != var11 && (var11.field912 == var1 || var1 == -1412584499 && client.field406 == var11)) {
				int var12;
				if (var8 == -1) {
					client.field447[client.field442] = var11.field906 + var6;
					client.field448[client.field442] = var7 + var11.field907;
					client.field435[client.field442] = var11.field908;
					client.field247[client.field442] = var11.field967;
					var12 = ++client.field442 - 1;
				} else {
					var12 = var8;
				}

				var11.field1038 = var12;
				var11.field1039 = client.field231;
				if (!var11.field893 || !class9.method47(var11)) {
					if (var11.field993 > 0) {
						class436.method2165(var11);
					}

					int var13 = var11.field906 + var6;
					int var14 = var7 + var11.field907;
					int var15 = var11.field1024;
					int var16;
					int var17;
					if (var11 == client.field406) {
						if (var1 != -1412584499 && !var11.field982) {
							class466.field3875 = var0;
							class168.field1265 = var6;
							class406.field3406 = var7;
							continue;
						}

						if (client.field417 && client.field458) {
							var16 = class466.field3863;
							var17 = class466.field3858;
							var16 -= client.field408;
							var17 -= client.field409;
							if (var16 < client.field412) {
								var16 = client.field412;
							}

							if (var11.field908 + var16 > client.field407.field908 + client.field412) {
								var16 = client.field412 + client.field407.field908 - var11.field908;
							}

							if (var17 < client.field326) {
								var17 = client.field326;
							}

							if (var11.field967 + var17 > client.field326 + client.field407.field967) {
								var17 = client.field407.field967 + client.field326 - var11.field967;
							}

							var13 = var16;
							var14 = var17;
						}

						if (!var11.field982) {
							var15 = 128;
						}
					}

					int var18;
					int var19;
					int var23;
					int var31;
					int var32;
					int var33;
					if (2 == var11.field1026) {
						var16 = var2;
						var17 = var3;
						var18 = var4;
						var19 = var5;
					} else if (var11.field1026 == 9) {
						var33 = var13;
						var31 = var14;
						var32 = var13 + var11.field908;
						var23 = var14 + var11.field967;
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
						var33 = var13 + var11.field908;
						var31 = var11.field967 + var14;
						var16 = var13 > var2 ? var13 : var2;
						var17 = var14 > var3 ? var14 : var3;
						var18 = var33 < var4 ? var33 : var4;
						var19 = var31 < var5 ? var31 : var5;
					}

					if (!var11.field893 || var16 < var18 && var17 < var19) {
						if (var11.field993 != 0) {
							if (1336 == var11.field993) {
								if (class50.field574.method2205()) {
									var14 += 15;
									class400.field3376.method2026("Fps:" + class214.field1849, var11.field908 + var13, var14, 16776960, -1);
									var14 += 15;
									Runtime var43 = Runtime.getRuntime();
									var31 = (int)((var43.totalMemory() - var43.freeMemory()) / 1024L);
									var32 = 16776960;
									if (var31 > 327680 && !client.field274) {
										var32 = 16711680;
									}

									class400.field3376.method2026("Mem:" + var31 + "k", var11.field908 + var13, var14, var32, -1);
									var14 += 15;
								}
								continue;
							}

							if (var11.field993 == 1337) {
								client.field382 = var13;
								client.field383 = var14;
								class208.method904(var13, var14, var11.field908, var11.field967);
								client.field444[var11.field1038] = true;
								class162.method742(var2, var3, var4, var5);
								continue;
							}

							if (1338 == var11.field993) {
								class380.method1872(var11, var13, var14, var12);
								class162.method742(var2, var3, var4, var5);
								continue;
							}

							if (1339 == var11.field993) {
								class73.method322(var11, var13, var14, var12);
								class162.method742(var2, var3, var4, var5);
								continue;
							}

							if (1400 == var11.field993) {
								class164.field1249.method1295(var13, var14, var11.field908, var11.field967, client.field231);
							}

							if (var11.field993 == 1401) {
								class164.field1249.method1317(var13, var14, var11.field908, var11.field967);
							}

							if (1402 == var11.field993) {
								class312.field2467.method1954(var13, client.field231);
							}
						}

						if (0 == var11.field1026) {
							if (!var11.field893 && class9.method47(var11) && class393.field3284 != var11) {
								continue;
							}

							if (!var11.field893) {
								if (var11.field914 > var11.field916 - var11.field967) {
									var11.field914 = var11.field916 - var11.field967;
								}

								if (var11.field914 < 0) {
									var11.field914 = 0;
								}
							}

							method854(var0, var11.field985, var16, var17, var18, var19, var13 - var11.field920, var14 - var11.field914, var12);
							if (null != var11.field1031) {
								method854(var11.field1031, var11.field985, var16, var17, var18, var19, var13 - var11.field920, var14 - var11.field914, var12);
							}

							class415 var20 = (class415)client.field394.method791((long)var11.field985);
							if (var20 != null) {
								class431.method2125(var20.field3426, var16, var17, var18, var19, var13, var14, var12);
							}

							class162.method742(var2, var3, var4, var5);
							class341.method1709();
						} else if (11 == var11.field1026) {
							if (class9.method47(var11) && class393.field3284 != var11) {
								continue;
							}

							if (null != var11.field1031) {
								method854(var11.field1031, var11.field985, var16, var17, var18, var19, var13 - var11.field920, var14 - var11.field914, var12);
							}

							class162.method742(var2, var3, var4, var5);
							class341.method1709();
						}

						if (client.field453 || client.field446[var12] || client.field475 > 1) {
							if (var11.field1026 == 0 && !var11.field893 && var11.field916 > var11.field967) {
								class386.method1900(var11.field908 + var13, var14, var11.field914, var11.field967, var11.field916);
							}

							if (var11.field1026 != 1) {
								int var24;
								int var25;
								int var26;
								int var27;
								if (2 == var11.field1026) {
									var33 = 0;

									for (var31 = 0; var31 < var11.field922; ++var31) {
										for (var32 = 0; var32 < var11.field904; ++var32) {
											var23 = (var11.field1011 + 32) * var32 + var13;
											var24 = var14 + (var11.field944 + 32) * var31;
											if (var33 < 20) {
												var23 += var11.field962[var33];
												var24 += var11.field881[var33];
											}

											if (var11.field887[var33] <= 0) {
												if (var11.field964 != null && var33 < 20) {
													class266 var51 = var11.method482(var33);
													if (var51 != null) {
														var51.method1240(var23, var24);
													} else if (class120.field892) {
														class184.method836(var11);
													}
												}
											} else {
												boolean var46 = false;
												boolean var47 = false;
												var27 = var11.field887[var33] - 1;
												if (var23 + 32 > var2 && var23 < var4 && var24 + 32 > var3 && var24 < var5 || var11 == class321.field2562 && client.field331 == var33) {
													class266 var28;
													if (client.field386 == 1 && var33 == class249.field2059 && class10.field52 == var11.field985) {
														var28 = class70.method310(var27, var11.field931[var33], 2, 0, 2, false);
													} else {
														var28 = class70.method310(var27, var11.field931[var33], 1, 3153952, 2, false);
													}

													if (null != var28) {
														if (class321.field2562 == var11 && client.field331 == var33) {
															var25 = class466.field3863 - client.field340;
															var26 = class466.field3858 - client.field341;
															if (var25 < 5 && var25 > -5) {
																var25 = 0;
															}

															if (var26 < 5 && var26 > -5) {
																var26 = 0;
															}

															if (client.field344 < 5) {
																var25 = 0;
																var26 = 0;
															}

															var28.method1245(var23 + var25, var26 + var24, 128);
															if (var1 != -1) {
																class120 var29 = var0[var1 & 65535];
																int var30;
																if (var24 + var26 < class162.field1234 && var29.field914 > 0) {
																	var30 = (class162.field1234 - var24 - var26) * client.field276 / 3;
																	if (var30 > client.field276 * 10) {
																		var30 = client.field276 * 10;
																	}

																	if (var30 > var29.field914) {
																		var30 = var29.field914;
																	}

																	var29.field914 -= var30;
																	client.field341 += var30;
																	class184.method836(var29);
																}

																if (32 + var24 + var26 > class162.field1235 && var29.field914 < var29.field916 - var29.field967) {
																	var30 = client.field276 * (32 + var24 + var26 - class162.field1235) / 3;
																	if (var30 > client.field276 * 10) {
																		var30 = client.field276 * 10;
																	}

																	if (var30 > var29.field916 - var29.field967 - var29.field914) {
																		var30 = var29.field916 - var29.field967 - var29.field914;
																	}

																	var29.field914 += var30;
																	client.field341 -= var30;
																	class184.method836(var29);
																}
															}
														} else if (var11 == class101.field800 && client.field338 == var33) {
															var28.method1245(var23, var24, 128);
														} else {
															var28.method1240(var23, var24);
														}
													} else {
														class184.method836(var11);
													}
												}
											}

											++var33;
										}
									}
								} else if (3 == var11.field1026) {
									if (class433.method2147(var11)) {
										var33 = var11.field1035;
										if (class393.field3284 == var11 && 0 != var11.field958) {
											var33 = var11.field958;
										}
									} else {
										var33 = var11.field917;
										if (class393.field3284 == var11 && var11.field900 != 0) {
											var33 = var11.field900;
										}
									}

									if (var11.field921) {
										switch(var11.field939.field31) {
										case 1:
											class162.method750(var13, var14, var11.field908, var11.field967, var11.field917, var11.field1035);
											break;
										case 2:
											class162.method751(var13, var14, var11.field908, var11.field967, var11.field917, var11.field1035, 255 - (var11.field1024 & 255), 255 - (var11.field924 & 255));
											break;
										default:
											if (var15 == 0) {
												class162.method749(var13, var14, var11.field908, var11.field967, var33);
											} else {
												class162.method762(var13, var14, var11.field908, var11.field967, var33, 256 - (var15 & 255));
											}
										}
									} else if (var15 == 0) {
										class162.method741(var13, var14, var11.field908, var11.field967, var33);
									} else {
										class162.method756(var13, var14, var11.field908, var11.field967, var33, 256 - (var15 & 255));
									}
								} else {
									class58 var40;
									if (4 == var11.field1026) {
										var40 = var11.method505();
										if (null == var40) {
											if (class120.field892) {
												class184.method836(var11);
											}
										} else {
											String var45 = var11.field954;
											if (class433.method2147(var11)) {
												var31 = var11.field1035;
												if (var11 == class393.field3284 && 0 != var11.field958) {
													var31 = var11.field958;
												}

												if (var11.field995.length() > 0) {
													var45 = var11.field995;
												}
											} else {
												var31 = var11.field917;
												if (class393.field3284 == var11 && 0 != var11.field900) {
													var31 = var11.field900;
												}
											}

											if (var11.field893 && -1 != var11.field898) {
												class263 var52 = class423.method2062(var11.field898);
												var45 = var52.field2147;
												if (null == var45) {
													var45 = class177.field1325;
												}

												if ((1 == var52.field2157 || 1 != var11.field1028) && -1 != var11.field1028) {
													var45 = class238.method1032(16748608) + var45 + class442.field3665 + " " + 'x' + class460.method2269(var11.field1028);
												}
											}

											if (client.field399 == var11) {
												var45 = class177.field1465;
												var31 = var11.field917;
											}

											if (!var11.field893) {
												var45 = class406.method1996(var45, var11);
											}

											var40.method2028(var45, var13, var14, var11.field908, var11.field967, var31, var11.field959 ? 0 : -1, var11.field957, var11.field1018, var11.field956);
										}
									} else if (var11.field1026 == 5) {
										class266 var42;
										if (!var11.field893) {
											var42 = var11.method478(class433.method2147(var11), class300.field2410);
											if (var42 != null) {
												var42.method1240(var13, var14);
											} else if (class120.field892) {
												class184.method836(var11);
											}
										} else {
											if (var11.field898 != -1) {
												var42 = class70.method310(var11.field898, var11.field1028, var11.field932, var11.field997, var11.field952, false);
											} else {
												var42 = var11.method478(false, class300.field2410);
											}

											if (null == var42) {
												if (class120.field892) {
													class184.method836(var11);
												}
											} else {
												var31 = var42.field2203;
												var32 = var42.field2204;
												if (!var11.field910) {
													var23 = var11.field908 * 4096 / var31;
													if (var11.field883 != 0) {
														var42.method1241(var11.field908 / 2 + var13, var11.field967 / 2 + var14, var11.field883, var23);
													} else if (var15 != 0) {
														var42.method1244(var13, var14, var11.field908, var11.field967, 256 - (var15 & 255));
													} else if (var31 == var11.field908 && var11.field967 == var32) {
														var42.method1240(var13, var14);
													} else {
														var42.method1231(var13, var14, var11.field908, var11.field967);
													}
												} else {
													class162.method743(var13, var14, var11.field908 + var13, var11.field967 + var14);
													var23 = (var11.field908 + (var31 - 1)) / var31;
													var24 = (var32 - 1 + var11.field967) / var32;

													for (var25 = 0; var25 < var23; ++var25) {
														for (var26 = 0; var26 < var24; ++var26) {
															if (var11.field883 != 0) {
																var42.method1241(var25 * var31 + var13 + var31 / 2, var14 + var26 * var32 + var32 / 2, var11.field883, 4096);
															} else if (var15 != 0) {
																var42.method1245(var31 * var25 + var13, var14 + var32 * var26, 256 - (var15 & 255));
															} else {
																var42.method1240(var13 + var31 * var25, var26 * var32 + var14);
															}
														}
													}

													class162.method742(var2, var3, var4, var5);
												}
											}
										}
									} else {
										class263 var36;
										if (var11.field1026 == 6) {
											boolean var50 = class433.method2147(var11);
											if (var50) {
												var31 = var11.field941;
											} else {
												var31 = var11.field975;
											}

											class470 var44 = null;
											var23 = 0;
											if (var11.field898 != -1) {
												var36 = class423.method2062(var11.field898);
												if (null != var36) {
													var36 = var36.method1202(var11.field1028);
													var44 = var36.method1201(1);
													if (var44 != null) {
														var44.method2315();
														var23 = var44.field2390 / 2;
													} else {
														class184.method836(var11);
													}
												}
											} else if (var11.field936 == 5) {
												if (0 == var11.field955) {
													var44 = client.field264.method1397((class242)null, -1, (class242)null, -1);
												} else {
													var44 = class113.field846.method1438();
												}
											} else {
												class423 var53 = null;
												class207 var48 = null;
												if (6 == var11.field936) {
													var26 = var11.field955;
													if (var26 >= 0 && var26 < client.field465.length) {
														class267 var37 = client.field465[var26];
														if (var37 != null) {
															var53 = var37.field2213;
															var48 = var37.method1265();
														}
													}
												}

												class242 var38 = null;
												var27 = -1;
												if (var31 != -1) {
													var38 = class271.method1277(var31);
													var27 = var11.field1029;
												}

												var44 = var11.method502(var38, var27, var50, class113.field846.field3194, var53, var48);
												if (null == var44 && class120.field892) {
													class184.method836(var11);
												}
											}

											class341.method1734(var13 + var11.field908 / 2, var14 + var11.field967 / 2);
											var24 = class341.field2726[var11.field960] * var11.field882 >> 16;
											var25 = class341.field2744[var11.field960] * var11.field882 >> 16;
											if (var44 != null) {
												if (!var11.field893) {
													var44.method2310(0, var11.field947, 0, var11.field960, 0, var24, var25);
												} else {
													var44.method2315();
													if (var11.field950) {
														var44.method2317(0, var11.field947, var11.field946, var11.field960, var11.field942, var11.field1034 + var23 + var24, var25 + var11.field1034, var11.field882);
													} else {
														var44.method2310(0, var11.field947, var11.field946, var11.field960, var11.field942, var23 + var24 + var11.field1034, var11.field1034 + var25);
													}
												}
											}

											class341.method1711();
										} else {
											if (var11.field1026 == 7) {
												var40 = var11.method505();
												if (var40 == null) {
													if (class120.field892) {
														class184.method836(var11);
													}
													continue;
												}

												var31 = 0;

												for (var32 = 0; var32 < var11.field922; ++var32) {
													for (var23 = 0; var23 < var11.field904; ++var23) {
														if (var11.field887[var31] > 0) {
															var36 = class423.method2062(var11.field887[var31] - 1);
															String var34;
															if (var36.field2157 != 1 && var11.field931[var31] == 1) {
																var34 = class238.method1032(16748608) + var36.field2147 + class442.field3665;
															} else {
																var34 = class238.method1032(16748608) + var36.field2147 + class442.field3665 + " " + 'x' + class460.method2269(var11.field931[var31]);
															}

															var26 = var13 + (115 + var11.field1011) * var23;
															var27 = var14 + (var11.field944 + 12) * var32;
															if (var11.field957 == 0) {
																var40.method2025(var34, var26, var27, var11.field917, var11.field959 ? 0 : -1);
															} else if (1 == var11.field957) {
																var40.method2027(var34, var26 + var11.field908 / 2, var27, var11.field917, var11.field959 ? 0 : -1);
															} else {
																var40.method2026(var34, var26 + var11.field908 - 1, var27, var11.field917, var11.field959 ? 0 : -1);
															}
														}

														++var31;
													}
												}
											}

											class58 var22;
											if (8 == var11.field1026 && var11 == class219.field1895 && client.field234 == client.field266) {
												var33 = 0;
												var31 = 0;
												var22 = class400.field3376;
												String var35 = var11.field954;

												String var49;
												for (var35 = class406.method1996(var35, var11); var35.length() > 0; var31 += var22.field3442 + 1) {
													var25 = var35.indexOf(class442.field3661);
													if (var25 != -1) {
														var49 = var35.substring(0, var25);
														var35 = var35.substring(var25 + 4);
													} else {
														var49 = var35;
														var35 = "";
													}

													var26 = var22.method2045(var49);
													if (var26 > var33) {
														var33 = var26;
													}
												}

												var33 += 6;
												var31 += 7;
												var25 = var13 + var11.field908 - 5 - var33;
												var26 = var11.field967 + var14 + 5;
												if (var25 < var13 + 5) {
													var25 = var13 + 5;
												}

												if (var25 + var33 > var4) {
													var25 = var4 - var33;
												}

												if (var31 + var26 > var5) {
													var26 = var5 - var31;
												}

												class162.method749(var25, var26, var33, var31, 16777120);
												class162.method741(var25, var26, var33, var31, 0);
												var35 = var11.field954;
												var27 = var26 + var22.field3442 + 2;

												for (var35 = class406.method1996(var35, var11); var35.length() > 0; var27 += var22.field3442 + 1) {
													int var39 = var35.indexOf(class442.field3661);
													if (var39 != -1) {
														var49 = var35.substring(0, var39);
														var35 = var35.substring(var39 + 4);
													} else {
														var49 = var35;
														var35 = "";
													}

													var22.method2025(var49, var25 + 3, var27, 0, -1);
												}
											}

											if (9 == var11.field1026) {
												if (var11.field926) {
													var33 = var13;
													var31 = var14 + var11.field967;
													var32 = var11.field908 + var13;
													var23 = var14;
												} else {
													var33 = var13;
													var31 = var14;
													var32 = var11.field908 + var13;
													var23 = var11.field967 + var14;
												}

												if (var11.field925 == 1) {
													class162.method759(var33, var31, var32, var23, var11.field917);
												} else {
													class69.method306(var33, var31, var32, var23, var11.field917, var11.field925);
												}
											} else if (12 == var11.field1026) {
												class262 var41 = var11.method485();
												class146 var21 = var11.method509();
												if (var41 != null && null != var21 && var41.method1189()) {
													var22 = var11.method505();
													if (var22 != null) {
														client.field218.method1773(var13, var14, var11.field908, var11.field967, var41.method1163(), var41.method1164(), 0, 0, var41.method1161(), var41.method1146(), var41.method1160());
														var23 = var11.field959 ? var11.field997 : -1;
														if (!var41.method1177() && var41.method1179().method1642()) {
															client.field218.method1772(var21.field1161, var23, var21.field1160, var21.field1162);
															client.field218.method1771(var41.method1130(), var22);
														} else {
															client.field218.method1772(var11.field917, var23, var21.field1160, var21.field1162);
															client.field218.method1771(var41.method1179(), var22);
														}

														class162.method742(var2, var3, var4, var5);
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
