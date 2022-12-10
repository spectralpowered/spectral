import java.util.Random;

public abstract class class369 extends class478 {
	public static class469[] field4393;
	static int field4384;
	static int field4390;
	static int field4395;
	static int field4396;
	static int field4397;
	static int field4398;
	static int field4399;
	static int field4401;
	static int field4403;
	static String[] field4405;
	static Random field4404;
	byte[] field4394;
	byte[][] field4385;
	int[] field4386;
	int[] field4387;
	int[] field4388;
	int[] field4389;
	int[] field4400;
	public int field4391;
	public int field4392;
	public int field4402;

	static {
		field4395 = -1;
		field4401 = -1;
		field4390 = -1;
		field4398 = -1;
		field4399 = 0;
		field4397 = 0;
		field4396 = 256;
		field4403 = 0;
		field4384 = 0;
		field4404 = new Random();
		field4405 = new String[100];
	}

	class369(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field4385 = new byte[256][];
		this.field4392 = 0;
		this.field4388 = var2;
		this.field4389 = var3;
		this.field4386 = var4;
		this.field4387 = var5;
		this.method6846(var1);
		this.field4385 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field4389[var10] < var8 && this.field4387[var10] != 0) {
				var8 = this.field4389[var10];
			}

			if (this.field4389[var10] + this.field4387[var10] > var9) {
				var9 = this.field4389[var10] + this.field4387[var10];
			}
		}

		this.field4391 = this.field4392 - var8;
		this.field4402 = var9 - this.field4392;
	}

	class369(byte[] var1) {
		this.field4385 = new byte[256][];
		this.field4392 = 0;
		this.method6846(var1);
	}

	void method6846(byte[] var1) {
		this.field4400 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field4400.length; ++var2) {
				this.field4400[var2] = var1[var2] & 255;
			}

			this.field4392 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var10 = 0; var10 < 256; ++var10) {
				this.field4400[var10] = var1[var2++] & 255;
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

			this.field4394 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field4394[(var13 << 8) + var8] = (byte)method6879(var11, var12, var4, this.field4400, var3, var13, var8);
						}
					}
				}
			}

			this.field4392 = var4[32] + var3[32];
		}

	}

	static int method6879(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
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

	public int method6848(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.field4400[class302.method6078(var1) & 255];
	}

	public int method6901(String var1) {
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
										int var8 = class341.method7671(var7.substring(4));
										var4 += field4393[var8].field4926;
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
						var4 += this.field4400[(char)(class302.method6078(var6) & 255)];
						if (this.field4394 != null && var3 != -1) {
							var4 += this.field4394[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	public int method6850(String var1, int[] var2, String[] var3) {
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
							var4 += this.method6848('<');
							if (this.field4394 != null && var11 != -1) {
								var4 += this.field4394[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method6848('>');
							if (this.field4394 != null && var11 != -1) {
								var4 += this.field4394[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = class341.method7671(var16.substring(4));
								var4 += field4393[var17].field4926;
								var11 = 0;
							} catch (Exception var20) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method6848(var15);
							if (this.field4394 != null && var11 != -1) {
								var4 += this.field4394[(var11 << '\b') + var15];
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

	public int method6851(String var1, int var2) {
		int var3 = this.method6850(var1, new int[]{var2}, field4405);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method6901(field4405[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	public int method6852(String var1, int var2) {
		return this.method6850(var1, new int[]{var2}, field4405);
	}

	public static String method6886(String var0) {
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

	public class401 method6862(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.method6901(var3) / 2;
			var6 += this.method6901(var3.substring(0, var1));
			int var7 = var5 - this.field4391;
			int var8 = this.method6901(var3.substring(var1, var1 + var2));
			int var9 = this.field4391 + this.field4402;
			return new class401(var6, var7, var8, var9);
		} else {
			return new class401(var4, var5, 0, 0);
		}
	}

	public void method6854(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method6864(var4, var5);
			this.method6871(var1, var2, var3);
		}
	}

	public void method6904(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method6864(var4, var5);
			field4396 = var6;
			this.method6871(var1, var2, var3);
		}
	}

	public void method6856(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method6864(var4, var5);
			this.method6871(var1, var2 - this.method6901(var1), var3);
		}
	}

	public void method6857(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method6864(var4, var5);
			this.method6871(var1, var2 - this.method6901(var1) / 2, var3);
		}
	}

	public int method6858(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		if (var1 == null) {
			return 0;
		} else {
			this.method6864(var6, var7);
			if (var10 == 0) {
				var10 = this.field4392;
			}

			int[] var11 = new int[]{var4};
			if (var5 < this.field4391 + this.field4402 + var10 && var5 < var10 + var10) {
				var11 = null;
			}

			int var12 = this.method6850(var1, var11, field4405);
			if (var9 == 3 && var12 == 1) {
				var9 = 1;
			}

			int var13;
			int var14;
			if (var9 == 0) {
				var13 = var3 + this.field4391;
			} else if (var9 == 1) {
				var13 = var3 + this.field4391 + (var5 - this.field4391 - this.field4402 - (var12 - 1) * var10) / 2;
			} else if (var9 == 2) {
				var13 = var3 + var5 - this.field4402 - (var12 - 1) * var10;
			} else {
				var14 = (var5 - this.field4391 - this.field4402 - (var12 - 1) * var10) / (var12 + 1);
				if (var14 < 0) {
					var14 = 0;
				}

				var13 = var3 + this.field4391 + var14;
				var10 += var14;
			}

			for (var14 = 0; var14 < var12; ++var14) {
				if (var8 == 0) {
					this.method6871(field4405[var14], var2, var13);
				} else if (var8 == 1) {
					this.method6871(field4405[var14], var2 + (var4 - this.method6901(field4405[var14])) / 2, var13);
				} else if (var8 == 2) {
					this.method6871(field4405[var14], var2 + var4 - this.method6901(field4405[var14]), var13);
				} else if (var14 == var12 - 1) {
					this.method6871(field4405[var14], var2, var13);
				} else {
					this.method6931(field4405[var14], var4);
					this.method6871(field4405[var14], var2, var13);
					field4403 = 0;
				}

				var13 += var10;
			}

			return var12;
		}
	}

	public class423 method6859(class365 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method6785()) {
			this.method6864(var4, var5);
			var3 -= this.field4392;

			for (int var7 = 0; var7 < var1.method6803(); ++var7) {
				class380 var8 = var1.method6790(var7);
				if (var6 != -1 && var8.field4466 > var6) {
					return new class423(var8.field4467, var8.field4466);
				}

				char var9 = var8.field4464;
				if (var9 != '\n') {
					if (var1.method6784(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.field4467;
						int var11 = var3 + var8.field4466;
						int var12 = this.field4386[var9];
						int var13 = this.field4387[var9];
						if (field4398 != -1) {
							this.method6869(this.field4385[var9], var10 + this.field4388[var9] + 1, var11 + this.field4389[var9] + 1, var12, var13, field4398);
						}

						this.method6869(this.field4385[var9], var10 + this.field4388[var9], var11 + this.field4389[var9], var12, var13, field4397);
					}
				}
			}
		}

		return var1.method6789();
	}

	public void method6849(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method6864(var4, var5);
			int[] var7 = new int[var1.length()];

			for (int var8 = 0; var8 < var1.length(); ++var8) {
				var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method6868(var1, var2 - this.method6901(var1) / 2, var3, (int[])null, var7);
		}
	}

	public void method6927(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method6864(var4, var5);
			int[] var7 = new int[var1.length()];
			int[] var8 = new int[var1.length()];

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
				var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method6868(var1, var2 - this.method6901(var1) / 2, var3, var7, var8);
		}
	}

	public void method6900(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var1 != null) {
			this.method6864(var4, var5);
			double var8 = 7.0D - (double)var7 / 8.0D;
			if (var8 < 0.0D) {
				var8 = 0.0D;
			}

			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
			}

			this.method6868(var1, var2 - this.method6901(var1) / 2, var3, (int[])null, var10);
		}
	}

	public void method6863(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method6864(var4, var5);
			field4404.setSeed((long)var6);
			field4396 = 192 + (field4404.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field4404.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method6868(var1, var2, var3, var7, (int[])null);
		}
	}

	void method6864(int var1, int var2) {
		field4395 = -1;
		field4401 = -1;
		field4390 = var2;
		field4398 = var2;
		field4399 = var1;
		field4397 = var1;
		field4396 = 256;
		field4403 = 0;
		field4384 = 0;
	}

	void method6865(String var1) {
		try {
			if (var1.startsWith("col=")) {
				field4397 = class341.method2882(var1.substring(4), 16);
			} else if (var1.equals("/col")) {
				field4397 = field4399;
			} else if (var1.startsWith("str=")) {
				field4395 = class341.method2882(var1.substring(4), 16);
			} else if (var1.equals("str")) {
				field4395 = 8388608;
			} else if (var1.equals("/str")) {
				field4395 = -1;
			} else if (var1.startsWith("u=")) {
				field4401 = class341.method2882(var1.substring(2), 16);
			} else if (var1.equals("u")) {
				field4401 = 0;
			} else if (var1.equals("/u")) {
				field4401 = -1;
			} else if (var1.startsWith("shad=")) {
				field4398 = class341.method2882(var1.substring(5), 16);
			} else if (var1.equals("shad")) {
				field4398 = 0;
			} else if (var1.equals("/shad")) {
				field4398 = field4390;
			} else if (var1.equals("br")) {
				this.method6864(field4399, field4390);
			}
		} catch (Exception var3) {
		}

	}

	void method6931(String var1, int var2) {
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
			field4403 = (var2 - this.method6901(var1) << 8) / var3;
		}

	}

	void method6871(String var1, int var2, int var3) {
		var3 -= this.field4392;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(class302.method6078(var1.charAt(var6)) & 255);
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
										var9 = class341.method7671(var8.substring(4));
										class469 var10 = field4393[var9];
										var10.method8587(var2, var3 + this.field4392 - var10.field4929);
										var2 += var10.field4926;
										var5 = -1;
									} catch (Exception var14) {
									}
								} else {
									this.method6865(var8);
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
						if (this.field4394 != null && var5 != -1) {
							var2 += this.field4394[(var5 << 8) + var7];
						}

						int var12 = this.field4386[var7];
						var9 = this.field4387[var7];
						if (var7 != ' ') {
							if (field4396 == 256) {
								if (field4398 != -1) {
									method6883(this.field4385[var7], var2 + this.field4388[var7] + 1, var3 + this.field4389[var7] + 1, var12, var9, field4398);
								}

								this.method6869(this.field4385[var7], var2 + this.field4388[var7], var3 + this.field4389[var7], var12, var9, field4397);
							} else {
								if (field4398 != -1) {
									method6873(this.field4385[var7], var2 + this.field4388[var7] + 1, var3 + this.field4389[var7] + 1, var12, var9, field4398, field4396);
								}

								this.method6870(this.field4385[var7], var2 + this.field4388[var7], var3 + this.field4389[var7], var12, var9, field4397, field4396);
							}
						} else if (field4403 > 0) {
							field4384 += field4403;
							var2 += field4384 >> 8;
							field4384 &= 255;
						}

						int var13 = this.field4400[var7];
						if (field4395 != -1) {
							method8686(var2, var3 + (int)((double)this.field4392 * 0.7D), var13, field4395);
						}

						if (field4401 != -1) {
							method8686(var2, var3 + this.field4392 + 1, var13, field4401);
						}

						var2 += var13;
						var5 = var7;
					}
				}
			}
		}

	}

	void method6868(String var1, int var2, int var3, int[] var4, int[] var5) {
		var3 -= this.field4392;
		int var6 = -1;
		int var7 = -1;
		int var8 = 0;

		for (int var9 = 0; var9 < var1.length(); ++var9) {
			if (var1.charAt(var9) != 0) {
				char var10 = (char)(class302.method6078(var1.charAt(var9)) & 255);
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
										var14 = class341.method7671(var11.substring(4));
										class469 var15 = field4393[var14];
										var15.method8587(var2 + var12, var3 + this.field4392 - var15.field4929 + var13);
										var2 += var15.field4926;
										var7 = -1;
									} catch (Exception var19) {
									}
								} else {
									this.method6865(var11);
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
						if (this.field4394 != null && var7 != -1) {
							var2 += this.field4394[(var7 << 8) + var10];
						}

						int var17 = this.field4386[var10];
						var12 = this.field4387[var10];
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
							if (field4396 == 256) {
								if (field4398 != -1) {
									method6883(this.field4385[var10], var2 + this.field4388[var10] + 1 + var13, var3 + this.field4389[var10] + 1 + var14, var17, var12, field4398);
								}

								this.method6869(this.field4385[var10], var2 + this.field4388[var10] + var13, var3 + this.field4389[var10] + var14, var17, var12, field4397);
							} else {
								if (field4398 != -1) {
									method6873(this.field4385[var10], var2 + this.field4388[var10] + 1 + var13, var3 + this.field4389[var10] + 1 + var14, var17, var12, field4398, field4396);
								}

								this.method6870(this.field4385[var10], var2 + this.field4388[var10] + var13, var3 + this.field4389[var10] + var14, var17, var12, field4397, field4396);
							}
						} else if (field4403 > 0) {
							field4384 += field4403;
							var2 += field4384 >> 8;
							field4384 &= 255;
						}

						int var18 = this.field4400[var10];
						if (field4395 != -1) {
							method8686(var2, var3 + (int)((double)this.field4392 * 0.7D), var18, field4395);
						}

						if (field4401 != -1) {
							method8686(var2, var3 + this.field4392, var18, field4401);
						}

						var2 += var18;
						var7 = var10;
					}
				}
			}
		}

	}

	static void method6883(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + var2 * class478.field5011;
		int var7 = class478.field5011 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < class478.field5013) {
			var10 = class478.field5013 - var2;
			var4 -= var10;
			var2 = class478.field5013;
			var9 += var10 * var3;
			var6 += var10 * class478.field5011;
		}

		if (var2 + var4 > class478.field5014) {
			var4 -= var2 + var4 - class478.field5014;
		}

		if (var1 < class478.field5015) {
			var10 = class478.field5015 - var1;
			var3 -= var10;
			var1 = class478.field5015;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (var1 + var3 > class478.field5016) {
			var10 = var1 + var3 - class478.field5016;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method6872(class478.field5012, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	static void method6872(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	static void method6873(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + var2 * class478.field5011;
		int var8 = class478.field5011 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < class478.field5013) {
			var11 = class478.field5013 - var2;
			var4 -= var11;
			var2 = class478.field5013;
			var10 += var11 * var3;
			var7 += var11 * class478.field5011;
		}

		if (var2 + var4 > class478.field5014) {
			var4 -= var2 + var4 - class478.field5014;
		}

		if (var1 < class478.field5015) {
			var11 = class478.field5015 - var1;
			var3 -= var11;
			var1 = class478.field5015;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var1 + var3 > class478.field5016) {
			var11 = var1 + var3 - class478.field5016;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			method6898(class478.field5012, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	static void method6898(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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

	abstract void method6869(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	abstract void method6870(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);
}
