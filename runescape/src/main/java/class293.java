public class class293 extends class27 {
	static class290 field3565;
	class287 field3562;
	class355 field3561;
	class52 field3563;

	class293(class287 var1) {
		this.field3561 = new class355();
		this.field3563 = new class52();
		this.field3562 = var1;
	}

	protected class27 method355() {
		class310 var1 = (class310)this.field3561.method6577();
		if (null == var1) {
			return null;
		} else {
			return (class27)(null != var1.field3704 ? var1.field3704 : this.method359());
		}
	}

	protected class27 method359() {
		class310 var1;
		do {
			var1 = (class310)this.field3561.method6579();
			if (var1 == null) {
				return null;
			}
		} while(null == var1.field3704);

		return var1.field3704;
	}

	protected int method365() {
		return 0;
	}

	protected void method356(int[] var1, int var2, int var3) {
		this.field3563.method356(var1, var2, var3);

		for (class310 var6 = (class310)this.field3561.method6577(); null != var6; var6 = (class310)this.field3561.method6579()) {
			if (!this.field3562.method5409(var6)) {
				int var4 = var2;
				int var5 = var3;

				do {
					if (var5 <= var6.field3705) {
						this.method5665(var6, var1, var4, var5, var4 + var5);
						var6.field3705 -= var5;
						break;
					}

					this.method5665(var6, var1, var4, var6.field3705, var5 + var4);
					var4 += var6.field3705;
					var5 -= var6.field3705;
				} while(!this.field3562.method5410(var6, var1, var4, var5));
			}
		}

	}

	protected void method360(int var1) {
		this.field3563.method360(var1);

		for (class310 var3 = (class310)this.field3561.method6577(); null != var3; var3 = (class310)this.field3561.method6579()) {
			if (!this.field3562.method5409(var3)) {
				int var2 = var1;

				do {
					if (var2 <= var3.field3705) {
						this.method5663(var3, var2);
						var3.field3705 -= var2;
						break;
					}

					this.method5663(var3, var3.field3705);
					var2 -= var3.field3705;
				} while(!this.field3562.method5410(var3, (int[])null, 0, var2));
			}
		}

	}

	static int method5669(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1 + (var0 & 65408);
		}
	}

	void method5665(class310 var1, int[] var2, int var3, int var4, int var5) {
		if ((this.field3562.field3347[var1.field3699] & 4) != 0 && var1.field3687 < 0) {
			int var7 = this.field3562.field3363[var1.field3699] / class50.field363;

			while (true) {
				int var8 = (var7 + 1048575 - var1.field3706) / var7;
				if (var8 > var4) {
					var1.field3706 += var4 * var7;
					break;
				}

				var1.field3704.method356(var2, var3, var8);
				var3 += var8;
				var4 -= var8;
				var1.field3706 += var8 * var7 - 1048576;
				int var9 = class50.field363 / 100;
				int var10 = 262144 / var7;
				if (var10 < var9) {
					var9 = var10;
				}

				class42 var11 = var1.field3704;
				if (0 == this.field3562.field3349[var1.field3699]) {
					var1.field3704 = class42.method832(var1.field3698, var11.method739(), var11.method771(), var11.method742());
				} else {
					var1.field3704 = class42.method832(var1.field3698, var11.method739(), 0, var11.method742());
					this.field3562.method5434(var1, var1.field3689.field3610[var1.field3691] < 0);
					var1.field3704.method735(var9, var11.method771());
				}

				if (var1.field3689.field3610[var1.field3691] < 0) {
					var1.field3704.method727(-1);
				}

				var11.method737(var9);
				var11.method356(var2, var3, var5 - var3);
				if (var11.method783()) {
					this.field3563.method1017(var11);
				}
			}
		}

		var1.field3704.method356(var2, var3, var4);
	}

	void method5663(class310 var1, int var2) {
		if ((this.field3562.field3347[var1.field3699] & 4) != 0 && var1.field3687 < 0) {
			int var4 = this.field3562.field3363[var1.field3699] / class50.field363;
			int var5 = (var4 + 1048575 - var1.field3706) / var4;
			var1.field3706 = var2 * var4 + var1.field3706 & 1048575;
			if (var5 <= var2) {
				if (0 == this.field3562.field3349[var1.field3699]) {
					var1.field3704 = class42.method832(var1.field3698, var1.field3704.method739(), var1.field3704.method771(), var1.field3704.method742());
				} else {
					var1.field3704 = class42.method832(var1.field3698, var1.field3704.method739(), 0, var1.field3704.method742());
					this.field3562.method5434(var1, var1.field3689.field3610[var1.field3691] < 0);
				}

				if (var1.field3689.field3610[var1.field3691] < 0) {
					var1.field3704.method727(-1);
				}

				var2 = var1.field3706 / var4;
			}
		}

		var1.field3704.method360(var2);
	}

	static int method5662(int var0, class65 var1, boolean var2) {
		class290 var4 = var2 ? class187.field2044 : class341.field4273;
		if (var0 == CS2Opcodes.CC_GETINVOBJECT) {
			class69.field579[++class94.field920 - 1] = var4.field3404;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETINVCOUNT) {
			if (var4.field3404 != -1) {
				class69.field579[++class94.field920 - 1] = var4.field3538;
			} else {
				class69.field579[++class94.field920 - 1] = 0;
			}

			return 1;
		} else if (var0 == CS2Opcodes.CC_GETID) {
			class69.field579[++class94.field920 - 1] = var4.field3400;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETCRM_HASRESPONSE) {
			class69.field579[++class94.field920 - 1] = var4.method5515() ? 1 : 0;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETCRM_INT) {
			return class307.method6106(var4);
		} else {
			return var0 == CS2Opcodes.CC_GETCRM_STRING ? class93.method1981(var4) : 2;
		}
	}
}
