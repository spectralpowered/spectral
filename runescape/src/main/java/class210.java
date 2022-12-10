import java.io.IOException;

public final class class210 {
	static int field2443;
	int field2433;
	int field2434;
	int field2435;
	int field2436;
	int field2438;
	int field2441;
	int field2442;
	int field2444;
	public class226 field2439;
	public class226 field2440;
	public long field2432;

	public static int method4149(CharSequence var0, CharSequence var1, class340 var2) {
		int var4 = var0.length();
		int var5 = var1.length();
		int var6 = 0;
		int var7 = 0;
		char var8 = 0;
		char var9 = 0;

		while (var6 - var8 < var4 || var7 - var9 < var5) {
			if (var6 - var8 >= var4) {
				return -1;
			}

			if (var7 - var9 >= var5) {
				return 1;
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var0.charAt(var6++);
			}

			char var11;
			if (var9 != 0) {
				var11 = var9;
				boolean var16 = false;
			} else {
				var11 = var1.charAt(var7++);
			}

			var8 = class250.method4950(var10);
			var9 = class250.method4950(var11);
			var10 = class175.method2947(var10, var2);
			var11 = class175.method2947(var11, var2);
			if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
				var10 = Character.toLowerCase(var10);
				var11 = Character.toLowerCase(var11);
				if (var11 != var10) {
					return class243.method4847(var10, var2) - class243.method4847(var11, var2);
				}
			}
		}

		int var17 = Math.min(var4, var5);

		char var13;
		int var18;
		for (var18 = 0; var18 < var17; ++var18) {
			if (var2 == class340.field4259) {
				var6 = var4 - 1 - var18;
				var7 = var5 - 1 - var18;
			} else {
				var7 = var18;
				var6 = var18;
			}

			char var12 = var0.charAt(var6);
			var13 = var1.charAt(var7);
			if (var12 != var13 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
				var12 = Character.toLowerCase(var12);
				var13 = Character.toLowerCase(var13);
				if (var13 != var12) {
					return class243.method4847(var12, var2) - class243.method4847(var13, var2);
				}
			}
		}

