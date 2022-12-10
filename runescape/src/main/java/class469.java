public final class class469 extends class478 {
	public byte[] field4922;
	public int field4924;
	public int field4925;
	public int field4926;
	public int field4927;
	public int field4928;
	public int field4929;
	public int[] field4923;

	public class469() {
	}

	public void method8595() {
		if (this.field4928 != this.field4926 || this.field4925 != this.field4929) {
			byte[] var1 = new byte[this.field4926 * this.field4929];
			int var2 = 0;

			for (int var3 = 0; var3 < this.field4925; ++var3) {
				for (int var4 = 0; var4 < this.field4928; ++var4) {
					var1[var4 + this.field4924 + (var3 + this.field4927) * this.field4926] = this.field4922[var2++];
				}
			}

			this.field4922 = var1;
			this.field4928 = this.field4926;
			this.field4925 = this.field4929;
			this.field4924 = 0;
			this.field4927 = 0;
		}
	}

	public void method8589(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field4923.length; ++var4) {
			int var5 = this.field4923[var4] >> 16 & 255;
			var5 += var1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = this.field4923[var4] >> 8 & 255;
			var6 += var2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = this.field4923[var4] & 255;
			var7 += var3;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			this.field4923[var4] = (var5 << 16) + (var6 << 8) + var7;
		}

	}

	public void method8587(int var1, int var2) {
		var1 += this.field4924;
		var2 += this.field4927;
		int var3 = var1 + var2 * class478.field5011;
		int var4 = 0;
		int var5 = this.field4925;
		int var6 = this.field4928;
		int var7 = class478.field5011 - var6;
		int var8 = 0;
		int var9;
		if (var2 < class478.field5013) {
			var9 = class478.field5013 - var2;
			var5 -= var9;
			var2 = class478.field5013;
			var4 += var9 * var6;
			var3 += var9 * class478.field5011;
		}

		if (var2 + var5 > class478.field5014) {
			var5 -= var2 + var5 - class478.field5014;
		}

		if (var1 < class478.field5015) {
			var9 = class478.field5015 - var1;
			var6 -= var9;
			var1 = class478.field5015;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var1 + var6 > class478.field5016) {
			var9 = var1 + var6 - class478.field5016;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			method8588(class478.field5012, this.field4922, this.field4923, var4, var3, var6, var5, var7, var8);
		}
	}

	static void method8588(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			byte var12;
			for (var11 = var9; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}

				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var12 = var1[var3++];
				if (var12 != 0) {
					var0[var4++] = var2[var12 & 255];
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method8608(int var1, int var2, int var3, int var4) {
		int var5 = this.field4928;
		int var6 = this.field4925;
		int var7 = 0;
		int var8 = 0;
		int var9 = this.field4926;
		int var10 = this.field4929;
		int var11 = (var9 << 16) / var3;
		int var12 = (var10 << 16) / var4;
		int var13;
		if (this.field4924 > 0) {
			var13 = ((this.field4924 << 16) + var11 - 1) / var11;
			var1 += var13;
			var7 += var13 * var11 - (this.field4924 << 16);
		}

		if (this.field4927 > 0) {
			var13 = ((this.field4927 << 16) + var12 - 1) / var12;
			var2 += var13;
			var8 += var13 * var12 - (this.field4927 << 16);
		}

		if (var5 < var9) {
			var3 = ((var5 << 16) - var7 + var11 - 1) / var11;
		}

		if (var6 < var10) {
			var4 = ((var6 << 16) - var8 + var12 - 1) / var12;
		}

		var13 = var1 + var2 * class478.field5011;
		int var14 = class478.field5011 - var3;
		if (var2 + var4 > class478.field5014) {
			var4 -= var2 + var4 - class478.field5014;
		}

		int var15;
		if (var2 < class478.field5013) {
			var15 = class478.field5013 - var2;
			var4 -= var15;
			var13 += var15 * class478.field5011;
			var8 += var12 * var15;
		}

		if (var1 + var3 > class478.field5016) {
			var15 = var1 + var3 - class478.field5016;
			var3 -= var15;
			var14 += var15;
		}

		if (var1 < class478.field5015) {
			var15 = class478.field5015 - var1;
			var3 -= var15;
			var13 += var15;
			var7 += var11 * var15;
			var14 += var15;
		}

		method8590(class478.field5012, this.field4922, this.field4923, var7, var8, var13, var14, var3, var4, var11, var12, var5);
	}

	static void method8590(int[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				byte var16 = var1[(var3 >> 16) + var14];
				if (var16 != 0) {
					var0[var5++] = var2[var16 & 255];
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var12;
			var5 += var6;
		}

	}
}
