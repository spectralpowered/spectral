import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "qm"
)
public class class11 extends class195 {
	@ObfInfo(
		owner = "qm",
		name = "h",
		desc = "Lly;"
	)
	static class274 field59;
	@ObfInfo(
		owner = "qm",
		name = "e",
		desc = "Ljv;"
	)
	static class99 field60;
	@ObfInfo(
		owner = "qm",
		name = "x",
		desc = "[[I"
	)
	int[][] field62;
	@ObfInfo(
		owner = "qm",
		name = "v",
		desc = "[[Ljava/lang/Object;"
	)
	Object[][] field63;
	@ObfInfo(
		owner = "qm",
		name = "m",
		desc = "I"
	)
	public int field61;

	static {
		field60 = new class99(64);
	}

	@ObfInfo(
		owner = "qm",
		name = "<init>",
		desc = "()V"
	)
	class11() {
		this.field61 = -1;
	}

	@ObfInfo(
		owner = "qm",
		name = "v",
		desc = "(Lqy;I)V"
	)
	void method63(class127 var1) {
		while (true) {
			int var3 = var1.method547();
			if (var3 == 0) {
				return;
			}

			this.method65(var1, var3);
		}
	}

	@ObfInfo(
		owner = "qm",
		name = "x",
		desc = "(II)[Ljava/lang/Object;"
	)
	public Object[] method66(int var1) {
		return this.field63 == null ? null : this.field63[var1];
	}

	@ObfInfo(
		owner = "qm",
		name = "m",
		desc = "(Lqy;IB)V"
	)
	void method65(class127 var1, int var2) {
		if (var2 == 3) {
			int var4 = var1.method547();
			if (null == this.field63) {
				this.field63 = new Object[var4][];
				this.field62 = new int[var4][];
			}

			for (int var5 = var1.method547(); var5 != 255; var5 = var1.method547()) {
				int var6 = var1.method547();
				int[] var7 = new int[var6];

				for (int var8 = 0; var8 < var6; ++var8) {
					var7[var8] = var1.method559();
				}

				Object[][] var17 = this.field63;
				int var11 = var1.method559();
				Object[] var12 = new Object[var7.length * var11];

				for (int var13 = 0; var13 < var11; ++var13) {
					for (int var14 = 0; var14 < var7.length; ++var14) {
						int var15 = var13 * var7.length + var14;
						class185 var16 = class374.method1849(var7[var14]);
						var12[var15] = var16.method840(var1);
					}
				}

				var17[var5] = var12;
				this.field62[var5] = var7;
			}
		} else if (var2 == 4) {
			this.field61 = var1.method561();
		}

	}

	@ObfInfo(
		owner = "qm",
		name = "q",
		desc = "(I)V"
	)
	void method64() {
	}
}
