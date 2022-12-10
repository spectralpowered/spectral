public class class190 extends class439 {
	public static class282 field2063;
	static class326 field2066;
	int field2065;
	public int field2061;
	public int field2062;
	public int field2064;
	public int field2067;

	static {
		field2063 = new class282(64);
	}

	class190() {
		this.field2065 = 0;
	}

	public static void method2447(class337 var0) {
		class261.field3018 = var0;
	}

	void method3628() {
		this.method3631(this.field2065);
	}

	void method3639(class467 var1, int var2) {
		while (true) {
			int var4 = var1.method8326();
			if (var4 == 0) {
				return;
			}

			this.method3630(var1, var4, var2);
		}
	}

	void method3630(class467 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2065 = var1.method8330();
		}

	}

	void method3631(int var1) {
		double var3 = (double)(var1 >> 16 & 255) / 256.0D;
		double var5 = (double)(var1 >> 8 & 255) / 256.0D;
		double var7 = (double)(var1 & 255) / 256.0D;
		double var9 = var3;
		if (var5 < var3) {
			var9 = var5;
		}

		if (var7 < var9) {
			var9 = var7;
		}

		double var11 = var3;
		if (var5 > var3) {
			var11 = var5;
		}

		if (var7 > var11) {
			var11 = var7;
		}

		double var13 = 0.0D;
		double var15 = 0.0D;
		double var17 = (var11 + var9) / 2.0D;
		if (var9 != var11) {
			if (var17 < 0.5D) {
				var15 = (var11 - var9) / (var9 + var11);
			}

			if (var17 >= 0.5D) {
				var15 = (var11 - var9) / (2.0D - var11 - var9);
			}

			if (var3 == var11) {
				var13 = (var5 - var7) / (var11 - var9);
			} else if (var5 == var11) {
				var13 = 2.0D + (var7 - var3) / (var11 - var9);
			} else if (var7 == var11) {
				var13 = 4.0D + (var3 - var5) / (var11 - var9);
			}
		}

		var13 /= 6.0D;
		this.field2062 = (int)(var15 * 256.0D);
		this.field2064 = (int)(var17 * 256.0D);
		if (this.field2062 < 0) {
			this.field2062 = 0;
		} else if (this.field2062 > 255) {
			this.field2062 = 255;
		}

		if (this.field2064 < 0) {
			this.field2064 = 0;
		} else if (this.field2064 > 255) {
			this.field2064 = 255;
		}

		if (var17 > 0.5D) {
			this.field2067 = (int)(512.0D * var15 * (1.0D - var17));
		} else {
			this.field2067 = (int)(512.0D * var17 * var15);
		}

		if (this.field2067 < 1) {
			this.field2067 = 1;
		}

		this.field2061 = (int)((double)this.field2067 * var13);
	}
}
