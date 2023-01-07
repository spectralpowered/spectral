import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "eb"
)
public class class409 extends class410 {
	@ObfInfo(
		owner = "eb",
		name = "il",
		desc = "[Lrx;"
	)
	static class266[] field3416;
	@ObfInfo(
		owner = "eb",
		name = "h",
		desc = "I"
	)
	int field3417;
	// $FF: synthetic field
	@ObfInfo(
		owner = "eb",
		name = "this$0",
		desc = "Led;"
	)
	final class302 this$0;

	@ObfInfo(
		owner = "eb",
		name = "<init>",
		desc = "(Led;)V"
	)
	class409(class302 var1) {
		this.this$0 = var1;
		this.field3417 = -1;
	}

	@ObfInfo(
		owner = "eb",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method2007(class127 var1) {
		this.field3417 = var1.method549();
		var1.method547();
		if (var1.method547() != 255) {
			--var1.field1070;
			var1.method598();
		}

	}

	@ObfInfo(
		owner = "eb",
		name = "e",
		desc = "(Lfn;I)V"
	)
	void method2008(class57 var1) {
		var1.method269(this.field3417);
	}

	@ObfInfo(
		owner = "eb",
		name = "s",
		desc = "(Ljava/lang/String;I)I"
	)
	static int method2006(String var0) {
		if (var0.equals("centre")) {
			return 1;
		} else {
			return !var0.equals("bottom") && !var0.equals("right") ? 0 : 2;
		}
	}

	@ObfInfo(
		owner = "eb",
		name = "an",
		desc = "(ILbm;ZB)I"
	)
	static int method2005(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.CHAT_GETFILTER_PUBLIC) {
			class386.field3248[++class161.field1227 - 1] = client.field455;
			return 1;
		} else if (var0 == ScriptOpcodes.CHAT_SETFILTER) {
			class161.field1227 -= 3;
			client.field455 = class386.field3248[class161.field1227];
			class397.field3353 = class151.method702(class386.field3248[class161.field1227 + 1]);
			if (class397.field3353 == null) {
				class397.field3353 = class352.field2894;
			}

			client.field456 = class386.field3248[class161.field1227 + 2];
			class299 var12 = class480.method2370(class356.field2968, client.field279.field4042);
			var12.field2403.method544(client.field455);
			var12.field2403.method544(class397.field3353.field2896);
			var12.field2403.method544(client.field456);
			client.field279.method2389(var12);
			return 1;
		} else {
			String var4;
			int var5;
			int var6;
			class299 var7;
			if (var0 == ScriptOpcodes.CHAT_SENDABUSEREPORT) {
				var4 = class386.field3249[--class386.field3250];
				class161.field1227 -= 2;
				var5 = class386.field3248[class161.field1227];
				var6 = class386.field3248[1 + class161.field1227];
				var7 = class480.method2370(class356.field2970, client.field279.field4042);
				var7.field2403.method544(class319.method1614(var4) + 2);
				var7.field2403.method538(var4, (byte)8);
				var7.field2403.method544(var5 - 1);
				var7.field2403.method544(var6);
				client.field279.method2389(var7);
				return 1;
			} else {
				int var8;
				class152 var9;
				if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE_OLD) {
					class161.field1227 -= 2;
					var8 = class386.field3248[class161.field1227];
					var5 = class386.field3248[class161.field1227 + 1];
					var9 = class357.method1784(var8, var5);
					if (null != var9) {
						class386.field3248[++class161.field1227 - 1] = var9.field1184;
						class386.field3248[++class161.field1227 - 1] = var9.field1189;
						class386.field3249[++class386.field3250 - 1] = null != var9.field1186 ? var9.field1186 : "";
						class386.field3249[++class386.field3250 - 1] = var9.field1187 != null ? var9.field1187 : "";
						class386.field3249[++class386.field3250 - 1] = var9.field1188 != null ? var9.field1188 : "";
						class386.field3248[++class161.field1227 - 1] = var9.method703() ? 1 : (var9.method706() ? 2 : 0);
					} else {
						class386.field3248[++class161.field1227 - 1] = -1;
						class386.field3248[++class161.field1227 - 1] = 0;
						class386.field3249[++class386.field3250 - 1] = "";
						class386.field3249[++class386.field3250 - 1] = "";
						class386.field3249[++class386.field3250 - 1] = "";
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				} else {
					class152 var10;
					if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID_OLD) {
						var8 = class386.field3248[--class161.field1227];
						var10 = class461.method2272(var8);
						if (null != var10) {
							class386.field3248[++class161.field1227 - 1] = var10.field1183;
							class386.field3248[++class161.field1227 - 1] = var10.field1189;
							class386.field3249[++class386.field3250 - 1] = var10.field1186 != null ? var10.field1186 : "";
							class386.field3249[++class386.field3250 - 1] = var10.field1187 != null ? var10.field1187 : "";
							class386.field3249[++class386.field3250 - 1] = var10.field1188 != null ? var10.field1188 : "";
							class386.field3248[++class161.field1227 - 1] = var10.method703() ? 1 : (var10.method706() ? 2 : 0);
						} else {
							class386.field3248[++class161.field1227 - 1] = -1;
							class386.field3248[++class161.field1227 - 1] = 0;
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3248[++class161.field1227 - 1] = 0;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.CHAT_GETFILTER_PRIVATE) {
						if (null == class397.field3353) {
							class386.field3248[++class161.field1227 - 1] = -1;
						} else {
							class386.field3248[++class161.field1227 - 1] = class397.field3353.field2896;
						}

						return 1;
					} else {
						class299 var13;
						if (var0 == ScriptOpcodes.CHAT_SENDPUBLIC) {
							var4 = class386.field3249[--class386.field3250];
							var5 = class386.field3248[--class161.field1227];
							var13 = class489.method2401(var5, var4, class235.field1995, -1);
							client.field279.method2389(var13);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDPRIVATE) {
							class386.field3250 -= 2;
							var4 = class386.field3249[class386.field3250];
							String var14 = class386.field3249[class386.field3250 + 1];
							var13 = class480.method2370(class356.field3001, client.field279.field4042);
							var13.field2403.method533(0);
							int var11 = var13.field2403.field1070;
							var13.field2403.method538(var4, (byte)127);
							class157.method727(var13.field2403, var14);
							var13.field2403.method543(var13.field2403.field1070 - var11);
							client.field279.method2389(var13);
							return 1;
						} else if (var0 == ScriptOpcodes.CHAT_SENDCLAN) {
							var4 = class386.field3249[--class386.field3250];
							class161.field1227 -= 2;
							var5 = class386.field3248[class161.field1227];
							var6 = class386.field3248[class161.field1227 + 1];
							var7 = class489.method2401(var5, var4, class235.field1995, var6);
							client.field279.method2389(var7);
							return 1;
						} else if (var0 != ScriptOpcodes.CHAT_PLAYERNAME) {
							if (var0 == ScriptOpcodes.CHAT_GETFILTER_TRADE) {
								class386.field3248[++class161.field1227 - 1] = client.field456;
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORYLENGTH) {
								var8 = class386.field3248[--class161.field1227];
								class386.field3248[++class161.field1227 - 1] = class15.method73(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETNEXTUID) {
								var8 = class386.field3248[--class161.field1227];
								class386.field3248[++class161.field1227 - 1] = class55.method266(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETPREVUID) {
								var8 = class386.field3248[--class161.field1227];
								class386.field3248[++class161.field1227 - 1] = class89.method381(var8);
								return 1;
							} else if (var0 == ScriptOpcodes.DOCHEAT) {
								var4 = class386.field3249[--class386.field3250];
								class410.method2009(var4);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_SETMESSAGEFILTER) {
								client.field457 = class386.field3249[--class386.field3250].toLowerCase().trim();
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETMESSAGEFILTER) {
								class386.field3249[++class386.field3250 - 1] = client.field457;
								return 1;
							} else if (var0 == ScriptOpcodes.WRITECONSOLE) {
								var4 = class386.field3249[--class386.field3250];
								System.out.println(var4);
								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYTYPEANDLINE) {
								class161.field1227 -= 2;
								var8 = class386.field3248[class161.field1227];
								var5 = class386.field3248[class161.field1227 + 1];
								var9 = class357.method1784(var8, var5);
								if (var9 != null) {
									class386.field3248[++class161.field1227 - 1] = var9.field1184;
									class386.field3248[++class161.field1227 - 1] = var9.field1189;
									class386.field3249[++class386.field3250 - 1] = null != var9.field1186 ? var9.field1186 : "";
									class386.field3249[++class386.field3250 - 1] = var9.field1187 != null ? var9.field1187 : "";
									class386.field3249[++class386.field3250 - 1] = var9.field1188 != null ? var9.field1188 : "";
									class386.field3248[++class161.field1227 - 1] = var9.method703() ? 1 : (var9.method706() ? 2 : 0);
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3248[++class161.field1227 - 1] = 0;
								} else {
									class386.field3248[++class161.field1227 - 1] = -1;
									class386.field3248[++class161.field1227 - 1] = 0;
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3248[++class161.field1227 - 1] = 0;
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3248[++class161.field1227 - 1] = 0;
								}

								return 1;
							} else if (var0 == ScriptOpcodes.CHAT_GETHISTORY_BYUID) {
								var8 = class386.field3248[--class161.field1227];
								var10 = class461.method2272(var8);
								if (var10 != null) {
									class386.field3248[++class161.field1227 - 1] = var10.field1183;
									class386.field3248[++class161.field1227 - 1] = var10.field1189;
									class386.field3249[++class386.field3250 - 1] = var10.field1186 != null ? var10.field1186 : "";
									class386.field3249[++class386.field3250 - 1] = null != var10.field1187 ? var10.field1187 : "";
									class386.field3249[++class386.field3250 - 1] = var10.field1188 != null ? var10.field1188 : "";
									class386.field3248[++class161.field1227 - 1] = var10.method703() ? 1 : (var10.method706() ? 2 : 0);
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3248[++class161.field1227 - 1] = 0;
								} else {
									class386.field3248[++class161.field1227 - 1] = -1;
									class386.field3248[++class161.field1227 - 1] = 0;
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3248[++class161.field1227 - 1] = 0;
									class386.field3249[++class386.field3250 - 1] = "";
									class386.field3248[++class161.field1227 - 1] = 0;
								}

								return 1;
							} else {
								return 2;
							}
						} else {
							if (null != class113.field846 && class113.field846.field3207 != null) {
								var4 = class113.field846.field3207.method1101();
							} else {
								var4 = "";
							}

							class386.field3249[++class386.field3250 - 1] = var4;
							return 1;
						}
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "eb",
		name = "ll",
		desc = "([Lkd;IIIIIIII)V"
	)
	static final void method2004(class120[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var9 = 0; var9 < var0.length; ++var9) {
			class120 var10 = var0[var9];
			if (var10 != null && var1 == var10.field912 && (var10.method510() || class203.method892(var10) != 0 || client.field407 == var10)) {
				if (var10.field893) {
					if (class9.method47(var10)) {
						continue;
					}
				} else if (var10.field1026 == 0 && var10 != class393.field3284 && class9.method47(var10)) {
					continue;
				}

				if (var10.field1026 == 11) {
					if (var10.method506(class300.field2410)) {
						if (var10.method488()) {
							class184.method836(var10);
							class378.method1862(var10.field1031, var10, true);
						}

						if (null != var10.field1019) {
							class488 var27 = new class488();
							var27.field4067 = var10;
							var27.field4069 = var10.field1019;
							client.field295.method642(var27);
						}
					}
				} else if (var10.field1026 == 12 && var10.method503()) {
					class184.method836(var10);
				}

				int var11 = var10.field906 + var6;
				int var12 = var7 + var10.field907;
				int var13;
				int var14;
				int var15;
				int var16;
				int var19;
				int var28;
				if (2 == var10.field1026) {
					var13 = var2;
					var14 = var3;
					var15 = var4;
					var16 = var5;
				} else {
					int var17;
					if (var10.field1026 == 9) {
						var17 = var11;
						var28 = var12;
						var19 = var10.field908 + var11;
						int var20 = var12 + var10.field967;
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
						var17 = var10.field908 + var11;
						var28 = var12 + var10.field967;
						var13 = var11 > var2 ? var11 : var2;
						var14 = var12 > var3 ? var12 : var3;
						var15 = var17 < var4 ? var17 : var4;
						var16 = var28 < var5 ? var28 : var5;
					}
				}

				if (var10 == client.field406) {
					client.field414 = true;
					client.field232 = var11;
					client.field416 = var12;
				}

				boolean var35 = false;
				if (var10.field972) {
					switch(client.field504) {
					case 0:
						var35 = true;
					case 1:
					default:
						break;
					case 2:
						if (client.field396 == var10.field985 >>> 16) {
							var35 = true;
						}
						break;
					case 3:
						if (client.field396 == var10.field985) {
							var35 = true;
						}
					}
				}

				if (var35 || !var10.field893 || var13 < var15 && var14 < var16) {
					if (var10.field893) {
						class488 var18;
						if (var10.field1041) {
							if (class466.field3863 >= var13 && class466.field3858 >= var14 && class466.field3863 < var15 && class466.field3858 < var16) {
								for (var18 = (class488)client.field295.method646(); null != var18; var18 = (class488)client.field295.method648()) {
									if (var18.field4066) {
										var18.method637();
										var18.field4067.field1032 = false;
									}
								}

								class356.method1776();
								if (0 == class161.field1220) {
									client.field406 = null;
									client.field407 = null;
								}

								if (!client.field368) {
									class17.method86();
								}
							}
						} else if (var10.field1042 && class466.field3863 >= var13 && class466.field3858 >= var14 && class466.field3863 < var15 && class466.field3858 < var16) {
							for (var18 = (class488)client.field295.method646(); null != var18; var18 = (class488)client.field295.method648()) {
								if (var18.field4066 && var18.field4067.field1004 == var18.field4069) {
									var18.method637();
								}
							}
						}
					}

					var28 = class466.field3863;
					var19 = class466.field3858;
					if (class466.field3869 != 0) {
						var28 = class466.field3870;
						var19 = class466.field3867;
					}

					boolean var36 = var28 >= var13 && var19 >= var14 && var28 < var15 && var19 < var16;
					if (var10.field993 == 1337) {
						if (!client.field230 && !client.field368 && var36) {
							class391.method1915(var28, var19, var13, var14);
						}
					} else if (var10.field993 == 1338) {
						class297.method1441(var10, var11, var12);
					} else {
						if (1400 == var10.field993) {
							class164.field1249.method1281(class466.field3863, class466.field3858, var36, var11, var12, var10.field908, var10.field967);
						}

						if (!client.field368 && var36) {
							if (1400 == var10.field993) {
								class164.field1249.method1319(var11, var12, var10.field908, var10.field967, var28, var19);
							} else {
								class424.method2068(var10, var28 - var11, var19 - var12);
							}
						}

						boolean var22;
						int var24;
						if (var35) {
							for (int var29 = 0; var29 < var10.field973.length; ++var29) {
								var22 = false;
								boolean var23 = false;
								if (!var22 && null != var10.field973[var29]) {
									for (var24 = 0; var24 < var10.field973[var29].length; ++var24) {
										boolean var25 = false;
										if (var10.field1040 != null) {
											var25 = client.field460.method2132(var10.field973[var29][var24]);
										}

										if (class228.method993(var10.field973[var29][var24]) || var25) {
											var22 = true;
											if (var10.field1040 != null && var10.field1040[var29] > client.field231) {
												break;
											}

											byte var26 = var10.field974[var29][var24];
											if (var26 == 0 || ((var26 & 8) == 0 || !client.field460.method2132(86) && !client.field460.method2132(82) && !client.field460.method2132(81)) && (0 == (var26 & 2) || client.field460.method2132(86)) && (0 == (var26 & 1) || client.field460.method2132(82)) && ((var26 & 4) == 0 || client.field460.method2132(81))) {
												var23 = true;
												break;
											}
										}
									}
								}

								if (var23) {
									if (var29 < 10) {
										class119.method473(var29 + 1, var10.field985, var10.field895, var10.field898, "");
									} else if (var29 == 10) {
										class120.method512();
										class128.method608(var10.field985, var10.field895, class486.method2379(class203.method892(var10)), var10.field898);
										client.field391 = class193.method868(var10);
										if (client.field391 == null) {
											client.field391 = class177.field1325;
										}

										client.field510 = var10.field894 + class238.method1032(16777215);
									}

									var24 = var10.field981[var29];
									if (var10.field1040 == null) {
										var10.field1040 = new int[var10.field973.length];
									}

									if (var10.field976 == null) {
										var10.field976 = new int[var10.field973.length];
									}

									if (var24 != 0) {
										if (0 == var10.field1040[var29]) {
											var10.field1040[var29] = var10.field976[var29] + var24 + client.field231;
										} else {
											var10.field1040[var29] = var24 + client.field231;
										}
									} else {
										var10.field1040[var29] = Integer.MAX_VALUE;
									}
								}

								if (!var22 && null != var10.field1040) {
									var10.field1040[var29] = 0;
								}
							}
						}

						if (var10.field893) {
							if (class466.field3863 >= var13 && class466.field3858 >= var14 && class466.field3863 < var15 && class466.field3858 < var16) {
								var36 = true;
							} else {
								var36 = false;
							}

							boolean var39 = false;
							if ((1 == class466.field3862 || !class151.field1180 && 4 == class466.field3862) && var36) {
								var39 = true;
							}

							var22 = false;
							if ((1 == class466.field3869 || !class151.field1180 && class466.field3869 == 4) && class466.field3870 >= var13 && class466.field3867 >= var14 && class466.field3870 < var15 && class466.field3867 < var16) {
								var22 = true;
							}

							if (var22) {
								class362.method1800(var10, class466.field3870 - var11, class466.field3867 - var12);
							}

							if (var10.method501()) {
								if (var22) {
									client.field440.method642(new class70(0, class466.field3863 - var11, class466.field3858 - var12, var10));
								}

								if (var39) {
									client.field440.method642(new class70(1, class466.field3863 - var11, class466.field3858 - var12, var10));
								}
							}

							if (var10.field993 == 1400) {
								class164.field1249.method1282(var28, var19, var36 & var39, var36 & var22);
							}

							if (null != client.field406 && client.field406 != var10 && var36 && class480.method2371(class203.method892(var10))) {
								client.field410 = var10;
							}

							if (var10 == client.field407) {
								client.field458 = true;
								client.field412 = var11;
								client.field326 = var12;
							}

							if (var10.field977) {
								class488 var30;
								if (var36 && client.field327 != 0 && var10.field1004 != null) {
									var30 = new class488();
									var30.field4066 = true;
									var30.field4067 = var10;
									var30.field4071 = client.field327;
									var30.field4069 = var10.field1004;
									client.field295.method642(var30);
								}

								if (null != client.field406 || class321.field2562 != null || client.field368) {
									var22 = false;
									var39 = false;
									var36 = false;
								}

								if (!var10.field961 && var22) {
									var10.field961 = true;
									if (null != var10.field919) {
										var30 = new class488();
										var30.field4066 = true;
										var30.field4067 = var10;
										var30.field4065 = class466.field3870 - var11;
										var30.field4071 = class466.field3867 - var12;
										var30.field4069 = var10.field919;
										client.field295.method642(var30);
									}
								}

								if (var10.field961 && var39 && var10.field987 != null) {
									var30 = new class488();
									var30.field4066 = true;
									var30.field4067 = var10;
									var30.field4065 = class466.field3863 - var11;
									var30.field4071 = class466.field3858 - var12;
									var30.field4069 = var10.field987;
									client.field295.method642(var30);
								}

								if (var10.field961 && !var39) {
									var10.field961 = false;
									if (null != var10.field928) {
										var30 = new class488();
										var30.field4066 = true;
										var30.field4067 = var10;
										var30.field4065 = class466.field3863 - var11;
										var30.field4071 = class466.field3858 - var12;
										var30.field4069 = var10.field928;
										client.field439.method642(var30);
									}
								}

								if (var39 && null != var10.field989) {
									var30 = new class488();
									var30.field4066 = true;
									var30.field4067 = var10;
									var30.field4065 = class466.field3863 - var11;
									var30.field4071 = class466.field3858 - var12;
									var30.field4069 = var10.field989;
									client.field295.method642(var30);
								}

								if (!var10.field1032 && var36) {
									var10.field1032 = true;
									if (null != var10.field986) {
										var30 = new class488();
										var30.field4066 = true;
										var30.field4067 = var10;
										var30.field4065 = class466.field3863 - var11;
										var30.field4071 = class466.field3858 - var12;
										var30.field4069 = var10.field986;
										client.field295.method642(var30);
									}
								}

								if (var10.field1032 && var36 && null != var10.field1033) {
									var30 = new class488();
									var30.field4066 = true;
									var30.field4067 = var10;
									var30.field4065 = class466.field3863 - var11;
									var30.field4071 = class466.field3858 - var12;
									var30.field4069 = var10.field1033;
									client.field295.method642(var30);
								}

								if (var10.field1032 && !var36) {
									var10.field1032 = false;
									if (null != var10.field992) {
										var30 = new class488();
										var30.field4066 = true;
										var30.field4067 = var10;
										var30.field4065 = class466.field3863 - var11;
										var30.field4071 = class466.field3858 - var12;
										var30.field4069 = var10.field992;
										client.field439.method642(var30);
									}
								}

								if (null != var10.field1001) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field1001;
									client.field438.method642(var30);
								}

								class488 var34;
								int var37;
								int var38;
								if (var10.field935 != null && client.field420 > var10.field996) {
									if (var10.field998 != null && client.field420 - var10.field996 <= 32) {
										label652:
										for (var37 = var10.field996; var37 < client.field420; ++var37) {
											var24 = client.field419[var37 & 31];

											for (var38 = 0; var38 < var10.field998.length; ++var38) {
												if (var10.field998[var38] == var24) {
													var34 = new class488();
													var34.field4067 = var10;
													var34.field4069 = var10.field935;
													client.field295.method642(var34);
													break label652;
												}
											}
										}
									} else {
										var30 = new class488();
										var30.field4067 = var10;
										var30.field4069 = var10.field935;
										client.field295.method642(var30);
									}

									var10.field996 = client.field420;
								}

								if (var10.field886 != null && client.field422 > var10.field1017) {
									if (var10.field937 != null && client.field422 - var10.field1017 <= 32) {
										label628:
										for (var37 = var10.field1017; var37 < client.field422; ++var37) {
											var24 = client.field421[var37 & 31];

											for (var38 = 0; var38 < var10.field937.length; ++var38) {
												if (var10.field937[var38] == var24) {
													var34 = new class488();
													var34.field4067 = var10;
													var34.field4069 = var10.field886;
													client.field295.method642(var34);
													break label628;
												}
											}
										}
									} else {
										var30 = new class488();
										var30.field4067 = var10;
										var30.field4069 = var10.field886;
										client.field295.method642(var30);
									}

									var10.field1017 = client.field422;
								}

								if (var10.field999 != null && client.field424 > var10.field988) {
									if (null != var10.field896 && client.field424 - var10.field988 <= 32) {
										label604:
										for (var37 = var10.field988; var37 < client.field424; ++var37) {
											var24 = client.field349[var37 & 31];

											for (var38 = 0; var38 < var10.field896.length; ++var38) {
												if (var10.field896[var38] == var24) {
													var34 = new class488();
													var34.field4067 = var10;
													var34.field4069 = var10.field999;
													client.field295.method642(var34);
													break label604;
												}
											}
										}
									} else {
										var30 = new class488();
										var30.field4067 = var10;
										var30.field4069 = var10.field999;
										client.field295.method642(var30);
									}

									var10.field988 = client.field424;
								}

								if (client.field427 > var10.field923 && null != var10.field1005) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field1005;
									client.field295.method642(var30);
								}

								if (client.field428 > var10.field923 && var10.field1009 != null) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field1009;
									client.field295.method642(var30);
								}

								if (client.field323 > var10.field923 && null != var10.field963) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field963;
									client.field295.method642(var30);
								}

								if (client.field430 > var10.field923 && var10.field905 != null) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field905;
									client.field295.method642(var30);
								}

								if (client.field226 > var10.field923 && var10.field1012 != null) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field1012;
									client.field295.method642(var30);
								}

								if (client.field490 > var10.field923 && null != var10.field880) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field880;
									client.field295.method642(var30);
								}

								if (client.field433 > var10.field923 && null != var10.field918) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field918;
									client.field295.method642(var30);
								}

								if (client.field434 > var10.field923 && null != var10.field1013) {
									var30 = new class488();
									var30.field4067 = var10;
									var30.field4069 = var10.field1013;
									client.field295.method642(var30);
								}

								var10.field923 = client.field418;
								if (null != var10.field1006) {
									for (var37 = 0; var37 < client.field423; ++var37) {
										class488 var31 = new class488();
										var31.field4067 = var10;
										var31.field4068 = client.field464[var37];
										var31.field4072 = client.field487[var37];
										var31.field4069 = var10.field1006;
										client.field295.method642(var31);
									}
								}

								class488 var32;
								int[] var40;
								if (var10.field1007 != null) {
									var40 = client.field460.method2133();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var32 = new class488();
										var32.field4067 = var10;
										var32.field4068 = var40[var24];
										var32.field4069 = var10.field1007;
										client.field295.method642(var32);
									}
								}

								if (null != var10.field1002) {
									var40 = client.field460.method2134();

									for (var24 = 0; var24 < var40.length; ++var24) {
										var32 = new class488();
										var32.field4067 = var10;
										var32.field4068 = var40[var24];
										var32.field4069 = var10.field1002;
										client.field295.method642(var32);
									}
								}
							}
						}

						if (!var10.field893) {
							if (client.field406 != null || class321.field2562 != null || client.field368) {
								continue;
							}

							if ((var10.field1023 >= 0 || 0 != var10.field900) && class466.field3863 >= var13 && class466.field3858 >= var14 && class466.field3863 < var15 && class466.field3858 < var16) {
								if (var10.field1023 >= 0) {
									class393.field3284 = var0[var10.field1023];
								} else {
									class393.field3284 = var10;
								}
							}

							if (8 == var10.field1026 && class466.field3863 >= var13 && class466.field3858 >= var14 && class466.field3863 < var15 && class466.field3858 < var16) {
								class219.field1895 = var10;
							}

							if (var10.field916 > var10.field967) {
								class492.method2434(var10, var10.field908 + var11, var12, var10.field967, var10.field916, class466.field3863, class466.field3858);
							}
						}

						if (0 == var10.field1026) {
							method2004(var0, var10.field985, var13, var14, var15, var16, var11 - var10.field920, var12 - var10.field914);
							if (null != var10.field1031) {
								method2004(var10.field1031, var10.field985, var13, var14, var15, var16, var11 - var10.field920, var12 - var10.field914);
							}

							class415 var21 = (class415)client.field394.method791((long)var10.field985);
							if (null != var21) {
								if (0 == var21.field3424 && class466.field3863 >= var13 && class466.field3858 >= var14 && class466.field3863 < var15 && class466.field3858 < var16 && !client.field368) {
									for (class488 var33 = (class488)client.field295.method646(); var33 != null; var33 = (class488)client.field295.method648()) {
										if (var33.field4066) {
											var33.method637();
											var33.field4067.field1032 = false;
										}
									}

									if (0 == class161.field1220) {
										client.field406 = null;
										client.field407 = null;
									}

									if (!client.field368) {
										class17.method86();
									}
								}

								class56.method267(var21.field3426, var13, var14, var15, var16, var11, var12);
							}
						}
					}
				}
			}
		}

	}
}
