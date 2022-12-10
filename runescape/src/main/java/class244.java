public class class244 extends class248 {
	int field2901;
	int field2902;
	int field2903;
	int field2904;

	class244() {
	}

	void method4866(class467 var1) {
		int var3 = var1.method8326();
		if (var3 != class256.field2993.field2995) {
			throw new IllegalStateException("");
		} else {
			super.field2931 = var1.method8326();
			super.field2924 = var1.method8326();
			super.field2923 = var1.method8328();
			super.field2920 = var1.method8328();
			this.field2902 = var1.method8326();
			this.field2901 = var1.method8326();
			super.field2921 = var1.method8328();
			super.field2927 = var1.method8328();
			this.field2903 = var1.method8326();
			this.field2904 = var1.method8326();
			super.field2919 = var1.method8344();
			super.field2926 = var1.method8344();
		}
	}

	void method4902(class467 var1) {
		super.field2924 = Math.min(super.field2924, 4);
		super.field2928 = new short[1][64][64];
		super.field2922 = new short[super.field2924][64][64];
		super.field2929 = new byte[super.field2924][64][64];
		super.field2930 = new byte[super.field2924][64][64];
		super.field2925 = new class260[super.field2924][64][64][];
		int var3 = var1.method8326();
		if (class253.field2961.field2962 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method8326();
			int var5 = var1.method8326();
			int var6 = var1.method8326();
			int var7 = var1.method8326();
			if (super.field2921 == var4 && super.field2927 == var5 && this.field2903 == var6 && var7 == this.field2904) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method4899(this.field2903 * 8 + var8, var9 + this.field2904 * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class244)) {
			return false;
		} else {
			class244 var2 = (class244)var1;
			if (super.field2921 == var2.field2921 && super.field2927 == var2.field2927) {
				return this.field2903 == var2.field2903 && this.field2904 == var2.field2904;
			} else {
				return false;
			}
		}
	}

	public int hashCode() {
		return super.field2921 | super.field2927 << 8 | this.field2903 << 16 | this.field2904 << 24;
	}

	int method4852() {
		return this.field2902;
	}

	int method4853() {
		return this.field2901;
	}

	int method4854() {
		return this.field2903;
	}

	int method4851() {
		return this.field2904;
	}

	static int method4878(int var0, class65 var1, boolean var2) {
		int var4 = -1;
		class290 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class69.field579[--class94.field920];
			var5 = class180.method2988(var4);
		} else {
			var5 = var2 ? class187.field2044 : class341.field4273;
		}

		if (var0 == CS2Opcodes.CC_SETPOSITION) {
			class94.field920 -= 4;
			var5.field3408 = class69.field579[class94.field920];
			var5.field3409 = class69.field579[1 + class94.field920];
			var5.field3447 = class69.field579[2 + class94.field920];
			var5.field3546 = class69.field579[3 + class94.field920];
			class53.method1040(var5);
			class122.field1212.method3484(var5);
			if (var4 != -1 && 0 == var5.field3536) {
				class164.method2766(class72.field625[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == CS2Opcodes.CC_SETSIZE) {
			class94.field920 -= 4;
			var5.field3410 = class69.field579[class94.field920];
			var5.field3429 = class69.field579[class94.field920 + 1];
			var5.field3405 = class69.field579[2 + class94.field920];
			var5.field3407 = class69.field579[3 + class94.field920];
			class53.method1040(var5);
			class122.field1212.method3484(var5);
			if (var4 != -1 && var5.field3536 == 0) {
				class164.method2766(class72.field625[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == CS2Opcodes.CC_SETHIDE) {
			boolean var6 = class69.field579[--class94.field920] == 1;
			if (var6 != var5.field3452) {
				var5.field3452 = var6;
				class53.method1040(var5);
			}

			return 1;
		} else if (var0 == CS2Opcodes.CC_SETNOCLICKTHROUGH) {
			var5.field3551 = class69.field579[--class94.field920] == 1;
			return 1;
		} else if (var0 == CS2Opcodes.CC_SETNOSCROLLTHROUGH) {
			var5.field3552 = class69.field579[--class94.field920] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
