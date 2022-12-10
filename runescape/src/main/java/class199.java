public class class199 extends class439 {
	static class282 field2234;
	static class282 field2235;
	static class337 field2233;
	static class337 field2244;
	int field2236;
	int field2237;
	int field2240;
	int field2243;
	int field2245;
	int field2246;
	int field2247;
	short[] field2232;
	short[] field2239;
	short[] field2241;
	short[] field2242;
	public int field2238;

	static {
		field2234 = new class282(64);
		field2235 = new class282(30);
	}

	static void method3905() {
		class186.field2037 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class245.method3571((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
			class186.field2037[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class186.field2037.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class245.method3571((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class186.field2037.length; ++var1) {
				class186.field2037[var1] = var5;
			}
		}

	}

	public static class406 method3913() {
		synchronized(class406.field4604) {
			if (class406.field4607 == 0) {
				return new class406();
			} else {
				class406.field4604[--class406.field4607].method7531();
				return class406.field4604[class406.field4607];
			}
		}
	}

	class199() {
		this.field2238 = -1;
		this.field2236 = 128;
		this.field2243 = 128;
		this.field2246 = 0;
		this.field2240 = 0;
		this.field2247 = 0;
	}

	public static void method4890(class337 var0, class337 var1) {
		field2233 = var0;
		field2244 = var1;
	}

	void method3897(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method3893(var1, var3);
		}
	}

	void method3893(class467 var1, int var2) {
		if (var2 == 1) {
			this.field2237 = var1.method8328();
		} else if (var2 == 2) {
			this.field2238 = var1.method8328();
		} else if (var2 == 4) {
			this.field2236 = var1.method8328();
		} else if (var2 == 5) {
			this.field2243 = var1.method8328();
		} else if (var2 == 6) {
			this.field2246 = var1.method8328();
		} else if (var2 == 7) {
			this.field2240 = var1.method8326();
		} else if (var2 == 8) {
			this.field2247 = var1.method8326();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method8326();
				this.field2239 = new short[var4];
				this.field2232 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2239[var5] = (short)var1.method8328();
					this.field2232[var5] = (short)var1.method8328();
				}
			} else if (var2 == 41) {
				var4 = var1.method8326();
				this.field2241 = new short[var4];
				this.field2242 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2241[var5] = (short)var1.method8328();
					this.field2242[var5] = (short)var1.method8328();
				}
			}
		}

	}

	public final class216 method3896(int var1) {
		class216 var3 = (class216)field2235.method5356((long)this.field2245);
		if (var3 == null) {
			class191 var4 = class191.method3645(field2244, this.field2237, 0);
			if (null == var4) {
				return null;
			}

			int var5;
			if (null != this.field2239) {
				for (var5 = 0; var5 < this.field2239.length; ++var5) {
					var4.method3660(this.field2239[var5], this.field2232[var5]);
				}
			}

			if (null != this.field2241) {
				for (var5 = 0; var5 < this.field2241.length; ++var5) {
					var4.method3661(this.field2241[var5], this.field2242[var5]);
				}
			}

			var3 = var4.method3668(64 + this.field2240, 850 + this.field2247, -30, -50, -30);
			field2235.method5364(var3, (long)this.field2245);
		}

		class216 var6;
		if (this.field2238 != -1 && var1 != -1) {
			var6 = class214.method4351(this.field2238).method3504(var3, var1);
		} else {
			var6 = var3.method4383(true);
		}

		if (this.field2236 != 128 || 128 != this.field2243) {
			var6.method4437(this.field2236, this.field2243, this.field2236);
		}

		if (0 != this.field2246) {
			if (this.field2246 == 90) {
				var6.method4397();
			}

			if (180 == this.field2246) {
				var6.method4397();
				var6.method4397();
			}

			if (this.field2246 == 270) {
				var6.method4397();
				var6.method4397();
				var6.method4397();
			}
		}

		return var6;
	}

	public static void method2508() {
		field2234.method5357();
		field2235.method5357();
	}

	static final int method3912(int var0, int var1, int var2) {
		int var4 = var0 >> 7;
		int var5 = var1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = var2;
			if (var2 < 3 && 2 == (class84.field773[1][var4][var5] & 2)) {
				var6 = var2 + 1;
			}

			int var7 = var0 & 127;
			int var8 = var1 & 127;
			int var9 = var7 * class84.field765[var6][var4 + 1][var5] + (128 - var7) * class84.field765[var6][var4][var5] >> 7;
			int var10 = class84.field765[var6][var4][var5 + 1] * (128 - var7) + var7 * class84.field765[var6][var4 + 1][var5 + 1] >> 7;
			return var9 * (128 - var8) + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}
}
