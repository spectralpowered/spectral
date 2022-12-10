public class class236 {
	class236() throws Throwable {
		throw new Error();
	}

	static final void method4726() {
		if (class384.field4486 != client.field1801) {
			client.field1801 = class384.field4486;
			int var1 = class384.field4486;
			int[] var2 = class224.field2727.field5067;
			int var3 = var2.length;

			int var4;
			for (var4 = 0; var4 < var3; ++var4) {
				var2[var4] = 0;
			}

			int var5;
			int var6;
			for (var4 = 1; var4 < 103; ++var4) {
				var5 = 2048 * (103 - var4) + 24628;

				for (var6 = 1; var6 < 103; ++var6) {
					if (0 == (class84.field773[var1][var6][var4] & 24)) {
						class33.field194.method4186(var2, var5, 512, var1, var6, var4);
					}

					if (var1 < 3 && 0 != (class84.field773[var1 + 1][var6][var4] & 8)) {
						class33.field194.method4186(var2, var5, 512, var1 + 1, var6, var4);
					}

					var5 += 4;
				}
			}

			var4 = (238 + (int)(Math.random() * 20.0D) - 10 << 16) + (238 + (int)(Math.random() * 20.0D) - 10 << 8) + (238 + (int)(Math.random() * 20.0D) - 10);
			var5 = 238 + (int)(Math.random() * 20.0D) - 10 << 16;
			class224.field2727.method8856();

			int var7;
			for (var6 = 1; var6 < 103; ++var6) {
				for (var7 = 1; var7 < 103; ++var7) {
					if (0 == (class84.field773[var1][var7][var6] & 24)) {
						class188.method3619(var1, var7, var6, var4, var5);
					}

					if (var1 < 3 && 0 != (class84.field773[var1 + 1][var7][var6] & 8)) {
						class188.method3619(var1 + 1, var7, var6, var4, var5);
					}
				}
			}

			client.field1938 = 0;

			for (var6 = 0; var6 < 104; ++var6) {
				for (var7 = 0; var7 < 104; ++var7) {
					long var8 = class33.field194.method4181(class384.field4486, var6, var7);
					if (var8 != 0L) {
						int var10 = class215.method4664(var8);
						int var11 = class165.method2780(var10).field2191;
						if (var11 >= 0 && class163.method2762(var11).field1589) {
							client.field1941[client.field1938] = class163.method2762(var11).method2869(false);
							client.field1939[client.field1938] = var6;
							client.field1940[client.field1938] = var7;
							++client.field1938;
						}
					}
				}
			}

			class189.field2059.method8765();
		}

	}
}
