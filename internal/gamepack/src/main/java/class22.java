import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "di"
)
public class class22 implements class178 {
	@ObfInfo(
		owner = "di",
		name = "jp",
		desc = "I"
	)
	static int field105;

	@ObfInfo(
		owner = "di",
		name = "in",
		desc = "(Lct;IIIIIB)V"
	)
	static final void method96(class334 var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.method1678()) {
			if (var0 instanceof class267) {
				class423 var7 = ((class267)var0).field2213;
				if (var7.field3493 != null) {
					var7 = var7.method2054();
				}

				if (null == var7) {
					return;
				}
			}

			int var76 = class268.field2221;
			int[] var8 = class268.field2220;
			byte var9 = 0;
			class380 var11;
			if (var1 < var76 && client.field231 == var0.field2612) {
				var11 = (class380)var0;
				boolean var10;
				if (client.field449 == 0) {
					var10 = false;
				} else if (var11 != class113.field846) {
					boolean var79 = 0 != (client.field449 & 4);
					var10 = var79 || class73.method320((byte)-1) && var11.method1869() || class293.method1436() && var11.method1884();
				} else {
					var10 = class339.method1703();
				}

				if (var10) {
					class380 var12 = (class380)var0;
					if (var1 < var76) {
						class446.method2231(var0, 15 + var0.field2667);
						class420 var13 = (class420)client.field283.get(class460.field3808);
						byte var14 = 9;
						var13.method2027(var12.field3207.method1101(), var2 + client.field436, var3 + client.field257 - var14, 16777215, 0);
						var9 = 18;
					}
				}
			}

			int var91 = -2;
			int var16;
			int var23;
			int var24;
			if (!var0.field2671.method1937()) {
				class446.method2231(var0, var0.field2667 + 15);

				for (class431 var92 = (class431)var0.field2671.method1941(); var92 != null; var92 = (class431)var0.field2671.method1935()) {
					class121 var93 = var92.method2123(client.field231);
					if (var93 == null) {
						if (var92.method2124()) {
							var92.method637();
						}
					} else {
						class406 var96 = var92.field3574;
						class266 var77 = var96.method1994();
						class266 var15 = var96.method1993();
						int var17 = 0;
						if (var77 != null && null != var15) {
							if (var96.field3405 * 2 < var15.field2200) {
								var17 = var96.field3405;
							}

							var16 = var15.field2200 - var17 * 2;
						} else {
							var16 = var96.field3404;
						}

						int var18 = 255;
						boolean var19 = true;
						int var20 = client.field231 - var93.field1048;
						int var21 = var93.field1045 * var16 / var96.field3404;
						int var22;
						int var100;
						if (var93.field1049 > var20) {
							var22 = var96.field3394 == 0 ? 0 : var96.field3394 * (var20 / var96.field3394);
							var23 = var16 * var93.field1047 / var96.field3404;
							var100 = (var21 - var23) * var22 / var93.field1049 + var23;
						} else {
							var100 = var21;
							var22 = var96.field3392 + var93.field1049 - var20;
							if (var96.field3399 >= 0) {
								var18 = (var22 << 8) / (var96.field3392 - var96.field3399);
							}
						}

						if (var93.field1045 > 0 && var100 < 1) {
							var100 = 1;
						}

						if (null != var77 && null != var15) {
							if (var100 == var16) {
								var100 += var17 * 2;
							} else {
								var100 += var17;
							}

							var22 = var77.field2199;
							var91 += var22;
							var23 = client.field436 + var2 - (var16 >> 1);
							var24 = client.field257 + var3 - var91;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var77.method1245(var23, var24, var18);
								class162.method743(var23, var24, var23 + var100, var22 + var24);
								var15.method1245(var23, var24, var18);
							} else {
								var77.method1240(var23, var24);
								class162.method743(var23, var24, var23 + var100, var22 + var24);
								var15.method1240(var23, var24);
							}

							class162.method742(var2, var3, var2 + var4, var3 + var5);
							var91 += 2;
						} else {
							var91 += 5;
							if (client.field436 > -1) {
								var22 = client.field436 + var2 - (var16 >> 1);
								var23 = var3 + client.field257 - var91;
								class162.method749(var22, var23, var100, 5, 65280);
								class162.method749(var22 + var100, var23, var16 - var100, 5, 16711680);
							}

							var91 += 2;
						}
					}
				}
			}

			if (var91 == -2) {
				var91 += 7;
			}

