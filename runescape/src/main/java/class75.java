public class class75 {
	static float field689;
	static float[][] field686;
	static int field681;
	static int[][] field682;
	int[] field685;
	int[] field687;
	int[][][] field684;
	int[][][] field692;

	static {
		field686 = new float[2][8];
		field682 = new int[2][8];
	}

	class75() {
		this.field687 = new int[2];
		this.field692 = new int[2][2][4];
		this.field684 = new int[2][2][4];
		this.field685 = new int[2];
	}

	float method1506(int var1, int var2, float var3) {
		float var4 = (float)this.field684[var1][0][var2] + var3 * (float)(this.field684[var1][1][var2] - this.field684[var1][0][var2]);
		var4 *= 0.0015258789F;
		return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
	}

	static float method1509(float var0) {
		float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
		return var1 * 3.1415927F / 11025.0F;
	}

	float method1511(int var1, int var2, float var3) {
		float var4 = (float)this.field692[var1][0][var2] + var3 * (float)(this.field692[var1][1][var2] - this.field692[var1][0][var2]);
		var4 *= 1.2207031E-4F;
		return method1509(var4);
	}

	int method1508(int var1, float var2) {
		float var3;
		if (var1 == 0) {
			var3 = (float)this.field685[0] + (float)(this.field685[1] - this.field685[0]) * var2;
			var3 *= 0.0030517578F;
			field689 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
			field681 = (int)(field689 * 65536.0F);
		}

		if (this.field687[var1] == 0) {
			return 0;
		} else {
			var3 = this.method1506(var1, 0, var2);
			field686[var1][0] = var3 * -2.0F * (float)Math.cos((double)this.method1511(var1, 0, var2));
			field686[var1][1] = var3 * var3;

			float[] var10000;
			int var4;
			for (var4 = 1; var4 < this.field687[var1]; ++var4) {
				var3 = this.method1506(var1, var4, var2);
				float var5 = var3 * -2.0F * (float)Math.cos((double)this.method1511(var1, var4, var2));
				float var6 = var3 * var3;
				field686[var1][var4 * 2 + 1] = field686[var1][var4 * 2 - 1] * var6;
				field686[var1][var4 * 2] = field686[var1][var4 * 2 - 1] * var5 + field686[var1][var4 * 2 - 2] * var6;

				for (int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
					var10000 = field686[var1];
					var10000[var7] += field686[var1][var7 - 1] * var5 + field686[var1][var7 - 2] * var6;
				}

				var10000 = field686[var1];
				var10000[1] += field686[var1][0] * var5 + var6;
				var10000 = field686[var1];
				var10000[0] += var5;
			}

			if (var1 == 0) {
				for (var4 = 0; var4 < this.field687[0] * 2; ++var4) {
					var10000 = field686[0];
					var10000[var4] *= field689;
				}
			}

			for (var4 = 0; var4 < this.field687[var1] * 2; ++var4) {
				field682[var1][var4] = (int)(field686[var1][var4] * 65536.0F);
			}

			return this.field687[var1] * 2;
		}
	}

	final void method1510(class467 var1, class34 var2) {
		int var3 = var1.method8326();
		this.field687[0] = var3 >> 4;
		this.field687[1] = var3 & 15;
		if (var3 != 0) {
			this.field685[0] = var1.method8328();
			this.field685[1] = var1.method8328();
			int var4 = var1.method8326();

			int var5;
			int var6;
			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field687[var5]; ++var6) {
					this.field692[var5][0][var6] = var1.method8328();
					this.field684[var5][0][var6] = var1.method8328();
				}
			}

			for (var5 = 0; var5 < 2; ++var5) {
				for (var6 = 0; var6 < this.field687[var5]; ++var6) {
					if ((var4 & 1 << var5 * 4 << var6) != 0) {
						this.field692[var5][1][var6] = var1.method8328();
						this.field684[var5][1][var6] = var1.method8328();
					} else {
						this.field692[var5][1][var6] = this.field692[var5][0][var6];
						this.field684[var5][1][var6] = this.field684[var5][0][var6];
					}
				}
			}

			if (var4 != 0 || this.field685[1] != this.field685[0]) {
				var2.method431(var1);
			}
		} else {
			int[] var7 = this.field685;
			this.field685[1] = 0;
			var7[0] = 0;
		}

	}
}
