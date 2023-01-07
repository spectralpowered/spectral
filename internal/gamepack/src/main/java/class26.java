import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gi"
)
public class class26 extends class295 {
	@ObfInfo(
		owner = "gi",
		name = "ai",
		desc = "I"
	)
	static int field156;
	@ObfInfo(
		owner = "gi",
		name = "ah",
		desc = "[I"
	)
	static int[] field130;
	@ObfInfo(
		owner = "gi",
		name = "ak",
		desc = "[I"
	)
	static int[] field139;
	@ObfInfo(
		owner = "gi",
		name = "af",
		desc = "[I"
	)
	static int[] field155;
	@ObfInfo(
		owner = "gi",
		name = "ax",
		desc = "[I"
	)
	static int[] field157;
	@ObfInfo(
		owner = "gi",
		name = "ay",
		desc = "Z"
	)
	boolean field148;
	@ObfInfo(
		owner = "gi",
		name = "s",
		desc = "B"
	)
	byte field132;
	@ObfInfo(
		owner = "gi",
		name = "g",
		desc = "[B"
	)
	byte[] field126;
	@ObfInfo(
		owner = "gi",
		name = "o",
		desc = "[B"
	)
	byte[] field128;
	@ObfInfo(
		owner = "gi",
		name = "n",
		desc = "[B"
	)
	byte[] field129;
	@ObfInfo(
		owner = "gi",
		name = "t",
		desc = "[B"
	)
	byte[] field147;
	@ObfInfo(
		owner = "gi",
		name = "i",
		desc = "[B"
	)
	byte[] field152;
	@ObfInfo(
		owner = "gi",
		name = "am",
		desc = "[Lhz;"
	)
	class149[] field143;
	@ObfInfo(
		owner = "gi",
		name = "av",
		desc = "[Lhl;"
	)
	class270[] field144;
	@ObfInfo(
		owner = "gi",
		name = "au",
		desc = "[Lhl;"
	)
	class270[] field145;
	@ObfInfo(
		owner = "gi",
		name = "l",
		desc = "I"
	)
	int field118;
	@ObfInfo(
		owner = "gi",
		name = "r",
		desc = "I"
	)
	int field122;
	@ObfInfo(
		owner = "gi",
		name = "x",
		desc = "I"
	)
	int field134;
	@ObfInfo(
		owner = "gi",
		name = "an",
		desc = "I"
	)
	int field142;
	@ObfInfo(
		owner = "gi",
		name = "ag",
		desc = "I"
	)
	int field150;
	@ObfInfo(
		owner = "gi",
		name = "al",
		desc = "I"
	)
	int field151;
	@ObfInfo(
		owner = "gi",
		name = "az",
		desc = "I"
	)
	int field153;
	@ObfInfo(
		owner = "gi",
		name = "ab",
		desc = "I"
	)
	int field158;
	@ObfInfo(
		owner = "gi",
		name = "u",
		desc = "[I"
	)
	int[] field117;
	@ObfInfo(
		owner = "gi",
		name = "q",
		desc = "[I"
	)
	int[] field120;
	@ObfInfo(
		owner = "gi",
		name = "y",
		desc = "[I"
	)
	int[] field121;
	@ObfInfo(
		owner = "gi",
		name = "m",
		desc = "[I"
	)
	int[] field123;
	@ObfInfo(
		owner = "gi",
		name = "b",
		desc = "[I"
	)
	int[] field124;
	@ObfInfo(
		owner = "gi",
		name = "j",
		desc = "[I"
	)
	int[] field125;
	@ObfInfo(
		owner = "gi",
		name = "z",
		desc = "[I"
	)
	int[] field138;
	@ObfInfo(
		owner = "gi",
		name = "f",
		desc = "[I"
	)
	int[] field149;
	@ObfInfo(
		owner = "gi",
		name = "w",
		desc = "[[I"
	)
	int[][] field127;
	@ObfInfo(
		owner = "gi",
		name = "ao",
		desc = "[[I"
	)
	int[][] field133;
	@ObfInfo(
		owner = "gi",
		name = "as",
		desc = "[[I"
	)
	int[][] field140;
	@ObfInfo(
		owner = "gi",
		name = "ad",
		desc = "[[I"
	)
	int[][] field141;
	@ObfInfo(
		owner = "gi",
		name = "k",
		desc = "[S"
	)
	short[] field119;
	@ObfInfo(
		owner = "gi",
		name = "a",
		desc = "[S"
	)
	short[] field131;
	@ObfInfo(
		owner = "gi",
		name = "c",
		desc = "[S"
	)
	short[] field135;
	@ObfInfo(
		owner = "gi",
		name = "p",
		desc = "[S"
	)
	short[] field136;
	@ObfInfo(
		owner = "gi",
		name = "d",
		desc = "[S"
	)
	short[] field137;
	@ObfInfo(
		owner = "gi",
		name = "ar",
		desc = "S"
	)
	public short field146;
	@ObfInfo(
		owner = "gi",
		name = "at",
		desc = "S"
	)
	public short field154;

	static {
		field139 = new int[10000];
		field155 = new int[10000];
		field156 = 0;
		field157 = class341.field2726;
		field130 = class341.field2744;
	}

	@ObfInfo(
		owner = "gi",
		name = "<init>",
		desc = "()V"
	)
	class26() {
		this.field134 = 0;
		this.field122 = 0;
		this.field132 = 0;
		this.field148 = false;
	}

