public class class165 extends class439 {
	public static class337 field1532;
	public static int field1534;
	static class282 field1533;
	static class326 field1536;
	public int field1531;

	static {
		field1533 = new class282(64);
	}

	class165() {
		this.field1531 = 0;
	}

	void method2770(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method2781(var1, var3);
		}
	}

	void method2781(class467 var1, int var2) {
		if (var2 == 5) {
			this.field1531 = var1.method8328();
		}

	}

	public static void method1208() {
		field1533.method5357();
	}

	public static class196 method2780(int var0) {
		class196 var2 = (class196)class196.field2165.method5356((long)var0);
		if (null != var2) {
			return var2;
		} else {
			byte[] var3 = class196.field2164.method6374(6, var0);
			var2 = new class196();
			var2.field2170 = var0;
			if (var3 != null) {
				var2.method3819(new class467(var3));
			}

			var2.method3822();
			if (var2.field2198) {
				var2.field2175 = 0;
				var2.field2188 = false;
			}

			class196.field2165.method5364(var2, (long)var0);
			return var2;
		}
	}

	public static void method2776(byte[] var0) {
		class467 var2 = new class467(var0);
		var2.field4915 = var0.length - 2;
		class477.field5008 = var2.method8328();
		class477.field5009 = new int[class477.field5008];
		class392.field4524 = new int[class477.field5008];
		class7.field44 = new int[class477.field5008];
		class186.field2042 = new int[class477.field5008];
		class227.field2749 = new byte[class477.field5008][];
		var2.field4915 = var0.length - 7 - class477.field5008 * 8;
		class336.field4226 = var2.method8328();
		class477.field5007 = var2.method8328();
		int var3 = (var2.method8326() & 255) + 1;

		int var4;
		for (var4 = 0; var4 < class477.field5008; ++var4) {
			class477.field5009[var4] = var2.method8328();
		}

		for (var4 = 0; var4 < class477.field5008; ++var4) {
			class392.field4524[var4] = var2.method8328();
		}

		for (var4 = 0; var4 < class477.field5008; ++var4) {
			class7.field44[var4] = var2.method8328();
		}

		for (var4 = 0; var4 < class477.field5008; ++var4) {
			class186.field2042[var4] = var2.method8328();
		}

		var2.field4915 = var0.length - 7 - class477.field5008 * 8 - 3 * (var3 - 1);
		class271.field3171 = new int[var3];

		for (var4 = 1; var4 < var3; ++var4) {
			class271.field3171[var4] = var2.method8330();
			if (0 == class271.field3171[var4]) {
				class271.field3171[var4] = 1;
			}
		}

		var2.field4915 = 0;

		for (var4 = 0; var4 < class477.field5008; ++var4) {
			int var5 = class7.field44[var4];
			int var6 = class186.field2042[var4];
			int var7 = var6 * var5;
			byte[] var8 = new byte[var7];
			class227.field2749[var4] = var8;
			int var9 = var2.method8326();
			int var10;
			if (var9 == 0) {
				for (var10 = 0; var10 < var7; ++var10) {
					var8[var10] = var2.method8327();
				}
			} else if (var9 == 1) {
				for (var10 = 0; var10 < var5; ++var10) {
					for (int var11 = 0; var11 < var6; ++var11) {
						var8[var10 + var5 * var11] = var2.method8327();
					}
				}
			}
		}

	}

	static void method2768(class326 var0, int var1, int var2, int var3, byte var4, boolean var5) {
		long var7 = (long)(var2 + (var1 << 16));
		class316 var9 = (class316)class334.field4207.method8177(var7);
		if (var9 == null) {
			var9 = (class316)class334.field4201.method8177(var7);
			if (null == var9) {
				var9 = (class316)class334.field4204.method8177(var7);
				if (null != var9) {
					if (var5) {
						var9.method7996();
						class334.field4207.method8170(var9, var7);
						--class334.field4205;
						++class334.field4200;
					}

				} else {
					if (!var5) {
						var9 = (class316)class334.field4206.method8177(var7);
						if (null != var9) {
							return;
						}
					}

					var9 = new class316();
					var9.field3732 = var0;
					var9.field3733 = var3;
					var9.field3735 = var4;
					if (var5) {
						class334.field4207.method8170(var9, var7);
						++class334.field4200;
					} else {
						class334.field4199.method6474(var9);
						class334.field4204.method8170(var9, var7);
						++class334.field4205;
					}

				}
			}
		}
	}

	static void method2778(int var0) {
		for (class429 var2 = (class429)client.field1740.method8172(); null != var2; var2 = (class429)client.field1740.method8173()) {
			if ((var2.field4773 >> 48 & 65535L) == (long)var0) {
				var2.method7951();
			}
		}

	}
}
