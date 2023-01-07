import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ij"
)
public class class468 extends class400 {
	@ObfInfo(
		owner = "ij",
		name = "e",
		desc = "I"
	)
	int field3883;
	@ObfInfo(
		owner = "ij",
		name = "h",
		desc = "I"
	)
	int field3884;
	@ObfInfo(
		owner = "ij",
		name = "v",
		desc = "I"
	)
	int field3885;
	@ObfInfo(
		owner = "ij",
		name = "x",
		desc = "I"
	)
	int field3886;

	@ObfInfo(
		owner = "ij",
		name = "<init>",
		desc = "()V"
	)
	class468() {
	}

	@ObfInfo(
		owner = "ij",
		name = "h",
		desc = "(Lqy;B)V"
	)
	void method2288(class127 var1) {
		int var3 = var1.method547();
		if (var3 != class167.field1258.field1260) {
			throw new IllegalStateException("");
		} else {
			super.field3372 = var1.method547();
			super.field3365 = var1.method547();
			super.field3364 = var1.method549();
			super.field3361 = var1.method549();
			this.field3884 = var1.method547();
			this.field3883 = var1.method547();
			super.field3362 = var1.method549();
			super.field3368 = var1.method549();
			this.field3885 = var1.method547();
			this.field3886 = var1.method547();
			super.field3360 = var1.method560();
			super.field3367 = var1.method560();
		}
	}

	@ObfInfo(
		owner = "ij",
		name = "e",
		desc = "(Lqy;I)V"
	)
	void method1978(class127 var1) {
		super.field3365 = Math.min(super.field3365, 4);
		super.field3369 = new short[1][64][64];
		super.field3363 = new short[super.field3365][64][64];
		super.field3370 = new byte[super.field3365][64][64];
		super.field3371 = new byte[super.field3365][64][64];
		super.field3366 = new class387[super.field3365][64][64][];
		int var3 = var1.method547();
		if (class230.field1941.field1942 != var3) {
			throw new IllegalStateException("");
		} else {
			int var4 = var1.method547();
			int var5 = var1.method547();
			int var6 = var1.method547();
			int var7 = var1.method547();
			if (super.field3362 == var4 && super.field3368 == var5 && this.field3885 == var6 && var7 == this.field3886) {
				for (int var8 = 0; var8 < 8; ++var8) {
					for (int var9 = 0; var9 < 8; ++var9) {
						this.method1975(this.field3885 * 8 + var8, var9 + this.field3886 * 8, var1);
					}
				}

			} else {
				throw new IllegalStateException("");
			}
		}
	}

	@ObfInfo(
		owner = "ij",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		if (!(var1 instanceof class468)) {
			return false;
		} else {
			class468 var2 = (class468)var1;
			if (super.field3362 == var2.field3362 && super.field3368 == var2.field3368) {
				return this.field3885 == var2.field3885 && this.field3886 == var2.field3886;
			} else {
				return false;
			}
		}
	}

	@ObfInfo(
		owner = "ij",
		name = "hashCode",
		desc = "()I"
	)
	public int hashCode() {
		return super.field3362 | super.field3368 << 8 | this.field3885 << 16 | this.field3886 << 24;
	}

	@ObfInfo(
		owner = "ij",
		name = "v",
		desc = "(I)I"
	)
	int method2285() {
		return this.field3884;
	}

	@ObfInfo(
		owner = "ij",
		name = "x",
		desc = "(I)I"
	)
	int method2286() {
		return this.field3883;
	}

	@ObfInfo(
		owner = "ij",
		name = "m",
		desc = "(I)I"
	)
	int method2287() {
		return this.field3885;
	}

	@ObfInfo(
		owner = "ij",
		name = "g",
		desc = "(I)I"
	)
	int method2284() {
		return this.field3886;
	}

	@ObfInfo(
		owner = "ij",
		name = "m",
		desc = "(ILbm;ZB)I"
	)
	static int method2289(int var0, class461 var1, boolean var2) {
		int var4 = -1;
		class120 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class386.field3248[--class161.field1227];
			var5 = class67.method299(var4);
		} else {
			var5 = var2 ? class108.field822 : class37.field183;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class161.field1227 -= 4;
			var5.field902 = class386.field3248[class161.field1227];
			var5.field903 = class386.field3248[1 + class161.field1227];
			var5.field940 = class386.field3248[2 + class161.field1227];
			var5.field1036 = class386.field3248[3 + class161.field1227];
			class184.method836(var5);
			class309.field2461.method194(var5);
			if (var4 != -1 && 0 == var5.field1026) {
				class378.method1862(class329.field2600[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class161.field1227 -= 4;
			var5.field904 = class386.field3248[class161.field1227];
			var5.field922 = class386.field3248[class161.field1227 + 1];
			var5.field899 = class386.field3248[2 + class161.field1227];
			var5.field901 = class386.field3248[3 + class161.field1227];
			class184.method836(var5);
			class309.field2461.method194(var5);
			if (var4 != -1 && var5.field1026 == 0) {
				class378.method1862(class329.field2600[var4 >> 16], var5, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var6 = class386.field3248[--class161.field1227] == 1;
			if (var6 != var5.field945) {
				var5.field945 = var6;
				class184.method836(var5);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var5.field1041 = class386.field3248[--class161.field1227] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var5.field1042 = class386.field3248[--class161.field1227] == 1;
			return 1;
		} else {
			return 2;
		}
	}
}
