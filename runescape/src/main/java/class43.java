public class class43 {
	int field311;
	int field312;
	int field313;
	int field314;
	int field315;
	int field316;
	int[] field317;

	class43() {
		this.field313 = class57.method1070(16);
		this.field311 = class57.method1070(24);
		this.field312 = class57.method1070(24);
		this.field314 = class57.method1070(24) + 1;
		this.field315 = class57.method1070(6) + 1;
		this.field316 = class57.method1070(8);
		int[] var1 = new int[this.field315];

		int var2;
		for (var2 = 0; var2 < this.field315; ++var2) {
			int var3 = 0;
			int var4 = class57.method1070(3);
			boolean var5 = class57.method1090() != 0;
			if (var5) {
				var3 = class57.method1070(5);
			}

			var1[var2] = var3 << 3 | var4;
		}

		this.field317 = new int[this.field315 * 8];

		for (var2 = 0; var2 < this.field315 * 8; ++var2) {
			this.field317[var2] = (var1[var2 >> 3] & 1 << (var2 & 7)) != 0 ? class57.method1070(8) : -1;
		}

	}

	void method854(float[] var1, int var2, boolean var3) {
		int var4;
		for (var4 = 0; var4 < var2; ++var4) {
			var1[var4] = 0.0F;
		}

		if (!var3) {
			var4 = class57.field431[this.field316].field462;
			int var5 = this.field312 - this.field311;
			int var6 = var5 / this.field314;
			int[] var7 = new int[var6];

			for (int var8 = 0; var8 < 8; ++var8) {
				int var9 = 0;

				while (var9 < var6) {
					int var10;
					int var11;
					if (var8 == 0) {
						var10 = class57.field431[this.field316].method1115();

						for (var11 = var4 - 1; var11 >= 0; --var11) {
							if (var9 + var11 < var6) {
								var7[var9 + var11] = var10 % this.field315;
							}

							var10 /= this.field315;
						}
					}

					for (var10 = 0; var10 < var4; ++var10) {
						var11 = var7[var9];
						int var12 = this.field317[var11 * 8 + var8];
						if (var12 >= 0) {
							int var13 = this.field311 + var9 * this.field314;
							class60 var14 = class57.field431[var12];
							int var15;
							if (this.field313 == 0) {
								var15 = this.field314 / var14.field462;

								for (int var16 = 0; var16 < var15; ++var16) {
									float[] var17 = var14.method1116();

									for (int var18 = 0; var18 < var14.field462; ++var18) {
										var1[var13 + var16 + var18 * var15] += var17[var18];
									}
								}
							} else {
								var15 = 0;

								while (var15 < this.field314) {
									float[] var19 = var14.method1116();

									for (int var20 = 0; var20 < var14.field462; ++var20) {
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
