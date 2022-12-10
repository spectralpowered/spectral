public class class460 implements class343 {
	public static final class460 field4887;
	public static final class460 field4888;
	public static final class460 field4891;
	final class463 field4886;
	public final int field4889;
	public final int field4893;
	public final Class field4892;

	static {
		field4891 = new class460(0, 0, Integer.class, new class446());
		field4887 = new class460(2, 1, Long.class, new class450());
		field4888 = new class460(1, 2, String.class, new class449());
	}

	public static class460[] method8211() {
		return new class460[]{field4891, field4887, field4888};
	}

	class460(int var1, int var2, Class var3, class463 var4) {
		this.field4889 = var1;
		this.field4893 = var2;
		this.field4892 = var3;
		this.field4886 = var4;
	}

	public static class460 method8201(Class var0) {
		class460[] var2 = method8211();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class460 var4 = var2[var3];
			if (var0 == var4.field4892) {
				return var4;
			}
		}

		return null;
	}

	public static void method8202(Object var0, class467 var1) {
		class463 var3 = method8212(var0.getClass());
		var3.method8242(var0, var1);
	}

	static class463 method8212(Class var0) {
		class460 var2 = method8201(var0);
		if (var2 == null) {
			throw new IllegalArgumentException();
		} else {
			return var2.field4886;
		}
	}

	public int method6487() {
		return this.field4893;
	}

	public Object method8203(class467 var1) {
		return this.field4886.method8243(var1);
	}

	static final boolean method8215(int var0, int var1, class189 var2, class205 var3) {
		int var5 = var0;
		int var6 = var1;
		byte var7 = 64;
		byte var8 = 64;
		int var9 = var0 - var7;
		int var10 = var1 - var8;
		class206.field2356[var7][var8] = 99;
		class206.field2359[var7][var8] = 0;
		byte var11 = 0;
		int var12 = 0;
		class206.field2357[var11] = var0;
		byte var10001 = var11;
		int var19 = var11 + 1;
		class206.field2361[var10001] = var1;
		int[][] var13 = var3.field2352;

		while (var19 != var12) {
			var5 = class206.field2357[var12];
			var6 = class206.field2361[var12];
			var12 = var12 + 1 & 4095;
			int var17 = var5 - var9;
			int var18 = var6 - var10;
			int var14 = var5 - var3.field2348;
			int var15 = var6 - var3.field2349;
			if (var2.method3624(1, var5, var6, var3)) {
				class206.field2355 = var5;
				class206.field2360 = var6;
				return true;
			}

			int var16 = 1 + class206.field2359[var17][var18];
			if (var17 > 0 && 0 == class206.field2356[var17 - 1][var18] && 0 == (var13[var14 - 1][var15] & 19136776)) {
				class206.field2357[var19] = var5 - 1;
				class206.field2361[var19] = var6;
				var19 = var19 + 1 & 4095;
				class206.field2356[var17 - 1][var18] = 2;
				class206.field2359[var17 - 1][var18] = var16;
			}

			if (var17 < 127 && class206.field2356[var17 + 1][var18] == 0 && (var13[var14 + 1][var15] & 19136896) == 0) {
				class206.field2357[var19] = var5 + 1;
				class206.field2361[var19] = var6;
				var19 = var19 + 1 & 4095;
				class206.field2356[var17 + 1][var18] = 8;
				class206.field2359[var17 + 1][var18] = var16;
			}

			if (var18 > 0 && class206.field2356[var17][var18 - 1] == 0 && 0 == (var13[var14][var15 - 1] & 19136770)) {
				class206.field2357[var19] = var5;
				class206.field2361[var19] = var6 - 1;
				var19 = var19 + 1 & 4095;
				class206.field2356[var17][var18 - 1] = 1;
				class206.field2359[var17][var18 - 1] = var16;
			}

			if (var18 < 127 && 0 == class206.field2356[var17][var18 + 1] && (var13[var14][var15 + 1] & 19136800) == 0) {
				class206.field2357[var19] = var5;
				class206.field2361[var19] = var6 + 1;
				var19 = var19 + 1 & 4095;
				class206.field2356[var17][var18 + 1] = 4;
				class206.field2359[var17][var18 + 1] = var16;
			}

			if (var17 > 0 && var18 > 0 && 0 == class206.field2356[var17 - 1][var18 - 1] && 0 == (var13[var14 - 1][var15 - 1] & 19136782) && 0 == (var13[var14 - 1][var15] & 19136776) && (var13[var14][var15 - 1] & 19136770) == 0) {
				class206.field2357[var19] = var5 - 1;
				class206.field2361[var19] = var6 - 1;
				var19 = var19 + 1 & 4095;
				class206.field2356[var17 - 1][var18 - 1] = 3;
				class206.field2359[var17 - 1][var18 - 1] = var16;
			}

			if (var17 < 127 && var18 > 0 && class206.field2356[var17 + 1][var18 - 1] == 0 && 0 == (var13[var14 + 1][var15 - 1] & 19136899) && (var13[var14 + 1][var15] & 19136896) == 0 && (var13[var14][var15 - 1] & 19136770) == 0) {
				class206.field2357[var19] = var5 + 1;
				class206.field2361[var19] = var6 - 1;
				var19 = var19 + 1 & 4095;
				class206.field2356[var17 + 1][var18 - 1] = 9;
				class206.field2359[var17 + 1][var18 - 1] = var16;
			}

			if (var17 > 0 && var18 < 127 && class206.field2356[var17 - 1][var18 + 1] == 0 && 0 == (var13[var14 - 1][var15 + 1] & 19136824) && 0 == (var13[var14 - 1][var15] & 19136776) && (var13[var14][var15 + 1] & 19136800) == 0) {
				class206.field2357[var19] = var5 - 1;
				class206.field2361[var19] = var6 + 1;
				var19 = var19 + 1 & 4095;
				class206.field2356[var17 - 1][var18 + 1] = 6;
				class206.field2359[var17 - 1][var18 + 1] = var16;
			}

			if (var17 < 127 && var18 < 127 && 0 == class206.field2356[var17 + 1][var18 + 1] && 0 == (var13[var14 + 1][var15 + 1] & 19136992) && 0 == (var13[var14 + 1][var15] & 19136896) && (var13[var14][var15 + 1] & 19136800) == 0) {
				class206.field2357[var19] = var5 + 1;
				class206.field2361[var19] = var6 + 1;
				var19 = var19 + 1 & 4095;
				class206.field2356[var17 + 1][var18 + 1] = 12;
				class206.field2359[var17 + 1][var18 + 1] = var16;
			}
		}

		class206.field2355 = var5;
		class206.field2360 = var6;
		return false;
	}
}
