import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gv"
)
public class class123 extends class195 {
	@ObfInfo(
		owner = "gv",
		name = "du",
		desc = "Z"
	)
	static boolean field1061;
	@ObfInfo(
		owner = "gv",
		name = "h",
		desc = "Lly;"
	)
	static class274 field1060;
	@ObfInfo(
		owner = "gv",
		name = "e",
		desc = "Ljv;"
	)
	static class99 field1056;
	@ObfInfo(
		owner = "gv",
		name = "q",
		desc = "Z"
	)
	boolean field1058;
	@ObfInfo(
		owner = "gv",
		name = "v",
		desc = "C"
	)
	char field1055;
	@ObfInfo(
		owner = "gv",
		name = "x",
		desc = "I"
	)
	public int field1059;
	@ObfInfo(
		owner = "gv",
		name = "m",
		desc = "Ljava/lang/String;"
	)
	public String field1057;

	static {
		field1056 = new class99(64);
	}

	@ObfInfo(
		owner = "gv",
		name = "<init>",
		desc = "()V"
	)
	class123() {
		this.field1058 = true;
	}

	@ObfInfo(
		owner = "gv",
		name = "v",
		desc = "(B)V"
	)
	void method525() {
	}

	@ObfInfo(
		owner = "gv",
		name = "x",
		desc = "(Lqy;B)V"
	)
	void method522(class127 var1) {
		while (true) {
			int var3 = var1.method547();
			if (var3 == 0) {
				return;
			}

			this.method523(var1, var3);
		}
	}

	@ObfInfo(
		owner = "gv",
		name = "m",
		desc = "(Lqy;II)V"
	)
	void method523(class127 var1, int var2) {
		if (var2 == 1) {
			byte var5 = var1.method548();
			int var6 = var5 & 255;
			if (var6 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var6, 16));
			}

			if (var6 >= 128 && var6 < 160) {
				char var7 = class471.field3959[var6 - 128];
				if (var7 == 0) {
					var7 = '?';
				}

				var6 = var7;
			}

