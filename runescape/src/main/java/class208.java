import java.util.Date;

public class class208 extends class439 {
	static class282 field2374;
	static class282 field2377;
	static class337 field2383;
	static int field2376;
	static int field2421;
	class454 field2420;
	int field2384;
	int field2391;
	int field2406;
	int field2409;
	int field2413;
	int field2414;
	int[] field2380;
	int[] field2382;
	int[] field2419;
	short[] field2375;
	short[] field2399;
	short[] field2401;
	public boolean field2404;
	public boolean field2408;
	public boolean field2415;
	public boolean field2416;
	public boolean field2417;
	public int field2379;
	public int field2381;
	public int field2385;
	public int field2386;
	public int field2387;
	public int field2388;
	public int field2389;
	public int field2390;
	public int field2392;
	public int field2393;
	public int field2394;
	public int field2395;
	public int field2396;
	public int field2397;
	public int field2398;
	public int field2405;
	public int field2407;
	public int field2411;
	public int field2418;
	public int[] field2412;
	public String field2378;
	public String[] field2403;
	public short[] field2400;
	public short[] field2402;

	static {
		field2377 = new class282(64);
		field2374 = new class282(50);
	}

	class208() {
		this.field2378 = class321.field3756;
		this.field2388 = 1;
		this.field2381 = -1;
		this.field2385 = -1;
		this.field2386 = -1;
		this.field2387 = -1;
		this.field2411 = -1;
		this.field2407 = -1;
		this.field2390 = -1;
		this.field2389 = -1;
		this.field2392 = -1;
		this.field2393 = -1;
		this.field2394 = -1;
		this.field2395 = -1;
		this.field2396 = -1;
		this.field2397 = -1;
		this.field2398 = -1;
		this.field2403 = new String[5];
		this.field2404 = true;
		this.field2405 = -1;
		this.field2414 = 128;
		this.field2384 = 128;
		this.field2408 = false;
		this.field2391 = 0;
		this.field2406 = 0;
		this.field2418 = 32;
		this.field2413 = -1;
		this.field2409 = -1;
		this.field2415 = true;
		this.field2416 = true;
		this.field2417 = false;
		this.field2419 = null;
		this.field2375 = null;
	}

	public static void method2170(class337 var0, class337 var1, boolean var2, int var3) {
		field2383 = var0;
		class344.field4276 = var1;
		class362.field4347 = var2;
		field2376 = var3;
	}

	void method4077() {
	}

