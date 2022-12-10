public class class419 {
	boolean field4711;
	class337 field4713;
	int field4718;
	String field4716;

	public static int method7893(float[] var0, int var1, float var2, boolean var3, float var4, boolean var5, float[] var6) {
		float var8 = 0.0F;

		for (int var9 = 0; var9 < var1 + 1; ++var9) {
			var8 += Math.abs(var0[var9]);
		}

		float var25 = (Math.abs(var2) + Math.abs(var4)) * (float)(var1 + 1) * class106.field1088;
		if (var8 <= var25) {
			return -1;
		} else {
			float[] var10 = new float[var1 + 1];

			int var11;
			for (var11 = 0; var11 < var1 + 1; ++var11) {
				var10[var11] = 1.0F / var8 * var0[var11];
			}

			while (Math.abs(var10[var1]) < var25) {
				--var1;
			}

			var11 = 0;
			if (var1 == 0) {
				return var11;
			} else if (var1 == 1) {
				var6[0] = -var10[0] / var10[1];
				boolean var12 = var3 ? var2 < var25 + var6[0] : var2 < var6[0] - var25;
				boolean var13 = var5 ? var4 > var6[0] - var25 : var4 > var25 + var6[0];
				var11 = var12 && var13 ? 1 : 0;
				if (var11 > 0) {
					if (var3 && var6[0] < var2) {
						var6[0] = var2;
					} else if (var5 && var6[0] > var4) {
						var6[0] = var4;
					}
				}

				return var11;
			} else {
				class416 var22 = new class416(var10, var1);
				float[] var23 = new float[var1 + 1];

				for (int var14 = 1; var14 <= var1; ++var14) {
					var23[var14 - 1] = (float)var14 * var10[var14];
				}

				float[] var24 = new float[var1 + 1];
				int var15 = method7893(var23, var1 - 1, var2, false, var4, false, var24);
				if (var15 == -1) {
					return 0;
				} else {
					boolean var16 = false;
					float var18 = 0.0F;
					float var19 = 0.0F;
					float var20 = 0.0F;

					for (int var21 = 0; var21 <= var15; ++var21) {
						if (var11 > var1) {
							return var11;
						}

						float var17;
						if (var21 == 0) {
							var17 = var2;
							var19 = class416.method1055(var10, var1, var2);
							if (Math.abs(var19) <= var25 && var3) {
								var6[var11++] = var2;
							}
						} else {
							var17 = var20;
							var19 = var18;
						}

						if (var21 == var15) {
							var20 = var4;
							var16 = false;
						} else {
							var20 = var24[var21];
						}

						var18 = class416.method1055(var10, var1, var20);
						if (var16) {
							var16 = false;
						} else if (Math.abs(var18) < var25) {
							if (var21 != var15 || var5) {
								var6[var11++] = var20;
								var16 = true;
							}
						} else if (var19 < 0.0F && var18 > 0.0F || var19 > 0.0F && var18 < 0.0F) {
							var6[var11++] = class405.method7523(var22, var17, var20, 0.0F);
							if (var11 > 1 && var6[var11 - 2] >= var6[var11 - 1] - var25) {
								var6[var11 - 2] = (var6[var11 - 1] + var6[var11 - 2]) * 0.5F;
								--var11;
							}
						}
					}

					return var11;
				}
			}
		}
	}

	class419(class337 var1) {
		this.field4718 = 0;
		this.field4711 = false;
		this.field4713 = var1;
	}

	void method7880(String var1) {
		if (null != var1 && !var1.isEmpty()) {
			if (var1 != this.field4716) {
				this.field4716 = var1;
				this.field4718 = 0;
				this.field4711 = false;
				this.method7885();
			}
		}
	}

	int method7885() {
		if (this.field4718 < 33) {
			if (!this.field4713.method6323(class237.field2846.field2849, this.field4716)) {
				return this.field4718;
			}

			this.field4718 = 33;
		}

		if (33 == this.field4718) {
			if (this.field4713.method6358(class237.field2850.field2849, this.field4716) && !this.field4713.method6323(class237.field2850.field2849, this.field4716)) {
				return this.field4718;
			}

			this.field4718 = 66;
		}

		if (66 == this.field4718) {
			if (!this.field4713.method6323(this.field4716, class237.field2845.field2849)) {
				return this.field4718;
			}

			this.field4718 = 100;
			this.field4711 = true;
		}

		return this.field4718;
	}

	boolean method7882() {
		return this.field4711;
	}

	int method7879() {
		return this.field4718;
	}
}
