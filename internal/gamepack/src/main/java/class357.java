import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ew"
)
public class class357 extends class195 {
	@ObfInfo(
		owner = "ew",
		name = "q",
		desc = "Z"
	)
	boolean field3043;
	@ObfInfo(
		owner = "ew",
		name = "v",
		desc = "[[Ldu;"
	)
	class84[][] field3042;
	@ObfInfo(
		owner = "ew",
		name = "h",
		desc = "I"
	)
	int field3044;
	@ObfInfo(
		owner = "ew",
		name = "m",
		desc = "I"
	)
	int field3045;
	@ObfInfo(
		owner = "ew",
		name = "x",
		desc = "Lhn;"
	)
	public class176 field3040;
	@ObfInfo(
		owner = "ew",
		name = "e",
		desc = "[[Ldu;"
	)
	public class84[][] field3041;

	@ObfInfo(
		owner = "ew",
		name = "<init>",
		desc = "(Lly;Lly;IZ)V"
	)
	public class357(class274 var1, class274 var2, int var3, boolean var4) {
		this.field3041 = (class84[][])null;
		this.field3042 = (class84[][])null;
		this.field3045 = 0;
		this.field3044 = var3;
		byte[] var5 = var1.method1365(this.field3044 >> 16 & 65535, this.field3044 & 65535);
		class127 var6 = new class127(var5);
		int var7 = var6.method547();
		int var8 = var6.method549();
		byte[] var9;
		if (var4) {
			var9 = var2.method1348(0, var8);
		} else {
			var9 = var2.method1348(var8, 0);
		}

		this.field3040 = new class176(var8, var9);
		this.method1779(var6, var7);
	}

	@ObfInfo(
		owner = "ew",
		name = "h",
		desc = "(Lqy;IS)V"
	)
	void method1779(class127 var1, int var2) {
		var1.method549();
		var1.method549();
		this.field3045 = var1.method547();
		int var4 = var1.method549();
		this.field3042 = new class84[this.field3040.method810().method1835()][];
		this.field3041 = new class84[this.field3040.method811()][];

		for (int var5 = 0; var5 < var4; ++var5) {
			class223 var6 = class426.method2076(var1.method547());
			int var7 = var1.method558();
			class453 var8 = class189.method856(var1.method547());
			class84 var9 = new class84();
			var9.method343(var1, var2);
			int var10 = var6.method987();
			class84[][] var11;
			if (class223.field1913 == var6) {
				var11 = this.field3042;
			} else {
				var11 = this.field3041;
			}

			if (var11[var7] == null) {
				var11[var7] = new class84[var10];
			}

			var11[var7][var8.method2242()] = var9;
			if (class223.field1916 == var6) {
				this.field3043 = true;
			}
		}

	}

	@ObfInfo(
		owner = "ew",
		name = "e",
		desc = "(I)I"
	)
	public int method1785() {
		return this.field3045;
	}

	@ObfInfo(
		owner = "ew",
		name = "v",
		desc = "(B)Z"
	)
	public boolean method1780() {
		return this.field3043;
	}

	@ObfInfo(
		owner = "ew",
		name = "x",
		desc = "(ILdt;III)V"
	)
	public void method1778(int var1, class130 var2, int var3, int var4) {
		class44 var6 = class282.method1391();
		this.method1781(var6, var3, var2, var1);
		this.method1783(var6, var3, var2, var1);
		this.method1782(var6, var3, var2, var1);
		var2.method619(var6);
		var6.method217();
	}

	@ObfInfo(
		owner = "ew",
		name = "m",
		desc = "(Loj;ILdt;II)V"
	)
	void method1781(class44 var1, int var2, class130 var3, int var4) {
		float[] var6 = var3.method620(this.field3045);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field3042[var2]) {
			class84 var10 = this.field3042[var2][0];
			class84 var11 = this.field3042[var2][1];
			class84 var12 = this.field3042[var2][2];
			if (null != var10) {
				var7 = var10.method349(var4);
			}

			if (var11 != null) {
				var8 = var11.method349(var4);
			}

			if (var12 != null) {
				var9 = var12.method349(var4);
			}
		}

