import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "aq"
)
public class class275 {
	@ObfInfo(
		owner = "aq",
		name = "e",
		desc = "I"
	)
	int field2312;
	@ObfInfo(
		owner = "aq",
		name = "v",
		desc = "I"
	)
	int field2313;
	@ObfInfo(
		owner = "aq",
		name = "h",
		desc = "I"
	)
	int field2314;
	@ObfInfo(
		owner = "aq",
		name = "x",
		desc = "I"
	)
	int field2315;
	@ObfInfo(
		owner = "aq",
		name = "m",
		desc = "I"
	)
	int field2316;
	@ObfInfo(
		owner = "aq",
		name = "q",
		desc = "I"
	)
	int field2317;
	@ObfInfo(
		owner = "aq",
		name = "f",
		desc = "[I"
	)
	int[] field2318;

	@ObfInfo(
		owner = "aq",
		name = "<init>",
		desc = "()V"
	)
	class275() {
		this.field2314 = class370.method1826(16);
		this.field2312 = class370.method1826(24);
		this.field2313 = class370.method1826(24);
		this.field2315 = class370.method1826(24) + 1;
		this.field2316 = class370.method1826(6) + 1;
		this.field2317 = class370.method1826(8);
		int[] var1 = new int[this.field2316];

		int var2;
		for (var2 = 0; var2 < this.field2316; ++var2) {
			int var3 = 0;
			int var4 = class370.method1826(3);
			boolean var5 = class370.method1832() != 0;
			if (var5) {
				var3 = class370.method1826(5);
			}

			var1[var2] = var3 << 3 | var4;
		}

		this.field2318 = new int[this.field2316 * 8];

		for (var2 = 0; var2 < this.field2316 * 8; ++var2) {
			this.field2318[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? class370.method1826(8) : -1;
		}

	}

	@ObfInfo(
		owner = "aq",
		name = "h",
		desc = "([FIZ)V"
	)
	void method1368(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			var4 = class370.field3141[this.field2317].field1113;
			int var5 = this.field2313 - this.field2312;
			int var6 = var5 / this.field2315;
			int[] var7 = new int[var6];

			for (int var8 = 0; var8 < 8; ++var8) {
				int var9 = 0;

				while (var9 < var6) {
					int var10;
					int var11;
					if (var8 == 0) {
						var10 = class370.field3141[this.field2317].method631();

						for (var11 = var4 - 1; var11 >= 0; --var11) {
							if (var9 + var11 < var6) {
								var7[var9 + var11] = var10 % this.field2316;
							}

							var10 /= this.field2316;
						}
					}

					for (var10 = 0; var10 < var4; ++var10) {
						var11 = var7[var9];
						int var12 = this.field2318[var11 * 8 + var8];
						if (var12 >= 0) {
							int var13 = this.field2312 + var9 * this.field2315;
							class136 var14 = class370.field3141[var12];
							int var15;
							if (this.field2314 == 0) {
								var15 = this.field2315 / var14.field1113;

								for (int var16 = 0; var16 < var15; ++var16) {
									float[] var17 = var14.method632();

									for (int var18 = 0; var18 < var14.field1113; ++var18) {
										var1[var13 + var16 + var18 * var15] += var17[var18];
									}
								}
							} else {
								var15 = 0;

								while (var15 < this.field2315) {
									float[] var19 = var14.method632();

									for (int var20 = 0; var20 < var14.field1113; ++var20) {
										var1[var13 + var15] += var19[var20];
										++var15;
									}
								}
							}
						}

						++var9;
						if (var9 >= var6) {
							break;
						}
					}
				}
			}

		}
	}
}
