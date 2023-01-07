import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gq"
)
public class class327 extends class195 {
	@ObfInfo(
		owner = "gq",
		name = "h",
		desc = "Lly;"
	)
	static class274 field2580;
	@ObfInfo(
		owner = "gq",
		name = "e",
		desc = "Lly;"
	)
	static class274 field2591;
	@ObfInfo(
		owner = "gq",
		name = "v",
		desc = "Ljv;"
	)
	static class99 field2581;
	@ObfInfo(
		owner = "gq",
		name = "x",
		desc = "Ljv;"
	)
	static class99 field2582;
	@ObfInfo(
		owner = "gq",
		name = "g",
		desc = "I"
	)
	int field2583;
	@ObfInfo(
		owner = "gq",
		name = "q",
		desc = "I"
	)
	int field2584;
	@ObfInfo(
		owner = "gq",
		name = "n",
		desc = "I"
	)
	int field2587;
	@ObfInfo(
		owner = "gq",
		name = "i",
		desc = "I"
	)
	int field2590;
	@ObfInfo(
		owner = "gq",
		name = "m",
		desc = "I"
	)
	int field2592;
	@ObfInfo(
		owner = "gq",
		name = "o",
		desc = "I"
	)
	int field2593;
	@ObfInfo(
		owner = "gq",
		name = "k",
		desc = "I"
	)
	int field2594;
	@ObfInfo(
		owner = "gq",
		name = "u",
		desc = "[S"
	)
	short[] field2579;
	@ObfInfo(
		owner = "gq",
		name = "r",
		desc = "[S"
	)
	short[] field2586;
	@ObfInfo(
		owner = "gq",
		name = "b",
		desc = "[S"
	)
	short[] field2588;
	@ObfInfo(
		owner = "gq",
		name = "j",
		desc = "[S"
	)
	short[] field2589;
	@ObfInfo(
		owner = "gq",
		name = "f",
		desc = "I"
	)
	public int field2585;

	static {
		field2581 = new class99(64);
		field2582 = new class99(30);
	}

	@ObfInfo(
		owner = "gq",
		name = "<init>",
		desc = "()V"
	)
	class327() {
		this.field2585 = -1;
		this.field2583 = 128;
		this.field2590 = 128;
		this.field2593 = 0;
		this.field2587 = 0;
		this.field2594 = 0;
	}

	@ObfInfo(
		owner = "gq",
		name = "v",
		desc = "(Lqy;B)V"
	)
	void method1664(class127 var1) {
		while (true) {
			int var3 = var1.method547();
			if (var3 == 0) {
				return;
			}

			this.method1661(var1, var3);
		}
	}

