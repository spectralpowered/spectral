public class class125 {
	static int field1261;
	boolean field1239;
	boolean field1248;
	boolean field1254;
	boolean field1258;
	class120 field1240;
	class120 field1241;
	class121[] field1242;
	float field1238;
	float field1244;
	float field1245;
	float field1246;
	float field1249;
	float field1250;
	float field1251;
	float field1252;
	float field1253;
	float field1255;
	float field1259;
	float field1260;
	float[] field1247;
	int field1243;
	int field1256;
	int field1257;

	class125() {
		this.field1254 = true;
		this.field1257 = 0;
	}

	int method2361(class467 var1, int var2) {
		int var4 = var1.method8328();
		class155.method1066(var1.method8326());
		int var6 = var1.method8326();
		class120 var7 = (class120)class78.method1584(class120.method5437(), var6);
		if (var7 == null) {
			var7 = class120.field1201;
		}

		this.field1240 = var7;
		int var8 = var1.method8326();
		class120 var9 = (class120)class78.method1584(class120.method5437(), var8);
		if (null == var9) {
			var9 = class120.field1201;
		}

		this.field1241 = var9;
		this.field1248 = var1.method8326() != 0;
		this.field1242 = new class121[var4];
		class121 var12 = null;

		int var10;
		for (var10 = 0; var10 < var4; ++var10) {
			class121 var11 = new class121();
			var11.method2302(var1, var2);
			this.field1242[var10] = var11;
			if (null != var12) {
				var12.field1208 = var11;
			}

			var12 = var11;
		}

		this.field1243 = this.field1242[0].field1209;
		this.field1256 = this.field1242[this.method2365() - 1].field1209;
		this.field1247 = new float[this.method2362() + 1];

		for (var10 = this.method2364(); var10 <= this.method2360(); ++var10) {
			this.field1247[var10 - this.method2364()] = class193.method3751(this, (float)var10);
		}

		this.field1242 = null;
		this.field1259 = class193.method3751(this, (float)(this.method2364() - 1));
		this.field1255 = class193.method3751(this, (float)(this.method2360() + 1));
		return var4;
	}

	public static class491 method2359(class337 var0, int var1, int var2) {
		byte[] var5 = var0.method6374(var1, var2);
		boolean var4;
		if (var5 == null) {
			var4 = false;
		} else {
			class165.method2776(var5);
			var4 = true;
		}

		return !var4 ? null : class477.method6472();
	}

	public float method2384(int var1) {
		if (var1 < this.method2364()) {
			return this.field1259;
		} else {
			return var1 > this.method2360() ? this.field1255 : this.field1247[var1 - this.method2364()];
		}
	}

	int method2364() {
		return this.field1243;
	}

	int method2360() {
		return this.field1256;
	}

	int method2362() {
		return this.method2360() - this.method2364();
	}

	int method2363(float var1) {
		if (this.field1257 < 0 || (float)this.field1242[this.field1257].field1209 > var1 || null != this.field1242[this.field1257].field1208 && (float)this.field1242[this.field1257].field1208.field1209 <= var1) {
			if (var1 >= (float)this.method2364() && var1 <= (float)this.method2360()) {
				int var3 = this.method2365();
				int var4 = this.field1257;
				if (var3 > 0) {
					int var5 = 0;
					int var6 = var3 - 1;

					do {
						int var7 = var6 + var5 >> 1;
						if (var1 < (float)this.field1242[var7].field1209) {
							if (var1 > (float)this.field1242[var7 - 1].field1209) {
								var4 = var7 - 1;
								break;
							}

							var6 = var7 - 1;
						} else {
							if (var1 <= (float)this.field1242[var7].field1209) {
								var4 = var7;
								break;
							}

							if (var1 < (float)this.field1242[var7 + 1].field1209) {
								var4 = var7;
								break;
							}

							var5 = var7 + 1;
						}
					} while(var5 <= var6);
				}

				if (this.field1257 != var4) {
					this.field1257 = var4;
					this.field1254 = true;
				}

				return this.field1257;
			} else {
				return -1;
			}
		} else {
			return this.field1257;
		}
	}

	static void method2388(class80 var0, int var1, int var2) {
		Object[] var4 = var0.field735;
		class65 var5;
		int var21;
		if (class94.method2018(var0.field742)) {
			class362.field4348 = (class271)var4[0];
			class169 var6 = class163.method2762(class362.field4348.field3169);
			var5 = class39.method508(var0.field742, var6.field1578, var6.field1598);
		} else {
			var21 = (Integer)var4[0];
			var5 = class203.method4006(var21);
		}

		if (null != var5) {
			class94.field920 = 0;
			class69.field581 = 0;
			var21 = -1;
			int[] var7 = var5.field524;
			int[] var8 = var5.field525;
			byte var9 = -1;
			class69.field582 = 0;
			class69.field584 = false;
			boolean var10 = false;
			int var11 = 0;
			boolean var31 = false;

			label947: {
				label948: {
					try {
						int var14;
						try {
							var31 = true;
							class69.field589 = new int[var5.field526];
							int var12 = 0;
							class408.field4616 = new String[var5.field528];
							int var13 = 0;

							int var15;
							String var22;
							for (var14 = 1; var14 < var4.length; ++var14) {
								if (var4[var14] instanceof Integer) {
									var15 = (Integer)var4[var14];
									if (var15 == -2147483647) {
										var15 = var0.field731;
									}

									if (var15 == -2147483646) {
										var15 = var0.field738;
									}

									if (var15 == -2147483645) {
										var15 = null != var0.field733 ? var0.field733.field3492 : -1;
									}

									if (var15 == -2147483644) {
										var15 = var0.field736;
									}

									if (var15 == -2147483643) {
										var15 = null != var0.field733 ? -915599827 * var0.field733.field3400 * 1271165349 : -1;
									}

									if (var15 == -2147483642) {
										var15 = var0.field745 != null ? var0.field745.field3492 : -1;
									}

									if (var15 == -2147483641) {
										var15 = var0.field745 != null ? var0.field745.field3400 : -1;
									}

									if (var15 == -2147483640) {
										var15 = var0.field734;
									}

									if (var15 == -2147483639) {
										var15 = var0.field739;
									}

									class69.field589[var12++] = var15;
								} else if (var4[var14] instanceof String) {
									var22 = (String)var4[var14];
									if (var22.equals("event_opbase")) {
										var22 = var0.field740;
									}

									class408.field4616[var13++] = var22;
								}
							}

							class69.field593 = var0.field741;

							label932:
							while (true) {
								++var11;
								if (var11 > var1) {
									throw new RuntimeException();
								}

								++var21;
								int var34 = var7[var21];
								if (var34 >= 100) {
									boolean var36;
									if (var5.field525[var21] == 1) {
										var36 = true;
									} else {
										var36 = false;
									}

									var15 = class54.method1054(var34, var5, var36);
									switch(var15) {
									case 0:
										var31 = false;
										break label932;
									case 1:
									default:
										break;
									case 2:
										throw new IllegalStateException();
									}
								} else if (var34 == CS2Opcodes.PUSH_CONSTANT_INT) {
									class69.field579[++class94.field920 - 1] = var8[var21];
								} else if (var34 == CS2Opcodes.PUSH_VAR) {
									var14 = var8[var21];
									class69.field579[++class94.field920 - 1] = class305.field3661[var14];
								} else if (var34 == CS2Opcodes.POP_VAR) {
									var14 = var8[var21];
									class305.field3661[var14] = class69.field579[--class94.field920];
									class97.method2040(var14);
								} else if (var34 == CS2Opcodes.PUSH_CONSTANT_STRING) {
									class69.field580[++class69.field581 - 1] = var5.field530[var21];
								} else if (var34 == CS2Opcodes.BRANCH) {
									var21 += var8[var21];
								} else if (var34 == CS2Opcodes.BRANCH_NOT) {
									class94.field920 -= 2;
									if (class69.field579[1 + class94.field920] != class69.field579[class94.field920]) {
										var21 += var8[var21];
									}
								} else if (var34 == CS2Opcodes.BRANCH_EQUALS) {
									class94.field920 -= 2;
									if (class69.field579[class94.field920] == class69.field579[class94.field920 + 1]) {
										var21 += var8[var21];
									}
								} else if (var34 == CS2Opcodes.BRANCH_LESS_THAN) {
									class94.field920 -= 2;
									if (class69.field579[class94.field920] < class69.field579[class94.field920 + 1]) {
										var21 += var8[var21];
									}
								} else if (var34 == CS2Opcodes.BRANCH_GREATER_THAN) {
									class94.field920 -= 2;
									if (class69.field579[class94.field920] > class69.field579[class94.field920 + 1]) {
										var21 += var8[var21];
									}
								} else if (var34 == CS2Opcodes.RETURN) {
									if (0 == class69.field582) {
										var31 = false;
										break label948;
									}

									class64 var41 = class69.field583[--class69.field582];
									var5 = var41.field520;
									var7 = var5.field524;
									var8 = var5.field525;
									var21 = var41.field519;
									class69.field589 = var41.field518;
									class408.field4616 = var41.field521;
								} else if (var34 == CS2Opcodes.PUSH_VARBIT) {
									var14 = var8[var21];
									class69.field579[++class94.field920 - 1] = class180.method2989(var14);
								} else if (var34 == CS2Opcodes.POP_VARBIT) {
									var14 = var8[var21];
									class73.method1439(var14, class69.field579[--class94.field920]);
								} else if (var34 == CS2Opcodes.BRANCH_LESS_THAN_OR_EQUALS) {
									class94.field920 -= 2;
									if (class69.field579[class94.field920] <= class69.field579[1 + class94.field920]) {
										var21 += var8[var21];
									}
								} else if (var34 == CS2Opcodes.BRANCH_GREATER_THAN_OR_EQUALS) {
									class94.field920 -= 2;
									if (class69.field579[class94.field920] >= class69.field579[class94.field920 + 1]) {
										var21 += var8[var21];
									}
								} else if (var34 == CS2Opcodes.PUSH_INT_LOCAL) {
									class69.field579[++class94.field920 - 1] = class69.field589[var8[var21]];
								} else if (var34 == CS2Opcodes.POP_INT_LOCAL) {
									class69.field589[var8[var21]] = class69.field579[--class94.field920];
								} else if (var34 == CS2Opcodes.PUSH_STRING_LOCAL) {
									class69.field580[++class69.field581 - 1] = class408.field4616[var8[var21]];
								} else if (var34 == CS2Opcodes.POP_STRING_LOCAL) {
									class408.field4616[var8[var21]] = class69.field580[--class69.field581];
								} else if (var34 == CS2Opcodes.JOIN_STRING) {
									var14 = var8[var21];
									class69.field581 -= var14;
									var22 = class213.method4350(class69.field580, class69.field581, var14);
									class69.field580[++class69.field581 - 1] = var22;
								} else if (var34 == CS2Opcodes.POP_INT_DISCARD) {
									--class94.field920;
								} else if (var34 == CS2Opcodes.POP_STRING_DISCARD) {
									--class69.field581;
								} else {
									int var18;
									if (var34 != CS2Opcodes.GOSUB_WITH_PARAMS) {
										if (var34 == CS2Opcodes.PUSH_VARC_INT) {
											class69.field579[++class94.field920 - 1] = class254.field2979.method2267(var8[var21]);
										} else if (var34 == CS2Opcodes.POP_VARC_INT) {
											class254.field2979.method2253(var8[var21], class69.field579[--class94.field920]);
										} else if (var34 == CS2Opcodes.DEFINE_ARRAY) {
											var14 = var8[var21] >> 16;
											var15 = var8[var21] & 65535;
											int var25 = class69.field579[--class94.field920];
											if (var25 < 0 || var25 > 5000) {
												throw new RuntimeException();
											}

											class69.field577[var14] = var25;
											byte var26 = -1;
											if (var15 == 105) {
												var26 = 0;
											}

											for (var18 = 0; var18 < var25; ++var18) {
												class69.field578[var14][var18] = var26;
											}
										} else if (var34 == CS2Opcodes.PUSH_ARRAY_INT) {
											var14 = var8[var21];
											var15 = class69.field579[--class94.field920];
											if (var15 < 0 || var15 >= class69.field577[var14]) {
												throw new RuntimeException();
											}

											class69.field579[++class94.field920 - 1] = class69.field578[var14][var15];
										} else if (var34 == CS2Opcodes.POP_ARRAY_INT) {
											var14 = var8[var21];
											class94.field920 -= 2;
											var15 = class69.field579[class94.field920];
											if (var15 < 0 || var15 >= class69.field577[var14]) {
												throw new RuntimeException();
											}

											class69.field578[var14][var15] = class69.field579[class94.field920 + 1];
										} else {
											String var23;
											if (var34 == CS2Opcodes.PUSH_VARC_STRING_OLD) {
												var23 = class254.field2979.method2257(var8[var21]);
												if (null == var23) {
													var23 = class321.field3756;
												}

												class69.field580[++class69.field581 - 1] = var23;
											} else if (var34 == CS2Opcodes.POP_VARC_STRING_OLD) {
												class254.field2979.method2256(var8[var21], class69.field580[--class69.field581]);
											} else if (var34 == CS2Opcodes.PUSH_VARC_STRING) {
												var23 = class254.field2979.method2255(var8[var21]);
												class69.field580[++class69.field581 - 1] = var23;
											} else if (var34 == CS2Opcodes.POP_VARC_STRING) {
												class254.field2979.method2254(var8[var21], class69.field580[--class69.field581]);
											} else if (var34 == CS2Opcodes.SWITCH) {
												class454 var39 = var5.field531[var8[var21]];
												class429 var38 = (class429)var39.method8135((long)class69.field579[--class94.field920]);
												if (null != var38) {
													var21 += var38.field4774;
												}
											} else {
												Integer var40;
												if (var34 == CS2Opcodes.PUSH_VARCLANSETTING) {
													var40 = class114.field1157.method2573(var8[var21]);
													if (null == var40) {
														class69.field579[++class94.field920 - 1] = -1;
													} else {
														class69.field579[++class94.field920 - 1] = var40;
													}
												} else {
													if (var34 != CS2Opcodes.PUSH_VARCLAN) {
														throw new IllegalStateException();
													}

													var40 = class93.field910.method7269(var8[var21]);
													if (var40 == null) {
														class69.field579[++class94.field920 - 1] = -1;
													} else {
														class69.field579[++class94.field920 - 1] = var40;
													}
												}
											}
										}
									} else {
										var14 = var8[var21];
										class65 var37 = class203.method4006(var14);
										int[] var16 = new int[var37.field526];
										String[] var17 = new String[var37.field528];

										for (var18 = 0; var18 < var37.field533; ++var18) {
											var16[var18] = class69.field579[var18 + (class94.field920 - var37.field533)];
										}

										for (var18 = 0; var18 < var37.field527; ++var18) {
											var17[var18] = class69.field580[var18 + (class69.field581 - var37.field527)];
										}

										class94.field920 -= var37.field533;
										class69.field581 -= var37.field527;
										class64 var24 = new class64();
										var24.field520 = var5;
										var24.field519 = var21;
										var24.field518 = class69.field589;
										var24.field521 = class408.field4616;
										class69.field583[++class69.field582 - 1] = var24;
										var5 = var37;
										var7 = var37.field524;
										var8 = var37.field525;
										var21 = -1;
										class69.field589 = var16;
										class408.field4616 = var17;
									}
								}
							}
						} catch (Exception var32) {
							var10 = true;
							StringBuilder var28 = new StringBuilder(30);
							var28.append("").append(var5.field4773).append(" ");

							for (var14 = class69.field582 - 1; var14 >= 0; --var14) {
								var28.append("").append(class69.field583[var14].field520.field4773).append(" ");
							}

							var28.append("").append(var9);
							class150.method2660(var28.toString(), var32);
							var31 = false;
							break label947;
						}
					} finally {
						if (var31) {
							while (class69.field586.size() > 0) {
								class100 var20 = (class100)class69.field586.remove(0);
								class219.method4528(var20.method2064(), var20.method2065(), var20.method2066(), var20.method2071(), "");
							}

							if (class69.field584) {
								class69.field584 = false;
								class247.method4893();
							}

							if (!var10 && var2 > 0 && var11 >= var2) {
								class150.method2660("Warning: Script " + var5.field523 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
							}

						}
					}

					while (class69.field586.size() > 0) {
						class100 var35 = (class100)class69.field586.remove(0);
						class219.method4528(var35.method2064(), var35.method2065(), var35.method2066(), var35.method2071(), "");
					}

					if (class69.field584) {
						class69.field584 = false;
						class247.method4893();
					}

					if (!var10 && var2 > 0 && var11 >= var2) {
						class150.method2660("Warning: Script " + var5.field523 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
					}

					return;
				}

				while (class69.field586.size() > 0) {
					class100 var42 = (class100)class69.field586.remove(0);
					class219.method4528(var42.method2064(), var42.method2065(), var42.method2066(), var42.method2071(), "");
				}

				if (class69.field584) {
					class69.field584 = false;
					class247.method4893();
				}

				if (!var10 && var2 > 0 && var11 >= var2) {
					class150.method2660("Warning: Script " + var5.field523 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
				}

				return;
			}

			while (class69.field586.size() > 0) {
				class100 var27 = (class100)class69.field586.remove(0);
				class219.method4528(var27.method2064(), var27.method2065(), var27.method2066(), var27.method2071(), "");
			}

			if (class69.field584) {
				class69.field584 = false;
				class247.method4893();
			}

			if (!var10 && var2 > 0 && var11 >= var2) {
				class150.method2660("Warning: Script " + var5.field523 + " finished at op count " + var11 + " of max " + var1, (Throwable)null);
			}

		}
	}

	class121 method2368(float var1) {
		int var3 = this.method2363(var1);
		return var3 >= 0 && var3 < this.field1242.length ? this.field1242[var3] : null;
	}

	int method2365() {
		return this.field1242 == null ? 0 : this.field1242.length;
	}

	public static void method2358(class467 var0, int var1) {
		if (null != class163.field1515) {
			try {
				class163.field1515.method8029(0L);
				class163.field1515.method8027(var0.field4917, var1, 24);
			} catch (Exception var4) {
			}
		}

	}

	static final String method2389(int var0, int var1) {
		int var3 = var1 - var0;
		if (var3 < -9) {
			return class79.method2039(16711680);
		} else if (var3 < -6) {
			return class79.method2039(16723968);
		} else if (var3 < -3) {
			return class79.method2039(16740352);
		} else if (var3 < 0) {
			return class79.method2039(16756736);
		} else if (var3 > 9) {
			return class79.method2039(65280);
		} else if (var3 > 6) {
			return class79.method2039(4259584);
		} else if (var3 > 3) {
			return class79.method2039(8453888);
		} else {
			return var3 > 0 ? class79.method2039(12648192) : class79.method2039(16776960);
		}
	}
}
