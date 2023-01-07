import io.spectralpowered.ObfInfo;
import java.util.Comparator;

@ObfInfo(
	name = "bg"
)
public class class290 implements Comparator {
	@ObfInfo(
		owner = "bg",
		name = "cc",
		desc = "[Lrx;"
	)
	static class266[] field2370;
	@ObfInfo(
		owner = "bg",
		name = "h",
		desc = "Z"
	)
	boolean field2371;

	@ObfInfo(
		owner = "bg",
		name = "<init>",
		desc = "()V"
	)
	class290() {
	}

	@ObfInfo(
		owner = "bg",
		name = "h",
		desc = "(Lmg;Lmg;B)I"
	)
	int method1431(class258 var1, class258 var2) {
		if (var1.field2106 == var2.field2106) {
			return 0;
		} else {
			if (this.field2371) {
				if (var1.field2106 == client.field395) {
					return -1;
				}

				if (var2.field2106 == client.field395) {
					return 1;
				}
			}

			return var1.field2106 < var2.field2106 ? -1 : 1;
		}
	}

	@ObfInfo(
		owner = "bg",
		name = "compare",
		desc = "(Ljava/lang/Object;Ljava/lang/Object;)I"
	)
	public int compare(Object var1, Object var2) {
		return this.method1431((class258)var1, (class258)var2);
	}

	@ObfInfo(
		owner = "bg",
		name = "equals",
		desc = "(Ljava/lang/Object;)Z"
	)
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(
		owner = "bg",
		name = "h",
		desc = "(I)[Ljh;"
	)
	static class41[] method1430() {
		return new class41[]{class41.field208, class41.field212, class41.field209, class41.field213, class41.field211, class41.field216};
	}

	@ObfInfo(
		owner = "bg",
		name = "e",
		desc = "(CB)Z"
	)
	public static final boolean method1427(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfInfo(
		owner = "bg",
		name = "f",
		desc = "(ILbm;ZI)I"
	)
	static int method1429(int var0, class461 var1, boolean var2) {
		class120 var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class67.method299(class386.field3248[--class161.field1227]);
		} else {
			var4 = var2 ? class108.field822 : class37.field183;
		}

		class184.method836(var4);
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var4.field936 = 2;
				var4.field955 = class386.field3248[--class161.field1227];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var4.field936 = 3;
				var4.field955 = class113.field846.field3194.method1404();
				return 1;
			} else {
				return 2;
			}
		} else {
			class161.field1227 -= 2;
			int var5 = class386.field3248[class161.field1227];
			int var6 = class386.field3248[1 + class161.field1227];
			var4.field898 = var5;
			var4.field1028 = var6;
			class263 var7 = class423.method2062(var5);
			var4.field960 = var7.field2152;
			var4.field947 = var7.field2153;
			var4.field946 = var7.field2160;
			var4.field942 = var7.field2155;
			var4.field1034 = var7.field2141;
			var4.field882 = var7.field2151;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var4.field952 = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | var7.field2157 == 1) {
				var4.field952 = 1;
			} else {
				var4.field952 = 2;
			}

			if (var4.field1008 > 0) {
				var4.field882 = var4.field882 * 32 / var4.field1008;
			} else if (var4.field904 > 0) {
				var4.field882 = var4.field882 * 32 / var4.field904;
			}

			return 1;
		}
	}

	@ObfInfo(
		owner = "bg",
		name = "jz",
		desc = "(I)V"
	)
	static final void method1428() {
		int var1 = class198.field1745;
		int var2 = class267.field2215;
		int var3 = class483.field4027;
		int var4 = class466.field3872;
		int var5 = 6116423;
		class162.method749(var1, var2, var3, var4, var5);
		class162.method749(var1 + 1, var2 + 1, var3 - 2, 16, 0);
		class162.method741(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
		class114.field848.method2025(class177.field1539, var1 + 3, var2 + 14, var5, -1);
		int var6 = class466.field3863;
		int var7 = class466.field3858;

		int var8;
		int var9;
		int var10;
		for (var8 = 0; var8 < client.field369; ++var8) {
			var9 = 15 * (client.field369 - 1 - var8) + var2 + 31;
			var10 = 16777215;
			if (var6 > var1 && var6 < var3 + var1 && var7 > var9 - 13 && var7 < var9 + 3) {
				var10 = 16776960;
			}

			class114.field848.method2025(class189.method857(var8), var1 + 3, var9, var10, 0);
		}

		var8 = class198.field1745;
		var9 = class267.field2215;
		var10 = class483.field4027;
		int var11 = class466.field3872;

		for (int var12 = 0; var12 < client.field442; ++var12) {
			if (client.field435[var12] + client.field447[var12] > var8 && client.field447[var12] < var10 + var8 && client.field247[var12] + client.field448[var12] > var9 && client.field448[var12] < var9 + var11) {
				client.field445[var12] = true;
			}
		}

	}
}