	@ObfInfo(
		owner = "gi",
		name = "<init>",
		desc = "([B)V"
	)
	class26(byte[] var1) {
		this.field134 = 0;
		this.field122 = 0;
		this.field132 = 0;
		this.field148 = false;
		class127 var2 = new class127(10);
		var2.method533(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method104(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method125(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method127(var1);
		} else {
			this.method126(var1);
		}

	}

	@ObfInfo(
		owner = "gi",
		name = "<init>",
		desc = "([Lgi;I)V"
	)
	public class26(class26[] var1, int var2) {
		this.field134 = 0;
		this.field122 = 0;
		this.field132 = 0;
		this.field148 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field134 = 0;
		this.field122 = 0;
		this.field118 = 0;
		this.field132 = -1;

		int var10;
		class26 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field134 += var11.field134;
				this.field122 += var11.field122;
				this.field118 += var11.field118;
				if (var11.field152 != null) {
					var4 = true;
				} else {
					if (this.field132 == -1) {
						this.field132 = var11.field132;
					}

					if (this.field132 != var11.field132) {
						var4 = true;
					}
				}

				var3 |= var11.field126 != null;
				var5 |= var11.field128 != null;
				var6 |= var11.field138 != null;
				var7 |= var11.field131 != null;
				var8 |= var11.field129 != null;
				var9 |= var11.field141 != null;
			}
		}

		this.field123 = new int[this.field134];
		this.field120 = new int[this.field134];
		this.field149 = new int[this.field134];
		this.field121 = new int[this.field134];
		this.field117 = new int[this.field122];
		this.field124 = new int[this.field122];
		this.field125 = new int[this.field122];
		if (var3) {
			this.field126 = new byte[this.field122];
		}

		if (var4) {
			this.field152 = new byte[this.field122];
		}

		if (var5) {
			this.field128 = new byte[this.field122];
		}

		if (var6) {
			this.field138 = new int[this.field122];
		}

		if (var7) {
			this.field131 = new short[this.field122];
		}

		if (var8) {
			this.field129 = new byte[this.field122];
		}

		if (var9) {
			this.field141 = new int[this.field134][];
			this.field133 = new int[this.field134][];
		}

		this.field119 = new short[this.field122];
		if (this.field118 > 0) {
			this.field147 = new byte[this.field118];
			this.field135 = new short[this.field118];
			this.field136 = new short[this.field118];
			this.field137 = new short[this.field118];
		}

		this.field134 = 0;
		this.field122 = 0;
		this.field118 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field122; ++var12) {
					if (var3 && var11.field126 != null) {
						this.field126[this.field122] = var11.field126[var12];
					}

					if (var4) {
						if (var11.field152 != null) {
							this.field152[this.field122] = var11.field152[var12];
						} else {
							this.field152[this.field122] = var11.field132;
						}
					}

					if (var5 && var11.field128 != null) {
						this.field128[this.field122] = var11.field128[var12];
					}

					if (var6 && var11.field138 != null) {
						this.field138[this.field122] = var11.field138[var12];
					}

					if (var7) {
						if (var11.field131 != null) {
							this.field131[this.field122] = var11.field131[var12];
						} else {
							this.field131[this.field122] = -1;
						}
					}

					if (var8) {
						if (var11.field129 != null && var11.field129[var12] != -1) {
							this.field129[this.field122] = (byte)(var11.field129[var12] + this.field118);
						} else {
							this.field129[this.field122] = -1;
						}
					}

					this.field119[this.field122] = var11.field119[var12];
					this.field117[this.field122] = this.method106(var11, var11.field117[var12]);
					this.field124[this.field122] = this.method106(var11, var11.field124[var12]);
					this.field125[this.field122] = this.method106(var11, var11.field125[var12]);
					++this.field122;
				}

