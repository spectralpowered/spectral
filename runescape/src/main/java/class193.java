public class class193 extends class439 {
	public static class282 field2120;
	public static class337 field2119;
	public boolean field2123;
	public int field2121;
	public int field2122;
	public int field2124;
	public int field2125;
	public int field2126;
	public int field2127;
	public int field2128;
	public int field2129;
	public int field2130;

	public class193() {
		this.field2121 = 0;
		this.field2122 = -1;
		this.field2123 = true;
		this.field2124 = -1;
	}

	static {
		field2120 = new class282(64);
	}

	static float method3751(class125 var0, float var1) {
		if (var0 != null && var0.method2365() != 0) {
			if (var1 < (float)var0.field1242[0].field1209) {
				return class120.field1201 == var0.field1240 ? var0.field1242[0].field1204 : class61.method1148(var0, var1, true);
			} else if (var1 > (float)var0.field1242[var0.method2365() - 1].field1209) {
				return class120.field1201 == var0.field1241 ? var0.field1242[var0.method2365() - 1].field1204 : class61.method1148(var0, var1, false);
			} else if (var0.field1239) {
				return var0.field1242[0].field1204;
			} else {
				class121 var3 = var0.method2368(var1);
				boolean var4 = false;
				boolean var5 = false;
				if (var3 == null) {
					return 0.0F;
				} else {
					if ((double)var3.field1207 == 0.0D && 0.0D == (double)var3.field1205) {
						var4 = true;
					} else if (var3.field1207 == Float.MAX_VALUE && var3.field1205 == Float.MAX_VALUE) {
						var5 = true;
					} else if (var3.field1208 != null) {
						if (var0.field1254) {
							float var6 = (float)var3.field1209;
							float var10 = var3.field1204;
							float var7 = var6 + var3.field1207 * 0.33333334F;
							float var11 = var3.field1205 * 0.33333334F + var10;
							float var9 = (float)var3.field1208.field1209;
							float var13 = var3.field1208.field1204;
							float var8 = var9 - var3.field1208.field1203 * 0.33333334F;
							float var12 = var13 - var3.field1208.field1206 * 0.33333334F;
							if (var0.field1248) {
								float var16 = var11;
								float var17 = var12;
								if (var0 != null) {
									float var18 = var9 - var6;
									if ((double)var18 != 0.0D) {
										float var19 = var7 - var6;
										float var20 = var8 - var6;
										float[] var21 = new float[]{var19 / var18, var20 / var18};
										var0.field1258 = var21[0] == 0.33333334F && 0.6666667F == var21[1];
										float var22 = var21[0];
										float var23 = var21[1];
										if ((double)var21[0] < 0.0D) {
											var21[0] = 0.0F;
										}

										if ((double)var21[1] > 1.0D) {
											var21[1] = 1.0F;
										}

										float var24;
										float var25;
										float var26;
										float var27;
										float var28;
										if ((double)var21[0] > 1.0D || var21[1] < -1.0F) {
											var21[1] = 1.0F - var21[1];
											if (var21[0] < 0.0F) {
												var21[0] = 0.0F;
											}

											if (var21[1] < 0.0F) {
												var21[1] = 0.0F;
											}

											if (var21[0] > 1.0F || var21[1] > 1.0F) {
												var24 = (float)(1.0D + (double)(var21[0] * (var21[0] - 2.0F + var21[1])) + ((double)var21[1] - 2.0D) * (double)var21[1]);
												if (var24 + class106.field1088 > 0.0F) {
													if (class106.field1088 + var21[0] < 1.3333334F) {
														var25 = var21[0] - 2.0F;
														var26 = var21[0] - 1.0F;
														var27 = (float)Math.sqrt((double)(var25 * var25 - var26 * 4.0F * var26));
														var28 = (-var25 + var27) * 0.5F;
														if (var21[1] + class106.field1088 > var28) {
															var21[1] = var28 - class106.field1088;
														} else {
															var28 = 0.5F * (-var25 - var27);
															if (var21[1] < var28 + class106.field1088) {
																var21[1] = var28 + class106.field1088;
															}
														}
													} else {
														var21[0] = 1.3333334F - class106.field1088;
														var21[1] = 0.33333334F - class106.field1088;
													}
												}
											}

											var21[1] = 1.0F - var21[1];
										}

										if (var22 != var21[0]) {
											float var10000 = var6 + var18 * var21[0];
											if (0.0D != (double)var22) {
												var16 = var10 + var21[0] * (var11 - var10) / var22;
											}
										}

										if (var21[1] != var23) {
											float var15 = var21[1] * var18 + var6;
											if ((double)var23 != 1.0D) {
												var17 = (float)((double)var13 - (1.0D - (double)var21[1]) * (double)(var13 - var12) / (1.0D - (double)var23));
											}
										}

										var0.field1244 = var6;
										var0.field1245 = var9;
										var24 = var21[0];
										var25 = var21[1];
										var26 = var24 - 0.0F;
										var27 = var25 - var24;
										var28 = 1.0F - var25;
										float var29 = var27 - var26;
										var0.field1249 = var28 - var27 - var29;
										var0.field1238 = var29 + var29 + var29;
										var0.field1260 = var26 + var26 + var26;
										var0.field1246 = 0.0F;
										var26 = var16 - var10;
										var27 = var17 - var16;
										var28 = var13 - var17;
										var29 = var27 - var26;
										var0.field1253 = var28 - var27 - var29;
										var0.field1252 = var29 + var29 + var29;
										var0.field1251 = var26 + var26 + var26;
										var0.field1250 = var10;
									}
								}
							} else {
								class106.method6201(var0, var6, var7, var8, var9, var10, var11, var12, var13);
							}

							var0.field1254 = false;
						}
					} else {
						var4 = true;
					}

					if (var4) {
						return var3.field1204;
					} else if (var5) {
						return var1 != (float)var3.field1209 && var3.field1208 != null ? var3.field1208.field1204 : var3.field1204;
					} else {
						return var0.field1248 ? class41.method720(var0, var1) : class89.method1953(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	public void method3752() {
		if (-1 != this.field2124) {
			this.method3764(this.field2124);
			this.field2128 = this.field2127;
			this.field2129 = this.field2125;
			this.field2130 = this.field2126;
		}

		this.method3764(this.field2121);
	}

	public void method3753(class467 var1, int var2) {
		while (true) {
			int var4 = var1.method8326();
			if (var4 == 0) {
				return;
			}

			this.method3754(var1, var4, var2);
		}
	}

	void method3754(class467 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2121 = var1.method8330();
		} else if (var2 == 2) {
			this.field2122 = var1.method8326();
		} else if (var2 == 5) {
			this.field2123 = false;
		} else if (var2 == 7) {
			this.field2124 = var1.method8330();
		} else if (var2 == 8) {
		}

	}

	void method3764(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var9 + var11) / 2.0D;
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var11 == var5) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var7 == var11) {
				var13 = (var3 - var5) / (var11 - var9) + 4.0D;
			}
		}

		var13 /= 6.0D;
		this.field2127 = (int)(var13 * 256.0D);
		this.field2125 = (int)(var15 * 256.0D);
		this.field2126 = (int)(var17 * 256.0D);
		if (this.field2125 < 0) {
			this.field2125 = 0;
		} else if (this.field2125 > 255) {
			this.field2125 = 255;
		}

		if (this.field2126 < 0) {
			this.field2126 = 0;
		} else if (this.field2126 > 255) {
			this.field2126 = 255;
		}

	}

	public static void method2668() {
		field2120.method5357();
	}
}