			char var4 = (char)var6;
			this.field1055 = var4;
		} else if (var2 == 2) {
			this.field1059 = var1.method595();
		} else if (var2 == 4) {
			this.field1058 = false;
		} else if (var2 == 5) {
			this.field1057 = var1.method555();
		}

	}

	@ObfInfo(
		owner = "gv",
		name = "q",
		desc = "(I)Z"
	)
	public boolean method524() {
		return this.field1055 == 's';
	}

	@ObfInfo(
		owner = "gv",
		name = "ar",
		desc = "(ILbm;ZI)I"
	)
	static int method526(int var0, class461 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == ScriptOpcodes.ADD) {
			class161.field1227 -= 2;
			var4 = class386.field3248[class161.field1227];
			var5 = class386.field3248[1 + class161.field1227];
			class386.field3248[++class161.field1227 - 1] = var5 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class161.field1227 -= 2;
			var4 = class386.field3248[class161.field1227];
			var5 = class386.field3248[class161.field1227 + 1];
			class386.field3248[++class161.field1227 - 1] = var4 - var5;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class161.field1227 -= 2;
			var4 = class386.field3248[class161.field1227];
			var5 = class386.field3248[class161.field1227 + 1];
			class386.field3248[++class161.field1227 - 1] = var5 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class161.field1227 -= 2;
			var4 = class386.field3248[class161.field1227];
			var5 = class386.field3248[class161.field1227 + 1];
			class386.field3248[++class161.field1227 - 1] = var4 / var5;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = (int)(Math.random() * (double)var4);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3248[++class161.field1227 - 1] = (int)(Math.random() * (double)(var4 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class161.field1227 -= 5;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				var6 = class386.field3248[class161.field1227 + 2];
				var7 = class386.field3248[class161.field1227 + 3];
				var8 = class386.field3248[4 + class161.field1227];
				class386.field3248[++class161.field1227 - 1] = (var8 - var6) * (var5 - var4) / (var7 - var6) + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				class386.field3248[++class161.field1227 - 1] = var4 * var5 / 100 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				class386.field3248[++class161.field1227 - 1] = var4 | 1 << var5;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				class386.field3248[++class161.field1227 - 1] = var4 & -1 - (1 << var5);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				class386.field3248[++class161.field1227 - 1] = 0 != (var4 & 1 << var5) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				class386.field3248[++class161.field1227 - 1] = var4 % var5;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				if (var4 == 0) {
					class386.field3248[++class161.field1227 - 1] = 0;
				} else {
					class386.field3248[++class161.field1227 - 1] = (int)Math.pow((double)var4, (double)var5);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				if (var4 == 0) {
					class386.field3248[++class161.field1227 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
					case 0:
						class386.field3248[++class161.field1227 - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						class386.field3248[++class161.field1227 - 1] = var4;
						break;
					case 2:
						class386.field3248[++class161.field1227 - 1] = (int)Math.sqrt((double)var4);
						break;
					case 3:
						class386.field3248[++class161.field1227 - 1] = (int)Math.cbrt((double)var4);
						break;
					case 4:
						class386.field3248[++class161.field1227 - 1] = (int)Math.sqrt(Math.sqrt((double)var4));
						break;
					default:
						class386.field3248[++class161.field1227 - 1] = (int)Math.pow((double)var4, 1.0D / (double)var5);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				class386.field3248[++class161.field1227 - 1] = var4 & var5;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				class386.field3248[++class161.field1227 - 1] = var4 | var5;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class161.field1227 -= 3;
				long var10 = (long)class386.field3248[class161.field1227];
				long var12 = (long)class386.field3248[1 + class161.field1227];
				long var14 = (long)class386.field3248[class161.field1227 + 2];
				class386.field3248[++class161.field1227 - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var4 = class259.method1108(class386.field3248[--class161.field1227]);
				class386.field3248[++class161.field1227 - 1] = var4;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				class386.field3248[++class161.field1227 - 1] = var4 ^ 1 << var5;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class161.field1227 -= 3;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				var6 = class386.field3248[2 + class161.field1227];
				class386.field3248[++class161.field1227 - 1] = class413.method2012(var4, var5, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class161.field1227 -= 3;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				var6 = class386.field3248[class161.field1227 + 2];
				class386.field3248[++class161.field1227 - 1] = class210.method912(var4, var5, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class161.field1227 -= 3;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				var6 = class386.field3248[class161.field1227 + 2];
				var7 = 31 - var6;
				class386.field3248[++class161.field1227 - 1] = var4 << var7 >>> var7 + var5;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE_TOINT) {
				class161.field1227 -= 4;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				var6 = class386.field3248[class161.field1227 + 2];
				var7 = class386.field3248[3 + class161.field1227];
				var4 = class210.method912(var4, var6, var7);
				var8 = class334.method1681(1 + (var7 - var6));
				if (var5 > var8) {
					var5 = var8;
				}

				class386.field3248[++class161.field1227 - 1] = var4 | var5 << var6;
				return 1;
			} else if (var0 == ScriptOpcodes.SIN_DEG) {
				class386.field3248[class161.field1227 - 1] = class277.method1385(class386.field3248[class161.field1227 - 1]);
				return 1;
			} else if (var0 == ScriptOpcodes.COS_DEG) {
				class386.field3248[class161.field1227 - 1] = class492.method2438(class386.field3248[class161.field1227 - 1]);
				return 1;
			} else if (var0 == ScriptOpcodes.ATAN2_DEG) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				var6 = class187.method847(var4, var5);
				class386.field3248[++class161.field1227 - 1] = var6;
				return 1;
			} else if (var0 == ScriptOpcodes.ABS) {
				class386.field3248[class161.field1227 - 1] = Math.abs(class386.field3248[class161.field1227 - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}
}
