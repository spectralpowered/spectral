public final class class230 {
	int field2763;
	int field2764;
	int field2765;
	int field2766;
	int field2767;
	int field2768;
	int field2769;
	int field2770;
	int field2771;
	int field2772;
	int field2773;
	int field2774;
	int field2775;
	int field2776;
	int field2777;
	int field2778;
	int field2779;
	int field2780;

	class230() {
	}

	public static void method4665() {
		try {
			if (1 == class300.field3632) {
				int var1 = class253.field2963.method5447();
				if (var1 > 0 && class253.field2963.method5386()) {
					var1 -= class300.field3634;
					if (var1 < 0) {
						var1 = 0;
					}

					class253.field2963.method5442(var1);
					return;
				}

				class253.field2963.method5385();
				class253.field2963.method5383();
				if (null != class312.field3717) {
					class300.field3632 = 2;
				} else {
					class300.field3632 = 0;
				}

				class300.field3637 = null;
				class81.field746 = null;
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			class253.field2963.method5385();
			class300.field3632 = 0;
			class300.field3637 = null;
			class81.field746 = null;
			class312.field3717 = null;
		}

	}
}
