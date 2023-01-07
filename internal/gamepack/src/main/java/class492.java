import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "aw"
)
public class class492 implements Runnable {
	@ObfInfo(
		owner = "aw",
		name = "v",
		desc = "Lly;"
	)
	static class274 field4109;
	@ObfInfo(
		owner = "aw",
		name = "h",
		desc = "[Lax;"
	)
	volatile class233[] field4110;

	@ObfInfo(
		owner = "aw",
		name = "<init>",
		desc = "()V"
	)
	class492() {
		this.field4110 = new class233[2];
	}

	@ObfInfo(
		owner = "aw",
		name = "run",
		desc = "()V"
	)
	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				class233 var2 = this.field4110[var1];
				if (null != var2) {
					var2.method1018();
				}
			}
		} catch (Exception var4) {
			class445.method2199((String)null, var4);
		}

	}

	@ObfInfo(
		owner = "aw",
		name = "h",
		desc = "(Ljava/lang/CharSequence;I)I"
	)
	public static int method2435(CharSequence var0) {
		int var2 = var0.length();
		int var3 = 0;

		for (int var4 = 0; var4 < var2; ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 <= 127) {
				++var3;
			} else if (var5 <= 2047) {
				var3 += 2;
			} else {
				var3 += 3;
			}
		}

		return var3;
	}

	@ObfInfo(
		owner = "aw",
		name = "v",
		desc = "(II)I"
	)
	public static int method2438(int var0) {
		return class83.field673[var0 & 16383];
	}

	@ObfInfo(
		owner = "aw",
		name = "q",
		desc = "(I)V"
	)
	static void method2437() {
		if (client.field268 && null != class359.field3071 && class359.field3071.length() > 0) {
			class359.field3073 = 1;
		} else {
			class359.field3073 = 0;
		}

	}

	@ObfInfo(
		owner = "aw",
		name = "hw",
		desc = "(Ljava/lang/String;ZI)V"
	)
	static final void method2436(String var0, boolean var1) {
		if (client.field346) {
			byte var3 = 4;
			int var4 = var3 + 6;
			int var5 = var3 + 6;
			int var6 = class400.field3376.method2023(var0, 250);
			int var7 = class400.field3376.method2024(var0, 250) * 13;
			class162.method749(var4 - var3, var5 - var3, var3 + var3 + var6, var7 + var3 + var3, 0);
			class162.method741(var4 - var3, var5 - var3, var3 + var3 + var6, var3 + var7 + var3, 16777215);
			class400.field3376.method2028(var0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
			class408.method2001(var4 - var3, var5 - var3, var6 + var3 + var3, var7 + var3 + var3);
			if (var1) {
				class39.field199.method263(0, 0);
			} else {
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;
				int var11 = var7;

				for (int var12 = 0; var12 < client.field442; ++var12) {
					if (client.field447[var12] + client.field435[var12] > var8 && client.field447[var12] < var10 + var8 && client.field247[var12] + client.field448[var12] > var9 && client.field448[var12] < var9 + var11) {
						client.field445[var12] = true;
					}
				}
			}

		}
	}

	@ObfInfo(
		owner = "aw",
		name = "kd",
		desc = "(Lkd;IIIIIII)V"
	)
	static final void method2434(class120 var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (client.field402) {
			client.field299 = 32;
		} else {
			client.field299 = 0;
		}

		client.field402 = false;
		int var8;
		if (class466.field3862 == 1 || !class151.field1180 && class466.field3862 == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.field914 -= 4;
				class184.method836(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.field914 += 4;
				class184.method836(var0);
			} else if (var5 >= var1 - client.field299 && var5 < var1 + 16 + client.field299 && var6 >= var2 + 16 && var6 < var2 + var3 - 16) {
				var8 = var3 * (var3 - 32) / var4;
				if (var8 < 8) {
					var8 = 8;
				}

				int var9 = var6 - var2 - 16 - var8 / 2;
				int var10 = var3 - 32 - var8;
				var0.field914 = var9 * (var4 - var3) / var10;
				class184.method836(var0);
				client.field402 = true;
			}
		}

		if (client.field327 != 0) {
			var8 = var0.field908;
			if (var5 >= var1 - var8 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.field914 += client.field327 * 45;
				class184.method836(var0);
			}
		}

	}
}
