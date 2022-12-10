public class class301 {
	static class282 field3651;
	static final int[] field3650;
	boolean field3643;
	class180[] field3648;
	int[] field3642;
	int[] field3649;
	long field3645;
	long field3647;
	public int field3641;
	public int field3644;
	public int field3646;

	public class301() {
		this.field3646 = -1;
		this.field3644 = 0;
		this.field3643 = false;
	}

	static {
		field3650 = new int[]{8, 11, 4, 6, 9, 7, 10};
		field3651 = new class282(260);
	}

	public void method6061(int[] var1, class180[] var2, boolean var3, int[] var4, int var5, int var6, int var7) {
		this.field3648 = var2;
		this.field3643 = var3;
		this.field3646 = var7;
		this.method6044(var1, var4, var5, var6);
	}

	public void method6044(int[] var1, int[] var2, int var3, int var4) {
		if (var1 == null) {
			var1 = new int[12];

			for (int var6 = 0; var6 < 7; ++var6) {
				for (int var7 = 0; var7 < class72.field622; ++var7) {
					class166 var8 = class411.method7618(var7);
					if (var8 != null && !var8.field1547 && var8.field1540 == var6 + (var3 == 1 ? 7 : 0)) {
						var1[field3650[var6]] = var7 + 256;
						break;
					}
				}
			}
		}

		this.field3649 = var1;
		this.field3642 = var2;
		this.field3644 = var3;
		this.field3641 = var4;
		this.method6049();
	}

	public void method6068(int var1, boolean var2) {
		if (var1 != 1 || 1 != this.field3644) {
			int var4 = this.field3649[field3650[var1]];
			if (var4 != 0) {
				var4 -= 256;

				class166 var5;
				do {
					if (!var2) {
						--var4;
						if (var4 < 0) {
							var4 = class72.field622 - 1;
						}
					} else {
						++var4;
						if (var4 >= class72.field622) {
							var4 = 0;
						}
					}

					var5 = class411.method7618(var4);
				} while(var5 == null || var5.field1547 || var5.field1540 != (this.field3644 == 1 ? 7 : 0) + var1);

				this.field3649[field3650[var1]] = var4 + 256;
				this.method6049();
			}
		}
	}

	public void method6046(int var1, boolean var2) {
		int var4 = this.field3642[var1];
		if (!var2) {
			do {
				--var4;
				if (var4 < 0) {
					var4 = class398.field4553[var1].length - 1;
				}
			} while(!class107.method2142(var1, var4));
		} else {
			do {
				++var4;
				if (var4 >= class398.field4553[var1].length) {
					var4 = 0;
				}
			} while(!class107.method2142(var1, var4));
		}

		this.field3642[var1] = var4;
		this.method6049();
	}

	public void method6047(int var1) {
		if (this.field3644 != var1) {
			this.method6044((int[])null, this.field3642, var1, -1);
		}
	}

	public void method6048(class467 var1) {
		var1.method8323(this.field3644);

		int var3;
		for (var3 = 0; var3 < 7; ++var3) {
			int var4 = this.field3649[field3650[var3]];
			if (var4 == 0) {
				var1.method8323(-1);
			} else {
				var1.method8323(var4 - 256);
			}
		}

		for (var3 = 0; var3 < 5; ++var3) {
			var1.method8323(this.field3642[var3]);
		}

	}

	void method6049() {
		long var2 = this.field3645;
		int var4 = this.field3649[5];
		int var5 = this.field3649[9];
		this.field3649[5] = var5;
		this.field3649[9] = var4;
		this.field3645 = 0L;

		int var6;
		for (var6 = 0; var6 < 12; ++var6) {
			this.field3645 <<= 4;
			if (this.field3649[var6] >= 256) {
				this.field3645 += (long)(this.field3649[var6] - 256);
			}
		}

		if (this.field3649[0] >= 256) {
			this.field3645 += (long)(this.field3649[0] - 256 >> 4);
		}

		if (this.field3649[1] >= 256) {
			this.field3645 += (long)(this.field3649[1] - 256 >> 8);
		}

		for (var6 = 0; var6 < 5; ++var6) {
			this.field3645 <<= 3;
			this.field3645 += (long)this.field3642[var6];
		}

		this.field3645 <<= 1;
		this.field3645 += (long)this.field3644;
		this.field3649[5] = var4;
		this.field3649[9] = var5;
		if (var2 != 0L && var2 != this.field3645 || this.field3643) {
			field3651.method5355(var2);
		}

	}

	public class216 method6043(class183 var1, int var2, class183 var3, int var4) {
		if (this.field3641 != -1) {
			return class119.method2293(this.field3641).method4138(var1, var2, var3, var4, (class198)null);
		} else {
			long var6 = this.field3645;
			int[] var8 = this.field3649;
			if (var1 != null && (var1.field2010 >= 0 || var1.field2011 >= 0)) {
				var8 = new int[12];

				for (int var9 = 0; var9 < 12; ++var9) {
					var8[var9] = this.field3649[var9];
				}

				if (var1.field2010 >= 0) {
					var6 += (long)(var1.field2010 - this.field3649[5] << 40);
					var8[5] = var1.field2010;
				}

				if (var1.field2011 >= 0) {
					var6 += (long)(var1.field2011 - this.field3649[3] << 48);
					var8[3] = var1.field2011;
				}
			}

			class216 var19 = (class216)field3651.method5356(var6);
			if (var19 == null) {
				boolean var10 = false;

				int var12;
				for (int var11 = 0; var11 < 12; ++var11) {
					var12 = var8[var11];
					if (var12 >= 256 && var12 < 512 && !class411.method7618(var12 - 256).method2802()) {
						var10 = true;
					}

					if (var12 >= 512 && !class208.method4105(var12 - 512).method3924(this.field3644)) {
						var10 = true;
					}
				}

				if (var10) {
					if (-1L != this.field3647) {
						var19 = (class216)field3651.method5356(this.field3647);
					}

					if (null == var19) {
						return null;
					}
				}

				if (var19 == null) {
					class191[] var20 = new class191[12];
					var12 = 0;

					int var14;
					for (int var13 = 0; var13 < 12; ++var13) {
						var14 = var8[var13];
						if (var14 >= 256 && var14 < 512) {
							class191 var15 = class411.method7618(var14 - 256).method2799();
							if (null != var15) {
								var20[var12++] = var15;
							}
						}

						if (var14 >= 512) {
							class200 var23 = class208.method4105(var14 - 512);
							class191 var16 = var23.method3925(this.field3644);
							if (null != var16) {
								if (null != this.field3648) {
									class180 var17 = this.field3648[var13];
									if (var17 != null) {
										int var18;
										if (null != var17.field1673 && null != var23.field2299 && var17.field1673.length == var23.field2261.length) {
											for (var18 = 0; var18 < var23.field2299.length; ++var18) {
												var16.method3660(var23.field2261[var18], var17.field1673[var18]);
											}
										}

										if (null != var17.field1674 && null != var23.field2262 && var23.field2306.length == var17.field1674.length) {
											for (var18 = 0; var18 < var23.field2262.length; ++var18) {
												var16.method3661(var23.field2306[var18], var17.field1674[var18]);
											}
										}
									}
								}

								var20[var12++] = var16;
							}
						}
					}

					class191 var21 = new class191(var20, var12);

					for (var14 = 0; var14 < 5; ++var14) {
						if (this.field3642[var14] < class398.field4553[var14].length) {
							var21.method3660(class103.field1067[var14], class398.field4553[var14][this.field3642[var14]]);
						}

						if (this.field3642[var14] < class305.field3662[var14].length) {
							var21.method3660(class198.field2229[var14], class305.field3662[var14][this.field3642[var14]]);
						}
					}

					var19 = var21.method3668(64, 850, -30, -50, -30);
					field3651.method5364(var19, var6);
					this.field3647 = var6;
				}
			}

			class216 var22;
			if (var1 == null && null == var3) {
				var22 = var19.method4382(true);
			} else if (null != var1 && null != var3) {
				var22 = var1.method3543(var19, var2, var3, var4);
			} else if (var1 != null) {
				var22 = var1.method3502(var19, var2);
			} else {
				var22 = var3.method3502(var19, var4);
			}

			return var22;
		}
	}

	class191 method6067() {
		if (-1 != this.field3641) {
			return class119.method2293(this.field3641).method4081((class198)null);
		} else {
			boolean var2 = false;

			int var4;
			for (int var3 = 0; var3 < 12; ++var3) {
				var4 = this.field3649[var3];
				if (var4 >= 256 && var4 < 512 && !class411.method7618(var4 - 256).method2786()) {
					var2 = true;
				}

				if (var4 >= 512 && !class208.method4105(var4 - 512).method3926(this.field3644)) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			} else {
				class191[] var8 = new class191[12];
				var4 = 0;

				int var6;
				for (int var5 = 0; var5 < 12; ++var5) {
					var6 = this.field3649[var5];
					class191 var7;
					if (var6 >= 256 && var6 < 512) {
						var7 = class411.method7618(var6 - 256).method2787();
						if (null != var7) {
							var8[var4++] = var7;
						}
					}

					if (var6 >= 512) {
						var7 = class208.method4105(var6 - 512).method3927(this.field3644);
						if (var7 != null) {
							var8[var4++] = var7;
						}
					}
				}

				class191 var9 = new class191(var8, var4);

				for (var6 = 0; var6 < 5; ++var6) {
					if (this.field3642[var6] < class398.field4553[var6].length) {
						var9.method3660(class103.field1067[var6], class398.field4553[var6][this.field3642[var6]]);
					}

					if (this.field3642[var6] < class305.field3662[var6].length) {
						var9.method3660(class198.field2229[var6], class305.field3662[var6][this.field3642[var6]]);
					}
				}

				return var9;
			}
		}
	}

	public int method6051() {
		return -1 == this.field3641 ? this.field3649[1] + (this.field3649[8] << 10) + (this.field3649[0] << 15) + (this.field3642[0] << 25) + (this.field3642[4] << 20) + (this.field3649[11] << 5) : 305419896 + class119.method2293(this.field3641).field2379;
	}

	public static void method1014() {
		field3651.method5357();
	}
}
