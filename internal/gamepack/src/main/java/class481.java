import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "pe"
)
public class class481 extends class379 {
	@ObfInfo(
		owner = "pe",
		name = "<init>",
		desc = "(I)V"
	)
	public class481(int var1) {
		super(var1);
	}

	@ObfInfo(
		owner = "pe",
		name = "h",
		desc = "(Lqy;II)V"
	)
	void method1865(class127 var1, int var2) {
	}

	@ObfInfo(
		owner = "pe",
		name = "x",
		desc = "(IZIZI)V"
	)
	static void method2372(int var0, boolean var1, int var2, boolean var3) {
		if (null != class2.field12) {
			class349.method1758(0, class2.field12.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfInfo(
		owner = "pe",
		name = "v",
		desc = "(IIILgg;Lgw;I)Z"
	)
	static final boolean method2373(int var0, int var1, int var2, class39 var3, class427 var4) {
		int var6 = var0;
		int var7 = var1;
		byte var8 = 64;
		byte var9 = 64;
		int var10 = var0 - var8;
		int var11 = var1 - var9;
		class474.field3991[var8][var9] = 99;
		class474.field3993[var8][var9] = 0;
		byte var12 = 0;
		int var13 = 0;
		class474.field3992[var12] = var0;
		int var21 = var12 + 1;
		class474.field3995[var12] = var1;
		int[][] var14 = var4.field3534;

		while (true) {
			label261:
			while (true) {
				int var15;
				int var16;
				int var17;
				int var18;
				int var19;
				int var20;
				do {
					do {
						do {
							label238:
							do {
								if (var13 == var21) {
									class474.field3990 = var6;
									class474.field3994 = var7;
									return false;
								}

								var6 = class474.field3992[var13];
								var7 = class474.field3995[var13];
								var13 = var13 + 1 & 4095;
								var19 = var6 - var10;
								var20 = var7 - var11;
								var15 = var6 - var4.field3531;
								var16 = var7 - var4.field3532;
								if (var3.method165(var2, var6, var7, var4)) {
									class474.field3990 = var6;
									class474.field3994 = var7;
									return true;
								}

								var17 = 1 + class474.field3993[var19][var20];
								if (var19 > 0 && class474.field3991[var19 - 1][var20] == 0 && 0 == (var14[var15 - 1][var16] & 19136782) && (var14[var15 - 1][var2 + var16 - 1] & 19136824) == 0) {
									var18 = 1;

									while (true) {
										if (var18 >= var2 - 1) {
											class474.field3992[var21] = var6 - 1;
											class474.field3995[var21] = var7;
											var21 = var21 + 1 & 4095;
											class474.field3991[var19 - 1][var20] = 2;
											class474.field3993[var19 - 1][var20] = var17;
											break;
										}

										if ((var14[var15 - 1][var18 + var16] & 19136830) != 0) {
											break;
										}

										++var18;
									}
								}

								if (var19 < 128 - var2 && 0 == class474.field3991[var19 + 1][var20] && (var14[var2 + var15][var16] & 19136899) == 0 && 0 == (var14[var15 + var2][var16 + var2 - 1] & 19136992)) {
									var18 = 1;

									while (true) {
										if (var18 >= var2 - 1) {
											class474.field3992[var21] = var6 + 1;
											class474.field3995[var21] = var7;
											var21 = var21 + 1 & 4095;
											class474.field3991[var19 + 1][var20] = 8;
											class474.field3993[var19 + 1][var20] = var17;
											break;
										}

										if (0 != (var14[var15 + var2][var16 + var18] & 19136995)) {
											break;
										}

										++var18;
									}
								}

								if (var20 > 0 && 0 == class474.field3991[var19][var20 - 1] && 0 == (var14[var15][var16 - 1] & 19136782) && (var14[var2 + var15 - 1][var16 - 1] & 19136899) == 0) {
									var18 = 1;

									while (true) {
										if (var18 >= var2 - 1) {
											class474.field3992[var21] = var6;
											class474.field3995[var21] = var7 - 1;
											var21 = var21 + 1 & 4095;
											class474.field3991[var19][var20 - 1] = 1;
											class474.field3993[var19][var20 - 1] = var17;
											break;
										}

										if (0 != (var14[var18 + var15][var16 - 1] & 19136911)) {
											break;
										}

										++var18;
									}
								}

								if (var20 < 128 - var2 && 0 == class474.field3991[var19][var20 + 1] && (var14[var15][var16 + var2] & 19136824) == 0 && 0 == (var14[var15 + var2 - 1][var2 + var16] & 19136992)) {
									var18 = 1;

									while (true) {
										if (var18 >= var2 - 1) {
											class474.field3992[var21] = var6;
											class474.field3995[var21] = var7 + 1;
											var21 = var21 + 1 & 4095;
											class474.field3991[var19][var20 + 1] = 4;
											class474.field3993[var19][var20 + 1] = var17;
											break;
										}

										if (0 != (var14[var18 + var15][var2 + var16] & 19137016)) {
											break;
										}

										++var18;
									}
								}

								if (var19 > 0 && var20 > 0 && class474.field3991[var19 - 1][var20 - 1] == 0 && (var14[var15 - 1][var16 - 1] & 19136782) == 0) {
									var18 = 1;

									while (true) {
										if (var18 >= var2) {
											class474.field3992[var21] = var6 - 1;
											class474.field3995[var21] = var7 - 1;
											var21 = var21 + 1 & 4095;
											class474.field3991[var19 - 1][var20 - 1] = 3;
											class474.field3993[var19 - 1][var20 - 1] = var17;
											break;
										}

										if ((var14[var15 - 1][var18 + (var16 - 1)] & 19136830) != 0 || 0 != (var14[var15 - 1 + var18][var16 - 1] & 19136911)) {
											break;
										}

										++var18;
									}
								}

								if (var19 < 128 - var2 && var20 > 0 && class474.field3991[var19 + 1][var20 - 1] == 0 && 0 == (var14[var2 + var15][var16 - 1] & 19136899)) {
									var18 = 1;

									while (true) {
										if (var18 >= var2) {
											class474.field3992[var21] = var6 + 1;
											class474.field3995[var21] = var7 - 1;
											var21 = var21 + 1 & 4095;
											class474.field3991[var19 + 1][var20 - 1] = 9;
											class474.field3993[var19 + 1][var20 - 1] = var17;
											break;
										}

										if (0 != (var14[var15 + var2][var18 + (var16 - 1)] & 19136995) || (var14[var15 + var18][var16 - 1] & 19136911) != 0) {
											break;
										}

										++var18;
									}
								}

								if (var19 > 0 && var20 < 128 - var2 && class474.field3991[var19 - 1][var20 + 1] == 0 && 0 == (var14[var15 - 1][var16 + var2] & 19136824)) {
									for (var18 = 1; var18 < var2; ++var18) {
										if (0 != (var14[var15 - 1][var18 + var16] & 19136830) || 0 != (var14[var18 + (var15 - 1)][var2 + var16] & 19137016)) {
											continue label238;
										}
									}

									class474.field3992[var21] = var6 - 1;
									class474.field3995[var21] = var7 + 1;
									var21 = var21 + 1 & 4095;
									class474.field3991[var19 - 1][var20 + 1] = 6;
									class474.field3993[var19 - 1][var20 + 1] = var17;
								}
							} while(var19 >= 128 - var2);
						} while(var20 >= 128 - var2);
					} while(0 != class474.field3991[var19 + 1][var20 + 1]);
				} while((var14[var2 + var15][var2 + var16] & 19136992) != 0);

				for (var18 = 1; var18 < var2; ++var18) {
					if (0 != (var14[var18 + var15][var2 + var16] & 19137016) || (var14[var2 + var15][var16 + var18] & 19136995) != 0) {
						continue label261;
					}
				}

				class474.field3992[var21] = var6 + 1;
				class474.field3995[var21] = var7 + 1;
				var21 = var21 + 1 & 4095;
				class474.field3991[var19 + 1][var20 + 1] = 12;
				class474.field3993[var19 + 1][var20 + 1] = var17;
			}
		}
	}
}
