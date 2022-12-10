import java.util.Comparator;

final class class362 implements Comparator {
	static boolean field4347;
	static class271 field4348;

	class362() {
	}

	int method6741(class345 var1, class345 var2) {
		return var1.field4281.field4358 < var2.field4281.field4358 ? -1 : (var2.field4281.field4358 == var1.field4281.field4358 ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.method6741((class345)var1, (class345)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	static int method6745(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.CLIENTCLOCK) {
			class69.field579[++class94.field920 - 1] = client.field1700;
			return 1;
		} else {
			int var4;
			int var5;
			if (var0 == CS2Opcodes.INV_GETOBJ) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				class69.field579[++class94.field920 - 1] = class12.method167(var4, var5);
				return 1;
			} else if (var0 == CS2Opcodes.INV_GETNUM) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[1 + class94.field920];
				class69.field579[++class94.field920 - 1] = class86.method1876(var4, var5);
				return 1;
			} else if (var0 == CS2Opcodes.INV_TOTAL) {
				class94.field920 -= 2;
				var4 = class69.field579[class94.field920];
				var5 = class69.field579[class94.field920 + 1];
				class69.field579[++class94.field920 - 1] = class202.method3993(var4, var5);
				return 1;
			} else if (var0 == CS2Opcodes.INV_SIZE) {
				var4 = class69.field579[--class94.field920];
				class69.field579[++class94.field920 - 1] = class322.method6191(var4).field1629;
				return 1;
			} else if (var0 == CS2Opcodes.STAT) {
				var4 = class69.field579[--class94.field920];
				class69.field579[++class94.field920 - 1] = client.field1762[var4];
				return 1;
			} else if (var0 == CS2Opcodes.STAT_BASE) {
				var4 = class69.field579[--class94.field920];
				class69.field579[++class94.field920 - 1] = client.field1834[var4];
				return 1;
			} else if (var0 == CS2Opcodes.STAT_XP) {
				var4 = class69.field579[--class94.field920];
				class69.field579[++class94.field920 - 1] = client.field1835[var4];
				return 1;
			} else {
				int var6;
				if (var0 == CS2Opcodes.COORD) {
					var4 = class384.field4486;
					var5 = (class142.field1370.field1012 >> 7) + class151.field1447;
					var6 = (class142.field1370.field948 >> 7) + class388.field4509;
					class69.field579[++class94.field920 - 1] = (var4 << 28) + (var5 << 14) + var6;
					return 1;
				} else if (var0 == CS2Opcodes.COORDX) {
					var4 = class69.field579[--class94.field920];
					class69.field579[++class94.field920 - 1] = var4 >> 14 & 16383;
					return 1;
				} else if (var0 == CS2Opcodes.COORDY) {
					var4 = class69.field579[--class94.field920];
					class69.field579[++class94.field920 - 1] = var4 >> 28;
					return 1;
				} else if (var0 == CS2Opcodes.COORDZ) {
					var4 = class69.field579[--class94.field920];
					class69.field579[++class94.field920 - 1] = var4 & 16383;
					return 1;
				} else if (var0 == CS2Opcodes.MAP_MEMBERS) {
					class69.field579[++class94.field920 - 1] = client.field1691 ? 1 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.INVOTHER_GETOBJ) {
					class94.field920 -= 2;
					var4 = class69.field579[class94.field920] + 32768;
					var5 = class69.field579[class94.field920 + 1];
					class69.field579[++class94.field920 - 1] = class12.method167(var4, var5);
					return 1;
				} else if (var0 == CS2Opcodes.INVOTHER_GETNUM) {
					class94.field920 -= 2;
					var4 = 32768 + class69.field579[class94.field920];
					var5 = class69.field579[1 + class94.field920];
					class69.field579[++class94.field920 - 1] = class86.method1876(var4, var5);
					return 1;
				} else if (var0 == CS2Opcodes.INVOTHER_TOTAL) {
					class94.field920 -= 2;
					var4 = class69.field579[class94.field920] + 32768;
					var5 = class69.field579[1 + class94.field920];
					class69.field579[++class94.field920 - 1] = class202.method3993(var4, var5);
					return 1;
				} else if (var0 == CS2Opcodes.STAFFMODLEVEL) {
					if (client.field1950 >= 2) {
						class69.field579[++class94.field920 - 1] = client.field1950;
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else if (var0 == CS2Opcodes.REBOOTTIMER) {
					class69.field579[++class94.field920 - 1] = client.field1706;
					return 1;
				} else if (var0 == CS2Opcodes.MAP_WORLD) {
					class69.field579[++class94.field920 - 1] = client.field1864;
					return 1;
				} else if (var0 == CS2Opcodes.RUNENERGY_VISIBLE) {
					class69.field579[++class94.field920 - 1] = client.field1811 / 100;
					return 1;
				} else if (var0 == CS2Opcodes.RUNWEIGHT_VISIBLE) {
					class69.field579[++class94.field920 - 1] = client.field1870;
					return 1;
				} else if (var0 == CS2Opcodes.PLAYERMOD) {
					if (client.field1910) {
						class69.field579[++class94.field920 - 1] = 1;
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else if (var0 == CS2Opcodes.WORLDFLAGS) {
					class69.field579[++class94.field920 - 1] = client.field1777;
					return 1;
				} else if (var0 == CS2Opcodes.MOVECOORD) {
					class94.field920 -= 4;
					var4 = class69.field579[class94.field920];
					var5 = class69.field579[1 + class94.field920];
					var6 = class69.field579[2 + class94.field920];
					int var7 = class69.field579[3 + class94.field920];
					var4 += var5 << 14;
					var4 += var6 << 28;
					var4 += var7;
					class69.field579[++class94.field920 - 1] = var4;
					return 1;
				} else if (var0 == CS2Opcodes.MOUSE_GETX) {
					class69.field579[++class94.field920 - 1] = client.field1702;
					return 1;
				} else if (var0 == CS2Opcodes.MOUSE_GETY) {
					class69.field579[++class94.field920 - 1] = client.field1734;
					return 1;
				} else if (var0 == 3331) {
					class69.field579[++class94.field920 - 1] = client.field1811;
					return 1;
				} else {
					return 2;
				}
			}
		}
	}

	static void method6744() {
		if (class142.field1370.field1012 >> 7 == client.field1942 && class142.field1370.field948 >> 7 == client.field1688) {
			client.field1942 = 0;
		}

	}
}
