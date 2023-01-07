import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "om"
)
public class class436 implements class78 {
	@ObfInfo(
		owner = "om",
		name = "e",
		desc = "Lom;"
	)
	static final class436 field3612;
	@ObfInfo(
		owner = "om",
		name = "v",
		desc = "Lom;"
	)
	static final class436 field3613;
	@ObfInfo(
		owner = "om",
		name = "x",
		desc = "Lom;"
	)
	static final class436 field3614;
	@ObfInfo(
		owner = "om",
		name = "h",
		desc = "Lom;"
	)
	static final class436 field3616;
	@ObfInfo(
		owner = "om",
		name = "m",
		desc = "I"
	)
	final int field3615;
	@ObfInfo(
		owner = "om",
		name = "q",
		desc = "I"
	)
	final int field3617;

	static {
		field3616 = new class436(2, 1);
		field3612 = new class436(0, 2);
		field3613 = new class436(1, 3);
		field3614 = new class436(3, 10);
	}

	@ObfInfo(
		owner = "om",
		name = "<init>",
		desc = "(II)V"
	)
	class436(int var1, int var2) {
		this.field3615 = var1;
		this.field3617 = var2;
	}

	@ObfInfo(
		owner = "om",
		name = "e",
		desc = "(B)I"
	)
	public int method330() {
		return this.field3617;
	}

