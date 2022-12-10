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

public class class180 {
	public short[] field1673;
	public short[] field1674;

	public class180(int var1) {
		class200 var2 = class208.method4105(var1);
		if (var2.method3954()) {
			this.field1673 = new short[var2.field2261.length];
			System.arraycopy(var2.field2261, 0, this.field1673, 0, this.field1673.length);
		}

		if (var2.method3932()) {
			this.field1674 = new short[var2.field2306.length];
			System.arraycopy(var2.field2306, 0, this.field1674, 0, this.field1674.length);
		}

	}

	public static int method2989(int var0) {
		class203 var3 = (class203)class203.field2322.method5356((long)var0);
		class203 var2;
		if (null != var3) {
			var2 = var3;
		} else {
			byte[] var8 = class203.field2321.method6374(14, var0);
			var3 = new class203();
			if (null != var8) {
				var3.method3995(new class467(var8));
			}

			class203.field2322.method5364(var3, (long)var0);
			var2 = var3;
		}

		int var4 = var2.field2323;
		int var5 = var2.field2324;
		int var6 = var2.field2325;
		int var7 = class305.field3664[var6 - var5];
		return class305.field3661[var4] >> var5 & var7;
	}

	public static class290 method2988(int var0) {
		int var2 = var0 >> 16;
		int var3 = var0 & 65535;
		if (null == class72.field625[var2] || class72.field625[var2][var3] == null) {
			boolean var4 = class87.method1889(var2);
			if (!var4) {
				return null;
			}
		}

		return class72.field625[var2][var3];
	}

