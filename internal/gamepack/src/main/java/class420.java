import io.spectralpowered.ObfInfo;
import java.util.Random;

@ObfInfo(
	name = "ne"
)
public abstract class class420 extends class162 {
	@ObfInfo(
		owner = "ne",
		name = "b",
		desc = "[Lra;"
	)
	public static class344[] field3443;
	@ObfInfo(
		owner = "ne",
		name = "t",
		desc = "I"
	)
	static int field3434;
	@ObfInfo(
		owner = "ne",
		name = "o",
		desc = "I"
	)
	static int field3440;
	@ObfInfo(
		owner = "ne",
		name = "g",
		desc = "I"
	)
	static int field3445;
	@ObfInfo(
		owner = "ne",
		name = "s",
		desc = "I"
	)
	static int field3446;
	@ObfInfo(
		owner = "ne",
		name = "a",
		desc = "I"
	)
	static int field3447;
	@ObfInfo(
		owner = "ne",
		name = "n",
		desc = "I"
	)
	static int field3448;
	@ObfInfo(
		owner = "ne",
		name = "k",
		desc = "I"
	)
	static int field3449;
	@ObfInfo(
		owner = "ne",
		name = "i",
		desc = "I"
	)
	static int field3451;
	@ObfInfo(
		owner = "ne",
		name = "l",
		desc = "I"
	)
	static int field3453;
	@ObfInfo(
		owner = "ne",
		name = "p",
		desc = "[Ljava/lang/String;"
	)
	static String[] field3455;
	@ObfInfo(
		owner = "ne",
		name = "c",
		desc = "Ljava/util/Random;"
	)
	static Random field3454;
	@ObfInfo(
		owner = "ne",
		name = "j",
		desc = "[B"
	)
	byte[] field3444;
	@ObfInfo(
		owner = "ne",
		name = "h",
		desc = "[[B"
	)
	byte[][] field3435;
	@ObfInfo(
		owner = "ne",
		name = "v",
		desc = "[I"
	)
	int[] field3436;
	@ObfInfo(
		owner = "ne",
		name = "x",
		desc = "[I"
	)
	int[] field3437;
	@ObfInfo(
		owner = "ne",
		name = "m",
		desc = "[I"
	)
	int[] field3438;
	@ObfInfo(
		owner = "ne",
		name = "q",
		desc = "[I"
	)
	int[] field3439;
	@ObfInfo(
		owner = "ne",
		name = "e",
		desc = "[I"
	)
	int[] field3450;
	@ObfInfo(
		owner = "ne",
		name = "r",
		desc = "I"
	)
	public int field3441;
	@ObfInfo(
		owner = "ne",
		name = "f",
		desc = "I"
	)
	public int field3442;
	@ObfInfo(
		owner = "ne",
		name = "u",
		desc = "I"
	)
	public int field3452;

	static {
		field3445 = -1;
		field3451 = -1;
		field3440 = -1;
		field3448 = -1;
		field3449 = 0;
		field3447 = 0;
		field3446 = 256;
		field3453 = 0;
		field3434 = 0;
		field3454 = new Random();
		field3455 = new String[100];
	}

	@ObfInfo(
		owner = "ne",
		name = "<init>",
		desc = "([B[I[I[I[I[I[[B)V"
	)
	class420(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field3435 = new byte[256][];
		this.field3442 = 0;
		this.field3438 = var2;
		this.field3439 = var3;
		this.field3436 = var4;
		this.field3437 = var5;
		this.method2019(var1);
		this.field3435 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field3439[var10] < var8 && this.field3437[var10] != 0) {
				var8 = this.field3439[var10];
			}