	@ObfInfo(
		owner = "om",
		name = "y",
		desc = "(ILbm;ZB)I"
	)
	static int method2166(int var0, class461 var1, boolean var2) {
		String var4;
		if (var0 == ScriptOpcodes.MES) {
			var4 = class386.field3249[--class386.field3250];
			class164.method765(0, "", var4);
			return 1;
		} else if (var0 == ScriptOpcodes.ANIM) {
			class161.field1227 -= 2;
			class439.method2177(class113.field846, class386.field3248[class161.field1227], class386.field3248[class161.field1227 + 1]);
			return 1;
		} else if (var0 == ScriptOpcodes.IF_CLOSE) {
			if (!class386.field3256) {
				class386.field3253 = true;
			}

			return 1;
		} else {
			int var11;
			if (var0 == ScriptOpcodes.RESUME_COUNTDIALOG) {
				var4 = class386.field3249[--class386.field3250];
				var11 = 0;
				if (class154.method715(var4)) {
					var11 = class322.method1651(var4);
				}

				class299 var13 = class480.method2370(class356.field2960, client.field279.field4042);
				var13.field2403.method534(var11);
				client.field279.method2389(var13);
				return 1;
			} else {
				class299 var16;
				if (var0 == ScriptOpcodes.RESUME_NAMEDIALOG) {
					var4 = class386.field3249[--class386.field3250];
					var16 = class480.method2370(class356.field2975, client.field279.field4042);
					var16.field2403.method544(var4.length() + 1);
					var16.field2403.method538(var4, (byte)121);
					client.field279.method2389(var16);
					return 1;
				} else if (var0 == ScriptOpcodes.RESUME_STRINGDIALOG) {
					var4 = class386.field3249[--class386.field3250];
					var16 = class480.method2370(class356.field3008, client.field279.field4042);
					var16.field2403.method544(var4.length() + 1);
					var16.field2403.method538(var4, (byte)112);
					client.field279.method2389(var16);
					return 1;
				} else {
					int var9;
					String var15;
					if (var0 == ScriptOpcodes.OPPLAYER) {
						var9 = class386.field3248[--class161.field1227];
						var15 = class386.field3249[--class386.field3250];
						class233.method1020(var9, var15);
						return 1;
					} else if (var0 == ScriptOpcodes.IF_DRAGPICKUP) {
						class161.field1227 -= 3;
						var9 = class386.field3248[class161.field1227];
						var11 = class386.field3248[class161.field1227 + 1];
						int var10 = class386.field3248[class161.field1227 + 2];
						class120 var14 = class67.method299(var10);
						class362.method1800(var14, var9, var11);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_DRAGPICKUP) {
						class161.field1227 -= 2;
						var9 = class386.field3248[class161.field1227];
						var11 = class386.field3248[1 + class161.field1227];
						class120 var12 = var2 ? class108.field822 : class37.field183;
						class362.method1800(var12, var9, var11);
						return 1;
					} else if (var0 == ScriptOpcodes.SETMOUSECAM) {
						class151.field1180 = class386.field3248[--class161.field1227] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.GETREMOVEROOFS) {
						class386.field3248[++class161.field1227 - 1] = class50.field574.method2202() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETREMOVEROOFS) {
						class50.field574.method2229(class386.field3248[--class161.field1227] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.OPENURL) {
						var4 = class386.field3249[--class386.field3250];
						boolean var5 = class386.field3248[--class161.field1227] == 1;
						class10.method62(var4, var5, false);
						return 1;
					} else if (var0 == ScriptOpcodes.RESUME_OBJDIALOG) {
						var9 = class386.field3248[--class161.field1227];
						var16 = class480.method2370(class356.field3017, client.field279.field4042);
						var16.field2403.method533(var9);
						client.field279.method2389(var16);
						return 1;
					} else if (var0 == ScriptOpcodes.BUG_REPORT) {
						var9 = class386.field3248[--class161.field1227];
						class386.field3250 -= 2;
						var15 = class386.field3249[class386.field3250];
						String var6 = class386.field3249[1 + class386.field3250];
						if (var15.length() > 500) {
							return 1;
						} else if (var6.length() > 500) {
							return 1;
						} else {
							class299 var7 = class480.method2370(class356.field2998, client.field279.field4042);
							var7.field2403.method533(1 + class319.method1614(var15) + class319.method1614(var6));
							var7.field2403.method568(var9);
							var7.field2403.method538(var6, (byte)50);
							var7.field2403.method538(var15, (byte)76);
							client.field279.method2389(var7);
							return 1;
						}
					} else if (var0 == ScriptOpcodes.SETSHIFTCLICKDROP) {
						client.field384 = class386.field3248[--class161.field1227] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSEOVERTEXT) {
						client.field381 = class386.field3248[--class161.field1227] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.RENDERSELF) {
						client.field258 = class386.field3248[--class161.field1227] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes._3120) {
						if (class386.field3248[--class161.field1227] == 1) {
							client.field449 |= 1;
						} else {
							client.field449 &= -2;
						}

						return 1;
					} else if (var0 == ScriptOpcodes._3121) {
						if (class386.field3248[--class161.field1227] == 1) {
							client.field449 |= 2;
						} else {
							client.field449 &= -3;
						}

						return 1;
					} else if (var0 == ScriptOpcodes._3122) {
						if (class386.field3248[--class161.field1227] == 1) {
							client.field449 |= 4;
						} else {
							client.field449 &= -5;
						}

						return 1;
					} else if (var0 == ScriptOpcodes._3123) {
						if (class386.field3248[--class161.field1227] == 1) {
							client.field449 |= 8;
						} else {
							client.field449 &= -9;
						}

						return 1;
					} else if (var0 == ScriptOpcodes._3124) {
						client.field449 = 0;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWMOUSECROSS) {
						client.field252 = class386.field3248[--class161.field1227] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETSHOWLOADINGMESSAGES) {
						client.field346 = class386.field3248[--class161.field1227] == 1;
						return 1;
					} else if (var0 == ScriptOpcodes.SETTAPTODROP) {
						class471.method2328(class386.field3248[--class161.field1227] == 1);
						return 1;
					} else if (var0 == ScriptOpcodes.GETTAPTODROP) {
						class386.field3248[++class161.field1227 - 1] = class251.method1091() ? 1 : 0;
						return 1;
					} else if (var0 == ScriptOpcodes._3129) {
						class161.field1227 -= 2;
						client.field373 = class386.field3248[class161.field1227];
						client.field312 = class386.field3248[1 + class161.field1227];
						return 1;
					} else if (var0 == ScriptOpcodes._3130) {
						class161.field1227 -= 2;
						return 1;
					} else if (var0 == ScriptOpcodes._3131) {
						--class161.field1227;
						return 1;
					} else if (var0 == ScriptOpcodes.GETCANVASSIZE) {
						class386.field3248[++class161.field1227 - 1] = class427.field3529;
						class386.field3248[++class161.field1227 - 1] = class476.field4003;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_SETFPS) {
						--class161.field1227;
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORE) {
						return 1;
					} else if (var0 == ScriptOpcodes.MOBILE_OPENSTORECATEGORY) {
						class161.field1227 -= 2;
						return 1;
					} else if (var0 == ScriptOpcodes._3136) {
						client.field504 = 3;
						client.field396 = class386.field3248[--class161.field1227];
						return 1;
					} else if (var0 == ScriptOpcodes._3137) {
						client.field504 = 2;
						client.field396 = class386.field3248[--class161.field1227];
						return 1;
					} else if (var0 == ScriptOpcodes._3138) {
						client.field504 = 0;
						return 1;
					} else if (var0 == ScriptOpcodes._3139) {
						client.field504 = 1;
						return 1;
					} else if (var0 == ScriptOpcodes._3140) {
						client.field504 = 3;
						client.field396 = var2 ? class108.field822.field985 : class37.field183.field985;
						return 1;
					} else {
						boolean var17;
						if (var0 == ScriptOpcodes.SETHIDEUSERNAME) {
							var17 = class386.field3248[--class161.field1227] == 1;
							class50.field574.method2225(var17);
							return 1;
						} else if (var0 == ScriptOpcodes.GETHIDEUSERNAME) {
							class386.field3248[++class161.field1227 - 1] = class50.field574.method2203() ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SETREMEMBERUSERNAME) {
							var17 = class386.field3248[--class161.field1227] == 1;
							client.field268 = var17;
							if (!var17) {
								class50.field574.method2214("");
							}

							return 1;
						} else if (var0 == ScriptOpcodes.GETREMEMBERUSERNAME) {
							class386.field3248[++class161.field1227 - 1] = client.field268 ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.SHOW_IOS_REVIEW) {
							return 1;
						} else if (var0 == ScriptOpcodes.SETTITLEMUSICDISABLED) {
							var17 = class386.field3248[--class161.field1227] == 1;
							class50.field574.method2223(!var17);
							return 1;
						} else if (var0 == ScriptOpcodes.GETTITLEMUSICDISABLED) {
							class386.field3248[++class161.field1227 - 1] = class50.field574.method2213() ? 0 : 1;
							return 1;
						} else if (var0 == ScriptOpcodes._3148) {
							return 1;
						} else if (var0 == ScriptOpcodes._3149) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3150) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3151) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3152) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3153) {
							class386.field3248[++class161.field1227 - 1] = class359.field3056;
							return 1;
						} else if (var0 == ScriptOpcodes._3154) {
							class386.field3248[++class161.field1227 - 1] = class339.method1700();
							return 1;
						} else if (var0 == ScriptOpcodes._3155) {
							--class386.field3250;
							return 1;
						} else if (var0 == ScriptOpcodes._3156) {
							return 1;
						} else if (var0 == ScriptOpcodes._3157) {
							class161.field1227 -= 2;
							return 1;
						} else if (var0 == ScriptOpcodes._3158) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3159) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3160) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3161) {
							--class161.field1227;
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3162) {
							--class161.field1227;
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3163) {
							--class386.field3250;
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3164) {
							--class161.field1227;
							class386.field3249[++class386.field3250 - 1] = "";
							return 1;
						} else if (var0 == ScriptOpcodes._3165) {
							--class161.field1227;
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3166) {
							class161.field1227 -= 2;
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3167) {
							class161.field1227 -= 2;
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3168) {
							class161.field1227 -= 2;
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							class386.field3249[++class386.field3250 - 1] = "";
							return 1;
						} else if (var0 == ScriptOpcodes._3169) {
							return 1;
						} else if (var0 == ScriptOpcodes.LOCAL_NOTIFICATION) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3171) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3172) {
							--class161.field1227;
							return 1;
						} else if (var0 == ScriptOpcodes._3173) {
							--class161.field1227;
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3174) {
							--class161.field1227;
							return 1;
						} else if (var0 == ScriptOpcodes._3175) {
							class386.field3248[++class161.field1227 - 1] = 0;
							return 1;
						} else if (var0 == ScriptOpcodes._3176) {
							return 1;
						} else if (var0 == ScriptOpcodes._3177) {
							return 1;
						} else if (var0 == ScriptOpcodes._3178) {
							--class386.field3250;
							return 1;
						} else if (var0 == ScriptOpcodes._3179) {
							return 1;
						} else if (var0 == ScriptOpcodes._3180) {
							--class386.field3250;
							return 1;
						} else if (var0 == ScriptOpcodes.SETBRIGHTNESS) {
							class19.method90(class386.field3248[--class161.field1227]);
							return 1;
						} else if (var0 == ScriptOpcodes.GETBRIGHTNESS) {
							class386.field3248[++class161.field1227 - 1] = class424.method2069();
							return 1;
						} else if (var0 == ScriptOpcodes._3189) {
							var9 = class386.field3248[--class161.field1227];
							class242 var8 = class271.method1277(var9);
							if (var8.method1056()) {
								class359.method1791(var8.field2032);
							}

							return 1;
						} else {
							return 2;
						}
					}
				}
			}
		}
	}

	@ObfInfo(
		owner = "om",
		name = "lr",
		desc = "(Lkd;I)V"
	)
	static final void method2165(class120 var0) {
		int var2 = var0.field993;
		if (var2 == 324) {
			if (client.field505 == -1) {
				client.field505 = var0.field927;
				client.field506 = var0.field990;
			}

			if (1 == client.field264.field2347) {
				var0.field927 = client.field505;
			} else {
				var0.field927 = client.field506;
			}

		} else if (var2 == 325) {
			if (-1 == client.field505) {
				client.field505 = var0.field927;
				client.field506 = var0.field990;
			}

			if (client.field264.field2347 == 1) {
				var0.field927 = client.field506;
			} else {
				var0.field927 = client.field505;
			}

		} else if (var2 == 327) {
			var0.field960 = 150;
			var0.field947 = (int)(Math.sin((double)client.field231 / 40.0D) * 256.0D) & 2047;
			var0.field936 = 5;
			var0.field955 = 0;
		} else if (var2 == 328) {
			var0.field960 = 150;
			var0.field947 = (int)(Math.sin((double)client.field231 / 40.0D) * 256.0D) & 2047;
			var0.field936 = 5;
			var0.field955 = 1;
		}
	}
}
