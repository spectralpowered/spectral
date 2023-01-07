import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "qs"
)
public class class106 extends class195 {
	@ObfInfo(
		owner = "qs",
		name = "e",
		desc = "Ljv;"
	)
	public static class99 field818;
	@ObfInfo(
		owner = "qs",
		name = "h",
		desc = "Lly;"
	)
	static class274 field819;
	@ObfInfo(
		owner = "qs",
		name = "v",
		desc = "[[I"
	)
	public int[][] field820;
	@ObfInfo(
		owner = "qs",
		name = "x",
		desc = "[[Ljava/lang/Object;"
	)
	public Object[][] field817;

	static {
		field818 = new class99(64);
	}

	@ObfInfo(
		owner = "qs",
		name = "<init>",
		desc = "()V"
	)
	class106() {
	}

	@ObfInfo(
		owner = "qs",
		name = "v",
		desc = "(Lqy;B)V"
	)
	void method419(class127 var1) {
		while (true) {
			int var3 = var1.method547();
			if (var3 == 0) {
				return;
			}

			this.method422(var1, var3);
		}
	}

	@ObfInfo(
		owner = "qs",
		name = "x",
		desc = "(Lqy;IB)V"
	)
	void method422(class127 var1, int var2) {
		if (var2 == 1) {
			int var4 = var1.method547();
			if (null == this.field820) {
				this.field820 = new int[var4][];
			}

			for (int var5 = var1.method547(); var5 != 255; var5 = var1.method547()) {
				int var6 = var5 & 127;
				boolean var7 = (var5 & 128) != 0;
				int[] var8 = new int[var1.method547()];

				for (int var9 = 0; var9 < var8.length; ++var9) {
					var8[var9] = var1.method559();
				}

				this.field820[var6] = var8;
				if (var7) {
					if (this.field817 == null) {
						this.field817 = new Object[this.field820.length][];
					}

					Object[][] var18 = this.field817;
					int var12 = var1.method559();
					Object[] var13 = new Object[var8.length * var12];

					for (int var14 = 0; var14 < var12; ++var14) {
						for (int var15 = 0; var15 < var8.length; ++var15) {
							int var16 = var15 + var14 * var8.length;
							class185 var17 = class374.method1849(var8[var15]);
							var13[var16] = var17.method840(var1);
						}
					}

					var18[var6] = var13;
				}
			}
		}

	}

	@ObfInfo(
		owner = "qs",
		name = "m",
		desc = "(I)V"
	)
	void method420() {
	}

	@ObfInfo(
		owner = "qs",
		name = "h",
		desc = "(Ljava/lang/CharSequence;I)Ljava/lang/String;"
	)
	public static String method421(CharSequence var0) {
		int var2 = var0.length();
		StringBuilder var3 = new StringBuilder(var2);

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if ((var5 < 'a' || var5 > 'z') && (var5 < 'A' || var5 > 'Z') && (var5 < '0' || var5 > '9') && var5 != '.' && var5 != '-' && var5 != '*' && var5 != '_') {
				if (var5 == ' ') {
					var3.append('+');
				} else {
					byte var6 = class72.method315(var5);
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

	@ObfInfo(
		owner = "qs",
		name = "e",
		desc = "(IS)I"
	)
	public static int method423(int var0) {
		return var0 >>> 4 & class227.field1930;
	}
}
