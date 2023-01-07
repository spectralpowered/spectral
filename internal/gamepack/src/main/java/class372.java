import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "hi"
)
public class class372 {
	@ObfInfo(
		owner = "hi",
		name = "uk",
		desc = "Lpk;"
	)
	static class367 field3166;
	@ObfInfo(
		owner = "hi",
		name = "e",
		desc = "[Ldt;"
	)
	class130[] field3165;
	@ObfInfo(
		owner = "hi",
		name = "v",
		desc = "I"
	)
	int field3167;

	@ObfInfo(
		owner = "hi",
		name = "<init>",
		desc = "(Lqy;I)V"
	)
	class372(class127 var1, int var2) {
		this.field3165 = new class130[var2];
		this.field3167 = var1.method547();

		for (int var3 = 0; var3 < this.field3165.length; ++var3) {
			class130 var4 = new class130(this.field3167, var1, false);
			this.field3165[var3] = var4;
		}

		this.method1834();
	}

	@ObfInfo(
		owner = "hi",
		name = "h",
		desc = "(I)V"
	)
	void method1834() {
		class130[] var2 = this.field3165;

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class130 var4 = var2[var3];
			if (var4.field1085 >= 0) {
				var4.field1082 = this.field3165[var4.field1085];
			}
		}

	}

	@ObfInfo(
		owner = "hi",
		name = "e",
		desc = "(I)I"
	)
	public int method1835() {
		return this.field3165.length;
	}

	@ObfInfo(
		owner = "hi",
		name = "v",
		desc = "(II)Ldt;"
	)
	class130 method1836(int var1) {
		return var1 >= this.method1835() ? null : this.field3165[var1];
	}

	@ObfInfo(
		owner = "hi",
		name = "x",
		desc = "(I)[Ldt;"
	)
	class130[] method1838() {
		return this.field3165;
	}

	@ObfInfo(
		owner = "hi",
		name = "m",
		desc = "(Lew;IB)V"
	)
	void method1837(class357 var1, int var2) {
		this.method1839(var1, var2, (boolean[])null, false);
	}

	@ObfInfo(
		owner = "hi",
		name = "q",
		desc = "(Lew;I[ZZI)V"
	)
	void method1839(class357 var1, int var2, boolean[] var3, boolean var4) {
		int var6 = var1.method1785();
		int var7 = 0;
		class130[] var8 = this.method1838();

		for (int var9 = 0; var9 < var8.length; ++var9) {
			class130 var10 = var8[var9];
			if (var3 == null || var4 == var3[var7]) {
				var1.method1778(var2, var10, var7, var6);
			}

			++var7;
		}

	}

	@ObfInfo(
		owner = "hi",
		name = "np",
		desc = "(S)Z"
	)
	public static boolean method1840() {
		return client.field406 != null;
	}
}
