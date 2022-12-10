public class class36 {
	static int field219;
	class337 field220;
	class337 field221;
	class458 field222;
	class458 field225;

	public class36(class337 var1, class337 var2) {
		this.field225 = new class458(256);
		this.field222 = new class458(256);
		this.field221 = var1;
		this.field220 = var2;
	}

	class32 method462(int var1, int var2, int[] var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var5 |= var1 << 16;
		long var6 = (long)var5;
		class32 var8 = (class32)this.field222.method8177(var6);
		if (var8 != null) {
			return var8;
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			class37 var9 = class37.method481(this.field221, var1, var2);
			if (null == var9) {
				return null;
			} else {
				var8 = var9.method483();
				this.field222.method8170(var8, var6);
				if (var3 != null) {
					var3[0] -= var8.field179.length;
				}

				return var8;
			}
		}
	}

	class32 method464(int var1, int var2, int[] var3) {
		int var5 = var2 ^ (var1 << 4 & 65535 | var1 >>> 12);
		var5 |= var1 << 16;
		long var6 = (long)var5 ^ 4294967296L;
		class32 var8 = (class32)this.field222.method8177(var6);
		if (null != var8) {
			return var8;
		} else if (null != var3 && var3[0] <= 0) {
			return null;
		} else {
			class57 var9 = (class57)this.field225.method8177(var6);
			if (var9 == null) {
				var9 = class57.method1075(this.field220, var1, var2);
				if (var9 == null) {
					return null;
				}

				this.field225.method8170(var9, var6);
			}

			var8 = var9.method1076(var3);
			if (null == var8) {
				return null;
			} else {
				var9.method7951();
				this.field222.method8170(var8, var6);
				return var8;
			}
		}
	}

	public class32 method463(int var1, int[] var2) {
		if (this.field221.method6314() == 1) {
			return this.method462(0, var1, var2);
		} else if (this.field221.method6330(var1) == 1) {
			return this.method462(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	public class32 method466(int var1, int[] var2) {
		if (this.field220.method6314() == 1) {
			return this.method464(0, var1, var2);
		} else if (this.field220.method6330(var1) == 1) {
			return this.method464(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	static int method479(int var0, class65 var1, boolean var2) {
		int var4;
		int var5;
		int var7;
		if (var0 == CS2Opcodes.ENUM_STRING) {
			class94.field920 -= 2;
			var4 = class69.field579[class94.field920];
			var5 = class69.field579[1 + class94.field920];
			class197 var6 = class94.method2017(var4);
			if (var6.field2217 != 's') {
			}

			for (var7 = 0; var7 < var6.field2220; ++var7) {
				if (var5 == var6.field2215[var7]) {
					class69.field580[++class69.field581 - 1] = var6.field2222[var7];
					var6 = null;
					break;
				}
			}

			if (null != var6) {
				class69.field580[++class69.field581 - 1] = var6.field2218;
			}

			return 1;
		} else if (var0 != CS2Opcodes.ENUM) {
			if (var0 == CS2Opcodes.ENUM_GETOUTPUTCOUNT) {
				var4 = class69.field579[--class94.field920];
				class197 var11 = class94.method2017(var4);
				class69.field579[++class94.field920 - 1] = var11.method3883();
				return 1;
			} else {
				return 2;
			}
		} else {
			class94.field920 -= 4;
			var4 = class69.field579[class94.field920];
			var5 = class69.field579[1 + class94.field920];
			int var10 = class69.field579[2 + class94.field920];
			var7 = class69.field579[3 + class94.field920];
			class197 var8 = class94.method2017(var10);
			if (var4 == var8.field2216 && var8.field2217 == var5) {
				for (int var9 = 0; var9 < var8.field2220; ++var9) {
					if (var7 == var8.field2215[var9]) {
						if (var5 == 115) {
							class69.field580[++class69.field581 - 1] = var8.field2222[var9];
						} else {
							class69.field579[++class94.field920 - 1] = var8.field2223[var9];
						}

						var8 = null;
						break;
					}
				}

				if (var8 != null) {
					if (var5 == 115) {
						class69.field580[++class69.field581 - 1] = var8.field2218;
					} else {
						class69.field579[++class94.field920 - 1] = var8.field2219;
					}
				}

				return 1;
			} else {
				if (var5 == 115) {
					class69.field580[++class69.field581 - 1] = class321.field3756;
				} else {
					class69.field579[++class94.field920 - 1] = 0;
				}

				return 1;
			}
		}
	}

	static boolean method476() {
		return (client.field1918 & 1) != 0;
	}

	static final void method480(class290 var0, int var1, int var2, int var3) {
		class308 var5 = var0.method5508(false);
		if (null != var5) {
			if (client.field1765 < 3) {
				class185.field2036.method8861(var1, var2, var5.field3679, var5.field3680, 25, 25, client.field1770, 256, var5.field3681, var5.field3678);
			} else {
				class478.method8692(var1, var2, 0, var5.field3681, var5.field3678);
			}

		}
	}
}
