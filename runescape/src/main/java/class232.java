public class class232 extends class428 {
	static int[] field2795;
	boolean field2791;
	boolean field2794;
	int field2783;
	int field2785;
	int field2792;
	int[] field2781;
	int[] field2786;
	int[] field2788;
	int[] field2789;
	int[] field2790;

	class232(class467 var1) {
		this.field2794 = false;
		this.field2785 = var1.method8328();
		this.field2791 = var1.method8326() == 1;
		int var2 = var1.method8326();
		if (var2 >= 1 && var2 <= 4) {
			this.field2786 = new int[var2];

			int var3;
			for (var3 = 0; var3 < var2; ++var3) {
				this.field2786[var3] = var1.method8328();
			}

			if (var2 > 1) {
				this.field2788 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; ++var3) {
					this.field2788[var3] = var1.method8326();
				}
			}

			if (var2 > 1) {
				this.field2789 = new int[var2 - 1];

				for (var3 = 0; var3 < var2 - 1; ++var3) {
					this.field2789[var3] = var1.method8326();
				}
			}

			this.field2790 = new int[var2];

			for (var3 = 0; var3 < var2; ++var3) {
				this.field2790[var3] = var1.method8480();
			}

			this.field2783 = var1.method8326();
			this.field2792 = var1.method8326();
			this.field2781 = null;
		} else {
			throw new RuntimeException();
		}
	}

	boolean method4683(double var1, int var3, class337 var4) {
		int var5;
		for (var5 = 0; var5 < this.field2786.length; ++var5) {
			if (var4.method6310(this.field2786[var5]) == null) {
				return false;
			}
		}

		var5 = var3 * var3;
		this.field2781 = new int[var5];

		for (int var6 = 0; var6 < this.field2786.length; ++var6) {
			int var8 = this.field2786[var6];
			byte[] var10 = var4.method6308(var8);
			boolean var9;
			if (null == var10) {
				var9 = false;
			} else {
				class165.method2776(var10);
				var9 = true;
			}

			class469 var7;
			if (!var9) {
				var7 = null;
			} else {
				class469 var11 = new class469();
				var11.field4926 = class336.field4226;
				var11.field4929 = class477.field5007;
				var11.field4924 = class477.field5009[0];
				var11.field4927 = class392.field4524[0];
				var11.field4928 = class7.field44[0];
				var11.field4925 = class186.field2042[0];
				var11.field4923 = class271.field3171;
				var11.field4922 = class227.field2749[0];
				class477.field5009 = null;
				class392.field4524 = null;
				class7.field44 = null;
				class186.field2042 = null;
				class271.field3171 = null;
				class227.field2749 = (byte[][])null;
				var7 = var11;
			}

			var7.method8595();
			var10 = var7.field4922;
			int[] var18 = var7.field4923;
			int var12 = this.field2790[var6];
			if ((var12 & -16777216) == 16777216) {
			}

			if ((var12 & -16777216) == 33554432) {
			}

			int var13;
			int var14;
			int var15;
			int var16;
			if ((var12 & -16777216) == 50331648) {
				var13 = var12 & 16711935;
				var14 = var12 >> 8 & 255;

				for (var15 = 0; var15 < var18.length; ++var15) {
					var16 = var18[var15];
					if ((var16 & 65535) == var16 >> 8) {
						var16 &= 255;
						var18[var15] = var13 * var16 >> 8 & 16711935 | var14 * var16 & 65280;
					}
				}
			}

			for (var13 = 0; var13 < var18.length; ++var13) {
				var18[var13] = class221.method4537(var18[var13], var1);
			}

			if (var6 == 0) {
				var13 = 0;
			} else {
				var13 = this.field2788[var6 - 1];
			}

			if (var13 == 0) {
				if (var7.field4928 == var3) {
					for (var14 = 0; var14 < var5; ++var14) {
						this.field2781[var14] = var18[var10[var14] & 255];
					}
				} else if (var7.field4928 == 64 && var3 == 128) {
					var14 = 0;

					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field2781[var14++] = var18[var10[(var16 >> 1) + (var15 >> 1 << 6)] & 255];
						}
					}
				} else {
					if (var7.field4928 != 128 || var3 != 64) {
						throw new RuntimeException();
					}

					var14 = 0;

					for (var15 = 0; var15 < var3; ++var15) {
						for (var16 = 0; var16 < var3; ++var16) {
							this.field2781[var14++] = var18[var10[(var16 << 1) + (var15 << 1 << 7)] & 255];
						}
					}
				}
			}

			if (var13 == 1) {
			}

			if (var13 == 2) {
			}

			if (var13 == 3) {
			}
		}

		return true;
	}

	void method4687() {
		this.field2781 = null;
	}

	void method4682(int var1) {
		if (this.field2781 != null) {
			short var2;
			int var3;
			int var4;
			int var5;
			int var6;
			int var7;
			int[] var10;
			if (this.field2783 == 1 || this.field2783 == 3) {
				if (field2795 == null || field2795.length < this.field2781.length) {
					field2795 = new int[this.field2781.length];
				}

				if (this.field2781.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field2781.length;
				var4 = var2 * var1 * this.field2792;
				var5 = var3 - 1;
				if (this.field2783 == 1) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; ++var6) {
					var7 = var6 + var4 & var5;
					field2795[var6] = this.field2781[var7];
				}

				var10 = this.field2781;
				this.field2781 = field2795;
				field2795 = var10;
			}

			if (this.field2783 == 2 || this.field2783 == 4) {
				if (field2795 == null || field2795.length < this.field2781.length) {
					field2795 = new int[this.field2781.length];
				}

				if (this.field2781.length == 4096) {
					var2 = 64;
				} else {
					var2 = 128;
				}

				var3 = this.field2781.length;
				var4 = var1 * this.field2792;
				var5 = var2 - 1;
				if (this.field2783 == 2) {
					var4 = -var4;
				}

				for (var6 = 0; var6 < var3; var6 += var2) {
					for (var7 = 0; var7 < var2; ++var7) {
						int var8 = var6 + var7;
						int var9 = var6 + (var7 + var4 & var5);
						field2795[var8] = this.field2781[var9];
					}
				}

				var10 = this.field2781;
				this.field2781 = field2795;
				field2795 = var10;
			}

		}
	}
}
