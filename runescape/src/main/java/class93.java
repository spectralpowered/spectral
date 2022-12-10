import java.util.Iterator;

public class class93 {
	static class392 field910;
	static class487 field911;
	static int field907;
	class469[] field894;
	int field888;
	int field893;
	int field898;
	int field899;
	int field905;
	int field909;
	int[] field892;
	int[] field896;
	int[] field897;
	int[] field900;
	int[] field901;
	int[] field902;
	int[] field903;
	int[] field904;
	int[] field906;

	class93(class469[] var1) {
		this.field897 = new int[256];
		this.field893 = 0;
		this.field909 = 0;
		this.field899 = 0;
		this.field888 = 0;
		this.field905 = 0;
		this.field898 = 0;
		this.field894 = var1;
		this.method1971();
	}

	void method1971() {
		this.field901 = new int[256];

		int var2;
		for (var2 = 0; var2 < 64; ++var2) {
			this.field901[var2] = var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field901[var2 + 64] = var2 * 1024 + 16711680;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field901[var2 + 128] = 16776960 + var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field901[var2 + 192] = 16777215;
		}

		this.field896 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field896[var2] = var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field896[var2 + 64] = var2 * 4 + 65280;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field896[var2 + 128] = 65535 + var2 * 262144;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field896[var2 + 192] = 16777215;
		}

		this.field892 = new int[256];

		for (var2 = 0; var2 < 64; ++var2) {
			this.field892[var2] = var2 * 4;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field892[var2 + 64] = var2 * 262144 + 255;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field892[var2 + 128] = 16711935 + var2 * 1024;
		}

		for (var2 = 0; var2 < 64; ++var2) {
			this.field892[var2 + 192] = 16777215;
		}

