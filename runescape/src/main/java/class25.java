public class class25 implements class29 {
	static class77 field131;

	class25() {
	}

	public class50 method410() {
		return new class23();
	}

	static final void method345(class290 var0, int var1, int var2) {
		if (client.field1765 == 0 || client.field1765 == 3) {
			if (!client.field1837 && (class28.field165 == 1 || !class218.field2651 && 4 == class28.field165)) {
				class308 var4 = var0.method5508(true);
				if (null == var4) {
					return;
				}

				int var5 = class28.field166 - var1;
				int var6 = class28.field162 - var2;
				if (var4.method6108(var5, var6)) {
					var5 -= var4.field3679 / 2;
					var6 -= var4.field3680 / 2;
					int var7 = client.field1770 & 2047;
					int var8 = class221.field2667[var7];
					int var9 = class221.field2690[var7];
					int var10 = var8 * var6 + var5 * var9 >> 11;
					int var11 = var6 * var9 - var5 * var8 >> 11;
					int var12 = var10 + class142.field1370.field1012 >> 7;
					int var13 = class142.field1370.field948 - var11 >> 7;
					class284 var14 = class152.method2679(class276.field3242, client.field1748.field1105);
					var14.field3321.method8323(18);
					var14.field3321.method8356(client.field1929.method3567(82) ? (client.field1929.method3567(81) ? 2 : 1) : 0);
					var14.field3321.method8383(var12 + class151.field1447);
					var14.field3321.method8364(class388.field4509 + var13);
					var14.field3321.method8323(var5);
					var14.field3321.method8323(var6);
					var14.field3321.method8310(client.field1770);
					var14.field3321.method8323(57);
					var14.field3321.method8323(0);
					var14.field3321.method8323(0);
					var14.field3321.method8323(89);
					var14.field3321.method8310(class142.field1370.field1012);
					var14.field3321.method8310(class142.field1370.field948);
					var14.field3321.method8323(63);
					client.field1748.method2173(var14);
					client.field1942 = var12;
					client.field1688 = var13;
				}
			}

		}
	}

	static final void method348(boolean var0) {
		for (int var2 = 0; var2 < client.field1744; ++var2) {
			class85 var3 = client.field1934[client.field1900[var2]];
			if (null != var3 && var3.method2043() && var3.field790.field2408 == var0 && var3.field790.method4124()) {
				int var4 = var3.field1012 >> 7;
				int var5 = var3.field948 >> 7;
				if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
					if (1 == var3.field951 && (var3.field1012 & 127) == 64 && 64 == (var3.field948 & 127)) {
						if (client.field1797[var4][var5] == client.field1798) {
							continue;
						}

						client.field1797[var4][var5] = client.field1798;
					}

					long var6 = class40.method601(0, 0, 1, !var3.field790.field2415, client.field1900[var2]);
					var3.field952 = client.field1700;
					class33.field194.method4261(class384.field4486, var3.field1012, var3.field948, class199.method3912(var3.field1012 + (var3.field951 * 64 - 64), var3.field951 * 64 - 64 + var3.field948, class384.field4486), 60 + (var3.field951 * 64 - 64), var3, var3.field962, var6, var3.field949);
				}
			}
		}

	}

	static final void method344(class274 var0) {
		class466 var2 = client.field1748.field1106;
		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		class96 var9;
		if (var0 == class274.field3180) {
			var3 = var2.method8326();
			var4 = var2.method8367();
			var5 = var2.method8480();
			var6 = var2.method8357();
			var7 = (var6 >> 4 & 7) + class173.field1632;
			var8 = class125.field1261 + (var6 & 7);
			if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
				var9 = new class96();
				var9.field937 = var4;
				var9.field929 = var5;
				var9.method2026(var3);
				if (client.field1829[class384.field4486][var7][var8] == null) {
					client.field1829[class384.field4486][var7][var8] = new class355();
				}

				client.field1829[class384.field4486][var7][var8].method6572(var9);
				class363.method6765(var7, var8);
			}

		} else if (class274.field3174 == var0) {
			var3 = var2.method8367();
			var4 = var2.method8326();
			var5 = var2.method8478();
			var6 = (var5 >> 4 & 7) + class173.field1632;
			var7 = class125.field1261 + (var5 & 7);
			var8 = var2.method8367();
			if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
				var6 = 64 + var6 * 128;
				var7 = 64 + var7 * 128;
				class66 var39 = new class66(var8, class384.field4486, var6, var7, class199.method3912(var6, var7, class384.field4486) - var4, var3, client.field1700);
				client.field1821.method6572(var39);
			}

		} else if (var0 == class274.field3178) {
			var3 = var2.method8326();
			var4 = (var3 >> 4 & 7) + class173.field1632;
			var5 = class125.field1261 + (var3 & 7);
			var2.method8368();
			var6 = var2.method8475();
			var2.method8306();
			var7 = var2.method8480();
			var2.method8478();
			var2.method8478();
			var8 = var2.method8328();
			if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
				var9 = new class96();
				var9.field937 = var8;
				var9.field929 = var7;
				var9.method2026(var6);
				if (client.field1829[class384.field4486][var4][var5] == null) {
					client.field1829[class384.field4486][var4][var5] = new class355();
				}

				client.field1829[class384.field4486][var4][var5].method6572(var9);
				class363.method6765(var4, var5);
			}

		} else {
			int var10;
			int var11;
			int var13;
			byte var14;
			byte var15;
			class62 var16;
			int var32;
			int var40;
			int var42;
			int var43;
			if (var0 == class274.field3186) {
				var3 = var2.method8475() * 4;
				var4 = var2.method8326();
				var5 = class173.field1632 + (var4 >> 4 & 7);
				var6 = (var4 & 7) + class125.field1261;
				var7 = var2.method8367();
				var8 = var2.method8367();
				var32 = var2.method8357() * 4;
				var10 = var2.method8475();
				var11 = var2.method8326();
				var40 = var2.method8329();
				var13 = var2.method8367();
				var14 = var2.method8477();
				var15 = var2.method8327();
				var42 = var14 + var5;
				var43 = var15 + var6;
				if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104 && var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104 && var13 != 65535) {
					var5 = 64 + var5 * 128;
					var6 = var6 * 128 + 64;
					var42 = var42 * 128 + 64;
					var43 = var43 * 128 + 64;
					var16 = new class62(var13, class384.field4486, var5, var6, class199.method3912(var5, var6, class384.field4486) - var32, client.field1700 + var7, client.field1700 + var8, var11, var10, var40, var3);
					var16.method1185(var42, var43, class199.method3912(var42, var43, class384.field4486) - var3, var7 + client.field1700);
					client.field1831.method6572(var16);
				}

			} else if (class274.field3172 == var0) {
				var3 = var2.method8478();
				var4 = var3 >> 2;
				var5 = var3 & 3;
				var6 = client.field1761[var4];
				var7 = var2.method8478();
				var8 = class173.field1632 + (var7 >> 4 & 7);
				var32 = (var7 & 7) + class125.field1261;
				var10 = var2.method8478();
				var11 = var2.method8306();
				if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104) {
					class7.method56(class384.field4486, var8, var32, var6, var11, var4, var5, var10, 0, -1);
				}

			} else {
				class355 var33;
				if (var0 == class274.field3184) {
					var3 = var2.method8357();
					var4 = class173.field1632 + (var3 >> 4 & 7);
					var5 = (var3 & 7) + class125.field1261;
					var6 = var2.method8328();
					var7 = var2.method8361();
					if (var4 >= 0 && var5 >= 0 && var4 < 104 && var5 < 104) {
						var33 = client.field1829[class384.field4486][var4][var5];
						if (var33 != null) {
							for (var9 = (class96)var33.method6577(); null != var9; var9 = (class96)var33.method6579()) {
								if (var9.field937 == (var6 & 32767) && var9.field929 == var7) {
									var9.method7951();
									break;
								}
							}

							if (var33.method6577() == null) {
								client.field1829[class384.field4486][var4][var5] = null;
							}

							class363.method6765(var4, var5);
						}
					}

				} else if (class274.field3181 == var0) {
					var3 = var2.method8357();
					var4 = var3 >> 2;
					var5 = var3 & 3;
					var6 = client.field1761[var4];
					var7 = var2.method8357();
					var8 = (var7 >> 4 & 7) + class173.field1632;
					var32 = (var7 & 7) + class125.field1261;
					if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104) {
						class7.method56(class384.field4486, var8, var32, var6, -1, var4, var5, 31, 0, -1);
					}

				} else {
					if (class274.field3173 == var0) {
						var3 = var2.method8326();
						var4 = var2.method8368();
						var5 = var2.method8478();
						var6 = (var5 >> 4 & 7) + class173.field1632;
						var7 = class125.field1261 + (var5 & 7);
						var8 = var2.method8357();
						var32 = var8 >> 4 & 15;
						var10 = var8 & 7;
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							var11 = var32 + 1;
							if (class142.field1370.field973[0] >= var6 - var11 && class142.field1370.field973[0] <= var6 + var11 && class142.field1370.field1021[0] >= var7 - var11 && class142.field1370.field1021[0] <= var11 + var7 && class186.field2040.method1868() != 0 && var10 > 0 && client.field1947 < 50) {
								client.field1948[client.field1947] = var4;
								client.field1949[client.field1947] = var10;
								client.field1977[client.field1947] = var3;
								client.field1757[client.field1947] = null;
								client.field1803[client.field1947] = (var6 << 16) + (var7 << 8) + var32;
								++client.field1947;
							}
						}
					}

					if (class274.field3179 == var0) {
						var3 = var2.method8478();
						var4 = var2.method8306();
						var5 = var2.method8367();
						var6 = var2.method8326() * 4;
						var7 = var2.method8478();
						var8 = (var7 >> 4 & 7) + class173.field1632;
						var32 = class125.field1261 + (var7 & 7);
						var10 = var2.method8326() * 4;
						var11 = var2.method8306();
						var40 = var2.method8478();
						byte var41 = var2.method8477();
						var14 = var2.method8494();
						var43 = var2.method8325();
						var42 = var14 + var8;
						var13 = var41 + var32;
						if (var8 >= 0 && var32 >= 0 && var8 < 104 && var32 < 104 && var42 >= 0 && var13 >= 0 && var42 < 104 && var13 < 104 && var5 != 65535) {
							var8 = 64 + var8 * 128;
							var32 = 64 + var32 * 128;
							var42 = 64 + var42 * 128;
							var13 = var13 * 128 + 64;
							var16 = new class62(var5, class384.field4486, var8, var32, class199.method3912(var8, var32, class384.field4486) - var6, client.field1700 + var11, var4 + client.field1700, var3, var40, var43, var10);
							var16.method1185(var42, var13, class199.method3912(var42, var13, class384.field4486) - var10, client.field1700 + var11);
							client.field1831.method6572(var16);
						}

					} else if (class274.field3183 == var0) {
						var3 = var2.method8367();
						var4 = var2.method8368();
						var5 = var2.method8475();
						var6 = class173.field1632 + (var5 >> 4 & 7);
						var7 = class125.field1261 + (var5 & 7);
						var8 = var2.method8306();
						if (var6 >= 0 && var7 >= 0 && var6 < 104 && var7 < 104) {
							class355 var38 = client.field1829[class384.field4486][var6][var7];
							if (null != var38) {
								for (class96 var34 = (class96)var38.method6577(); var34 != null; var34 = (class96)var38.method6579()) {
									if ((var8 & 32767) == var34.field937 && var4 == var34.field929) {
										var34.field929 = var3;
										break;
									}
								}

								class363.method6765(var6, var7);
							}
						}

					} else {
						if (class274.field3182 == var0) {
							var3 = var2.method8357();
							var4 = var3 >> 2;
							var5 = var3 & 3;
							var6 = client.field1761[var4];
							var7 = var2.method8306();
							var8 = var2.method8367();
							var32 = var2.method8357();
							var10 = class173.field1632 + (var32 >> 4 & 7);
							var11 = class125.field1261 + (var32 & 7);
							byte var12 = var2.method8477();
							var13 = var2.method8306();
							var14 = var2.method8477();
							var15 = var2.method8327();
							byte var35 = var2.method8494();
							int var17 = var2.method8367();
							class88 var18;
							if (var17 == client.field1817) {
								var18 = class142.field1370;
							} else {
								var18 = client.field1816[var17];
							}

							if (null != var18) {
								class196 var19 = class165.method2780(var8);
								int var20;
								int var21;
								if (var5 != 1 && var5 != 3) {
									var20 = var19.field2178;
									var21 = var19.field2179;
								} else {
									var20 = var19.field2179;
									var21 = var19.field2178;
								}

								int var22 = var10 + (var20 >> 1);
								int var23 = (var20 + 1 >> 1) + var10;
								int var24 = (var21 >> 1) + var11;
								int var25 = var11 + (var21 + 1 >> 1);
								int[][] var26 = class84.field765[class384.field4486];
								int var27 = var26[var22][var25] + var26[var22][var24] + var26[var23][var24] + var26[var23][var25] >> 2;
								int var28 = (var20 << 6) + (var10 << 7);
								int var29 = (var11 << 7) + (var21 << 6);
								class216 var30 = var19.method3824(var4, var5, var26, var28, var27, var29);
								if (var30 != null) {
									class7.method56(class384.field4486, var10, var11, var6, -1, 0, 0, 31, var7 + 1, var13 + 1);
									var18.field851 = client.field1700 + var7;
									var18.field835 = var13 + client.field1700;
									var18.field839 = var30;
									var18.field836 = var10 * 128 + var20 * 64;
									var18.field842 = var21 * 64 + var11 * 128;
									var18.field826 = var27;
									byte var31;
									if (var15 > var12) {
										var31 = var15;
										var15 = var12;
										var12 = var31;
									}

									if (var35 > var14) {
										var31 = var35;
										var35 = var14;
										var14 = var31;
									}

									var18.field853 = var10 + var15;
									var18.field837 = var10 + var12;
									var18.field841 = var11 + var35;
									var18.field833 = var11 + var14;
								}
							}
						}

						if (class274.field3185 == var0) {
							var3 = var2.method8478();
							var4 = (var3 >> 4 & 7) + class173.field1632;
							var5 = (var3 & 7) + class125.field1261;
							var6 = var2.method8368();
							var7 = var2.method8357();
							var8 = var7 >> 2;
							var32 = var7 & 3;
							var10 = client.field1761[var8];
							if (var4 >= 0 && var5 >= 0 && var4 < 103 && var5 < 103) {
								if (var10 == 0) {
									class225 var36 = class33.field194.method4174(class384.field4486, var4, var5);
									if (var36 != null) {
										var40 = class215.method4664(var36.field2737);
										if (var8 == 2) {
											var36.field2730 = new class63(var40, 2, var32 + 4, class384.field4486, var4, var5, var6, false, var36.field2730);
											var36.field2736 = new class63(var40, 2, var32 + 1 & 3, class384.field4486, var4, var5, var6, false, var36.field2736);
										} else {
											var36.field2730 = new class63(var40, var8, var32, class384.field4486, var4, var5, var6, false, var36.field2730);
										}
									}
								}

								if (var10 == 1) {
									class210 var45 = class33.field194.method4326(class384.field4486, var4, var5);
									if (var45 != null) {
										var40 = class215.method4664(var45.field2432);
										if (var8 != 4 && var8 != 5) {
											if (var8 == 6) {
												var45.field2439 = new class63(var40, 4, var32 + 4, class384.field4486, var4, var5, var6, false, var45.field2439);
											} else if (var8 == 7) {
												var45.field2439 = new class63(var40, 4, 4 + (var32 + 2 & 3), class384.field4486, var4, var5, var6, false, var45.field2439);
											} else if (var8 == 8) {
												var45.field2439 = new class63(var40, 4, var32 + 4, class384.field4486, var4, var5, var6, false, var45.field2439);
												var45.field2440 = new class63(var40, 4, (var32 + 2 & 3) + 4, class384.field4486, var4, var5, var6, false, var45.field2440);
											}
										} else {
											var45.field2439 = new class63(var40, 4, var32, class384.field4486, var4, var5, var6, false, var45.field2439);
										}
									}
								}

								if (var10 == 2) {
									class224 var46 = class33.field194.method4176(class384.field4486, var4, var5);
									if (var8 == 11) {
										var8 = 10;
									}

									if (var46 != null) {
										var46.field2714 = new class63(class215.method4664(var46.field2724), var8, var32, class384.field4486, var4, var5, var6, false, var46.field2714);
									}
								}

								if (var10 == 3) {
									class227 var47 = class33.field194.method4251(class384.field4486, var4, var5);
									if (null != var47) {
										var47.field2744 = new class63(class215.method4664(var47.field2745), 22, var32, class384.field4486, var4, var5, var6, false, var47.field2744);
									}
								}
							}

						} else if (class274.field3175 == var0) {
							var3 = var2.method8367();
							var2.method8328();
							var4 = var2.method8357();
							var5 = class173.field1632 + (var4 >> 4 & 7);
							var6 = class125.field1261 + (var4 & 7);
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
								class355 var37 = client.field1829[class384.field4486][var5][var6];
								if (var37 != null) {
									for (class96 var44 = (class96)var37.method6577(); var44 != null; var44 = (class96)var37.method6579()) {
										if ((var3 & 32767) == var44.field937) {
											var44.method7951();
											break;
										}
									}

									if (var37.method6577() == null) {
										client.field1829[class384.field4486][var5][var6] = null;
									}

									class363.method6765(var5, var6);
								}
							}

						} else if (var0 == class274.field3176) {
							var3 = var2.method8368();
							var4 = var2.method8478();
							var5 = (var4 >> 4 & 7) + class173.field1632;
							var6 = (var4 & 7) + class125.field1261;
							var7 = var2.method8475();
							if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
								var33 = client.field1829[class384.field4486][var5][var6];
								if (null != var33) {
									for (var9 = (class96)var33.method6577(); null != var9; var9 = (class96)var33.method6579()) {
										if (var9.field937 == (var3 & 32767)) {
											var9.method2026(var7);
											break;
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
