import io.spectralpowered.ObfInfo;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

@ObfInfo(
	name = "fx"
)
public class class67 {
	@ObfInfo(
		owner = "fx",
		name = "v",
		desc = "[S"
	)
	public short[] field625;
	@ObfInfo(
		owner = "fx",
		name = "x",
		desc = "[S"
	)
	public short[] field626;

	@ObfInfo(
		owner = "fx",
		name = "<init>",
		desc = "(I)V"
	)
	public class67(int var1) {
		class263 var2 = class423.method2062(var1);
		if (var2.method1211()) {
			this.field625 = new short[var2.field2148.length];
			System.arraycopy(var2.field2148, 0, this.field625, 0, this.field625.length);
		}

		if (var2.method1209()) {
			this.field626 = new short[var2.field2192.length];
			System.arraycopy(var2.field2192, 0, this.field626, 0, this.field626.length);
		}

	}

	@ObfInfo(
		owner = "fx",
		name = "h",
		desc = "(II)I"
	)
	public static int method300(int var0) {
		class457 var3 = (class457)class457.field3779.method394((long)var0);
		class457 var2;
		if (null != var3) {
			var2 = var3;
		} else {
			byte[] var8 = class457.field3778.method1365(14, var0);
			var3 = new class457();
			if (null != var8) {
				var3.method2256(new class127(var8));
			}

			class457.field3779.method396(var3, (long)var0);
			var2 = var3;
		}

		int var4 = var2.field3780;
		int var5 = var2.field3781;
		int var6 = var2.field3782;
		int var7 = class291.field2375[var6 - var5];
		return class291.field2373[var4] >> var5 & var7;
	}

	@ObfInfo(
		owner = "fx",
		name = "e",
		desc = "(II)Lkd;"
	)
	public static class120 method299(int var0) {
		int var2 = var0 >> 16;
		int var3 = var0 & 65535;
		if (null == class329.field2600[var2] || class329.field2600[var2][var3] == null) {
			boolean var4 = class268.method1275(var2);
			if (!var4) {
				return null;
			}
		}

		return class329.field2600[var2][var3];
	}

