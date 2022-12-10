import java.applet.Applet;

public class class44 {
	public static Applet field318;
	public static String field319;
	static class469[] field326;
	static int field327;

	static {
		field318 = null;
		field319 = "";
	}

	public static long method861(CharSequence var0) {
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

	class44() throws Throwable {
		throw new Error();
	}

	static boolean method73(String var0, int var1) {
		return class99.method2057(var0, var1, "openjs");
	}

	static int method866(int var0, class65 var1, boolean var2) {
		boolean var4 = true;
		class290 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = class180.method2988(class69.field579[--class94.field920]);
			var4 = false;
		} else {
			var5 = var2 ? class187.field2044 : class341.field4273;
		}

		int var12;
		if (var0 == CS2Opcodes.CC_SETOP) {
			var12 = class69.field579[--class94.field920] - 1;
			if (var12 >= 0 && var12 <= 9) {
				var5.method5509(var12, class69.field580[--class69.field581]);
				return 1;
			} else {
				--class69.field581;
				return 1;
			}
		} else {
			int var7;
			if (var0 == CS2Opcodes.CC_SETDRAGGABLE) {
				class94.field920 -= 2;
				var12 = class69.field579[class94.field920];
				var7 = class69.field579[1 + class94.field920];
				var5.field3486 = class104.method2089(var12, var7);
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var5.field3489 = class69.field579[--class94.field920] == 1;
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETDRAGDEADZONE) {
				var5.field3487 = class69.field579[--class94.field920];
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETDRAGDEADTIME) {
				var5.field3440 = class69.field579[--class94.field920];
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETOPBASE) {
				var5.field3399 = class69.field580[--class69.field581];
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETTARGETVERB) {
				var5.field3490 = class69.field580[--class69.field581];
				return 1;
			} else if (var0 == CS2Opcodes.CC_CLEAROPS) {
				var5.field3485 = null;
				return 1;
			} else if (var0 == CS2Opcodes.CC_SETSHIFTCLICKOP) {
				var5.field3553 = class69.field579[--class94.field920] == 1;
				return 1;
			} else if (var0 == CS2Opcodes._1309) {
				--class94.field920;
				return 1;
			} else {
				int var8;
				byte[] var10;
				if (var0 != CS2Opcodes.CC_SETOPKEY) {
					byte var6;
					if (var0 == CS2Opcodes.CC_SETOPTKEY) {
						class94.field920 -= 2;
						var6 = 10;
						var10 = new byte[]{(byte)class69.field579[class94.field920]};
						byte[] var11 = new byte[]{(byte)class69.field579[class94.field920 + 1]};
						class12.method168(var5, var6, var10, var11);
						return 1;
					} else if (var0 == CS2Opcodes.CC_SETOPKEYRATE) {
						class94.field920 -= 3;
						var12 = class69.field579[class94.field920] - 1;
						var7 = class69.field579[1 + class94.field920];
						var8 = class69.field579[class94.field920 + 2];
						if (var12 >= 0 && var12 <= 9) {
							class2.method17(var5, var12, var7, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == CS2Opcodes.CC_SETOPTKEYRATE) {
						var6 = 10;
						var7 = class69.field579[--class94.field920];
						var8 = class69.field579[--class94.field920];
						class2.method17(var5, var6, var7, var8);
						return 1;
					} else if (var0 == CS2Opcodes.CC_SETOPKEYIGNOREHELD) {
						--class94.field920;
						var12 = class69.field579[class94.field920] - 1;
						if (var12 >= 0 && var12 <= 9) {
							class336.method6297(var5, var12);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == CS2Opcodes.CC_SETOPTKEYIGNOREHELD) {
						var6 = 10;
						class336.method6297(var5, var6);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var9 = null;
					var10 = null;
					if (var4) {
						class94.field920 -= 10;

						for (var8 = 0; var8 < 10 && class69.field579[class94.field920 + var8] >= 0; var8 += 2) {
						}

						if (var8 > 0) {
							var9 = new byte[var8 / 2];
							var10 = new byte[var8 / 2];

							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var9[var8 / 2] = (byte)class69.field579[class94.field920 + var8];
								var10[var8 / 2] = (byte)class69.field579[1 + class94.field920 + var8];
							}
						}
					} else {
						class94.field920 -= 2;
						var9 = new byte[]{(byte)class69.field579[class94.field920]};
						var10 = new byte[]{(byte)class69.field579[class94.field920 + 1]};
					}

					var8 = class69.field579[--class94.field920] - 1;
					if (var8 >= 0 && var8 <= 9) {
						class12.method168(var5, var8, var9, var10);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}

	static void method869(int var0) {
		int var2 = class73.method1227();
		if (var0 == -3) {
			class73.method2926(class321.field3799, class321.field3987, class321.field3801);
		} else if (var0 == -2) {
			class73.method2926(class321.field3802, class321.field3762, class321.field3789);
		} else if (var0 == -1) {
			class73.method2926(class321.field3805, class321.field3806, class321.field3807);
		} else if (var0 == 3) {
			class73.method113(3);
			class73.field640 = 1;
		} else if (var0 == 4) {
			class73.method349(0);
		} else if (var0 == 5) {
			class73.field640 = 2;
			class73.method2926(class321.field3811, class321.field3924, class321.field3813);
		} else if (var0 == 68 || !client.field1930 && var0 == 6) {
			class73.method2926(class321.field3814, class321.field3815, class321.field3816);
		} else if (var0 == 7) {
			class73.method2926(class321.field3817, class321.field3779, class321.field3819);
		} else if (var0 == 8) {
			class73.method2926(class321.field3820, class321.field3821, class321.field3822);
		} else if (var0 == 9) {
			class73.method2926(class321.field3823, class321.field3824, class321.field3825);
		} else if (var0 == 10) {
			class73.method2926(class321.field3826, class321.field3827, class321.field3828);
		} else if (var0 == 11) {
			class73.method2926(class321.field3829, class321.field3830, class321.field3831);
		} else if (var0 == 12) {
			class73.method2926(class321.field3832, class321.field3833, class321.field3834);
		} else if (var0 == 13) {
			class73.method2926(class321.field3835, class321.field3948, class321.field3914);
		} else if (var0 == 14) {
			class73.method2926(class321.field4059, class321.field3839, class321.field3865);
		} else if (var0 == 16) {
			class73.method2926(class321.field3911, class321.field3842, class321.field4036);
		} else if (var0 == 17) {
			class73.method2926(class321.field4052, class321.field3845, class321.field3978);
		} else if (var0 == 18) {
			class73.method349(1);
		} else if (var0 == 19) {
			class73.method2926(class321.field3850, class321.field3900, class321.field3852);
		} else if (var0 == 20) {
			class73.method2926(class321.field3853, class321.field3956, class321.field3898);
		} else if (var0 == 22) {
			class73.method2926(class321.field3804, class321.field3857, class321.field3858);
		} else if (var0 == 23) {
			class73.method2926(class321.field3946, class321.field3860, class321.field3861);
		} else if (var0 == 24) {
			class73.method2926(class321.field3855, class321.field3863, class321.field3864);
		} else if (var0 == 25) {
			class73.method2926(class321.field3918, class321.field3943, class321.field3965);
		} else if (var0 == 26) {
			class73.method2926(class321.field3868, class321.field3869, class321.field3870);
		} else if (var0 == 27) {
			class73.method2926(class321.field3871, class321.field3872, class321.field3873);
		} else if (var0 == 31) {
			class73.method2926(class321.field3792, class321.field3993, class321.field3983);
		} else if (var0 == 32) {
			class73.method349(2);
		} else if (var0 == 37) {
			class73.method2926(class321.field4050, class321.field3856, class321.field3888);
		} else if (var0 == 38) {
			class73.method2926(class321.field3889, class321.field3846, class321.field3891);
		} else if (var0 == 55) {
			class73.method113(8);
		} else {
			if (var0 == 56) {
				class73.method2926(class321.field3903, class321.field3973, class321.field4057);
				class131.method2451(11);
				return;
			}

			if (var0 == 57) {
				class73.method2926(class321.field3899, class321.field3767, class321.field3862);
				class131.method2451(11);
				return;
			}

			if (var0 == 61) {
				class73.method2926("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class73.method113(7);
			} else {
				if (var0 == 62) {
					class131.method2451(10);
					class73.method113(9);
					class73.method2926(class321.field4045, class321.field3773, class321.field3904);
					return;
				}

				if (var0 == 63) {
					class131.method2451(10);
					class73.method113(9);
					class73.method2926(class321.field3905, class321.field4011, class321.field3907);
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class131.method2451(10);
					class73.method113(9);
					class73.method2926(class321.field3908, class321.field3909, class321.field3910);
					return;
				}

				if (var0 == 71) {
					class131.method2451(10);
					class73.method113(7);
					class73.method2926("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class131.method2451(10);
					class73.method113(6);
					class73.method2926(class321.field3840, class321.field4056, class321.field4067);
				} else if (var0 == 72) {
					class131.method2451(10);
					class73.method113(26);
				} else {
					class73.method2926(class321.field3935, class321.field3912, class321.field3882);
				}
			}
		}

		class131.method2451(10);
		boolean var3 = var2 != class73.method1227();
		if (!var3 && client.field1822.method8645()) {
			class73.method113(9);
		}

	}

	static void method865(int var0, int var1, int var2, int var3) {
		class290 var5 = class104.method2089(var0, var1);
		if (null != var5 && null != var5.field3491) {
			class80 var6 = new class80();
			var6.field733 = var5;
			var6.field735 = var5.field3491;
			class69.method2874(var6);
		}

		client.field1859 = var3;
		client.field1857 = true;
		class363.field4352 = var0;
		client.field1858 = var1;
		class16.field99 = var2;
		class53.method1040(var5);
	}
}
