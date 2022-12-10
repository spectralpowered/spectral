public class class461 extends class439 {
	public static class282 field4896;
	static class337 field4897;
	public int[][] field4898;
	public Object[][] field4895;

	static {
		field4896 = new class282(64);
	}

	public static String method8220(CharSequence var0) {
		int var2 = var0.length();
		StringBuilder var3 = new StringBuilder(var2);

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
				if (var5 == ' ') {
					var3.append('+');
				} else {
					byte var6 = class302.method6078(var5);
					var3.append('%');
					int var7 = var6 >> 4 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(var7 + 48));
					}

					var7 = var6 & 15;
					if (var7 >= 10) {
						var3.append((char)(var7 + 55));
					} else {
						var3.append((char)(var7 + 48));
					}
				}
			} else {
				var3.append(var5);
			}
		}

		return var3.toString();
	}

	class461() {
	}

	public static void method7550(class337 var0) {
		field4897 = var0;
	}

	void method8216(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method8225(var1, var3);
		}
	}

	void method8225(class467 var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.method8326();
			if (null == this.field4898) {
				this.field4898 = new int[var4][];
			}

			for (int var5 = var1.method8326(); var5 != 255; var5 = var1.method8326()) {
				int var6 = var5 & 127;
				boolean var7 = (var5 & 128) != 0;
				int[] var8 = new int[var1.method8326()];

				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method8340();
				}

				this.field4898[var6] = var8;
				if (var7) {
					if (this.field4895 == null) {
						this.field4895 = new Object[this.field4898.length][];
					}

					Object[][] var18 = this.field4895;
					int var12 = var1.method8340();
					Object[] var13 = new Object[var8.length * var12];

					for (int var14 = 0; var14 < var12; ++var14) {
						for (int var15 = 0; var15 < var8.length; ++var15) {
							int var16 = var15 + var14 * var8.length;
							class460 var17 = class2.method20(var8[var15]);
							var13[var16] = var17.method8203(var1);
						}
					}

					var18[var6] = var13;
				}
			}
		}

	}

	void method8218() {
	}
}
