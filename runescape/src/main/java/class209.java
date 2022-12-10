public class class209 extends class439 {
	public static int[] field2424;
	static class326 field2429;
	static class469 field2425;
	static int field2430;
	class223[] field2426;

	public static byte[] method4143(Object var0, boolean var1) {
		if (null == var0) {
			return null;
		} else if (var0 instanceof byte[]) {
			byte[] var4 = (byte[])((byte[])var0);
			return var1 ? class309.method8118(var4) : var4;
		} else if (var0 instanceof class309) {
			class309 var3 = (class309)var0;
			return var3.method6113();
		} else {
			throw new IllegalArgumentException();
		}
	}

	public class209(class337 var1, class337 var2, int var3, boolean var4) {
		class355 var5 = new class355();
		int var6 = var1.method6330(var3);
		this.field2426 = new class223[var6];
		int[] var7 = var1.method6312(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.method6374(var3, var7[var8]);
			class222 var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (class222 var12 = (class222)var5.method6577(); null != var12; var12 = (class222)var5.method6579()) {
				if (var12.field2694 == var11) {
					var10 = var12;
					break;
				}
			}

			if (null == var10) {
				byte[] var13;
				if (var4) {
					var13 = var2.method6309(0, var11);
				} else {
					var13 = var2.method6309(var11, 0);
				}

				var10 = new class222(var11, var13);
				var5.method6572(var10);
			}

			this.field2426[var7[var8]] = new class223(var9, var10);
		}

	}

	public boolean method4142(int var1) {
		return this.field2426[var1].field2711;
	}
}
