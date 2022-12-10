public class class123 extends class409 {
	static class50 field1217;
	static int field1219;
	final boolean field1222;

	public class123(boolean var1) {
		this.field1222 = var1;
	}

	int method2315(class391 var1, class391 var2) {
		if (var1.field4520 == client.field1864) {
			if (client.field1864 != var2.field4520) {
				return this.field1222 ? -1 : 1;
			}
		} else if (var2.field4520 == client.field1864) {
			return this.field1222 ? 1 : -1;
		}

		return this.method7584(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.method2315((class391)var1, (class391)var2);
	}

	static int method2323(class454 var0, int var1, int var2) {
		if (var0 == null) {
			return var2;
		} else {
			class429 var4 = (class429)var0.method8135((long)var1);
			return var4 == null ? var2 : var4.field4774;
		}
	}

	static int method2324(int var0, class65 var1, boolean var2) {
		int var4;
		int var5;
		if (var0 == CS2Opcodes.CC_CREATE) {
			class94.field920 -= 3;
			var4 = class69.field579[class94.field920];
			var5 = class69.field579[class94.field920 + 1];
			int var6 = class69.field579[class94.field920 + 2];
			if (var5 == 0) {
				throw new RuntimeException();
			} else {
				class290 var7 = class180.method2988(var4);
				if (var7.field3541 == null) {
					var7.field3541 = new class290[var6 + 1];
				}

				if (var7.field3541.length <= var6) {
					class290[] var8 = new class290[var6 + 1];

					for (int var9 = 0; var9 < var7.field3541.length; ++var9) {
						var8[var9] = var7.field3541[var9];
					}

					var7.field3541 = var8;
				}

				if (var6 > 0 && null == var7.field3541[var6 - 1]) {
					throw new RuntimeException("" + (var6 - 1));
				} else {
					class290 var13 = new class290();
					var13.field3536 = var5;
					var13.field3418 = var13.field3492 = var7.field3492;
					var13.field3400 = var6;
					var13.field3398 = true;
					if (var5 == 12) {
						var13.method5604();
						var13.method5510().method5727(new class82(var13));
						var13.method5510().method5726(new class89(var13));
					}

					var7.field3541[var6] = var13;
					if (var2) {
						class187.field2044 = var13;
					} else {
						class341.field4273 = var13;
					}

					class53.method1040(var7);
					return 1;
				}
			}
		} else {
			class290 var10;
			if (var0 == CS2Opcodes.CC_DELETE) {
				var10 = var2 ? class187.field2044 : class341.field4273;
				class290 var11 = class180.method2988(var10.field3492);
				var11.field3541[var10.field3400] = null;
				class53.method1040(var11);
				return 1;
			} else if (var0 == CS2Opcodes.CC_DELETEALL) {
				var10 = class180.method2988(class69.field579[--class94.field920]);
				var10.field3541 = null;
				class53.method1040(var10);
				return 1;
			} else if (var0 != CS2Opcodes.CC_FIND) {
				if (var0 == CS2Opcodes.IF_FIND) {
					var10 = class180.method2988(class69.field579[--class94.field920]);
					if (var10 != null) {
						class69.field579[++class94.field920 - 1] = 1;
						if (var2) {
							class187.field2044 = var10;
						} else {
							class341.field4273 = var10;
						}
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				class290 var12 = class104.method2089(var4, var5);
				if (var12 != null && var5 != -1) {
					class69.field579[++class94.field920 - 1] = 1;
					if (var2) {
						class187.field2044 = var12;
					} else {
						class341.field4273 = var12;
					}
				} else {
					class69.field579[++class94.field920 - 1] = 0;
				}

				return 1;
			}
		}
	}
}
