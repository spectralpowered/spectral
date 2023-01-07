import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "jc"
)
public final class class196 {
	@ObfInfo(
		owner = "jc",
		name = "e",
		desc = "J"
	)
	static long field1738;

	@ObfInfo(
		owner = "jc",
		name = "q",
		desc = "(I)[Lra;"
	)
	static class344[] method873() {
		class344[] var1 = new class344[class18.field91];

		for (int var2 = 0; var2 < class18.field91; ++var2) {
			class344 var3 = var1[var2] = new class344();
			var3.field2756 = class183.field1682;
			var3.field2759 = class18.field90;
			var3.field2754 = class18.field92[var2];
			var3.field2757 = class110.field826[var2];
			var3.field2758 = class418.field3431[var2];
			var3.field2755 = class50.field576[var2];
			var3.field2753 = class413.field3422;
			var3.field2752 = class340.field2723[var2];
		}

		class18.field92 = null;
		class110.field826 = null;
		class418.field3431 = null;
		class50.field576 = null;
		class413.field3422 = null;
		class340.field2723 = (byte[][])null;
		return var1;
	}

	@ObfInfo(
		owner = "jc",
		name = "ab",
		desc = "(ILbm;ZI)I"
	)
	static int method872(int var0, class461 var1, boolean var2) {
		if (var0 == ScriptOpcodes.GETWINDOWMODE) {
			class386.field3248[++class161.field1227 - 1] = class152.method713();
			return 1;
		} else {
			int var4;
			if (var0 == ScriptOpcodes.SETWINDOWMODE) {
				var4 = class386.field3248[--class161.field1227];
				if (var4 == 1 || var4 == 2) {
					class249.method1080(var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.GETDEFAULTWINDOWMODE) {
				class386.field3248[++class161.field1227 - 1] = class50.field574.method2218();
				return 1;
			} else if (var0 != ScriptOpcodes.SETDEFAULTWINDOWMODE) {
				if (var0 == ScriptOpcodes._5310) {
					--class161.field1227;
					return 1;
				} else {
					return 2;
				}
			} else {
				var4 = class386.field3248[--class161.field1227];
				if (var4 == 1 || var4 == 2) {
					class50.field574.method2224(var4);
				}

				return 1;
			}
		}
	}

	@ObfInfo(
		owner = "jc",
		name = "mx",
		desc = "(IIIILrx;Lkv;I)V"
	)
	static final void method874(int var0, int var1, int var2, int var3, class266 var4, class226 var5) {
		if (var4 != null) {
			int var7 = client.field301 & 2047;
			int var8 = var2 * var2 + var3 * var3;
			if (var8 <= 6400) {
				int var9 = class341.field2726[var7];
				int var10 = class341.field2744[var7];
				int var11 = var3 * var9 + var10 * var2 >> 16;
				int var12 = var10 * var3 - var2 * var9 >> 16;
				if (var8 > 2500) {
					var4.method1239(var5.field1926 / 2 + var11 - var4.field2203 / 2, var5.field1927 / 2 - var12 - var4.field2204 / 2, var0, var1, var5.field1926, var5.field1927, var5.field1928, var5.field1925);
				} else {
					var4.method1240(var0 + var5.field1926 / 2 + var11 - var4.field2203 / 2, var5.field1927 / 2 + var1 - var12 - var4.field2204 / 2);
				}

			}
		}
	}

	@ObfInfo(
		owner = "jc",
		name = "nm",
		desc = "(Ljava/lang/String;I)Ljava/lang/String;"
	)
	static String method871(String var0) {
		class425[] var2 = class283.method1394();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class425 var4 = var2[var3];
			if (var4.field3521 != -1 && var0.startsWith(class185.method843(var4.field3521))) {
				var0 = var0.substring(6 + Integer.toString(var4.field3521).length());
				break;
			}
		}

		return var0;
	}
}
