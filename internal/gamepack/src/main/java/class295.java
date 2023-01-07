import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "hr"
)
public abstract class class295 extends class195 {
	@ObfInfo(
		owner = "hr",
		name = "dl",
		desc = "I"
	)
	public int field2390;

	@ObfInfo(
		owner = "hr",
		name = "<init>",
		desc = "()V"
	)
	protected class295() {
		this.field2390 = 1000;
	}

	@ObfInfo(
		owner = "hr",
		name = "dn",
		desc = "(IIIIIIIIJ)V"
	)
	void method1439(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9) {
		class470 var11 = this.method1438();
		if (null != var11) {
			this.field2390 = var11.field2390;
			var11.method1439(var1, var2, var3, var4, var5, var6, var7, var8, var9);
		}

	}

	@ObfInfo(
		owner = "hr",
		name = "e",
		desc = "(I)Lhh;"
	)
	protected class470 method1438() {
		return null;
	}
}
