public final class class484 {
	static class474 field5034;

	static {
		field5034 = new class474();
	}

	class484() throws Throwable {
		throw new Error();
	}

	public static int method8791(byte[] var0, int var1, byte[] var2, int var3, int var4) {
		synchronized(field5034) {
			field5034.field4963 = var2;
			field5034.field4957 = var4;
			field5034.field4959 = var0;
			field5034.field4960 = 0;
			field5034.field4961 = var1;
			field5034.field4966 = 0;
			field5034.field4981 = 0;
			field5034.field4958 = 0;
			field5034.field4965 = 0;
			method8793(field5034);
			var1 -= field5034.field4961;
			field5034.field4963 = null;
			field5034.field4959 = null;
			return var1;
		}
	}

	static void method8794(class474 var0) {
		byte var2 = var0.field4971;
		int var3 = var0.field4964;
		int var4 = var0.field4972;
		int var5 = var0.field4970;
		int[] var6 = class474.field4974;
		int var7 = var0.field4969;
		byte[] var8 = var0.field4959;
		int var9 = var0.field4960;
		int var10 = var0.field4961;
		int var12 = var0.field4988 + 1;

		label61:
		while (true) {
			if (var3 > 0) {
				while (true) {
					if (var10 == 0) {
						break label61;
					}

					if (var3 == 1) {
						if (var10 == 0) {
							var3 = 1;
							break label61;
						}

						var8[var9] = var2;
						++var9;
						--var10;
						break;
					}

					var8[var9] = var2;
					--var3;
					++var9;
					--var10;
				}
			}

			while (var4 != var12) {
				var2 = (byte)var5;
				var7 = var6[var7];
				byte var1 = (byte)var7;
				var7 >>= 8;
				++var4;
				if (var1 != var5) {
					var5 = var1;
					if (var10 == 0) {
						var3 = 1;
						break label61;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				} else {
					if (var4 != var12) {
						var3 = 2;
						var7 = var6[var7];
						var1 = (byte)var7;
						var7 >>= 8;
						++var4;
						if (var4 != var12) {
							if (var1 != var5) {
								var5 = var1;
							} else {
								var3 = 3;
								var7 = var6[var7];
								var1 = (byte)var7;
								var7 >>= 8;
								++var4;
								if (var4 != var12) {
									if (var1 != var5) {
										var5 = var1;
									} else {
										var7 = var6[var7];
										var1 = (byte)var7;
										var7 >>= 8;
										++var4;
										var3 = (var1 & 255) + 4;
										var7 = var6[var7];
										var5 = (byte)var7;
										var7 >>= 8;
										++var4;
									}
								}
							}
						}
						continue label61;
					}

					if (var10 == 0) {
						var3 = 1;
						break label61;
					}

					var8[var9] = var2;
					++var9;
					--var10;
				}
			}

			var3 = 0;
			break;
		}

		int var13 = var0.field4965;
		var0.field4965 += var10 - var10;
		if (var0.field4965 < var13) {
		}

		var0.field4971 = var2;
		var0.field4964 = var3;
		var0.field4972 = var4;
		var0.field4970 = var5;
		class474.field4974 = var6;
		var0.field4969 = var7;
		var0.field4959 = var8;
		var0.field4960 = var9;
		var0.field4961 = var10;
	}

	static void method8793(class474 var0) {
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		boolean var20 = false;
		boolean var21 = false;
		int var22 = 0;
		int[] var23 = null;
		int[] var24 = null;
		int[] var25 = null;
		var0.field4956 = 2039955545;
		if (class474.field4974 == null) {
			class474.field4974 = new int[var0.field4956 * 881977248];
		}

		boolean var26 = true;

		while (true) {
			while (var26) {
				byte var1 = method8818(var0);
				if (var1 == 23) {
					return;
				}

				var1 = method8818(var0);
				var1 = method8818(var0);
				var1 = method8818(var0);
				var1 = method8818(var0);
				var1 = method8818(var0);
				var1 = method8818(var0);
				var1 = method8818(var0);
				var1 = method8818(var0);
				var1 = method8818(var0);
				var1 = method8796(var0);
				if (var1 != 0) {
				}

				var0.field4968 = 0;
				var1 = method8818(var0);
				var0.field4968 = var0.field4968 << 8 | var1 & 255;
				var1 = method8818(var0);
				var0.field4968 = var0.field4968 << 8 | var1 & 255;
				var1 = method8818(var0);
				var0.field4968 = var0.field4968 << 8 | var1 & 255;

				int var36;
				for (var36 = 0; var36 < 16; ++var36) {
					var1 = method8796(var0);
					if (var1 == 1) {
						var0.field4977[var36] = true;
					} else {
						var0.field4977[var36] = false;
					}
				}

				for (var36 = 0; var36 < 256; ++var36) {
					var0.field4976[var36] = false;
				}

				int var37;
				for (var36 = 0; var36 < 16; ++var36) {
					if (var0.field4977[var36]) {
						for (var37 = 0; var37 < 16; ++var37) {
							var1 = method8796(var0);
							if (var1 == 1) {
								var0.field4976[var36 * 16 + var37] = true;
							}
						}
					}
				}

				method8797(var0);
				int var39 = var0.field4967 + 2;
				int var40 = method8816(3, var0);
				int var41 = method8816(15, var0);

				for (var36 = 0; var36 < var41; ++var36) {
					var37 = 0;

					while (true) {
						var1 = method8796(var0);
						if (var1 == 0) {
							var0.field4982[var36] = (byte)var37;
							break;
						}

						++var37;
					}
				}

				byte[] var27 = new byte[6];

				byte var29;
				for (var29 = 0; var29 < var40; var27[var29] = var29++) {
				}

				for (var36 = 0; var36 < var41; ++var36) {
					var29 = var0.field4982[var36];

					byte var28;
					for (var28 = var27[var29]; var29 > 0; --var29) {
						var27[var29] = var27[var29 - 1];
					}

					var27[0] = var28;
					var0.field4962[var36] = var28;
				}

				int var38;
				for (var38 = 0; var38 < var40; ++var38) {
					int var50 = method8816(5, var0);

					for (var36 = 0; var36 < var39; ++var36) {
						while (true) {
							var1 = method8796(var0);
							if (var1 == 0) {
								var0.field4980[var38][var36] = (byte)var50;
								break;
							}

							var1 = method8796(var0);
							if (var1 == 0) {
								++var50;
							} else {
								--var50;
							}
						}
					}
				}

				for (var38 = 0; var38 < var40; ++var38) {
					byte var2 = 32;
					byte var3 = 0;

					for (var36 = 0; var36 < var39; ++var36) {
						if (var0.field4980[var38][var36] > var3) {
							var3 = var0.field4980[var38][var36];
						}

						if (var0.field4980[var38][var36] < var2) {
							var2 = var0.field4980[var38][var36];
						}
					}

					method8798(var0.field4984[var38], var0.field4985[var38], var0.field4986[var38], var0.field4980[var38], var2, var3, var39);
					var0.field4987[var38] = var2;
				}

				int var42 = var0.field4967 + 1;
				int var43 = -1;
				byte var44 = 0;

				for (var36 = 0; var36 <= 255; ++var36) {
					var0.field4951[var36] = 0;
				}

				int var56 = 4095;

				int var35;
				int var55;
				for (var35 = 15; var35 >= 0; --var35) {
					for (var55 = 15; var55 >= 0; --var55) {
						var0.field4950[var56] = (byte)(var35 * 16 + var55);
						--var56;
					}

					var0.field4979[var35] = var56 + 1;
				}

				int var47 = 0;
				byte var54;
				if (var44 == 0) {
					++var43;
					var44 = 50;
					var54 = var0.field4962[var43];
					var22 = var0.field4987[var54];
					var23 = var0.field4984[var54];
					var25 = var0.field4986[var54];
					var24 = var0.field4985[var54];
				}

				int var45 = var44 - 1;
				int var51 = var22;

				int var52;
				byte var53;
				for (var52 = method8816(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
					++var51;
					var53 = method8796(var0);
				}

				int var46 = var25[var52 - var24[var51]];

				while (true) {
					int[] var10000;
					int var10002;
					while (var46 != var42) {
						if (var46 != 0 && var46 != 1) {
							int var33 = var46 - 1;
							int var30;
							if (var33 < 16) {
								var30 = var0.field4979[0];

								for (var1 = var0.field4950[var30 + var33]; var33 > 3; var33 -= 4) {
									int var34 = var30 + var33;
									var0.field4950[var34] = var0.field4950[var34 - 1];
									var0.field4950[var34 - 1] = var0.field4950[var34 - 2];
									var0.field4950[var34 - 2] = var0.field4950[var34 - 3];
									var0.field4950[var34 - 3] = var0.field4950[var34 - 4];
								}

								while (var33 > 0) {
									var0.field4950[var30 + var33] = var0.field4950[var30 + var33 - 1];
									--var33;
								}

								var0.field4950[var30] = var1;
							} else {
								int var31 = var33 / 16;
								int var32 = var33 % 16;
								var30 = var0.field4979[var31] + var32;

								for (var1 = var0.field4950[var30]; var30 > var0.field4979[var31]; --var30) {
									var0.field4950[var30] = var0.field4950[var30 - 1];
								}

								for (var10002 = var0.field4979[var31]++; var31 > 0; --var31) {
									var10002 = var0.field4979[var31]--;
									var0.field4950[var0.field4979[var31]] = var0.field4950[var0.field4979[var31 - 1] + 16 - 1];
								}

								var10002 = var0.field4979[0]--;
								var0.field4950[var0.field4979[0]] = var1;
								if (var0.field4979[0] == 0) {
									var56 = 4095;

									for (var35 = 15; var35 >= 0; --var35) {
										for (var55 = 15; var55 >= 0; --var55) {
											var0.field4950[var56] = var0.field4950[var0.field4979[var35] + var55];
											--var56;
										}

										var0.field4979[var35] = var56 + 1;
									}
								}
							}

							var10002 = var0.field4951[var0.field4975[var1 & 255] & 255]++;
							class474.field4974[var47] = var0.field4975[var1 & 255] & 255;
							++var47;
							if (var45 == 0) {
								++var43;
								var45 = 50;
								var54 = var0.field4962[var43];
								var22 = var0.field4987[var54];
								var23 = var0.field4984[var54];
								var25 = var0.field4986[var54];
								var24 = var0.field4985[var54];
							}

							--var45;
							var51 = var22;

							for (var52 = method8816(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
								++var51;
								var53 = method8796(var0);
							}

							var46 = var25[var52 - var24[var51]];
						} else {
							int var48 = -1;
							int var49 = 1;

							do {
								if (var46 == 0) {
									var48 += var49;
								} else if (var46 == 1) {
									var48 += var49 * 2;
								}

								var49 *= 2;
								if (var45 == 0) {
									++var43;
									var45 = 50;
									var54 = var0.field4962[var43];
									var22 = var0.field4987[var54];
									var23 = var0.field4984[var54];
									var25 = var0.field4986[var54];
									var24 = var0.field4985[var54];
								}

								--var45;
								var51 = var22;

								for (var52 = method8816(var22, var0); var52 > var23[var51]; var52 = var52 << 1 | var53) {
									++var51;
									var53 = method8796(var0);
								}

								var46 = var25[var52 - var24[var51]];
							} while(var46 == 0 || var46 == 1);

							++var48;
							var1 = var0.field4975[var0.field4950[var0.field4979[0]] & 255];
							var10000 = var0.field4951;

							for (var10000[var1 & 255] += var48; var48 > 0; --var48) {
								class474.field4974[var47] = var1 & 255;
								++var47;
							}
						}
					}

					var0.field4964 = 0;
					var0.field4971 = 0;
					var0.field4973[0] = 0;

					for (var36 = 1; var36 <= 256; ++var36) {
						var0.field4973[var36] = var0.field4951[var36 - 1];
					}

					for (var36 = 1; var36 <= 256; ++var36) {
						var10000 = var0.field4973;
						var10000[var36] += var0.field4973[var36 - 1];
					}

					for (var36 = 0; var36 < var47; ++var36) {
						var1 = (byte)(class474.field4974[var36] & 255);
						var10000 = class474.field4974;
						int var10001 = var0.field4973[var1 & 255];
						var10000[var10001] |= var36 << 8;
						var10002 = var0.field4973[var1 & 255]++;
					}

					var0.field4969 = class474.field4974[var0.field4968] >> 8;
					var0.field4972 = 0;
					var0.field4969 = class474.field4974[var0.field4969];
					var0.field4970 = (byte)(var0.field4969 & 255);
					var0.field4969 >>= 8;
					++var0.field4972;
					var0.field4988 = var47;
					method8794(var0);
					if (var0.field4972 == var0.field4988 + 1 && var0.field4964 == 0) {
						var26 = true;
						break;
					}

					var26 = false;
					break;
				}
			}

			return;
		}
	}

	static byte method8818(class474 var0) {
		return (byte)method8816(8, var0);
	}

	static byte method8796(class474 var0) {
		return (byte)method8816(1, var0);
	}

	static int method8816(int var0, class474 var1) {
		while (var1.field4966 < var0) {
			var1.field4981 = var1.field4981 << 8 | var1.field4963[var1.field4957] & 255;
			var1.field4966 += 8;
			++var1.field4957;
			++var1.field4958;
			if (var1.field4958 == 0) {
			}
		}

		int var2 = var1.field4981 >> var1.field4966 - var0 & (1 << var0) - 1;
		var1.field4966 -= var0;
		return var2;
	}

	static void method8797(class474 var0) {
		var0.field4967 = 0;

		for (int var1 = 0; var1 < 256; ++var1) {
			if (var0.field4976[var1]) {
				var0.field4975[var0.field4967] = (byte)var1;
				++var0.field4967;
			}
		}

	}

	static void method8798(int[] var0, int[] var1, int[] var2, byte[] var3, int var4, int var5, int var6) {
		int var7 = 0;

		int var8;
		for (var8 = var4; var8 <= var5; ++var8) {
			for (int var9 = 0; var9 < var6; ++var9) {
				if (var3[var9] == var8) {
					var2[var7] = var9;
					++var7;
				}
			}
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var1[var8] = 0;
		}

		for (var8 = 0; var8 < var6; ++var8) {
			++var1[var3[var8] + 1];
		}

		for (var8 = 1; var8 < 23; ++var8) {
			var1[var8] += var1[var8 - 1];
		}

		for (var8 = 0; var8 < 23; ++var8) {
			var0[var8] = 0;
		}

		int var10 = 0;

		for (var8 = var4; var8 <= var5; ++var8) {
			var10 += var1[var8 + 1] - var1[var8];
			var0[var8] = var10 - 1;
			var10 <<= 1;
		}

		for (var8 = var4 + 1; var8 <= var5; ++var8) {
			var1[var8] = (var0[var8 - 1] + 1 << 1) - var1[var8];
		}

	}
}
