public final class class491 extends class478 {
	int field5060;
	public int field5056;
	public int field5057;
	public int field5059;
	public int field5061;
	public int field5062;
	public int[] field5067;

	class491() {
	}

	public class491(int var1, int var2) {
		this(new int[var1 * var2], var1, var2);
	}

	public class491(int[] var1, int var2, int var3) {
		this.field5067 = var1;
		this.field5057 = this.field5061 = var2;
		this.field5056 = this.field5062 = var3;
		this.field5060 = 0;
		this.field5059 = 0;
	}

	public class491 method8839() {
		class491 var1 = new class491(this.field5057, this.field5056);
		var1.field5061 = this.field5061;
		var1.field5062 = this.field5062;
		var1.field5059 = this.field5061 - this.field5057 - this.field5059;
		var1.field5060 = this.field5060;

		for (int var2 = 0; var2 < this.field5056; ++var2) {
			for (int var3 = 0; var3 < this.field5057; ++var3) {
				var1.field5067[var2 * this.field5057 + var3] = this.field5067[var2 * this.field5057 + this.field5057 - 1 - var3];
			}
		}

		return var1;
	}

	public class491 method8840() {
		class491 var1 = new class491(this.field5057, this.field5056);
		var1.field5061 = this.field5061;
		var1.field5062 = this.field5062;
		var1.field5059 = this.field5059;
		var1.field5060 = this.field5060;
		int var2 = this.field5067.length;

		for (int var3 = 0; var3 < var2; ++var3) {
			var1.field5067[var3] = this.field5067[var3];
		}

		return var1;
	}

	public class491 method8935() {
		class491 var1 = new class491(this.field5061, this.field5062);

		for (int var2 = 0; var2 < this.field5056; ++var2) {
			for (int var3 = 0; var3 < this.field5057; ++var3) {
				var1.field5067[(var2 + this.field5060) * this.field5061 + var3 + this.field5059] = this.field5067[var2 * this.field5057 + var3];
			}
		}

		return var1;
	}

	public void method8856() {
		method8679(this.field5067, this.field5057, this.field5056);
	}

	public void method8843() {
		if (this.field5057 != this.field5061 || this.field5056 != this.field5062) {
			int[] var1 = new int[this.field5061 * this.field5062];

			for (int var2 = 0; var2 < this.field5056; ++var2) {
				for (int var3 = 0; var3 < this.field5057; ++var3) {
					var1[(var2 + this.field5060) * this.field5061 + var3 + this.field5059] = this.field5067[var2 * this.field5057 + var3];
				}
			}

			this.field5067 = var1;
			this.field5057 = this.field5061;
			this.field5056 = this.field5062;
			this.field5059 = 0;
			this.field5060 = 0;
		}
	}

	public void method8844(int var1) {
		if (this.field5057 != this.field5061 || this.field5056 != this.field5062) {
			int var2 = var1;
			if (var1 > this.field5059) {
				var2 = this.field5059;
			}

			int var3 = var1;
			if (var1 + this.field5059 + this.field5057 > this.field5061) {
				var3 = this.field5061 - this.field5059 - this.field5057;
			}

			int var4 = var1;
			if (var1 > this.field5060) {
				var4 = this.field5060;
			}

			int var5 = var1;
			if (var1 + this.field5060 + this.field5056 > this.field5062) {
				var5 = this.field5062 - this.field5060 - this.field5056;
			}

			int var6 = this.field5057 + var2 + var3;
			int var7 = this.field5056 + var4 + var5;
			int[] var8 = new int[var6 * var7];

			for (int var9 = 0; var9 < this.field5056; ++var9) {
				for (int var10 = 0; var10 < this.field5057; ++var10) {
					var8[(var9 + var4) * var6 + var10 + var2] = this.field5067[var9 * this.field5057 + var10];
				}
			}

			this.field5067 = var8;
			this.field5057 = var6;
			this.field5056 = var7;
			this.field5059 -= var2;
			this.field5060 -= var4;
		}
	}

	public void method8845() {
		int[] var1 = new int[this.field5057 * this.field5056];
		int var2 = 0;

		for (int var3 = 0; var3 < this.field5056; ++var3) {
			for (int var4 = this.field5057 - 1; var4 >= 0; --var4) {
				var1[var2++] = this.field5067[var4 + var3 * this.field5057];
			}
		}

		this.field5067 = var1;
		this.field5059 = this.field5061 - this.field5057 - this.field5059;
	}

