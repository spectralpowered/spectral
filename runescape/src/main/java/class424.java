public class class424 {
	public static final class424 field4727;
	static int field4730;
	static final class424 field4728;
	String field4729;

	static {
		field4727 = new class424("application/json");
		field4728 = new class424("text/plain");
	}

	class424(String var1) {
		this.field4729 = var1;
	}

	public String method7922() {
		return this.field4729;
	}

	static void method7927(class78[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var6 = var1 - 1;
			int var7 = var2 + 1;
			int var8 = (var1 + var2) / 2;
			class78 var9 = var0[var8];
			var0[var8] = var0[var1];
			var0[var1] = var9;

			while (var6 < var7) {
				boolean var10 = true;

				int var11;
				int var12;
				int var13;
				do {
					--var7;

					for (var11 = 0; var11 < 4; ++var11) {
						if (2 == var3[var11]) {
							var12 = var0[var7].field719;
							var13 = var9.field719;
						} else if (var3[var11] == 1) {
							var12 = var0[var7].field715;
							var13 = var9.field715;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && 1 == var4[var11]) {
								var13 = 2001;
							}
						} else if (3 == var3[var11]) {
							var12 = var0[var7].method1533() ? 1 : 0;
							var13 = var9.method1533() ? 1 : 0;
						} else {
							var12 = var0[var7].field708;
							var13 = var9.field708;
						}

						if (var12 != var13) {
							if ((1 != var4[var11] || var12 <= var13) && (var4[var11] != 0 || var12 >= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				var10 = true;

				do {
					++var6;

					for (var11 = 0; var11 < 4; ++var11) {
						if (2 == var3[var11]) {
							var12 = var0[var6].field719;
							var13 = var9.field719;
						} else if (1 == var3[var11]) {
							var12 = var0[var6].field715;
							var13 = var9.field715;
							if (var12 == -1 && var4[var11] == 1) {
								var12 = 2001;
							}

							if (var13 == -1 && var4[var11] == 1) {
								var13 = 2001;
							}
						} else if (var3[var11] == 3) {
							var12 = var0[var6].method1533() ? 1 : 0;
							var13 = var9.method1533() ? 1 : 0;
						} else {
							var12 = var0[var6].field708;
							var13 = var9.field708;
						}

						if (var12 != var13) {
							if ((var4[var11] != 1 || var12 >= var13) && (var4[var11] != 0 || var12 <= var13)) {
								var10 = false;
							}
							break;
						}

						if (var11 == 3) {
							var10 = false;
						}
					}
				} while(var10);

				if (var6 < var7) {
					class78 var14 = var0[var6];
					var0[var6] = var0[var7];
					var0[var7] = var14;
				}
			}

			method7927(var0, var1, var7, var3, var4);
			method7927(var0, var7 + 1, var2, var3, var4);
		}

	}
}
