public class class310 extends class428 {
	class285 field3700;
	class298 field3689;
	class32 field3698;
	class42 field3704;
	int field3686;
	int field3687;
	int field3688;
	int field3690;
	int field3691;
	int field3692;
	int field3693;
	int field3694;
	int field3695;
	int field3696;
	int field3697;
	int field3699;
	int field3701;
	int field3702;
	int field3703;
	int field3705;
	int field3706;

	class310() {
	}

	void method6124() {
		this.field3689 = null;
		this.field3698 = null;
		this.field3700 = null;
		this.field3704 = null;
	}

	static int method6125(int var0, class65 var1, boolean var2) {
		class290 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class180.method2988(class69.field579[--class94.field920]);
		} else {
			var4 = var2 ? class187.field2044 : class341.field4273;
		}

		String var5 = class69.field580[--class69.field581];
		int[] var6 = null;
		if (var5.length() > 0 && var5.charAt(var5.length() - 1) == 'Y') {
			int var7 = class69.field579[--class94.field920];
			if (var7 > 0) {
				for (var6 = new int[var7]; var7-- > 0; var6[var7] = class69.field579[--class94.field920]) {
				}
			}

			var5 = var5.substring(0, var5.length() - 1);
		}

		Object[] var10 = new Object[var5.length() + 1];

		int var8;
		for (var8 = var10.length - 1; var8 >= 1; --var8) {
			if (var5.charAt(var8 - 1) == 's') {
				var10[var8] = class69.field580[--class69.field581];
			} else {
				var10[var8] = new Integer(class69.field579[--class94.field920]);
			}
		}

		var8 = class69.field579[--class94.field920];
		if (var8 != -1) {
			var10[0] = new Integer(var8);
		} else {
			var10 = null;
		}

		if (var0 == CS2Opcodes.CC_SETONCLICK) {
			var4.field3426 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONHOLD) {
			var4.field3496 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONRELEASE) {
			var4.field3435 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONMOUSEOVER) {
			var4.field3493 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONMOUSELEAVE) {
			var4.field3499 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONDRAG) {
			var4.field3547 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONTARGETLEAVE) {
			var4.field3415 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONVARTRANSMIT) {
			var4.field3442 = var10;
			var4.field3505 = var6;
		} else if (var0 == CS2Opcodes.CC_SETONTIMER) {
			var4.field3510 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONOP) {
			var4.field3437 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONDRAGCOMPLETE) {
			var4.field3501 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONCLICKREPEAT) {
			var4.field3494 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONMOUSEREPEAT) {
			var4.field3543 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONINVTRANSMIT) {
			var4.field3391 = var10;
			var4.field3444 = var6;
		} else if (var0 == CS2Opcodes.CC_SETONSTATTRANSMIT) {
			var4.field3508 = var10;
			var4.field3401 = var6;
		} else if (var0 == CS2Opcodes.CC_SETONTARGETENTER) {
			var4.field3491 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONSCROLLWHEEL) {
			var4.field3513 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONCHATTRANSMIT) {
			var4.field3514 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONKEY) {
			var4.field3515 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONFRIENDTRANSMIT) {
			var4.field3518 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONCLANTRANSMIT) {
			var4.field3470 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONMISCTRANSMIT) {
			var4.field3522 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONDIALOGABORT) {
			var4.field3523 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONSUBCHANGE) {
			var4.field3524 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONSTOCKTRANSMIT) {
			var4.field3380 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONTRADINGPOSTTRANSMIT) {
			var4.field3425 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONRESIZE) {
			var4.field3525 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONCLANSETTINGSTRANSMIT) {
			var4.field3411 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONCLANCHANNELTRANSMIT) {
			var4.field3521 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONKEYDOWN) {
			var4.field3516 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONKEYUP) {
			var4.field3511 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONCRMVIEWLOAD) {
			var4.field3528 = var10;
		} else if (var0 == CS2Opcodes.CC_SETONOPT) {
			var4.field3512 = var10;
		} else {
			if (var0 < 1436 || var0 > 1439) {
				return 2;
			}

			class306 var9 = var4.method5528();
			if (null != var9) {
				if (var0 == CS2Opcodes.CC_SETONINPUT_1) {
					var9.field3670 = var10;
				} else if (var0 == CS2Opcodes.CC_SETONINPUT_2) {
					var9.field3671 = var10;
				} else if (var0 == CS2Opcodes.CC_SETONINPUT_3) {
					var9.field3668 = var10;
				} else if (var0 == CS2Opcodes.CC_SETONINPUT_4) {
					var9.field3672 = var10;
				}
			}
		}

		var4.field3484 = true;
		return 1;
	}

	static class326 method6127(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
		class399 var6 = null;
		if (class163.field1510 != null) {
			var6 = new class399(var0, class163.field1510, class163.field1518[var0], 1000000);
		}

		return new class326(var6, class254.field2980, var0, var1, var2, var3, var4);
	}
}
