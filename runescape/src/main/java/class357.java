import java.util.HashMap;

public class class357 {
	class401 field4326;
	int field4329;
	int[] field4327;
	int[] field4328;
	final HashMap field4332;

	public class357() {
		this.field4332 = new HashMap();
		this.field4326 = new class401(0, 0);
		this.field4327 = new int[2048];
		this.field4328 = new int[2048];
		this.field4329 = 0;
		class199.method3905();
	}

	void method6606(int var1) {
		int var3 = 1 + var1 * 2;
		double var5 = (double)((float)var1 / 3.0F);
		int var7 = var1 * 2 + 1;
		double[] var8 = new double[var7];
		int var9 = -var1;

		for (int var10 = 0; var9 <= var1; ++var10) {
			var8[var10] = class396.method6188((double)var9, 0.0D, var5);
			++var9;
		}

		double[] var15 = var8;
		double var16 = var8[var1] * var8[var1];
		int[] var18 = new int[var3 * var3];
		boolean var11 = false;

		for (int var12 = 0; var12 < var3; ++var12) {
			for (int var13 = 0; var13 < var3; ++var13) {
				int var14 = var18[var13 + var3 * var12] = (int)(var15[var13] * var15[var12] / var16 * 256.0D);
				if (!var11 && var14 > 0) {
					var11 = true;
				}
			}
		}

		class491 var19 = new class491(var18, var3, var3);
		this.field4332.put(var1, var19);
	}

	public static int method6629(byte[] var0, int var1) {
		int var4 = -1;

		for (int var5 = 0; var5 < var1; ++var5) {
			var4 = var4 >>> 8 ^ class467.field4916[(var4 ^ var0[var5]) & 255];
		}

		var4 = ~var4;
		return var4;
	}

	class491 method6607(int var1) {
		if (!this.field4332.containsKey(var1)) {
			this.method6606(var1);
		}

		return (class491)this.field4332.get(var1);
	}

	public final void method6608(int var1, int var2) {
		if (this.field4329 < this.field4327.length) {
			this.field4327[this.field4329] = var1;
			this.field4328[this.field4329] = var2;
			++this.field4329;
		}
	}

	public final void method6619() {
		this.field4329 = 0;
	}

	public final void method6624(int var1, int var2, class491 var3, float var4) {
		int var6 = (int)(var4 * 18.0F);
		class491 var7 = this.method6607(var6);
		int var8 = var6 * 2 + 1;
		class401 var9 = new class401(0, 0, var3.field5057, var3.field5056);
		class401 var10 = new class401(0, 0);
		this.field4326.method7472(var8, var8);
		System.nanoTime();

		int var11;
		int var12;
		int var13;
		for (var11 = 0; var11 < this.field4329; ++var11) {
			var12 = this.field4327[var11];
			var13 = this.field4328[var11];
			int var14 = (int)(var4 * (float)(var12 - var1)) - var6;
			int var15 = (int)((float)var3.field5056 - var4 * (float)(var13 - var2)) - var6;
			this.field4326.method7473(var14, var15);
			this.field4326.method7486(var9, var10);
			this.method6611(var7, var3, var10);
		}

		System.nanoTime();
		System.nanoTime();

		for (var11 = 0; var11 < var3.field5067.length; ++var11) {
			if (0 == var3.field5067[var11]) {
				var3.field5067[var11] = -16777216;
			} else {
				var12 = (var3.field5067[var11] + 64 - 1) / 256;
				if (var12 <= 0) {
					var3.field5067[var11] = -16777216;
				} else {
					if (var12 > class186.field2037.length) {
						var12 = class186.field2037.length;
					}

					var13 = class186.field2037[var12 - 1];
					var3.field5067[var11] = -16777216 | var13;
				}
			}
		}

		System.nanoTime();
	}

	void method6611(class491 var1, class491 var2, class401 var3) {
		if (0 != var3.field4570 && var3.field4567 != 0) {
			int var5 = 0;
			int var6 = 0;
			if (0 == var3.field4569) {
				var5 = var1.field5057 - var3.field4570;
			}

			if (var3.field4568 == 0) {
				var6 = var1.field5056 - var3.field4567;
			}

			int var7 = var5 + var1.field5057 * var6;
			int var8 = var3.field4568 * var2.field5057 + var3.field4569;

			for (int var9 = 0; var9 < var3.field4567; ++var9) {
				for (int var10 = 0; var10 < var3.field4570; ++var10) {
					int[] var10000 = var2.field5067;
					int var10001 = var8++;
					var10000[var10001] += var1.field5067[var7++];
				}

				var7 += var1.field5057 - var3.field4570;
				var8 += var2.field5057 - var3.field4570;
			}

		}
	}

