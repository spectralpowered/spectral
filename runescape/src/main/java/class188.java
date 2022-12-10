public class class188 {
	class188() throws Throwable {
		throw new Error();
	}

	public static void method3621() {
		synchronized(class318.field3745) {
			if (class318.field3744 != 0) {
				class318.field3744 = 1;

				try {
					class318.field3745.wait();
				} catch (InterruptedException var4) {
				}
			}

		}
	}

	static final int method3622(int var0, int var1) {
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

	static final void method3619(int var0, int var1, int var2, int var3, int var4) {
		long var6 = class33.field194.method4331(var0, var1, var2);
		int var8;
		int var9;
		int var10;
		int var11;
		int var14;
		int var15;
		if (var6 != 0L) {
			var8 = class33.field194.method4275(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = var3;
			boolean var12 = 0L != var6 && !class215.method5254(var6);
			if (var12) {
				var11 = var4;
			}

			int[] var13 = class224.field2727.field5067;
			var14 = var1 * 4 + 24624 + 2048 * (103 - var2);
			var15 = class215.method4664(var6);
			class196 var16 = class165.method2780(var15);
			if (var16.field2183 != -1) {
				class469 var17 = class44.field326[var16.field2183];
				if (var17 != null) {
					int var18 = (var16.field2178 * 4 - var17.field4928) / 2;
					int var19 = (var16.field2179 * 4 - var17.field4925) / 2;
					var17.method8587(48 + var1 * 4 + var18, 4 * (104 - var2 - var16.field2179) + 48 + var19);
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

		var6 = class33.field194.method4311(var0, var1, var2);
		if (var6 != 0L) {
			var8 = class33.field194.method4275(var0, var1, var2, var6);
			var9 = var8 >> 6 & 3;
			var10 = var8 & 31;
			var11 = class215.method4664(var6);
			class196 var20 = class165.method2780(var11);
			if (var20.field2183 != -1) {
				class469 var27 = class44.field326[var20.field2183];
				if (null != var27) {
					var14 = (var20.field2178 * 4 - var27.field4928) / 2;
					var15 = (var20.field2179 * 4 - var27.field4925) / 2;
					var27.method8587(48 + var1 * 4 + var14, var15 + 48 + 4 * (104 - var2 - var20.field2179));
				}
			} else if (var10 == 9) {
				int var23 = 15658734;
				boolean var28 = var6 != 0L && !class215.method5254(var6);
				if (var28) {
					var23 = 15597568;
				}

				int[] var21 = class224.field2727.field5067;
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

		var6 = class33.field194.method4181(var0, var1, var2);
		if (0L != var6) {
			var8 = class215.method4664(var6);
			class196 var24 = class165.method2780(var8);
			if (-1 != var24.field2183) {
				class469 var25 = class44.field326[var24.field2183];
				if (null != var25) {
					var11 = (var24.field2178 * 4 - var25.field4928) / 2;
					int var26 = (var24.field2179 * 4 - var25.field4925) / 2;
					var25.method8587(var1 * 4 + 48 + var11, var26 + (104 - var2 - var24.field2179) * 4 + 48);
				}
			}
		}

	}
}