	public void method8925() {
		int[] var1 = new int[this.field5057 * this.field5056];
		int var2 = 0;

		for (int var3 = this.field5056 - 1; var3 >= 0; --var3) {
			for (int var4 = 0; var4 < this.field5057; ++var4) {
				var1[var2++] = this.field5067[var4 + var3 * this.field5057];
			}
		}

		this.field5067 = var1;
		this.field5060 = this.field5062 - this.field5056 - this.field5060;
	}

	public void method8847(int var1) {
		int[] var2 = new int[this.field5057 * this.field5056];
		int var3 = 0;

		for (int var4 = 0; var4 < this.field5056; ++var4) {
			for (int var5 = 0; var5 < this.field5057; ++var5) {
				int var6 = this.field5067[var3];
				if (var6 == 0) {
					if (var5 > 0 && this.field5067[var3 - 1] != 0) {
						var6 = var1;
					} else if (var4 > 0 && this.field5067[var3 - this.field5057] != 0) {
						var6 = var1;
					} else if (var5 < this.field5057 - 1 && this.field5067[var3 + 1] != 0) {
						var6 = var1;
					} else if (var4 < this.field5056 - 1 && this.field5067[var3 + this.field5057] != 0) {
						var6 = var1;
					}
				}

				var2[var3++] = var6;
			}
		}

		this.field5067 = var2;
	}

	public void method8934(int var1) {
		for (int var2 = this.field5056 - 1; var2 > 0; --var2) {
			int var3 = var2 * this.field5057;

			for (int var4 = this.field5057 - 1; var4 > 0; --var4) {
				if (this.field5067[var4 + var3] == 0 && this.field5067[var4 + var3 - 1 - this.field5057] != 0) {
					this.field5067[var4 + var3] = var1;
				}
			}
		}

	}

