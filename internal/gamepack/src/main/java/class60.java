import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ex"
)
public class class60 extends class480 {
	@ObfInfo(
		owner = "ex",
		name = "bb",
		desc = "Ljava/lang/String;"
	)
	static String field603;
	@ObfInfo(
		owner = "ex",
		name = "x",
		desc = "I"
	)
	int field599;
	@ObfInfo(
		owner = "ex",
		name = "v",
		desc = "I"
	)
	int field600;
	@ObfInfo(
		owner = "ex",
		name = "e",
		desc = "I"
	)
	int field601;
	@ObfInfo(
		owner = "ex",
		name = "h",
		desc = "I"
	)
	int field602;
	// $FF: synthetic field
	@ObfInfo(
		owner = "ex",
		name = "this$0",
		desc = "Lem;"
	)
	final class182 this$0;

	@ObfInfo(
		owner = "ex",
		name = "<init>",
		desc = "(Lem;)V"
	)
	class60(class182 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(
		owner = "ex",
		name = "h",
		desc = "(Lqy;I)V"
	)
	void method2367(class127 var1) {
		this.field602 = var1.method595();
		this.field599 = var1.method595();
		this.field601 = var1.method547();
		this.field600 = var1.method547();
	}

	@ObfInfo(
		owner = "ex",
		name = "e",
		desc = "(Lep;I)V"
	)
	void method2368(class429 var1) {
		var1.method2111(this.field602, this.field599, this.field601, this.field600);
	}

	@ObfInfo(
		owner = "ex",
		name = "ai",
		desc = "(ILbm;ZB)I"
	)
	static int method278(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.WORLDLIST_FETCH) {
			class386.field3248[++class161.field1227 - 1] = class74.method326() ? 1 : 0;
			return 1;
		} else {
			class2 var4;
			if (var0 == ScriptOpcodes.WORLDLIST_START) {
				var4 = class284.method1408();
				if (null != var4) {
					class386.field3248[++class161.field1227 - 1] = var4.field10;
					class386.field3248[++class161.field1227 - 1] = var4.field16;
					class386.field3249[++class386.field3250 - 1] = var4.field13;
					class386.field3248[++class161.field1227 - 1] = var4.field19;
					class386.field3248[++class161.field1227 - 1] = var4.field17;
					class386.field3249[++class386.field3250 - 1] = var4.field18;
				} else {
					class386.field3248[++class161.field1227 - 1] = -1;
					class386.field3248[++class161.field1227 - 1] = 0;
					class386.field3249[++class386.field3250 - 1] = "";
					class386.field3248[++class161.field1227 - 1] = 0;
					class386.field3248[++class161.field1227 - 1] = 0;
					class386.field3249[++class386.field3250 - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.WORLDLIST_NEXT) {
				var4 = class345.method1752();
				if (null != var4) {
					class386.field3248[++class161.field1227 - 1] = var4.field10;
					class386.field3248[++class161.field1227 - 1] = var4.field16;
					class386.field3249[++class386.field3250 - 1] = var4.field13;
					class386.field3248[++class161.field1227 - 1] = var4.field19;
					class386.field3248[++class161.field1227 - 1] = var4.field17;
					class386.field3249[++class386.field3250 - 1] = var4.field18;
				} else {
					class386.field3248[++class161.field1227 - 1] = -1;
					class386.field3248[++class161.field1227 - 1] = 0;
					class386.field3249[++class386.field3250 - 1] = "";
					class386.field3248[++class161.field1227 - 1] = 0;
					class386.field3248[++class161.field1227 - 1] = 0;
					class386.field3249[++class386.field3250 - 1] = "";
				}

				return 1;
			} else {
				class2 var5;
				int var6;
				int var8;
				if (var0 == ScriptOpcodes.WORLDLIST_SPECIFIC) {
					var8 = class386.field3248[--class161.field1227];
					var5 = null;

					for (var6 = 0; var6 < class2.field11; ++var6) {
						if (var8 == class2.field12[var6].field10) {
							var5 = class2.field12[var6];
							break;
						}
					}

					if (var5 != null) {
						class386.field3248[++class161.field1227 - 1] = var5.field10;
						class386.field3248[++class161.field1227 - 1] = var5.field16;
						class386.field3249[++class386.field3250 - 1] = var5.field13;
						class386.field3248[++class161.field1227 - 1] = var5.field19;
						class386.field3248[++class161.field1227 - 1] = var5.field17;
						class386.field3249[++class386.field3250 - 1] = var5.field18;
					} else {
						class386.field3248[++class161.field1227 - 1] = -1;
						class386.field3248[++class161.field1227 - 1] = 0;
						class386.field3249[++class386.field3250 - 1] = "";
						class386.field3248[++class161.field1227 - 1] = 0;
						class386.field3248[++class161.field1227 - 1] = 0;
						class386.field3249[++class386.field3250 - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDLIST_SORT) {
					class161.field1227 -= 4;
					var8 = class386.field3248[class161.field1227];
					boolean var11 = 1 == class386.field3248[1 + class161.field1227];
					var6 = class386.field3248[2 + class161.field1227];
					boolean var7 = class386.field3248[3 + class161.field1227] == 1;
					class481.method2372(var8, var11, var6, var7);
					return 1;
				} else if (var0 != ScriptOpcodes._6511) {
					if (var0 == ScriptOpcodes.SETFOLLOWEROPSLOWPRIORITY) {
						client.field378 = class386.field3248[--class161.field1227] == 1;
						return 1;
					} else {
						int var9;
						class123 var10;
						if (var0 == ScriptOpcodes.NC_PARAM) {
							class161.field1227 -= 2;
							var8 = class386.field3248[class161.field1227];
							var9 = class386.field3248[class161.field1227 + 1];
							var10 = class283.method1395(var9);
							if (var10.method524()) {
								class386.field3249[++class386.field3250 - 1] = class421.method2049(var8, (byte)103).method2057(var9, var10.field1057);
							} else {
								class386.field3248[++class161.field1227 - 1] = class421.method2049(var8, (byte)121).method2056(var9, var10.field1059);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.LC_PARAM) {
							class161.field1227 -= 2;
							var8 = class386.field3248[class161.field1227];
							var9 = class386.field3248[class161.field1227 + 1];
							var10 = class283.method1395(var9);
							if (var10.method524()) {
								class386.field3249[++class386.field3250 - 1] = class85.method356(var8).method370(var9, var10.field1057);
							} else {
								class386.field3248[++class161.field1227 - 1] = class85.method356(var8).method369(var9, var10.field1059);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.OC_PARAM) {
							class161.field1227 -= 2;
							var8 = class386.field3248[class161.field1227];
							var9 = class386.field3248[class161.field1227 + 1];
							var10 = class283.method1395(var9);
							if (var10.method524()) {
								class386.field3249[++class386.field3250 - 1] = class423.method2062(var8).method1208(var9, var10.field1057);
							} else {
								class386.field3248[++class161.field1227 - 1] = class423.method2062(var8).method1207(var9, var10.field1059);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.STRUCT_PARAM) {
							class161.field1227 -= 2;
							var8 = class386.field3248[class161.field1227];
							var9 = class386.field3248[class161.field1227 + 1];
							var10 = class283.method1395(var9);
							if (var10.method524()) {
								class386.field3249[++class386.field3250 - 1] = class134.method628(var8).method254(var9, var10.field1057);
							} else {
								class386.field3248[++class161.field1227 - 1] = class134.method628(var8).method253(var9, var10.field1059);
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ON_MOBILE) {
							class386.field3248[++class161.field1227 - 1] = client.field461 ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CLIENTTYPE) {
							class386.field3248[++class161.field1227 - 1] = client.field315;
							return 1;
						} else if (var0 == ScriptOpcodes._6520) {
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == ScriptOpcodes._6522) {
							--class386.field3250;
							--class161.field1227;
							return 1;
						} else if (var0 == ScriptOpcodes._6523) {
							--class386.field3250;
							--class161.field1227;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYLEVEL) {
							class386.field3248[++class161.field1227 - 1] = -1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_BATTERYCHARGING) {
							class386.field3248[++class161.field1227 - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.MOBILE_WIFIAVAILABLE) {
							class386.field3248[++class161.field1227 - 1] = 1;
							return 1;
						} else if (var0 == ScriptOpcodes.PLATFORMTYPE) {
							class386.field3248[++class161.field1227 - 1] = client.field411;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = class386.field3248[--class161.field1227];
					if (var8 >= 0 && var8 < class2.field11) {
						var5 = class2.field12[var8];
						class386.field3248[++class161.field1227 - 1] = var5.field10;
						class386.field3248[++class161.field1227 - 1] = var5.field16;
						class386.field3249[++class386.field3250 - 1] = var5.field13;
						class386.field3248[++class161.field1227 - 1] = var5.field19;
						class386.field3248[++class161.field1227 - 1] = var5.field17;
						class386.field3249[++class386.field3250 - 1] = var5.field18;
					} else {
						class386.field3248[++class161.field1227 - 1] = -1;
						class386.field3248[++class161.field1227 - 1] = 0;
						class386.field3249[++class386.field3250 - 1] = "";
						class386.field3248[++class161.field1227 - 1] = 0;
						class386.field3248[++class161.field1227 - 1] = 0;
						class386.field3249[++class386.field3250 - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