		this.field906 = new int[256];
		this.field888 = 0;
		this.field902 = new int[32768];
		this.field903 = new int[32768];
		this.method1979((class469)null);
		this.field900 = new int[32768];
		this.field904 = new int[32768];
	}

	void method1982() {
		this.field901 = null;
		this.field896 = null;
		this.field892 = null;
		this.field906 = null;
		this.field902 = null;
		this.field903 = null;
		this.field900 = null;
		this.field904 = null;
		this.field888 = 0;
		this.field905 = 0;
	}

	void method1973(int var1, int var2) {
		if (this.field900 == null) {
			this.method1971();
		}

		if (this.field898 == 0) {
			this.field898 = var2;
		}

		int var4 = var2 - this.field898;
		if (var4 >= 256) {
			var4 = 0;
		}

		this.field898 = var2;
		if (var4 > 0) {
			this.method1974(var4);
		}

		this.method1972(var1);
	}

	static String method1991() {
		StringBuilder var1 = new StringBuilder();

		class74 var3;
		for (Iterator var2 = class105.field1084.iterator(); var2.hasNext(); var1.append(var3.field676).append('\n')) {
			var3 = (class74)var2.next();
			if (null != var3.field673 && !var3.field673.isEmpty()) {
				var1.append(var3.field673).append(':');
			}
		}

		return var1.toString();
	}

	final void method1974(int var1) {
		this.field888 += var1 * 128;
		int var3;
		if (this.field888 > this.field902.length) {
			this.field888 -= this.field902.length;
			var3 = (int)(Math.random() * 12.0D);
			this.method1979(this.field894[var3]);
		}

		var3 = 0;
		int var4 = var1 * 128;
		int var5 = (256 - var1) * 128;

		int var7;
		for (int var6 = 0; var6 < var5; ++var6) {
			var7 = this.field900[var4 + var3] - var1 * this.field902[var3 + this.field888 & this.field902.length - 1] / 6;
			if (var7 < 0) {
				var7 = 0;
			}

			this.field900[var3++] = var7;
		}

		byte var16 = 10;
		var7 = 128 - var16;

		int var8;
		int var11;
		for (var8 = 256 - var1; var8 < 256; ++var8) {
			int var9 = var8 * 128;

			for (int var10 = 0; var10 < 128; ++var10) {
				var11 = (int)(Math.random() * 100.0D);
				if (var11 < 50 && var10 > var16 && var10 < var7) {
					this.field900[var10 + var9] = 255;
				} else {
					this.field900[var9 + var10] = 0;
				}
			}
		}

		if (this.field909 > 0) {
			this.field909 -= var1 * 4;
		}

		if (this.field899 > 0) {
			this.field899 -= var1 * 4;
		}

		if (this.field909 == 0 && 0 == this.field899) {
			var8 = (int)(Math.random() * (double)(2000 / var1));
			if (var8 == 0) {
				this.field909 = 1024;
			}

			if (var8 == 1) {
				this.field899 = 1024;
			}
		}

		for (var8 = 0; var8 < 256 - var1; ++var8) {
			this.field897[var8] = this.field897[var1 + var8];
		}

		for (var8 = 256 - var1; var8 < 256; ++var8) {
			this.field897[var8] = (int)(Math.sin((double)this.field893 / 14.0D) * 16.0D + Math.sin((double)this.field893 / 15.0D) * 14.0D + Math.sin((double)this.field893 / 16.0D) * 12.0D);
			++this.field893;
		}

		this.field905 += var1;
		var8 = ((client.field1700 & 1) + var1) / 2;
		if (var8 > 0) {
			short var17 = 128;
			byte var18 = 2;
			var11 = 128 - var18 - var18;

			int var12;
			int var13;
			int var14;
			for (var12 = 0; var12 < this.field905 * 100; ++var12) {
				var13 = (int)(Math.random() * (double)var11) + var18;
				var14 = (int)(Math.random() * (double)var17) + var17;
				this.field900[var13 + (var14 << 7)] = 192;
			}

			this.field905 = 0;

			int var15;
			for (var12 = 0; var12 < 256; ++var12) {
				var13 = 0;
				var14 = var12 * 128;

				for (var15 = -var8; var15 < 128; ++var15) {
					if (var15 + var8 < 128) {
						var13 += this.field900[var8 + var14 + var15];
					}

					if (var15 - (var8 + 1) >= 0) {
						var13 -= this.field900[var14 + var15 - (var8 + 1)];
					}

					if (var15 >= 0) {
						this.field904[var15 + var14] = var13 / (var8 * 2 + 1);
					}
				}
			}

			for (var12 = 0; var12 < 128; ++var12) {
				var13 = 0;

				for (var14 = -var8; var14 < 256; ++var14) {
					var15 = var14 * 128;
					if (var8 + var14 < 256) {
						var13 += this.field904[var12 + var15 + var8 * 128];
					}

					if (var14 - (var8 + 1) >= 0) {
						var13 -= this.field904[var12 + var15 - (var8 + 1) * 128];
					}

					if (var14 >= 0) {
						this.field900[var15 + var12] = var13 / (var8 * 2 + 1);
					}
				}
			}
		}

	}

	final int method2007(int var1, int var2, int var3) {
		int var5 = 256 - var3;
		return (var5 * (var1 & 16711935) + (var2 & 16711935) * var3 & -16711936) + (var3 * (var2 & 65280) + (var1 & 65280) * var5 & 16711680) >> 8;
	}

	final void method1972(int var1) {
		int var3 = this.field906.length;
		if (this.field909 > 0) {
			this.method1977(this.field909, this.field896);
		} else if (this.field899 > 0) {
			this.method1977(this.field899, this.field892);
		} else {
			for (int var4 = 0; var4 < var3; ++var4) {
				this.field906[var4] = this.field901[var4];
			}
		}

		this.method2004(var1);
	}

	final void method1977(int var1, int[] var2) {
		int var4 = this.field906.length;

		for (int var5 = 0; var5 < var4; ++var5) {
			if (var1 > 768) {
				this.field906[var5] = this.method2007(this.field901[var5], var2[var5], 1024 - var1);
			} else if (var1 > 256) {
				this.field906[var5] = var2[var5];
			} else {
				this.field906[var5] = this.method2007(var2[var5], this.field901[var5], 256 - var1);
			}
		}

	}

	final void method2004(int var1) {
		int var3 = 0;

		for (int var4 = 1; var4 < 255; ++var4) {
			int var5 = (256 - var4) * this.field897[var4] / 256;
			int var6 = var1 + var5;
			int var7 = 0;
			int var8 = 128;
			if (var6 < 0) {
				var7 = -var6;
				var6 = 0;
			}

			if (var6 + 128 >= class189.field2059.field5019) {
				var8 = class189.field2059.field5019 - var6;
			}

			int var9 = var6 + (var4 + 8) * class189.field2059.field5019;
			var3 += var7;

			for (int var10 = var7; var10 < var8; ++var10) {
				int var11 = this.field900[var3++];
				int var12 = var9 % class478.field5011;
				if (var11 != 0 && var12 >= class478.field5015 && var12 < class478.field5016) {
					int var13 = var11;
					int var14 = 256 - var11;
					var11 = this.field906[var11];
					int var15 = class189.field2059.field5018[var9];
					class189.field2059.field5018[var9++] = -16777216 | ((var11 & 16711935) * var13 + (var15 & 16711935) * var14 & -16711936) + ((var15 & 65280) * var14 + var13 * (var11 & 65280) & 16711680) >> 8;
				} else {
					++var9;
				}
			}

			var3 += 128 - var8;
		}

	}

	final void method1979(class469 var1) {
		int var3;
		for (var3 = 0; var3 < this.field902.length; ++var3) {
			this.field902[var3] = 0;
		}

		int var4;
		for (var3 = 0; var3 < 5000; ++var3) {
			var4 = (int)(Math.random() * 128.0D * 256.0D);
			this.field902[var4] = (int)(Math.random() * 256.0D);
		}

		int var5;
		int var6;
		for (var3 = 0; var3 < 20; ++var3) {
			for (var4 = 1; var4 < 255; ++var4) {
				for (var5 = 1; var5 < 127; ++var5) {
					var6 = (var4 << 7) + var5;
					this.field903[var6] = (this.field902[var6 + 128] + this.field902[var6 - 128] + this.field902[var6 + 1] + this.field902[var6 - 1]) / 4;
				}
			}

			int[] var9 = this.field902;
			this.field902 = this.field903;
			this.field903 = var9;
		}

		if (var1 != null) {
			var3 = 0;

			for (var4 = 0; var4 < var1.field4925; ++var4) {
				for (var5 = 0; var5 < var1.field4928; ++var5) {
					if (var1.field4922[var3++] != 0) {
						var6 = var1.field4924 + var5 + 16;
						int var7 = var1.field4927 + var4 + 16;
						int var8 = var6 + (var7 << 7);
						this.field902[var8] = 0;
					}
				}
			}
		}

	}

	static int method1981(class290 var0) {
		if (var0.field3536 != 11) {
			class69.field580[class69.field581 - 1] = "";
			return 1;
		} else {
			String var2 = class69.field580[--class69.field581];
			class69.field580[++class69.field581 - 1] = var0.method5514(var2);
			return 1;
		}
	}

	static class448 method2008(int var0) {
		class448 var2 = (class448)client.field1906.method5356((long)var0);
		if (null == var2) {
			var2 = new class448(class407.field4611, class444.method6107(var0), class444.method8232(var0));
			client.field1906.method5364(var2, (long)var0);
		}

		return var2;
	}
}