	void method4131(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method4091(var1, var3);
		}
	}

	public static class200 method4105(int var0) {
		class200 var2 = (class200)class200.field2301.method5356((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = class200.field2252.method6374(10, var0);
			var2 = new class200();
			var2.field2281 = var0;
			if (var3 != null) {
				var2.method3916(new class467(var3));
			}

			var2.method3915();
			if (var2.field2294 != -1) {
				var2.method3956(method4105(var2.field2294), method4105(var2.field2298));
			}

			if (-1 != var2.field2282) {
				var2.method3914(method4105(var2.field2282), method4105(var2.field2276));
			}

			if (var2.field2307 != -1) {
				var2.method3955(method4105(var2.field2307), method4105(var2.field2283));
			}

			if (!class182.field1681 && var2.field2275) {
				var2.field2259 = class321.field3866;
				var2.field2303 = false;

				int var4;
				for (var4 = 0; var4 < var2.field2257.length; ++var4) {
					var2.field2257[var4] = null;
				}

				for (var4 = 0; var4 < var2.field2277.length; ++var4) {
					if (var4 != 4) {
						var2.field2277[var4] = null;
					}
				}

				var2.field2278 = -2;
				var2.field2300 = 0;
				if (null != var2.field2284) {
					boolean var7 = false;

					for (class428 var5 = var2.field2284.method8123(); null != var5; var5 = var2.field2284.method8137()) {
						class204 var6 = class137.method2506((int)var5.field4773);
						if (var6.field2333) {
							var5.method7951();
						} else {
							var7 = true;
						}
					}

					if (!var7) {
						var2.field2284 = null;
					}
				}
			}

			class200.field2301.method5364(var2, (long)var0);
			return var2;
		}
	}

	void method4091(class467 var1, int var2) {
		int var4;
		int var5;
		if (var2 == 1) {
			var4 = var1.method8326();
			this.field2382 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2382[var5] = var1.method8328();
			}
		} else if (var2 == 2) {
			this.field2378 = var1.method8335();
		} else if (var2 == 12) {
			this.field2388 = var1.method8326();
		} else if (var2 == 13) {
			this.field2381 = var1.method8328();
		} else if (var2 == 14) {
			this.field2387 = var1.method8328();
		} else if (var2 == 15) {
			this.field2385 = var1.method8328();
		} else if (var2 == 16) {
			this.field2386 = var1.method8328();
		} else if (var2 == 17) {
			this.field2387 = var1.method8328();
			this.field2411 = var1.method8328();
			this.field2407 = var1.method8328();
			this.field2390 = var1.method8328();
		} else if (var2 == 18) {
			var1.method8328();
		} else if (var2 >= 30 && var2 < 35) {
			this.field2403[var2 - 30] = var1.method8335();
			if (this.field2403[var2 - 30].equalsIgnoreCase(class321.field3757)) {
				this.field2403[var2 - 30] = null;
			}
		} else if (var2 == 40) {
			var4 = var1.method8326();
			this.field2399 = new short[var4];
			this.field2400 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2399[var5] = (short)var1.method8328();
				this.field2400[var5] = (short)var1.method8328();
			}
		} else if (var2 == 41) {
			var4 = var1.method8326();
			this.field2401 = new short[var4];
			this.field2402 = new short[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2401[var5] = (short)var1.method8328();
				this.field2402[var5] = (short)var1.method8328();
			}
		} else if (var2 == 60) {
			var4 = var1.method8326();
			this.field2380 = new int[var4];

			for (var5 = 0; var5 < var4; ++var5) {
				this.field2380[var5] = var1.method8328();
			}
		} else if (var2 == 93) {
			this.field2404 = false;
		} else if (var2 == 95) {
			this.field2405 = var1.method8328();
		} else if (var2 == 97) {
			this.field2414 = var1.method8328();
		} else if (var2 == 98) {
			this.field2384 = var1.method8328();
		} else if (var2 == 99) {
			this.field2408 = true;
		} else if (var2 == 100) {
			this.field2391 = var1.method8327();
		} else if (var2 == 101) {
			this.field2406 = var1.method8327() * 5;
		} else {
			int var6;
			if (var2 == 102) {
				if (class362.field4347) {
					this.field2419 = new int[1];
					this.field2375 = new short[1];
					this.field2419[0] = field2376;
					this.field2375[0] = (short)var1.method8328();
				} else {
					var4 = var1.method8326();
					var5 = 0;

					for (var6 = var4; var6 != 0; var6 >>= 1) {
						++var5;
					}

					this.field2419 = new int[var5];
					this.field2375 = new short[var5];

					for (int var7 = 0; var7 < var5; ++var7) {
						if ((var4 & 1 << var7) == 0) {
							this.field2419[var7] = -1;
							this.field2375[var7] = -1;
						} else {
							this.field2419[var7] = var1.method8344();
							this.field2375[var7] = (short)var1.method8557();
						}
					}
				}
			} else if (var2 == 103) {
				this.field2418 = var1.method8328();
			} else if (var2 != 106 && var2 != 118) {
				if (var2 == 107) {
					this.field2415 = false;
				} else if (var2 == 109) {
					this.field2416 = false;
				} else if (var2 == 111) {
					this.field2417 = true;
				} else if (var2 == 114) {
					this.field2389 = var1.method8328();
				} else if (var2 == 115) {
					this.field2389 = var1.method8328();
					this.field2392 = var1.method8328();
					this.field2393 = var1.method8328();
					this.field2394 = var1.method8328();
				} else if (var2 == 116) {
					this.field2395 = var1.method8328();
				} else if (var2 == 117) {
					this.field2395 = var1.method8328();
					this.field2396 = var1.method8328();
					this.field2397 = var1.method8328();
					this.field2398 = var1.method8328();
				} else if (var2 == 249) {
					this.field2420 = class63.method1199(var1, this.field2420);
				}
			} else {
				this.field2413 = var1.method8328();
				if (65535 == this.field2413) {
					this.field2413 = -1;
				}

				this.field2409 = var1.method8328();
				if (65535 == this.field2409) {
					this.field2409 = -1;
				}

				var4 = -1;
				if (var2 == 118) {
					var4 = var1.method8328();
					if (var4 == 65535) {
						var4 = -1;
					}
				}

				var5 = var1.method8326();
				this.field2412 = new int[var5 + 2];

				for (var6 = 0; var6 <= var5; ++var6) {
					this.field2412[var6] = var1.method8328();
					if (this.field2412[var6] == 65535) {
						this.field2412[var6] = -1;
					}
				}

				this.field2412[var5 + 1] = var4;
			}
		}

	}

	public final class216 method4138(class183 var1, int var2, class183 var3, int var4, class198 var5) {
		if (null != this.field2412) {
			class208 var7 = this.method4083();
			return var7 == null ? null : var7.method4138(var1, var2, var3, var4, var5);
		} else {
			long var11 = (long)this.field2379;
			if (var5 != null) {
				var11 |= var5.field2230 << 16;
			}

			class216 var9 = (class216)field2374.method5356(var11);
			if (null == var9) {
				class191 var10 = this.method4084(this.field2382, var5);
				if (var10 == null) {
					return null;
				}

				var9 = var10.method3668(64 + this.field2391, this.field2406 + 850, -30, -50, -30);
				field2374.method5364(var9, var11);
			}

			class216 var13;
			if (var1 != null && null != var3) {
				var13 = var1.method3543(var9, var2, var3, var4);
			} else if (var1 != null) {
				var13 = var1.method3502(var9, var2);
			} else if (null != var3) {
				var13 = var3.method3502(var9, var4);
			} else {
				var13 = var9.method4382(true);
			}

			if (this.field2414 != 128 || this.field2384 != 128) {
				var13.method4437(this.field2414, this.field2384, this.field2414);
			}

			return var13;
		}
	}

	public final class191 method4081(class198 var1) {
		if (null != this.field2412) {
			class208 var3 = this.method4083();
			return null == var3 ? null : var3.method4081(var1);
		} else {
			return this.method4084(this.field2380, var1);
		}
	}

	class191 method4084(int[] var1, class198 var2) {
		int[] var4 = var1;
		if (null != var2 && var2.field2225 != null) {
			var4 = var2.field2225;
		}

		if (var4 == null) {
			return null;
		} else {
			boolean var5 = false;

			for (int var6 = 0; var6 < var4.length; ++var6) {
				if (-1 != var4[var6] && !class344.field4276.method6366(var4[var6], 0)) {
					var5 = true;
				}
			}

			if (var5) {
				return null;
			} else {
				class191[] var10 = new class191[var4.length];

				for (int var7 = 0; var7 < var4.length; ++var7) {
					var10[var7] = class191.method3645(class344.field4276, var4[var7], 0);
				}

				class191 var11;
				if (var10.length == 1) {
					var11 = var10[0];
					if (var11 == null) {
						var11 = new class191(var10, var10.length);
					}
				} else {
					var11 = new class191(var10, var10.length);
				}

				short[] var8;
				int var9;
				if (this.field2399 != null) {
					var8 = this.field2400;
					if (null != var2 && var2.field2227 != null) {
						var8 = var2.field2227;
					}

					for (var9 = 0; var9 < this.field2399.length; ++var9) {
						var11.method3660(this.field2399[var9], var8[var9]);
					}
				}

				if (null != this.field2401) {
					var8 = this.field2402;
					if (null != var2 && null != var2.field2228) {
						var8 = var2.field2228;
					}

					for (var9 = 0; var9 < this.field2401.length; ++var9) {
						var11.method3661(this.field2401[var9], var8[var9]);
					}
				}

				return var11;
			}
		}
	}

	public final class208 method4083() {
		int var2 = -1;
		if (this.field2413 != -1) {
			var2 = class180.method2989(this.field2413);
		} else if (-1 != this.field2409) {
			var2 = class305.field3661[this.field2409];
		}

		int var3;
		if (var2 >= 0 && var2 < this.field2412.length - 1) {
			var3 = this.field2412[var2];
		} else {
			var3 = this.field2412[this.field2412.length - 1];
		}

		return var3 != -1 ? class119.method2293(var3) : null;
	}

	public boolean method4124() {
		if (this.field2412 == null) {
			return true;
		} else {
			int var2 = -1;
			if (-1 != this.field2413) {
				var2 = class180.method2989(this.field2413);
			} else if (-1 != this.field2409) {
				var2 = class305.field3661[this.field2409];
			}

			if (var2 >= 0 && var2 < this.field2412.length) {
				return -1 != this.field2412[var2];
			} else {
				return -1 != this.field2412[this.field2412.length - 1];
			}
		}
	}

	public int method4085(int var1, int var2) {
		return class123.method2323(this.field2420, var1, var2);
	}

	public String method4086(int var1, String var2) {
		class454 var5 = this.field2420;
		String var4;
		if (var5 == null) {
			var4 = var2;
		} else {
			class426 var6 = (class426)var5.method8135((long)var1);
			if (null == var6) {
				var4 = var2;
			} else {
				var4 = (String)var6.field4735;
			}
		}

		return var4;
	}

	public static void method7245() {
		field2377.method5357();
		field2374.method5357();
	}

	public boolean method4087() {
		return null != this.field2419 && null != this.field2375;
	}

	public int[] method4093() {
		return this.field2419;
	}

	public int method4078(int var1) {
		return null != this.field2419 && var1 < this.field2419.length ? this.field2419[var1] : -1;
	}

	public short[] method4130() {
		return this.field2375;
	}

	public short method4088(int var1) {
		return this.field2375 != null && var1 < this.field2375.length ? this.field2375[var1] : -1;
	}

	static int method4140(int var0, class65 var1, boolean var2) {
		String var4;
		int var5;
		if (var0 == CS2Opcodes.APPEND_NUM) {
			var4 = class69.field580[--class69.field581];
			var5 = class69.field579[--class94.field920];
			class69.field580[++class69.field581 - 1] = var4 + var5;
			return 1;
		} else {
			String var10;
			if (var0 == CS2Opcodes.APPEND) {
				class69.field581 -= 2;
				var4 = class69.field580[class69.field581];
				var10 = class69.field580[1 + class69.field581];
				class69.field580[++class69.field581 - 1] = var4 + var10;
				return 1;
			} else if (var0 == CS2Opcodes.APPEND_SIGNNUM) {
				var4 = class69.field580[--class69.field581];
				var5 = class69.field579[--class94.field920];
				class69.field580[++class69.field581 - 1] = var4 + class303.method6084(var5, true);
				return 1;
			} else if (var0 == CS2Opcodes.LOWERCASE) {
				var4 = class69.field580[--class69.field581];
				class69.field580[++class69.field581 - 1] = var4.toLowerCase();
				return 1;
			} else {
				int var7;
				int var11;
				if (var0 == CS2Opcodes.FROMDATE) {
					var11 = class69.field579[--class94.field920];
					long var12 = ((long)var11 + 11745L) * 86400000L;
					class69.field575.setTime(new Date(var12));
					var7 = class69.field575.get(5);
					int var18 = class69.field575.get(2);
					int var9 = class69.field575.get(1);
					class69.field580[++class69.field581 - 1] = var7 + "-" + class69.field585[var18] + "-" + var9;
					return 1;
				} else if (var0 != CS2Opcodes.TEXT_BODYTYPE) {
					if (var0 == CS2Opcodes.TOSTRING) {
						var11 = class69.field579[--class94.field920];
						class69.field580[++class69.field581 - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == CS2Opcodes.COMPARE) {
						class69.field581 -= 2;
						class69.field579[++class94.field920 - 1] = class141.method2536(class210.method4149(class69.field580[class69.field581], class69.field580[1 + class69.field581], class178.field1654));
						return 1;
					} else {
						int var6;
						byte[] var14;
						class386 var15;
						if (var0 == CS2Opcodes.PARAHEIGHT) {
							var4 = class69.field580[--class69.field581];
							class94.field920 -= 2;
							var5 = class69.field579[class94.field920];
							var6 = class69.field579[1 + class94.field920];
							var14 = class363.field4355.method6374(var6, 0);
							var15 = new class386(var14);
							class69.field579[++class94.field920 - 1] = var15.method6852(var4, var5);
							return 1;
						} else if (var0 == CS2Opcodes.PARAWIDTH) {
							var4 = class69.field580[--class69.field581];
							class94.field920 -= 2;
							var5 = class69.field579[class94.field920];
							var6 = class69.field579[1 + class94.field920];
							var14 = class363.field4355.method6374(var6, 0);
							var15 = new class386(var14);
							class69.field579[++class94.field920 - 1] = var15.method6851(var4, var5);
							return 1;
						} else if (var0 == CS2Opcodes.TEXT_SWITCH) {
							class69.field581 -= 2;
							var4 = class69.field580[class69.field581];
							var10 = class69.field580[1 + class69.field581];
							if (class69.field579[--class94.field920] == 1) {
								class69.field580[++class69.field581 - 1] = var4;
							} else {
								class69.field580[++class69.field581 - 1] = var10;
							}

							return 1;
						} else if (var0 == CS2Opcodes.ESCAPE) {
							var4 = class69.field580[--class69.field581];
							class69.field580[++class69.field581 - 1] = class369.method6886(var4);
							return 1;
						} else if (var0 == CS2Opcodes.APPEND_CHAR) {
							var4 = class69.field580[--class69.field581];
							var5 = class69.field579[--class94.field920];
							class69.field580[++class69.field581 - 1] = var4 + (char)var5;
							return 1;
						} else if (var0 == CS2Opcodes.CHAR_ISPRINTABLE) {
							var11 = class69.field579[--class94.field920];
							class69.field579[++class94.field920 - 1] = class144.method2560((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == CS2Opcodes.CHAR_ISALPHANUMERIC) {
							var11 = class69.field579[--class94.field920];
							class69.field579[++class94.field920 - 1] = class196.method3876((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == CS2Opcodes.CHAR_ISALPHA) {
							var11 = class69.field579[--class94.field920];
							class69.field579[++class94.field920 - 1] = class215.method4366((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == CS2Opcodes.CHAR_ISNUMERIC) {
							var11 = class69.field579[--class94.field920];
							class69.field579[++class94.field920 - 1] = class251.method4969((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == CS2Opcodes.STRING_LENGTH) {
							var4 = class69.field580[--class69.field581];
							if (var4 != null) {
								class69.field579[++class94.field920 - 1] = var4.length();
							} else {
								class69.field579[++class94.field920 - 1] = 0;
							}

							return 1;
						} else if (var0 == CS2Opcodes.SUBSTRING) {
							var4 = class69.field580[--class69.field581];
							class94.field920 -= 2;
							var5 = class69.field579[class94.field920];
							var6 = class69.field579[1 + class94.field920];
							class69.field580[++class69.field581 - 1] = var4.substring(var5, var6);
							return 1;
						} else if (var0 == CS2Opcodes.REMOVETAGS) {
							var4 = class69.field580[--class69.field581];
							StringBuilder var19 = new StringBuilder(var4.length());
							boolean var17 = false;

							for (var7 = 0; var7 < var4.length(); ++var7) {
								char var8 = var4.charAt(var7);
								if (var8 == '<') {
									var17 = true;
								} else if (var8 == '>') {
									var17 = false;
								} else if (!var17) {
									var19.append(var8);
								}
							}

							class69.field580[++class69.field581 - 1] = var19.toString();
							return 1;
						} else if (var0 == CS2Opcodes.STRING_INDEXOF_CHAR) {
							var4 = class69.field580[--class69.field581];
							var5 = class69.field579[--class94.field920];
							class69.field579[++class94.field920 - 1] = var4.indexOf(var5);
							return 1;
						} else if (var0 == CS2Opcodes.STRING_INDEXOF_STRING) {
							class69.field581 -= 2;
							var4 = class69.field580[class69.field581];
							var10 = class69.field580[1 + class69.field581];
							var6 = class69.field579[--class94.field920];
							class69.field579[++class94.field920 - 1] = var4.indexOf(var10, var6);
							return 1;
						} else if (var0 == CS2Opcodes.UPPERCASE) {
							var4 = class69.field580[--class69.field581];
							class69.field580[++class69.field581 - 1] = var4.toUpperCase();
							return 1;
						} else if (var0 == CS2Opcodes.TEXT_GENDER) {
							class69.field581 -= 3;
							var4 = class69.field580[class69.field581];
							var10 = class69.field580[1 + class69.field581];
							String var16 = class69.field580[2 + class69.field581];
							if (class142.field1370.field827 == null) {
								class69.field580[++class69.field581 - 1] = var16;
								return 1;
							} else {
								switch(class142.field1370.field827.field3646) {
								case 0:
									class69.field580[++class69.field581 - 1] = var4;
									break;
								case 1:
									class69.field580[++class69.field581 - 1] = var10;
									break;
								case 2:
								default:
									class69.field580[++class69.field581 - 1] = var16;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class69.field581 -= 2;
					var4 = class69.field580[class69.field581];
					var10 = class69.field580[1 + class69.field581];
					if (class142.field1370.field827 != null && 0 != class142.field1370.field827.field3644) {
						class69.field580[++class69.field581 - 1] = var10;
					} else {
						class69.field580[++class69.field581 - 1] = var4;
					}

					return 1;
				}
			}
		}
	}
}