	static int method6627(int var0, class65 var1, boolean var2) {
		class290 var4 = var2 ? class187.field2044 : class341.field4273;
		if (var0 == CS2Opcodes.CC_GETSCROLLX) {
			class69.field579[++class94.field920 - 1] = var4.field3427;
			return 1;
		} else if (var0 == CS2Opcodes.CC_GETSCROLLY) {
			class69.field579[++class94.field920 - 1] = var4.field3421;
			return 1;
		} else {
			class295 var8;
			if (var0 == CS2Opcodes.CC_GETTEXT) {
				if (12 == var4.field3536) {
					var8 = var4.method5510();
					if (var8 != null) {
						class69.field580[++class69.field581 - 1] = var8.method5804().method7171();
						return 1;
					}
				}

				class69.field580[++class69.field581 - 1] = var4.field3461;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETSCROLLWIDTH) {
				class69.field579[++class94.field920 - 1] = var4.field3422;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETSCROLLHEIGHT) {
				class69.field579[++class94.field920 - 1] = var4.field3423;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETMODELZOOM) {
				class69.field579[++class94.field920 - 1] = var4.field3382;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETMODELANGLE_X) {
				class69.field579[++class94.field920 - 1] = var4.field3467;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETMODELANGLE_Z) {
				class69.field579[++class94.field920 - 1] = var4.field3453;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETMODELANGLE_Y) {
				class69.field579[++class94.field920 - 1] = var4.field3454;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETTRANS) {
				class69.field579[++class94.field920 - 1] = var4.field3533;
				return 1;
			} else if (var0 == CS2Opcodes._1610) {
				class69.field579[++class94.field920 - 1] = var4.field3431;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETCOLOUR) {
				class69.field579[++class94.field920 - 1] = var4.field3424;
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETFILLCOLOUR) {
				class69.field579[++class94.field920 - 1] = var4.field3545;
				return 1;
			} else if (var0 == CS2Opcodes._1613) {
				class69.field579[++class94.field920 - 1] = var4.field3446.method6487();
				return 1;
			} else if (var0 == CS2Opcodes.CC_GETMODELTRANSPARENT) {
				class69.field579[++class94.field920 - 1] = var4.field3458 ? 1 : 0;
				return 1;
			} else {
				class288 var5;
				if (var0 == CS2Opcodes.CC_INPUTUNK1) {
					var5 = var4.method5636();
					class69.field579[++class94.field920 - 1] = var5 != null ? var5.field3375 : 0;
				}

				if (var0 == CS2Opcodes.CC_INPUTUNK2) {
					var5 = var4.method5636();
					class69.field579[++class94.field920 - 1] = null != var5 ? var5.field3377 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK1) {
					var8 = var4.method5510();
					class69.field580[++class69.field581 - 1] = var8 != null ? var8.method5693().method7171() : "";
					return 1;
				} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK2) {
					var5 = var4.method5636();
					class69.field579[++class94.field920 - 1] = var5 != null ? var5.field3376 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK3) {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5739() : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK4) {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = null != var8 ? var8.method5740() : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK5) {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = null != var8 ? var8.method5911() : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK6) {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = null != var8 && var8.method5763() ? 1 : 0;
					return 1;
				} else if (var0 != CS2Opcodes.CC_INPUTFIELDUNK7) {
					if (var0 == CS2Opcodes.CC_INPUTFIELDUNK8) {
						var8 = var4.method5510();
						class69.field580[++class69.field581 - 1] = var8 != null ? var8.method5730().method6806() : "";
						return 1;
					} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK9) {
						var8 = var4.method5510();
						int var6 = null != var8 ? var8.method5713() : 0;
						int var7 = null != var8 ? var8.method5734() : 0;
						class69.field579[++class94.field920 - 1] = Math.min(var6, var7);
						class69.field579[++class94.field920 - 1] = Math.max(var6, var7);
						return 1;
					} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK10) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = null != var8 ? var8.method5734() : 0;
						return 1;
					} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK11) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5854() : 0;
						return 1;
					} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK12) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5742() : 0;
						return 1;
					} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK13) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5744() : 0;
						return 1;
					} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK14) {
						var8 = var4.method5510();
						class69.field579[++class94.field920 - 1] = var8 != null ? var8.method5824() : 0;
						return 1;
					} else {
						class41 var9;
						if (var0 == CS2Opcodes.CC_INPUTFIELDUNK15) {
							var9 = var4.method5530();
							class69.field579[class94.field920 - 1] = var9 != null ? var9.method688(class69.field579[class94.field920 - 1]) : 0;
							return 1;
						} else if (var0 == CS2Opcodes.CC_INPUTFIELDUNK16) {
							var9 = var4.method5530();
							class69.field579[class94.field920 - 1] = null != var9 ? var9.method691((char)class69.field579[class94.field920 - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = var4.method5510();
					class69.field579[++class94.field920 - 1] = null != var8 && var8.method5678() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	static void method6628(boolean var0) {
		if (!class122.field1212.method3014() && !class122.field1212.method3015()) {
			class73.field628 = class321.field3761;
			class73.field645 = class321.field3925;
			class73.field666 = class321.field3980;
			class73.method113(2);
			if (var0) {
				class73.field648 = "";
			}

			class224.method4623();
			class49.method943();
		} else {
			class73.method113(10);
		}
	}
}
