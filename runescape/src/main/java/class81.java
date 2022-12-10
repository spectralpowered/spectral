public class class81 extends class428 {
	static class330 field751;
	static class36 field746;
	static class458 field749;
	int[] field747;
	int[] field748;

	static {
		field749 = new class458(32);
	}

	class81() {
		this.field747 = new int[]{-1};
		this.field748 = new int[]{0};
	}

	public static void method1623(String[] var0, int[] var1) {
		class256.method5069(var0, var1, 0, var0.length - 1);
	}

	static void method1198(int var0) {
		class81 var2 = (class81)field749.method8177((long)var0);
		if (null != var2) {
			var2.method7951();
		}
	}

	static void method859() {
		field749 = new class458(32);
	}

	static void method1631(class290[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			class290 var7 = var0[var6];
			if (var7 != null && var7.field3418 == var1) {
				class88.method1944(var7, var2, var3, var4);
				class92.method1968(var7, var2, var3);
				if (var7.field3427 > var7.field3422 - var7.field3414) {
					var7.field3427 = var7.field3422 - var7.field3414;
				}

				if (var7.field3427 < 0) {
					var7.field3427 = 0;
				}

				if (var7.field3421 > var7.field3423 - var7.field3474) {
					var7.field3421 = var7.field3423 - var7.field3474;
				}

				if (var7.field3421 < 0) {
					var7.field3421 = 0;
				}

				if (var7.field3536 == 0) {
					class164.method2766(var0, var7, var4);
				}
			}
		}

	}
}
