public final class class213 extends class428 {
	static int field2536;
	boolean field2529;
	boolean field2530;
	boolean field2535;
	class207 field2522;
	class210 field2520;
	class213 field2528;
	class218 field2513;
	class224[] field2524;
	class225 field2519;
	class227 field2521;
	class233 field2518;
	int field2514;
	int field2515;
	int field2516;
	int field2523;
	int field2525;
	int field2526;
	int field2527;
	int field2531;
	int field2532;
	int field2533;
	int field2534;
	int[] field2517;

	public static String method4350(CharSequence[] var0, int var1, int var2) {
		if (var2 == 0) {
			return "";
		} else if (var2 == 1) {
			CharSequence var4 = var0[var1];
			return var4 == null ? "null" : var4.toString();
		} else {
			int var9 = var2 + var1;
			int var5 = 0;

			for (int var6 = var1; var6 < var9; ++var6) {
				CharSequence var7 = var0[var6];
				if (null == var7) {
					var5 += 4;
				} else {
					var5 += var7.length();
				}
			}

			StringBuilder var10 = new StringBuilder(var5);

			for (int var11 = var1; var11 < var9; ++var11) {
				CharSequence var8 = var0[var11];
				if (var8 == null) {
					var10.append("null");
				} else {
					var10.append(var8);
				}
			}

			return var10.toString();
		}
	}

	class213(int var1, int var2, int var3) {
		this.field2524 = new class224[5];
		this.field2517 = new int[5];
		this.field2526 = 0;
		this.field2516 = this.field2533 = var1;
		this.field2514 = var2;
		this.field2515 = var3;
	}
}
