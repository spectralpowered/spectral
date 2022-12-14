import io.spectralpowered.ObfInfo;
import java.math.BigInteger;

@ObfInfo(
	name = "qy"
)
public class class127 extends class139 {
	@ObfInfo(
		owner = "qy",
		name = "b",
		desc = "[I"
	)
	static int[] field1071;
	@ObfInfo(
		owner = "qy",
		name = "g",
		desc = "[J"
	)
	static long[] field1069;
	@ObfInfo(
		owner = "qy",
		name = "r",
		desc = "[B"
	)
	public byte[] field1072;
	@ObfInfo(
		owner = "qy",
		name = "u",
		desc = "I"
	)
	public int field1070;

	static {
		field1071 = new int[256];

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

			field1071[var1] = var0;
		}

		field1069 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if (1L == (var4 & 1L)) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			field1069[var2] = var4;
		}

	}

	@ObfInfo(
		owner = "qy",
		name = "<init>",
		desc = "(I)V"
	)
	public class127(int var1) {
		this.field1072 = class201.method884(var1);
		this.field1070 = 0;
	}

	@ObfInfo(
		owner = "qy",
		name = "<init>",
		desc = "(IZ)V"
	)
	public class127(int var1, boolean var2) {
		this.field1072 = class355.method1775(var1, var2);
	}

	@ObfInfo(
		owner = "qy",
		name = "<init>",
		desc = "([B)V"
	)
	public class127(byte[] var1) {
		this.field1072 = var1;
		this.field1070 = 0;
	}

	@ObfInfo(
		owner = "qy",
		name = "ak",
		desc = "(I)V"
	)
	public void method532() {
		if (null != this.field1072) {
			class70.method308(this.field1072);
		}

		this.field1072 = null;
	}

	@ObfInfo(
		owner = "qy",
		name = "af",
		desc = "(II)V"
	)
	public void method544(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)var1;
	}

	@ObfInfo(
		owner = "qy",
		name = "ai",
		desc = "(II)V"
	)
	public void method533(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
		this.field1072[++this.field1070 - 1] = (byte)var1;
	}

	@ObfInfo(
		owner = "qy",
		name = "ax",
		desc = "(IB)V"
	)
	public void method602(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 16);
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
		this.field1072[++this.field1070 - 1] = (byte)var1;
	}

	@ObfInfo(
		owner = "qy",
		name = "ah",
		desc = "(IB)V"
	)
	public void method534(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 24);
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 16);
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
		this.field1072[++this.field1070 - 1] = (byte)var1;
	}

	@ObfInfo(
		owner = "qy",
		name = "aw",
		desc = "(J)V"
	)
	public void method535(long var1) {
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 40));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 32));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 24));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 16));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 8));
		this.field1072[++this.field1070 - 1] = (byte)((int)var1);
	}

	@ObfInfo(
		owner = "qy",
		name = "aj",
		desc = "(J)V"
	)
	public void method536(long var1) {
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 56));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 48));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 40));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 32));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 24));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 16));
		this.field1072[++this.field1070 - 1] = (byte)((int)(var1 >> 8));
		this.field1072[++this.field1070 - 1] = (byte)((int)var1);
	}

	@ObfInfo(
		owner = "qy",
		name = "aq",
		desc = "(ZI)V"
	)
	public void method537(boolean var1) {
		this.method544(var1 ? 1 : 0);
	}

	@ObfInfo(
		owner = "qy",
		name = "aa",
		desc = "(Ljava/lang/String;B)V"
	)
	public void method538(String var1, byte var2) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			if (var2 <= -1) {
				throw new IllegalStateException();
			} else {
				throw new IllegalArgumentException("");
			}
		} else {
			this.field1070 += class173.method798(var1, 0, var1.length(), this.field1072, this.field1070);
			this.field1072[++this.field1070 - 1] = 0;
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "ac",
		desc = "(Ljava/lang/String;I)V"
	)
	public void method604(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field1072[++this.field1070 - 1] = 0;
			this.field1070 += class173.method798(var1, 0, var1.length(), this.field1072, this.field1070);
			this.field1072[++this.field1070 - 1] = 0;
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "bh",
		desc = "(Ljava/lang/CharSequence;B)V"
	)
	public void method539(CharSequence var1) {
		int var3 = class492.method2435(var1);
		this.field1072[++this.field1070 - 1] = 0;
		this.method589(var3);
		this.field1070 += class50.method255(this.field1072, this.field1070, var1);
	}

	@ObfInfo(
		owner = "qy",
		name = "by",
		desc = "([BIIB)V"
	)
	public void method540(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			this.field1072[++this.field1070 - 1] = var1[var5];
		}

	}

	@ObfInfo(
		owner = "qy",
		name = "bw",
		desc = "(Lqy;B)V"
	)
	public void method541(class127 var1) {
		this.method540(var1.field1072, 0, var1.field1070);
	}

	@ObfInfo(
		owner = "qy",
		name = "bp",
		desc = "(IB)V"
	)
	public void method542(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field1072[this.field1070 - var1 - 4] = (byte)(var1 >> 24);
			this.field1072[this.field1070 - var1 - 3] = (byte)(var1 >> 16);
			this.field1072[this.field1070 - var1 - 2] = (byte)(var1 >> 8);
			this.field1072[this.field1070 - var1 - 1] = (byte)var1;
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "bc",
		desc = "(II)V"
	)
	public void method543(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field1072[this.field1070 - var1 - 2] = (byte)(var1 >> 8);
			this.field1072[this.field1070 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "bl",
		desc = "(II)V"
	)
	public void method586(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field1072[this.field1070 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "bv",
		desc = "(IB)V"
	)
	public void method545(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.method544(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.method533(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "bx",
		desc = "(II)V"
	)
	public void method589(int var1) {
		if (0 != (var1 & -128)) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.method544(var1 >>> 28 | 128);
					}

					this.method544(var1 >>> 21 | 128);
				}

				this.method544(var1 >>> 14 | 128);
			}

			this.method544(var1 >>> 7 | 128);
		}

		this.method544(var1 & 127);
	}

	@ObfInfo(
		owner = "qy",
		name = "bg",
		desc = "(B)I"
	)
	public int method547() {
		return this.field1072[++this.field1070 - 1] & 255;
	}

	@ObfInfo(
		owner = "qy",
		name = "bz",
		desc = "(I)B"
	)
	public byte method548() {
		return this.field1072[++this.field1070 - 1];
	}

	@ObfInfo(
		owner = "qy",
		name = "bi",
		desc = "(B)I"
	)
	public int method549() {
		this.field1070 += 2;
		return (this.field1072[this.field1070 - 1] & 255) + ((this.field1072[this.field1070 - 2] & 255) << 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "br",
		desc = "(I)I"
	)
	public int method550() {
		this.field1070 += 2;
		int var2 = ((this.field1072[this.field1070 - 2] & 255) << 8) + (this.field1072[this.field1070 - 1] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfInfo(
		owner = "qy",
		name = "bq",
		desc = "(I)I"
	)
	public int method551() {
		this.field1070 += 3;
		return (this.field1072[this.field1070 - 1] & 255) + ((this.field1072[this.field1070 - 2] & 255) << 8) + ((this.field1072[this.field1070 - 3] & 255) << 16);
	}

	@ObfInfo(
		owner = "qy",
		name = "bn",
		desc = "(B)I"
	)
	public int method595() {
		this.field1070 += 4;
		return ((this.field1072[this.field1070 - 2] & 255) << 8) + ((this.field1072[this.field1070 - 4] & 255) << 24) + ((this.field1072[this.field1070 - 3] & 255) << 16) + (this.field1072[this.field1070 - 1] & 255);
	}

	@ObfInfo(
		owner = "qy",
		name = "ba",
		desc = "(B)J"
	)
	public long method598() {
		long var2 = (long)this.method595() & 4294967295L;
		long var4 = (long)this.method595() & 4294967295L;
		return (var2 << 32) + var4;
	}

	@ObfInfo(
		owner = "qy",
		name = "bs",
		desc = "(I)F"
	)
	public float method552() {
		return Float.intBitsToFloat(this.method595());
	}

	@ObfInfo(
		owner = "qy",
		name = "bt",
		desc = "(I)Z"
	)
	public boolean method553() {
		return (this.method547() & 1) == 1;
	}

	@ObfInfo(
		owner = "qy",
		name = "bu",
		desc = "(I)Ljava/lang/String;"
	)
	public String method554() {
		if (0 == this.field1072[this.field1070]) {
			++this.field1070;
			return null;
		} else {
			return this.method555();
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "bj",
		desc = "(I)Ljava/lang/String;"
	)
	public String method555() {
		int var2 = this.field1070;

		while (this.field1072[++this.field1070 - 1] != 0) {
		}

		int var3 = this.field1070 - var2 - 1;
		return var3 == 0 ? "" : class356.method1777(this.field1072, var2, var3);
	}

	@ObfInfo(
		owner = "qy",
		name = "bb",
		desc = "(I)Ljava/lang/String;"
	)
	public String method556() {
		byte var2 = this.field1072[++this.field1070 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.field1070;

			while (this.field1072[++this.field1070 - 1] != 0) {
			}

			int var4 = this.field1070 - var3 - 1;
			return var4 == 0 ? "" : class356.method1777(this.field1072, var3, var4);
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "bm",
		desc = "(I)Ljava/lang/String;"
	)
	public String method596() {
		byte var2 = this.field1072[++this.field1070 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method588();
			if (this.field1070 + var3 > this.field1072.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var5 = this.field1072;
				int var6 = this.field1070;
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
				this.field1070 += var3;
				return var4;
			}
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "bk",
		desc = "([BIII)V"
	)
	public void method557(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			var1[var5] = this.field1072[++this.field1070 - 1];
		}

	}

	@ObfInfo(
		owner = "qy",
		name = "bd",
		desc = "(B)I"
	)
	public int method558() {
		int var2 = this.field1072[this.field1070] & 255;
		return var2 < 128 ? this.method547() - 64 : this.method549() - 49152;
	}

	@ObfInfo(
		owner = "qy",
		name = "cf",
		desc = "(I)I"
	)
	public int method559() {
		int var2 = this.field1072[this.field1070] & 255;
		return var2 < 128 ? this.method547() : this.method549() - 32768;
	}

	@ObfInfo(
		owner = "qy",
		name = "cl",
		desc = "(I)I"
	)
	public int method605() {
		int var2 = this.field1072[this.field1070] & 255;
		return var2 < 128 ? this.method547() - 1 : this.method549() - 32769;
	}

	@ObfInfo(
		owner = "qy",
		name = "cq",
		desc = "(I)I"
	)
	public int method601() {
		int var2 = 0;

		int var3;
		for (var3 = this.method559(); var3 == 32767; var3 = this.method559()) {
			var2 += 32767;
		}

		var2 += var3;
		return var2;
	}

	@ObfInfo(
		owner = "qy",
		name = "cc",
		desc = "(I)I"
	)
	public int method585() {
		return this.field1072[this.field1070] < 0 ? this.method595() & Integer.MAX_VALUE : this.method549();
	}

	@ObfInfo(
		owner = "qy",
		name = "cw",
		desc = "(I)I"
	)
	public int method560() {
		if (this.field1072[this.field1070] < 0) {
			return this.method595() & Integer.MAX_VALUE;
		} else {
			int var2 = this.method549();
			return var2 == 32767 ? -1 : var2;
		}
	}

	@ObfInfo(
		owner = "qy",
		name = "cx",
		desc = "(I)I"
	)
	public int method588() {
		byte var2 = this.field1072[++this.field1070 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.field1072[++this.field1070 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	@ObfInfo(
		owner = "qy",
		name = "cb",
		desc = "(B)I"
	)
	public int method561() {
		int var3 = 0;
		int var4 = 0;

		int var2;
		do {
			var2 = this.method547();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while(var2 > 127);

		return var3;
	}

	@ObfInfo(
		owner = "qy",
		name = "cs",
		desc = "([II)V"
	)
	public void method591(int[] var1) {
		int var3 = this.field1070 / 8;
		this.field1070 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method595();
			int var6 = this.method595();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
				var5 += var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3];
				var7 += var8;
			}

			this.field1070 -= 8;
			this.method534(var5);
			this.method534(var6);
		}

	}

	@ObfInfo(
		owner = "qy",
		name = "cy",
		desc = "([IB)V"
	)
	public void method562(int[] var1) {
		int var3 = this.field1070 / 8;
		this.field1070 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method595();
			int var6 = this.method595();
			int var7 = -957401312;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var5 -= var6 + (var6 << 4 ^ var6 >>> 5) ^ var7 + var1[var7 & 3]) {
				var6 -= var5 + (var5 << 4 ^ var5 >>> 5) ^ var7 + var1[var7 >>> 11 & 3];
				var7 -= var8;
			}

			this.field1070 -= 8;
			this.method534(var5);
			this.method534(var6);
		}

	}

	@ObfInfo(
		owner = "qy",
		name = "cp",
		desc = "([IIII)V"
	)
	public void method600(int[] var1, int var2, int var3) {
		int var5 = this.field1070;
		this.field1070 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method595();
			int var9 = this.method595();
			int var10 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var10 + var1[var10 >>> 11 & 3]) {
				var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
				var10 += var11;
			}

			this.field1070 -= 8;
			this.method534(var8);
			this.method534(var9);
		}

		this.field1070 = var5;
	}

	@ObfInfo(
		owner = "qy",
		name = "cj",
		desc = "([IIII)V"
	)
	public void method597(int[] var1, int var2, int var3) {
		int var5 = this.field1070;
		this.field1070 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method595();
			int var9 = this.method595();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 -= var9 + (var9 << 4 ^ var9 >>> 5) ^ var1[var10 & 3] + var10) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
			}

			this.field1070 -= 8;
			this.method534(var8);
			this.method534(var9);
		}

		this.field1070 = var5;
	}

	@ObfInfo(
		owner = "qy",
		name = "cn",
		desc = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V"
	)
	public void method563(BigInteger var1, BigInteger var2) {
		int var4 = this.field1070;
		this.field1070 = 0;
		byte[] var5 = new byte[var4];
		this.method557(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.field1070 = 0;
		this.method533(var8.length);
		this.method540(var8, 0, var8.length);
	}

	@ObfInfo(
		owner = "qy",
		name = "cm",
		desc = "(IB)I"
	)
	public int method564(int var1) {
		int var3 = class337.method1695(this.field1072, var1, this.field1070);
		this.method534(var3);
		return var3;
	}

	@ObfInfo(
		owner = "qy",
		name = "ct",
		desc = "(I)Z"
	)
	public boolean method565() {
		this.field1070 -= 4;
		byte[] var3 = this.field1072;
		int var4 = this.field1070;
		int var5 = -1;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ field1071[(var5 ^ var3[var6]) & 255];
		}

		var5 = ~var5;
		var6 = this.method595();
		return var5 == var6;
	}

	@ObfInfo(
		owner = "qy",
		name = "cu",
		desc = "(II)V"
	)
	public void method566(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(var1 + 128);
	}

	@ObfInfo(
		owner = "qy",
		name = "co",
		desc = "(IS)V"
	)
	public void method567(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(0 - var1);
	}

	@ObfInfo(
		owner = "qy",
		name = "ch",
		desc = "(II)V"
	)
	public void method568(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(128 - var1);
	}

	@ObfInfo(
		owner = "qy",
		name = "ce",
		desc = "(B)I"
	)
	public int method569() {
		return this.field1072[++this.field1070 - 1] - 128 & 255;
	}

	@ObfInfo(
		owner = "qy",
		name = "cg",
		desc = "(I)I"
	)
	public int method594() {
		return 0 - this.field1072[++this.field1070 - 1] & 255;
	}

	@ObfInfo(
		owner = "qy",
		name = "ca",
		desc = "(I)I"
	)
	public int method592() {
		return 128 - this.field1072[++this.field1070 - 1] & 255;
	}

	@ObfInfo(
		owner = "qy",
		name = "cv",
		desc = "(I)B"
	)
	public byte method570() {
		return (byte)(this.field1072[++this.field1070 - 1] - 128);
	}

	@ObfInfo(
		owner = "qy",
		name = "cz",
		desc = "(B)B"
	)
	public byte method599() {
		return (byte)(0 - this.field1072[++this.field1070 - 1]);
	}

	@ObfInfo(
		owner = "qy",
		name = "cr",
		desc = "(I)B"
	)
	public byte method593() {
		return (byte)(128 - this.field1072[++this.field1070 - 1]);
	}

	@ObfInfo(
		owner = "qy",
		name = "cd",
		desc = "(II)V"
	)
	public void method584(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)var1;
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "ck",
		desc = "(IB)V"
	)
	public void method572(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
		this.field1072[++this.field1070 - 1] = (byte)(var1 + 128);
	}

	@ObfInfo(
		owner = "qy",
		name = "ci",
		desc = "(II)V"
	)
	public void method573(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(var1 + 128);
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "dh",
		desc = "(I)I"
	)
	public int method531() {
		this.field1070 += 2;
		return (this.field1072[this.field1070 - 2] & 255) + ((this.field1072[this.field1070 - 1] & 255) << 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "dn",
		desc = "(I)I"
	)
	public int method574() {
		this.field1070 += 2;
		return (this.field1072[this.field1070 - 1] - 128 & 255) + ((this.field1072[this.field1070 - 2] & 255) << 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "da",
		desc = "(I)I"
	)
	public int method575() {
		this.field1070 += 2;
		return ((this.field1072[this.field1070 - 1] & 255) << 8) + (this.field1072[this.field1070 - 2] - 128 & 255);
	}

	@ObfInfo(
		owner = "qy",
		name = "de",
		desc = "(I)I"
	)
	public int method576() {
		this.field1070 += 2;
		int var2 = (this.field1072[this.field1070 - 1] - 128 & 255) + ((this.field1072[this.field1070 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfInfo(
		owner = "qy",
		name = "dl",
		desc = "(I)I"
	)
	public int method577() {
		this.field1070 += 3;
		return (this.field1072[this.field1070 - 3] & 255) + ((this.field1072[this.field1070 - 1] & 255) << 16) + ((this.field1072[this.field1070 - 2] & 255) << 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "dw",
		desc = "(S)I"
	)
	public int method578() {
		this.field1070 += 3;
		return ((this.field1072[this.field1070 - 1] & 255) << 8) + ((this.field1072[this.field1070 - 3] & 255) << 16) + (this.field1072[this.field1070 - 2] & 255);
	}

	@ObfInfo(
		owner = "qy",
		name = "dm",
		desc = "(I)I"
	)
	public int method587() {
		this.field1070 += 3;
		return (this.field1072[this.field1070 - 1] & 255) + ((this.field1072[this.field1070 - 2] & 255) << 16) + ((this.field1072[this.field1070 - 3] & 255) << 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "dv",
		desc = "(I)I"
	)
	public int method546() {
		this.field1070 += 3;
		int var2 = ((this.field1072[this.field1070 - 3] & 255) << 16) + ((this.field1072[this.field1070 - 1] & 255) << 8) + (this.field1072[this.field1070 - 2] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfInfo(
		owner = "qy",
		name = "ds",
		desc = "(I)I"
	)
	public int method590() {
		this.field1070 += 3;
		int var2 = ((this.field1072[this.field1070 - 3] & 255) << 8) + ((this.field1072[this.field1070 - 2] & 255) << 16) + (this.field1072[this.field1070 - 1] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfInfo(
		owner = "qy",
		name = "dc",
		desc = "(IS)V"
	)
	public void method579(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)var1;
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 16);
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 24);
	}

	@ObfInfo(
		owner = "qy",
		name = "dk",
		desc = "(II)V"
	)
	public void method580(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
		this.field1072[++this.field1070 - 1] = (byte)var1;
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 24);
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 16);
	}

	@ObfInfo(
		owner = "qy",
		name = "df",
		desc = "(II)V"
	)
	public void method581(int var1) {
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 16);
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 24);
		this.field1072[++this.field1070 - 1] = (byte)var1;
		this.field1072[++this.field1070 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "dy",
		desc = "(B)I"
	)
	public int method603() {
		this.field1070 += 4;
		return ((this.field1072[this.field1070 - 2] & 255) << 16) + ((this.field1072[this.field1070 - 1] & 255) << 24) + ((this.field1072[this.field1070 - 3] & 255) << 8) + (this.field1072[this.field1070 - 4] & 255);
	}

	@ObfInfo(
		owner = "qy",
		name = "dx",
		desc = "(I)I"
	)
	public int method571() {
		this.field1070 += 4;
		return (this.field1072[this.field1070 - 3] & 255) + ((this.field1072[this.field1070 - 1] & 255) << 16) + ((this.field1072[this.field1070 - 2] & 255) << 24) + ((this.field1072[this.field1070 - 4] & 255) << 8);
	}

	@ObfInfo(
		owner = "qy",
		name = "dr",
		desc = "(I)I"
	)
	public int method582() {
		this.field1070 += 4;
		return ((this.field1072[this.field1070 - 1] & 255) << 8) + ((this.field1072[this.field1070 - 3] & 255) << 24) + ((this.field1072[this.field1070 - 4] & 255) << 16) + (this.field1072[this.field1070 - 2] & 255);
	}

	@ObfInfo(
		owner = "qy",
		name = "dd",
		desc = "([BIII)V"
	)
	public void method583(byte[] var1, int var2, int var3) {
		for (int var5 = var3 + var2 - 1; var5 >= var2; --var5) {
			var1[var5] = this.field1072[++this.field1070 - 1];
		}

	}
}
