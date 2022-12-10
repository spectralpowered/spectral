public final class class218 {
	public static byte[][][] field2643;
	static boolean field2651;
	boolean field2647;
	int field2642;
	int field2644;
	int field2645;
	int field2646;
	int field2648;
	int field2649;

	class218(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		this.field2647 = true;
		this.field2649 = var1;
		this.field2648 = var2;
		this.field2644 = var3;
		this.field2645 = var4;
		this.field2646 = var5;
		this.field2642 = var6;
		this.field2647 = var7;
	}

	public static class487 method4526(int var0) {
		class487[] var2 = new class487[]{class487.field5038, class487.field5042, class487.field5037};
		class487[] var3 = var2;

		for (int var4 = 0; var4 < var3.length; ++var4) {
			class487 var5 = var3[var4];
			if (var5.field5040 == var0) {
				return var5;
			}
		}

		return null;
	}

	static int method4525(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_FIND_LISTENED) {
			if (null != class3.field22) {
				class69.field579[++class94.field920 - 1] = 1;
				class114.field1157 = class3.field22;
			} else {
				class69.field579[++class94.field920 - 1] = 0;
			}

			return 1;
		} else {
			int var4;
			if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_FIND_AFFINED) {
				var4 = class69.field579[--class94.field920];
				if (client.field1935[var4] != null) {
					class69.field579[++class94.field920 - 1] = 1;
					class114.field1157 = client.field1935[var4];
				} else {
					class69.field579[++class94.field920 - 1] = 0;
				}

				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETCLANNAME) {
				class69.field580[++class69.field581 - 1] = class114.field1157.field1392;
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETALLOWUNAFFINED) {
				class69.field579[++class94.field920 - 1] = class114.field1157.field1394 ? 1 : 0;
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETRANKTALK) {
				class69.field579[++class94.field920 - 1] = class114.field1157.field1395;
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETRANKKICK) {
				class69.field579[++class94.field920 - 1] = class114.field1157.field1396;
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETRANKLOOTSHARE) {
				class69.field579[++class94.field920 - 1] = class114.field1157.field1401;
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETCOINSHARE) {
				class69.field579[++class94.field920 - 1] = class114.field1157.field1398;
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETAFFINEDCOUNT) {
				class69.field579[++class94.field920 - 1] = class114.field1157.field1399;
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETAFFINEDDISPLAYNAME) {
				var4 = class69.field579[--class94.field920];
				class69.field580[++class69.field581 - 1] = class114.field1157.field1404[var4];
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETAFFINEDRANK) {
				var4 = class69.field579[--class94.field920];
				class69.field579[++class94.field920 - 1] = class114.field1157.field1410[var4];
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETBANNEDCOUNT) {
				class69.field579[++class94.field920 - 1] = class114.field1157.field1408;
				return 1;
			} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETBANNEDDISPLAYNAME) {
				var4 = class69.field579[--class94.field920];
				class69.field580[++class69.field581 - 1] = class114.field1157.field1409[var4];
				return 1;
			} else {
				int var6;
				int var7;
				if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETAFFINEDEXTRAINFO) {
					class94.field920 -= 3;
					var4 = class69.field579[class94.field920];
					var7 = class69.field579[class94.field920 + 1];
					var6 = class69.field579[2 + class94.field920];
					class69.field579[++class94.field920 - 1] = class114.field1157.method2572(var4, var7, var6);
					return 1;
				} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETCURRENTOWNER_SLOT) {
					class69.field579[++class94.field920 - 1] = class114.field1157.field1406;
					return 1;
				} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETREPLACEMENTOWNER_SLOT) {
					class69.field579[++class94.field920 - 1] = class114.field1157.field1407;
					return 1;
				} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETAFFINEDSLOT) {
					class69.field579[++class94.field920 - 1] = class114.field1157.method2569(class69.field580[--class69.field581]);
					return 1;
				} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETSORTEDAFFINEDSLOT) {
					class69.field579[class94.field920 - 1] = class114.field1157.method2600()[class69.field579[class94.field920 - 1]];
					return 1;
				} else if (var0 == CS2Opcodes.AFFINEDCLANSETTINGS_ADDBANNED_FROMCHANNEL) {
					class94.field920 -= 2;
					var4 = class69.field579[class94.field920];
					var7 = class69.field579[class94.field920 + 1];
					class326.method6243(var7, var4);
					return 1;
				} else if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETAFFINEDJOINRUNEDAY) {
					var4 = class69.field579[--class94.field920];
					class69.field579[++class94.field920 - 1] = class114.field1157.field1387[var4];
					return 1;
				} else {
					if (var0 == CS2Opcodes.AFFINEDCLANSETTINGS_SETMUTED_FROMCHANNEL) {
						class94.field920 -= 3;
						var4 = class69.field579[class94.field920];
						boolean var5 = 1 == class69.field579[1 + class94.field920];
						var6 = class69.field579[2 + class94.field920];
						class234.method4693(var6, var4, var5);
					}

					if (var0 == CS2Opcodes.ACTIVECLANSETTINGS_GETAFFINEDMUTED) {
						var4 = class69.field579[--class94.field920];
						class69.field579[++class94.field920 - 1] = class114.field1157.field1391[var4] ? 1 : 0;
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_FIND_LISTENED) {
						if (null != class161.field1507) {
							class69.field579[++class94.field920 - 1] = 1;
							class161.field1505 = class161.field1507;
						} else {
							class69.field579[++class94.field920 - 1] = 0;
						}

						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_FIND_AFFINED) {
						var4 = class69.field579[--class94.field920];
						if (client.field1814[var4] != null) {
							class69.field579[++class94.field920 - 1] = 1;
							class161.field1505 = client.field1814[var4];
							class15.field94 = var4;
						} else {
							class69.field579[++class94.field920 - 1] = 0;
						}

						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETCLANNAME) {
						class69.field580[++class69.field581 - 1] = class161.field1505.field1606;
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETRANKKICK) {
						class69.field579[++class94.field920 - 1] = class161.field1505.field1610;
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETRANKTALK) {
						class69.field579[++class94.field920 - 1] = class161.field1505.field1607;
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETUSERCOUNT) {
						class69.field579[++class94.field920 - 1] = class161.field1505.method2889();
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETUSERDISPLAYNAME) {
						var4 = class69.field579[--class94.field920];
						class69.field580[++class69.field581 - 1] = ((class135)class161.field1505.field1614.get(var4)).field1327.method8771();
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETUSERRANK) {
						var4 = class69.field579[--class94.field920];
						class69.field579[++class94.field920 - 1] = ((class135)class161.field1505.field1614.get(var4)).field1330;
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETUSERWORLD) {
						var4 = class69.field579[--class94.field920];
						class69.field579[++class94.field920 - 1] = ((class135)class161.field1505.field1614.get(var4)).field1329;
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_KICKUSER) {
						var4 = class69.field579[--class94.field920];
						class64.method1205(class15.field94, var4);
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETUSERSLOT) {
						class69.field579[++class94.field920 - 1] = class161.field1505.method2890(class69.field580[--class69.field581]);
						return 1;
					} else if (var0 == CS2Opcodes.ACTIVECLANCHANNEL_GETSORTEDUSERSLOT) {
						class69.field579[class94.field920 - 1] = class161.field1505.method2886()[class69.field579[class94.field920 - 1]];
						return 1;
					} else if (var0 == CS2Opcodes.CLANPROFILE_FIND) {
						class69.field579[++class94.field920 - 1] = null != class93.field910 ? 1 : 0;
						return 1;
					} else {
						return 2;
					}
				}
			}
		}
	}
}
