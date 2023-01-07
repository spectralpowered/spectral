import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "bn"
)
public final class class339 extends class295 {
	@ObfInfo(
		owner = "bn",
		name = "b",
		desc = "Z"
	)
	boolean field2710;
	@ObfInfo(
		owner = "bn",
		name = "f",
		desc = "Lga;"
	)
	class242 field2713;
	@ObfInfo(
		owner = "bn",
		name = "h",
		desc = "I"
	)
	int field2706;
	@ObfInfo(
		owner = "bn",
		name = "e",
		desc = "I"
	)
	int field2707;
	@ObfInfo(
		owner = "bn",
		name = "v",
		desc = "I"
	)
	int field2708;
	@ObfInfo(
		owner = "bn",
		name = "m",
		desc = "I"
	)
	int field2709;
	@ObfInfo(
		owner = "bn",
		name = "q",
		desc = "I"
	)
	int field2711;
	@ObfInfo(
		owner = "bn",
		name = "r",
		desc = "I"
	)
	int field2712;
	@ObfInfo(
		owner = "bn",
		name = "u",
		desc = "I"
	)
	int field2714;
	@ObfInfo(
		owner = "bn",
		name = "x",
		desc = "I"
	)
	int field2715;

	@ObfInfo(
		owner = "bn",
		name = "<init>",
		desc = "(IIIIIII)V"
	)
	class339(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.field2712 = 0;
		this.field2714 = 0;
		this.field2710 = false;
		this.field2706 = var1;
		this.field2708 = var2;
		this.field2709 = var3;
		this.field2715 = var4;
		this.field2711 = var5;
		this.field2707 = var6 + var7;
		int var8 = class429.method2119(this.field2706).field2585;
		if (var8 != -1) {
			this.field2710 = false;
			this.field2713 = class271.method1277(var8);
		} else {
			this.field2710 = true;
		}

	}

	@ObfInfo(
		owner = "bn",
		name = "h",
		desc = "(II)V"
	)
	final void method1704(int var1) {
		if (!this.field2710) {
			this.field2714 += var1;
			if (!this.field2713.method1056()) {
				while (this.field2714 > this.field2713.field2037[this.field2712]) {
					this.field2714 -= this.field2713.field2037[this.field2712];
					++this.field2712;
					if (this.field2712 >= this.field2713.field2043.length) {
						this.field2710 = true;
						break;
					}
				}
			} else {
				this.field2712 += var1;
				if (this.field2712 >= this.field2713.method1058()) {
					this.field2710 = true;
				}
			}

		}
	}

	@ObfInfo(
		owner = "bn",
		name = "e",
		desc = "(I)Lhh;"
	)
	protected final class470 method1438() {
		class327 var2 = class429.method2119(this.field2706);
		class470 var3;
		if (!this.field2710) {
			var3 = var2.method1663(this.field2712);
		} else {
			var3 = var2.method1663(-1);
		}

		return var3 == null ? null : var3;
	}

	@ObfInfo(
		owner = "bn",
		name = "h",
		desc = "(I)[Lom;"
	)
	static class436[] method1705() {
		return new class436[]{class436.field3614, class436.field3613, class436.field3612, class436.field3616};
	}

	@ObfInfo(
		owner = "bn",
		name = "gu",
		desc = "(B)I"
	)
	static int method1700() {
		if (null != client.field515 && client.field443 < client.field515.size()) {
			int var1 = 0;

			for (int var2 = 0; var2 <= client.field443; ++var2) {
				var1 += ((class193)client.field515.get(var2)).field1721;
			}

			return var1 * 10000 / client.field517;
		} else {
			return 10000;
		}
	}

	@ObfInfo(
		owner = "bn",
		name = "c",
		desc = "(I)I"
	)
	static int method1701() {
		return class359.field3075;
	}

	@ObfInfo(
		owner = "bn",
		name = "im",
		desc = "(I)Z"
	)
	static boolean method1703() {
		return (client.field449 & 8) != 0;
	}

	@ObfInfo(
		owner = "bn",
		name = "kk",
		desc = "(Lkd;II)I"
	)
	static final int method1702(class120 var0, int var1) {
		if (var0.field885 != null && var1 < var0.field885.length) {
			try {
				int[] var3 = var0.field885[var1];
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
						var8 = client.field293[var3[var5++]];
					}

					if (var7 == 2) {
						var8 = client.field365[var3[var5++]];
					}

					if (var7 == 3) {
						var8 = client.field366[var3[var5++]];
					}

					int var10;
					class120 var11;
					int var12;
					int var13;
					if (var7 == 4) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class67.method299(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class423.method2062(var12).field2162 || client.field222)) {
							for (var13 = 0; var13 < var11.field887.length; ++var13) {
								if (var12 + 1 == var11.field887[var13]) {
									var8 += var11.field931[var13];
								}
							}
						}
					}

					if (var7 == 5) {
						var8 = class291.field2373[var3[var5++]];
					}

					if (var7 == 6) {
						var8 = class150.field1171[client.field365[var3[var5++]] - 1];
					}

					if (var7 == 7) {
						var8 = class291.field2373[var3[var5++]] * 100 / 46875;
					}

					if (var7 == 8) {
						var8 = class113.field846.field3198;
					}

					if (var7 == 9) {
						for (var10 = 0; var10 < 25; ++var10) {
							if (class150.field1170[var10]) {
								var8 += client.field365[var10];
							}
						}
					}

					if (var7 == 10) {
						var10 = var3[var5++] << 16;
						var10 += var3[var5++];
						var11 = class67.method299(var10);
						var12 = var3[var5++];
						if (var12 != -1 && (!class423.method2062(var12).field2162 || client.field222)) {
							for (var13 = 0; var13 < var11.field887.length; ++var13) {
								if (var11.field887[var13] == var12 + 1) {
									var8 = 999999999;
									break;
								}
							}
						}
					}

					if (var7 == 11) {
						var8 = client.field342;
					}

					if (var7 == 12) {
						var8 = client.field401;
					}

					if (var7 == 13) {
						var10 = class291.field2373[var3[var5++]];
						int var14 = var3[var5++];
						var8 = 0 != (var10 & 1 << var14) ? 1 : 0;
					}

					if (var7 == 14) {
						var10 = var3[var5++];
						var8 = class67.method300(var10);
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
						var8 = class312.field2465 + (class113.field846.field2672 >> 7);
					}

					if (var7 == 19) {
						var8 = class325.field2575 + (class113.field846.field2608 >> 7);
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
