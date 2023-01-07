import io.spectralpowered.ObfInfo;
import java.applet.Applet;

@ObfInfo(
	name = "ar"
)
public class class128 {
	@ObfInfo(
		owner = "ar",
		name = "h",
		desc = "Ljava/applet/Applet;"
	)
	public static Applet field1073;
	@ObfInfo(
		owner = "ar",
		name = "e",
		desc = "Ljava/lang/String;"
	)
	public static String field1074;
	@ObfInfo(
		owner = "ar",
		name = "ib",
		desc = "[Lra;"
	)
	static class344[] field1075;
	@ObfInfo(
		owner = "ar",
		name = "u",
		desc = "I"
	)
	static int field1076;

	static {
		field1073 = null;
		field1074 = "";
	}

	@ObfInfo(
		owner = "ar",
		name = "h",
		desc = "(Ljava/lang/CharSequence;I)J"
	)
	public static long method607(CharSequence var0) {
		long var2 = 0L;
		int var4 = var0.length();

		for (int var5 = 0; var5 < var4; ++var5) {
			var2 *= 37L;
			char var6 = var0.charAt(var5);
			if (var6 >= 'A' && var6 <= 'Z') {
				var2 += (long)(var6 + 1 - 65);
			} else if (var6 >= 'a' && var6 <= 'z') {
				var2 += (long)(var6 + 1 - 97);
			} else if (var6 >= '0' && var6 <= '9') {
				var2 += (long)(var6 + 27 - 48);
			}

			if (var2 >= 177917621779460413L) {
				break;
			}
		}

		while (var2 % 37L == 0L && 0L != var2) {
			var2 /= 37L;
		}

		return var2;
	}

	@ObfInfo(
		owner = "ar",
		name = "v",
		desc = "(II)V"
	)
	public static void method610(int var0) {
		if (class40.field201 != 0) {
			class489.field4078 = var0;
		} else {
			class230.field1943.method2427(var0);
		}

	}

	@ObfInfo(
		owner = "ar",
		name = "f",
		desc = "(I)V"
	)
	static void method606() {
		class201.field1755 = new class170(32);
	}

	@ObfInfo(
		owner = "ar",
		name = "r",
		desc = "(ILbm;ZI)I"
	)
	static int method609(int var0, class461 var1, boolean var2) {
		boolean var4 = true;
		class120 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class67.method299(class386.field3248[--class161.field1227]);
			var4 = false;
		} else {
			var5 = var2 ? class108.field822 : class37.field183;
		}

