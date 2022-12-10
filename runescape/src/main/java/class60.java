public class class60 {
	float[][] field465;
	int field462;
	int field463;
	int[] field461;
	int[] field464;
	int[] field466;

	static int method1126(int var0, int var1) {
		int var2 = (int)Math.pow((double)var0, 1.0D / (double)var1) + 1;

		while (true) {
			int var4 = var2;
			int var5 = var1;

			int var6;
			for (var6 = 1; var5 > 1; var5 >>= 1) {
				if ((var5 & 1) != 0) {
					var6 *= var4;
				}

				var4 *= var4;
			}

			int var3;
			if (var5 == 1) {
				var3 = var4 * var6;
			} else {
				var3 = var6;
			}

			if (var3 <= var0) {
				return var2;
			}

			--var2;
		}
	}

	class60() {
		class57.method1070(24);
		this.field462 = class57.method1070(16);
		this.field463 = class57.method1070(24);
		this.field461 = new int[this.field463];
		boolean var1 = class57.method1090() != 0;
		int var2;
		int var3;
		int var5;
		if (var1) {
			var2 = 0;

			for (var3 = class57.method1070(5) + 1; var2 < this.field463; ++var3) {
				int var4 = class57.method1070(class88.method1936(this.field463 - var2));

				for (var5 = 0; var5 < var4; ++var5) {
					this.field461[var2++] = var3;
				}
			}
		} else {
			boolean var14 = class57.method1090() != 0;

			for (var3 = 0; var3 < this.field463; ++var3) {
				if (var14 && class57.method1090() == 0) {
					this.field461[var3] = 0;
				} else {
					this.field461[var3] = class57.method1070(5) + 1;
				}
			}
		}

		this.method1114();
		var2 = class57.method1070(4);
		if (var2 > 0) {
			float var15 = class57.method1069(class57.method1070(32));
			float var16 = class57.method1069(class57.method1070(32));
			var5 = class57.method1070(4) + 1;
			boolean var6 = class57.method1090() != 0;
			int var7;
			if (var2 == 1) {
				var7 = method1126(this.field463, this.field462);
			} else {
				var7 = this.field463 * this.field462;
			}

			this.field464 = new int[var7];

			int var8;
			for (var8 = 0; var8 < var7; ++var8) {
				this.field464[var8] = class57.method1070(var5);
			}

			this.field465 = new float[this.field463][this.field462];
			float var9;
			int var10;
			int var11;
			if (var2 == 1) {
				for (var8 = 0; var8 < this.field463; ++var8) {
					var9 = 0.0F;
					var10 = 1;

					for (var11 = 0; var11 < this.field462; ++var11) {
						int var12 = var8 / var10 % var7;
						float var13 = (float)this.field464[var12] * var16 + var15 + var9;
						this.field465[var8][var11] = var13;
						if (var6) {
							var9 = var13;
						}

						var10 *= var7;
					}
				}
			} else {
				for (var8 = 0; var8 < this.field463; ++var8) {
					var9 = 0.0F;
					var10 = var8 * this.field462;

					for (var11 = 0; var11 < this.field462; ++var11) {
						float var17 = (float)this.field464[var10] * var16 + var15 + var9;
						this.field465[var8][var11] = var17;
						if (var6) {
							var9 = var17;
						}

						++var10;
					}
				}
			}
		}

	}

	void method1114() {
		int[] var1 = new int[this.field463];
		int[] var2 = new int[33];

		int var3;
		int var4;
		int var5;
		int var6;
		int var7;
		int var8;
		int var10;
		for (var3 = 0; var3 < this.field463; ++var3) {
			var4 = this.field461[var3];
			if (var4 != 0) {
				var5 = 1 << 32 - var4;
				var6 = var2[var4];
				var1[var3] = var6;
				int var9;
				if ((var6 & var5) != 0) {
					var7 = var2[var4 - 1];
				} else {
					var7 = var6 | var5;

					for (var8 = var4 - 1; var8 >= 1; --var8) {
						var9 = var2[var8];
						if (var9 != var6) {
							break;
						}

						var10 = 1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}

						var2[var8] = var9 | var10;
					}
				}

				var2[var4] = var7;

				for (var8 = var4 + 1; var8 <= 32; ++var8) {
					var9 = var2[var8];
					if (var9 == var6) {
						var2[var8] = var7;
					}
				}
			}
		}

		this.field466 = new int[8];
		int var11 = 0;

		for (var3 = 0; var3 < this.field463; ++var3) {
			var4 = this.field461[var3];
			if (var4 != 0) {
				var5 = var1[var3];
				var6 = 0;

				for (var7 = 0; var7 < var4; ++var7) {
					var8 = Integer.MIN_VALUE >>> var7;
					if ((var5 & var8) != 0) {
						if (this.field466[var6] == 0) {
							this.field466[var6] = var11;
						}

						var6 = this.field466[var6];
					} else {
						++var6;
					}

					if (var6 >= this.field466.length) {
						int[] var12 = new int[this.field466.length * 2];

						for (var10 = 0; var10 < this.field466.length; ++var10) {
							var12[var10] = this.field466[var10];
						}

						this.field466 = var12;
					}

					var8 >>>= 1;
				}

				this.field466[var6] = ~var3;
				if (var6 >= var11) {
					var11 = var6 + 1;
				}
			}
		}

	}

	int method1115() {
		int var1;
		for (var1 = 0; this.field466[var1] >= 0; var1 = class57.method1090() != 0 ? this.field466[var1] : var1 + 1) {
		}

		return ~this.field466[var1];
	}

	float[] method1116() {
		return this.field465[this.method1115()];
	}
}