			var91 += var9;
			if (var1 < var76) {
				var11 = (class380)var0;
				if (var11.field3213) {
					return;
				}

				if (var11.field3195 != -1 || -1 != var11.field3196) {
					class446.method2231(var0, 15 + var0.field2667);
					if (client.field436 > -1) {
						if (-1 != var11.field3195) {
							var91 += 25;
							class2.field8[var11.field3195].method1240(client.field436 + var2 - 12, client.field257 + var3 - var91);
						}

						if (-1 != var11.field3196) {
							var91 += 25;
							class44.field540[var11.field3196].method1240(client.field436 + var2 - 12, client.field257 + var3 - var91);
						}
					}
				}

				if (var1 >= 0 && 10 == client.field238 && var8[var1] == client.field307) {
					class446.method2231(var0, var0.field2667 + 15);
					if (client.field436 > -1) {
						var91 += class471.field3962[1].field2199;
						class471.field3962[1].method1240(var2 + client.field436 - 12, client.field257 + var3 - var91);
					}
				}
			} else {
				class267 var94 = (class267)var0;
				int[] var95 = var94.method1267();
				short[] var97 = var94.method1260();
				if (null != var97 && var95 != null) {
					for (int var98 = 0; var98 < var97.length; ++var98) {
						if (var97[var98] >= 0 && var95[var98] >= 0) {
							long var88 = (long)var95[var98] << 8 | (long)var97[var98];
							class266 var82 = (class266)client.field284.method1098(var88);
							if (var82 == null) {
								class266[] var90 = class242.method1064(class446.field3678, var95[var98], 0);
								if (null != var90 && var97[var98] < var90.length) {
									var82 = var90[var97[var98]];
									client.field284.method1096(var88, var82);
								}
							}

							if (null != var82) {
								class446.method2231(var0, 15 + var0.field2667);
								if (client.field436 > -1) {
									var3 -= var82.field2199;
									var82.method1240(var2 + client.field436 - (var82.field2200 >> 1), client.field257 + var3);
									var3 -= 2;
								}
							}
						}
					}
				}

				if (client.field238 == 1 && client.field431[var1 - var76] == client.field239 && client.field231 % 20 < 10) {
					class446.method2231(var0, 15 + var0.field2667);
					if (client.field436 > -1) {
						class471.field3962[0].method1240(client.field436 + var2 - 12, client.field257 + var3 - 28);
					}
				}
			}

			if (var0.field2628 != null && (var1 >= var76 || !var0.field2617 && (4 == client.field455 || !var0.field2629 && (client.field455 == 0 || 3 == client.field455 || 1 == client.field455 && ((class380)var0).method1869())))) {
				class446.method2231(var0, var0.field2667 + 15);
				if (client.field436 > -1 && client.field474 < client.field319) {
					client.field507[client.field474] = class114.field848.method2045(var0.field2628) / 2;
					client.field322[client.field474] = class114.field848.field3442;
					client.field320[client.field474] = client.field436;
					client.field321[client.field474] = client.field257 - var91;
					client.field324[client.field474] = var0.field2632;
					client.field325[client.field474] = var0.field2659;
					client.field415[client.field474] = var0.field2678;
					client.field318[client.field474] = var0.field2628;
					++client.field474;
					var91 += 12;
				}
			}