	static void method2990(class40 var0, class386 var1) {
		int var5;
		int var82;
		int var83;
		if (class73.field657) {
			class185 var81 = client.field1929;
			class185 var4 = var81;

			while (true) {
				if (!var4.method3572()) {
					if (1 != class28.field165 && (class218.field2651 || 4 != class28.field165)) {
						break;
					}

					var5 = 280 + class73.field629;
					if (class28.field166 >= var5 && class28.field166 <= var5 + 14 && class28.field162 >= 4 && class28.field162 <= 18) {
						class2.method15(0, 0);
						break;
					}

					if (class28.field166 >= var5 + 15 && class28.field166 <= var5 + 80 && class28.field162 >= 4 && class28.field162 <= 18) {
						class2.method15(0, 1);
						break;
					}

					var82 = class73.field629 + 390;
					if (class28.field166 >= var82 && class28.field166 <= var82 + 14 && class28.field162 >= 4 && class28.field162 <= 18) {
						class2.method15(1, 0);
						break;
					}

					if (class28.field166 >= var82 + 15 && class28.field166 <= var82 + 80 && class28.field162 >= 4 && class28.field162 <= 18) {
						class2.method15(1, 1);
						break;
					}

					var83 = class73.field629 + 500;
					if (class28.field166 >= var83 && class28.field166 <= var83 + 14 && class28.field162 >= 4 && class28.field162 <= 18) {
						class2.method15(2, 0);
						break;
					}

					if (class28.field166 >= var83 + 15 && class28.field166 <= var83 + 80 && class28.field162 >= 4 && class28.field162 <= 18) {
						class2.method15(2, 1);
						break;
					}

					int var84 = class73.field629 + 610;
					if (class28.field166 >= var84 && class28.field166 <= var84 + 14 && class28.field162 >= 4 && class28.field162 <= 18) {
						class2.method15(3, 0);
						break;
					}

					if (class28.field166 >= var84 + 15 && class28.field166 <= var84 + 80 && class28.field162 >= 4 && class28.field162 <= 18) {
						class2.method15(3, 1);
						break;
					}

					if (class28.field166 >= 708 + class73.field629 && class28.field162 >= 4 && class28.field166 <= 50 + class73.field629 + 708 && class28.field162 <= 20) {
						class73.field657 = false;
						class90.field860.method8849(class73.field629, 0);
						class2.field12.method8849(class73.field629 + 382, 0);
						class73.field631.method8587(382 + class73.field629 - class73.field631.field4928 / 2, 18);
						break;
					}

					if (class73.field658 != -1) {
						class78 var85 = class78.field710[class73.field658];
						class108.method2149(var85);
						class73.field657 = false;
						class90.field860.method8849(class73.field629, 0);
						class2.field12.method8849(class73.field629 + 382, 0);
						class73.field631.method8587(class73.field629 + 382 - class73.field631.field4928 / 2, 18);
					} else {
						if (class73.field659 > 0 && null != class410.field4623 && class28.field166 >= 0 && class28.field166 <= class410.field4623.field4928 && class28.field162 >= class340.field4263 / 2 - 50 && class28.field162 <= 50 + class340.field4263 / 2) {
							--class73.field659;
						}

						if (class73.field659 < class73.field660 && class131.field1303 != null && class28.field166 >= class205.field2337 - class131.field1303.field4928 - 5 && class28.field166 <= class205.field2337 && class28.field162 >= class340.field4263 / 2 - 50 && class28.field162 <= 50 + class340.field4263 / 2) {
							++class73.field659;
						}
					}
					break;
				}

				if (var4.field2035 == 13) {
					class73.field657 = false;
					class90.field860.method8849(class73.field629, 0);
					class2.field12.method8849(382 + class73.field629, 0);
					class73.field631.method8587(class73.field629 + 382 - class73.field631.field4928 / 2, 18);
					break;
				}

				if (var4.field2035 == 96) {
					if (class73.field659 > 0 && class410.field4623 != null) {
						--class73.field659;
					}
				} else if (var4.field2035 == 97 && class73.field659 < class73.field660 && class131.field1303 != null) {
					++class73.field659;
				}
			}

		} else {
			if ((1 == class28.field165 || !class218.field2651 && 4 == class28.field165) && class28.field166 >= 765 + class73.field629 - 50 && class28.field162 >= 453) {
				class186.field2040.method1810(!class186.field2040.method1790());
				if (!class186.field2040.method1790()) {
					class326 var3 = class174.field1635;
					int var36 = var3.method6319("scape main");
					var5 = var3.method6326(var36, "");
					class300.method502(var3, var36, var5, 255, false);
				} else {
					class300.method48();
				}
			}

			if (client.field1698 != 5) {
				if (-1L == class73.field649) {
					class73.field649 = class74.method1493() + 1000L;
				}

				long var37 = class74.method1493();
				if (class195.method3778() && class73.field662 == -1L) {
					class73.field662 = var37;
					if (class73.field662 > class73.field649) {
						class73.field649 = class73.field662;
					}
				}

				if (client.field1698 == 10 || 11 == client.field1698) {
					if (class340.field4257 == class178.field1654) {
						if (class28.field165 == 1 || !class218.field2651 && 4 == class28.field165) {
							var5 = class73.field629 + 5;
							short var6 = 463;
							byte var7 = 100;
							byte var8 = 35;
							if (class28.field166 >= var5 && class28.field166 <= var5 + var7 && class28.field162 >= var6 && class28.field162 <= var6 + var8) {
								class73.method4720();
								return;
							}
						}

						if (null != class5.field30) {
							class73.method4720();
						}
					}

					var5 = class28.field165;
					var82 = class28.field166;
					var83 = class28.field162;
					if (var5 == 0) {
						var82 = class28.field158;
						var83 = class28.field153;
					}

					if (!class218.field2651 && var5 == 4) {
						var5 = 1;
					}

					class185 var39 = client.field1929;
					class185 var9 = var39;
					int var87;
					short var88;
					if (class73.field656 == 0) {
						boolean var96 = false;

						while (var9.method3572()) {
							if (84 == var9.field2035) {
								var96 = true;
							}
						}

						var87 = class117.field1174 - 80;
						var88 = 291;
						if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
							class356.method6604(class64.method1203("secure", true) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false);
						}

						var87 = 80 + class117.field1174;
						if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20 || var96) {
							if (0 != (client.field1777 & 33554432)) {
								class73.field643 = "";
								class73.field628 = class321.field3974;
								class73.field645 = class321.field3992;
								class73.field666 = class321.field4062;
								class73.method113(1);
								class49.method943();
							} else if ((client.field1777 & 4) != 0) {
								if ((client.field1777 & 1024) != 0) {
									class73.field628 = class321.field3763;
									class73.field645 = class321.field3989;
									class73.field666 = class321.field3990;
								} else {
									class73.field628 = class321.field3982;
									class73.field645 = class321.field3972;
									class73.field666 = class321.field3984;
								}

								class73.field643 = class321.field3981;
								class73.method113(1);
								class49.method943();
							} else if ((client.field1777 & 1024) != 0) {
								class73.field628 = class321.field3985;
								class73.field645 = class321.field3986;
								class73.field666 = class321.field3958;
								class73.field643 = class321.field3981;
								class73.method113(1);
								class49.method943();
							} else {
								class357.method6628(false);
							}
						}
					} else {
						int var10;
						short var11;
						if (class73.field656 == 1) {
							while (true) {
								if (!var9.method3572()) {
									var10 = class117.field1174 - 80;
									var11 = 321;
									if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
										class357.method6628(false);
									}

									var10 = class117.field1174 + 80;
									if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
										class73.method113(0);
									}
									break;
								}

								if (84 == var9.field2035) {
									class357.method6628(false);
								} else if (13 == var9.field2035) {
									class73.method113(0);
								}
							}
						} else {
							int var14;
							int var15;
							short var86;
							if (2 == class73.field656) {
								var86 = 201;
								var10 = var86 + 52;
								if (var5 == 1 && var83 >= var10 - 12 && var83 < var10 + 2) {
									class73.field654 = 0;
								}

								var10 += 15;
								if (var5 == 1 && var83 >= var10 - 12 && var83 < var10 + 2) {
									class73.field654 = 1;
								}

								var10 += 15;
								var86 = 361;
								if (class368.field4383 != null) {
									var87 = class368.field4383.field4570 / 2;
									if (var5 == 1 && var82 >= class368.field4383.field4569 - var87 && var82 <= var87 + class368.field4383.field4569 && var83 >= var86 - 15 && var83 < var86) {
										switch(class73.field640) {
										case 1:
											class73.method2926(class321.field4030, class321.field4031, class321.field4026);
											class73.method113(5);
											return;
										case 2:
											class356.method6604("https://support.runescape.com/hc/en-gb", true, false);
										}
									}
								}

								var87 = class117.field1174 - 80;
								var88 = 321;
								if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
									class73.field652 = class73.field652.trim();
									if (class73.field652.length() == 0) {
										class73.method2926(class321.field3874, class321.field3843, class321.field3902);
										return;
									}

									if (class73.field648.length() == 0) {
										class73.method2926(class321.field3901, class321.field3836, class321.field3879);
										return;
									}

									class73.method2926(class321.field3996, class321.field3851, class321.field3998);
									class102.method2078(false);
									class131.method2451(20);
									return;
								}

								var87 = 180 + class73.field653 + 80;
								if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
									class73.method113(0);
									class73.field652 = "";
									class73.field648 = "";
									class133.field1314 = 0;
									class154.field1469 = "";
									class73.field642 = true;
								}

								var87 = class117.field1174 + -117;
								var88 = 277;
								class73.field651 = var82 >= var87 && var82 < var87 + class114.field1153 && var83 >= var88 && var83 < var88 + class241.field2892;
								if (var5 == 1 && class73.field651) {
									client.field1737 = !client.field1737;
									if (!client.field1737 && class186.field2040.method1792() != null) {
										class186.field2040.method1791((String)null);
									}
								}

								var87 = 24 + class117.field1174;
								var88 = 277;
								class73.field667 = var82 >= var87 && var82 < var87 + class114.field1153 && var83 >= var88 && var83 < class241.field2892 + var88;
								if (var5 == 1 && class73.field667) {
									class186.field2040.method1823(!class186.field2040.method1775());
									if (!class186.field2040.method1775()) {
										class73.field652 = "";
										class186.field2040.method1791((String)null);
										class49.method943();
									}
								}

								while (true) {
									Transferable var113;
									do {
										while (true) {
											label1863:
											do {
												while (true) {
													while (var9.method3572()) {
														if (var9.field2035 != 13) {
															if (class73.field654 != 0) {
																continue label1863;
															}

															char var92 = var9.field2022;

															for (var14 = 0; var14 < class73.field655.length() && var92 != class73.field655.charAt(var14); ++var14) {
															}

															if (85 == var9.field2035 && class73.field652.length() > 0) {
																class73.field652 = class73.field652.substring(0, class73.field652.length() - 1);
															}

															if (var9.field2035 == 84 || var9.field2035 == 80) {
																class73.field654 = 1;
															}

															if (class13.method175(var9.field2022) && class73.field652.length() < 320) {
																class73.field652 = class73.field652 + var9.field2022;
															}
														} else {
															class73.method113(0);
															class73.field652 = "";
															class73.field648 = "";
															class133.field1314 = 0;
															class154.field1469 = "";
															class73.field642 = true;
														}
													}

													return;
												}
											} while(1 != class73.field654);

											if (var9.field2035 == 85 && class73.field648.length() > 0) {
												class73.field648 = class73.field648.substring(0, class73.field648.length() - 1);
											} else if (84 == var9.field2035 || 80 == var9.field2035) {
												class73.field654 = 0;
												if (84 == var9.field2035) {
													class73.field652 = class73.field652.trim();
													if (class73.field652.length() == 0) {
														class73.method2926(class321.field3874, class321.field3843, class321.field3902);
														return;
													}

													if (class73.field648.length() == 0) {
														class73.method2926(class321.field3901, class321.field3836, class321.field3879);
														return;
													}

													class73.method2926(class321.field3996, class321.field3851, class321.field3998);
													class102.method2078(false);
													class131.method2451(20);
													return;
												}
											}

											if ((var9.method3567(82) || var9.method3567(87)) && 67 == var9.field2035) {
												Clipboard var112 = Toolkit.getDefaultToolkit().getSystemClipboard();
												var113 = var112.getContents(class122.field1212);
												var15 = 20 - class73.field648.length();
												break;
											}

											if (class70.method1403(var9.field2022) && class13.method175(var9.field2022) && class73.field648.length() < 20) {
												class73.field648 = class73.field648 + var9.field2022;
											}
										}
									} while(var15 <= 0);

									try {
										String var94 = (String)var113.getTransferData(DataFlavor.stringFlavor);
										int var100 = Math.min(var15, var94.length());

										for (int var95 = 0; var95 < var100; ++var95) {
											if (!class70.method1403(var94.charAt(var95)) || !class13.method175(var94.charAt(var95))) {
												class73.method113(3);
												return;
											}
										}

										class73.field648 = class73.field648 + var94.substring(0, var100);
									} catch (UnsupportedFlavorException var79) {
									} catch (IOException var80) {
									}
								}
							} else if (class73.field656 == 3) {
								var10 = 180 + class73.field653;
								var11 = 276;
								if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
									class120.method2300(false);
								}

