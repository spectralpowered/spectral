public class class223 {
	static int[] field2702;
	static int[] field2703;
	static int[] field2704;
	static int[] field2708;
	boolean field2711;
	class222 field2705;
	int field2706;
	int[] field2701;
	int[] field2707;
	int[] field2709;
	int[] field2710;

	static {
		field2708 = new int[500];
		field2702 = new int[500];
		field2703 = new int[500];
		field2704 = new int[500];
	}

	class223(byte[] var1, class222 var2) {
		this.field2705 = null;
		this.field2706 = -1;
		this.field2711 = false;
		this.field2705 = var2;
		class467 var3 = new class467(var1);
		class467 var4 = new class467(var1);
		var3.field4915 = 2;
		int var5 = var3.method8326();
		int var6 = -1;
		int var7 = 0;
		var4.field4915 = var3.field4915 + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.method8326();
			if (var9 > 0) {
				if (this.field2705.field2696[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field2705.field2696[var10] == 0) {
							field2708[var7] = var10;
							field2702[var7] = 0;
							field2703[var7] = 0;
							field2704[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2708[var7] = var8;
				short var11 = 0;
				if (this.field2705.field2696[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2702[var7] = var4.method8339();
				} else {
					field2702[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2703[var7] = var4.method8339();
				} else {
					field2703[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2704[var7] = var4.method8339();
				} else {
					field2704[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.field2705.field2696[var8] == 5) {
					this.field2711 = true;
				}
			}
		}

		if (var4.field4915 != var1.length) {
			throw new RuntimeException();
		} else {
			this.field2706 = var7;
			this.field2707 = new int[var7];
			this.field2701 = new int[var7];
			this.field2709 = new int[var7];
			this.field2710 = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.field2707[var8] = field2708[var8];
				this.field2701[var8] = field2702[var8];
				this.field2709[var8] = field2703[var8];
				this.field2710[var8] = field2704[var8];
			}

		}
	}
}
