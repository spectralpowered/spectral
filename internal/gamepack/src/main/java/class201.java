import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "cc"
)
public class class201 extends class139 {
	@ObfInfo(
		owner = "cc",
		name = "h",
		desc = "Lqp;"
	)
	static class170 field1755;
	@ObfInfo(
		owner = "cc",
		name = "vm",
		desc = "Llr;"
	)
	static class348 field1756;
	@ObfInfo(
		owner = "cc",
		name = "i",
		desc = "Laj;"
	)
	static class73 field1752;
	@ObfInfo(
		owner = "cc",
		name = "e",
		desc = "[I"
	)
	int[] field1753;
	@ObfInfo(
		owner = "cc",
		name = "v",
		desc = "[I"
	)
	int[] field1754;

	static {
		field1755 = new class170(32);
	}

	@ObfInfo(
		owner = "cc",
		name = "<init>",
		desc = "()V"
	)
	class201() {
		this.field1753 = new int[]{-1};
		this.field1754 = new int[]{0};
	}

	@ObfInfo(
		owner = "cc",
		name = "e",
		desc = "([Ljava/lang/String;[IB)V"
	)
	public static void method885(String[] var0, int[] var1) {
		class167.method783(var0, var1, 0, var0.length - 1);
	}

	@ObfInfo(
		owner = "cc",
		name = "e",
		desc = "(II)[B"
	)
	public static synchronized byte[] method884(int var0) {
		return class355.method1775(var0, false);
	}

	@ObfInfo(
		owner = "cc",
		name = "ko",
		desc = "([Lkd;IIIZI)V"
	)
	static void method886(class120[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var6 = 0; var6 < var0.length; ++var6) {
			class120 var7 = var0[var6];
			if (var7 != null && var7.field912 == var1) {
				class380.method1885(var7, var2, var3, var4);
				class306.method1491(var7, var2, var3);
				if (var7.field920 > var7.field915 - var7.field908) {
					var7.field920 = var7.field915 - var7.field908;
				}

				if (var7.field920 < 0) {
					var7.field920 = 0;
				}

				if (var7.field914 > var7.field916 - var7.field967) {
					var7.field914 = var7.field916 - var7.field967;
				}

				if (var7.field914 < 0) {
					var7.field914 = 0;
				}

				if (var7.field1026 == 0) {
					class378.method1862(var0, var7, var4);
				}
			}
		}

	}
}
