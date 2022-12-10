import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class181 extends class182 {
	int field1676;
	int field1677;
	int field1679;
	int field1680;
	long field1678;
	long[] field1675;

	public class181() {
		this.field1675 = new long[10];
		this.field1676 = 256;
		this.field1680 = 1;
		this.field1679 = 0;
		this.field1678 = class74.method1493();

		for (int var1 = 0; var1 < 10; ++var1) {
			this.field1675[var1] = this.field1678;
		}

	}

	public void method3002() {
		for (int var2 = 0; var2 < 10; ++var2) {
			this.field1675[var2] = 0L;
		}

	}

	public int method3003(int var1, int var2) {
		int var4 = this.field1676;
		int var5 = this.field1680;
		this.field1676 = 300;
		this.field1680 = 1;
		this.field1678 = class74.method1493();
		if (this.field1675[this.field1677] == 0L) {
			this.field1676 = var4;
			this.field1680 = var5;
		} else if (this.field1678 > this.field1675[this.field1677]) {
			this.field1676 = (int)((long)(var1 * 2560) / (this.field1678 - this.field1675[this.field1677]));
		}

		if (this.field1676 < 25) {
			this.field1676 = 25;
		}

		if (this.field1676 > 256) {
			this.field1676 = 256;
			this.field1680 = (int)((long)var1 - (this.field1678 - this.field1675[this.field1677]) / 10L);
		}

		if (this.field1680 > var1) {
			this.field1680 = var1;
		}

		this.field1675[this.field1677] = this.field1678;
		this.field1677 = (this.field1677 + 1) % 10;
		int var6;
		if (this.field1680 > 1) {
			for (var6 = 0; var6 < 10; ++var6) {
				if (this.field1675[var6] != 0L) {
					this.field1675[var6] += (long)this.field1680;
				}
			}
		}

		if (this.field1680 < var2) {
			this.field1680 = var2;
		}

		class261.method115((long)this.field1680);

		for (var6 = 0; this.field1679 < 256; this.field1679 += this.field1676) {
			++var6;
		}

		this.field1679 &= 255;
		return var6;
	}

	public static void method2995(class467 var0, int var1) {
		class33 var3 = new class33();
		var3.field189 = var0.method8326();
		var3.field185 = var0.method8480();
		var3.field188 = new int[var3.field189];
		var3.field186 = new int[var3.field189];
		var3.field187 = new Field[var3.field189];
		var3.field184 = new int[var3.field189];
		var3.field190 = new Method[var3.field189];
		var3.field183 = new byte[var3.field189][][];

		for (int var4 = 0; var4 < var3.field189; ++var4) {
			try {
				int var5 = var0.method8326();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.method8335();
						var7 = var0.method8335();
						var8 = var0.method8326();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.method8335();
						}

						String var21 = var0.method8335();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.method8480();
								var11[var12] = new byte[var13];
								var0.method8338(var11[var12], 0, var13);
							}
						}

						var3.field188[var4] = var5;
						Class[] var22 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var22[var13] = method2991(var9[var13]);
						}

						Class var23 = method2991(var21);
						if (method2991(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = method2991(var6).getDeclaredMethods();
						Method[] var15 = var14;

						for (int var16 = 0; var16 < var15.length; ++var16) {
							Method var17 = var15[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var22.length == var18.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var22.length; ++var20) {
										if (var18[var20] != var22[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var23 == var17.getReturnType()) {
										var3.field190[var4] = var17;
									}
								}
							}
						}

						var3.field183[var4] = var11;
					}
				} else {
					var6 = var0.method8335();
					var7 = var0.method8335();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.method8480();
					}

					var3.field188[var4] = var5;
					var3.field184[var4] = var8;
					if (method2991(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.field187[var4] = method2991(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var25) {
				var3.field186[var4] = -1;
			} catch (SecurityException var26) {
				var3.field186[var4] = -2;
			} catch (NullPointerException var27) {
				var3.field186[var4] = -3;
			} catch (Exception var28) {
				var3.field186[var4] = -4;
			} catch (Throwable var29) {
				var3.field186[var4] = -5;
			}
		}

		class38.field234.method6672(var3);
	}

	static Class method2991(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Class.forName(var0);
		}
	}
}
