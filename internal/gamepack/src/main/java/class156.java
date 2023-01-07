import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "br"
)
public final class class156 extends class139 {
	@ObfInfo(
		owner = "br",
		name = "h",
		desc = "Lmq;"
	)
	static class141 field1200;
	@ObfInfo(
		owner = "br",
		name = "b",
		desc = "Lap;"
	)
	class316 field1198;
	@ObfInfo(
		owner = "br",
		name = "n",
		desc = "Lap;"
	)
	class316 field1203;
	@ObfInfo(
		owner = "br",
		name = "r",
		desc = "Lgn;"
	)
	class87 field1204;
	@ObfInfo(
		owner = "br",
		name = "x",
		desc = "I"
	)
	int field1190;
	@ObfInfo(
		owner = "br",
		name = "g",
		desc = "I"
	)
	int field1191;
	@ObfInfo(
		owner = "br",
		name = "v",
		desc = "I"
	)
	int field1192;
	@ObfInfo(
		owner = "br",
		name = "m",
		desc = "I"
	)
	int field1193;
	@ObfInfo(
		owner = "br",
		name = "j",
		desc = "I"
	)
	int field1194;
	@ObfInfo(
		owner = "br",
		name = "q",
		desc = "I"
	)
	int field1195;
	@ObfInfo(
		owner = "br",
		name = "e",
		desc = "I"
	)
	int field1196;
	@ObfInfo(
		owner = "br",
		name = "u",
		desc = "I"
	)
	int field1197;
	@ObfInfo(
		owner = "br",
		name = "f",
		desc = "I"
	)
	int field1199;
	@ObfInfo(
		owner = "br",
		name = "o",
		desc = "I"
	)
	int field1202;
	@ObfInfo(
		owner = "br",
		name = "i",
		desc = "[I"
	)
	int[] field1201;

	static {
		field1200 = new class141();
	}

	@ObfInfo(
		owner = "br",
		name = "<init>",
		desc = "()V"
	)
	class156() {
	}

	@ObfInfo(
		owner = "br",
		name = "v",
		desc = "(I)V"
	)
	void method719() {
		int var2 = this.field1197;
		class87 var3 = this.field1204.method372();
		if (null != var3) {
			this.field1197 = var3.field752;
			this.field1199 = var3.field734 * 128;
			this.field1194 = var3.field750;
			this.field1191 = var3.field751;
			this.field1201 = var3.field713;
		} else {
			this.field1197 = -1;
			this.field1199 = 0;
			this.field1194 = 0;
			this.field1191 = 0;
			this.field1201 = null;
		}

		if (var2 != this.field1197 && this.field1198 != null) {
			class197.field1739.method1066(this.field1198);
			this.field1198 = null;
		}

	}

	@ObfInfo(
		owner = "br",
		name = "e",
		desc = "(CI)Z"
	)
	public static boolean method720(char var0) {
		if ((var0 < ' ' || var0 >= 127) && (var0 <= 127 || var0 >= 160) && (var0 <= 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var2 = class471.field3959;

				for (int var3 = 0; var3 < var2.length; ++var3) {
					char var4 = var2[var3];
					if (var0 == var4) {
						return true;
					}
				}
			}

			return false;
		} else {
			return true;
		}
	}

	@ObfInfo(
		owner = "br",
		name = "jy",
		desc = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V"
	)
	public static final void method721(String var0, String var1, int var2, int var3, int var4, int var5) {
		class323.method1653(var0, var1, var2, var3, var4, var5, -1, false);
	}
}
