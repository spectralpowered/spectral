public class class455 extends class439 {
	static class282 field4873;
	static class337 field4872;
	int[][] field4875;
	Object[][] field4876;
	public int field4874;

	static {
		field4873 = new class282(64);
	}

	class455() {
		this.field4874 = -1;
	}

	public static void method8164(class337 var0) {
		field4872 = var0;
	}

	void method8139(class467 var1) {
		while (true) {
			int var3 = var1.method8326();
			if (var3 == 0) {
				return;
			}

			this.method8143(var1, var3);
		}
	}

	public Object[] method8144(int var1) {
		return this.field4876 == null ? null : this.field4876[var1];
	}

	void method8143(class467 var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.method8326();
			if (null == this.field4876) {
				this.field4876 = new Object[var4][];
				this.field4875 = new int[var4][];
			}

			for (int var5 = var1.method8326(); var5 != 255; var5 = var1.method8326()) {
				int var6 = var1.method8326();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method8340();
				}

				Object[][] var17 = this.field4876;
				int var11 = var1.method8340();
				Object[] var12 = new Object[var7.length * var11];

				for (int var13 = 0; var13 < var11; ++var13) {
					for (int var14 = 0; var14 < var7.length; ++var14) {
						int var15 = var13 * var7.length + var14;
						class460 var16 = class2.method20(var7[var14]);
						var12[var15] = var16.method8203(var1);
					}
				}

				var17[var5] = var12;
				this.field4875[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field4874 = var1.method8346();
		}

	}

	void method8142() {
	}

	public static void method7921() {
		field4873.method5357();
	}
}
