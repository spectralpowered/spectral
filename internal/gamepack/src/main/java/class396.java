import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "fm"
)
public class class396 extends class195 {
	@ObfInfo(
		owner = "fm",
		name = "h",
		desc = "Lly;"
	)
	public static class274 field3330;
	@ObfInfo(
		owner = "fm",
		name = "e",
		desc = "[Lfm;"
	)
	public static class396[] field3312;
	@ObfInfo(
		owner = "fm",
		name = "x",
		desc = "Ljv;"
	)
	public static class99 field3314;
	@ObfInfo(
		owner = "fm",
		name = "v",
		desc = "I"
	)
	public static int field3313;
	@ObfInfo(
		owner = "fm",
		name = "y",
		desc = "[B"
	)
	byte[] field3333;
	@ObfInfo(
		owner = "fm",
		name = "f",
		desc = "I"
	)
	int field3320;
	@ObfInfo(
		owner = "fm",
		name = "t",
		desc = "I"
	)
	int field3323;
	@ObfInfo(
		owner = "fm",
		name = "a",
		desc = "I"
	)
	int field3327;
	@ObfInfo(
		owner = "fm",
		name = "s",
		desc = "I"
	)
	int field3328;
	@ObfInfo(
		owner = "fm",
		name = "l",
		desc = "I"
	)
	int field3329;
	@ObfInfo(
		owner = "fm",
		name = "d",
		desc = "[I"
	)
	int[] field3316;
	@ObfInfo(
		owner = "fm",
		name = "k",
		desc = "[I"
	)
	int[] field3319;
	@ObfInfo(
		owner = "fm",
		name = "g",
		desc = "Z"
	)
	public boolean field3322;
	@ObfInfo(
		owner = "fm",
		name = "i",
		desc = "Z"
	)
	public boolean field3326;
	@ObfInfo(
		owner = "fm",
		name = "p",
		desc = "Lgl;"
	)
	public class1 field3331;
	@ObfInfo(
		owner = "fm",
		name = "c",
		desc = "Lgj;"
	)
	public class265 field3317;
	@ObfInfo(
		owner = "fm",
		name = "q",
		desc = "I"
	)
	public int field3311;
	@ObfInfo(
		owner = "fm",
		name = "b",
		desc = "I"
	)
	public int field3321;
	@ObfInfo(
		owner = "fm",
		name = "u",
		desc = "I"
	)
	public int field3332;
	@ObfInfo(
		owner = "fm",
		name = "z",
		desc = "I"
	)
	public int field3334;
	@ObfInfo(
		owner = "fm",
		name = "r",
		desc = "Ljava/lang/String;"
	)
	public String field3318;
	@ObfInfo(
		owner = "fm",
		name = "n",
		desc = "Ljava/lang/String;"
	)
	public String field3325;
	@ObfInfo(
		owner = "fm",
		name = "o",
		desc = "[Ljava/lang/String;"
	)
	public String[] field3324;
	@ObfInfo(
		owner = "fm",
		name = "m",
		desc = "I"
	)
	public final int field3315;

	static {
		field3314 = new class99(256);
	}

	@ObfInfo(
		owner = "fm",
		name = "<init>",
		desc = "(I)V"
	)
	public class396(int var1) {
		this.field3311 = -1;
		this.field3320 = -1;
		this.field3321 = 0;
		this.field3322 = true;
		this.field3326 = false;
		this.field3324 = new String[5];
		this.field3327 = Integer.MAX_VALUE;
		this.field3328 = Integer.MAX_VALUE;
		this.field3329 = Integer.MIN_VALUE;
		this.field3323 = Integer.MIN_VALUE;
		this.field3317 = class265.field2194;
		this.field3331 = class1.field1;
		this.field3334 = -1;
		this.field3315 = var1;
	}

	@ObfInfo(
		owner = "fm",
		name = "e",
		desc = "(Lqy;B)V"
	)
	public void method1943(class127 var1) {
		while (true) {
			int var3 = var1.method547();
			if (var3 == 0) {
				return;
			}

			this.method1944(var1, var3);
		}
	}

