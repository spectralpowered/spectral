import io.spectralpowered.ObfInfo;
import java.awt.Font;
import java.io.IOException;
import java.util.concurrent.Callable;

@ObfInfo(
	name = "c"
)
public class class91 implements Callable {
	@ObfInfo(
		owner = "c",
		name = "i",
		desc = "Lac;"
	)
	public static class289 field772;
	@ObfInfo(
		owner = "c",
		name = "sr",
		desc = "Lep;"
	)
	static class429 field770;
	@ObfInfo(
		owner = "c",
		name = "am",
		desc = "Ljava/awt/Font;"
	)
	static Font field771;
	// $FF: synthetic field
	@ObfInfo(
		owner = "c",
		name = "this$0",
		desc = "Ln;"
	)
	final class19 this$0;
	@ObfInfo(
		owner = "c",
		name = "h",
		desc = "Lj;"
	)
	final class192 field773;

	@ObfInfo(
		owner = "c",
		name = "<init>",
		desc = "(Ln;Lj;)V"
	)
	class91(class19 var1, class192 var2) {
		this.this$0 = var1;
		this.field773 = var2;
	}

	@ObfInfo(
		owner = "c",
		name = "call",
		desc = "()Ljava/lang/Object;"
	)
	public Object call() throws Exception {
		try {
			while (this.field773.method864()) {
				class286.method1421(10L);
			}
		} catch (IOException var2) {
			return new class32("Error servicing REST query: " + var2.getMessage());
		}

		return this.field773.method865();
	}

	@ObfInfo(
		owner = "c",
		name = "am",
		desc = "(ILbm;ZI)I"
	)
	static int method382(int var0, class461 var1, boolean var2) {
		return 2;
	}

	@ObfInfo(
		owner = "c",
		name = "gi",
		desc = "(Lga;IIIS)V"
	)
	static void method383(class242 var0, int var1, int var2, int var3) {
		if (client.field478 < 50 && class50.field574.method2230() != 0) {
			if (var0.field2033 != null && var0.field2033.containsKey(var1)) {
				int var5 = (Integer)var0.field2033.get(var1);
				if (var5 != 0) {
					int var8 = var5 >> 8;
					int var9 = var5 >> 4 & 7;
					int var10 = var5 & 15;
					client.field479[client.field478] = var8;
					client.field480[client.field478] = var9;
					client.field508[client.field478] = 0;
					client.field288[client.field478] = null;
					int var11 = (var2 - 64) / 128;
					int var12 = (var3 - 64) / 128;
					client.field334[client.field478] = var10 + (var12 << 8) + (var11 << 16);
					++client.field478;
				}

			}
		}
	}

	@ObfInfo(
		owner = "c",
		name = "ay",
		desc = "(ILbm;ZB)I"
	)
	static int method384(int var0, class461 var1, boolean var2) {
		int var4;
		if (var0 == ScriptOpcodes.OC_NAME) {
			var4 = class386.field3248[--class161.field1227];
			class386.field3249[++class386.field3250 - 1] = class423.method2062(var4).field2147;
			return 1;
		} else {
			int var5;
			class263 var6;
			if (var0 == ScriptOpcodes.OC_OP) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				var6 = class423.method2062(var4);
				if (var5 >= 1 && var5 <= 5 && null != var6.field2145[var5 - 1]) {
					class386.field3249[++class386.field3250 - 1] = var6.field2145[var5 - 1];
				} else {
					class386.field3249[++class386.field3250 - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_IOP) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				var6 = class423.method2062(var4);
				if (var5 >= 1 && var5 <= 5 && null != var6.field2164[var5 - 1]) {
					class386.field3249[++class386.field3250 - 1] = var6.field2164[var5 - 1];
				} else {
					class386.field3249[++class386.field3250 - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.OC_COST) {
				var4 = class386.field3248[--class161.field1227];
				class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2158;
				return 1;
			} else if (var0 == ScriptOpcodes.OC_STACKABLE) {
				var4 = class386.field3248[--class161.field1227];
				class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2157 == 1 ? 1 : 0;
				return 1;
			} else {
				class263 var7;
				if (var0 == ScriptOpcodes.OC_CERT) {
					var4 = class386.field3248[--class161.field1227];
					var7 = class423.method2062(var4);
					if (-1 == var7.field2181 && var7.field2185 >= 0) {
						class386.field3248[++class161.field1227 - 1] = var7.field2185;
					} else {
						class386.field3248[++class161.field1227 - 1] = var4;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNCERT) {
					var4 = class386.field3248[--class161.field1227];
					var7 = class423.method2062(var4);
					if (var7.field2181 >= 0 && var7.field2185 >= 0) {
						class386.field3248[++class161.field1227 - 1] = var7.field2185;
					} else {
						class386.field3248[++class161.field1227 - 1] = var4;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_MEMBERS) {
					var4 = class386.field3248[--class161.field1227];
					class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2162 ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
					var4 = class386.field3248[--class161.field1227];
					var7 = class423.method2062(var4);
					if (var7.field2193 == -1 && var7.field2170 >= 0) {
						class386.field3248[++class161.field1227 - 1] = var7.field2170;
					} else {
						class386.field3248[++class161.field1227 - 1] = var4;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
					var4 = class386.field3248[--class161.field1227];
					var7 = class423.method2062(var4);
					if (var7.field2193 >= 0 && var7.field2170 >= 0) {
						class386.field3248[++class161.field1227 - 1] = var7.field2170;
					} else {
						class386.field3248[++class161.field1227 - 1] = var4;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.OC_FIND) {
					String var8 = class386.field3249[--class386.field3250];
					var5 = class386.field3248[--class161.field1227];
					class146.method693(var8, var5 == 1);
					class386.field3248[++class161.field1227 - 1] = class488.field4076;
					return 1;
				} else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
					if (var0 == ScriptOpcodes.OC_FINDRESET) {
						class61.field605 = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.OC_SHIFTCLICKOP) {
						var4 = class386.field3248[--class161.field1227];
						var5 = class423.method2062(var4).method1210();
						if (var5 == -1) {
							class386.field3248[++class161.field1227 - 1] = var5;
						} else {
							class386.field3248[++class161.field1227 - 1] = var5 + 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.OC_WEARPOS) {
						var4 = class386.field3248[--class161.field1227];
						class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2159;
						return 1;
					} else if (var0 == ScriptOpcodes.OC_WEARPOS2) {
						var4 = class386.field3248[--class161.field1227];
						class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2180;
						return 1;
					} else if (var0 == ScriptOpcodes.OC_WEARPOS3) {
						var4 = class386.field3248[--class161.field1227];
						class386.field3248[++class161.field1227 - 1] = class423.method2062(var4).field2150;
						return 1;
					} else if (var0 == ScriptOpcodes.OC_WEIGHT) {
						var4 = class386.field3248[--class161.field1227];
						var7 = class423.method2062(var4);
						class386.field3248[++class161.field1227 - 1] = var7.field2156;
						return 1;
					} else {
						return 2;
					}
				} else {
					if (class3.field22 != null && class61.field605 < class488.field4076) {
						class386.field3248[++class161.field1227 - 1] = class3.field22[++class61.field605 - 1] & '\uffff';
					} else {
						class386.field3248[++class161.field1227 - 1] = -1;
					}

					return 1;
				}
			}
		}
	}
}
