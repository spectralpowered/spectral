import io.spectralpowered.ObfInfo;
import java.util.Comparator;

@ObfInfo(
	name = "mx"
)
final class class375 implements Comparator {
	@ObfInfo(
		owner = "mx",
		name = "x",
		desc = "Z"
	)
	static boolean field3180;
	@ObfInfo(
		owner = "mx",
		name = "c",
		desc = "Ljk;"
	)
	static class413 field3181;

	@ObfInfo(
		owner = "mx",
		name = "h",
		desc = "(Lmg;Lmg;I)I"
	)
	int method1850(class258 var1, class258 var2) {
		return var1.field2108.field2568 < var2.field2108.field2568 ? -1 : (var2.field2108.field2568 == var1.field2108.field2568 ? 0 : 1);
	}

	@ObfInfo(
		owner = "mx",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method1850((class258)var1, (class258)var2);
	}

	@ObfInfo(
		owner = "mx",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(
		owner = "mx",
		name = "w",
		desc = "(ILbm;ZI)I"
	)
	static int method1852(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.CLIENTCLOCK) {
			class386.field3248[++class161.field1227 - 1] = client.field231;
			return 1;
		} else {
			int var4;
			int var5;
			if (var0 == ScriptOpcodes.INV_GETOBJ) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				class386.field3248[++class161.field1227 - 1] = class362.method1804(var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_GETNUM) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[1 + class161.field1227];
				class386.field3248[++class161.field1227 - 1] = class446.method2232(var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_TOTAL) {
				class161.field1227 -= 2;
				var4 = class386.field3248[class161.field1227];
				var5 = class386.field3248[class161.field1227 + 1];
				class386.field3248[++class161.field1227 - 1] = class70.method309(var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.INV_SIZE) {
				var4 = class386.field3248[--class161.field1227];
				class386.field3248[++class161.field1227 - 1] = class422.method2050(var4).field1266;
				return 1;
			} else if (var0 == ScriptOpcodes.STAT) {
				var4 = class386.field3248[--class161.field1227];
				class386.field3248[++class161.field1227 - 1] = client.field293[var4];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_BASE) {
				var4 = class386.field3248[--class161.field1227];
				class386.field3248[++class161.field1227 - 1] = client.field365[var4];
				return 1;
			} else if (var0 == ScriptOpcodes.STAT_XP) {
				var4 = class386.field3248[--class161.field1227];
				class386.field3248[++class161.field1227 - 1] = client.field366[var4];
				return 1;
			} else {
				int var6;
				if (var0 == ScriptOpcodes.COORD) {
					var4 = class347.field2878;
					var5 = (class113.field846.field2672 >> 7) + class312.field2465;
					var6 = (class113.field846.field2608 >> 7) + class325.field2575;
					class386.field3248[++class161.field1227 - 1] = (var4 << 28) + (var5 << 14) + var6;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDX) {
					var4 = class386.field3248[--class161.field1227];
					class386.field3248[++class161.field1227 - 1] = var4 >> 14 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDY) {
					var4 = class386.field3248[--class161.field1227];
					class386.field3248[++class161.field1227 - 1] = var4 >> 28;
					return 1;
				} else if (var0 == ScriptOpcodes.COORDZ) {
					var4 = class386.field3248[--class161.field1227];
					class386.field3248[++class161.field1227 - 1] = var4 & 16383;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_MEMBERS) {
					class386.field3248[++class161.field1227 - 1] = client.field222 ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETOBJ) {
					class161.field1227 -= 2;
					var4 = class386.field3248[class161.field1227] + 32768;
					var5 = class386.field3248[class161.field1227 + 1];
					class386.field3248[++class161.field1227 - 1] = class362.method1804(var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_GETNUM) {
					class161.field1227 -= 2;
					var4 = 32768 + class386.field3248[class161.field1227];
					var5 = class386.field3248[1 + class161.field1227];
					class386.field3248[++class161.field1227 - 1] = class446.method2232(var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.INVOTHER_TOTAL) {
					class161.field1227 -= 2;
					var4 = class386.field3248[class161.field1227] + 32768;
					var5 = class386.field3248[1 + class161.field1227];
					class386.field3248[++class161.field1227 - 1] = class70.method309(var4, var5);
					return 1;
				} else if (var0 == ScriptOpcodes.STAFFMODLEVEL) {
					if (client.field481 >= 2) {
						class386.field3248[++class161.field1227 - 1] = client.field481;
					} else {
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.REBOOTTIMER) {
					class386.field3248[++class161.field1227 - 1] = client.field237;
					return 1;
				} else if (var0 == ScriptOpcodes.MAP_WORLD) {
					class386.field3248[++class161.field1227 - 1] = client.field395;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNENERGY_VISIBLE) {
					class386.field3248[++class161.field1227 - 1] = client.field342 / 100;
					return 1;
				} else if (var0 == ScriptOpcodes.RUNWEIGHT_VISIBLE) {
					class386.field3248[++class161.field1227 - 1] = client.field401;
					return 1;
				} else if (var0 == ScriptOpcodes.PLAYERMOD) {
					if (client.field441) {
						class386.field3248[++class161.field1227 - 1] = 1;
					} else {
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.WORLDFLAGS) {
					class386.field3248[++class161.field1227 - 1] = client.field308;
					return 1;
				} else if (var0 == ScriptOpcodes.MOVECOORD) {
					class161.field1227 -= 4;
					var4 = class386.field3248[class161.field1227];
					var5 = class386.field3248[1 + class161.field1227];
					var6 = class386.field3248[2 + class161.field1227];
					int var7 = class386.field3248[3 + class161.field1227];
					var4 += var5 << 14;
					var4 += var6 << 28;
					var4 += var7;
					class386.field3248[++class161.field1227 - 1] = var4;
					return 1;
				} else if (var0 == ScriptOpcodes.MOUSE_GETX) {
					class386.field3248[++class161.field1227 - 1] = client.field233;
					return 1;
				} else if (var0 == ScriptOpcodes.MOUSE_GETY) {
					class386.field3248[++class161.field1227 - 1] = client.field265;
					return 1;
				} else if (var0 == 3331) {
					class386.field3248[++class161.field1227 - 1] = client.field342;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	@ObfInfo(
		owner = "mx",
		name = "hd",
		desc = "(B)V"
	)
	static void method1851() {
		if (class113.field846.field2672 >> 7 == client.field473 && class113.field846.field2608 >> 7 == client.field219) {
			client.field473 = 0;
		}

	}
}
