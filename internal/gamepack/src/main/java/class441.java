import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "km"
)
public class class441 {
	@ObfInfo(
		owner = "km",
		name = "b",
		desc = "[B"
	)
	static final byte[] field3651;
	@ObfInfo(
		owner = "km",
		name = "h",
		desc = "Lqy;"
	)
	class127 field3656;
	@ObfInfo(
		owner = "km",
		name = "f",
		desc = "I"
	)
	int field3649;
	@ObfInfo(
		owner = "km",
		name = "e",
		desc = "I"
	)
	int field3650;
	@ObfInfo(
		owner = "km",
		name = "v",
		desc = "[I"
	)
	int[] field3652;
	@ObfInfo(
		owner = "km",
		name = "q",
		desc = "[I"
	)
	int[] field3653;
	@ObfInfo(
		owner = "km",
		name = "m",
		desc = "[I"
	)
	int[] field3655;
	@ObfInfo(
		owner = "km",
		name = "x",
		desc = "[I"
	)
	int[] field3657;
	@ObfInfo(
		owner = "km",
		name = "u",
		desc = "J"
	)
	long field3654;

	static {
		field3651 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	}

	@ObfInfo(
		owner = "km",
		name = "<init>",
		desc = "()V"
	)
	class441() {
		this.field3656 = new class127((byte[])null);
	}

	@ObfInfo(
		owner = "km",
		name = "<init>",
		desc = "([B)V"
	)
	class441(byte[] var1) {
		this.field3656 = new class127((byte[])null);
		this.method2181(var1);
	}

	@ObfInfo(
		owner = "km",
		name = "h",
		desc = "([B)V"
	)
	void method2181(byte[] var1) {
		this.field3656.field1072 = var1;
		this.field3656.field1070 = 10;
		int var2 = this.field3656.method549();
		this.field3650 = this.field3656.method549();
		this.field3649 = 500000;
		this.field3652 = new int[var2];

		class127 var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.field1070 += var5) {
			int var4 = this.field3656.method595();
			var5 = this.field3656.method595();
			if (var4 == 1297379947) {
				this.field3652[var3] = this.field3656.field1070;
				++var3;
			}

			var10000 = this.field3656;
		}

		this.field3654 = 0L;
		this.field3657 = new int[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			this.field3657[var3] = this.field3652[var3];
		}

		this.field3655 = new int[var2];
		this.field3653 = new int[var2];
	}

	@ObfInfo(
		owner = "km",
		name = "e",
		desc = "()V"
	)
	void method2182() {
		this.field3656.field1072 = null;
		this.field3652 = null;
		this.field3657 = null;
		this.field3655 = null;
		this.field3653 = null;
	}

	@ObfInfo(
		owner = "km",
		name = "v",
		desc = "()Z"
	)
	boolean method2183() {
		return this.field3656.field1072 != null;
	}

	@ObfInfo(
		owner = "km",
		name = "x",
		desc = "()I"
	)
	int method2184() {
		return this.field3657.length;
	}

	@ObfInfo(
		owner = "km",
		name = "m",
		desc = "(I)V"
	)
	void method2185(int var1) {
		this.field3656.field1070 = this.field3657[var1];
	}

	@ObfInfo(
		owner = "km",
		name = "q",
		desc = "(I)V"
	)
	void method2186(int var1) {
		this.field3657[var1] = this.field3656.field1070;
	}

	@ObfInfo(
		owner = "km",
		name = "f",
		desc = "()V"
	)
	void method2187() {
		this.field3656.field1070 = -1;
	}

	@ObfInfo(
		owner = "km",
		name = "r",
		desc = "(I)V"
	)
	void method2192(int var1) {
		int var2 = this.field3656.method588();
		int[] var10000 = this.field3655;
		var10000[var1] += var2;
	}

	@ObfInfo(
		owner = "km",
		name = "u",
		desc = "(I)I"
	)
	int method2188(int var1) {
		int var2 = this.method2189(var1);
		return var2;
	}

	@ObfInfo(
		owner = "km",
		name = "b",
		desc = "(I)I"
	)
	int method2189(int var1) {
		byte var2 = this.field3656.field1072[this.field3656.field1070];
		int var5;
		if (var2 < 0) {
			var5 = var2 & 255;
			this.field3653[var1] = var5;
			++this.field3656.field1070;
		} else {
			var5 = this.field3653[var1];
		}

		if (var5 != 240 && var5 != 247) {
			return this.method2194(var1, var5);
		} else {
			int var3 = this.field3656.method588();
			if (var5 == 247 && var3 > 0) {
				int var4 = this.field3656.field1072[this.field3656.field1070] & 255;
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
					++this.field3656.field1070;
					this.field3653[var1] = var4;
					return this.method2194(var1, var4);
				}
			}

			class127 var10000 = this.field3656;
			var10000.field1070 += var3;
			return 0;
		}
	}

	@ObfInfo(
		owner = "km",
		name = "j",
		desc = "(II)I"
	)
	int method2194(int var1, int var2) {
		int var4;
		if (var2 == 255) {
			int var7 = this.field3656.method547();
			var4 = this.field3656.method588();
			class127 var10000;
			if (var7 == 47) {
				var10000 = this.field3656;
				var10000.field1070 += var4;
				return 1;
			} else if (var7 == 81) {
				int var5 = this.field3656.method551();
				var4 -= 3;
				int var6 = this.field3655[var1];
				this.field3654 += (long)var6 * (long)(this.field3649 - var5);
				this.field3649 = var5;
				var10000 = this.field3656;
				var10000.field1070 += var4;
				return 2;
			} else {
				var10000 = this.field3656;
				var10000.field1070 += var4;
				return 3;
			}
		} else {
			byte var3 = field3651[var2 - 128];
			var4 = var2;
			if (var3 >= 1) {
				var4 = var2 | this.field3656.method547() << 8;
			}

			if (var3 >= 2) {
				var4 |= this.field3656.method547() << 16;
			}

			return var4;
		}
	}

	@ObfInfo(
		owner = "km",
		name = "g",
		desc = "(I)J"
	)
	long method2193(int var1) {
		return this.field3654 + (long)var1 * (long)this.field3649;
	}

	@ObfInfo(
		owner = "km",
		name = "i",
		desc = "()I"
	)
	int method2190() {
		int var1 = this.field3657.length;
		int var2 = -1;
		int var3 = Integer.MAX_VALUE;

		for (int var4 = 0; var4 < var1; ++var4) {
			if (this.field3657[var4] >= 0 && this.field3655[var4] < var3) {
				var2 = var4;
				var3 = this.field3655[var4];
			}
		}

		return var2;
	}

	@ObfInfo(
		owner = "km",
		name = "o",
		desc = "()Z"
	)
	boolean method2195() {
		int var1 = this.field3657.length;

		for (int var2 = 0; var2 < var1; ++var2) {
			if (this.field3657[var2] >= 0) {
				return false;
			}
		}

		return true;
	}

	@ObfInfo(
		owner = "km",
		name = "n",
		desc = "(J)V"
	)
	void method2191(long var1) {
		this.field3654 = var1;
		int var3 = this.field3657.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			this.field3655[var4] = 0;
			this.field3653[var4] = 0;
			this.field3656.field1070 = this.field3652[var4];
			this.method2192(var4);
			this.field3657[var4] = this.field3656.field1070;
		}

	}
}