		int var12;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var12 = class386.field3248[--class161.field1227] - 1;
			if (var12 >= 0 && var12 <= 9) {
				var5.method484(var12, class386.field3249[--class386.field3250]);
				return 1;
			} else {
				--class386.field3250;
				return 1;
			}
		} else {
			int var7;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				class161.field1227 -= 2;
				var12 = class386.field3248[class161.field1227];
				var7 = class386.field3248[1 + class161.field1227];
				var5.field979 = class483.method2375(var12, var7);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var5.field982 = class386.field3248[--class161.field1227] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var5.field980 = class386.field3248[--class161.field1227];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var5.field933 = class386.field3248[--class161.field1227];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var5.field894 = class386.field3249[--class386.field3250];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var5.field983 = class386.field3249[--class386.field3250];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var5.field978 = null;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETSHIFTCLICKOP) {
				var5.field1043 = class386.field3248[--class161.field1227] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes._1309) {
				--class161.field1227;
				return 1;
			} else {
				int var8;
				byte[] var10;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var6;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						class161.field1227 -= 2;
						var6 = 10;
						var10 = new byte[]{(byte)class386.field3248[class161.field1227]};
						byte[] var11 = new byte[]{(byte)class386.field3248[class161.field1227 + 1]};
						class362.method1805(var5, var6, var10, var11);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						class161.field1227 -= 3;
						var12 = class386.field3248[class161.field1227] - 1;
						var7 = class386.field3248[1 + class161.field1227];
						var8 = class386.field3248[class161.field1227 + 2];
						if (var12 >= 0 && var12 <= 9) {
							class374.method1846(var5, var12, var7, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var6 = 10;
						var7 = class386.field3248[--class161.field1227];
						var8 = class386.field3248[--class161.field1227];
						class374.method1846(var5, var6, var7, var8);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--class161.field1227;
						var12 = class386.field3248[class161.field1227] - 1;
						if (var12 >= 0 && var12 <= 9) {
							class183.method834(var5, var12);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var6 = 10;
						class183.method834(var5, var6);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var9 = null;
					var10 = null;
					if (var4) {
						class161.field1227 -= 10;

						for (var8 = 0; var8 < 10 && class386.field3248[class161.field1227 + var8] >= 0; var8 += 2) {
						}

						if (var8 > 0) {
							var9 = new byte[var8 / 2];
							var10 = new byte[var8 / 2];

							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var9[var8 / 2] = (byte)class386.field3248[class161.field1227 + var8];
								var10[var8 / 2] = (byte)class386.field3248[1 + class161.field1227 + var8];
							}
						}
					} else {
						class161.field1227 -= 2;
						var9 = new byte[]{(byte)class386.field3248[class161.field1227]};
						var10 = new byte[]{(byte)class386.field3248[class161.field1227 + 1]};
					}

					var8 = class386.field3248[--class161.field1227] - 1;
					if (var8 >= 0 && var8 <= 9) {
						class362.method1805(var5, var8, var9, var10);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "ar",
		name = "gr",
		desc = "(II)V"
	)
	static void method611(int var0) {
		int var2 = class339.method1701();
		if (var0 == -3) {
			class300.method1452(class177.field1368, class177.field1556, class177.field1370);
		} else if (var0 == -2) {
			class300.method1452(class177.field1371, class177.field1331, class177.field1358);
		} else if (var0 == -1) {
			class300.method1452(class177.field1374, class177.field1375, class177.field1376);
		} else if (var0 == 3) {
			class286.method1419(3);
			class359.field3059 = 1;
		} else if (var0 == 4) {
			class297.method1443(0);
		} else if (var0 == 5) {
			class359.field3059 = 2;
			class300.method1452(class177.field1380, class177.field1493, class177.field1382);
		} else if (var0 == 68 || !client.field461 && var0 == 6) {
			class300.method1452(class177.field1383, class177.field1384, class177.field1385);
		} else if (var0 == 7) {
			class300.method1452(class177.field1386, class177.field1348, class177.field1388);
		} else if (var0 == 8) {
			class300.method1452(class177.field1389, class177.field1390, class177.field1391);
		} else if (var0 == 9) {
			class300.method1452(class177.field1392, class177.field1393, class177.field1394);
		} else if (var0 == 10) {
			class300.method1452(class177.field1395, class177.field1396, class177.field1397);
		} else if (var0 == 11) {
			class300.method1452(class177.field1398, class177.field1399, class177.field1400);
		} else if (var0 == 12) {
			class300.method1452(class177.field1401, class177.field1402, class177.field1403);
		} else if (var0 == 13) {
			class300.method1452(class177.field1404, class177.field1517, class177.field1483);
		} else if (var0 == 14) {
			class300.method1452(class177.field1628, class177.field1408, class177.field1434);
		} else if (var0 == 16) {
			class300.method1452(class177.field1480, class177.field1411, class177.field1605);
		} else if (var0 == 17) {
			class300.method1452(class177.field1621, class177.field1414, class177.field1547);
		} else if (var0 == 18) {
			class297.method1443(1);
		} else if (var0 == 19) {
			class300.method1452(class177.field1419, class177.field1469, class177.field1421);
		} else if (var0 == 20) {
			class300.method1452(class177.field1422, class177.field1525, class177.field1467);
		} else if (var0 == 22) {
			class300.method1452(class177.field1373, class177.field1426, class177.field1427);
		} else if (var0 == 23) {
			class300.method1452(class177.field1515, class177.field1429, class177.field1430);
		} else if (var0 == 24) {
			class300.method1452(class177.field1424, class177.field1432, class177.field1433);
		} else if (var0 == 25) {
			class300.method1452(class177.field1487, class177.field1512, class177.field1534);
		} else if (var0 == 26) {
			class300.method1452(class177.field1437, class177.field1438, class177.field1439);
		} else if (var0 == 27) {
			class300.method1452(class177.field1440, class177.field1441, class177.field1442);
		} else if (var0 == 31) {
			class300.method1452(class177.field1361, class177.field1562, class177.field1552);
		} else if (var0 == 32) {
			class297.method1443(2);
		} else if (var0 == 37) {
			class300.method1452(class177.field1619, class177.field1425, class177.field1457);
		} else if (var0 == 38) {
			class300.method1452(class177.field1458, class177.field1415, class177.field1460);
		} else if (var0 == 55) {
			class286.method1419(8);
		} else {
			if (var0 == 56) {
				class300.method1452(class177.field1472, class177.field1542, class177.field1626);
				class261.method1113(11);
				return;
			}

			if (var0 == 57) {
				class300.method1452(class177.field1468, class177.field1336, class177.field1431);
				class261.method1113(11);
				return;
			}

			if (var0 == 61) {
				class300.method1452("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class286.method1419(7);
			} else {
				if (var0 == 62) {
					class261.method1113(10);
					class286.method1419(9);
					class300.method1452(class177.field1614, class177.field1342, class177.field1473);
					return;
				}

				if (var0 == 63) {
					class261.method1113(10);
					class286.method1419(9);
					class300.method1452(class177.field1474, class177.field1580, class177.field1476);
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class261.method1113(10);
					class286.method1419(9);
					class300.method1452(class177.field1477, class177.field1478, class177.field1479);
					return;
				}

				if (var0 == 71) {
					class261.method1113(10);
					class286.method1419(7);
					class300.method1452("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class261.method1113(10);
					class286.method1419(6);
					class300.method1452(class177.field1409, class177.field1625, class177.field1636);
				} else if (var0 == 72) {
					class261.method1113(10);
					class286.method1419(26);
				} else {
					class300.method1452(class177.field1504, class177.field1481, class177.field1451);
				}
			}
		}

		class261.method1113(10);
		boolean var3 = var2 != class339.method1701();
		if (!var3 && client.field353.method963()) {
			class286.method1419(9);
		}

	}

	@ObfInfo(
		owner = "ar",
		name = "jg",
		desc = "(IIIII)V"
	)
	static void method608(int var0, int var1, int var2, int var3) {
		class120 var5 = class483.method2375(var0, var1);
		if (null != var5 && null != var5.field984) {
			class488 var6 = new class488();
			var6.field4067 = var5;
			var6.field4069 = var5.field984;
			class396.method1949(var6);
		}

		client.field390 = var3;
		client.field388 = true;
		class471.field3960 = var0;
		client.field389 = var1;
		class32.field177 = var2;
		class184.method836(var5);
	}
}
