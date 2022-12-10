public class class102 extends class428 {
	boolean field1053;
	int field1052;
	int field1057;

	class102() {
		this.field1053 = false;
	}

	static final void method2078(boolean var0) {
		if (var0) {
			client.field1722 = class73.field642 ? class150.field1444 : class150.field1441;
		} else {
			client.field1722 = class186.field2040.method1798(class73.field652) ? class150.field1439 : class150.field1440;
		}

	}

	static final void method2077(boolean var0, class466 var1) {
		client.field1759 = var0;
		int var3;
		int var4;
		int var6;
		int var7;
		int var8;
		if (!client.field1759) {
			var3 = var1.method8306();
			var4 = var1.method8368();
			int var5 = var1.method8328();
			class112.field1141 = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class112.field1141[var6][var7] = var1.method8480();
				}
			}

			class206.field2363 = new int[var5];
			client.field1964 = new int[var5];
			class368.field4380 = new int[var5];
			class149.field1436 = new byte[var5][];
			class238.field2862 = new byte[var5][];
			var5 = 0;

			for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
				for (var7 = (var4 - 6) / 8; var7 <= (var4 + 6) / 8; ++var7) {
					var8 = (var6 << 8) + var7;
					class206.field2363[var5] = var8;
					client.field1964[var5] = class13.field73.method6319("m" + var6 + "_" + var7);
					class368.field4380[var5] = class13.field73.method6319("l" + var6 + "_" + var7);
					++var5;
				}
			}

			class267.method5268(var3, var4, true);
		} else {
			var3 = var1.method8368();
			var4 = var1.method8368();
			boolean var16 = var1.method8357() == 1;
			var6 = var1.method8328();
			var1.method8275();

			int var9;
			int var10;
			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = var1.method8281(1);
						if (var10 == 1) {
							client.field1760[var7][var8][var9] = var1.method8281(26);
						} else {
							client.field1760[var7][var8][var9] = -1;
						}
					}
				}
			}

			var1.method8277();
			class112.field1141 = new int[var6][4];

			for (var7 = 0; var7 < var6; ++var7) {
				for (var8 = 0; var8 < 4; ++var8) {
					class112.field1141[var7][var8] = var1.method8480();
				}
			}

			class206.field2363 = new int[var6];
			client.field1964 = new int[var6];
			class368.field4380 = new int[var6];
			class149.field1436 = new byte[var6][];
			class238.field2862 = new byte[var6][];
			var6 = 0;

			for (var7 = 0; var7 < 4; ++var7) {
				for (var8 = 0; var8 < 13; ++var8) {
					for (var9 = 0; var9 < 13; ++var9) {
						var10 = client.field1760[var7][var8][var9];
						if (var10 != -1) {
							int var11 = var10 >> 14 & 1023;
							int var12 = var10 >> 3 & 2047;
							int var13 = var12 / 8 + (var11 / 8 << 8);

							int var14;
							for (var14 = 0; var14 < var6; ++var14) {
								if (class206.field2363[var14] == var13) {
									var13 = -1;
									break;
								}
							}

							if (var13 != -1) {
								class206.field2363[var6] = var13;
								var14 = var13 >> 8 & 255;
								int var15 = var13 & 255;
								client.field1964[var6] = class13.field73.method6319("m" + var14 + "_" + var15);
								class368.field4380[var6] = class13.field73.method6319("l" + var14 + "_" + var15);
								++var6;
							}
						}
					}
				}
			}

			class267.method5268(var3, var4, !var16);
		}

	}
}