	@ObfInfo(
		owner = "gq",
		name = "x",
		desc = "(Lqy;IB)V"
	)
	void method1661(class127 var1, int var2) {
		if (var2 == 1) {
			this.field2584 = var1.method549();
		} else if (var2 == 2) {
			this.field2585 = var1.method549();
		} else if (var2 == 4) {
			this.field2583 = var1.method549();
		} else if (var2 == 5) {
			this.field2590 = var1.method549();
		} else if (var2 == 6) {
			this.field2593 = var1.method549();
		} else if (var2 == 7) {
			this.field2587 = var1.method547();
		} else if (var2 == 8) {
			this.field2594 = var1.method547();
		} else {
			int var4;
			int var5;
			if (var2 == 40) {
				var4 = var1.method547();
				this.field2586 = new short[var4];
				this.field2579 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2586[var5] = (short)var1.method549();
					this.field2579[var5] = (short)var1.method549();
				}
			} else if (var2 == 41) {
				var4 = var1.method547();
				this.field2588 = new short[var4];
				this.field2589 = new short[var4];

				for (var5 = 0; var5 < var4; ++var5) {
					this.field2588[var5] = (short)var1.method549();
					this.field2589[var5] = (short)var1.method549();
				}
			}
		}

	}

	@ObfInfo(
		owner = "gq",
		name = "m",
		desc = "(II)Lhh;"
	)
	public final class470 method1663(int var1) {
		class470 var3 = (class470)field2582.method394((long)this.field2592);
		if (var3 == null) {
			class26 var4 = class26.method103(field2591, this.field2584, 0);
			if (null == var4) {
				return null;
			}

			int var5;
			if (null != this.field2586) {
				for (var5 = 0; var5 < this.field2586.length; ++var5) {
					var4.method113(this.field2586[var5], this.field2579[var5]);
				}
			}

			if (null != this.field2588) {
				for (var5 = 0; var5 < this.field2588.length; ++var5) {
					var4.method114(this.field2588[var5], this.field2589[var5]);
				}
			}

			var3 = var4.method121(64 + this.field2587, 850 + this.field2594, -30, -50, -30);
			field2582.method396(var3, (long)this.field2592);
		}

		class470 var6;
		if (this.field2585 != -1 && var1 != -1) {
			var6 = class271.method1277(this.field2585).method1055(var3, var1);
		} else {
			var6 = var3.method2299(true);
		}

		if (this.field2583 != 128 || 128 != this.field2590) {
			var6.method2320(this.field2583, this.field2590, this.field2583);
		}

		if (0 != this.field2593) {
			if (this.field2593 == 90) {
				var6.method2307();
			}

			if (180 == this.field2593) {
				var6.method2307();
				var6.method2307();
			}

			if (this.field2593 == 270) {
				var6.method2307();
				var6.method2307();
				var6.method2307();
			}
		}

		return var6;
	}

	@ObfInfo(
		owner = "gq",
		name = "h",
		desc = "(B)[Ljn;"
	)
	public static class204[] method1662() {
		return new class204[]{class204.field1772, class204.field1761, class204.field1762, class204.field1773, class204.field1764, class204.field1768, class204.field1770, class204.field1766, class204.field1767, class204.field1760, class204.field1769, class204.field1763, class204.field1771, class204.field1765};
	}

	@ObfInfo(
		owner = "gq",
		name = "h",
		desc = "(I)V"
	)
	static void method1665() {
		class50.field571 = new int[2000];
		int var1 = 0;
		int var2 = 240;

		int var4;
		for (byte var3 = 12; var1 < 16; var2 -= var3) {
			var4 = class432.method2135((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.425F * (float)var1 / 16.0F + 0.075F));
			class50.field571[var1] = var4;
			++var1;
		}

		var2 = 48;

		for (int var6 = var2 / 6; var1 < class50.field571.length; var2 -= var6) {
			var4 = var1 * 2;

			for (int var5 = class432.method2135((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class50.field571.length; ++var1) {
				class50.field571[var1] = var5;
			}
		}

	}

	@ObfInfo(
		owner = "gq",
		name = "h",
		desc = "(I)Lop;"
	)
	public static class175 method1667() {
		synchronized(class175.field1311) {
			if (class175.field1314 == 0) {
				return new class175();
			} else {
				class175.field1311[--class175.field1314].method808();
				return class175.field1311[class175.field1314];
			}
		}
	}

	@ObfInfo(
		owner = "gq",
		name = "ii",
		desc = "(IIII)I"
	)
	static final int method1666(int var0, int var1, int var2) {
		int var4 = var0 >> 7;
		int var5 = var1 >> 7;
		if (var4 >= 0 && var5 >= 0 && var4 <= 103 && var5 <= 103) {
			int var6 = var2;
			if (var2 < 3 && 2 == (class71.field644[1][var4][var5] & 2)) {
				var6 = var2 + 1;
			}

			int var7 = var0 & 127;
			int var8 = var1 & 127;
			int var9 = var7 * class71.field636[var6][var4 + 1][var5] + (128 - var7) * class71.field636[var6][var4][var5] >> 7;
			int var10 = class71.field636[var6][var4][var5 + 1] * (128 - var7) + var7 * class71.field636[var6][var4 + 1][var5 + 1] >> 7;
			return var9 * (128 - var8) + var8 * var10 >> 7;
		} else {
			return 0;
		}
	}
}
