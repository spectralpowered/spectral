public class class154 extends class152 {
	static String field1469;
	int field1464;
	int field1465;
	int field1466;
	int field1467;
	// $FF: synthetic field
	final class143 this$0;

	class154(class143 var1) {
		this.this$0 = var1;
	}

	void method2674(class467 var1) {
		this.field1467 = var1.method8480();
		this.field1464 = var1.method8480();
		this.field1466 = var1.method8326();
		this.field1465 = var1.method8326();
	}

	void method2677(class146 var1) {
		var1.method2585(this.field1467, this.field1464, this.field1466, this.field1465);
	}

	static int method2710(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.WORLDLIST_FETCH) {
			class69.field579[++class94.field920 - 1] = class39.method507() ? 1 : 0;
			return 1;
		} else {
			class78 var4;
			if (var0 == CS2Opcodes.WORLDLIST_START) {
				var4 = class78.method6071();
				if (null != var4) {
					class69.field579[++class94.field920 - 1] = var4.field708;
					class69.field579[++class94.field920 - 1] = var4.field714;
					class69.field580[++class69.field581 - 1] = var4.field711;
					class69.field579[++class94.field920 - 1] = var4.field717;
					class69.field579[++class94.field920 - 1] = var4.field715;
					class69.field580[++class69.field581 - 1] = var4.field716;
				} else {
					class69.field579[++class94.field920 - 1] = -1;
					class69.field579[++class94.field920 - 1] = 0;
					class69.field580[++class69.field581 - 1] = "";
					class69.field579[++class94.field920 - 1] = 0;
					class69.field579[++class94.field920 - 1] = 0;
					class69.field580[++class69.field581 - 1] = "";
				}

				return 1;
			} else if (var0 == CS2Opcodes.WORLDLIST_NEXT) {
				var4 = class129.method2429();
				if (null != var4) {
					class69.field579[++class94.field920 - 1] = var4.field708;
					class69.field579[++class94.field920 - 1] = var4.field714;
					class69.field580[++class69.field581 - 1] = var4.field711;
					class69.field579[++class94.field920 - 1] = var4.field717;
					class69.field579[++class94.field920 - 1] = var4.field715;
					class69.field580[++class69.field581 - 1] = var4.field716;
				} else {
					class69.field579[++class94.field920 - 1] = -1;
					class69.field579[++class94.field920 - 1] = 0;
					class69.field580[++class69.field581 - 1] = "";
					class69.field579[++class94.field920 - 1] = 0;
					class69.field579[++class94.field920 - 1] = 0;
					class69.field580[++class69.field581 - 1] = "";
				}

				return 1;
			} else {
				class78 var5;
				int var6;
				int var8;
				if (var0 == CS2Opcodes.WORLDLIST_SPECIFIC) {
					var8 = class69.field579[--class94.field920];
					var5 = null;

					for (var6 = 0; var6 < class78.field709; ++var6) {
						if (var8 == class78.field710[var6].field708) {
							var5 = class78.field710[var6];
							break;
						}
					}

					if (var5 != null) {
						class69.field579[++class94.field920 - 1] = var5.field708;
						class69.field579[++class94.field920 - 1] = var5.field714;
						class69.field580[++class69.field581 - 1] = var5.field711;
						class69.field579[++class94.field920 - 1] = var5.field717;
						class69.field579[++class94.field920 - 1] = var5.field715;
						class69.field580[++class69.field581 - 1] = var5.field716;
					} else {
						class69.field579[++class94.field920 - 1] = -1;
						class69.field579[++class94.field920 - 1] = 0;
						class69.field580[++class69.field581 - 1] = "";
						class69.field579[++class94.field920 - 1] = 0;
						class69.field579[++class94.field920 - 1] = 0;
						class69.field580[++class69.field581 - 1] = "";
					}

					return 1;
				} else if (var0 == CS2Opcodes.WORLDLIST_SORT) {
					class94.field920 -= 4;
					var8 = class69.field579[class94.field920];
					boolean var11 = 1 == class69.field579[1 + class94.field920];
					var6 = class69.field579[2 + class94.field920];
					boolean var7 = class69.field579[3 + class94.field920] == 1;
					class78.method7901(var8, var11, var6, var7);
					return 1;
				} else if (var0 != CS2Opcodes._6511) {
					if (var0 == CS2Opcodes.SETFOLLOWEROPSLOWPRIORITY) {
						client.field1847 = class69.field579[--class94.field920] == 1;
						return 1;
					} else {
						int var9;
						class204 var10;
						if (var0 == CS2Opcodes.NC_PARAM) {
							class94.field920 -= 2;
							var8 = class69.field579[class94.field920];
							var9 = class69.field579[class94.field920 + 1];
							var10 = class137.method2506(var9);
							if (var10.method4011()) {
								class69.field580[++class69.field581 - 1] = class119.method2293(var8).method4086(var9, var10.field2332);
							} else {
								class69.field579[++class94.field920 - 1] = class119.method2293(var8).method4085(var9, var10.field2334);
							}

							return 1;
						} else if (var0 == CS2Opcodes.LC_PARAM) {
							class94.field920 -= 2;
							var8 = class69.field579[class94.field920];
							var9 = class69.field579[class94.field920 + 1];
							var10 = class137.method2506(var9);
							if (var10.method4011()) {
								class69.field580[++class69.field581 - 1] = class165.method2780(var8).method3829(var9, var10.field2332);
							} else {
								class69.field579[++class94.field920 - 1] = class165.method2780(var8).method3828(var9, var10.field2334);
							}

							return 1;
						} else if (var0 == CS2Opcodes.OC_PARAM) {
							class94.field920 -= 2;
							var8 = class69.field579[class94.field920];
							var9 = class69.field579[class94.field920 + 1];
							var10 = class137.method2506(var9);
							if (var10.method4011()) {
								class69.field580[++class69.field581 - 1] = class208.method4105(var8).method3929(var9, var10.field2332);
							} else {
								class69.field579[++class94.field920 - 1] = class208.method4105(var8).method3928(var9, var10.field2334);
							}

							return 1;
						} else if (var0 == CS2Opcodes.STRUCT_PARAM) {
							class94.field920 -= 2;
							var8 = class69.field579[class94.field920];
							var9 = class69.field579[class94.field920 + 1];
							var10 = class137.method2506(var9);
							if (var10.method4011()) {
								class69.field580[++class69.field581 - 1] = class186.method2182(var8).method3594(var9, var10.field2332);
							} else {
								class69.field579[++class94.field920 - 1] = class186.method2182(var8).method3593(var9, var10.field2334);
							}

							return 1;
						} else if (var0 == CS2Opcodes.ON_MOBILE) {
							class69.field579[++class94.field920 - 1] = client.field1930 ? 1 : 0;
							return 1;
						} else if (var0 == CS2Opcodes.CLIENTTYPE) {
							class69.field579[++class94.field920 - 1] = client.field1784;
							return 1;
						} else if (var0 == CS2Opcodes._6520) {
							return 1;
						} else if (var0 == CS2Opcodes.MOBILE_KEYBOARDHIDE) {
							return 1;
						} else if (var0 == CS2Opcodes._6522) {
							--class69.field581;
							--class94.field920;
							return 1;
						} else if (var0 == CS2Opcodes._6523) {
							--class69.field581;
							--class94.field920;
							return 1;
						} else if (var0 == CS2Opcodes.MOBILE_BATTERYLEVEL) {
							class69.field579[++class94.field920 - 1] = -1;
							return 1;
						} else if (var0 == CS2Opcodes.MOBILE_BATTERYCHARGING) {
							class69.field579[++class94.field920 - 1] = 1;
							return 1;
						} else if (var0 == CS2Opcodes.MOBILE_WIFIAVAILABLE) {
							class69.field579[++class94.field920 - 1] = 1;
							return 1;
						} else if (var0 == CS2Opcodes.PLATFORMTYPE) {
							class69.field579[++class94.field920 - 1] = client.field1880;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var8 = class69.field579[--class94.field920];
					if (var8 >= 0 && var8 < class78.field709) {
						var5 = class78.field710[var8];
						class69.field579[++class94.field920 - 1] = var5.field708;
						class69.field579[++class94.field920 - 1] = var5.field714;
						class69.field580[++class69.field581 - 1] = var5.field711;
						class69.field579[++class94.field920 - 1] = var5.field717;
						class69.field579[++class94.field920 - 1] = var5.field715;
						class69.field580[++class69.field581 - 1] = var5.field716;
					} else {
						class69.field579[++class94.field920 - 1] = -1;
						class69.field579[++class94.field920 - 1] = 0;
						class69.field580[++class69.field581 - 1] = "";
						class69.field579[++class94.field920 - 1] = 0;
						class69.field579[++class94.field920 - 1] = 0;
						class69.field580[++class69.field581 - 1] = "";
					}

					return 1;
				}
			}
		}
	}
}
