import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "dr"
)
public class class309 extends class392 {
	@ObfInfo(
		owner = "dr",
		name = "ac",
		desc = "Lclient;"
	)
	public static client field2461;
	@ObfInfo(
		owner = "dr",
		name = "x",
		desc = "Lly;"
	)
	static class274 field2462;
	@ObfInfo(
		owner = "dr",
		name = "h",
		desc = "Z"
	)
	final boolean field2463;

	@ObfInfo(
		owner = "dr",
		name = "<init>",
		desc = "(Z)V"
	)
	public class309(boolean var1) {
		this.field2463 = var1;
	}

	@ObfInfo(
		owner = "dr",
		name = "h",
		desc = "(Loa;Loa;B)I"
	)
	int method1497(class69 var1, class69 var2) {
		if (var2.field628 != var1.field628) {
			return this.field2463 ? var1.field628 - var2.field628 : var2.field628 - var1.field628;
		} else {
			return this.method1918(var1, var2);
		}
	}

	@ObfInfo(
		owner = "dr",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method1497((class69)var1, (class69)var2);
	}

	@ObfInfo(
		owner = "dr",
		name = "jm",
		desc = "(IIIIIIIB)V"
	)
	static final void method1498(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (client.field274 && var0 != class347.field2878) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = class408.field3415.method1613(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = class408.field3415.method1608(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = class408.field3415.method1611(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = class408.field3415.method1581(var0, var2, var3);
			}

			int var13;
			if (0L != var8) {
				var13 = class408.field3415.method1607(var0, var2, var3, var8);
				int var40 = class174.method803(var8);
				int var41 = var13 & 31;
				int var42 = var13 >> 6 & 3;
				class87 var14;
				if (var1 == 0) {
					class408.field3415.method1605(var0, var2, var3);
					var14 = class85.method356(var40);
					if (0 != var14.field717) {
						client.field289[var0].method2086(var2, var3, var41, var42, var14.field730);
					}
				}

				if (var1 == 1) {
					class408.field3415.method1610(var0, var2, var3);
				}

				if (var1 == 2) {
					class408.field3415.method1601(var0, var2, var3);
					var14 = class85.method356(var40);
					if (var2 + var14.field720 > 103 || var14.field720 + var3 > 103 || var2 + var14.field721 > 103 || var14.field721 + var3 > 103) {
						return;
					}

					if (var14.field717 != 0) {
						client.field289[var0].method2089(var2, var3, var14.field720, var14.field721, var42, var14.field730);
					}
				}

				if (var1 == 3) {
					class408.field3415.method1576(var0, var2, var3);
					var14 = class85.method356(var40);
					if (1 == var14.field717) {
						client.field289[var0].method2091(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (class71.field644[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				class318 var43 = class408.field3415;
				class427 var15 = client.field289[var0];
				class87 var16 = class85.method356(var4);
				int var17;
				int var18;
				if (var5 != 1 && var5 != 3) {
					var17 = var16.field720;
					var18 = var16.field721;
				} else {
					var17 = var16.field721;
					var18 = var16.field720;
				}

				int var19;
				int var20;
				if (var17 + var2 <= 104) {
					var19 = var2 + (var17 >> 1);
					var20 = var2 + (var17 + 1 >> 1);
				} else {
					var19 = var2;
					var20 = var2 + 1;
				}

				int var21;
				int var22;
				if (var18 + var3 <= 104) {
					var21 = (var18 >> 1) + var3;
					var22 = var3 + (var18 + 1 >> 1);
				} else {
					var21 = var3;
					var22 = var3 + 1;
				}

				int[][] var23 = class71.field636[var13];
				int var24 = var23[var20][var22] + var23[var19][var21] + var23[var20][var21] + var23[var19][var22] >> 2;
				int var25 = (var2 << 7) + (var17 << 6);
				int var26 = (var18 << 6) + (var3 << 7);
				long var27 = class214.method949(var2, var3, 2, 0 == var16.field724, var4);
				int var29 = var6 + (var5 << 6);
				if (var16.field744 == 1) {
					var29 += 256;
				}

				Object var30;
				if (var6 == 22) {
					if (-1 == var16.field728 && var16.field745 == null) {
						var30 = var16.method367(22, var5, var23, var25, var24, var26);
					} else {
						var30 = new class89(var4, 22, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
					}

					var43.method1565(var0, var2, var3, var24, (class295)var30, var27, var29);
					if (var16.field717 == 1) {
						var15.method2085(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var16.field728 == -1 && null == var16.field745) {
							var30 = var16.method367(var6, var5, var23, var25, var24, var26);
						} else {
							var30 = new class89(var4, var6, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
						}

						var43.method1569(var0, var2, var3, var24, 1, 1, (class295)var30, 0, var27, var29);
						if (0 != var16.field717) {
							var15.method2093(var2, var3, var17, var18, var16.field730);
						}
					} else if (var6 == 0) {
						if (var16.field728 == -1 && null == var16.field745) {
							var30 = var16.method367(0, var5, var23, var25, var24, var26);
						} else {
							var30 = new class89(var4, 0, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
						}

						var43.method1567(var0, var2, var3, var24, (class295)var30, (class295)null, class71.field642[var5], 0, var27, var29);
						if (var16.field717 != 0) {
							var15.method2083(var2, var3, var6, var5, var16.field730);
						}
					} else if (var6 == 1) {
						if (var16.field728 == -1 && null == var16.field745) {
							var30 = var16.method367(1, var5, var23, var25, var24, var26);
						} else {
							var30 = new class89(var4, 1, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
						}

						var43.method1567(var0, var2, var3, var24, (class295)var30, (class295)null, class71.field646[var5], 0, var27, var29);
						if (0 != var16.field717) {
							var15.method2083(var2, var3, var6, var5, var16.field730);
						}
					} else {
						int var36;
						if (var6 == 2) {
							var36 = var5 + 1 & 3;
							Object var31;
							Object var32;
							if (-1 == var16.field728 && null == var16.field745) {
								var31 = var16.method367(2, var5 + 4, var23, var25, var24, var26);
								var32 = var16.method367(2, var36, var23, var25, var24, var26);
							} else {
								var31 = new class89(var4, 2, var5 + 4, var13, var2, var3, var16.field728, var16.field737, (class295)null);
								var32 = new class89(var4, 2, var36, var13, var2, var3, var16.field728, var16.field737, (class295)null);
							}

							var43.method1567(var0, var2, var3, var24, (class295)var31, (class295)var32, class71.field642[var5], class71.field642[var36], var27, var29);
							if (var16.field717 != 0) {
								var15.method2083(var2, var3, var6, var5, var16.field730);
							}
						} else if (var6 == 3) {
							if (var16.field728 == -1 && var16.field745 == null) {
								var30 = var16.method367(3, var5, var23, var25, var24, var26);
							} else {
								var30 = new class89(var4, 3, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
							}

							var43.method1567(var0, var2, var3, var24, (class295)var30, (class295)null, class71.field646[var5], 0, var27, var29);
							if (var16.field717 != 0) {
								var15.method2083(var2, var3, var6, var5, var16.field730);
							}
						} else if (var6 == 9) {
							if (var16.field728 == -1 && var16.field745 == null) {
								var30 = var16.method367(var6, var5, var23, var25, var24, var26);
							} else {
								var30 = new class89(var4, var6, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
							}

							var43.method1569(var0, var2, var3, var24, 1, 1, (class295)var30, 0, var27, var29);
							if (var16.field717 != 0) {
								var15.method2093(var2, var3, var17, var18, var16.field730);
							}
						} else if (var6 == 4) {
							if (-1 == var16.field728 && null == var16.field745) {
								var30 = var16.method367(4, var5, var23, var25, var24, var26);
							} else {
								var30 = new class89(var4, 4, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
							}

							var43.method1568(var0, var2, var3, var24, (class295)var30, (class295)null, class71.field642[var5], 0, 0, 0, var27, var29);
						} else {
							Object var33;
							long var37;
							if (var6 == 5) {
								var36 = 16;
								var37 = var43.method1613(var0, var2, var3);
								if (var37 != 0L) {
									var36 = class85.method356(class174.method803(var37)).field729;
								}

								if (var16.field728 == -1 && null == var16.field745) {
									var33 = var16.method367(4, var5, var23, var25, var24, var26);
								} else {
									var33 = new class89(var4, 4, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
								}

								var43.method1568(var0, var2, var3, var24, (class295)var33, (class295)null, class71.field642[var5], 0, class71.field645[var5] * var36, class71.field639[var5] * var36, var27, var29);
							} else if (var6 == 6) {
								var36 = 8;
								var37 = var43.method1613(var0, var2, var3);
								if (var37 != 0L) {
									var36 = class85.method356(class174.method803(var37)).field729 / 2;
								}

								if (var16.field728 == -1 && null == var16.field745) {
									var33 = var16.method367(4, var5 + 4, var23, var25, var24, var26);
								} else {
									var33 = new class89(var4, 4, var5 + 4, var13, var2, var3, var16.field728, var16.field737, (class295)null);
								}

								var43.method1568(var0, var2, var3, var24, (class295)var33, (class295)null, 256, var5, class71.field647[var5] * var36, class71.field635[var5] * var36, var27, var29);
							} else if (var6 == 7) {
								int var39 = var5 + 2 & 3;
								if (-1 == var16.field728 && var16.field745 == null) {
									var30 = var16.method367(4, var39 + 4, var23, var25, var24, var26);
								} else {
									var30 = new class89(var4, 4, var39 + 4, var13, var2, var3, var16.field728, var16.field737, (class295)null);
								}

								var43.method1568(var0, var2, var3, var24, (class295)var30, (class295)null, 256, var39, 0, 0, var27, var29);
							} else if (var6 == 8) {
								var36 = 8;
								var37 = var43.method1613(var0, var2, var3);
								if (0L != var37) {
									var36 = class85.method356(class174.method803(var37)).field729 / 2;
								}

								int var35 = var5 + 2 & 3;
								Object var34;
								if (var16.field728 == -1 && null == var16.field745) {
									var33 = var16.method367(4, var5 + 4, var23, var25, var24, var26);
									var34 = var16.method367(4, var35 + 4, var23, var25, var24, var26);
								} else {
									var33 = new class89(var4, 4, var5 + 4, var13, var2, var3, var16.field728, var16.field737, (class295)null);
									var34 = new class89(var4, 4, var35 + 4, var13, var2, var3, var16.field728, var16.field737, (class295)null);
								}

								var43.method1568(var0, var2, var3, var24, (class295)var33, (class295)var34, 256, var5, class71.field647[var5] * var36, var36 * class71.field635[var5], var27, var29);
							}
						}
					}
				} else {
					if (var16.field728 == -1 && var16.field745 == null) {
						var30 = var16.method367(10, var5, var23, var25, var24, var26);
					} else {
						var30 = new class89(var4, 10, var5, var13, var2, var3, var16.field728, var16.field737, (class295)null);
					}

					if (null != var30) {
						var43.method1569(var0, var2, var3, var24, var17, var18, (class295)var30, var6 == 11 ? 256 : 0, var27, var29);
					}

					if (0 != var16.field717) {
						var15.method2093(var2, var3, var17, var18, var16.field730);
					}
				}
			}
		}

	}
}