		var18 = var4 - var5;
		if (var18 != 0) {
			return var18;
		} else {
			for (int var19 = 0; var19 < var17; ++var19) {
				var13 = var0.charAt(var19);
				char var14 = var1.charAt(var19);
				if (var13 != var14) {
					return class243.method4847(var13, var2) - class243.method4847(var14, var2);
				}
			}

			return 0;
		}
	}

	class210() {
		this.field2432 = 0L;
		this.field2435 = 0;
	}

	public static boolean method4150() {
		long var1 = class74.method1493();
		int var3 = (int)(var1 - class334.field4198);
		class334.field4198 = var1;
		if (var3 > 200) {
			var3 = 200;
		}

		class334.field4214 += var3;
		if (class334.field4213 == 0 && 0 == class334.field4202 && class334.field4205 == 0 && 0 == class334.field4200) {
			return true;
		} else if (null == class334.field4215) {
			return false;
		} else {
			try {
				if (class334.field4214 > 30000) {
					throw new IOException();
				} else {
					class316 var4;
					class467 var5;
					while (class334.field4202 < 200 && class334.field4200 > 0) {
						var4 = (class316)class334.field4207.method8172();
						var5 = new class467(4);
						var5.method8323(1);
						var5.method8516((int)var4.field4773);
						class334.field4215.method7605(var5.field4917, 0, 4);
						class334.field4201.method8170(var4, var4.field4773);
						--class334.field4200;
						++class334.field4202;
					}

					while (class334.field4213 < 200 && class334.field4205 > 0) {
						var4 = (class316)class334.field4199.method6476();
						var5 = new class467(4);
						var5.method8323(0);
						var5.method8516((int)var4.field4773);
						class334.field4215.method7605(var5.field4917, 0, 4);
						var4.method7996();
						class334.field4206.method8170(var4, var4.field4773);
						--class334.field4205;
						++class334.field4213;
					}

					for (int var16 = 0; var16 < 100; ++var16) {
						int var17 = class334.field4215.method7606();
						if (var17 < 0) {
							throw new IOException();
						}

						if (var17 == 0) {
							break;
						}

						class334.field4214 = 0;
						byte var6 = 0;
						if (class198.field2231 == null) {
							var6 = 8;
						} else if (0 == class334.field4196) {
							var6 = 1;
						}

						int var7;
						int var8;
						int var9;
						int var11;
						byte[] var10000;
						int var10001;
						class467 var23;
						if (var6 > 0) {
							var7 = var6 - class334.field4208.field4915;
							if (var7 > var17) {
								var7 = var17;
							}

							class334.field4215.method7604(class334.field4208.field4917, class334.field4208.field4915, var7);
							if (class334.field4212 != 0) {
								for (var8 = 0; var8 < var7; ++var8) {
									var10000 = class334.field4208.field4917;
									var10001 = class334.field4208.field4915 + var8;
									var10000[var10001] ^= class334.field4212;
								}
							}

							var23 = class334.field4208;
							var23.field4915 += var7;
							if (class334.field4208.field4915 < var6) {
								break;
							}

							if (class198.field2231 == null) {
								class334.field4208.field4915 = 0;
								var8 = class334.field4208.method8326();
								var9 = class334.field4208.method8328();
								int var10 = class334.field4208.method8326();
								var11 = class334.field4208.method8480();
								long var12 = (long)((var8 << 16) + var9);
								class316 var14 = (class316)class334.field4201.method8177(var12);
								class158.field1492 = true;
								if (null == var14) {
									var14 = (class316)class334.field4206.method8177(var12);
									class158.field1492 = false;
								}

								if (null == var14) {
									throw new IOException();
								}

								int var15 = var10 == 0 ? 5 : 9;
								class198.field2231 = var14;
								class356.field4309 = new class467(class198.field2231.field3735 + var11 + var15);
								class356.field4309.method8323(var10);
								class356.field4309.method8312(var11);
								class334.field4196 = 8;
								class334.field4208.field4915 = 0;
							} else if (class334.field4196 == 0) {
								if (-1 == class334.field4208.field4917[0]) {
									class334.field4196 = 1;
									class334.field4208.field4915 = 0;
								} else {
									class198.field2231 = null;
								}
							}
						} else {
							var7 = class356.field4309.field4917.length - class198.field2231.field3735;
							var8 = 512 - class334.field4196;
							if (var8 > var7 - class356.field4309.field4915) {
								var8 = var7 - class356.field4309.field4915;
							}

							if (var8 > var17) {
								var8 = var17;
							}

							class334.field4215.method7604(class356.field4309.field4917, class356.field4309.field4915, var8);
							if (class334.field4212 != 0) {
								for (var9 = 0; var9 < var8; ++var9) {
									var10000 = class356.field4309.field4917;
									var10001 = class356.field4309.field4915 + var9;
									var10000[var10001] ^= class334.field4212;
								}
							}

							var23 = class356.field4309;
							var23.field4915 += var8;
							class334.field4196 += var8;
							if (class356.field4309.field4915 == var7) {
								if (class198.field2231.field4773 == 16711935L) {
									class164.field1529 = class356.field4309;

									for (var9 = 0; var9 < 256; ++var9) {
										class326 var18 = class334.field4211[var9];
										if (var18 != null) {
											class164.field1529.field4915 = 5 + var9 * 8;
											if (class164.field1529.field4915 >= class164.field1529.field4917.length) {
												if (!var18.field4132) {
													throw new RuntimeException("");
												}

												var18.method6207();
											} else {
												var11 = class164.field1529.method8480();
												int var19 = class164.field1529.method8480();
												var18.method6244(var11, var19);
											}
										}
									}
								} else {
									class334.field4210.reset();
									class334.field4210.update(class356.field4309.field4917, 0, var7);
									var9 = (int)class334.field4210.getValue();
									if (var9 != class198.field2231.field3733) {
										try {
											class334.field4215.method7609();
										} catch (Exception var21) {
										}

										++class334.field4217;
										class334.field4215 = null;
										class334.field4212 = (byte)((int)(Math.random() * 255.0D + 1.0D));
										return false;
									}

									class334.field4217 = 0;
									class334.field4203 = 0;
									class198.field2231.field3732.method6237((int)(class198.field2231.field4773 & 65535L), class356.field4309.field4917, 16711680L == (class198.field2231.field4773 & 16711680L), class158.field1492);
								}

								class198.field2231.method7951();
								if (class158.field1492) {
									--class334.field4202;
								} else {
									--class334.field4213;
								}

								class334.field4196 = 0;
								class198.field2231 = null;
								class356.field4309 = null;
							} else {
								if (class334.field4196 != 512) {
									break;
								}

								class334.field4196 = 0;
							}
						}
					}

					return true;
				}
			} catch (IOException var22) {
				try {
					class334.field4215.method7609();
				} catch (Exception var20) {
				}

				++class334.field4203;
				class334.field4215 = null;
				return false;
			}
		}
	}

	public static int method4146(CharSequence var0, int var1, int var2, byte[] var3, int var4) {
		int var6 = var2 - var1;

		for (int var7 = 0; var7 < var6; ++var7) {
			char var8 = var0.charAt(var7 + var1);
			if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
				var3[var7 + var4] = (byte)var8;
			} else if (var8 == 8364) {
				var3[var4 + var7] = -128;
			} else if (var8 == 8218) {
				var3[var7 + var4] = -126;
			} else if (var8 == 402) {
				var3[var7 + var4] = -125;
			} else if (var8 == 8222) {
				var3[var7 + var4] = -124;
			} else if (var8 == 8230) {
				var3[var4 + var7] = -123;
			} else if (var8 == 8224) {
				var3[var7 + var4] = -122;
			} else if (var8 == 8225) {
				var3[var4 + var7] = -121;
			} else if (var8 == 710) {
				var3[var7 + var4] = -120;
			} else if (var8 == 8240) {
				var3[var4 + var7] = -119;
			} else if (var8 == 352) {
				var3[var7 + var4] = -118;
			} else if (var8 == 8249) {
				var3[var7 + var4] = -117;
			} else if (var8 == 338) {
				var3[var7 + var4] = -116;
			} else if (var8 == 381) {
				var3[var7 + var4] = -114;
			} else if (var8 == 8216) {
				var3[var7 + var4] = -111;
			} else if (var8 == 8217) {
				var3[var4 + var7] = -110;
			} else if (var8 == 8220) {
				var3[var4 + var7] = -109;
			} else if (var8 == 8221) {
				var3[var7 + var4] = -108;
			} else if (var8 == 8226) {
				var3[var7 + var4] = -107;
			} else if (var8 == 8211) {
				var3[var4 + var7] = -106;
			} else if (var8 == 8212) {
				var3[var7 + var4] = -105;
			} else if (var8 == 732) {
				var3[var4 + var7] = -104;
			} else if (var8 == 8482) {
				var3[var4 + var7] = -103;
			} else if (var8 == 353) {
				var3[var7 + var4] = -102;
			} else if (var8 == 8250) {
				var3[var4 + var7] = -101;
			} else if (var8 == 339) {
				var3[var7 + var4] = -100;
			} else if (var8 == 382) {
				var3[var4 + var7] = -98;
			} else if (var8 == 376) {
				var3[var4 + var7] = -97;
			} else {
				var3[var4 + var7] = 63;
			}
		}

		return var6;
	}

	static int method4147(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.LOGOUT) {
			client.field1749 = 250;
			return 1;
		} else {
			return 2;
		}
	}
}