			for (int var78 = 0; var78 < 4; ++var78) {
				int var103 = var0.field2637[var78];
				int var80 = var0.field2635[var78];
				class473 var102 = null;
				int var81 = 0;
				if (var80 >= 0) {
					if (var103 <= client.field231) {
						continue;
					}

					var102 = class444.method2198(var0.field2635[var78]);
					var81 = var102.field3972;
					if (null != var102 && var102.field3977 != null) {
						var102 = var102.method2340();
						if (var102 == null) {
							var0.field2637[var78] = -1;
							continue;
						}
					}
				} else if (var103 < 0) {
					continue;
				}

				var16 = var0.field2638[var78];
				class473 var104 = null;
				if (var16 >= 0) {
					var104 = class444.method2198(var16);
					if (var104 != null && null != var104.field3977) {
						var104 = var104.method2340();
					}
				}

				if (var103 - var81 <= client.field231) {
					if (null == var102) {
						var0.field2637[var78] = -1;
					} else {
						class446.method2231(var0, var0.field2667 / 2);
						if (client.field436 > -1) {
							boolean var99 = true;
							if (var78 == 1) {
								client.field257 -= 20;
							}

							if (var78 == 2) {
								client.field436 -= 15;
								client.field257 -= 10;
							}

							if (var78 == 3) {
								client.field436 += 15;
								client.field257 -= 10;
							}

							class266 var83 = null;
							class266 var84 = null;
							class266 var85 = null;
							class266 var86 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							class266 var31 = null;
							class266 var32 = null;
							class266 var33 = null;
							class266 var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var83 = var102.method2342();
							int var44;
							if (var83 != null) {
								var23 = var83.field2200;
								var44 = var83.field2199;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var83.field2201;
							}

							var84 = var102.method2343();
							if (null != var84) {
								var24 = var84.field2200;
								var44 = var84.field2199;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var84.field2201;
							}

							var85 = var102.method2350();
							if (null != var85) {
								var25 = var85.field2200;
								var44 = var85.field2199;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var85.field2201;
							}

							var86 = var102.method2344();
							if (var86 != null) {
								var26 = var86.field2200;
								var44 = var86.field2199;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var86.field2201;
							}

							if (var104 != null) {
								var31 = var104.method2342();
								if (var31 != null) {
									var35 = var31.field2200;
									var44 = var31.field2199;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.field2201;
								}

								var32 = var104.method2343();
								if (var32 != null) {
									var36 = var32.field2200;
									var44 = var32.field2199;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.field2201;
								}

								var33 = var104.method2350();
								if (null != var33) {
									var37 = var33.field2200;
									var44 = var33.field2199;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.field2201;
								}

								var34 = var104.method2344();
								if (var34 != null) {
									var38 = var34.field2200;
									var44 = var34.field2199;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.field2201;
								}
							}

							class58 var87 = var102.method2347();
							if (null == var87) {
								var87 = class188.field1702;
							}

							class58 var45;
							if (var104 != null) {
								var45 = var104.method2347();
								if (null == var45) {
									var45 = class188.field1702;
								}
							} else {
								var45 = class188.field1702;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var102.method2341(var0.field2636[var78]);
							int var101 = var87.method2045(var46);
							if (null != var104) {
								var47 = var104.method2341(var0.field2639[var78]);
								var49 = var45.method2045(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var85 == null && null == var86) {
									var50 = 1;
								} else {
									var50 = var101 / var24 + 1;
								}
							}

							if (null != var104 && var36 > 0) {
								if (var33 == null && var34 == null) {
									var51 = 1;
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0;
							int var53 = var52;
							if (var23 > 0) {
								var52 += var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var50 * var24;
								var52 += var57;
								var56 += (var57 - var101) / 2;
							} else {
								var52 += var101;
							}

							var57 = var52;
							if (var26 > 0) {
								var52 += var26;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (null != var104) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var51 * var36;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}

							var63 = var0.field2637[var78] - client.field231;
							int var64 = var102.field3980 - var102.field3980 * var63 / var102.field3972;
							int var65 = -var102.field3975 + var63 * var102.field3975 / var102.field3972;
							int var66 = var2 + client.field436 - (var52 >> 1) + var64;
							int var67 = var65 + (client.field257 + var3 - 12);
							int var68 = var67;
							int var69 = var67 + var43;
							int var70 = var102.field3985 + var67 + 15;
							int var71 = var70 - var87.field3441;
							int var72 = var70 + var87.field3452;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var104 != null) {
								var73 = var67 + 15 + var104.field3985;
								var74 = var73 - var45.field3441;
								var75 = var45.field3452 + var73;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var102.field3982 >= 0) {
								var74 = (var63 << 8) / (var102.field3972 - var102.field3982);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var83 != null) {
									var83.method1245(var66 + var53 - var27, var67, var74);
								}

								if (null != var85) {
									var85.method1245(var54 + var66 - var29, var67, var74);
								}

								if (var84 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var84.method1245(var66 + var55 - var28 + var75 * var24, var67, var74);
									}
								}

								if (null != var86) {
									var86.method1245(var57 + var66 - var30, var67, var74);
								}

								var87.method2046(var46, var56 + var66, var70, var102.field3970, 0, var74);
								if (var104 != null) {
									if (var31 != null) {
										var31.method1245(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.method1245(var59 + var66 - var41, var67, var74);
									}

									if (null != var32) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method1245(var66 + var60 - var40 + var75 * var36, var67, var74);
										}
									}

									if (var34 != null) {
										var34.method1245(var61 + var66 - var42, var67, var74);
									}

									var45.method2046(var47, var62 + var66, var73, var104.field3970, 0, var74);
								}
							} else {
								if (null != var83) {
									var83.method1240(var66 + var53 - var27, var67);
								}

								if (null != var85) {
									var85.method1240(var54 + var66 - var29, var67);
								}

								if (null != var84) {
									for (var75 = 0; var75 < var50; ++var75) {
										var84.method1240(var55 + var66 - var28 + var75 * var24, var67);
									}
								}

								if (null != var86) {
									var86.method1240(var57 + var66 - var30, var67);
								}

								var87.method2025(var46, var66 + var56, var70, var102.field3970 | -16777216, 0);
								if (var104 != null) {
									if (var31 != null) {
										var31.method1240(var58 + var66 - var39, var67);
									}

									if (null != var33) {
										var33.method1240(var66 + var59 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method1240(var36 * var75 + (var66 + var60 - var40), var67);
										}
									}

									if (null != var34) {
										var34.method1240(var61 + var66 - var42, var67);
									}

									var45.method2025(var47, var66 + var62, var73, var104.field3970 | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
