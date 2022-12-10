public class class113 implements class111 {
	static int field1145;

	public class113() {
	}

	static final void method2185(class98 var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.method2043()) {
			if (var0 instanceof class85) {
				class208 var7 = ((class85)var0).field790;
				if (var7.field2412 != null) {
					var7 = var7.method4083();
				}

				if (null == var7) {
					return;
				}
			}

			int var76 = class87.field818;
			int[] var8 = class87.field817;
			byte var9 = 0;
			class88 var11;
			if (var1 < var76 && client.field1700 == var0.field952) {
				var11 = (class88)var0;
				boolean var10;
				if (client.field1918 == 0) {
					var10 = false;
				} else if (var11 != class142.field1370) {
					boolean var79 = 0 != (client.field1918 & 4);
					var10 = var79 || class36.method476() && var11.method1902() || class121.method2305() && var11.method1942();
				} else {
					var10 = class66.method1229();
				}

				if (var10) {
					class88 var12 = (class88)var0;
					if (var1 < var76) {
						client.method1875(var0, 15 + var0.field1007);
						class369 var13 = (class369)client.field1752.get(class436.field4787);
						byte var14 = 9;
						var13.method6857(var12.field840.method8771(), var2 + client.field1905, var3 + client.field1726 - var14, 16777215, 0);
						var9 = 18;
					}
				}
			}

			int var91 = -2;
			int var16;
			int var23;
			int var24;
			if (!var0.field1011.method6667()) {
				client.method1875(var0, var0.field1007 + 15);

				for (class83 var92 = (class83)var0.field1011.method6705(); var92 != null; var92 = (class83)var0.field1011.method6665()) {
					class99 var93 = var92.method1639(client.field1700);
					if (var93 == null) {
						if (var92.method1640()) {
							var92.method7951();
						}
					} else {
						class179 var96 = var92.field759;
						class491 var77 = var96.method2976();
						class491 var15 = var96.method2975();
						int var17 = 0;
						if (var77 != null && null != var15) {
							if (var96.field1669 * 2 < var15.field5057) {
								var17 = var96.field1669;
							}

							var16 = var15.field5057 - var17 * 2;
						} else {
							var16 = var96.field1668;
						}

						int var18 = 255;
						boolean var19 = true;
						int var20 = client.field1700 - var93.field1029;
						int var21 = var93.field1026 * var16 / var96.field1668;
						int var22;
						int var100;
						if (var93.field1033 > var20) {
							var22 = var96.field1657 == 0 ? 0 : var96.field1657 * (var20 / var96.field1657);
							var23 = var16 * var93.field1028 / var96.field1668;
							var100 = (var21 - var23) * var22 / var93.field1033 + var23;
						} else {
							var100 = var21;
							var22 = var96.field1655 + var93.field1033 - var20;
							if (var96.field1663 >= 0) {
								var18 = (var22 << 8) / (var96.field1655 - var96.field1663);
							}
						}

						if (var93.field1026 > 0 && var100 < 1) {
							var100 = 1;
						}

						if (null != var77 && null != var15) {
							if (var100 == var16) {
								var100 += var17 * 2;
							} else {
								var100 += var17;
							}

							var22 = var77.field5056;
							var91 += var22;
							var23 = client.field1905 + var2 - (var16 >> 1);
							var24 = client.field1726 + var3 - var91;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var77.method8885(var23, var24, var18);
								class478.method8673(var23, var24, var23 + var100, var22 + var24);
								var15.method8885(var23, var24, var18);
							} else {
								var77.method8866(var23, var24);
								class478.method8673(var23, var24, var23 + var100, var22 + var24);
								var15.method8866(var23, var24);
							}

							class478.method8672(var2, var3, var2 + var4, var3 + var5);
							var91 += 2;
						} else {
							var91 += 5;
							if (client.field1905 > -1) {
								var22 = client.field1905 + var2 - (var16 >> 1);
								var23 = var3 + client.field1726 - var91;
								class478.method8680(var22, var23, var100, 5, 65280);
								class478.method8680(var22 + var100, var23, var16 - var100, 5, 16711680);
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
				var11 = (class88)var0;
				if (var11.field846) {
					return;
				}

				if (var11.field828 != -1 || -1 != var11.field829) {
					client.method1875(var0, 15 + var0.field1007);
					if (client.field1905 > -1) {
						if (-1 != var11.field828) {
							var91 += 25;
							class78.field706[var11.field828].method8866(client.field1905 + var2 - 12, client.field1726 + var3 - var91);
						}

						if (-1 != var11.field829) {
							var91 += 25;
							class400.field4562[var11.field829].method8866(client.field1905 + var2 - 12, client.field1726 + var3 - var91);
						}
					}
				}

				if (var1 >= 0 && 10 == client.field1707 && var8[var1] == client.field1776) {
					client.method1875(var0, var0.field1007 + 15);
					if (client.field1905 > -1) {
						var91 += class363.field4354[1].field5056;
						class363.field4354[1].method8866(var2 + client.field1905 - 12, client.field1726 + var3 - var91);
					}
				}
			} else {
				class85 var94 = (class85)var0;
				int[] var95 = var94.method1731();
				short[] var97 = var94.method1723();
				if (null != var97 && var95 != null) {
					for (int var98 = 0; var98 < var97.length; ++var98) {
						if (var97[var98] >= 0 && var95[var98] >= 0) {
							long var88 = (long)var95[var98] << 8 | (long)var97[var98];
							class491 var82 = (class491)client.field1753.method7012(var88);
							if (var82 == null) {
								class491[] var90 = class183.method3549(class86.field798, var95[var98], 0);
								if (null != var90 && var97[var98] < var90.length) {
									var82 = var90[var97[var98]];
									client.field1753.method7000(var88, var82);
								}
							}

							if (null != var82) {
								client.method1875(var0, 15 + var0.field1007);
								if (client.field1905 > -1) {
									var3 -= var82.field5056;
									var82.method8866(var2 + client.field1905 - (var82.field5057 >> 1), client.field1726 + var3);
									var3 -= 2;
								}
							}
						}
					}
				}

				if (client.field1707 == 1 && client.field1900[var1 - var76] == client.field1708 && client.field1700 % 20 < 10) {
					client.method1875(var0, 15 + var0.field1007);
					if (client.field1905 > -1) {
						class363.field4354[0].method8866(client.field1905 + var2 - 12, client.field1726 + var3 - 28);
					}
				}
			}

			if (var0.field968 != null && (var1 >= var76 || !var0.field957 && (4 == client.field1924 || !var0.field969 && (client.field1924 == 0 || 3 == client.field1924 || 1 == client.field1924 && ((class88)var0).method1902())))) {
				client.method1875(var0, var0.field1007 + 15);
				if (client.field1905 > -1 && client.field1943 < client.field1788) {
					client.field1976[client.field1943] = class140.field1352.method6901(var0.field968) / 2;
					client.field1791[client.field1943] = class140.field1352.field4392;
					client.field1789[client.field1943] = client.field1905;
					client.field1790[client.field1943] = client.field1726 - var91;
					client.field1793[client.field1943] = var0.field972;
					client.field1794[client.field1943] = var0.field999;
					client.field1884[client.field1943] = var0.field1018;
					client.field1787[client.field1943] = var0.field968;
					++client.field1943;
					var91 += 12;
				}
			}

			for (int var78 = 0; var78 < 4; ++var78) {
				int var103 = var0.field977[var78];
				int var80 = var0.field975[var78];
				class195 var102 = null;
				int var81 = 0;
				if (var80 >= 0) {
					if (var103 <= client.field1700) {
						continue;
					}

					var102 = class366.method6810(var0.field975[var78]);
					var81 = var102.field2143;
					if (null != var102 && var102.field2150 != null) {
						var102 = var102.method3779();
						if (var102 == null) {
							var0.field977[var78] = -1;
							continue;
						}
					}
				} else if (var103 < 0) {
					continue;
				}

				var16 = var0.field978[var78];
				class195 var104 = null;
				if (var16 >= 0) {
					var104 = class366.method6810(var16);
					if (var104 != null && null != var104.field2150) {
						var104 = var104.method3779();
					}
				}

				if (var103 - var81 <= client.field1700) {
					if (null == var102) {
						var0.field977[var78] = -1;
					} else {
						client.method1875(var0, var0.field1007 / 2);
						if (client.field1905 > -1) {
							boolean var99 = true;
							if (var78 == 1) {
								client.field1726 -= 20;
							}

							if (var78 == 2) {
								client.field1905 -= 15;
								client.field1726 -= 10;
							}

							if (var78 == 3) {
								client.field1905 += 15;
								client.field1726 -= 10;
							}

							class491 var83 = null;
							class491 var84 = null;
							class491 var85 = null;
							class491 var86 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							class491 var31 = null;
							class491 var32 = null;
							class491 var33 = null;
							class491 var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var83 = var102.method3781();
							int var44;
							if (var83 != null) {
								var23 = var83.field5057;
								var44 = var83.field5056;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var83.field5059;
							}

							var84 = var102.method3782();
							if (null != var84) {
								var24 = var84.field5057;
								var44 = var84.field5056;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var84.field5059;
							}

							var85 = var102.method3816();
							if (null != var85) {
								var25 = var85.field5057;
								var44 = var85.field5056;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var85.field5059;
							}

							var86 = var102.method3784();
							if (var86 != null) {
								var26 = var86.field5057;
								var44 = var86.field5056;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var86.field5059;
							}

							if (var104 != null) {
								var31 = var104.method3781();
								if (var31 != null) {
									var35 = var31.field5057;
									var44 = var31.field5056;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.field5059;
								}

								var32 = var104.method3782();
								if (var32 != null) {
									var36 = var32.field5057;
									var44 = var32.field5056;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.field5059;
								}

								var33 = var104.method3816();
								if (null != var33) {
									var37 = var33.field5057;
									var44 = var33.field5056;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.field5059;
								}

								var34 = var104.method3784();
								if (var34 != null) {
									var38 = var34.field5057;
									var44 = var34.field5056;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.field5059;
								}
							}

							class386 var87 = var102.method3806();
							if (null == var87) {
								var87 = class136.field1339;
							}

							class386 var45;
							if (var104 != null) {
								var45 = var104.method3806();
								if (null == var45) {
									var45 = class136.field1339;
								}
							} else {
								var45 = class136.field1339;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var102.method3780(var0.field976[var78]);
							int var101 = var87.method6901(var46);
							if (null != var104) {
								var47 = var104.method3780(var0.field979[var78]);
								var49 = var45.method6901(var47);
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

							var63 = var0.field977[var78] - client.field1700;
							int var64 = var102.field2153 - var102.field2153 * var63 / var102.field2143;
							int var65 = -var102.field2148 + var63 * var102.field2148 / var102.field2143;
							int var66 = var2 + client.field1905 - (var52 >> 1) + var64;
							int var67 = var65 + (client.field1726 + var3 - 12);
							int var68 = var67;
							int var69 = var67 + var43;
							int var70 = var102.field2158 + var67 + 15;
							int var71 = var70 - var87.field4391;
							int var72 = var70 + var87.field4402;
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
								var73 = var67 + 15 + var104.field2158;
								var74 = var73 - var45.field4391;
								var75 = var45.field4402 + var73;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var102.field2155 >= 0) {
								var74 = (var63 << 8) / (var102.field2143 - var102.field2155);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var83 != null) {
									var83.method8885(var66 + var53 - var27, var67, var74);
								}

								if (null != var85) {
									var85.method8885(var54 + var66 - var29, var67, var74);
								}

								if (var84 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var84.method8885(var66 + var55 - var28 + var75 * var24, var67, var74);
									}
								}

								if (null != var86) {
									var86.method8885(var57 + var66 - var30, var67, var74);
								}

								var87.method6904(var46, var56 + var66, var70, var102.field2141, 0, var74);
								if (var104 != null) {
									if (var31 != null) {
										var31.method8885(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.method8885(var59 + var66 - var41, var67, var74);
									}

									if (null != var32) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method8885(var66 + var60 - var40 + var75 * var36, var67, var74);
										}
									}

									if (var34 != null) {
										var34.method8885(var61 + var66 - var42, var67, var74);
									}

									var45.method6904(var47, var62 + var66, var73, var104.field2141, 0, var74);
								}
							} else {
								if (null != var83) {
									var83.method8866(var66 + var53 - var27, var67);
								}

								if (null != var85) {
									var85.method8866(var54 + var66 - var29, var67);
								}

								if (null != var84) {
									for (var75 = 0; var75 < var50; ++var75) {
										var84.method8866(var55 + var66 - var28 + var75 * var24, var67);
									}
								}

								if (null != var86) {
									var86.method8866(var57 + var66 - var30, var67);
								}

								var87.method6854(var46, var66 + var56, var70, var102.field2141 | -16777216, 0);
								if (var104 != null) {
									if (var31 != null) {
										var31.method8866(var58 + var66 - var39, var67);
									}

									if (null != var33) {
										var33.method8866(var66 + var59 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.method8866(var36 * var75 + (var66 + var60 - var40), var67);
										}
									}

									if (null != var34) {
										var34.method8866(var61 + var66 - var42, var67);
									}

									var45.method6854(var47, var66 + var62, var73, var104.field2141 | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
