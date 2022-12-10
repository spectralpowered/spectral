public class class122 extends class409 {
	public static client field1212;
	static class337 field1213;
	final boolean field1216;

	public class122(boolean var1) {
		this.field1216 = var1;
	}

	int method2306(class391 var1, class391 var2) {
		if (var2.field4521 != var1.field4521) {
			return this.field1216 ? var1.field4521 - var2.field4521 : var2.field4521 - var1.field4521;
		} else {
			return this.method7584(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2306((class391)var1, (class391)var2);
	}

	static final void method2313(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (client.field1743 && var0 != class384.field4486) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = class33.field194.method4331(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = class33.field194.method4276(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = class33.field194.method4311(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = class33.field194.method4181(var0, var2, var3);
			}

			int var13;
			if (0L != var8) {
				var13 = class33.field194.method4275(var0, var2, var3, var8);
				int var40 = class215.method4664(var8);
				int var41 = var13 & 31;
				int var42 = var13 >> 6 & 3;
				class196 var14;
				if (var1 == 0) {
					class33.field194.method4264(var0, var2, var3);
					var14 = class165.method2780(var40);
					if (0 != var14.field2175) {
						client.field1758[var0].method4033(var2, var3, var41, var42, var14.field2188);
					}
				}

				if (var1 == 1) {
					class33.field194.method4292(var0, var2, var3);
				}

				if (var1 == 2) {
					class33.field194.method4231(var0, var2, var3);
					var14 = class165.method2780(var40);
					if (var2 + var14.field2178 > 103 || var14.field2178 + var3 > 103 || var2 + var14.field2179 > 103 || var14.field2179 + var3 > 103) {
						return;
					}

					if (var14.field2175 != 0) {
						client.field1758[var0].method4048(var2, var3, var14.field2178, var14.field2179, var42, var14.field2188);
					}
				}

				if (var1 == 3) {
					class33.field194.method4172(var0, var2, var3);
					var14 = class165.method2780(var40);
					if (1 == var14.field2175) {
						client.field1758[var0].method4060(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (class84.field773[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				class211 var43 = class33.field194;
				class205 var15 = client.field1758[var0];
				class196 var16 = class165.method2780(var4);
				int var17;
				int var18;
				if (var5 != 1 && var5 != 3) {
					var17 = var16.field2178;
					var18 = var16.field2179;
				} else {
					var17 = var16.field2179;
					var18 = var16.field2178;
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

				int[][] var23 = class84.field765[var13];
				int var24 = var23[var20][var22] + var23[var19][var21] + var23[var20][var21] + var23[var19][var22] >> 2;
				int var25 = (var2 << 7) + (var17 << 6);
				int var26 = (var18 << 6) + (var3 << 7);
				long var27 = class40.method601(var2, var3, 2, 0 == var16.field2182, var4);
				int var29 = var6 + (var5 << 6);
				if (var16.field2203 == 1) {
					var29 += 256;
				}

				Object var30;
				if (var6 == 22) {
					if (-1 == var16.field2186 && var16.field2204 == null) {
						var30 = var16.method3824(22, var5, var23, var25, var24, var26);
					} else {
						var30 = new class63(var4, 22, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
					}

					var43.method4158(var0, var2, var3, var24, (class226)var30, var27, var29);
					if (var16.field2175 == 1) {
						var15.method4031(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var16.field2186 == -1 && null == var16.field2204) {
							var30 = var16.method3824(var6, var5, var23, var25, var24, var26);
						} else {
							var30 = new class63(var4, var6, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
						}

						var43.method4162(var0, var2, var3, var24, 1, 1, (class226)var30, 0, var27, var29);
						if (0 != var16.field2175) {
							var15.method4063(var2, var3, var17, var18, var16.field2188);
						}
					} else if (var6 == 0) {
						if (var16.field2186 == -1 && null == var16.field2204) {
							var30 = var16.method3824(0, var5, var23, var25, var24, var26);
						} else {
							var30 = new class63(var4, 0, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
						}

						var43.method4160(var0, var2, var3, var24, (class226)var30, (class226)null, class84.field771[var5], 0, var27, var29);
						if (var16.field2175 != 0) {
							var15.method4028(var2, var3, var6, var5, var16.field2188);
						}
					} else if (var6 == 1) {
						if (var16.field2186 == -1 && null == var16.field2204) {
							var30 = var16.method3824(1, var5, var23, var25, var24, var26);
						} else {
							var30 = new class63(var4, 1, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
						}

						var43.method4160(var0, var2, var3, var24, (class226)var30, (class226)null, class84.field775[var5], 0, var27, var29);
						if (0 != var16.field2175) {
							var15.method4028(var2, var3, var6, var5, var16.field2188);
						}
					} else {
						int var36;
						if (var6 == 2) {
							var36 = var5 + 1 & 3;
							Object var31;
							Object var32;
							if (-1 == var16.field2186 && null == var16.field2204) {
								var31 = var16.method3824(2, var5 + 4, var23, var25, var24, var26);
								var32 = var16.method3824(2, var36, var23, var25, var24, var26);
							} else {
								var31 = new class63(var4, 2, var5 + 4, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
								var32 = new class63(var4, 2, var36, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
							}

							var43.method4160(var0, var2, var3, var24, (class226)var31, (class226)var32, class84.field771[var5], class84.field771[var36], var27, var29);
							if (var16.field2175 != 0) {
								var15.method4028(var2, var3, var6, var5, var16.field2188);
							}
						} else if (var6 == 3) {
							if (var16.field2186 == -1 && var16.field2204 == null) {
								var30 = var16.method3824(3, var5, var23, var25, var24, var26);
							} else {
								var30 = new class63(var4, 3, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
							}

							var43.method4160(var0, var2, var3, var24, (class226)var30, (class226)null, class84.field775[var5], 0, var27, var29);
							if (var16.field2175 != 0) {
								var15.method4028(var2, var3, var6, var5, var16.field2188);
							}
						} else if (var6 == 9) {
							if (var16.field2186 == -1 && var16.field2204 == null) {
								var30 = var16.method3824(var6, var5, var23, var25, var24, var26);
							} else {
								var30 = new class63(var4, var6, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
							}

							var43.method4162(var0, var2, var3, var24, 1, 1, (class226)var30, 0, var27, var29);
							if (var16.field2175 != 0) {
								var15.method4063(var2, var3, var17, var18, var16.field2188);
							}
						} else if (var6 == 4) {
							if (-1 == var16.field2186 && null == var16.field2204) {
								var30 = var16.method3824(4, var5, var23, var25, var24, var26);
							} else {
								var30 = new class63(var4, 4, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
							}

							var43.method4161(var0, var2, var3, var24, (class226)var30, (class226)null, class84.field771[var5], 0, 0, 0, var27, var29);
						} else {
							Object var33;
							long var37;
							if (var6 == 5) {
								var36 = 16;
								var37 = var43.method4331(var0, var2, var3);
								if (var37 != 0L) {
									var36 = class165.method2780(class215.method4664(var37)).field2187;
								}

								if (var16.field2186 == -1 && null == var16.field2204) {
									var33 = var16.method3824(4, var5, var23, var25, var24, var26);
								} else {
									var33 = new class63(var4, 4, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
								}

								var43.method4161(var0, var2, var3, var24, (class226)var33, (class226)null, class84.field771[var5], 0, class84.field774[var5] * var36, class84.field768[var5] * var36, var27, var29);
							} else if (var6 == 6) {
								var36 = 8;
								var37 = var43.method4331(var0, var2, var3);
								if (var37 != 0L) {
									var36 = class165.method2780(class215.method4664(var37)).field2187 / 2;
								}

								if (var16.field2186 == -1 && null == var16.field2204) {
									var33 = var16.method3824(4, var5 + 4, var23, var25, var24, var26);
								} else {
									var33 = new class63(var4, 4, var5 + 4, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
								}

								var43.method4161(var0, var2, var3, var24, (class226)var33, (class226)null, 256, var5, class84.field776[var5] * var36, class84.field764[var5] * var36, var27, var29);
							} else if (var6 == 7) {
								int var39 = var5 + 2 & 3;
								if (-1 == var16.field2186 && var16.field2204 == null) {
									var30 = var16.method3824(4, var39 + 4, var23, var25, var24, var26);
								} else {
									var30 = new class63(var4, 4, var39 + 4, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
								}

								var43.method4161(var0, var2, var3, var24, (class226)var30, (class226)null, 256, var39, 0, 0, var27, var29);
							} else if (var6 == 8) {
								var36 = 8;
								var37 = var43.method4331(var0, var2, var3);
								if (0L != var37) {
									var36 = class165.method2780(class215.method4664(var37)).field2187 / 2;
								}

								int var35 = var5 + 2 & 3;
								Object var34;
								if (var16.field2186 == -1 && null == var16.field2204) {
									var33 = var16.method3824(4, var5 + 4, var23, var25, var24, var26);
									var34 = var16.method3824(4, var35 + 4, var23, var25, var24, var26);
								} else {
									var33 = new class63(var4, 4, var5 + 4, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
									var34 = new class63(var4, 4, var35 + 4, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
								}

								var43.method4161(var0, var2, var3, var24, (class226)var33, (class226)var34, 256, var5, class84.field776[var5] * var36, var36 * class84.field764[var5], var27, var29);
							}
						}
					}
				} else {
					if (var16.field2186 == -1 && var16.field2204 == null) {
						var30 = var16.method3824(10, var5, var23, var25, var24, var26);
					} else {
						var30 = new class63(var4, 10, var5, var13, var2, var3, var16.field2186, var16.field2195, (class226)null);
					}

					if (null != var30) {
						var43.method4162(var0, var2, var3, var24, var17, var18, (class226)var30, var6 == 11 ? 256 : 0, var27, var29);
					}

					if (0 != var16.field2175) {
						var15.method4063(var2, var3, var17, var18, var16.field2188);
					}
				}
			}
		}

	}
}
