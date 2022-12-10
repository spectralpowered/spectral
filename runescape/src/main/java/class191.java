public class class191 extends class226 {
	static int field2110;
	static int[] field2083;
	static int[] field2093;
	static int[] field2109;
	static int[] field2111;
	boolean field2102;
	byte field2085;
	byte[] field2079;
	byte[] field2081;
	byte[] field2082;
	byte[] field2101;
	byte[] field2106;
	class220[] field2098;
	class220[] field2099;
	class234[] field2097;
	int field2071;
	int field2075;
	int field2087;
	int field2096;
	int field2104;
	int field2105;
	int field2107;
	int field2112;
	int[] field2068;
	int[] field2073;
	int[] field2074;
	int[] field2076;
	int[] field2077;
	int[] field2078;
	int[] field2092;
	int[] field2103;
	int[][] field2080;
	int[][] field2086;
	int[][] field2094;
	int[][] field2095;
	short[] field2072;
	short[] field2084;
	short[] field2088;
	short[] field2089;
	short[] field2090;
	public short field2100;
	public short field2108;

	static {
		field2093 = new int[10000];
		field2109 = new int[10000];
		field2110 = 0;
		field2111 = class221.field2667;
		field2083 = class221.field2690;
	}

	class191() {
		this.field2087 = 0;
		this.field2075 = 0;
		this.field2085 = 0;
		this.field2102 = false;
	}

	public static class191 method3645(class337 var0, int var1, int var2) {
		byte[] var3 = var0.method6374(var1, var2);
		return var3 == null ? null : new class191(var3);
	}

	class191(byte[] var1) {
		this.field2087 = 0;
		this.field2075 = 0;
		this.field2085 = 0;
		this.field2102 = false;
		class467 var2 = new class467(10);
		var2.method8310(-2);
		if (var1[var1.length - 1] == -3 && var1[var1.length - 2] == -1) {
			this.method3646(var1);
		} else if (var1[var1.length - 1] == -2 && var1[var1.length - 2] == -1) {
			this.method3712(var1);
		} else if (var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
			this.method3726(var1);
		} else {
			this.method3721(var1);
		}

	}

	void method3646(byte[] var1) {
		class467 var2 = new class467(var1);
		class467 var3 = new class467(var1);
		class467 var4 = new class467(var1);
		class467 var5 = new class467(var1);
		class467 var6 = new class467(var1);
		class467 var7 = new class467(var1);
		class467 var8 = new class467(var1);
		var2.field4915 = var1.length - 26;
		int var9 = var2.method8328();
		int var10 = var2.method8328();
		int var11 = var2.method8326();
		int var12 = var2.method8326();
		int var13 = var2.method8326();
		int var14 = var2.method8326();
		int var15 = var2.method8326();
		int var16 = var2.method8326();
		int var17 = var2.method8326();
		int var18 = var2.method8326();
		int var19 = var2.method8328();
		int var20 = var2.method8328();
		int var21 = var2.method8328();
		int var22 = var2.method8328();
		int var23 = var2.method8328();
		int var24 = var2.method8328();
		int var25 = 0;
		int var26 = 0;
		int var27 = 0;
		int var28;
		if (var11 > 0) {
			this.field2101 = new byte[var11];
			var2.field4915 = 0;

			for (var28 = 0; var28 < var11; ++var28) {
				byte var29 = this.field2101[var28] = var2.method8327();
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
		this.field2087 = var9;
		this.field2075 = var10;
		this.field2071 = var11;
		this.field2076 = new int[var9];
		this.field2073 = new int[var9];
		this.field2103 = new int[var9];
		this.field2068 = new int[var10];
		this.field2077 = new int[var10];
		this.field2078 = new int[var10];
		if (var17 == 1) {
			this.field2074 = new int[var9];
		}

		if (var12 == 1) {
			this.field2079 = new byte[var10];
		}

		if (var13 == 255) {
			this.field2106 = new byte[var10];
		} else {
			this.field2085 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2081 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2092 = new int[var10];
		}

		if (var16 == 1) {
			this.field2084 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field2082 = new byte[var10];
		}

		if (var18 == 1) {
			this.field2095 = new int[var9][];
			this.field2086 = new int[var9][];
		}

		this.field2072 = new short[var10];
		if (var11 > 0) {
			this.field2088 = new short[var11];
			this.field2089 = new short[var11];
			this.field2090 = new short[var11];
		}

		var2.field4915 = var11;
		var3.field4915 = var40;
		var4.field4915 = var41;
		var5.field4915 = var42;
		var6.field4915 = var34;
		int var50 = 0;
		int var51 = 0;
		int var52 = 0;

		int var53;
		int var54;
		int var55;
		int var56;
		int var57;
		for (var53 = 0; var53 < var9; ++var53) {
			var54 = var2.method8326();
			var55 = 0;
			if ((var54 & 1) != 0) {
				var55 = var3.method8339();
			}

			var56 = 0;
			if ((var54 & 2) != 0) {
				var56 = var4.method8339();
			}

			var57 = 0;
			if ((var54 & 4) != 0) {
				var57 = var5.method8339();
			}

			this.field2076[var53] = var50 + var55;
			this.field2073[var53] = var51 + var56;
			this.field2103[var53] = var52 + var57;
			var50 = this.field2076[var53];
			var51 = this.field2073[var53];
			var52 = this.field2103[var53];
			if (var17 == 1) {
				this.field2074[var53] = var6.method8326();
			}
		}

		if (var18 == 1) {
			for (var53 = 0; var53 < var9; ++var53) {
				var54 = var6.method8326();
				this.field2095[var53] = new int[var54];
				this.field2086[var53] = new int[var54];

				for (var55 = 0; var55 < var54; ++var55) {
					this.field2095[var53][var55] = var6.method8326();
					this.field2086[var53][var55] = var6.method8326();
				}
			}
		}

		var2.field4915 = var39;
		var3.field4915 = var30;
		var4.field4915 = var32;
		var5.field4915 = var35;
		var6.field4915 = var33;
		var7.field4915 = var37;
		var8.field4915 = var38;

		for (var53 = 0; var53 < var10; ++var53) {
			this.field2072[var53] = (short)var2.method8328();
			if (var12 == 1) {
				this.field2079[var53] = var3.method8327();
			}

			if (var13 == 255) {
				this.field2106[var53] = var4.method8327();
			}

			if (var14 == 1) {
				this.field2081[var53] = var5.method8327();
			}

			if (var15 == 1) {
				this.field2092[var53] = var6.method8326();
			}

			if (var16 == 1) {
				this.field2084[var53] = (short)(var7.method8328() - 1);
			}

			if (this.field2082 != null && this.field2084[var53] != -1) {
				this.field2082[var53] = (byte)(var8.method8326() - 1);
			}
		}

		var2.field4915 = var36;
		var3.field4915 = var31;
		var53 = 0;
		var54 = 0;
		var55 = 0;
		var56 = 0;

		int var58;
		for (var57 = 0; var57 < var10; ++var57) {
			var58 = var3.method8326();
			if (var58 == 1) {
				var53 = var2.method8339() + var56;
				var54 = var2.method8339() + var53;
				var55 = var2.method8339() + var54;
				var56 = var55;
				this.field2068[var57] = var53;
				this.field2077[var57] = var54;
				this.field2078[var57] = var55;
			}

			if (var58 == 2) {
				var54 = var55;
				var55 = var2.method8339() + var56;
				var56 = var55;
				this.field2068[var57] = var53;
				this.field2077[var57] = var54;
				this.field2078[var57] = var55;
			}

			if (var58 == 3) {
				var53 = var55;
				var55 = var2.method8339() + var56;
				var56 = var55;
				this.field2068[var57] = var53;
				this.field2077[var57] = var54;
				this.field2078[var57] = var55;
			}

			if (var58 == 4) {
				int var59 = var53;
				var53 = var54;
				var54 = var59;
				var55 = var2.method8339() + var56;
				var56 = var55;
				this.field2068[var57] = var53;
				this.field2077[var57] = var59;
				this.field2078[var57] = var55;
			}
		}

		var2.field4915 = var43;
		var3.field4915 = var44;
		var4.field4915 = var45;
		var5.field4915 = var46;
		var6.field4915 = var47;
		var7.field4915 = var48;

		for (var57 = 0; var57 < var11; ++var57) {
			var58 = this.field2101[var57] & 255;
			if (var58 == 0) {
				this.field2088[var57] = (short)var2.method8328();
				this.field2089[var57] = (short)var2.method8328();
				this.field2090[var57] = (short)var2.method8328();
			}
		}

		var2.field4915 = var28;
		var57 = var2.method8326();
		if (var57 != 0) {
			new class219();
			var2.method8328();
			var2.method8328();
			var2.method8328();
			var2.method8480();
		}

	}

	void method3712(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class467 var4 = new class467(var1);
		class467 var5 = new class467(var1);
		class467 var6 = new class467(var1);
		class467 var7 = new class467(var1);
		class467 var8 = new class467(var1);
		var4.field4915 = var1.length - 23;
		int var9 = var4.method8328();
		int var10 = var4.method8328();
		int var11 = var4.method8326();
		int var12 = var4.method8326();
		int var13 = var4.method8326();
		int var14 = var4.method8326();
		int var15 = var4.method8326();
		int var16 = var4.method8326();
		int var17 = var4.method8326();
		int var18 = var4.method8328();
		int var19 = var4.method8328();
		int var20 = var4.method8328();
		int var21 = var4.method8328();
		int var22 = var4.method8328();
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
		this.field2087 = var9;
		this.field2075 = var10;
		this.field2071 = var11;
		this.field2076 = new int[var9];
		this.field2073 = new int[var9];
		this.field2103 = new int[var9];
		this.field2068 = new int[var10];
		this.field2077 = new int[var10];
		this.field2078 = new int[var10];
		if (var11 > 0) {
			this.field2101 = new byte[var11];
			this.field2088 = new short[var11];
			this.field2089 = new short[var11];
			this.field2090 = new short[var11];
		}

		if (var16 == 1) {
			this.field2074 = new int[var9];
		}

		if (var12 == 1) {
			this.field2079 = new byte[var10];
			this.field2082 = new byte[var10];
			this.field2084 = new short[var10];
		}

		if (var13 == 255) {
			this.field2106 = new byte[var10];
		} else {
			this.field2085 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2081 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2092 = new int[var10];
		}

		if (var17 == 1) {
			this.field2095 = new int[var9][];
			this.field2086 = new int[var9][];
		}

		this.field2072 = new short[var10];
		var4.field4915 = var23;
		var5.field4915 = var34;
		var6.field4915 = var35;
		var7.field4915 = var47;
		var8.field4915 = var29;
		int var37 = 0;
		int var38 = 0;
		int var39 = 0;

		int var40;
		int var41;
		int var42;
		int var43;
		int var44;
		for (var40 = 0; var40 < var9; ++var40) {
			var41 = var4.method8326();
			var42 = 0;
			if ((var41 & 1) != 0) {
				var42 = var5.method8339();
			}

			var43 = 0;
			if ((var41 & 2) != 0) {
				var43 = var6.method8339();
			}

			var44 = 0;
			if ((var41 & 4) != 0) {
				var44 = var7.method8339();
			}

			this.field2076[var40] = var37 + var42;
			this.field2073[var40] = var38 + var43;
			this.field2103[var40] = var39 + var44;
			var37 = this.field2076[var40];
			var38 = this.field2073[var40];
			var39 = this.field2103[var40];
			if (var16 == 1) {
				this.field2074[var40] = var8.method8326();
			}
		}

		if (var17 == 1) {
			for (var40 = 0; var40 < var9; ++var40) {
				var41 = var8.method8326();
				this.field2095[var40] = new int[var41];
				this.field2086[var40] = new int[var41];

				for (var42 = 0; var42 < var41; ++var42) {
					this.field2095[var40][var42] = var8.method8326();
					this.field2086[var40][var42] = var8.method8326();
				}
			}
		}

		var4.field4915 = var32;
		var5.field4915 = var28;
		var6.field4915 = var26;
		var7.field4915 = var30;
		var8.field4915 = var27;

		for (var40 = 0; var40 < var10; ++var40) {
			this.field2072[var40] = (short)var4.method8328();
			if (var12 == 1) {
				var41 = var5.method8326();
				if ((var41 & 1) == 1) {
					this.field2079[var40] = 1;
					var2 = true;
				} else {
					this.field2079[var40] = 0;
				}

				if ((var41 & 2) == 2) {
					this.field2082[var40] = (byte)(var41 >> 2);
					this.field2084[var40] = this.field2072[var40];
					this.field2072[var40] = 127;
					if (this.field2084[var40] != -1) {
						var3 = true;
					}
				} else {
					this.field2082[var40] = -1;
					this.field2084[var40] = -1;
				}
			}

			if (var13 == 255) {
				this.field2106[var40] = var6.method8327();
			}

			if (var14 == 1) {
				this.field2081[var40] = var7.method8327();
			}

			if (var15 == 1) {
				this.field2092[var40] = var8.method8326();
			}
		}

		var4.field4915 = var31;
		var5.field4915 = var25;
		var40 = 0;
		var41 = 0;
		var42 = 0;
		var43 = 0;

		int var45;
		int var46;
		for (var44 = 0; var44 < var10; ++var44) {
			var45 = var5.method8326();
			if (var45 == 1) {
				var40 = var4.method8339() + var43;
				var41 = var4.method8339() + var40;
				var42 = var4.method8339() + var41;
				var43 = var42;
				this.field2068[var44] = var40;
				this.field2077[var44] = var41;
				this.field2078[var44] = var42;
			}

			if (var45 == 2) {
				var41 = var42;
				var42 = var4.method8339() + var43;
				var43 = var42;
				this.field2068[var44] = var40;
				this.field2077[var44] = var41;
				this.field2078[var44] = var42;
			}

			if (var45 == 3) {
				var40 = var42;
				var42 = var4.method8339() + var43;
				var43 = var42;
				this.field2068[var44] = var40;
				this.field2077[var44] = var41;
				this.field2078[var44] = var42;
			}

			if (var45 == 4) {
				var46 = var40;
				var40 = var41;
				var41 = var46;
				var42 = var4.method8339() + var43;
				var43 = var42;
				this.field2068[var44] = var40;
				this.field2077[var44] = var46;
				this.field2078[var44] = var42;
			}
		}

		var4.field4915 = var33;

		for (var44 = 0; var44 < var11; ++var44) {
			this.field2101[var44] = 0;
			this.field2088[var44] = (short)var4.method8328();
			this.field2089[var44] = (short)var4.method8328();
			this.field2090[var44] = (short)var4.method8328();
		}

		if (this.field2082 != null) {
			boolean var48 = false;

			for (var45 = 0; var45 < var10; ++var45) {
				var46 = this.field2082[var45] & 255;
				if (var46 != 255) {
					if ((this.field2088[var46] & '\uffff') == this.field2068[var45] && (this.field2089[var46] & '\uffff') == this.field2077[var45] && (this.field2090[var46] & '\uffff') == this.field2078[var45]) {
						this.field2082[var45] = -1;
					} else {
						var48 = true;
					}
				}
			}

			if (!var48) {
				this.field2082 = null;
			}
		}

		if (!var3) {
			this.field2084 = null;
		}

		if (!var2) {
			this.field2079 = null;
		}

	}

	void method3726(byte[] var1) {
		class467 var2 = new class467(var1);
		class467 var3 = new class467(var1);
		class467 var4 = new class467(var1);
		class467 var5 = new class467(var1);
		class467 var6 = new class467(var1);
		class467 var7 = new class467(var1);
		class467 var8 = new class467(var1);
		var2.field4915 = var1.length - 23;
		int var9 = var2.method8328();
		int var10 = var2.method8328();
		int var11 = var2.method8326();
		int var12 = var2.method8326();
		int var13 = var2.method8326();
		int var14 = var2.method8326();
		int var15 = var2.method8326();
		int var16 = var2.method8326();
		int var17 = var2.method8326();
		int var18 = var2.method8328();
		int var19 = var2.method8328();
		int var20 = var2.method8328();
		int var21 = var2.method8328();
		int var22 = var2.method8328();
		int var23 = 0;
		int var24 = 0;
		int var25 = 0;
		int var26;
		if (var11 > 0) {
			this.field2101 = new byte[var11];
			var2.field4915 = 0;

			for (var26 = 0; var26 < var11; ++var26) {
				byte var27 = this.field2101[var26] = var2.method8327();
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
		this.field2087 = var9;
		this.field2075 = var10;
		this.field2071 = var11;
		this.field2076 = new int[var9];
		this.field2073 = new int[var9];
		this.field2103 = new int[var9];
		this.field2068 = new int[var10];
		this.field2077 = new int[var10];
		this.field2078 = new int[var10];
		if (var17 == 1) {
			this.field2074 = new int[var9];
		}

		if (var12 == 1) {
			this.field2079 = new byte[var10];
		}

		if (var13 == 255) {
			this.field2106 = new byte[var10];
		} else {
			this.field2085 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2081 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2092 = new int[var10];
		}

		if (var16 == 1) {
			this.field2084 = new short[var10];
		}

		if (var16 == 1 && var11 > 0) {
			this.field2082 = new byte[var10];
		}

		this.field2072 = new short[var10];
		if (var11 > 0) {
			this.field2088 = new short[var11];
			this.field2089 = new short[var11];
			this.field2090 = new short[var11];
		}

		var2.field4915 = var11;
		var3.field4915 = var38;
		var4.field4915 = var39;
		var5.field4915 = var40;
		var6.field4915 = var32;
		int var48 = 0;
		int var49 = 0;
		int var50 = 0;

		int var51;
		int var52;
		int var53;
		int var54;
		int var55;
		for (var51 = 0; var51 < var9; ++var51) {
			var52 = var2.method8326();
			var53 = 0;
			if ((var52 & 1) != 0) {
				var53 = var3.method8339();
			}

			var54 = 0;
			if ((var52 & 2) != 0) {
				var54 = var4.method8339();
			}

			var55 = 0;
			if ((var52 & 4) != 0) {
				var55 = var5.method8339();
			}

			this.field2076[var51] = var48 + var53;
			this.field2073[var51] = var49 + var54;
			this.field2103[var51] = var50 + var55;
			var48 = this.field2076[var51];
			var49 = this.field2073[var51];
			var50 = this.field2103[var51];
			if (var17 == 1) {
				this.field2074[var51] = var6.method8326();
			}
		}

		var2.field4915 = var37;
		var3.field4915 = var28;
		var4.field4915 = var30;
		var5.field4915 = var33;
		var6.field4915 = var31;
		var7.field4915 = var35;
		var8.field4915 = var36;

		for (var51 = 0; var51 < var10; ++var51) {
			this.field2072[var51] = (short)var2.method8328();
			if (var12 == 1) {
				this.field2079[var51] = var3.method8327();
			}

			if (var13 == 255) {
				this.field2106[var51] = var4.method8327();
			}

			if (var14 == 1) {
				this.field2081[var51] = var5.method8327();
			}

			if (var15 == 1) {
				this.field2092[var51] = var6.method8326();
			}

			if (var16 == 1) {
				this.field2084[var51] = (short)(var7.method8328() - 1);
			}

			if (this.field2082 != null && this.field2084[var51] != -1) {
				this.field2082[var51] = (byte)(var8.method8326() - 1);
			}
		}

		var2.field4915 = var34;
		var3.field4915 = var29;
		var51 = 0;
		var52 = 0;
		var53 = 0;
		var54 = 0;

		int var56;
		for (var55 = 0; var55 < var10; ++var55) {
			var56 = var3.method8326();
			if (var56 == 1) {
				var51 = var2.method8339() + var54;
				var52 = var2.method8339() + var51;
				var53 = var2.method8339() + var52;
				var54 = var53;
				this.field2068[var55] = var51;
				this.field2077[var55] = var52;
				this.field2078[var55] = var53;
			}

			if (var56 == 2) {
				var52 = var53;
				var53 = var2.method8339() + var54;
				var54 = var53;
				this.field2068[var55] = var51;
				this.field2077[var55] = var52;
				this.field2078[var55] = var53;
			}

			if (var56 == 3) {
				var51 = var53;
				var53 = var2.method8339() + var54;
				var54 = var53;
				this.field2068[var55] = var51;
				this.field2077[var55] = var52;
				this.field2078[var55] = var53;
			}

			if (var56 == 4) {
				int var57 = var51;
				var51 = var52;
				var52 = var57;
				var53 = var2.method8339() + var54;
				var54 = var53;
				this.field2068[var55] = var51;
				this.field2077[var55] = var57;
				this.field2078[var55] = var53;
			}
		}

		var2.field4915 = var41;
		var3.field4915 = var42;
		var4.field4915 = var43;
		var5.field4915 = var44;
		var6.field4915 = var45;
		var7.field4915 = var46;

		for (var55 = 0; var55 < var11; ++var55) {
			var56 = this.field2101[var55] & 255;
			if (var56 == 0) {
				this.field2088[var55] = (short)var2.method8328();
				this.field2089[var55] = (short)var2.method8328();
				this.field2090[var55] = (short)var2.method8328();
			}
		}

		var2.field4915 = var26;
		var55 = var2.method8326();
		if (var55 != 0) {
			new class219();
			var2.method8328();
			var2.method8328();
			var2.method8328();
			var2.method8480();
		}

	}

	void method3721(byte[] var1) {
		boolean var2 = false;
		boolean var3 = false;
		class467 var4 = new class467(var1);
		class467 var5 = new class467(var1);
		class467 var6 = new class467(var1);
		class467 var7 = new class467(var1);
		class467 var8 = new class467(var1);
		var4.field4915 = var1.length - 18;
		int var9 = var4.method8328();
		int var10 = var4.method8328();
		int var11 = var4.method8326();
		int var12 = var4.method8326();
		int var13 = var4.method8326();
		int var14 = var4.method8326();
		int var15 = var4.method8326();
		int var16 = var4.method8326();
		int var17 = var4.method8328();
		int var18 = var4.method8328();
		int var19 = var4.method8328();
		int var20 = var4.method8328();
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
		this.field2087 = var9;
		this.field2075 = var10;
		this.field2071 = var11;
		this.field2076 = new int[var9];
		this.field2073 = new int[var9];
		this.field2103 = new int[var9];
		this.field2068 = new int[var10];
		this.field2077 = new int[var10];
		this.field2078 = new int[var10];
		if (var11 > 0) {
			this.field2101 = new byte[var11];
			this.field2088 = new short[var11];
			this.field2089 = new short[var11];
			this.field2090 = new short[var11];
		}

		if (var16 == 1) {
			this.field2074 = new int[var9];
		}

		if (var12 == 1) {
			this.field2079 = new byte[var10];
			this.field2082 = new byte[var10];
			this.field2084 = new short[var10];
		}

		if (var13 == 255) {
			this.field2106 = new byte[var10];
		} else {
			this.field2085 = (byte)var13;
		}

		if (var14 == 1) {
			this.field2081 = new byte[var10];
		}

		if (var15 == 1) {
			this.field2092 = new int[var10];
		}

		this.field2072 = new short[var10];
		var4.field4915 = var21;
		var5.field4915 = var32;
		var6.field4915 = var33;
		var7.field4915 = var45;
		var8.field4915 = var27;
		int var35 = 0;
		int var36 = 0;
		int var37 = 0;

		int var38;
		int var39;
		int var40;
		int var41;
		int var42;
		for (var38 = 0; var38 < var9; ++var38) {
			var39 = var4.method8326();
			var40 = 0;
			if ((var39 & 1) != 0) {
				var40 = var5.method8339();
			}

			var41 = 0;
			if ((var39 & 2) != 0) {
				var41 = var6.method8339();
			}

			var42 = 0;
			if ((var39 & 4) != 0) {
				var42 = var7.method8339();
			}

			this.field2076[var38] = var35 + var40;
			this.field2073[var38] = var36 + var41;
			this.field2103[var38] = var37 + var42;
			var35 = this.field2076[var38];
			var36 = this.field2073[var38];
			var37 = this.field2103[var38];
			if (var16 == 1) {
				this.field2074[var38] = var8.method8326();
			}
		}

		var4.field4915 = var30;
		var5.field4915 = var26;
		var6.field4915 = var24;
		var7.field4915 = var28;
		var8.field4915 = var25;

		for (var38 = 0; var38 < var10; ++var38) {
			this.field2072[var38] = (short)var4.method8328();
			if (var12 == 1) {
				var39 = var5.method8326();
				if ((var39 & 1) == 1) {
					this.field2079[var38] = 1;
					var2 = true;
				} else {
					this.field2079[var38] = 0;
				}

				if ((var39 & 2) == 2) {
					this.field2082[var38] = (byte)(var39 >> 2);
					this.field2084[var38] = this.field2072[var38];
					this.field2072[var38] = 127;
					if (this.field2084[var38] != -1) {
						var3 = true;
					}
				} else {
					this.field2082[var38] = -1;
					this.field2084[var38] = -1;
				}
			}

			if (var13 == 255) {
				this.field2106[var38] = var6.method8327();
			}

			if (var14 == 1) {
				this.field2081[var38] = var7.method8327();
			}

			if (var15 == 1) {
				this.field2092[var38] = var8.method8326();
			}
		}

		var4.field4915 = var29;
		var5.field4915 = var23;
		var38 = 0;
		var39 = 0;
		var40 = 0;
		var41 = 0;

		int var43;
		int var44;
		for (var42 = 0; var42 < var10; ++var42) {
			var43 = var5.method8326();
			if (var43 == 1) {
				var38 = var4.method8339() + var41;
				var39 = var4.method8339() + var38;
				var40 = var4.method8339() + var39;
				var41 = var40;
				this.field2068[var42] = var38;
				this.field2077[var42] = var39;
				this.field2078[var42] = var40;
			}

			if (var43 == 2) {
				var39 = var40;
				var40 = var4.method8339() + var41;
				var41 = var40;
				this.field2068[var42] = var38;
				this.field2077[var42] = var39;
				this.field2078[var42] = var40;
			}

			if (var43 == 3) {
				var38 = var40;
				var40 = var4.method8339() + var41;
				var41 = var40;
				this.field2068[var42] = var38;
				this.field2077[var42] = var39;
				this.field2078[var42] = var40;
			}

			if (var43 == 4) {
				var44 = var38;
				var38 = var39;
				var39 = var44;
				var40 = var4.method8339() + var41;
				var41 = var40;
				this.field2068[var42] = var38;
				this.field2077[var42] = var44;
				this.field2078[var42] = var40;
			}
		}

		var4.field4915 = var31;

		for (var42 = 0; var42 < var11; ++var42) {
			this.field2101[var42] = 0;
			this.field2088[var42] = (short)var4.method8328();
			this.field2089[var42] = (short)var4.method8328();
			this.field2090[var42] = (short)var4.method8328();
		}

		if (this.field2082 != null) {
			boolean var46 = false;

			for (var43 = 0; var43 < var10; ++var43) {
				var44 = this.field2082[var43] & 255;
				if (var44 != 255) {
					if ((this.field2088[var44] & '\uffff') == this.field2068[var43] && (this.field2089[var44] & '\uffff') == this.field2077[var43] && (this.field2090[var44] & '\uffff') == this.field2078[var43]) {
						this.field2082[var43] = -1;
					} else {
						var46 = true;
					}
				}
			}

			if (!var46) {
				this.field2082 = null;
			}
		}

		if (!var3) {
			this.field2084 = null;
		}

		if (!var2) {
			this.field2079 = null;
		}

	}

	public class191(class191[] var1, int var2) {
		this.field2087 = 0;
		this.field2075 = 0;
		this.field2085 = 0;
		this.field2102 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		this.field2087 = 0;
		this.field2075 = 0;
		this.field2071 = 0;
		this.field2085 = -1;

		int var10;
		class191 var11;
		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				this.field2087 += var11.field2087;
				this.field2075 += var11.field2075;
				this.field2071 += var11.field2071;
				if (var11.field2106 != null) {
					var4 = true;
				} else {
					if (this.field2085 == -1) {
						this.field2085 = var11.field2085;
					}

					if (this.field2085 != var11.field2085) {
						var4 = true;
					}
				}

				var3 |= var11.field2079 != null;
				var5 |= var11.field2081 != null;
				var6 |= var11.field2092 != null;
				var7 |= var11.field2084 != null;
				var8 |= var11.field2082 != null;
				var9 |= var11.field2095 != null;
			}
		}

		this.field2076 = new int[this.field2087];
		this.field2073 = new int[this.field2087];
		this.field2103 = new int[this.field2087];
		this.field2074 = new int[this.field2087];
		this.field2068 = new int[this.field2075];
		this.field2077 = new int[this.field2075];
		this.field2078 = new int[this.field2075];
		if (var3) {
			this.field2079 = new byte[this.field2075];
		}

		if (var4) {
			this.field2106 = new byte[this.field2075];
		}

		if (var5) {
			this.field2081 = new byte[this.field2075];
		}

		if (var6) {
			this.field2092 = new int[this.field2075];
		}

		if (var7) {
			this.field2084 = new short[this.field2075];
		}

		if (var8) {
			this.field2082 = new byte[this.field2075];
		}

		if (var9) {
			this.field2095 = new int[this.field2087][];
			this.field2086 = new int[this.field2087][];
		}

		this.field2072 = new short[this.field2075];
		if (this.field2071 > 0) {
			this.field2101 = new byte[this.field2071];
			this.field2088 = new short[this.field2071];
			this.field2089 = new short[this.field2071];
			this.field2090 = new short[this.field2071];
		}

		this.field2087 = 0;
		this.field2075 = 0;
		this.field2071 = 0;

		for (var10 = 0; var10 < var2; ++var10) {
			var11 = var1[var10];
			if (var11 != null) {
				int var12;
				for (var12 = 0; var12 < var11.field2075; ++var12) {
					if (var3 && var11.field2079 != null) {
						this.field2079[this.field2075] = var11.field2079[var12];
					}

					if (var4) {
						if (var11.field2106 != null) {
							this.field2106[this.field2075] = var11.field2106[var12];
						} else {
							this.field2106[this.field2075] = var11.field2085;
						}
					}

					if (var5 && var11.field2081 != null) {
						this.field2081[this.field2075] = var11.field2081[var12];
					}

					if (var6 && var11.field2092 != null) {
						this.field2092[this.field2075] = var11.field2092[var12];
					}

					if (var7) {
						if (var11.field2084 != null) {
							this.field2084[this.field2075] = var11.field2084[var12];
						} else {
							this.field2084[this.field2075] = -1;
						}
					}

					if (var8) {
						if (var11.field2082 != null && var11.field2082[var12] != -1) {
							this.field2082[this.field2075] = (byte)(var11.field2082[var12] + this.field2071);
						} else {
							this.field2082[this.field2075] = -1;
						}
					}

					this.field2072[this.field2075] = var11.field2072[var12];
					this.field2068[this.field2075] = this.method3651(var11, var11.field2068[var12]);
					this.field2077[this.field2075] = this.method3651(var11, var11.field2077[var12]);
					this.field2078[this.field2075] = this.method3651(var11, var11.field2078[var12]);
					++this.field2075;
				}

				for (var12 = 0; var12 < var11.field2071; ++var12) {
					byte var13 = this.field2101[this.field2071] = var11.field2101[var12];
					if (var13 == 0) {
						this.field2088[this.field2071] = (short)this.method3651(var11, var11.field2088[var12]);
						this.field2089[this.field2071] = (short)this.method3651(var11, var11.field2089[var12]);
						this.field2090[this.field2071] = (short)this.method3651(var11, var11.field2090[var12]);
					}

					++this.field2071;
				}
			}
		}

	}

	final int method3651(class191 var1, int var2) {
		int var3 = -1;
		int var4 = var1.field2076[var2];
		int var5 = var1.field2073[var2];
		int var6 = var1.field2103[var2];

		for (int var7 = 0; var7 < this.field2087; ++var7) {
			if (var4 == this.field2076[var7] && var5 == this.field2073[var7] && var6 == this.field2103[var7]) {
				var3 = var7;
				break;
			}
		}

		if (var3 == -1) {
			this.field2076[this.field2087] = var4;
			this.field2073[this.field2087] = var5;
			this.field2103[this.field2087] = var6;
			if (var1.field2074 != null) {
				this.field2074[this.field2087] = var1.field2074[var2];
			}

			if (var1.field2095 != null) {
				this.field2095[this.field2087] = var1.field2095[var2];
				this.field2086[this.field2087] = var1.field2086[var2];
			}

			var3 = this.field2087++;
		}

		return var3;
	}

	public class191(class191 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
		this.field2087 = 0;
		this.field2075 = 0;
		this.field2085 = 0;
		this.field2102 = false;
		this.field2087 = var1.field2087;
		this.field2075 = var1.field2075;
		this.field2071 = var1.field2071;
		int var6;
		if (var2) {
			this.field2076 = var1.field2076;
			this.field2073 = var1.field2073;
			this.field2103 = var1.field2103;
		} else {
			this.field2076 = new int[this.field2087];
			this.field2073 = new int[this.field2087];
			this.field2103 = new int[this.field2087];

			for (var6 = 0; var6 < this.field2087; ++var6) {
				this.field2076[var6] = var1.field2076[var6];
				this.field2073[var6] = var1.field2073[var6];
				this.field2103[var6] = var1.field2103[var6];
			}
		}

		if (var3) {
			this.field2072 = var1.field2072;
		} else {
			this.field2072 = new short[this.field2075];

			for (var6 = 0; var6 < this.field2075; ++var6) {
				this.field2072[var6] = var1.field2072[var6];
			}
		}

		if (!var4 && var1.field2084 != null) {
			this.field2084 = new short[this.field2075];

			for (var6 = 0; var6 < this.field2075; ++var6) {
				this.field2084[var6] = var1.field2084[var6];
			}
		} else {
			this.field2084 = var1.field2084;
		}

		if (var5) {
			this.field2081 = var1.field2081;
		} else {
			this.field2081 = new byte[this.field2075];
			if (var1.field2081 == null) {
				for (var6 = 0; var6 < this.field2075; ++var6) {
					this.field2081[var6] = 0;
				}
			} else {
				for (var6 = 0; var6 < this.field2075; ++var6) {
					this.field2081[var6] = var1.field2081[var6];
				}
			}
		}

		this.field2068 = var1.field2068;
		this.field2077 = var1.field2077;
		this.field2078 = var1.field2078;
		this.field2079 = var1.field2079;
		this.field2106 = var1.field2106;
		this.field2082 = var1.field2082;
		this.field2085 = var1.field2085;
		this.field2101 = var1.field2101;
		this.field2088 = var1.field2088;
		this.field2089 = var1.field2089;
		this.field2090 = var1.field2090;
		this.field2074 = var1.field2074;
		this.field2092 = var1.field2092;
		this.field2080 = var1.field2080;
		this.field2094 = var1.field2094;
		this.field2098 = var1.field2098;
		this.field2097 = var1.field2097;
		this.field2099 = var1.field2099;
		this.field2095 = var1.field2095;
		this.field2086 = var1.field2086;
		this.field2100 = var1.field2100;
		this.field2108 = var1.field2108;
	}

	public class191 method3650() {
		class191 var1 = new class191();
		if (this.field2079 != null) {
			var1.field2079 = new byte[this.field2075];

			for (int var2 = 0; var2 < this.field2075; ++var2) {
				var1.field2079[var2] = this.field2079[var2];
			}
		}

		var1.field2087 = this.field2087;
		var1.field2075 = this.field2075;
		var1.field2071 = this.field2071;
		var1.field2076 = this.field2076;
		var1.field2073 = this.field2073;
		var1.field2103 = this.field2103;
		var1.field2068 = this.field2068;
		var1.field2077 = this.field2077;
		var1.field2078 = this.field2078;
		var1.field2106 = this.field2106;
		var1.field2081 = this.field2081;
		var1.field2082 = this.field2082;
		var1.field2072 = this.field2072;
		var1.field2084 = this.field2084;
		var1.field2085 = this.field2085;
		var1.field2101 = this.field2101;
		var1.field2088 = this.field2088;
		var1.field2089 = this.field2089;
		var1.field2090 = this.field2090;
		var1.field2074 = this.field2074;
		var1.field2092 = this.field2092;
		var1.field2080 = this.field2080;
		var1.field2094 = this.field2094;
		var1.field2098 = this.field2098;
		var1.field2097 = this.field2097;
		var1.field2100 = this.field2100;
		var1.field2108 = this.field2108;
		return var1;
	}

	public class191 method3653(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
		this.method3666();
		int var7 = var2 + this.field2112;
		int var8 = var2 + this.field2105;
		int var9 = var4 + this.field2107;
		int var10 = var4 + this.field2104;
		if (var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
			var7 >>= 7;
			var8 = var8 + 127 >> 7;
			var9 >>= 7;
			var10 = var10 + 127 >> 7;
			if (var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
				return this;
			} else {
				class191 var11;
				if (var5) {
					var11 = new class191();
					var11.field2087 = this.field2087;
					var11.field2075 = this.field2075;
					var11.field2071 = this.field2071;
					var11.field2076 = this.field2076;
					var11.field2103 = this.field2103;
					var11.field2068 = this.field2068;
					var11.field2077 = this.field2077;
					var11.field2078 = this.field2078;
					var11.field2079 = this.field2079;
					var11.field2106 = this.field2106;
					var11.field2081 = this.field2081;
					var11.field2082 = this.field2082;
					var11.field2072 = this.field2072;
					var11.field2084 = this.field2084;
					var11.field2085 = this.field2085;
					var11.field2101 = this.field2101;
					var11.field2088 = this.field2088;
					var11.field2089 = this.field2089;
					var11.field2090 = this.field2090;
					var11.field2074 = this.field2074;
					var11.field2092 = this.field2092;
					var11.field2080 = this.field2080;
					var11.field2094 = this.field2094;
					var11.field2100 = this.field2100;
					var11.field2108 = this.field2108;
					var11.field2073 = new int[var11.field2087];
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
					for (var12 = 0; var12 < var11.field2087; ++var12) {
						var13 = this.field2076[var12] + var2;
						var14 = this.field2103[var12] + var4;
						var15 = var13 & 127;
						var16 = var14 & 127;
						var17 = var13 >> 7;
						var18 = var14 >> 7;
						var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
						var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
						var21 = var19 * (128 - var16) + var20 * var16 >> 7;
						var11.field2073[var12] = this.field2073[var12] + var21 - var3;
					}
				} else {
					for (var12 = 0; var12 < var11.field2087; ++var12) {
						var13 = (-this.field2073[var12] << 16) / super.field2740;
						if (var13 < var6) {
							var14 = this.field2076[var12] + var2;
							var15 = this.field2103[var12] + var4;
							var16 = var14 & 127;
							var17 = var15 & 127;
							var18 = var14 >> 7;
							var19 = var15 >> 7;
							var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
							var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
							int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
							var11.field2073[var12] = this.field2073[var12] + (var22 - var3) * (var6 - var13) / var6;
						}
					}
				}

				var11.method3665();
				return var11;
			}
		} else {
			return this;
		}
	}

	void method3654() {
		int[] var1;
		int var2;
		int var10002;
		int var3;
		int var4;
		if (this.field2074 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2087; ++var3) {
				var4 = this.field2074[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2080 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2080[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2087; this.field2080[var4][var1[var4]++] = var3++) {
				var4 = this.field2074[var3];
			}

			this.field2074 = null;
		}

		if (this.field2092 != null) {
			var1 = new int[256];
			var2 = 0;

			for (var3 = 0; var3 < this.field2075; ++var3) {
				var4 = this.field2092[var3];
				var10002 = var1[var4]++;
				if (var4 > var2) {
					var2 = var4;
				}
			}

			this.field2094 = new int[var2 + 1][];

			for (var3 = 0; var3 <= var2; ++var3) {
				this.field2094[var3] = new int[var1[var3]];
				var1[var3] = 0;
			}

			for (var3 = 0; var3 < this.field2075; this.field2094[var4][var1[var4]++] = var3++) {
				var4 = this.field2092[var3];
			}

			this.field2092 = null;
		}

	}

	public void method3655() {
		for (int var1 = 0; var1 < this.field2087; ++var1) {
			int var2 = this.field2076[var1];
			this.field2076[var1] = this.field2103[var1];
			this.field2103[var1] = -var2;
		}

		this.method3665();
	}

	public void method3694() {
		for (int var1 = 0; var1 < this.field2087; ++var1) {
			this.field2076[var1] = -this.field2076[var1];
			this.field2103[var1] = -this.field2103[var1];
		}

		this.method3665();
	}

	public void method3657() {
		for (int var1 = 0; var1 < this.field2087; ++var1) {
			int var2 = this.field2103[var1];
			this.field2103[var1] = this.field2076[var1];
			this.field2076[var1] = -var2;
		}

		this.method3665();
	}

	public void method3658(int var1) {
		int var2 = field2111[var1];
		int var3 = field2083[var1];

		for (int var4 = 0; var4 < this.field2087; ++var4) {
			int var5 = this.field2103[var4] * var2 + this.field2076[var4] * var3 >> 16;
			this.field2103[var4] = this.field2103[var4] * var3 - this.field2076[var4] * var2 >> 16;
			this.field2076[var4] = var5;
		}

		this.method3665();
	}

	public void method3659(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2087; ++var4) {
			int[] var10000 = this.field2076;
			var10000[var4] += var1;
			var10000 = this.field2073;
			var10000[var4] += var2;
			var10000 = this.field2103;
			var10000[var4] += var3;
		}

		this.method3665();
	}

	public void method3660(short var1, short var2) {
		for (int var3 = 0; var3 < this.field2075; ++var3) {
			if (this.field2072[var3] == var1) {
				this.field2072[var3] = var2;
			}
		}

	}

	public void method3661(short var1, short var2) {
		if (this.field2084 != null) {
			for (int var3 = 0; var3 < this.field2075; ++var3) {
				if (this.field2084[var3] == var1) {
					this.field2084[var3] = var2;
				}
			}

		}
	}

	public void method3662() {
		int var1;
		for (var1 = 0; var1 < this.field2087; ++var1) {
			this.field2103[var1] = -this.field2103[var1];
		}

		for (var1 = 0; var1 < this.field2075; ++var1) {
			int var2 = this.field2068[var1];
			this.field2068[var1] = this.field2078[var1];
			this.field2078[var1] = var2;
		}

		this.method3665();
	}

	public void method3663(int var1, int var2, int var3) {
		for (int var4 = 0; var4 < this.field2087; ++var4) {
			this.field2076[var4] = this.field2076[var4] * var1 / 128;
			this.field2073[var4] = this.field2073[var4] * var2 / 128;
			this.field2103[var4] = this.field2103[var4] * var3 / 128;
		}

		this.method3665();
	}

	public void method3664() {
		if (this.field2098 == null) {
			this.field2098 = new class220[this.field2087];

			int var1;
			for (var1 = 0; var1 < this.field2087; ++var1) {
				this.field2098[var1] = new class220();
			}

			for (var1 = 0; var1 < this.field2075; ++var1) {
				int var2 = this.field2068[var1];
				int var3 = this.field2077[var1];
				int var4 = this.field2078[var1];
				int var5 = this.field2076[var3] - this.field2076[var2];
				int var6 = this.field2073[var3] - this.field2073[var2];
				int var7 = this.field2103[var3] - this.field2103[var2];
				int var8 = this.field2076[var4] - this.field2076[var2];
				int var9 = this.field2073[var4] - this.field2073[var2];
				int var10 = this.field2103[var4] - this.field2103[var2];
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
				if (this.field2079 == null) {
					var15 = 0;
				} else {
					var15 = this.field2079[var1];
				}

				if (var15 == 0) {
					class220 var16 = this.field2098[var2];
					var16.field2658 += var11;
					var16.field2661 += var12;
					var16.field2659 += var13;
					++var16.field2660;
					var16 = this.field2098[var3];
					var16.field2658 += var11;
					var16.field2661 += var12;
					var16.field2659 += var13;
					++var16.field2660;
					var16 = this.field2098[var4];
					var16.field2658 += var11;
					var16.field2661 += var12;
					var16.field2659 += var13;
					++var16.field2660;
				} else if (var15 == 1) {
					if (this.field2097 == null) {
						this.field2097 = new class234[this.field2075];
					}

					class234 var17 = this.field2097[var1] = new class234();
					var17.field2820 = var11;
					var17.field2819 = var12;
					var17.field2822 = var13;
				}
			}

		}
	}

	void method3665() {
		this.field2098 = null;
		this.field2099 = null;
		this.field2097 = null;
		this.field2102 = false;
	}

	void method3666() {
		if (!this.field2102) {
			super.field2740 = 0;
			this.field2096 = 0;
			this.field2112 = 999999;
			this.field2105 = -999999;
			this.field2104 = -99999;
			this.field2107 = 99999;

			for (int var1 = 0; var1 < this.field2087; ++var1) {
				int var2 = this.field2076[var1];
				int var3 = this.field2073[var1];
				int var4 = this.field2103[var1];
				if (var2 < this.field2112) {
					this.field2112 = var2;
				}

				if (var2 > this.field2105) {
					this.field2105 = var2;
				}

				if (var4 < this.field2107) {
					this.field2107 = var4;
				}

				if (var4 > this.field2104) {
					this.field2104 = var4;
				}

				if (-var3 > super.field2740) {
					super.field2740 = -var3;
				}

				if (var3 > this.field2096) {
					this.field2096 = var3;
				}
			}

			this.field2102 = true;
		}
	}

	static void method3667(class191 var0, class191 var1, int var2, int var3, int var4, boolean var5) {
		var0.method3666();
		var0.method3664();
		var1.method3666();
		var1.method3664();
		++field2110;
		int var6 = 0;
		int[] var7 = var1.field2076;
		int var8 = var1.field2087;

		int var9;
		for (var9 = 0; var9 < var0.field2087; ++var9) {
			class220 var10 = var0.field2098[var9];
			if (var10.field2660 != 0) {
				int var11 = var0.field2073[var9] - var3;
				if (var11 <= var1.field2096) {
					int var12 = var0.field2076[var9] - var2;
					if (var12 >= var1.field2112 && var12 <= var1.field2105) {
						int var13 = var0.field2103[var9] - var4;
						if (var13 >= var1.field2107 && var13 <= var1.field2104) {
							for (int var14 = 0; var14 < var8; ++var14) {
								class220 var15 = var1.field2098[var14];
								if (var12 == var7[var14] && var13 == var1.field2103[var14] && var11 == var1.field2073[var14] && var15.field2660 != 0) {
									if (var0.field2099 == null) {
										var0.field2099 = new class220[var0.field2087];
									}

									if (var1.field2099 == null) {
										var1.field2099 = new class220[var8];
									}

									class220 var16 = var0.field2099[var9];
									if (var16 == null) {
										var16 = var0.field2099[var9] = new class220(var10);
									}

									class220 var17 = var1.field2099[var14];
									if (var17 == null) {
										var17 = var1.field2099[var14] = new class220(var15);
									}

									var16.field2658 += var15.field2658;
									var16.field2661 += var15.field2661;
									var16.field2659 += var15.field2659;
									var16.field2660 += var15.field2660;
									var17.field2658 += var10.field2658;
									var17.field2661 += var10.field2661;
									var17.field2659 += var10.field2659;
									var17.field2660 += var10.field2660;
									++var6;
									field2093[var9] = field2110;
									field2109[var14] = field2110;
								}
							}
						}
					}
				}
			}
		}

		if (var6 >= 3 && var5) {
			for (var9 = 0; var9 < var0.field2075; ++var9) {
				if (field2093[var0.field2068[var9]] == field2110 && field2093[var0.field2077[var9]] == field2110 && field2093[var0.field2078[var9]] == field2110) {
					if (var0.field2079 == null) {
						var0.field2079 = new byte[var0.field2075];
					}

					var0.field2079[var9] = 2;
				}
			}

			for (var9 = 0; var9 < var1.field2075; ++var9) {
				if (field2109[var1.field2068[var9]] == field2110 && field2109[var1.field2077[var9]] == field2110 && field2109[var1.field2078[var9]] == field2110) {
					if (var1.field2079 == null) {
						var1.field2079 = new byte[var1.field2075];
					}

					var1.field2079[var9] = 2;
				}
			}

		}
	}

	public final class216 method3668(int var1, int var2, int var3, int var4, int var5) {
		this.method3664();
		int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
		int var7 = var2 * var6 >> 8;
		class216 var8 = new class216();
		var8.field2573 = new int[this.field2075];
		var8.field2608 = new int[this.field2075];
		var8.field2575 = new int[this.field2075];
		if (this.field2071 > 0 && this.field2082 != null) {
			int[] var9 = new int[this.field2071];

			int var10;
			for (var10 = 0; var10 < this.field2075; ++var10) {
				if (this.field2082[var10] != -1) {
					++var9[this.field2082[var10] & 255];
				}
			}

			var8.field2614 = 0;

			for (var10 = 0; var10 < this.field2071; ++var10) {
				if (var9[var10] > 0 && this.field2101[var10] == 0) {
					++var8.field2614;
				}
			}

			var8.field2569 = new int[var8.field2614];
			var8.field2583 = new int[var8.field2614];
			var8.field2584 = new int[var8.field2614];
			var10 = 0;

			int var11;
			for (var11 = 0; var11 < this.field2071; ++var11) {
				if (var9[var11] > 0 && this.field2101[var11] == 0) {
					var8.field2569[var10] = this.field2088[var11] & '\uffff';
					var8.field2583[var10] = this.field2089[var11] & '\uffff';
					var8.field2584[var10] = this.field2090[var11] & '\uffff';
					var9[var11] = var10++;
				} else {
					var9[var11] = -1;
				}
			}

			var8.field2593 = new byte[this.field2075];

			for (var11 = 0; var11 < this.field2075; ++var11) {
				if (this.field2082[var11] != -1) {
					var8.field2593[var11] = (byte)var9[this.field2082[var11] & 255];
				} else {
					var8.field2593[var11] = -1;
				}
			}
		}

		for (int var16 = 0; var16 < this.field2075; ++var16) {
			byte var17;
			if (this.field2079 == null) {
				var17 = 0;
			} else {
				var17 = this.field2079[var16];
			}

			byte var18;
			if (this.field2081 == null) {
				var18 = 0;
			} else {
				var18 = this.field2081[var16];
			}

			short var12;
			if (this.field2084 == null) {
				var12 = -1;
			} else {
				var12 = this.field2084[var16];
			}

			if (var18 == -2) {
				var17 = 3;
			}

			if (var18 == -1) {
				var17 = 2;
			}

			class220 var13;
			int var14;
			class234 var19;
			if (var12 == -1) {
				if (var17 != 0) {
					if (var17 == 1) {
						var19 = this.field2097[var16];
						var14 = var1 + (var3 * var19.field2820 + var4 * var19.field2819 + var5 * var19.field2822) / (var7 + var7 / 2);
						var8.field2573[var16] = method3669(this.field2072[var16] & '\uffff', var14);
						var8.field2575[var16] = -1;
					} else if (var17 == 3) {
						var8.field2573[var16] = 128;
						var8.field2575[var16] = -1;
					} else {
						var8.field2575[var16] = -2;
					}
				} else {
					int var15 = this.field2072[var16] & '\uffff';
					if (this.field2099 != null && this.field2099[this.field2068[var16]] != null) {
						var13 = this.field2099[this.field2068[var16]];
					} else {
						var13 = this.field2098[this.field2068[var16]];
					}

					var14 = var1 + (var3 * var13.field2658 + var4 * var13.field2661 + var5 * var13.field2659) / (var7 * var13.field2660);
					var8.field2573[var16] = method3669(var15, var14);
					if (this.field2099 != null && this.field2099[this.field2077[var16]] != null) {
						var13 = this.field2099[this.field2077[var16]];
					} else {
						var13 = this.field2098[this.field2077[var16]];
					}

					var14 = var1 + (var3 * var13.field2658 + var4 * var13.field2661 + var5 * var13.field2659) / (var7 * var13.field2660);
					var8.field2608[var16] = method3669(var15, var14);
					if (this.field2099 != null && this.field2099[this.field2078[var16]] != null) {
						var13 = this.field2099[this.field2078[var16]];
					} else {
						var13 = this.field2098[this.field2078[var16]];
					}

					var14 = var1 + (var3 * var13.field2658 + var4 * var13.field2661 + var5 * var13.field2659) / (var7 * var13.field2660);
					var8.field2575[var16] = method3669(var15, var14);
				}
			} else if (var17 != 0) {
				if (var17 == 1) {
					var19 = this.field2097[var16];
					var14 = var1 + (var3 * var19.field2820 + var4 * var19.field2819 + var5 * var19.field2822) / (var7 + var7 / 2);
					var8.field2573[var16] = method3670(var14);
					var8.field2575[var16] = -1;
				} else {
					var8.field2575[var16] = -2;
				}
			} else {
				if (this.field2099 != null && this.field2099[this.field2068[var16]] != null) {
					var13 = this.field2099[this.field2068[var16]];
				} else {
					var13 = this.field2098[this.field2068[var16]];
				}

				var14 = var1 + (var3 * var13.field2658 + var4 * var13.field2661 + var5 * var13.field2659) / (var7 * var13.field2660);
				var8.field2573[var16] = method3670(var14);
				if (this.field2099 != null && this.field2099[this.field2077[var16]] != null) {
					var13 = this.field2099[this.field2077[var16]];
				} else {
					var13 = this.field2098[this.field2077[var16]];
				}

				var14 = var1 + (var3 * var13.field2658 + var4 * var13.field2661 + var5 * var13.field2659) / (var7 * var13.field2660);
				var8.field2608[var16] = method3670(var14);
				if (this.field2099 != null && this.field2099[this.field2078[var16]] != null) {
					var13 = this.field2099[this.field2078[var16]];
				} else {
					var13 = this.field2098[this.field2078[var16]];
				}

				var14 = var1 + (var3 * var13.field2658 + var4 * var13.field2661 + var5 * var13.field2659) / (var7 * var13.field2660);
				var8.field2575[var16] = method3670(var14);
			}
		}

		this.method3654();
		var8.field2565 = this.field2087;
		var8.field2592 = this.field2076;
		var8.field2599 = this.field2073;
		var8.field2615 = this.field2103;
		var8.field2607 = this.field2075;
		var8.field2582 = this.field2068;
		var8.field2578 = this.field2077;
		var8.field2572 = this.field2078;
		var8.field2618 = this.field2106;
		var8.field2606 = this.field2081;
		var8.field2580 = this.field2085;
		var8.field2585 = this.field2080;
		var8.field2586 = this.field2094;
		var8.field2605 = this.field2084;
		var8.field2587 = this.field2095;
		var8.field2588 = this.field2086;
		return var8;
	}

	static final int method3669(int var0, int var1) {
		var1 = var1 * (var0 & 127) >> 7;
		if (var1 < 2) {
			var1 = 2;
		} else if (var1 > 126) {
			var1 = 126;
		}

		return (var0 & 65408) + var1;
	}

	static final int method3670(int var0) {
		if (var0 < 2) {
			var0 = 2;
		} else if (var0 > 126) {
			var0 = 126;
		}

		return var0;
	}
}