	public void method8849(int var1, int var2) {
		var1 += this.field5059;
		var2 += this.field5060;
		int var3 = var1 + var2 * class478.field5011;
		int var4 = 0;
		int var5 = this.field5056;
		int var6 = this.field5057;
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
			method8929(class478.field5012, this.field5067, var4, var3, var6, var5, var7, var8);
		}
	}

	static void method8929(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = -var5; var8 < 0; ++var8) {
			int var9;
			for (var9 = var3 + var4 - 3; var3 < var9; var0[var3++] = var1[var2++]) {
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
				var0[var3++] = var1[var2++];
			}

			for (var9 += 3; var3 < var9; var0[var3++] = var1[var2++]) {
			}

			var3 += var6;
			var2 += var7;
		}

	}

	public void method8866(int var1, int var2) {
		var1 += this.field5059;
		var2 += this.field5060;
		int var3 = var1 + var2 * class478.field5011;
		int var4 = 0;
		int var5 = this.field5056;
		int var6 = this.field5057;
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
			method8918(class478.field5012, this.field5067, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	static void method8918(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method8852(int var1, int var2, int var3, int var4) {
		if (var3 > 0 && var4 > 0) {
			int var5 = this.field5057;
			int var6 = this.field5056;
			int var7 = 0;
			int var8 = 0;
			int var9 = this.field5061;
			int var10 = this.field5062;
			int var11 = (var9 << 16) / var3;
			int var12 = (var10 << 16) / var4;
			int var13;
			if (this.field5059 > 0) {
				var13 = ((this.field5059 << 16) + var11 - 1) / var11;
				var1 += var13;
				var7 += var13 * var11 - (this.field5059 << 16);
			}

			if (this.field5060 > 0) {
				var13 = ((this.field5060 << 16) + var12 - 1) / var12;
				var2 += var13;
				var8 += var13 * var12 - (this.field5060 << 16);
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

			method8841(class478.field5012, this.field5067, 0, var7, var8, var13, var14, var3, var4, var11, var12, var5);
		}
	}

	static void method8841(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		int var12 = var3;

		for (int var13 = -var8; var13 < 0; ++var13) {
			int var14 = (var4 >> 16) * var11;

			for (int var15 = -var7; var15 < 0; ++var15) {
				var2 = var1[(var3 >> 16) + var14];
				if (var2 != 0) {
					var0[var5++] = var2;
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

	public void method8836(int var1, int var2, int var3, int var4) {
		if (var3 == 256) {
			this.method8866(var1, var2);
		} else {
			var1 += this.field5059;
			var2 += this.field5060;
			int var5 = var1 + var2 * class478.field5011;
			int var6 = 0;
			int var7 = this.field5056;
			int var8 = this.field5057;
			int var9 = class478.field5011 - var8;
			int var10 = 0;
			int var11;
			if (var2 < class478.field5013) {
				var11 = class478.field5013 - var2;
				var7 -= var11;
				var2 = class478.field5013;
				var6 += var11 * var8;
				var5 += var11 * class478.field5011;
			}

			if (var2 + var7 > class478.field5014) {
				var7 -= var2 + var7 - class478.field5014;
			}

			if (var1 < class478.field5015) {
				var11 = class478.field5015 - var1;
				var8 -= var11;
				var1 = class478.field5015;
				var6 += var11;
				var5 += var11;
				var10 += var11;
				var9 += var11;
			}

			if (var1 + var8 > class478.field5016) {
				var11 = var1 + var8 - class478.field5016;
				var8 -= var11;
				var10 += var11;
				var9 += var11;
			}

			if (var8 > 0 && var7 > 0) {
				method8896(class478.field5012, this.field5067, 0, var6, var5, var8, var7, var9, var10, var3, var4);
			}
		}
	}

	static void method8896(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		int var11 = 256 - var9;
		int var12 = (var10 & 16711935) * var11 & -16711936;
		int var13 = (var10 & 65280) * var11 & 16711680;
		var10 = (var12 | var13) >>> 8;

		for (int var14 = -var6; var14 < 0; ++var14) {
			for (int var15 = -var5; var15 < 0; ++var15) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var12 = (var2 & 16711935) * var9 & -16711936;
					var13 = (var2 & 65280) * var9 & 16711680;
					var0[var4++] = ((var12 | var13) >>> 8) + var10;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method8885(int var1, int var2, int var3) {
		var1 += this.field5059;
		var2 += this.field5060;
		int var4 = var1 + var2 * class478.field5011;
		int var5 = 0;
		int var6 = this.field5056;
		int var7 = this.field5057;
		int var8 = class478.field5011 - var7;
		int var9 = 0;
		int var10;
		if (var2 < class478.field5013) {
			var10 = class478.field5013 - var2;
			var6 -= var10;
			var2 = class478.field5013;
			var5 += var10 * var7;
			var4 += var10 * class478.field5011;
		}

		if (var2 + var6 > class478.field5014) {
			var6 -= var2 + var6 - class478.field5014;
		}

		if (var1 < class478.field5015) {
			var10 = class478.field5015 - var1;
			var7 -= var10;
			var1 = class478.field5015;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var1 + var7 > class478.field5016) {
			var10 = var1 + var7 - class478.field5016;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			method8857(class478.field5012, this.field5067, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}

	static void method8857(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var2 & 16711935) * var9 + (var13 & 16711935) * var10 & -16711936) + ((var2 & 65280) * var9 + (var13 & 65280) * var10 & 16711680) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	public void method8871(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.field5057;
			int var7 = this.field5056;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.field5061;
			int var11 = this.field5062;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.field5059 > 0) {
				var14 = ((this.field5059 << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.field5059 << 16);
			}

			if (this.field5060 > 0) {
				var14 = ((this.field5060 << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var14 * var13 - (this.field5060 << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			var14 = var1 + var2 * class478.field5011;
			int var15 = class478.field5011 - var3;
			if (var2 + var4 > class478.field5014) {
				var4 -= var2 + var4 - class478.field5014;
			}

			int var16;
			if (var2 < class478.field5013) {
				var16 = class478.field5013 - var2;
				var4 -= var16;
				var14 += var16 * class478.field5011;
				var9 += var13 * var16;
			}

			if (var1 + var3 > class478.field5016) {
				var16 = var1 + var3 - class478.field5016;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < class478.field5015) {
				var16 = class478.field5015 - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var12 * var16;
				var15 += var16;
			}

			method8854(class478.field5012, this.field5067, 0, var8, var9, var14, var15, var3, var4, var12, var13, var6, var5);
		}
	}

	static void method8854(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		int var13 = 256 - var12;
		int var14 = var3;

		for (int var15 = -var8; var15 < 0; ++var15) {
			int var16 = (var4 >> 16) * var11;

			for (int var17 = -var7; var17 < 0; ++var17) {
				var2 = var1[(var3 >> 16) + var16];
				if (var2 != 0) {
					int var18 = var0[var5];
					var0[var5++] = ((var2 & 16711935) * var12 + (var18 & 16711935) * var13 & -16711936) + ((var2 & 65280) * var12 + (var18 & 65280) * var13 & 16711680) >> 8;
				} else {
					++var5;
				}

				var3 += var9;
			}

			var4 += var10;
			var3 = var14;
			var5 += var6;
		}

	}

	public void method8860(int var1, int var2, int var3) {
		var1 += this.field5059;
		var2 += this.field5060;
		int var4 = var1 + var2 * class478.field5011;
		int var5 = 0;
		int var6 = this.field5056;
		int var7 = this.field5057;
		int var8 = class478.field5011 - var7;
		int var9 = 0;
		int var10;
		if (var2 < class478.field5013) {
			var10 = class478.field5013 - var2;
			var6 -= var10;
			var2 = class478.field5013;
			var5 += var10 * var7;
			var4 += var10 * class478.field5011;
		}

		if (var2 + var6 > class478.field5014) {
			var6 -= var2 + var6 - class478.field5014;
		}

		if (var1 < class478.field5015) {
			var10 = class478.field5015 - var1;
			var7 -= var10;
			var1 = class478.field5015;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var1 + var7 > class478.field5016) {
			var10 = var1 + var7 - class478.field5016;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			if (var3 == 256) {
				method8921(0, 0, 0, class478.field5012, this.field5067, var5, 0, var4, 0, var7, var6, var8, var9);
			} else {
				method8851(0, 0, 0, class478.field5012, this.field5067, var5, 0, var4, 0, var7, var6, var8, var9, var3);
			}

		}
	}

	static void method8921(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12) {
		for (var8 = -var10; var8 < 0; ++var8) {
			for (var6 = -var9; var6 < 0; ++var6) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var7;
				}
			}

			var7 += var11;
			var5 += var12;
		}

	}

	static void method8851(int var0, int var1, int var2, int[] var3, int[] var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		for (var8 = -var10; var8 < 0; ++var8) {
			for (var6 = -var9; var6 < 0; ++var6) {
				var0 = var4[var5++];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var13;
					var0 = (var1 & -16711936) + (var0 * var13 - var1 & 16711680) >>> 8;
					var1 = var3[var7];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var3[var7++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var7;
				}
			}

			var7 += var11;
			var5 += var12;
		}

	}

	public void method8862(int var1, int var2, int var3, int var4, int var5) {
		if (var3 > 0 && var4 > 0) {
			int var6 = this.field5057;
			int var7 = this.field5056;
			int var8 = 0;
			int var9 = 0;
			int var10 = this.field5061;
			int var11 = this.field5062;
			int var12 = (var10 << 16) / var3;
			int var13 = (var11 << 16) / var4;
			int var14;
			if (this.field5059 > 0) {
				var14 = ((this.field5059 << 16) + var12 - 1) / var12;
				var1 += var14;
				var8 += var14 * var12 - (this.field5059 << 16);
			}

			if (this.field5060 > 0) {
				var14 = ((this.field5060 << 16) + var13 - 1) / var13;
				var2 += var14;
				var9 += var14 * var13 - (this.field5060 << 16);
			}

			if (var6 < var10) {
				var3 = ((var6 << 16) - var8 + var12 - 1) / var12;
			}

			if (var7 < var11) {
				var4 = ((var7 << 16) - var9 + var13 - 1) / var13;
			}

			var14 = var1 + var2 * class478.field5011;
			int var15 = class478.field5011 - var3;
			if (var2 + var4 > class478.field5014) {
				var4 -= var2 + var4 - class478.field5014;
			}

			int var16;
			if (var2 < class478.field5013) {
				var16 = class478.field5013 - var2;
				var4 -= var16;
				var14 += var16 * class478.field5011;
				var9 += var13 * var16;
			}

			if (var1 + var3 > class478.field5016) {
				var16 = var1 + var3 - class478.field5016;
				var3 -= var16;
				var15 += var16;
			}

			if (var1 < class478.field5015) {
				var16 = class478.field5015 - var1;
				var3 -= var16;
				var14 += var16;
				var8 += var12 * var16;
				var15 += var16;
			}

			if (var5 == 256) {
				method8907(0, 0, 0, var8, this.field5067, class478.field5012, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6);
			} else {
				method8864(0, 0, 0, var8, this.field5067, class478.field5012, 0, 0, -var4, var9, var14, var15, var3, var12, var13, var6, var5);
			}

		}
	}

	static void method8907(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15) {
		for (int var16 = var3; var8 < 0; ++var8) {
			var7 = (var9 >> 16) * var15;

			for (var6 = -var12; var6 < 0; ++var6) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var10;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var16;
			var10 += var11;
		}

	}

	static void method8864(int var0, int var1, int var2, int var3, int[] var4, int[] var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16) {
		for (int var17 = var3; var8 < 0; ++var8) {
			var7 = (var9 >> 16) * var15;

			for (var6 = -var12; var6 < 0; ++var6) {
				var0 = var4[(var3 >> 16) + var7];
				if (var0 != 0) {
					var1 = (var0 & 16711935) * var16;
					var0 = (var1 & -16711936) + (var0 * var16 - var1 & 16711680) >>> 8;
					var1 = var5[var10];
					var2 = var0 + var1;
					var0 = (var0 & 16711935) + (var1 & 16711935);
					var1 = (var0 & 16777472) + (var2 - var0 & 65536);
					var5[var10++] = var2 - var1 | var1 - (var1 >>> 8);
				} else {
					++var10;
				}

				var3 += var13;
			}

			var9 += var14;
			var3 = var17;
			var10 += var11;
		}

	}

	public void method8865(int var1, int var2, int var3, int var4, int var5, int var6, int[] var7, int[] var8) {
		int var9 = var2 < 0 ? -var2 : 0;
		int var10 = var2 + this.field5056 <= var6 ? this.field5056 : var6 - var2;
		int var11 = var1 < 0 ? -var1 : 0;
		int var10000;
		if (var1 + this.field5057 <= var5) {
			var10000 = this.field5057;
		} else {
			var10000 = var5 - var1;
		}

		int var13 = var3 + var1 + var11 + (var4 + var2 + var9) * class478.field5011;
		int var14 = var2 + var9;

		for (int var15 = var9; var15 < var10; ++var15) {
			int var16 = var7[var14];
			int var17 = var8[var14++];
			int var18 = var13;
			int var19;
			if (var1 < var16) {
				var19 = var16 - var1;
				var18 = var13 + (var19 - var11);
			} else {
				var19 = var11;
			}

			int var12;
			if (var1 + this.field5057 <= var16 + var17) {
				var12 = this.field5057;
			} else {
				var12 = var16 + var17 - var1;
			}

			for (int var20 = var19; var20 < var12; ++var20) {
				int var21 = this.field5067[var20 + var15 * this.field5057];
				if (var21 != 0) {
					class478.field5012[var18++] = var21;
				} else {
					++var18;
				}
			}

			var13 += class478.field5011;
		}

	}

	public void method8861(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int[] var9, int[] var10) {
		try {
			int var11 = -var3 / 2;
			int var12 = -var4 / 2;
			int var13 = (int)(Math.sin((double)var7 / 326.11D) * 65536.0D);
			int var14 = (int)(Math.cos((double)var7 / 326.11D) * 65536.0D);
			var13 = var13 * var8 >> 8;
			var14 = var14 * var8 >> 8;
			int var15 = (var5 << 16) + var12 * var13 + var11 * var14;
			int var16 = (var6 << 16) + (var12 * var14 - var11 * var13);
			int var17 = var1 + var2 * class478.field5011;

			for (var2 = 0; var2 < var4; ++var2) {
				int var18 = var9[var2];
				int var19 = var17 + var18;
				int var20 = var15 + var14 * var18;
				int var21 = var16 - var13 * var18;

				for (var1 = -var10[var2]; var1 < 0; ++var1) {
					class478.field5012[var19++] = this.field5067[(var20 >> 16) + (var21 >> 16) * this.field5057];
					var20 += var14;
					var21 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += class478.field5011;
			}
		} catch (Exception var23) {
		}

	}

	public void method8887(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9) {
		try {
			int var10 = -var3 / 2;
			int var11 = -var4 / 2;
			int var12 = (int)(Math.sin(var7) * 65536.0D);
			int var13 = (int)(Math.cos(var7) * 65536.0D);
			var12 = var12 * var9 >> 8;
			var13 = var13 * var9 >> 8;
			int var14 = (var5 << 16) + var11 * var12 + var10 * var13;
			int var15 = (var6 << 16) + (var11 * var13 - var10 * var12);
			int var16 = var1 + var2 * class478.field5011;

			for (var2 = 0; var2 < var4; ++var2) {
				int var17 = var16;
				int var18 = var14;
				int var19 = var15;

				for (var1 = -var3; var1 < 0; ++var1) {
					int var20 = this.field5067[(var18 >> 16) + (var19 >> 16) * this.field5057];
					if (var20 != 0) {
						class478.field5012[var17++] = var20;
					} else {
						++var17;
					}

					var18 += var13;
					var19 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += class478.field5011;
			}
		} catch (Exception var22) {
		}

	}

	public void method8868(int var1, int var2, int var3, int var4) {
		this.method8869(this.field5061 << 3, this.field5062 << 3, var1 << 4, var2 << 4, var3, var4);
	}

	void method8869(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (var6 != 0) {
			var1 -= this.field5059 << 4;
			var2 -= this.field5060 << 4;
			double var7 = (double)(var5 & 65535) * 9.587379924285257E-5D;
			int var9 = (int)Math.floor(Math.sin(var7) * (double)var6 + 0.5D);
			int var10 = (int)Math.floor(Math.cos(var7) * (double)var6 + 0.5D);
			int var11 = -var1 * var10 + -var2 * var9;
			int var12 = -(-var1) * var9 + -var2 * var10;
			int var13 = ((this.field5057 << 4) - var1) * var10 + -var2 * var9;
			int var14 = -((this.field5057 << 4) - var1) * var9 + -var2 * var10;
			int var15 = -var1 * var10 + ((this.field5056 << 4) - var2) * var9;
			int var16 = -(-var1) * var9 + ((this.field5056 << 4) - var2) * var10;
			int var17 = ((this.field5057 << 4) - var1) * var10 + ((this.field5056 << 4) - var2) * var9;
			int var18 = -((this.field5057 << 4) - var1) * var9 + ((this.field5056 << 4) - var2) * var10;
			int var19;
			int var20;
			if (var11 < var13) {
				var19 = var11;
				var20 = var13;
			} else {
				var19 = var13;
				var20 = var11;
			}

			if (var15 < var19) {
				var19 = var15;
			}

			if (var17 < var19) {
				var19 = var17;
			}

			if (var15 > var20) {
				var20 = var15;
			}

			if (var17 > var20) {
				var20 = var17;
			}

			int var21;
			int var22;
			if (var12 < var14) {
				var21 = var12;
				var22 = var14;
			} else {
				var21 = var14;
				var22 = var12;
			}

			if (var16 < var21) {
				var21 = var16;
			}

			if (var18 < var21) {
				var21 = var18;
			}

			if (var16 > var22) {
				var22 = var16;
			}

			if (var18 > var22) {
				var22 = var18;
			}

			var19 >>= 12;
			var20 = var20 + 4095 >> 12;
			var21 >>= 12;
			var22 = var22 + 4095 >> 12;
			var19 += var3;
			var20 += var3;
			var21 += var4;
			var22 += var4;
			var19 >>= 4;
			var20 = var20 + 15 >> 4;
			var21 >>= 4;
			var22 = var22 + 15 >> 4;
			if (var19 < class478.field5015) {
				var19 = class478.field5015;
			}

			if (var20 > class478.field5016) {
				var20 = class478.field5016;
			}

			if (var21 < class478.field5013) {
				var21 = class478.field5013;
			}

			if (var22 > class478.field5014) {
				var22 = class478.field5014;
			}

			var20 = var19 - var20;
			if (var20 < 0) {
				var22 = var21 - var22;
				if (var22 < 0) {
					int var23 = var21 * class478.field5011 + var19;
					double var24 = 1.6777216E7D / (double)var6;
					int var26 = (int)Math.floor(Math.sin(var7) * var24 + 0.5D);
					int var27 = (int)Math.floor(Math.cos(var7) * var24 + 0.5D);
					int var28 = (var19 << 4) + 8 - var3;
					int var29 = (var21 << 4) + 8 - var4;
					int var30 = (var1 << 8) - (var29 * var26 >> 4);
					int var31 = (var2 << 8) + (var29 * var27 >> 4);
					int var32;
					int var33;
					int var34;
					int var35;
					int var36;
					int var37;
					int var38;
					if (var27 == 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += class478.field5011) {
								var34 = var23;
								var35 = var30;
								var36 = var31;
								var37 = var20;
								if (var30 >= 0 && var31 >= 0 && var30 - (this.field5057 << 12) < 0 && var31 - (this.field5056 << 12) < 0) {
									for (; var37 < 0; ++var37) {
										var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
										if (var38 != 0) {
											class478.field5012[var34++] = var38;
										} else {
											++var34;
										}
									}
								}

								++var33;
							}
						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += class478.field5011) {
								var34 = var23;
								var35 = var30;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.field5057 << 12) < 0) {
									if ((var32 = var36 - (this.field5056 << 12)) >= 0) {
										var32 = (var26 - var32) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var36 - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
										if (var38 != 0) {
											class478.field5012[var34++] = var38;
										} else {
											++var34;
										}

										var36 += var26;
										++var37;
									}
								}

								++var33;
								var30 -= var26;
							}
						} else {
							for (var33 = var22; var33 < 0; var23 += class478.field5011) {
								var34 = var23;
								var35 = var30;
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if (var30 >= 0 && var30 - (this.field5057 << 12) < 0) {
									if (var36 < 0) {
										var32 = (var26 - 1 - var36) / var26;
										var37 = var20 + var32;
										var36 += var26 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var36 + 1 - (this.field5056 << 12) - var26) / var26) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
										if (var38 != 0) {
											class478.field5012[var34++] = var38;
										} else {
											++var34;
										}

										var36 += var26;
										++var37;
									}
								}

								++var33;
								var30 -= var26;
							}
						}
					} else if (var27 < 0) {
						if (var26 == 0) {
							for (var33 = var22; var33 < 0; var23 += class478.field5011) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31;
								var37 = var20;
								if (var31 >= 0 && var31 - (this.field5056 << 12) < 0) {
									if ((var32 = var35 - (this.field5057 << 12)) >= 0) {
										var32 = (var27 - var32) / var27;
										var37 = var20 + var32;
										var35 += var27 * var32;
										var34 = var23 + var32;
									}

									if ((var32 = (var35 - var27) / var27) > var37) {
										var37 = var32;
									}

									while (var37 < 0) {
										var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
										if (var38 != 0) {
											class478.field5012[var34++] = var38;
										} else {
											++var34;
										}

										var35 += var27;
										++var37;
									}
								}

								++var33;
								var31 += var27;
							}
						} else if (var26 < 0) {
							for (var33 = var22; var33 < 0; var23 += class478.field5011) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if ((var32 = var35 - (this.field5057 << 12)) >= 0) {
									var32 = (var27 - var32) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 - var27) / var27) > var37) {
									var37 = var32;
								}

								if ((var32 = var36 - (this.field5056 << 12)) >= 0) {
									var32 = (var26 - var32) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}

								if ((var32 = (var36 - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
									if (var38 != 0) {
										class478.field5012[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									var36 += var26;
									++var37;
								}

								++var33;
								var30 -= var26;
								var31 += var27;
							}
						} else {
							for (var33 = var22; var33 < 0; var23 += class478.field5011) {
								var34 = var23;
								var35 = var30 + (var28 * var27 >> 4);
								var36 = var31 + (var28 * var26 >> 4);
								var37 = var20;
								if ((var32 = var35 - (this.field5057 << 12)) >= 0) {
									var32 = (var27 - var32) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 - var27) / var27) > var37) {
									var37 = var32;
								}

								if (var36 < 0) {
									var32 = (var26 - 1 - var36) / var26;
									var37 += var32;
									var35 += var27 * var32;
									var36 += var26 * var32;
									var34 += var32;
								}

								if ((var32 = (var36 + 1 - (this.field5056 << 12) - var26) / var26) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
									if (var38 != 0) {
										class478.field5012[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									var36 += var26;
									++var37;
								}

								++var33;
								var30 -= var26;
								var31 += var27;
							}
						}
					} else if (var26 == 0) {
						for (var33 = var22; var33 < 0; var23 += class478.field5011) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31;
							var37 = var20;
							if (var31 >= 0 && var31 - (this.field5056 << 12) < 0) {
								if (var35 < 0) {
									var32 = (var27 - 1 - var35) / var27;
									var37 = var20 + var32;
									var35 += var27 * var32;
									var34 = var23 + var32;
								}

								if ((var32 = (var35 + 1 - (this.field5057 << 12) - var27) / var27) > var37) {
									var37 = var32;
								}

								while (var37 < 0) {
									var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
									if (var38 != 0) {
										class478.field5012[var34++] = var38;
									} else {
										++var34;
									}

									var35 += var27;
									++var37;
								}
							}

							++var33;
							var31 += var27;
						}
					} else if (var26 < 0) {
						for (var33 = var22; var33 < 0; var23 += class478.field5011) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31 + (var28 * var26 >> 4);
							var37 = var20;
							if (var35 < 0) {
								var32 = (var27 - 1 - var35) / var27;
								var37 = var20 + var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 = var23 + var32;
							}

							if ((var32 = (var35 + 1 - (this.field5057 << 12) - var27) / var27) > var37) {
								var37 = var32;
							}

							if ((var32 = var36 - (this.field5056 << 12)) >= 0) {
								var32 = (var26 - var32) / var26;
								var37 += var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 += var32;
							}

							if ((var32 = (var36 - var26) / var26) > var37) {
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
								if (var38 != 0) {
									class478.field5012[var34++] = var38;
								} else {
									++var34;
								}

								var35 += var27;
								var36 += var26;
								++var37;
							}

							++var33;
							var30 -= var26;
							var31 += var27;
						}
					} else {
						for (var33 = var22; var33 < 0; var23 += class478.field5011) {
							var34 = var23;
							var35 = var30 + (var28 * var27 >> 4);
							var36 = var31 + (var28 * var26 >> 4);
							var37 = var20;
							if (var35 < 0) {
								var32 = (var27 - 1 - var35) / var27;
								var37 = var20 + var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 = var23 + var32;
							}

							if ((var32 = (var35 + 1 - (this.field5057 << 12) - var27) / var27) > var37) {
								var37 = var32;
							}

							if (var36 < 0) {
								var32 = (var26 - 1 - var36) / var26;
								var37 += var32;
								var35 += var27 * var32;
								var36 += var26 * var32;
								var34 += var32;
							}

							if ((var32 = (var36 + 1 - (this.field5056 << 12) - var26) / var26) > var37) {
								var37 = var32;
							}

							while (var37 < 0) {
								var38 = this.field5067[(var36 >> 12) * this.field5057 + (var35 >> 12)];
								if (var38 != 0) {
									class478.field5012[var34++] = var38;
								} else {
									++var34;
								}

								var35 += var27;
								var36 += var26;
								++var37;
							}

							++var33;
							var30 -= var26;
							var31 += var27;
						}
					}

				}
			}
		}
	}

	public void method8870(int var1, int var2, int var3, int var4) {
		if (var3 <= this.field5061 && var4 <= this.field5062) {
			int var5 = var1 + this.field5059 * var3 / this.field5061;
			int var6 = var1 + ((this.field5059 + this.field5057) * var3 + this.field5061 - 1) / this.field5061;
			int var7 = var2 + this.field5060 * var4 / this.field5062;
			int var8 = var2 + ((this.field5060 + this.field5056) * var4 + this.field5062 - 1) / this.field5062;
			if (var5 < class478.field5015) {
				var5 = class478.field5015;
			}

			if (var6 > class478.field5016) {
				var6 = class478.field5016;
			}

			if (var7 < class478.field5013) {
				var7 = class478.field5013;
			}

			if (var8 > class478.field5014) {
				var8 = class478.field5014;
			}

			if (var5 < var6 && var7 < var8) {
				int var9 = var7 * class478.field5011 + var5;
				int var10 = class478.field5011 - (var6 - var5);
				if (var9 < class478.field5012.length) {
					for (int var11 = var7; var11 < var8; ++var11) {
						for (int var12 = var5; var12 < var6; ++var12) {
							int var13 = var12 - var1 << 4;
							int var14 = var11 - var2 << 4;
							int var15 = var13 * this.field5061 / var3 - (this.field5059 << 4);
							int var16 = (var13 + 16) * this.field5061 / var3 - (this.field5059 << 4);
							int var17 = var14 * this.field5062 / var4 - (this.field5060 << 4);
							int var18 = (var14 + 16) * this.field5062 / var4 - (this.field5060 << 4);
							int var19 = (var16 - var15) * (var18 - var17) >> 1;
							if (var19 != 0) {
								if (var15 < 0) {
									var15 = 0;
								}

								if (var16 >= this.field5057 << 4) {
									var16 = this.field5057 << 4;
								}

								if (var17 < 0) {
									var17 = 0;
								}

								if (var18 >= this.field5056 << 4) {
									var18 = this.field5056 << 4;
								}

								--var16;
								--var18;
								int var20 = 16 - (var15 & 15);
								int var21 = (var16 & 15) + 1;
								int var22 = 16 - (var17 & 15);
								int var23 = (var18 & 15) + 1;
								var15 >>= 4;
								var16 >>= 4;
								var17 >>= 4;
								var18 >>= 4;
								int var24 = 0;
								int var25 = 0;
								int var26 = 0;
								int var27 = 0;

								int var28;
								for (var28 = var17; var28 <= var18; ++var28) {
									int var29 = 16;
									if (var28 == var17) {
										var29 = var22;
									}

									if (var28 == var18) {
										var29 = var23;
									}

									for (int var30 = var15; var30 <= var16; ++var30) {
										int var31 = this.field5067[var28 * this.field5057 + var30];
										if (var31 != 0) {
											int var32;
											if (var30 == var15) {
												var32 = var29 * var20;
											} else if (var30 == var16) {
												var32 = var29 * var21;
											} else {
												var32 = var29 << 4;
											}

											var27 += var32;
											var24 += (var31 >> 16 & 255) * var32;
											var25 += (var31 >> 8 & 255) * var32;
											var26 += (var31 & 255) * var32;
										}
									}
								}

								if (var27 >= var19) {
									var28 = (var24 / var27 << 16) + (var25 / var27 << 8) + var26 / var27;
									if (var28 == 0) {
										var28 = 1;
									}

									class478.field5012[var9] = var28;
								}

								++var9;
							}
						}

						var9 += var10;
					}

				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