	@ObfInfo(
		owner = "fm",
		name = "v",
		desc = "(Lqy;IB)V"
	)
	void method1944(class127 var1, int var2) {
		if (var2 == 1) {
			this.field3311 = var1.method560();
		} else if (var2 == 2) {
			this.field3320 = var1.method560();
		} else if (var2 == 3) {
			this.field3318 = var1.method555();
		} else if (var2 == 4) {
			this.field3332 = var1.method551();
		} else if (var2 == 5) {
			var1.method551();
		} else if (var2 == 6) {
			this.field3321 = var1.method547();
		} else {
			int var4;
			if (var2 == 7) {
				var4 = var1.method547();
				if (0 == (var4 & 1)) {
					this.field3322 = false;
				}

				if ((var4 & 2) == 2) {
					this.field3326 = true;
				}
			} else if (var2 == 8) {
				var1.method547();
			} else if (var2 >= 10 && var2 <= 14) {
				this.field3324[var2 - 10] = var1.method555();
			} else if (var2 == 15) {
				var4 = var1.method547();
				this.field3319 = new int[var4 * 2];

				int var5;
				for (var5 = 0; var5 < var4 * 2; ++var5) {
					this.field3319[var5] = var1.method550();
				}

				var1.method595();
				var5 = var1.method547();
				this.field3316 = new int[var5];

				int var6;
				for (var6 = 0; var6 < this.field3316.length; ++var6) {
					this.field3316[var6] = var1.method595();
				}

				this.field3333 = new byte[var4];

				for (var6 = 0; var6 < var4; ++var6) {
					this.field3333[var6] = var1.method548();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.field3325 = var1.method555();
				} else if (var2 == 18) {
					var1.method560();
				} else if (var2 == 19) {
					this.field3334 = var1.method549();
				} else if (var2 == 21) {
					var1.method595();
				} else if (var2 == 22) {
					var1.method595();
				} else if (var2 == 23) {
					var1.method547();
					var1.method547();
					var1.method547();
				} else if (var2 == 24) {
					var1.method550();
					var1.method550();
				} else if (var2 == 25) {
					var1.method560();
				} else if (var2 == 28) {
					var1.method547();
				} else if (var2 == 29) {
					class265[] var7 = new class265[]{class265.field2197, class265.field2194, class265.field2195};
					this.field3317 = (class265)class2.method10(var7, var1.method547());
				} else if (var2 == 30) {
					class1[] var8 = new class1[]{class1.field4, class1.field3, class1.field1};
					this.field3331 = (class1)class2.method10(var8, var1.method547());
				}
			}
		}

	}

	@ObfInfo(
		owner = "fm",
		name = "x",
		desc = "(I)V"
	)
	public void method1945() {
		if (null != this.field3319) {
			for (int var2 = 0; var2 < this.field3319.length; var2 += 2) {
				if (this.field3319[var2] < this.field3327) {
					this.field3327 = this.field3319[var2];
				} else if (this.field3319[var2] > this.field3329) {
					this.field3329 = this.field3319[var2];
				}

				if (this.field3319[var2 + 1] < this.field3328) {
					this.field3328 = this.field3319[var2 + 1];
				} else if (this.field3319[var2 + 1] > this.field3323) {
					this.field3323 = this.field3319[var2 + 1];
				}
			}
		}

	}

	@ObfInfo(
		owner = "fm",
		name = "m",
		desc = "(ZI)Lrx;"
	)
	public class266 method1946(boolean var1) {
		int var3 = var1 ? this.field3320 : this.field3311;
		return this.method1947(var3);
	}

	@ObfInfo(
		owner = "fm",
		name = "q",
		desc = "(II)Lrx;"
	)
	class266 method1947(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			class266 var3 = (class266)field3314.method394((long)var1);
			if (var3 != null) {
				return var3;
			} else {
				var3 = class84.method341(field3330, var1, 0);
				if (null != var3) {
					field3314.method396(var3, (long)var1);
				}

				return var3;
			}
		}
	}

	@ObfInfo(
		owner = "fm",
		name = "f",
		desc = "(B)I"
	)
	public int method1948() {
		return this.field3315;
	}

	@ObfInfo(
		owner = "fm",
		name = "m",
		desc = "(Ljava/lang/CharSequence;IB)I"
	)
	public static int method1951(CharSequence var0, int var1) {
		return class361.method1799(var0, var1, true);
	}

	@ObfInfo(
		owner = "fm",
		name = "j",
		desc = "(I)Z"
	)
	static final boolean method1950() {
		return class105.field809;
	}

	@ObfInfo(
		owner = "fm",
		name = "h",
		desc = "(Lcb;B)V"
	)
	public static void method1949(class488 var0) {
		class84.method350(var0, 500000, 475000);
	}
}
