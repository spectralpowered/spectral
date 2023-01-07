import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "dx"
)
public class class81 extends class392 {
	@ObfInfo(
		owner = "dx",
		name = "h",
		desc = "Z"
	)
	final boolean field666;

	@ObfInfo(
		owner = "dx",
		name = "<init>",
		desc = "(Z)V"
	)
	public class81(boolean var1) {
		this.field666 = var1;
	}

	@ObfInfo(
		owner = "dx",
		name = "h",
		desc = "(Loa;Loa;I)I"
	)
	int method336(class69 var1, class69 var2) {
		if (var1.field627 == client.field395 && var2.field627 == client.field395) {
			return this.field666 ? var1.field629 - var2.field629 : var2.field629 - var1.field629;
		} else {
			return this.method1918(var1, var2);
		}
	}

	@ObfInfo(
		owner = "dx",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method336((class69)var1, (class69)var2);
	}

	@ObfInfo(
		owner = "dx",
		name = "m",
		desc = "(IB)Z"
	)
	public static boolean method338(int var0) {
		return 0 != (var0 >> 31 & 1);
	}

	@ObfInfo(
		owner = "dx",
		name = "le",
		desc = "([Lkd;II)V"
	)
	static final void method337(class120[] var0, int var1) {
		for (int var3 = 0; var3 < var0.length; ++var3) {
			class120 var4 = var0[var3];
			if (null != var4 && var4.field912 == var1 && (!var4.field893 || !class9.method47(var4))) {
				int var6;
				if (var4.field1026 == 0) {
					if (!var4.field893 && class9.method47(var4) && var4 != class393.field3284) {
						continue;
					}

					method337(var0, var4.field985);
					if (var4.field1031 != null) {
						method337(var4.field1031, var4.field985);
					}

					class415 var5 = (class415)client.field394.method791((long)var4.field985);
					if (null != var5) {
						var6 = var5.field3426;
						if (class268.method1275(var6)) {
							method337(class329.field2600[var6], -1);
						}
					}
				}

				if (var4.field1026 == 6) {
					if (-1 != var4.field975 || var4.field941 != -1) {
						boolean var9 = class433.method2147(var4);
						if (var9) {
							var6 = var4.field941;
						} else {
							var6 = var4.field975;
						}

						if (var6 != -1) {
							class242 var7 = class271.method1277(var6);
							if (!var7.method1056()) {
								for (var4.field1030 += client.field276; var4.field1030 > var7.field2037[var4.field1029]; class184.method836(var4)) {
									var4.field1030 -= var7.field2037[var4.field1029];
									++var4.field1029;
									if (var4.field1029 >= var7.field2043.length) {
										var4.field1029 -= var7.field2046;
										if (var4.field1029 < 0 || var4.field1029 >= var7.field2043.length) {
											var4.field1029 = 0;
										}
									}
								}
							} else {
								var4.field1029 += client.field276;
								int var8 = var7.method1058();
								if (var4.field1029 >= var8) {
									var4.field1029 -= var7.field2046;
									if (var4.field1029 < 0 || var4.field1029 >= var8) {
										var4.field1029 = 0;
									}
								}

								class184.method836(var4);
							}
						}
					}

					if (0 != var4.field949 && !var4.field893) {
						int var10 = var4.field949 >> 16;
						var6 = var4.field949 << 16 >> 16;
						var10 *= client.field276;
						var6 *= client.field276;
						var4.field960 = var10 + var4.field960 & 2047;
						var4.field947 = var6 + var4.field947 & 2047;
						class184.method836(var4);
					}
				}
			}
		}

	}
}
