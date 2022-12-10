public class class204 extends class439 {
	static boolean field2336;
	static class282 field2331;
	static class337 field2335;
	boolean field2333;
	char field2330;
	public int field2334;
	public String field2332;

	static {
		field2331 = new class282(64);
	}

	class204() {
		this.field2333 = true;
	}

	public static void method1650(class337 var0) {
		field2335 = var0;
	}

	void method4017() {
	}

	void method4009(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method4010(var1, var3);
		}
	}

	void method4010(class467 var1, int var2) {
		if (var2 == 1) {
			byte var5 = var1.method8327();
			int var6 = var5 & 255;
			if (var6 == 0) {
				throw new IllegalArgumentException("" + Integer.toString(var6, 16));
			}

			if (var6 >= 128 && var6 < 160) {
				char var7 = class363.field4351[var6 - 128];
				if (var7 == 0) {
					var7 = '?';
				}

				var6 = var7;
			}

			char var4 = (char)var6;
			this.field2330 = var4;
		} else if (var2 == 2) {
			this.field2334 = var1.method8480();
		} else if (var2 == 4) {
			this.field2333 = false;
		} else if (var2 == 5) {
			this.field2332 = var1.method8335();
		}

	}

	public boolean method4011() {
		return this.field2330 == 's';
	}

	static int method4025(int var0, class65 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == CS2Opcodes.ADD) {
			class94.field920 -= 2;
			var4 = class69.field579[class94.field920];
			var5 = class69.field579[1 + class94.field920];
			class69.field579[++class94.field920 - 1] = var5 + var4;
			return 1;
		} else if (var0 == CS2Opcodes.SUB) {
			class94.field920 -= 2;
			var4 = class69.field579[class94.field920];
			var5 = class69.field579[class94.field920 + 1];
			class69.field579[++class94.field920 - 1] = var4 - var5;
			return 1;
		} else if (var0 == CS2Opcodes.MULTIPLY) {
			class94.field920 -= 2;
			var4 = class69.field579[class94.field920];
			var5 = class69.field579[class94.field920 + 1];
			class69.field579[++class94.field920 - 1] = var5 * var4;
			return 1;
		} else if (var0 == CS2Opcodes.DIV) {
			class94.field920 -= 2;
			var4 = class69.field579[class94.field920];
			var5 = class69.field579[class94.field920 + 1];
			class69.field579[++class94.field920 - 1] = var4 / var5;
			return 1;
		} else if (var0 == CS2Opcodes.RANDOM) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = (int)(Math.random() * (double)var4);
			return 1;
		} else if (var0 == CS2Opcodes.RANDOMINC) {
			var4 = class69.field579[--class94.field920];
			class69.field579[++class94.field920 - 1] = (int)(Math.random() * (double)(var4 + 1));
			return 1;
		} else {
			int var6;
			int var7;
			int var8;
			if (var0 == CS2Opcodes.INTERPOLATE) {
				class94.field920 -= 5;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				var6 = class69.field579[class94.field920 + 2];
				var7 = class69.field579[class94.field920 + 3];
				var8 = class69.field579[4 + class94.field920];
				class69.field579[++class94.field920 - 1] = (var8 - var6) * (var5 - var4) / (var7 - var6) + var4;
				return 1;
			} else if (var0 == CS2Opcodes.ADDPERCENT) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				class69.field579[++class94.field920 - 1] = var4 * var5 / 100 + var4;
				return 1;
			} else if (var0 == CS2Opcodes.SETBIT) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				class69.field579[++class94.field920 - 1] = var4 | 1 << var5;
				return 1;
			} else if (var0 == CS2Opcodes.CLEARBIT) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				class69.field579[++class94.field920 - 1] = var4 & -1 - (1 << var5);
				return 1;
			} else if (var0 == CS2Opcodes.TESTBIT) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				class69.field579[++class94.field920 - 1] = 0 != (var4 & 1 << var5) ? 1 : 0;
				return 1;
			} else if (var0 == CS2Opcodes.MOD) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				class69.field579[++class94.field920 - 1] = var4 % var5;
				return 1;
			} else if (var0 == CS2Opcodes.POW) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				if (var4 == 0) {
					class69.field579[++class94.field920 - 1] = 0;
				} else {
					class69.field579[++class94.field920 - 1] = (int)Math.pow((double)var4, (double)var5);
				}

				return 1;
			} else if (var0 == CS2Opcodes.INVPOW) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				if (var4 == 0) {
					class69.field579[++class94.field920 - 1] = 0;
					return 1;
				} else {
					switch(var5) {
					case 0:
						class69.field579[++class94.field920 - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						class69.field579[++class94.field920 - 1] = var4;
						break;
					case 2:
						class69.field579[++class94.field920 - 1] = (int)Math.sqrt((double)var4);
						break;
					case 3:
						class69.field579[++class94.field920 - 1] = (int)Math.cbrt((double)var4);
						break;
					case 4:
						class69.field579[++class94.field920 - 1] = (int)Math.sqrt(Math.sqrt((double)var4));
						break;
					default:
						class69.field579[++class94.field920 - 1] = (int)Math.pow((double)var4, 1.0D / (double)var5);
					}

					return 1;
				}
			} else if (var0 == CS2Opcodes.AND) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				class69.field579[++class94.field920 - 1] = var4 & var5;
				return 1;
			} else if (var0 == CS2Opcodes.OR) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				class69.field579[++class94.field920 - 1] = var4 | var5;
				return 1;
			} else if (var0 == CS2Opcodes.SCALE) {
				class94.field920 -= 3;
				long var10 = (long)class69.field579[class94.field920];
				long var12 = (long)class69.field579[1 + class94.field920];
				long var14 = (long)class69.field579[class94.field920 + 2];
				class69.field579[++class94.field920 - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == CS2Opcodes.BITCOUNT) {
				var4 = class279.method4663(class69.field579[--class94.field920]);
				class69.field579[++class94.field920 - 1] = var4;
				return 1;
			} else if (var0 == CS2Opcodes.TOGGLEBIT) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				class69.field579[++class94.field920 - 1] = var4 ^ 1 << var5;
				return 1;
			} else if (var0 == CS2Opcodes.SETBIT_RANGE) {
				class94.field920 -= 3;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				var6 = class69.field579[2 + class94.field920];
				class69.field579[++class94.field920 - 1] = class279.method5308(var4, var5, var6);
				return 1;
			} else if (var0 == CS2Opcodes.CLEARBIT_RANGE) {
				class94.field920 -= 3;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				var6 = class69.field579[class94.field920 + 2];
				class69.field579[++class94.field920 - 1] = class279.method2907(var4, var5, var6);
				return 1;
			} else if (var0 == CS2Opcodes.GETBIT_RANGE) {
				class94.field920 -= 3;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				var6 = class69.field579[class94.field920 + 2];
				var7 = 31 - var6;
				class69.field579[++class94.field920 - 1] = var4 << var7 >>> var7 + var5;
				return 1;
			} else if (var0 == CS2Opcodes.SETBIT_RANGE_TOINT) {
				class94.field920 -= 4;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				var6 = class69.field579[class94.field920 + 2];
				var7 = class69.field579[3 + class94.field920];
				var4 = class279.method2907(var4, var6, var7);
				var8 = class279.method2056(1 + (var7 - var6));
				if (var5 > var8) {
					var5 = var8;
				}

				class69.field579[++class94.field920 - 1] = var4 | var5 << var6;
				return 1;
			} else if (var0 == CS2Opcodes.SIN_DEG) {
				class69.field579[class94.field920 - 1] = class440.method2853(class69.field579[class94.field920 - 1]);
				return 1;
			} else if (var0 == CS2Opcodes.COS_DEG) {
				class69.field579[class94.field920 - 1] = class440.method944(class69.field579[class94.field920 - 1]);
				return 1;
			} else if (var0 == CS2Opcodes.ATAN2_DEG) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				var6 = class440.method7558(var4, var5);
				class69.field579[++class94.field920 - 1] = var6;
				return 1;
			} else if (var0 == CS2Opcodes.ABS) {
				class69.field579[class94.field920 - 1] = Math.abs(class69.field579[class94.field920 - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}
}