			if (this.field3439[var10] + this.field3437[var10] > var9) {
				var9 = this.field3439[var10] + this.field3437[var10];
			}
		}

		this.field3441 = this.field3442 - var8;
		this.field3452 = var9 - this.field3442;
	}

	@ObfInfo(
		owner = "ne",
		name = "<init>",
		desc = "([B)V"
	)
	class420(byte[] var1) {
		this.field3435 = new byte[256][];
		this.field3442 = 0;
		this.method2019(var1);
	}

	@ObfInfo(
		owner = "ne",
		name = "h",
		desc = "([BIIIII)V"
	)
	abstract void method2035(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfInfo(
		owner = "ne",
		name = "e",
		desc = "([BIIIIII)V"
	)
	abstract void method2036(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfInfo(
		owner = "ne",
		name = "m",
		desc = "([B)V"
	)
	void method2019(byte[] var1) {
		this.field3450 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field3450.length; ++var2) {
				this.field3450[var2] = var1[var2] & 255;
			}

			this.field3442 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var10 = 0; var10 < 256; ++var10) {
				this.field3450[var10] = var1[var2++] & 255;
			}

			int[] var3 = new int[256];
			int[] var4 = new int[256];

			int var5;
			for (var5 = 0; var5 < 256; ++var5) {
				var3[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) {
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][];

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) {
				var11[var6] = new byte[var3[var6]];
				byte var7 = 0;

				for (var8 = 0; var8 < var11[var6].length; ++var8) {
					var7 += var1[var2++];
					var11[var6][var8] = var7;
				}
			}

			byte[][] var12 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var12[var13] = new byte[var3[var13]];
				byte var14 = 0;

				for (int var9 = 0; var9 < var12[var13].length; ++var9) {
					var14 += var1[var2++];
					var12[var13][var9] = var14;
				}
			}

			this.field3444 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field3444[(var13 << 8) + var8] = (byte)method2040(var11, var12, var4, this.field3450, var3, var13, var8);
						}
					}
				}
			}

			this.field3442 = var4[32] + var3[32];
		}

	}

	@ObfInfo(
		owner = "ne",
		name = "f",
		desc = "(C)I"
	)
	public int method2020(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.field3450[class72.method315(var1) & 255];
	}

	@ObfInfo(
		owner = "ne",
		name = "r",
		desc = "(Ljava/lang/String;)I"
	)
	public int method2045(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == '<') {
					var2 = var5;
				} else {
					if (var6 == '>' && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = '<';
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = class322.method1651(var7.substring(4));
										var4 += field3443[var8].field2756;
										var3 = -1;
									} catch (Exception var10) {
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) {
						var6 = ' ';
					}

					if (var2 == -1) {
						var4 += this.field3450[(char)(class72.method315(var6) & 255)];
						if (this.field3444 != null && var3 != -1) {
							var4 += this.field3444[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "u",
		desc = "(Ljava/lang/String;[I[Ljava/lang/String;)I"
	)
	public int method2022(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += this.method2020('<');
							if (this.field3444 != null && var11 != -1) {
								var4 += this.field3444[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method2020('>');
							if (this.field3444 != null && var11 != -1) {
								var4 += this.field3444[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = class322.method1651(var16.substring(4));
								var4 += field3443[var17].field2756;
								var11 = 0;
							} catch (Exception var20) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method2020(var15);
							if (this.field3444 != null && var11 != -1) {
								var4 += this.field3444[(var11 << '\b') + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var19 = var6.toString();
			if (var19.length() > var5) {
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12;
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "b",
		desc = "(Ljava/lang/String;I)I"
	)
	public int method2023(String var1, int var2) {
		int var3 = this.method2022(var1, new int[]{var2}, field3455);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method2045(field3455[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfInfo(
		owner = "ne",
		name = "j",
		desc = "(Ljava/lang/String;I)I"
	)
	public int method2024(String var1, int var2) {
		return this.method2022(var1, new int[]{var2}, field3455);
	}

	@ObfInfo(
		owner = "ne",
		name = "i",
		desc = "(IILjava/lang/String;II)Lok;"
	)
	public class376 method2030(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.method2045(var3) / 2;
			var6 += this.method2045(var3.substring(0, var1));
			int var7 = var5 - this.field3441;
			int var8 = this.method2045(var3.substring(var1, var1 + var2));
			int var9 = this.field3441 + this.field3452;
			return new class376(var6, var7, var8, var9);
		} else {
			return new class376(var4, var5, 0, 0);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "o",
		desc = "(Ljava/lang/String;IIII)V"
	)
	public void method2025(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method2032(var4, var5);
			this.method2037(var1, var2, var3);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "n",
		desc = "(Ljava/lang/String;IIIII)V"
	)
	public void method2046(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method2032(var4, var5);
			field3446 = var6;
			this.method2037(var1, var2, var3);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "k",
		desc = "(Ljava/lang/String;IIII)V"
	)
	public void method2026(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method2032(var4, var5);
			this.method2037(var1, var2 - this.method2045(var1), var3);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "a",
		desc = "(Ljava/lang/String;IIII)V"
	)
	public void method2027(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method2032(var4, var5);
			this.method2037(var1, var2 - this.method2045(var1) / 2, var3);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "s",
		desc = "(Ljava/lang/String;IIIIIIIII)I"
	)
	public int method2028(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (var1 == null) {
			return 0;
		} else {
			this.method2032(var6, var7);
			if (var10 == 0) {
				var10 = this.field3442;
			}

			int[] var11 = new int[]{var4};
			if (var5 < this.field3441 + this.field3452 + var10 && var5 < var10 + var10) {
				var11 = null;
			}

			int var12 = this.method2022(var1, var11, field3455);
			if (var9 == 3 && var12 == 1) {
				var9 = 1;
			}

			int var13;
			int var14;
			if (var9 == 0) {
				var13 = var3 + this.field3441;
			} else if (var9 == 1) {
				var13 = var3 + this.field3441 + (var5 - this.field3441 - this.field3452 - (var12 - 1) * var10) / 2;
			} else if (var9 == 2) {
				var13 = var3 + var5 - this.field3452 - (var12 - 1) * var10;
			} else {
				var14 = (var5 - this.field3441 - this.field3452 - (var12 - 1) * var10) / (var12 + 1);
				if (var14 < 0) {
					var14 = 0;
				}

				var13 = var3 + this.field3441 + var14;
				var10 += var14;
			}

			for (var14 = 0; var14 < var12; ++var14) {
				if (var8 == 0) {
					this.method2037(field3455[var14], var2, var13);
				} else if (var8 == 1) {
					this.method2037(field3455[var14], var2 + (var4 - this.method2045(field3455[var14])) / 2, var13);
				} else if (var8 == 2) {
					this.method2037(field3455[var14], var2 + var4 - this.method2045(field3455[var14]), var13);
				} else if (var14 == var12 - 1) {
					this.method2037(field3455[var14], var2, var13);
				} else {
					this.method2048(field3455[var14], var4);
					this.method2037(field3455[var14], var2, var13);
					field3453 = 0;
				}

				var13 += var10;
			}

			return var12;
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "l",
		desc = "(Lna;IIIII)Lpg;"
	)
	public class296 method2029(class239 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method1035()) {
			this.method2032(var4, var5);
			var3 -= this.field3442;

			for (int var7 = 0; var7 < var1.method1039(); ++var7) {
				class45 var8 = var1.method1038(var7);
				if (var6 != -1 && var8.field545 > var6) {
					return new class296(var8.field546, var8.field545);
				}

				char var9 = var8.field544;
				if (var9 != '\n') {
					if (var1.method1034(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.field546;
						int var11 = var3 + var8.field545;
						int var12 = this.field3436[var9];
						int var13 = this.field3437[var9];
						if (field3448 != -1) {
							this.method2035(this.field3435[var9], var10 + this.field3438[var9] + 1, var11 + this.field3439[var9] + 1, var12, var13, field3448);
						}

						this.method2035(this.field3435[var9], var10 + this.field3438[var9], var11 + this.field3439[var9], var12, var13, field3447);
					}
				}
			}
		}

		return var1.method1037();
	}

	@ObfInfo(
		owner = "ne",
		name = "t",
		desc = "(Ljava/lang/String;IIIII)V"
	)
	public void method2021(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method2032(var4, var5);
			int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8) {
				var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method2034(var1, var2 - this.method2045(var1) / 2, var3, (int[])null, var7);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "c",
		desc = "(Ljava/lang/String;IIIII)V"
	)
	public void method2047(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method2032(var4, var5);
			int[] var7 = new int[var1.length()];
			int[] var8 = new int[var1.length()];

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
				var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method2034(var1, var2 - this.method2045(var1) / 2, var3, var7, var8);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "p",
		desc = "(Ljava/lang/String;IIIIII)V"
	)
	public void method2044(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			this.method2032(var4, var5);
			double var8 = 7.0D - (double)var7 / 8.0D;
			if (var8 < 0.0D) {
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
			}

			this.method2034(var1, var2 - this.method2045(var1) / 2, var3, (int[])null, var10);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "d",
		desc = "(Ljava/lang/String;IIIII)V"
	)
	public void method2031(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method2032(var4, var5);
			field3454.setSeed((long)var6);
			field3446 = 192 + (field3454.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field3454.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method2034(var1, var2, var3, var7, (int[])null);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "y",
		desc = "(II)V"
	)
	void method2032(int var1, int var2) {
		field3445 = -1;
		field3451 = -1;
		field3440 = var2;
		field3448 = var2;
		field3449 = var1;
		field3447 = var1;
		field3446 = 256;
		field3453 = 0;
		field3434 = 0;
	}

	@ObfInfo(
		owner = "ne",
		name = "z",
		desc = "(Ljava/lang/String;)V"
	)
	void method2033(String var1) {
		try {
			if (var1.startsWith("col=")) {
				field3447 = class396.method1951(var1.substring(4), 16);
			} else if (var1.equals("/col")) {
				field3447 = field3449;
			} else if (var1.startsWith("str=")) {
				field3445 = class396.method1951(var1.substring(4), 16);
			} else if (var1.equals("str")) {
				field3445 = 8388608;
			} else if (var1.equals("/str")) {
				field3445 = -1;
			} else if (var1.startsWith("u=")) {
				field3451 = class396.method1951(var1.substring(2), 16);
			} else if (var1.equals("u")) {
				field3451 = 0;
			} else if (var1.equals("/u")) {
				field3451 = -1;
			} else if (var1.startsWith("shad=")) {
				field3448 = class396.method1951(var1.substring(5), 16);
			} else if (var1.equals("shad")) {
				field3448 = 0;
			} else if (var1.equals("/shad")) {
				field3448 = field3440;
			} else if (var1.equals("br")) {
				this.method2032(field3449, field3440);
			}
		} catch (Exception var3) {
		}

	}

	@ObfInfo(
		owner = "ne",
		name = "w",
		desc = "(Ljava/lang/String;I)V"
	)
	void method2048(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				++var3;
			}
		}

		if (var3 > 0) {
			field3453 = (var2 - this.method2045(var1) << 8) / var3;
		}

	}

	@ObfInfo(
		owner = "ne",
		name = "as",
		desc = "(Ljava/lang/String;II)V"
	)
	void method2037(String var1, int var2, int var3) {
		var3 -= this.field3442;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(class72.method315(var1.charAt(var6)) & 255);
				if (var7 == '<') {
					var4 = var6;
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = '<';
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										var9 = class322.method1651(var8.substring(4));
										class344 var10 = field3443[var9];
										var10.method1745(var2, var3 + this.field3442 - var10.field2759);
										var2 += var10.field2756;
										var5 = -1;
									} catch (Exception var14) {
									}
								} else {
									this.method2033(var8);
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) {
						var7 = ' ';
					}

					if (var4 == -1) {
						if (this.field3444 != null && var5 != -1) {
							var2 += this.field3444[(var5 << 8) + var7];
						}

						int var12 = this.field3436[var7];
						var9 = this.field3437[var7];
						if (var7 != ' ') {
							if (field3446 == 256) {
								if (field3448 != -1) {
									method2041(this.field3435[var7], var2 + this.field3438[var7] + 1, var3 + this.field3439[var7] + 1, var12, var9, field3448);
								}

								this.method2035(this.field3435[var7], var2 + this.field3438[var7], var3 + this.field3439[var7], var12, var9, field3447);
							} else {
								if (field3448 != -1) {
									method2039(this.field3435[var7], var2 + this.field3438[var7] + 1, var3 + this.field3439[var7] + 1, var12, var9, field3448, field3446);
								}

								this.method2036(this.field3435[var7], var2 + this.field3438[var7], var3 + this.field3439[var7], var12, var9, field3447, field3446);
							}
						} else if (field3453 > 0) {
							field3434 += field3453;
							var2 += field3434 >> 8;
							field3434 &= 255;
						}

						int var13 = this.field3450[var7];
						if (field3445 != -1) {
							method752(var2, var3 + (int)((double)this.field3442 * 0.7D), var13, field3445);
						}

						if (field3451 != -1) {
							method752(var2, var3 + this.field3442 + 1, var13, field3451);
						}

						var2 += var13;
						var5 = var7;
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "ne",
		name = "ad",
		desc = "(Ljava/lang/String;II[I[I)V"
	)
	void method2034(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.field3442;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); ++var9) {
			if (var1.charAt(var9) != 0) {
				char var10 = (char)(class72.method315(var1.charAt(var9)) & 255);
				if (var10 == '<') {
					var6 = var9;
				} else {
					int var12;
					int var13;
					int var14;
					if (var10 == '>' && var6 != -1) {
						String var11 = var1.substring(var6 + 1, var9);
						var6 = -1;
						if (var11.equals("lt")) {
							var10 = '<';
						} else {
							if (!var11.equals("gt")) {
								if (var11.startsWith("img=")) {
									try {
										if (var4 != null) {
											var12 = var4[var8];
										} else {
											var12 = 0;
										}

										if (var5 != null) {
											var13 = var5[var8];
										} else {
											var13 = 0;
										}

										++var8;
										var14 = class322.method1651(var11.substring(4));
										class344 var15 = field3443[var14];
										var15.method1745(var2 + var12, var3 + this.field3442 - var15.field2759 + var13);
										var2 += var15.field2756;
										var7 = -1;
									} catch (Exception var19) {
									}
								} else {
									this.method2033(var11);
								}
								continue;
							}

							var10 = '>';
						}
					}

					if (var10 == 160) {
						var10 = ' ';
					}

					if (var6 == -1) {
						if (this.field3444 != null && var7 != -1) {
							var2 += this.field3444[(var7 << 8) + var10];
						}

						int var17 = this.field3436[var10];
						var12 = this.field3437[var10];
						if (var4 != null) {
							var13 = var4[var8];
						} else {
							var13 = 0;
						}

						if (var5 != null) {
							var14 = var5[var8];
						} else {
							var14 = 0;
						}

						++var8;
						if (var10 != ' ') {
							if (field3446 == 256) {
								if (field3448 != -1) {
									method2041(this.field3435[var10], var2 + this.field3438[var10] + 1 + var13, var3 + this.field3439[var10] + 1 + var14, var17, var12, field3448);
								}

								this.method2035(this.field3435[var10], var2 + this.field3438[var10] + var13, var3 + this.field3439[var10] + var14, var17, var12, field3447);
							} else {
								if (field3448 != -1) {
									method2039(this.field3435[var10], var2 + this.field3438[var10] + 1 + var13, var3 + this.field3439[var10] + 1 + var14, var17, var12, field3448, field3446);
								}

								this.method2036(this.field3435[var10], var2 + this.field3438[var10] + var13, var3 + this.field3439[var10] + var14, var17, var12, field3447, field3446);
							}
						} else if (field3453 > 0) {
							field3434 += field3453;
							var2 += field3434 >> 8;
							field3434 &= 255;
						}

						int var18 = this.field3450[var10];
						if (field3445 != -1) {
							method752(var2, var3 + (int)((double)this.field3442 * 0.7D), var18, field3445);
						}

						if (field3451 != -1) {
							method752(var2, var3 + this.field3442, var18, field3451);
						}

						var2 += var18;
						var7 = var10;
					}
				}
			}
		}

	}

	@ObfInfo(
		owner = "ne",
		name = "q",
		desc = "([[B[[B[I[I[III)I"
	)
	static int method2040(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; ++var18) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	@ObfInfo(
		owner = "ne",
		name = "g",
		desc = "(Ljava/lang/String;)Ljava/lang/String;"
	)
	public static String method2042(String var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; ++var7) {
			char var5 = var0.charAt(var7);
			if (var5 == '<') {
				var6.append("<lt>");
			} else if (var5 == '>') {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	@ObfInfo(
		owner = "ne",
		name = "ao",
		desc = "([BIIIII)V"
	)
	static void method2041(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * class162.field1232;
		int var7 = class162.field1232 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < class162.field1234) {
			var10 = class162.field1234 - var2;
			var4 -= var10;
			var2 = class162.field1234;
			var9 += var10 * var3;
			var6 += var10 * class162.field1232;
		}

		if (var2 + var4 > class162.field1235) {
			var4 -= var2 + var4 - class162.field1235;
		}

		if (var1 < class162.field1236) {
			var10 = class162.field1236 - var1;
			var3 -= var10;
			var1 = class162.field1236;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (var1 + var3 > class162.field1237) {
			var10 = var1 + var3 - class162.field1237;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method2038(class162.field1233, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "am",
		desc = "([I[BIIIIIII)V"
	)
	static void method2038(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	@ObfInfo(
		owner = "ne",
		name = "av",
		desc = "([BIIIIII)V"
	)
	static void method2039(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * class162.field1232;
		int var8 = class162.field1232 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < class162.field1234) {
			var11 = class162.field1234 - var2;
			var4 -= var11;
			var2 = class162.field1234;
			var10 += var11 * var3;
			var7 += var11 * class162.field1232;
		}

		if (var2 + var4 > class162.field1235) {
			var4 -= var2 + var4 - class162.field1235;
		}

		if (var1 < class162.field1236) {
			var11 = class162.field1236 - var1;
			var3 -= var11;
			var1 = class162.field1236;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var1 + var3 > class162.field1237) {
			var11 = var1 + var3 - class162.field1237;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			method2043(class162.field1233, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfInfo(
		owner = "ne",
		name = "au",
		desc = "([I[BIIIIIIII)V"
	)
	static void method2043(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 65280) * var9 & 16711680) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 65280) * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}
}
