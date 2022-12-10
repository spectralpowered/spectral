public class class237 {
	public static final class237 field2845;
	public static final class237 field2846;
	public static final class237 field2850;
	public static final class237 field2851;
	static final class237 field2848;
	public final String field2849;

	static {
		field2851 = new class237("details");
		field2846 = new class237("compositemap");
		field2850 = new class237("compositetexture");
		field2848 = new class237("area");
		field2845 = new class237("labels");
	}

	class237(String var1) {
		this.field2849 = var1;
	}

	static final byte[] method4727(byte[] var0) {
		class467 var2 = new class467(var0);
		int var3 = var2.method8326();
		int var4 = var2.method8480();
		if (var4 < 0 || class337.field4246 != 0 && var4 > class337.field4246) {
			throw new RuntimeException();
		} else if (var3 == 0) {
			byte[] var5 = new byte[var4];
			var2.method8338(var5, 0, var4);
			return var5;
		} else {
			int var7 = var2.method8480();
			if (var7 < 0 || class337.field4246 != 0 && var7 > class337.field4246) {
				throw new RuntimeException();
			} else {
				byte[] var6 = new byte[var7];
				if (var3 == 1) {
					class484.method8791(var6, var7, var0, var4, 9);
				} else {
					class337.field4248.method8819(var2, var6);
				}

				return var6;
			}
		}
	}

	static int method4728(int var0, class65 var1, boolean var2) {
		if (var0 == CS2Opcodes.FRIEND_COUNT) {
			if (0 == class405.field4602.field475) {
				class69.field579[++class94.field920 - 1] = -2;
			} else if (1 == class405.field4602.field475) {
				class69.field579[++class94.field920 - 1] = -1;
			} else {
				class69.field579[++class94.field920 - 1] = class405.field4602.field470.method7291();
			}

			return 1;
		} else {
			int var4;
			if (var0 == CS2Opcodes.FRIEND_GETNAME) {
				var4 = class69.field579[--class94.field920];
				if (class405.field4602.method1147() && var4 >= 0 && var4 < class405.field4602.field470.method7291()) {
					class395 var9 = (class395)class405.field4602.field470.method7301(var4);
					class69.field580[++class69.field581 - 1] = var9.method7624();
					class69.field580[++class69.field581 - 1] = var9.method7636();
				} else {
					class69.field580[++class69.field581 - 1] = "";
					class69.field580[++class69.field581 - 1] = "";
				}

				return 1;
			} else if (var0 == CS2Opcodes.FRIEND_GETWORLD) {
				var4 = class69.field579[--class94.field920];
				if (class405.field4602.method1147() && var4 >= 0 && var4 < class405.field4602.field470.method7291()) {
					class69.field579[++class94.field920 - 1] = ((class391)class405.field4602.field470.method7301(var4)).field4520;
				} else {
					class69.field579[++class94.field920 - 1] = 0;
				}

				return 1;
			} else if (var0 == CS2Opcodes.FRIEND_GETRANK) {
				var4 = class69.field579[--class94.field920];
				if (class405.field4602.method1147() && var4 >= 0 && var4 < class405.field4602.field470.method7291()) {
					class69.field579[++class94.field920 - 1] = ((class391)class405.field4602.field470.method7301(var4)).field4521;
				} else {
					class69.field579[++class94.field920 - 1] = 0;
				}

				return 1;
			} else {
				String var6;
				if (var0 == CS2Opcodes.FRIEND_SETRANK) {
					var6 = class69.field580[--class69.field581];
					int var7 = class69.field579[--class94.field920];
					class61.method2905(var6, var7);
					return 1;
				} else if (var0 == CS2Opcodes.FRIEND_ADD) {
					var6 = class69.field580[--class69.field581];
					class405.field4602.method1135(var6);
					return 1;
				} else if (var0 == CS2Opcodes.FRIEND_DEL) {
					var6 = class69.field580[--class69.field581];
					class405.field4602.method1140(var6);
					return 1;
				} else if (var0 == CS2Opcodes.IGNORE_ADD) {
					var6 = class69.field580[--class69.field581];
					class405.field4602.method1156(var6);
					return 1;
				} else if (var0 == CS2Opcodes.IGNORE_DEL) {
					var6 = class69.field580[--class69.field581];
					class405.field4602.method1128(var6);
					return 1;
				} else if (var0 == CS2Opcodes.FRIEND_TEST) {
					var6 = class69.field580[--class69.field581];
					var6 = class263.method5257(var6);
					class69.field579[++class94.field920 - 1] = class405.field4602.method1134(new class483(var6, class54.field404), false) ? 1 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class267.field3147 != null) {
						class69.field580[++class69.field581 - 1] = class267.field3147.field4373;
					} else {
						class69.field580[++class69.field581 - 1] = "";
					}

					return 1;
				} else if (var0 == CS2Opcodes.CLAN_GETCHATCOUNT) {
					if (class267.field3147 != null) {
						class69.field579[++class94.field920 - 1] = class267.field3147.method7291();
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else if (var0 == CS2Opcodes.CLAN_GETCHATUSERNAME) {
					var4 = class69.field579[--class94.field920];
					if (null != class267.field3147 && var4 < class267.field3147.method7291()) {
						class69.field580[++class69.field581 - 1] = class267.field3147.method7301(var4).method7628().method8771();
					} else {
						class69.field580[++class69.field581 - 1] = "";
					}

					return 1;
				} else if (var0 == CS2Opcodes.CLAN_GETCHATUSERWORLD) {
					var4 = class69.field579[--class94.field920];
					if (null != class267.field3147 && var4 < class267.field3147.method7291()) {
						class69.field579[++class94.field920 - 1] = ((class391)class267.field3147.method7301(var4)).method7264();
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else if (var0 == CS2Opcodes.CLAN_GETCHATUSERRANK) {
					var4 = class69.field579[--class94.field920];
					if (null != class267.field3147 && var4 < class267.field3147.method7291()) {
						class69.field579[++class94.field920 - 1] = ((class391)class267.field3147.method7301(var4)).field4521;
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else if (var0 == CS2Opcodes.CLAN_GETCHATMINKICK) {
					class69.field579[++class94.field920 - 1] = class267.field3147 != null ? class267.field3147.field4375 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CLAN_KICKUSER) {
					var6 = class69.field580[--class69.field581];
					client.method426(var6);
					return 1;
				} else if (var0 == CS2Opcodes.CLAN_GETCHATRANK) {
					class69.field579[++class94.field920 - 1] = class267.field3147 != null ? class267.field3147.field4374 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CLAN_JOINCHAT) {
					var6 = class69.field580[--class69.field581];
					class395.method7370(var6);
					return 1;
				} else if (var0 == CS2Opcodes.CLAN_LEAVECHAT) {
					client.method229();
					return 1;
				} else if (var0 == CS2Opcodes.IGNORE_COUNT) {
					if (!class405.field4602.method1147()) {
						class69.field579[++class94.field920 - 1] = -1;
					} else {
						class69.field579[++class94.field920 - 1] = class405.field4602.field471.method7291();
					}

					return 1;
				} else if (var0 == CS2Opcodes.IGNORE_GETNAME) {
					var4 = class69.field579[--class94.field920];
					if (class405.field4602.method1147() && var4 >= 0 && var4 < class405.field4602.field471.method7291()) {
						class407 var5 = (class407)class405.field4602.field471.method7301(var4);
						class69.field580[++class69.field581 - 1] = var5.method7624();
						class69.field580[++class69.field581 - 1] = var5.method7636();
					} else {
						class69.field580[++class69.field581 - 1] = "";
						class69.field580[++class69.field581 - 1] = "";
					}

					return 1;
				} else if (var0 == CS2Opcodes.IGNORE_TEST) {
					var6 = class69.field580[--class69.field581];
					var6 = class263.method5257(var6);
					class69.field579[++class94.field920 - 1] = class405.field4602.method1129(new class483(var6, class54.field404)) ? 1 : 0;
					return 1;
				} else if (var0 == CS2Opcodes.CLAN_ISSELF) {
					var4 = class69.field579[--class94.field920];
					if (null != class267.field3147 && var4 < class267.field3147.method7291() && class267.field3147.method7301(var4).method7628().equals(class142.field1370.field840)) {
						class69.field579[++class94.field920 - 1] = 1;
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else if (var0 == CS2Opcodes.CLAN_GETCHATOWNERNAME) {
					if (null != class267.field3147 && class267.field3147.field4379 != null) {
						class69.field580[++class69.field581 - 1] = class267.field3147.field4379;
					} else {
						class69.field580[++class69.field581 - 1] = "";
					}

					return 1;
				} else if (var0 == CS2Opcodes.CLAN_ISFRIEND) {
					var4 = class69.field579[--class94.field920];
					if (null != class267.field3147 && var4 < class267.field3147.method7291() && ((class397)class267.field3147.method7301(var4)).method7375()) {
						class69.field579[++class94.field920 - 1] = 1;
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				} else if (var0 != CS2Opcodes.CLAN_ISIGNORE) {
					if (var0 == CS2Opcodes._3628) {
						class405.field4602.field470.method7294();
						return 1;
					} else {
						boolean var8;
						if (var0 == CS2Opcodes._3629) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class480(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3630) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class492(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3631) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class110(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3632) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class126(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3633) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class115(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3634) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class108(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3635) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class107(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3636) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class123(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3637) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class129(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3638) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class128(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3639) {
							class405.field4602.field470.method7353();
							return 1;
						} else if (var0 == CS2Opcodes._3640) {
							class405.field4602.field471.method7294();
							return 1;
						} else if (var0 == CS2Opcodes._3641) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field471.method7355(new class480(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3642) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field471.method7355(new class492(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3643) {
							class405.field4602.field471.method7353();
							return 1;
						} else if (var0 == CS2Opcodes._3644) {
							if (class267.field3147 != null) {
								class267.field3147.method7294();
							}

							return 1;
						} else if (var0 == CS2Opcodes._3645) {
							var8 = class69.field579[--class94.field920] == 1;
							if (null != class267.field3147) {
								class267.field3147.method7355(new class480(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3646) {
							var8 = class69.field579[--class94.field920] == 1;
							if (class267.field3147 != null) {
								class267.field3147.method7355(new class492(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3647) {
							var8 = class69.field579[--class94.field920] == 1;
							if (null != class267.field3147) {
								class267.field3147.method7355(new class110(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3648) {
							var8 = class69.field579[--class94.field920] == 1;
							if (class267.field3147 != null) {
								class267.field3147.method7355(new class126(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3649) {
							var8 = class69.field579[--class94.field920] == 1;
							if (null != class267.field3147) {
								class267.field3147.method7355(new class115(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3650) {
							var8 = class69.field579[--class94.field920] == 1;
							if (null != class267.field3147) {
								class267.field3147.method7355(new class108(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3651) {
							var8 = class69.field579[--class94.field920] == 1;
							if (null != class267.field3147) {
								class267.field3147.method7355(new class107(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3652) {
							var8 = class69.field579[--class94.field920] == 1;
							if (null != class267.field3147) {
								class267.field3147.method7355(new class123(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3653) {
							var8 = class69.field579[--class94.field920] == 1;
							if (null != class267.field3147) {
								class267.field3147.method7355(new class129(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3654) {
							var8 = class69.field579[--class94.field920] == 1;
							if (null != class267.field3147) {
								class267.field3147.method7355(new class128(var8));
							}

							return 1;
						} else if (var0 == CS2Opcodes._3655) {
							if (class267.field3147 != null) {
								class267.field3147.method7353();
							}

							return 1;
						} else if (var0 == CS2Opcodes._3656) {
							var8 = class69.field579[--class94.field920] == 1;
							class405.field4602.field470.method7355(new class122(var8));
							return 1;
						} else if (var0 == CS2Opcodes._3657) {
							var8 = class69.field579[--class94.field920] == 1;
							if (class267.field3147 != null) {
								class267.field3147.method7355(new class122(var8));
							}

							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var4 = class69.field579[--class94.field920];
					if (class267.field3147 != null && var4 < class267.field3147.method7291() && ((class397)class267.field3147.method7301(var4)).method7391()) {
						class69.field579[++class94.field920 - 1] = 1;
					} else {
						class69.field579[++class94.field920 - 1] = 0;
					}

					return 1;
				}
			}
		}
	}
}
