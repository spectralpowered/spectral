import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "kx"
)
public class class458 extends class139 {
	@ObfInfo(
		owner = "kx",
		name = "x",
		desc = "Ljy;"
	)
	class132 field3798;
	@ObfInfo(
		owner = "kx",
		name = "l",
		desc = "Lap;"
	)
	class316 field3802;
	@ObfInfo(
		owner = "kx",
		name = "e",
		desc = "Lkl;"
	)
	class401 field3787;
	@ObfInfo(
		owner = "kx",
		name = "v",
		desc = "Laf;"
	)
	class82 field3796;
	@ObfInfo(
		owner = "kx",
		name = "b",
		desc = "I"
	)
	int field3784;
	@ObfInfo(
		owner = "kx",
		name = "n",
		desc = "I"
	)
	int field3785;
	@ObfInfo(
		owner = "kx",
		name = "o",
		desc = "I"
	)
	int field3786;
	@ObfInfo(
		owner = "kx",
		name = "m",
		desc = "I"
	)
	int field3788;
	@ObfInfo(
		owner = "kx",
		name = "q",
		desc = "I"
	)
	int field3789;
	@ObfInfo(
		owner = "kx",
		name = "i",
		desc = "I"
	)
	int field3790;
	@ObfInfo(
		owner = "kx",
		name = "r",
		desc = "I"
	)
	int field3791;
	@ObfInfo(
		owner = "kx",
		name = "u",
		desc = "I"
	)
	int field3792;
	@ObfInfo(
		owner = "kx",
		name = "f",
		desc = "I"
	)
	int field3793;
	@ObfInfo(
		owner = "kx",
		name = "j",
		desc = "I"
	)
	int field3794;
	@ObfInfo(
		owner = "kx",
		name = "g",
		desc = "I"
	)
	int field3795;
	@ObfInfo(
		owner = "kx",
		name = "h",
		desc = "I"
	)
	int field3797;
	@ObfInfo(
		owner = "kx",
		name = "k",
		desc = "I"
	)
	int field3799;
	@ObfInfo(
		owner = "kx",
		name = "a",
		desc = "I"
	)
	int field3800;
	@ObfInfo(
		owner = "kx",
		name = "s",
		desc = "I"
	)
	int field3801;
	@ObfInfo(
		owner = "kx",
		name = "t",
		desc = "I"
	)
	int field3803;
	@ObfInfo(
		owner = "kx",
		name = "p",
		desc = "I"
	)
	int field3804;

	@ObfInfo(
		owner = "kx",
		name = "<init>",
		desc = "()V"
	)
	class458() {
	}

	@ObfInfo(
		owner = "kx",
		name = "h",
		desc = "(I)V"
	)
	void method2260() {
		this.field3787 = null;
		this.field3796 = null;
		this.field3798 = null;
		this.field3802 = null;
	}

	@ObfInfo(
		owner = "kx",
		name = "g",
		desc = "(ILbm;ZS)I"
	)
	static int method2261(int var0, class461 var1, boolean var2) {
		class120 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class67.method299(class386.field3248[--class161.field1227]);
		} else {
			var4 = var2 ? class108.field822 : class37.field183;
		}

		String var5 = class386.field3249[--class386.field3250];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
			int var7 = class386.field3248[--class161.field1227];
			if (var7 > 0) {
				for (var6 = new int[var7]; var7-- > 0; var6[var7] = class386.field3248[--class161.field1227]) {
				}
			}

			var5 = var5.substring(0, var5.length() - 1);
		}

		Object[] var10 = new Object[var5.length() + 1];

		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				var10[var8] = class386.field3249[--class386.field3250];
			} else {
				var10[var8] = new Integer(class386.field3248[--class161.field1227]);
			}
		}

		var8 = class386.field3248[--class161.field1227];
		if (var8 != -1) {
			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}

		if (var0 == ScriptOpcodes.CC_SETONCLICK) {
			var4.field919 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONHOLD) {
			var4.field989 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONRELEASE) {
			var4.field928 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEOVER) {
			var4.field986 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSELEAVE) {
			var4.field992 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAG) {
			var4.field1037 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETLEAVE) {
			var4.field909 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONVARTRANSMIT) {
			var4.field935 = var10;
			var4.field998 = var6;
		} else if (var0 == ScriptOpcodes.CC_SETONTIMER) {
			var4.field1001 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONOP) {
			var4.field930 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONDRAGCOMPLETE) {
			var4.field994 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONCLICKREPEAT) {
			var4.field987 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONMOUSEREPEAT) {
			var4.field1033 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONINVTRANSMIT) {
			var4.field886 = var10;
			var4.field937 = var6;
		} else if (var0 == ScriptOpcodes.CC_SETONSTATTRANSMIT) {
			var4.field999 = var10;
			var4.field896 = var6;
		} else if (var0 == ScriptOpcodes.CC_SETONTARGETENTER) {
			var4.field984 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONSCROLLWHEEL) {
			var4.field1004 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONCHATTRANSMIT) {
			var4.field1005 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONKEY) {
			var4.field1006 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONFRIENDTRANSMIT) {
			var4.field1009 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANTRANSMIT) {
			var4.field963 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONMISCTRANSMIT) {
			var4.field1013 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONDIALOGABORT) {
			var4.field1014 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONSUBCHANGE) {
			var4.field1015 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONSTOCKTRANSMIT) {
			var4.field880 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONTRADINGPOSTTRANSMIT) {
			var4.field918 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONRESIZE) {
			var4.field1016 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var4.field905 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var4.field1012 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONKEYDOWN) {
			var4.field1007 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONKEYUP) {
			var4.field1002 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONCRMVIEWLOAD) {
			var4.field1019 = var10;
		} else if (var0 == ScriptOpcodes.CC_SETONOPT) {
			var4.field1003 = var10;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class16 var9 = var4.method496();
			if (null != var9) {
				if (var0 == ScriptOpcodes.CC_SETONINPUT_1) {
					var9.field79 = var10;
				} else if (var0 == ScriptOpcodes.CC_SETONINPUT_2) {
					var9.field80 = var10;
				} else if (var0 == ScriptOpcodes.CC_SETONINPUT_3) {
					var9.field77 = var10;
				} else if (var0 == ScriptOpcodes.CC_SETONINPUT_4) {
					var9.field81 = var10;
				}
			}
		}

		var4.field977 = true;
		return 1;
	}

	@ObfInfo(
		owner = "kx",
		name = "gd",
		desc = "(IZZZZI)Lln;"
	)
	static class38 method2262(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		class20 var6 = null;
		if (class25.field112 != null) {
			var6 = new class20(var0, class25.field112, class25.field116[var0], 1000000);
		}

		return new class38(var6, class46.field561, var0, var1, var2, var3, var4);
	}
}