	@ObfInfo(
		owner = "fx",
		name = "f",
		desc = "(Lan;Lnv;B)V"
	)
	static void method301(class214 var0, class58 var1) {
		int var5;
		int var82;
		int var83;
		if (class359.field3076) {
			class432 var81 = client.field460;
			class432 var4 = var81;

			while (true) {
				if (!var4.method2136()) {
					if (1 != class466.field3869 && (class151.field1180 || 4 != class466.field3869)) {
						break;
					}

					var5 = 280 + class359.field3052;
					if (class466.field3870 >= var5 && class466.field3870 <= var5 + 14 && class466.field3867 >= 4 && class466.field3867 <= 18) {
						class374.method1845(0, 0);
						break;
					}

					if (class466.field3870 >= var5 + 15 && class466.field3870 <= var5 + 80 && class466.field3867 >= 4 && class466.field3867 <= 18) {
						class374.method1845(0, 1);
						break;
					}

					var82 = class359.field3052 + 390;
					if (class466.field3870 >= var82 && class466.field3870 <= var82 + 14 && class466.field3867 >= 4 && class466.field3867 <= 18) {
						class374.method1845(1, 0);
						break;
					}

					if (class466.field3870 >= var82 + 15 && class466.field3870 <= var82 + 80 && class466.field3867 >= 4 && class466.field3867 <= 18) {
						class374.method1845(1, 1);
						break;
					}

					var83 = class359.field3052 + 500;
					if (class466.field3870 >= var83 && class466.field3870 <= var83 + 14 && class466.field3867 >= 4 && class466.field3867 <= 18) {
						class374.method1845(2, 0);
						break;
					}

					if (class466.field3870 >= var83 + 15 && class466.field3870 <= var83 + 80 && class466.field3867 >= 4 && class466.field3867 <= 18) {
						class374.method1845(2, 1);
						break;
					}

					int var84 = class359.field3052 + 610;
					if (class466.field3870 >= var84 && class466.field3870 <= var84 + 14 && class466.field3867 >= 4 && class466.field3867 <= 18) {
						class374.method1845(3, 0);
						break;
					}

					if (class466.field3870 >= var84 + 15 && class466.field3870 <= var84 + 80 && class466.field3867 >= 4 && class466.field3867 <= 18) {
						class374.method1845(3, 1);
						break;
					}

					if (class466.field3870 >= 708 + class359.field3052 && class466.field3867 >= 4 && class466.field3870 <= 50 + class359.field3052 + 708 && class466.field3867 <= 20) {
						class359.field3076 = false;
						class287.field2366.method1229(class359.field3052, 0);
						class374.field3173.method1229(class359.field3052 + 382, 0);
						class359.field3054.method1745(382 + class359.field3052 - class359.field3054.field2758 / 2, 18);
						break;
					}

					if (class359.field3077 != -1) {
						class2 var85 = class2.field12[class359.field3077];
						class61.method282(var85);
						class359.field3076 = false;
						class287.field2366.method1229(class359.field3052, 0);
						class374.field3173.method1229(class359.field3052 + 382, 0);
						class359.field3054.method1745(class359.field3052 + 382 - class359.field3054.field2758 / 2, 18);
					} else {
						if (class359.field3078 > 0 && null != class48.field566 && class466.field3870 >= 0 && class466.field3870 <= class48.field566.field2758 && class466.field3867 >= class476.field4003 / 2 - 50 && class466.field3867 <= 50 + class476.field4003 / 2) {
							--class359.field3078;
						}

						if (class359.field3078 < class359.field3079 && class261.field2115 != null && class466.field3870 >= class427.field3529 - class261.field2115.field2758 - 5 && class466.field3870 <= class427.field3529 && class466.field3867 >= class476.field4003 / 2 - 50 && class466.field3867 <= 50 + class476.field4003 / 2) {
							++class359.field3078;
						}
					}
					break;
				}

				if (var4.field3590 == 13) {
					class359.field3076 = false;
					class287.field2366.method1229(class359.field3052, 0);
					class374.field3173.method1229(382 + class359.field3052, 0);
					class359.field3054.method1745(class359.field3052 + 382 - class359.field3054.field2758 / 2, 18);
					break;
				}

				if (var4.field3590 == 96) {
					if (class359.field3078 > 0 && class48.field566 != null) {
						--class359.field3078;
					}
				} else if (var4.field3590 == 97 && class359.field3078 < class359.field3079 && class261.field2115 != null) {
					++class359.field3078;
				}
			}

		} else {
			if ((1 == class466.field3869 || !class151.field1180 && 4 == class466.field3869) && class466.field3870 >= 765 + class359.field3052 - 50 && class466.field3867 >= 453) {
				class50.field574.method2223(!class50.field574.method2213());
				if (!class50.field574.method2213()) {
					class38 var3 = class317.field2494;
					int var36 = var3.method1356("scape main");
					var5 = var3.method1359(var36, "");
					class74.method323(var3, var36, var5, 255, false);
				} else {
					class403.method1988();
				}
			}

			if (client.field229 != 5) {
				if (-1L == class359.field3068) {
					class359.field3068 = class152.method711() + 1000L;
				}

				long var37 = class152.method711();
				if (class473.method2339() && class359.field3081 == -1L) {
					class359.field3081 = var37;
					if (class359.field3081 > class359.field3068) {
						class359.field3068 = class359.field3081;
					}
				}

				if (client.field229 == 10 || 11 == client.field229) {
					if (class476.field3997 == class235.field1995) {
						if (class466.field3869 == 1 || !class151.field1180 && 4 == class466.field3869) {
							var5 = class359.field3052 + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (class466.field3870 >= var5 && class466.field3870 <= var5 + var7 && class466.field3867 >= var6 && class466.field3867 <= var6 + var8) {
								class303.method1465();
								return;
							}
						}

						if (null != class338.field2702) {
							class303.method1465();
						}
					}

					var5 = class466.field3869;
					var82 = class466.field3870;
					var83 = class466.field3867;
					if (var5 == 0) {
						var82 = class466.field3863;
						var83 = class466.field3858;
					}

					if (!class151.field1180 && var5 == 4) {
						var5 = 1;
					}

					class432 var39 = client.field460;
					class432 var9 = var39;
					int var87;
					short var88;
					if (class359.field3075 == 0) {
						boolean var96 = false;

						while (var9.method2136()) {
							if (84 == var9.field3590) {
								var96 = true;
							}
						}

						var87 = class140.field1136 - 80;
						var88 = 291;
						if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
							class10.method62(class241.method1045("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var87 = 80 + class140.field1136;
						if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20 || var96) {
							if (0 != (client.field308 & 33554432)) {
								class359.field3062 = "";
								class359.field3051 = class177.field1543;
								class359.field3064 = class177.field1561;
								class359.field3084 = class177.field1631;
								class286.method1419(1);
								class492.method2437();
							} else if ((client.field308 & 4) != 0) {
								if ((client.field308 & 1024) != 0) {
									class359.field3051 = class177.field1332;
									class359.field3064 = class177.field1558;
									class359.field3084 = class177.field1559;
								} else {
									class359.field3051 = class177.field1551;
									class359.field3064 = class177.field1541;
									class359.field3084 = class177.field1553;
								}

								class359.field3062 = class177.field1550;
								class286.method1419(1);
								class492.method2437();
							} else if ((client.field308 & 1024) != 0) {
								class359.field3051 = class177.field1554;
								class359.field3064 = class177.field1555;
								class359.field3084 = class177.field1527;
								class359.field3062 = class177.field1550;
								class286.method1419(1);
								class492.method2437();
							} else {
								class426.method2080(false);
							}
						}
					} else {
						int var10;
						short var11;
						if (class359.field3075 == 1) {
							while (true) {
								if (!var9.method2136()) {
									var10 = class140.field1136 - 80;
									var11 = 321;
									if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
										class426.method2080(false);
									}

									var10 = class140.field1136 + 80;
									if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
										class286.method1419(0);
									}
									break;
								}

								if (84 == var9.field3590) {
									class426.method2080(false);
								} else if (13 == var9.field3590) {
									class286.method1419(0);
								}
							}
						} else {
							int var14;
							int var15;
							short var86;
							if (2 == class359.field3075) {
								var86 = 201;
								var10 = var86 + 52;
								if (var5 == 1 && var83 >= var10 - 12 && var83 < var10 + 2) {
									class359.field3073 = 0;
								}

								var10 += 15;
								if (var5 == 1 && var83 >= var10 - 12 && var83 < var10 + 2) {
									class359.field3073 = 1;
								}

								var10 += 15;
								var86 = 361;
								if (class191.field1712 != null) {
									var87 = class191.field1712.field3185 / 2;
									if (var5 == 1 && var82 >= class191.field1712.field3184 - var87 && var82 <= var87 + class191.field1712.field3184 && var83 >= var86 - 15 && var83 < var86) {
										switch(class359.field3059) {
										case 1:
											class300.method1452(class177.field1599, class177.field1600, class177.field1595);
											class286.method1419(5);
											return;
										case 2:
											class10.method62("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var87 = class140.field1136 - 80;
								var88 = 321;
								if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
									class359.field3071 = class359.field3071.trim();
									if (class359.field3071.length() == 0) {
										class300.method1452(class177.field1443, class177.field1412, class177.field1471);
										return;
									}

									if (class359.field3067.length() == 0) {
										class300.method1452(class177.field1470, class177.field1405, class177.field1448);
										return;
									}

									class300.method1452(class177.field1565, class177.field1420, class177.field1567);
									class415.method2014(false);
									class261.method1113(20);
									return;
								}

								var87 = 180 + class359.field3072 + 80;
								if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
									class286.method1419(0);
									class359.field3071 = "";
									class359.field3067 = "";
									class398.field3358 = 0;
									class60.field603 = "";
									class359.field3061 = true;
								}

								var87 = class140.field1136 + -117;
								var88 = 277;
								class359.field3070 = var82 >= var87 && var82 < var87 + class223.field1919 && var83 >= var88 && var83 < var88 + class349.field2890;
								if (var5 == 1 && class359.field3070) {
									client.field268 = !client.field268;
									if (!client.field268 && class50.field574.method2215() != null) {
										class50.field574.method2214((String)null);
									}
								}

								var87 = 24 + class140.field1136;
								var88 = 277;
								class359.field3085 = var82 >= var87 && var82 < var87 + class223.field1919 && var83 >= var88 && var83 < class349.field2890 + var88;
								if (var5 == 1 && class359.field3085) {
									class50.field574.method2225(!class50.field574.method2203());
									if (!class50.field574.method2203()) {
										class359.field3071 = "";
										class50.field574.method2214((String)null);
										class492.method2437();
									}
								}

								while (true) {
									Transferable var113;
									do {
										while (true) {
											label1521:
											do {
												while (true) {
													while (var9.method2136()) {
														if (var9.field3590 != 13) {
															if (class359.field3073 != 0) {
																continue label1521;
															}

															char var92 = var9.field3577;

															for (var14 = 0; var14 < class359.field3074.length() && var92 != class359.field3074.charAt(var14); ++var14) {
															}

															if (85 == var9.field3590 && class359.field3071.length() > 0) {
																class359.field3071 = class359.field3071.substring(0, class359.field3071.length() - 1);
															}

															if (var9.field3590 == 84 || var9.field3590 == 80) {
																class359.field3073 = 1;
															}

															if (class440.method2180(var9.field3577) && class359.field3071.length() < 320) {
																class359.field3071 = class359.field3071 + var9.field3577;
															}
														} else {
															class286.method1419(0);
															class359.field3071 = "";
															class359.field3067 = "";
															class398.field3358 = 0;
															class60.field603 = "";
															class359.field3061 = true;
														}
													}

													return;
												}
											} while(1 != class359.field3073);

											if (var9.field3590 == 85 && class359.field3067.length() > 0) {
												class359.field3067 = class359.field3067.substring(0, class359.field3067.length() - 1);
											} else if (84 == var9.field3590 || 80 == var9.field3590) {
												class359.field3073 = 0;
												if (84 == var9.field3590) {
													class359.field3071 = class359.field3071.trim();
													if (class359.field3071.length() == 0) {
														class300.method1452(class177.field1443, class177.field1412, class177.field1471);
														return;
													}

													if (class359.field3067.length() == 0) {
														class300.method1452(class177.field1470, class177.field1405, class177.field1448);
														return;
													}

													class300.method1452(class177.field1565, class177.field1420, class177.field1567);
													class415.method2014(false);
													class261.method1113(20);
													return;
												}
											}

											if ((var9.method2132(82) || var9.method2132(87)) && 67 == var9.field3590) {
												Clipboard var112 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var113 = var112.getContents(class309.field2461);
												var15 = 20 - class359.field3067.length();
												break;
											}

											if (class156.method720(var9.field3577) && class440.method2180(var9.field3577) && class359.field3067.length() < 20) {
												class359.field3067 = class359.field3067 + var9.field3577;
											}
										}
									} while(var15 <= 0);

									try {
										String var94 = (String)var113.getTransferData(DataFlavor.stringFlavor);
										int var100 = Math.min(var15, var94.length());

										for (int var95 = 0; var95 < var100; ++var95) {
											if (!class156.method720(var94.charAt(var95)) || !class440.method2180(var94.charAt(var95))) {
												class286.method1419(3);
												return;
											}
										}

										class359.field3067 = class359.field3067 + var94.substring(0, var100);
									} catch (UnsupportedFlavorException var79) {
									} catch (IOException var80) {
									}
								}
							} else if (class359.field3075 == 3) {
								var10 = 180 + class359.field3072;
								var11 = 276;
								if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
									class301.method1454(false);
								}

								var10 = class359.field3072 + 180;
								var11 = 326;
								if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
									class300.method1452(class177.field1599, class177.field1600, class177.field1595);
									class286.method1419(5);
									return;
								}
							} else {
								int var13;
								if (class359.field3075 == 4) {
									var10 = 180 + class359.field3072 - 80;
									var11 = 321;
									if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
										class60.field603.trim();
										if (class60.field603.length() != 6) {
											class300.method1452(class177.field1362, class177.field1363, class177.field1364);
											return;
										}

										class398.field3358 = Integer.parseInt(class60.field603);
										class60.field603 = "";
										class415.method2014(true);
										class300.method1452(class177.field1565, class177.field1420, class177.field1567);
										class261.method1113(20);
										return;
									}

									if (var5 == 1 && var82 >= 180 + class359.field3072 - 9 && var82 <= 130 + class359.field3072 + 180 && var83 >= 263 && var83 <= 296) {
										class359.field3061 = !class359.field3061;
									}

									if (var5 == 1 && var82 >= class359.field3072 + 180 - 34 && var82 <= 34 + class359.field3072 + 180 && var83 >= 351 && var83 <= 363) {
										class10.method62(class241.method1045("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var10 = class359.field3072 + 180 + 80;
									if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
										class286.method1419(0);
										class359.field3071 = "";
										class359.field3067 = "";
										class398.field3358 = 0;
										class60.field603 = "";
									}

									while (var9.method2136()) {
										boolean var12 = false;

										for (var13 = 0; var13 < class359.field3082.length(); ++var13) {
											if (var9.field3577 == class359.field3082.charAt(var13)) {
												var12 = true;
												break;
											}
										}

										if (var9.field3590 == 13) {
											class286.method1419(0);
											class359.field3071 = "";
											class359.field3067 = "";
											class398.field3358 = 0;
											class60.field603 = "";
										} else {
											if (85 == var9.field3590 && class60.field603.length() > 0) {
												class60.field603 = class60.field603.substring(0, class60.field603.length() - 1);
											}

											if (var9.field3590 == 84) {
												class60.field603.trim();
												if (class60.field603.length() != 6) {
													class300.method1452(class177.field1362, class177.field1363, class177.field1364);
													return;
												}

												class398.field3358 = Integer.parseInt(class60.field603);
												class60.field603 = "";
												class415.method2014(true);
												class300.method1452(class177.field1565, class177.field1420, class177.field1567);
												class261.method1113(20);
												return;
											}

											if (var12 && class60.field603.length() < 6) {
												class60.field603 = class60.field603 + var9.field3577;
											}
										}
									}
								} else {
									int var56;
									if (5 == class359.field3075) {
										var10 = class359.field3072 + 180 - 80;
										var11 = 321;
										class127 var21;
										int var25;
										if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
											class359.field3071 = class359.field3071.trim();
											if (class359.field3071.length() == 0) {
												class300.method1452(class177.field1599, class177.field1600, class177.field1595);
											} else {
												long var45;
												try {
													URL var42 = new URL(class241.method1045("services", false) + "m=accountappeal/login.ws");
													URLConnection var16 = var42.openConnection();
													var16.setRequestProperty("connection", "close");
													var16.setDoInput(true);
													var16.setDoOutput(true);
													var16.setConnectTimeout(5000);
													OutputStreamWriter var115 = new OutputStreamWriter(var16.getOutputStream());
													var115.write("data1=req");
													var115.flush();
													InputStream var117 = var16.getInputStream();
													class127 var97 = new class127(new byte[1000]);

													while (true) {
														int var20 = var117.read(var97.field1072, var97.field1070, 1000 - var97.field1070);
														if (var20 == -1) {
															var97.field1070 = 0;
															long var47 = var97.method598();
															var45 = var47;
															break;
														}

														var97.field1070 += var20;
														if (var97.field1070 >= 1000) {
															var45 = 0L;
															break;
														}
													}
												} catch (Exception var72) {
													var45 = 0L;
												}

												byte var89;
												if (var45 == 0L) {
													var89 = 5;
												} else {
													String var118 = class359.field3071;
													Random var98 = new Random();
													class127 var121 = new class127(128);
													var21 = new class127(128);
													int[] var105 = new int[]{var98.nextInt(), var98.nextInt(), (int)(var45 >> 32), (int)var45};
													var121.method544(10);

													int var23;
													for (var23 = 0; var23 < 4; ++var23) {
														var121.method534(var98.nextInt());
													}

													var121.method534(var105[0]);
													var121.method534(var105[1]);
													var121.method536(var45);
													var121.method536(0L);

													for (var23 = 0; var23 < 4; ++var23) {
														var121.method534(var98.nextInt());
													}

													var121.method563(class184.field1684, class184.field1683);
													var21.method544(10);

													for (var23 = 0; var23 < 3; ++var23) {
														var21.method534(var98.nextInt());
													}

													var21.method536(var98.nextLong());
													var21.method535(var98.nextLong());
													if (null != client.field273) {
														var21.method540(client.field273, 0, client.field273.length);
													} else {
														byte[] var106 = new byte[24];

														try {
															class25.field115.method2164(0L);
															class25.field115.method2159(var106);

															for (var25 = 0; var25 < 24 && var106[var25] == 0; ++var25) {
															}

															if (var25 >= 24) {
																throw new IOException();
															}
														} catch (Exception var71) {
															for (int var26 = 0; var26 < 24; ++var26) {
																var106[var26] = -1;
															}
														}

														var21.method540(var106, 0, var106.length);
													}

													var21.method536(var98.nextLong());
													var21.method563(class184.field1684, class184.field1683);
													var23 = class319.method1614(var118);
													if (var23 % 8 != 0) {
														var23 += 8 - var23 % 8;
													}

													class127 var107 = new class127(var23);
													var107.method538(var118, (byte)72);
													var107.field1070 = var23;
													var107.method591(var105);
													class127 var52 = new class127(var21.field1070 + var121.field1070 + 5 + var107.field1070);
													var52.method544(2);
													var52.method544(var121.field1070);
													var52.method540(var121.field1072, 0, var121.field1070);
													var52.method544(var21.field1070);
													var52.method540(var21.field1072, 0, var21.field1070);
													var52.method533(var107.field1070);
													var52.method540(var107.field1072, 0, var107.field1070);
													String var126 = class236.method1029(var52.field1072);

													byte var17;
													try {
														URL var108 = new URL(class241.method1045("services", false) + "m=accountappeal/login.ws");
														URLConnection var109 = var108.openConnection();
														var109.setDoInput(true);
														var109.setDoOutput(true);
														var109.setConnectTimeout(5000);
														OutputStreamWriter var110 = new OutputStreamWriter(var109.getOutputStream());
														var110.write("data2=" + class106.method421(var126) + "&dest=" + class106.method421("passwordchoice.ws"));
														var110.flush();
														InputStream var111 = var109.getInputStream();
														var52 = new class127(new byte[1000]);

														while (true) {
															int var31 = var111.read(var52.field1072, var52.field1070, 1000 - var52.field1070);
															if (var31 == -1) {
																var110.close();
																var111.close();
																String var127 = new String(var52.field1072);
																if (var127.startsWith("OFFLINE")) {
																	var17 = 4;
																} else if (var127.startsWith("WRONG")) {
																	var17 = 7;
																} else if (var127.startsWith("RELOAD")) {
																	var17 = 3;
																} else if (var127.startsWith("Not permitted for social network accounts.")) {
																	var17 = 6;
																} else {
																	var52.method562(var105);

																	while (var52.field1070 > 0 && 0 == var52.field1072[var52.field1070 - 1]) {
																		--var52.field1070;
																	}

																	var127 = new String(var52.field1072, 0, var52.field1070);
																	boolean var32;
																	if (null == var127) {
																		var32 = false;
																	} else {
																		label1682: {
																			try {
																				new URL(var127);
																			} catch (MalformedURLException var69) {
																				var32 = false;
																				break label1682;
																			}

																			var32 = true;
																		}
																	}

																	if (var32) {
																		class10.method62(var127, true, false);
																		var17 = 2;
																	} else {
																		var17 = 5;
																	}
																}
																break;
															}

															var52.field1070 += var31;
															if (var52.field1070 >= 1000) {
																var17 = 5;
																break;
															}
														}
													} catch (Throwable var70) {
														var70.printStackTrace();
														var17 = 5;
													}

													var89 = var17;
												}

												switch(var89) {
												case 2:
													class300.method1452(class177.field1602, class177.field1603, class177.field1339);
													class286.method1419(6);
													break;
												case 3:
													class300.method1452(class177.field1466, class177.field1606, class177.field1607);
													break;
												case 4:
													class300.method1452(class177.field1608, class177.field1609, class177.field1610);
													break;
												case 5:
													class300.method1452(class177.field1624, class177.field1612, class177.field1613);
													break;
												case 6:
													class300.method1452(class177.field1464, class177.field1615, class177.field1616);
													break;
												case 7:
													class300.method1452(class177.field1642, class177.field1618, class177.field1489);
												}
											}

											return;
										}

										var10 = 80 + 180 + class359.field3072;
										if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
											class426.method2080(true);
										}

										var88 = 361;
										if (null != class188.field1701) {
											var13 = class188.field1701.field3185 / 2;
											if (var5 == 1 && var82 >= class188.field1701.field3184 - var13 && var82 <= class188.field1701.field3184 + var13 && var83 >= var88 - 15 && var83 < var88) {
												class10.method62(class241.method1045("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var9.method2136()) {
											boolean var90 = false;

											for (var14 = 0; var14 < class359.field3074.length(); ++var14) {
												if (var9.field3577 == class359.field3074.charAt(var14)) {
													var90 = true;
													break;
												}
											}

											if (13 == var9.field3590) {
												class426.method2080(true);
											} else {
												if (var9.field3590 == 85 && class359.field3071.length() > 0) {
													class359.field3071 = class359.field3071.substring(0, class359.field3071.length() - 1);
												}

												if (84 == var9.field3590) {
													class359.field3071 = class359.field3071.trim();
													if (class359.field3071.length() == 0) {
														class300.method1452(class177.field1599, class177.field1600, class177.field1595);
													} else {
														long var49;
														try {
															URL var43 = new URL(class241.method1045("services", false) + "m=accountappeal/login.ws");
															URLConnection var44 = var43.openConnection();
															var44.setRequestProperty("connection", "close");
															var44.setDoInput(true);
															var44.setDoOutput(true);
															var44.setConnectTimeout(5000);
															OutputStreamWriter var19 = new OutputStreamWriter(var44.getOutputStream());
															var19.write("data1=req");
															var19.flush();
															InputStream var51 = var44.getInputStream();
															var21 = new class127(new byte[1000]);

															while (true) {
																var56 = var51.read(var21.field1072, var21.field1070, 1000 - var21.field1070);
																if (var56 == -1) {
																	var21.field1070 = 0;
																	long var57 = var21.method598();
																	var49 = var57;
																	break;
																}

																var21.field1070 += var56;
																if (var21.field1070 >= 1000) {
																	var49 = 0L;
																	break;
																}
															}
														} catch (Exception var76) {
															var49 = 0L;
														}

														byte var91;
														if (var49 == 0L) {
															var91 = 5;
														} else {
															String var120 = class359.field3071;
															Random var103 = new Random();
															class127 var22 = new class127(128);
															class127 var53 = new class127(128);
															int[] var24 = new int[]{var103.nextInt(), var103.nextInt(), (int)(var49 >> 32), (int)var49};
															var22.method544(10);

															for (var25 = 0; var25 < 4; ++var25) {
																var22.method534(var103.nextInt());
															}

															var22.method534(var24[0]);
															var22.method534(var24[1]);
															var22.method536(var49);
															var22.method536(0L);

															for (var25 = 0; var25 < 4; ++var25) {
																var22.method534(var103.nextInt());
															}

															var22.method563(class184.field1684, class184.field1683);
															var53.method544(10);

															for (var25 = 0; var25 < 3; ++var25) {
																var53.method534(var103.nextInt());
															}

															var53.method536(var103.nextLong());
															var53.method535(var103.nextLong());
															if (client.field273 != null) {
																var53.method540(client.field273, 0, client.field273.length);
															} else {
																byte[] var54 = new byte[24];

																try {
																	class25.field115.method2164(0L);
																	class25.field115.method2159(var54);

																	int var61;
																	for (var61 = 0; var61 < 24 && 0 == var54[var61]; ++var61) {
																	}

																	if (var61 >= 24) {
																		throw new IOException();
																	}
																} catch (Exception var75) {
																	for (int var62 = 0; var62 < 24; ++var62) {
																		var54[var62] = -1;
																	}
																}

																var53.method540(var54, 0, var54.length);
															}

															var53.method536(var103.nextLong());
															var53.method563(class184.field1684, class184.field1683);
															var25 = class319.method1614(var120);
															if (0 != var25 % 8) {
																var25 += 8 - var25 % 8;
															}

															class127 var125 = new class127(var25);
															var125.method538(var120, (byte)107);
															var125.field1070 = var25;
															var125.method591(var24);
															class127 var27 = new class127(var53.field1070 + 5 + var22.field1070 + var125.field1070);
															var27.method544(2);
															var27.method544(var22.field1070);
															var27.method540(var22.field1072, 0, var22.field1070);
															var27.method544(var53.field1070);
															var27.method540(var53.field1072, 0, var53.field1070);
															var27.method533(var125.field1070);
															var27.method540(var125.field1072, 0, var125.field1070);
															String var28 = class236.method1029(var27.field1072);

															byte var65;
															try {
																URL var29 = new URL(class241.method1045("services", false) + "m=accountappeal/login.ws");
																URLConnection var30 = var29.openConnection();
																var30.setDoInput(true);
																var30.setDoOutput(true);
																var30.setConnectTimeout(5000);
																OutputStreamWriter var55 = new OutputStreamWriter(var30.getOutputStream());
																var55.write("data2=" + class106.method421(var28) + "&dest=" + class106.method421("passwordchoice.ws"));
																var55.flush();
																InputStream var63 = var30.getInputStream();
																var27 = new class127(new byte[1000]);

																while (true) {
																	int var64 = var63.read(var27.field1072, var27.field1070, 1000 - var27.field1070);
																	if (var64 == -1) {
																		var55.close();
																		var63.close();
																		String var33 = new String(var27.field1072);
																		if (var33.startsWith("OFFLINE")) {
																			var65 = 4;
																		} else if (var33.startsWith("WRONG")) {
																			var65 = 7;
																		} else if (var33.startsWith("RELOAD")) {
																			var65 = 3;
																		} else if (var33.startsWith("Not permitted for social network accounts.")) {
																			var65 = 6;
																		} else {
																			var27.method562(var24);

																			while (var27.field1070 > 0 && var27.field1072[var27.field1070 - 1] == 0) {
																				--var27.field1070;
																			}

																			var33 = new String(var27.field1072, 0, var27.field1070);
																			boolean var34;
																			if (var33 == null) {
																				var34 = false;
																			} else {
																				label1684: {
																					try {
																						new URL(var33);
																					} catch (MalformedURLException var73) {
																						var34 = false;
																						break label1684;
																					}

																					var34 = true;
																				}
																			}

																			if (var34) {
																				class10.method62(var33, true, false);
																				var65 = 2;
																			} else {
																				var65 = 5;
																			}
																		}
																		break;
																	}

																	var27.field1070 += var64;
																	if (var27.field1070 >= 1000) {
																		var65 = 5;
																		break;
																	}
																}
															} catch (Throwable var74) {
																var74.printStackTrace();
																var65 = 5;
															}

															var91 = var65;
														}

														switch(var91) {
														case 2:
															class300.method1452(class177.field1602, class177.field1603, class177.field1339);
															class286.method1419(6);
															break;
														case 3:
															class300.method1452(class177.field1466, class177.field1606, class177.field1607);
															break;
														case 4:
															class300.method1452(class177.field1608, class177.field1609, class177.field1610);
															break;
														case 5:
															class300.method1452(class177.field1624, class177.field1612, class177.field1613);
															break;
														case 6:
															class300.method1452(class177.field1464, class177.field1615, class177.field1616);
															break;
														case 7:
															class300.method1452(class177.field1642, class177.field1618, class177.field1489);
														}
													}

													return;
												}

												if (var90 && class359.field3071.length() < 320) {
													class359.field3071 = class359.field3071 + var9.field3577;
												}
											}
										}
									} else if (6 != class359.field3075) {
										if (7 == class359.field3075) {
											if (class113.field842 && !client.field461) {
												var10 = class140.field1136 - 150;
												var87 = var10 + 240 + 25 + 40;
												var88 = 231;
												var13 = var88 + 40;
												if (var5 == 1 && var82 >= var10 && var82 <= var87 && var83 >= var88 && var83 <= var13) {
													var15 = var10;
													int var66 = 0;

													while (true) {
														if (var66 >= 8) {
															var14 = 0;
															break;
														}

														if (var82 <= var15 + 30) {
															var14 = var66;
															break;
														}

														var15 += 30;
														var15 += var66 != 1 && var66 != 3 ? 5 : 20;
														++var66;
													}

													class359.field3069 = var14;
												}

												var14 = 180 + class359.field3072 - 80;
												short var93 = 321;
												boolean var18;
												SimpleDateFormat var99;
												Calendar var101;
												boolean var102;
												String[] var104;
												Date var116;
												Date var119;
												StringBuilder var122;
												Date var123;
												String var124;
												boolean var128;
												if (var5 == 1 && var82 >= var14 - 75 && var82 <= var14 + 75 && var83 >= var93 - 20 && var83 <= var93 + 20) {
													label1392: {
														try {
															var99 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
															var99.setLenient(false);
															var122 = new StringBuilder();
															var104 = class359.field3050;
															var56 = 0;

															while (true) {
																if (var56 < var104.length) {
																	var124 = var104[var56];
																	if (var124 != null) {
																		var122.append(var124);
																		++var56;
																		continue;
																	}

																	class380.method1886("Date not valid.", "Please ensure all characters are populated.", "");
																	var119 = null;
																} else {
																	var122.append("12");
																	var119 = var99.parse(var122.toString());
																}

																var116 = var119;
																break;
															}
														} catch (ParseException var78) {
															class380.method1886("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var128 = false;
															break label1392;
														}

														if (null == var116) {
															var128 = false;
														} else {
															var101 = Calendar.getInstance();
															var101.set(1, var101.get(1) - 13);
															var101.set(5, var101.get(5) + 1);
															var101.set(11, 0);
															var101.set(12, 0);
															var101.set(13, 0);
															var101.set(14, 0);
															var123 = var101.getTime();
															var18 = var116.before(var123);
															var102 = class44.method220(var116);
															if (!var102) {
																class380.method1886("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var128 = false;
															} else {
																if (!var18) {
																	class74.field659 = 8388607;
																} else {
																	class74.field659 = (int)(var116.getTime() / 86400000L - 11745L);
																}

																var128 = true;
															}
														}
													}

													if (var128) {
														class261.method1113(50);
														return;
													}
												}

												var14 = 80 + 180 + class359.field3072;
												if (var5 == 1 && var82 >= var14 - 75 && var82 <= var14 + 75 && var83 >= var93 - 20 && var83 <= var93 + 20) {
													class359.field3050 = new String[8];
													class426.method2080(true);
												}

												while (var9.method2136()) {
													if (var9.field3590 == 101) {
														class359.field3050[class359.field3069] = null;
													}

													if (85 == var9.field3590) {
														if (null == class359.field3050[class359.field3069] && class359.field3069 > 0) {
															--class359.field3069;
														}

														class359.field3050[class359.field3069] = null;
													}

													if (var9.field3577 >= '0' && var9.field3577 <= '9') {
														class359.field3050[class359.field3069] = "" + var9.field3577;
														if (class359.field3069 < 7) {
															++class359.field3069;
														}
													}

													if (var9.field3590 == 84) {
														label1321: {
															try {
																var99 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
																var99.setLenient(false);
																var122 = new StringBuilder();
																var104 = class359.field3050;
																var56 = 0;

																while (true) {
																	if (var56 < var104.length) {
																		var124 = var104[var56];
																		if (var124 != null) {
																			var122.append(var124);
																			++var56;
																			continue;
																		}

																		class380.method1886("Date not valid.", "Please ensure all characters are populated.", "");
																		var119 = null;
																	} else {
																		var122.append("12");
																		var119 = var99.parse(var122.toString());
																	}

																	var116 = var119;
																	break;
																}
															} catch (ParseException var77) {
																class380.method1886("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var128 = false;
																break label1321;
															}

															if (var116 == null) {
																var128 = false;
															} else {
																var101 = Calendar.getInstance();
																var101.set(1, var101.get(1) - 13);
																var101.set(5, var101.get(5) + 1);
																var101.set(11, 0);
																var101.set(12, 0);
																var101.set(13, 0);
																var101.set(14, 0);
																var123 = var101.getTime();
																var18 = var116.before(var123);
																var102 = class44.method220(var116);
																if (!var102) {
																	class380.method1886("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var128 = false;
																} else {
																	if (!var18) {
																		class74.field659 = 8388607;
																	} else {
																		class74.field659 = (int)(var116.getTime() / 86400000L - 11745L);
																	}

																	var128 = true;
																}
															}
														}

														if (var128) {
															class261.method1113(50);
														}

														return;
													}
												}
											} else {
												var10 = 180 + class359.field3072 - 80;
												var11 = 321;
												if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
													class10.method62(class241.method1045("secure", true) + "m=dob/set_dob.ws", true, false);
													class300.method1452(class177.field1596, class177.field1597, class177.field1598);
													class286.method1419(6);
													return;
												}

												var10 = 180 + class359.field3072 + 80;
												if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
													class426.method2080(true);
												}
											}
										} else if (class359.field3075 == 8) {
											var10 = class359.field3072 + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class10.method62("https://www.jagex.com/terms/privacy", true, false);
												class300.method1452(class177.field1596, class177.field1597, class177.field1598);
												class286.method1419(6);
												return;
											}

											var10 = class359.field3072 + 180 + 80;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class426.method2080(true);
											}
										} else if (9 == class359.field3075) {
											var10 = class359.field3072 + 180;
											var11 = 311;
											if (var39.field3590 == 84 || 13 == var39.field3590 || var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class301.method1454(false);
											}
										} else if (class359.field3075 == 10) {
											var10 = class359.field3072 + 180;
											var11 = 209;
											if (84 == var39.field3590 || var5 == 1 && var82 >= var10 - 109 && var82 <= var10 + 109 && var83 >= var11 && var83 <= var11 + 68) {
												class300.method1452(class177.field1565, class177.field1420, class177.field1567);
												client.field353 = class218.field1887;
												class415.method2014(false);
												class261.method1113(20);
											}
										} else if (12 == class359.field3075) {
											var10 = class140.field1136;
											var11 = 233;
											class376 var67 = var1.method2030(0, 30, class177.field1353, var10, var11);
											class376 var40 = var1.method2030(32, 32, class177.field1353, var10, var11);
											class376 var41 = var1.method2030(70, 34, class177.field1353, var10, var11);
											var87 = var11 + 17;
											class376 var114 = var1.method2030(0, 34, class177.field1629, var10, var87);
											if (var5 == 1) {
												if (var67.method1855(var82, var83)) {
													class10.method62("https://www.jagex.com/terms", true, false);
												} else if (var40.method1855(var82, var83)) {
													class10.method62("https://www.jagex.com/terms/privacy", true, false);
												} else if (var41.method1855(var82, var83) || var114.method1855(var82, var83)) {
													class10.method62("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var10 = class140.field1136 - 80;
											var11 = 311;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class35.method148();
												class301.method1454(true);
											}

											var10 = class140.field1136 + 80;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class359.field3075 = 13;
											}
										} else if (13 == class359.field3075) {
											var10 = class140.field1136;
											var11 = 321;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class301.method1454(true);
											}
										} else if (class359.field3075 == 14) {
											String var68 = "";
											switch(class359.field3055) {
											case 0:
												var68 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
												break;
											case 1:
												var68 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
												break;
											case 2:
												var68 = "https://support.runescape.com/hc/en-gb/articles/207256855-Settle-an-Unpaid-Balance";
												break;
											default:
												class426.method2080(false);
											}

											var87 = 180 + class359.field3072;
											var88 = 276;
											if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
												class10.method62(var68, true, false);
												class300.method1452(class177.field1596, class177.field1597, class177.field1598);
												class286.method1419(6);
												return;
											}

											var87 = class359.field3072 + 180;
											var88 = 326;
											if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
												class426.method2080(false);
											}
										} else if (class359.field3075 == 24) {
											var10 = class359.field3072 + 180;
											var11 = 301;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class301.method1454(false);
											}
										} else if (class359.field3075 == 26) {
											var10 = class359.field3072 + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class10.method62(class241.method1045("secure", true) + "m=dob/set_dob.ws", true, false);
												class300.method1452(class177.field1596, class177.field1597, class177.field1598);
												class286.method1419(6);
												return;
											}

											var10 = class359.field3072 + 180 + 80;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class426.method2080(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var9.method2136()) {
													var86 = 321;
													if (var5 == 1 && var83 >= var86 - 20 && var83 <= var86 + 20) {
														class426.method2080(true);
													}

													return;
												}
											} while(84 != var9.field3590 && var9.field3590 != 13);

											class426.method2080(true);
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
