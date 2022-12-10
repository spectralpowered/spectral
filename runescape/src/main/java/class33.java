import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class class33 extends class428 {
	static class211 field194;
	byte[][][] field183;
	int field185;
	int field189;
	int[] field184;
	int[] field186;
	int[] field188;
	Field[] field187;
	Method[] field190;

	class33() {
	}

	static final void method428(int var0, int var1, int var2, int var3) {
		for (int var5 = 0; var5 < client.field1911; ++var5) {
			if (client.field1916[var5] + client.field1904[var5] > var0 && client.field1916[var5] < var0 + var2 && client.field1917[var5] + client.field1716[var5] > var1 && client.field1917[var5] < var1 + var3) {
				client.field1913[var5] = true;
			}
		}

	}

	static final void method427(class85 var0, int var1, int var2, int var3) {
		class208 var5 = var0.field790;
		if (client.field1838 < 400) {
			if (var5.field2412 != null) {
				var5 = var5.method4083();
			}

			if (null != var5) {
				if (var5.field2415) {
					if (!var5.field2417 || var1 == client.field1882) {
						String var6 = var0.method1720();
						int var7;
						if (0 != var5.field2405 && var0.field1023 != 0) {
							var7 = var0.field1023 != -1 ? var0.field1023 : var5.field2405;
							var6 = var6 + class125.method2389(var7, class142.field1370.field831) + " " + class79.field722 + class321.field3923 + var7 + class79.field726;
						}

						if (var5.field2417 && client.field1847) {
							client.method1404(class321.field3969, class79.method2039(16776960) + var6, 1003, var1, var2, var3);
						}

						if (client.field1855 == 1) {
							client.method1404(class321.field3917, client.field1952 + " " + class79.field728 + " " + class79.method2039(16776960) + var6, 7, var1, var2, var3);
						} else if (client.field1857) {
							if (2 == (class16.field99 & 2)) {
								client.method1404(client.field1860, client.field1979 + " " + class79.field728 + " " + class79.method2039(16776960) + var6, 8, var1, var2, var3);
							}
						} else {
							var7 = var5.field2417 && client.field1847 ? 2000 : 0;
							String[] var8 = var5.field2403;
							int var9;
							int var10;
							if (null != var8) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method1761(var9) && null != var8[var9] && !var8[var9].equalsIgnoreCase(class321.field3919)) {
										var10 = 0;
										if (var9 == 0) {
											var10 = var7 + 9;
										}

										if (var9 == 1) {
											var10 = var7 + 10;
										}

										if (var9 == 2) {
											var10 = var7 + 11;
										}

										if (var9 == 3) {
											var10 = var7 + 12;
										}

										if (var9 == 4) {
											var10 = var7 + 13;
										}

										client.method1404(var8[var9], class79.method2039(16776960) + var6, var10, var1, var2, var3);
									}
								}
							}

							if (null != var8) {
								for (var9 = 4; var9 >= 0; --var9) {
									if (var0.method1761(var9) && var8[var9] != null && var8[var9].equalsIgnoreCase(class321.field3919)) {
										short var11 = 0;
										if (class104.field1075 != client.field1936) {
											if (class104.field1073 == client.field1936 || client.field1936 == class104.field1079 && var5.field2405 > class142.field1370.field831) {
												var11 = 2000;
											}

											var10 = 0;
											if (var9 == 0) {
												var10 = var11 + 9;
											}

											if (var9 == 1) {
												var10 = var11 + 10;
											}

											if (var9 == 2) {
												var10 = var11 + 11;
											}

											if (var9 == 3) {
												var10 = var11 + 12;
											}

											if (var9 == 4) {
												var10 = var11 + 13;
											}

											client.method1404(var8[var9], class79.method2039(16776960) + var6, var10, var1, var2, var3);
										}
									}
								}
							}

							if (!var5.field2417 || !client.field1847) {
								client.method1404(class321.field3969, class79.method2039(16776960) + var6, 1003, var1, var2, var3);
							}
						}

					}
				}
			}
		}
	}
}
