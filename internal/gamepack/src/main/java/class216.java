import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ho"
)
public class class216 {
	@ObfInfo(
		owner = "ho",
		name = "e",
		desc = "[I"
	)
	static int[] field1877;
	@ObfInfo(
		owner = "ho",
		name = "v",
		desc = "[I"
	)
	static int[] field1878;
	@ObfInfo(
		owner = "ho",
		name = "x",
		desc = "[I"
	)
	static int[] field1879;
	@ObfInfo(
		owner = "ho",
		name = "h",
		desc = "[I"
	)
	static int[] field1883;
	@ObfInfo(
		owner = "ho",
		name = "j",
		desc = "Z"
	)
	boolean field1886;
	@ObfInfo(
		owner = "ho",
		name = "m",
		desc = "Lhn;"
	)
	class176 field1880;
	@ObfInfo(
		owner = "ho",
		name = "q",
		desc = "I"
	)
	int field1881;
	@ObfInfo(
		owner = "ho",
		name = "r",
		desc = "[I"
	)
	int[] field1876;
	@ObfInfo(
		owner = "ho",
		name = "f",
		desc = "[I"
	)
	int[] field1882;
	@ObfInfo(
		owner = "ho",
		name = "u",
		desc = "[I"
	)
	int[] field1884;
	@ObfInfo(
		owner = "ho",
		name = "b",
		desc = "[I"
	)
	int[] field1885;

	static {
		field1883 = new int[500];
		field1877 = new int[500];
		field1878 = new int[500];
		field1879 = new int[500];
	}

	@ObfInfo(
		owner = "ho",
		name = "<init>",
		desc = "([BLhn;)V"
	)
	class216(byte[] var1, class176 var2) {
		this.field1880 = null;
		this.field1881 = -1;
		this.field1886 = false;
		this.field1880 = var2;
		class127 var3 = new class127(var1);
		class127 var4 = new class127(var1);
		var3.field1070 = 2;
		int var5 = var3.method547();
		int var6 = -1;
		int var7 = 0;
		var4.field1070 = var3.field1070 + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.method547();
			if (var9 > 0) {
				if (this.field1880.field1319[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field1880.field1319[var10] == 0) {
							field1883[var7] = var10;
							field1877[var7] = 0;
							field1878[var7] = 0;
							field1879[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field1883[var7] = var8;
				short var11 = 0;
				if (this.field1880.field1319[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field1877[var7] = var4.method558();
				} else {
					field1877[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field1878[var7] = var4.method558();
				} else {
					field1878[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field1879[var7] = var4.method558();
				} else {
					field1879[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.field1880.field1319[var8] == 5) {
					this.field1886 = true;
				}
			}
		}

		if (var4.field1070 != var1.length) {
			throw new RuntimeException();
		} else {
			this.field1881 = var7;
			this.field1882 = new int[var7];
			this.field1876 = new int[var7];
			this.field1884 = new int[var7];
			this.field1885 = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.field1882[var8] = field1883[var8];
				this.field1876[var8] = field1877[var8];
				this.field1884[var8] = field1878[var8];
				this.field1885[var8] = field1879[var8];
			}

		}
	}
}
