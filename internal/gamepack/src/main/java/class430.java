import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ic"
)
public class class430 {
	@ObfInfo(
		owner = "ic",
		name = "m",
		desc = "Lic;"
	)
	public static final class430 field3568;
	@ObfInfo(
		owner = "ic",
		name = "e",
		desc = "Lic;"
	)
	public static final class430 field3569;
	@ObfInfo(
		owner = "ic",
		name = "v",
		desc = "Lic;"
	)
	public static final class430 field3572;
	@ObfInfo(
		owner = "ic",
		name = "h",
		desc = "Lic;"
	)
	public static final class430 field3573;
	@ObfInfo(
		owner = "ic",
		name = "x",
		desc = "Lic;"
	)
	static final class430 field3570;
	@ObfInfo(
		owner = "ic",
		name = "q",
		desc = "Ljava/lang/String;"
	)
	public final String field3571;

	static {
		field3573 = new class430("details");
		field3569 = new class430("compositemap");
		field3572 = new class430("compositetexture");
		field3570 = new class430("area");
		field3568 = new class430("labels");
	}

	@ObfInfo(
		owner = "ic",
		name = "<init>",
		desc = "(Ljava/lang/String;)V"
	)
	class430(String var1) {
		this.field3571 = var1;
	}

	@ObfInfo(
		owner = "ic",
		name = "ba",
		desc = "([BI)[B"
	)
	static final byte[] method2120(byte[] var0) {
		class127 var2 = new class127(var0);
		int var3 = var2.method547();
		int var4 = var2.method595();
		if (var4 >= 0 && (class274.field2309 == 0 || var4 <= class274.field2309)) {
			if (var3 == 0) {
				byte[] var5 = new byte[var4];
				var2.method557(var5, 0, var4);
				return var5;
			} else {
				int var7 = var2.method595();
				if (var7 < 0 || class274.field2309 != 0 && var7 > class274.field2309) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var7];
					if (var3 == 1) {
						class118.method464(var6, var7, var0, var4, 9);
					} else {
						class274.field2311.method386(var2, var6);
					}

					return var6;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(
		owner = "ic",
		name = "ao",
		desc = "(ILbm;ZI)I"
	)
	static int method2121(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) {
			if (0 == class240.field2021.field40) {
				class386.field3248[++class161.field1227 - 1] = -2;
			} else if (1 == class240.field2021.field40) {
				class386.field3248[++class161.field1227 - 1] = -1;
			} else {
				class386.field3248[++class161.field1227 - 1] = class240.field2021.field38.method1467();
			}

			return 1;
		} else {
			int var4;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var4 = class386.field3248[--class161.field1227];
				if (class240.field2021.method52() && var4 >= 0 && var4 < class240.field2021.field38.method1467()) {
					class336 var9 = (class336)class240.field2021.field38.method1475(var4);
					class386.field3249[++class386.field3250 - 1] = var9.method1814();
					class386.field3249[++class386.field3250 - 1] = var9.method1818();
				} else {
					class386.field3249[++class386.field3250 - 1] = "";
					class386.field3249[++class386.field3250 - 1] = "";
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var4 = class386.field3248[--class161.field1227];
				if (class240.field2021.method52() && var4 >= 0 && var4 < class240.field2021.field38.method1467()) {
					class386.field3248[++class161.field1227 - 1] = ((class69)class240.field2021.field38.method1475(var4)).field627;
				} else {
					class386.field3248[++class161.field1227 - 1] = 0;
				}

				return 1;
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var4 = class386.field3248[--class161.field1227];
				if (class240.field2021.method52() && var4 >= 0 && var4 < class240.field2021.field38.method1467()) {
					class386.field3248[++class161.field1227 - 1] = ((class69)class240.field2021.field38.method1475(var4)).field628;
				} else {
					class386.field3248[++class161.field1227 - 1] = 0;
				}

				return 1;
			} else {
				String var6;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var6 = class386.field3249[--class386.field3250];
					int var7 = class386.field3248[--class161.field1227];
					class210.method910(var6, var7);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var6 = class386.field3249[--class386.field3250];
					class240.field2021.method46(var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var6 = class386.field3249[--class386.field3250];
					class240.field2021.method49(var6);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var6 = class386.field3249[--class386.field3250];
					class240.field2021.method55(var6);
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var6 = class386.field3249[--class386.field3250];
					class240.field2021.method40(var6);
					return 1;
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var6 = class386.field3249[--class386.field3250];
					var6 = class196.method871(var6);
					class386.field3248[++class161.field1227 - 1] = class240.field2021.method45(new class257(var6, class63.field619), false) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class228.field1933 != null) {
						class386.field3249[++class386.field3250 - 1] = class228.field1933.field85;
					} else {
						class386.field3249[++class386.field3250 - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class228.field1933 != null) {
						class386.field3248[++class161.field1227 - 1] = class228.field1933.method1467();
					} else {
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var4 = class386.field3248[--class161.field1227];
					if (null != class228.field1933 && var4 < class228.field1933.method1467()) {
						class386.field3249[++class386.field3250 - 1] = class228.field1933.method1475(var4).method1817().method1101();
					} else {
						class386.field3249[++class386.field3250 - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var4 = class386.field3248[--class161.field1227];
					if (null != class228.field1933 && var4 < class228.field1933.method1467()) {
						class386.field3248[++class161.field1227 - 1] = ((class69)class228.field1933.method1475(var4)).method305();
					} else {
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var4 = class386.field3248[--class161.field1227];
					if (null != class228.field1933 && var4 < class228.field1933.method1467()) {
						class386.field3248[++class161.field1227 - 1] = ((class69)class228.field1933.method1475(var4)).field628;
					} else {
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					class386.field3248[++class161.field1227 - 1] = class228.field1933 != null ? class228.field1933.field87 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var6 = class386.field3249[--class386.field3250];
					class408.method1999(var6);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					class386.field3248[++class161.field1227 - 1] = class228.field1933 != null ? class228.field1933.field86 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var6 = class386.field3249[--class386.field3250];
					class336.method1687(var6);
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class472.method2338();
					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!class240.field2021.method52()) {
						class386.field3248[++class161.field1227 - 1] = -1;
					} else {
						class386.field3248[++class161.field1227 - 1] = class240.field2021.field39.method1467();
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var4 = class386.field3248[--class161.field1227];
					if (class240.field2021.method52() && var4 >= 0 && var4 < class240.field2021.field39.method1467()) {
						class187 var5 = (class187)class240.field2021.field39.method1475(var4);
						class386.field3249[++class386.field3250 - 1] = var5.method1814();
						class386.field3249[++class386.field3250 - 1] = var5.method1818();
					} else {
						class386.field3249[++class386.field3250 - 1] = "";
						class386.field3249[++class386.field3250 - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var6 = class386.field3249[--class386.field3250];
					var6 = class196.method871(var6);
					class386.field3248[++class161.field1227 - 1] = class240.field2021.method41(new class257(var6, class63.field619)) ? 1 : 0;
					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var4 = class386.field3248[--class161.field1227];
					if (null != class228.field1933 && var4 < class228.field1933.method1467() && class228.field1933.method1475(var4).method1817().equals(class113.field846.field3207)) {
						class386.field3248[++class161.field1227 - 1] = 1;
					} else {
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (null != class228.field1933 && class228.field1933.field89 != null) {
						class386.field3249[++class386.field3250 - 1] = class228.field1933.field89;
					} else {
						class386.field3249[++class386.field3250 - 1] = "";
					}

					return 1;
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var4 = class386.field3248[--class161.field1227];
					if (null != class228.field1933 && var4 < class228.field1933.method1467() && ((class469)class228.field1933.method1475(var4)).method2290()) {
						class386.field3248[++class161.field1227 - 1] = 1;
					} else {
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == ScriptOpcodes._3628) {
						class240.field2021.field38.method1470();
						return 1;
					} else {
						boolean var8;
						if (var0 == ScriptOpcodes._3629) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class24(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3630) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class93(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3631) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class134(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3632) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class443(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3633) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class202(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3634) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class61(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3635) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class145(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3636) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class288(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3637) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class345(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3638) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class81(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3639) {
							class240.field2021.field38.method1487();
							return 1;
						} else if (var0 == ScriptOpcodes._3640) {
							class240.field2021.field39.method1470();
							return 1;
						} else if (var0 == ScriptOpcodes._3641) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field39.method1489(new class24(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3642) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field39.method1489(new class93(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3643) {
							class240.field2021.field39.method1487();
							return 1;
						} else if (var0 == ScriptOpcodes._3644) {
							if (class228.field1933 != null) {
								class228.field1933.method1470();
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3645) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (null != class228.field1933) {
								class228.field1933.method1489(new class24(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3646) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (class228.field1933 != null) {
								class228.field1933.method1489(new class93(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3647) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (null != class228.field1933) {
								class228.field1933.method1489(new class134(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3648) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (class228.field1933 != null) {
								class228.field1933.method1489(new class443(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3649) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (null != class228.field1933) {
								class228.field1933.method1489(new class202(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3650) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (null != class228.field1933) {
								class228.field1933.method1489(new class61(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3651) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (null != class228.field1933) {
								class228.field1933.method1489(new class145(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3652) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (null != class228.field1933) {
								class228.field1933.method1489(new class288(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3653) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (null != class228.field1933) {
								class228.field1933.method1489(new class345(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3654) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (null != class228.field1933) {
								class228.field1933.method1489(new class81(var8));
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3655) {
							if (class228.field1933 != null) {
								class228.field1933.method1487();
							}

							return 1;
						} else if (var0 == ScriptOpcodes._3656) {
							var8 = class386.field3248[--class161.field1227] == 1;
							class240.field2021.field38.method1489(new class309(var8));
							return 1;
						} else if (var0 == ScriptOpcodes._3657) {
							var8 = class386.field3248[--class161.field1227] == 1;
							if (class228.field1933 != null) {
								class228.field1933.method1489(new class309(var8));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = class386.field3248[--class161.field1227];
					if (class228.field1933 != null && var4 < class228.field1933.method1467() && ((class469)class228.field1933.method1475(var4)).method2294()) {
						class386.field3248[++class161.field1227 - 1] = 1;
					} else {
						class386.field3248[++class161.field1227 - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