				for (var12 = 0; var12 < var11.field118; ++var12) {
					byte var13 = this.field147[this.field118] = var11.field147[var12];
					if (var13 == 0) {
						this.field135[this.field118] = (short)this.method106(var11, var11.field135[var12]);
						this.field136[this.field118] = (short)this.method106(var11, var11.field136[var12]);
						this.field137[this.field118] = (short)this.method106(var11, var11.field137[var12]);
					}

					++this.field118;
				}
			}
		}

	}

	@ObfInfo(
		owner = "gi",
		name = "<init>",
		desc = "(Lgi;ZZZZ)V"
	)
	public class26(class26 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field134 = 0;
		this.field122 = 0;
		this.field132 = 0;
		this.field148 = false;
		this.field134 = var1.field134;
		this.field122 = var1.field122;
		this.field118 = var1.field118;
		int var6;
		if (var2) {
			this.field123 = var1.field123;
			this.field120 = var1.field120;
			this.field149 = var1.field149;
		} else {
			this.field123 = new int[this.field134];
			this.field120 = new int[this.field134];
			this.field149 = new int[this.field134];

			for (var6 = 0; var6 < this.field134; ++var6) {
				this.field123[var6] = var1.field123[var6];
				this.field120[var6] = var1.field120[var6];
				this.field149[var6] = var1.field149[var6];
			}
		}

		if (var3) {
			this.field119 = var1.field119;
		} else {
			this.field119 = new short[this.field122];

			for (var6 = 0; var6 < this.field122; ++var6) {
				this.field119[var6] = var1.field119[var6];
			}
		}

		if (!var4 && var1.field131 != null) {
			this.field131 = new short[this.field122];

			for (var6 = 0; var6 < this.field122; ++var6) {
				this.field131[var6] = var1.field131[var6];
			}
		} else {
			this.field131 = var1.field131;
		}

		if (var5) {
			this.field128 = var1.field128;
		} else {
			this.field128 = new byte[this.field122];
			if (var1.field128 == null) {
				for (var6 = 0; var6 < this.field122; ++var6) {
					this.field128[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.field122; ++var6) {
					this.field128[var6] = var1.field128[var6];
				}
			}
		}

		this.field117 = var1.field117;
		this.field124 = var1.field124;
		this.field125 = var1.field125;
		this.field126 = var1.field126;
		this.field152 = var1.field152;
		this.field129 = var1.field129;
		this.field132 = var1.field132;
		this.field147 = var1.field147;
		this.field135 = var1.field135;
		this.field136 = var1.field136;
		this.field137 = var1.field137;
		this.field121 = var1.field121;
		this.field138 = var1.field138;
		this.field127 = var1.field127;
		this.field140 = var1.field140;
		this.field144 = var1.field144;
		this.field143 = var1.field143;
		this.field145 = var1.field145;
		this.field141 = var1.field141;
		this.field133 = var1.field133;
		this.field146 = var1.field146;
		this.field154 = var1.field154;
	}

	@ObfInfo(
		owner = "gi",
		name = "m",
		desc = "([B)V"
	)
	void method104(byte[] var1) {
		class127 var2 = new class127(var1);
		class127 var3 = new class127(var1);
		class127 var4 = new class127(var1);
		class127 var5 = new class127(var1);
		class127 var6 = new class127(var1);
		class127 var7 = new class127(var1);
		class127 var8 = new class127(var1);
		var2.field1070 = var1.length - 26;
		int var9 = var2.method549();
		int var10 = var2.method549();
		int var11 = var2.method547();
		int var12 = var2.method547();
		int var13 = var2.method547();
		int var14 = var2.method547();
		int var15 = var2.method547();
		int var16 = var2.method547();
		int var17 = var2.method547();
		int var18 = var2.method547();
		int var19 = var2.method549();
		int var20 = var2.method549();
		int var21 = var2.method549();
		int var22 = var2.method549();
		int var23 = var2.method549();
		int var24 = var2.method549();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field147 = new byte[var11];
			var2.field1070 = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field147[var28] = var2.method548();
				if (var29 == 0) {
					++var25;
				}

				if (var29 >= 1 && var29 <= 3) {
					++var26;
				}

				if (var29 == 2) {
					++var27;
				}
			}
		}

		var28 = var11 + var9;
		int var30 = var28;
		if (var12 == 1) {
			var28 += var10;
		}

		int var31 = var28;
		var28 += var10;
		int var32 = var28;
		if (var13 == 255) {
			var28 += var10;
		}

		int var33 = var28;
		if (var15 == 1) {
			var28 += var10;
		}

		int var34 = var28;
		var28 += var24;
		int var35 = var28;
		if (var14 == 1) {
			var28 += var10;
		}

		int var36 = var28;
		var28 += var22;
		int var37 = var28;
		if (var16 == 1) {
			var28 += var10 * 2;
		}

		int var38 = var28;
		var28 += var23;
		int var39 = var28;
		var28 += var10 * 2;
		int var40 = var28;
		var28 += var19;
		int var41 = var28;
		var28 += var20;
		int var42 = var28;
		var28 += var21;
		int var43 = var28;
		var28 += var25 * 6;
		int var44 = var28;
		var28 += var26 * 6;
		int var45 = var28;
		var28 += var26 * 6;
		int var46 = var28;
		var28 += var26 * 2;
		int var47 = var28;
		var28 += var26;
		int var48 = var28;
		var28 += var26 * 2 + var27 * 2;
		this.field134 = var9;
		this.field122 = var10;
		this.field118 = var11;
		this.field123 = new int[var9];
		this.field120 = new int[var9];
		this.field149 = new int[var9];
		this.field117 = new int[var10];
		this.field124 = new int[var10];
		this.field125 = new int[var10];
		if (var17 == 1) {
			this.field121 = new int[var9];
		}

		if (var12 == 1) {
			this.field126 = new byte[var10];
		}

		if (var13 == 255) {
			this.field152 = new byte[var10];
		} else {
			this.field132 = (byte)var13;
		}

		if (var14 == 1) {
			this.field128 = new byte[var10];
		}

		if (var15 == 1) {
			this.field138 = new int[var10];
		}

		if (var16 == 1) {
			this.field131 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field129 = new byte[var10];
		}

		if (var18 == 1) {
			this.field141 = new int[var9][];
			this.field133 = new int[var9][];
		}

		this.field119 = new short[var10];
		if (var11 > 0) {
			this.field135 = new short[var11];
			this.field136 = new short[var11];
			this.field137 = new short[var11];
		}

		var2.field1070 = var11;
		var3.field1070 = var40;
		var4.field1070 = var41;
		var5.field1070 = var42;
		var6.field1070 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.method547();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method558();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method558();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method558();
			}

			this.field123[var53] = var50 + var55;
			this.field120[var53] = var51 + var56;
			this.field149[var53] = var52 + var57;
			var50 = this.field123[var53];
			var51 = this.field120[var53];
			var52 = this.field149[var53];
			if (var17 == 1) {
				this.field121[var53] = var6.method547();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.method547();
				this.field141[var53] = new int[var54];
				this.field133[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field141[var53][var55] = var6.method547();
					this.field133[var53][var55] = var6.method547();
				}
			}
		}

		var2.field1070 = var39;
		var3.field1070 = var30;
		var4.field1070 = var32;
		var5.field1070 = var35;
		var6.field1070 = var33;
		var7.field1070 = var37;
		var8.field1070 = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.field119[var53] = (short)var2.method549();
			if (var12 == 1) {
				this.field126[var53] = var3.method548();
			}

			if (var13 == 255) {
				this.field152[var53] = var4.method548();
			}

			if (var14 == 1) {
				this.field128[var53] = var5.method548();
			}

			if (var15 == 1) {
				this.field138[var53] = var6.method547();
			}

			if (var16 == 1) {
				this.field131[var53] = (short)(var7.method549() - 1);
			}

			if (this.field129 != null && this.field131[var53] != -1) {
				this.field129[var53] = (byte)(var8.method547() - 1);
			}
		}

		var2.field1070 = var36;
		var3.field1070 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.method547();
			if (var58 == 1) {
				var53 = var2.method558() + var56;
				var54 = var2.method558() + var53;
				var55 = var2.method558() + var54;
				var56 = var55;
				this.field117[var57] = var53;
				this.field124[var57] = var54;
				this.field125[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method558() + var56;
				var56 = var55;
				this.field117[var57] = var53;
				this.field124[var57] = var54;
				this.field125[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method558() + var56;
				var56 = var55;
				this.field117[var57] = var53;
				this.field124[var57] = var54;
				this.field125[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method558() + var56;
				var56 = var55;
				this.field117[var57] = var53;
				this.field124[var57] = var59;
				this.field125[var57] = var55;
			}
		}

		var2.field1070 = var43;
		var3.field1070 = var44;
		var4.field1070 = var45;
		var5.field1070 = var46;
		var6.field1070 = var47;
		var7.field1070 = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field147[var57] & 255;
			if (var58 == 0) {
				this.field135[var57] = (short)var2.method549();
				this.field136[var57] = (short)var2.method549();
				this.field137[var57] = (short)var2.method549();
			}
		}

		var2.field1070 = var28;
		var57 = var2.method547();
		if (var57 != 0) {
			new class119();
			var2.method549();
			var2.method549();
			var2.method549();
			var2.method595();
		}

	}

	@ObfInfo(
		owner = "gi",
		name = "q",
		desc = "([B)V"
	)
	void method125(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class127 var4 = new class127(var1);
		class127 var5 = new class127(var1);
		class127 var6 = new class127(var1);
		class127 var7 = new class127(var1);
		class127 var8 = new class127(var1);
		var4.field1070 = var1.length - 23;
		int var9 = var4.method549();
		int var10 = var4.method549();
		int var11 = var4.method547();
		int var12 = var4.method547();
		int var13 = var4.method547();
		int var14 = var4.method547();
		int var15 = var4.method547();
		int var16 = var4.method547();
		int var17 = var4.method547();
		int var18 = var4.method549();
		int var19 = var4.method549();
		int var20 = var4.method549();
		int var21 = var4.method549();
		int var22 = var4.method549();
		byte var23 = 0;
		int var47 = var23 + var9;
		int var25 = var47;
		var47 += var10;
		int var26 = var47;
		if (var13 == 255) {
			var47 += var10;
		}

		int var27 = var47;
		if (var15 == 1) {
			var47 += var10;
		}

		int var28 = var47;
		if (var12 == 1) {
			var47 += var10;
		}

		int var29 = var47;
		var47 += var22;
		int var30 = var47;
		if (var14 == 1) {
			var47 += var10;
		}

		int var31 = var47;
		var47 += var21;
		int var32 = var47;
		var47 += var10 * 2;
		int var33 = var47;
		var47 += var11 * 6;
		int var34 = var47;
		var47 += var18;
		int var35 = var47;
		var47 += var19;
		int var10000 = var47 + var20;
		this.field134 = var9;
		this.field122 = var10;
		this.field118 = var11;
		this.field123 = new int[var9];
		this.field120 = new int[var9];
		this.field149 = new int[var9];
		this.field117 = new int[var10];
		this.field124 = new int[var10];
		this.field125 = new int[var10];
		if (var11 > 0) {
			this.field147 = new byte[var11];
			this.field135 = new short[var11];
			this.field136 = new short[var11];
			this.field137 = new short[var11];
		}

		if (var16 == 1) {
			this.field121 = new int[var9];
		}

		if (var12 == 1) {
			this.field126 = new byte[var10];
			this.field129 = new byte[var10];
			this.field131 = new short[var10];
		}

		if (var13 == 255) {
			this.field152 = new byte[var10];
		} else {
			this.field132 = (byte)var13;
		}

		if (var14 == 1) {
			this.field128 = new byte[var10];
		}

		if (var15 == 1) {
			this.field138 = new int[var10];
		}

		if (var17 == 1) {
			this.field141 = new int[var9][];
			this.field133 = new int[var9][];
		}

		this.field119 = new short[var10];
		var4.field1070 = var23;
		var5.field1070 = var34;
		var6.field1070 = var35;
		var7.field1070 = var47;
		var8.field1070 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.method547();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method558();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method558();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method558();
			}

			this.field123[var40] = var37 + var42;
			this.field120[var40] = var38 + var43;
			this.field149[var40] = var39 + var44;
			var37 = this.field123[var40];
			var38 = this.field120[var40];
			var39 = this.field149[var40];
			if (var16 == 1) {
				this.field121[var40] = var8.method547();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.method547();
				this.field141[var40] = new int[var41];
				this.field133[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field141[var40][var42] = var8.method547();
					this.field133[var40][var42] = var8.method547();
				}
			}
		}

		var4.field1070 = var32;
		var5.field1070 = var28;
		var6.field1070 = var26;
		var7.field1070 = var30;
		var8.field1070 = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.field119[var40] = (short)var4.method549();
			if (var12 == 1) {
				var41 = var5.method547();
				if ((var41 & 1) == 1) {
					this.field126[var40] = 1;
					var2 = true;
				} else {
					this.field126[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.field129[var40] = (byte)(var41 >> 2);
					this.field131[var40] = this.field119[var40];
					this.field119[var40] = 127;
					if (this.field131[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field129[var40] = -1;
					this.field131[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.field152[var40] = var6.method548();
			}

			if (var14 == 1) {
				this.field128[var40] = var7.method548();
			}

			if (var15 == 1) {
				this.field138[var40] = var8.method547();
			}
		}

		var4.field1070 = var31;
		var5.field1070 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.method547();
			if (var45 == 1) {
				var40 = var4.method558() + var43;
				var41 = var4.method558() + var40;
				var42 = var4.method558() + var41;
				var43 = var42;
				this.field117[var44] = var40;
				this.field124[var44] = var41;
				this.field125[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method558() + var43;
				var43 = var42;
				this.field117[var44] = var40;
				this.field124[var44] = var41;
				this.field125[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method558() + var43;
				var43 = var42;
				this.field117[var44] = var40;
				this.field124[var44] = var41;
				this.field125[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method558() + var43;
				var43 = var42;
				this.field117[var44] = var40;
				this.field124[var44] = var46;
				this.field125[var44] = var42;
			}
		}

		var4.field1070 = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.field147[var44] = 0;
			this.field135[var44] = (short)var4.method549();
			this.field136[var44] = (short)var4.method549();
			this.field137[var44] = (short)var4.method549();
		}

		if (this.field129 != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field129[var45] & 255;
				if (var46 != 255) {
					if ((this.field135[var46] & '\uffff') == this.field117[var45] && (this.field136[var46] & '\uffff') == this.field124[var45] && (this.field137[var46] & '\uffff') == this.field125[var45]) {
						this.field129[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.field129 = null;
			}
		}

		if (!var3) {
			this.field131 = null;
		}

		if (!var2) {
			this.field126 = null;
		}

	}

	@ObfInfo(
		owner = "gi",
		name = "f",
		desc = "([B)V"
	)
	void method127(byte[] var1) {
		class127 var2 = new class127(var1);
		class127 var3 = new class127(var1);
		class127 var4 = new class127(var1);
		class127 var5 = new class127(var1);
		class127 var6 = new class127(var1);
		class127 var7 = new class127(var1);
		class127 var8 = new class127(var1);
		var2.field1070 = var1.length - 23;
		int var9 = var2.method549();
		int var10 = var2.method549();
		int var11 = var2.method547();
		int var12 = var2.method547();
		int var13 = var2.method547();
		int var14 = var2.method547();
		int var15 = var2.method547();
		int var16 = var2.method547();
		int var17 = var2.method547();
		int var18 = var2.method549();
		int var19 = var2.method549();
		int var20 = var2.method549();
		int var21 = var2.method549();
		int var22 = var2.method549();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field147 = new byte[var11];
			var2.field1070 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field147[var26] = var2.method548();
				if (var27 == 0) {
					++var23;
				}

				if (var27 >= 1 && var27 <= 3) {
					++var24;
				}

				if (var27 == 2) {
					++var25;
				}
			}
		}

		var26 = var11 + var9;
		int var28 = var26;
		if (var12 == 1) {
			var26 += var10;
		}

		int var29 = var26;
		var26 += var10;
		int var30 = var26;
		if (var13 == 255) {
			var26 += var10;
		}

		int var31 = var26;
		if (var15 == 1) {
			var26 += var10;
		}

		int var32 = var26;
		if (var17 == 1) {
			var26 += var9;
		}

		int var33 = var26;
		if (var14 == 1) {
			var26 += var10;
		}

		int var34 = var26;
		var26 += var21;
		int var35 = var26;
		if (var16 == 1) {
			var26 += var10 * 2;
		}

		int var36 = var26;
		var26 += var22;
		int var37 = var26;
		var26 += var10 * 2;
		int var38 = var26;
		var26 += var18;
		int var39 = var26;
		var26 += var19;
		int var40 = var26;
		var26 += var20;
		int var41 = var26;
		var26 += var23 * 6;
		int var42 = var26;
		var26 += var24 * 6;
		int var43 = var26;
		var26 += var24 * 6;
		int var44 = var26;
		var26 += var24 * 2;
		int var45 = var26;
		var26 += var24;
		int var46 = var26;
		var26 += var24 * 2 + var25 * 2;
		this.field134 = var9;
		this.field122 = var10;
		this.field118 = var11;
		this.field123 = new int[var9];
		this.field120 = new int[var9];
		this.field149 = new int[var9];
		this.field117 = new int[var10];
		this.field124 = new int[var10];
		this.field125 = new int[var10];
		if (var17 == 1) {
			this.field121 = new int[var9];
		}

		if (var12 == 1) {
			this.field126 = new byte[var10];
		}

		if (var13 == 255) {
			this.field152 = new byte[var10];
		} else {
			this.field132 = (byte)var13;
		}

		if (var14 == 1) {
			this.field128 = new byte[var10];
		}

		if (var15 == 1) {
			this.field138 = new int[var10];
		}

		if (var16 == 1) {
			this.field131 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field129 = new byte[var10];
		}

		this.field119 = new short[var10];
		if (var11 > 0) {
			this.field135 = new short[var11];
			this.field136 = new short[var11];
			this.field137 = new short[var11];
		}

		var2.field1070 = var11;
		var3.field1070 = var38;
		var4.field1070 = var39;
		var5.field1070 = var40;
		var6.field1070 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method547();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method558();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method558();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method558();
			}

			this.field123[var51] = var48 + var53;
			this.field120[var51] = var49 + var54;
			this.field149[var51] = var50 + var55;
			var48 = this.field123[var51];
			var49 = this.field120[var51];
			var50 = this.field149[var51];
			if (var17 == 1) {
				this.field121[var51] = var6.method547();
			}
		}

		var2.field1070 = var37;
		var3.field1070 = var28;
		var4.field1070 = var30;
		var5.field1070 = var33;
		var6.field1070 = var31;
		var7.field1070 = var35;
		var8.field1070 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.field119[var51] = (short)var2.method549();
			if (var12 == 1) {
				this.field126[var51] = var3.method548();
			}

			if (var13 == 255) {
				this.field152[var51] = var4.method548();
			}

			if (var14 == 1) {
				this.field128[var51] = var5.method548();
			}

			if (var15 == 1) {
				this.field138[var51] = var6.method547();
			}

			if (var16 == 1) {
				this.field131[var51] = (short)(var7.method549() - 1);
			}

			if (this.field129 != null && this.field131[var51] != -1) {
				this.field129[var51] = (byte)(var8.method547() - 1);
			}
		}

		var2.field1070 = var34;
		var3.field1070 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method547();
			if (var56 == 1) {
				var51 = var2.method558() + var54;
				var52 = var2.method558() + var51;
				var53 = var2.method558() + var52;
				var54 = var53;
				this.field117[var55] = var51;
				this.field124[var55] = var52;
				this.field125[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method558() + var54;
				var54 = var53;
				this.field117[var55] = var51;
				this.field124[var55] = var52;
				this.field125[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method558() + var54;
				var54 = var53;
				this.field117[var55] = var51;
				this.field124[var55] = var52;
				this.field125[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method558() + var54;
				var54 = var53;
				this.field117[var55] = var51;
				this.field124[var55] = var57;
				this.field125[var55] = var53;
			}
		}

		var2.field1070 = var41;
		var3.field1070 = var42;
		var4.field1070 = var43;
		var5.field1070 = var44;
		var6.field1070 = var45;
		var7.field1070 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field147[var55] & 255;
			if (var56 == 0) {
				this.field135[var55] = (short)var2.method549();
				this.field136[var55] = (short)var2.method549();
				this.field137[var55] = (short)var2.method549();
			}
		}

		var2.field1070 = var26;
		var55 = var2.method547();
		if (var55 != 0) {
			new class119();
			var2.method549();
			var2.method549();
			var2.method549();
			var2.method595();
		}

	}

	@ObfInfo(
		owner = "gi",
		name = "r",
		desc = "([B)V"
	)
	void method126(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class127 var4 = new class127(var1);
		class127 var5 = new class127(var1);
		class127 var6 = new class127(var1);
		class127 var7 = new class127(var1);
		class127 var8 = new class127(var1);
		var4.field1070 = var1.length - 18;
		int var9 = var4.method549();
		int var10 = var4.method549();
		int var11 = var4.method547();
		int var12 = var4.method547();
		int var13 = var4.method547();
		int var14 = var4.method547();
		int var15 = var4.method547();
		int var16 = var4.method547();
		int var17 = var4.method549();
		int var18 = var4.method549();
		int var19 = var4.method549();
		int var20 = var4.method549();
		byte var21 = 0;
		int var45 = var21 + var9;
		int var23 = var45;
		var45 += var10;
		int var24 = var45;
		if (var13 == 255) {
			var45 += var10;
		}

		int var25 = var45;
		if (var15 == 1) {
			var45 += var10;
		}

		int var26 = var45;
		if (var12 == 1) {
			var45 += var10;
		}

		int var27 = var45;
		if (var16 == 1) {
			var45 += var9;
		}

		int var28 = var45;
		if (var14 == 1) {
			var45 += var10;
		}

		int var29 = var45;
		var45 += var20;
		int var30 = var45;
		var45 += var10 * 2;
		int var31 = var45;
		var45 += var11 * 6;
		int var32 = var45;
		var45 += var17;
		int var33 = var45;
		var45 += var18;
		int var10000 = var45 + var19;
		this.field134 = var9;
		this.field122 = var10;
		this.field118 = var11;
		this.field123 = new int[var9];
		this.field120 = new int[var9];
		this.field149 = new int[var9];
		this.field117 = new int[var10];
		this.field124 = new int[var10];
		this.field125 = new int[var10];
		if (var11 > 0) {
			this.field147 = new byte[var11];
			this.field135 = new short[var11];
			this.field136 = new short[var11];
			this.field137 = new short[var11];
		}

		if (var16 == 1) {
			this.field121 = new int[var9];
		}

		if (var12 == 1) {
			this.field126 = new byte[var10];
			this.field129 = new byte[var10];
			this.field131 = new short[var10];
		}

		if (var13 == 255) {
			this.field152 = new byte[var10];
		} else {
			this.field132 = (byte)var13;
		}

		if (var14 == 1) {
			this.field128 = new byte[var10];
		}

		if (var15 == 1) {
			this.field138 = new int[var10];
		}

		this.field119 = new short[var10];
		var4.field1070 = var21;
		var5.field1070 = var32;
		var6.field1070 = var33;
		var7.field1070 = var45;
		var8.field1070 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method547();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method558();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method558();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method558();
			}

			this.field123[var38] = var35 + var40;
			this.field120[var38] = var36 + var41;
			this.field149[var38] = var37 + var42;
			var35 = this.field123[var38];
			var36 = this.field120[var38];
			var37 = this.field149[var38];
			if (var16 == 1) {
				this.field121[var38] = var8.method547();
			}
		}

		var4.field1070 = var30;
		var5.field1070 = var26;
		var6.field1070 = var24;
		var7.field1070 = var28;
		var8.field1070 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.field119[var38] = (short)var4.method549();
			if (var12 == 1) {
				var39 = var5.method547();
				if ((var39 & 1) == 1) {
					this.field126[var38] = 1;
					var2 = true;
				} else {
					this.field126[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.field129[var38] = (byte)(var39 >> 2);
					this.field131[var38] = this.field119[var38];
					this.field119[var38] = 127;
					if (this.field131[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field129[var38] = -1;
					this.field131[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.field152[var38] = var6.method548();
			}

			if (var14 == 1) {
				this.field128[var38] = var7.method548();
			}

			if (var15 == 1) {
				this.field138[var38] = var8.method547();
			}
		}

		var4.field1070 = var29;
		var5.field1070 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method547();
			if (var43 == 1) {
				var38 = var4.method558() + var41;
				var39 = var4.method558() + var38;
				var40 = var4.method558() + var39;
				var41 = var40;
				this.field117[var42] = var38;
				this.field124[var42] = var39;
				this.field125[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method558() + var41;
				var41 = var40;
				this.field117[var42] = var38;
				this.field124[var42] = var39;
				this.field125[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method558() + var41;
				var41 = var40;
				this.field117[var42] = var38;
				this.field124[var42] = var39;
				this.field125[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method558() + var41;
				var41 = var40;
				this.field117[var42] = var38;
				this.field124[var42] = var44;
				this.field125[var42] = var40;
			}
		}

		var4.field1070 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.field147[var42] = 0;
			this.field135[var42] = (short)var4.method549();
			this.field136[var42] = (short)var4.method549();
			this.field137[var42] = (short)var4.method549();
		}

		if (this.field129 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field129[var43] & 255;
				if (var44 != 255) {
					if ((this.field135[var44] & '\uffff') == this.field117[var43] && (this.field136[var44] & '\uffff') == this.field124[var43] && (this.field137[var44] & '\uffff') == this.field125[var43]) {
						this.field129[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.field129 = null;
			}
		}

		if (!var3) {
			this.field131 = null;
		}

		if (!var2) {
			this.field126 = null;
		}

	}

	@ObfInfo(
		owner = "gi",
		name = "u",
		desc = "(Lgi;I)I"
	)
	final int method106(class26 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field123[var2];
		int var5 = var1.field120[var2];
		int var6 = var1.field149[var2];

		for (int var7 = 0; var7 < this.field134; ++var7) {
			if (var4 == this.field123[var7] && var5 == this.field120[var7] && var6 == this.field149[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.field123[this.field134] = var4;
			this.field120[this.field134] = var5;
			this.field149[this.field134] = var6;
			if (var1.field121 != null) {
				this.field121[this.field134] = var1.field121[var2];
			}

			if (var1.field141 != null) {
				this.field141[this.field134] = var1.field141[var2];
				this.field133[this.field134] = var1.field133[var2];
			}

			var3 = this.field134++;
		}

		return var3;
	}

	@ObfInfo(
		owner = "gi",
		name = "b",
		desc = "()Lgi;"
	)
	public class26 method105() {
		class26 var1 = new class26();
		if (this.field126 != null) {
			var1.field126 = new byte[this.field122];

			for (int var2 = 0; var2 < this.field122; ++var2) {
				var1.field126[var2] = this.field126[var2];
			}
		}

		var1.field134 = this.field134;
		var1.field122 = this.field122;
		var1.field118 = this.field118;
		var1.field123 = this.field123;
		var1.field120 = this.field120;
		var1.field149 = this.field149;
		var1.field117 = this.field117;
		var1.field124 = this.field124;
		var1.field125 = this.field125;
		var1.field152 = this.field152;
		var1.field128 = this.field128;
		var1.field129 = this.field129;
		var1.field119 = this.field119;
		var1.field131 = this.field131;
		var1.field132 = this.field132;
		var1.field147 = this.field147;
		var1.field135 = this.field135;
		var1.field136 = this.field136;
		var1.field137 = this.field137;
		var1.field121 = this.field121;
		var1.field138 = this.field138;
		var1.field127 = this.field127;
		var1.field140 = this.field140;
		var1.field144 = this.field144;
		var1.field143 = this.field143;
		var1.field146 = this.field146;
		var1.field154 = this.field154;
		return var1;
	}

	@ObfInfo(
		owner = "gi",
		name = "j",
		desc = "([[IIIIZI)Lgi;"
	)
	public class26 method107(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method119();
		int var7 = var2 + this.field158;
		int var8 = var2 + this.field151;
		int var9 = var4 + this.field153;
		int var10 = var4 + this.field150;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class26 var11;
				if (var5) {
					var11 = new class26();
					var11.field134 = this.field134;
					var11.field122 = this.field122;
					var11.field118 = this.field118;
					var11.field123 = this.field123;
					var11.field149 = this.field149;
					var11.field117 = this.field117;
					var11.field124 = this.field124;
					var11.field125 = this.field125;
					var11.field126 = this.field126;
					var11.field152 = this.field152;
					var11.field128 = this.field128;
					var11.field129 = this.field129;
					var11.field119 = this.field119;
					var11.field131 = this.field131;
					var11.field132 = this.field132;
					var11.field147 = this.field147;
					var11.field135 = this.field135;
					var11.field136 = this.field136;
					var11.field137 = this.field137;
					var11.field121 = this.field121;
					var11.field138 = this.field138;
					var11.field127 = this.field127;
					var11.field140 = this.field140;
					var11.field146 = this.field146;
					var11.field154 = this.field154;
					var11.field120 = new int[var11.field134];
				} else {
					var11 = this;
				}

				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				int var21;
				if (var6 == 0) {
					for (var12 = 0; var12 < var11.field134; ++var12) {
						var13 = this.field123[var12] + var2;
						var14 = this.field149[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field120[var12] = this.field120[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field134; ++var12) {
						var13 = (-this.field120[var12] << 16) / super.field2390;
						if (var13 < var6) {
							var14 = this.field123[var12] + var2;
							var15 = this.field149[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field120[var12] = this.field120[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method118();
				return var11;
			}
		} else {
			return this;
		}
	}

	@ObfInfo(
		owner = "gi",
		name = "g",
		desc = "()V"
	)
	void method108() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field121 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field134; ++var3) {
				var4 = this.field121[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field127 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field127[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field134; this.field127[var4][var1[var4]++] = var3++) {
				var4 = this.field121[var3];
			}

			this.field121 = null;
		}

		if (this.field138 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field122; ++var3) {
				var4 = this.field138[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field140 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field140[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field122; this.field140[var4][var1[var4]++] = var3++) {
				var4 = this.field138[var3];
			}

			this.field138 = null;
		}

	}

	@ObfInfo(
		owner = "gi",
		name = "i",
		desc = "()V"
	)
	public void method109() {
		for (int var1 = 0; var1 < this.field134; ++var1) {
			int var2 = this.field123[var1];
			this.field123[var1] = this.field149[var1];
			this.field149[var1] = -var2;
		}

		this.method118();
	}

	@ObfInfo(
		owner = "gi",
		name = "o",
		desc = "()V"
	)
	public void method124() {
		for (int var1 = 0; var1 < this.field134; ++var1) {
			this.field123[var1] = -this.field123[var1];
			this.field149[var1] = -this.field149[var1];
		}

		this.method118();
	}

	@ObfInfo(
		owner = "gi",
		name = "n",
		desc = "()V"
	)
	public void method110() {
		for (int var1 = 0; var1 < this.field134; ++var1) {
			int var2 = this.field149[var1];
			this.field149[var1] = this.field123[var1];
			this.field123[var1] = -var2;
		}

		this.method118();
	}

	@ObfInfo(
		owner = "gi",
		name = "k",
		desc = "(I)V"
	)
	public void method111(int var1) {
		int var2 = field157[var1];
		int var3 = field130[var1];

		for (int var4 = 0; var4 < this.field134; ++var4) {
			int var5 = this.field149[var4] * var2 + this.field123[var4] * var3 >> 16;
			this.field149[var4] = this.field149[var4] * var3 - this.field123[var4] * var2 >> 16;
			this.field123[var4] = var5;
		}

		this.method118();
	}

	@ObfInfo(
		owner = "gi",
		name = "a",
		desc = "(III)V"
	)
	public void method112(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field134; ++var4) {
			int[] var10000 = this.field123;
			var10000[var4] += var1;
			var10000 = this.field120;
			var10000[var4] += var2;
			var10000 = this.field149;
			var10000[var4] += var3;
		}

		this.method118();
	}

	@ObfInfo(
		owner = "gi",
		name = "s",
		desc = "(SS)V"
	)
	public void method113(short var1, short var2) {
		for (int var3 = 0; var3 < this.field122; ++var3) {
			if (this.field119[var3] == var1) {
				this.field119[var3] = var2;
			}
		}

	}

	@ObfInfo(
		owner = "gi",
		name = "l",
		desc = "(SS)V"
	)
	public void method114(short var1, short var2) {
		if (this.field131 != null) {
			for (int var3 = 0; var3 < this.field122; ++var3) {
				if (this.field131[var3] == var1) {
					this.field131[var3] = var2;
				}
			}

		}
	}

	@ObfInfo(
		owner = "gi",
		name = "t",
		desc = "()V"
	)
	public void method115() {
		int var1;
		for (var1 = 0; var1 < this.field134; ++var1) {
			this.field149[var1] = -this.field149[var1];
		}

		for (var1 = 0; var1 < this.field122; ++var1) {
			int var2 = this.field117[var1];
			this.field117[var1] = this.field125[var1];
			this.field125[var1] = var2;
		}

		this.method118();
	}

	@ObfInfo(
		owner = "gi",
		name = "c",
		desc = "(III)V"
	)
	public void method116(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field134; ++var4) {
			this.field123[var4] = this.field123[var4] * var1 / 128;
			this.field120[var4] = this.field120[var4] * var2 / 128;
			this.field149[var4] = this.field149[var4] * var3 / 128;
		}

		this.method118();
	}

	@ObfInfo(
		owner = "gi",
		name = "p",
		desc = "()V"
	)
	public void method117() {
		if (this.field144 == null) {
			this.field144 = new class270[this.field134];

			int var1;
			for (var1 = 0; var1 < this.field134; ++var1) {
				this.field144[var1] = new class270();
			}

			for (var1 = 0; var1 < this.field122; ++var1) {
				int var2 = this.field117[var1];
				int var3 = this.field124[var1];
				int var4 = this.field125[var1];
				int var5 = this.field123[var3] - this.field123[var2];
				int var6 = this.field120[var3] - this.field120[var2];
				int var7 = this.field149[var3] - this.field149[var2];
				int var8 = this.field123[var4] - this.field123[var2];
				int var9 = this.field120[var4] - this.field120[var2];
				int var10 = this.field149[var4] - this.field149[var2];
				int var11 = var6 * var10 - var9 * var7;
				int var12 = var7 * var8 - var10 * var5;

				int var13;
				for (var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
					var11 >>= 1;
					var12 >>= 1;
				}

				int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
				if (var14 <= 0) {
					var14 = 1;
				}

				var11 = var11 * 256 / var14;
				var12 = var12 * 256 / var14;
				var13 = var13 * 256 / var14;
				byte var15;
				if (this.field126 == null) {
					var15 = 0;
				} else {
					var15 = this.field126[var1];
				}

				if (var15 == 0) {
					class270 var16 = this.field144[var2];
					var16.field2229 += var11;
					var16.field2232 += var12;
					var16.field2230 += var13;
					++var16.field2231;
					var16 = this.field144[var3];
					var16.field2229 += var11;
					var16.field2232 += var12;
					var16.field2230 += var13;
					++var16.field2231;
					var16 = this.field144[var4];
					var16.field2229 += var11;
					var16.field2232 += var12;
					var16.field2230 += var13;
					++var16.field2231;
				} else if (var15 == 1) {
					if (this.field143 == null) {
						this.field143 = new class149[this.field122];
					}

					class149 var17 = this.field143[var1] = new class149();
					var17.field1168 = var11;
					var17.field1167 = var12;
					var17.field1169 = var13;
				}
			}

		}
	}

	@ObfInfo(
		owner = "gi",
		name = "d",
		desc = "()V"
	)
	void method118() {
		this.field144 = null;
		this.field145 = null;
		this.field143 = null;
		this.field148 = false;
	}

	@ObfInfo(
		owner = "gi",
		name = "y",
		desc = "()V"
	)
	void method119() {
		if (!this.field148) {
			super.field2390 = 0;
			this.field142 = 0;
			this.field158 = 999999;
			this.field151 = -999999;
			this.field150 = -99999;
			this.field153 = 99999;

			for (int var1 = 0; var1 < this.field134; ++var1) {
				int var2 = this.field123[var1];
				int var3 = this.field120[var1];
				int var4 = this.field149[var1];
				if (var2 < this.field158) {
					this.field158 = var2;
				}

				if (var2 > this.field151) {
					this.field151 = var2;
				}

				if (var4 < this.field153) {
					this.field153 = var4;
				}

				if (var4 > this.field150) {
					this.field150 = var4;
				}

				if (-var3 > super.field2390) {
					super.field2390 = -var3;
				}

				if (var3 > this.field142) {
					this.field142 = var3;
				}
			}

			this.field148 = true;
		}
	}

	@ObfInfo(
		owner = "gi",
		name = "w",
		desc = "(IIIII)Lhh;"
	)
	public final class470 method121(int var1, int var2, int var3, int var4, int var5) {
		this.method117();
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var2 * var6 >> 8;
		class470 var8 = new class470();
		var8.field3904 = new int[this.field122];
		var8.field3938 = new int[this.field122];
		var8.field3906 = new int[this.field122];
		if (this.field118 > 0 && this.field129 != null) {
			int[] var9 = new int[this.field118];

			int var10;
			for (var10 = 0; var10 < this.field122; ++var10) {
				if (this.field129[var10] != -1) {
					++var9[this.field129[var10] & 255];
				}
			}

			var8.field3944 = 0;

			for (var10 = 0; var10 < this.field118; ++var10) {
				if (var9[var10] > 0 && this.field147[var10] == 0) {
					++var8.field3944;
				}
			}

			var8.field3900 = new int[var8.field3944];
			var8.field3914 = new int[var8.field3944];
			var8.field3915 = new int[var8.field3944];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.field118; ++var11) {
				if (var9[var11] > 0 && this.field147[var11] == 0) {
					var8.field3900[var10] = this.field135[var11] & '\uffff';
					var8.field3914[var10] = this.field136[var11] & '\uffff';
					var8.field3915[var10] = this.field137[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field3924 = new byte[this.field122];

			for (var11 = 0; var11 < this.field122; ++var11) {
				if (this.field129[var11] != -1) {
					var8.field3924[var11] = (byte)var9[this.field129[var11] & 255];
				} else {
					var8.field3924[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.field122; ++var16) {
			byte var17;
			if (this.field126 == null) {
				var17 = 0;
			} else {
				var17 = this.field126[var16];
			}

			byte var18;
			if (this.field128 == null) {
				var18 = 0;
			} else {
				var18 = this.field128[var16];
			}

			short var12;
			if (this.field131 == null) {
				var12 = -1;
			} else {
				var12 = this.field131[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			class270 var13;
			int var14;
			class149 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field143[var16];
						var14 = var1 + (var3 * var19.field1168 + var4 * var19.field1167 + var5 * var19.field1169) / (var7 + var7 / 2);
						var8.field3904[var16] = method122(this.field119[var16] & '\uffff', var14);
						var8.field3906[var16] = -1;
					} else if (var17 == 3) {
						var8.field3904[var16] = 128;
						var8.field3906[var16] = -1;
					} else {
						var8.field3906[var16] = -2;
					}
				} else {
					int var15 = this.field119[var16] & '\uffff';
					if (this.field145 != null && this.field145[this.field117[var16]] != null) {
						var13 = this.field145[this.field117[var16]];
					} else {
						var13 = this.field144[this.field117[var16]];
					}

					var14 = var1 + (var3 * var13.field2229 + var4 * var13.field2232 + var5 * var13.field2230) / (var7 * var13.field2231);
					var8.field3904[var16] = method122(var15, var14);
					if (this.field145 != null && this.field145[this.field124[var16]] != null) {
						var13 = this.field145[this.field124[var16]];
					} else {
						var13 = this.field144[this.field124[var16]];
					}

					var14 = var1 + (var3 * var13.field2229 + var4 * var13.field2232 + var5 * var13.field2230) / (var7 * var13.field2231);
					var8.field3938[var16] = method122(var15, var14);
					if (this.field145 != null && this.field145[this.field125[var16]] != null) {
						var13 = this.field145[this.field125[var16]];
					} else {
						var13 = this.field144[this.field125[var16]];
					}

					var14 = var1 + (var3 * var13.field2229 + var4 * var13.field2232 + var5 * var13.field2230) / (var7 * var13.field2231);
					var8.field3906[var16] = method122(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field143[var16];
					var14 = var1 + (var3 * var19.field1168 + var4 * var19.field1167 + var5 * var19.field1169) / (var7 + var7 / 2);
					var8.field3904[var16] = method123(var14);
					var8.field3906[var16] = -1;
				} else {
					var8.field3906[var16] = -2;
				}
			} else {
				if (this.field145 != null && this.field145[this.field117[var16]] != null) {
					var13 = this.field145[this.field117[var16]];
				} else {
					var13 = this.field144[this.field117[var16]];
				}

				var14 = var1 + (var3 * var13.field2229 + var4 * var13.field2232 + var5 * var13.field2230) / (var7 * var13.field2231);
				var8.field3904[var16] = method123(var14);
				if (this.field145 != null && this.field145[this.field124[var16]] != null) {
					var13 = this.field145[this.field124[var16]];
				} else {
					var13 = this.field144[this.field124[var16]];
				}

				var14 = var1 + (var3 * var13.field2229 + var4 * var13.field2232 + var5 * var13.field2230) / (var7 * var13.field2231);
				var8.field3938[var16] = method123(var14);
				if (this.field145 != null && this.field145[this.field125[var16]] != null) {
					var13 = this.field145[this.field125[var16]];
				} else {
					var13 = this.field144[this.field125[var16]];
				}

				var14 = var1 + (var3 * var13.field2229 + var4 * var13.field2232 + var5 * var13.field2230) / (var7 * var13.field2231);
				var8.field3906[var16] = method123(var14);
			}
		}

		this.method108();
		var8.field3896 = this.field134;
		var8.field3923 = this.field123;
		var8.field3929 = this.field120;
		var8.field3945 = this.field149;
		var8.field3937 = this.field122;
		var8.field3913 = this.field117;
		var8.field3909 = this.field124;
		var8.field3903 = this.field125;
		var8.field3948 = this.field152;
		var8.field3936 = this.field128;
		var8.field3911 = this.field132;
		var8.field3916 = this.field127;
		var8.field3917 = this.field140;
		var8.field3935 = this.field131;
		var8.field3918 = this.field141;
		var8.field3919 = this.field133;
		return var8;
	}

	@ObfInfo(
		owner = "gi",
		name = "h",
		desc = "(Lly;II)Lgi;"
	)
	public static class26 method103(class274 var0, int var1, int var2) {
		byte[] var3 = var0.method1365(var1, var2);
		return var3 == null ? null : new class26(var3);
	}

	@ObfInfo(
		owner = "gi",
		name = "z",
		desc = "(Lgi;Lgi;IIIZ)V"
	)
	static void method120(class26 var0, class26 var1, int var2, int var3, int var4, boolean var5) {
		var0.method119();
		var0.method117();
		var1.method119();
		var1.method117();
		++field156;
		int var6 = 0;
		int[] var7 = var1.field123;
		int var8 = var1.field134;

		int var9;
		for (var9 = 0; var9 < var0.field134; ++var9) {
			class270 var10 = var0.field144[var9];
			if (var10.field2231 != 0) {
				int var11 = var0.field120[var9] - var3;
				if (var11 <= var1.field142) {
					int var12 = var0.field123[var9] - var2;
					if (var12 >= var1.field158 && var12 <= var1.field151) {
						int var13 = var0.field149[var9] - var4;
						if (var13 >= var1.field153 && var13 <= var1.field150) {
							for (int var14 = 0; var14 < var8; ++var14) {
								class270 var15 = var1.field144[var14];
								if (var12 == var7[var14] && var13 == var1.field149[var14] && var11 == var1.field120[var14] && var15.field2231 != 0) {
									if (var0.field145 == null) {
										var0.field145 = new class270[var0.field134];
									}

									if (var1.field145 == null) {
										var1.field145 = new class270[var8];
									}

									class270 var16 = var0.field145[var9];
									if (var16 == null) {
										var16 = var0.field145[var9] = new class270(var10);
									}

									class270 var17 = var1.field145[var14];
									if (var17 == null) {
										var17 = var1.field145[var14] = new class270(var15);
									}

									var16.field2229 += var15.field2229;
									var16.field2232 += var15.field2232;
									var16.field2230 += var15.field2230;
									var16.field2231 += var15.field2231;
									var17.field2229 += var10.field2229;
									var17.field2232 += var10.field2232;
									var17.field2230 += var10.field2230;
									var17.field2231 += var10.field2231;
									++var6;
									field139[var9] = field156;
									field155[var14] = field156;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field122; ++var9) {
				if (field139[var0.field117[var9]] == field156 && field139[var0.field124[var9]] == field156 && field139[var0.field125[var9]] == field156) {
					if (var0.field126 == null) {
						var0.field126 = new byte[var0.field122];
					}

					var0.field126[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.field122; ++var9) {
				if (field155[var1.field117[var9]] == field156 && field155[var1.field124[var9]] == field156 && field155[var1.field125[var9]] == field156) {
					if (var1.field126 == null) {
						var1.field126 = new byte[var1.field122];
					}

					var1.field126[var9] = 2;
				}
			}

		}
	}

	@ObfInfo(
		owner = "gi",
		name = "as",
		desc = "(II)I"
	)
	static final int method122(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	@ObfInfo(
		owner = "gi",
		name = "ad",
		desc = "(I)I"
	)
	static final int method123(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
