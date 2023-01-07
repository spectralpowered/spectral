import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gh"
)
public class class313 extends class195 {
	@ObfInfo(
		owner = "gh",
		name = "e",
		desc = "Ljv;"
	)
	public static class99 field2470;
	@ObfInfo(
		owner = "gh",
		name = "eb",
		desc = "Lln;"
	)
	static class38 field2473;
	@ObfInfo(
		owner = "gh",
		name = "v",
		desc = "I"
	)
	int field2472;
	@ObfInfo(
		owner = "gh",
		name = "x",
		desc = "I"
	)
	public int field2468;
	@ObfInfo(
		owner = "gh",
		name = "m",
		desc = "I"
	)
	public int field2469;
	@ObfInfo(
		owner = "gh",
		name = "q",
		desc = "I"
	)
	public int field2471;
	@ObfInfo(
		owner = "gh",
		name = "f",
		desc = "I"
	)
	public int field2474;

	static {
		field2470 = new class99(64);
	}

	@ObfInfo(
		owner = "gh",
		name = "<init>",
		desc = "()V"
	)
	class313() {
		this.field2472 = 0;
	}

	@ObfInfo(
		owner = "gh",
		name = "v",
		desc = "(I)V"
	)
	void method1508() {
		this.method1510(this.field2472);
	}

	@ObfInfo(
		owner = "gh",
		name = "x",
		desc = "(Lqy;IB)V"
	)
	void method1511(class127 var1, int var2) {
		while (true) {
			int var4 = var1.method547();
			if (var4 == 0) {
				return;
			}

			this.method1509(var1, var4, var2);
		}
	}

	@ObfInfo(
		owner = "gh",
		name = "m",
		desc = "(Lqy;III)V"
	)
	void method1509(class127 var1, int var2, int var3) {
		if (var2 == 1) {
			this.field2472 = var1.method551();
		}

	}

	@ObfInfo(
		owner = "gh",
		name = "q",
		desc = "(II)V"
	)
	void method1510(int var1) {
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
		this.field2469 = (int)(var15 * 256.0D);
		this.field2471 = (int)(var17 * 256.0D);
		if (this.field2469 < 0) {
			this.field2469 = 0;
		} else if (this.field2469 > 255) {
			this.field2469 = 255;
		}

		if (this.field2471 < 0) {
			this.field2471 = 0;
		} else if (this.field2471 > 255) {
			this.field2471 = 255;
		}

		if (var17 > 0.5D) {
			this.field2474 = (int)(512.0D * var15 * (1.0D - var17));
		} else {
			this.field2474 = (int)(512.0D * var17 * var15);
		}

		if (this.field2474 < 1) {
			this.field2474 = 1;
		}

		this.field2468 = (int)((double)this.field2474 * var13);
	}

	@ObfInfo(
		owner = "gh",
		name = "jb",
		desc = "(I)Z"
	)
	static final boolean method1512() {
		return client.field368;
	}
}
