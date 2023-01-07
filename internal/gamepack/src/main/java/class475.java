import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "gf"
)
public class class475 {
	@ObfInfo(
		owner = "gf",
		name = "h",
		desc = "(Lly;I)V"
	)
	public static void method2351(class274 var0) {
		class457.field3778 = var0;
	}

	@ObfInfo(
		owner = "gf",
		name = "h",
		desc = "(B)[Ldz;"
	)
	static class453[] method2355() {
		return new class453[]{class453.field3759, class453.field3762, class453.field3747, class453.field3751, class453.field3749, class453.field3750, class453.field3746, class453.field3752, class453.field3753, class453.field3754, class453.field3755, class453.field3756, class453.field3757, class453.field3748, class453.field3758, class453.field3760, class453.field3761};
	}

	@ObfInfo(
		owner = "gf",
		name = "v",
		desc = "(B)V"
	)
	public static void method2353() {
		synchronized(class254.field2093) {
			if (class254.field2092 != 0) {
				class254.field2092 = 1;

				try {
					class254.field2093.wait();
				} catch (InterruptedException var4) {
				}
			}

		}
	}

	@ObfInfo(
		owner = "gf",
		name = "s",
		desc = "(IIB)I"
	)
	static final int method2354(int var0, int var1) {
		if (var0 == -1) {
			return 12345678;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfInfo(
		owner = "gf",
		name = "ix",
		desc = "(IIIIII)V"
	)
	static final void method2352(int var0, int var1, int var2, int var3, int var4) {
		long var6 = class408.field3415.method1613(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var14;
		int var15;
		if (var6 != 0L) {
			var8 = class408.field3415.method1607(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var12 = 0L != var6 && !class405.method1989(var6);
			if (var12) {
				var11 = var4;
			}

			int[] var13 = class211.field1833.field2205;
			var14 = var1 * 4 + 24624 + 2048 * (103 - var2);
			var15 = class174.method803(var6);
			class87 var16 = class85.method356(var15);
			if (var16.field725 != -1) {
				class344 var17 = class128.field1075[var16.field725];
				if (var17 != null) {
					int var18 = (var16.field720 * 4 - var17.field2758) / 2;
					int var19 = (var16.field721 * 4 - var17.field2755) / 2;
					var17.method1745(48 + var1 * 4 + var18, 4 * (104 - var2 - var16.field721) + 48 + var19);
				}
			} else {
				if (var10 == 0 || var10 == 2) {
					if (var9 == 0) {
						var13[var14] = var11;
						var13[var14 + 512] = var11;
						var13[var14 + 1024] = var11;
						var13[var14 + 1536] = var11;
					} else if (var9 == 1) {
						var13[var14] = var11;
						var13[var14 + 1] = var11;
						var13[var14 + 2] = var11;
						var13[var14 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 3] = var11;
						var13[var14 + 3 + 512] = var11;
						var13[1024 + var14 + 3] = var11;
						var13[var14 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var13[var14 + 1536] = var11;
						var13[var14 + 1536 + 1] = var11;
						var13[var14 + 1536 + 2] = var11;
						var13[var14 + 1536 + 3] = var11;
					}
				}

				if (var10 == 3) {
					if (var9 == 0) {
						var13[var14] = var11;
					} else if (var9 == 1) {
						var13[var14 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 3 + 1536] = var11;
					} else if (var9 == 3) {
						var13[var14 + 1536] = var11;
					}
				}

				if (var10 == 2) {
					if (var9 == 3) {
						var13[var14] = var11;
						var13[var14 + 512] = var11;
						var13[var14 + 1024] = var11;
						var13[var14 + 1536] = var11;
					} else if (var9 == 0) {
						var13[var14] = var11;
						var13[var14 + 1] = var11;
						var13[var14 + 2] = var11;
						var13[var14 + 3] = var11;
					} else if (var9 == 1) {
						var13[var14 + 3] = var11;
						var13[512 + var14 + 3] = var11;
						var13[1024 + var14 + 3] = var11;
						var13[1536 + var14 + 3] = var11;
					} else if (var9 == 2) {
						var13[var14 + 1536] = var11;
						var13[var14 + 1536 + 1] = var11;
						var13[2 + var14 + 1536] = var11;
						var13[3 + var14 + 1536] = var11;
					}
				}
			}
		}

		var6 = class408.field3415.method1611(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class408.field3415.method1607(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class174.method803(var6);
			class87 var20 = class85.method356(var11);
			if (var20.field725 != -1) {
				class344 var27 = class128.field1075[var20.field725];
				if (null != var27) {
					var14 = (var20.field720 * 4 - var27.field2758) / 2;
					var15 = (var20.field721 * 4 - var27.field2755) / 2;
					var27.method1745(48 + var1 * 4 + var14, var15 + 48 + 4 * (104 - var2 - var20.field721));
				}
			} else if (var10 == 9) {
				int var23 = 15658734;
				boolean var28 = var6 != 0L && !class405.method1989(var6);
				if (var28) {
					var23 = 15597568;
				}

				int[] var21 = class211.field1833.field2205;
				int var22 = var1 * 4 + 24624 + 2048 * (103 - var2);
				if (var9 != 0 && var9 != 2) {
					var21[var22] = var23;
					var21[1 + var22 + 512] = var23;
					var21[2 + var22 + 1024] = var23;
					var21[var22 + 1536 + 3] = var23;
				} else {
					var21[var22 + 1536] = var23;
					var21[1 + var22 + 1024] = var23;
					var21[var22 + 512 + 2] = var23;
					var21[var22 + 3] = var23;
				}
			}
		}

		var6 = class408.field3415.method1581(var0, var1, var2);
		if (0L != var6) {
			var8 = class174.method803(var6);
			class87 var24 = class85.method356(var8);
			if (-1 != var24.field725) {
				class344 var25 = class128.field1075[var24.field725];
				if (null != var25) {
					var11 = (var24.field720 * 4 - var25.field2758) / 2;
					int var26 = (var24.field721 * 4 - var25.field2755) / 2;
					var25.method1745(var1 * 4 + 48 + var11, var26 + (104 - var2 - var24.field721) * 4 + 48);
				}
			}
		}

	}
}
