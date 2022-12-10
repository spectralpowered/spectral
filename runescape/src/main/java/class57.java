public class class57 extends class428 {
	static boolean field437;
	static boolean[] field435;
	static byte[] field426;
	static class31[] field434;
	static class35[] field432;
	static class43[] field433;
	static class60[] field431;
	static float[] field424;
	static float[] field442;
	static float[] field443;
	static float[] field444;
	static float[] field445;
	static float[] field446;
	static float[] field448;
	static int field423;
	static int field428;
	static int field429;
	static int field430;
	static int[] field421;
	static int[] field439;
	static int[] field450;
	boolean field425;
	boolean field441;
	byte[] field447;
	byte[][] field449;
	float[] field438;
	int field420;
	int field422;
	int field427;
	int field436;
	int field440;
	int field451;
	int field452;
	int field453;

	static {
		field437 = false;
	}

	static float method1069(int var0) {
		int var1 = var0 & 2097151;
		int var2 = var0 & Integer.MIN_VALUE;
		int var3 = (var0 & 2145386496) >> 21;
		if (var2 != 0) {
			var1 = -var1;
		}

		return (float)((double)var1 * Math.pow(2.0D, (double)(var3 - 788)));
	}

	static void method1068(byte[] var0, int var1) {
		field426 = var0;
		field423 = var1;
		field428 = 0;
	}

	static int method1090() {
		int var0 = field426[field423] >> field428 & 1;
		++field428;
		field423 += field428 >> 3;
		field428 &= 7;
		return var0;
	}

	static int method1070(int var0) {
		int var1 = 0;

		int var2;
		int var3;
		for (var2 = 0; var0 >= 8 - field428; var0 -= var3) {
			var3 = 8 - field428;
			int var4 = (1 << var3) - 1;
			var1 += (field426[field423] >> field428 & var4) << var2;
			field428 = 0;
			++field423;
			var2 += var3;
		}

		if (var0 > 0) {
			var3 = (1 << var0) - 1;
			var1 += (field426[field423] >> field428 & var3) << var2;
			field428 += var0;
		}

		return var1;
	}

	void method1071(byte[] var1) {
		class467 var2 = new class467(var1);
		this.field427 = var2.method8480();
		this.field422 = var2.method8480();
		this.field452 = var2.method8480();
		this.field420 = var2.method8480();
		if (this.field420 < 0) {
			this.field420 = ~this.field420;
			this.field425 = true;
		}

		int var3 = var2.method8480();
		this.field449 = new byte[var3][];

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = 0;

			int var6;
			do {
				var6 = var2.method8326();
				var5 += var6;
			} while(var6 >= 255);

			byte[] var7 = new byte[var5];
			var2.method8338(var7, 0, var5);
			this.field449[var4] = var7;
		}

	}

	static void method1072(byte[] var0) {
		method1068(var0, 0);
		field429 = 1 << method1070(4);
		field430 = 1 << method1070(4);
		field442 = new float[field430];

		int var1;
		int var2;
		int var3;
		int var4;
		int var5;
		for (var1 = 0; var1 < 2; ++var1) {
			var2 = var1 != 0 ? field430 : field429;
			var3 = var2 >> 1;
			var4 = var2 >> 2;
			var5 = var2 >> 3;
			float[] var6 = new float[var3];

			for (int var7 = 0; var7 < var4; ++var7) {
				var6[var7 * 2] = (float)Math.cos((double)(var7 * 4) * 3.141592653589793D / (double)var2);
				var6[var7 * 2 + 1] = -((float)Math.sin((double)(var7 * 4) * 3.141592653589793D / (double)var2));
			}

			float[] var12 = new float[var3];

			for (int var8 = 0; var8 < var4; ++var8) {
				var12[var8 * 2] = (float)Math.cos((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
				var12[var8 * 2 + 1] = (float)Math.sin((double)(var8 * 2 + 1) * 3.141592653589793D / (double)(var2 * 2));
			}

			float[] var13 = new float[var4];

			for (int var9 = 0; var9 < var5; ++var9) {
				var13[var9 * 2] = (float)Math.cos((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2);
				var13[var9 * 2 + 1] = -((float)Math.sin((double)(var9 * 4 + 2) * 3.141592653589793D / (double)var2));
			}

			int[] var14 = new int[var5];
			int var10 = class88.method1936(var5 - 1);

			for (int var11 = 0; var11 < var5; ++var11) {
				var14[var11] = class279.method2158(var11, var10);
			}

			if (var1 != 0) {
				field446 = var6;
				field448 = var12;
				field424 = var13;
				field450 = var14;
			} else {
				field443 = var6;
				field444 = var12;
				field445 = var13;
				field439 = var14;
			}
		}

		var1 = method1070(8) + 1;
		field431 = new class60[var1];

		for (var2 = 0; var2 < var1; ++var2) {
			field431[var2] = new class60();
		}

		var2 = method1070(6) + 1;

		for (var3 = 0; var3 < var2; ++var3) {
			method1070(16);
		}

		var2 = method1070(6) + 1;
		field432 = new class35[var2];

		for (var3 = 0; var3 < var2; ++var3) {
			field432[var3] = new class35();
		}

		var3 = method1070(6) + 1;
		field433 = new class43[var3];

		for (var4 = 0; var4 < var3; ++var4) {
			field433[var4] = new class43();
		}

		var4 = method1070(6) + 1;
		field434 = new class31[var4];

		for (var5 = 0; var5 < var4; ++var5) {
			field434[var5] = new class31();
		}

		var5 = method1070(6) + 1;
		field435 = new boolean[var5];
		field421 = new int[var5];

		for (int var15 = 0; var15 < var5; ++var15) {
			field435[var15] = method1090() != 0;
			method1070(16);
			method1070(16);
			field421[var15] = method1070(8);
		}

	}

	float[] method1097(int var1) {
		method1068(this.field449[var1], 0);
		method1090();
		int var2 = method1070(class88.method1936(field421.length - 1));
		boolean var3 = field435[var2];
		int var4 = var3 ? field430 : field429;
		boolean var5 = false;
		boolean var6 = false;
		if (var3) {
			var5 = method1090() != 0;
			var6 = method1090() != 0;
		}

		int var7 = var4 >> 1;
		int var8;
		int var9;
		int var10;
		if (var3 && !var5) {
			var8 = (var4 >> 2) - (field429 >> 2);
			var9 = (var4 >> 2) + (field429 >> 2);
			var10 = field429 >> 1;
		} else {
			var8 = 0;
			var9 = var7;
			var10 = var4 >> 1;
		}

		int var11;
		int var12;
		int var13;
		if (var3 && !var6) {
			var11 = var4 - (var4 >> 2) - (field429 >> 2);
			var12 = var4 - (var4 >> 2) + (field429 >> 2);
			var13 = field429 >> 1;
		} else {
			var11 = var7;
			var12 = var4;
			var13 = var4 >> 1;
		}

		class31 var14 = field434[field421[var2]];
		int var16 = var14.field175;
		int var17 = var14.field177[var16];
		boolean var15 = !field432[var17].method457();
		boolean var45 = var15;

		for (var17 = 0; var17 < var14.field176; ++var17) {
			class43 var18 = field433[var14.field174[var17]];
			float[] var19 = field442;
			var18.method854(var19, var4 >> 1, var45);
		}

		int var40;
		if (!var15) {
			var17 = var14.field175;
			var40 = var14.field177[var17];
			field432[var40].method445(field442, var4 >> 1);
		}

		int var42;
		if (var15) {
			for (var17 = var4 >> 1; var17 < var4; ++var17) {
				field442[var17] = 0.0F;
			}
		} else {
			var17 = var4 >> 1;
			var40 = var4 >> 2;
			var42 = var4 >> 3;
			float[] var43 = field442;

			int var21;
			for (var21 = 0; var21 < var17; ++var21) {
				var43[var21] *= 0.5F;
			}

			for (var21 = var17; var21 < var4; ++var21) {
				var43[var21] = -var43[var4 - var21 - 1];
			}

			float[] var44 = var3 ? field446 : field443;
			float[] var22 = var3 ? field448 : field444;
			float[] var23 = var3 ? field424 : field445;
			int[] var24 = var3 ? field450 : field439;

			int var25;
			float var26;
			float var27;
			float var28;
			float var29;
			for (var25 = 0; var25 < var40; ++var25) {
				var26 = var43[var25 * 4] - var43[var4 - var25 * 4 - 1];
				var27 = var43[var25 * 4 + 2] - var43[var4 - var25 * 4 - 3];
				var28 = var44[var25 * 2];
				var29 = var44[var25 * 2 + 1];
				var43[var4 - var25 * 4 - 1] = var26 * var28 - var27 * var29;
				var43[var4 - var25 * 4 - 3] = var26 * var29 + var27 * var28;
			}

			float var30;
			float var31;
			for (var25 = 0; var25 < var42; ++var25) {
				var26 = var43[var17 + 3 + var25 * 4];
				var27 = var43[var17 + 1 + var25 * 4];
				var28 = var43[var25 * 4 + 3];
				var29 = var43[var25 * 4 + 1];
				var43[var17 + 3 + var25 * 4] = var26 + var28;
				var43[var17 + 1 + var25 * 4] = var27 + var29;
				var30 = var44[var17 - 4 - var25 * 4];
				var31 = var44[var17 - 3 - var25 * 4];
				var43[var25 * 4 + 3] = (var26 - var28) * var30 - (var27 - var29) * var31;
				var43[var25 * 4 + 1] = (var27 - var29) * var30 + (var26 - var28) * var31;
			}

			var25 = class88.method1936(var4 - 1);

			int var47;
			int var48;
			int var49;
			int var50;
			for (var47 = 0; var47 < var25 - 3; ++var47) {
				var48 = var4 >> var47 + 2;
				var49 = 8 << var47;

				for (var50 = 0; var50 < 2 << var47; ++var50) {
					int var51 = var4 - var48 * 2 * var50;
					int var52 = var4 - var48 * (var50 * 2 + 1);

					for (int var32 = 0; var32 < var4 >> var47 + 4; ++var32) {
						int var33 = var32 * 4;
						float var34 = var43[var51 - 1 - var33];
						float var35 = var43[var51 - 3 - var33];
						float var36 = var43[var52 - 1 - var33];
						float var37 = var43[var52 - 3 - var33];
						var43[var51 - 1 - var33] = var34 + var36;
						var43[var51 - 3 - var33] = var35 + var37;
						float var38 = var44[var32 * var49];
						float var39 = var44[var32 * var49 + 1];
						var43[var52 - 1 - var33] = (var34 - var36) * var38 - (var35 - var37) * var39;
						var43[var52 - 3 - var33] = (var35 - var37) * var38 + (var34 - var36) * var39;
					}
				}
			}

			for (var47 = 1; var47 < var42 - 1; ++var47) {
				var48 = var24[var47];
				if (var47 < var48) {
					var49 = var47 * 8;
					var50 = var48 * 8;
					var30 = var43[var49 + 1];
					var43[var49 + 1] = var43[var50 + 1];
					var43[var50 + 1] = var30;
					var30 = var43[var49 + 3];
					var43[var49 + 3] = var43[var50 + 3];
					var43[var50 + 3] = var30;
					var30 = var43[var49 + 5];
					var43[var49 + 5] = var43[var50 + 5];
					var43[var50 + 5] = var30;
					var30 = var43[var49 + 7];
					var43[var49 + 7] = var43[var50 + 7];
					var43[var50 + 7] = var30;
				}
			}

			for (var47 = 0; var47 < var17; ++var47) {
				var43[var47] = var43[var47 * 2 + 1];
			}

			for (var47 = 0; var47 < var42; ++var47) {
				var43[var4 - 1 - var47 * 2] = var43[var47 * 4];
				var43[var4 - 2 - var47 * 2] = var43[var47 * 4 + 1];
				var43[var4 - var40 - 1 - var47 * 2] = var43[var47 * 4 + 2];
				var43[var4 - var40 - 2 - var47 * 2] = var43[var47 * 4 + 3];
			}

			for (var47 = 0; var47 < var42; ++var47) {
				var27 = var23[var47 * 2];
				var28 = var23[var47 * 2 + 1];
				var29 = var43[var17 + var47 * 2];
				var30 = var43[var17 + var47 * 2 + 1];
				var31 = var43[var4 - 2 - var47 * 2];
				float var53 = var43[var4 - 1 - var47 * 2];
				float var54 = var28 * (var29 - var31) + var27 * (var30 + var53);
				var43[var17 + var47 * 2] = (var29 + var31 + var54) * 0.5F;
				var43[var4 - 2 - var47 * 2] = (var29 + var31 - var54) * 0.5F;
				var54 = var28 * (var30 + var53) - var27 * (var29 - var31);
				var43[var17 + var47 * 2 + 1] = (var30 - var53 + var54) * 0.5F;
				var43[var4 - 1 - var47 * 2] = (-var30 + var53 + var54) * 0.5F;
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var43[var47] = var43[var47 * 2 + var17] * var22[var47 * 2] + var43[var47 * 2 + 1 + var17] * var22[var47 * 2 + 1];
				var43[var17 - 1 - var47] = var43[var47 * 2 + var17] * var22[var47 * 2 + 1] - var43[var47 * 2 + 1 + var17] * var22[var47 * 2];
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var43[var4 - var40 + var47] = -var43[var47];
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var43[var47] = var43[var40 + var47];
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var43[var40 + var47] = -var43[var40 - var47 - 1];
			}

			for (var47 = 0; var47 < var40; ++var47) {
				var43[var17 + var47] = var43[var4 - var47 - 1];
			}

			float[] var10000;
			for (var47 = var8; var47 < var9; ++var47) {
				var27 = (float)Math.sin(((double)(var47 - var8) + 0.5D) / (double)var10 * 0.5D * 3.141592653589793D);
				var10000 = field442;
				var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
			}

			for (var47 = var11; var47 < var12; ++var47) {
				var27 = (float)Math.sin(((double)(var47 - var11) + 0.5D) / (double)var13 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				var10000 = field442;
				var10000[var47] *= (float)Math.sin(1.5707963267948966D * (double)var27 * (double)var27);
			}
		}

		float[] var41 = null;
		if (this.field453 > 0) {
			var40 = this.field453 + var4 >> 2;
			var41 = new float[var40];
			int var20;
			if (!this.field441) {
				for (var42 = 0; var42 < this.field440; ++var42) {
					var20 = (this.field453 >> 1) + var42;
					var41[var42] += this.field438[var20];
				}
			}

			if (!var15) {
				for (var42 = var8; var42 < var4 >> 1; ++var42) {
					var20 = var41.length - (var4 >> 1) + var42;
					var41[var20] += field442[var42];
				}
			}
		}

		float[] var46 = this.field438;
		this.field438 = field442;
		field442 = var46;
		this.field453 = var4;
		this.field440 = var12 - (var4 >> 1);
		this.field441 = var15;
		return var41;
	}

	static boolean method1074(class337 var0) {
		if (!field437) {
			byte[] var1 = var0.method6374(0, 0);
			if (var1 == null) {
				return false;
			}

			method1072(var1);
			field437 = true;
		}

		return true;
	}

	static class57 method1075(class337 var0, int var1, int var2) {
		if (!method1074(var0)) {
			var0.method6366(var1, var2);
			return null;
		} else {
			byte[] var3 = var0.method6374(var1, var2);
			return var3 == null ? null : new class57(var3);
		}
	}

	class57(byte[] var1) {
		this.method1071(var1);
	}

	class32 method1076(int[] var1) {
		if (var1 != null && var1[0] <= 0) {
			return null;
		} else {
			if (this.field447 == null) {
				this.field453 = 0;
				this.field438 = new float[field430];
				this.field447 = new byte[this.field422];
				this.field436 = 0;
				this.field451 = 0;
			}

			for (; this.field451 < this.field449.length; ++this.field451) {
				if (var1 != null && var1[0] <= 0) {
					return null;
				}

				float[] var2 = this.method1097(this.field451);
				if (var2 != null) {
					int var3 = this.field436;
					int var4 = var2.length;
					if (var4 > this.field422 - var3) {
						var4 = this.field422 - var3;
					}

					for (int var5 = 0; var5 < var4; ++var5) {
						int var6 = (int)(128.0F + var2[var5] * 128.0F);
						if ((var6 & -256) != 0) {
							var6 = ~var6 >> 31;
						}

						this.field447[var3++] = (byte)(var6 - 128);
					}

					if (var1 != null) {
						var1[0] -= var3 - this.field436;
					}

					this.field436 = var3;
				}
			}

			this.field438 = null;
			byte[] var7 = this.field447;
			this.field447 = null;
			return new class32(this.field427, var7, this.field452, this.field420, this.field425);
		}
	}
}
