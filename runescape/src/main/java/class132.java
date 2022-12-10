public class class132 extends class139 {
	static class491[] field1306;
	int field1307;
	// $FF: synthetic field
	final class134 this$0;

	class132(class134 var1) {
		this.this$0 = var1;
		this.field1307 = -1;
	}

	void method2518(class467 var1) {
		this.field1307 = var1.method8328();
		var1.method8326();
		if (var1.method8326() != 255) {
			--var1.field4915;
			var1.method8492();
		}

	}

	void method2519(class170 var1) {
		var1.method2888(this.field1307);
	}

	static int method2465(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	static int method2463(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.CHAT_GETFILTER_PUBLIC) {
			class69.field579[++class94.field920 - 1] = client.field1924;
			return 1;
		} else if (var0 == CS2Opcodes.CHAT_SETFILTER) {
			class94.field920 -= 3;
			client.field1924 = class69.field579[class94.field920];
			class93.field911 = class218.method4526(class69.field579[class94.field920 + 1]);
			if (class93.field911 == null) {
				class93.field911 = class487.field5037;
			}

			client.field1925 = class69.field579[class94.field920 + 2];
			class284 var12 = class152.method2679(class276.field3230, client.field1748.field1105);
			var12.field3321.method8323(client.field1924);
			var12.field3321.method8323(class93.field911.field5040);
			var12.field3321.method8323(client.field1925);
			client.field1748.method2173(var12);
			return 1;
		} else {
			String var4;
			int var5;
			int var6;
			class284 var7;
			if (var0 == CS2Opcodes.CHAT_SENDABUSEREPORT) {
				var4 = class69.field580[--class69.field581];
				class94.field920 -= 2;
				var5 = class69.field579[class94.field920];
				var6 = class69.field579[1 + class94.field920];
				var7 = class152.method2679(class276.field3232, client.field1748.field1105);
				var7.field3321.method8323(class467.method190(var4) + 2);
				var7.field3321.method8316(var4);
				var7.field3321.method8323(var5 - 1);
				var7.field3321.method8323(var6);
				client.field1748.method2173(var7);
				return 1;
			} else {
				int var8;
				class74 var9;
				if (var0 == CS2Opcodes.CHAT_GETHISTORY_BYTYPEANDLINE_OLD) {
					class94.field920 -= 2;
					var8 = class69.field579[class94.field920];
					var5 = class69.field579[class94.field920 + 1];
					var9 = class105.method2688(var8, var5);
					if (null != var9) {
						class69.field579[++class94.field920 - 1] = var9.field671;
						class69.field579[++class94.field920 - 1] = var9.field679;
						class69.field580[++class69.field581 - 1] = null != var9.field673 ? var9.field673 : "";
						class69.field580[++class69.field581 - 1] = var9.field675 != null ? var9.field675 : "";
						class69.field580[++class69.field581 - 1] = var9.field676 != null ? var9.field676 : "";
						class69.field579[++class94.field920 - 1] = var9.method1474() ? 1 : (var9.method1477() ? 2 : 0);
					} else {
						class69.field579[++class94.field920 - 1] = -1;
						class69.field579[++class94.field920 - 1] = 0;
						class69.field580[++class69.field581 - 1] = "";
						class69.field580[++class69.field581 - 1] = "";
						class69.field580[++class69.field581 - 1] = "";
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else {
					class74 var10;
					if (var0 == CS2Opcodes.CHAT_GETHISTORY_BYUID_OLD) {
						var8 = class69.field579[--class94.field920];
						var10 = class105.method1222(var8);
						if (null != var10) {
							class69.field579[++class94.field920 - 1] = var10.field670;
							class69.field579[++class94.field920 - 1] = var10.field679;
							class69.field580[++class69.field581 - 1] = var10.field673 != null ? var10.field673 : "";
							class69.field580[++class69.field581 - 1] = var10.field675 != null ? var10.field675 : "";
							class69.field580[++class69.field581 - 1] = var10.field676 != null ? var10.field676 : "";
							class69.field579[++class94.field920 - 1] = var10.method1474() ? 1 : (var10.method1477() ? 2 : 0);
						} else {
							class69.field579[++class94.field920 - 1] = -1;
							class69.field579[++class94.field920 - 1] = 0;
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field580[++class69.field581 - 1] = "";
							class69.field579[++class94.field920 - 1] = 0;
						}

						return 1;
					} else if (var0 == CS2Opcodes.CHAT_GETFILTER_PRIVATE) {
						if (null == class93.field911) {
							class69.field579[++class94.field920 - 1] = -1;
						} else {
							class69.field579[++class94.field920 - 1] = class93.field911.field5040;
						}

						return 1;
					} else {
						class284 var13;
						if (var0 == CS2Opcodes.CHAT_SENDPUBLIC) {
							var4 = class69.field580[--class69.field581];
							var5 = class69.field579[--class94.field920];
							var13 = class468.method8579(var5, var4, class178.field1654, -1);
							client.field1748.method2173(var13);
							return 1;
						} else if (var0 == CS2Opcodes.CHAT_SENDPRIVATE) {
							class69.field581 -= 2;
							var4 = class69.field580[class69.field581];
							String var14 = class69.field580[class69.field581 + 1];
							var13 = class152.method2679(class276.field3263, client.field1748.field1105);
							var13.field3321.method8310(0);
							int var11 = var13.field3321.field4915;
							var13.field3321.method8316(var4);
							class402.method7515(var13.field3321, var14);
							var13.field3321.method8322(var13.field3321.field4915 - var11);
							client.field1748.method2173(var13);
							return 1;
						} else if (var0 == CS2Opcodes.CHAT_SENDCLAN) {
							var4 = class69.field580[--class69.field581];
							class94.field920 -= 2;
							var5 = class69.field579[class94.field920];
							var6 = class69.field579[class94.field920 + 1];
							var7 = class468.method8579(var5, var4, class178.field1654, var6);
							client.field1748.method2173(var7);
							return 1;
						} else if (var0 != CS2Opcodes.CHAT_PLAYERNAME) {
							if (var0 == CS2Opcodes.CHAT_GETFILTER_TRADE) {
								class69.field579[++class94.field920 - 1] = client.field1925;
								return 1;
							} else if (var0 == CS2Opcodes.CHAT_GETHISTORYLENGTH) {
								var8 = class69.field579[--class94.field920];
								class69.field579[++class94.field920 - 1] = class147.method2641(var8);
								return 1;
							} else if (var0 == CS2Opcodes.CHAT_GETNEXTUID) {
								var8 = class69.field579[--class94.field920];
								class69.field579[++class94.field920 - 1] = class315.method6171(var8);
								return 1;
							} else if (var0 == CS2Opcodes.CHAT_GETPREVUID) {
								var8 = class69.field579[--class94.field920];
								class69.field579[++class94.field920 - 1] = class63.method1200(var8);
								return 1;
							} else if (var0 == CS2Opcodes.DOCHEAT) {
								var4 = class69.field580[--class69.field581];
								class139.method2526(var4);
								return 1;
							} else if (var0 == CS2Opcodes.CHAT_SETMESSAGEFILTER) {
								client.field1926 = class69.field580[--class69.field581].toLowerCase().trim();
								return 1;
							} else if (var0 == CS2Opcodes.CHAT_GETMESSAGEFILTER) {
								class69.field580[++class69.field581 - 1] = client.field1926;
								return 1;
							} else if (var0 == CS2Opcodes.WRITECONSOLE) {
								var4 = class69.field580[--class69.field581];
								System.out.println(var4);
								return 1;
							} else if (var0 == CS2Opcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
								class94.field920 -= 2;
								var8 = class69.field579[class94.field920];
								var5 = class69.field579[class94.field920 + 1];
								var9 = class105.method2688(var8, var5);
								if (var9 != null) {
									class69.field579[++class94.field920 - 1] = var9.field671;
									class69.field579[++class94.field920 - 1] = var9.field679;
									class69.field580[++class69.field581 - 1] = null != var9.field673 ? var9.field673 : "";
									class69.field580[++class69.field581 - 1] = var9.field675 != null ? var9.field675 : "";
									class69.field580[++class69.field581 - 1] = var9.field676 != null ? var9.field676 : "";
									class69.field579[++class94.field920 - 1] = var9.method1474() ? 1 : (var9.method1477() ? 2 : 0);
									class69.field580[++class69.field581 - 1] = "";
									class69.field579[++class94.field920 - 1] = 0;
								} else {
									class69.field579[++class94.field920 - 1] = -1;
									class69.field579[++class94.field920 - 1] = 0;
									class69.field580[++class69.field581 - 1] = "";
									class69.field580[++class69.field581 - 1] = "";
									class69.field580[++class69.field581 - 1] = "";
									class69.field579[++class94.field920 - 1] = 0;
									class69.field580[++class69.field581 - 1] = "";
									class69.field579[++class94.field920 - 1] = 0;
								}

								return 1;
							} else if (var0 == CS2Opcodes.CHAT_GETHISTORY_BYUID) {
								var8 = class69.field579[--class94.field920];
								var10 = class105.method1222(var8);
								if (var10 != null) {
									class69.field579[++class94.field920 - 1] = var10.field670;
									class69.field579[++class94.field920 - 1] = var10.field679;
									class69.field580[++class69.field581 - 1] = var10.field673 != null ? var10.field673 : "";
									class69.field580[++class69.field581 - 1] = null != var10.field675 ? var10.field675 : "";
									class69.field580[++class69.field581 - 1] = var10.field676 != null ? var10.field676 : "";
									class69.field579[++class94.field920 - 1] = var10.method1474() ? 1 : (var10.method1477() ? 2 : 0);
									class69.field580[++class69.field581 - 1] = "";
									class69.field579[++class94.field920 - 1] = 0;
								} else {
									class69.field579[++class94.field920 - 1] = -1;
									class69.field579[++class94.field920 - 1] = 0;
									class69.field580[++class69.field581 - 1] = "";
									class69.field580[++class69.field581 - 1] = "";
									class69.field580[++class69.field581 - 1] = "";
									class69.field579[++class94.field920 - 1] = 0;
									class69.field580[++class69.field581 - 1] = "";
									class69.field579[++class94.field920 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (null != class142.field1370 && class142.field1370.field840 != null) {
								var4 = class142.field1370.field840.method8771();
							} else {
								var4 = "";
							}

							class69.field580[++class69.field581 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}

	static final void method2460(class290[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			class290 var10 = var0[var9];
			if (var10 != null && var1 == var10.field3418 && (var10.method5641() || class182.method3010(var10) != 0 || client.field1876 == var10)) {
				if (var10.field3398) {
					if (client.method1138(var10)) {
						continue;
					}
				} else if (var10.field3536 == 0 && var10 != class242.field2895 && client.method1138(var10)) {
					continue;
				}

				if (var10.field3536 == 11) {
					if (var10.method5624(class172.field1625)) {
						if (var10.method5515()) {
							class53.method1040(var10);
							class164.method2766(var10.field3541, var10, true);
						}

						if (null != var10.field3528) {
							class80 var27 = new class80();
							var27.field733 = var10;
							var27.field735 = var10.field3528;
							client.field1764.method6572(var27);
						}
					}
				} else if (var10.field3536 == 12 && var10.method5585()) {
					class53.method1040(var10);
				}

				int var11 = var10.field3412 + var6;
				int var12 = var7 + var10.field3413;
				int var13;
				int var14;
				int var15;
				int var16;
				int var19;
				int var28;
				if (2 == var10.field3536) {
					var13 = var2;
					var14 = var3;
					var15 = var4;
					var16 = var5;
				} else {
					int var17;
					if (var10.field3536 == 9) {
						var17 = var11;
						var28 = var12;
						var19 = var10.field3414 + var11;
						int var20 = var12 + var10.field3474;
						if (var19 < var11) {
							var17 = var19;
							var19 = var11;
						}

						if (var20 < var12) {
							var28 = var20;
							var20 = var12;
						}

						++var19;
						++var20;
						var13 = var17 > var2 ? var17 : var2;
						var14 = var28 > var3 ? var28 : var3;
						var15 = var19 < var4 ? var19 : var4;
						var16 = var20 < var5 ? var20 : var5;
					} else {
						var17 = var10.field3414 + var11;
						var28 = var12 + var10.field3474;
						var13 = var11 > var2 ? var11 : var2;
						var14 = var12 > var3 ? var12 : var3;
						var15 = var17 < var4 ? var17 : var4;
						var16 = var28 < var5 ? var28 : var5;
					}
				}

				if (var10 == client.field1875) {
					client.field1883 = true;
					client.field1701 = var11;
					client.field1885 = var12;
				}

				boolean var35 = false;
				if (var10.field3479) {
					switch(client.field1973) {
					case 0:
						var35 = true;
					case 1:
					default:
						break;
					case 2:
						if (client.field1865 == var10.field3492 >>> 16) {
							var35 = true;
						}
						break;
					case 3:
						if (client.field1865 == var10.field3492) {
							var35 = true;
						}
					}
				}

				if (var35 || !var10.field3398 || var13 < var15 && var14 < var16) {
					if (var10.field3398) {
						class80 var18;
						if (var10.field3551) {
							if (class28.field158 >= var13 && class28.field153 >= var14 && class28.field158 < var15 && class28.field153 < var16) {
								for (var18 = (class80)client.field1764.method6577(); null != var18; var18 = (class80)client.field1764.method6579()) {
									if (var18.field732) {
										var18.method7951();
										var18.field733.field3542 = false;
									}
								}

								class276.method5315();
								if (0 == class94.field912) {
									client.field1875 = null;
									client.field1876 = null;
								}

								if (!client.field1837) {
									client.method6843();
								}
							}
						} else if (var10.field3552 && class28.field158 >= var13 && class28.field153 >= var14 && class28.field158 < var15 && class28.field153 < var16) {
							for (var18 = (class80)client.field1764.method6577(); null != var18; var18 = (class80)client.field1764.method6579()) {
								if (var18.field732 && var18.field733.field3513 == var18.field735) {
									var18.method7951();
								}
							}
						}
					}

					var28 = class28.field158;
					var19 = class28.field153;
					if (class28.field165 != 0) {
						var28 = class28.field166;
						var19 = class28.field162;
					}

					boolean var36 = var28 >= var13 && var19 >= var14 && var28 < var15 && var19 < var16;
					if (var10.field3500 == 1337) {
						if (!client.field1699 && !client.field1837 && var36) {
							class19.method251(var28, var19, var13, var14);
						}
					} else if (var10.field3500 == 1338) {
						class25.method345(var10, var11, var12);
					} else {
						if (1400 == var10.field3500) {
							class166.field1548.method7676(class28.field158, class28.field153, var36, var11, var12, var10.field3414, var10.field3474);
						}

						if (!client.field1837 && var36) {
							if (1400 == var10.field3500) {
								class166.field1548.method7726(var11, var12, var10.field3414, var10.field3474, var28, var19);
							} else {
								class283.method5367(var10, var28 - var11, var19 - var12);
							}
						}

						boolean var22;
						int var24;
						if (var35) {
							for (int var29 = 0; var29 < var10.field3480.length; ++var29) {
								var22 = false;
								boolean var23 = false;
								if (!var22 && null != var10.field3480[var29]) {
									for (var24 = 0; var24 < var10.field3480[var29].length; ++var24) {
										boolean var25 = false;
										if (var10.field3550 != null) {
											var25 = client.field1929.method3567(var10.field3480[var29][var24]);
										}

										if (class267.method5270(var10.field3480[var29][var24]) || var25) {
											var22 = true;
											if (var10.field3550 != null && var10.field3550[var29] > client.field1700) {
												break;
											}

											byte var26 = var10.field3481[var29][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !client.field1929.method3567(86) && !client.field1929.method3567(82) && !client.field1929.method3567(81)) && (0 == (var26 & 2) || client.field1929.method3567(86)) && (0 == (var26 & 1) || client.field1929.method3567(82)) && ((var26 & 4) == 0 || client.field1929.method3567(81))) {
												var23 = true;
												break;
											}
										}
									}
								}

								if (var23) {
									if (var29 < 10) {
										class219.method4528(var29 + 1, var10.field3492, var10.field3400, var10.field3404, "");
									} else if (var29 == 10) {
										class290.method5644();
										class44.method865(var10.field3492, var10.field3400, class292.method2150(class182.method3010(var10)), var10.field3404);
										client.field1860 = class95.method2023(var10);
										if (client.field1860 == null) {
											client.field1860 = class321.field3756;
										}

										client.field1979 = var10.field3399 + class79.method2039(16777215);
									}

									var24 = var10.field3488[var29];
									if (var10.field3550 == null) {
										var10.field3550 = new int[var10.field3480.length];
									}

									if (var10.field3483 == null) {
										var10.field3483 = new int[var10.field3480.length];
									}

									if (var24 != 0) {
										if (0 == var10.field3550[var29]) {
											var10.field3550[var29] = var10.field3483[var29] + var24 + client.field1700;
										} else {
											var10.field3550[var29] = var24 + client.field1700;
										}
									} else {
										var10.field3550[var29] = Integer.MAX_VALUE;
									}
								}

								if (!var22 && null != var10.field3550) {
									var10.field3550[var29] = 0;
								}
							}
						}

						if (var10.field3398) {
							if (class28.field158 >= var13 && class28.field153 >= var14 && class28.field158 < var15 && class28.field153 < var16) {
								var36 = true;
							} else {
								var36 = false;
							}

							boolean var39 = false;
							if ((1 == class28.field157 || !class218.field2651 && 4 == class28.field157) && var36) {
								var39 = true;
							}

							var22 = false;
							if ((1 == class28.field165 || !class218.field2651 && class28.field165 == 4) && class28.field166 >= var13 && class28.field162 >= var14 && class28.field166 < var15 && class28.field162 < var16) {
								var22 = true;
							}

							if (var22) {
								class12.method154(var10, class28.field166 - var11, class28.field162 - var12);
							}

							if (var10.method5568()) {
								if (var22) {
									client.field1909.method6572(new class202(0, class28.field158 - var11, class28.field153 - var12, var10));
								}

								if (var39) {
									client.field1909.method6572(new class202(1, class28.field158 - var11, class28.field153 - var12, var10));
								}
							}

							if (var10.field3500 == 1400) {
								class166.field1548.method7677(var28, var19, var36 & var39, var36 & var22);
							}

							if (null != client.field1875 && client.field1875 != var10 && var36 && class152.method2680(class182.method3010(var10))) {
								client.field1879 = var10;
							}

							if (var10 == client.field1876) {
								client.field1927 = true;
								client.field1881 = var11;
								client.field1795 = var12;
							}

							if (var10.field3484) {
								class80 var30;
								if (var36 && client.field1796 != 0 && var10.field3513 != null) {
									var30 = new class80();
									var30.field732 = true;
									var30.field733 = var10;
									var30.field738 = client.field1796;
									var30.field735 = var10.field3513;
									client.field1764.method6572(var30);
								}

								if (null != client.field1875 || class385.field4502 != null || client.field1837) {
									var22 = false;
									var39 = false;
									var36 = false;
								}

								if (!var10.field3468 && var22) {
									var10.field3468 = true;
									if (null != var10.field3426) {
										var30 = new class80();
										var30.field732 = true;
										var30.field733 = var10;
										var30.field731 = class28.field166 - var11;
										var30.field738 = class28.field162 - var12;
										var30.field735 = var10.field3426;
										client.field1764.method6572(var30);
									}
								}

								if (var10.field3468 && var39 && var10.field3494 != null) {
									var30 = new class80();
									var30.field732 = true;
									var30.field733 = var10;
									var30.field731 = class28.field158 - var11;
									var30.field738 = class28.field153 - var12;
									var30.field735 = var10.field3494;
									client.field1764.method6572(var30);
								}

								if (var10.field3468 && !var39) {
									var10.field3468 = false;
									if (null != var10.field3435) {
										var30 = new class80();
										var30.field732 = true;
										var30.field733 = var10;
										var30.field731 = class28.field158 - var11;
										var30.field738 = class28.field153 - var12;
										var30.field735 = var10.field3435;
										client.field1908.method6572(var30);
									}
								}

								if (var39 && null != var10.field3496) {
									var30 = new class80();
									var30.field732 = true;
									var30.field733 = var10;
									var30.field731 = class28.field158 - var11;
									var30.field738 = class28.field153 - var12;
									var30.field735 = var10.field3496;
									client.field1764.method6572(var30);
								}

								if (!var10.field3542 && var36) {
									var10.field3542 = true;
									if (null != var10.field3493) {
										var30 = new class80();
										var30.field732 = true;
										var30.field733 = var10;
										var30.field731 = class28.field158 - var11;
										var30.field738 = class28.field153 - var12;
										var30.field735 = var10.field3493;
										client.field1764.method6572(var30);
									}
								}

								if (var10.field3542 && var36 && null != var10.field3543) {
									var30 = new class80();
									var30.field732 = true;
									var30.field733 = var10;
									var30.field731 = class28.field158 - var11;
									var30.field738 = class28.field153 - var12;
									var30.field735 = var10.field3543;
									client.field1764.method6572(var30);
								}

								if (var10.field3542 && !var36) {
									var10.field3542 = false;
									if (null != var10.field3499) {
										var30 = new class80();
										var30.field732 = true;
										var30.field733 = var10;
										var30.field731 = class28.field158 - var11;
										var30.field738 = class28.field153 - var12;
										var30.field735 = var10.field3499;
										client.field1908.method6572(var30);
									}
								}

								if (null != var10.field3510) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3510;
									client.field1907.method6572(var30);
								}

								class80 var34;
								int var37;
								int var38;
								if (var10.field3442 != null && client.field1889 > var10.field3503) {
									if (var10.field3505 != null && client.field1889 - var10.field3503 <= 32) {
										label833:
										for (var37 = var10.field3503; var37 < client.field1889; ++var37) {
											var24 = client.field1888[var37 & 31];

											for (var38 = 0; var38 < var10.field3505.length; ++var38) {
												if (var10.field3505[var38] == var24) {
													var34 = new class80();
													var34.field733 = var10;
													var34.field735 = var10.field3442;
													client.field1764.method6572(var34);
													break label833;
												}
											}
										}
									} else {
										var30 = new class80();
										var30.field733 = var10;
										var30.field735 = var10.field3442;
										client.field1764.method6572(var30);
									}

									var10.field3503 = client.field1889;
								}

								if (var10.field3391 != null && client.field1891 > var10.field3526) {
									if (var10.field3444 != null && client.field1891 - var10.field3526 <= 32) {
										label809:
										for (var37 = var10.field3526; var37 < client.field1891; ++var37) {
											var24 = client.field1890[var37 & 31];

											for (var38 = 0; var38 < var10.field3444.length; ++var38) {
												if (var10.field3444[var38] == var24) {
													var34 = new class80();
													var34.field733 = var10;
													var34.field735 = var10.field3391;
													client.field1764.method6572(var34);
													break label809;
												}
											}
										}
									} else {
										var30 = new class80();
										var30.field733 = var10;
										var30.field735 = var10.field3391;
										client.field1764.method6572(var30);
									}

									var10.field3526 = client.field1891;
								}

								if (var10.field3508 != null && client.field1893 > var10.field3495) {
									if (null != var10.field3401 && client.field1893 - var10.field3495 <= 32) {
										label785:
										for (var37 = var10.field3495; var37 < client.field1893; ++var37) {
											var24 = client.field1818[var37 & 31];

											for (var38 = 0; var38 < var10.field3401.length; ++var38) {
												if (var10.field3401[var38] == var24) {
													var34 = new class80();
													var34.field733 = var10;
													var34.field735 = var10.field3508;
													client.field1764.method6572(var34);
													break label785;
												}
											}
										}
									} else {
										var30 = new class80();
										var30.field733 = var10;
										var30.field735 = var10.field3508;
										client.field1764.method6572(var30);
									}

									var10.field3495 = client.field1893;
								}

								if (client.field1896 > var10.field3430 && null != var10.field3514) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3514;
									client.field1764.method6572(var30);
								}

								if (client.field1897 > var10.field3430 && var10.field3518 != null) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3518;
									client.field1764.method6572(var30);
								}

								if (client.field1792 > var10.field3430 && null != var10.field3470) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3470;
									client.field1764.method6572(var30);
								}

								if (client.field1899 > var10.field3430 && var10.field3411 != null) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3411;
									client.field1764.method6572(var30);
								}

								if (client.field1695 > var10.field3430 && var10.field3521 != null) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3521;
									client.field1764.method6572(var30);
								}

								if (client.field1959 > var10.field3430 && null != var10.field3380) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3380;
									client.field1764.method6572(var30);
								}

								if (client.field1902 > var10.field3430 && null != var10.field3425) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3425;
									client.field1764.method6572(var30);
								}

								if (client.field1903 > var10.field3430 && null != var10.field3522) {
									var30 = new class80();
									var30.field733 = var10;
									var30.field735 = var10.field3522;
									client.field1764.method6572(var30);
								}

								var10.field3430 = client.field1887;
								if (null != var10.field3515) {
									for (var37 = 0; var37 < client.field1892; ++var37) {
										class80 var31 = new class80();
										var31.field733 = var10;
										var31.field734 = client.field1933[var37];
										var31.field739 = client.field1956[var37];
										var31.field735 = var10.field3515;
										client.field1764.method6572(var31);
									}
								}

								class80 var32;
								int[] var40;
								if (var10.field3516 != null) {
									var40 = client.field1929.method3569();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var32 = new class80();
										var32.field733 = var10;
										var32.field734 = var40[var24];
										var32.field735 = var10.field3516;
										client.field1764.method6572(var32);
									}
								}

								if (null != var10.field3511) {
									var40 = client.field1929.method3570();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var32 = new class80();
										var32.field733 = var10;
										var32.field734 = var40[var24];
										var32.field735 = var10.field3511;
										client.field1764.method6572(var32);
									}
								}
							}
						}

						if (!var10.field3398) {
							if (client.field1875 != null || class385.field4502 != null || client.field1837) {
								continue;
							}

							if ((var10.field3532 >= 0 || 0 != var10.field3406) && class28.field158 >= var13 && class28.field153 >= var14 && class28.field158 < var15 && class28.field153 < var16) {
								if (var10.field3532 >= 0) {
									class242.field2895 = var0[var10.field3532];
								} else {
									class242.field2895 = var10;
								}
							}

							if (8 == var10.field3536 && class28.field158 >= var13 && class28.field153 >= var14 && class28.field158 < var15 && class28.field153 < var16) {
								class379.field4462 = var10;
							}

							if (var10.field3423 > var10.field3474) {
								class49.method937(var10, var10.field3414 + var11, var12, var10.field3474, var10.field3423, class28.field158, class28.field153);
							}
						}

						if (0 == var10.field3536) {
							method2460(var0, var10.field3492, var13, var14, var15, var16, var11 - var10.field3427, var12 - var10.field3421);
							if (null != var10.field3541) {
								method2460(var10.field3541, var10.field3492, var13, var14, var15, var16, var11 - var10.field3427, var12 - var10.field3421);
							}

							class102 var21 = (class102)client.field1863.method8177((long)var10.field3492);
							if (null != var21) {
								if (0 == var21.field1052 && class28.field158 >= var13 && class28.field153 >= var14 && class28.field158 < var15 && class28.field153 < var16 && !client.field1837) {
									for (class80 var33 = (class80)client.field1764.method6577(); var33 != null; var33 = (class80)client.field1764.method6579()) {
										if (var33.field732) {
											var33.method7951();
											var33.field733.field3542 = false;
										}
									}

									if (0 == class94.field912) {
										client.field1875 = null;
										client.field1876 = null;
									}

									if (!client.field1837) {
										client.method6843();
									}
								}

								client.method7107(var21.field1057, var13, var14, var15, var16, var11, var12);
							}
						}
					}
				}
			}
		}

	}
}
