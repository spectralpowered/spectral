import java.math.BigInteger;

public class class467 extends class428 {
	static int[] field4916;
	static long[] field4913;
	public byte[] field4917;
	public int field4915;

	static {
		field4916 = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			field4916[var1] = var0;
		}

		field4913 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if (1L == (var4 & 1L)) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			field4913[var2] = var4;
		}

	}

	public class467(int var1) {
		this.field4917 = class370.method1620(var1);
		this.field4915 = 0;
	}

	public class467(int var1, boolean var2) {
		this.field4917 = class370.method6943(var1, var2);
	}

	public class467(byte[] var1) {
		this.field4917 = var1;
		this.field4915 = 0;
	}

	public void method8308() {
		if (null != this.field4917) {
			class202.method3992(this.field4917);
		}

		this.field4917 = null;
	}

	public void method8323(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)var1;
	}

	public void method8310(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
		this.field4917[++this.field4915 - 1] = (byte)var1;
	}

	public void method8516(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 16);
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
		this.field4917[++this.field4915 - 1] = (byte)var1;
	}

	public void method8312(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 24);
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 16);
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
		this.field4917[++this.field4915 - 1] = (byte)var1;
	}

	public void method8313(long var1) {
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 40));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 32));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 24));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 16));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 8));
		this.field4917[++this.field4915 - 1] = (byte)((int)var1);
	}

	public void method8314(long var1) {
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 56));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 48));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 40));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 32));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 24));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 16));
		this.field4917[++this.field4915 - 1] = (byte)((int)(var1 >> 8));
		this.field4917[++this.field4915 - 1] = (byte)((int)var1);
	}

	public void method8315(boolean var1) {
		this.method8323(var1 ? 1 : 0);
	}

	public static int method190(String var0) {
		return var0.length() + 1;
	}

	public void method8316(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field4915 += class210.method4146(var1, 0, var1.length(), this.field4917, this.field4915);
			this.field4917[++this.field4915 - 1] = 0;
		}
	}

	public static int method4691(String var0) {
		return var0.length() + 2;
	}

	public void method8546(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field4917[++this.field4915 - 1] = 0;
			this.field4915 += class210.method4146(var1, 0, var1.length(), this.field4917, this.field4915);
			this.field4917[++this.field4915 - 1] = 0;
		}
	}

	public void method8318(CharSequence var1) {
		int var3 = class49.method938(var1);
		this.field4917[++this.field4915 - 1] = 0;
		this.method8420(var3);
		this.field4915 += class186.method3595(this.field4917, this.field4915, var1);
	}

	public void method8319(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			this.field4917[++this.field4915 - 1] = var1[var5];
		}

	}

	public void method8320(class467 var1) {
		this.method8319(var1.field4917, 0, var1.field4915);
	}

	public void method8321(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field4917[this.field4915 - var1 - 4] = (byte)(var1 >> 24);
			this.field4917[this.field4915 - var1 - 3] = (byte)(var1 >> 16);
			this.field4917[this.field4915 - var1 - 2] = (byte)(var1 >> 8);
			this.field4917[this.field4915 - var1 - 1] = (byte)var1;
		}
	}

	public void method8322(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field4917[this.field4915 - var1 - 2] = (byte)(var1 >> 8);
			this.field4917[this.field4915 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method8398(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field4917[this.field4915 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method8324(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.method8323(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.method8310(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method8420(int var1) {
		if (0 != (var1 & -128)) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.method8323(var1 >>> 28 | 128);
					}

					this.method8323(var1 >>> 21 | 128);
				}

				this.method8323(var1 >>> 14 | 128);
			}

			this.method8323(var1 >>> 7 | 128);
		}

		this.method8323(var1 & 127);
	}

	public int method8326() {
		return this.field4917[++this.field4915 - 1] & 255;
	}

	public byte method8327() {
		return this.field4917[++this.field4915 - 1];
	}

	public int method8328() {
		this.field4915 += 2;
		return (this.field4917[this.field4915 - 1] & 255) + ((this.field4917[this.field4915 - 2] & 255) << 8);
	}

	public int method8329() {
		this.field4915 += 2;
		int var2 = ((this.field4917[this.field4915 - 2] & 255) << 8) + (this.field4917[this.field4915 - 1] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method8330() {
		this.field4915 += 3;
		return (this.field4917[this.field4915 - 1] & 255) + ((this.field4917[this.field4915 - 2] & 255) << 8) + ((this.field4917[this.field4915 - 3] & 255) << 16);
	}

	public int method8480() {
		this.field4915 += 4;
		return ((this.field4917[this.field4915 - 2] & 255) << 8) + ((this.field4917[this.field4915 - 4] & 255) << 24) + ((this.field4917[this.field4915 - 3] & 255) << 16) + (this.field4917[this.field4915 - 1] & 255);
	}

	public long method8492() {
		long var2 = (long)this.method8480() & 4294967295L;
		long var4 = (long)this.method8480() & 4294967295L;
		return (var2 << 32) + var4;
	}

	public float method8332() {
		return Float.intBitsToFloat(this.method8480());
	}

	public boolean method8333() {
		return (this.method8326() & 1) == 1;
	}

	public String method8334() {
		if (0 == this.field4917[this.field4915]) {
			++this.field4915;
			return null;
		} else {
			return this.method8335();
		}
	}

	public String method8335() {
		int var2 = this.field4915;

		while (this.field4917[++this.field4915 - 1] != 0) {
		}

		int var3 = this.field4915 - var2 - 1;
		return var3 == 0 ? "" : class276.method5316(this.field4917, var2, var3);
	}

	public String method8336() {
		byte var2 = this.field4917[++this.field4915 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.field4915;

			while (this.field4917[++this.field4915 - 1] != 0) {
			}

			int var4 = this.field4915 - var3 - 1;
			return var4 == 0 ? "" : class276.method5316(this.field4917, var3, var4);
		}
	}

	public String method8487() {
		byte var2 = this.field4917[++this.field4915 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method8416();
			if (this.field4915 + var3 > this.field4917.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var5 = this.field4917;
				int var6 = this.field4915;
				char[] var7 = new char[var3];
				int var8 = 0;
				int var9 = var6;

				int var12;
				for (int var10 = var3 + var6; var9 < var10; var7[var8++] = (char)var12) {
					int var11 = var5[var9++] & 255;
					if (var11 < 128) {
						if (var11 == 0) {
							var12 = 65533;
						} else {
							var12 = var11;
						}
					} else if (var11 < 192) {
						var12 = 65533;
					} else if (var11 < 224) {
						if (var9 < var10 && (var5[var9] & 192) == 128) {
							var12 = (var11 & 31) << 6 | var5[var9++] & 63;
							if (var12 < 128) {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else if (var11 < 240) {
						if (var9 + 1 < var10 && 128 == (var5[var9] & 192) && (var5[var9 + 1] & 192) == 128) {
							var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
							if (var12 < 2048) {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else if (var11 < 248) {
						if (var9 + 2 < var10 && (var5[var9] & 192) == 128 && 128 == (var5[var9 + 1] & 192) && 128 == (var5[var9 + 2] & 192)) {
							var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
							if (var12 >= 65536 && var12 <= 1114111) {
								var12 = 65533;
							} else {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else {
						var12 = 65533;
					}
				}

				String var4 = new String(var7, 0, var8);
				this.field4915 += var3;
				return var4;
			}
		}
	}

	public void method8338(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			var1[var5] = this.field4917[++this.field4915 - 1];
		}

	}

	public int method8339() {
		int var2 = this.field4917[this.field4915] & 255;
		return var2 < 128 ? this.method8326() - 64 : this.method8328() - 49152;
	}

	public int method8340() {
		int var2 = this.field4917[this.field4915] & 255;
		return var2 < 128 ? this.method8326() : this.method8328() - 32768;
	}

	public int method8557() {
		int var2 = this.field4917[this.field4915] & 255;
		return var2 < 128 ? this.method8326() - 1 : this.method8328() - 32769;
	}

	public int method8508() {
		int var2 = 0;

		int var3;
		for (var3 = this.method8340(); var3 == 32767; var3 = this.method8340()) {
			var2 += 32767;
		}

		var2 += var3;
		return var2;
	}

	public int method8388() {
		return this.field4917[this.field4915] < 0 ? this.method8480() & Integer.MAX_VALUE : this.method8328();
	}

	public int method8344() {
		if (this.field4917[this.field4915] < 0) {
			return this.method8480() & Integer.MAX_VALUE;
		} else {
			int var2 = this.method8328();
			return var2 == 32767 ? -1 : var2;
		}
	}

	public int method8416() {
		byte var2 = this.field4917[++this.field4915 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.field4917[++this.field4915 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	public int method8346() {
		int var3 = 0;
		int var4 = 0;

		int var2;
		do {
			var2 = this.method8326();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while(var2 > 127);

		return var3;
	}

	public void method8464(int[] var1) {
		int var3 = this.field4915 / 8;
		this.field4915 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method8480();
			int var6 = this.method8480();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
				var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				var7 += var8;
			}

			this.field4915 -= 8;
			this.method8312(var5);
			this.method8312(var6);
		}

	}

	public void method8348(int[] var1) {
		int var3 = this.field4915 / 8;
		this.field4915 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method8480();
			int var6 = this.method8480();
			int var7 = -957401312;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
				var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
				var7 -= var8;
			}

			this.field4915 -= 8;
			this.method8312(var5);
			this.method8312(var6);
		}

	}

	public void method8502(int[] var1, int var2, int var3) {
		int var5 = this.field4915;
		this.field4915 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method8480();
			int var9 = this.method8480();
			int var10 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + var1[var10 >>> 11 & 3]) {
				var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
				var10 += var11;
			}

			this.field4915 -= 8;
			this.method8312(var8);
			this.method8312(var9);
		}

		this.field4915 = var5;
	}

	public void method8489(int[] var1, int var2, int var3) {
		int var5 = this.field4915;
		this.field4915 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method8480();
			int var9 = this.method8480();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var10 & 3] + var10) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
			}

			this.field4915 -= 8;
			this.method8312(var8);
			this.method8312(var9);
		}

		this.field4915 = var5;
	}

	public void method8351(BigInteger var1, BigInteger var2) {
		int var4 = this.field4915;
		this.field4915 = 0;
		byte[] var5 = new byte[var4];
		this.method8338(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.field4915 = 0;
		this.method8310(var8.length);
		this.method8319(var8, 0, var8.length);
	}

	public int method8352(int var1) {
		int var3 = class372.method6994(this.field4917, var1, this.field4915);
		this.method8312(var3);
		return var3;
	}

	public boolean method8353() {
		this.field4915 -= 4;
		byte[] var3 = this.field4917;
		int var4 = this.field4915;
		int var5 = -1;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ field4916[(var5 ^ var3[var6]) & 255];
		}

		var5 = ~var5;
		var6 = this.method8480();
		return var5 == var6;
	}

	public void method8354(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(var1 + 128);
	}

	public void method8355(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(0 - var1);
	}

	public void method8356(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(128 - var1);
	}

	public int method8357() {
		return this.field4917[++this.field4915 - 1] - 128 & 255;
	}

	public int method8478() {
		return 0 - this.field4917[++this.field4915 - 1] & 255;
	}

	public int method8475() {
		return 128 - this.field4917[++this.field4915 - 1] & 255;
	}

	public byte method8360() {
		return (byte)(this.field4917[++this.field4915 - 1] - 128);
	}

	public byte method8494() {
		return (byte)(0 - this.field4917[++this.field4915 - 1]);
	}

	public byte method8477() {
		return (byte)(128 - this.field4917[++this.field4915 - 1]);
	}

	public void method8383(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)var1;
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
	}

	public void method8364(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
		this.field4917[++this.field4915 - 1] = (byte)(var1 + 128);
	}

	public void method8365(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(var1 + 128);
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
	}

	public int method8306() {
		this.field4915 += 2;
		return (this.field4917[this.field4915 - 2] & 255) + ((this.field4917[this.field4915 - 1] & 255) << 8);
	}

	public int method8367() {
		this.field4915 += 2;
		return (this.field4917[this.field4915 - 1] - 128 & 255) + ((this.field4917[this.field4915 - 2] & 255) << 8);
	}

	public int method8368() {
		this.field4915 += 2;
		return ((this.field4917[this.field4915 - 1] & 255) << 8) + (this.field4917[this.field4915 - 2] - 128 & 255);
	}

	public int method8369() {
		this.field4915 += 2;
		int var2 = (this.field4917[this.field4915 - 1] - 128 & 255) + ((this.field4917[this.field4915 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method8370() {
		this.field4915 += 3;
		return (this.field4917[this.field4915 - 3] & 255) + ((this.field4917[this.field4915 - 1] & 255) << 16) + ((this.field4917[this.field4915 - 2] & 255) << 8);
	}

	public int method8371() {
		this.field4915 += 3;
		return ((this.field4917[this.field4915 - 1] & 255) << 8) + ((this.field4917[this.field4915 - 3] & 255) << 16) + (this.field4917[this.field4915 - 2] & 255);
	}

	public int method8405() {
		this.field4915 += 3;
		return (this.field4917[this.field4915 - 1] & 255) + ((this.field4917[this.field4915 - 2] & 255) << 16) + ((this.field4917[this.field4915 - 3] & 255) << 8);
	}

	public int method8325() {
		this.field4915 += 3;
		int var2 = ((this.field4917[this.field4915 - 3] & 255) << 16) + ((this.field4917[this.field4915 - 1] & 255) << 8) + (this.field4917[this.field4915 - 2] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public int method8450() {
		this.field4915 += 3;
		int var2 = ((this.field4917[this.field4915 - 3] & 255) << 8) + ((this.field4917[this.field4915 - 2] & 255) << 16) + (this.field4917[this.field4915 - 1] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public void method8375(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)var1;
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 16);
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 24);
	}

	public void method8376(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
		this.field4917[++this.field4915 - 1] = (byte)var1;
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 24);
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 16);
	}

	public void method8377(int var1) {
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 16);
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 24);
		this.field4917[++this.field4915 - 1] = (byte)var1;
		this.field4917[++this.field4915 - 1] = (byte)(var1 >> 8);
	}

	public int method8536() {
		this.field4915 += 4;
		return ((this.field4917[this.field4915 - 2] & 255) << 16) + ((this.field4917[this.field4915 - 1] & 255) << 24) + ((this.field4917[this.field4915 - 3] & 255) << 8) + (this.field4917[this.field4915 - 4] & 255);
	}

	public int method8361() {
		this.field4915 += 4;
		return (this.field4917[this.field4915 - 3] & 255) + ((this.field4917[this.field4915 - 1] & 255) << 16) + ((this.field4917[this.field4915 - 2] & 255) << 24) + ((this.field4917[this.field4915 - 4] & 255) << 8);
	}

	public int method8380() {
		this.field4915 += 4;
		return ((this.field4917[this.field4915 - 1] & 255) << 8) + ((this.field4917[this.field4915 - 3] & 255) << 24) + ((this.field4917[this.field4915 - 4] & 255) << 16) + (this.field4917[this.field4915 - 2] & 255);
	}

	public void method8381(byte[] var1, int var2, int var3) {
		for (int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
			var1[var5] = this.field4917[++this.field4915 - 1];
		}

	}
}
