public final class class66 extends class226 {
	boolean field540;
	class183 field543;
	int field536;
	int field537;
	int field538;
	int field539;
	int field541;
	int field542;
	int field544;
	int field545;

	static class403[] method1231() {
		return new class403[]{class403.field4583, class403.field4582, class403.field4581, class403.field4585};
	}

	class66(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field542 = 0;
		this.field544 = 0;
		this.field540 = false;
		this.field536 = var1;
		this.field538 = var2;
		this.field539 = var3;
		this.field545 = var4;
		this.field541 = var5;
		this.field537 = var6 + var7;
		int var8 = class146.method2640(this.field536).field2238;
		if (var8 != -1) {
			this.field540 = false;
			this.field543 = class214.method4351(var8);
		} else {
			this.field540 = true;
		}

	}

	final void method1230(int var1) {
		if (!this.field540) {
			this.field544 += var1;
			if (!this.field543.method3505()) {
				while (this.field544 > this.field543.field2003[this.field542]) {
					this.field544 -= this.field543.field2003[this.field542];
					++this.field542;
					if (this.field542 >= this.field543.field2009.length) {
						this.field540 = true;
						break;
					}
				}
			} else {
				this.field542 += var1;
				if (this.field542 >= this.field543.method3509()) {
					this.field540 = true;
				}
			}

		}
	}

	protected final class216 method4625() {
		class199 var2 = class146.method2640(this.field536);
		class216 var3;
		if (!this.field540) {
			var3 = var2.method3896(this.field542);
		} else {
			var3 = var2.method3896(-1);
		}

		return var3 == null ? null : var3;
	}

	static boolean method1229() {
		return (client.field1918 & 8) != 0;
	}

	static final int method1228(class290 var0, int var1) {
		if (var0.field3390 != null && var1 < var0.field3390.length) {
			try {
				int[] var3 = var0.field3390[var1];
				int var4 = 0;
				int var5 = 0;
				byte var6 = 0;

				while (true) {
					int var7 = var3[var5++];
					int var8 = 0;
					byte var9 = 0;
					if (var7 == 0) {
						return var4;
					}

					if (var7 == 1) {
						var8 = client.field1762[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = client.field1834[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = client.field1835[var3[var5++]];
					}

					int var10;
					class290 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class180.method2988(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class208.method4105(var12).field2275 || client.field1691)) {
							for (var13 = 0; var13 < var11.field3392.length; ++var13) {
								if (var12 + 1 == var11.field3392[var13]) {
									var8 += var11.field3438[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = class305.field3661[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = class323.field4083[client.field1834[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = class305.field3661[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = class142.field1370.field831;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (class323.field4081[var10]) {
								var8 += client.field1834[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class180.method2988(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class208.method4105(var12).field2275 || client.field1691)) {
							for (var13 = 0; var13 < var11.field3392.length; ++var13) {
								if (var11.field3392[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = client.field1811;
					}

					if (var7 == 12) {
						var8 = client.field1870;
					}

					if (var7 == 13) {
						var10 = class305.field3661[var3[var5++]];
						int var14 = var3[var5++];
						var8 = 0 != (var10 & 1 << var14) ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = class180.method2989(var10);
					}

					if (var7 == 15) {
						var9 = 1;
					}

					if (var7 == 16) {
						var9 = 2;
					}

					if (var7 == 17) {
						var9 = 3;
					}

					if (var7 == 18) {
						var8 = class151.field1447 + (class142.field1370.field1012 >> 7);
					}

					if (var7 == 19) {
						var8 = class388.field4509 + (class142.field1370.field948 >> 7);
					}

					if (var7 == 20) {
						var8 = var3[var5++];
					}

					if (var9 == 0) {
						if (var6 == 0) {
							var4 += var8;
						}

						if (var6 == 1) {
							var4 -= var8;
						}

						if (var6 == 2 && var8 != 0) {
							var4 /= var8;
						}

						if (var6 == 3) {
							var4 *= var8;
						}

						var6 = 0;
					} else {
						var6 = var9;
					}
				}
			} catch (Exception var15) {
				return -1;
			}
		} else {
			return -2;
		}
	}
}
