public class class128 extends class409 {
	final boolean field1272;

	public class128(boolean var1) {
		this.field1272 = var1;
	}

	int method2412(class391 var1, class391 var2) {
		if (var1.field4520 == client.field1864 && var2.field4520 == client.field1864) {
			return this.field1272 ? var1.field4522 - var2.field4522 : var2.field4522 - var1.field4522;
		} else {
			return this.method7584(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2412((class391)var1, (class391)var2);
	}

	public static boolean method2419(int var0) {
		return 0 != (var0 >> 31 & 1);
	}

	static final void method2414(class290[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class290 var4 = var0[var3];
			if (null != var4 && var4.field3418 == var1 && (!var4.field3398 || !client.method1138(var4))) {
				int var6;
				if (var4.field3536 == 0) {
					if (!var4.field3398 && client.method1138(var4) && var4 != class242.field2895) {
						continue;
					}

					method2414(var0, var4.field3492);
					if (var4.field3541 != null) {
						method2414(var4.field3541, var4.field3492);
					}

					class102 var5 = (class102)client.field1863.method8177((long)var4.field3492);
					if (null != var5) {
						var6 = var5.field1057;
						if (class87.method1889(var6)) {
							method2414(class72.field625[var6], -1);
						}
					}
				}

				if (var4.field3536 == 6) {
					if (-1 != var4.field3482 || var4.field3448 != -1) {
						boolean var9 = class45.method898(var4);
						if (var9) {
							var6 = var4.field3448;
						} else {
							var6 = var4.field3482;
						}

						if (var6 != -1) {
							class183 var7 = class214.method4351(var6);
							if (!var7.method3505()) {
								for (var4.field3540 += client.field1745; var4.field3540 > var7.field2003[var4.field3539]; class53.method1040(var4)) {
									var4.field3540 -= var7.field2003[var4.field3539];
									++var4.field3539;
									if (var4.field3539 >= var7.field2009.length) {
										var4.field3539 -= var7.field2012;
										if (var4.field3539 < 0 || var4.field3539 >= var7.field2009.length) {
											var4.field3539 = 0;
										}
									}
								}
							} else {
								var4.field3539 += client.field1745;
								int var8 = var7.method3509();
								if (var4.field3539 >= var8) {
									var4.field3539 -= var7.field2012;
									if (var4.field3539 < 0 || var4.field3539 >= var8) {
										var4.field3539 = 0;
									}
								}

								class53.method1040(var4);
							}
						}
					}

					if (0 != var4.field3456 && !var4.field3398) {
						int var10 = var4.field3456 >> 16;
						var6 = var4.field3456 << 16 >> 16;
						var10 *= client.field1745;
						var6 *= client.field1745;
						var4.field3467 = var10 + var4.field3467 & 2047;
						var4.field3454 = var6 + var4.field3454 & 2047;
						class53.method1040(var4);
					}
				}
			}
		}

	}
}
