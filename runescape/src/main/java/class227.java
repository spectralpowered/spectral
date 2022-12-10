public final class class227 {
	public static byte[][] field2749;
	static class469[] field2747;
	int field2741;
	int field2742;
	int field2746;
	int field2748;
	public class226 field2744;
	public long field2745;

	class227() {
	}

	static final void method4632(class98 var0, int var1) {
		class183 var3;
		class183 var4;
		int var5;
		int var13;
		int var15;
		if (var0.field1003 >= client.field1700) {
			client.method5369(var0);
		} else {
			int var6;
			int var8;
			int var9;
			if (var0.field1004 >= client.field1700) {
				boolean var12 = client.field1700 == var0.field1004 || var0.field989 == -1 || var0.field992 != 0;
				if (!var12) {
					var4 = class214.method4351(var0.field989);
					if (null != var4 && !var4.method3505()) {
						var12 = 1 + var0.field991 > var4.field2003[var0.field980];
					} else {
						var12 = true;
					}
				}

				if (var12) {
					var13 = var0.field1004 - var0.field1003;
					var5 = client.field1700 - var0.field1003;
					var6 = var0.field951 * 64 + var0.field966 * 128;
					int var7 = var0.field951 * 64 + var0.field955 * 128;
					var8 = var0.field951 * 64 + var0.field1000 * 128;
					var9 = var0.field983 * 128 + var0.field951 * 64;
					var0.field1012 = (var8 * var5 + (var13 - var5) * var6) / var13;
					var0.field948 = (var9 * var5 + (var13 - var5) * var7) / var13;
				}

				var0.field1009 = 0;
				var0.field1014 = var0.field1005;
				var0.field962 = var0.field1014;
			} else {
				var0.field985 = var0.field953;
				if (var0.field947 == 0) {
					var0.field1009 = 0;
				} else {
					label618: {
						if (-1 != var0.field989 && var0.field992 == 0) {
							var3 = class214.method4351(var0.field989);
							if (var0.field1022 > 0 && 0 == var3.field2005) {
								++var0.field1009;
								break label618;
							}

							if (var0.field1022 <= 0 && var3.field1999 == 0) {
								++var0.field1009;
								break label618;
							}
						}

						var15 = var0.field1012;
						var13 = var0.field948;
						var5 = var0.field951 * 64 + var0.field973[var0.field947 - 1] * 128;
						var6 = var0.field1021[var0.field947 - 1] * 128 + var0.field951 * 64;
						if (var15 < var5) {
							if (var13 < var6) {
								var0.field1014 = 1280;
							} else if (var13 > var6) {
								var0.field1014 = 1792;
							} else {
								var0.field1014 = 1536;
							}
						} else if (var15 > var5) {
							if (var13 < var6) {
								var0.field1014 = 768;
							} else if (var13 > var6) {
								var0.field1014 = 256;
							} else {
								var0.field1014 = 512;
							}
						} else if (var13 < var6) {
							var0.field1014 = 1024;
						} else if (var13 > var6) {
							var0.field1014 = 0;
						}

						class201 var14 = var0.field1001[var0.field947 - 1];
						if (var5 - var15 <= 256 && var5 - var15 >= -256 && var6 - var13 <= 256 && var6 - var13 >= -256) {
							var8 = var0.field1014 - var0.field962 & 2047;
							if (var8 > 1024) {
								var8 -= 2048;
							}

							var9 = var0.field1017;
							if (var8 >= -256 && var8 <= 256) {
								var9 = var0.field956;
							} else if (var8 >= 256 && var8 < 768) {
								var9 = var0.field959;
							} else if (var8 >= -768 && var8 <= -256) {
								var9 = var0.field974;
							}

							if (var9 == -1) {
								var9 = var0.field956;
							}

							var0.field985 = var9;
							int var10 = 4;
							boolean var11 = true;
							if (var0 instanceof class85) {
								var11 = ((class85)var0).field790.field2416;
							}

							if (var11) {
								if (var0.field962 != var0.field1014 && -1 == var0.field981 && 0 != var0.field1019) {
									var10 = 2;
								}

								if (var0.field947 > 2) {
									var10 = 6;
								}

								if (var0.field947 > 3) {
									var10 = 8;
								}

								if (var0.field1009 > 0 && var0.field947 > 1) {
									var10 = 8;
									--var0.field1009;
								}
							} else {
								if (var0.field947 > 1) {
									var10 = 6;
								}

								if (var0.field947 > 2) {
									var10 = 8;
								}

								if (var0.field1009 > 0 && var0.field947 > 1) {
									var10 = 8;
									--var0.field1009;
								}
							}

							if (class201.field2311 == var14) {
								var10 <<= 1;
							} else if (class201.field2310 == var14) {
								var10 >>= 1;
							}

							if (var10 >= 8) {
								if (var0.field985 == var0.field956 && -1 != var0.field950) {
									var0.field985 = var0.field950;
								} else if (var0.field985 == var0.field1017 && -1 != var0.field961) {
									var0.field985 = var0.field961;
								} else if (var0.field974 == var0.field985 && var0.field971 != -1) {
									var0.field985 = var0.field971;
								} else if (var0.field959 == var0.field985 && -1 != var0.field963) {
									var0.field985 = var0.field963;
								}
							} else if (var10 <= 1) {
								if (var0.field956 == var0.field985 && var0.field964 != -1) {
									var0.field985 = var0.field964;
								} else if (var0.field985 == var0.field1017 && -1 != var0.field965) {
									var0.field985 = var0.field965;
								} else if (var0.field985 == var0.field974 && -1 != var0.field996) {
									var0.field985 = var0.field996;
								} else if (var0.field985 == var0.field959 && -1 != var0.field967) {
									var0.field985 = var0.field967;
								}
							}

							if (var5 != var15 || var13 != var6) {
								if (var15 < var5) {
									var0.field1012 += var10;
									if (var0.field1012 > var5) {
										var0.field1012 = var5;
									}
								} else if (var15 > var5) {
									var0.field1012 -= var10;
									if (var0.field1012 < var5) {
										var0.field1012 = var5;
									}
								}

								if (var13 < var6) {
									var0.field948 += var10;
									if (var0.field948 > var6) {
										var0.field948 = var6;
									}
								} else if (var13 > var6) {
									var0.field948 -= var10;
									if (var0.field948 < var6) {
										var0.field948 = var6;
									}
								}
							}

							if (var5 == var0.field1012 && var0.field948 == var6) {
								--var0.field947;
								if (var0.field1022 > 0) {
									--var0.field1022;
								}
							}
						} else {
							var0.field1012 = var5;
							var0.field948 = var6;
							--var0.field947;
							if (var0.field1022 > 0) {
								--var0.field1022;
							}
						}
					}
				}
			}
		}

		if (var0.field1012 < 128 || var0.field948 < 128 || var0.field1012 >= 13184 || var0.field948 >= 13184) {
			var0.field989 = -1;
			var0.field994 = -1;
			var0.field1003 = 0;
			var0.field1004 = 0;
			var0.field1012 = var0.field973[0] * 128 + var0.field951 * 64;
			var0.field948 = var0.field1021[0] * 128 + var0.field951 * 64;
			var0.method2042();
		}

		if (class142.field1370 == var0 && (var0.field1012 < 1536 || var0.field948 < 1536 || var0.field1012 >= 11776 || var0.field948 >= 11776)) {
			var0.field989 = -1;
			var0.field994 = -1;
			var0.field1003 = 0;
			var0.field1004 = 0;
			var0.field1012 = 128 * var0.field973[0] + var0.field951 * 64;
			var0.field948 = var0.field1021[0] * 128 + var0.field951 * 64;
			var0.method2042();
		}

		class61.method1182(var0);
		var0.field949 = false;
		if (var0.field985 != -1) {
			var3 = class214.method4351(var0.field985);
			if (var3 != null) {
				if (!var3.method3505() && null != var3.field2009) {
					++var0.field987;
					if (var0.field986 < var3.field2009.length && var0.field987 > var3.field2003[var0.field986]) {
						var0.field987 = 1;
						++var0.field986;
						class367.method6839(var3, var0.field986, var0.field1012, var0.field948);
					}

					if (var0.field986 >= var3.field2009.length) {
						if (var3.field2012 > 0) {
							var0.field986 -= var3.field2012;
							if (var3.field2013) {
								++var0.field988;
							}

							if (var0.field986 < 0 || var0.field986 >= var3.field2009.length || var3.field2013 && var0.field988 >= var3.field2016) {
								var0.field987 = 0;
								var0.field986 = 0;
								var0.field988 = 0;
							}
						} else {
							var0.field987 = 0;
							var0.field986 = 0;
						}

						class367.method6839(var3, var0.field986, var0.field1012, var0.field948);
					}
				} else if (var3.method3505()) {
					++var0.field986;
					var13 = var3.method3509();
					if (var0.field986 < var13) {
						class3.method26(var3, var0.field986, var0.field1012, var0.field948);
					} else {
						if (var3.field2012 > 0) {
							var0.field986 -= var3.field2012;
							if (var3.field2013) {
								++var0.field988;
							}

							if (var0.field986 < 0 || var0.field986 >= var13 || var3.field2013 && var0.field988 >= var3.field2016) {
								var0.field986 = 0;
								var0.field987 = 0;
								var0.field988 = 0;
							}
						} else {
							var0.field987 = 0;
							var0.field986 = 0;
						}

						class3.method26(var3, var0.field986, var0.field1012, var0.field948);
					}
				} else {
					var0.field985 = -1;
				}
			} else {
				var0.field985 = -1;
			}
		}

		if (-1 != var0.field994 && client.field1700 >= var0.field997) {
			if (var0.field995 < 0) {
				var0.field995 = 0;
			}

			var15 = class146.method2640(var0.field994).field2238;
			if (var15 != -1) {
				var4 = class214.method4351(var15);
				if (var4 != null && var4.field2009 != null && !var4.method3505()) {
					++var0.field984;
					if (var0.field995 < var4.field2009.length && var0.field984 > var4.field2003[var0.field995]) {
						var0.field984 = 1;
						++var0.field995;
						class367.method6839(var4, var0.field995, var0.field1012, var0.field948);
					}

					if (var0.field995 >= var4.field2009.length && (var0.field995 < 0 || var0.field995 >= var4.field2009.length)) {
						var0.field994 = -1;
					}
				} else if (var4.method3505()) {
					++var0.field995;
					var5 = var4.method3509();
					if (var0.field995 < var5) {
						class3.method26(var4, var0.field995, var0.field1012, var0.field948);
					} else if (var0.field995 < 0 || var0.field995 >= var5) {
						var0.field994 = -1;
					}
				} else {
					var0.field994 = -1;
				}
			} else {
				var0.field994 = -1;
			}
		}

		if (var0.field989 != -1 && var0.field992 <= 1) {
			var3 = class214.method4351(var0.field989);
			if (1 == var3.field2005 && var0.field1022 > 0 && var0.field1003 <= client.field1700 && var0.field1004 < client.field1700) {
				var0.field992 = 1;
				return;
			}
		}

		if (-1 != var0.field989 && 0 == var0.field992) {
			var3 = class214.method4351(var0.field989);
			if (null == var3) {
				var0.field989 = -1;
			} else if (!var3.method3505() && null != var3.field2009) {
				++var0.field991;
				if (var0.field980 < var3.field2009.length && var0.field991 > var3.field2003[var0.field980]) {
					var0.field991 = 1;
					++var0.field980;
					class367.method6839(var3, var0.field980, var0.field1012, var0.field948);
				}

				if (var0.field980 >= var3.field2009.length) {
					var0.field980 -= var3.field2012;
					++var0.field993;
					if (var0.field993 >= var3.field2016) {
						var0.field989 = -1;
					} else if (var0.field980 >= 0 && var0.field980 < var3.field2009.length) {
						class367.method6839(var3, var0.field980, var0.field1012, var0.field948);
					} else {
						var0.field989 = -1;
					}
				}

				var0.field949 = var3.field1996;
			} else if (var3.method3505()) {
				++var0.field980;
				var13 = var3.method3509();
				if (var0.field980 < var13) {
					class3.method26(var3, var0.field980, var0.field1012, var0.field948);
				} else {
					var0.field980 -= var3.field2012;
					++var0.field993;
					if (var0.field993 >= var3.field2016) {
						var0.field989 = -1;
					} else if (var0.field980 >= 0 && var0.field980 < var13) {
						class3.method26(var3, var0.field980, var0.field1012, var0.field948);
					} else {
						var0.field989 = -1;
					}
				}
			} else {
				var0.field989 = -1;
			}
		}

		if (var0.field992 > 0) {
			--var0.field992;
		}

	}
}