								var10 = class73.field653 + 180;
								var11 = 326;
								if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
									class73.method2926(class321.field4030, class321.field4031, class321.field4026);
									class73.method113(5);
									return;
								}
							} else {
								int var13;
								if (class73.field656 == 4) {
									var10 = 180 + class73.field653 - 80;
									var11 = 321;
									if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
										class154.field1469.trim();
										if (class154.field1469.length() != 6) {
											class73.method2926(class321.field3793, class321.field3794, class321.field3795);
											return;
										}

										class133.field1314 = Integer.parseInt(class154.field1469);
										class154.field1469 = "";
										class102.method2078(true);
										class73.method2926(class321.field3996, class321.field3851, class321.field3998);
										class131.method2451(20);
										return;
									}

									if (var5 == 1 && var82 >= 180 + class73.field653 - 9 && var82 <= 130 + class73.field653 + 180 && var83 >= 263 && var83 <= 296) {
										class73.field642 = !class73.field642;
									}

									if (var5 == 1 && var82 >= class73.field653 + 180 - 34 && var82 <= 34 + class73.field653 + 180 && var83 >= 351 && var83 <= 363) {
										class356.method6604(class64.method1203("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
									}

									var10 = class73.field653 + 180 + 80;
									if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
										class73.method113(0);
										class73.field652 = "";
										class73.field648 = "";
										class133.field1314 = 0;
										class154.field1469 = "";
									}

									while (var9.method3572()) {
										boolean var12 = false;

										for (var13 = 0; var13 < class73.field664.length(); ++var13) {
											if (var9.field2022 == class73.field664.charAt(var13)) {
												var12 = true;
												break;
											}
										}

										if (var9.field2035 == 13) {
											class73.method113(0);
											class73.field652 = "";
											class73.field648 = "";
											class133.field1314 = 0;
											class154.field1469 = "";
										} else {
											if (85 == var9.field2035 && class154.field1469.length() > 0) {
												class154.field1469 = class154.field1469.substring(0, class154.field1469.length() - 1);
											}

											if (var9.field2035 == 84) {
												class154.field1469.trim();
												if (class154.field1469.length() != 6) {
													class73.method2926(class321.field3793, class321.field3794, class321.field3795);
													return;
												}

												class133.field1314 = Integer.parseInt(class154.field1469);
												class154.field1469 = "";
												class102.method2078(true);
												class73.method2926(class321.field3996, class321.field3851, class321.field3998);
												class131.method2451(20);
												return;
											}

											if (var12 && class154.field1469.length() < 6) {
												class154.field1469 = class154.field1469 + var9.field2022;
											}
										}
									}
								} else {
									int var56;
									if (5 == class73.field656) {
										var10 = class73.field653 + 180 - 80;
										var11 = 321;
										class467 var21;
										int var25;
										if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
											class73.field652 = class73.field652.trim();
											if (class73.field652.length() == 0) {
												class73.method2926(class321.field4030, class321.field4031, class321.field4026);
											} else {
												long var45;
												try {
													URL var42 = new URL(class64.method1203("services", false) + "m=accountappeal/login.ws");
													URLConnection var16 = var42.openConnection();
													var16.setRequestProperty("connection", "close");
													var16.setDoInput(true);
													var16.setDoOutput(true);
													var16.setConnectTimeout(5000);
													OutputStreamWriter var115 = new OutputStreamWriter(var16.getOutputStream());
													var115.write("data1=req");
													var115.flush();
													InputStream var117 = var16.getInputStream();
													class467 var97 = new class467(new byte[1000]);

													while (true) {
														int var20 = var117.read(var97.field4917, var97.field4915, 1000 - var97.field4915);
														if (var20 == -1) {
															var97.field4915 = 0;
															long var47 = var97.method8492();
															var45 = var47;
															break;
														}

														var97.field4915 += var20;
														if (var97.field4915 >= 1000) {
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
													String var118 = class73.field652;
													Random var98 = new Random();
													class467 var121 = new class467(128);
													var21 = new class467(128);
													int[] var105 = new int[]{var98.nextInt(), var98.nextInt(), (int)(var45 >> 32), (int)var45};
													var121.method8323(10);

													int var23;
													for (var23 = 0; var23 < 4; ++var23) {
														var121.method8312(var98.nextInt());
													}

													var121.method8312(var105[0]);
													var121.method8312(var105[1]);
													var121.method8314(var45);
													var121.method8314(0L);

													for (var23 = 0; var23 < 4; ++var23) {
														var121.method8312(var98.nextInt());
													}

													var121.method8351(class53.field393, class53.field391);
													var21.method8323(10);

													for (var23 = 0; var23 < 3; ++var23) {
														var21.method8312(var98.nextInt());
													}

													var21.method8314(var98.nextLong());
													var21.method8313(var98.nextLong());
													if (null != client.field1742) {
														var21.method8319(client.field1742, 0, client.field1742.length);
													} else {
														byte[] var106 = new byte[24];

														try {
															class163.field1515.method8029(0L);
															class163.field1515.method8013(var106);

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

														var21.method8319(var106, 0, var106.length);
													}

													var21.method8314(var98.nextLong());
													var21.method8351(class53.field393, class53.field391);
													var23 = class467.method190(var118);
													if (var23 % 8 != 0) {
														var23 += 8 - var23 % 8;
													}

													class467 var107 = new class467(var23);
													var107.method8316(var118);
													var107.field4915 = var23;
													var107.method8464(var105);
													class467 var52 = new class467(var21.field4915 + var121.field4915 + 5 + var107.field4915);
													var52.method8323(2);
													var52.method8323(var121.field4915);
													var52.method8319(var121.field4917, 0, var121.field4915);
													var52.method8323(var21.field4915);
													var52.method8319(var21.field4917, 0, var21.field4915);
													var52.method8310(var107.field4915);
													var52.method8319(var107.field4917, 0, var107.field4915);
													String var126 = class197.method3890(var52.field4917);

													byte var17;
													try {
														URL var108 = new URL(class64.method1203("services", false) + "m=accountappeal/login.ws");
														URLConnection var109 = var108.openConnection();
														var109.setDoInput(true);
														var109.setDoOutput(true);
														var109.setConnectTimeout(5000);
														OutputStreamWriter var110 = new OutputStreamWriter(var109.getOutputStream());
														var110.write("data2=" + class461.method8220(var126) + "&dest=" + class461.method8220("passwordchoice.ws"));
														var110.flush();
														InputStream var111 = var109.getInputStream();
														var52 = new class467(new byte[1000]);

														while (true) {
															int var31 = var111.read(var52.field4917, var52.field4915, 1000 - var52.field4915);
															if (var31 == -1) {
																var110.close();
																var111.close();
																String var127 = new String(var52.field4917);
																if (var127.startsWith("OFFLINE")) {
																	var17 = 4;
																} else if (var127.startsWith("WRONG")) {
																	var17 = 7;
																} else if (var127.startsWith("RELOAD")) {
																	var17 = 3;
																} else if (var127.startsWith("Not permitted for social network accounts.")) {
																	var17 = 6;
																} else {
																	var52.method8348(var105);

																	while (var52.field4915 > 0 && 0 == var52.field4917[var52.field4915 - 1]) {
																		--var52.field4915;
																	}

																	var127 = new String(var52.field4917, 0, var52.field4915);
																	boolean var32;
																	if (null == var127) {
																		var32 = false;
																	} else {
																		label2026: {
																			try {
																				new URL(var127);
																			} catch (MalformedURLException var69) {
																				var32 = false;
																				break label2026;
																			}

																			var32 = true;
																		}
																	}

																	if (var32) {
																		class356.method6604(var127, true, false);
																		var17 = 2;
																	} else {
																		var17 = 5;
																	}
																}
																break;
															}

															var52.field4915 += var31;
															if (var52.field4915 >= 1000) {
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
													class73.method2926(class321.field4033, class321.field4034, class321.field3770);
													class73.method113(6);
													break;
												case 3:
													class73.method2926(class321.field3897, class321.field4037, class321.field4038);
													break;
												case 4:
													class73.method2926(class321.field4039, class321.field4040, class321.field4041);
													break;
												case 5:
													class73.method2926(class321.field4055, class321.field4043, class321.field4044);
													break;
												case 6:
													class73.method2926(class321.field3895, class321.field4046, class321.field4047);
													break;
												case 7:
													class73.method2926(class321.field4073, class321.field4049, class321.field3920);
												}
											}

											return;
										}

										var10 = 80 + 180 + class73.field653;
										if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
											class357.method6628(true);
										}

										var88 = 361;
										if (null != class136.field1337) {
											var13 = class136.field1337.field4570 / 2;
											if (var5 == 1 && var82 >= class136.field1337.field4569 - var13 && var82 <= class136.field1337.field4569 + var13 && var83 >= var88 - 15 && var83 < var88) {
												class356.method6604(class64.method1203("secure", true) + "m=weblogin/g=oldscape/cant_log_in", true, false);
											}
										}

										while (var9.method3572()) {
											boolean var90 = false;

											for (var14 = 0; var14 < class73.field655.length(); ++var14) {
												if (var9.field2022 == class73.field655.charAt(var14)) {
													var90 = true;
													break;
												}
											}

											if (13 == var9.field2035) {
												class357.method6628(true);
											} else {
												if (var9.field2035 == 85 && class73.field652.length() > 0) {
													class73.field652 = class73.field652.substring(0, class73.field652.length() - 1);
												}

												if (84 == var9.field2035) {
													class73.field652 = class73.field652.trim();
													if (class73.field652.length() == 0) {
														class73.method2926(class321.field4030, class321.field4031, class321.field4026);
													} else {
														long var49;
														try {
															URL var43 = new URL(class64.method1203("services", false) + "m=accountappeal/login.ws");
															URLConnection var44 = var43.openConnection();
															var44.setRequestProperty("connection", "close");
															var44.setDoInput(true);
															var44.setDoOutput(true);
															var44.setConnectTimeout(5000);
															OutputStreamWriter var19 = new OutputStreamWriter(var44.getOutputStream());
															var19.write("data1=req");
															var19.flush();
															InputStream var51 = var44.getInputStream();
															var21 = new class467(new byte[1000]);

															while (true) {
																var56 = var51.read(var21.field4917, var21.field4915, 1000 - var21.field4915);
																if (var56 == -1) {
																	var21.field4915 = 0;
																	long var57 = var21.method8492();
																	var49 = var57;
																	break;
																}

																var21.field4915 += var56;
																if (var21.field4915 >= 1000) {
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
															String var120 = class73.field652;
															Random var103 = new Random();
															class467 var22 = new class467(128);
															class467 var53 = new class467(128);
															int[] var24 = new int[]{var103.nextInt(), var103.nextInt(), (int)(var49 >> 32), (int)var49};
															var22.method8323(10);

															for (var25 = 0; var25 < 4; ++var25) {
																var22.method8312(var103.nextInt());
															}

															var22.method8312(var24[0]);
															var22.method8312(var24[1]);
															var22.method8314(var49);
															var22.method8314(0L);

															for (var25 = 0; var25 < 4; ++var25) {
																var22.method8312(var103.nextInt());
															}

															var22.method8351(class53.field393, class53.field391);
															var53.method8323(10);

															for (var25 = 0; var25 < 3; ++var25) {
																var53.method8312(var103.nextInt());
															}

															var53.method8314(var103.nextLong());
															var53.method8313(var103.nextLong());
															if (client.field1742 != null) {
																var53.method8319(client.field1742, 0, client.field1742.length);
															} else {
																byte[] var54 = new byte[24];

																try {
																	class163.field1515.method8029(0L);
																	class163.field1515.method8013(var54);

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

																var53.method8319(var54, 0, var54.length);
															}

															var53.method8314(var103.nextLong());
															var53.method8351(class53.field393, class53.field391);
															var25 = class467.method190(var120);
															if (0 != var25 % 8) {
																var25 += 8 - var25 % 8;
															}

															class467 var125 = new class467(var25);
															var125.method8316(var120);
															var125.field4915 = var25;
															var125.method8464(var24);
															class467 var27 = new class467(var53.field4915 + 5 + var22.field4915 + var125.field4915);
															var27.method8323(2);
															var27.method8323(var22.field4915);
															var27.method8319(var22.field4917, 0, var22.field4915);
															var27.method8323(var53.field4915);
															var27.method8319(var53.field4917, 0, var53.field4915);
															var27.method8310(var125.field4915);
															var27.method8319(var125.field4917, 0, var125.field4915);
															String var28 = class197.method3890(var27.field4917);

															byte var65;
															try {
																URL var29 = new URL(class64.method1203("services", false) + "m=accountappeal/login.ws");
																URLConnection var30 = var29.openConnection();
																var30.setDoInput(true);
																var30.setDoOutput(true);
																var30.setConnectTimeout(5000);
																OutputStreamWriter var55 = new OutputStreamWriter(var30.getOutputStream());
																var55.write("data2=" + class461.method8220(var28) + "&dest=" + class461.method8220("passwordchoice.ws"));
																var55.flush();
																InputStream var63 = var30.getInputStream();
																var27 = new class467(new byte[1000]);

																while (true) {
																	int var64 = var63.read(var27.field4917, var27.field4915, 1000 - var27.field4915);
																	if (var64 == -1) {
																		var55.close();
																		var63.close();
																		String var33 = new String(var27.field4917);
																		if (var33.startsWith("OFFLINE")) {
																			var65 = 4;
																		} else if (var33.startsWith("WRONG")) {
																			var65 = 7;
																		} else if (var33.startsWith("RELOAD")) {
																			var65 = 3;
																		} else if (var33.startsWith("Not permitted for social network accounts.")) {
																			var65 = 6;
																		} else {
																			var27.method8348(var24);

																			while (var27.field4915 > 0 && var27.field4917[var27.field4915 - 1] == 0) {
																				--var27.field4915;
																			}

																			var33 = new String(var27.field4917, 0, var27.field4915);
																			boolean var34;
																			if (var33 == null) {
																				var34 = false;
																			} else {
																				label2028: {
																					try {
																						new URL(var33);
																					} catch (MalformedURLException var73) {
																						var34 = false;
																						break label2028;
																					}

																					var34 = true;
																				}
																			}

																			if (var34) {
																				class356.method6604(var33, true, false);
																				var65 = 2;
																			} else {
																				var65 = 5;
																			}
																		}
																		break;
																	}

																	var27.field4915 += var64;
																	if (var27.field4915 >= 1000) {
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
															class73.method2926(class321.field4033, class321.field4034, class321.field3770);
															class73.method113(6);
															break;
														case 3:
															class73.method2926(class321.field3897, class321.field4037, class321.field4038);
															break;
														case 4:
															class73.method2926(class321.field4039, class321.field4040, class321.field4041);
															break;
														case 5:
															class73.method2926(class321.field4055, class321.field4043, class321.field4044);
															break;
														case 6:
															class73.method2926(class321.field3895, class321.field4046, class321.field4047);
															break;
														case 7:
															class73.method2926(class321.field4073, class321.field4049, class321.field3920);
														}
													}

													return;
												}

												if (var90 && class73.field652.length() < 320) {
													class73.field652 = class73.field652 + var9.field2022;
												}
											}
										}
									} else if (6 != class73.field656) {
										if (7 == class73.field656) {
											if (class142.field1366 && !client.field1930) {
												var10 = class117.field1174 - 150;
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

													class73.field650 = var14;
												}

												var14 = 180 + class73.field653 - 80;
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
													label1734: {
														try {
															var99 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
															var99.setLenient(false);
															var122 = new StringBuilder();
															var104 = class73.field627;
															var56 = 0;

															while (true) {
																if (var56 >= var104.length) {
																	var122.append("12");
																	var119 = var99.parse(var122.toString());
																	break;
																}

																var124 = var104[var56];
																if (var124 == null) {
																	class73.method1945("Date not valid.", "Please ensure all characters are populated.", "");
																	var119 = null;
																	break;
																}

																var122.append(var124);
																++var56;
															}

															var116 = var119;
														} catch (ParseException var78) {
															class73.method1945("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
															var128 = false;
															break label1734;
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
															var102 = class73.method7469(var116);
															if (!var102) {
																class73.method1945("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var128 = false;
															} else {
																if (!var18) {
																	class39.field247 = 8388607;
																} else {
																	class39.field247 = (int)(var116.getTime() / 86400000L - 11745L);
																}

																var128 = true;
															}
														}
													}

													if (var128) {
														class131.method2451(50);
														return;
													}
												}

												var14 = 80 + 180 + class73.field653;
												if (var5 == 1 && var82 >= var14 - 75 && var82 <= var14 + 75 && var83 >= var93 - 20 && var83 <= var93 + 20) {
													class73.field627 = new String[8];
													class357.method6628(true);
												}

												while (var9.method3572()) {
													if (var9.field2035 == 101) {
														class73.field627[class73.field650] = null;
													}

													if (85 == var9.field2035) {
														if (null == class73.field627[class73.field650] && class73.field650 > 0) {
															--class73.field650;
														}

														class73.field627[class73.field650] = null;
													}

													if (var9.field2022 >= '0' && var9.field2022 <= '9') {
														class73.field627[class73.field650] = "" + var9.field2022;
														if (class73.field650 < 7) {
															++class73.field650;
														}
													}

													if (var9.field2035 == 84) {
														label1662: {
															try {
																var99 = new SimpleDateFormat("ddMMyyyyHH", Locale.ENGLISH);
																var99.setLenient(false);
																var122 = new StringBuilder();
																var104 = class73.field627;
																var56 = 0;

																while (true) {
																	if (var56 < var104.length) {
																		var124 = var104[var56];
																		if (var124 != null) {
																			var122.append(var124);
																			++var56;
																			continue;
																		}

																		class73.method1945("Date not valid.", "Please ensure all characters are populated.", "");
																		var119 = null;
																	} else {
																		var122.append("12");
																		var119 = var99.parse(var122.toString());
																	}

																	var116 = var119;
																	break;
																}
															} catch (ParseException var77) {
																class73.method1945("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																var128 = false;
																break label1662;
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
																var102 = class73.method7469(var116);
																if (!var102) {
																	class73.method1945("Date not valid.", "Please ensure date follows the format", "DD/MM/YYYY and is after 01/01/1900");
																	var128 = false;
																} else {
																	if (!var18) {
																		class39.field247 = 8388607;
																	} else {
																		class39.field247 = (int)(var116.getTime() / 86400000L - 11745L);
																	}

																	var128 = true;
																}
															}
														}

														if (var128) {
															class131.method2451(50);
														}

														return;
													}
												}
											} else {
												var10 = 180 + class73.field653 - 80;
												var11 = 321;
												if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
													class356.method6604(class64.method1203("secure", true) + "m=dob/set_dob.ws", true, false);
													class73.method2926(class321.field4027, class321.field4028, class321.field4029);
													class73.method113(6);
													return;
												}

												var10 = 180 + class73.field653 + 80;
												if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
													class357.method6628(true);
												}
											}
										} else if (class73.field656 == 8) {
											var10 = class73.field653 + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class356.method6604("https://www.jagex.com/terms/privacy", true, false);
												class73.method2926(class321.field4027, class321.field4028, class321.field4029);
												class73.method113(6);
												return;
											}

											var10 = class73.field653 + 180 + 80;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class357.method6628(true);
											}
										} else if (9 == class73.field656) {
											var10 = class73.field653 + 180;
											var11 = 311;
											if (var39.field2035 == 84 || 13 == var39.field2035 || var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class120.method2300(false);
											}
										} else if (class73.field656 == 10) {
											var10 = class73.field653 + 180;
											var11 = 209;
											if (84 == var39.field2035 || var5 == 1 && var82 >= var10 - 109 && var82 <= var10 + 109 && var83 >= var11 && var83 <= var11 + 68) {
												class73.method2926(class321.field3996, class321.field3851, class321.field3998);
												client.field1822 = class476.field4998;
												class102.method2078(false);
												class131.method2451(20);
											}
										} else if (12 == class73.field656) {
											var10 = class117.field1174;
											var11 = 233;
											class401 var67 = var1.method6862(0, 30, class321.field3784, var10, var11);
											class401 var40 = var1.method6862(32, 32, class321.field3784, var10, var11);
											class401 var41 = var1.method6862(70, 34, class321.field3784, var10, var11);
											var87 = var11 + 17;
											class401 var114 = var1.method6862(0, 34, class321.field4060, var10, var87);
											if (var5 == 1) {
												if (var67.method7474(var82, var83)) {
													class356.method6604("https://www.jagex.com/terms", true, false);
												} else if (var40.method7474(var82, var83)) {
													class356.method6604("https://www.jagex.com/terms/privacy", true, false);
												} else if (var41.method7474(var82, var83) || var114.method7474(var82, var83)) {
													class356.method6604("https://www.jagex.com/en-GB/legal/eula-runescape-oldschool", true, false);
												}
											}

											var10 = class117.field1174 - 80;
											var11 = 311;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												client.method4347();
												class120.method2300(true);
											}

											var10 = class117.field1174 + 80;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class73.field656 = 13;
											}
										} else if (13 == class73.field656) {
											var10 = class117.field1174;
											var11 = 321;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class120.method2300(true);
											}
										} else if (class73.field656 == 14) {
											String var68 = "";
											switch(class73.field636) {
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
												class357.method6628(false);
											}

											var87 = 180 + class73.field653;
											var88 = 276;
											if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
												class356.method6604(var68, true, false);
												class73.method2926(class321.field4027, class321.field4028, class321.field4029);
												class73.method113(6);
												return;
											}

											var87 = class73.field653 + 180;
											var88 = 326;
											if (var5 == 1 && var82 >= var87 - 75 && var82 <= var87 + 75 && var83 >= var88 - 20 && var83 <= var88 + 20) {
												class357.method6628(false);
											}
										} else if (class73.field656 == 24) {
											var10 = class73.field653 + 180;
											var11 = 301;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class120.method2300(false);
											}
										} else if (class73.field656 == 26) {
											var10 = class73.field653 + 180 - 80;
											var11 = 321;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class356.method6604(class64.method1203("secure", true) + "m=dob/set_dob.ws", true, false);
												class73.method2926(class321.field4027, class321.field4028, class321.field4029);
												class73.method113(6);
												return;
											}

											var10 = class73.field653 + 180 + 80;
											if (var5 == 1 && var82 >= var10 - 75 && var82 <= var10 + 75 && var83 >= var11 - 20 && var83 <= var11 + 20) {
												class357.method6628(true);
											}
										}
									} else {
										while (true) {
											do {
												if (!var9.method3572()) {
													var86 = 321;
													if (var5 == 1 && var83 >= var86 - 20 && var83 <= var86 + 20) {
														class357.method6628(true);
													}

													return;
												}
											} while(84 != var9.field2035 && var9.field2035 != 13);

											class357.method6628(true);
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
