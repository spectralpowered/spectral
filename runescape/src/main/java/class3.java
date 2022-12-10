import java.awt.Font;
import java.io.IOException;
import java.util.concurrent.Callable;

public class class3 implements Callable {
	public static class29 field24;
	static class146 field22;
	static Font field23;
	final class10 field25;
	// $FF: synthetic field
	final class14 this$0;

	class3(class14 var1, class10 var2) {
		this.this$0 = var1;
		this.field25 = var2;
	}

	public Object call() throws Exception {
		try {
			while (this.field25.method120()) {
				class261.method115(10L);
			}
		} catch (IOException var2) {
			return new class16("Error servicing REST query: " + var2.getMessage());
		}

		return this.field25.method121();
	}

	static void method26(class183 var0, int var1, int var2, int var3) {
		if (client.field1947 < 50 && class186.field2040.method1868() != 0) {
			if (var0.field1998 != null && var0.field1998.containsKey(var1)) {
				int var5 = (Integer)var0.field1998.get(var1);
				if (var5 != 0) {
					int var8 = var5 >> 8;
					int var9 = var5 >> 4 & 7;
					int var10 = var5 & 15;
					client.field1948[client.field1947] = var8;
					client.field1949[client.field1947] = var9;
					client.field1977[client.field1947] = 0;
					client.field1757[client.field1947] = null;
					int var11 = (var2 - 64) / 128;
					int var12 = (var3 - 64) / 128;
					client.field1803[client.field1947] = var10 + (var12 << 8) + (var11 << 16);
					++client.field1947;
				}

			}
		}
	}

	static int method27(int var0, class65 var1, boolean var2) {
		int var4;
		if (var0 == CS2Opcodes.OC_NAME) {
			var4 = class69.field579[--class94.field920];
			class69.field580[++class69.field581 - 1] = class208.method4105(var4).field2259;
			return 1;
		} else {
			int var5;
			class200 var6;
			if (var0 == CS2Opcodes.OC_OP) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				var6 = class208.method4105(var4);
				if (var5 >= 1 && var5 <= 5 && null != var6.field2257[var5 - 1]) {
					class69.field580[++class69.field581 - 1] = var6.field2257[var5 - 1];
				} else {
					class69.field580[++class69.field581 - 1] = "";
				}

				return 1;
			} else if (var0 == CS2Opcodes.OC_IOP) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				var6 = class208.method4105(var4);
				if (var5 >= 1 && var5 <= 5 && null != var6.field2277[var5 - 1]) {
					class69.field580[++class69.field581 - 1] = var6.field2277[var5 - 1];
				} else {
					class69.field580[++class69.field581 - 1] = "";
				}

				return 1;
			} else if (var0 == CS2Opcodes.OC_COST) {
				var4 = class69.field579[--class94.field920];
				class69.field579[++class94.field920 - 1] = class208.method4105(var4).field2271;
				return 1;
			} else if (var0 == CS2Opcodes.OC_STACKABLE) {
				var4 = class69.field579[--class94.field920];
				class69.field579[++class94.field920 - 1] = class208.method4105(var4).field2270 == 1 ? 1 : 0;
				return 1;
			} else {
				class200 var7;
				if (var0 == CS2Opcodes.OC_CERT) {
					var4 = class69.field579[--class94.field920];
					var7 = class208.method4105(var4);
					if (-1 == var7.field2294 && var7.field2298 >= 0) {
						class69.field579[++class94.field920 - 1] = var7.field2298;
					} else {
						class69.field579[++class94.field920 - 1] = var4;
					}

					return 1;
				} else if (var0 == CS2Opcodes.OC_UNCERT) {
					var4 = class69.field579[--class94.field920];
					var7 = class208.method4105(var4);
					if (var7.field2294 >= 0 && var7.field2298 >= 0) {
						class69.field579[++class94.field920 - 1] = var7.field2298;
					} else {
						class69.field579[++class94.field920 - 1] = var4;
					}

					return 1;
				} else if (var0 == CS2Opcodes.OC_MEMBERS) {
					var4 = class69.field579[--class94.field920];
					class69.field579[++class94.field920 - 1] = class208.method4105(var4).field2275 ? 1 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.OC_PLACEHOLDER) {
					var4 = class69.field579[--class94.field920];
					var7 = class208.method4105(var4);
					if (var7.field2307 == -1 && var7.field2283 >= 0) {
						class69.field579[++class94.field920 - 1] = var7.field2283;
					} else {
						class69.field579[++class94.field920 - 1] = var4;
					}

					return 1;
				} else if (var0 == CS2Opcodes.OC_UNPLACEHOLDER) {
					var4 = class69.field579[--class94.field920];
					var7 = class208.method4105(var4);
					if (var7.field2307 >= 0 && var7.field2283 >= 0) {
						class69.field579[++class94.field920 - 1] = var7.field2283;
					} else {
						class69.field579[++class94.field920 - 1] = var4;
					}

					return 1;
				} else if (var0 == CS2Opcodes.OC_FIND) {
					String var8 = class69.field580[--class69.field581];
					var5 = class69.field579[--class94.field920];
					class288.method5482(var8, var5 == 1);
					class69.field579[++class94.field920 - 1] = class80.field743;
					return 1;
				} else if (var0 != CS2Opcodes.OC_FINDNEXT) {
					if (var0 == CS2Opcodes.OC_FINDRESET) {
						class108.field1098 = 0;
						return 1;
					} else if (var0 == CS2Opcodes.OC_SHIFTCLICKOP) {
						var4 = class69.field579[--class94.field920];
						var5 = class208.method4105(var4).method3939();
						if (var5 == -1) {
							class69.field579[++class94.field920 - 1] = var5;
						} else {
							class69.field579[++class94.field920 - 1] = var5 + 1;
						}

						return 1;
					} else if (var0 == CS2Opcodes.OC_WEARPOS) {
						var4 = class69.field579[--class94.field920];
						class69.field579[++class94.field920 - 1] = class208.method4105(var4).field2272;
						return 1;
					} else if (var0 == CS2Opcodes.OC_WEARPOS2) {
						var4 = class69.field579[--class94.field920];
						class69.field579[++class94.field920 - 1] = class208.method4105(var4).field2293;
						return 1;
					} else if (var0 == CS2Opcodes.OC_WEARPOS3) {
						var4 = class69.field579[--class94.field920];
						class69.field579[++class94.field920 - 1] = class208.method4105(var4).field2263;
						return 1;
					} else if (var0 == CS2Opcodes.OC_WEIGHT) {
						var4 = class69.field579[--class94.field920];
						var7 = class208.method4105(var4);
						class69.field579[++class94.field920 - 1] = var7.field2269;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class20.field117 != null && class108.field1098 < class80.field743) {
						class69.field579[++class94.field920 - 1] = class20.field117[++class108.field1098 - 1] & '\uffff';
					} else {
						class69.field579[++class94.field920 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
