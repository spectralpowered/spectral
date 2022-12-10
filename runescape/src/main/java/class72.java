import java.math.BigInteger;

public class class72 {
	public static class290[][] field625;
	public static int field622;
	static class326 field619;
	static final BigInteger field620;
	static final BigInteger field623;

	static {
		field623 = new BigInteger("10001", 16);
		field620 = new BigInteger("ad3d9ce586e8174849a64e9a4c026a0e0b9e654a319951144939f4cc7869cd5660e3ee34d1ef221b4c86970d1370225f8c5c1dd04f2182a7eeaa5227c04f38692a85384e06228c1bf5da9c76971ad9b891964f096fc3a8d2ab6cff41d20a678c81990dce1e9c587798d638f848ade22a1232d9c2452834ec87a43a26c325080f", 16);
	}

	class72() throws Throwable {
		throw new Error();
	}

	static final void method1406(int var0, int var1, int var2, int var3) {
		for (int var5 = var1; var5 <= var3 + var1; ++var5) {
			for (int var6 = var0; var6 <= var0 + var2; ++var6) {
				if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
					class26.field141[0][var6][var5] = 127;
					if (var6 == var0 && var6 > 0) {
						class84.field765[0][var6][var5] = class84.field765[0][var6 - 1][var5];
					}

					if (var2 + var0 == var6 && var6 < 103) {
						class84.field765[0][var6][var5] = class84.field765[0][var6 + 1][var5];
					}

					if (var1 == var5 && var5 > 0) {
						class84.field765[0][var6][var5] = class84.field765[0][var6][var5 - 1];
					}

					if (var5 == var3 + var1 && var5 < 103) {
						class84.field765[0][var6][var5] = class84.field765[0][var6][var5 + 1];
					}
				}
			}
		}

	}

	static int method1407(int var0, class65 var1, boolean var2) {
		class290 var4 = var2 ? class187.field2044 : class341.field4273;
		if (var0 == CS2Opcodes.CC_GETX) {
			class69.field579[++class94.field920 - 1] = var4.field3412;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETY) {
			class69.field579[++class94.field920 - 1] = var4.field3413;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETWIDTH) {
			class69.field579[++class94.field920 - 1] = var4.field3414;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETHEIGHT) {
			class69.field579[++class94.field920 - 1] = var4.field3474;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETHIDE) {
			class69.field579[++class94.field920 - 1] = var4.field3452 ? 1 : 0;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETLAYER) {
			class69.field579[++class94.field920 - 1] = var4.field3418;
			return 1;
		} else {
			return 2;
		}
	}
}