		class175 var15 = class327.method1667();
		var15.method806(1.0F, 0.0F, 0.0F, var7);
		class175 var16 = class327.method1667();
		var16.method806(0.0F, 1.0F, 0.0F, var8);
		class175 var17 = class327.method1667();
		var17.method806(0.0F, 0.0F, 1.0F, var9);
		class175 var13 = class327.method1667();
		var13.method807(var17);
		var13.method807(var15);
		var13.method807(var16);
		class44 var14 = class282.method1391();
		var14.method213(var13);
		var1.method212(var14);
		var15.method809();
		var16.method809();
		var17.method809();
		var13.method809();
		var14.method217();
	}

	@ObfInfo(
		owner = "ew",
		name = "q",
		desc = "(Loj;ILdt;II)V"
	)
	void method1782(class44 var1, int var2, class130 var3, int var4) {
		float[] var6 = var3.method621(this.field3045);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field3042[var2]) {
			class84 var10 = this.field3042[var2][3];
			class84 var11 = this.field3042[var2][4];
			class84 var12 = this.field3042[var2][5];
			if (var10 != null) {
				var7 = var10.method349(var4);
			}

			if (var11 != null) {
				var8 = var11.method349(var4);
			}

			if (null != var12) {
				var9 = var12.method349(var4);
			}
		}

		var1.field541[12] = var7;
		var1.field541[13] = var8;
		var1.field541[14] = var9;
	}

	@ObfInfo(
		owner = "ew",
		name = "f",
		desc = "(Loj;ILdt;II)V"
	)
	void method1783(class44 var1, int var2, class130 var3, int var4) {
		float[] var6 = var3.method622(this.field3045);
		float var7 = var6[0];
		float var8 = var6[1];
		float var9 = var6[2];
		if (null != this.field3042[var2]) {
			class84 var10 = this.field3042[var2][6];
			class84 var11 = this.field3042[var2][7];
			class84 var12 = this.field3042[var2][8];
			if (null != var10) {
				var7 = var10.method349(var4);
			}

			if (null != var11) {
				var8 = var11.method349(var4);
			}

			if (var12 != null) {
				var9 = var12.method349(var4);
			}
		}

		class44 var13 = class282.method1391();
		var13.method211(var7, var8, var9);
		var1.method212(var13);
		var13.method217();
	}

	@ObfInfo(
		owner = "ew",
		name = "v",
		desc = "(IIB)Lbv;"
	)
	static class152 method1784(int var0, int var1) {
		class34 var3 = (class34)class100.field792.get(var0);
		return var3.method141(var1);
	}

	@ObfInfo(
		owner = "ew",
		name = "gx",
		desc = "(I)V"
	)
	static final void method1786() {
		for (int var1 = 0; var1 < client.field478; ++var1) {
			int var10002 = client.field508[var1]--;
			if (client.field508[var1] >= -10) {
				class351 var10 = client.field288[var1];
				if (var10 == null) {
					class351 var10000 = (class351)null;
					var10 = class351.method1767(class303.field2437, client.field479[var1], 0);
					if (null == var10) {
						continue;
					}

					int[] var13 = client.field508;
					var13[var1] += var10.method1769();
					client.field288[var1] = var10;
				}

				if (client.field508[var1] < 0) {
					int var3;
					if (client.field334[var1] != 0) {
						int var4 = (client.field334[var1] & 255) * 128;
						int var5 = client.field334[var1] >> 16 & 255;
						int var6 = 64 + var5 * 128 - class113.field846.field2672;
						if (var6 < 0) {
							var6 = -var6;
						}

						int var7 = client.field334[var1] >> 8 & 255;
						int var8 = var7 * 128 + 64 - class113.field846.field2608;
						if (var8 < 0) {
							var8 = -var8;
						}

						int var9 = var8 + var6 - 128;
						if (var9 > var4) {
							client.field508[var1] = -100;
							continue;
						}

						if (var9 < 0) {
							var9 = 0;
						}

						var3 = (var4 - var9) * class50.field574.method2230() / var4;
					} else {
						var3 = class50.field574.method2211();
					}

					if (var3 > 0) {
						class82 var11 = var10.method1768().method339(class297.field2393);
						class316 var12 = class316.method1516(var11, 100, var3);
						var12.method1518(client.field480[var1] - 1);
						class197.field1739.method1065(var12);
					}

					client.field508[var1] = -100;
				}
			} else {
				--client.field478;

				for (int var2 = var1; var2 < client.field478; ++var2) {
					client.field479[var2] = client.field479[var2 + 1];
					client.field288[var2] = client.field288[var2 + 1];
					client.field480[var2] = client.field480[var2 + 1];
					client.field508[var2] = client.field508[var2 + 1];
					client.field334[var2] = client.field334[var2 + 1];
				}

				--var1;
			}
		}

		if (client.field477 && !class210.method911()) {
			if (class50.field574.method2210() != 0 && -1 != client.field476) {
				class74.method323(class317.field2494, client.field476, 0, class50.field574.method2210(), false);
			}

			client.field477 = false;
		}

	}

	@ObfInfo(
		owner = "ew",
		name = "bc",
		desc = "(II)Ljava/lang/Object;"
	)
	static Object method1787(int var0) {
		return class154.method716((class185)class2.method10(class185.method841(), var0));
	}
}
