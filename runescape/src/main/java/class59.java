import java.util.Comparator;

public class class59 implements Comparator {
	static class491[] field457;
	boolean field458;

	public static final boolean method1099(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	static int method1110(int var0, class65 var1, boolean var2) {
		class290 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class180.method2988(class69.field579[--class94.field920]);
		} else {
			var4 = var2 ? class187.field2044 : class341.field4273;
		}

		class53.method1040(var4);
		if (var0 != CS2Opcodes.CC_SETOBJECT && var0 != CS2Opcodes.CC_SETOBJECT_NONUM && var0 != CS2Opcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == CS2Opcodes.CC_SETNPCHEAD) {
				var4.field3443 = 2;
				var4.field3462 = class69.field579[--class94.field920];
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETPLAYERHEAD_SELF) {
				var4.field3443 = 3;
				var4.field3462 = class142.field1370.field827.method6051();
				return 1;
			} else {
				return 2;
			}
		} else {
			class94.field920 -= 2;
			int var5 = class69.field579[class94.field920];
			int var6 = class69.field579[1 + class94.field920];
			var4.field3404 = var5;
			var4.field3538 = var6;
			class200 var7 = class208.method4105(var5);
			var4.field3467 = var7.field2265;
			var4.field3454 = var7.field2266;
			var4.field3453 = var7.field2273;
			var4.field3449 = var7.field2268;
			var4.field3544 = var7.field2253;
			var4.field3382 = var7.field2264;
			if (var0 == CS2Opcodes.CC_SETOBJECT_NONUM) {
				var4.field3459 = 0;
			} else if (var0 == CS2Opcodes.CC_SETOBJECT_ALWAYS_NUM | var7.field2270 == 1) {
				var4.field3459 = 1;
			} else {
				var4.field3459 = 2;
			}

			if (var4.field3517 > 0) {
				var4.field3382 = var4.field3382 * 32 / var4.field3517;
			} else if (var4.field3410 > 0) {
				var4.field3382 = var4.field3382 * 32 / var4.field3410;
			}

			return 1;
		}
	}

	static final void method1106() {
		int var1 = class161.field1506;
		int var2 = class85.field792;
		int var3 = class104.field1078;
		int var4 = class28.field169;
		int var5 = 6116423;
		class478.method8680(var1, var2, var3, var4, var5);
		class478.method8680(var1 + 1, var2 + 1, var3 - 2, 16, 0);
		class478.method8671(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
		class140.field1352.method6854(class321.field3970, var1 + 3, var2 + 14, var5, -1);
		int var6 = class28.field158;
		int var7 = class28.field153;

		int var8;
		int var9;
		int var10;
		for (var8 = 0; var8 < client.field1838; ++var8) {
			var9 = 15 * (client.field1838 - 1 - var8) + var2 + 31;
			var10 = 16777215;
			if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 16776960;
			}

			class140.field1352.method6854(class51.method1016(var8), var1 + 3, var9, var10, 0);
		}

		var8 = class161.field1506;
		var9 = class85.field792;
		var10 = class104.field1078;
		int var11 = class28.field169;

		for (int var12 = 0; var12 < client.field1911; ++var12) {
			if (client.field1904[var12] + client.field1916[var12] > var8 && client.field1916[var12] < var10 + var8 && client.field1716[var12] + client.field1917[var12] > var9 && client.field1917[var12] < var9 + var11) {
				client.field1914[var12] = true;
			}
		}

	}

	class59() {
	}

	int method1112(class345 var1, class345 var2) {
		if (var1.field4279 == var2.field4279) {
			return 0;
		} else {
			if (this.field458) {
				if (var1.field4279 == client.field1864) {
					return -1;
				}

				if (var2.field4279 == client.field1864) {
					return 1;
				}
			}

			return var1.field4279 < var2.field4279 ? -1 : 1;
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method1112((class345)var1, (class345)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}
}
