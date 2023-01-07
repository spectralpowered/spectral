import io.spectralpowered.ObfInfo;

@ObfInfo(
	name = "ir"
)
public final class class104 {
	@ObfInfo(
		owner = "ir",
		name = "e",
		desc = "[I"
	)
	final int[] field806;

	@ObfInfo(
		owner = "ir",
		name = "<init>",
		desc = "()V"
	)
	class104() {
		this.field806 = new int[4096];
	}

	@ObfInfo(
		owner = "ir",
		name = "<init>",
		desc = "([I)V"
	)
	class104(int[] var1) {
		this.field806 = var1;
	}

	@ObfInfo(
		owner = "ir",
		name = "h",
		desc = "(III)I"
	)
	final int method416(int var1, int var2) {
		return this.field806[var2 * 64 + var1];
	}

	@ObfInfo(
		owner = "ir",
		name = "v",
		desc = "(IB)I"
	)
	public static int method417(int var0) {
		return class291.method1432(class105.field814[var0]);
	}
}
